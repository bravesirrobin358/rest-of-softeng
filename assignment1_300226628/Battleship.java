// Name: Yannick Vaillancourt
// ID: 300226628
// Commands:
// javac Battleship.java
// java Battleship
// this program can handle all 5 cases ('(X,X)', '(X, X)', 'X,X', 'XX', 'X X')
import java.util.Scanner;

public class Battleship{
	private String[][] board;

	public Battleship(){
		this.board = new String[7][7];
		boardFill(this.board);
	}

	public void boardFill(String[][] board){
		for (int i=0; i<board.length; i++){
			for (int j=0; j<board[0].length; j++){
				if ((i == 0) && (j == 0)){
					board[i][j] = "topLeft";
				} else if((i == 0) && (j == (board[0].length -1))){
					board[i][j] = "topRight";
				} else if((i == (board.length -1)) && (j == 0)){
					board[i][j] = "bottomLeft";
				} else if((i == (board.length -1) && (j == (board[0].length -1)))){
					board[i][j] = "bottomRight";
				} else if(i == 0){
					board[i][j] = "top";
				} else if(j == 0){
					board[i][j] = "left";
				} else if(j == (board[0].length -1)){
					board[i][j] = "right";
				} else if(i == (board.length -1)){
					board[i][j] = "bottom";
				} else{
					board[i][j] = "center";
				}
			}
		}
	}

	public boolean validInput(String strInput){
		boolean valid = false;
		int strLen = strInput.length();
		char[] input = strInput.toCharArray();
		if(strLen == 2){
			if(Character.isDigit(input[0]) && Character.isDigit(input[1])){
				valid = true;
			}
		} else if(strLen == 3){
			if(input[1] == ' ' || input[1] == ','){
				if(Character.isDigit(input[0]) && Character.isDigit(input[2])){
					valid = true;
				}	
			}
		} else if(strLen == 5){
			if(input[0] == '(' && input[2] == ',' && input[4] == ')'){
				if(Character.isDigit(input[1]) && Character.isDigit(input[3])){
					valid = true;
				}
			}
		} else if(strLen == 6){
			if(input[0] == '(' && input[2] == ',' && input[3] == ' ' && input[5] == ')'){
				if(Character.isDigit(input[1]) && Character.isDigit(input[4])){
					valid = true;
				}
			}
		}
		return valid;
	}

	public String convertInput(String strInput){
		String converted = "";
		char[] input = strInput.toCharArray();
		int strLen = strInput.length();
		if(strLen == 2){
			converted = strInput;
		} else if(strLen == 3){
			converted = ""+input[0]+input[2];
		} else if(strLen == 5){
			converted = ""+input[1]+input[3];
		} else if(strLen == 6){
			converted = ""+input[1]+input[4];
		}
		return converted;
	}

	public String[] edgeAdjacent(int row, int column){
		String[] edges;
		if(board[row][column].equals("topLeft")){
			edges = new String[]{"(0,1)","(1,0)"};
		} else if(board[row][column].equals("topRight")){
			edges = new String[]{"(0,5)","(1,6)"};
		} else if(board[row][column].equals("bottomRight")){
			edges = new String[]{"(6,5)","(5,6)"};
		} else if(board[row][column].equals("bottomLeft")){
			edges = new String[]{"(5,0)","(6,1)"};
		} else if (board[row][column].equals("left")){
			edges = new String[]{"("+(row-1)+","+column+")","("+(row+1)+","+column+")","("+row+","+(column+1)+")"};
		} else if (board[row][column].equals("right")){
			edges = new String[]{"("+(row-1)+","+column+")","("+(row+1)+","+column+")","("+row+","+(column-1)+")"};
		} else if (board[row][column].equals("top")){
			edges = new String[]{"("+row+","+(column-1)+")","("+row+","+(column+1)+")","("+(row+1)+","+column+")"};
		} else if (board[row][column].equals("bottom")){
			edges = new String[]{"("+row+","+(column-1)+")","("+row+","+(column+1)+")","("+(row-1)+","+column+")"};
		} else{
			edges = new String[]{"("+row+","+(column-1)+")","("+row+","+(column+1)+")","("+(row-1)+","+column+")", "("+(row+1)+","+column+")"};
		}
		return edges;
	}

	public String[] cornerAdjacent(int row, int column){
		String[] corners;
		if(board[row][column].equals("topLeft")){
			corners = new String[]{"(1,1)"};
		} else if(board[row][column].equals("topRight")){
			corners = new String[]{"(1,5)"};
		} else if(board[row][column].equals("bottomRight")){
			corners = new String[]{"(5,5)"};
		} else if(board[row][column].equals("bottomLeft")){
			corners = new String[]{"(5,1)"};
		} else if (board[row][column].equals("left")){
			corners = new String[]{"("+(row-1)+","+(column+1)+")","("+(row+1)+","+(column+1)+")"};
		} else if (board[row][column].equals("right")){
			corners = new String[]{"("+(row-1)+","+(column-1)+")","("+(row+1)+","+(column-1)+")"};
		} else if (board[row][column].equals("top")){
			corners = new String[]{"("+(row+1)+","+(column-1)+")","("+(row+1)+","+(column+1)+")"};
		} else if (board[row][column].equals("bottom")){
			corners = new String[]{"("+(row-1)+","+(column-1)+")","("+(row-1)+","+(column+1)+")"};
		} else{
			corners = new String[]{"("+(row-1)+","+(column-1)+")","("+(row-1)+","+(column+1)+")","("+(row+1)+","+(column+1)+")", "("+(row+1)+","+(column-1)+")"};
		}
		return corners;
	}

	public String[] nonAdjacent(String[] edges, String[] corners, int row, int column){
		String[] nonAdjacent = new String[(7*7) - edges.length - corners.length -1];
		int position = 0;
		for (int i=0; i<board.length; i++){
			for (int j=0; j<board[0].length; j++){
				String current = "("+i+","+j+")";
				boolean adjacent = false;
				for (int k=0; k<edges.length; k++){
					if(current.equals(edges[k])){
						adjacent = true;
					}
				}
				for (int g=0; g<corners.length; g++){
					if(current.equals(corners[g])){
						adjacent = true;
					}
				}
				if (i == row && j == column){
					adjacent = true;
				}
				if (!adjacent){
					nonAdjacent[position] = current;
					position++;
				}
			}
		}
		return nonAdjacent;
	}

	public static void main(String[] args){
		Battleship gameBoard = new Battleship();
		String[] edges;
		String[] corners;
		String[] nonAdjacent;
		String convertedInput;
		Scanner scanner;
		String input;
		int row;
		int column;
		


		while (true){
			System.out.print("Enter a coordinate:\n");
			scanner = new Scanner(System.in);
			input = scanner.nextLine();
			if (gameBoard.validInput(input)){
				convertedInput = gameBoard.convertInput(input);
				char[] charConvertedInput = convertedInput.toCharArray();
				row = Integer.parseInt(String.valueOf(charConvertedInput[0]));
				column = Integer.parseInt(String.valueOf(charConvertedInput[1]));
				if(row > 6 || column > 6){
					System.out.println("Invalid input. Valid input formats(where X is an int from 0<=X<=6):\n'(X,X)', '(X, X)', 'X,X', 'XX', 'X X'");
					continue;
				}
				break;
			}else{
				System.out.println("Invalid input. Valid input formats(where X is an int from 0<=X<=6):\n'(X,X)', '(X, X)', 'X,X', 'XX', 'X X'");
			}
		}
		scanner.close();

		edges = gameBoard.edgeAdjacent(row, column);
		corners = gameBoard.cornerAdjacent(row, column);
		nonAdjacent = gameBoard.nonAdjacent(edges, corners, row, column);

		System.out.println("\nOutputs:\nEdge-adjacent edges:");
		for(String e: edges){
			System.out.print(e);
		}
		System.out.println("");
		System.out.println("\nCorner-adjacent edges:");
		for(String c: corners){
			System.out.print(c);
		}
		System.out.println("");
		System.out.println("\nNon-adjacent edges:");
		for(String n: nonAdjacent){
			System.out.print(n);
		}

	}


}