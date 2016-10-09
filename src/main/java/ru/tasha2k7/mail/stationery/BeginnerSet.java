package ru.tasha2k7.mail.stationery;

import java.util.ArrayList;

public class BeginnerSet {

	public static void main(String[] args) {

		ArrayList<Object> beginnerSet = new ArrayList<Object>();

		beginnerSet.add(new Products("NotePad", 1, 2.5, "PROFF", "A5", 352, "white", "‰‡ÚËÓ‚‡ÌÌ˚È", "“¬≈–ƒ€… œ≈–≈œÀ≈“",
				"brown", false));
		beginnerSet.add(new Products("Cube paper for records", 1, 1.8, "PROFF", "85X85", 400, "FOUR-COLOR",
				"monochromatic", "Ãﬂ√ »… œ≈–≈œÀ≈“ ( ¡—)", "null", false));
		beginnerSet.add(new Products("Cube paper for records with an adhesive edge", 1, 0.96, "PROFF", "75X75", 100,
				"yellow", "monochromatic", "Ãﬂ√ »… œ≈–≈œÀ≈“ ( ¡—)", "null", true));
		beginnerSet.add(new WritingAccessories("Pen", 2, 2.0, "PROFF", 0.7, "blue"));
		beginnerSet.add(new WritingAccessories("Pen", 1, 2.0, "PROFF", 0.7, "red"));
		beginnerSet.add(new WritingAccessories("Pensil", 1, 1.9, "PROFF", 0.5, "grey"));
		beginnerSet.add(new WritingAccessories("Marker", 1, 1.32, "PROFF", 6.0, "green"));
		beginnerSet.add(new WritingAccessories("Marker", 1, 1.32, "PROFF", 6.0, "red"));
		beginnerSet.add(new StationeryAccessories("stapler", 1, 6.48, "PROFF", "metal", "black", "20 sheets,  π24/6"));
		beginnerSet
				.add(new StationeryAccessories("eraser", 1, 0.47, "PROFF", "rubber", "white", "with the beveled edge"));
		beginnerSet.add(new WorkplaceOrganization("organizer", 1, 3.9, "PROFF", "plastic", "null", "black"));
		beginnerSet.add(
				new WorkplaceOrganization("box for paper for records", 1, 1.5, "PROFF", "plastic", "85x85", "blu"));

	
	}

}
