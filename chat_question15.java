class chat_question15{
    public static void main(String[] args){
        System.out.println("All prime numbers between 1 and 50 :\n");
        int count=0;
        for (int i=1;i<=50;i++){
            int prime=1;    
            for (int j=i-1;j>1;j--){
                if(i%j==0){
                    count++;
                    prime=0;
                    break;
                }
            }
            if (prime==1){
                System.out.println("\n"+count+" : "+i);
            }
        }
    }
}