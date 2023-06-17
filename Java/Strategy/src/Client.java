import Callback.FileProcessor;
import Callback.Operator;

public class Client {
    public static void main(String[] args) {
        FileProcessor fileProcessor = new FileProcessor("src/FileDirectory/number.txt");

        /*int result = fileProcessor.process(new Operator() {
            @Override
            public int getResult(int result, int number) {
                return result += number;
            }
        });*/

        int result = fileProcessor.process((sum, number) -> {
            return sum += number;
        });


        System.out.println(result);
    }
}
