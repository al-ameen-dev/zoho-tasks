class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] string = identifier.toCharArray();
        for(int i=0;i<string.length;i++){
            if(string[i] == ' '){
                stringBuilder.append('_');
            }else if(string[i] == '-'){
                stringBuilder.append(Character.toUpperCase(string[++i]));
            }else if(Character.isDigit(string[i])){
                if(string[i] == '4'){
                    stringBuilder.append('a');
                }else if(string[i] == '3'){
                   stringBuilder.append('e');
                }else if(string[i] == '1'){
                    stringBuilder.append('l');
                }else if(string[i] == '0'){
                    stringBuilder.append('o');
                }else if(string[i] == '7'){
                    stringBuilder.append('t');
                }
            }else if(Character.isAlphabetic(string[i])){
                stringBuilder.append(string[i]);
            }
        }
    return stringBuilder.toString();
    }
}