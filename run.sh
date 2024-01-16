#!/bin/bash

# Specify the directory path
DIRECTORY_PATH="/home/aeagal/inconsistency_exploration/data/gpt_4"

# Path to the clusters subdirectory
CLUSTERS_DIR="${DIRECTORY_PATH}/clusters"

# Create the clusters directory if it doesn't exist
mkdir -p "$CLUSTERS_DIR"

# Change to the specified directory
cd "$DIRECTORY_PATH"

# Loop through each file in the directory
for file in *; do
    # Skip if it's a directory
    if [[ -d "$file" ]]; then
        continue
    fi

    # Get the filename without the extension
    directory_name="${file%.*}"

    # Create a directory within clusters/ with the filename (if it doesn't exist)
    if [[ ! -d "${CLUSTERS_DIR}/${directory_name}" ]]; then
        mkdir "${CLUSTERS_DIR}/${directory_name}"
        echo "Directory created: ${CLUSTERS_DIR}/${directory_name}"
    fi
done
