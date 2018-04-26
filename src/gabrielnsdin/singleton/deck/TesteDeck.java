package gabrielnsdin.singleton.deck;

import gabrielnsdin.singleton.deck.Deck;

public class TesteDeck {
	
	public static void main(String[] args) {
		Deck deck = Deck.getInstance();
		deck.print();
	}
}
