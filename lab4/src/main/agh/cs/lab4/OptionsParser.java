package agh.cs.lab4;

public class OptionsParser {
    public MoveDirection[] parse(String[] args){
        MoveDirection[] parsed = new MoveDirection[args.length];
        int i = 0;
        for(String direction : args){
            switch (direction){
                case "f":
                case "forward":
                    parsed[i] = MoveDirection.FORWARD;
                    i++;
                    break;
                case "b":
                case "backward":
                    parsed[i] = MoveDirection.BACKWARD;
                    i++;
                    break;
                case "r":
                case "right":
                    parsed[i] = MoveDirection.RIGHT;
                    i++;
                    break;
                case "l":
                case "left":
                    parsed[i] = MoveDirection.LEFT;
                    i++;
                    break;
                default:
                    parsed[i] = MoveDirection.ERROR;
                    i++;
            }
        }
        return parsed;
    }
}
