package secondstring;

public class GoalParserInterpretation {
    public static void main(String[] args) {
        String command = "G()(al)";
        command = command.replace("()","o");
        command = command.replace("(al)","al");
        System.out.println(command);
    }
    
}
