class Maximum_Number_of_Words_Found_in_Sentences {
    public int mostWordsFound(String[] sentences) {
        int n=sentences[0].split("\\s").length;
        for (int i = 0; i < sentences.length; i++) {
            if(n<sentences[i].split("\\s").length){
                n=sentences[i].split("\\s").length;
            }
        }
        return n;
    }
}