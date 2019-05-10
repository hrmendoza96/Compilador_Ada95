/* The following code was generated by JFlex 1.7.0 */

import java_cup.runtime.*;
import java.util.ArrayList;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>Lexer.jflex</tt>
 */
class Lexer implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\3\1\3\1\53\1\3\1\3\22\0\1\4\1\11\1\25"+
    "\1\11\1\11\1\11\1\11\1\11\1\23\1\24\1\16\1\22\1\5"+
    "\1\15\1\7\1\20\12\2\1\10\1\6\1\21\1\17\1\21\1\11"+
    "\1\11\1\32\1\26\1\47\1\44\1\31\1\34\1\40\1\46\1\37"+
    "\2\1\1\30\1\1\1\33\1\27\1\51\1\1\1\41\1\43\1\35"+
    "\1\50\1\1\1\52\1\45\2\1\1\11\1\0\1\11\1\11\1\14"+
    "\1\0\1\32\1\26\1\47\1\44\1\31\1\34\1\40\1\46\1\37"+
    "\2\1\1\30\1\1\1\33\1\27\1\51\1\1\1\41\1\43\1\35"+
    "\1\50\1\1\1\52\1\45\2\1\1\11\1\0\1\11\7\0\1\53"+
    "\33\0\1\13\35\0\1\13\2\0\1\12\37\0\1\12\115\0\2\36"+
    "\115\0\1\42\u1ea8\0\1\53\1\53\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\1"+
    "\1\7\1\10\1\11\1\12\1\11\1\12\1\10\1\13"+
    "\1\14\1\1\10\2\1\1\3\2\1\1\5\2\1\15"+
    "\2\0\1\16\1\17\1\4\3\0\1\20\2\2\1\21"+
    "\15\2\1\22\1\23\1\24\1\22\1\23\1\24\2\2"+
    "\1\0\7\2\1\25\2\0\2\2\1\26\1\2\1\0"+
    "\1\2\1\27\1\0\1\2\1\30\1\2\1\31\5\2"+
    "\1\0\1\2\1\32\1\2\1\0\1\2\1\33\2\2"+
    "\1\34\1\2\1\0\2\2\1\0\1\2\1\35\1\36"+
    "\1\0\1\36\1\2\2\37\1\40\1\2\1\0\2\2"+
    "\1\41\1\42\1\0\2\2\1\0\1\2\1\0\2\2"+
    "\1\43\1\0\2\2\2\44\2\45\1\46\2\47\1\2"+
    "\1\0\2\2\1\0\1\2\1\0\2\2\2\50\1\2"+
    "\1\0\1\2\1\0\1\2\1\51\2\52\1\0\2\2"+
    "\1\53\1\0\1\2\2\54\1\0\2\2\2\55\2\56"+
    "\1\2\1\57";

  private static int [] zzUnpackAction() {
    int [] result = new int[183];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\54\0\130\0\204\0\54\0\54\0\54\0\260"+
    "\0\334\0\u0108\0\54\0\54\0\u0134\0\u0134\0\54\0\54"+
    "\0\54\0\u0160\0\u018c\0\u01b8\0\u01e4\0\u0210\0\u023c\0\u0268"+
    "\0\u0294\0\u02c0\0\u02ec\0\u0318\0\u0344\0\u0370\0\u039c\0\u03c8"+
    "\0\u03f4\0\u0420\0\u044c\0\u0478\0\54\0\u04a4\0\u04d0\0\54"+
    "\0\54\0\u04fc\0\u0160\0\u0528\0\u0554\0\54\0\u0580\0\u05ac"+
    "\0\130\0\u05d8\0\u0604\0\u0630\0\u065c\0\u0688\0\u06b4\0\u06e0"+
    "\0\u070c\0\u0738\0\u0764\0\u0790\0\u07bc\0\u07e8\0\u0814\0\54"+
    "\0\54\0\u0840\0\130\0\130\0\u086c\0\u0898\0\u08c4\0\u08f0"+
    "\0\u091c\0\u0948\0\u0974\0\u09a0\0\u09cc\0\u09f8\0\u04d0\0\u0a24"+
    "\0\u0a50\0\u0a7c\0\u0aa8\0\130\0\u0ad4\0\u0b00\0\u0b2c\0\130"+
    "\0\u0b58\0\u0b84\0\130\0\u0bb0\0\130\0\u0bdc\0\u0c08\0\u0c34"+
    "\0\u0c60\0\u0c8c\0\u0cb8\0\u0ce4\0\130\0\u0d10\0\u0d3c\0\u0d68"+
    "\0\130\0\u0d94\0\u0dc0\0\130\0\u0dec\0\u0e18\0\u0e44\0\u0e70"+
    "\0\u0e9c\0\u0ec8\0\130\0\54\0\u0ef4\0\130\0\u0f20\0\54"+
    "\0\130\0\130\0\u0f4c\0\u0f78\0\u0fa4\0\u0fd0\0\130\0\130"+
    "\0\u0ffc\0\u1028\0\u1054\0\u1080\0\u10ac\0\u10d8\0\u1104\0\u1130"+
    "\0\130\0\u115c\0\u1188\0\u11b4\0\54\0\130\0\54\0\130"+
    "\0\130\0\54\0\130\0\u11e0\0\u120c\0\u1238\0\u1264\0\u1290"+
    "\0\u12bc\0\u12e8\0\u1314\0\u1340\0\54\0\130\0\u136c\0\u1398"+
    "\0\u13c4\0\u13f0\0\u141c\0\130\0\54\0\130\0\u1448\0\u1474"+
    "\0\u14a0\0\130\0\u14cc\0\u14f8\0\54\0\130\0\u1524\0\u1550"+
    "\0\u157c\0\54\0\130\0\54\0\130\0\u15a8\0\130";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[183];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\2\5\1\6\1\7\1\10\1\11"+
    "\4\2\1\12\1\13\1\14\1\15\1\16\1\17\1\20"+
    "\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30"+
    "\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40"+
    "\1\3\1\41\1\3\1\42\1\3\1\43\1\44\1\45"+
    "\55\0\1\3\12\0\1\46\11\0\10\3\1\0\3\3"+
    "\1\0\10\3\3\0\1\4\4\0\1\47\53\0\1\50"+
    "\63\0\1\51\36\0\1\4\12\0\1\52\55\0\1\14"+
    "\35\0\11\53\1\54\1\0\4\53\1\55\1\53\1\0"+
    "\2\53\1\56\10\53\1\0\3\53\1\0\10\53\2\0"+
    "\1\3\12\0\1\46\11\0\1\3\1\57\1\3\1\60"+
    "\4\3\1\0\3\3\1\0\10\3\2\0\1\3\12\0"+
    "\1\46\11\0\10\3\1\0\2\3\1\61\1\0\5\3"+
    "\1\62\2\3\2\0\1\3\12\0\1\46\11\0\1\3"+
    "\1\63\6\3\1\0\3\3\1\0\10\3\2\0\1\3"+
    "\12\0\1\46\11\0\2\3\1\64\2\3\1\65\2\3"+
    "\1\0\3\3\1\0\2\3\1\66\5\3\2\0\1\3"+
    "\12\0\1\46\11\0\5\3\1\67\2\3\1\0\3\3"+
    "\1\0\10\3\2\0\1\3\12\0\1\46\11\0\10\3"+
    "\1\0\3\3\1\0\5\3\1\70\2\3\2\0\1\3"+
    "\12\0\1\46\11\0\1\3\1\71\1\72\1\3\1\73"+
    "\3\3\1\0\3\3\1\0\5\3\1\74\2\3\2\0"+
    "\1\3\12\0\1\46\11\0\10\3\1\0\2\3\1\75"+
    "\1\0\3\3\1\76\4\3\34\0\1\77\1\100\5\0"+
    "\2\101\11\0\1\3\12\0\1\46\11\0\5\3\1\102"+
    "\1\103\1\3\1\0\3\3\1\101\1\104\7\3\2\0"+
    "\1\3\12\0\1\46\11\0\3\3\1\105\4\3\1\0"+
    "\3\3\1\0\10\3\2\0\1\3\12\0\1\46\11\0"+
    "\3\3\1\106\4\3\1\0\3\3\1\0\10\3\36\0"+
    "\1\107\17\0\1\3\12\0\1\46\11\0\7\3\1\110"+
    "\1\0\3\3\1\0\10\3\2\0\1\3\12\0\1\46"+
    "\11\0\1\3\1\111\6\3\1\0\3\3\1\0\10\3"+
    "\2\0\1\3\12\0\1\46\11\0\1\3\1\112\6\3"+
    "\1\0\3\3\1\0\10\3\2\0\1\3\12\0\1\46"+
    "\11\0\10\3\1\0\2\3\1\113\1\0\5\3\1\114"+
    "\2\3\2\0\1\3\12\0\1\46\11\0\10\3\1\0"+
    "\3\3\1\0\3\3\1\115\4\3\2\0\2\116\23\0"+
    "\10\116\1\0\3\116\1\0\10\116\3\0\1\117\52\0"+
    "\2\52\1\0\6\52\1\120\1\0\4\52\1\121\1\52"+
    "\1\0\2\52\1\0\10\52\1\0\3\52\1\0\10\52"+
    "\14\0\1\53\57\0\1\53\35\0\1\3\12\0\1\46"+
    "\11\0\1\3\1\122\6\3\1\0\3\3\1\0\10\3"+
    "\2\0\1\3\12\0\1\46\11\0\10\3\1\0\1\3"+
    "\1\123\1\3\1\0\10\3\2\0\1\3\12\0\1\46"+
    "\11\0\7\3\1\124\1\0\3\3\1\0\10\3\2\0"+
    "\1\3\12\0\1\46\11\0\1\3\1\125\6\3\1\0"+
    "\3\3\1\0\10\3\2\0\1\3\12\0\1\46\11\0"+
    "\10\3\1\0\3\3\1\126\1\127\7\3\2\0\1\3"+
    "\12\0\1\46\11\0\10\3\1\0\3\3\1\0\1\3"+
    "\1\130\6\3\2\0\1\3\12\0\1\46\11\0\10\3"+
    "\1\131\1\132\2\3\1\0\10\3\2\0\1\3\12\0"+
    "\1\46\11\0\10\3\1\0\3\3\1\0\1\3\1\133"+
    "\6\3\2\0\1\3\12\0\1\46\11\0\2\3\1\134"+
    "\5\3\1\0\3\3\1\0\10\3\2\0\1\3\12\0"+
    "\1\46\11\0\10\3\1\0\2\3\1\135\1\0\10\3"+
    "\2\0\1\3\12\0\1\46\11\0\1\3\1\136\6\3"+
    "\1\0\3\3\1\0\10\3\2\0\1\3\12\0\1\46"+
    "\11\0\2\3\1\137\5\3\1\0\3\3\1\0\10\3"+
    "\2\0\1\3\12\0\1\46\11\0\5\3\1\140\2\3"+
    "\1\0\3\3\1\0\10\3\2\0\1\3\12\0\1\46"+
    "\11\0\10\3\1\0\3\3\1\0\5\3\1\141\2\3"+
    "\2\0\1\3\12\0\1\46\11\0\3\3\1\142\4\3"+
    "\1\0\3\3\1\0\10\3\36\0\1\143\17\0\1\3"+
    "\12\0\1\46\11\0\7\3\1\144\1\0\3\3\1\0"+
    "\10\3\2\0\1\3\12\0\1\46\11\0\7\3\1\145"+
    "\1\0\3\3\1\0\10\3\2\0\1\3\12\0\1\46"+
    "\11\0\7\3\1\146\1\0\3\3\1\0\10\3\42\0"+
    "\1\147\13\0\1\3\12\0\1\46\11\0\10\3\1\0"+
    "\2\3\1\150\1\0\10\3\2\0\1\3\12\0\1\46"+
    "\11\0\10\3\1\0\2\3\1\151\1\0\10\3\2\0"+
    "\1\3\12\0\1\46\11\0\5\3\1\152\2\3\1\0"+
    "\3\3\1\0\10\3\2\0\1\3\12\0\1\46\11\0"+
    "\1\3\1\153\6\3\1\0\3\3\1\0\10\3\2\0"+
    "\1\3\12\0\1\46\11\0\7\3\1\154\1\0\3\3"+
    "\1\0\10\3\2\0\1\3\12\0\1\46\11\0\3\3"+
    "\1\155\4\3\1\156\1\157\2\3\1\0\10\3\2\0"+
    "\2\116\11\0\1\46\11\0\10\116\1\0\3\116\1\0"+
    "\10\116\14\0\1\52\57\0\1\52\35\0\1\3\12\0"+
    "\1\46\11\0\2\3\1\160\5\3\1\0\3\3\1\0"+
    "\10\3\2\0\1\3\12\0\1\46\11\0\10\3\1\161"+
    "\1\162\2\3\1\0\10\3\2\0\1\3\12\0\1\46"+
    "\11\0\10\3\1\0\3\3\1\0\6\3\1\163\1\3"+
    "\32\0\1\164\4\0\2\165\15\0\1\3\12\0\1\46"+
    "\11\0\3\3\1\166\4\3\1\165\1\167\2\3\1\0"+
    "\10\3\36\0\1\170\17\0\1\3\12\0\1\46\11\0"+
    "\7\3\1\171\1\0\3\3\1\0\10\3\2\0\1\3"+
    "\12\0\1\46\11\0\2\3\1\172\5\3\1\0\3\3"+
    "\1\0\10\3\2\0\1\3\12\0\1\46\11\0\4\3"+
    "\1\173\3\3\1\0\3\3\1\0\10\3\2\0\1\3"+
    "\12\0\1\46\11\0\10\3\1\0\3\3\1\174\1\175"+
    "\7\3\2\0\1\3\12\0\1\46\11\0\10\3\1\0"+
    "\3\3\1\0\4\3\1\176\3\3\2\0\1\3\12\0"+
    "\1\46\11\0\3\3\1\177\4\3\1\0\3\3\1\0"+
    "\10\3\2\0\1\3\12\0\1\46\11\0\5\3\1\200"+
    "\2\3\1\0\3\3\1\0\10\3\32\0\1\201\23\0"+
    "\1\3\12\0\1\46\11\0\3\3\1\202\4\3\1\0"+
    "\3\3\1\0\10\3\2\0\1\3\12\0\1\46\11\0"+
    "\10\3\1\0\3\3\1\0\5\3\1\203\2\3\37\0"+
    "\2\204\15\0\1\3\12\0\1\46\11\0\10\3\1\204"+
    "\1\205\2\3\1\0\10\3\2\0\1\3\12\0\1\46"+
    "\11\0\10\3\1\0\3\3\1\206\1\207\7\3\2\0"+
    "\1\3\12\0\1\46\11\0\10\3\1\0\3\3\1\0"+
    "\4\3\1\210\3\3\2\0\1\3\12\0\1\46\11\0"+
    "\5\3\1\211\2\3\1\0\3\3\1\0\10\3\31\0"+
    "\1\212\24\0\1\3\12\0\1\46\11\0\2\3\1\213"+
    "\5\3\1\0\3\3\1\0\10\3\2\0\1\3\12\0"+
    "\1\46\11\0\3\3\1\214\4\3\1\0\3\3\1\0"+
    "\10\3\34\0\1\215\21\0\1\3\12\0\1\46\11\0"+
    "\5\3\1\216\2\3\1\0\3\3\1\0\10\3\35\0"+
    "\1\217\20\0\1\3\12\0\1\46\11\0\6\3\1\220"+
    "\1\3\1\0\3\3\1\0\10\3\2\0\1\3\12\0"+
    "\1\46\11\0\7\3\1\221\1\0\3\3\1\0\10\3"+
    "\32\0\1\222\23\0\1\3\12\0\1\46\11\0\3\3"+
    "\1\223\4\3\1\0\3\3\1\0\10\3\2\0\1\3"+
    "\12\0\1\46\11\0\7\3\1\224\1\0\3\3\1\0"+
    "\10\3\41\0\1\225\14\0\1\3\12\0\1\46\11\0"+
    "\10\3\1\0\1\3\1\226\1\3\1\0\10\3\2\0"+
    "\1\3\12\0\1\46\11\0\10\3\1\0\2\3\1\227"+
    "\1\0\10\3\34\0\1\230\21\0\1\3\12\0\1\46"+
    "\11\0\5\3\1\231\2\3\1\0\3\3\1\0\10\3"+
    "\36\0\1\232\17\0\1\3\12\0\1\46\11\0\7\3"+
    "\1\233\1\0\3\3\1\0\10\3\2\0\1\3\12\0"+
    "\1\46\11\0\3\3\1\234\4\3\1\0\3\3\1\0"+
    "\10\3\32\0\1\235\23\0\1\3\12\0\1\46\11\0"+
    "\3\3\1\236\4\3\1\0\3\3\1\0\10\3\2\0"+
    "\1\3\12\0\1\46\11\0\4\3\1\237\3\3\1\0"+
    "\3\3\1\0\10\3\2\0\1\3\12\0\1\46\11\0"+
    "\10\3\1\240\1\241\2\3\1\0\10\3\32\0\1\242"+
    "\23\0\1\3\12\0\1\46\11\0\3\3\1\243\4\3"+
    "\1\0\3\3\1\0\10\3\2\0\1\3\12\0\1\46"+
    "\11\0\5\3\1\244\2\3\1\0\3\3\1\0\10\3"+
    "\41\0\1\245\14\0\1\3\12\0\1\46\11\0\10\3"+
    "\1\0\1\3\1\246\1\3\1\0\10\3\33\0\1\247"+
    "\22\0\1\3\12\0\1\46\11\0\4\3\1\250\3\3"+
    "\1\0\3\3\1\0\10\3\2\0\1\3\12\0\1\46"+
    "\11\0\10\3\1\0\3\3\1\0\1\3\1\251\6\3"+
    "\2\0\1\3\12\0\1\46\11\0\5\3\1\252\2\3"+
    "\1\0\3\3\1\0\10\3\30\0\1\253\25\0\1\3"+
    "\12\0\1\46\11\0\1\3\1\254\6\3\1\0\3\3"+
    "\1\0\10\3\42\0\1\255\13\0\1\3\12\0\1\46"+
    "\11\0\10\3\1\0\2\3\1\256\1\0\10\3\34\0"+
    "\1\257\21\0\1\3\12\0\1\46\11\0\5\3\1\260"+
    "\2\3\1\0\3\3\1\0\10\3\2\0\1\3\12\0"+
    "\1\46\11\0\10\3\1\0\3\3\1\0\5\3\1\261"+
    "\2\3\34\0\1\262\21\0\1\3\12\0\1\46\11\0"+
    "\5\3\1\263\2\3\1\0\3\3\1\0\10\3\36\0"+
    "\1\264\17\0\1\3\12\0\1\46\11\0\7\3\1\265"+
    "\1\0\3\3\1\0\10\3\2\0\1\3\12\0\1\46"+
    "\11\0\10\3\1\0\2\3\1\266\1\0\10\3\2\0"+
    "\1\3\12\0\1\46\11\0\3\3\1\267\4\3\1\0"+
    "\3\3\1\0\10\3\1\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[5588];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\2\1\3\11\3\1\2\11\2\1\3\11"+
    "\23\1\1\11\2\0\2\11\1\1\3\0\1\11\21\1"+
    "\2\11\5\1\1\0\10\1\2\0\4\1\1\0\2\1"+
    "\1\0\11\1\1\0\3\1\1\0\6\1\1\0\2\1"+
    "\1\0\2\1\1\11\1\0\2\1\1\11\3\1\1\0"+
    "\4\1\1\0\2\1\1\0\1\1\1\0\3\1\1\0"+
    "\2\1\1\11\1\1\1\11\2\1\1\11\2\1\1\0"+
    "\2\1\1\0\1\1\1\0\2\1\1\11\2\1\1\0"+
    "\1\1\1\0\2\1\1\11\1\1\1\0\3\1\1\0"+
    "\1\1\1\11\1\1\1\0\2\1\1\11\1\1\1\11"+
    "\3\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[183];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true iff the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true iff the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
    public static ArrayList<String> ErroresLexicos = new ArrayList<String>();    


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 244) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
          { return new java_cup.runtime.Symbol(sym.EOF); }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { System.out.println("Error lexico : " + yytext() + " en la linea: " + (yyline+1) + " y columna " + (yycolumn+1));
        ErroresLexicos.add("Error lexico : " + yytext() + " en la linea: " + (yyline+1) + " y columna " + (yycolumn+1));
            } 
            // fall through
          case 48: break;
          case 2: 
            { return new Symbol(sym.ID, yycolumn, yyline, new String(yytext()));
            } 
            // fall through
          case 49: break;
          case 3: 
            { return new Symbol(sym.NUM, yycolumn, yyline, new String(yytext()));
            } 
            // fall through
          case 50: break;
          case 4: 
            { 
            } 
            // fall through
          case 51: break;
          case 5: 
            { return new Symbol(sym.COMA, yycolumn, yyline, yytext());
            } 
            // fall through
          case 52: break;
          case 6: 
            { return new Symbol(sym.SEMICOLON, yycolumn, yyline, yytext());
            } 
            // fall through
          case 53: break;
          case 7: 
            { return new Symbol(sym.DECLARACION, yycolumn, yyline, yytext());
            } 
            // fall through
          case 54: break;
          case 8: 
            { return new Symbol(sym.OPSUMA, yycolumn, yyline, yytext());
            } 
            // fall through
          case 55: break;
          case 9: 
            { return new Symbol(sym.OPMULTIPLICACION, yycolumn, yyline, yytext());
            } 
            // fall through
          case 56: break;
          case 10: 
            { return new Symbol(sym.OPREL, yycolumn, yyline, yytext());
            } 
            // fall through
          case 57: break;
          case 11: 
            { return new Symbol(sym.PARIZQ, yycolumn, yyline, yytext());
            } 
            // fall through
          case 58: break;
          case 12: 
            { return new Symbol(sym.PARDER, yycolumn, yyline, yytext());
            } 
            // fall through
          case 59: break;
          case 13: 
            { System.out.print(yytext());
            } 
            // fall through
          case 60: break;
          case 14: 
            { return new Symbol(sym.DOSPUNTOS, yycolumn, yyline, yytext());
            } 
            // fall through
          case 61: break;
          case 15: 
            { return new Symbol(sym.ASIGNACION, yycolumn, yyline, yytext());
            } 
            // fall through
          case 62: break;
          case 16: 
            { return new Symbol(sym.STRING, yycolumn, yyline, new String(yytext()));
            } 
            // fall through
          case 63: break;
          case 17: 
            { return new Symbol(sym.OR, yycolumn, yyline, yytext());
            } 
            // fall through
          case 64: break;
          case 18: 
            { return new Symbol(sym.IN, yycolumn, yyline, yytext());
            } 
            // fall through
          case 65: break;
          case 19: 
            { return new Symbol(sym.IF, yycolumn, yyline, yytext());
            } 
            // fall through
          case 66: break;
          case 20: 
            { return new Symbol(sym.IS, yycolumn, yyline, yytext());
            } 
            // fall through
          case 67: break;
          case 21: 
            { return new Symbol(sym.NUMFLOAT, yycolumn, yyline, new String(yytext()));
            } 
            // fall through
          case 68: break;
          case 22: 
            { return new Symbol(sym.OUT, yycolumn, yyline, yytext());
            } 
            // fall through
          case 69: break;
          case 23: 
            { return new Symbol(sym.END, yycolumn, yyline, yytext());
            } 
            // fall through
          case 70: break;
          case 24: 
            { return new Symbol(sym.AND, yycolumn, yyline, yytext());
            } 
            // fall through
          case 71: break;
          case 25: 
            { return new Symbol(sym.FOR, yycolumn, yyline, yytext());
            } 
            // fall through
          case 72: break;
          case 26: 
            { return new Symbol(sym.GET, yycolumn, yyline, yytext());
            } 
            // fall through
          case 73: break;
          case 27: 
            { return new Symbol(sym.XOR, yycolumn, yyline, yytext());
            } 
            // fall through
          case 74: break;
          case 28: 
            { return new Symbol(sym.PUT, yycolumn, yyline, yytext());
            } 
            // fall through
          case 75: break;
          case 29: 
            { return new Symbol(sym.LOOP, yycolumn, yyline, yytext());
            } 
            // fall through
          case 76: break;
          case 30: 
            { return new Symbol(sym.ELSE, yycolumn, yyline, yytext());
            } 
            // fall through
          case 77: break;
          case 31: 
            { return new Symbol(sym.EXIT, yycolumn, yyline, yytext());
            } 
            // fall through
          case 78: break;
          case 32: 
            { return new Symbol(sym.NULL, yycolumn, yyline, yytext());
            } 
            // fall through
          case 79: break;
          case 33: 
            { return new Symbol(sym.TRUE, yycolumn, yyline, yytext());
            } 
            // fall through
          case 80: break;
          case 34: 
            { return new Symbol(sym.THEN, yycolumn, yyline, yytext());
            } 
            // fall through
          case 81: break;
          case 35: 
            { return new Symbol(sym.WHEN, yycolumn, yyline, yytext());
            } 
            // fall through
          case 82: break;
          case 36: 
            { return new Symbol(sym.BEGIN, yycolumn, yyline, yytext());
            } 
            // fall through
          case 83: break;
          case 37: 
            { return new Symbol(sym.ELSIF, yycolumn, yyline, yytext());
            } 
            // fall through
          case 84: break;
          case 38: 
            { return new Symbol(sym.FLOAT, yycolumn, yyline, yytext());
            } 
            // fall through
          case 85: break;
          case 39: 
            { return new Symbol(sym.FALSE, yycolumn, yyline, yytext());
            } 
            // fall through
          case 86: break;
          case 40: 
            { return new Symbol(sym.WHILE, yycolumn, yyline, yytext());
            } 
            // fall through
          case 87: break;
          case 41: 
            { return new Symbol(sym.RETURN, yycolumn, yyline, yytext());
            } 
            // fall through
          case 88: break;
          case 42: 
            { return new Symbol(sym.STRINGTYPE, yycolumn, yyline, yytext());
            } 
            // fall through
          case 89: break;
          case 43: 
            { return new Symbol(sym.BOOLEAN, yycolumn, yyline, yytext());
            } 
            // fall through
          case 90: break;
          case 44: 
            { return new Symbol(sym.INTEGER, yycolumn, yyline, yytext());
            } 
            // fall through
          case 91: break;
          case 45: 
            { return new Symbol(sym.FUNCTION, yycolumn, yyline, yytext());
            } 
            // fall through
          case 92: break;
          case 46: 
            { return new Symbol(sym.CONSTANT, yycolumn, yyline, yytext());
            } 
            // fall through
          case 93: break;
          case 47: 
            { return new Symbol(sym.PROCEDURE, yycolumn, yyline, yytext());
            } 
            // fall through
          case 94: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }

  /**
   * Runs the scanner on input files.
   *
   * This is a standalone scanner, it will print any unmatched
   * text to System.out unchanged.
   *
   * @param argv   the command line, contains the filenames to run
   *               the scanner on.
   */
  public static void main(String argv[]) {
    if (argv.length == 0) {
      System.out.println("Usage : java Lexer [ --encoding <name> ] <inputfile(s)>");
    }
    else {
      int firstFilePos = 0;
      String encodingName = "UTF-8";
      if (argv[0].equals("--encoding")) {
        firstFilePos = 2;
        encodingName = argv[1];
        try {
          java.nio.charset.Charset.forName(encodingName); // Side-effect: is encodingName valid? 
        } catch (Exception e) {
          System.out.println("Invalid encoding '" + encodingName + "'");
          return;
        }
      }
      for (int i = firstFilePos; i < argv.length; i++) {
        Lexer scanner = null;
        try {
          java.io.FileInputStream stream = new java.io.FileInputStream(argv[i]);
          java.io.Reader reader = new java.io.InputStreamReader(stream, encodingName);
          scanner = new Lexer(reader);
          while ( !scanner.zzAtEOF ) scanner.next_token();
        }
        catch (java.io.FileNotFoundException e) {
          System.out.println("File not found : \""+argv[i]+"\"");
        }
        catch (java.io.IOException e) {
          System.out.println("IO error scanning file \""+argv[i]+"\"");
          System.out.println(e);
        }
        catch (Exception e) {
          System.out.println("Unexpected exception:");
          e.printStackTrace();
        }
      }
    }
  }


}
