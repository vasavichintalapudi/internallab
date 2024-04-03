public class DuplicateWord {    
    public static void main(String[] args) {    
        String string = "This is a string is to find duplicates";    
        int c;        
        string = string.toLowerCase();        
        String w[] = string.split(" ");       
        System.out.println("Duplicate words in a given string : ");     
        for(int i = 0; i < w.length; i++) {    
            c = 1;    
            for(int j = i+1; j < w.length; j++) {    
                if(w[i].equals(w[j])) {    
                    c++;       
                    w[j] = "0";    
                }    
            }       
            if(c > 1 && w[i] != "0")    
                System.out.println(w[i]);    
        }    
    }    
} 
