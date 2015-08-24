
public class Mario {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = -1;
        boolean valid = false;
        String build;
        
        System.out.println("How high would you like the pyramid?(0-23)");
        while(!valid ){
            try{
                
                height = sc.nextInt();
                while(height < 0 || height > 23){
                    System.out.println("Please enter an integer between 0-23.");
                    System.out.println();
                    height = sc.nextInt();
                }
                valid = true;
            } catch(Exception e){
                System.out.println("Please enter an integer between 0-23.");
                System.out.println();
                height = -1;
            }
        }
        
        for(int i = 0; i < height; i++){
            int run = 0;
            build = "";
                run++;
            }
            for( int l = 0; l < height - run + 1; l++){
                build += "#";
            }
            System.out.println(build);
        }
            
    }    
}

