#!/bin/bash

dir="."
pattern="*.cbl"

shopt -s nullglob

for file in "$dir"/$pattern; do
    if [ -f "$file" ]; then
        echo "Processing: $file"
        total=$(wc -l < "$file")
        width=${#total}
        awk -v w="$width" '{printf "%0*d %s\n", w, NR, $0}' "$file" > "$file.tmp" && mv "$file.tmp" "$file"
    fi
done

echo "Done!"

