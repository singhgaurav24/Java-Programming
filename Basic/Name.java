import java.io.*; 
  
class Name { 
  
    static void pattern(int line) 
    { 
        int i, j; 
        for(i = 0; i < line; i++) 
        { 
            for(j = 0; j < line; j++) 
            { 
                if((j == 1 && i != 0 && i != line - 1) || 
                ((i == 0 || i == line - 1) && j > 1 && 
                j < line - 2) || (i == ((line - 1) / 2) &&  
                j > 2 && j < line - 1) || (j == line - 2 &&  
                i != 0 && i >= ((line - 1) / 2) && i != line - 1)) 
                    System.out.print("*"); 
                else
                    System.out.print( " "); 
      
            } 
            System.out.println(); 
        } 
    } 
    void display(int n) 
    { 
        // Outer for loop for number of lines 
        for (int i = 0; i < n; i++) { 
  
            // Inner for loop for logic execution 
            for (int j = 0; j <= n / 2; j++) { 
  
                // prints two column lines 
                if ((j == 0 || j == n / 2) && i != 0 || 
  
                    // print first line of alphabet 
                    i == 0 && j != 0 && j != n / 2 || 
  
                    // prints middle line 
                    i == n / 2) 
  
                    System.out.print("*"); 
                else
                    System.out.print(" "); 
            }
  
            System.out.println(); 
        }
        } 
      
    // Driver code 
    public static void main (String[] args)  
    { 
        int line = 7; 
        pattern(line); 
        
        Name a = new Name(); 
        a.display(7); 
    } 
} 