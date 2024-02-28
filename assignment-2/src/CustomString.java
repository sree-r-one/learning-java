
public class CustomString {
    // Instance Variables 

    /**
     * Current String
     */
    String myString; 

    /**
     * Indicates if the current string myString is set to null 
     */
    boolean isSet; 

    // Constructor
    public CustomString(){
        this.myString = null; 
        this.isSet = false; 
    }

    // Methods

    /**
     * Returns the current string
     * If the current string is null or has not been set with setString, it should return null
     * @return current string
     */
    public String getString(){
        if (!this.isSet) {
            return null; 
        }
        return this.myString; 
    }

    /**
     * Sets the value of the current string and sets this.isSet to true
     * If the given string is null, this.isSet to false
     * @param string value to be set
     */
    public void setString(String string){
        if (string == null) {
            this.isSet = false; 
            return; 
        }
        this.myString = string; 
        this.isSet = true; 
    }

    /**
     * 
     * @param arg string containing alphabetical characters to be removed
     * @return new string in which the alphabetical characters are removed
     */
    public String remove(String arg){

        String modifiedString = ""; 

        // If current string is null, empty or not has been set, return empty string 
        if (this.isSet == false) {
            return "";
        }

        // Convert argument to lowercase 
        arg = arg.toLowerCase(); 

        // Iterate through the string 
        for(int i=0; i < this.myString.length(); i++){

            // Get each character at indexes
            char currentChar = this.myString.charAt(i);

            // Check if the currentChar is a letter
            // If character is not alphabetical and is not present in the arg, it will added to modifiedString
            if (!Character.isLetter(currentChar) || arg.indexOf(Character.toLowerCase(currentChar)) == -1) {
                modifiedString += currentChar;
            }
        }

        return modifiedString;
    }

    /**
     * Returns a new string version of the current string where the capitalization is reversed (i.e., lowercase to uppercase, 
    * and uppercase to lowercase) for the alphabetical characters specified in the given arg.
    * All non-alphabetical characters are unaffected.
    * If the current string is null, empty, or has not been set to a value, this method should return an empty string.
    * @param arg
    * @return
    */
    public String reverse(String arg){

        // Modified string 
        String modifiedString = ""; 

        // If current string is null, empty or not has been set, return Empty string 
        if (this.isSet == false) {
            return "";
        }

        // Iterate through the mystring
        for(int i = 0; i < this.myString.length(); i++){

            // Get the char at the indexes
            char currentChar = this.myString.charAt(i);

            // Check if the currentChar is a letter and present in the index
            if (Character.isLetter(currentChar) && arg.indexOf(Character.toLowerCase(currentChar)) != -1) {
                if(Character.isUpperCase(currentChar)){
                    modifiedString += Character.toLowerCase(currentChar);
                    continue;
                }
                else{
                    modifiedString += Character.toUpperCase(currentChar);
                    continue;
                }
            } else{
                // If character is not alphabetical and is not present in the arg
                // It will added to modifiedString
                modifiedString += currentChar;
            }
        }
        return modifiedString;
    }

    public String filterLetters(char n, boolean more){
        
        String modifiedString = "";

        // If current string is null, empty or not has been set, return Empty string 
        if (this.isSet == false) {
            return "";
        }

        n = Character.toLowerCase(n);

        for(int i=0; i < this.myString.length(); i++){
            
            // Get the current character
            char currentChar = this.myString.charAt(i);

            // Check if the currentChar is a letter
            if(Character.isLetter(Character.toLowerCase(currentChar))){

                if(more){
                    if (Character.toLowerCase(currentChar) >= n) {
                        continue;
                    }
                }
                else{
                    if (Character.toLowerCase(currentChar) <= n) {
                        continue;
                    }
                }
            }
            modifiedString += currentChar;
        }
        return modifiedString;
    }

}
