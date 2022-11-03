package m5w2d1es.utils;

public class LogColor {
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_BLACK = "\u001B[30m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_BLUE = "\u001B[34m";
	public static final String ANSI_PURPLE = "\u001B[35m";
	public static final String ANSI_CYAN = "\u001B[36m";
	public static final String ANSI_WHITE = "\u001B[37m";

	public static final String BLACK(String msg) {
		return ANSI_BLACK + msg + ANSI_RESET;
	}

	public static final String RED(String msg) {
		return ANSI_RED + msg + ANSI_RESET;
	}

	public static final String GREEN(String msg) {
		return ANSI_GREEN + msg + ANSI_RESET;
	}

	public static final String YELLOW(String msg) {
		return ANSI_YELLOW + msg + ANSI_RESET;
	}

	public static final String BLUE(String msg) {
		return ANSI_BLUE + msg + ANSI_RESET;
	}

	public static final String PURPLE(String msg) {
		return ANSI_PURPLE + msg + ANSI_RESET;
	}

	public static final String CYAN(String msg) {
		return ANSI_CYAN + msg + ANSI_RESET;
	}

	public static final String WHITE(String msg) {
		return ANSI_WHITE + msg + ANSI_RESET;
	}
	
	public static void standardMessage( String stringa ) {
        StringBuilder vuota = new StringBuilder( "****" );
        vuota.append( "*".repeat( Math.max( 0, stringa.length() + 1 ) ) );

        System.out.println( LogColor.YELLOW( vuota.toString() ) );
        System.out.println( LogColor.YELLOW( "* " + stringa + " *" ) );
        System.out.println( LogColor.YELLOW( vuota.toString() ) );
    } 

    public static void infoMessage( String stringa ) {
        StringBuilder vuota = new StringBuilder( "----------" );
        vuota.append( "-".repeat( Math.max( 0, stringa.length() + 1 ) ) );

        System.out.println( LogColor.CYAN( vuota.toString() ) );
        System.out.println( LogColor.CYAN( "| INFO | " + stringa + " |" ) );
        System.out.println( LogColor.CYAN( vuota.toString() ) );
    }

    public static void errorMessage( String stringa ) {
        StringBuilder vuota = new StringBuilder( "-!--!--!--" );
        vuota.append( "-".repeat( Math.max( 0, stringa.length() + 1 ) ) );

        System.out.println( LogColor.RED( vuota.toString() ) );
        System.out.println( LogColor.RED( "| ERROR | " + stringa + " |" ) );
        System.out.println( LogColor.RED( vuota.toString() ) );
    }
    
    public static void selectionMessage( String stringa ) {
        StringBuilder vuota = new StringBuilder( "-v--v--v--" );
        vuota.append( "-".repeat( Math.max( 0, stringa.length() + 1 ) ) );

        System.out.println( LogColor.GREEN( vuota.toString() ) );
        System.out.println( LogColor.GREEN( "| INPUT | " + stringa + " |" ) );
        System.out.println( LogColor.GREEN( vuota.toString() ) );
        System.out.println( LogColor.GREEN( "  V V V " ) );
        System.out.println( LogColor.GREEN( "   V V " ) );
        System.out.println( LogColor.GREEN( "    V " ) );
    }

}
