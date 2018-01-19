package formation;

public class TypeOperationJDK5 {
	public static final int TYPE_CB = 0;
	public static final int TYPE_CHEQUE = 1;
	public static final int TYPE_ESPECE = 2;
	public static final int TYPE_VIREMENT = 3;
	public static final int TYPE_PRELEVEMENT = 4;

	public static String getValue(int value) {
		switch(value) {
			case TYPE_CB: return "CB";
			case TYPE_CHEQUE: return "Chèque";
			case TYPE_ESPECE: return "Espèce";
			case TYPE_VIREMENT: return "Virement";
			case TYPE_PRELEVEMENT: return "Prélèvement";
		}

		return "#ERR";
	}
	
	public static int getValue (String value) {
		switch (value) {
		case "CB": return TYPE_CB;
		case "Chèque": return TYPE_CHEQUE;
		case "Espèce": return TYPE_ESPECE;
		case "Virement": return TYPE_VIREMENT;
		case "Prélèvement": return TYPE_PRELEVEMENT;
		}
		return -1;
	}
}
