!pip install transformers==4.11.3
!pip install accelerate -U
!pip install torch
!pip install pandas scikit-learn
!pip install datasets

import pandas as pd

# Load your data into a DataFrame (replace 'your_data.csv' with your actual file name)
data = pd.read_csv('/content/preprocessed_speech_data.csv')

# Display the first few rows to understand the structure
print(data.head())

# Check the column names and number of columns
print(data.columns)

# Rename columns for consistency (adjust this based on your actual CSV columns)
data = data.rename(columns={'Party': 'Party', 'Speech': 'Speech'})

# Drop unnecessary columns (e.g., 'id' and 'other_column' if they exist)
data = data[['Party', 'Speech']]

# Map party names to numeric labels
label_mapping = {'Democrat': 0, 'Republican': 1}
data['label'] = data['Party'].map(label_mapping)

# Split into training and validation sets
from sklearn.model_selection import train_test_split

train_df, val_df = train_test_split(data, test_size=0.1, random_state=42)

# Display the first few rows of train_df and val_df to ensure correctness
print(train_df.head())
print(val_df.head())

from datasets import Dataset

train_dataset = Dataset.from_pandas(train_df)
val_dataset = Dataset.from_pandas(val_df)

from transformers import BertTokenizer

# Load the BERT tokenizer
tokenizer = BertTokenizer.from_pretrained('bert-base-uncased')

# Tokenization function
def tokenize_function(examples):
    return tokenizer(examples['Speech'], padding='max_length', truncation=True, max_length=32)

# Tokenize the datasets
train_dataset = train_dataset.map(tokenize_function, batched=True)
val_dataset = val_dataset.map(tokenize_function, batched=True)

train_dataset.set_format(type='torch', columns=['input_ids', 'attention_mask', 'label'])
val_dataset.set_format(type='torch', columns=['input_ids', 'attention_mask', 'label'])

from transformers import BertForSequenceClassification, Trainer, TrainingArguments

# Load the BERT model for sequence classification
model = BertForSequenceClassification.from_pretrained('bert-base-uncased', num_labels=2)

# Define training arguments
training_args = TrainingArguments(
    output_dir='./results',
    num_train_epochs=3,
    per_device_train_batch_size=8,
    per_device_eval_batch_size=8,
    warmup_steps=500,
    weight_decay=0.01,
    logging_dir='./logs',
    logging_steps=10,
    evaluation_strategy='epoch'
)
