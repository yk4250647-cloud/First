class chat_question17{
    public static void main(String[] args){
        System.out.println("All numbers from 1 to 10 (skipping 5) :\n");
        for (int i=1;i<=10;i++){
            if (i==5){continue;}
            System.out.println(i);
        }
    }
}