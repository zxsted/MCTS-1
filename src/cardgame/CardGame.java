package cardgame;

import java.util.ArrayList;

import main.Board;
import main.CallLocation;
import main.Move;

public class CardGame implements Board {

	public Player human;
	public Player computer;
	private final CardDictionary dictionary;
	
	public CardGame(final CardDictionary dictionary){
		this.dictionary = dictionary;
	}
	
	@Override
	public Board duplicate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Move> getMoves(CallLocation location) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void makeMove(Move m) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean gameOver() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getCurrentPlayer() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getQuantityOfPlayers() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double[] getScore() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double[] getMoveWeights() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void bPrint() {
		// TODO Auto-generated method stub

	}

}
