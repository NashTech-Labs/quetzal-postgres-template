// $ANTLR 3.4 /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g 2016-08-23 17:16:23
 
package com.ibm.research.rdf.store.sparql11; 


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class IbmSparqlExtLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__268=268;
    public static final int T__269=269;
    public static final int T__270=270;
    public static final int T__271=271;
    public static final int T__272=272;
    public static final int T__273=273;
    public static final int T__274=274;
    public static final int T__275=275;
    public static final int T__276=276;
    public static final int T__277=277;
    public static final int T__278=278;
    public static final int T__279=279;
    public static final int T__280=280;
    public static final int T__281=281;
    public static final int T__282=282;
    public static final int A=4;
    public static final int ABS=5;
    public static final int ADD=6;
    public static final int ALL=7;
    public static final int ALT=8;
    public static final int ANNON=9;
    public static final int ARROW=10;
    public static final int AS=11;
    public static final int ASC=12;
    public static final int ASK=13;
    public static final int AVG=14;
    public static final int B=15;
    public static final int BASE=16;
    public static final int BIG_DECIMAL=17;
    public static final int BIG_INTEGER=18;
    public static final int BIND=19;
    public static final int BINDINGS=20;
    public static final int BIND_VALUES=21;
    public static final int BLANK_NODE_LABEL=22;
    public static final int BNODE=23;
    public static final int BOOLEAN=24;
    public static final int BOUND=25;
    public static final int BROKEN_MINUS=26;
    public static final int BROKEN_PLUS=27;
    public static final int BY=28;
    public static final int C=29;
    public static final int CEIL=30;
    public static final int CLEAR=31;
    public static final int CLOSE_BRACE=32;
    public static final int CLOSE_CURLY_BRACE=33;
    public static final int CLOSE_SQ_BRACKET=34;
    public static final int COALESCE=35;
    public static final int COLLECTION=36;
    public static final int COMMA=37;
    public static final int COMMENT=38;
    public static final int CONCAT=39;
    public static final int CONDITION=40;
    public static final int CONSTRUCT=41;
    public static final int CONTAINS=42;
    public static final int COPY=43;
    public static final int COUNT=44;
    public static final int CREATE=45;
    public static final int D=46;
    public static final int DATA=47;
    public static final int DATASET=48;
    public static final int DATATYPE=49;
    public static final int DAY=50;
    public static final int DECIMAL=51;
    public static final int DECIMAL_NEGATIVE=52;
    public static final int DECIMAL_POSITIVE=53;
    public static final int DEFAULT=54;
    public static final int DEFAULT_NAMESPACE=55;
    public static final int DELETE=56;
    public static final int DESC=57;
    public static final int DESCRIBE=58;
    public static final int DIGIT=59;
    public static final int DISTINCT=60;
    public static final int DOT=61;
    public static final int DOUBLE=62;
    public static final int DOUBLE_NEGATIVE=63;
    public static final int DOUBLE_POSITIVE=64;
    public static final int DROP=65;
    public static final int E=66;
    public static final int ECHAR=67;
    public static final int ELT=68;
    public static final int ENCODE_FOR_URI=69;
    public static final int EOL=70;
    public static final int EOP=71;
    public static final int EXISTS=72;
    public static final int EXP=73;
    public static final int EXPONENT=74;
    public static final int EXPRESSION=75;
    public static final int F=76;
    public static final int FALSE=77;
    public static final int FILTER=78;
    public static final int FLOOR=79;
    public static final int FROM=80;
    public static final int FUNCBODY=81;
    public static final int FUNCCALL=82;
    public static final int FUNCLANG=83;
    public static final int FUNCLG=84;
    public static final int FUNCNAME=85;
    public static final int FUNCTION=86;
    public static final int G=87;
    public static final int GET=88;
    public static final int GRAPH=89;
    public static final int GRAPH_GRAPH_PATTERN=90;
    public static final int GRAPH_NODE=91;
    public static final int GROUP=92;
    public static final int GROUP_BY=93;
    public static final int GROUP_CONCAT=94;
    public static final int GROUP_GRAPH_PATTERN=95;
    public static final int GROUP_GRAPH_PATTERN_SUB=96;
    public static final int H=97;
    public static final int HAVING=98;
    public static final int HEXDIGIT=99;
    public static final int HOURS=100;
    public static final int I=101;
    public static final int IF=102;
    public static final int IN=103;
    public static final int INLINE_DATA=104;
    public static final int INSERT=105;
    public static final int INTEGER=106;
    public static final int INTEGER_NEGATIVE=107;
    public static final int INTEGER_POSITIVE=108;
    public static final int INTO=109;
    public static final int INV=110;
    public static final int IRI=111;
    public static final int IRI_OR_FUNCTION=112;
    public static final int IRI_REF=113;
    public static final int ISBLANK=114;
    public static final int ISIRI=115;
    public static final int ISLITERAL=116;
    public static final int ISNUMERIC=117;
    public static final int ISURI=118;
    public static final int J=119;
    public static final int K=120;
    public static final int KEY=121;
    public static final int KIND=122;
    public static final int L=123;
    public static final int LANG=124;
    public static final int LANGMATCHES=125;
    public static final int LANGTAG=126;
    public static final int LCASE=127;
    public static final int LIMIT=128;
    public static final int LOAD=129;
    public static final int LOGICAL_AND=130;
    public static final int LOGICAL_OR=131;
    public static final int LT=132;
    public static final int LTE=133;
    public static final int M=134;
    public static final int MAX=135;
    public static final int MD5=136;
    public static final int MIN=137;
    public static final int MINUS=138;
    public static final int MINUTES=139;
    public static final int MODIFIERS=140;
    public static final int MONTH=141;
    public static final int MOVE=142;
    public static final int N=143;
    public static final int NAMED=144;
    public static final int NAMESPACE_PREFIX_MAP=145;
    public static final int NIL=146;
    public static final int NON_TRIPLES=147;
    public static final int NOT=148;
    public static final int NOT_EXISTS=149;
    public static final int NOT_IN=150;
    public static final int NOW=151;
    public static final int NUMERIC=152;
    public static final int O=153;
    public static final int OFFSET=154;
    public static final int OPEN_BRACE=155;
    public static final int OPEN_CURLY_BRACE=156;
    public static final int OPEN_SQ_BRACKET=157;
    public static final int OPTIONAL=158;
    public static final int ORDER=159;
    public static final int ORDER_BY=160;
    public static final int OUTV=161;
    public static final int P=162;
    public static final int PARAM=163;
    public static final int PARAMS=164;
    public static final int PATH=165;
    public static final int PERCENT=166;
    public static final int PLX=167;
    public static final int PNAME_LN=168;
    public static final int PNAME_NS=169;
    public static final int PN_CHARS=170;
    public static final int PN_CHARS_BASE=171;
    public static final int PN_CHARS_U=172;
    public static final int PN_LOCAL=173;
    public static final int PN_LOCAL_ESC=174;
    public static final int PN_PREFIX=175;
    public static final int POST=176;
    public static final int PREDICATE=177;
    public static final int PREDICATE_VALUE=178;
    public static final int PREFIX=179;
    public static final int PREFIXED_NAME=180;
    public static final int PREFIXED_NS=181;
    public static final int PROLOGUE=182;
    public static final int PROPERTY_LIST=183;
    public static final int PVARS=184;
    public static final int Q=185;
    public static final int QUERY=186;
    public static final int R=187;
    public static final int RAND=188;
    public static final int REDUCED=189;
    public static final int REGEX=190;
    public static final int REPLACE=191;
    public static final int ROOT=192;
    public static final int ROUND=193;
    public static final int S=194;
    public static final int SAMETERM=195;
    public static final int SAMPLE=196;
    public static final int SECONDS=197;
    public static final int SELECT=198;
    public static final int SEMICOLON=199;
    public static final int SEPARATOR=200;
    public static final int SEQ=201;
    public static final int SERVICE=202;
    public static final int SHA1=203;
    public static final int SHA224=204;
    public static final int SHA256=205;
    public static final int SHA384=206;
    public static final int SHA512=207;
    public static final int SILENT=208;
    public static final int SOP=209;
    public static final int STR=210;
    public static final int STRAFTER=211;
    public static final int STRBEFORE=212;
    public static final int STRDT=213;
    public static final int STRENDS=214;
    public static final int STRING=215;
    public static final int STRING_LINE_NONEOP=216;
    public static final int STRING_LITERAL1=217;
    public static final int STRING_LITERAL2=218;
    public static final int STRING_LITERAL_LONG1=219;
    public static final int STRING_LITERAL_LONG2=220;
    public static final int STRLANG=221;
    public static final int STRLEN=222;
    public static final int STRSTARTS=223;
    public static final int STRUUID=224;
    public static final int SUBJECT=225;
    public static final int SUBSTR=226;
    public static final int SUB_SELECT=227;
    public static final int SUM=228;
    public static final int T=229;
    public static final int TABLE=230;
    public static final int TIMEZONE=231;
    public static final int TO=232;
    public static final int TRIPLE=233;
    public static final int TRIPLE2=234;
    public static final int TRIPLES_BLOCK=235;
    public static final int TRIPLES_NODE=236;
    public static final int TRIPLES_NODE_PROPERTY_LIST=237;
    public static final int TRIPLES_SAME_SUBJECT=238;
    public static final int TRUE=239;
    public static final int TYPE=240;
    public static final int TZ=241;
    public static final int U=242;
    public static final int UCASE=243;
    public static final int UNDEF=244;
    public static final int UNICODE_ESCAPE=245;
    public static final int UNION=246;
    public static final int UPDATE=247;
    public static final int URI=248;
    public static final int USING=249;
    public static final int UUID=250;
    public static final int V=251;
    public static final int VALUE=252;
    public static final int VALUES=253;
    public static final int VAR=254;
    public static final int VAR0=255;
    public static final int VAR1=256;
    public static final int VAR2=257;
    public static final int VARNAME=258;
    public static final int W=259;
    public static final int WHERE=260;
    public static final int WHERE_TOKEN=261;
    public static final int WITH=262;
    public static final int WS=263;
    public static final int X=264;
    public static final int Y=265;
    public static final int YEAR=266;
    public static final int Z=267;

    	private static boolean stripStringQuotes = false;
    	static { 
    		String prop = System.getProperty("stripQuotesForPlainLiteral");
    		if ((prop != null) && (prop.equalsIgnoreCase("true"))) {
    			stripStringQuotes = true;
    		}
    	}


    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public IbmSparqlExtLexer() {} 
    public IbmSparqlExtLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public IbmSparqlExtLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "/home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g"; }

    // $ANTLR start "T__268"
    public final void mT__268() throws RecognitionException {
        try {
            int _type = T__268;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:20:8: ( '!' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:20:10: '!'
            {
            match('!'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__268"

    // $ANTLR start "T__269"
    public final void mT__269() throws RecognitionException {
        try {
            int _type = T__269;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:21:8: ( '!=' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:21:10: '!='
            {
            match("!="); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__269"

    // $ANTLR start "T__270"
    public final void mT__270() throws RecognitionException {
        try {
            int _type = T__270;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:22:8: ( '*' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:22:10: '*'
            {
            match('*'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__270"

    // $ANTLR start "T__271"
    public final void mT__271() throws RecognitionException {
        try {
            int _type = T__271;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:23:8: ( '+' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:23:10: '+'
            {
            match('+'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__271"

    // $ANTLR start "T__272"
    public final void mT__272() throws RecognitionException {
        try {
            int _type = T__272;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:24:8: ( '-' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:24:10: '-'
            {
            match('-'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__272"

    // $ANTLR start "T__273"
    public final void mT__273() throws RecognitionException {
        try {
            int _type = T__273;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:25:8: ( '/' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:25:10: '/'
            {
            match('/'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__273"

    // $ANTLR start "T__274"
    public final void mT__274() throws RecognitionException {
        try {
            int _type = T__274;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:26:8: ( '::' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:26:10: '::'
            {
            match("::"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__274"

    // $ANTLR start "T__275"
    public final void mT__275() throws RecognitionException {
        try {
            int _type = T__275;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:27:8: ( '=' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:27:10: '='
            {
            match('='); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__275"

    // $ANTLR start "T__276"
    public final void mT__276() throws RecognitionException {
        try {
            int _type = T__276;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:28:8: ( '>' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:28:10: '>'
            {
            match('>'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__276"

    // $ANTLR start "T__277"
    public final void mT__277() throws RecognitionException {
        try {
            int _type = T__277;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:29:8: ( '>=' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:29:10: '>='
            {
            match(">="); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__277"

    // $ANTLR start "T__278"
    public final void mT__278() throws RecognitionException {
        try {
            int _type = T__278;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:30:8: ( '?' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:30:10: '?'
            {
            match('?'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__278"

    // $ANTLR start "T__279"
    public final void mT__279() throws RecognitionException {
        try {
            int _type = T__279;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:31:8: ( '^' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:31:10: '^'
            {
            match('^'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__279"

    // $ANTLR start "T__280"
    public final void mT__280() throws RecognitionException {
        try {
            int _type = T__280;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:32:8: ( '^^' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:32:10: '^^'
            {
            match("^^"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__280"

    // $ANTLR start "T__281"
    public final void mT__281() throws RecognitionException {
        try {
            int _type = T__281;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:33:8: ( 'a' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:33:10: 'a'
            {
            match('a'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__281"

    // $ANTLR start "T__282"
    public final void mT__282() throws RecognitionException {
        try {
            int _type = T__282;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:34:8: ( '|' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:34:10: '|'
            {
            match('|'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__282"

    // $ANTLR start "ARROW"
    public final void mARROW() throws RecognitionException {
        try {
            int _type = ARROW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1016:8: ( '-' '>' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1016:11: '-' '>'
            {
            match('-'); if (state.failed) return ;

            match('>'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ARROW"

    // $ANTLR start "FUNCLANG"
    public final void mFUNCLANG() throws RecognitionException {
        try {
            int _type = FUNCLANG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1017:10: ( L A N G U A G E )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1017:13: L A N G U A G E
            {
            mL(); if (state.failed) return ;


            mA(); if (state.failed) return ;


            mN(); if (state.failed) return ;


            mG(); if (state.failed) return ;


            mU(); if (state.failed) return ;


            mA(); if (state.failed) return ;


            mG(); if (state.failed) return ;


            mE(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FUNCLANG"

    // $ANTLR start "FUNCCALL"
    public final void mFUNCCALL() throws RecognitionException {
        try {
            int _type = FUNCCALL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1018:10: ( F U N C C A L L )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1018:13: F U N C C A L L
            {
            mF(); if (state.failed) return ;


            mU(); if (state.failed) return ;


            mN(); if (state.failed) return ;


            mC(); if (state.failed) return ;


            mC(); if (state.failed) return ;


            mA(); if (state.failed) return ;


            mL(); if (state.failed) return ;


            mL(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FUNCCALL"

    // $ANTLR start "FUNCTION"
    public final void mFUNCTION() throws RecognitionException {
        try {
            int _type = FUNCTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1019:10: ( F U N C T I O N )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1019:13: F U N C T I O N
            {
            mF(); if (state.failed) return ;


            mU(); if (state.failed) return ;


            mN(); if (state.failed) return ;


            mC(); if (state.failed) return ;


            mT(); if (state.failed) return ;


            mI(); if (state.failed) return ;


            mO(); if (state.failed) return ;


            mN(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FUNCTION"

    // $ANTLR start "BASE"
    public final void mBASE() throws RecognitionException {
        try {
            int _type = BASE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1023:6: ( B A S E )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1023:9: B A S E
            {
            mB(); if (state.failed) return ;


            mA(); if (state.failed) return ;


            mS(); if (state.failed) return ;


            mE(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BASE"

    // $ANTLR start "PREFIX"
    public final void mPREFIX() throws RecognitionException {
        try {
            int _type = PREFIX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1025:8: ( P R E F I X )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1025:11: P R E F I X
            {
            mP(); if (state.failed) return ;


            mR(); if (state.failed) return ;


            mE(); if (state.failed) return ;


            mF(); if (state.failed) return ;


            mI(); if (state.failed) return ;


            mX(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PREFIX"

    // $ANTLR start "SELECT"
    public final void mSELECT() throws RecognitionException {
        try {
            int _type = SELECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1027:8: ( S E L E C T )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1027:11: S E L E C T
            {
            mS(); if (state.failed) return ;


            mE(); if (state.failed) return ;


            mL(); if (state.failed) return ;


            mE(); if (state.failed) return ;


            mC(); if (state.failed) return ;


            mT(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SELECT"

    // $ANTLR start "DISTINCT"
    public final void mDISTINCT() throws RecognitionException {
        try {
            int _type = DISTINCT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1029:10: ( D I S T I N C T )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1029:13: D I S T I N C T
            {
            mD(); if (state.failed) return ;


            mI(); if (state.failed) return ;


            mS(); if (state.failed) return ;


            mT(); if (state.failed) return ;


            mI(); if (state.failed) return ;


            mN(); if (state.failed) return ;


            mC(); if (state.failed) return ;


            mT(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DISTINCT"

    // $ANTLR start "REDUCED"
    public final void mREDUCED() throws RecognitionException {
        try {
            int _type = REDUCED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1031:9: ( R E D U C E D )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1031:12: R E D U C E D
            {
            mR(); if (state.failed) return ;


            mE(); if (state.failed) return ;


            mD(); if (state.failed) return ;


            mU(); if (state.failed) return ;


            mC(); if (state.failed) return ;


            mE(); if (state.failed) return ;


            mD(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "REDUCED"

    // $ANTLR start "AS"
    public final void mAS() throws RecognitionException {
        try {
            int _type = AS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1033:4: ( A S )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1033:7: A S
            {
            mA(); if (state.failed) return ;


            mS(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AS"

    // $ANTLR start "CONSTRUCT"
    public final void mCONSTRUCT() throws RecognitionException {
        try {
            int _type = CONSTRUCT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1035:11: ( C O N S T R U C T )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1035:14: C O N S T R U C T
            {
            mC(); if (state.failed) return ;


            mO(); if (state.failed) return ;


            mN(); if (state.failed) return ;


            mS(); if (state.failed) return ;


            mT(); if (state.failed) return ;


            mR(); if (state.failed) return ;


            mU(); if (state.failed) return ;


            mC(); if (state.failed) return ;


            mT(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CONSTRUCT"

    // $ANTLR start "WHERE_TOKEN"
    public final void mWHERE_TOKEN() throws RecognitionException {
        try {
            int _type = WHERE_TOKEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1037:13: ( W H E R E )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1037:16: W H E R E
            {
            mW(); if (state.failed) return ;


            mH(); if (state.failed) return ;


            mE(); if (state.failed) return ;


            mR(); if (state.failed) return ;


            mE(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHERE_TOKEN"

    // $ANTLR start "DESCRIBE"
    public final void mDESCRIBE() throws RecognitionException {
        try {
            int _type = DESCRIBE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1039:10: ( D E S C R I B E )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1039:13: D E S C R I B E
            {
            mD(); if (state.failed) return ;


            mE(); if (state.failed) return ;


            mS(); if (state.failed) return ;


            mC(); if (state.failed) return ;


            mR(); if (state.failed) return ;


            mI(); if (state.failed) return ;


            mB(); if (state.failed) return ;


            mE(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DESCRIBE"

    // $ANTLR start "ASK"
    public final void mASK() throws RecognitionException {
        try {
            int _type = ASK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1041:5: ( A S K )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1041:8: A S K
            {
            mA(); if (state.failed) return ;


            mS(); if (state.failed) return ;


            mK(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ASK"

    // $ANTLR start "FROM"
    public final void mFROM() throws RecognitionException {
        try {
            int _type = FROM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1043:6: ( F R O M )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1043:9: F R O M
            {
            mF(); if (state.failed) return ;


            mR(); if (state.failed) return ;


            mO(); if (state.failed) return ;


            mM(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FROM"

    // $ANTLR start "NAMED"
    public final void mNAMED() throws RecognitionException {
        try {
            int _type = NAMED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1045:7: ( N A M E D )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1045:10: N A M E D
            {
            mN(); if (state.failed) return ;


            mA(); if (state.failed) return ;


            mM(); if (state.failed) return ;


            mE(); if (state.failed) return ;


            mD(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NAMED"

    // $ANTLR start "GROUP"
    public final void mGROUP() throws RecognitionException {
        try {
            int _type = GROUP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1047:7: ( G R O U P )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1047:10: G R O U P
            {
            mG(); if (state.failed) return ;


            mR(); if (state.failed) return ;


            mO(); if (state.failed) return ;


            mU(); if (state.failed) return ;


            mP(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GROUP"

    // $ANTLR start "BY"
    public final void mBY() throws RecognitionException {
        try {
            int _type = BY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1049:4: ( B Y )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1049:7: B Y
            {
            mB(); if (state.failed) return ;


            mY(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BY"

    // $ANTLR start "HAVING"
    public final void mHAVING() throws RecognitionException {
        try {
            int _type = HAVING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1051:8: ( H A V I N G )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1051:11: H A V I N G
            {
            mH(); if (state.failed) return ;


            mA(); if (state.failed) return ;


            mV(); if (state.failed) return ;


            mI(); if (state.failed) return ;


            mN(); if (state.failed) return ;


            mG(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HAVING"

    // $ANTLR start "ORDER"
    public final void mORDER() throws RecognitionException {
        try {
            int _type = ORDER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1053:7: ( O R D E R )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1053:10: O R D E R
            {
            mO(); if (state.failed) return ;


            mR(); if (state.failed) return ;


            mD(); if (state.failed) return ;


            mE(); if (state.failed) return ;


            mR(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ORDER"

    // $ANTLR start "ASC"
    public final void mASC() throws RecognitionException {
        try {
            int _type = ASC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1055:5: ( A S C )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1055:8: A S C
            {
            mA(); if (state.failed) return ;


            mS(); if (state.failed) return ;


            mC(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ASC"

    // $ANTLR start "DESC"
    public final void mDESC() throws RecognitionException {
        try {
            int _type = DESC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1057:6: ( D E S C )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1057:9: D E S C
            {
            mD(); if (state.failed) return ;


            mE(); if (state.failed) return ;


            mS(); if (state.failed) return ;


            mC(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DESC"

    // $ANTLR start "LIMIT"
    public final void mLIMIT() throws RecognitionException {
        try {
            int _type = LIMIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1059:7: ( L I M I T )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1059:10: L I M I T
            {
            mL(); if (state.failed) return ;


            mI(); if (state.failed) return ;


            mM(); if (state.failed) return ;


            mI(); if (state.failed) return ;


            mT(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LIMIT"

    // $ANTLR start "OFFSET"
    public final void mOFFSET() throws RecognitionException {
        try {
            int _type = OFFSET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1061:8: ( O F F S E T )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1061:11: O F F S E T
            {
            mO(); if (state.failed) return ;


            mF(); if (state.failed) return ;


            mF(); if (state.failed) return ;


            mS(); if (state.failed) return ;


            mE(); if (state.failed) return ;


            mT(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OFFSET"

    // $ANTLR start "BINDINGS"
    public final void mBINDINGS() throws RecognitionException {
        try {
            int _type = BINDINGS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1063:10: ( B I N D I N G S )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1063:13: B I N D I N G S
            {
            mB(); if (state.failed) return ;


            mI(); if (state.failed) return ;


            mN(); if (state.failed) return ;


            mD(); if (state.failed) return ;


            mI(); if (state.failed) return ;


            mN(); if (state.failed) return ;


            mG(); if (state.failed) return ;


            mS(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BINDINGS"

    // $ANTLR start "UNDEF"
    public final void mUNDEF() throws RecognitionException {
        try {
            int _type = UNDEF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1065:7: ( U N D E F )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1065:10: U N D E F
            {
            mU(); if (state.failed) return ;


            mN(); if (state.failed) return ;


            mD(); if (state.failed) return ;


            mE(); if (state.failed) return ;


            mF(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UNDEF"

    // $ANTLR start "LOAD"
    public final void mLOAD() throws RecognitionException {
        try {
            int _type = LOAD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1067:6: ( L O A D )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1067:9: L O A D
            {
            mL(); if (state.failed) return ;


            mO(); if (state.failed) return ;


            mA(); if (state.failed) return ;


            mD(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LOAD"

    // $ANTLR start "SILENT"
    public final void mSILENT() throws RecognitionException {
        try {
            int _type = SILENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1069:8: ( S I L E N T )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1069:11: S I L E N T
            {
            mS(); if (state.failed) return ;


            mI(); if (state.failed) return ;


            mL(); if (state.failed) return ;


            mE(); if (state.failed) return ;


            mN(); if (state.failed) return ;


            mT(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SILENT"

    // $ANTLR start "INTO"
    public final void mINTO() throws RecognitionException {
        try {
            int _type = INTO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1071:6: ( I N T O )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1071:9: I N T O
            {
            mI(); if (state.failed) return ;


            mN(); if (state.failed) return ;


            mT(); if (state.failed) return ;


            mO(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INTO"

    // $ANTLR start "CLEAR"
    public final void mCLEAR() throws RecognitionException {
        try {
            int _type = CLEAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1073:7: ( C L E A R )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1073:10: C L E A R
            {
            mC(); if (state.failed) return ;


            mL(); if (state.failed) return ;


            mE(); if (state.failed) return ;


            mA(); if (state.failed) return ;


            mR(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CLEAR"

    // $ANTLR start "DROP"
    public final void mDROP() throws RecognitionException {
        try {
            int _type = DROP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1075:6: ( D R O P )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1075:9: D R O P
            {
            mD(); if (state.failed) return ;


            mR(); if (state.failed) return ;


            mO(); if (state.failed) return ;


            mP(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DROP"

    // $ANTLR start "CREATE"
    public final void mCREATE() throws RecognitionException {
        try {
            int _type = CREATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1077:8: ( C R E A T E )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1077:11: C R E A T E
            {
            mC(); if (state.failed) return ;


            mR(); if (state.failed) return ;


            mE(); if (state.failed) return ;


            mA(); if (state.failed) return ;


            mT(); if (state.failed) return ;


            mE(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CREATE"

    // $ANTLR start "TO"
    public final void mTO() throws RecognitionException {
        try {
            int _type = TO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1079:4: ( T O )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1079:7: T O
            {
            mT(); if (state.failed) return ;


            mO(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TO"

    // $ANTLR start "MOVE"
    public final void mMOVE() throws RecognitionException {
        try {
            int _type = MOVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1081:6: ( M O V E )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1081:9: M O V E
            {
            mM(); if (state.failed) return ;


            mO(); if (state.failed) return ;


            mV(); if (state.failed) return ;


            mE(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MOVE"

    // $ANTLR start "COPY"
    public final void mCOPY() throws RecognitionException {
        try {
            int _type = COPY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1083:6: ( C O P Y )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1083:9: C O P Y
            {
            mC(); if (state.failed) return ;


            mO(); if (state.failed) return ;


            mP(); if (state.failed) return ;


            mY(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COPY"

    // $ANTLR start "INSERT"
    public final void mINSERT() throws RecognitionException {
        try {
            int _type = INSERT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1085:8: ( I N S E R T )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1085:11: I N S E R T
            {
            mI(); if (state.failed) return ;


            mN(); if (state.failed) return ;


            mS(); if (state.failed) return ;


            mE(); if (state.failed) return ;


            mR(); if (state.failed) return ;


            mT(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INSERT"

    // $ANTLR start "DATA"
    public final void mDATA() throws RecognitionException {
        try {
            int _type = DATA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1087:6: ( D A T A )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1087:9: D A T A
            {
            mD(); if (state.failed) return ;


            mA(); if (state.failed) return ;


            mT(); if (state.failed) return ;


            mA(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DATA"

    // $ANTLR start "DELETE"
    public final void mDELETE() throws RecognitionException {
        try {
            int _type = DELETE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1089:8: ( D E L E T E )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1089:11: D E L E T E
            {
            mD(); if (state.failed) return ;


            mE(); if (state.failed) return ;


            mL(); if (state.failed) return ;


            mE(); if (state.failed) return ;


            mT(); if (state.failed) return ;


            mE(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DELETE"

    // $ANTLR start "WITH"
    public final void mWITH() throws RecognitionException {
        try {
            int _type = WITH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1091:6: ( W I T H )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1091:9: W I T H
            {
            mW(); if (state.failed) return ;


            mI(); if (state.failed) return ;


            mT(); if (state.failed) return ;


            mH(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WITH"

    // $ANTLR start "USING"
    public final void mUSING() throws RecognitionException {
        try {
            int _type = USING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1093:7: ( U S I N G )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1093:10: U S I N G
            {
            mU(); if (state.failed) return ;


            mS(); if (state.failed) return ;


            mI(); if (state.failed) return ;


            mN(); if (state.failed) return ;


            mG(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "USING"

    // $ANTLR start "DEFAULT"
    public final void mDEFAULT() throws RecognitionException {
        try {
            int _type = DEFAULT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1095:9: ( D E F A U L T )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1095:12: D E F A U L T
            {
            mD(); if (state.failed) return ;


            mE(); if (state.failed) return ;


            mF(); if (state.failed) return ;


            mA(); if (state.failed) return ;


            mU(); if (state.failed) return ;


            mL(); if (state.failed) return ;


            mT(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DEFAULT"

    // $ANTLR start "GRAPH"
    public final void mGRAPH() throws RecognitionException {
        try {
            int _type = GRAPH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1097:7: ( G R A P H )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1097:10: G R A P H
            {
            mG(); if (state.failed) return ;


            mR(); if (state.failed) return ;


            mA(); if (state.failed) return ;


            mP(); if (state.failed) return ;


            mH(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GRAPH"

    // $ANTLR start "ALL"
    public final void mALL() throws RecognitionException {
        try {
            int _type = ALL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1099:5: ( A L L )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1099:8: A L L
            {
            mA(); if (state.failed) return ;


            mL(); if (state.failed) return ;


            mL(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ALL"

    // $ANTLR start "OPTIONAL"
    public final void mOPTIONAL() throws RecognitionException {
        try {
            int _type = OPTIONAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1101:10: ( O P T I O N A L )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1101:13: O P T I O N A L
            {
            mO(); if (state.failed) return ;


            mP(); if (state.failed) return ;


            mT(); if (state.failed) return ;


            mI(); if (state.failed) return ;


            mO(); if (state.failed) return ;


            mN(); if (state.failed) return ;


            mA(); if (state.failed) return ;


            mL(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OPTIONAL"

    // $ANTLR start "SERVICE"
    public final void mSERVICE() throws RecognitionException {
        try {
            int _type = SERVICE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1103:9: ( S E R V I C E )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1103:12: S E R V I C E
            {
            mS(); if (state.failed) return ;


            mE(); if (state.failed) return ;


            mR(); if (state.failed) return ;


            mV(); if (state.failed) return ;


            mI(); if (state.failed) return ;


            mC(); if (state.failed) return ;


            mE(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SERVICE"

    // $ANTLR start "BIND"
    public final void mBIND() throws RecognitionException {
        try {
            int _type = BIND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1105:6: ( B I N D )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1105:9: B I N D
            {
            mB(); if (state.failed) return ;


            mI(); if (state.failed) return ;


            mN(); if (state.failed) return ;


            mD(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BIND"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1107:7: ( M I N U S )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1107:10: M I N U S
            {
            mM(); if (state.failed) return ;


            mI(); if (state.failed) return ;


            mN(); if (state.failed) return ;


            mU(); if (state.failed) return ;


            mS(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "UNION"
    public final void mUNION() throws RecognitionException {
        try {
            int _type = UNION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1109:7: ( U N I O N )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1109:10: U N I O N
            {
            mU(); if (state.failed) return ;


            mN(); if (state.failed) return ;


            mI(); if (state.failed) return ;


            mO(); if (state.failed) return ;


            mN(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UNION"

    // $ANTLR start "FILTER"
    public final void mFILTER() throws RecognitionException {
        try {
            int _type = FILTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1111:8: ( F I L T E R )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1111:11: F I L T E R
            {
            mF(); if (state.failed) return ;


            mI(); if (state.failed) return ;


            mL(); if (state.failed) return ;


            mT(); if (state.failed) return ;


            mE(); if (state.failed) return ;


            mR(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FILTER"

    // $ANTLR start "STR"
    public final void mSTR() throws RecognitionException {
        try {
            int _type = STR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1113:5: ( S T R )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1113:8: S T R
            {
            mS(); if (state.failed) return ;


            mT(); if (state.failed) return ;


            mR(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STR"

    // $ANTLR start "LANG"
    public final void mLANG() throws RecognitionException {
        try {
            int _type = LANG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1115:6: ( L A N G )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1115:9: L A N G
            {
            mL(); if (state.failed) return ;


            mA(); if (state.failed) return ;


            mN(); if (state.failed) return ;


            mG(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LANG"

    // $ANTLR start "LANGMATCHES"
    public final void mLANGMATCHES() throws RecognitionException {
        try {
            int _type = LANGMATCHES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1117:13: ( L A N G M A T C H E S )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1117:16: L A N G M A T C H E S
            {
            mL(); if (state.failed) return ;


            mA(); if (state.failed) return ;


            mN(); if (state.failed) return ;


            mG(); if (state.failed) return ;


            mM(); if (state.failed) return ;


            mA(); if (state.failed) return ;


            mT(); if (state.failed) return ;


            mC(); if (state.failed) return ;


            mH(); if (state.failed) return ;


            mE(); if (state.failed) return ;


            mS(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LANGMATCHES"

    // $ANTLR start "DATATYPE"
    public final void mDATATYPE() throws RecognitionException {
        try {
            int _type = DATATYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1119:10: ( D A T A T Y P E )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1119:13: D A T A T Y P E
            {
            mD(); if (state.failed) return ;


            mA(); if (state.failed) return ;


            mT(); if (state.failed) return ;


            mA(); if (state.failed) return ;


            mT(); if (state.failed) return ;


            mY(); if (state.failed) return ;


            mP(); if (state.failed) return ;


            mE(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DATATYPE"

    // $ANTLR start "BOUND"
    public final void mBOUND() throws RecognitionException {
        try {
            int _type = BOUND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1121:7: ( B O U N D )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1121:10: B O U N D
            {
            mB(); if (state.failed) return ;


            mO(); if (state.failed) return ;


            mU(); if (state.failed) return ;


            mN(); if (state.failed) return ;


            mD(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BOUND"

    // $ANTLR start "IRI"
    public final void mIRI() throws RecognitionException {
        try {
            int _type = IRI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1123:5: ( I R I )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1123:8: I R I
            {
            mI(); if (state.failed) return ;


            mR(); if (state.failed) return ;


            mI(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IRI"

    // $ANTLR start "URI"
    public final void mURI() throws RecognitionException {
        try {
            int _type = URI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1125:5: ( U R I )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1125:8: U R I
            {
            mU(); if (state.failed) return ;


            mR(); if (state.failed) return ;


            mI(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "URI"

    // $ANTLR start "BNODE"
    public final void mBNODE() throws RecognitionException {
        try {
            int _type = BNODE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1127:7: ( B N O D E )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1127:10: B N O D E
            {
            mB(); if (state.failed) return ;


            mN(); if (state.failed) return ;


            mO(); if (state.failed) return ;


            mD(); if (state.failed) return ;


            mE(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BNODE"

    // $ANTLR start "RAND"
    public final void mRAND() throws RecognitionException {
        try {
            int _type = RAND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1129:6: ( R A N D )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1129:9: R A N D
            {
            mR(); if (state.failed) return ;


            mA(); if (state.failed) return ;


            mN(); if (state.failed) return ;


            mD(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RAND"

    // $ANTLR start "ABS"
    public final void mABS() throws RecognitionException {
        try {
            int _type = ABS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1131:5: ( A B S )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1131:8: A B S
            {
            mA(); if (state.failed) return ;


            mB(); if (state.failed) return ;


            mS(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ABS"

    // $ANTLR start "CEIL"
    public final void mCEIL() throws RecognitionException {
        try {
            int _type = CEIL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1133:6: ( C E I L )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1133:9: C E I L
            {
            mC(); if (state.failed) return ;


            mE(); if (state.failed) return ;


            mI(); if (state.failed) return ;


            mL(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CEIL"

    // $ANTLR start "FLOOR"
    public final void mFLOOR() throws RecognitionException {
        try {
            int _type = FLOOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1135:7: ( F L O O R )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1135:10: F L O O R
            {
            mF(); if (state.failed) return ;


            mL(); if (state.failed) return ;


            mO(); if (state.failed) return ;


            mO(); if (state.failed) return ;


            mR(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FLOOR"

    // $ANTLR start "ROUND"
    public final void mROUND() throws RecognitionException {
        try {
            int _type = ROUND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1137:7: ( R O U N D )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1137:10: R O U N D
            {
            mR(); if (state.failed) return ;


            mO(); if (state.failed) return ;


            mU(); if (state.failed) return ;


            mN(); if (state.failed) return ;


            mD(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ROUND"

    // $ANTLR start "CONCAT"
    public final void mCONCAT() throws RecognitionException {
        try {
            int _type = CONCAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1139:8: ( C O N C A T )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1139:11: C O N C A T
            {
            mC(); if (state.failed) return ;


            mO(); if (state.failed) return ;


            mN(); if (state.failed) return ;


            mC(); if (state.failed) return ;


            mA(); if (state.failed) return ;


            mT(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CONCAT"

    // $ANTLR start "STRLEN"
    public final void mSTRLEN() throws RecognitionException {
        try {
            int _type = STRLEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1141:8: ( S T R L E N )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1141:11: S T R L E N
            {
            mS(); if (state.failed) return ;


            mT(); if (state.failed) return ;


            mR(); if (state.failed) return ;


            mL(); if (state.failed) return ;


            mE(); if (state.failed) return ;


            mN(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRLEN"

    // $ANTLR start "UCASE"
    public final void mUCASE() throws RecognitionException {
        try {
            int _type = UCASE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1143:7: ( U C A S E )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1143:10: U C A S E
            {
            mU(); if (state.failed) return ;


            mC(); if (state.failed) return ;


            mA(); if (state.failed) return ;


            mS(); if (state.failed) return ;


            mE(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UCASE"

    // $ANTLR start "LCASE"
    public final void mLCASE() throws RecognitionException {
        try {
            int _type = LCASE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1145:7: ( L C A S E )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1145:10: L C A S E
            {
            mL(); if (state.failed) return ;


            mC(); if (state.failed) return ;


            mA(); if (state.failed) return ;


            mS(); if (state.failed) return ;


            mE(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LCASE"

    // $ANTLR start "ENCODE_FOR_URI"
    public final void mENCODE_FOR_URI() throws RecognitionException {
        try {
            int _type = ENCODE_FOR_URI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1147:16: ( E N C O D E '_' F O R '_' U R I )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1147:19: E N C O D E '_' F O R '_' U R I
            {
            mE(); if (state.failed) return ;


            mN(); if (state.failed) return ;


            mC(); if (state.failed) return ;


            mO(); if (state.failed) return ;


            mD(); if (state.failed) return ;


            mE(); if (state.failed) return ;


            match('_'); if (state.failed) return ;

            mF(); if (state.failed) return ;


            mO(); if (state.failed) return ;


            mR(); if (state.failed) return ;


            match('_'); if (state.failed) return ;

            mU(); if (state.failed) return ;


            mR(); if (state.failed) return ;


            mI(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ENCODE_FOR_URI"

    // $ANTLR start "CONTAINS"
    public final void mCONTAINS() throws RecognitionException {
        try {
            int _type = CONTAINS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1149:10: ( C O N T A I N S )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1149:13: C O N T A I N S
            {
            mC(); if (state.failed) return ;


            mO(); if (state.failed) return ;


            mN(); if (state.failed) return ;


            mT(); if (state.failed) return ;


            mA(); if (state.failed) return ;


            mI(); if (state.failed) return ;


            mN(); if (state.failed) return ;


            mS(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CONTAINS"

    // $ANTLR start "STRSTARTS"
    public final void mSTRSTARTS() throws RecognitionException {
        try {
            int _type = STRSTARTS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1151:11: ( S T R S T A R T S )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1151:14: S T R S T A R T S
            {
            mS(); if (state.failed) return ;


            mT(); if (state.failed) return ;


            mR(); if (state.failed) return ;


            mS(); if (state.failed) return ;


            mT(); if (state.failed) return ;


            mA(); if (state.failed) return ;


            mR(); if (state.failed) return ;


            mT(); if (state.failed) return ;


            mS(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRSTARTS"

    // $ANTLR start "STRENDS"
    public final void mSTRENDS() throws RecognitionException {
        try {
            int _type = STRENDS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1153:9: ( S T R E N D S )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1153:12: S T R E N D S
            {
            mS(); if (state.failed) return ;


            mT(); if (state.failed) return ;


            mR(); if (state.failed) return ;


            mE(); if (state.failed) return ;


            mN(); if (state.failed) return ;


            mD(); if (state.failed) return ;


            mS(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRENDS"

    // $ANTLR start "STRBEFORE"
    public final void mSTRBEFORE() throws RecognitionException {
        try {
            int _type = STRBEFORE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1155:11: ( S T R B E F O R E )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1155:14: S T R B E F O R E
            {
            mS(); if (state.failed) return ;


            mT(); if (state.failed) return ;


            mR(); if (state.failed) return ;


            mB(); if (state.failed) return ;


            mE(); if (state.failed) return ;


            mF(); if (state.failed) return ;


            mO(); if (state.failed) return ;


            mR(); if (state.failed) return ;


            mE(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRBEFORE"

    // $ANTLR start "STRAFTER"
    public final void mSTRAFTER() throws RecognitionException {
        try {
            int _type = STRAFTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1157:10: ( S T R A F T E R )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1157:13: S T R A F T E R
            {
            mS(); if (state.failed) return ;


            mT(); if (state.failed) return ;


            mR(); if (state.failed) return ;


            mA(); if (state.failed) return ;


            mF(); if (state.failed) return ;


            mT(); if (state.failed) return ;


            mE(); if (state.failed) return ;


            mR(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRAFTER"

    // $ANTLR start "YEAR"
    public final void mYEAR() throws RecognitionException {
        try {
            int _type = YEAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1159:6: ( Y E A R )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1159:9: Y E A R
            {
            mY(); if (state.failed) return ;


            mE(); if (state.failed) return ;


            mA(); if (state.failed) return ;


            mR(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "YEAR"

    // $ANTLR start "MONTH"
    public final void mMONTH() throws RecognitionException {
        try {
            int _type = MONTH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1161:7: ( M O N T H )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1161:10: M O N T H
            {
            mM(); if (state.failed) return ;


            mO(); if (state.failed) return ;


            mN(); if (state.failed) return ;


            mT(); if (state.failed) return ;


            mH(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MONTH"

    // $ANTLR start "DAY"
    public final void mDAY() throws RecognitionException {
        try {
            int _type = DAY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1163:5: ( D A Y )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1163:8: D A Y
            {
            mD(); if (state.failed) return ;


            mA(); if (state.failed) return ;


            mY(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DAY"

    // $ANTLR start "HOURS"
    public final void mHOURS() throws RecognitionException {
        try {
            int _type = HOURS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1165:7: ( H O U R S )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1165:10: H O U R S
            {
            mH(); if (state.failed) return ;


            mO(); if (state.failed) return ;


            mU(); if (state.failed) return ;


            mR(); if (state.failed) return ;


            mS(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HOURS"

    // $ANTLR start "MINUTES"
    public final void mMINUTES() throws RecognitionException {
        try {
            int _type = MINUTES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1167:9: ( M I N U T E S )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1167:12: M I N U T E S
            {
            mM(); if (state.failed) return ;


            mI(); if (state.failed) return ;


            mN(); if (state.failed) return ;


            mU(); if (state.failed) return ;


            mT(); if (state.failed) return ;


            mE(); if (state.failed) return ;


            mS(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MINUTES"

    // $ANTLR start "SECONDS"
    public final void mSECONDS() throws RecognitionException {
        try {
            int _type = SECONDS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1169:9: ( S E C O N D S )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1169:12: S E C O N D S
            {
            mS(); if (state.failed) return ;


            mE(); if (state.failed) return ;


            mC(); if (state.failed) return ;


            mO(); if (state.failed) return ;


            mN(); if (state.failed) return ;


            mD(); if (state.failed) return ;


            mS(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SECONDS"

    // $ANTLR start "TIMEZONE"
    public final void mTIMEZONE() throws RecognitionException {
        try {
            int _type = TIMEZONE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1171:10: ( T I M E Z O N E )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1171:13: T I M E Z O N E
            {
            mT(); if (state.failed) return ;


            mI(); if (state.failed) return ;


            mM(); if (state.failed) return ;


            mE(); if (state.failed) return ;


            mZ(); if (state.failed) return ;


            mO(); if (state.failed) return ;


            mN(); if (state.failed) return ;


            mE(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TIMEZONE"

    // $ANTLR start "TZ"
    public final void mTZ() throws RecognitionException {
        try {
            int _type = TZ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1173:4: ( T Z )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1173:7: T Z
            {
            mT(); if (state.failed) return ;


            mZ(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TZ"

    // $ANTLR start "NOW"
    public final void mNOW() throws RecognitionException {
        try {
            int _type = NOW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1175:5: ( N O W )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1175:8: N O W
            {
            mN(); if (state.failed) return ;


            mO(); if (state.failed) return ;


            mW(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOW"

    // $ANTLR start "MD5"
    public final void mMD5() throws RecognitionException {
        try {
            int _type = MD5;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1177:5: ( M D '5' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1177:8: M D '5'
            {
            mM(); if (state.failed) return ;


            mD(); if (state.failed) return ;


            match('5'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MD5"

    // $ANTLR start "SHA1"
    public final void mSHA1() throws RecognitionException {
        try {
            int _type = SHA1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1179:6: ( S H A '1' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1179:9: S H A '1'
            {
            mS(); if (state.failed) return ;


            mH(); if (state.failed) return ;


            mA(); if (state.failed) return ;


            match('1'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SHA1"

    // $ANTLR start "SHA224"
    public final void mSHA224() throws RecognitionException {
        try {
            int _type = SHA224;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1181:8: ( S H A '2' '2' '4' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1181:11: S H A '2' '2' '4'
            {
            mS(); if (state.failed) return ;


            mH(); if (state.failed) return ;


            mA(); if (state.failed) return ;


            match('2'); if (state.failed) return ;

            match('2'); if (state.failed) return ;

            match('4'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SHA224"

    // $ANTLR start "SHA256"
    public final void mSHA256() throws RecognitionException {
        try {
            int _type = SHA256;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1183:8: ( S H A '2' '5' '6' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1183:11: S H A '2' '5' '6'
            {
            mS(); if (state.failed) return ;


            mH(); if (state.failed) return ;


            mA(); if (state.failed) return ;


            match('2'); if (state.failed) return ;

            match('5'); if (state.failed) return ;

            match('6'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SHA256"

    // $ANTLR start "SHA384"
    public final void mSHA384() throws RecognitionException {
        try {
            int _type = SHA384;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1185:8: ( S H A '3' '8' '4' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1185:11: S H A '3' '8' '4'
            {
            mS(); if (state.failed) return ;


            mH(); if (state.failed) return ;


            mA(); if (state.failed) return ;


            match('3'); if (state.failed) return ;

            match('8'); if (state.failed) return ;

            match('4'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SHA384"

    // $ANTLR start "SHA512"
    public final void mSHA512() throws RecognitionException {
        try {
            int _type = SHA512;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1187:8: ( S H A '5' '1' '2' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1187:11: S H A '5' '1' '2'
            {
            mS(); if (state.failed) return ;


            mH(); if (state.failed) return ;


            mA(); if (state.failed) return ;


            match('5'); if (state.failed) return ;

            match('1'); if (state.failed) return ;

            match('2'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SHA512"

    // $ANTLR start "COALESCE"
    public final void mCOALESCE() throws RecognitionException {
        try {
            int _type = COALESCE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1189:10: ( C O A L E S C E )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1189:13: C O A L E S C E
            {
            mC(); if (state.failed) return ;


            mO(); if (state.failed) return ;


            mA(); if (state.failed) return ;


            mL(); if (state.failed) return ;


            mE(); if (state.failed) return ;


            mS(); if (state.failed) return ;


            mC(); if (state.failed) return ;


            mE(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COALESCE"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1191:4: ( I F )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1191:7: I F
            {
            mI(); if (state.failed) return ;


            mF(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "STRLANG"
    public final void mSTRLANG() throws RecognitionException {
        try {
            int _type = STRLANG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1193:9: ( S T R L A N G )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1193:12: S T R L A N G
            {
            mS(); if (state.failed) return ;


            mT(); if (state.failed) return ;


            mR(); if (state.failed) return ;


            mL(); if (state.failed) return ;


            mA(); if (state.failed) return ;


            mN(); if (state.failed) return ;


            mG(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRLANG"

    // $ANTLR start "STRDT"
    public final void mSTRDT() throws RecognitionException {
        try {
            int _type = STRDT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1195:7: ( S T R D T )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1195:10: S T R D T
            {
            mS(); if (state.failed) return ;


            mT(); if (state.failed) return ;


            mR(); if (state.failed) return ;


            mD(); if (state.failed) return ;


            mT(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRDT"

    // $ANTLR start "SAMETERM"
    public final void mSAMETERM() throws RecognitionException {
        try {
            int _type = SAMETERM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1197:10: ( S A M E T E R M )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1197:13: S A M E T E R M
            {
            mS(); if (state.failed) return ;


            mA(); if (state.failed) return ;


            mM(); if (state.failed) return ;


            mE(); if (state.failed) return ;


            mT(); if (state.failed) return ;


            mE(); if (state.failed) return ;


            mR(); if (state.failed) return ;


            mM(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SAMETERM"

    // $ANTLR start "ISIRI"
    public final void mISIRI() throws RecognitionException {
        try {
            int _type = ISIRI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1199:7: ( I S I R I )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1199:10: I S I R I
            {
            mI(); if (state.failed) return ;


            mS(); if (state.failed) return ;


            mI(); if (state.failed) return ;


            mR(); if (state.failed) return ;


            mI(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ISIRI"

    // $ANTLR start "ISURI"
    public final void mISURI() throws RecognitionException {
        try {
            int _type = ISURI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1201:7: ( I S U R I )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1201:10: I S U R I
            {
            mI(); if (state.failed) return ;


            mS(); if (state.failed) return ;


            mU(); if (state.failed) return ;


            mR(); if (state.failed) return ;


            mI(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ISURI"

    // $ANTLR start "ISBLANK"
    public final void mISBLANK() throws RecognitionException {
        try {
            int _type = ISBLANK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1203:9: ( I S B L A N K )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1203:12: I S B L A N K
            {
            mI(); if (state.failed) return ;


            mS(); if (state.failed) return ;


            mB(); if (state.failed) return ;


            mL(); if (state.failed) return ;


            mA(); if (state.failed) return ;


            mN(); if (state.failed) return ;


            mK(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ISBLANK"

    // $ANTLR start "ISLITERAL"
    public final void mISLITERAL() throws RecognitionException {
        try {
            int _type = ISLITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1205:11: ( I S L I T E R A L )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1205:14: I S L I T E R A L
            {
            mI(); if (state.failed) return ;


            mS(); if (state.failed) return ;


            mL(); if (state.failed) return ;


            mI(); if (state.failed) return ;


            mT(); if (state.failed) return ;


            mE(); if (state.failed) return ;


            mR(); if (state.failed) return ;


            mA(); if (state.failed) return ;


            mL(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ISLITERAL"

    // $ANTLR start "ISNUMERIC"
    public final void mISNUMERIC() throws RecognitionException {
        try {
            int _type = ISNUMERIC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1207:11: ( I S N U M E R I C )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1207:14: I S N U M E R I C
            {
            mI(); if (state.failed) return ;


            mS(); if (state.failed) return ;


            mN(); if (state.failed) return ;


            mU(); if (state.failed) return ;


            mM(); if (state.failed) return ;


            mE(); if (state.failed) return ;


            mR(); if (state.failed) return ;


            mI(); if (state.failed) return ;


            mC(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ISNUMERIC"

    // $ANTLR start "REGEX"
    public final void mREGEX() throws RecognitionException {
        try {
            int _type = REGEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1209:7: ( R E G E X )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1209:10: R E G E X
            {
            mR(); if (state.failed) return ;


            mE(); if (state.failed) return ;


            mG(); if (state.failed) return ;


            mE(); if (state.failed) return ;


            mX(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "REGEX"

    // $ANTLR start "TRUE"
    public final void mTRUE() throws RecognitionException {
        try {
            int _type = TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1211:6: ( T R U E )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1211:9: T R U E
            {
            mT(); if (state.failed) return ;


            mR(); if (state.failed) return ;


            mU(); if (state.failed) return ;


            mE(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TRUE"

    // $ANTLR start "FALSE"
    public final void mFALSE() throws RecognitionException {
        try {
            int _type = FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1213:7: ( F A L S E )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1213:10: F A L S E
            {
            mF(); if (state.failed) return ;


            mA(); if (state.failed) return ;


            mL(); if (state.failed) return ;


            mS(); if (state.failed) return ;


            mE(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FALSE"

    // $ANTLR start "ADD"
    public final void mADD() throws RecognitionException {
        try {
            int _type = ADD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1215:5: ( A D D )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1215:8: A D D
            {
            mA(); if (state.failed) return ;


            mD(); if (state.failed) return ;


            mD(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ADD"

    // $ANTLR start "IN"
    public final void mIN() throws RecognitionException {
        try {
            int _type = IN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1217:4: ( I N )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1217:7: I N
            {
            mI(); if (state.failed) return ;


            mN(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IN"

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1219:5: ( N O T )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1219:8: N O T
            {
            mN(); if (state.failed) return ;


            mO(); if (state.failed) return ;


            mT(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOT"

    // $ANTLR start "SUBSTR"
    public final void mSUBSTR() throws RecognitionException {
        try {
            int _type = SUBSTR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1221:8: ( S U B S T R )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1221:11: S U B S T R
            {
            mS(); if (state.failed) return ;


            mU(); if (state.failed) return ;


            mB(); if (state.failed) return ;


            mS(); if (state.failed) return ;


            mT(); if (state.failed) return ;


            mR(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SUBSTR"

    // $ANTLR start "EXISTS"
    public final void mEXISTS() throws RecognitionException {
        try {
            int _type = EXISTS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1223:8: ( E X I S T S )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1223:11: E X I S T S
            {
            mE(); if (state.failed) return ;


            mX(); if (state.failed) return ;


            mI(); if (state.failed) return ;


            mS(); if (state.failed) return ;


            mT(); if (state.failed) return ;


            mS(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EXISTS"

    // $ANTLR start "COUNT"
    public final void mCOUNT() throws RecognitionException {
        try {
            int _type = COUNT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1225:7: ( C O U N T )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1225:10: C O U N T
            {
            mC(); if (state.failed) return ;


            mO(); if (state.failed) return ;


            mU(); if (state.failed) return ;


            mN(); if (state.failed) return ;


            mT(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COUNT"

    // $ANTLR start "SUM"
    public final void mSUM() throws RecognitionException {
        try {
            int _type = SUM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1227:5: ( S U M )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1227:8: S U M
            {
            mS(); if (state.failed) return ;


            mU(); if (state.failed) return ;


            mM(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SUM"

    // $ANTLR start "MIN"
    public final void mMIN() throws RecognitionException {
        try {
            int _type = MIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1229:5: ( M I N )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1229:8: M I N
            {
            mM(); if (state.failed) return ;


            mI(); if (state.failed) return ;


            mN(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MIN"

    // $ANTLR start "MAX"
    public final void mMAX() throws RecognitionException {
        try {
            int _type = MAX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1231:5: ( M A X )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1231:8: M A X
            {
            mM(); if (state.failed) return ;


            mA(); if (state.failed) return ;


            mX(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MAX"

    // $ANTLR start "AVG"
    public final void mAVG() throws RecognitionException {
        try {
            int _type = AVG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1233:5: ( A V G )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1233:8: A V G
            {
            mA(); if (state.failed) return ;


            mV(); if (state.failed) return ;


            mG(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AVG"

    // $ANTLR start "SAMPLE"
    public final void mSAMPLE() throws RecognitionException {
        try {
            int _type = SAMPLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1235:8: ( S A M P L E )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1235:11: S A M P L E
            {
            mS(); if (state.failed) return ;


            mA(); if (state.failed) return ;


            mM(); if (state.failed) return ;


            mP(); if (state.failed) return ;


            mL(); if (state.failed) return ;


            mE(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SAMPLE"

    // $ANTLR start "GROUP_CONCAT"
    public final void mGROUP_CONCAT() throws RecognitionException {
        try {
            int _type = GROUP_CONCAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1237:14: ( G R O U P '_' C O N C A T )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1237:17: G R O U P '_' C O N C A T
            {
            mG(); if (state.failed) return ;


            mR(); if (state.failed) return ;


            mO(); if (state.failed) return ;


            mU(); if (state.failed) return ;


            mP(); if (state.failed) return ;


            match('_'); if (state.failed) return ;

            mC(); if (state.failed) return ;


            mO(); if (state.failed) return ;


            mN(); if (state.failed) return ;


            mC(); if (state.failed) return ;


            mA(); if (state.failed) return ;


            mT(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GROUP_CONCAT"

    // $ANTLR start "SEPARATOR"
    public final void mSEPARATOR() throws RecognitionException {
        try {
            int _type = SEPARATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1239:11: ( S E P A R A T O R )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1239:14: S E P A R A T O R
            {
            mS(); if (state.failed) return ;


            mE(); if (state.failed) return ;


            mP(); if (state.failed) return ;


            mA(); if (state.failed) return ;


            mR(); if (state.failed) return ;


            mA(); if (state.failed) return ;


            mT(); if (state.failed) return ;


            mO(); if (state.failed) return ;


            mR(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SEPARATOR"

    // $ANTLR start "VALUES"
    public final void mVALUES() throws RecognitionException {
        try {
            int _type = VALUES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1241:8: ( V A L U E S )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1241:10: V A L U E S
            {
            mV(); if (state.failed) return ;


            mA(); if (state.failed) return ;


            mL(); if (state.failed) return ;


            mU(); if (state.failed) return ;


            mE(); if (state.failed) return ;


            mS(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VALUES"

    // $ANTLR start "REPLACE"
    public final void mREPLACE() throws RecognitionException {
        try {
            int _type = REPLACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1243:9: ( R E P L A C E )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1243:11: R E P L A C E
            {
            mR(); if (state.failed) return ;


            mE(); if (state.failed) return ;


            mP(); if (state.failed) return ;


            mL(); if (state.failed) return ;


            mA(); if (state.failed) return ;


            mC(); if (state.failed) return ;


            mE(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "REPLACE"

    // $ANTLR start "UUID"
    public final void mUUID() throws RecognitionException {
        try {
            int _type = UUID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1245:6: ( U U I D )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1245:8: U U I D
            {
            mU(); if (state.failed) return ;


            mU(); if (state.failed) return ;


            mI(); if (state.failed) return ;


            mD(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UUID"

    // $ANTLR start "STRUUID"
    public final void mSTRUUID() throws RecognitionException {
        try {
            int _type = STRUUID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1247:9: ( S T R U U I D )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1247:11: S T R U U I D
            {
            mS(); if (state.failed) return ;


            mT(); if (state.failed) return ;


            mR(); if (state.failed) return ;


            mU(); if (state.failed) return ;


            mU(); if (state.failed) return ;


            mI(); if (state.failed) return ;


            mD(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRUUID"

    // $ANTLR start "POST"
    public final void mPOST() throws RecognitionException {
        try {
            int _type = POST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1249:6: ( P O S T )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1249:8: P O S T
            {
            mP(); if (state.failed) return ;


            mO(); if (state.failed) return ;


            mS(); if (state.failed) return ;


            mT(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "POST"

    // $ANTLR start "TABLE"
    public final void mTABLE() throws RecognitionException {
        try {
            int _type = TABLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1251:7: ( T A B L E )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1251:9: T A B L E
            {
            mT(); if (state.failed) return ;


            mA(); if (state.failed) return ;


            mB(); if (state.failed) return ;


            mL(); if (state.failed) return ;


            mE(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TABLE"

    // $ANTLR start "GET"
    public final void mGET() throws RecognitionException {
        try {
            int _type = GET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1253:5: ( G E T )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1253:7: G E T
            {
            mG(); if (state.failed) return ;


            mE(); if (state.failed) return ;


            mT(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GET"

    // $ANTLR start "SOP"
    public final void mSOP() throws RecognitionException {
        try {
            int _type = SOP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1255:6: ( '\\\\' S O P )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1255:8: '\\\\' S O P
            {
            match('\\'); if (state.failed) return ;

            mS(); if (state.failed) return ;


            mO(); if (state.failed) return ;


            mP(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SOP"

    // $ANTLR start "EOP"
    public final void mEOP() throws RecognitionException {
        try {
            int _type = EOP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1257:6: ( '\\\\' E O P )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1257:8: '\\\\' E O P
            {
            match('\\'); if (state.failed) return ;

            mE(); if (state.failed) return ;


            mO(); if (state.failed) return ;


            mP(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EOP"

    // $ANTLR start "OPEN_CURLY_BRACE"
    public final void mOPEN_CURLY_BRACE() throws RecognitionException {
        try {
            int _type = OPEN_CURLY_BRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1260:2: ( '{' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1260:4: '{'
            {
            match('{'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OPEN_CURLY_BRACE"

    // $ANTLR start "CLOSE_CURLY_BRACE"
    public final void mCLOSE_CURLY_BRACE() throws RecognitionException {
        try {
            int _type = CLOSE_CURLY_BRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1264:2: ( '}' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1264:4: '}'
            {
            match('}'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CLOSE_CURLY_BRACE"

    // $ANTLR start "DOT"
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1268:2: ( '.' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1268:4: '.'
            {
            match('.'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOT"

    // $ANTLR start "OPEN_BRACE"
    public final void mOPEN_BRACE() throws RecognitionException {
        try {
            int _type = OPEN_BRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1272:2: ( '(' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1272:4: '('
            {
            match('('); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OPEN_BRACE"

    // $ANTLR start "CLOSE_BRACE"
    public final void mCLOSE_BRACE() throws RecognitionException {
        try {
            int _type = CLOSE_BRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1276:2: ( ')' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1276:4: ')'
            {
            match(')'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CLOSE_BRACE"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1280:2: ( ',' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1280:4: ','
            {
            match(','); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "SEMICOLON"
    public final void mSEMICOLON() throws RecognitionException {
        try {
            int _type = SEMICOLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1284:2: ( ';' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1284:4: ';'
            {
            match(';'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SEMICOLON"

    // $ANTLR start "LOGICAL_OR"
    public final void mLOGICAL_OR() throws RecognitionException {
        try {
            int _type = LOGICAL_OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1288:2: ( '||' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1288:4: '||'
            {
            match("||"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LOGICAL_OR"

    // $ANTLR start "LOGICAL_AND"
    public final void mLOGICAL_AND() throws RecognitionException {
        try {
            int _type = LOGICAL_AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1292:2: ( '&&' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1292:4: '&&'
            {
            match("&&"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LOGICAL_AND"

    // $ANTLR start "OPEN_SQ_BRACKET"
    public final void mOPEN_SQ_BRACKET() throws RecognitionException {
        try {
            int _type = OPEN_SQ_BRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1296:2: ( '[' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1296:4: '['
            {
            match('['); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OPEN_SQ_BRACKET"

    // $ANTLR start "CLOSE_SQ_BRACKET"
    public final void mCLOSE_SQ_BRACKET() throws RecognitionException {
        try {
            int _type = CLOSE_SQ_BRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1300:2: ( ']' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1300:4: ']'
            {
            match(']'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CLOSE_SQ_BRACKET"

    // $ANTLR start "LT"
    public final void mLT() throws RecognitionException {
        try {
            int _type = LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1304:2: ( '<' ( ( ( ( '\\\\' UNICODE_ESCAPE ) |~ ( '<' | '>' | '\"' | OPEN_CURLY_BRACE | CLOSE_CURLY_BRACE | '|' | '^' | '`' | '\\\\' | ( '\\u0000' .. '\\u0020' ) ) )* '>' )=> ( ( ( '\\\\' UNICODE_ESCAPE ) |~ ( '<' | '>' | '\"' | OPEN_CURLY_BRACE | CLOSE_CURLY_BRACE | '|' | '^' | '`' | '\\\\' | ( '\\u0000' .. '\\u0020' ) ) )* '>' ) | '=' |) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1304:5: '<' ( ( ( ( '\\\\' UNICODE_ESCAPE ) |~ ( '<' | '>' | '\"' | OPEN_CURLY_BRACE | CLOSE_CURLY_BRACE | '|' | '^' | '`' | '\\\\' | ( '\\u0000' .. '\\u0020' ) ) )* '>' )=> ( ( ( '\\\\' UNICODE_ESCAPE ) |~ ( '<' | '>' | '\"' | OPEN_CURLY_BRACE | CLOSE_CURLY_BRACE | '|' | '^' | '`' | '\\\\' | ( '\\u0000' .. '\\u0020' ) ) )* '>' ) | '=' |)
            {
            match('<'); if (state.failed) return ;

            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1305:9: ( ( ( ( '\\\\' UNICODE_ESCAPE ) |~ ( '<' | '>' | '\"' | OPEN_CURLY_BRACE | CLOSE_CURLY_BRACE | '|' | '^' | '`' | '\\\\' | ( '\\u0000' .. '\\u0020' ) ) )* '>' )=> ( ( ( '\\\\' UNICODE_ESCAPE ) |~ ( '<' | '>' | '\"' | OPEN_CURLY_BRACE | CLOSE_CURLY_BRACE | '|' | '^' | '`' | '\\\\' | ( '\\u0000' .. '\\u0020' ) ) )* '>' ) | '=' |)
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='\\') && (synpred1_IbmSparqlExt())) {
                alt2=1;
            }
            else if ( (LA2_0=='=') ) {
                int LA2_2 = input.LA(2);

                if ( (LA2_2=='>') && (synpred1_IbmSparqlExt())) {
                    alt2=1;
                }
                else if ( (LA2_2=='\\') && (synpred1_IbmSparqlExt())) {
                    alt2=1;
                }
                else if ( (LA2_2=='!'||(LA2_2 >= '#' && LA2_2 <= ';')||LA2_2=='='||(LA2_2 >= '?' && LA2_2 <= '[')||LA2_2==']'||LA2_2=='_'||(LA2_2 >= 'a' && LA2_2 <= 'z')||(LA2_2 >= '~' && LA2_2 <= '\uFFFF')) && (synpred1_IbmSparqlExt())) {
                    alt2=1;
                }
                else {
                    alt2=2;
                }
            }
            else if ( (LA2_0=='>') && (synpred1_IbmSparqlExt())) {
                alt2=1;
            }
            else if ( (LA2_0=='!'||(LA2_0 >= '#' && LA2_0 <= ';')||(LA2_0 >= '?' && LA2_0 <= '[')||LA2_0==']'||LA2_0=='_'||(LA2_0 >= 'a' && LA2_0 <= 'z')||(LA2_0 >= '~' && LA2_0 <= '\uFFFF')) && (synpred1_IbmSparqlExt())) {
                alt2=1;
            }
            else {
                alt2=3;
            }
            switch (alt2) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1306:11: ( ( ( '\\\\' UNICODE_ESCAPE ) |~ ( '<' | '>' | '\"' | OPEN_CURLY_BRACE | CLOSE_CURLY_BRACE | '|' | '^' | '`' | '\\\\' | ( '\\u0000' .. '\\u0020' ) ) )* '>' )=> ( ( ( '\\\\' UNICODE_ESCAPE ) |~ ( '<' | '>' | '\"' | OPEN_CURLY_BRACE | CLOSE_CURLY_BRACE | '|' | '^' | '`' | '\\\\' | ( '\\u0000' .. '\\u0020' ) ) )* '>' )
                    {
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1306:160: ( ( ( '\\\\' UNICODE_ESCAPE ) |~ ( '<' | '>' | '\"' | OPEN_CURLY_BRACE | CLOSE_CURLY_BRACE | '|' | '^' | '`' | '\\\\' | ( '\\u0000' .. '\\u0020' ) ) )* '>' )
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1306:162: ( ( '\\\\' UNICODE_ESCAPE ) |~ ( '<' | '>' | '\"' | OPEN_CURLY_BRACE | CLOSE_CURLY_BRACE | '|' | '^' | '`' | '\\\\' | ( '\\u0000' .. '\\u0020' ) ) )* '>'
                    {
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1306:162: ( ( '\\\\' UNICODE_ESCAPE ) |~ ( '<' | '>' | '\"' | OPEN_CURLY_BRACE | CLOSE_CURLY_BRACE | '|' | '^' | '`' | '\\\\' | ( '\\u0000' .. '\\u0020' ) ) )*
                    loop1:
                    do {
                        int alt1=3;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0=='\\') ) {
                            alt1=1;
                        }
                        else if ( (LA1_0=='!'||(LA1_0 >= '#' && LA1_0 <= ';')||LA1_0=='='||(LA1_0 >= '?' && LA1_0 <= '[')||LA1_0==']'||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')||(LA1_0 >= '~' && LA1_0 <= '\uFFFF')) ) {
                            alt1=2;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1306:164: ( '\\\\' UNICODE_ESCAPE )
                    	    {
                    	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1306:164: ( '\\\\' UNICODE_ESCAPE )
                    	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1306:165: '\\\\' UNICODE_ESCAPE
                    	    {
                    	    match('\\'); if (state.failed) return ;

                    	    mUNICODE_ESCAPE(); if (state.failed) return ;


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1306:188: ~ ( '<' | '>' | '\"' | OPEN_CURLY_BRACE | CLOSE_CURLY_BRACE | '|' | '^' | '`' | '\\\\' | ( '\\u0000' .. '\\u0020' ) )
                    	    {
                    	    if ( input.LA(1)=='!'||(input.LA(1) >= '#' && input.LA(1) <= ';')||input.LA(1)=='='||(input.LA(1) >= '?' && input.LA(1) <= '[')||input.LA(1)==']'||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z')||(input.LA(1) >= '~' && input.LA(1) <= '\uFFFF') ) {
                    	        input.consume();
                    	        state.failed=false;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return ;}
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    match('>'); if (state.failed) return ;

                    }


                    if ( state.backtracking==0 ) { _type = IRI_REF; }

                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1308:13: '='
                    {
                    match('='); if (state.failed) return ;

                    if ( state.backtracking==0 ) { _type = LTE; }

                    }
                    break;
                case 3 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1311:5: 
                    {
                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LT"

    // $ANTLR start "PNAME_NS"
    public final void mPNAME_NS() throws RecognitionException {
        try {
            int _type = PNAME_NS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1314:2: ( ( PN_PREFIX )? ':' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1314:6: ( PN_PREFIX )? ':'
            {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1314:6: ( PN_PREFIX )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0 >= 'A' && LA3_0 <= 'Z')||LA3_0=='\\'||(LA3_0 >= 'a' && LA3_0 <= 'z')||(LA3_0 >= '\u00C0' && LA3_0 <= '\u00D6')||(LA3_0 >= '\u00D8' && LA3_0 <= '\u00F6')||(LA3_0 >= '\u00F8' && LA3_0 <= '\u02FF')||(LA3_0 >= '\u0370' && LA3_0 <= '\u037D')||(LA3_0 >= '\u037F' && LA3_0 <= '\u1FFF')||(LA3_0 >= '\u200C' && LA3_0 <= '\u200D')||(LA3_0 >= '\u2070' && LA3_0 <= '\u218F')||(LA3_0 >= '\u2C00' && LA3_0 <= '\u2FEF')||(LA3_0 >= '\u3001' && LA3_0 <= '\uD7FF')||(LA3_0 >= '\uF900' && LA3_0 <= '\uFDCF')||(LA3_0 >= '\uFDF0' && LA3_0 <= '\uFFFD')) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1314:6: PN_PREFIX
                    {
                    mPN_PREFIX(); if (state.failed) return ;


                    }
                    break;

            }


            match(':'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PNAME_NS"

    // $ANTLR start "PNAME_LN"
    public final void mPNAME_LN() throws RecognitionException {
        try {
            int _type = PNAME_LN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1318:2: ( PNAME_NS PN_LOCAL )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1318:6: PNAME_NS PN_LOCAL
            {
            mPNAME_NS(); if (state.failed) return ;


            mPN_LOCAL(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PNAME_LN"

    // $ANTLR start "BLANK_NODE_LABEL"
    public final void mBLANK_NODE_LABEL() throws RecognitionException {
        try {
            int _type = BLANK_NODE_LABEL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            CommonToken l=null;

            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1322:2: ( '_:' l= PN_LOCAL )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1322:6: '_:' l= PN_LOCAL
            {
            match("_:"); if (state.failed) return ;



            int lStart3416 = getCharIndex();
            int lStartLine3416 = getLine();
            int lStartCharPos3416 = getCharPositionInLine();
            mPN_LOCAL(); if (state.failed) return ;
            l = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, lStart3416, getCharIndex()-1);
            l.setLine(lStartLine3416);
            l.setCharPositionInLine(lStartCharPos3416);


            if ( state.backtracking==0 ) { setText((l!=null?l.getText():null)); }

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BLANK_NODE_LABEL"

    // $ANTLR start "VAR1"
    public final void mVAR1() throws RecognitionException {
        try {
            int _type = VAR1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1326:2: ( '?' VARNAME )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1326:6: '?' VARNAME
            {
            match('?'); if (state.failed) return ;

            mVARNAME(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VAR1"

    // $ANTLR start "VAR2"
    public final void mVAR2() throws RecognitionException {
        try {
            int _type = VAR2;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1330:2: ( '$' VARNAME )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1330:6: '$' VARNAME
            {
            match('$'); if (state.failed) return ;

            mVARNAME(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VAR2"

    // $ANTLR start "VAR0"
    public final void mVAR0() throws RecognitionException {
        try {
            int _type = VAR0;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1335:2: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1335:6: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1335:27: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0 >= '0' && LA4_0 <= '9')||(LA4_0 >= 'A' && LA4_0 <= 'Z')||LA4_0=='_'||(LA4_0 >= 'a' && LA4_0 <= 'z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VAR0"

    // $ANTLR start "LANGTAG"
    public final void mLANGTAG() throws RecognitionException {
        try {
            int _type = LANGTAG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1339:2: ( '@' ( 'a' .. 'z' | 'A' .. 'Z' )+ ( '-' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )+ )* )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1339:6: '@' ( 'a' .. 'z' | 'A' .. 'Z' )+ ( '-' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )+ )*
            {
            match('@'); if (state.failed) return ;

            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1339:10: ( 'a' .. 'z' | 'A' .. 'Z' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0 >= 'A' && LA5_0 <= 'Z')||(LA5_0 >= 'a' && LA5_0 <= 'z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:
            	    {
            	    if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1339:31: ( '-' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )+ )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='-') ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1339:33: '-' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )+
            	    {
            	    match('-'); if (state.failed) return ;

            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1339:37: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )+
            	    int cnt6=0;
            	    loop6:
            	    do {
            	        int alt6=2;
            	        int LA6_0 = input.LA(1);

            	        if ( ((LA6_0 >= '0' && LA6_0 <= '9')||(LA6_0 >= 'A' && LA6_0 <= 'Z')||(LA6_0 >= 'a' && LA6_0 <= 'z')) ) {
            	            alt6=1;
            	        }


            	        switch (alt6) {
            	    	case 1 :
            	    	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:
            	    	    {
            	    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	    	        input.consume();
            	    	        state.failed=false;
            	    	    }
            	    	    else {
            	    	        if (state.backtracking>0) {state.failed=true; return ;}
            	    	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	    	        recover(mse);
            	    	        throw mse;
            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt6 >= 1 ) break loop6;
            	    	    if (state.backtracking>0) {state.failed=true; return ;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(6, input);
            	                throw eee;
            	        }
            	        cnt6++;
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            if ( state.backtracking==0 ) { setText(getText().substring(1, getText().length())); }

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LANGTAG"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1345:2: ( ( '0' .. '9' ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "HEXDIGIT"
    public final void mHEXDIGIT() throws RecognitionException {
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1350:5: ( DIGIT | 'A' .. 'F' | 'a' .. 'f' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HEXDIGIT"

    // $ANTLR start "UNICODE_ESCAPE"
    public final void mUNICODE_ESCAPE() throws RecognitionException {
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1355:5: ( 'u' HEXDIGIT HEXDIGIT HEXDIGIT HEXDIGIT )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1355:9: 'u' HEXDIGIT HEXDIGIT HEXDIGIT HEXDIGIT
            {
            match('u'); if (state.failed) return ;

            mHEXDIGIT(); if (state.failed) return ;


            mHEXDIGIT(); if (state.failed) return ;


            mHEXDIGIT(); if (state.failed) return ;


            mHEXDIGIT(); if (state.failed) return ;


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UNICODE_ESCAPE"

    // $ANTLR start "INTEGER"
    public final void mINTEGER() throws RecognitionException {
        try {
            int _type = INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1358:2: ( ( DIGIT )+ )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1358:6: ( DIGIT )+
            {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1358:6: ( DIGIT )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0 >= '0' && LA8_0 <= '9')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INTEGER"

    // $ANTLR start "DECIMAL"
    public final void mDECIMAL() throws RecognitionException {
        try {
            int _type = DECIMAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1362:2: ( ( DIGIT )* DOT ( DIGIT )* )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1362:6: ( DIGIT )* DOT ( DIGIT )*
            {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1362:6: ( DIGIT )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0 >= '0' && LA9_0 <= '9')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            mDOT(); if (state.failed) return ;


            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1362:17: ( DIGIT )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0 >= '0' && LA10_0 <= '9')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DECIMAL"

    // $ANTLR start "DOUBLE"
    public final void mDOUBLE() throws RecognitionException {
        try {
            int _type = DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1366:2: ( ( DIGIT )+ DOT ( DIGIT )* EXPONENT | DOT ( DIGIT )+ EXPONENT | ( DIGIT )+ EXPONENT )
            int alt15=3;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1366:6: ( DIGIT )+ DOT ( DIGIT )* EXPONENT
                    {
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1366:6: ( DIGIT )+
                    int cnt11=0;
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( ((LA11_0 >= '0' && LA11_0 <= '9')) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	        state.failed=false;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return ;}
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt11 >= 1 ) break loop11;
                    	    if (state.backtracking>0) {state.failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(11, input);
                                throw eee;
                        }
                        cnt11++;
                    } while (true);


                    mDOT(); if (state.failed) return ;


                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1366:17: ( DIGIT )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( ((LA12_0 >= '0' && LA12_0 <= '9')) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	        state.failed=false;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return ;}
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    mEXPONENT(); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1367:5: DOT ( DIGIT )+ EXPONENT
                    {
                    mDOT(); if (state.failed) return ;


                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1367:9: ( DIGIT )+
                    int cnt13=0;
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( ((LA13_0 >= '0' && LA13_0 <= '9')) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	        state.failed=false;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return ;}
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt13 >= 1 ) break loop13;
                    	    if (state.backtracking>0) {state.failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(13, input);
                                throw eee;
                        }
                        cnt13++;
                    } while (true);


                    mEXPONENT(); if (state.failed) return ;


                    }
                    break;
                case 3 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1368:5: ( DIGIT )+ EXPONENT
                    {
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1368:5: ( DIGIT )+
                    int cnt14=0;
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( ((LA14_0 >= '0' && LA14_0 <= '9')) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	        state.failed=false;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return ;}
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt14 >= 1 ) break loop14;
                    	    if (state.backtracking>0) {state.failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(14, input);
                                throw eee;
                        }
                        cnt14++;
                    } while (true);


                    mEXPONENT(); if (state.failed) return ;


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOUBLE"

    // $ANTLR start "INTEGER_POSITIVE"
    public final void mINTEGER_POSITIVE() throws RecognitionException {
        try {
            int _type = INTEGER_POSITIVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1372:2: ( '+' INTEGER )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1372:6: '+' INTEGER
            {
            match('+'); if (state.failed) return ;

            mINTEGER(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INTEGER_POSITIVE"

    // $ANTLR start "DECIMAL_POSITIVE"
    public final void mDECIMAL_POSITIVE() throws RecognitionException {
        try {
            int _type = DECIMAL_POSITIVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1376:2: ( '+' DECIMAL )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1376:6: '+' DECIMAL
            {
            match('+'); if (state.failed) return ;

            mDECIMAL(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DECIMAL_POSITIVE"

    // $ANTLR start "DOUBLE_POSITIVE"
    public final void mDOUBLE_POSITIVE() throws RecognitionException {
        try {
            int _type = DOUBLE_POSITIVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1380:2: ( '+' DOUBLE )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1380:6: '+' DOUBLE
            {
            match('+'); if (state.failed) return ;

            mDOUBLE(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOUBLE_POSITIVE"

    // $ANTLR start "INTEGER_NEGATIVE"
    public final void mINTEGER_NEGATIVE() throws RecognitionException {
        try {
            int _type = INTEGER_NEGATIVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1384:2: ( '-' INTEGER )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1384:6: '-' INTEGER
            {
            match('-'); if (state.failed) return ;

            mINTEGER(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INTEGER_NEGATIVE"

    // $ANTLR start "DECIMAL_NEGATIVE"
    public final void mDECIMAL_NEGATIVE() throws RecognitionException {
        try {
            int _type = DECIMAL_NEGATIVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1388:2: ( '-' DECIMAL )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1388:6: '-' DECIMAL
            {
            match('-'); if (state.failed) return ;

            mDECIMAL(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DECIMAL_NEGATIVE"

    // $ANTLR start "DOUBLE_NEGATIVE"
    public final void mDOUBLE_NEGATIVE() throws RecognitionException {
        try {
            int _type = DOUBLE_NEGATIVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1392:2: ( '-' DOUBLE )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1392:6: '-' DOUBLE
            {
            match('-'); if (state.failed) return ;

            mDOUBLE(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOUBLE_NEGATIVE"

    // $ANTLR start "EXPONENT"
    public final void mEXPONENT() throws RecognitionException {
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1398:2: ( ( 'e' | 'E' ) ( ( '+' | '-' )? ( '0' .. '9' ) )+ )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1398:6: ( 'e' | 'E' ) ( ( '+' | '-' )? ( '0' .. '9' ) )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1398:16: ( ( '+' | '-' )? ( '0' .. '9' ) )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0=='+'||LA17_0=='-'||(LA17_0 >= '0' && LA17_0 <= '9')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1398:18: ( '+' | '-' )? ( '0' .. '9' )
            	    {
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1398:18: ( '+' | '-' )?
            	    int alt16=2;
            	    int LA16_0 = input.LA(1);

            	    if ( (LA16_0=='+'||LA16_0=='-') ) {
            	        alt16=1;
            	    }
            	    switch (alt16) {
            	        case 1 :
            	            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:
            	            {
            	            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
            	                input.consume();
            	                state.failed=false;
            	            }
            	            else {
            	                if (state.backtracking>0) {state.failed=true; return ;}
            	                MismatchedSetException mse = new MismatchedSetException(null,input);
            	                recover(mse);
            	                throw mse;
            	            }


            	            }
            	            break;

            	    }


            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EXPONENT"

    // $ANTLR start "STRING_LINE_NONEOP"
    public final void mSTRING_LINE_NONEOP() throws RecognitionException {
        try {
            int _type = STRING_LINE_NONEOP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1401:4: ( SOP ( options {greedy=false; } :~ ( '\\u007C' | '\\u005C' ) | ECHAR )* EOP )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1401:4: SOP ( options {greedy=false; } :~ ( '\\u007C' | '\\u005C' ) | ECHAR )* EOP
            {
            mSOP(); if (state.failed) return ;


            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1401:8: ( options {greedy=false; } :~ ( '\\u007C' | '\\u005C' ) | ECHAR )*
            loop18:
            do {
                int alt18=3;
                int LA18_0 = input.LA(1);

                if ( (LA18_0=='\\') ) {
                    int LA18_1 = input.LA(2);

                    if ( (LA18_1=='E'||LA18_1=='e') ) {
                        alt18=3;
                    }
                    else if ( (LA18_1=='\"'||LA18_1=='\''||LA18_1=='\\'||LA18_1=='b'||LA18_1=='f'||LA18_1=='n'||LA18_1=='r'||(LA18_1 >= 't' && LA18_1 <= 'u')) ) {
                        alt18=2;
                    }


                }
                else if ( ((LA18_0 >= '\u0000' && LA18_0 <= '[')||(LA18_0 >= ']' && LA18_0 <= '{')||(LA18_0 >= '}' && LA18_0 <= '\uFFFF')) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1401:36: ~ ( '\\u007C' | '\\u005C' )
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '{')||(input.LA(1) >= '}' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;
            	case 2 :
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1401:59: ECHAR
            	    {
            	    mECHAR(); if (state.failed) return ;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            mEOP(); if (state.failed) return ;


            if ( state.backtracking==0 ) { setText(getText().substring(4, getText().length()-4)); 		}

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING_LINE_NONEOP"

    // $ANTLR start "STRING_LITERAL1"
    public final void mSTRING_LITERAL1() throws RecognitionException {
        try {
            int _type = STRING_LITERAL1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1406:2: ( '\\'' ( options {greedy=false; } :~ ( '\\u0027' | '\\u005C' | '\\u000A' | '\\u000D' ) | ECHAR )* '\\'' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1406:6: '\\'' ( options {greedy=false; } :~ ( '\\u0027' | '\\u005C' | '\\u000A' | '\\u000D' ) | ECHAR )* '\\''
            {
            match('\''); if (state.failed) return ;

            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1406:11: ( options {greedy=false; } :~ ( '\\u0027' | '\\u005C' | '\\u000A' | '\\u000D' ) | ECHAR )*
            loop19:
            do {
                int alt19=3;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0 >= '\u0000' && LA19_0 <= '\t')||(LA19_0 >= '\u000B' && LA19_0 <= '\f')||(LA19_0 >= '\u000E' && LA19_0 <= '&')||(LA19_0 >= '(' && LA19_0 <= '[')||(LA19_0 >= ']' && LA19_0 <= '\uFFFF')) ) {
                    alt19=1;
                }
                else if ( (LA19_0=='\\') ) {
                    alt19=2;
                }
                else if ( (LA19_0=='\'') ) {
                    alt19=3;
                }


                switch (alt19) {
            	case 1 :
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1406:39: ~ ( '\\u0027' | '\\u005C' | '\\u000A' | '\\u000D' )
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;
            	case 2 :
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1406:80: ECHAR
            	    {
            	    mECHAR(); if (state.failed) return ;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            match('\''); if (state.failed) return ;

            if ( state.backtracking==0 ) { if (stripStringQuotes) setText(getText().substring(1, getText().length()-1));
            			  else setText("\""+getText().substring(1, getText().length()-1)+"\""); 		}

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING_LITERAL1"

    // $ANTLR start "STRING_LITERAL2"
    public final void mSTRING_LITERAL2() throws RecognitionException {
        try {
            int _type = STRING_LITERAL2;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1413:2: ( '\"' ( options {greedy=false; } :~ ( '\\u0022' | '\\u005C' | '\\u000A' | '\\u000D' ) | ECHAR )* '\"' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1413:6: '\"' ( options {greedy=false; } :~ ( '\\u0022' | '\\u005C' | '\\u000A' | '\\u000D' ) | ECHAR )* '\"'
            {
            match('\"'); if (state.failed) return ;

            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1413:10: ( options {greedy=false; } :~ ( '\\u0022' | '\\u005C' | '\\u000A' | '\\u000D' ) | ECHAR )*
            loop20:
            do {
                int alt20=3;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0 >= '\u0000' && LA20_0 <= '\t')||(LA20_0 >= '\u000B' && LA20_0 <= '\f')||(LA20_0 >= '\u000E' && LA20_0 <= '!')||(LA20_0 >= '#' && LA20_0 <= '[')||(LA20_0 >= ']' && LA20_0 <= '\uFFFF')) ) {
                    alt20=1;
                }
                else if ( (LA20_0=='\\') ) {
                    alt20=2;
                }
                else if ( (LA20_0=='\"') ) {
                    alt20=3;
                }


                switch (alt20) {
            	case 1 :
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1413:38: ~ ( '\\u0022' | '\\u005C' | '\\u000A' | '\\u000D' )
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;
            	case 2 :
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1413:79: ECHAR
            	    {
            	    mECHAR(); if (state.failed) return ;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            match('\"'); if (state.failed) return ;

            if ( state.backtracking==0 ) { if (stripStringQuotes) setText(getText().substring(1, getText().length()-1)); }

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING_LITERAL2"

    // $ANTLR start "STRING_LITERAL_LONG1"
    public final void mSTRING_LITERAL_LONG1() throws RecognitionException {
        try {
            int _type = STRING_LITERAL_LONG1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1419:2: ( '\\'\\'\\'' ( options {greedy=false; } : ( '\\'' | '\\'\\'' )? (~ ( '\\'' | '\\\\' ) | ECHAR ) )* '\\'\\'\\'' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1419:6: '\\'\\'\\'' ( options {greedy=false; } : ( '\\'' | '\\'\\'' )? (~ ( '\\'' | '\\\\' ) | ECHAR ) )* '\\'\\'\\''
            {
            match("'''"); if (state.failed) return ;



            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1419:15: ( options {greedy=false; } : ( '\\'' | '\\'\\'' )? (~ ( '\\'' | '\\\\' ) | ECHAR ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0=='\'') ) {
                    int LA23_1 = input.LA(2);

                    if ( (LA23_1=='\'') ) {
                        int LA23_3 = input.LA(3);

                        if ( (LA23_3=='\'') ) {
                            alt23=2;
                        }
                        else if ( ((LA23_3 >= '\u0000' && LA23_3 <= '&')||(LA23_3 >= '(' && LA23_3 <= '\uFFFF')) ) {
                            alt23=1;
                        }


                    }
                    else if ( ((LA23_1 >= '\u0000' && LA23_1 <= '&')||(LA23_1 >= '(' && LA23_1 <= '\uFFFF')) ) {
                        alt23=1;
                    }


                }
                else if ( ((LA23_0 >= '\u0000' && LA23_0 <= '&')||(LA23_0 >= '(' && LA23_0 <= '\uFFFF')) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1419:43: ( '\\'' | '\\'\\'' )? (~ ( '\\'' | '\\\\' ) | ECHAR )
            	    {
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1419:43: ( '\\'' | '\\'\\'' )?
            	    int alt21=3;
            	    int LA21_0 = input.LA(1);

            	    if ( (LA21_0=='\'') ) {
            	        int LA21_1 = input.LA(2);

            	        if ( (LA21_1=='\'') ) {
            	            alt21=2;
            	        }
            	        else if ( ((LA21_1 >= '\u0000' && LA21_1 <= '&')||(LA21_1 >= '(' && LA21_1 <= '\uFFFF')) ) {
            	            alt21=1;
            	        }
            	    }
            	    switch (alt21) {
            	        case 1 :
            	            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1419:45: '\\''
            	            {
            	            match('\''); if (state.failed) return ;

            	            }
            	            break;
            	        case 2 :
            	            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1419:52: '\\'\\''
            	            {
            	            match("''"); if (state.failed) return ;



            	            }
            	            break;

            	    }


            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1419:62: (~ ( '\\'' | '\\\\' ) | ECHAR )
            	    int alt22=2;
            	    int LA22_0 = input.LA(1);

            	    if ( ((LA22_0 >= '\u0000' && LA22_0 <= '&')||(LA22_0 >= '(' && LA22_0 <= '[')||(LA22_0 >= ']' && LA22_0 <= '\uFFFF')) ) {
            	        alt22=1;
            	    }
            	    else if ( (LA22_0=='\\') ) {
            	        alt22=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 22, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt22) {
            	        case 1 :
            	            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1419:64: ~ ( '\\'' | '\\\\' )
            	            {
            	            if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
            	                input.consume();
            	                state.failed=false;
            	            }
            	            else {
            	                if (state.backtracking>0) {state.failed=true; return ;}
            	                MismatchedSetException mse = new MismatchedSetException(null,input);
            	                recover(mse);
            	                throw mse;
            	            }


            	            }
            	            break;
            	        case 2 :
            	            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1419:79: ECHAR
            	            {
            	            mECHAR(); if (state.failed) return ;


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            match("'''"); if (state.failed) return ;



            if ( state.backtracking==0 ) { if (stripStringQuotes) setText(getText().substring(3, getText().length()-3)); 
            			  else setText("\"\"\""+getText().substring(3, getText().length()-3)+"\"\"\"");	}

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING_LITERAL_LONG1"

    // $ANTLR start "STRING_LITERAL_LONG2"
    public final void mSTRING_LITERAL_LONG2() throws RecognitionException {
        try {
            int _type = STRING_LITERAL_LONG2;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1426:2: ( '\"\"\"' ( options {greedy=false; } : ( '\"' | '\"\"' )? (~ ( '\"' | '\\\\' ) | ECHAR ) )* '\"\"\"' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1426:6: '\"\"\"' ( options {greedy=false; } : ( '\"' | '\"\"' )? (~ ( '\"' | '\\\\' ) | ECHAR ) )* '\"\"\"'
            {
            match("\"\"\""); if (state.failed) return ;



            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1426:12: ( options {greedy=false; } : ( '\"' | '\"\"' )? (~ ( '\"' | '\\\\' ) | ECHAR ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0=='\"') ) {
                    int LA26_1 = input.LA(2);

                    if ( (LA26_1=='\"') ) {
                        int LA26_3 = input.LA(3);

                        if ( (LA26_3=='\"') ) {
                            alt26=2;
                        }
                        else if ( ((LA26_3 >= '\u0000' && LA26_3 <= '!')||(LA26_3 >= '#' && LA26_3 <= '\uFFFF')) ) {
                            alt26=1;
                        }


                    }
                    else if ( ((LA26_1 >= '\u0000' && LA26_1 <= '!')||(LA26_1 >= '#' && LA26_1 <= '\uFFFF')) ) {
                        alt26=1;
                    }


                }
                else if ( ((LA26_0 >= '\u0000' && LA26_0 <= '!')||(LA26_0 >= '#' && LA26_0 <= '\uFFFF')) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1426:40: ( '\"' | '\"\"' )? (~ ( '\"' | '\\\\' ) | ECHAR )
            	    {
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1426:40: ( '\"' | '\"\"' )?
            	    int alt24=3;
            	    int LA24_0 = input.LA(1);

            	    if ( (LA24_0=='\"') ) {
            	        int LA24_1 = input.LA(2);

            	        if ( (LA24_1=='\"') ) {
            	            alt24=2;
            	        }
            	        else if ( ((LA24_1 >= '\u0000' && LA24_1 <= '!')||(LA24_1 >= '#' && LA24_1 <= '\uFFFF')) ) {
            	            alt24=1;
            	        }
            	    }
            	    switch (alt24) {
            	        case 1 :
            	            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1426:42: '\"'
            	            {
            	            match('\"'); if (state.failed) return ;

            	            }
            	            break;
            	        case 2 :
            	            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1426:48: '\"\"'
            	            {
            	            match("\"\""); if (state.failed) return ;



            	            }
            	            break;

            	    }


            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1426:56: (~ ( '\"' | '\\\\' ) | ECHAR )
            	    int alt25=2;
            	    int LA25_0 = input.LA(1);

            	    if ( ((LA25_0 >= '\u0000' && LA25_0 <= '!')||(LA25_0 >= '#' && LA25_0 <= '[')||(LA25_0 >= ']' && LA25_0 <= '\uFFFF')) ) {
            	        alt25=1;
            	    }
            	    else if ( (LA25_0=='\\') ) {
            	        alt25=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 25, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt25) {
            	        case 1 :
            	            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1426:58: ~ ( '\"' | '\\\\' )
            	            {
            	            if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
            	                input.consume();
            	                state.failed=false;
            	            }
            	            else {
            	                if (state.backtracking>0) {state.failed=true; return ;}
            	                MismatchedSetException mse = new MismatchedSetException(null,input);
            	                recover(mse);
            	                throw mse;
            	            }


            	            }
            	            break;
            	        case 2 :
            	            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1426:72: ECHAR
            	            {
            	            mECHAR(); if (state.failed) return ;


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            match("\"\"\""); if (state.failed) return ;



            if ( state.backtracking==0 ) { if (stripStringQuotes) setText(getText().substring(3, getText().length()-3)); }

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING_LITERAL_LONG2"

    // $ANTLR start "ECHAR"
    public final void mECHAR() throws RecognitionException {
        try {
            int _type = ECHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1432:2: ( '\\\\' ( 't' | 'b' | 'n' | 'r' | 'f' | '\\\"' | '\\\\' | '\\'' | UNICODE_ESCAPE ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1432:6: '\\\\' ( 't' | 'b' | 'n' | 'r' | 'f' | '\\\"' | '\\\\' | '\\'' | UNICODE_ESCAPE )
            {
            match('\\'); if (state.failed) return ;

            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1432:11: ( 't' | 'b' | 'n' | 'r' | 'f' | '\\\"' | '\\\\' | '\\'' | UNICODE_ESCAPE )
            int alt27=9;
            switch ( input.LA(1) ) {
            case 't':
                {
                alt27=1;
                }
                break;
            case 'b':
                {
                alt27=2;
                }
                break;
            case 'n':
                {
                alt27=3;
                }
                break;
            case 'r':
                {
                alt27=4;
                }
                break;
            case 'f':
                {
                alt27=5;
                }
                break;
            case '\"':
                {
                alt27=6;
                }
                break;
            case '\\':
                {
                alt27=7;
                }
                break;
            case '\'':
                {
                alt27=8;
                }
                break;
            case 'u':
                {
                alt27=9;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;

            }

            switch (alt27) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1432:12: 't'
                    {
                    match('t'); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1432:16: 'b'
                    {
                    match('b'); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1432:20: 'n'
                    {
                    match('n'); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1432:24: 'r'
                    {
                    match('r'); if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1432:28: 'f'
                    {
                    match('f'); if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1432:32: '\\\"'
                    {
                    match('\"'); if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1432:37: '\\\\'
                    {
                    match('\\'); if (state.failed) return ;

                    }
                    break;
                case 8 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1432:42: '\\''
                    {
                    match('\''); if (state.failed) return ;

                    }
                    break;
                case 9 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1432:47: UNICODE_ESCAPE
                    {
                    mUNICODE_ESCAPE(); if (state.failed) return ;


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ECHAR"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1435:4: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1435:8: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1435:8: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt28=0;
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0 >= '\t' && LA28_0 <= '\n')||LA28_0=='\r'||LA28_0==' ') ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:
            	    {
            	    if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt28 >= 1 ) break loop28;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(28, input);
                        throw eee;
                }
                cnt28++;
            } while (true);


            if ( state.backtracking==0 ) { _channel=HIDDEN; }

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1439:2: ( '#' ( options {greedy=false; } : . )* EOL )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1439:4: '#' ( options {greedy=false; } : . )* EOL
            {
            match('#'); if (state.failed) return ;

            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1439:8: ( options {greedy=false; } : . )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0=='\n'||LA29_0=='\r') ) {
                    alt29=2;
                }
                else if ( ((LA29_0 >= '\u0000' && LA29_0 <= '\t')||(LA29_0 >= '\u000B' && LA29_0 <= '\f')||(LA29_0 >= '\u000E' && LA29_0 <= '\uFFFF')) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1439:35: .
            	    {
            	    matchAny(); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            mEOL(); if (state.failed) return ;


            if ( state.backtracking==0 ) { _channel=HIDDEN; }

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "EOL"
    public final void mEOL() throws RecognitionException {
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1444:5: ( ( '\\n' | '\\r' )+ )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1444:7: ( '\\n' | '\\r' )+
            {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1444:7: ( '\\n' | '\\r' )+
            int cnt30=0;
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0=='\n'||LA30_0=='\r') ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:
            	    {
            	    if ( input.LA(1)=='\n'||input.LA(1)=='\r' ) {
            	        input.consume();
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt30 >= 1 ) break loop30;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(30, input);
                        throw eee;
                }
                cnt30++;
            } while (true);


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EOL"

    // $ANTLR start "PN_CHARS_BASE"
    public final void mPN_CHARS_BASE() throws RecognitionException {
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1448:2: ( ( 'A' .. 'Z' ) | ( 'a' .. 'z' ) | ( '\\\\' UNICODE_ESCAPE ) | ( '\\u00C0' .. '\\u00D6' ) | ( '\\u00D8' .. '\\u00F6' ) | ( '\\u00F8' .. '\\u02FF' ) | ( '\\u0370' .. '\\u037D' ) | ( '\\u037F' .. '\\u1FFF' ) | ( '\\u200C' .. '\\u200D' ) | ( '\\u2070' .. '\\u218F' ) | ( '\\u2C00' .. '\\u2FEF' ) | ( '\\u3001' .. '\\uD7FF' ) | ( '\\uF900' .. '\\uFDCF' ) | ( '\\uFDF0' .. '\\uFFFD' ) )
            int alt31=14;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0 >= 'A' && LA31_0 <= 'Z')) ) {
                alt31=1;
            }
            else if ( ((LA31_0 >= 'a' && LA31_0 <= 'z')) ) {
                alt31=2;
            }
            else if ( (LA31_0=='\\') ) {
                alt31=3;
            }
            else if ( ((LA31_0 >= '\u00C0' && LA31_0 <= '\u00D6')) ) {
                alt31=4;
            }
            else if ( ((LA31_0 >= '\u00D8' && LA31_0 <= '\u00F6')) ) {
                alt31=5;
            }
            else if ( ((LA31_0 >= '\u00F8' && LA31_0 <= '\u02FF')) ) {
                alt31=6;
            }
            else if ( ((LA31_0 >= '\u0370' && LA31_0 <= '\u037D')) ) {
                alt31=7;
            }
            else if ( ((LA31_0 >= '\u037F' && LA31_0 <= '\u1FFF')) ) {
                alt31=8;
            }
            else if ( ((LA31_0 >= '\u200C' && LA31_0 <= '\u200D')) ) {
                alt31=9;
            }
            else if ( ((LA31_0 >= '\u2070' && LA31_0 <= '\u218F')) ) {
                alt31=10;
            }
            else if ( ((LA31_0 >= '\u2C00' && LA31_0 <= '\u2FEF')) ) {
                alt31=11;
            }
            else if ( ((LA31_0 >= '\u3001' && LA31_0 <= '\uD7FF')) ) {
                alt31=12;
            }
            else if ( ((LA31_0 >= '\uF900' && LA31_0 <= '\uFDCF')) ) {
                alt31=13;
            }
            else if ( ((LA31_0 >= '\uFDF0' && LA31_0 <= '\uFFFD')) ) {
                alt31=14;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;

            }
            switch (alt31) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1448:6: ( 'A' .. 'Z' )
                    {
                    if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z') ) {
                        input.consume();
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1448:19: ( 'a' .. 'z' )
                    {
                    if ( (input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                        input.consume();
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 3 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1448:33: ( '\\\\' UNICODE_ESCAPE )
                    {
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1448:33: ( '\\\\' UNICODE_ESCAPE )
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1448:34: '\\\\' UNICODE_ESCAPE
                    {
                    match('\\'); if (state.failed) return ;

                    mUNICODE_ESCAPE(); if (state.failed) return ;


                    }


                    }
                    break;
                case 4 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1449:5: ( '\\u00C0' .. '\\u00D6' )
                    {
                    if ( (input.LA(1) >= '\u00C0' && input.LA(1) <= '\u00D6') ) {
                        input.consume();
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 5 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1449:28: ( '\\u00D8' .. '\\u00F6' )
                    {
                    if ( (input.LA(1) >= '\u00D8' && input.LA(1) <= '\u00F6') ) {
                        input.consume();
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 6 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1449:51: ( '\\u00F8' .. '\\u02FF' )
                    {
                    if ( (input.LA(1) >= '\u00F8' && input.LA(1) <= '\u02FF') ) {
                        input.consume();
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 7 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1450:6: ( '\\u0370' .. '\\u037D' )
                    {
                    if ( (input.LA(1) >= '\u0370' && input.LA(1) <= '\u037D') ) {
                        input.consume();
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 8 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1450:29: ( '\\u037F' .. '\\u1FFF' )
                    {
                    if ( (input.LA(1) >= '\u037F' && input.LA(1) <= '\u1FFF') ) {
                        input.consume();
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 9 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1450:52: ( '\\u200C' .. '\\u200D' )
                    {
                    if ( (input.LA(1) >= '\u200C' && input.LA(1) <= '\u200D') ) {
                        input.consume();
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 10 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1451:6: ( '\\u2070' .. '\\u218F' )
                    {
                    if ( (input.LA(1) >= '\u2070' && input.LA(1) <= '\u218F') ) {
                        input.consume();
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 11 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1451:29: ( '\\u2C00' .. '\\u2FEF' )
                    {
                    if ( (input.LA(1) >= '\u2C00' && input.LA(1) <= '\u2FEF') ) {
                        input.consume();
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 12 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1451:52: ( '\\u3001' .. '\\uD7FF' )
                    {
                    if ( (input.LA(1) >= '\u3001' && input.LA(1) <= '\uD7FF') ) {
                        input.consume();
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 13 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1452:6: ( '\\uF900' .. '\\uFDCF' )
                    {
                    if ( (input.LA(1) >= '\uF900' && input.LA(1) <= '\uFDCF') ) {
                        input.consume();
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 14 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1452:29: ( '\\uFDF0' .. '\\uFFFD' )
                    {
                    if ( (input.LA(1) >= '\uFDF0' && input.LA(1) <= '\uFFFD') ) {
                        input.consume();
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PN_CHARS_BASE"

    // $ANTLR start "PN_CHARS_U"
    public final void mPN_CHARS_U() throws RecognitionException {
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1457:2: ( ( PN_CHARS_BASE | '_' ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1457:6: ( PN_CHARS_BASE | '_' )
            {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1457:6: ( PN_CHARS_BASE | '_' )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0 >= 'A' && LA32_0 <= 'Z')||LA32_0=='\\'||(LA32_0 >= 'a' && LA32_0 <= 'z')||(LA32_0 >= '\u00C0' && LA32_0 <= '\u00D6')||(LA32_0 >= '\u00D8' && LA32_0 <= '\u00F6')||(LA32_0 >= '\u00F8' && LA32_0 <= '\u02FF')||(LA32_0 >= '\u0370' && LA32_0 <= '\u037D')||(LA32_0 >= '\u037F' && LA32_0 <= '\u1FFF')||(LA32_0 >= '\u200C' && LA32_0 <= '\u200D')||(LA32_0 >= '\u2070' && LA32_0 <= '\u218F')||(LA32_0 >= '\u2C00' && LA32_0 <= '\u2FEF')||(LA32_0 >= '\u3001' && LA32_0 <= '\uD7FF')||(LA32_0 >= '\uF900' && LA32_0 <= '\uFDCF')||(LA32_0 >= '\uFDF0' && LA32_0 <= '\uFFFD')) ) {
                alt32=1;
            }
            else if ( (LA32_0=='_') ) {
                alt32=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;

            }
            switch (alt32) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1457:8: PN_CHARS_BASE
                    {
                    mPN_CHARS_BASE(); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1457:24: '_'
                    {
                    match('_'); if (state.failed) return ;

                    }
                    break;

            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PN_CHARS_U"

    // $ANTLR start "VARNAME"
    public final void mVARNAME() throws RecognitionException {
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1462:2: ( ( PN_CHARS_U | ( '0' .. '9' ) ) ( PN_CHARS_U | ( '0' .. '9' ) | '\\u00B7' | ( '\\u0300' .. '\\u036F' ) | ( '\\u203F' .. '\\u2040' ) )* )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1462:6: ( PN_CHARS_U | ( '0' .. '9' ) ) ( PN_CHARS_U | ( '0' .. '9' ) | '\\u00B7' | ( '\\u0300' .. '\\u036F' ) | ( '\\u203F' .. '\\u2040' ) )*
            {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1462:6: ( PN_CHARS_U | ( '0' .. '9' ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0 >= 'A' && LA33_0 <= 'Z')||LA33_0=='\\'||LA33_0=='_'||(LA33_0 >= 'a' && LA33_0 <= 'z')||(LA33_0 >= '\u00C0' && LA33_0 <= '\u00D6')||(LA33_0 >= '\u00D8' && LA33_0 <= '\u00F6')||(LA33_0 >= '\u00F8' && LA33_0 <= '\u02FF')||(LA33_0 >= '\u0370' && LA33_0 <= '\u037D')||(LA33_0 >= '\u037F' && LA33_0 <= '\u1FFF')||(LA33_0 >= '\u200C' && LA33_0 <= '\u200D')||(LA33_0 >= '\u2070' && LA33_0 <= '\u218F')||(LA33_0 >= '\u2C00' && LA33_0 <= '\u2FEF')||(LA33_0 >= '\u3001' && LA33_0 <= '\uD7FF')||(LA33_0 >= '\uF900' && LA33_0 <= '\uFDCF')||(LA33_0 >= '\uFDF0' && LA33_0 <= '\uFFFD')) ) {
                alt33=1;
            }
            else if ( ((LA33_0 >= '0' && LA33_0 <= '9')) ) {
                alt33=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;

            }
            switch (alt33) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1462:8: PN_CHARS_U
                    {
                    mPN_CHARS_U(); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1462:21: ( '0' .. '9' )
                    {
                    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                        input.consume();
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }


            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1463:6: ( PN_CHARS_U | ( '0' .. '9' ) | '\\u00B7' | ( '\\u0300' .. '\\u036F' ) | ( '\\u203F' .. '\\u2040' ) )*
            loop34:
            do {
                int alt34=6;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0 >= 'A' && LA34_0 <= 'Z')||LA34_0=='\\'||LA34_0=='_'||(LA34_0 >= 'a' && LA34_0 <= 'z')||(LA34_0 >= '\u00C0' && LA34_0 <= '\u00D6')||(LA34_0 >= '\u00D8' && LA34_0 <= '\u00F6')||(LA34_0 >= '\u00F8' && LA34_0 <= '\u02FF')||(LA34_0 >= '\u0370' && LA34_0 <= '\u037D')||(LA34_0 >= '\u037F' && LA34_0 <= '\u1FFF')||(LA34_0 >= '\u200C' && LA34_0 <= '\u200D')||(LA34_0 >= '\u2070' && LA34_0 <= '\u218F')||(LA34_0 >= '\u2C00' && LA34_0 <= '\u2FEF')||(LA34_0 >= '\u3001' && LA34_0 <= '\uD7FF')||(LA34_0 >= '\uF900' && LA34_0 <= '\uFDCF')||(LA34_0 >= '\uFDF0' && LA34_0 <= '\uFFFD')) ) {
                    alt34=1;
                }
                else if ( ((LA34_0 >= '0' && LA34_0 <= '9')) ) {
                    alt34=2;
                }
                else if ( (LA34_0=='\u00B7') ) {
                    alt34=3;
                }
                else if ( ((LA34_0 >= '\u0300' && LA34_0 <= '\u036F')) ) {
                    alt34=4;
                }
                else if ( ((LA34_0 >= '\u203F' && LA34_0 <= '\u2040')) ) {
                    alt34=5;
                }


                switch (alt34) {
            	case 1 :
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1463:8: PN_CHARS_U
            	    {
            	    mPN_CHARS_U(); if (state.failed) return ;


            	    }
            	    break;
            	case 2 :
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1463:21: ( '0' .. '9' )
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;
            	case 3 :
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1463:34: '\\u00B7'
            	    {
            	    match('\u00B7'); if (state.failed) return ;

            	    }
            	    break;
            	case 4 :
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1463:45: ( '\\u0300' .. '\\u036F' )
            	    {
            	    if ( (input.LA(1) >= '\u0300' && input.LA(1) <= '\u036F') ) {
            	        input.consume();
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;
            	case 5 :
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1463:68: ( '\\u203F' .. '\\u2040' )
            	    {
            	    if ( (input.LA(1) >= '\u203F' && input.LA(1) <= '\u2040') ) {
            	        input.consume();
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VARNAME"

    // $ANTLR start "PN_CHARS"
    public final void mPN_CHARS() throws RecognitionException {
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1468:2: ( PN_CHARS_U | '-' | ( '0' .. '9' ) | '\\u00B7' | ( '\\u0300' .. '\\u036F' ) | ( '\\u203F' .. '\\u2040' ) )
            int alt35=6;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0 >= 'A' && LA35_0 <= 'Z')||LA35_0=='\\'||LA35_0=='_'||(LA35_0 >= 'a' && LA35_0 <= 'z')||(LA35_0 >= '\u00C0' && LA35_0 <= '\u00D6')||(LA35_0 >= '\u00D8' && LA35_0 <= '\u00F6')||(LA35_0 >= '\u00F8' && LA35_0 <= '\u02FF')||(LA35_0 >= '\u0370' && LA35_0 <= '\u037D')||(LA35_0 >= '\u037F' && LA35_0 <= '\u1FFF')||(LA35_0 >= '\u200C' && LA35_0 <= '\u200D')||(LA35_0 >= '\u2070' && LA35_0 <= '\u218F')||(LA35_0 >= '\u2C00' && LA35_0 <= '\u2FEF')||(LA35_0 >= '\u3001' && LA35_0 <= '\uD7FF')||(LA35_0 >= '\uF900' && LA35_0 <= '\uFDCF')||(LA35_0 >= '\uFDF0' && LA35_0 <= '\uFFFD')) ) {
                alt35=1;
            }
            else if ( (LA35_0=='-') ) {
                alt35=2;
            }
            else if ( ((LA35_0 >= '0' && LA35_0 <= '9')) ) {
                alt35=3;
            }
            else if ( (LA35_0=='\u00B7') ) {
                alt35=4;
            }
            else if ( ((LA35_0 >= '\u0300' && LA35_0 <= '\u036F')) ) {
                alt35=5;
            }
            else if ( ((LA35_0 >= '\u203F' && LA35_0 <= '\u2040')) ) {
                alt35=6;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;

            }
            switch (alt35) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1468:6: PN_CHARS_U
                    {
                    mPN_CHARS_U(); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1468:19: '-'
                    {
                    match('-'); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1468:25: ( '0' .. '9' )
                    {
                    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                        input.consume();
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 4 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1468:38: '\\u00B7'
                    {
                    match('\u00B7'); if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1468:49: ( '\\u0300' .. '\\u036F' )
                    {
                    if ( (input.LA(1) >= '\u0300' && input.LA(1) <= '\u036F') ) {
                        input.consume();
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 6 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1468:72: ( '\\u203F' .. '\\u2040' )
                    {
                    if ( (input.LA(1) >= '\u203F' && input.LA(1) <= '\u2040') ) {
                        input.consume();
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PN_CHARS"

    // $ANTLR start "PN_PREFIX"
    public final void mPN_PREFIX() throws RecognitionException {
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1473:2: ( PN_CHARS_BASE ( ( PN_CHARS | DOT )* PN_CHARS )? )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1473:6: PN_CHARS_BASE ( ( PN_CHARS | DOT )* PN_CHARS )?
            {
            mPN_CHARS_BASE(); if (state.failed) return ;


            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1473:20: ( ( PN_CHARS | DOT )* PN_CHARS )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0 >= '-' && LA37_0 <= '.')||(LA37_0 >= '0' && LA37_0 <= '9')||(LA37_0 >= 'A' && LA37_0 <= 'Z')||LA37_0=='\\'||LA37_0=='_'||(LA37_0 >= 'a' && LA37_0 <= 'z')||LA37_0=='\u00B7'||(LA37_0 >= '\u00C0' && LA37_0 <= '\u00D6')||(LA37_0 >= '\u00D8' && LA37_0 <= '\u00F6')||(LA37_0 >= '\u00F8' && LA37_0 <= '\u037D')||(LA37_0 >= '\u037F' && LA37_0 <= '\u1FFF')||(LA37_0 >= '\u200C' && LA37_0 <= '\u200D')||(LA37_0 >= '\u203F' && LA37_0 <= '\u2040')||(LA37_0 >= '\u2070' && LA37_0 <= '\u218F')||(LA37_0 >= '\u2C00' && LA37_0 <= '\u2FEF')||(LA37_0 >= '\u3001' && LA37_0 <= '\uD7FF')||(LA37_0 >= '\uF900' && LA37_0 <= '\uFDCF')||(LA37_0 >= '\uFDF0' && LA37_0 <= '\uFFFD')) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1473:21: ( PN_CHARS | DOT )* PN_CHARS
                    {
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1473:21: ( PN_CHARS | DOT )*
                    loop36:
                    do {
                        int alt36=3;
                        int LA36_0 = input.LA(1);

                        if ( ((LA36_0 >= 'A' && LA36_0 <= 'Z')) ) {
                            int LA36_1 = input.LA(2);

                            if ( ((LA36_1 >= '-' && LA36_1 <= '.')||(LA36_1 >= '0' && LA36_1 <= '9')||(LA36_1 >= 'A' && LA36_1 <= 'Z')||LA36_1=='\\'||LA36_1=='_'||(LA36_1 >= 'a' && LA36_1 <= 'z')||LA36_1=='\u00B7'||(LA36_1 >= '\u00C0' && LA36_1 <= '\u00D6')||(LA36_1 >= '\u00D8' && LA36_1 <= '\u00F6')||(LA36_1 >= '\u00F8' && LA36_1 <= '\u037D')||(LA36_1 >= '\u037F' && LA36_1 <= '\u1FFF')||(LA36_1 >= '\u200C' && LA36_1 <= '\u200D')||(LA36_1 >= '\u203F' && LA36_1 <= '\u2040')||(LA36_1 >= '\u2070' && LA36_1 <= '\u218F')||(LA36_1 >= '\u2C00' && LA36_1 <= '\u2FEF')||(LA36_1 >= '\u3001' && LA36_1 <= '\uD7FF')||(LA36_1 >= '\uF900' && LA36_1 <= '\uFDCF')||(LA36_1 >= '\uFDF0' && LA36_1 <= '\uFFFD')) ) {
                                alt36=1;
                            }


                        }
                        else if ( ((LA36_0 >= 'a' && LA36_0 <= 'z')) ) {
                            int LA36_2 = input.LA(2);

                            if ( ((LA36_2 >= '-' && LA36_2 <= '.')||(LA36_2 >= '0' && LA36_2 <= '9')||(LA36_2 >= 'A' && LA36_2 <= 'Z')||LA36_2=='\\'||LA36_2=='_'||(LA36_2 >= 'a' && LA36_2 <= 'z')||LA36_2=='\u00B7'||(LA36_2 >= '\u00C0' && LA36_2 <= '\u00D6')||(LA36_2 >= '\u00D8' && LA36_2 <= '\u00F6')||(LA36_2 >= '\u00F8' && LA36_2 <= '\u037D')||(LA36_2 >= '\u037F' && LA36_2 <= '\u1FFF')||(LA36_2 >= '\u200C' && LA36_2 <= '\u200D')||(LA36_2 >= '\u203F' && LA36_2 <= '\u2040')||(LA36_2 >= '\u2070' && LA36_2 <= '\u218F')||(LA36_2 >= '\u2C00' && LA36_2 <= '\u2FEF')||(LA36_2 >= '\u3001' && LA36_2 <= '\uD7FF')||(LA36_2 >= '\uF900' && LA36_2 <= '\uFDCF')||(LA36_2 >= '\uFDF0' && LA36_2 <= '\uFFFD')) ) {
                                alt36=1;
                            }


                        }
                        else if ( (LA36_0=='\\') ) {
                            int LA36_3 = input.LA(2);

                            if ( (LA36_3=='u') ) {
                                int LA36_24 = input.LA(3);

                                if ( ((LA36_24 >= '0' && LA36_24 <= '9')||(LA36_24 >= 'A' && LA36_24 <= 'F')||(LA36_24 >= 'a' && LA36_24 <= 'f')) ) {
                                    int LA36_25 = input.LA(4);

                                    if ( ((LA36_25 >= '0' && LA36_25 <= '9')||(LA36_25 >= 'A' && LA36_25 <= 'F')||(LA36_25 >= 'a' && LA36_25 <= 'f')) ) {
                                        int LA36_26 = input.LA(5);

                                        if ( ((LA36_26 >= '0' && LA36_26 <= '9')||(LA36_26 >= 'A' && LA36_26 <= 'F')||(LA36_26 >= 'a' && LA36_26 <= 'f')) ) {
                                            int LA36_27 = input.LA(6);

                                            if ( ((LA36_27 >= '0' && LA36_27 <= '9')||(LA36_27 >= 'A' && LA36_27 <= 'F')||(LA36_27 >= 'a' && LA36_27 <= 'f')) ) {
                                                int LA36_28 = input.LA(7);

                                                if ( ((LA36_28 >= '-' && LA36_28 <= '.')||(LA36_28 >= '0' && LA36_28 <= '9')||(LA36_28 >= 'A' && LA36_28 <= 'Z')||LA36_28=='\\'||LA36_28=='_'||(LA36_28 >= 'a' && LA36_28 <= 'z')||LA36_28=='\u00B7'||(LA36_28 >= '\u00C0' && LA36_28 <= '\u00D6')||(LA36_28 >= '\u00D8' && LA36_28 <= '\u00F6')||(LA36_28 >= '\u00F8' && LA36_28 <= '\u037D')||(LA36_28 >= '\u037F' && LA36_28 <= '\u1FFF')||(LA36_28 >= '\u200C' && LA36_28 <= '\u200D')||(LA36_28 >= '\u203F' && LA36_28 <= '\u2040')||(LA36_28 >= '\u2070' && LA36_28 <= '\u218F')||(LA36_28 >= '\u2C00' && LA36_28 <= '\u2FEF')||(LA36_28 >= '\u3001' && LA36_28 <= '\uD7FF')||(LA36_28 >= '\uF900' && LA36_28 <= '\uFDCF')||(LA36_28 >= '\uFDF0' && LA36_28 <= '\uFFFD')) ) {
                                                    alt36=1;
                                                }


                                            }


                                        }


                                    }


                                }


                            }


                        }
                        else if ( ((LA36_0 >= '\u00C0' && LA36_0 <= '\u00D6')) ) {
                            int LA36_4 = input.LA(2);

                            if ( ((LA36_4 >= '-' && LA36_4 <= '.')||(LA36_4 >= '0' && LA36_4 <= '9')||(LA36_4 >= 'A' && LA36_4 <= 'Z')||LA36_4=='\\'||LA36_4=='_'||(LA36_4 >= 'a' && LA36_4 <= 'z')||LA36_4=='\u00B7'||(LA36_4 >= '\u00C0' && LA36_4 <= '\u00D6')||(LA36_4 >= '\u00D8' && LA36_4 <= '\u00F6')||(LA36_4 >= '\u00F8' && LA36_4 <= '\u037D')||(LA36_4 >= '\u037F' && LA36_4 <= '\u1FFF')||(LA36_4 >= '\u200C' && LA36_4 <= '\u200D')||(LA36_4 >= '\u203F' && LA36_4 <= '\u2040')||(LA36_4 >= '\u2070' && LA36_4 <= '\u218F')||(LA36_4 >= '\u2C00' && LA36_4 <= '\u2FEF')||(LA36_4 >= '\u3001' && LA36_4 <= '\uD7FF')||(LA36_4 >= '\uF900' && LA36_4 <= '\uFDCF')||(LA36_4 >= '\uFDF0' && LA36_4 <= '\uFFFD')) ) {
                                alt36=1;
                            }


                        }
                        else if ( ((LA36_0 >= '\u00D8' && LA36_0 <= '\u00F6')) ) {
                            int LA36_5 = input.LA(2);

                            if ( ((LA36_5 >= '-' && LA36_5 <= '.')||(LA36_5 >= '0' && LA36_5 <= '9')||(LA36_5 >= 'A' && LA36_5 <= 'Z')||LA36_5=='\\'||LA36_5=='_'||(LA36_5 >= 'a' && LA36_5 <= 'z')||LA36_5=='\u00B7'||(LA36_5 >= '\u00C0' && LA36_5 <= '\u00D6')||(LA36_5 >= '\u00D8' && LA36_5 <= '\u00F6')||(LA36_5 >= '\u00F8' && LA36_5 <= '\u037D')||(LA36_5 >= '\u037F' && LA36_5 <= '\u1FFF')||(LA36_5 >= '\u200C' && LA36_5 <= '\u200D')||(LA36_5 >= '\u203F' && LA36_5 <= '\u2040')||(LA36_5 >= '\u2070' && LA36_5 <= '\u218F')||(LA36_5 >= '\u2C00' && LA36_5 <= '\u2FEF')||(LA36_5 >= '\u3001' && LA36_5 <= '\uD7FF')||(LA36_5 >= '\uF900' && LA36_5 <= '\uFDCF')||(LA36_5 >= '\uFDF0' && LA36_5 <= '\uFFFD')) ) {
                                alt36=1;
                            }


                        }
                        else if ( ((LA36_0 >= '\u00F8' && LA36_0 <= '\u02FF')) ) {
                            int LA36_6 = input.LA(2);

                            if ( ((LA36_6 >= '-' && LA36_6 <= '.')||(LA36_6 >= '0' && LA36_6 <= '9')||(LA36_6 >= 'A' && LA36_6 <= 'Z')||LA36_6=='\\'||LA36_6=='_'||(LA36_6 >= 'a' && LA36_6 <= 'z')||LA36_6=='\u00B7'||(LA36_6 >= '\u00C0' && LA36_6 <= '\u00D6')||(LA36_6 >= '\u00D8' && LA36_6 <= '\u00F6')||(LA36_6 >= '\u00F8' && LA36_6 <= '\u037D')||(LA36_6 >= '\u037F' && LA36_6 <= '\u1FFF')||(LA36_6 >= '\u200C' && LA36_6 <= '\u200D')||(LA36_6 >= '\u203F' && LA36_6 <= '\u2040')||(LA36_6 >= '\u2070' && LA36_6 <= '\u218F')||(LA36_6 >= '\u2C00' && LA36_6 <= '\u2FEF')||(LA36_6 >= '\u3001' && LA36_6 <= '\uD7FF')||(LA36_6 >= '\uF900' && LA36_6 <= '\uFDCF')||(LA36_6 >= '\uFDF0' && LA36_6 <= '\uFFFD')) ) {
                                alt36=1;
                            }


                        }
                        else if ( ((LA36_0 >= '\u0370' && LA36_0 <= '\u037D')) ) {
                            int LA36_7 = input.LA(2);

                            if ( ((LA36_7 >= '-' && LA36_7 <= '.')||(LA36_7 >= '0' && LA36_7 <= '9')||(LA36_7 >= 'A' && LA36_7 <= 'Z')||LA36_7=='\\'||LA36_7=='_'||(LA36_7 >= 'a' && LA36_7 <= 'z')||LA36_7=='\u00B7'||(LA36_7 >= '\u00C0' && LA36_7 <= '\u00D6')||(LA36_7 >= '\u00D8' && LA36_7 <= '\u00F6')||(LA36_7 >= '\u00F8' && LA36_7 <= '\u037D')||(LA36_7 >= '\u037F' && LA36_7 <= '\u1FFF')||(LA36_7 >= '\u200C' && LA36_7 <= '\u200D')||(LA36_7 >= '\u203F' && LA36_7 <= '\u2040')||(LA36_7 >= '\u2070' && LA36_7 <= '\u218F')||(LA36_7 >= '\u2C00' && LA36_7 <= '\u2FEF')||(LA36_7 >= '\u3001' && LA36_7 <= '\uD7FF')||(LA36_7 >= '\uF900' && LA36_7 <= '\uFDCF')||(LA36_7 >= '\uFDF0' && LA36_7 <= '\uFFFD')) ) {
                                alt36=1;
                            }


                        }
                        else if ( ((LA36_0 >= '\u037F' && LA36_0 <= '\u1FFF')) ) {
                            int LA36_8 = input.LA(2);

                            if ( ((LA36_8 >= '-' && LA36_8 <= '.')||(LA36_8 >= '0' && LA36_8 <= '9')||(LA36_8 >= 'A' && LA36_8 <= 'Z')||LA36_8=='\\'||LA36_8=='_'||(LA36_8 >= 'a' && LA36_8 <= 'z')||LA36_8=='\u00B7'||(LA36_8 >= '\u00C0' && LA36_8 <= '\u00D6')||(LA36_8 >= '\u00D8' && LA36_8 <= '\u00F6')||(LA36_8 >= '\u00F8' && LA36_8 <= '\u037D')||(LA36_8 >= '\u037F' && LA36_8 <= '\u1FFF')||(LA36_8 >= '\u200C' && LA36_8 <= '\u200D')||(LA36_8 >= '\u203F' && LA36_8 <= '\u2040')||(LA36_8 >= '\u2070' && LA36_8 <= '\u218F')||(LA36_8 >= '\u2C00' && LA36_8 <= '\u2FEF')||(LA36_8 >= '\u3001' && LA36_8 <= '\uD7FF')||(LA36_8 >= '\uF900' && LA36_8 <= '\uFDCF')||(LA36_8 >= '\uFDF0' && LA36_8 <= '\uFFFD')) ) {
                                alt36=1;
                            }


                        }
                        else if ( ((LA36_0 >= '\u200C' && LA36_0 <= '\u200D')) ) {
                            int LA36_9 = input.LA(2);

                            if ( ((LA36_9 >= '-' && LA36_9 <= '.')||(LA36_9 >= '0' && LA36_9 <= '9')||(LA36_9 >= 'A' && LA36_9 <= 'Z')||LA36_9=='\\'||LA36_9=='_'||(LA36_9 >= 'a' && LA36_9 <= 'z')||LA36_9=='\u00B7'||(LA36_9 >= '\u00C0' && LA36_9 <= '\u00D6')||(LA36_9 >= '\u00D8' && LA36_9 <= '\u00F6')||(LA36_9 >= '\u00F8' && LA36_9 <= '\u037D')||(LA36_9 >= '\u037F' && LA36_9 <= '\u1FFF')||(LA36_9 >= '\u200C' && LA36_9 <= '\u200D')||(LA36_9 >= '\u203F' && LA36_9 <= '\u2040')||(LA36_9 >= '\u2070' && LA36_9 <= '\u218F')||(LA36_9 >= '\u2C00' && LA36_9 <= '\u2FEF')||(LA36_9 >= '\u3001' && LA36_9 <= '\uD7FF')||(LA36_9 >= '\uF900' && LA36_9 <= '\uFDCF')||(LA36_9 >= '\uFDF0' && LA36_9 <= '\uFFFD')) ) {
                                alt36=1;
                            }


                        }
                        else if ( ((LA36_0 >= '\u2070' && LA36_0 <= '\u218F')) ) {
                            int LA36_10 = input.LA(2);

                            if ( ((LA36_10 >= '-' && LA36_10 <= '.')||(LA36_10 >= '0' && LA36_10 <= '9')||(LA36_10 >= 'A' && LA36_10 <= 'Z')||LA36_10=='\\'||LA36_10=='_'||(LA36_10 >= 'a' && LA36_10 <= 'z')||LA36_10=='\u00B7'||(LA36_10 >= '\u00C0' && LA36_10 <= '\u00D6')||(LA36_10 >= '\u00D8' && LA36_10 <= '\u00F6')||(LA36_10 >= '\u00F8' && LA36_10 <= '\u037D')||(LA36_10 >= '\u037F' && LA36_10 <= '\u1FFF')||(LA36_10 >= '\u200C' && LA36_10 <= '\u200D')||(LA36_10 >= '\u203F' && LA36_10 <= '\u2040')||(LA36_10 >= '\u2070' && LA36_10 <= '\u218F')||(LA36_10 >= '\u2C00' && LA36_10 <= '\u2FEF')||(LA36_10 >= '\u3001' && LA36_10 <= '\uD7FF')||(LA36_10 >= '\uF900' && LA36_10 <= '\uFDCF')||(LA36_10 >= '\uFDF0' && LA36_10 <= '\uFFFD')) ) {
                                alt36=1;
                            }


                        }
                        else if ( ((LA36_0 >= '\u2C00' && LA36_0 <= '\u2FEF')) ) {
                            int LA36_11 = input.LA(2);

                            if ( ((LA36_11 >= '-' && LA36_11 <= '.')||(LA36_11 >= '0' && LA36_11 <= '9')||(LA36_11 >= 'A' && LA36_11 <= 'Z')||LA36_11=='\\'||LA36_11=='_'||(LA36_11 >= 'a' && LA36_11 <= 'z')||LA36_11=='\u00B7'||(LA36_11 >= '\u00C0' && LA36_11 <= '\u00D6')||(LA36_11 >= '\u00D8' && LA36_11 <= '\u00F6')||(LA36_11 >= '\u00F8' && LA36_11 <= '\u037D')||(LA36_11 >= '\u037F' && LA36_11 <= '\u1FFF')||(LA36_11 >= '\u200C' && LA36_11 <= '\u200D')||(LA36_11 >= '\u203F' && LA36_11 <= '\u2040')||(LA36_11 >= '\u2070' && LA36_11 <= '\u218F')||(LA36_11 >= '\u2C00' && LA36_11 <= '\u2FEF')||(LA36_11 >= '\u3001' && LA36_11 <= '\uD7FF')||(LA36_11 >= '\uF900' && LA36_11 <= '\uFDCF')||(LA36_11 >= '\uFDF0' && LA36_11 <= '\uFFFD')) ) {
                                alt36=1;
                            }


                        }
                        else if ( ((LA36_0 >= '\u3001' && LA36_0 <= '\uD7FF')) ) {
                            int LA36_12 = input.LA(2);

                            if ( ((LA36_12 >= '-' && LA36_12 <= '.')||(LA36_12 >= '0' && LA36_12 <= '9')||(LA36_12 >= 'A' && LA36_12 <= 'Z')||LA36_12=='\\'||LA36_12=='_'||(LA36_12 >= 'a' && LA36_12 <= 'z')||LA36_12=='\u00B7'||(LA36_12 >= '\u00C0' && LA36_12 <= '\u00D6')||(LA36_12 >= '\u00D8' && LA36_12 <= '\u00F6')||(LA36_12 >= '\u00F8' && LA36_12 <= '\u037D')||(LA36_12 >= '\u037F' && LA36_12 <= '\u1FFF')||(LA36_12 >= '\u200C' && LA36_12 <= '\u200D')||(LA36_12 >= '\u203F' && LA36_12 <= '\u2040')||(LA36_12 >= '\u2070' && LA36_12 <= '\u218F')||(LA36_12 >= '\u2C00' && LA36_12 <= '\u2FEF')||(LA36_12 >= '\u3001' && LA36_12 <= '\uD7FF')||(LA36_12 >= '\uF900' && LA36_12 <= '\uFDCF')||(LA36_12 >= '\uFDF0' && LA36_12 <= '\uFFFD')) ) {
                                alt36=1;
                            }


                        }
                        else if ( ((LA36_0 >= '\uF900' && LA36_0 <= '\uFDCF')) ) {
                            int LA36_13 = input.LA(2);

                            if ( ((LA36_13 >= '-' && LA36_13 <= '.')||(LA36_13 >= '0' && LA36_13 <= '9')||(LA36_13 >= 'A' && LA36_13 <= 'Z')||LA36_13=='\\'||LA36_13=='_'||(LA36_13 >= 'a' && LA36_13 <= 'z')||LA36_13=='\u00B7'||(LA36_13 >= '\u00C0' && LA36_13 <= '\u00D6')||(LA36_13 >= '\u00D8' && LA36_13 <= '\u00F6')||(LA36_13 >= '\u00F8' && LA36_13 <= '\u037D')||(LA36_13 >= '\u037F' && LA36_13 <= '\u1FFF')||(LA36_13 >= '\u200C' && LA36_13 <= '\u200D')||(LA36_13 >= '\u203F' && LA36_13 <= '\u2040')||(LA36_13 >= '\u2070' && LA36_13 <= '\u218F')||(LA36_13 >= '\u2C00' && LA36_13 <= '\u2FEF')||(LA36_13 >= '\u3001' && LA36_13 <= '\uD7FF')||(LA36_13 >= '\uF900' && LA36_13 <= '\uFDCF')||(LA36_13 >= '\uFDF0' && LA36_13 <= '\uFFFD')) ) {
                                alt36=1;
                            }


                        }
                        else if ( ((LA36_0 >= '\uFDF0' && LA36_0 <= '\uFFFD')) ) {
                            int LA36_14 = input.LA(2);

                            if ( ((LA36_14 >= '-' && LA36_14 <= '.')||(LA36_14 >= '0' && LA36_14 <= '9')||(LA36_14 >= 'A' && LA36_14 <= 'Z')||LA36_14=='\\'||LA36_14=='_'||(LA36_14 >= 'a' && LA36_14 <= 'z')||LA36_14=='\u00B7'||(LA36_14 >= '\u00C0' && LA36_14 <= '\u00D6')||(LA36_14 >= '\u00D8' && LA36_14 <= '\u00F6')||(LA36_14 >= '\u00F8' && LA36_14 <= '\u037D')||(LA36_14 >= '\u037F' && LA36_14 <= '\u1FFF')||(LA36_14 >= '\u200C' && LA36_14 <= '\u200D')||(LA36_14 >= '\u203F' && LA36_14 <= '\u2040')||(LA36_14 >= '\u2070' && LA36_14 <= '\u218F')||(LA36_14 >= '\u2C00' && LA36_14 <= '\u2FEF')||(LA36_14 >= '\u3001' && LA36_14 <= '\uD7FF')||(LA36_14 >= '\uF900' && LA36_14 <= '\uFDCF')||(LA36_14 >= '\uFDF0' && LA36_14 <= '\uFFFD')) ) {
                                alt36=1;
                            }


                        }
                        else if ( (LA36_0=='_') ) {
                            int LA36_15 = input.LA(2);

                            if ( ((LA36_15 >= '-' && LA36_15 <= '.')||(LA36_15 >= '0' && LA36_15 <= '9')||(LA36_15 >= 'A' && LA36_15 <= 'Z')||LA36_15=='\\'||LA36_15=='_'||(LA36_15 >= 'a' && LA36_15 <= 'z')||LA36_15=='\u00B7'||(LA36_15 >= '\u00C0' && LA36_15 <= '\u00D6')||(LA36_15 >= '\u00D8' && LA36_15 <= '\u00F6')||(LA36_15 >= '\u00F8' && LA36_15 <= '\u037D')||(LA36_15 >= '\u037F' && LA36_15 <= '\u1FFF')||(LA36_15 >= '\u200C' && LA36_15 <= '\u200D')||(LA36_15 >= '\u203F' && LA36_15 <= '\u2040')||(LA36_15 >= '\u2070' && LA36_15 <= '\u218F')||(LA36_15 >= '\u2C00' && LA36_15 <= '\u2FEF')||(LA36_15 >= '\u3001' && LA36_15 <= '\uD7FF')||(LA36_15 >= '\uF900' && LA36_15 <= '\uFDCF')||(LA36_15 >= '\uFDF0' && LA36_15 <= '\uFFFD')) ) {
                                alt36=1;
                            }


                        }
                        else if ( (LA36_0=='-') ) {
                            int LA36_16 = input.LA(2);

                            if ( ((LA36_16 >= '-' && LA36_16 <= '.')||(LA36_16 >= '0' && LA36_16 <= '9')||(LA36_16 >= 'A' && LA36_16 <= 'Z')||LA36_16=='\\'||LA36_16=='_'||(LA36_16 >= 'a' && LA36_16 <= 'z')||LA36_16=='\u00B7'||(LA36_16 >= '\u00C0' && LA36_16 <= '\u00D6')||(LA36_16 >= '\u00D8' && LA36_16 <= '\u00F6')||(LA36_16 >= '\u00F8' && LA36_16 <= '\u037D')||(LA36_16 >= '\u037F' && LA36_16 <= '\u1FFF')||(LA36_16 >= '\u200C' && LA36_16 <= '\u200D')||(LA36_16 >= '\u203F' && LA36_16 <= '\u2040')||(LA36_16 >= '\u2070' && LA36_16 <= '\u218F')||(LA36_16 >= '\u2C00' && LA36_16 <= '\u2FEF')||(LA36_16 >= '\u3001' && LA36_16 <= '\uD7FF')||(LA36_16 >= '\uF900' && LA36_16 <= '\uFDCF')||(LA36_16 >= '\uFDF0' && LA36_16 <= '\uFFFD')) ) {
                                alt36=1;
                            }


                        }
                        else if ( ((LA36_0 >= '0' && LA36_0 <= '9')) ) {
                            int LA36_17 = input.LA(2);

                            if ( ((LA36_17 >= '-' && LA36_17 <= '.')||(LA36_17 >= '0' && LA36_17 <= '9')||(LA36_17 >= 'A' && LA36_17 <= 'Z')||LA36_17=='\\'||LA36_17=='_'||(LA36_17 >= 'a' && LA36_17 <= 'z')||LA36_17=='\u00B7'||(LA36_17 >= '\u00C0' && LA36_17 <= '\u00D6')||(LA36_17 >= '\u00D8' && LA36_17 <= '\u00F6')||(LA36_17 >= '\u00F8' && LA36_17 <= '\u037D')||(LA36_17 >= '\u037F' && LA36_17 <= '\u1FFF')||(LA36_17 >= '\u200C' && LA36_17 <= '\u200D')||(LA36_17 >= '\u203F' && LA36_17 <= '\u2040')||(LA36_17 >= '\u2070' && LA36_17 <= '\u218F')||(LA36_17 >= '\u2C00' && LA36_17 <= '\u2FEF')||(LA36_17 >= '\u3001' && LA36_17 <= '\uD7FF')||(LA36_17 >= '\uF900' && LA36_17 <= '\uFDCF')||(LA36_17 >= '\uFDF0' && LA36_17 <= '\uFFFD')) ) {
                                alt36=1;
                            }


                        }
                        else if ( (LA36_0=='\u00B7') ) {
                            int LA36_18 = input.LA(2);

                            if ( ((LA36_18 >= '-' && LA36_18 <= '.')||(LA36_18 >= '0' && LA36_18 <= '9')||(LA36_18 >= 'A' && LA36_18 <= 'Z')||LA36_18=='\\'||LA36_18=='_'||(LA36_18 >= 'a' && LA36_18 <= 'z')||LA36_18=='\u00B7'||(LA36_18 >= '\u00C0' && LA36_18 <= '\u00D6')||(LA36_18 >= '\u00D8' && LA36_18 <= '\u00F6')||(LA36_18 >= '\u00F8' && LA36_18 <= '\u037D')||(LA36_18 >= '\u037F' && LA36_18 <= '\u1FFF')||(LA36_18 >= '\u200C' && LA36_18 <= '\u200D')||(LA36_18 >= '\u203F' && LA36_18 <= '\u2040')||(LA36_18 >= '\u2070' && LA36_18 <= '\u218F')||(LA36_18 >= '\u2C00' && LA36_18 <= '\u2FEF')||(LA36_18 >= '\u3001' && LA36_18 <= '\uD7FF')||(LA36_18 >= '\uF900' && LA36_18 <= '\uFDCF')||(LA36_18 >= '\uFDF0' && LA36_18 <= '\uFFFD')) ) {
                                alt36=1;
                            }


                        }
                        else if ( ((LA36_0 >= '\u0300' && LA36_0 <= '\u036F')) ) {
                            int LA36_19 = input.LA(2);

                            if ( ((LA36_19 >= '-' && LA36_19 <= '.')||(LA36_19 >= '0' && LA36_19 <= '9')||(LA36_19 >= 'A' && LA36_19 <= 'Z')||LA36_19=='\\'||LA36_19=='_'||(LA36_19 >= 'a' && LA36_19 <= 'z')||LA36_19=='\u00B7'||(LA36_19 >= '\u00C0' && LA36_19 <= '\u00D6')||(LA36_19 >= '\u00D8' && LA36_19 <= '\u00F6')||(LA36_19 >= '\u00F8' && LA36_19 <= '\u037D')||(LA36_19 >= '\u037F' && LA36_19 <= '\u1FFF')||(LA36_19 >= '\u200C' && LA36_19 <= '\u200D')||(LA36_19 >= '\u203F' && LA36_19 <= '\u2040')||(LA36_19 >= '\u2070' && LA36_19 <= '\u218F')||(LA36_19 >= '\u2C00' && LA36_19 <= '\u2FEF')||(LA36_19 >= '\u3001' && LA36_19 <= '\uD7FF')||(LA36_19 >= '\uF900' && LA36_19 <= '\uFDCF')||(LA36_19 >= '\uFDF0' && LA36_19 <= '\uFFFD')) ) {
                                alt36=1;
                            }


                        }
                        else if ( ((LA36_0 >= '\u203F' && LA36_0 <= '\u2040')) ) {
                            int LA36_20 = input.LA(2);

                            if ( ((LA36_20 >= '-' && LA36_20 <= '.')||(LA36_20 >= '0' && LA36_20 <= '9')||(LA36_20 >= 'A' && LA36_20 <= 'Z')||LA36_20=='\\'||LA36_20=='_'||(LA36_20 >= 'a' && LA36_20 <= 'z')||LA36_20=='\u00B7'||(LA36_20 >= '\u00C0' && LA36_20 <= '\u00D6')||(LA36_20 >= '\u00D8' && LA36_20 <= '\u00F6')||(LA36_20 >= '\u00F8' && LA36_20 <= '\u037D')||(LA36_20 >= '\u037F' && LA36_20 <= '\u1FFF')||(LA36_20 >= '\u200C' && LA36_20 <= '\u200D')||(LA36_20 >= '\u203F' && LA36_20 <= '\u2040')||(LA36_20 >= '\u2070' && LA36_20 <= '\u218F')||(LA36_20 >= '\u2C00' && LA36_20 <= '\u2FEF')||(LA36_20 >= '\u3001' && LA36_20 <= '\uD7FF')||(LA36_20 >= '\uF900' && LA36_20 <= '\uFDCF')||(LA36_20 >= '\uFDF0' && LA36_20 <= '\uFFFD')) ) {
                                alt36=1;
                            }


                        }
                        else if ( (LA36_0=='.') ) {
                            alt36=2;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1473:22: PN_CHARS
                    	    {
                    	    mPN_CHARS(); if (state.failed) return ;


                    	    }
                    	    break;
                    	case 2 :
                    	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1473:31: DOT
                    	    {
                    	    mDOT(); if (state.failed) return ;


                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);


                    mPN_CHARS(); if (state.failed) return ;


                    }
                    break;

            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PN_PREFIX"

    // $ANTLR start "PN_LOCAL"
    public final void mPN_LOCAL() throws RecognitionException {
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1478:2: ( ( PN_CHARS_U | ':' | ( '0' .. '9' ) | PLX ) ( ( PN_CHARS | DOT | ':' | PLX )* ( PN_CHARS | ':' | PLX ) )? )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1478:6: ( PN_CHARS_U | ':' | ( '0' .. '9' ) | PLX ) ( ( PN_CHARS | DOT | ':' | PLX )* ( PN_CHARS | ':' | PLX ) )?
            {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1478:6: ( PN_CHARS_U | ':' | ( '0' .. '9' ) | PLX )
            int alt38=4;
            int LA38_0 = input.LA(1);

            if ( ((LA38_0 >= 'A' && LA38_0 <= 'Z')||LA38_0=='_'||(LA38_0 >= 'a' && LA38_0 <= 'z')||(LA38_0 >= '\u00C0' && LA38_0 <= '\u00D6')||(LA38_0 >= '\u00D8' && LA38_0 <= '\u00F6')||(LA38_0 >= '\u00F8' && LA38_0 <= '\u02FF')||(LA38_0 >= '\u0370' && LA38_0 <= '\u037D')||(LA38_0 >= '\u037F' && LA38_0 <= '\u1FFF')||(LA38_0 >= '\u200C' && LA38_0 <= '\u200D')||(LA38_0 >= '\u2070' && LA38_0 <= '\u218F')||(LA38_0 >= '\u2C00' && LA38_0 <= '\u2FEF')||(LA38_0 >= '\u3001' && LA38_0 <= '\uD7FF')||(LA38_0 >= '\uF900' && LA38_0 <= '\uFDCF')||(LA38_0 >= '\uFDF0' && LA38_0 <= '\uFFFD')) ) {
                alt38=1;
            }
            else if ( (LA38_0=='\\') ) {
                int LA38_2 = input.LA(2);

                if ( (LA38_2=='!'||(LA38_2 >= '#' && LA38_2 <= '/')||LA38_2==';'||LA38_2=='='||(LA38_2 >= '?' && LA38_2 <= '@')||LA38_2=='_'||LA38_2=='~') ) {
                    alt38=4;
                }
                else if ( (LA38_2=='u') ) {
                    alt38=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 38, 2, input);

                    throw nvae;

                }
            }
            else if ( (LA38_0==':') ) {
                alt38=2;
            }
            else if ( ((LA38_0 >= '0' && LA38_0 <= '9')) ) {
                alt38=3;
            }
            else if ( (LA38_0=='%') ) {
                alt38=4;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;

            }
            switch (alt38) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1478:8: PN_CHARS_U
                    {
                    mPN_CHARS_U(); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1478:21: ':'
                    {
                    match(':'); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1478:28: ( '0' .. '9' )
                    {
                    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                        input.consume();
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 4 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1478:41: PLX
                    {
                    mPLX(); if (state.failed) return ;


                    }
                    break;

            }


            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1478:47: ( ( PN_CHARS | DOT | ':' | PLX )* ( PN_CHARS | ':' | PLX ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0=='%'||(LA41_0 >= '-' && LA41_0 <= '.')||(LA41_0 >= '0' && LA41_0 <= ':')||(LA41_0 >= 'A' && LA41_0 <= 'Z')||LA41_0=='\\'||LA41_0=='_'||(LA41_0 >= 'a' && LA41_0 <= 'z')||LA41_0=='\u00B7'||(LA41_0 >= '\u00C0' && LA41_0 <= '\u00D6')||(LA41_0 >= '\u00D8' && LA41_0 <= '\u00F6')||(LA41_0 >= '\u00F8' && LA41_0 <= '\u037D')||(LA41_0 >= '\u037F' && LA41_0 <= '\u1FFF')||(LA41_0 >= '\u200C' && LA41_0 <= '\u200D')||(LA41_0 >= '\u203F' && LA41_0 <= '\u2040')||(LA41_0 >= '\u2070' && LA41_0 <= '\u218F')||(LA41_0 >= '\u2C00' && LA41_0 <= '\u2FEF')||(LA41_0 >= '\u3001' && LA41_0 <= '\uD7FF')||(LA41_0 >= '\uF900' && LA41_0 <= '\uFDCF')||(LA41_0 >= '\uFDF0' && LA41_0 <= '\uFFFD')) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1478:49: ( PN_CHARS | DOT | ':' | PLX )* ( PN_CHARS | ':' | PLX )
                    {
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1478:49: ( PN_CHARS | DOT | ':' | PLX )*
                    loop39:
                    do {
                        int alt39=5;
                        int LA39_0 = input.LA(1);

                        if ( ((LA39_0 >= 'A' && LA39_0 <= 'Z')) ) {
                            int LA39_1 = input.LA(2);

                            if ( (LA39_1=='%'||(LA39_1 >= '-' && LA39_1 <= '.')||(LA39_1 >= '0' && LA39_1 <= ':')||(LA39_1 >= 'A' && LA39_1 <= 'Z')||LA39_1=='\\'||LA39_1=='_'||(LA39_1 >= 'a' && LA39_1 <= 'z')||LA39_1=='\u00B7'||(LA39_1 >= '\u00C0' && LA39_1 <= '\u00D6')||(LA39_1 >= '\u00D8' && LA39_1 <= '\u00F6')||(LA39_1 >= '\u00F8' && LA39_1 <= '\u037D')||(LA39_1 >= '\u037F' && LA39_1 <= '\u1FFF')||(LA39_1 >= '\u200C' && LA39_1 <= '\u200D')||(LA39_1 >= '\u203F' && LA39_1 <= '\u2040')||(LA39_1 >= '\u2070' && LA39_1 <= '\u218F')||(LA39_1 >= '\u2C00' && LA39_1 <= '\u2FEF')||(LA39_1 >= '\u3001' && LA39_1 <= '\uD7FF')||(LA39_1 >= '\uF900' && LA39_1 <= '\uFDCF')||(LA39_1 >= '\uFDF0' && LA39_1 <= '\uFFFD')) ) {
                                alt39=1;
                            }


                        }
                        else if ( ((LA39_0 >= 'a' && LA39_0 <= 'z')) ) {
                            int LA39_2 = input.LA(2);

                            if ( (LA39_2=='%'||(LA39_2 >= '-' && LA39_2 <= '.')||(LA39_2 >= '0' && LA39_2 <= ':')||(LA39_2 >= 'A' && LA39_2 <= 'Z')||LA39_2=='\\'||LA39_2=='_'||(LA39_2 >= 'a' && LA39_2 <= 'z')||LA39_2=='\u00B7'||(LA39_2 >= '\u00C0' && LA39_2 <= '\u00D6')||(LA39_2 >= '\u00D8' && LA39_2 <= '\u00F6')||(LA39_2 >= '\u00F8' && LA39_2 <= '\u037D')||(LA39_2 >= '\u037F' && LA39_2 <= '\u1FFF')||(LA39_2 >= '\u200C' && LA39_2 <= '\u200D')||(LA39_2 >= '\u203F' && LA39_2 <= '\u2040')||(LA39_2 >= '\u2070' && LA39_2 <= '\u218F')||(LA39_2 >= '\u2C00' && LA39_2 <= '\u2FEF')||(LA39_2 >= '\u3001' && LA39_2 <= '\uD7FF')||(LA39_2 >= '\uF900' && LA39_2 <= '\uFDCF')||(LA39_2 >= '\uFDF0' && LA39_2 <= '\uFFFD')) ) {
                                alt39=1;
                            }


                        }
                        else if ( (LA39_0=='\\') ) {
                            int LA39_3 = input.LA(2);

                            if ( (LA39_3=='!'||(LA39_3 >= '#' && LA39_3 <= '/')||LA39_3==';'||LA39_3=='='||(LA39_3 >= '?' && LA39_3 <= '@')||LA39_3=='_'||LA39_3=='~') ) {
                                int LA39_26 = input.LA(3);

                                if ( (LA39_26=='%'||(LA39_26 >= '-' && LA39_26 <= '.')||(LA39_26 >= '0' && LA39_26 <= ':')||(LA39_26 >= 'A' && LA39_26 <= 'Z')||LA39_26=='\\'||LA39_26=='_'||(LA39_26 >= 'a' && LA39_26 <= 'z')||LA39_26=='\u00B7'||(LA39_26 >= '\u00C0' && LA39_26 <= '\u00D6')||(LA39_26 >= '\u00D8' && LA39_26 <= '\u00F6')||(LA39_26 >= '\u00F8' && LA39_26 <= '\u037D')||(LA39_26 >= '\u037F' && LA39_26 <= '\u1FFF')||(LA39_26 >= '\u200C' && LA39_26 <= '\u200D')||(LA39_26 >= '\u203F' && LA39_26 <= '\u2040')||(LA39_26 >= '\u2070' && LA39_26 <= '\u218F')||(LA39_26 >= '\u2C00' && LA39_26 <= '\u2FEF')||(LA39_26 >= '\u3001' && LA39_26 <= '\uD7FF')||(LA39_26 >= '\uF900' && LA39_26 <= '\uFDCF')||(LA39_26 >= '\uFDF0' && LA39_26 <= '\uFFFD')) ) {
                                    alt39=4;
                                }


                            }
                            else if ( (LA39_3=='u') ) {
                                int LA39_27 = input.LA(3);

                                if ( ((LA39_27 >= '0' && LA39_27 <= '9')||(LA39_27 >= 'A' && LA39_27 <= 'F')||(LA39_27 >= 'a' && LA39_27 <= 'f')) ) {
                                    int LA39_31 = input.LA(4);

                                    if ( ((LA39_31 >= '0' && LA39_31 <= '9')||(LA39_31 >= 'A' && LA39_31 <= 'F')||(LA39_31 >= 'a' && LA39_31 <= 'f')) ) {
                                        int LA39_33 = input.LA(5);

                                        if ( ((LA39_33 >= '0' && LA39_33 <= '9')||(LA39_33 >= 'A' && LA39_33 <= 'F')||(LA39_33 >= 'a' && LA39_33 <= 'f')) ) {
                                            int LA39_34 = input.LA(6);

                                            if ( ((LA39_34 >= '0' && LA39_34 <= '9')||(LA39_34 >= 'A' && LA39_34 <= 'F')||(LA39_34 >= 'a' && LA39_34 <= 'f')) ) {
                                                int LA39_35 = input.LA(7);

                                                if ( (LA39_35=='%'||(LA39_35 >= '-' && LA39_35 <= '.')||(LA39_35 >= '0' && LA39_35 <= ':')||(LA39_35 >= 'A' && LA39_35 <= 'Z')||LA39_35=='\\'||LA39_35=='_'||(LA39_35 >= 'a' && LA39_35 <= 'z')||LA39_35=='\u00B7'||(LA39_35 >= '\u00C0' && LA39_35 <= '\u00D6')||(LA39_35 >= '\u00D8' && LA39_35 <= '\u00F6')||(LA39_35 >= '\u00F8' && LA39_35 <= '\u037D')||(LA39_35 >= '\u037F' && LA39_35 <= '\u1FFF')||(LA39_35 >= '\u200C' && LA39_35 <= '\u200D')||(LA39_35 >= '\u203F' && LA39_35 <= '\u2040')||(LA39_35 >= '\u2070' && LA39_35 <= '\u218F')||(LA39_35 >= '\u2C00' && LA39_35 <= '\u2FEF')||(LA39_35 >= '\u3001' && LA39_35 <= '\uD7FF')||(LA39_35 >= '\uF900' && LA39_35 <= '\uFDCF')||(LA39_35 >= '\uFDF0' && LA39_35 <= '\uFFFD')) ) {
                                                    alt39=1;
                                                }


                                            }


                                        }


                                    }


                                }


                            }


                        }
                        else if ( ((LA39_0 >= '\u00C0' && LA39_0 <= '\u00D6')) ) {
                            int LA39_4 = input.LA(2);

                            if ( (LA39_4=='%'||(LA39_4 >= '-' && LA39_4 <= '.')||(LA39_4 >= '0' && LA39_4 <= ':')||(LA39_4 >= 'A' && LA39_4 <= 'Z')||LA39_4=='\\'||LA39_4=='_'||(LA39_4 >= 'a' && LA39_4 <= 'z')||LA39_4=='\u00B7'||(LA39_4 >= '\u00C0' && LA39_4 <= '\u00D6')||(LA39_4 >= '\u00D8' && LA39_4 <= '\u00F6')||(LA39_4 >= '\u00F8' && LA39_4 <= '\u037D')||(LA39_4 >= '\u037F' && LA39_4 <= '\u1FFF')||(LA39_4 >= '\u200C' && LA39_4 <= '\u200D')||(LA39_4 >= '\u203F' && LA39_4 <= '\u2040')||(LA39_4 >= '\u2070' && LA39_4 <= '\u218F')||(LA39_4 >= '\u2C00' && LA39_4 <= '\u2FEF')||(LA39_4 >= '\u3001' && LA39_4 <= '\uD7FF')||(LA39_4 >= '\uF900' && LA39_4 <= '\uFDCF')||(LA39_4 >= '\uFDF0' && LA39_4 <= '\uFFFD')) ) {
                                alt39=1;
                            }


                        }
                        else if ( ((LA39_0 >= '\u00D8' && LA39_0 <= '\u00F6')) ) {
                            int LA39_5 = input.LA(2);

                            if ( (LA39_5=='%'||(LA39_5 >= '-' && LA39_5 <= '.')||(LA39_5 >= '0' && LA39_5 <= ':')||(LA39_5 >= 'A' && LA39_5 <= 'Z')||LA39_5=='\\'||LA39_5=='_'||(LA39_5 >= 'a' && LA39_5 <= 'z')||LA39_5=='\u00B7'||(LA39_5 >= '\u00C0' && LA39_5 <= '\u00D6')||(LA39_5 >= '\u00D8' && LA39_5 <= '\u00F6')||(LA39_5 >= '\u00F8' && LA39_5 <= '\u037D')||(LA39_5 >= '\u037F' && LA39_5 <= '\u1FFF')||(LA39_5 >= '\u200C' && LA39_5 <= '\u200D')||(LA39_5 >= '\u203F' && LA39_5 <= '\u2040')||(LA39_5 >= '\u2070' && LA39_5 <= '\u218F')||(LA39_5 >= '\u2C00' && LA39_5 <= '\u2FEF')||(LA39_5 >= '\u3001' && LA39_5 <= '\uD7FF')||(LA39_5 >= '\uF900' && LA39_5 <= '\uFDCF')||(LA39_5 >= '\uFDF0' && LA39_5 <= '\uFFFD')) ) {
                                alt39=1;
                            }


                        }
                        else if ( ((LA39_0 >= '\u00F8' && LA39_0 <= '\u02FF')) ) {
                            int LA39_6 = input.LA(2);

                            if ( (LA39_6=='%'||(LA39_6 >= '-' && LA39_6 <= '.')||(LA39_6 >= '0' && LA39_6 <= ':')||(LA39_6 >= 'A' && LA39_6 <= 'Z')||LA39_6=='\\'||LA39_6=='_'||(LA39_6 >= 'a' && LA39_6 <= 'z')||LA39_6=='\u00B7'||(LA39_6 >= '\u00C0' && LA39_6 <= '\u00D6')||(LA39_6 >= '\u00D8' && LA39_6 <= '\u00F6')||(LA39_6 >= '\u00F8' && LA39_6 <= '\u037D')||(LA39_6 >= '\u037F' && LA39_6 <= '\u1FFF')||(LA39_6 >= '\u200C' && LA39_6 <= '\u200D')||(LA39_6 >= '\u203F' && LA39_6 <= '\u2040')||(LA39_6 >= '\u2070' && LA39_6 <= '\u218F')||(LA39_6 >= '\u2C00' && LA39_6 <= '\u2FEF')||(LA39_6 >= '\u3001' && LA39_6 <= '\uD7FF')||(LA39_6 >= '\uF900' && LA39_6 <= '\uFDCF')||(LA39_6 >= '\uFDF0' && LA39_6 <= '\uFFFD')) ) {
                                alt39=1;
                            }


                        }
                        else if ( ((LA39_0 >= '\u0370' && LA39_0 <= '\u037D')) ) {
                            int LA39_7 = input.LA(2);

                            if ( (LA39_7=='%'||(LA39_7 >= '-' && LA39_7 <= '.')||(LA39_7 >= '0' && LA39_7 <= ':')||(LA39_7 >= 'A' && LA39_7 <= 'Z')||LA39_7=='\\'||LA39_7=='_'||(LA39_7 >= 'a' && LA39_7 <= 'z')||LA39_7=='\u00B7'||(LA39_7 >= '\u00C0' && LA39_7 <= '\u00D6')||(LA39_7 >= '\u00D8' && LA39_7 <= '\u00F6')||(LA39_7 >= '\u00F8' && LA39_7 <= '\u037D')||(LA39_7 >= '\u037F' && LA39_7 <= '\u1FFF')||(LA39_7 >= '\u200C' && LA39_7 <= '\u200D')||(LA39_7 >= '\u203F' && LA39_7 <= '\u2040')||(LA39_7 >= '\u2070' && LA39_7 <= '\u218F')||(LA39_7 >= '\u2C00' && LA39_7 <= '\u2FEF')||(LA39_7 >= '\u3001' && LA39_7 <= '\uD7FF')||(LA39_7 >= '\uF900' && LA39_7 <= '\uFDCF')||(LA39_7 >= '\uFDF0' && LA39_7 <= '\uFFFD')) ) {
                                alt39=1;
                            }


                        }
                        else if ( ((LA39_0 >= '\u037F' && LA39_0 <= '\u1FFF')) ) {
                            int LA39_8 = input.LA(2);

                            if ( (LA39_8=='%'||(LA39_8 >= '-' && LA39_8 <= '.')||(LA39_8 >= '0' && LA39_8 <= ':')||(LA39_8 >= 'A' && LA39_8 <= 'Z')||LA39_8=='\\'||LA39_8=='_'||(LA39_8 >= 'a' && LA39_8 <= 'z')||LA39_8=='\u00B7'||(LA39_8 >= '\u00C0' && LA39_8 <= '\u00D6')||(LA39_8 >= '\u00D8' && LA39_8 <= '\u00F6')||(LA39_8 >= '\u00F8' && LA39_8 <= '\u037D')||(LA39_8 >= '\u037F' && LA39_8 <= '\u1FFF')||(LA39_8 >= '\u200C' && LA39_8 <= '\u200D')||(LA39_8 >= '\u203F' && LA39_8 <= '\u2040')||(LA39_8 >= '\u2070' && LA39_8 <= '\u218F')||(LA39_8 >= '\u2C00' && LA39_8 <= '\u2FEF')||(LA39_8 >= '\u3001' && LA39_8 <= '\uD7FF')||(LA39_8 >= '\uF900' && LA39_8 <= '\uFDCF')||(LA39_8 >= '\uFDF0' && LA39_8 <= '\uFFFD')) ) {
                                alt39=1;
                            }


                        }
                        else if ( ((LA39_0 >= '\u200C' && LA39_0 <= '\u200D')) ) {
                            int LA39_9 = input.LA(2);

                            if ( (LA39_9=='%'||(LA39_9 >= '-' && LA39_9 <= '.')||(LA39_9 >= '0' && LA39_9 <= ':')||(LA39_9 >= 'A' && LA39_9 <= 'Z')||LA39_9=='\\'||LA39_9=='_'||(LA39_9 >= 'a' && LA39_9 <= 'z')||LA39_9=='\u00B7'||(LA39_9 >= '\u00C0' && LA39_9 <= '\u00D6')||(LA39_9 >= '\u00D8' && LA39_9 <= '\u00F6')||(LA39_9 >= '\u00F8' && LA39_9 <= '\u037D')||(LA39_9 >= '\u037F' && LA39_9 <= '\u1FFF')||(LA39_9 >= '\u200C' && LA39_9 <= '\u200D')||(LA39_9 >= '\u203F' && LA39_9 <= '\u2040')||(LA39_9 >= '\u2070' && LA39_9 <= '\u218F')||(LA39_9 >= '\u2C00' && LA39_9 <= '\u2FEF')||(LA39_9 >= '\u3001' && LA39_9 <= '\uD7FF')||(LA39_9 >= '\uF900' && LA39_9 <= '\uFDCF')||(LA39_9 >= '\uFDF0' && LA39_9 <= '\uFFFD')) ) {
                                alt39=1;
                            }


                        }
                        else if ( ((LA39_0 >= '\u2070' && LA39_0 <= '\u218F')) ) {
                            int LA39_10 = input.LA(2);

                            if ( (LA39_10=='%'||(LA39_10 >= '-' && LA39_10 <= '.')||(LA39_10 >= '0' && LA39_10 <= ':')||(LA39_10 >= 'A' && LA39_10 <= 'Z')||LA39_10=='\\'||LA39_10=='_'||(LA39_10 >= 'a' && LA39_10 <= 'z')||LA39_10=='\u00B7'||(LA39_10 >= '\u00C0' && LA39_10 <= '\u00D6')||(LA39_10 >= '\u00D8' && LA39_10 <= '\u00F6')||(LA39_10 >= '\u00F8' && LA39_10 <= '\u037D')||(LA39_10 >= '\u037F' && LA39_10 <= '\u1FFF')||(LA39_10 >= '\u200C' && LA39_10 <= '\u200D')||(LA39_10 >= '\u203F' && LA39_10 <= '\u2040')||(LA39_10 >= '\u2070' && LA39_10 <= '\u218F')||(LA39_10 >= '\u2C00' && LA39_10 <= '\u2FEF')||(LA39_10 >= '\u3001' && LA39_10 <= '\uD7FF')||(LA39_10 >= '\uF900' && LA39_10 <= '\uFDCF')||(LA39_10 >= '\uFDF0' && LA39_10 <= '\uFFFD')) ) {
                                alt39=1;
                            }


                        }
                        else if ( ((LA39_0 >= '\u2C00' && LA39_0 <= '\u2FEF')) ) {
                            int LA39_11 = input.LA(2);

                            if ( (LA39_11=='%'||(LA39_11 >= '-' && LA39_11 <= '.')||(LA39_11 >= '0' && LA39_11 <= ':')||(LA39_11 >= 'A' && LA39_11 <= 'Z')||LA39_11=='\\'||LA39_11=='_'||(LA39_11 >= 'a' && LA39_11 <= 'z')||LA39_11=='\u00B7'||(LA39_11 >= '\u00C0' && LA39_11 <= '\u00D6')||(LA39_11 >= '\u00D8' && LA39_11 <= '\u00F6')||(LA39_11 >= '\u00F8' && LA39_11 <= '\u037D')||(LA39_11 >= '\u037F' && LA39_11 <= '\u1FFF')||(LA39_11 >= '\u200C' && LA39_11 <= '\u200D')||(LA39_11 >= '\u203F' && LA39_11 <= '\u2040')||(LA39_11 >= '\u2070' && LA39_11 <= '\u218F')||(LA39_11 >= '\u2C00' && LA39_11 <= '\u2FEF')||(LA39_11 >= '\u3001' && LA39_11 <= '\uD7FF')||(LA39_11 >= '\uF900' && LA39_11 <= '\uFDCF')||(LA39_11 >= '\uFDF0' && LA39_11 <= '\uFFFD')) ) {
                                alt39=1;
                            }


                        }
                        else if ( ((LA39_0 >= '\u3001' && LA39_0 <= '\uD7FF')) ) {
                            int LA39_12 = input.LA(2);

                            if ( (LA39_12=='%'||(LA39_12 >= '-' && LA39_12 <= '.')||(LA39_12 >= '0' && LA39_12 <= ':')||(LA39_12 >= 'A' && LA39_12 <= 'Z')||LA39_12=='\\'||LA39_12=='_'||(LA39_12 >= 'a' && LA39_12 <= 'z')||LA39_12=='\u00B7'||(LA39_12 >= '\u00C0' && LA39_12 <= '\u00D6')||(LA39_12 >= '\u00D8' && LA39_12 <= '\u00F6')||(LA39_12 >= '\u00F8' && LA39_12 <= '\u037D')||(LA39_12 >= '\u037F' && LA39_12 <= '\u1FFF')||(LA39_12 >= '\u200C' && LA39_12 <= '\u200D')||(LA39_12 >= '\u203F' && LA39_12 <= '\u2040')||(LA39_12 >= '\u2070' && LA39_12 <= '\u218F')||(LA39_12 >= '\u2C00' && LA39_12 <= '\u2FEF')||(LA39_12 >= '\u3001' && LA39_12 <= '\uD7FF')||(LA39_12 >= '\uF900' && LA39_12 <= '\uFDCF')||(LA39_12 >= '\uFDF0' && LA39_12 <= '\uFFFD')) ) {
                                alt39=1;
                            }


                        }
                        else if ( ((LA39_0 >= '\uF900' && LA39_0 <= '\uFDCF')) ) {
                            int LA39_13 = input.LA(2);

                            if ( (LA39_13=='%'||(LA39_13 >= '-' && LA39_13 <= '.')||(LA39_13 >= '0' && LA39_13 <= ':')||(LA39_13 >= 'A' && LA39_13 <= 'Z')||LA39_13=='\\'||LA39_13=='_'||(LA39_13 >= 'a' && LA39_13 <= 'z')||LA39_13=='\u00B7'||(LA39_13 >= '\u00C0' && LA39_13 <= '\u00D6')||(LA39_13 >= '\u00D8' && LA39_13 <= '\u00F6')||(LA39_13 >= '\u00F8' && LA39_13 <= '\u037D')||(LA39_13 >= '\u037F' && LA39_13 <= '\u1FFF')||(LA39_13 >= '\u200C' && LA39_13 <= '\u200D')||(LA39_13 >= '\u203F' && LA39_13 <= '\u2040')||(LA39_13 >= '\u2070' && LA39_13 <= '\u218F')||(LA39_13 >= '\u2C00' && LA39_13 <= '\u2FEF')||(LA39_13 >= '\u3001' && LA39_13 <= '\uD7FF')||(LA39_13 >= '\uF900' && LA39_13 <= '\uFDCF')||(LA39_13 >= '\uFDF0' && LA39_13 <= '\uFFFD')) ) {
                                alt39=1;
                            }


                        }
                        else if ( ((LA39_0 >= '\uFDF0' && LA39_0 <= '\uFFFD')) ) {
                            int LA39_14 = input.LA(2);

                            if ( (LA39_14=='%'||(LA39_14 >= '-' && LA39_14 <= '.')||(LA39_14 >= '0' && LA39_14 <= ':')||(LA39_14 >= 'A' && LA39_14 <= 'Z')||LA39_14=='\\'||LA39_14=='_'||(LA39_14 >= 'a' && LA39_14 <= 'z')||LA39_14=='\u00B7'||(LA39_14 >= '\u00C0' && LA39_14 <= '\u00D6')||(LA39_14 >= '\u00D8' && LA39_14 <= '\u00F6')||(LA39_14 >= '\u00F8' && LA39_14 <= '\u037D')||(LA39_14 >= '\u037F' && LA39_14 <= '\u1FFF')||(LA39_14 >= '\u200C' && LA39_14 <= '\u200D')||(LA39_14 >= '\u203F' && LA39_14 <= '\u2040')||(LA39_14 >= '\u2070' && LA39_14 <= '\u218F')||(LA39_14 >= '\u2C00' && LA39_14 <= '\u2FEF')||(LA39_14 >= '\u3001' && LA39_14 <= '\uD7FF')||(LA39_14 >= '\uF900' && LA39_14 <= '\uFDCF')||(LA39_14 >= '\uFDF0' && LA39_14 <= '\uFFFD')) ) {
                                alt39=1;
                            }


                        }
                        else if ( (LA39_0=='_') ) {
                            int LA39_15 = input.LA(2);

                            if ( (LA39_15=='%'||(LA39_15 >= '-' && LA39_15 <= '.')||(LA39_15 >= '0' && LA39_15 <= ':')||(LA39_15 >= 'A' && LA39_15 <= 'Z')||LA39_15=='\\'||LA39_15=='_'||(LA39_15 >= 'a' && LA39_15 <= 'z')||LA39_15=='\u00B7'||(LA39_15 >= '\u00C0' && LA39_15 <= '\u00D6')||(LA39_15 >= '\u00D8' && LA39_15 <= '\u00F6')||(LA39_15 >= '\u00F8' && LA39_15 <= '\u037D')||(LA39_15 >= '\u037F' && LA39_15 <= '\u1FFF')||(LA39_15 >= '\u200C' && LA39_15 <= '\u200D')||(LA39_15 >= '\u203F' && LA39_15 <= '\u2040')||(LA39_15 >= '\u2070' && LA39_15 <= '\u218F')||(LA39_15 >= '\u2C00' && LA39_15 <= '\u2FEF')||(LA39_15 >= '\u3001' && LA39_15 <= '\uD7FF')||(LA39_15 >= '\uF900' && LA39_15 <= '\uFDCF')||(LA39_15 >= '\uFDF0' && LA39_15 <= '\uFFFD')) ) {
                                alt39=1;
                            }


                        }
                        else if ( (LA39_0=='-') ) {
                            int LA39_16 = input.LA(2);

                            if ( (LA39_16=='%'||(LA39_16 >= '-' && LA39_16 <= '.')||(LA39_16 >= '0' && LA39_16 <= ':')||(LA39_16 >= 'A' && LA39_16 <= 'Z')||LA39_16=='\\'||LA39_16=='_'||(LA39_16 >= 'a' && LA39_16 <= 'z')||LA39_16=='\u00B7'||(LA39_16 >= '\u00C0' && LA39_16 <= '\u00D6')||(LA39_16 >= '\u00D8' && LA39_16 <= '\u00F6')||(LA39_16 >= '\u00F8' && LA39_16 <= '\u037D')||(LA39_16 >= '\u037F' && LA39_16 <= '\u1FFF')||(LA39_16 >= '\u200C' && LA39_16 <= '\u200D')||(LA39_16 >= '\u203F' && LA39_16 <= '\u2040')||(LA39_16 >= '\u2070' && LA39_16 <= '\u218F')||(LA39_16 >= '\u2C00' && LA39_16 <= '\u2FEF')||(LA39_16 >= '\u3001' && LA39_16 <= '\uD7FF')||(LA39_16 >= '\uF900' && LA39_16 <= '\uFDCF')||(LA39_16 >= '\uFDF0' && LA39_16 <= '\uFFFD')) ) {
                                alt39=1;
                            }


                        }
                        else if ( ((LA39_0 >= '0' && LA39_0 <= '9')) ) {
                            int LA39_17 = input.LA(2);

                            if ( (LA39_17=='%'||(LA39_17 >= '-' && LA39_17 <= '.')||(LA39_17 >= '0' && LA39_17 <= ':')||(LA39_17 >= 'A' && LA39_17 <= 'Z')||LA39_17=='\\'||LA39_17=='_'||(LA39_17 >= 'a' && LA39_17 <= 'z')||LA39_17=='\u00B7'||(LA39_17 >= '\u00C0' && LA39_17 <= '\u00D6')||(LA39_17 >= '\u00D8' && LA39_17 <= '\u00F6')||(LA39_17 >= '\u00F8' && LA39_17 <= '\u037D')||(LA39_17 >= '\u037F' && LA39_17 <= '\u1FFF')||(LA39_17 >= '\u200C' && LA39_17 <= '\u200D')||(LA39_17 >= '\u203F' && LA39_17 <= '\u2040')||(LA39_17 >= '\u2070' && LA39_17 <= '\u218F')||(LA39_17 >= '\u2C00' && LA39_17 <= '\u2FEF')||(LA39_17 >= '\u3001' && LA39_17 <= '\uD7FF')||(LA39_17 >= '\uF900' && LA39_17 <= '\uFDCF')||(LA39_17 >= '\uFDF0' && LA39_17 <= '\uFFFD')) ) {
                                alt39=1;
                            }


                        }
                        else if ( (LA39_0=='\u00B7') ) {
                            int LA39_18 = input.LA(2);

                            if ( (LA39_18=='%'||(LA39_18 >= '-' && LA39_18 <= '.')||(LA39_18 >= '0' && LA39_18 <= ':')||(LA39_18 >= 'A' && LA39_18 <= 'Z')||LA39_18=='\\'||LA39_18=='_'||(LA39_18 >= 'a' && LA39_18 <= 'z')||LA39_18=='\u00B7'||(LA39_18 >= '\u00C0' && LA39_18 <= '\u00D6')||(LA39_18 >= '\u00D8' && LA39_18 <= '\u00F6')||(LA39_18 >= '\u00F8' && LA39_18 <= '\u037D')||(LA39_18 >= '\u037F' && LA39_18 <= '\u1FFF')||(LA39_18 >= '\u200C' && LA39_18 <= '\u200D')||(LA39_18 >= '\u203F' && LA39_18 <= '\u2040')||(LA39_18 >= '\u2070' && LA39_18 <= '\u218F')||(LA39_18 >= '\u2C00' && LA39_18 <= '\u2FEF')||(LA39_18 >= '\u3001' && LA39_18 <= '\uD7FF')||(LA39_18 >= '\uF900' && LA39_18 <= '\uFDCF')||(LA39_18 >= '\uFDF0' && LA39_18 <= '\uFFFD')) ) {
                                alt39=1;
                            }


                        }
                        else if ( ((LA39_0 >= '\u0300' && LA39_0 <= '\u036F')) ) {
                            int LA39_19 = input.LA(2);

                            if ( (LA39_19=='%'||(LA39_19 >= '-' && LA39_19 <= '.')||(LA39_19 >= '0' && LA39_19 <= ':')||(LA39_19 >= 'A' && LA39_19 <= 'Z')||LA39_19=='\\'||LA39_19=='_'||(LA39_19 >= 'a' && LA39_19 <= 'z')||LA39_19=='\u00B7'||(LA39_19 >= '\u00C0' && LA39_19 <= '\u00D6')||(LA39_19 >= '\u00D8' && LA39_19 <= '\u00F6')||(LA39_19 >= '\u00F8' && LA39_19 <= '\u037D')||(LA39_19 >= '\u037F' && LA39_19 <= '\u1FFF')||(LA39_19 >= '\u200C' && LA39_19 <= '\u200D')||(LA39_19 >= '\u203F' && LA39_19 <= '\u2040')||(LA39_19 >= '\u2070' && LA39_19 <= '\u218F')||(LA39_19 >= '\u2C00' && LA39_19 <= '\u2FEF')||(LA39_19 >= '\u3001' && LA39_19 <= '\uD7FF')||(LA39_19 >= '\uF900' && LA39_19 <= '\uFDCF')||(LA39_19 >= '\uFDF0' && LA39_19 <= '\uFFFD')) ) {
                                alt39=1;
                            }


                        }
                        else if ( ((LA39_0 >= '\u203F' && LA39_0 <= '\u2040')) ) {
                            int LA39_20 = input.LA(2);

                            if ( (LA39_20=='%'||(LA39_20 >= '-' && LA39_20 <= '.')||(LA39_20 >= '0' && LA39_20 <= ':')||(LA39_20 >= 'A' && LA39_20 <= 'Z')||LA39_20=='\\'||LA39_20=='_'||(LA39_20 >= 'a' && LA39_20 <= 'z')||LA39_20=='\u00B7'||(LA39_20 >= '\u00C0' && LA39_20 <= '\u00D6')||(LA39_20 >= '\u00D8' && LA39_20 <= '\u00F6')||(LA39_20 >= '\u00F8' && LA39_20 <= '\u037D')||(LA39_20 >= '\u037F' && LA39_20 <= '\u1FFF')||(LA39_20 >= '\u200C' && LA39_20 <= '\u200D')||(LA39_20 >= '\u203F' && LA39_20 <= '\u2040')||(LA39_20 >= '\u2070' && LA39_20 <= '\u218F')||(LA39_20 >= '\u2C00' && LA39_20 <= '\u2FEF')||(LA39_20 >= '\u3001' && LA39_20 <= '\uD7FF')||(LA39_20 >= '\uF900' && LA39_20 <= '\uFDCF')||(LA39_20 >= '\uFDF0' && LA39_20 <= '\uFFFD')) ) {
                                alt39=1;
                            }


                        }
                        else if ( (LA39_0==':') ) {
                            int LA39_21 = input.LA(2);

                            if ( (LA39_21=='%'||(LA39_21 >= '-' && LA39_21 <= '.')||(LA39_21 >= '0' && LA39_21 <= ':')||(LA39_21 >= 'A' && LA39_21 <= 'Z')||LA39_21=='\\'||LA39_21=='_'||(LA39_21 >= 'a' && LA39_21 <= 'z')||LA39_21=='\u00B7'||(LA39_21 >= '\u00C0' && LA39_21 <= '\u00D6')||(LA39_21 >= '\u00D8' && LA39_21 <= '\u00F6')||(LA39_21 >= '\u00F8' && LA39_21 <= '\u037D')||(LA39_21 >= '\u037F' && LA39_21 <= '\u1FFF')||(LA39_21 >= '\u200C' && LA39_21 <= '\u200D')||(LA39_21 >= '\u203F' && LA39_21 <= '\u2040')||(LA39_21 >= '\u2070' && LA39_21 <= '\u218F')||(LA39_21 >= '\u2C00' && LA39_21 <= '\u2FEF')||(LA39_21 >= '\u3001' && LA39_21 <= '\uD7FF')||(LA39_21 >= '\uF900' && LA39_21 <= '\uFDCF')||(LA39_21 >= '\uFDF0' && LA39_21 <= '\uFFFD')) ) {
                                alt39=3;
                            }


                        }
                        else if ( (LA39_0=='%') ) {
                            int LA39_22 = input.LA(2);

                            if ( ((LA39_22 >= '0' && LA39_22 <= '9')||(LA39_22 >= 'A' && LA39_22 <= 'F')||(LA39_22 >= 'a' && LA39_22 <= 'f')) ) {
                                int LA39_29 = input.LA(3);

                                if ( ((LA39_29 >= '0' && LA39_29 <= '9')||(LA39_29 >= 'A' && LA39_29 <= 'F')||(LA39_29 >= 'a' && LA39_29 <= 'f')) ) {
                                    int LA39_32 = input.LA(4);

                                    if ( (LA39_32=='%'||(LA39_32 >= '-' && LA39_32 <= '.')||(LA39_32 >= '0' && LA39_32 <= ':')||(LA39_32 >= 'A' && LA39_32 <= 'Z')||LA39_32=='\\'||LA39_32=='_'||(LA39_32 >= 'a' && LA39_32 <= 'z')||LA39_32=='\u00B7'||(LA39_32 >= '\u00C0' && LA39_32 <= '\u00D6')||(LA39_32 >= '\u00D8' && LA39_32 <= '\u00F6')||(LA39_32 >= '\u00F8' && LA39_32 <= '\u037D')||(LA39_32 >= '\u037F' && LA39_32 <= '\u1FFF')||(LA39_32 >= '\u200C' && LA39_32 <= '\u200D')||(LA39_32 >= '\u203F' && LA39_32 <= '\u2040')||(LA39_32 >= '\u2070' && LA39_32 <= '\u218F')||(LA39_32 >= '\u2C00' && LA39_32 <= '\u2FEF')||(LA39_32 >= '\u3001' && LA39_32 <= '\uD7FF')||(LA39_32 >= '\uF900' && LA39_32 <= '\uFDCF')||(LA39_32 >= '\uFDF0' && LA39_32 <= '\uFFFD')) ) {
                                        alt39=4;
                                    }


                                }


                            }


                        }
                        else if ( (LA39_0=='.') ) {
                            alt39=2;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1478:50: PN_CHARS
                    	    {
                    	    mPN_CHARS(); if (state.failed) return ;


                    	    }
                    	    break;
                    	case 2 :
                    	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1478:61: DOT
                    	    {
                    	    mDOT(); if (state.failed) return ;


                    	    }
                    	    break;
                    	case 3 :
                    	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1478:67: ':'
                    	    {
                    	    match(':'); if (state.failed) return ;

                    	    }
                    	    break;
                    	case 4 :
                    	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1478:73: PLX
                    	    {
                    	    mPLX(); if (state.failed) return ;


                    	    }
                    	    break;

                    	default :
                    	    break loop39;
                        }
                    } while (true);


                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1478:79: ( PN_CHARS | ':' | PLX )
                    int alt40=3;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0=='-'||(LA40_0 >= '0' && LA40_0 <= '9')||(LA40_0 >= 'A' && LA40_0 <= 'Z')||LA40_0=='_'||(LA40_0 >= 'a' && LA40_0 <= 'z')||LA40_0=='\u00B7'||(LA40_0 >= '\u00C0' && LA40_0 <= '\u00D6')||(LA40_0 >= '\u00D8' && LA40_0 <= '\u00F6')||(LA40_0 >= '\u00F8' && LA40_0 <= '\u037D')||(LA40_0 >= '\u037F' && LA40_0 <= '\u1FFF')||(LA40_0 >= '\u200C' && LA40_0 <= '\u200D')||(LA40_0 >= '\u203F' && LA40_0 <= '\u2040')||(LA40_0 >= '\u2070' && LA40_0 <= '\u218F')||(LA40_0 >= '\u2C00' && LA40_0 <= '\u2FEF')||(LA40_0 >= '\u3001' && LA40_0 <= '\uD7FF')||(LA40_0 >= '\uF900' && LA40_0 <= '\uFDCF')||(LA40_0 >= '\uFDF0' && LA40_0 <= '\uFFFD')) ) {
                        alt40=1;
                    }
                    else if ( (LA40_0=='\\') ) {
                        int LA40_2 = input.LA(2);

                        if ( (LA40_2=='!'||(LA40_2 >= '#' && LA40_2 <= '/')||LA40_2==';'||LA40_2=='='||(LA40_2 >= '?' && LA40_2 <= '@')||LA40_2=='_'||LA40_2=='~') ) {
                            alt40=3;
                        }
                        else if ( (LA40_2=='u') ) {
                            alt40=1;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 40, 2, input);

                            throw nvae;

                        }
                    }
                    else if ( (LA40_0==':') ) {
                        alt40=2;
                    }
                    else if ( (LA40_0=='%') ) {
                        alt40=3;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 40, 0, input);

                        throw nvae;

                    }
                    switch (alt40) {
                        case 1 :
                            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1478:80: PN_CHARS
                            {
                            mPN_CHARS(); if (state.failed) return ;


                            }
                            break;
                        case 2 :
                            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1478:91: ':'
                            {
                            match(':'); if (state.failed) return ;

                            }
                            break;
                        case 3 :
                            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1478:97: PLX
                            {
                            mPLX(); if (state.failed) return ;


                            }
                            break;

                    }


                    }
                    break;

            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PN_LOCAL"

    // $ANTLR start "PLX"
    public final void mPLX() throws RecognitionException {
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1483:5: ( PERCENT | PN_LOCAL_ESC )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0=='%') ) {
                alt42=1;
            }
            else if ( (LA42_0=='\\') ) {
                alt42=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;

            }
            switch (alt42) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1483:9: PERCENT
                    {
                    mPERCENT(); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1483:19: PN_LOCAL_ESC
                    {
                    mPN_LOCAL_ESC(); if (state.failed) return ;


                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLX"

    // $ANTLR start "PERCENT"
    public final void mPERCENT() throws RecognitionException {
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1488:5: ( '%' HEXDIGIT HEXDIGIT )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1488:9: '%' HEXDIGIT HEXDIGIT
            {
            match('%'); if (state.failed) return ;

            mHEXDIGIT(); if (state.failed) return ;


            mHEXDIGIT(); if (state.failed) return ;


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PERCENT"

    // $ANTLR start "PN_LOCAL_ESC"
    public final void mPN_LOCAL_ESC() throws RecognitionException {
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1493:5: ( '\\\\' ( '_' | '-' | '.' | '~' | '\\'' | '!' | '$' | '&' | '(' | ')' | '*' | '+' | ',' | ';' | '=' | '/' | '?' | '#' | '@' | '%' ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1493:9: '\\\\' ( '_' | '-' | '.' | '~' | '\\'' | '!' | '$' | '&' | '(' | ')' | '*' | '+' | ',' | ';' | '=' | '/' | '?' | '#' | '@' | '%' )
            {
            match('\\'); if (state.failed) return ;

            if ( input.LA(1)=='!'||(input.LA(1) >= '#' && input.LA(1) <= '/')||input.LA(1)==';'||input.LA(1)=='='||(input.LA(1) >= '?' && input.LA(1) <= '@')||input.LA(1)=='_'||input.LA(1)=='~' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PN_LOCAL_ESC"

    // $ANTLR start "A"
    public final void mA() throws RecognitionException {
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1495:12: ( 'A' | 'a' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "A"

    // $ANTLR start "B"
    public final void mB() throws RecognitionException {
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1496:12: ( 'B' | 'b' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:
            {
            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "B"

    // $ANTLR start "C"
    public final void mC() throws RecognitionException {
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1497:12: ( 'C' | 'c' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "C"

    // $ANTLR start "D"
    public final void mD() throws RecognitionException {
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1498:12: ( 'D' | 'd' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "D"

    // $ANTLR start "E"
    public final void mE() throws RecognitionException {
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1499:12: ( 'E' | 'e' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "E"

    // $ANTLR start "F"
    public final void mF() throws RecognitionException {
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1500:12: ( 'F' | 'f' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "F"

    // $ANTLR start "G"
    public final void mG() throws RecognitionException {
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1501:12: ( 'G' | 'g' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:
            {
            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "G"

    // $ANTLR start "H"
    public final void mH() throws RecognitionException {
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1502:12: ( 'H' | 'h' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:
            {
            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "H"

    // $ANTLR start "I"
    public final void mI() throws RecognitionException {
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1503:12: ( 'I' | 'i' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "I"

    // $ANTLR start "J"
    public final void mJ() throws RecognitionException {
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1504:12: ( 'J' | 'j' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:
            {
            if ( input.LA(1)=='J'||input.LA(1)=='j' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "J"

    // $ANTLR start "K"
    public final void mK() throws RecognitionException {
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1505:12: ( 'K' | 'k' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:
            {
            if ( input.LA(1)=='K'||input.LA(1)=='k' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "K"

    // $ANTLR start "L"
    public final void mL() throws RecognitionException {
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1506:12: ( 'L' | 'l' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:
            {
            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "L"

    // $ANTLR start "M"
    public final void mM() throws RecognitionException {
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1507:12: ( 'M' | 'm' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:
            {
            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "M"

    // $ANTLR start "N"
    public final void mN() throws RecognitionException {
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1508:12: ( 'N' | 'n' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:
            {
            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "N"

    // $ANTLR start "O"
    public final void mO() throws RecognitionException {
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1509:12: ( 'O' | 'o' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:
            {
            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "O"

    // $ANTLR start "P"
    public final void mP() throws RecognitionException {
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1510:12: ( 'P' | 'p' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:
            {
            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "P"

    // $ANTLR start "Q"
    public final void mQ() throws RecognitionException {
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1511:12: ( 'Q' | 'q' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:
            {
            if ( input.LA(1)=='Q'||input.LA(1)=='q' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Q"

    // $ANTLR start "R"
    public final void mR() throws RecognitionException {
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1512:12: ( 'R' | 'r' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:
            {
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "R"

    // $ANTLR start "S"
    public final void mS() throws RecognitionException {
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1513:12: ( 'S' | 's' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "S"

    // $ANTLR start "T"
    public final void mT() throws RecognitionException {
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1514:12: ( 'T' | 't' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:
            {
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T"

    // $ANTLR start "U"
    public final void mU() throws RecognitionException {
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1515:12: ( 'U' | 'u' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:
            {
            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "U"

    // $ANTLR start "V"
    public final void mV() throws RecognitionException {
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1516:12: ( 'V' | 'v' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:
            {
            if ( input.LA(1)=='V'||input.LA(1)=='v' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "V"

    // $ANTLR start "W"
    public final void mW() throws RecognitionException {
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1517:12: ( 'W' | 'w' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:
            {
            if ( input.LA(1)=='W'||input.LA(1)=='w' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "W"

    // $ANTLR start "X"
    public final void mX() throws RecognitionException {
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1518:12: ( 'X' | 'x' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:
            {
            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "X"

    // $ANTLR start "Y"
    public final void mY() throws RecognitionException {
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1519:12: ( 'Y' | 'y' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:
            {
            if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Y"

    // $ANTLR start "Z"
    public final void mZ() throws RecognitionException {
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1520:12: ( 'Z' | 'z' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:
            {
            if ( input.LA(1)=='Z'||input.LA(1)=='z' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Z"

    public void mTokens() throws RecognitionException {
        // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:8: ( T__268 | T__269 | T__270 | T__271 | T__272 | T__273 | T__274 | T__275 | T__276 | T__277 | T__278 | T__279 | T__280 | T__281 | T__282 | ARROW | FUNCLANG | FUNCCALL | FUNCTION | BASE | PREFIX | SELECT | DISTINCT | REDUCED | AS | CONSTRUCT | WHERE_TOKEN | DESCRIBE | ASK | FROM | NAMED | GROUP | BY | HAVING | ORDER | ASC | DESC | LIMIT | OFFSET | BINDINGS | UNDEF | LOAD | SILENT | INTO | CLEAR | DROP | CREATE | TO | MOVE | COPY | INSERT | DATA | DELETE | WITH | USING | DEFAULT | GRAPH | ALL | OPTIONAL | SERVICE | BIND | MINUS | UNION | FILTER | STR | LANG | LANGMATCHES | DATATYPE | BOUND | IRI | URI | BNODE | RAND | ABS | CEIL | FLOOR | ROUND | CONCAT | STRLEN | UCASE | LCASE | ENCODE_FOR_URI | CONTAINS | STRSTARTS | STRENDS | STRBEFORE | STRAFTER | YEAR | MONTH | DAY | HOURS | MINUTES | SECONDS | TIMEZONE | TZ | NOW | MD5 | SHA1 | SHA224 | SHA256 | SHA384 | SHA512 | COALESCE | IF | STRLANG | STRDT | SAMETERM | ISIRI | ISURI | ISBLANK | ISLITERAL | ISNUMERIC | REGEX | TRUE | FALSE | ADD | IN | NOT | SUBSTR | EXISTS | COUNT | SUM | MIN | MAX | AVG | SAMPLE | GROUP_CONCAT | SEPARATOR | VALUES | REPLACE | UUID | STRUUID | POST | TABLE | GET | SOP | EOP | OPEN_CURLY_BRACE | CLOSE_CURLY_BRACE | DOT | OPEN_BRACE | CLOSE_BRACE | COMMA | SEMICOLON | LOGICAL_OR | LOGICAL_AND | OPEN_SQ_BRACKET | CLOSE_SQ_BRACKET | LT | PNAME_NS | PNAME_LN | BLANK_NODE_LABEL | VAR1 | VAR2 | VAR0 | LANGTAG | INTEGER | DECIMAL | DOUBLE | INTEGER_POSITIVE | DECIMAL_POSITIVE | DOUBLE_POSITIVE | INTEGER_NEGATIVE | DECIMAL_NEGATIVE | DOUBLE_NEGATIVE | STRING_LINE_NONEOP | STRING_LITERAL1 | STRING_LITERAL2 | STRING_LITERAL_LONG1 | STRING_LITERAL_LONG2 | ECHAR | WS | COMMENT )
        int alt43=173;
        alt43 = dfa43.predict(input);
        switch (alt43) {
            case 1 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:10: T__268
                {
                mT__268(); if (state.failed) return ;


                }
                break;
            case 2 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:17: T__269
                {
                mT__269(); if (state.failed) return ;


                }
                break;
            case 3 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:24: T__270
                {
                mT__270(); if (state.failed) return ;


                }
                break;
            case 4 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:31: T__271
                {
                mT__271(); if (state.failed) return ;


                }
                break;
            case 5 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:38: T__272
                {
                mT__272(); if (state.failed) return ;


                }
                break;
            case 6 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:45: T__273
                {
                mT__273(); if (state.failed) return ;


                }
                break;
            case 7 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:52: T__274
                {
                mT__274(); if (state.failed) return ;


                }
                break;
            case 8 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:59: T__275
                {
                mT__275(); if (state.failed) return ;


                }
                break;
            case 9 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:66: T__276
                {
                mT__276(); if (state.failed) return ;


                }
                break;
            case 10 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:73: T__277
                {
                mT__277(); if (state.failed) return ;


                }
                break;
            case 11 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:80: T__278
                {
                mT__278(); if (state.failed) return ;


                }
                break;
            case 12 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:87: T__279
                {
                mT__279(); if (state.failed) return ;


                }
                break;
            case 13 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:94: T__280
                {
                mT__280(); if (state.failed) return ;


                }
                break;
            case 14 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:101: T__281
                {
                mT__281(); if (state.failed) return ;


                }
                break;
            case 15 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:108: T__282
                {
                mT__282(); if (state.failed) return ;


                }
                break;
            case 16 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:115: ARROW
                {
                mARROW(); if (state.failed) return ;


                }
                break;
            case 17 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:121: FUNCLANG
                {
                mFUNCLANG(); if (state.failed) return ;


                }
                break;
            case 18 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:130: FUNCCALL
                {
                mFUNCCALL(); if (state.failed) return ;


                }
                break;
            case 19 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:139: FUNCTION
                {
                mFUNCTION(); if (state.failed) return ;


                }
                break;
            case 20 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:148: BASE
                {
                mBASE(); if (state.failed) return ;


                }
                break;
            case 21 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:153: PREFIX
                {
                mPREFIX(); if (state.failed) return ;


                }
                break;
            case 22 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:160: SELECT
                {
                mSELECT(); if (state.failed) return ;


                }
                break;
            case 23 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:167: DISTINCT
                {
                mDISTINCT(); if (state.failed) return ;


                }
                break;
            case 24 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:176: REDUCED
                {
                mREDUCED(); if (state.failed) return ;


                }
                break;
            case 25 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:184: AS
                {
                mAS(); if (state.failed) return ;


                }
                break;
            case 26 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:187: CONSTRUCT
                {
                mCONSTRUCT(); if (state.failed) return ;


                }
                break;
            case 27 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:197: WHERE_TOKEN
                {
                mWHERE_TOKEN(); if (state.failed) return ;


                }
                break;
            case 28 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:209: DESCRIBE
                {
                mDESCRIBE(); if (state.failed) return ;


                }
                break;
            case 29 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:218: ASK
                {
                mASK(); if (state.failed) return ;


                }
                break;
            case 30 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:222: FROM
                {
                mFROM(); if (state.failed) return ;


                }
                break;
            case 31 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:227: NAMED
                {
                mNAMED(); if (state.failed) return ;


                }
                break;
            case 32 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:233: GROUP
                {
                mGROUP(); if (state.failed) return ;


                }
                break;
            case 33 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:239: BY
                {
                mBY(); if (state.failed) return ;


                }
                break;
            case 34 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:242: HAVING
                {
                mHAVING(); if (state.failed) return ;


                }
                break;
            case 35 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:249: ORDER
                {
                mORDER(); if (state.failed) return ;


                }
                break;
            case 36 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:255: ASC
                {
                mASC(); if (state.failed) return ;


                }
                break;
            case 37 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:259: DESC
                {
                mDESC(); if (state.failed) return ;


                }
                break;
            case 38 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:264: LIMIT
                {
                mLIMIT(); if (state.failed) return ;


                }
                break;
            case 39 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:270: OFFSET
                {
                mOFFSET(); if (state.failed) return ;


                }
                break;
            case 40 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:277: BINDINGS
                {
                mBINDINGS(); if (state.failed) return ;


                }
                break;
            case 41 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:286: UNDEF
                {
                mUNDEF(); if (state.failed) return ;


                }
                break;
            case 42 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:292: LOAD
                {
                mLOAD(); if (state.failed) return ;


                }
                break;
            case 43 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:297: SILENT
                {
                mSILENT(); if (state.failed) return ;


                }
                break;
            case 44 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:304: INTO
                {
                mINTO(); if (state.failed) return ;


                }
                break;
            case 45 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:309: CLEAR
                {
                mCLEAR(); if (state.failed) return ;


                }
                break;
            case 46 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:315: DROP
                {
                mDROP(); if (state.failed) return ;


                }
                break;
            case 47 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:320: CREATE
                {
                mCREATE(); if (state.failed) return ;


                }
                break;
            case 48 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:327: TO
                {
                mTO(); if (state.failed) return ;


                }
                break;
            case 49 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:330: MOVE
                {
                mMOVE(); if (state.failed) return ;


                }
                break;
            case 50 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:335: COPY
                {
                mCOPY(); if (state.failed) return ;


                }
                break;
            case 51 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:340: INSERT
                {
                mINSERT(); if (state.failed) return ;


                }
                break;
            case 52 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:347: DATA
                {
                mDATA(); if (state.failed) return ;


                }
                break;
            case 53 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:352: DELETE
                {
                mDELETE(); if (state.failed) return ;


                }
                break;
            case 54 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:359: WITH
                {
                mWITH(); if (state.failed) return ;


                }
                break;
            case 55 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:364: USING
                {
                mUSING(); if (state.failed) return ;


                }
                break;
            case 56 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:370: DEFAULT
                {
                mDEFAULT(); if (state.failed) return ;


                }
                break;
            case 57 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:378: GRAPH
                {
                mGRAPH(); if (state.failed) return ;


                }
                break;
            case 58 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:384: ALL
                {
                mALL(); if (state.failed) return ;


                }
                break;
            case 59 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:388: OPTIONAL
                {
                mOPTIONAL(); if (state.failed) return ;


                }
                break;
            case 60 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:397: SERVICE
                {
                mSERVICE(); if (state.failed) return ;


                }
                break;
            case 61 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:405: BIND
                {
                mBIND(); if (state.failed) return ;


                }
                break;
            case 62 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:410: MINUS
                {
                mMINUS(); if (state.failed) return ;


                }
                break;
            case 63 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:416: UNION
                {
                mUNION(); if (state.failed) return ;


                }
                break;
            case 64 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:422: FILTER
                {
                mFILTER(); if (state.failed) return ;


                }
                break;
            case 65 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:429: STR
                {
                mSTR(); if (state.failed) return ;


                }
                break;
            case 66 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:433: LANG
                {
                mLANG(); if (state.failed) return ;


                }
                break;
            case 67 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:438: LANGMATCHES
                {
                mLANGMATCHES(); if (state.failed) return ;


                }
                break;
            case 68 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:450: DATATYPE
                {
                mDATATYPE(); if (state.failed) return ;


                }
                break;
            case 69 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:459: BOUND
                {
                mBOUND(); if (state.failed) return ;


                }
                break;
            case 70 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:465: IRI
                {
                mIRI(); if (state.failed) return ;


                }
                break;
            case 71 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:469: URI
                {
                mURI(); if (state.failed) return ;


                }
                break;
            case 72 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:473: BNODE
                {
                mBNODE(); if (state.failed) return ;


                }
                break;
            case 73 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:479: RAND
                {
                mRAND(); if (state.failed) return ;


                }
                break;
            case 74 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:484: ABS
                {
                mABS(); if (state.failed) return ;


                }
                break;
            case 75 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:488: CEIL
                {
                mCEIL(); if (state.failed) return ;


                }
                break;
            case 76 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:493: FLOOR
                {
                mFLOOR(); if (state.failed) return ;


                }
                break;
            case 77 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:499: ROUND
                {
                mROUND(); if (state.failed) return ;


                }
                break;
            case 78 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:505: CONCAT
                {
                mCONCAT(); if (state.failed) return ;


                }
                break;
            case 79 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:512: STRLEN
                {
                mSTRLEN(); if (state.failed) return ;


                }
                break;
            case 80 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:519: UCASE
                {
                mUCASE(); if (state.failed) return ;


                }
                break;
            case 81 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:525: LCASE
                {
                mLCASE(); if (state.failed) return ;


                }
                break;
            case 82 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:531: ENCODE_FOR_URI
                {
                mENCODE_FOR_URI(); if (state.failed) return ;


                }
                break;
            case 83 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:546: CONTAINS
                {
                mCONTAINS(); if (state.failed) return ;


                }
                break;
            case 84 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:555: STRSTARTS
                {
                mSTRSTARTS(); if (state.failed) return ;


                }
                break;
            case 85 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:565: STRENDS
                {
                mSTRENDS(); if (state.failed) return ;


                }
                break;
            case 86 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:573: STRBEFORE
                {
                mSTRBEFORE(); if (state.failed) return ;


                }
                break;
            case 87 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:583: STRAFTER
                {
                mSTRAFTER(); if (state.failed) return ;


                }
                break;
            case 88 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:592: YEAR
                {
                mYEAR(); if (state.failed) return ;


                }
                break;
            case 89 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:597: MONTH
                {
                mMONTH(); if (state.failed) return ;


                }
                break;
            case 90 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:603: DAY
                {
                mDAY(); if (state.failed) return ;


                }
                break;
            case 91 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:607: HOURS
                {
                mHOURS(); if (state.failed) return ;


                }
                break;
            case 92 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:613: MINUTES
                {
                mMINUTES(); if (state.failed) return ;


                }
                break;
            case 93 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:621: SECONDS
                {
                mSECONDS(); if (state.failed) return ;


                }
                break;
            case 94 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:629: TIMEZONE
                {
                mTIMEZONE(); if (state.failed) return ;


                }
                break;
            case 95 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:638: TZ
                {
                mTZ(); if (state.failed) return ;


                }
                break;
            case 96 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:641: NOW
                {
                mNOW(); if (state.failed) return ;


                }
                break;
            case 97 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:645: MD5
                {
                mMD5(); if (state.failed) return ;


                }
                break;
            case 98 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:649: SHA1
                {
                mSHA1(); if (state.failed) return ;


                }
                break;
            case 99 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:654: SHA224
                {
                mSHA224(); if (state.failed) return ;


                }
                break;
            case 100 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:661: SHA256
                {
                mSHA256(); if (state.failed) return ;


                }
                break;
            case 101 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:668: SHA384
                {
                mSHA384(); if (state.failed) return ;


                }
                break;
            case 102 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:675: SHA512
                {
                mSHA512(); if (state.failed) return ;


                }
                break;
            case 103 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:682: COALESCE
                {
                mCOALESCE(); if (state.failed) return ;


                }
                break;
            case 104 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:691: IF
                {
                mIF(); if (state.failed) return ;


                }
                break;
            case 105 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:694: STRLANG
                {
                mSTRLANG(); if (state.failed) return ;


                }
                break;
            case 106 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:702: STRDT
                {
                mSTRDT(); if (state.failed) return ;


                }
                break;
            case 107 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:708: SAMETERM
                {
                mSAMETERM(); if (state.failed) return ;


                }
                break;
            case 108 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:717: ISIRI
                {
                mISIRI(); if (state.failed) return ;


                }
                break;
            case 109 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:723: ISURI
                {
                mISURI(); if (state.failed) return ;


                }
                break;
            case 110 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:729: ISBLANK
                {
                mISBLANK(); if (state.failed) return ;


                }
                break;
            case 111 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:737: ISLITERAL
                {
                mISLITERAL(); if (state.failed) return ;


                }
                break;
            case 112 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:747: ISNUMERIC
                {
                mISNUMERIC(); if (state.failed) return ;


                }
                break;
            case 113 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:757: REGEX
                {
                mREGEX(); if (state.failed) return ;


                }
                break;
            case 114 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:763: TRUE
                {
                mTRUE(); if (state.failed) return ;


                }
                break;
            case 115 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:768: FALSE
                {
                mFALSE(); if (state.failed) return ;


                }
                break;
            case 116 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:774: ADD
                {
                mADD(); if (state.failed) return ;


                }
                break;
            case 117 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:778: IN
                {
                mIN(); if (state.failed) return ;


                }
                break;
            case 118 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:781: NOT
                {
                mNOT(); if (state.failed) return ;


                }
                break;
            case 119 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:785: SUBSTR
                {
                mSUBSTR(); if (state.failed) return ;


                }
                break;
            case 120 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:792: EXISTS
                {
                mEXISTS(); if (state.failed) return ;


                }
                break;
            case 121 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:799: COUNT
                {
                mCOUNT(); if (state.failed) return ;


                }
                break;
            case 122 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:805: SUM
                {
                mSUM(); if (state.failed) return ;


                }
                break;
            case 123 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:809: MIN
                {
                mMIN(); if (state.failed) return ;


                }
                break;
            case 124 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:813: MAX
                {
                mMAX(); if (state.failed) return ;


                }
                break;
            case 125 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:817: AVG
                {
                mAVG(); if (state.failed) return ;


                }
                break;
            case 126 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:821: SAMPLE
                {
                mSAMPLE(); if (state.failed) return ;


                }
                break;
            case 127 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:828: GROUP_CONCAT
                {
                mGROUP_CONCAT(); if (state.failed) return ;


                }
                break;
            case 128 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:841: SEPARATOR
                {
                mSEPARATOR(); if (state.failed) return ;


                }
                break;
            case 129 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:851: VALUES
                {
                mVALUES(); if (state.failed) return ;


                }
                break;
            case 130 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:858: REPLACE
                {
                mREPLACE(); if (state.failed) return ;


                }
                break;
            case 131 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:866: UUID
                {
                mUUID(); if (state.failed) return ;


                }
                break;
            case 132 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:871: STRUUID
                {
                mSTRUUID(); if (state.failed) return ;


                }
                break;
            case 133 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:879: POST
                {
                mPOST(); if (state.failed) return ;


                }
                break;
            case 134 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:884: TABLE
                {
                mTABLE(); if (state.failed) return ;


                }
                break;
            case 135 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:890: GET
                {
                mGET(); if (state.failed) return ;


                }
                break;
            case 136 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:894: SOP
                {
                mSOP(); if (state.failed) return ;


                }
                break;
            case 137 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:898: EOP
                {
                mEOP(); if (state.failed) return ;


                }
                break;
            case 138 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:902: OPEN_CURLY_BRACE
                {
                mOPEN_CURLY_BRACE(); if (state.failed) return ;


                }
                break;
            case 139 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:919: CLOSE_CURLY_BRACE
                {
                mCLOSE_CURLY_BRACE(); if (state.failed) return ;


                }
                break;
            case 140 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:937: DOT
                {
                mDOT(); if (state.failed) return ;


                }
                break;
            case 141 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:941: OPEN_BRACE
                {
                mOPEN_BRACE(); if (state.failed) return ;


                }
                break;
            case 142 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:952: CLOSE_BRACE
                {
                mCLOSE_BRACE(); if (state.failed) return ;


                }
                break;
            case 143 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:964: COMMA
                {
                mCOMMA(); if (state.failed) return ;


                }
                break;
            case 144 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:970: SEMICOLON
                {
                mSEMICOLON(); if (state.failed) return ;


                }
                break;
            case 145 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:980: LOGICAL_OR
                {
                mLOGICAL_OR(); if (state.failed) return ;


                }
                break;
            case 146 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:991: LOGICAL_AND
                {
                mLOGICAL_AND(); if (state.failed) return ;


                }
                break;
            case 147 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:1003: OPEN_SQ_BRACKET
                {
                mOPEN_SQ_BRACKET(); if (state.failed) return ;


                }
                break;
            case 148 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:1019: CLOSE_SQ_BRACKET
                {
                mCLOSE_SQ_BRACKET(); if (state.failed) return ;


                }
                break;
            case 149 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:1036: LT
                {
                mLT(); if (state.failed) return ;


                }
                break;
            case 150 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:1039: PNAME_NS
                {
                mPNAME_NS(); if (state.failed) return ;


                }
                break;
            case 151 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:1048: PNAME_LN
                {
                mPNAME_LN(); if (state.failed) return ;


                }
                break;
            case 152 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:1057: BLANK_NODE_LABEL
                {
                mBLANK_NODE_LABEL(); if (state.failed) return ;


                }
                break;
            case 153 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:1074: VAR1
                {
                mVAR1(); if (state.failed) return ;


                }
                break;
            case 154 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:1079: VAR2
                {
                mVAR2(); if (state.failed) return ;


                }
                break;
            case 155 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:1084: VAR0
                {
                mVAR0(); if (state.failed) return ;


                }
                break;
            case 156 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:1089: LANGTAG
                {
                mLANGTAG(); if (state.failed) return ;


                }
                break;
            case 157 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:1097: INTEGER
                {
                mINTEGER(); if (state.failed) return ;


                }
                break;
            case 158 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:1105: DECIMAL
                {
                mDECIMAL(); if (state.failed) return ;


                }
                break;
            case 159 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:1113: DOUBLE
                {
                mDOUBLE(); if (state.failed) return ;


                }
                break;
            case 160 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:1120: INTEGER_POSITIVE
                {
                mINTEGER_POSITIVE(); if (state.failed) return ;


                }
                break;
            case 161 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:1137: DECIMAL_POSITIVE
                {
                mDECIMAL_POSITIVE(); if (state.failed) return ;


                }
                break;
            case 162 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:1154: DOUBLE_POSITIVE
                {
                mDOUBLE_POSITIVE(); if (state.failed) return ;


                }
                break;
            case 163 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:1170: INTEGER_NEGATIVE
                {
                mINTEGER_NEGATIVE(); if (state.failed) return ;


                }
                break;
            case 164 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:1187: DECIMAL_NEGATIVE
                {
                mDECIMAL_NEGATIVE(); if (state.failed) return ;


                }
                break;
            case 165 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:1204: DOUBLE_NEGATIVE
                {
                mDOUBLE_NEGATIVE(); if (state.failed) return ;


                }
                break;
            case 166 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:1220: STRING_LINE_NONEOP
                {
                mSTRING_LINE_NONEOP(); if (state.failed) return ;


                }
                break;
            case 167 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:1239: STRING_LITERAL1
                {
                mSTRING_LITERAL1(); if (state.failed) return ;


                }
                break;
            case 168 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:1255: STRING_LITERAL2
                {
                mSTRING_LITERAL2(); if (state.failed) return ;


                }
                break;
            case 169 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:1271: STRING_LITERAL_LONG1
                {
                mSTRING_LITERAL_LONG1(); if (state.failed) return ;


                }
                break;
            case 170 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:1292: STRING_LITERAL_LONG2
                {
                mSTRING_LITERAL_LONG2(); if (state.failed) return ;


                }
                break;
            case 171 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:1313: ECHAR
                {
                mECHAR(); if (state.failed) return ;


                }
                break;
            case 172 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:1319: WS
                {
                mWS(); if (state.failed) return ;


                }
                break;
            case 173 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1:1322: COMMENT
                {
                mCOMMENT(); if (state.failed) return ;


                }
                break;

        }

    }

    // $ANTLR start synpred1_IbmSparqlExt
    public final void synpred1_IbmSparqlExt_fragment() throws RecognitionException {
        // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1306:11: ( ( ( '\\\\' UNICODE_ESCAPE ) |~ ( '<' | '>' | '\"' | OPEN_CURLY_BRACE | CLOSE_CURLY_BRACE | '|' | '^' | '`' | '\\\\' | ( '\\u0000' .. '\\u0020' ) ) )* '>' )
        // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1306:13: ( ( '\\\\' UNICODE_ESCAPE ) |~ ( '<' | '>' | '\"' | OPEN_CURLY_BRACE | CLOSE_CURLY_BRACE | '|' | '^' | '`' | '\\\\' | ( '\\u0000' .. '\\u0020' ) ) )* '>'
        {
        // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1306:13: ( ( '\\\\' UNICODE_ESCAPE ) |~ ( '<' | '>' | '\"' | OPEN_CURLY_BRACE | CLOSE_CURLY_BRACE | '|' | '^' | '`' | '\\\\' | ( '\\u0000' .. '\\u0020' ) ) )*
        loop44:
        do {
            int alt44=3;
            int LA44_0 = input.LA(1);

            if ( (LA44_0=='\\') ) {
                alt44=1;
            }
            else if ( (LA44_0=='!'||(LA44_0 >= '#' && LA44_0 <= ';')||LA44_0=='='||(LA44_0 >= '?' && LA44_0 <= '[')||LA44_0==']'||LA44_0=='_'||(LA44_0 >= 'a' && LA44_0 <= 'z')||(LA44_0 >= '~' && LA44_0 <= '\uFFFF')) ) {
                alt44=2;
            }


            switch (alt44) {
        	case 1 :
        	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1306:15: ( '\\\\' UNICODE_ESCAPE )
        	    {
        	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1306:15: ( '\\\\' UNICODE_ESCAPE )
        	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1306:16: '\\\\' UNICODE_ESCAPE
        	    {
        	    match('\\'); if (state.failed) return ;

        	    mUNICODE_ESCAPE(); if (state.failed) return ;


        	    }


        	    }
        	    break;
        	case 2 :
        	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExt.g:1306:39: ~ ( '<' | '>' | '\"' | OPEN_CURLY_BRACE | CLOSE_CURLY_BRACE | '|' | '^' | '`' | '\\\\' | ( '\\u0000' .. '\\u0020' ) )
        	    {
        	    if ( input.LA(1)=='!'||(input.LA(1) >= '#' && input.LA(1) <= ';')||input.LA(1)=='='||(input.LA(1) >= '?' && input.LA(1) <= '[')||input.LA(1)==']'||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z')||(input.LA(1) >= '~' && input.LA(1) <= '\uFFFF') ) {
        	        input.consume();
        	        state.failed=false;
        	    }
        	    else {
        	        if (state.backtracking>0) {state.failed=true; return ;}
        	        MismatchedSetException mse = new MismatchedSetException(null,input);
        	        recover(mse);
        	        throw mse;
        	    }


        	    }
        	    break;

        	default :
        	    break loop44;
            }
        } while (true);


        match('>'); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred1_IbmSparqlExt

    public final boolean synpred1_IbmSparqlExt() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_IbmSparqlExt_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA15 dfa15 = new DFA15(this);
    protected DFA43 dfa43 = new DFA43(this);
    static final String DFA15_eotS =
        "\5\uffff";
    static final String DFA15_eofS =
        "\5\uffff";
    static final String DFA15_minS =
        "\2\56\3\uffff";
    static final String DFA15_maxS =
        "\1\71\1\145\3\uffff";
    static final String DFA15_acceptS =
        "\2\uffff\1\2\1\1\1\3";
    static final String DFA15_specialS =
        "\5\uffff}>";
    static final String[] DFA15_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\3\1\uffff\12\1\13\uffff\1\4\37\uffff\1\4",
            "",
            "",
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "1365:1: DOUBLE : ( ( DIGIT )+ DOT ( DIGIT )* EXPONENT | DOT ( DIGIT )+ EXPONENT | ( DIGIT )+ EXPONENT );";
        }
    }
    static final String DFA43_eotS =
        "\1\uffff\1\130\1\uffff\1\131\1\135\1\uffff\1\141\1\uffff\1\144\1"+
        "\145\1\150\1\151\1\u008b\25\u008c\3\uffff\1\u0115\10\uffff\26\u008c"+
        "\16\uffff\1\u011b\7\uffff\1\u0122\1\u0125\2\uffff\1\u0127\1\u012a"+
        "\1\u012c\11\uffff\1\u012d\4\u008c\1\u012d\6\u008c\14\uffff\1\u008c"+
        "\1\uffff\1\u008c\4\uffff\1\141\3\uffff\23\u008c\1\u014f\4\u008c"+
        "\1\u014f\111\u008c\1\u01ba\1\u008c\1\u01c1\1\u008c\1\u01ba\1\u008c"+
        "\1\u01c1\1\u008c\1\u01cc\1\u008c\1\u01cf\2\u008c\1\u01cc\1\u008c"+
        "\1\u01cf\22\u008c\5\uffff\1\u01e7\5\uffff\1\u01e7\1\uffff\1\u011f"+
        "\1\uffff\1\u0121\2\uffff\1\u0125\2\uffff\1\u0125\1\uffff\1\u012a"+
        "\2\uffff\1\u012a\2\uffff\1\u01ed\1\u01ee\1\u01ed\1\u01ee\2\u01ef"+
        "\2\u01f0\2\u01f1\2\u01f2\1\uffff\24\u008c\1\uffff\24\u008c\2\u021c"+
        "\5\u008c\1\u0235\1\u008c\1\u0235\13\u008c\1\u0242\1\u008c\1\u0242"+
        "\36\u008c\1\u0265\1\u0266\1\u0265\1\u0266\4\u008c\2\u026b\20\u008c"+
        "\2\u027c\4\u008c\1\uffff\4\u008c\2\u0285\1\uffff\12\u008c\1\uffff"+
        "\2\u008c\1\uffff\10\u008c\2\u029a\1\u029d\2\u029e\10\u008c\3\uffff"+
        "\1\u01e7\2\uffff\1\u0125\1\u012a\7\uffff\2\u02aa\2\u008c\2\u02b1"+
        "\4\u008c\2\u02b8\6\u008c\2\u02bf\2\u02c0\6\u008c\2\u02c9\12\u008c"+
        "\1\uffff\16\u008c\1\u02e4\11\u008c\1\uffff\2\u008c\2\u02f1\4\u008c"+
        "\2\u02f8\2\u02f9\1\uffff\6\u008c\2\u0302\10\u008c\2\u030b\10\u008c"+
        "\2\u0314\2\u008c\2\u0317\2\u008c\2\uffff\4\u008c\1\uffff\20\u008c"+
        "\1\uffff\2\u008c\2\u0330\2\u0331\2\u008c\1\uffff\14\u008c\2\u0340"+
        "\2\u008c\2\u0343\2\u008c\1\uffff\2\u008c\2\uffff\4\u008c\2\u034e"+
        "\2\u008c\1\u0351\3\uffff\4\u008c\2\u0359\1\uffff\2\u035a\4\u008c"+
        "\1\uffff\2\u008c\2\u0361\2\u0362\2\uffff\2\u008c\2\u0365\2\u0366"+
        "\2\u008c\1\uffff\26\u008c\2\u037f\2\u008c\1\uffff\14\u008c\1\uffff"+
        "\6\u008c\2\uffff\4\u008c\2\u0398\2\u008c\1\uffff\2\u039b\6\u008c"+
        "\1\uffff\2\u008c\2\u03a4\2\u03a5\2\u008c\1\uffff\2\u03a8\1\uffff"+
        "\2\u03a9\2\u03aa\2\u03ac\2\u008c\2\u03af\2\u03b0\4\u008c\2\u03b5"+
        "\2\u03b6\2\u03b7\2\u03b8\2\uffff\2\u008c\2\u03bb\2\u03bc\10\u008c"+
        "\1\uffff\2\u03c5\1\uffff\2\u03c6\1\u03c7\1\u008c\1\u03c7\5\u008c"+
        "\1\uffff\2\u008c\4\uffff\4\u008c\2\uffff\4\u008c\2\u03da\2\uffff"+
        "\2\u008c\2\uffff\2\u03dd\2\u03de\6\u008c\2\u03e5\2\u03e6\12\u008c"+
        "\1\uffff\2\u008c\1\u03f3\1\u03f4\1\u03f5\1\u03f6\2\u008c\2\u03f9"+
        "\2\u03fa\4\u008c\2\u03ff\6\u008c\1\uffff\2\u008c\1\uffff\2\u008c"+
        "\2\u040a\4\u008c\2\uffff\2\u040f\3\uffff\1\u008c\1\uffff\2\u0412"+
        "\2\uffff\2\u0413\2\u008c\4\uffff\2\u0416\2\uffff\10\u008c\3\uffff"+
        "\4\u008c\2\u0422\2\u0423\1\u0114\1\uffff\10\u008c\1\uffff\2\u008c"+
        "\2\uffff\2\u042e\2\u042f\2\u008c\2\uffff\2\u0432\2\u008c\2\u0435"+
        "\4\u008c\2\u043a\4\uffff\2\u008c\2\uffff\4\u008c\1\uffff\2\u0441"+
        "\2\u008c\2\u0444\2\u0445\2\u008c\1\uffff\4\u008c\1\uffff\2\u008c"+
        "\2\uffff\2\u008c\1\uffff\2\u0450\6\u008c\2\u0457\1\u008c\2\uffff"+
        "\2\u045a\2\u008c\2\u045d\2\u045e\2\u045f\2\uffff\2\u008c\1\uffff"+
        "\2\u008c\1\uffff\2\u008c\2\u0466\1\uffff\2\u0467\2\u0468\2\u0469"+
        "\1\uffff\2\u046a\2\uffff\2\u008c\2\u046d\2\u046e\2\u008c\2\u0471"+
        "\1\uffff\4\u008c\2\u0476\1\uffff\2\u008c\1\uffff\2\u008c\3\uffff"+
        "\2\u047b\2\u047c\2\u047d\5\uffff\2\u047e\2\uffff\2\u008c\1\uffff"+
        "\2\u0481\2\u0482\1\uffff\4\u008c\4\uffff\2\u008c\2\uffff\2\u008c"+
        "\2\u048a\3\u008c\1\uffff\2\u048f\2\u008c\1\uffff\2\u008c\2\u0494"+
        "\1\uffff";
    static final String DFA43_eofS =
        "\u0495\uffff";
    static final String DFA43_minS =
        "\1\11\1\75\1\uffff\2\56\1\uffff\1\45\1\uffff\1\75\1\60\1\136\1\55"+
        "\1\174\25\55\1\42\2\uffff\1\60\10\uffff\41\55\3\uffff\1\56\2\0\5"+
        "\uffff\1\56\1\60\2\uffff\1\56\1\60\1\45\11\uffff\14\55\1\165\22"+
        "\55\1\45\3\uffff\u0084\55\1\117\1\uffff\1\60\2\uffff\1\60\4\55\1"+
        "\uffff\1\60\1\uffff\1\47\1\uffff\1\42\2\uffff\1\60\2\uffff\1\60"+
        "\1\uffff\1\60\2\uffff\1\60\2\uffff\14\55\1\60\24\55\1\uffff\152"+
        "\55\1\uffff\6\55\1\uffff\12\55\1\uffff\2\55\1\uffff\25\55\1\120"+
        "\1\60\1\uffff\1\60\2\uffff\2\60\6\uffff\1\60\50\55\1\uffff\30\55"+
        "\1\uffff\14\55\1\uffff\42\55\2\uffff\4\55\1\uffff\20\55\1\uffff"+
        "\10\55\1\uffff\24\55\1\uffff\2\55\2\uffff\10\55\1\0\2\60\1\uffff"+
        "\6\55\1\uffff\6\55\1\uffff\6\55\2\uffff\10\55\1\uffff\32\55\1\uffff"+
        "\14\55\1\uffff\6\55\2\uffff\10\55\1\uffff\10\55\1\uffff\10\55\1"+
        "\uffff\2\55\1\uffff\30\55\2\uffff\16\55\1\uffff\2\55\1\uffff\12"+
        "\55\1\uffff\2\55\2\uffff\2\60\4\55\2\uffff\6\55\2\uffff\2\55\2\uffff"+
        "\30\55\1\uffff\30\55\1\uffff\2\55\1\uffff\10\55\2\uffff\2\55\3\uffff"+
        "\1\55\1\uffff\2\55\2\uffff\4\55\4\uffff\2\55\2\uffff\10\55\3\uffff"+
        "\22\55\1\uffff\2\55\2\uffff\6\55\2\uffff\14\55\4\uffff\2\55\2\uffff"+
        "\4\55\1\uffff\12\55\1\uffff\4\55\1\uffff\2\55\2\uffff\2\55\1\uffff"+
        "\13\55\2\uffff\12\55\2\uffff\2\55\1\uffff\2\55\1\uffff\4\55\1\uffff"+
        "\6\55\1\uffff\2\55\2\uffff\12\55\1\uffff\6\55\1\uffff\2\55\1\uffff"+
        "\2\55\3\uffff\6\55\5\uffff\2\55\2\uffff\2\55\1\uffff\4\55\1\uffff"+
        "\4\55\4\uffff\2\55\2\uffff\7\55\1\uffff\4\55\1\uffff\4\55\1\uffff";
    static final String DFA43_maxS =
        "\1\ufffd\1\75\1\uffff\1\71\1\76\1\uffff\1\ufffd\1\uffff\1\75\1\ufffd"+
        "\1\136\1\ufffd\1\174\25\ufffd\1\165\2\uffff\1\71\10\uffff\41\ufffd"+
        "\3\uffff\1\145\2\uffff\5\uffff\1\145\1\71\2\uffff\1\145\1\71\1\ufffd"+
        "\11\uffff\14\ufffd\1\165\23\ufffd\3\uffff\u0084\ufffd\1\157\1\uffff"+
        "\1\146\2\uffff\1\145\4\ufffd\1\uffff\1\145\1\uffff\1\47\1\uffff"+
        "\1\42\2\uffff\1\145\2\uffff\1\145\1\uffff\1\145\2\uffff\1\145\2"+
        "\uffff\14\ufffd\1\146\24\ufffd\1\uffff\152\ufffd\1\uffff\6\ufffd"+
        "\1\uffff\12\ufffd\1\uffff\2\ufffd\1\uffff\25\ufffd\1\160\1\146\1"+
        "\uffff\1\145\2\uffff\2\145\6\uffff\1\146\50\ufffd\1\uffff\30\ufffd"+
        "\1\uffff\14\ufffd\1\uffff\42\ufffd\2\uffff\4\ufffd\1\uffff\20\ufffd"+
        "\1\uffff\10\ufffd\1\uffff\24\ufffd\1\uffff\2\ufffd\2\uffff\10\ufffd"+
        "\1\uffff\2\146\1\uffff\6\ufffd\1\uffff\6\ufffd\1\uffff\6\ufffd\2"+
        "\uffff\10\ufffd\1\uffff\32\ufffd\1\uffff\14\ufffd\1\uffff\6\ufffd"+
        "\2\uffff\10\ufffd\1\uffff\10\ufffd\1\uffff\10\ufffd\1\uffff\2\ufffd"+
        "\1\uffff\30\ufffd\2\uffff\16\ufffd\1\uffff\2\ufffd\1\uffff\12\ufffd"+
        "\1\uffff\2\ufffd\2\uffff\2\146\4\ufffd\2\uffff\6\ufffd\2\uffff\2"+
        "\ufffd\2\uffff\30\ufffd\1\uffff\30\ufffd\1\uffff\2\ufffd\1\uffff"+
        "\10\ufffd\2\uffff\2\ufffd\3\uffff\1\ufffd\1\uffff\2\ufffd\2\uffff"+
        "\4\ufffd\4\uffff\2\ufffd\2\uffff\10\ufffd\3\uffff\22\ufffd\1\uffff"+
        "\2\ufffd\2\uffff\6\ufffd\2\uffff\14\ufffd\4\uffff\2\ufffd\2\uffff"+
        "\4\ufffd\1\uffff\12\ufffd\1\uffff\4\ufffd\1\uffff\2\ufffd\2\uffff"+
        "\2\ufffd\1\uffff\13\ufffd\2\uffff\12\ufffd\2\uffff\2\ufffd\1\uffff"+
        "\2\ufffd\1\uffff\4\ufffd\1\uffff\6\ufffd\1\uffff\2\ufffd\2\uffff"+
        "\12\ufffd\1\uffff\6\ufffd\1\uffff\2\ufffd\1\uffff\2\ufffd\3\uffff"+
        "\6\ufffd\5\uffff\2\ufffd\2\uffff\2\ufffd\1\uffff\4\ufffd\1\uffff"+
        "\4\ufffd\4\uffff\2\ufffd\2\uffff\7\ufffd\1\uffff\4\ufffd\1\uffff"+
        "\4\ufffd\1\uffff";
    static final String DFA43_acceptS =
        "\2\uffff\1\3\2\uffff\1\6\1\uffff\1\10\33\uffff\1\u008a\1\u008b\1"+
        "\uffff\1\u008d\1\u008e\1\u008f\1\u0090\1\u0092\1\u0093\1\u0094\1"+
        "\u0095\41\uffff\1\u0098\1\u009a\1\u009c\3\uffff\1\u00ac\1\u00ad"+
        "\1\2\1\1\1\4\2\uffff\1\20\1\5\3\uffff\1\u0096\1\u0097\1\12\1\11"+
        "\1\13\1\u0099\1\15\1\14\1\16\40\uffff\1\u0091\1\17\1\u009b\u0085"+
        "\uffff\1\u0089\1\uffff\1\u00ab\1\u008c\5\uffff\1\u009d\1\uffff\1"+
        "\u009f\1\uffff\1\u00a7\1\uffff\1\u00a8\1\u00a0\1\uffff\1\u00a2\1"+
        "\u00a1\1\uffff\1\u00a3\1\uffff\1\u00a5\1\u00a4\1\uffff\1\7\1\31"+
        "\41\uffff\1\41\152\uffff\1\165\6\uffff\1\150\12\uffff\1\60\2\uffff"+
        "\1\137\27\uffff\1\u009e\1\uffff\1\u00a9\1\u00aa\2\uffff\1\35\1\44"+
        "\1\72\1\112\1\164\1\175\51\uffff\1\101\30\uffff\1\172\14\uffff\1"+
        "\132\42\uffff\1\140\1\166\4\uffff\1\u0087\20\uffff\1\107\10\uffff"+
        "\1\106\24\uffff\1\173\2\uffff\1\141\1\174\13\uffff\1\102\6\uffff"+
        "\1\52\6\uffff\1\36\6\uffff\1\24\1\75\10\uffff\1\u0085\32\uffff\1"+
        "\142\14\uffff\1\45\6\uffff\1\56\1\64\10\uffff\1\111\10\uffff\1\62"+
        "\10\uffff\1\113\2\uffff\1\66\30\uffff\1\u0083\1\54\16\uffff\1\162"+
        "\2\uffff\1\61\12\uffff\1\130\2\uffff\1\u0088\1\u00a6\6\uffff\1\46"+
        "\1\121\6\uffff\1\114\1\163\2\uffff\1\105\1\110\30\uffff\1\152\30"+
        "\uffff\1\161\2\uffff\1\115\10\uffff\1\171\1\55\2\uffff\1\33\1\37"+
        "\1\40\1\uffff\1\71\2\uffff\1\133\1\43\4\uffff\1\51\1\77\1\67\1\120"+
        "\2\uffff\1\154\1\155\10\uffff\1\u0086\1\131\1\76\22\uffff\1\100"+
        "\2\uffff\1\25\1\26\6\uffff\1\53\1\117\14\uffff\1\143\1\144\1\145"+
        "\1\146\2\uffff\1\176\1\167\4\uffff\1\65\12\uffff\1\116\4\uffff\1"+
        "\57\2\uffff\1\42\1\47\2\uffff\1\63\13\uffff\1\170\1\u0081\12\uffff"+
        "\1\74\1\135\2\uffff\1\151\2\uffff\1\125\4\uffff\1\u0084\6\uffff"+
        "\1\70\2\uffff\1\30\1\u0082\12\uffff\1\156\6\uffff\1\134\2\uffff"+
        "\1\21\2\uffff\1\22\1\23\1\50\6\uffff\1\127\1\153\1\27\1\34\1\104"+
        "\2\uffff\1\123\1\147\2\uffff\1\73\4\uffff\1\136\4\uffff\1\u0080"+
        "\1\124\1\126\1\32\2\uffff\1\157\1\160\7\uffff\1\103\4\uffff\1\177"+
        "\4\uffff\1\122";
    static final String DFA43_specialS =
        "\123\uffff\1\1\1\2\u0252\uffff\1\0\u01ed\uffff}>";
    static final String[] DFA43_transitionS = {
            "\2\125\2\uffff\1\125\22\uffff\1\125\1\1\1\124\1\126\1\120\1"+
            "\uffff\1\52\1\123\1\46\1\47\1\2\1\3\1\50\1\4\1\45\1\5\12\122"+
            "\1\6\1\51\1\55\1\7\1\10\1\11\1\121\1\24\1\17\1\25\1\22\1\37"+
            "\1\16\1\30\1\31\1\34\2\102\1\15\1\36\1\27\1\32\1\20\1\102\1"+
            "\23\1\21\1\35\1\33\1\41\1\26\1\102\1\40\1\102\1\53\1\42\1\54"+
            "\1\12\1\117\1\uffff\1\13\1\60\1\65\1\63\1\77\1\57\1\70\1\71"+
            "\1\74\2\103\1\56\1\76\1\67\1\72\1\61\1\103\1\64\1\62\1\75\1"+
            "\73\1\101\1\66\1\103\1\100\1\103\1\43\1\14\1\44\102\uffff\27"+
            "\104\1\uffff\37\105\1\uffff\u0208\106\160\uffff\16\107\1\uffff"+
            "\u1c81\110\14\uffff\2\111\142\uffff\u0120\112\u0a70\uffff\u03f0"+
            "\113\21\uffff\ua7ff\114\u2100\uffff\u04d0\115\40\uffff\u020e"+
            "\116",
            "\1\127",
            "",
            "\1\133\1\uffff\12\132",
            "\1\137\1\uffff\12\136\4\uffff\1\134",
            "",
            "\1\142\12\uffff\12\142\1\140\6\uffff\32\142\1\uffff\1\142\2"+
            "\uffff\1\142\1\uffff\32\142\105\uffff\27\142\1\uffff\37\142"+
            "\1\uffff\u0208\142\160\uffff\16\142\1\uffff\u1c81\142\14\uffff"+
            "\2\142\142\uffff\u0120\142\u0a70\uffff\u03f0\142\21\uffff\ua7ff"+
            "\142\u2100\uffff\u04d0\142\40\uffff\u020e\142",
            "",
            "\1\143",
            "\12\146\7\uffff\32\146\1\uffff\1\146\2\uffff\1\146\1\uffff"+
            "\32\146\105\uffff\27\146\1\uffff\37\146\1\uffff\u0208\146\160"+
            "\uffff\16\146\1\uffff\u1c81\146\14\uffff\2\146\142\uffff\u0120"+
            "\146\u0a70\uffff\u03f0\146\21\uffff\ua7ff\146\u2100\uffff\u04d0"+
            "\146\40\uffff\u020e\146",
            "\1\147",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\1\164\1\154"+
            "\1\164\1\155\7\164\1\153\6\164\1\152\2\164\1\156\4\164\1\uffff"+
            "\1\166\2\uffff\1\u0082\1\uffff\1\165\1\161\1\165\1\162\7\165"+
            "\1\160\6\165\1\157\2\165\1\163\4\165\74\uffff\1\u0085\10\uffff"+
            "\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086\16\172\1"+
            "\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57\uffff\u0120"+
            "\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100\uffff\u04d0"+
            "\u0080\40\uffff\u020e\u0081",
            "\1\u008a",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\1\u008d\1"+
            "\164\1\u0090\5\164\1\u008e\5\164\1\u008f\13\164\1\uffff\1\166"+
            "\2\uffff\1\u0082\1\uffff\1\u0091\1\165\1\u0094\5\165\1\u0092"+
            "\5\165\1\u0093\13\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff"+
            "\37\170\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173"+
            "\14\uffff\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff"+
            "\u03f0\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff"+
            "\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\1\u0099\7"+
            "\164\1\u0097\2\164\1\u0098\5\164\1\u0096\2\164\1\u0095\5\164"+
            "\1\uffff\1\166\2\uffff\1\u0082\1\uffff\1\u009e\7\165\1\u009c"+
            "\2\165\1\u009d\5\165\1\u009b\2\165\1\u009a\5\165\74\uffff\1"+
            "\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160"+
            "\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087"+
            "\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177"+
            "\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\1\u009f\7"+
            "\164\1\u00a1\4\164\1\u00a3\1\u00a2\11\164\1\u00a0\1\164\1\uffff"+
            "\1\166\2\uffff\1\u0082\1\uffff\1\u00a4\7\165\1\u00a6\4\165\1"+
            "\u00a8\1\u00a7\11\165\1\u00a5\1\165\74\uffff\1\u0085\10\uffff"+
            "\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086\16\172\1"+
            "\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57\uffff\u0120"+
            "\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100\uffff\u04d0"+
            "\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\16\164\1"+
            "\u00aa\2\164\1\u00a9\10\164\1\uffff\1\166\2\uffff\1\u0082\1"+
            "\uffff\16\165\1\u00ac\2\165\1\u00ab\10\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\1\u00b1\3"+
            "\164\1\u00ad\2\164\1\u00b0\1\u00ae\12\164\1\u00af\1\u00b2\5"+
            "\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\1\u00b7\3\165\1\u00b3"+
            "\2\165\1\u00b6\1\u00b4\12\165\1\u00b5\1\u00b8\5\165\74\uffff"+
            "\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160"+
            "\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087"+
            "\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177"+
            "\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\1\u00bc\3"+
            "\164\1\u00ba\3\164\1\u00b9\10\164\1\u00bb\10\164\1\uffff\1\166"+
            "\2\uffff\1\u0082\1\uffff\1\u00c0\3\165\1\u00be\3\165\1\u00bd"+
            "\10\165\1\u00bf\10\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff"+
            "\37\170\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173"+
            "\14\uffff\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff"+
            "\u03f0\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff"+
            "\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\1\u00c2\3"+
            "\164\1\u00c1\11\164\1\u00c3\13\164\1\uffff\1\166\2\uffff\1\u0082"+
            "\1\uffff\1\u00c5\3\165\1\u00c4\11\165\1\u00c6\13\165\74\uffff"+
            "\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160"+
            "\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087"+
            "\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177"+
            "\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\1\164\1\154"+
            "\1\164\1\155\7\164\1\153\6\164\1\152\2\164\1\156\4\164\1\uffff"+
            "\1\166\2\uffff\1\u0082\1\uffff\1\165\1\161\1\165\1\162\7\165"+
            "\1\160\6\165\1\157\2\165\1\163\4\165\74\uffff\1\u0085\10\uffff"+
            "\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086\16\172\1"+
            "\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57\uffff\u0120"+
            "\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100\uffff\u04d0"+
            "\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\4\164\1\u00ca"+
            "\6\164\1\u00c8\2\164\1\u00c7\2\164\1\u00c9\10\164\1\uffff\1"+
            "\166\2\uffff\1\u0082\1\uffff\4\165\1\u00ce\6\165\1\u00cc\2\165"+
            "\1\u00cb\2\165\1\u00cd\10\165\74\uffff\1\u0085\10\uffff\27\167"+
            "\1\uffff\37\170\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81"+
            "\173\14\uffff\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70"+
            "\uffff\u03f0\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080"+
            "\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\7\164\1\u00cf"+
            "\1\u00d0\21\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\7\165"+
            "\1\u00d1\1\u00d2\21\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff"+
            "\37\170\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173"+
            "\14\uffff\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff"+
            "\u03f0\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff"+
            "\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\1\u00d3\15"+
            "\164\1\u00d4\13\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\1"+
            "\u00d5\15\165\1\u00d6\13\165\74\uffff\1\u0085\10\uffff\27\167"+
            "\1\uffff\37\170\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81"+
            "\173\14\uffff\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70"+
            "\uffff\u03f0\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080"+
            "\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\4\164\1\u00d8"+
            "\14\164\1\u00d7\10\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff"+
            "\4\165\1\u00da\14\165\1\u00d9\10\165\74\uffff\1\u0085\10\uffff"+
            "\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086\16\172\1"+
            "\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57\uffff\u0120"+
            "\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100\uffff\u04d0"+
            "\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\1\u00db\15"+
            "\164\1\u00dc\13\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\1"+
            "\u00dd\15\165\1\u00de\13\165\74\uffff\1\u0085\10\uffff\27\167"+
            "\1\uffff\37\170\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81"+
            "\173\14\uffff\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70"+
            "\uffff\u03f0\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080"+
            "\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\5\164\1\u00e0"+
            "\11\164\1\u00e1\1\164\1\u00df\10\164\1\uffff\1\166\2\uffff\1"+
            "\u0082\1\uffff\5\165\1\u00e3\11\165\1\u00e4\1\165\1\u00e2\10"+
            "\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\2\164\1\u00e8"+
            "\12\164\1\u00e5\3\164\1\u00e7\1\u00e6\1\164\1\u00e9\5\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\2\165\1\u00ed\12\165\1"+
            "\u00ea\3\165\1\u00ec\1\u00eb\1\165\1\u00ee\5\165\74\uffff\1"+
            "\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160"+
            "\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087"+
            "\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177"+
            "\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\5\164\1\u00f1"+
            "\7\164\1\u00ef\3\164\1\u00f0\1\u00f2\7\164\1\uffff\1\166\2\uffff"+
            "\1\u0082\1\uffff\5\165\1\u00f5\7\165\1\u00f3\3\165\1\u00f4\1"+
            "\u00f6\7\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\1\u00fb\7"+
            "\164\1\u00f8\5\164\1\u00f7\2\164\1\u00fa\7\164\1\u00f9\1\uffff"+
            "\1\166\2\uffff\1\u0082\1\uffff\1\u0100\7\165\1\u00fd\5\165\1"+
            "\u00fc\2\165\1\u00ff\7\165\1\u00fe\74\uffff\1\u0085\10\uffff"+
            "\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086\16\172\1"+
            "\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57\uffff\u0120"+
            "\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100\uffff\u04d0"+
            "\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\1\u0104\2"+
            "\164\1\u0103\4\164\1\u0102\5\164\1\u0101\13\164\1\uffff\1\166"+
            "\2\uffff\1\u0082\1\uffff\1\u0108\2\165\1\u0107\4\165\1\u0106"+
            "\5\165\1\u0105\13\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff"+
            "\37\170\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173"+
            "\14\uffff\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff"+
            "\u03f0\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff"+
            "\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\15\164\1"+
            "\u0109\11\164\1\u010a\2\164\1\uffff\1\166\2\uffff\1\u0082\1"+
            "\uffff\15\165\1\u010b\11\165\1\u010c\2\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\4\164\1\u010d"+
            "\25\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\4\165\1\u010e"+
            "\25\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\1\u010f\31"+
            "\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\1\u0110\31\165\74"+
            "\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208"+
            "\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff"+
            "\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff"+
            "\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0114\4\uffff\1\u0114\35\uffff\1\u0112\15\uffff\1\u0111"+
            "\10\uffff\1\u0114\5\uffff\1\u0114\2\uffff\1\u0112\1\u0114\7"+
            "\uffff\1\u0114\3\uffff\1\u0114\1\u0111\1\u0114\1\u0113",
            "",
            "",
            "\12\u0116",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\1\u008d\1"+
            "\164\1\u0090\5\164\1\u008e\5\164\1\u008f\13\164\1\uffff\1\166"+
            "\2\uffff\1\u0082\1\uffff\1\u0091\1\165\1\u0094\5\165\1\u0092"+
            "\5\165\1\u0093\13\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff"+
            "\37\170\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173"+
            "\14\uffff\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff"+
            "\u03f0\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff"+
            "\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\1\u0099\7"+
            "\164\1\u0097\2\164\1\u0098\5\164\1\u0096\2\164\1\u0095\5\164"+
            "\1\uffff\1\166\2\uffff\1\u0082\1\uffff\1\u009e\7\165\1\u009c"+
            "\2\165\1\u009d\5\165\1\u009b\2\165\1\u009a\5\165\74\uffff\1"+
            "\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160"+
            "\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087"+
            "\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177"+
            "\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\1\u009f\7"+
            "\164\1\u00a1\4\164\1\u00a3\1\u00a2\11\164\1\u00a0\1\164\1\uffff"+
            "\1\166\2\uffff\1\u0082\1\uffff\1\u00a4\7\165\1\u00a6\4\165\1"+
            "\u00a8\1\u00a7\11\165\1\u00a5\1\165\74\uffff\1\u0085\10\uffff"+
            "\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086\16\172\1"+
            "\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57\uffff\u0120"+
            "\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100\uffff\u04d0"+
            "\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\16\164\1"+
            "\u00aa\2\164\1\u00a9\10\164\1\uffff\1\166\2\uffff\1\u0082\1"+
            "\uffff\16\165\1\u00ac\2\165\1\u00ab\10\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\1\u00b1\3"+
            "\164\1\u00ad\2\164\1\u00b0\1\u00ae\12\164\1\u00af\1\u00b2\5"+
            "\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\1\u00b7\3\165\1\u00b3"+
            "\2\165\1\u00b6\1\u00b4\12\165\1\u00b5\1\u00b8\5\165\74\uffff"+
            "\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160"+
            "\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087"+
            "\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177"+
            "\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\1\u00bc\3"+
            "\164\1\u00ba\3\164\1\u00b9\10\164\1\u00bb\10\164\1\uffff\1\166"+
            "\2\uffff\1\u0082\1\uffff\1\u00c0\3\165\1\u00be\3\165\1\u00bd"+
            "\10\165\1\u00bf\10\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff"+
            "\37\170\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173"+
            "\14\uffff\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff"+
            "\u03f0\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff"+
            "\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\1\u00c2\3"+
            "\164\1\u00c1\11\164\1\u00c3\13\164\1\uffff\1\166\2\uffff\1\u0082"+
            "\1\uffff\1\u00c5\3\165\1\u00c4\11\165\1\u00c6\13\165\74\uffff"+
            "\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160"+
            "\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087"+
            "\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177"+
            "\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\4\164\1\u00ca"+
            "\6\164\1\u00c8\2\164\1\u00c7\2\164\1\u00c9\10\164\1\uffff\1"+
            "\166\2\uffff\1\u0082\1\uffff\4\165\1\u00ce\6\165\1\u00cc\2\165"+
            "\1\u00cb\2\165\1\u00cd\10\165\74\uffff\1\u0085\10\uffff\27\167"+
            "\1\uffff\37\170\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81"+
            "\173\14\uffff\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70"+
            "\uffff\u03f0\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080"+
            "\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\7\164\1\u00cf"+
            "\1\u00d0\21\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\7\165"+
            "\1\u00d1\1\u00d2\21\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff"+
            "\37\170\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173"+
            "\14\uffff\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff"+
            "\u03f0\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff"+
            "\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\1\u00d3\15"+
            "\164\1\u00d4\13\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\1"+
            "\u00d5\15\165\1\u00d6\13\165\74\uffff\1\u0085\10\uffff\27\167"+
            "\1\uffff\37\170\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81"+
            "\173\14\uffff\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70"+
            "\uffff\u03f0\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080"+
            "\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\4\164\1\u00d8"+
            "\14\164\1\u00d7\10\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff"+
            "\4\165\1\u00da\14\165\1\u00d9\10\165\74\uffff\1\u0085\10\uffff"+
            "\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086\16\172\1"+
            "\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57\uffff\u0120"+
            "\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100\uffff\u04d0"+
            "\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\1\u00db\15"+
            "\164\1\u00dc\13\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\1"+
            "\u00dd\15\165\1\u00de\13\165\74\uffff\1\u0085\10\uffff\27\167"+
            "\1\uffff\37\170\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81"+
            "\173\14\uffff\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70"+
            "\uffff\u03f0\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080"+
            "\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\5\164\1\u00e0"+
            "\11\164\1\u00e1\1\164\1\u00df\10\164\1\uffff\1\166\2\uffff\1"+
            "\u0082\1\uffff\5\165\1\u00e3\11\165\1\u00e4\1\165\1\u00e2\10"+
            "\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\2\164\1\u00e8"+
            "\12\164\1\u00e5\3\164\1\u00e7\1\u00e6\1\164\1\u00e9\5\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\2\165\1\u00ed\12\165\1"+
            "\u00ea\3\165\1\u00ec\1\u00eb\1\165\1\u00ee\5\165\74\uffff\1"+
            "\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160"+
            "\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087"+
            "\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177"+
            "\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\5\164\1\u00f1"+
            "\7\164\1\u00ef\3\164\1\u00f0\1\u00f2\7\164\1\uffff\1\166\2\uffff"+
            "\1\u0082\1\uffff\5\165\1\u00f5\7\165\1\u00f3\3\165\1\u00f4\1"+
            "\u00f6\7\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\1\u00fb\7"+
            "\164\1\u00f8\5\164\1\u00f7\2\164\1\u00fa\7\164\1\u00f9\1\uffff"+
            "\1\166\2\uffff\1\u0082\1\uffff\1\u0100\7\165\1\u00fd\5\165\1"+
            "\u00fc\2\165\1\u00ff\7\165\1\u00fe\74\uffff\1\u0085\10\uffff"+
            "\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086\16\172\1"+
            "\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57\uffff\u0120"+
            "\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100\uffff\u04d0"+
            "\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\1\u0104\2"+
            "\164\1\u0103\4\164\1\u0102\5\164\1\u0101\13\164\1\uffff\1\166"+
            "\2\uffff\1\u0082\1\uffff\1\u0108\2\165\1\u0107\4\165\1\u0106"+
            "\5\165\1\u0105\13\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff"+
            "\37\170\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173"+
            "\14\uffff\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff"+
            "\u03f0\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff"+
            "\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\15\164\1"+
            "\u0109\11\164\1\u010a\2\164\1\uffff\1\166\2\uffff\1\u0082\1"+
            "\uffff\15\165\1\u010b\11\165\1\u010c\2\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\4\164\1\u010d"+
            "\25\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\4\165\1\u010e"+
            "\25\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\1\u010f\31"+
            "\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\1\u0110\31\165\74"+
            "\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208"+
            "\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff"+
            "\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff"+
            "\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u011a\1\u0089\6\uffff\32\u0117"+
            "\1\uffff\1\166\2\uffff\1\u0119\1\uffff\32\u0118\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u011a\1\u0089\6\uffff\32\u0117"+
            "\1\uffff\1\166\2\uffff\1\u0119\1\uffff\32\u0118\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u011a\1\u0089\6\uffff\32\u0117"+
            "\1\uffff\1\166\2\uffff\1\u0119\1\uffff\32\u0118\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u011a\1\u0089\6\uffff\32\u0117"+
            "\1\uffff\1\166\2\uffff\1\u0119\1\uffff\32\u0118\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u011a\1\u0089\6\uffff\32\u0117"+
            "\1\uffff\1\166\2\uffff\1\u0119\1\uffff\32\u0118\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u011a\1\u0089\6\uffff\32\u0117"+
            "\1\uffff\1\166\2\uffff\1\u0119\1\uffff\32\u0118\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u011a\1\u0089\6\uffff\32\u0117"+
            "\1\uffff\1\166\2\uffff\1\u0119\1\uffff\32\u0118\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u011a\1\u0089\6\uffff\32\u0117"+
            "\1\uffff\1\166\2\uffff\1\u0119\1\uffff\32\u0118\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u011a\1\u0089\6\uffff\32\u0117"+
            "\1\uffff\1\166\2\uffff\1\u0119\1\uffff\32\u0118\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u011a\1\u0089\6\uffff\32\u0117"+
            "\1\uffff\1\166\2\uffff\1\u0119\1\uffff\32\u0118\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u011a\1\u0089\6\uffff\32\u0117"+
            "\1\uffff\1\166\2\uffff\1\u0119\1\uffff\32\u0118\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "",
            "",
            "",
            "\1\u011c\1\uffff\12\122\13\uffff\1\u011d\37\uffff\1\u011d",
            "\12\u011f\1\uffff\2\u011f\1\uffff\31\u011f\1\u011e\uffd8\u011f",
            "\12\u0121\1\uffff\2\u0121\1\uffff\24\u0121\1\u0120\uffdd\u0121",
            "",
            "",
            "",
            "",
            "",
            "\1\u0123\1\uffff\12\132\13\uffff\1\u0124\37\uffff\1\u0124",
            "\12\u0126",
            "",
            "",
            "\1\u0128\1\uffff\12\136\13\uffff\1\u0129\37\uffff\1\u0129",
            "\12\u012b",
            "\1\142\7\uffff\2\142\1\uffff\13\142\6\uffff\32\142\1\uffff"+
            "\1\142\2\uffff\1\142\1\uffff\32\142\74\uffff\1\142\10\uffff"+
            "\27\142\1\uffff\37\142\1\uffff\u0286\142\1\uffff\u1c81\142\14"+
            "\uffff\2\142\61\uffff\2\142\57\uffff\u0120\142\u0a70\uffff\u03f0"+
            "\142\21\uffff\ua7ff\142\u2100\uffff\u04d0\142\40\uffff\u020e"+
            "\142",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\2\164\1\u012f"+
            "\7\164\1\u012e\17\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff"+
            "\2\165\1\u0131\7\165\1\u0130\17\165\74\uffff\1\u0085\10\uffff"+
            "\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086\16\172\1"+
            "\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57\uffff\u0120"+
            "\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100\uffff\u04d0"+
            "\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\13\164\1"+
            "\u0132\16\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\13\165\1"+
            "\u0133\16\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\22\164\1"+
            "\u0134\7\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\22\165\1"+
            "\u0135\7\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\3\164\1\u0136"+
            "\26\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\3\165\1\u0137"+
            "\26\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\6\164\1\u0138"+
            "\23\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\6\165\1\u0139"+
            "\23\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\2\164\1\u012f"+
            "\7\164\1\u012e\17\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff"+
            "\2\165\1\u0131\7\165\1\u0130\17\165\74\uffff\1\u0085\10\uffff"+
            "\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086\16\172\1"+
            "\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57\uffff\u0120"+
            "\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100\uffff\u04d0"+
            "\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\13\164\1"+
            "\u0132\16\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\13\165\1"+
            "\u0133\16\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\22\164\1"+
            "\u0134\7\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\22\165\1"+
            "\u0135\7\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\3\164\1\u0136"+
            "\26\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\3\165\1\u0137"+
            "\26\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\6\164\1\u0138"+
            "\23\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\6\165\1\u0139"+
            "\23\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u013a",
            "\1\u0083\1\u0088\1\uffff\12\u011a\1\u0089\6\uffff\32\u0117"+
            "\1\uffff\1\166\2\uffff\1\u0119\1\uffff\32\u0118\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u011a\1\u0089\6\uffff\32\u0117"+
            "\1\uffff\1\166\2\uffff\1\u0119\1\uffff\32\u0118\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u011a\1\u0089\6\uffff\32\u0117"+
            "\1\uffff\1\166\2\uffff\1\u0119\1\uffff\32\u0118\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u011a\1\u0089\6\uffff\32\u0117"+
            "\1\uffff\1\166\2\uffff\1\u0119\1\uffff\32\u0118\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u011a\1\u0089\6\uffff\32\u0117"+
            "\1\uffff\1\166\2\uffff\1\u0119\1\uffff\32\u0118\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u011a\1\u0089\6\uffff\32\u0117"+
            "\1\uffff\1\166\2\uffff\1\u0119\1\uffff\32\u0118\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u011a\1\u0089\6\uffff\32\u0117"+
            "\1\uffff\1\166\2\uffff\1\u0119\1\uffff\32\u0118\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u011a\1\u0089\6\uffff\32\u0117"+
            "\1\uffff\1\166\2\uffff\1\u0119\1\uffff\32\u0118\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u011a\1\u0089\6\uffff\32\u0117"+
            "\1\uffff\1\166\2\uffff\1\u0119\1\uffff\32\u0118\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u011a\1\u0089\6\uffff\32\u0117"+
            "\1\uffff\1\166\2\uffff\1\u0119\1\uffff\32\u0118\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u011a\1\u0089\6\uffff\32\u0117"+
            "\1\uffff\1\166\2\uffff\1\u0119\1\uffff\32\u0118\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u011a\1\u0089\6\uffff\32\u0117"+
            "\1\uffff\1\166\2\uffff\1\u0119\1\uffff\32\u0118\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u011a\1\u0089\6\uffff\32\u0117"+
            "\1\uffff\1\166\2\uffff\1\u0119\1\uffff\32\u0118\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u011a\1\u0089\6\uffff\32\u0117"+
            "\1\uffff\1\166\2\uffff\1\u0119\1\uffff\32\u0118\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u011a\1\u0089\6\uffff\32\u0117"+
            "\1\uffff\1\166\2\uffff\1\u0119\1\uffff\32\u0118\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u011a\7\uffff\32\u0117\1\uffff"+
            "\1\166\2\uffff\1\u0119\1\uffff\32\u0118\74\uffff\1\u0085\10"+
            "\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086\16"+
            "\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57\uffff"+
            "\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100\uffff"+
            "\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\142\12\uffff\13\142\6\uffff\32\142\1\uffff\1\142\2\uffff"+
            "\1\142\1\uffff\32\142\105\uffff\27\142\1\uffff\37\142\1\uffff"+
            "\u0208\142\160\uffff\16\142\1\uffff\u1c81\142\14\uffff\2\142"+
            "\142\uffff\u0120\142\u0a70\uffff\u03f0\142\21\uffff\ua7ff\142"+
            "\u2100\uffff\u04d0\142\40\uffff\u020e\142",
            "",
            "",
            "",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\15\164\1"+
            "\u013b\14\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\15\165\1"+
            "\u013c\14\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\14\164\1"+
            "\u013d\15\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\14\165\1"+
            "\u013e\15\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\1\u013f\31"+
            "\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\1\u0140\31\165\74"+
            "\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208"+
            "\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff"+
            "\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff"+
            "\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\1\u0141\31"+
            "\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\1\u0142\31\165\74"+
            "\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208"+
            "\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff"+
            "\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff"+
            "\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\15\164\1"+
            "\u013b\14\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\15\165\1"+
            "\u013c\14\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\14\164\1"+
            "\u013d\15\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\14\165\1"+
            "\u013e\15\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\1\u013f\31"+
            "\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\1\u0140\31\165\74"+
            "\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208"+
            "\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff"+
            "\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff"+
            "\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\1\u0141\31"+
            "\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\1\u0142\31\165\74"+
            "\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208"+
            "\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff"+
            "\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff"+
            "\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\15\164\1"+
            "\u0143\14\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\15\165\1"+
            "\u0144\14\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\16\164\1"+
            "\u0145\13\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\16\165\1"+
            "\u0146\13\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\13\164\1"+
            "\u0147\16\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\13\165\1"+
            "\u0148\16\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\16\164\1"+
            "\u0149\13\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\16\165\1"+
            "\u014a\13\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\13\164\1"+
            "\u014b\16\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\13\165\1"+
            "\u014c\16\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\15\164\1"+
            "\u0143\14\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\15\165\1"+
            "\u0144\14\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\16\164\1"+
            "\u0145\13\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\16\165\1"+
            "\u0146\13\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\13\164\1"+
            "\u0147\16\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\13\165\1"+
            "\u0148\16\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\16\164\1"+
            "\u0149\13\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\16\165\1"+
            "\u014a\13\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\13\164\1"+
            "\u014b\16\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\13\165\1"+
            "\u014c\16\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\22\164\1"+
            "\u014d\7\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\22\165\1"+
            "\u014e\7\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\15\164\1"+
            "\u0150\14\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\15\165\1"+
            "\u0151\14\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\24\164\1"+
            "\u0152\5\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\24\165\1"+
            "\u0153\5\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\16\164\1"+
            "\u0154\13\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\16\165\1"+
            "\u0155\13\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\22\164\1"+
            "\u014d\7\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\22\165\1"+
            "\u014e\7\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\15\164\1"+
            "\u0150\14\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\15\165\1"+
            "\u0151\14\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\24\164\1"+
            "\u0152\5\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\24\165\1"+
            "\u0153\5\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\16\164\1"+
            "\u0154\13\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\16\165\1"+
            "\u0155\13\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\4\164\1\u0156"+
            "\25\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\4\165\1\u0157"+
            "\25\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\22\164\1"+
            "\u0158\7\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\22\165\1"+
            "\u0159\7\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\4\164\1\u0156"+
            "\25\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\4\165\1\u0157"+
            "\25\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\22\164\1"+
            "\u0158\7\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\22\165\1"+
            "\u0159\7\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\2\164\1\u015c"+
            "\10\164\1\u015a\3\164\1\u015d\1\164\1\u015b\10\164\1\uffff\1"+
            "\166\2\uffff\1\u0082\1\uffff\2\165\1\u0160\10\165\1\u015e\3"+
            "\165\1\u0161\1\165\1\u015f\10\165\74\uffff\1\u0085\10\uffff"+
            "\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086\16\172\1"+
            "\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57\uffff\u0120"+
            "\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100\uffff\u04d0"+
            "\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\13\164\1"+
            "\u0162\16\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\13\165\1"+
            "\u0163\16\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\21\164\1"+
            "\u0164\10\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\21\165\1"+
            "\u0165\10\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\1\u0166\31"+
            "\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\1\u0167\31\165\74"+
            "\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208"+
            "\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff"+
            "\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff"+
            "\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\14\164\1"+
            "\u0168\15\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\14\165\1"+
            "\u0169\15\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\1\164\1\u016a"+
            "\12\164\1\u016b\15\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff"+
            "\1\165\1\u016c\12\165\1\u016d\15\165\74\uffff\1\u0085\10\uffff"+
            "\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086\16\172\1"+
            "\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57\uffff\u0120"+
            "\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100\uffff\u04d0"+
            "\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\2\164\1\u015c"+
            "\10\164\1\u015a\3\164\1\u015d\1\164\1\u015b\10\164\1\uffff\1"+
            "\166\2\uffff\1\u0082\1\uffff\2\165\1\u0160\10\165\1\u015e\3"+
            "\165\1\u0161\1\165\1\u015f\10\165\74\uffff\1\u0085\10\uffff"+
            "\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086\16\172\1"+
            "\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57\uffff\u0120"+
            "\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100\uffff\u04d0"+
            "\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\13\164\1"+
            "\u0162\16\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\13\165\1"+
            "\u0163\16\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\21\164\1"+
            "\u0164\10\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\21\165\1"+
            "\u0165\10\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\1\u0166\31"+
            "\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\1\u0167\31\165\74"+
            "\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208"+
            "\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff"+
            "\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff"+
            "\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\14\164\1"+
            "\u0168\15\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\14\165\1"+
            "\u0169\15\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\1\164\1\u016a"+
            "\12\164\1\u016b\15\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff"+
            "\1\165\1\u016c\12\165\1\u016d\15\165\74\uffff\1\u0085\10\uffff"+
            "\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086\16\172\1"+
            "\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57\uffff\u0120"+
            "\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100\uffff\u04d0"+
            "\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\22\164\1"+
            "\u016e\7\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\22\165\1"+
            "\u016f\7\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\5\164\1\u0172"+
            "\5\164\1\u0171\6\164\1\u0170\7\164\1\uffff\1\166\2\uffff\1\u0082"+
            "\1\uffff\5\165\1\u0175\5\165\1\u0174\6\165\1\u0173\7\165\74"+
            "\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208"+
            "\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff"+
            "\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff"+
            "\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\16\164\1"+
            "\u0176\13\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\16\165\1"+
            "\u0177\13\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\23\164\1"+
            "\u0178\4\164\1\u0179\1\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff"+
            "\23\165\1\u017a\4\165\1\u017b\1\165\74\uffff\1\u0085\10\uffff"+
            "\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086\16\172\1"+
            "\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57\uffff\u0120"+
            "\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100\uffff\u04d0"+
            "\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\22\164\1"+
            "\u016e\7\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\22\165\1"+
            "\u016f\7\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\5\164\1\u0172"+
            "\5\164\1\u0171\6\164\1\u0170\7\164\1\uffff\1\166\2\uffff\1\u0082"+
            "\1\uffff\5\165\1\u0175\5\165\1\u0174\6\165\1\u0173\7\165\74"+
            "\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208"+
            "\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff"+
            "\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff"+
            "\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\16\164\1"+
            "\u0176\13\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\16\165\1"+
            "\u0177\13\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\23\164\1"+
            "\u0178\4\164\1\u0179\1\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff"+
            "\23\165\1\u017a\4\165\1\u017b\1\165\74\uffff\1\u0085\10\uffff"+
            "\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086\16\172\1"+
            "\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57\uffff\u0120"+
            "\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100\uffff\u04d0"+
            "\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\3\164\1\u017c"+
            "\2\164\1\u017d\10\164\1\u017e\12\164\1\uffff\1\166\2\uffff\1"+
            "\u0082\1\uffff\3\165\1\u017f\2\165\1\u0180\10\165\1\u0181\12"+
            "\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\15\164\1"+
            "\u0182\14\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\15\165\1"+
            "\u0183\14\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\24\164\1"+
            "\u0184\5\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\24\165\1"+
            "\u0185\5\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\3\164\1\u017c"+
            "\2\164\1\u017d\10\164\1\u017e\12\164\1\uffff\1\166\2\uffff\1"+
            "\u0082\1\uffff\3\165\1\u017f\2\165\1\u0180\10\165\1\u0181\12"+
            "\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\15\164\1"+
            "\u0182\14\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\15\165\1"+
            "\u0183\14\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\24\164\1"+
            "\u0184\5\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\24\165\1"+
            "\u0185\5\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\1\u0188\14"+
            "\164\1\u0186\1\164\1\u0187\4\164\1\u0189\5\164\1\uffff\1\166"+
            "\2\uffff\1\u0082\1\uffff\1\u018c\14\165\1\u018a\1\165\1\u018b"+
            "\4\165\1\u018d\5\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff"+
            "\37\170\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173"+
            "\14\uffff\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff"+
            "\u03f0\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff"+
            "\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\4\164\1\u018e"+
            "\25\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\4\165\1\u018f"+
            "\25\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\4\164\1\u0190"+
            "\25\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\4\165\1\u0191"+
            "\25\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\10\164\1"+
            "\u0192\21\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\10\165\1"+
            "\u0193\21\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\1\u0188\14"+
            "\164\1\u0186\1\164\1\u0187\4\164\1\u0189\5\164\1\uffff\1\166"+
            "\2\uffff\1\u0082\1\uffff\1\u018c\14\165\1\u018a\1\165\1\u018b"+
            "\4\165\1\u018d\5\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff"+
            "\37\170\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173"+
            "\14\uffff\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff"+
            "\u03f0\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff"+
            "\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\4\164\1\u018e"+
            "\25\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\4\165\1\u018f"+
            "\25\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\4\164\1\u0190"+
            "\25\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\4\165\1\u0191"+
            "\25\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\10\164\1"+
            "\u0192\21\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\10\165\1"+
            "\u0193\21\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\4\164\1\u0194"+
            "\25\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\4\165\1\u0195"+
            "\25\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\23\164\1"+
            "\u0196\6\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\23\165\1"+
            "\u0197\6\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\4\164\1\u0194"+
            "\25\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\4\165\1\u0195"+
            "\25\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\23\164\1"+
            "\u0196\6\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\23\165\1"+
            "\u0197\6\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\14\164\1"+
            "\u0198\15\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\14\165\1"+
            "\u0199\15\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\23\164\1"+
            "\u019b\2\164\1\u019a\3\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff"+
            "\23\165\1\u019d\2\165\1\u019c\3\165\74\uffff\1\u0085\10\uffff"+
            "\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086\16\172\1"+
            "\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57\uffff\u0120"+
            "\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100\uffff\u04d0"+
            "\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\14\164\1"+
            "\u0198\15\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\14\165\1"+
            "\u0199\15\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\23\164\1"+
            "\u019b\2\164\1\u019a\3\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff"+
            "\23\165\1\u019d\2\165\1\u019c\3\165\74\uffff\1\u0085\10\uffff"+
            "\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086\16\172\1"+
            "\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57\uffff\u0120"+
            "\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100\uffff\u04d0"+
            "\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\1\u019f\15"+
            "\164\1\u019e\13\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\1"+
            "\u01a1\15\165\1\u01a0\13\165\74\uffff\1\u0085\10\uffff\27\167"+
            "\1\uffff\37\170\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81"+
            "\173\14\uffff\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70"+
            "\uffff\u03f0\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080"+
            "\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\23\164\1"+
            "\u01a2\6\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\23\165\1"+
            "\u01a3\6\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\1\u019f\15"+
            "\164\1\u019e\13\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\1"+
            "\u01a1\15\165\1\u01a0\13\165\74\uffff\1\u0085\10\uffff\27\167"+
            "\1\uffff\37\170\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81"+
            "\173\14\uffff\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70"+
            "\uffff\u03f0\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080"+
            "\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\23\164\1"+
            "\u01a2\6\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\23\165\1"+
            "\u01a3\6\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\25\164\1"+
            "\u01a4\4\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\25\165\1"+
            "\u01a5\4\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\24\164\1"+
            "\u01a6\5\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\24\165\1"+
            "\u01a7\5\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\25\164\1"+
            "\u01a4\4\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\25\165\1"+
            "\u01a5\4\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\24\164\1"+
            "\u01a6\5\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\24\165\1"+
            "\u01a7\5\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\3\164\1\u01a8"+
            "\26\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\3\165\1\u01a9"+
            "\26\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\5\164\1\u01aa"+
            "\24\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\5\165\1\u01ab"+
            "\24\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\23\164\1"+
            "\u01ac\6\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\23\165\1"+
            "\u01ad\6\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\3\164\1\u01a8"+
            "\26\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\3\165\1\u01a9"+
            "\26\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\5\164\1\u01aa"+
            "\24\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\5\165\1\u01ab"+
            "\24\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\23\164\1"+
            "\u01ac\6\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\23\165\1"+
            "\u01ad\6\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\3\164\1\u01ae"+
            "\4\164\1\u01af\21\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff"+
            "\3\165\1\u01b0\4\165\1\u01b1\21\165\74\uffff\1\u0085\10\uffff"+
            "\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086\16\172\1"+
            "\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57\uffff\u0120"+
            "\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100\uffff\u04d0"+
            "\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\10\164\1"+
            "\u01b2\21\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\10\165\1"+
            "\u01b3\21\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\10\164\1"+
            "\u01b4\21\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\10\165\1"+
            "\u01b5\21\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\1\u01b6\31"+
            "\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\1\u01b7\31\165\74"+
            "\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208"+
            "\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff"+
            "\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff"+
            "\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\10\164\1"+
            "\u01b8\21\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\10\165\1"+
            "\u01b9\21\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\3\164\1\u01ae"+
            "\4\164\1\u01af\21\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff"+
            "\3\165\1\u01b0\4\165\1\u01b1\21\165\74\uffff\1\u0085\10\uffff"+
            "\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086\16\172\1"+
            "\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57\uffff\u0120"+
            "\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100\uffff\u04d0"+
            "\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\10\164\1"+
            "\u01b2\21\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\10\165\1"+
            "\u01b3\21\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\10\164\1"+
            "\u01b4\21\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\10\165\1"+
            "\u01b5\21\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\1\u01b6\31"+
            "\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\1\u01b7\31\165\74"+
            "\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208"+
            "\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff"+
            "\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff"+
            "\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\10\164\1"+
            "\u01b8\21\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\10\165\1"+
            "\u01b9\21\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\22\164\1"+
            "\u01bc\1\u01bb\6\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\22"+
            "\165\1\u01be\1\u01bd\6\165\74\uffff\1\u0085\10\uffff\27\167"+
            "\1\uffff\37\170\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81"+
            "\173\14\uffff\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70"+
            "\uffff\u03f0\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080"+
            "\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\10\164\1"+
            "\u01bf\21\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\10\165\1"+
            "\u01c0\21\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\1\164\1\u01c4"+
            "\6\164\1\u01c2\2\164\1\u01c5\1\164\1\u01c6\6\164\1\u01c3\5\164"+
            "\1\uffff\1\166\2\uffff\1\u0082\1\uffff\1\165\1\u01c9\6\165\1"+
            "\u01c7\2\165\1\u01ca\1\165\1\u01cb\6\165\1\u01c8\5\165\74\uffff"+
            "\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160"+
            "\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087"+
            "\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177"+
            "\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\22\164\1"+
            "\u01bc\1\u01bb\6\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\22"+
            "\165\1\u01be\1\u01bd\6\165\74\uffff\1\u0085\10\uffff\27\167"+
            "\1\uffff\37\170\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81"+
            "\173\14\uffff\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70"+
            "\uffff\u03f0\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080"+
            "\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\10\164\1"+
            "\u01bf\21\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\10\165\1"+
            "\u01c0\21\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\1\164\1\u01c4"+
            "\6\164\1\u01c2\2\164\1\u01c5\1\164\1\u01c6\6\164\1\u01c3\5\164"+
            "\1\uffff\1\166\2\uffff\1\u0082\1\uffff\1\165\1\u01c9\6\165\1"+
            "\u01c7\2\165\1\u01ca\1\165\1\u01cb\6\165\1\u01c8\5\165\74\uffff"+
            "\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160"+
            "\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087"+
            "\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177"+
            "\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\14\164\1"+
            "\u01cd\15\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\14\165\1"+
            "\u01ce\15\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\24\164\1"+
            "\u01d0\5\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\24\165\1"+
            "\u01d1\5\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\1\164\1\u01d2"+
            "\30\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\1\165\1\u01d3"+
            "\30\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\14\164\1"+
            "\u01cd\15\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\14\165\1"+
            "\u01ce\15\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\24\164\1"+
            "\u01d0\5\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\24\165\1"+
            "\u01d1\5\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\1\164\1\u01d2"+
            "\30\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\1\165\1\u01d3"+
            "\30\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\15\164\1"+
            "\u01d5\7\164\1\u01d4\4\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff"+
            "\15\165\1\u01d7\7\165\1\u01d6\4\165\74\uffff\1\u0085\10\uffff"+
            "\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086\16\172\1"+
            "\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57\uffff\u0120"+
            "\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100\uffff\u04d0"+
            "\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\15\164\1"+
            "\u01d8\14\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\15\165\1"+
            "\u01d9\14\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\5\u0084\1\u01da\4\u0084\1\u0089\6"+
            "\uffff\32\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74"+
            "\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208"+
            "\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff"+
            "\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff"+
            "\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\27\164\1"+
            "\u01db\2\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\27\165\1"+
            "\u01dc\2\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\15\164\1"+
            "\u01d5\7\164\1\u01d4\4\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff"+
            "\15\165\1\u01d7\7\165\1\u01d6\4\165\74\uffff\1\u0085\10\uffff"+
            "\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086\16\172\1"+
            "\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57\uffff\u0120"+
            "\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100\uffff\u04d0"+
            "\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\15\164\1"+
            "\u01d8\14\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\15\165\1"+
            "\u01d9\14\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\5\u0084\1\u01da\4\u0084\1\u0089\6"+
            "\uffff\32\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74"+
            "\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208"+
            "\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff"+
            "\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff"+
            "\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\27\164\1"+
            "\u01db\2\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\27\165\1"+
            "\u01dc\2\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\2\164\1\u01dd"+
            "\27\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\2\165\1\u01de"+
            "\27\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\10\164\1"+
            "\u01df\21\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\10\165\1"+
            "\u01e0\21\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\2\164\1\u01dd"+
            "\27\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\2\165\1\u01de"+
            "\27\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\10\164\1"+
            "\u01df\21\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\10\165\1"+
            "\u01e0\21\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\1\u01e1\31"+
            "\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\1\u01e2\31\165\74"+
            "\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208"+
            "\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff"+
            "\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff"+
            "\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\1\u01e1\31"+
            "\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\1\u01e2\31\165\74"+
            "\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208"+
            "\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff"+
            "\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff"+
            "\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\13\164\1"+
            "\u01e3\16\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\13\165\1"+
            "\u01e4\16\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\13\164\1"+
            "\u01e3\16\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\13\165\1"+
            "\u01e4\16\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u01e5\37\uffff\1\u01e5",
            "",
            "\12\u01e6\7\uffff\6\u01e6\32\uffff\6\u01e6",
            "",
            "",
            "\12\u0116\13\uffff\1\u011d\37\uffff\1\u011d",
            "\1\u0083\1\u0088\1\uffff\12\u011a\1\u0089\6\uffff\32\u0117"+
            "\1\uffff\1\166\2\uffff\1\u0119\1\uffff\32\u0118\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u011a\1\u0089\6\uffff\32\u0117"+
            "\1\uffff\1\166\2\uffff\1\u0119\1\uffff\32\u0118\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u011a\1\u0089\6\uffff\32\u0117"+
            "\1\uffff\1\166\2\uffff\1\u0119\1\uffff\32\u0118\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u011a\1\u0089\6\uffff\32\u0117"+
            "\1\uffff\1\166\2\uffff\1\u0119\1\uffff\32\u0118\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "",
            "\12\u01e8\13\uffff\1\u011d\37\uffff\1\u011d",
            "",
            "\1\u01e9",
            "",
            "\1\u01ea",
            "",
            "",
            "\12\u01eb\13\uffff\1\u0124\37\uffff\1\u0124",
            "",
            "",
            "\12\u0126\13\uffff\1\u0124\37\uffff\1\u0124",
            "",
            "\12\u01ec\13\uffff\1\u0129\37\uffff\1\u0129",
            "",
            "",
            "\12\u012b\13\uffff\1\u0129\37\uffff\1\u0129",
            "",
            "",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\12\u01f3\7\uffff\6\u01f3\32\uffff\6\u01f3",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\6\164\1\u01f4"+
            "\23\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\6\165\1\u01f5"+
            "\23\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\6\164\1\u01f4"+
            "\23\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\6\165\1\u01f5"+
            "\23\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\10\164\1"+
            "\u01f6\21\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\10\165\1"+
            "\u01f7\21\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\10\164\1"+
            "\u01f6\21\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\10\165\1"+
            "\u01f7\21\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\3\164\1\u01f8"+
            "\26\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\3\165\1\u01f9"+
            "\26\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\3\164\1\u01f8"+
            "\26\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\3\165\1\u01f9"+
            "\26\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\22\164\1"+
            "\u01fa\7\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\22\165\1"+
            "\u01fb\7\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\22\164\1"+
            "\u01fa\7\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\22\165\1"+
            "\u01fb\7\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\2\164\1\u01fc"+
            "\27\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\2\165\1\u01fd"+
            "\27\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\2\164\1\u01fc"+
            "\27\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\2\165\1\u01fd"+
            "\27\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\14\164\1"+
            "\u01fe\15\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\14\165\1"+
            "\u01ff\15\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\14\164\1"+
            "\u01fe\15\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\14\165\1"+
            "\u01ff\15\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\23\164\1"+
            "\u0200\6\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\23\165\1"+
            "\u0201\6\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\23\164\1"+
            "\u0200\6\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\23\165\1"+
            "\u0201\6\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\16\164\1"+
            "\u0202\13\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\16\165\1"+
            "\u0203\13\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\16\164\1"+
            "\u0202\13\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\16\165\1"+
            "\u0203\13\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\22\164\1"+
            "\u0204\7\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\22\165\1"+
            "\u0205\7\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\22\164\1"+
            "\u0204\7\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\22\165\1"+
            "\u0205\7\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\4\164\1\u0206"+
            "\25\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\4\165\1\u0207"+
            "\25\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\4\164\1\u0206"+
            "\25\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\4\165\1\u0207"+
            "\25\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\3\164\1\u0208"+
            "\26\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\3\165\1\u0209"+
            "\26\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\3\164\1\u0208"+
            "\26\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\3\165\1\u0209"+
            "\26\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\15\164\1"+
            "\u020a\14\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\15\165\1"+
            "\u020b\14\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\15\164\1"+
            "\u020a\14\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\15\165\1"+
            "\u020b\14\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\3\164\1\u020c"+
            "\26\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\3\165\1\u020d"+
            "\26\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\3\164\1\u020c"+
            "\26\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\3\165\1\u020d"+
            "\26\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\5\164\1\u020e"+
            "\24\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\5\165\1\u020f"+
            "\24\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\5\164\1\u020e"+
            "\24\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\5\165\1\u020f"+
            "\24\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\23\164\1"+
            "\u0210\6\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\23\165\1"+
            "\u0211\6\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\23\164\1"+
            "\u0210\6\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\23\165\1"+
            "\u0211\6\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\4\164\1\u0212"+
            "\25\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\4\165\1\u0213"+
            "\25\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\25\164\1"+
            "\u0214\4\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\25\165\1"+
            "\u0215\4\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\16\164\1"+
            "\u0216\13\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\16\165\1"+
            "\u0217\13\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\1\u0218\31"+
            "\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\1\u0219\31\165\74"+
            "\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208"+
            "\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff"+
            "\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff"+
            "\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\4\164\1\u0212"+
            "\25\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\4\165\1\u0213"+
            "\25\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\25\164\1"+
            "\u0214\4\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\25\165\1"+
            "\u0215\4\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\16\164\1"+
            "\u0216\13\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\16\165\1"+
            "\u0217\13\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\1\u0218\31"+
            "\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\1\u0219\31\165\74"+
            "\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208"+
            "\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff"+
            "\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff"+
            "\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\4\164\1\u021a"+
            "\25\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\4\165\1\u021b"+
            "\25\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\4\164\1\u021a"+
            "\25\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\4\165\1\u021b"+
            "\25\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\1\u0221\1"+
            "\u0220\1\164\1\u0222\1\u021f\6\164\1\u021d\6\164\1\u021e\1\164"+
            "\1\u0223\5\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\1\u0228"+
            "\1\u0227\1\165\1\u0229\1\u0226\6\165\1\u0224\6\165\1\u0225\1"+
            "\165\1\u022a\5\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff"+
            "\37\170\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173"+
            "\14\uffff\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff"+
            "\u03f0\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff"+
            "\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\1\u0221\1"+
            "\u0220\1\164\1\u0222\1\u021f\6\164\1\u021d\6\164\1\u021e\1\164"+
            "\1\u0223\5\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\1\u0228"+
            "\1\u0227\1\165\1\u0229\1\u0226\6\165\1\u0224\6\165\1\u0225\1"+
            "\165\1\u022a\5\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff"+
            "\37\170\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173"+
            "\14\uffff\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff"+
            "\u03f0\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff"+
            "\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\1\u0084\1\u022b\1\u022c\1\u022d\1"+
            "\u0084\1\u022e\4\u0084\1\u0089\6\uffff\32\164\1\uffff\1\166"+
            "\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085\10\uffff\27"+
            "\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086\16\172\1\uffff"+
            "\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57\uffff\u0120\175"+
            "\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100\uffff\u04d0"+
            "\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\1\u0084\1\u022b\1\u022c\1\u022d\1"+
            "\u0084\1\u022e\4\u0084\1\u0089\6\uffff\32\164\1\uffff\1\166"+
            "\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085\10\uffff\27"+
            "\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086\16\172\1\uffff"+
            "\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57\uffff\u0120\175"+
            "\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100\uffff\u04d0"+
            "\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\4\164\1\u022f"+
            "\12\164\1\u0230\12\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff"+
            "\4\165\1\u0231\12\165\1\u0232\12\165\74\uffff\1\u0085\10\uffff"+
            "\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086\16\172\1"+
            "\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57\uffff\u0120"+
            "\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100\uffff\u04d0"+
            "\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\4\164\1\u022f"+
            "\12\164\1\u0230\12\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff"+
            "\4\165\1\u0231\12\165\1\u0232\12\165\74\uffff\1\u0085\10\uffff"+
            "\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086\16\172\1"+
            "\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57\uffff\u0120"+
            "\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100\uffff\u04d0"+
            "\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\22\164\1"+
            "\u0233\7\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\22\165\1"+
            "\u0234\7\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\22\164\1"+
            "\u0233\7\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\22\165\1"+
            "\u0234\7\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\23\164\1"+
            "\u0236\6\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\23\165\1"+
            "\u0237\6\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\23\164\1"+
            "\u0236\6\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\23\165\1"+
            "\u0237\6\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\2\164\1\u0238"+
            "\27\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\2\165\1\u0239"+
            "\27\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\4\164\1\u023a"+
            "\25\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\4\165\1\u023b"+
            "\25\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\1\u023c\31"+
            "\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\1\u023d\31\165\74"+
            "\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208"+
            "\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff"+
            "\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff"+
            "\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\2\164\1\u0238"+
            "\27\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\2\165\1\u0239"+
            "\27\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\4\164\1\u023a"+
            "\25\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\4\165\1\u023b"+
            "\25\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\1\u023c\31"+
            "\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\1\u023d\31\165\74"+
            "\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208"+
            "\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff"+
            "\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff"+
            "\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\17\164\1"+
            "\u023e\12\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\17\165\1"+
            "\u023f\12\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\17\164\1"+
            "\u023e\12\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\17\165\1"+
            "\u023f\12\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\1\u0240\31"+
            "\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\1\u0241\31\165\74"+
            "\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208"+
            "\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff"+
            "\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff"+
            "\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\1\u0240\31"+
            "\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\1\u0241\31\165\74"+
            "\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208"+
            "\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff"+
            "\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff"+
            "\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\24\164\1"+
            "\u0243\5\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\24\165\1"+
            "\u0244\5\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\4\164\1\u0245"+
            "\25\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\4\165\1\u0246"+
            "\25\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\13\164\1"+
            "\u0247\16\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\13\165\1"+
            "\u0248\16\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\24\164\1"+
            "\u0243\5\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\24\165\1"+
            "\u0244\5\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\4\164\1\u0245"+
            "\25\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\4\165\1\u0246"+
            "\25\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\13\164\1"+
            "\u0247\16\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\13\165\1"+
            "\u0248\16\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\3\164\1\u0249"+
            "\26\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\3\165\1\u024a"+
            "\26\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\3\164\1\u0249"+
            "\26\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\3\165\1\u024a"+
            "\26\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\15\164\1"+
            "\u024b\14\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\15\165\1"+
            "\u024c\14\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\15\164\1"+
            "\u024b\14\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\15\165\1"+
            "\u024c\14\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\2\164\1\u024e"+
            "\17\164\1\u024d\1\u024f\6\164\1\uffff\1\166\2\uffff\1\u0082"+
            "\1\uffff\2\165\1\u0251\17\165\1\u0250\1\u0252\6\165\74\uffff"+
            "\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160"+
            "\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087"+
            "\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177"+
            "\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\30\164\1"+
            "\u0253\1\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\30\165\1"+
            "\u0254\1\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\13\164\1"+
            "\u0255\16\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\13\165\1"+
            "\u0256\16\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\15\164\1"+
            "\u0257\14\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\15\165\1"+
            "\u0258\14\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\2\164\1\u024e"+
            "\17\164\1\u024d\1\u024f\6\164\1\uffff\1\166\2\uffff\1\u0082"+
            "\1\uffff\2\165\1\u0251\17\165\1\u0250\1\u0252\6\165\74\uffff"+
            "\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160"+
            "\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087"+
            "\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177"+
            "\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\30\164\1"+
            "\u0253\1\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\30\165\1"+
            "\u0254\1\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\13\164\1"+
            "\u0255\16\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\13\165\1"+
            "\u0256\16\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\15\164\1"+
            "\u0257\14\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\15\165\1"+
            "\u0258\14\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\1\u0259\31"+
            "\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\1\u025a\31\165\74"+
            "\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208"+
            "\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff"+
            "\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff"+
            "\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\1\u0259\31"+
            "\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\1\u025a\31\165\74"+
            "\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208"+
            "\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff"+
            "\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff"+
            "\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\1\u025b\31"+
            "\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\1\u025c\31\165\74"+
            "\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208"+
            "\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff"+
            "\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff"+
            "\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\1\u025b\31"+
            "\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\1\u025c\31\165\74"+
            "\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208"+
            "\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff"+
            "\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff"+
            "\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\13\164\1"+
            "\u025d\16\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\13\165\1"+
            "\u025e\16\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\13\164\1"+
            "\u025d\16\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\13\165\1"+
            "\u025e\16\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\21\164\1"+
            "\u025f\10\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\21\165\1"+
            "\u0260\10\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\21\164\1"+
            "\u025f\10\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\21\165\1"+
            "\u0260\10\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\7\164\1\u0261"+
            "\22\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\7\165\1\u0262"+
            "\22\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\7\164\1\u0261"+
            "\22\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\7\165\1\u0262"+
            "\22\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\4\164\1\u0263"+
            "\25\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\4\165\1\u0264"+
            "\25\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\4\164\1\u0263"+
            "\25\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\4\165\1\u0264"+
            "\25\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\24\164\1"+
            "\u0267\5\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\24\165\1"+
            "\u0268\5\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\17\164\1"+
            "\u0269\12\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\17\165\1"+
            "\u026a\12\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\24\164\1"+
            "\u0267\5\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\24\165\1"+
            "\u0268\5\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\17\164\1"+
            "\u0269\12\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\17\165\1"+
            "\u026a\12\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\10\164\1"+
            "\u026c\21\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\10\165\1"+
            "\u026d\21\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\10\164\1"+
            "\u026c\21\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\10\165\1"+
            "\u026d\21\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\21\164\1"+
            "\u026e\10\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\21\165\1"+
            "\u026f\10\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\21\164\1"+
            "\u026e\10\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\21\165\1"+
            "\u026f\10\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\4\164\1\u0270"+
            "\25\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\4\165\1\u0271"+
            "\25\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\4\164\1\u0270"+
            "\25\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\4\165\1\u0271"+
            "\25\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\22\164\1"+
            "\u0272\7\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\22\165\1"+
            "\u0273\7\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\22\164\1"+
            "\u0272\7\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\22\165\1"+
            "\u0273\7\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\10\164\1"+
            "\u0274\21\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\10\165\1"+
            "\u0275\21\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\10\164\1"+
            "\u0274\21\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\10\165\1"+
            "\u0275\21\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\4\164\1\u0276"+
            "\25\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\4\165\1\u0277"+
            "\25\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\16\164\1"+
            "\u0278\13\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\16\165\1"+
            "\u0279\13\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\4\164\1\u0276"+
            "\25\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\4\165\1\u0277"+
            "\25\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\16\164\1"+
            "\u0278\13\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\16\165\1"+
            "\u0279\13\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\15\164\1"+
            "\u027a\14\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\15\165\1"+
            "\u027b\14\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\15\164\1"+
            "\u027a\14\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\15\165\1"+
            "\u027b\14\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\22\164\1"+
            "\u027d\7\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\22\165\1"+
            "\u027e\7\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\22\164\1"+
            "\u027d\7\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\22\165\1"+
            "\u027e\7\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\3\164\1\u027f"+
            "\26\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\3\165\1\u0280"+
            "\26\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\3\164\1\u027f"+
            "\26\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\3\165\1\u0280"+
            "\26\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\16\164\1"+
            "\u0281\13\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\16\165\1"+
            "\u0282\13\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\4\164\1\u0283"+
            "\25\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\4\165\1\u0284"+
            "\25\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\16\164\1"+
            "\u0281\13\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\16\165\1"+
            "\u0282\13\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\4\164\1\u0283"+
            "\25\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\4\165\1\u0284"+
            "\25\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\21\164\1"+
            "\u0286\10\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\21\165\1"+
            "\u0287\10\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\21\164\1"+
            "\u0288\10\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\21\165\1"+
            "\u0289\10\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\13\164\1"+
            "\u028a\16\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\13\165\1"+
            "\u028b\16\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\10\164\1"+
            "\u028c\21\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\10\165\1"+
            "\u028d\21\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\24\164\1"+
            "\u028e\5\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\24\165\1"+
            "\u028f\5\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\21\164\1"+
            "\u0286\10\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\21\165\1"+
            "\u0287\10\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\21\164\1"+
            "\u0288\10\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\21\165\1"+
            "\u0289\10\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\13\164\1"+
            "\u028a\16\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\13\165\1"+
            "\u028b\16\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\10\164\1"+
            "\u028c\21\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\10\165\1"+
            "\u028d\21\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\24\164\1"+
            "\u028e\5\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\24\165\1"+
            "\u028f\5\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\4\164\1\u0290"+
            "\25\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\4\165\1\u0291"+
            "\25\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\4\164\1\u0290"+
            "\25\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\4\165\1\u0291"+
            "\25\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\4\164\1\u0292"+
            "\25\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\4\165\1\u0293"+
            "\25\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\4\164\1\u0292"+
            "\25\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\4\165\1\u0293"+
            "\25\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\13\164\1"+
            "\u0294\16\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\13\165\1"+
            "\u0295\16\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\13\164\1"+
            "\u0294\16\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\13\165\1"+
            "\u0295\16\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\4\164\1\u0296"+
            "\25\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\4\165\1\u0297"+
            "\25\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\23\164\1"+
            "\u0298\6\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\23\165\1"+
            "\u0299\6\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\4\164\1\u0296"+
            "\25\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\4\165\1\u0297"+
            "\25\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\23\164\1"+
            "\u0298\6\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\23\165\1"+
            "\u0299\6\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\24\164\1"+
            "\u029b\5\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\24\165\1"+
            "\u029c\5\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\24\164\1"+
            "\u029b\5\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\24\165\1"+
            "\u029c\5\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\16\164\1"+
            "\u029f\13\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\16\165\1"+
            "\u02a0\13\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\16\164\1"+
            "\u029f\13\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\16\165\1"+
            "\u02a0\13\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\22\164\1"+
            "\u02a1\7\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\22\165\1"+
            "\u02a2\7\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\22\164\1"+
            "\u02a1\7\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\22\165\1"+
            "\u02a2\7\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\21\164\1"+
            "\u02a3\10\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\21\165\1"+
            "\u02a4\10\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\21\164\1"+
            "\u02a3\10\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\21\165\1"+
            "\u02a4\10\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\24\164\1"+
            "\u02a5\5\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\24\165\1"+
            "\u02a6\5\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\24\164\1"+
            "\u02a5\5\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\24\165\1"+
            "\u02a6\5\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u02a7\37\uffff\1\u02a7",
            "\12\u02a8\7\uffff\6\u02a8\32\uffff\6\u02a8",
            "",
            "\12\u01e8\13\uffff\1\u011d\37\uffff\1\u011d",
            "",
            "",
            "\12\u01eb\13\uffff\1\u0124\37\uffff\1\u0124",
            "\12\u01ec\13\uffff\1\u0129\37\uffff\1\u0129",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\u02a9\7\uffff\6\u02a9\32\uffff\6\u02a9",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\14\164\1"+
            "\u02ac\7\164\1\u02ab\5\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff"+
            "\14\165\1\u02ae\7\165\1\u02ad\5\165\74\uffff\1\u0085\10\uffff"+
            "\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086\16\172\1"+
            "\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57\uffff\u0120"+
            "\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100\uffff\u04d0"+
            "\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\14\164\1"+
            "\u02ac\7\164\1\u02ab\5\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff"+
            "\14\165\1\u02ae\7\165\1\u02ad\5\165\74\uffff\1\u0085\10\uffff"+
            "\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086\16\172\1"+
            "\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57\uffff\u0120"+
            "\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100\uffff\u04d0"+
            "\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\23\164\1"+
            "\u02af\6\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\23\165\1"+
            "\u02b0\6\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\23\164\1"+
            "\u02af\6\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\23\165\1"+
            "\u02b0\6\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\4\164\1\u02b2"+
            "\25\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\4\165\1\u02b3"+
            "\25\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\4\164\1\u02b2"+
            "\25\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\4\165\1\u02b3"+
            "\25\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\2\164\1\u02b4"+
            "\20\164\1\u02b5\6\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff"+
            "\2\165\1\u02b6\20\165\1\u02b7\6\165\74\uffff\1\u0085\10\uffff"+
            "\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086\16\172\1"+
            "\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57\uffff\u0120"+
            "\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100\uffff\u04d0"+
            "\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\2\164\1\u02b4"+
            "\20\164\1\u02b5\6\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff"+
            "\2\165\1\u02b6\20\165\1\u02b7\6\165\74\uffff\1\u0085\10\uffff"+
            "\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086\16\172\1"+
            "\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57\uffff\u0120"+
            "\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100\uffff\u04d0"+
            "\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\4\164\1\u02b9"+
            "\25\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\4\165\1\u02ba"+
            "\25\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\4\164\1\u02b9"+
            "\25\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\4\165\1\u02ba"+
            "\25\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\21\164\1"+
            "\u02bb\10\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\21\165\1"+
            "\u02bc\10\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\21\164\1"+
            "\u02bb\10\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\21\165\1"+
            "\u02bc\10\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\4\164\1\u02bd"+
            "\25\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\4\165\1\u02be"+
            "\25\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\4\164\1\u02bd"+
            "\25\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\4\165\1\u02be"+
            "\25\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\10\164\1"+
            "\u02c1\21\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\10\165\1"+
            "\u02c2\21\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\10\164\1"+
            "\u02c1\21\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\10\165\1"+
            "\u02c2\21\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\3\164\1\u02c3"+
            "\26\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\3\165\1\u02c4"+
            "\26\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\3\164\1\u02c3"+
            "\26\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\3\165\1\u02c4"+
            "\26\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\4\164\1\u02c5"+
            "\25\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\4\165\1\u02c6"+
            "\25\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\4\164\1\u02c5"+
            "\25\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\4\165\1\u02c6"+
            "\25\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\10\164\1"+
            "\u02c7\21\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\10\165\1"+
            "\u02c8\21\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\10\164\1"+
            "\u02c7\21\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\10\165\1"+
            "\u02c8\21\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\2\164\1\u02ca"+
            "\27\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\2\165\1\u02cb"+
            "\27\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\2\164\1\u02ca"+
            "\27\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\2\165\1\u02cb"+
            "\27\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\10\164\1"+
            "\u02cc\21\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\10\165\1"+
            "\u02cd\21\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\10\164\1"+
            "\u02cc\21\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\10\165\1"+
            "\u02cd\21\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\15\164\1"+
            "\u02ce\14\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\15\165\1"+
            "\u02cf\14\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\15\164\1"+
            "\u02ce\14\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\15\165\1"+
            "\u02cf\14\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\21\164\1"+
            "\u02d0\10\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\21\165\1"+
            "\u02d1\10\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\21\164\1"+
            "\u02d0\10\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\21\165\1"+
            "\u02d1\10\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\15\164\1"+
            "\u02d2\14\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\15\165\1"+
            "\u02d3\14\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\15\164\1"+
            "\u02d2\14\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\15\165\1"+
            "\u02d3\14\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\1\u02d5\3"+
            "\164\1\u02d4\25\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\1"+
            "\u02d7\3\165\1\u02d6\25\165\74\uffff\1\u0085\10\uffff\27\167"+
            "\1\uffff\37\170\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81"+
            "\173\14\uffff\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70"+
            "\uffff\u03f0\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080"+
            "\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\23\164\1"+
            "\u02d8\6\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\23\165\1"+
            "\u02d9\6\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\15\164\1"+
            "\u02da\14\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\15\165\1"+
            "\u02db\14\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\4\164\1\u02dc"+
            "\25\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\4\165\1\u02dd"+
            "\25\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\5\164\1\u02de"+
            "\24\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\5\165\1\u02df"+
            "\24\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\23\164\1"+
            "\u02e0\6\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\23\165\1"+
            "\u02e1\6\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\24\164\1"+
            "\u02e2\5\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\24\165\1"+
            "\u02e3\5\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\1\u02d5\3"+
            "\164\1\u02d4\25\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\1"+
            "\u02d7\3\165\1\u02d6\25\165\74\uffff\1\u0085\10\uffff\27\167"+
            "\1\uffff\37\170\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81"+
            "\173\14\uffff\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70"+
            "\uffff\u03f0\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080"+
            "\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\23\164\1"+
            "\u02d8\6\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\23\165\1"+
            "\u02d9\6\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\15\164\1"+
            "\u02da\14\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\15\165\1"+
            "\u02db\14\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\4\164\1\u02dc"+
            "\25\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\4\165\1\u02dd"+
            "\25\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\5\164\1\u02de"+
            "\24\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\5\165\1\u02df"+
            "\24\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\23\164\1"+
            "\u02e0\6\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\23\165\1"+
            "\u02e1\6\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\24\164\1"+
            "\u02e2\5\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\24\165\1"+
            "\u02e3\5\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\2\u0084\1\u02e5\2\u0084\1\u02e6\4"+
            "\u0084\1\u0089\6\uffff\32\164\1\uffff\1\166\2\uffff\1\u0082"+
            "\1\uffff\32\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37"+
            "\170\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14"+
            "\uffff\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff"+
            "\u03f0\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff"+
            "\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\10\u0084\1\u02e7\1\u0084\1\u0089\6"+
            "\uffff\32\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74"+
            "\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208"+
            "\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff"+
            "\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff"+
            "\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\1\u0084\1\u02e8\10\u0084\1\u0089\6"+
            "\uffff\32\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74"+
            "\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208"+
            "\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff"+
            "\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff"+
            "\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\23\164\1"+
            "\u02e9\6\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\23\165\1"+
            "\u02ea\6\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\13\164\1"+
            "\u02eb\16\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\13\165\1"+
            "\u02ec\16\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\23\164\1"+
            "\u02e9\6\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\23\165\1"+
            "\u02ea\6\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\13\164\1"+
            "\u02eb\16\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\13\165\1"+
            "\u02ec\16\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\23\164\1"+
            "\u02ed\6\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\23\165\1"+
            "\u02ee\6\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\23\164\1"+
            "\u02ed\6\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\23\165\1"+
            "\u02ee\6\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\10\164\1"+
            "\u02ef\21\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\10\165\1"+
            "\u02f0\21\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\10\164\1"+
            "\u02ef\21\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\10\165\1"+
            "\u02f0\21\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\21\164\1"+
            "\u02f2\10\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\21\165\1"+
            "\u02f3\10\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\21\164\1"+
            "\u02f2\10\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\21\165\1"+
            "\u02f3\10\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\23\164\1"+
            "\u02f4\6\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\23\165\1"+
            "\u02f5\6\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\23\164\1"+
            "\u02f4\6\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\23\165\1"+
            "\u02f5\6\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\24\164\1"+
            "\u02f6\5\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\24\165\1"+
            "\u02f7\5\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\24\164\1"+
            "\u02f6\5\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\24\165\1"+
            "\u02f7\5\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\23\164\1"+
            "\u02fa\6\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\23\165\1"+
            "\u02fb\6\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\23\164\1"+
            "\u02fa\6\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\23\165\1"+
            "\u02fb\6\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\2\164\1\u02fc"+
            "\27\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\2\165\1\u02fd"+
            "\27\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\2\164\1\u02fc"+
            "\27\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\2\165\1\u02fd"+
            "\27\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\27\164\1"+
            "\u02fe\2\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\27\165\1"+
            "\u02ff\2\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\27\164\1"+
            "\u02fe\2\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\27\165\1"+
            "\u02ff\2\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\1\u0300\31"+
            "\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\1\u0301\31\165\74"+
            "\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208"+
            "\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff"+
            "\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff"+
            "\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\1\u0300\31"+
            "\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\1\u0301\31\165\74"+
            "\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208"+
            "\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff"+
            "\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff"+
            "\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\3\164\1\u0303"+
            "\26\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\3\165\1\u0304"+
            "\26\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\3\164\1\u0303"+
            "\26\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\3\165\1\u0304"+
            "\26\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\23\164\1"+
            "\u0305\6\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\23\165\1"+
            "\u0306\6\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\1\u0307\31"+
            "\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\1\u0308\31\165\74"+
            "\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208"+
            "\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff"+
            "\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff"+
            "\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\1\u0309\31"+
            "\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\1\u030a\31\165\74"+
            "\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208"+
            "\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff"+
            "\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff"+
            "\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\23\164\1"+
            "\u0305\6\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\23\165\1"+
            "\u0306\6\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\1\u0307\31"+
            "\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\1\u0308\31\165\74"+
            "\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208"+
            "\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff"+
            "\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff"+
            "\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\1\u0309\31"+
            "\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\1\u030a\31\165\74"+
            "\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208"+
            "\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff"+
            "\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff"+
            "\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\4\164\1\u030c"+
            "\25\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\4\165\1\u030d"+
            "\25\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\4\164\1\u030c"+
            "\25\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\4\165\1\u030d"+
            "\25\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\23\164\1"+
            "\u030e\6\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\23\165\1"+
            "\u030f\6\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\23\164\1"+
            "\u030e\6\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\23\165\1"+
            "\u030f\6\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\21\164\1"+
            "\u0310\10\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\21\165\1"+
            "\u0311\10\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\21\164\1"+
            "\u0310\10\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\21\165\1"+
            "\u0311\10\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\23\164\1"+
            "\u0312\6\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\23\165\1"+
            "\u0313\6\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\23\164\1"+
            "\u0312\6\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\23\165\1"+
            "\u0313\6\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\4\164\1\u0315"+
            "\25\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\4\165\1\u0316"+
            "\25\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\4\164\1\u0315"+
            "\25\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\4\165\1\u0316"+
            "\25\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\3\164\1\u0318"+
            "\26\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\3\165\1\u0319"+
            "\26\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\3\164\1\u0318"+
            "\26\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\3\165\1\u0319"+
            "\26\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "",
            "",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\17\164\1"+
            "\u031a\12\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\17\165\1"+
            "\u031b\12\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\17\164\1"+
            "\u031a\12\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\17\165\1"+
            "\u031b\12\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\7\164\1\u031c"+
            "\22\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\7\165\1\u031d"+
            "\22\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\7\164\1\u031c"+
            "\22\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\7\165\1\u031d"+
            "\22\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\15\164\1"+
            "\u031e\14\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\15\165\1"+
            "\u031f\14\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\15\164\1"+
            "\u031e\14\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\15\165\1"+
            "\u031f\14\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\22\164\1"+
            "\u0320\7\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\22\165\1"+
            "\u0321\7\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\22\164\1"+
            "\u0320\7\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\22\165\1"+
            "\u0321\7\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\21\164\1"+
            "\u0322\10\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\21\165\1"+
            "\u0323\10\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\21\164\1"+
            "\u0322\10\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\21\165\1"+
            "\u0323\10\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\4\164\1\u0324"+
            "\25\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\4\165\1\u0325"+
            "\25\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\4\164\1\u0324"+
            "\25\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\4\165\1\u0325"+
            "\25\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\16\164\1"+
            "\u0326\13\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\16\165\1"+
            "\u0327\13\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\16\164\1"+
            "\u0326\13\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\16\165\1"+
            "\u0327\13\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\5\164\1\u0328"+
            "\24\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\5\165\1\u0329"+
            "\24\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\5\164\1\u0328"+
            "\24\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\5\165\1\u0329"+
            "\24\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\15\164\1"+
            "\u032a\14\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\15\165\1"+
            "\u032b\14\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\15\164\1"+
            "\u032a\14\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\15\165\1"+
            "\u032b\14\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\6\164\1\u032c"+
            "\23\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\6\165\1\u032d"+
            "\23\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\6\164\1\u032c"+
            "\23\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\6\165\1\u032d"+
            "\23\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\4\164\1\u032e"+
            "\25\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\4\165\1\u032f"+
            "\25\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\4\164\1\u032e"+
            "\25\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\4\165\1\u032f"+
            "\25\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\21\164\1"+
            "\u0332\10\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\21\165\1"+
            "\u0333\10\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\21\164\1"+
            "\u0332\10\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\21\165\1"+
            "\u0333\10\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\10\164\1"+
            "\u0334\21\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\10\165\1"+
            "\u0335\21\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\10\164\1"+
            "\u0334\21\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\10\165\1"+
            "\u0335\21\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\10\164\1"+
            "\u0336\21\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\10\165\1"+
            "\u0337\21\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\10\164\1"+
            "\u0336\21\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\10\165\1"+
            "\u0337\21\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\1\u0338\31"+
            "\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\1\u0339\31\165\74"+
            "\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208"+
            "\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff"+
            "\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff"+
            "\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\1\u0338\31"+
            "\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\1\u0339\31\165\74"+
            "\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208"+
            "\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff"+
            "\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff"+
            "\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\23\164\1"+
            "\u033a\6\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\23\165\1"+
            "\u033b\6\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\23\164\1"+
            "\u033a\6\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\23\165\1"+
            "\u033b\6\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\14\164\1"+
            "\u033c\15\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\14\165\1"+
            "\u033d\15\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\14\164\1"+
            "\u033c\15\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\14\165\1"+
            "\u033d\15\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\31\164\1"+
            "\u033e\1\uffff\1\166\2\uffff\1\u0082\1\uffff\31\165\1\u033f"+
            "\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208"+
            "\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff"+
            "\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff"+
            "\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\31\164\1"+
            "\u033e\1\uffff\1\166\2\uffff\1\u0082\1\uffff\31\165\1\u033f"+
            "\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208"+
            "\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff"+
            "\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff"+
            "\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\4\164\1\u0341"+
            "\25\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\4\165\1\u0342"+
            "\25\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\4\164\1\u0341"+
            "\25\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\4\165\1\u0342"+
            "\25\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\7\164\1\u0344"+
            "\22\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\7\165\1\u0345"+
            "\22\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\7\164\1\u0344"+
            "\22\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\7\165\1\u0345"+
            "\22\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\22\164\1"+
            "\u0346\1\u0347\6\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\22"+
            "\165\1\u0348\1\u0349\6\165\74\uffff\1\u0085\10\uffff\27\167"+
            "\1\uffff\37\170\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81"+
            "\173\14\uffff\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70"+
            "\uffff\u03f0\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080"+
            "\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\22\164\1"+
            "\u0346\1\u0347\6\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\22"+
            "\165\1\u0348\1\u0349\6\165\74\uffff\1\u0085\10\uffff\27\167"+
            "\1\uffff\37\170\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81"+
            "\173\14\uffff\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70"+
            "\uffff\u03f0\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080"+
            "\40\uffff\u020e\u0081",
            "",
            "",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\3\164\1\u034a"+
            "\26\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\3\165\1\u034b"+
            "\26\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\3\164\1\u034a"+
            "\26\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\3\165\1\u034b"+
            "\26\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\23\164\1"+
            "\u034c\6\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\23\165\1"+
            "\u034d\6\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\23\164\1"+
            "\u034c\6\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\23\165\1"+
            "\u034d\6\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\4\164\1\u034f"+
            "\25\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\4\165\1\u0350"+
            "\25\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\4\164\1\u034f"+
            "\25\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\4\165\1\u0350"+
            "\25\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\174\u0352\1\uffff\uff83\u0352",
            "\12\u0353\7\uffff\6\u0353\32\uffff\6\u0353",
            "\12\u0354\7\uffff\6\u0354\32\uffff\6\u0354",
            "",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\1\u0355\31"+
            "\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\1\u0356\31\165\74"+
            "\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208"+
            "\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff"+
            "\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff"+
            "\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\1\u0357\31"+
            "\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\1\u0358\31\165\74"+
            "\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208"+
            "\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff"+
            "\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff"+
            "\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\1\u0355\31"+
            "\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\1\u0356\31\165\74"+
            "\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208"+
            "\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff"+
            "\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff"+
            "\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\1\u0357\31"+
            "\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\1\u0358\31\165\74"+
            "\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208"+
            "\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff"+
            "\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff"+
            "\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\1\u035b\31"+
            "\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\1\u035c\31\165\74"+
            "\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208"+
            "\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff"+
            "\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff"+
            "\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\10\164\1"+
            "\u035d\21\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\10\165\1"+
            "\u035e\21\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\1\u035b\31"+
            "\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\1\u035c\31\165\74"+
            "\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208"+
            "\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff"+
            "\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff"+
            "\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\10\164\1"+
            "\u035d\21\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\10\165\1"+
            "\u035e\21\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\21\164\1"+
            "\u035f\10\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\21\165\1"+
            "\u0360\10\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\21\164\1"+
            "\u035f\10\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\21\165\1"+
            "\u0360\10\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "",
            "",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\15\164\1"+
            "\u0363\14\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\15\165\1"+
            "\u0364\14\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\15\164\1"+
            "\u0363\14\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\15\165\1"+
            "\u0364\14\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\27\164\1"+
            "\u0367\2\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\27\165\1"+
            "\u0368\2\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\27\164\1"+
            "\u0367\2\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\27\165\1"+
            "\u0368\2\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\23\164\1"+
            "\u0369\6\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\23\165\1"+
            "\u036a\6\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\23\164\1"+
            "\u0369\6\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\23\165\1"+
            "\u036a\6\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\2\164\1\u036b"+
            "\27\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\2\165\1\u036c"+
            "\27\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\2\164\1\u036b"+
            "\27\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\2\165\1\u036c"+
            "\27\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\3\164\1\u036d"+
            "\26\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\3\165\1\u036e"+
            "\26\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\3\164\1\u036d"+
            "\26\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\3\165\1\u036e"+
            "\26\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\1\u036f\31"+
            "\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\1\u0370\31\165\74"+
            "\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208"+
            "\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff"+
            "\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff"+
            "\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\1\u036f\31"+
            "\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\1\u0370\31\165\74"+
            "\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208"+
            "\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff"+
            "\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff"+
            "\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\23\164\1"+
            "\u0371\6\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\23\165\1"+
            "\u0372\6\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\23\164\1"+
            "\u0371\6\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\23\165\1"+
            "\u0372\6\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\15\164\1"+
            "\u0373\14\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\15\165\1"+
            "\u0374\14\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\15\164\1"+
            "\u0375\14\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\15\165\1"+
            "\u0376\14\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\15\164\1"+
            "\u0373\14\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\15\165\1"+
            "\u0374\14\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\15\164\1"+
            "\u0375\14\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\15\165\1"+
            "\u0376\14\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\1\u0377\31"+
            "\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\1\u0378\31\165\74"+
            "\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208"+
            "\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff"+
            "\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff"+
            "\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\1\u0377\31"+
            "\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\1\u0378\31\165\74"+
            "\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208"+
            "\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff"+
            "\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff"+
            "\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\3\164\1\u0379"+
            "\26\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\3\165\1\u037a"+
            "\26\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\3\164\1\u0379"+
            "\26\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\3\165\1\u037a"+
            "\26\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\5\164\1\u037b"+
            "\24\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\5\165\1\u037c"+
            "\24\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\5\164\1\u037b"+
            "\24\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\5\165\1\u037c"+
            "\24\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\23\164\1"+
            "\u037d\6\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\23\165\1"+
            "\u037e\6\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\23\164\1"+
            "\u037d\6\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\23\165\1"+
            "\u037e\6\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\10\164\1"+
            "\u0380\21\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\10\165\1"+
            "\u0381\21\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\10\164\1"+
            "\u0380\21\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\10\165\1"+
            "\u0381\21\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "",
            "\1\u0083\1\u0088\1\uffff\4\u0084\1\u0382\5\u0084\1\u0089\6"+
            "\uffff\32\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74"+
            "\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208"+
            "\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff"+
            "\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff"+
            "\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\6\u0084\1\u0383\3\u0084\1\u0089\6"+
            "\uffff\32\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74"+
            "\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208"+
            "\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff"+
            "\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff"+
            "\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\4\u0084\1\u0384\5\u0084\1\u0089\6"+
            "\uffff\32\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74"+
            "\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208"+
            "\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff"+
            "\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff"+
            "\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\2\u0084\1\u0385\7\u0084\1\u0089\6"+
            "\uffff\32\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74"+
            "\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208"+
            "\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff"+
            "\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff"+
            "\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\4\164\1\u0386"+
            "\25\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\4\165\1\u0387"+
            "\25\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\4\164\1\u0386"+
            "\25\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\4\165\1\u0387"+
            "\25\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\4\164\1\u0388"+
            "\25\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\4\165\1\u0389"+
            "\25\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\4\164\1\u0388"+
            "\25\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\4\165\1\u0389"+
            "\25\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\21\164\1"+
            "\u038a\10\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\21\165\1"+
            "\u038b\10\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\21\164\1"+
            "\u038a\10\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\21\165\1"+
            "\u038b\10\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\15\164\1"+
            "\u038c\14\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\15\165\1"+
            "\u038d\14\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\15\164\1"+
            "\u038c\14\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\15\165\1"+
            "\u038d\14\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\10\164\1"+
            "\u038e\21\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\10\165\1"+
            "\u038f\21\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\10\164\1"+
            "\u038e\21\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\10\165\1"+
            "\u038f\21\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\4\164\1\u0390"+
            "\25\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\4\165\1\u0391"+
            "\25\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\4\164\1\u0390"+
            "\25\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\4\165\1\u0391"+
            "\25\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\13\164\1"+
            "\u0392\16\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\13\165\1"+
            "\u0393\16\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\13\164\1"+
            "\u0392\16\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\13\165\1"+
            "\u0393\16\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "",
            "",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\30\164\1"+
            "\u0394\1\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\30\165\1"+
            "\u0395\1\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\30\164\1"+
            "\u0394\1\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\30\165\1"+
            "\u0395\1\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\4\164\1\u0396"+
            "\25\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\4\165\1\u0397"+
            "\25\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\4\164\1\u0396"+
            "\25\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\4\165\1\u0397"+
            "\25\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\2\164\1\u0399"+
            "\27\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\2\165\1\u039a"+
            "\27\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\2\164\1\u0399"+
            "\27\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\2\165\1\u039a"+
            "\27\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\21\164\1"+
            "\u039c\10\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\21\165\1"+
            "\u039d\10\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\21\164\1"+
            "\u039c\10\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\21\165\1"+
            "\u039d\10\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\23\164\1"+
            "\u039e\6\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\23\165\1"+
            "\u039f\6\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\23\164\1"+
            "\u039e\6\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\23\165\1"+
            "\u039f\6\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\10\164\1"+
            "\u03a0\21\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\10\165\1"+
            "\u03a1\21\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\10\164\1"+
            "\u03a0\21\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\10\165\1"+
            "\u03a1\21\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\22\164\1"+
            "\u03a2\7\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\22\165\1"+
            "\u03a3\7\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\22\164\1"+
            "\u03a2\7\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\22\165\1"+
            "\u03a3\7\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\4\164\1\u03a6"+
            "\25\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\4\165\1\u03a7"+
            "\25\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\4\164\1\u03a6"+
            "\25\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\4\165\1\u03a7"+
            "\25\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u03ab\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u03ab\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\6\164\1\u03ad"+
            "\23\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\6\165\1\u03ae"+
            "\23\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\6\164\1\u03ad"+
            "\23\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\6\165\1\u03ae"+
            "\23\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\23\164\1"+
            "\u03b1\6\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\23\165\1"+
            "\u03b2\6\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\23\164\1"+
            "\u03b1\6\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\23\165\1"+
            "\u03b2\6\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\15\164\1"+
            "\u03b3\14\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\15\165\1"+
            "\u03b4\14\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\15\164\1"+
            "\u03b3\14\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\15\165\1"+
            "\u03b4\14\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "",
            "",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\23\164\1"+
            "\u03b9\6\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\23\165\1"+
            "\u03ba\6\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\23\164\1"+
            "\u03b9\6\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\23\165\1"+
            "\u03ba\6\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\15\164\1"+
            "\u03bd\14\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\15\165\1"+
            "\u03be\14\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\15\164\1"+
            "\u03bd\14\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\15\165\1"+
            "\u03be\14\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\4\164\1\u03bf"+
            "\25\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\4\165\1\u03c0"+
            "\25\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\4\164\1\u03bf"+
            "\25\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\4\165\1\u03c0"+
            "\25\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\4\164\1\u03c1"+
            "\25\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\4\165\1\u03c2"+
            "\25\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\4\164\1\u03c1"+
            "\25\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\4\165\1\u03c2"+
            "\25\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\16\164\1"+
            "\u03c3\13\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\16\165\1"+
            "\u03c4\13\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\16\164\1"+
            "\u03c3\13\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\16\165\1"+
            "\u03c4\13\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\4\164\1\u03c8"+
            "\25\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\4\165\1\u03c9"+
            "\25\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\4\164\1\u03c8"+
            "\25\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\4\165\1\u03c9"+
            "\25\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\4\164\1\u03ca"+
            "\25\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\4\165\1\u03cb"+
            "\25\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\4\164\1\u03ca"+
            "\25\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\4\165\1\u03cb"+
            "\25\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\22\164\1"+
            "\u03cc\7\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\22\165\1"+
            "\u03cd\7\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\22\164\1"+
            "\u03cc\7\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\22\165\1"+
            "\u03cd\7\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\22\164\1"+
            "\u03ce\7\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\22\165\1"+
            "\u03cf\7\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\22\164\1"+
            "\u03ce\7\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\22\165\1"+
            "\u03cf\7\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "",
            "",
            "\12\u03d0\7\uffff\6\u03d0\32\uffff\6\u03d0",
            "\12\u03d1\7\uffff\6\u03d1\32\uffff\6\u03d1",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\6\164\1\u03d2"+
            "\23\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\6\165\1\u03d3"+
            "\23\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\6\164\1\u03d2"+
            "\23\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\6\165\1\u03d3"+
            "\23\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\23\164\1"+
            "\u03d4\6\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\23\165\1"+
            "\u03d5\6\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\23\164\1"+
            "\u03d4\6\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\23\165\1"+
            "\u03d5\6\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "",
            "",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\13\164\1"+
            "\u03d6\16\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\13\165\1"+
            "\u03d7\16\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\13\164\1"+
            "\u03d6\16\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\13\165\1"+
            "\u03d7\16\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\16\164\1"+
            "\u03d8\13\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\16\165\1"+
            "\u03d9\13\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\16\164\1"+
            "\u03d8\13\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\16\165\1"+
            "\u03d9\13\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "",
            "",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\6\164\1\u03db"+
            "\23\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\6\165\1\u03dc"+
            "\23\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\6\164\1\u03db"+
            "\23\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\6\165\1\u03dc"+
            "\23\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "",
            "",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\4\164\1\u03df"+
            "\25\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\4\165\1\u03e0"+
            "\25\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\4\164\1\u03df"+
            "\25\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\4\165\1\u03e0"+
            "\25\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\22\164\1"+
            "\u03e1\7\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\22\165\1"+
            "\u03e2\7\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\22\164\1"+
            "\u03e1\7\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\22\165\1"+
            "\u03e2\7\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\23\164\1"+
            "\u03e3\6\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\23\165\1"+
            "\u03e4\6\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\23\164\1"+
            "\u03e3\6\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\23\165\1"+
            "\u03e4\6\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\6\164\1\u03e7"+
            "\23\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\6\165\1\u03e8"+
            "\23\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\6\164\1\u03e7"+
            "\23\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\6\165\1\u03e8"+
            "\23\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\21\164\1"+
            "\u03e9\10\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\21\165\1"+
            "\u03ea\10\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\21\164\1"+
            "\u03e9\10\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\21\165\1"+
            "\u03ea\10\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\22\164\1"+
            "\u03eb\7\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\22\165\1"+
            "\u03ec\7\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\22\164\1"+
            "\u03eb\7\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\22\165\1"+
            "\u03ec\7\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\16\164\1"+
            "\u03ed\13\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\16\165\1"+
            "\u03ee\13\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\16\164\1"+
            "\u03ed\13\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\16\165\1"+
            "\u03ee\13\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\4\164\1\u03ef"+
            "\25\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\4\165\1\u03f0"+
            "\25\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\4\164\1\u03ef"+
            "\25\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\4\165\1\u03f0"+
            "\25\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\3\164\1\u03f1"+
            "\26\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\3\165\1\u03f2"+
            "\26\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\3\164\1\u03f1"+
            "\26\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\3\165\1\u03f2"+
            "\26\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\21\164\1"+
            "\u03f7\10\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\21\165\1"+
            "\u03f8\10\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\21\164\1"+
            "\u03f7\10\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\21\165\1"+
            "\u03f8\10\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\2\164\1\u03fb"+
            "\27\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\2\165\1\u03fc"+
            "\27\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\2\164\1\u03fb"+
            "\27\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\2\165\1\u03fc"+
            "\27\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\1\164\1\u03fd"+
            "\30\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\1\165\1\u03fe"+
            "\30\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\1\164\1\u03fd"+
            "\30\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\1\165\1\u03fe"+
            "\30\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\23\164\1"+
            "\u0400\6\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\23\165\1"+
            "\u0401\6\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\23\164\1"+
            "\u0400\6\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\23\165\1"+
            "\u0401\6\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\17\164\1"+
            "\u0402\12\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\17\165\1"+
            "\u0403\12\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\17\164\1"+
            "\u0402\12\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\17\165\1"+
            "\u0403\12\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\3\164\1\u0404"+
            "\26\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\3\165\1\u0405"+
            "\26\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\3\164\1\u0404"+
            "\26\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\3\165\1\u0405"+
            "\26\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\4\164\1\u0406"+
            "\25\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\4\165\1\u0407"+
            "\25\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\4\164\1\u0406"+
            "\25\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\4\165\1\u0407"+
            "\25\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\24\164\1"+
            "\u0408\5\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\24\165\1"+
            "\u0409\5\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\24\164\1"+
            "\u0408\5\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\24\165\1"+
            "\u0409\5\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\15\164\1"+
            "\u040b\14\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\15\165\1"+
            "\u040c\14\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\15\164\1"+
            "\u040b\14\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\15\165\1"+
            "\u040c\14\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\2\164\1\u040d"+
            "\27\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\2\165\1\u040e"+
            "\27\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\2\164\1\u040d"+
            "\27\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\2\165\1\u040e"+
            "\27\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "",
            "",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "",
            "",
            "",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\2\164\1\u0410"+
            "\27\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\2\165\1\u0411"+
            "\27\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "",
            "",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\1\u0414\31"+
            "\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\1\u0415\31\165\74"+
            "\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208"+
            "\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff"+
            "\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff"+
            "\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\1\u0414\31"+
            "\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\1\u0415\31\165\74"+
            "\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208"+
            "\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff"+
            "\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff"+
            "\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "",
            "",
            "",
            "",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "",
            "",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\12\164\1"+
            "\u0417\17\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\12\165\1"+
            "\u0418\17\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\12\164\1"+
            "\u0417\17\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\12\165\1"+
            "\u0418\17\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\21\164\1"+
            "\u0419\10\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\21\165\1"+
            "\u041a\10\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\21\164\1"+
            "\u0419\10\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\21\165\1"+
            "\u041a\10\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\21\164\1"+
            "\u041b\10\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\21\165\1"+
            "\u041c\10\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\21\164\1"+
            "\u041b\10\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\21\165\1"+
            "\u041c\10\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\15\164\1"+
            "\u041d\14\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\15\165\1"+
            "\u041e\14\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\15\164\1"+
            "\u041d\14\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\15\165\1"+
            "\u041e\14\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "",
            "",
            "",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\22\164\1"+
            "\u041f\7\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\22\165\1"+
            "\u0420\7\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\22\164\1"+
            "\u041f\7\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\22\165\1"+
            "\u0420\7\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0421\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0421\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u011a\1\u0089\6\uffff\32\u0117"+
            "\1\uffff\1\166\2\uffff\1\u0119\1\uffff\32\u0118\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u011a\1\u0089\6\uffff\32\u0117"+
            "\1\uffff\1\166\2\uffff\1\u0119\1\uffff\32\u0118\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\4\164\1\u0424"+
            "\25\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\4\165\1\u0425"+
            "\25\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\4\164\1\u0424"+
            "\25\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\4\165\1\u0425"+
            "\25\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\2\164\1\u0426"+
            "\27\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\2\165\1\u0427"+
            "\27\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\2\164\1\u0426"+
            "\27\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\2\165\1\u0427"+
            "\27\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\13\164\1"+
            "\u0428\16\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\13\165\1"+
            "\u0429\16\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\13\164\1"+
            "\u0428\16\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\13\165\1"+
            "\u0429\16\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\15\164\1"+
            "\u042a\14\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\15\165\1"+
            "\u042b\14\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\15\164\1"+
            "\u042a\14\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\15\165\1"+
            "\u042b\14\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\22\164\1"+
            "\u042c\7\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\22\165\1"+
            "\u042d\7\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\22\164\1"+
            "\u042c\7\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\22\165\1"+
            "\u042d\7\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "",
            "",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\16\164\1"+
            "\u0430\13\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\16\165\1"+
            "\u0431\13\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\16\164\1"+
            "\u0430\13\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\16\165\1"+
            "\u0431\13\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "",
            "",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\23\164\1"+
            "\u0433\6\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\23\165\1"+
            "\u0434\6\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\23\164\1"+
            "\u0433\6\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\23\165\1"+
            "\u0434\6\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\21\164\1"+
            "\u0436\10\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\21\165\1"+
            "\u0437\10\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\21\164\1"+
            "\u0436\10\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\21\165\1"+
            "\u0437\10\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\21\164\1"+
            "\u0438\10\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\21\165\1"+
            "\u0439\10\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\21\164\1"+
            "\u0438\10\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\21\165\1"+
            "\u0439\10\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "",
            "",
            "",
            "",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\14\164\1"+
            "\u043b\15\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\14\165\1"+
            "\u043c\15\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\14\164\1"+
            "\u043b\15\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\14\165\1"+
            "\u043c\15\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "",
            "",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\23\164\1"+
            "\u043d\6\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\23\165\1"+
            "\u043e\6\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\23\164\1"+
            "\u043d\6\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\23\165\1"+
            "\u043e\6\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\4\164\1\u043f"+
            "\25\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\4\165\1\u0440"+
            "\25\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\4\164\1\u043f"+
            "\25\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\4\165\1\u0440"+
            "\25\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\4\164\1\u0442"+
            "\25\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\4\165\1\u0443"+
            "\25\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\4\164\1\u0442"+
            "\25\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\4\165\1\u0443"+
            "\25\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\2\164\1\u0446"+
            "\27\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\2\165\1\u0447"+
            "\27\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\2\164\1\u0446"+
            "\27\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\2\165\1\u0447"+
            "\27\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\22\164\1"+
            "\u0448\7\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\22\165\1"+
            "\u0449\7\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\22\164\1"+
            "\u0448\7\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\22\165\1"+
            "\u0449\7\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\4\164\1\u044a"+
            "\25\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\4\165\1\u044b"+
            "\25\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\4\164\1\u044a"+
            "\25\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\4\165\1\u044b"+
            "\25\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\16\164\1"+
            "\u044c\13\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\16\165\1"+
            "\u044d\13\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\16\164\1"+
            "\u044c\13\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\16\165\1"+
            "\u044d\13\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "",
            "",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\13\164\1"+
            "\u044e\16\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\13\165\1"+
            "\u044f\16\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\13\164\1"+
            "\u044e\16\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\13\165\1"+
            "\u044f\16\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\1\u0451\31"+
            "\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\1\u0452\31\165\74"+
            "\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208"+
            "\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff"+
            "\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff"+
            "\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\1\u0451\31"+
            "\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\1\u0452\31\165\74"+
            "\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208"+
            "\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff"+
            "\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff"+
            "\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\10\164\1"+
            "\u0453\21\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\10\165\1"+
            "\u0454\21\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\10\164\1"+
            "\u0453\21\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\10\165\1"+
            "\u0454\21\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\4\164\1\u0455"+
            "\25\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\4\165\1\u0456"+
            "\25\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\4\164\1\u0455"+
            "\25\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\4\165\1\u0456"+
            "\25\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\5\164\1\u0458"+
            "\24\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\5\165\1\u0459"+
            "\24\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "",
            "",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\7\164\1\u045b"+
            "\22\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\7\165\1\u045c"+
            "\22\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\7\164\1\u045b"+
            "\22\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\7\165\1\u045c"+
            "\22\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "",
            "",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\21\164\1"+
            "\u0460\10\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\21\165\1"+
            "\u0461\10\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\21\164\1"+
            "\u0460\10\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\21\165\1"+
            "\u0461\10\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\22\164\1"+
            "\u0462\7\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\22\165\1"+
            "\u0463\7\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\22\164\1"+
            "\u0462\7\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\22\165\1"+
            "\u0463\7\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\4\164\1\u0464"+
            "\25\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\4\165\1\u0465"+
            "\25\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\4\164\1\u0464"+
            "\25\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\4\165\1\u0465"+
            "\25\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "",
            "",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\23\164\1"+
            "\u046b\6\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\23\165\1"+
            "\u046c\6\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\23\164\1"+
            "\u046b\6\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\23\165\1"+
            "\u046c\6\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\15\164\1"+
            "\u046f\14\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\15\165\1"+
            "\u0470\14\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\15\164\1"+
            "\u046f\14\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\15\165\1"+
            "\u0470\14\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\13\164\1"+
            "\u0472\16\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\13\165\1"+
            "\u0473\16\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\13\164\1"+
            "\u0472\16\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\13\165\1"+
            "\u0473\16\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\2\164\1\u0474"+
            "\27\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\2\165\1\u0475"+
            "\27\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\2\164\1\u0474"+
            "\27\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\2\165\1\u0475"+
            "\27\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\16\164\1"+
            "\u0477\13\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\16\165\1"+
            "\u0478\13\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\16\164\1"+
            "\u0477\13\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\16\165\1"+
            "\u0478\13\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\4\164\1\u0479"+
            "\25\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\4\165\1\u047a"+
            "\25\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\4\164\1\u0479"+
            "\25\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\4\165\1\u047a"+
            "\25\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "",
            "",
            "",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "",
            "",
            "",
            "",
            "",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "",
            "",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\2\164\1\u047f"+
            "\27\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\2\165\1\u0480"+
            "\27\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\2\164\1\u047f"+
            "\27\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\2\165\1\u0480"+
            "\27\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff"+
            "\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174"+
            "\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21"+
            "\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\21\164\1"+
            "\u0483\10\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\21\165\1"+
            "\u0484\10\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\21\164\1"+
            "\u0483\10\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\21\165\1"+
            "\u0484\10\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\22\164\1"+
            "\u0485\7\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\22\165\1"+
            "\u0486\7\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\22\164\1"+
            "\u0485\7\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\22\165\1"+
            "\u0486\7\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "",
            "",
            "",
            "",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\1\u0487\31"+
            "\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\1\u0488\31\165\74"+
            "\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208"+
            "\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff"+
            "\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff"+
            "\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\1\u0487\31"+
            "\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\1\u0488\31\165\74"+
            "\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208"+
            "\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff"+
            "\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff"+
            "\177\u2100\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "",
            "",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0489\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0489\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\23\164\1"+
            "\u048b\6\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\23\165\1"+
            "\u048c\6\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\23\164\1"+
            "\u048b\6\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\23\165\1"+
            "\u048c\6\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\24\164\1"+
            "\u048d\5\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\24\165\1"+
            "\u048e\5\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\21\164\1"+
            "\u0490\10\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\21\165\1"+
            "\u0491\10\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\21\164\1"+
            "\u0490\10\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\21\165\1"+
            "\u0491\10\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\10\164\1"+
            "\u0492\21\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\10\165\1"+
            "\u0493\21\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\10\164\1"+
            "\u0492\21\164\1\uffff\1\166\2\uffff\1\u0082\1\uffff\10\165\1"+
            "\u0493\21\165\74\uffff\1\u0085\10\uffff\27\167\1\uffff\37\170"+
            "\1\uffff\u0208\171\160\u0086\16\172\1\uffff\u1c81\173\14\uffff"+
            "\2\174\61\uffff\2\u0087\57\uffff\u0120\175\u0a70\uffff\u03f0"+
            "\176\21\uffff\ua7ff\177\u2100\uffff\u04d0\u0080\40\uffff\u020e"+
            "\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            "\1\u0083\1\u0088\1\uffff\12\u0084\1\u0089\6\uffff\32\164\1"+
            "\uffff\1\166\2\uffff\1\u0082\1\uffff\32\165\74\uffff\1\u0085"+
            "\10\uffff\27\167\1\uffff\37\170\1\uffff\u0208\171\160\u0086"+
            "\16\172\1\uffff\u1c81\173\14\uffff\2\174\61\uffff\2\u0087\57"+
            "\uffff\u0120\175\u0a70\uffff\u03f0\176\21\uffff\ua7ff\177\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0081",
            ""
    };

    static final short[] DFA43_eot = DFA.unpackEncodedString(DFA43_eotS);
    static final short[] DFA43_eof = DFA.unpackEncodedString(DFA43_eofS);
    static final char[] DFA43_min = DFA.unpackEncodedStringToUnsignedChars(DFA43_minS);
    static final char[] DFA43_max = DFA.unpackEncodedStringToUnsignedChars(DFA43_maxS);
    static final short[] DFA43_accept = DFA.unpackEncodedString(DFA43_acceptS);
    static final short[] DFA43_special = DFA.unpackEncodedString(DFA43_specialS);
    static final short[][] DFA43_transition;

    static {
        int numStates = DFA43_transitionS.length;
        DFA43_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA43_transition[i] = DFA.unpackEncodedString(DFA43_transitionS[i]);
        }
    }

    class DFA43 extends DFA {

        public DFA43(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 43;
            this.eot = DFA43_eot;
            this.eof = DFA43_eof;
            this.min = DFA43_min;
            this.max = DFA43_max;
            this.accept = DFA43_accept;
            this.special = DFA43_special;
            this.transition = DFA43_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__268 | T__269 | T__270 | T__271 | T__272 | T__273 | T__274 | T__275 | T__276 | T__277 | T__278 | T__279 | T__280 | T__281 | T__282 | ARROW | FUNCLANG | FUNCCALL | FUNCTION | BASE | PREFIX | SELECT | DISTINCT | REDUCED | AS | CONSTRUCT | WHERE_TOKEN | DESCRIBE | ASK | FROM | NAMED | GROUP | BY | HAVING | ORDER | ASC | DESC | LIMIT | OFFSET | BINDINGS | UNDEF | LOAD | SILENT | INTO | CLEAR | DROP | CREATE | TO | MOVE | COPY | INSERT | DATA | DELETE | WITH | USING | DEFAULT | GRAPH | ALL | OPTIONAL | SERVICE | BIND | MINUS | UNION | FILTER | STR | LANG | LANGMATCHES | DATATYPE | BOUND | IRI | URI | BNODE | RAND | ABS | CEIL | FLOOR | ROUND | CONCAT | STRLEN | UCASE | LCASE | ENCODE_FOR_URI | CONTAINS | STRSTARTS | STRENDS | STRBEFORE | STRAFTER | YEAR | MONTH | DAY | HOURS | MINUTES | SECONDS | TIMEZONE | TZ | NOW | MD5 | SHA1 | SHA224 | SHA256 | SHA384 | SHA512 | COALESCE | IF | STRLANG | STRDT | SAMETERM | ISIRI | ISURI | ISBLANK | ISLITERAL | ISNUMERIC | REGEX | TRUE | FALSE | ADD | IN | NOT | SUBSTR | EXISTS | COUNT | SUM | MIN | MAX | AVG | SAMPLE | GROUP_CONCAT | SEPARATOR | VALUES | REPLACE | UUID | STRUUID | POST | TABLE | GET | SOP | EOP | OPEN_CURLY_BRACE | CLOSE_CURLY_BRACE | DOT | OPEN_BRACE | CLOSE_BRACE | COMMA | SEMICOLON | LOGICAL_OR | LOGICAL_AND | OPEN_SQ_BRACKET | CLOSE_SQ_BRACKET | LT | PNAME_NS | PNAME_LN | BLANK_NODE_LABEL | VAR1 | VAR2 | VAR0 | LANGTAG | INTEGER | DECIMAL | DOUBLE | INTEGER_POSITIVE | DECIMAL_POSITIVE | DOUBLE_POSITIVE | INTEGER_NEGATIVE | DECIMAL_NEGATIVE | DOUBLE_NEGATIVE | STRING_LINE_NONEOP | STRING_LITERAL1 | STRING_LITERAL2 | STRING_LITERAL_LONG1 | STRING_LITERAL_LONG2 | ECHAR | WS | COMMENT );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA43_679 = input.LA(1);

                        s = -1;
                        if ( ((LA43_679 >= '\u0000' && LA43_679 <= '{')||(LA43_679 >= '}' && LA43_679 <= '\uFFFF')) ) {s = 850;}

                        else s = 849;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA43_83 = input.LA(1);

                        s = -1;
                        if ( (LA43_83=='\'') ) {s = 286;}

                        else if ( ((LA43_83 >= '\u0000' && LA43_83 <= '\t')||(LA43_83 >= '\u000B' && LA43_83 <= '\f')||(LA43_83 >= '\u000E' && LA43_83 <= '&')||(LA43_83 >= '(' && LA43_83 <= '\uFFFF')) ) {s = 287;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA43_84 = input.LA(1);

                        s = -1;
                        if ( (LA43_84=='\"') ) {s = 288;}

                        else if ( ((LA43_84 >= '\u0000' && LA43_84 <= '\t')||(LA43_84 >= '\u000B' && LA43_84 <= '\f')||(LA43_84 >= '\u000E' && LA43_84 <= '!')||(LA43_84 >= '#' && LA43_84 <= '\uFFFF')) ) {s = 289;}

                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}

            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 43, _s, input);
            error(nvae);
            throw nvae;
        }

    }
 

}