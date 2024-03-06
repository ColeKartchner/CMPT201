#Movie reviews using naive machine learning

# Library that provides sub() function to eliminate non-alphabetic characters
import re

infile = open("moviereviews_short.txt","r")

# a dictionary that associates each word with the number of occurrences of that word
occurrences = {}

# a dictionary that associates each word with the total score for that word
scores = {}

# This loops through each review in the input file
for review in infile:
    
    #obtains the score of the review
    score = int(review.split()[0])
    
    # removes all non-alphabetic characters in the review
    review = re.sub("[^a-zA-Z]+", " ",review)
    
    # stores each word of the review in the list words
    words = review.split()
    
    # loop through each word in the review
    for w in words:
        # if the word already occurs in the dictionary, increment the occurrences count for that word by 1
        # else  the word does not yet occur in the dictionary, so initialize the occurrences count to 1
        if w in occurrences.keys():
            count = occurrences[w] + 1
            occurrences[w] = count
        else:
            occurrences[w] = 1
    
        # TO-DO Construct the scores dictionary
    
        if w in scores.keys():
            feeling = scores[w] + score
            scores[w] = feeling
        else:
            scores[w] = score
            
infile.close()

# TO-DO Prompt the user to enter a review
review = (input("Enter a review:"))
# Split the input into individual words
words = review.split()

total = 0

for w in words:
        
    if w in scores.keys():
        avg = (scores[w]/occurrences[w])
        total = total + avg
        
print(total)

#average

#<1.5: negative
#>=1.5 and <2.5 : neutral
#>=2.5 : positive

# TO-DO Determine and output the sentiment of the review
