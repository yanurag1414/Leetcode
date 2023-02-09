class Ransom_Note {
    public boolean canConstruct(String ransomNote, String magazine) {
          for (int i = 0; i < ransomNote.length(); i++) {
                char r = ransomNote.charAt(i);
                int mindex = magazine.indexOf(r);
                if (mindex == -1) {
                    return false;
                }
                magazine = magazine.substring(0, mindex) + magazine.substring(mindex + 1);
              
            }
            return true;
    }
}