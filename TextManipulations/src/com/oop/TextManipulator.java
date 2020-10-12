package com.oop;


    public class TextManipulator {
        String text;
        int NumLetters;
        int NumVowels;
        int NumConsonants;

        public TextManipulator(String t){
            this.text = t;
        }

        public int NumSentences(){
            int sentenceCount = 0;

            if (text.length() != 0)
            {
                sentenceCount++;
                for (int i = 0; i < text.length()-1; i++) {
                    if (text.charAt(i) == '.' || text.charAt(i) == '?' || text.charAt(i) == '!') {
                        if (text.charAt(i + 1) == ' ') {
                            sentenceCount++;
                            i++;
                        }
                    }
                }
            }
            else
                System.out.println("Empty line");

            return sentenceCount;
        }

        public int NumWords(){
            int NumCount = 0;

            if (text.length() != 0)
            {
                NumCount++;

                for (int i = 1; i < text.length(); i++)
                {
                    if(text.charAt(i) == ' ' && text.charAt(i-1) != ' ')
                    {
                        NumCount++;
                    }
                }
            }
            else
                System.out.println("Empty line");

            return NumCount;
        }

        public void NumLetters(){

            if (text.length() != 0){
                for (int i = 0; i < text.length(); i++)
                {
                    if (text.charAt(i) == 'A' || text.charAt(i) == 'a' || text.charAt(i) == 'E' || text.charAt(i) == 'e'
                            || text.charAt(i) == 'O' || text.charAt(i) == 'o' || text.charAt(i) == 'I' || text.charAt(i) == 'i'
                            || text.charAt(i) == 'U' || text.charAt(i) == 'u' || text.charAt(i) == 'Y' || text.charAt(i) == 'y')
                    {
                        NumVowels++;
                    }
                    NumLetters++;

                }
                NumConsonants = NumLetters - NumVowels;
            }
            else
                System.out.println("Empty line");

        }


    }