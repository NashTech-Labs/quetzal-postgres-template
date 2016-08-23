// $ANTLR 3.4 /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g 2016-08-23 16:21:40
 
package com.ibm.research.rdf.store.sparql11; 


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class IbmSparqlLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__251=251;
    public static final int T__252=252;
    public static final int T__253=253;
    public static final int T__254=254;
    public static final int T__255=255;
    public static final int T__256=256;
    public static final int T__257=257;
    public static final int T__258=258;
    public static final int T__259=259;
    public static final int T__260=260;
    public static final int T__261=261;
    public static final int T__262=262;
    public static final int T__263=263;
    public static final int T__264=264;
    public static final int A=4;
    public static final int ABS=5;
    public static final int ADD=6;
    public static final int ALL=7;
    public static final int ALT=8;
    public static final int ANNON=9;
    public static final int AS=10;
    public static final int ASC=11;
    public static final int ASK=12;
    public static final int AVG=13;
    public static final int B=14;
    public static final int BASE=15;
    public static final int BIG_DECIMAL=16;
    public static final int BIG_INTEGER=17;
    public static final int BIND=18;
    public static final int BINDINGS=19;
    public static final int BIND_VALUES=20;
    public static final int BLANK_NODE_LABEL=21;
    public static final int BNODE=22;
    public static final int BOOLEAN=23;
    public static final int BOUND=24;
    public static final int BROKEN_MINUS=25;
    public static final int BROKEN_PLUS=26;
    public static final int BY=27;
    public static final int C=28;
    public static final int CEIL=29;
    public static final int CLEAR=30;
    public static final int CLOSE_BRACE=31;
    public static final int CLOSE_CURLY_BRACE=32;
    public static final int CLOSE_SQ_BRACKET=33;
    public static final int COALESCE=34;
    public static final int COLLECTION=35;
    public static final int COMMA=36;
    public static final int COMMENT=37;
    public static final int CONCAT=38;
    public static final int CONDITION=39;
    public static final int CONSTRUCT=40;
    public static final int CONTAINS=41;
    public static final int COPY=42;
    public static final int COUNT=43;
    public static final int CREATE=44;
    public static final int D=45;
    public static final int DATA=46;
    public static final int DATASET=47;
    public static final int DATATYPE=48;
    public static final int DAY=49;
    public static final int DECIMAL=50;
    public static final int DECIMAL_NEGATIVE=51;
    public static final int DECIMAL_POSITIVE=52;
    public static final int DEFAULT=53;
    public static final int DEFAULT_NAMESPACE=54;
    public static final int DELETE=55;
    public static final int DESC=56;
    public static final int DESCRIBE=57;
    public static final int DIGIT=58;
    public static final int DISTINCT=59;
    public static final int DOT=60;
    public static final int DOUBLE=61;
    public static final int DOUBLE_NEGATIVE=62;
    public static final int DOUBLE_POSITIVE=63;
    public static final int DROP=64;
    public static final int E=65;
    public static final int ECHAR=66;
    public static final int ELT=67;
    public static final int ENCODE_FOR_URI=68;
    public static final int EOL=69;
    public static final int EXISTS=70;
    public static final int EXP=71;
    public static final int EXPONENT=72;
    public static final int EXPRESSION=73;
    public static final int F=74;
    public static final int FALSE=75;
    public static final int FILTER=76;
    public static final int FLOOR=77;
    public static final int FROM=78;
    public static final int FUNCTION=79;
    public static final int G=80;
    public static final int GRAPH=81;
    public static final int GRAPH_GRAPH_PATTERN=82;
    public static final int GRAPH_NODE=83;
    public static final int GROUP=84;
    public static final int GROUP_BY=85;
    public static final int GROUP_CONCAT=86;
    public static final int GROUP_GRAPH_PATTERN=87;
    public static final int GROUP_GRAPH_PATTERN_SUB=88;
    public static final int H=89;
    public static final int HAVING=90;
    public static final int HEXDIGIT=91;
    public static final int HOURS=92;
    public static final int I=93;
    public static final int IF=94;
    public static final int IN=95;
    public static final int INLINE_DATA=96;
    public static final int INSERT=97;
    public static final int INTEGER=98;
    public static final int INTEGER_NEGATIVE=99;
    public static final int INTEGER_POSITIVE=100;
    public static final int INTO=101;
    public static final int INV=102;
    public static final int IRI=103;
    public static final int IRI_OR_FUNCTION=104;
    public static final int IRI_REF=105;
    public static final int ISBLANK=106;
    public static final int ISIRI=107;
    public static final int ISLITERAL=108;
    public static final int ISNUMERIC=109;
    public static final int ISURI=110;
    public static final int J=111;
    public static final int K=112;
    public static final int KEY=113;
    public static final int L=114;
    public static final int LANG=115;
    public static final int LANGMATCHES=116;
    public static final int LANGTAG=117;
    public static final int LCASE=118;
    public static final int LIMIT=119;
    public static final int LOAD=120;
    public static final int LOGICAL_AND=121;
    public static final int LOGICAL_OR=122;
    public static final int LT=123;
    public static final int LTE=124;
    public static final int M=125;
    public static final int MAX=126;
    public static final int MD5=127;
    public static final int MIN=128;
    public static final int MINUS=129;
    public static final int MINUTES=130;
    public static final int MODIFIERS=131;
    public static final int MONTH=132;
    public static final int MOVE=133;
    public static final int N=134;
    public static final int NAMED=135;
    public static final int NAMESPACE_PREFIX_MAP=136;
    public static final int NIL=137;
    public static final int NON_TRIPLES=138;
    public static final int NOT=139;
    public static final int NOT_EXISTS=140;
    public static final int NOT_IN=141;
    public static final int NOW=142;
    public static final int NUMERIC=143;
    public static final int O=144;
    public static final int OFFSET=145;
    public static final int OPEN_BRACE=146;
    public static final int OPEN_CURLY_BRACE=147;
    public static final int OPEN_SQ_BRACKET=148;
    public static final int OPTIONAL=149;
    public static final int ORDER=150;
    public static final int ORDER_BY=151;
    public static final int P=152;
    public static final int PATH=153;
    public static final int PERCENT=154;
    public static final int PLX=155;
    public static final int PNAME_LN=156;
    public static final int PNAME_NS=157;
    public static final int PN_CHARS=158;
    public static final int PN_CHARS_BASE=159;
    public static final int PN_CHARS_U=160;
    public static final int PN_LOCAL=161;
    public static final int PN_LOCAL_ESC=162;
    public static final int PN_PREFIX=163;
    public static final int PREDICATE=164;
    public static final int PREDICATE_VALUE=165;
    public static final int PREFIX=166;
    public static final int PREFIXED_NAME=167;
    public static final int PREFIXED_NS=168;
    public static final int PROLOGUE=169;
    public static final int PROPERTY_LIST=170;
    public static final int PVARS=171;
    public static final int Q=172;
    public static final int QUERY=173;
    public static final int R=174;
    public static final int RAND=175;
    public static final int REDUCED=176;
    public static final int REGEX=177;
    public static final int REPLACE=178;
    public static final int ROOT=179;
    public static final int ROUND=180;
    public static final int S=181;
    public static final int SAMETERM=182;
    public static final int SAMPLE=183;
    public static final int SECONDS=184;
    public static final int SELECT=185;
    public static final int SEMICOLON=186;
    public static final int SEPARATOR=187;
    public static final int SEQ=188;
    public static final int SERVICE=189;
    public static final int SHA1=190;
    public static final int SHA224=191;
    public static final int SHA256=192;
    public static final int SHA384=193;
    public static final int SHA512=194;
    public static final int SILENT=195;
    public static final int STR=196;
    public static final int STRAFTER=197;
    public static final int STRBEFORE=198;
    public static final int STRDT=199;
    public static final int STRENDS=200;
    public static final int STRING=201;
    public static final int STRING_LITERAL1=202;
    public static final int STRING_LITERAL2=203;
    public static final int STRING_LITERAL_LONG1=204;
    public static final int STRING_LITERAL_LONG2=205;
    public static final int STRLANG=206;
    public static final int STRLEN=207;
    public static final int STRSTARTS=208;
    public static final int STRUUID=209;
    public static final int SUBJECT=210;
    public static final int SUBSTR=211;
    public static final int SUB_SELECT=212;
    public static final int SUM=213;
    public static final int T=214;
    public static final int TIMEZONE=215;
    public static final int TO=216;
    public static final int TRIPLE=217;
    public static final int TRIPLE2=218;
    public static final int TRIPLES_BLOCK=219;
    public static final int TRIPLES_NODE=220;
    public static final int TRIPLES_NODE_PROPERTY_LIST=221;
    public static final int TRIPLES_SAME_SUBJECT=222;
    public static final int TRUE=223;
    public static final int TYPE=224;
    public static final int TZ=225;
    public static final int U=226;
    public static final int UCASE=227;
    public static final int UNDEF=228;
    public static final int UNICODE_ESCAPE=229;
    public static final int UNION=230;
    public static final int UPDATE=231;
    public static final int URI=232;
    public static final int USING=233;
    public static final int UUID=234;
    public static final int V=235;
    public static final int VALUE=236;
    public static final int VALUES=237;
    public static final int VAR=238;
    public static final int VAR1=239;
    public static final int VAR2=240;
    public static final int VARNAME=241;
    public static final int W=242;
    public static final int WHERE=243;
    public static final int WHERE_TOKEN=244;
    public static final int WITH=245;
    public static final int WS=246;
    public static final int X=247;
    public static final int Y=248;
    public static final int YEAR=249;
    public static final int Z=250;

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

    public IbmSparqlLexer() {} 
    public IbmSparqlLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public IbmSparqlLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "/home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g"; }

    // $ANTLR start "T__251"
    public final void mT__251() throws RecognitionException {
        try {
            int _type = T__251;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:20:8: ( '!' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:20:10: '!'
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
    // $ANTLR end "T__251"

    // $ANTLR start "T__252"
    public final void mT__252() throws RecognitionException {
        try {
            int _type = T__252;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:21:8: ( '!=' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:21:10: '!='
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
    // $ANTLR end "T__252"

    // $ANTLR start "T__253"
    public final void mT__253() throws RecognitionException {
        try {
            int _type = T__253;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:22:8: ( '*' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:22:10: '*'
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
    // $ANTLR end "T__253"

    // $ANTLR start "T__254"
    public final void mT__254() throws RecognitionException {
        try {
            int _type = T__254;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:23:8: ( '+' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:23:10: '+'
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
    // $ANTLR end "T__254"

    // $ANTLR start "T__255"
    public final void mT__255() throws RecognitionException {
        try {
            int _type = T__255;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:24:8: ( '-' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:24:10: '-'
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
    // $ANTLR end "T__255"

    // $ANTLR start "T__256"
    public final void mT__256() throws RecognitionException {
        try {
            int _type = T__256;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:25:8: ( '/' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:25:10: '/'
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
    // $ANTLR end "T__256"

    // $ANTLR start "T__257"
    public final void mT__257() throws RecognitionException {
        try {
            int _type = T__257;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:26:8: ( '=' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:26:10: '='
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
    // $ANTLR end "T__257"

    // $ANTLR start "T__258"
    public final void mT__258() throws RecognitionException {
        try {
            int _type = T__258;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:27:8: ( '>' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:27:10: '>'
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
    // $ANTLR end "T__258"

    // $ANTLR start "T__259"
    public final void mT__259() throws RecognitionException {
        try {
            int _type = T__259;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:28:8: ( '>=' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:28:10: '>='
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
    // $ANTLR end "T__259"

    // $ANTLR start "T__260"
    public final void mT__260() throws RecognitionException {
        try {
            int _type = T__260;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:29:8: ( '?' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:29:10: '?'
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
    // $ANTLR end "T__260"

    // $ANTLR start "T__261"
    public final void mT__261() throws RecognitionException {
        try {
            int _type = T__261;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:30:8: ( '^' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:30:10: '^'
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
    // $ANTLR end "T__261"

    // $ANTLR start "T__262"
    public final void mT__262() throws RecognitionException {
        try {
            int _type = T__262;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:31:8: ( '^^' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:31:10: '^^'
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
    // $ANTLR end "T__262"

    // $ANTLR start "T__263"
    public final void mT__263() throws RecognitionException {
        try {
            int _type = T__263;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:32:8: ( 'a' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:32:10: 'a'
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
    // $ANTLR end "T__263"

    // $ANTLR start "T__264"
    public final void mT__264() throws RecognitionException {
        try {
            int _type = T__264;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:33:8: ( '|' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:33:10: '|'
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
    // $ANTLR end "T__264"

    // $ANTLR start "BASE"
    public final void mBASE() throws RecognitionException {
        try {
            int _type = BASE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:961:6: ( B A S E )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:961:9: B A S E
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:963:8: ( P R E F I X )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:963:11: P R E F I X
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:965:8: ( S E L E C T )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:965:11: S E L E C T
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:967:10: ( D I S T I N C T )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:967:13: D I S T I N C T
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:969:9: ( R E D U C E D )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:969:12: R E D U C E D
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:971:4: ( A S )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:971:7: A S
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:973:11: ( C O N S T R U C T )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:973:14: C O N S T R U C T
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:975:13: ( W H E R E )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:975:16: W H E R E
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:977:10: ( D E S C R I B E )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:977:13: D E S C R I B E
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:979:5: ( A S K )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:979:8: A S K
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:981:6: ( F R O M )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:981:9: F R O M
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:983:7: ( N A M E D )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:983:10: N A M E D
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:985:7: ( G R O U P )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:985:10: G R O U P
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:987:4: ( B Y )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:987:7: B Y
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:989:8: ( H A V I N G )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:989:11: H A V I N G
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:991:7: ( O R D E R )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:991:10: O R D E R
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:993:5: ( A S C )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:993:8: A S C
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:995:6: ( D E S C )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:995:9: D E S C
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:997:7: ( L I M I T )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:997:10: L I M I T
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:999:8: ( O F F S E T )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:999:11: O F F S E T
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1001:10: ( B I N D I N G S )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1001:13: B I N D I N G S
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1003:7: ( U N D E F )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1003:10: U N D E F
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1005:6: ( L O A D )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1005:9: L O A D
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1007:8: ( S I L E N T )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1007:11: S I L E N T
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1009:6: ( I N T O )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1009:9: I N T O
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1011:7: ( C L E A R )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1011:10: C L E A R
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1013:6: ( D R O P )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1013:9: D R O P
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1015:8: ( C R E A T E )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1015:11: C R E A T E
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1017:4: ( T O )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1017:7: T O
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1019:6: ( M O V E )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1019:9: M O V E
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1021:6: ( C O P Y )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1021:9: C O P Y
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1023:8: ( I N S E R T )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1023:11: I N S E R T
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1025:6: ( D A T A )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1025:9: D A T A
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1027:8: ( D E L E T E )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1027:11: D E L E T E
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1029:6: ( W I T H )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1029:9: W I T H
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1031:7: ( U S I N G )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1031:10: U S I N G
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1033:9: ( D E F A U L T )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1033:12: D E F A U L T
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1035:7: ( G R A P H )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1035:10: G R A P H
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1037:5: ( A L L )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1037:8: A L L
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1039:10: ( O P T I O N A L )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1039:13: O P T I O N A L
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1041:9: ( S E R V I C E )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1041:12: S E R V I C E
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1043:6: ( B I N D )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1043:9: B I N D
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1045:7: ( M I N U S )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1045:10: M I N U S
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1047:7: ( U N I O N )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1047:10: U N I O N
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1049:8: ( F I L T E R )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1049:11: F I L T E R
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1051:5: ( S T R )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1051:8: S T R
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1053:6: ( L A N G )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1053:9: L A N G
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1055:13: ( L A N G M A T C H E S )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1055:16: L A N G M A T C H E S
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1057:10: ( D A T A T Y P E )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1057:13: D A T A T Y P E
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1059:7: ( B O U N D )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1059:10: B O U N D
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1061:5: ( I R I )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1061:8: I R I
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1063:5: ( U R I )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1063:8: U R I
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1065:7: ( B N O D E )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1065:10: B N O D E
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1067:6: ( R A N D )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1067:9: R A N D
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1069:5: ( A B S )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1069:8: A B S
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1071:6: ( C E I L )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1071:9: C E I L
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1073:7: ( F L O O R )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1073:10: F L O O R
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1075:7: ( R O U N D )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1075:10: R O U N D
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1077:8: ( C O N C A T )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1077:11: C O N C A T
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1079:8: ( S T R L E N )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1079:11: S T R L E N
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1081:7: ( U C A S E )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1081:10: U C A S E
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1083:7: ( L C A S E )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1083:10: L C A S E
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1085:16: ( E N C O D E '_' F O R '_' U R I )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1085:19: E N C O D E '_' F O R '_' U R I
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1087:10: ( C O N T A I N S )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1087:13: C O N T A I N S
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1089:11: ( S T R S T A R T S )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1089:14: S T R S T A R T S
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1091:9: ( S T R E N D S )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1091:12: S T R E N D S
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1093:11: ( S T R B E F O R E )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1093:14: S T R B E F O R E
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1095:10: ( S T R A F T E R )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1095:13: S T R A F T E R
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1097:6: ( Y E A R )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1097:9: Y E A R
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1099:7: ( M O N T H )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1099:10: M O N T H
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1101:5: ( D A Y )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1101:8: D A Y
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1103:7: ( H O U R S )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1103:10: H O U R S
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1105:9: ( M I N U T E S )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1105:12: M I N U T E S
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1107:9: ( S E C O N D S )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1107:12: S E C O N D S
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1109:10: ( T I M E Z O N E )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1109:13: T I M E Z O N E
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1111:4: ( T Z )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1111:7: T Z
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1113:5: ( N O W )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1113:8: N O W
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1115:5: ( M D '5' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1115:8: M D '5'
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1117:6: ( S H A '1' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1117:9: S H A '1'
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1119:8: ( S H A '2' '2' '4' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1119:11: S H A '2' '2' '4'
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1121:8: ( S H A '2' '5' '6' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1121:11: S H A '2' '5' '6'
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1123:8: ( S H A '3' '8' '4' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1123:11: S H A '3' '8' '4'
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1125:8: ( S H A '5' '1' '2' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1125:11: S H A '5' '1' '2'
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1127:10: ( C O A L E S C E )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1127:13: C O A L E S C E
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1129:4: ( I F )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1129:7: I F
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1131:9: ( S T R L A N G )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1131:12: S T R L A N G
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1133:7: ( S T R D T )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1133:10: S T R D T
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1135:10: ( S A M E T E R M )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1135:13: S A M E T E R M
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1137:7: ( I S I R I )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1137:10: I S I R I
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1139:7: ( I S U R I )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1139:10: I S U R I
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1141:9: ( I S B L A N K )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1141:12: I S B L A N K
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1143:11: ( I S L I T E R A L )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1143:14: I S L I T E R A L
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1145:11: ( I S N U M E R I C )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1145:14: I S N U M E R I C
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1147:7: ( R E G E X )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1147:10: R E G E X
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1149:6: ( T R U E )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1149:9: T R U E
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1151:7: ( F A L S E )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1151:10: F A L S E
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1153:5: ( A D D )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1153:8: A D D
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1155:4: ( I N )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1155:7: I N
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1157:5: ( N O T )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1157:8: N O T
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1159:8: ( S U B S T R )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1159:11: S U B S T R
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1161:8: ( E X I S T S )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1161:11: E X I S T S
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1163:7: ( C O U N T )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1163:10: C O U N T
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1165:5: ( S U M )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1165:8: S U M
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1167:5: ( M I N )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1167:8: M I N
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1169:5: ( M A X )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1169:8: M A X
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1171:5: ( A V G )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1171:8: A V G
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1173:8: ( S A M P L E )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1173:11: S A M P L E
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1175:14: ( G R O U P '_' C O N C A T )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1175:17: G R O U P '_' C O N C A T
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1177:11: ( S E P A R A T O R )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1177:14: S E P A R A T O R
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1179:8: ( V A L U E S )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1179:10: V A L U E S
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1181:9: ( R E P L A C E )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1181:11: R E P L A C E
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1183:6: ( U U I D )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1183:8: U U I D
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1185:9: ( S T R U U I D )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1185:11: S T R U U I D
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

    // $ANTLR start "OPEN_CURLY_BRACE"
    public final void mOPEN_CURLY_BRACE() throws RecognitionException {
        try {
            int _type = OPEN_CURLY_BRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1188:2: ( '{' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1188:4: '{'
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1192:2: ( '}' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1192:4: '}'
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1196:2: ( '.' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1196:4: '.'
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1200:2: ( '(' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1200:4: '('
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1204:2: ( ')' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1204:4: ')'
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1208:2: ( ',' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1208:4: ','
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1212:2: ( ';' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1212:4: ';'
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1216:2: ( '||' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1216:4: '||'
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1220:2: ( '&&' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1220:4: '&&'
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1224:2: ( '[' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1224:4: '['
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1228:2: ( ']' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1228:4: ']'
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1232:2: ( '<' ( ( ( ( '\\\\' UNICODE_ESCAPE ) |~ ( '<' | '>' | '\"' | OPEN_CURLY_BRACE | CLOSE_CURLY_BRACE | '|' | '^' | '`' | '\\\\' | ( '\\u0000' .. '\\u0020' ) ) )* '>' )=> ( ( ( '\\\\' UNICODE_ESCAPE ) |~ ( '<' | '>' | '\"' | OPEN_CURLY_BRACE | CLOSE_CURLY_BRACE | '|' | '^' | '`' | '\\\\' | ( '\\u0000' .. '\\u0020' ) ) )* '>' ) | '=' |) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1232:5: '<' ( ( ( ( '\\\\' UNICODE_ESCAPE ) |~ ( '<' | '>' | '\"' | OPEN_CURLY_BRACE | CLOSE_CURLY_BRACE | '|' | '^' | '`' | '\\\\' | ( '\\u0000' .. '\\u0020' ) ) )* '>' )=> ( ( ( '\\\\' UNICODE_ESCAPE ) |~ ( '<' | '>' | '\"' | OPEN_CURLY_BRACE | CLOSE_CURLY_BRACE | '|' | '^' | '`' | '\\\\' | ( '\\u0000' .. '\\u0020' ) ) )* '>' ) | '=' |)
            {
            match('<'); if (state.failed) return ;

            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1233:9: ( ( ( ( '\\\\' UNICODE_ESCAPE ) |~ ( '<' | '>' | '\"' | OPEN_CURLY_BRACE | CLOSE_CURLY_BRACE | '|' | '^' | '`' | '\\\\' | ( '\\u0000' .. '\\u0020' ) ) )* '>' )=> ( ( ( '\\\\' UNICODE_ESCAPE ) |~ ( '<' | '>' | '\"' | OPEN_CURLY_BRACE | CLOSE_CURLY_BRACE | '|' | '^' | '`' | '\\\\' | ( '\\u0000' .. '\\u0020' ) ) )* '>' ) | '=' |)
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='\\') && (synpred1_IbmSparql())) {
                alt2=1;
            }
            else if ( (LA2_0=='=') ) {
                int LA2_2 = input.LA(2);

                if ( (LA2_2=='>') && (synpred1_IbmSparql())) {
                    alt2=1;
                }
                else if ( (LA2_2=='\\') && (synpred1_IbmSparql())) {
                    alt2=1;
                }
                else if ( (LA2_2=='!'||(LA2_2 >= '#' && LA2_2 <= ';')||LA2_2=='='||(LA2_2 >= '?' && LA2_2 <= '[')||LA2_2==']'||LA2_2=='_'||(LA2_2 >= 'a' && LA2_2 <= 'z')||(LA2_2 >= '~' && LA2_2 <= '\uFFFF')) && (synpred1_IbmSparql())) {
                    alt2=1;
                }
                else {
                    alt2=2;
                }
            }
            else if ( (LA2_0=='>') && (synpred1_IbmSparql())) {
                alt2=1;
            }
            else if ( (LA2_0=='!'||(LA2_0 >= '#' && LA2_0 <= ';')||(LA2_0 >= '?' && LA2_0 <= '[')||LA2_0==']'||LA2_0=='_'||(LA2_0 >= 'a' && LA2_0 <= 'z')||(LA2_0 >= '~' && LA2_0 <= '\uFFFF')) && (synpred1_IbmSparql())) {
                alt2=1;
            }
            else {
                alt2=3;
            }
            switch (alt2) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1234:11: ( ( ( '\\\\' UNICODE_ESCAPE ) |~ ( '<' | '>' | '\"' | OPEN_CURLY_BRACE | CLOSE_CURLY_BRACE | '|' | '^' | '`' | '\\\\' | ( '\\u0000' .. '\\u0020' ) ) )* '>' )=> ( ( ( '\\\\' UNICODE_ESCAPE ) |~ ( '<' | '>' | '\"' | OPEN_CURLY_BRACE | CLOSE_CURLY_BRACE | '|' | '^' | '`' | '\\\\' | ( '\\u0000' .. '\\u0020' ) ) )* '>' )
                    {
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1234:160: ( ( ( '\\\\' UNICODE_ESCAPE ) |~ ( '<' | '>' | '\"' | OPEN_CURLY_BRACE | CLOSE_CURLY_BRACE | '|' | '^' | '`' | '\\\\' | ( '\\u0000' .. '\\u0020' ) ) )* '>' )
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1234:162: ( ( '\\\\' UNICODE_ESCAPE ) |~ ( '<' | '>' | '\"' | OPEN_CURLY_BRACE | CLOSE_CURLY_BRACE | '|' | '^' | '`' | '\\\\' | ( '\\u0000' .. '\\u0020' ) ) )* '>'
                    {
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1234:162: ( ( '\\\\' UNICODE_ESCAPE ) |~ ( '<' | '>' | '\"' | OPEN_CURLY_BRACE | CLOSE_CURLY_BRACE | '|' | '^' | '`' | '\\\\' | ( '\\u0000' .. '\\u0020' ) ) )*
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
                    	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1234:164: ( '\\\\' UNICODE_ESCAPE )
                    	    {
                    	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1234:164: ( '\\\\' UNICODE_ESCAPE )
                    	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1234:165: '\\\\' UNICODE_ESCAPE
                    	    {
                    	    match('\\'); if (state.failed) return ;

                    	    mUNICODE_ESCAPE(); if (state.failed) return ;


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1234:188: ~ ( '<' | '>' | '\"' | OPEN_CURLY_BRACE | CLOSE_CURLY_BRACE | '|' | '^' | '`' | '\\\\' | ( '\\u0000' .. '\\u0020' ) )
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
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1236:13: '='
                    {
                    match('='); if (state.failed) return ;

                    if ( state.backtracking==0 ) { _type = LTE; }

                    }
                    break;
                case 3 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1239:5: 
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
            CommonToken p=null;

            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1242:2: ( (p= PN_PREFIX )? ':' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1242:6: (p= PN_PREFIX )? ':'
            {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1242:7: (p= PN_PREFIX )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0 >= 'A' && LA3_0 <= 'Z')||LA3_0=='\\'||(LA3_0 >= 'a' && LA3_0 <= 'z')||(LA3_0 >= '\u00C0' && LA3_0 <= '\u00D6')||(LA3_0 >= '\u00D8' && LA3_0 <= '\u00F6')||(LA3_0 >= '\u00F8' && LA3_0 <= '\u02FF')||(LA3_0 >= '\u0370' && LA3_0 <= '\u037D')||(LA3_0 >= '\u037F' && LA3_0 <= '\u1FFF')||(LA3_0 >= '\u200C' && LA3_0 <= '\u200D')||(LA3_0 >= '\u2070' && LA3_0 <= '\u218F')||(LA3_0 >= '\u2C00' && LA3_0 <= '\u2FEF')||(LA3_0 >= '\u3001' && LA3_0 <= '\uD7FF')||(LA3_0 >= '\uF900' && LA3_0 <= '\uFDCF')||(LA3_0 >= '\uFDF0' && LA3_0 <= '\uFFFD')) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1242:7: p= PN_PREFIX
                    {
                    int pStart3187 = getCharIndex();
                    int pStartLine3187 = getLine();
                    int pStartCharPos3187 = getCharPositionInLine();
                    mPN_PREFIX(); if (state.failed) return ;
                    p = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, pStart3187, getCharIndex()-1);
                    p.setLine(pStartLine3187);
                    p.setCharPositionInLine(pStartCharPos3187);


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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1246:2: ( PNAME_NS PN_LOCAL )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1246:6: PNAME_NS PN_LOCAL
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

            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1250:2: ( '_:' l= PN_LOCAL )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1250:6: '_:' l= PN_LOCAL
            {
            match("_:"); if (state.failed) return ;



            int lStart3232 = getCharIndex();
            int lStartLine3232 = getLine();
            int lStartCharPos3232 = getCharPositionInLine();
            mPN_LOCAL(); if (state.failed) return ;
            l = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, lStart3232, getCharIndex()-1);
            l.setLine(lStartLine3232);
            l.setCharPositionInLine(lStartCharPos3232);


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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1254:2: ( '?' VARNAME )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1254:6: '?' VARNAME
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1258:2: ( '$' VARNAME )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1258:6: '$' VARNAME
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

    // $ANTLR start "LANGTAG"
    public final void mLANGTAG() throws RecognitionException {
        try {
            int _type = LANGTAG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1262:2: ( '@' ( 'a' .. 'z' | 'A' .. 'Z' )+ ( '-' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )+ )* )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1262:6: '@' ( 'a' .. 'z' | 'A' .. 'Z' )+ ( '-' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )+ )*
            {
            match('@'); if (state.failed) return ;

            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1262:10: ( 'a' .. 'z' | 'A' .. 'Z' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0 >= 'A' && LA4_0 <= 'Z')||(LA4_0 >= 'a' && LA4_0 <= 'z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:
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
            	    if ( cnt4 >= 1 ) break loop4;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1262:31: ( '-' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )+ )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='-') ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1262:33: '-' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )+
            	    {
            	    match('-'); if (state.failed) return ;

            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1262:37: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )+
            	    int cnt5=0;
            	    loop5:
            	    do {
            	        int alt5=2;
            	        int LA5_0 = input.LA(1);

            	        if ( ((LA5_0 >= '0' && LA5_0 <= '9')||(LA5_0 >= 'A' && LA5_0 <= 'Z')||(LA5_0 >= 'a' && LA5_0 <= 'z')) ) {
            	            alt5=1;
            	        }


            	        switch (alt5) {
            	    	case 1 :
            	    	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:
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
            	    	    if ( cnt5 >= 1 ) break loop5;
            	    	    if (state.backtracking>0) {state.failed=true; return ;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(5, input);
            	                throw eee;
            	        }
            	        cnt5++;
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop6;
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1268:2: ( ( '0' .. '9' ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1273:5: ( DIGIT | 'A' .. 'F' | 'a' .. 'f' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1278:5: ( 'u' HEXDIGIT HEXDIGIT HEXDIGIT HEXDIGIT )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1278:9: 'u' HEXDIGIT HEXDIGIT HEXDIGIT HEXDIGIT
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1281:2: ( ( DIGIT )+ )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1281:6: ( DIGIT )+
            {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1281:6: ( DIGIT )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0 >= '0' && LA7_0 <= '9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:
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
            	    if ( cnt7 >= 1 ) break loop7;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1285:2: ( ( DIGIT )* DOT ( DIGIT )* )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1285:6: ( DIGIT )* DOT ( DIGIT )*
            {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1285:6: ( DIGIT )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0 >= '0' && LA8_0 <= '9')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:
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
            	    break loop8;
                }
            } while (true);


            mDOT(); if (state.failed) return ;


            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1285:17: ( DIGIT )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0 >= '0' && LA9_0 <= '9')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1289:2: ( ( DIGIT )+ DOT ( DIGIT )* EXPONENT | DOT ( DIGIT )+ EXPONENT | ( DIGIT )+ EXPONENT )
            int alt14=3;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1289:6: ( DIGIT )+ DOT ( DIGIT )* EXPONENT
                    {
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1289:6: ( DIGIT )+
                    int cnt10=0;
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0 >= '0' && LA10_0 <= '9')) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:
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
                    	    if ( cnt10 >= 1 ) break loop10;
                    	    if (state.backtracking>0) {state.failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(10, input);
                                throw eee;
                        }
                        cnt10++;
                    } while (true);


                    mDOT(); if (state.failed) return ;


                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1289:17: ( DIGIT )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( ((LA11_0 >= '0' && LA11_0 <= '9')) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:
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
                    	    break loop11;
                        }
                    } while (true);


                    mEXPONENT(); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1290:5: DOT ( DIGIT )+ EXPONENT
                    {
                    mDOT(); if (state.failed) return ;


                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1290:9: ( DIGIT )+
                    int cnt12=0;
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( ((LA12_0 >= '0' && LA12_0 <= '9')) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:
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
                    	    if ( cnt12 >= 1 ) break loop12;
                    	    if (state.backtracking>0) {state.failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(12, input);
                                throw eee;
                        }
                        cnt12++;
                    } while (true);


                    mEXPONENT(); if (state.failed) return ;


                    }
                    break;
                case 3 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1291:5: ( DIGIT )+ EXPONENT
                    {
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1291:5: ( DIGIT )+
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
                    	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1295:2: ( '+' INTEGER )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1295:6: '+' INTEGER
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1299:2: ( '+' DECIMAL )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1299:6: '+' DECIMAL
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1303:2: ( '+' DOUBLE )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1303:6: '+' DOUBLE
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1307:2: ( '-' INTEGER )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1307:6: '-' INTEGER
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1311:2: ( '-' DECIMAL )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1311:6: '-' DECIMAL
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1315:2: ( '-' DOUBLE )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1315:6: '-' DOUBLE
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1321:2: ( ( 'e' | 'E' ) ( ( '+' | '-' )? ( '0' .. '9' ) )+ )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1321:6: ( 'e' | 'E' ) ( ( '+' | '-' )? ( '0' .. '9' ) )+
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


            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1321:16: ( ( '+' | '-' )? ( '0' .. '9' ) )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0=='+'||LA16_0=='-'||(LA16_0 >= '0' && LA16_0 <= '9')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1321:18: ( '+' | '-' )? ( '0' .. '9' )
            	    {
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1321:18: ( '+' | '-' )?
            	    int alt15=2;
            	    int LA15_0 = input.LA(1);

            	    if ( (LA15_0=='+'||LA15_0=='-') ) {
            	        alt15=1;
            	    }
            	    switch (alt15) {
            	        case 1 :
            	            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:
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
            	    if ( cnt16 >= 1 ) break loop16;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EXPONENT"

    // $ANTLR start "STRING_LITERAL1"
    public final void mSTRING_LITERAL1() throws RecognitionException {
        try {
            int _type = STRING_LITERAL1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1324:2: ( '\\'' ( options {greedy=false; } :~ ( '\\u0027' | '\\u005C' | '\\u000A' | '\\u000D' ) | ECHAR )* '\\'' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1324:6: '\\'' ( options {greedy=false; } :~ ( '\\u0027' | '\\u005C' | '\\u000A' | '\\u000D' ) | ECHAR )* '\\''
            {
            match('\''); if (state.failed) return ;

            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1324:11: ( options {greedy=false; } :~ ( '\\u0027' | '\\u005C' | '\\u000A' | '\\u000D' ) | ECHAR )*
            loop17:
            do {
                int alt17=3;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0 >= '\u0000' && LA17_0 <= '\t')||(LA17_0 >= '\u000B' && LA17_0 <= '\f')||(LA17_0 >= '\u000E' && LA17_0 <= '&')||(LA17_0 >= '(' && LA17_0 <= '[')||(LA17_0 >= ']' && LA17_0 <= '\uFFFF')) ) {
                    alt17=1;
                }
                else if ( (LA17_0=='\\') ) {
                    alt17=2;
                }
                else if ( (LA17_0=='\'') ) {
                    alt17=3;
                }


                switch (alt17) {
            	case 1 :
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1324:39: ~ ( '\\u0027' | '\\u005C' | '\\u000A' | '\\u000D' )
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
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1324:80: ECHAR
            	    {
            	    mECHAR(); if (state.failed) return ;


            	    }
            	    break;

            	default :
            	    break loop17;
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1331:2: ( '\"' ( options {greedy=false; } :~ ( '\\u0022' | '\\u005C' | '\\u000A' | '\\u000D' ) | ECHAR )* '\"' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1331:6: '\"' ( options {greedy=false; } :~ ( '\\u0022' | '\\u005C' | '\\u000A' | '\\u000D' ) | ECHAR )* '\"'
            {
            match('\"'); if (state.failed) return ;

            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1331:10: ( options {greedy=false; } :~ ( '\\u0022' | '\\u005C' | '\\u000A' | '\\u000D' ) | ECHAR )*
            loop18:
            do {
                int alt18=3;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0 >= '\u0000' && LA18_0 <= '\t')||(LA18_0 >= '\u000B' && LA18_0 <= '\f')||(LA18_0 >= '\u000E' && LA18_0 <= '!')||(LA18_0 >= '#' && LA18_0 <= '[')||(LA18_0 >= ']' && LA18_0 <= '\uFFFF')) ) {
                    alt18=1;
                }
                else if ( (LA18_0=='\\') ) {
                    alt18=2;
                }
                else if ( (LA18_0=='\"') ) {
                    alt18=3;
                }


                switch (alt18) {
            	case 1 :
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1331:38: ~ ( '\\u0022' | '\\u005C' | '\\u000A' | '\\u000D' )
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
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1331:79: ECHAR
            	    {
            	    mECHAR(); if (state.failed) return ;


            	    }
            	    break;

            	default :
            	    break loop18;
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1337:2: ( '\\'\\'\\'' ( options {greedy=false; } : ( '\\'' | '\\'\\'' )? (~ ( '\\'' | '\\\\' ) | ECHAR ) )* '\\'\\'\\'' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1337:6: '\\'\\'\\'' ( options {greedy=false; } : ( '\\'' | '\\'\\'' )? (~ ( '\\'' | '\\\\' ) | ECHAR ) )* '\\'\\'\\''
            {
            match("'''"); if (state.failed) return ;



            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1337:15: ( options {greedy=false; } : ( '\\'' | '\\'\\'' )? (~ ( '\\'' | '\\\\' ) | ECHAR ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0=='\'') ) {
                    int LA21_1 = input.LA(2);

                    if ( (LA21_1=='\'') ) {
                        int LA21_3 = input.LA(3);

                        if ( (LA21_3=='\'') ) {
                            alt21=2;
                        }
                        else if ( ((LA21_3 >= '\u0000' && LA21_3 <= '&')||(LA21_3 >= '(' && LA21_3 <= '\uFFFF')) ) {
                            alt21=1;
                        }


                    }
                    else if ( ((LA21_1 >= '\u0000' && LA21_1 <= '&')||(LA21_1 >= '(' && LA21_1 <= '\uFFFF')) ) {
                        alt21=1;
                    }


                }
                else if ( ((LA21_0 >= '\u0000' && LA21_0 <= '&')||(LA21_0 >= '(' && LA21_0 <= '\uFFFF')) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1337:43: ( '\\'' | '\\'\\'' )? (~ ( '\\'' | '\\\\' ) | ECHAR )
            	    {
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1337:43: ( '\\'' | '\\'\\'' )?
            	    int alt19=3;
            	    int LA19_0 = input.LA(1);

            	    if ( (LA19_0=='\'') ) {
            	        int LA19_1 = input.LA(2);

            	        if ( (LA19_1=='\'') ) {
            	            alt19=2;
            	        }
            	        else if ( ((LA19_1 >= '\u0000' && LA19_1 <= '&')||(LA19_1 >= '(' && LA19_1 <= '\uFFFF')) ) {
            	            alt19=1;
            	        }
            	    }
            	    switch (alt19) {
            	        case 1 :
            	            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1337:45: '\\''
            	            {
            	            match('\''); if (state.failed) return ;

            	            }
            	            break;
            	        case 2 :
            	            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1337:52: '\\'\\''
            	            {
            	            match("''"); if (state.failed) return ;



            	            }
            	            break;

            	    }


            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1337:62: (~ ( '\\'' | '\\\\' ) | ECHAR )
            	    int alt20=2;
            	    int LA20_0 = input.LA(1);

            	    if ( ((LA20_0 >= '\u0000' && LA20_0 <= '&')||(LA20_0 >= '(' && LA20_0 <= '[')||(LA20_0 >= ']' && LA20_0 <= '\uFFFF')) ) {
            	        alt20=1;
            	    }
            	    else if ( (LA20_0=='\\') ) {
            	        alt20=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 20, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt20) {
            	        case 1 :
            	            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1337:64: ~ ( '\\'' | '\\\\' )
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
            	            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1337:79: ECHAR
            	            {
            	            mECHAR(); if (state.failed) return ;


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1344:2: ( '\"\"\"' ( options {greedy=false; } : ( '\"' | '\"\"' )? (~ ( '\"' | '\\\\' ) | ECHAR ) )* '\"\"\"' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1344:6: '\"\"\"' ( options {greedy=false; } : ( '\"' | '\"\"' )? (~ ( '\"' | '\\\\' ) | ECHAR ) )* '\"\"\"'
            {
            match("\"\"\""); if (state.failed) return ;



            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1344:12: ( options {greedy=false; } : ( '\"' | '\"\"' )? (~ ( '\"' | '\\\\' ) | ECHAR ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0=='\"') ) {
                    int LA24_1 = input.LA(2);

                    if ( (LA24_1=='\"') ) {
                        int LA24_3 = input.LA(3);

                        if ( (LA24_3=='\"') ) {
                            alt24=2;
                        }
                        else if ( ((LA24_3 >= '\u0000' && LA24_3 <= '!')||(LA24_3 >= '#' && LA24_3 <= '\uFFFF')) ) {
                            alt24=1;
                        }


                    }
                    else if ( ((LA24_1 >= '\u0000' && LA24_1 <= '!')||(LA24_1 >= '#' && LA24_1 <= '\uFFFF')) ) {
                        alt24=1;
                    }


                }
                else if ( ((LA24_0 >= '\u0000' && LA24_0 <= '!')||(LA24_0 >= '#' && LA24_0 <= '\uFFFF')) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1344:40: ( '\"' | '\"\"' )? (~ ( '\"' | '\\\\' ) | ECHAR )
            	    {
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1344:40: ( '\"' | '\"\"' )?
            	    int alt22=3;
            	    int LA22_0 = input.LA(1);

            	    if ( (LA22_0=='\"') ) {
            	        int LA22_1 = input.LA(2);

            	        if ( (LA22_1=='\"') ) {
            	            alt22=2;
            	        }
            	        else if ( ((LA22_1 >= '\u0000' && LA22_1 <= '!')||(LA22_1 >= '#' && LA22_1 <= '\uFFFF')) ) {
            	            alt22=1;
            	        }
            	    }
            	    switch (alt22) {
            	        case 1 :
            	            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1344:42: '\"'
            	            {
            	            match('\"'); if (state.failed) return ;

            	            }
            	            break;
            	        case 2 :
            	            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1344:48: '\"\"'
            	            {
            	            match("\"\""); if (state.failed) return ;



            	            }
            	            break;

            	    }


            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1344:56: (~ ( '\"' | '\\\\' ) | ECHAR )
            	    int alt23=2;
            	    int LA23_0 = input.LA(1);

            	    if ( ((LA23_0 >= '\u0000' && LA23_0 <= '!')||(LA23_0 >= '#' && LA23_0 <= '[')||(LA23_0 >= ']' && LA23_0 <= '\uFFFF')) ) {
            	        alt23=1;
            	    }
            	    else if ( (LA23_0=='\\') ) {
            	        alt23=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 23, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt23) {
            	        case 1 :
            	            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1344:58: ~ ( '\"' | '\\\\' )
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
            	            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1344:72: ECHAR
            	            {
            	            mECHAR(); if (state.failed) return ;


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1350:2: ( '\\\\' ( 't' | 'b' | 'n' | 'r' | 'f' | '\\\"' | '\\\\' | '\\'' | UNICODE_ESCAPE ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1350:6: '\\\\' ( 't' | 'b' | 'n' | 'r' | 'f' | '\\\"' | '\\\\' | '\\'' | UNICODE_ESCAPE )
            {
            match('\\'); if (state.failed) return ;

            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1350:11: ( 't' | 'b' | 'n' | 'r' | 'f' | '\\\"' | '\\\\' | '\\'' | UNICODE_ESCAPE )
            int alt25=9;
            switch ( input.LA(1) ) {
            case 't':
                {
                alt25=1;
                }
                break;
            case 'b':
                {
                alt25=2;
                }
                break;
            case 'n':
                {
                alt25=3;
                }
                break;
            case 'r':
                {
                alt25=4;
                }
                break;
            case 'f':
                {
                alt25=5;
                }
                break;
            case '\"':
                {
                alt25=6;
                }
                break;
            case '\\':
                {
                alt25=7;
                }
                break;
            case '\'':
                {
                alt25=8;
                }
                break;
            case 'u':
                {
                alt25=9;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;

            }

            switch (alt25) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1350:12: 't'
                    {
                    match('t'); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1350:16: 'b'
                    {
                    match('b'); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1350:20: 'n'
                    {
                    match('n'); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1350:24: 'r'
                    {
                    match('r'); if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1350:28: 'f'
                    {
                    match('f'); if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1350:32: '\\\"'
                    {
                    match('\"'); if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1350:37: '\\\\'
                    {
                    match('\\'); if (state.failed) return ;

                    }
                    break;
                case 8 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1350:42: '\\''
                    {
                    match('\''); if (state.failed) return ;

                    }
                    break;
                case 9 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1350:47: UNICODE_ESCAPE
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1353:4: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1353:8: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1353:8: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0 >= '\t' && LA26_0 <= '\n')||LA26_0=='\r'||LA26_0==' ') ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:
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
            	    if ( cnt26 >= 1 ) break loop26;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(26, input);
                        throw eee;
                }
                cnt26++;
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1357:2: ( '#' ( options {greedy=false; } : . )* EOL )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1357:4: '#' ( options {greedy=false; } : . )* EOL
            {
            match('#'); if (state.failed) return ;

            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1357:8: ( options {greedy=false; } : . )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0=='\n'||LA27_0=='\r') ) {
                    alt27=2;
                }
                else if ( ((LA27_0 >= '\u0000' && LA27_0 <= '\t')||(LA27_0 >= '\u000B' && LA27_0 <= '\f')||(LA27_0 >= '\u000E' && LA27_0 <= '\uFFFF')) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1357:35: .
            	    {
            	    matchAny(); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop27;
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1362:5: ( ( '\\n' | '\\r' )+ )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1362:7: ( '\\n' | '\\r' )+
            {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1362:7: ( '\\n' | '\\r' )+
            int cnt28=0;
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0=='\n'||LA28_0=='\r') ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:
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
            	    if ( cnt28 >= 1 ) break loop28;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(28, input);
                        throw eee;
                }
                cnt28++;
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1366:2: ( ( 'A' .. 'Z' ) | ( 'a' .. 'z' ) | ( '\\\\' UNICODE_ESCAPE ) | ( '\\u00C0' .. '\\u00D6' ) | ( '\\u00D8' .. '\\u00F6' ) | ( '\\u00F8' .. '\\u02FF' ) | ( '\\u0370' .. '\\u037D' ) | ( '\\u037F' .. '\\u1FFF' ) | ( '\\u200C' .. '\\u200D' ) | ( '\\u2070' .. '\\u218F' ) | ( '\\u2C00' .. '\\u2FEF' ) | ( '\\u3001' .. '\\uD7FF' ) | ( '\\uF900' .. '\\uFDCF' ) | ( '\\uFDF0' .. '\\uFFFD' ) )
            int alt29=14;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0 >= 'A' && LA29_0 <= 'Z')) ) {
                alt29=1;
            }
            else if ( ((LA29_0 >= 'a' && LA29_0 <= 'z')) ) {
                alt29=2;
            }
            else if ( (LA29_0=='\\') ) {
                alt29=3;
            }
            else if ( ((LA29_0 >= '\u00C0' && LA29_0 <= '\u00D6')) ) {
                alt29=4;
            }
            else if ( ((LA29_0 >= '\u00D8' && LA29_0 <= '\u00F6')) ) {
                alt29=5;
            }
            else if ( ((LA29_0 >= '\u00F8' && LA29_0 <= '\u02FF')) ) {
                alt29=6;
            }
            else if ( ((LA29_0 >= '\u0370' && LA29_0 <= '\u037D')) ) {
                alt29=7;
            }
            else if ( ((LA29_0 >= '\u037F' && LA29_0 <= '\u1FFF')) ) {
                alt29=8;
            }
            else if ( ((LA29_0 >= '\u200C' && LA29_0 <= '\u200D')) ) {
                alt29=9;
            }
            else if ( ((LA29_0 >= '\u2070' && LA29_0 <= '\u218F')) ) {
                alt29=10;
            }
            else if ( ((LA29_0 >= '\u2C00' && LA29_0 <= '\u2FEF')) ) {
                alt29=11;
            }
            else if ( ((LA29_0 >= '\u3001' && LA29_0 <= '\uD7FF')) ) {
                alt29=12;
            }
            else if ( ((LA29_0 >= '\uF900' && LA29_0 <= '\uFDCF')) ) {
                alt29=13;
            }
            else if ( ((LA29_0 >= '\uFDF0' && LA29_0 <= '\uFFFD')) ) {
                alt29=14;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;

            }
            switch (alt29) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1366:6: ( 'A' .. 'Z' )
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
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1366:19: ( 'a' .. 'z' )
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
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1366:33: ( '\\\\' UNICODE_ESCAPE )
                    {
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1366:33: ( '\\\\' UNICODE_ESCAPE )
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1366:34: '\\\\' UNICODE_ESCAPE
                    {
                    match('\\'); if (state.failed) return ;

                    mUNICODE_ESCAPE(); if (state.failed) return ;


                    }


                    }
                    break;
                case 4 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1367:5: ( '\\u00C0' .. '\\u00D6' )
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
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1367:28: ( '\\u00D8' .. '\\u00F6' )
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
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1367:51: ( '\\u00F8' .. '\\u02FF' )
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
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1368:6: ( '\\u0370' .. '\\u037D' )
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
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1368:29: ( '\\u037F' .. '\\u1FFF' )
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
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1368:52: ( '\\u200C' .. '\\u200D' )
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
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1369:6: ( '\\u2070' .. '\\u218F' )
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
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1369:29: ( '\\u2C00' .. '\\u2FEF' )
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
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1369:52: ( '\\u3001' .. '\\uD7FF' )
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
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1370:6: ( '\\uF900' .. '\\uFDCF' )
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
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1370:29: ( '\\uFDF0' .. '\\uFFFD' )
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1375:2: ( ( PN_CHARS_BASE | '_' ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1375:6: ( PN_CHARS_BASE | '_' )
            {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1375:6: ( PN_CHARS_BASE | '_' )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0 >= 'A' && LA30_0 <= 'Z')||LA30_0=='\\'||(LA30_0 >= 'a' && LA30_0 <= 'z')||(LA30_0 >= '\u00C0' && LA30_0 <= '\u00D6')||(LA30_0 >= '\u00D8' && LA30_0 <= '\u00F6')||(LA30_0 >= '\u00F8' && LA30_0 <= '\u02FF')||(LA30_0 >= '\u0370' && LA30_0 <= '\u037D')||(LA30_0 >= '\u037F' && LA30_0 <= '\u1FFF')||(LA30_0 >= '\u200C' && LA30_0 <= '\u200D')||(LA30_0 >= '\u2070' && LA30_0 <= '\u218F')||(LA30_0 >= '\u2C00' && LA30_0 <= '\u2FEF')||(LA30_0 >= '\u3001' && LA30_0 <= '\uD7FF')||(LA30_0 >= '\uF900' && LA30_0 <= '\uFDCF')||(LA30_0 >= '\uFDF0' && LA30_0 <= '\uFFFD')) ) {
                alt30=1;
            }
            else if ( (LA30_0=='_') ) {
                alt30=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;

            }
            switch (alt30) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1375:8: PN_CHARS_BASE
                    {
                    mPN_CHARS_BASE(); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1375:24: '_'
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1380:2: ( ( PN_CHARS_U | ( '0' .. '9' ) ) ( PN_CHARS_U | ( '0' .. '9' ) | '\\u00B7' | ( '\\u0300' .. '\\u036F' ) | ( '\\u203F' .. '\\u2040' ) )* )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1380:6: ( PN_CHARS_U | ( '0' .. '9' ) ) ( PN_CHARS_U | ( '0' .. '9' ) | '\\u00B7' | ( '\\u0300' .. '\\u036F' ) | ( '\\u203F' .. '\\u2040' ) )*
            {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1380:6: ( PN_CHARS_U | ( '0' .. '9' ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0 >= 'A' && LA31_0 <= 'Z')||LA31_0=='\\'||LA31_0=='_'||(LA31_0 >= 'a' && LA31_0 <= 'z')||(LA31_0 >= '\u00C0' && LA31_0 <= '\u00D6')||(LA31_0 >= '\u00D8' && LA31_0 <= '\u00F6')||(LA31_0 >= '\u00F8' && LA31_0 <= '\u02FF')||(LA31_0 >= '\u0370' && LA31_0 <= '\u037D')||(LA31_0 >= '\u037F' && LA31_0 <= '\u1FFF')||(LA31_0 >= '\u200C' && LA31_0 <= '\u200D')||(LA31_0 >= '\u2070' && LA31_0 <= '\u218F')||(LA31_0 >= '\u2C00' && LA31_0 <= '\u2FEF')||(LA31_0 >= '\u3001' && LA31_0 <= '\uD7FF')||(LA31_0 >= '\uF900' && LA31_0 <= '\uFDCF')||(LA31_0 >= '\uFDF0' && LA31_0 <= '\uFFFD')) ) {
                alt31=1;
            }
            else if ( ((LA31_0 >= '0' && LA31_0 <= '9')) ) {
                alt31=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;

            }
            switch (alt31) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1380:8: PN_CHARS_U
                    {
                    mPN_CHARS_U(); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1380:21: ( '0' .. '9' )
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


            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1381:6: ( PN_CHARS_U | ( '0' .. '9' ) | '\\u00B7' | ( '\\u0300' .. '\\u036F' ) | ( '\\u203F' .. '\\u2040' ) )*
            loop32:
            do {
                int alt32=6;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0 >= 'A' && LA32_0 <= 'Z')||LA32_0=='\\'||LA32_0=='_'||(LA32_0 >= 'a' && LA32_0 <= 'z')||(LA32_0 >= '\u00C0' && LA32_0 <= '\u00D6')||(LA32_0 >= '\u00D8' && LA32_0 <= '\u00F6')||(LA32_0 >= '\u00F8' && LA32_0 <= '\u02FF')||(LA32_0 >= '\u0370' && LA32_0 <= '\u037D')||(LA32_0 >= '\u037F' && LA32_0 <= '\u1FFF')||(LA32_0 >= '\u200C' && LA32_0 <= '\u200D')||(LA32_0 >= '\u2070' && LA32_0 <= '\u218F')||(LA32_0 >= '\u2C00' && LA32_0 <= '\u2FEF')||(LA32_0 >= '\u3001' && LA32_0 <= '\uD7FF')||(LA32_0 >= '\uF900' && LA32_0 <= '\uFDCF')||(LA32_0 >= '\uFDF0' && LA32_0 <= '\uFFFD')) ) {
                    alt32=1;
                }
                else if ( ((LA32_0 >= '0' && LA32_0 <= '9')) ) {
                    alt32=2;
                }
                else if ( (LA32_0=='\u00B7') ) {
                    alt32=3;
                }
                else if ( ((LA32_0 >= '\u0300' && LA32_0 <= '\u036F')) ) {
                    alt32=4;
                }
                else if ( ((LA32_0 >= '\u203F' && LA32_0 <= '\u2040')) ) {
                    alt32=5;
                }


                switch (alt32) {
            	case 1 :
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1381:8: PN_CHARS_U
            	    {
            	    mPN_CHARS_U(); if (state.failed) return ;


            	    }
            	    break;
            	case 2 :
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1381:21: ( '0' .. '9' )
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
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1381:34: '\\u00B7'
            	    {
            	    match('\u00B7'); if (state.failed) return ;

            	    }
            	    break;
            	case 4 :
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1381:45: ( '\\u0300' .. '\\u036F' )
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
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1381:68: ( '\\u203F' .. '\\u2040' )
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
            	    break loop32;
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1386:2: ( PN_CHARS_U | '-' | ( '0' .. '9' ) | '\\u00B7' | ( '\\u0300' .. '\\u036F' ) | ( '\\u203F' .. '\\u2040' ) )
            int alt33=6;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0 >= 'A' && LA33_0 <= 'Z')||LA33_0=='\\'||LA33_0=='_'||(LA33_0 >= 'a' && LA33_0 <= 'z')||(LA33_0 >= '\u00C0' && LA33_0 <= '\u00D6')||(LA33_0 >= '\u00D8' && LA33_0 <= '\u00F6')||(LA33_0 >= '\u00F8' && LA33_0 <= '\u02FF')||(LA33_0 >= '\u0370' && LA33_0 <= '\u037D')||(LA33_0 >= '\u037F' && LA33_0 <= '\u1FFF')||(LA33_0 >= '\u200C' && LA33_0 <= '\u200D')||(LA33_0 >= '\u2070' && LA33_0 <= '\u218F')||(LA33_0 >= '\u2C00' && LA33_0 <= '\u2FEF')||(LA33_0 >= '\u3001' && LA33_0 <= '\uD7FF')||(LA33_0 >= '\uF900' && LA33_0 <= '\uFDCF')||(LA33_0 >= '\uFDF0' && LA33_0 <= '\uFFFD')) ) {
                alt33=1;
            }
            else if ( (LA33_0=='-') ) {
                alt33=2;
            }
            else if ( ((LA33_0 >= '0' && LA33_0 <= '9')) ) {
                alt33=3;
            }
            else if ( (LA33_0=='\u00B7') ) {
                alt33=4;
            }
            else if ( ((LA33_0 >= '\u0300' && LA33_0 <= '\u036F')) ) {
                alt33=5;
            }
            else if ( ((LA33_0 >= '\u203F' && LA33_0 <= '\u2040')) ) {
                alt33=6;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;

            }
            switch (alt33) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1386:6: PN_CHARS_U
                    {
                    mPN_CHARS_U(); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1386:19: '-'
                    {
                    match('-'); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1386:25: ( '0' .. '9' )
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
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1386:38: '\\u00B7'
                    {
                    match('\u00B7'); if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1386:49: ( '\\u0300' .. '\\u036F' )
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
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1386:72: ( '\\u203F' .. '\\u2040' )
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1391:2: ( PN_CHARS_BASE ( ( PN_CHARS | DOT )* PN_CHARS )? )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1391:6: PN_CHARS_BASE ( ( PN_CHARS | DOT )* PN_CHARS )?
            {
            mPN_CHARS_BASE(); if (state.failed) return ;


            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1391:20: ( ( PN_CHARS | DOT )* PN_CHARS )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0 >= '-' && LA35_0 <= '.')||(LA35_0 >= '0' && LA35_0 <= '9')||(LA35_0 >= 'A' && LA35_0 <= 'Z')||LA35_0=='\\'||LA35_0=='_'||(LA35_0 >= 'a' && LA35_0 <= 'z')||LA35_0=='\u00B7'||(LA35_0 >= '\u00C0' && LA35_0 <= '\u00D6')||(LA35_0 >= '\u00D8' && LA35_0 <= '\u00F6')||(LA35_0 >= '\u00F8' && LA35_0 <= '\u037D')||(LA35_0 >= '\u037F' && LA35_0 <= '\u1FFF')||(LA35_0 >= '\u200C' && LA35_0 <= '\u200D')||(LA35_0 >= '\u203F' && LA35_0 <= '\u2040')||(LA35_0 >= '\u2070' && LA35_0 <= '\u218F')||(LA35_0 >= '\u2C00' && LA35_0 <= '\u2FEF')||(LA35_0 >= '\u3001' && LA35_0 <= '\uD7FF')||(LA35_0 >= '\uF900' && LA35_0 <= '\uFDCF')||(LA35_0 >= '\uFDF0' && LA35_0 <= '\uFFFD')) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1391:21: ( PN_CHARS | DOT )* PN_CHARS
                    {
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1391:21: ( PN_CHARS | DOT )*
                    loop34:
                    do {
                        int alt34=3;
                        int LA34_0 = input.LA(1);

                        if ( ((LA34_0 >= 'A' && LA34_0 <= 'Z')) ) {
                            int LA34_1 = input.LA(2);

                            if ( ((LA34_1 >= '-' && LA34_1 <= '.')||(LA34_1 >= '0' && LA34_1 <= '9')||(LA34_1 >= 'A' && LA34_1 <= 'Z')||LA34_1=='\\'||LA34_1=='_'||(LA34_1 >= 'a' && LA34_1 <= 'z')||LA34_1=='\u00B7'||(LA34_1 >= '\u00C0' && LA34_1 <= '\u00D6')||(LA34_1 >= '\u00D8' && LA34_1 <= '\u00F6')||(LA34_1 >= '\u00F8' && LA34_1 <= '\u037D')||(LA34_1 >= '\u037F' && LA34_1 <= '\u1FFF')||(LA34_1 >= '\u200C' && LA34_1 <= '\u200D')||(LA34_1 >= '\u203F' && LA34_1 <= '\u2040')||(LA34_1 >= '\u2070' && LA34_1 <= '\u218F')||(LA34_1 >= '\u2C00' && LA34_1 <= '\u2FEF')||(LA34_1 >= '\u3001' && LA34_1 <= '\uD7FF')||(LA34_1 >= '\uF900' && LA34_1 <= '\uFDCF')||(LA34_1 >= '\uFDF0' && LA34_1 <= '\uFFFD')) ) {
                                alt34=1;
                            }


                        }
                        else if ( ((LA34_0 >= 'a' && LA34_0 <= 'z')) ) {
                            int LA34_2 = input.LA(2);

                            if ( ((LA34_2 >= '-' && LA34_2 <= '.')||(LA34_2 >= '0' && LA34_2 <= '9')||(LA34_2 >= 'A' && LA34_2 <= 'Z')||LA34_2=='\\'||LA34_2=='_'||(LA34_2 >= 'a' && LA34_2 <= 'z')||LA34_2=='\u00B7'||(LA34_2 >= '\u00C0' && LA34_2 <= '\u00D6')||(LA34_2 >= '\u00D8' && LA34_2 <= '\u00F6')||(LA34_2 >= '\u00F8' && LA34_2 <= '\u037D')||(LA34_2 >= '\u037F' && LA34_2 <= '\u1FFF')||(LA34_2 >= '\u200C' && LA34_2 <= '\u200D')||(LA34_2 >= '\u203F' && LA34_2 <= '\u2040')||(LA34_2 >= '\u2070' && LA34_2 <= '\u218F')||(LA34_2 >= '\u2C00' && LA34_2 <= '\u2FEF')||(LA34_2 >= '\u3001' && LA34_2 <= '\uD7FF')||(LA34_2 >= '\uF900' && LA34_2 <= '\uFDCF')||(LA34_2 >= '\uFDF0' && LA34_2 <= '\uFFFD')) ) {
                                alt34=1;
                            }


                        }
                        else if ( (LA34_0=='\\') ) {
                            int LA34_3 = input.LA(2);

                            if ( (LA34_3=='u') ) {
                                int LA34_24 = input.LA(3);

                                if ( ((LA34_24 >= '0' && LA34_24 <= '9')||(LA34_24 >= 'A' && LA34_24 <= 'F')||(LA34_24 >= 'a' && LA34_24 <= 'f')) ) {
                                    int LA34_25 = input.LA(4);

                                    if ( ((LA34_25 >= '0' && LA34_25 <= '9')||(LA34_25 >= 'A' && LA34_25 <= 'F')||(LA34_25 >= 'a' && LA34_25 <= 'f')) ) {
                                        int LA34_26 = input.LA(5);

                                        if ( ((LA34_26 >= '0' && LA34_26 <= '9')||(LA34_26 >= 'A' && LA34_26 <= 'F')||(LA34_26 >= 'a' && LA34_26 <= 'f')) ) {
                                            int LA34_27 = input.LA(6);

                                            if ( ((LA34_27 >= '0' && LA34_27 <= '9')||(LA34_27 >= 'A' && LA34_27 <= 'F')||(LA34_27 >= 'a' && LA34_27 <= 'f')) ) {
                                                int LA34_28 = input.LA(7);

                                                if ( ((LA34_28 >= '-' && LA34_28 <= '.')||(LA34_28 >= '0' && LA34_28 <= '9')||(LA34_28 >= 'A' && LA34_28 <= 'Z')||LA34_28=='\\'||LA34_28=='_'||(LA34_28 >= 'a' && LA34_28 <= 'z')||LA34_28=='\u00B7'||(LA34_28 >= '\u00C0' && LA34_28 <= '\u00D6')||(LA34_28 >= '\u00D8' && LA34_28 <= '\u00F6')||(LA34_28 >= '\u00F8' && LA34_28 <= '\u037D')||(LA34_28 >= '\u037F' && LA34_28 <= '\u1FFF')||(LA34_28 >= '\u200C' && LA34_28 <= '\u200D')||(LA34_28 >= '\u203F' && LA34_28 <= '\u2040')||(LA34_28 >= '\u2070' && LA34_28 <= '\u218F')||(LA34_28 >= '\u2C00' && LA34_28 <= '\u2FEF')||(LA34_28 >= '\u3001' && LA34_28 <= '\uD7FF')||(LA34_28 >= '\uF900' && LA34_28 <= '\uFDCF')||(LA34_28 >= '\uFDF0' && LA34_28 <= '\uFFFD')) ) {
                                                    alt34=1;
                                                }


                                            }


                                        }


                                    }


                                }


                            }


                        }
                        else if ( ((LA34_0 >= '\u00C0' && LA34_0 <= '\u00D6')) ) {
                            int LA34_4 = input.LA(2);

                            if ( ((LA34_4 >= '-' && LA34_4 <= '.')||(LA34_4 >= '0' && LA34_4 <= '9')||(LA34_4 >= 'A' && LA34_4 <= 'Z')||LA34_4=='\\'||LA34_4=='_'||(LA34_4 >= 'a' && LA34_4 <= 'z')||LA34_4=='\u00B7'||(LA34_4 >= '\u00C0' && LA34_4 <= '\u00D6')||(LA34_4 >= '\u00D8' && LA34_4 <= '\u00F6')||(LA34_4 >= '\u00F8' && LA34_4 <= '\u037D')||(LA34_4 >= '\u037F' && LA34_4 <= '\u1FFF')||(LA34_4 >= '\u200C' && LA34_4 <= '\u200D')||(LA34_4 >= '\u203F' && LA34_4 <= '\u2040')||(LA34_4 >= '\u2070' && LA34_4 <= '\u218F')||(LA34_4 >= '\u2C00' && LA34_4 <= '\u2FEF')||(LA34_4 >= '\u3001' && LA34_4 <= '\uD7FF')||(LA34_4 >= '\uF900' && LA34_4 <= '\uFDCF')||(LA34_4 >= '\uFDF0' && LA34_4 <= '\uFFFD')) ) {
                                alt34=1;
                            }


                        }
                        else if ( ((LA34_0 >= '\u00D8' && LA34_0 <= '\u00F6')) ) {
                            int LA34_5 = input.LA(2);

                            if ( ((LA34_5 >= '-' && LA34_5 <= '.')||(LA34_5 >= '0' && LA34_5 <= '9')||(LA34_5 >= 'A' && LA34_5 <= 'Z')||LA34_5=='\\'||LA34_5=='_'||(LA34_5 >= 'a' && LA34_5 <= 'z')||LA34_5=='\u00B7'||(LA34_5 >= '\u00C0' && LA34_5 <= '\u00D6')||(LA34_5 >= '\u00D8' && LA34_5 <= '\u00F6')||(LA34_5 >= '\u00F8' && LA34_5 <= '\u037D')||(LA34_5 >= '\u037F' && LA34_5 <= '\u1FFF')||(LA34_5 >= '\u200C' && LA34_5 <= '\u200D')||(LA34_5 >= '\u203F' && LA34_5 <= '\u2040')||(LA34_5 >= '\u2070' && LA34_5 <= '\u218F')||(LA34_5 >= '\u2C00' && LA34_5 <= '\u2FEF')||(LA34_5 >= '\u3001' && LA34_5 <= '\uD7FF')||(LA34_5 >= '\uF900' && LA34_5 <= '\uFDCF')||(LA34_5 >= '\uFDF0' && LA34_5 <= '\uFFFD')) ) {
                                alt34=1;
                            }


                        }
                        else if ( ((LA34_0 >= '\u00F8' && LA34_0 <= '\u02FF')) ) {
                            int LA34_6 = input.LA(2);

                            if ( ((LA34_6 >= '-' && LA34_6 <= '.')||(LA34_6 >= '0' && LA34_6 <= '9')||(LA34_6 >= 'A' && LA34_6 <= 'Z')||LA34_6=='\\'||LA34_6=='_'||(LA34_6 >= 'a' && LA34_6 <= 'z')||LA34_6=='\u00B7'||(LA34_6 >= '\u00C0' && LA34_6 <= '\u00D6')||(LA34_6 >= '\u00D8' && LA34_6 <= '\u00F6')||(LA34_6 >= '\u00F8' && LA34_6 <= '\u037D')||(LA34_6 >= '\u037F' && LA34_6 <= '\u1FFF')||(LA34_6 >= '\u200C' && LA34_6 <= '\u200D')||(LA34_6 >= '\u203F' && LA34_6 <= '\u2040')||(LA34_6 >= '\u2070' && LA34_6 <= '\u218F')||(LA34_6 >= '\u2C00' && LA34_6 <= '\u2FEF')||(LA34_6 >= '\u3001' && LA34_6 <= '\uD7FF')||(LA34_6 >= '\uF900' && LA34_6 <= '\uFDCF')||(LA34_6 >= '\uFDF0' && LA34_6 <= '\uFFFD')) ) {
                                alt34=1;
                            }


                        }
                        else if ( ((LA34_0 >= '\u0370' && LA34_0 <= '\u037D')) ) {
                            int LA34_7 = input.LA(2);

                            if ( ((LA34_7 >= '-' && LA34_7 <= '.')||(LA34_7 >= '0' && LA34_7 <= '9')||(LA34_7 >= 'A' && LA34_7 <= 'Z')||LA34_7=='\\'||LA34_7=='_'||(LA34_7 >= 'a' && LA34_7 <= 'z')||LA34_7=='\u00B7'||(LA34_7 >= '\u00C0' && LA34_7 <= '\u00D6')||(LA34_7 >= '\u00D8' && LA34_7 <= '\u00F6')||(LA34_7 >= '\u00F8' && LA34_7 <= '\u037D')||(LA34_7 >= '\u037F' && LA34_7 <= '\u1FFF')||(LA34_7 >= '\u200C' && LA34_7 <= '\u200D')||(LA34_7 >= '\u203F' && LA34_7 <= '\u2040')||(LA34_7 >= '\u2070' && LA34_7 <= '\u218F')||(LA34_7 >= '\u2C00' && LA34_7 <= '\u2FEF')||(LA34_7 >= '\u3001' && LA34_7 <= '\uD7FF')||(LA34_7 >= '\uF900' && LA34_7 <= '\uFDCF')||(LA34_7 >= '\uFDF0' && LA34_7 <= '\uFFFD')) ) {
                                alt34=1;
                            }


                        }
                        else if ( ((LA34_0 >= '\u037F' && LA34_0 <= '\u1FFF')) ) {
                            int LA34_8 = input.LA(2);

                            if ( ((LA34_8 >= '-' && LA34_8 <= '.')||(LA34_8 >= '0' && LA34_8 <= '9')||(LA34_8 >= 'A' && LA34_8 <= 'Z')||LA34_8=='\\'||LA34_8=='_'||(LA34_8 >= 'a' && LA34_8 <= 'z')||LA34_8=='\u00B7'||(LA34_8 >= '\u00C0' && LA34_8 <= '\u00D6')||(LA34_8 >= '\u00D8' && LA34_8 <= '\u00F6')||(LA34_8 >= '\u00F8' && LA34_8 <= '\u037D')||(LA34_8 >= '\u037F' && LA34_8 <= '\u1FFF')||(LA34_8 >= '\u200C' && LA34_8 <= '\u200D')||(LA34_8 >= '\u203F' && LA34_8 <= '\u2040')||(LA34_8 >= '\u2070' && LA34_8 <= '\u218F')||(LA34_8 >= '\u2C00' && LA34_8 <= '\u2FEF')||(LA34_8 >= '\u3001' && LA34_8 <= '\uD7FF')||(LA34_8 >= '\uF900' && LA34_8 <= '\uFDCF')||(LA34_8 >= '\uFDF0' && LA34_8 <= '\uFFFD')) ) {
                                alt34=1;
                            }


                        }
                        else if ( ((LA34_0 >= '\u200C' && LA34_0 <= '\u200D')) ) {
                            int LA34_9 = input.LA(2);

                            if ( ((LA34_9 >= '-' && LA34_9 <= '.')||(LA34_9 >= '0' && LA34_9 <= '9')||(LA34_9 >= 'A' && LA34_9 <= 'Z')||LA34_9=='\\'||LA34_9=='_'||(LA34_9 >= 'a' && LA34_9 <= 'z')||LA34_9=='\u00B7'||(LA34_9 >= '\u00C0' && LA34_9 <= '\u00D6')||(LA34_9 >= '\u00D8' && LA34_9 <= '\u00F6')||(LA34_9 >= '\u00F8' && LA34_9 <= '\u037D')||(LA34_9 >= '\u037F' && LA34_9 <= '\u1FFF')||(LA34_9 >= '\u200C' && LA34_9 <= '\u200D')||(LA34_9 >= '\u203F' && LA34_9 <= '\u2040')||(LA34_9 >= '\u2070' && LA34_9 <= '\u218F')||(LA34_9 >= '\u2C00' && LA34_9 <= '\u2FEF')||(LA34_9 >= '\u3001' && LA34_9 <= '\uD7FF')||(LA34_9 >= '\uF900' && LA34_9 <= '\uFDCF')||(LA34_9 >= '\uFDF0' && LA34_9 <= '\uFFFD')) ) {
                                alt34=1;
                            }


                        }
                        else if ( ((LA34_0 >= '\u2070' && LA34_0 <= '\u218F')) ) {
                            int LA34_10 = input.LA(2);

                            if ( ((LA34_10 >= '-' && LA34_10 <= '.')||(LA34_10 >= '0' && LA34_10 <= '9')||(LA34_10 >= 'A' && LA34_10 <= 'Z')||LA34_10=='\\'||LA34_10=='_'||(LA34_10 >= 'a' && LA34_10 <= 'z')||LA34_10=='\u00B7'||(LA34_10 >= '\u00C0' && LA34_10 <= '\u00D6')||(LA34_10 >= '\u00D8' && LA34_10 <= '\u00F6')||(LA34_10 >= '\u00F8' && LA34_10 <= '\u037D')||(LA34_10 >= '\u037F' && LA34_10 <= '\u1FFF')||(LA34_10 >= '\u200C' && LA34_10 <= '\u200D')||(LA34_10 >= '\u203F' && LA34_10 <= '\u2040')||(LA34_10 >= '\u2070' && LA34_10 <= '\u218F')||(LA34_10 >= '\u2C00' && LA34_10 <= '\u2FEF')||(LA34_10 >= '\u3001' && LA34_10 <= '\uD7FF')||(LA34_10 >= '\uF900' && LA34_10 <= '\uFDCF')||(LA34_10 >= '\uFDF0' && LA34_10 <= '\uFFFD')) ) {
                                alt34=1;
                            }


                        }
                        else if ( ((LA34_0 >= '\u2C00' && LA34_0 <= '\u2FEF')) ) {
                            int LA34_11 = input.LA(2);

                            if ( ((LA34_11 >= '-' && LA34_11 <= '.')||(LA34_11 >= '0' && LA34_11 <= '9')||(LA34_11 >= 'A' && LA34_11 <= 'Z')||LA34_11=='\\'||LA34_11=='_'||(LA34_11 >= 'a' && LA34_11 <= 'z')||LA34_11=='\u00B7'||(LA34_11 >= '\u00C0' && LA34_11 <= '\u00D6')||(LA34_11 >= '\u00D8' && LA34_11 <= '\u00F6')||(LA34_11 >= '\u00F8' && LA34_11 <= '\u037D')||(LA34_11 >= '\u037F' && LA34_11 <= '\u1FFF')||(LA34_11 >= '\u200C' && LA34_11 <= '\u200D')||(LA34_11 >= '\u203F' && LA34_11 <= '\u2040')||(LA34_11 >= '\u2070' && LA34_11 <= '\u218F')||(LA34_11 >= '\u2C00' && LA34_11 <= '\u2FEF')||(LA34_11 >= '\u3001' && LA34_11 <= '\uD7FF')||(LA34_11 >= '\uF900' && LA34_11 <= '\uFDCF')||(LA34_11 >= '\uFDF0' && LA34_11 <= '\uFFFD')) ) {
                                alt34=1;
                            }


                        }
                        else if ( ((LA34_0 >= '\u3001' && LA34_0 <= '\uD7FF')) ) {
                            int LA34_12 = input.LA(2);

                            if ( ((LA34_12 >= '-' && LA34_12 <= '.')||(LA34_12 >= '0' && LA34_12 <= '9')||(LA34_12 >= 'A' && LA34_12 <= 'Z')||LA34_12=='\\'||LA34_12=='_'||(LA34_12 >= 'a' && LA34_12 <= 'z')||LA34_12=='\u00B7'||(LA34_12 >= '\u00C0' && LA34_12 <= '\u00D6')||(LA34_12 >= '\u00D8' && LA34_12 <= '\u00F6')||(LA34_12 >= '\u00F8' && LA34_12 <= '\u037D')||(LA34_12 >= '\u037F' && LA34_12 <= '\u1FFF')||(LA34_12 >= '\u200C' && LA34_12 <= '\u200D')||(LA34_12 >= '\u203F' && LA34_12 <= '\u2040')||(LA34_12 >= '\u2070' && LA34_12 <= '\u218F')||(LA34_12 >= '\u2C00' && LA34_12 <= '\u2FEF')||(LA34_12 >= '\u3001' && LA34_12 <= '\uD7FF')||(LA34_12 >= '\uF900' && LA34_12 <= '\uFDCF')||(LA34_12 >= '\uFDF0' && LA34_12 <= '\uFFFD')) ) {
                                alt34=1;
                            }


                        }
                        else if ( ((LA34_0 >= '\uF900' && LA34_0 <= '\uFDCF')) ) {
                            int LA34_13 = input.LA(2);

                            if ( ((LA34_13 >= '-' && LA34_13 <= '.')||(LA34_13 >= '0' && LA34_13 <= '9')||(LA34_13 >= 'A' && LA34_13 <= 'Z')||LA34_13=='\\'||LA34_13=='_'||(LA34_13 >= 'a' && LA34_13 <= 'z')||LA34_13=='\u00B7'||(LA34_13 >= '\u00C0' && LA34_13 <= '\u00D6')||(LA34_13 >= '\u00D8' && LA34_13 <= '\u00F6')||(LA34_13 >= '\u00F8' && LA34_13 <= '\u037D')||(LA34_13 >= '\u037F' && LA34_13 <= '\u1FFF')||(LA34_13 >= '\u200C' && LA34_13 <= '\u200D')||(LA34_13 >= '\u203F' && LA34_13 <= '\u2040')||(LA34_13 >= '\u2070' && LA34_13 <= '\u218F')||(LA34_13 >= '\u2C00' && LA34_13 <= '\u2FEF')||(LA34_13 >= '\u3001' && LA34_13 <= '\uD7FF')||(LA34_13 >= '\uF900' && LA34_13 <= '\uFDCF')||(LA34_13 >= '\uFDF0' && LA34_13 <= '\uFFFD')) ) {
                                alt34=1;
                            }


                        }
                        else if ( ((LA34_0 >= '\uFDF0' && LA34_0 <= '\uFFFD')) ) {
                            int LA34_14 = input.LA(2);

                            if ( ((LA34_14 >= '-' && LA34_14 <= '.')||(LA34_14 >= '0' && LA34_14 <= '9')||(LA34_14 >= 'A' && LA34_14 <= 'Z')||LA34_14=='\\'||LA34_14=='_'||(LA34_14 >= 'a' && LA34_14 <= 'z')||LA34_14=='\u00B7'||(LA34_14 >= '\u00C0' && LA34_14 <= '\u00D6')||(LA34_14 >= '\u00D8' && LA34_14 <= '\u00F6')||(LA34_14 >= '\u00F8' && LA34_14 <= '\u037D')||(LA34_14 >= '\u037F' && LA34_14 <= '\u1FFF')||(LA34_14 >= '\u200C' && LA34_14 <= '\u200D')||(LA34_14 >= '\u203F' && LA34_14 <= '\u2040')||(LA34_14 >= '\u2070' && LA34_14 <= '\u218F')||(LA34_14 >= '\u2C00' && LA34_14 <= '\u2FEF')||(LA34_14 >= '\u3001' && LA34_14 <= '\uD7FF')||(LA34_14 >= '\uF900' && LA34_14 <= '\uFDCF')||(LA34_14 >= '\uFDF0' && LA34_14 <= '\uFFFD')) ) {
                                alt34=1;
                            }


                        }
                        else if ( (LA34_0=='_') ) {
                            int LA34_15 = input.LA(2);

                            if ( ((LA34_15 >= '-' && LA34_15 <= '.')||(LA34_15 >= '0' && LA34_15 <= '9')||(LA34_15 >= 'A' && LA34_15 <= 'Z')||LA34_15=='\\'||LA34_15=='_'||(LA34_15 >= 'a' && LA34_15 <= 'z')||LA34_15=='\u00B7'||(LA34_15 >= '\u00C0' && LA34_15 <= '\u00D6')||(LA34_15 >= '\u00D8' && LA34_15 <= '\u00F6')||(LA34_15 >= '\u00F8' && LA34_15 <= '\u037D')||(LA34_15 >= '\u037F' && LA34_15 <= '\u1FFF')||(LA34_15 >= '\u200C' && LA34_15 <= '\u200D')||(LA34_15 >= '\u203F' && LA34_15 <= '\u2040')||(LA34_15 >= '\u2070' && LA34_15 <= '\u218F')||(LA34_15 >= '\u2C00' && LA34_15 <= '\u2FEF')||(LA34_15 >= '\u3001' && LA34_15 <= '\uD7FF')||(LA34_15 >= '\uF900' && LA34_15 <= '\uFDCF')||(LA34_15 >= '\uFDF0' && LA34_15 <= '\uFFFD')) ) {
                                alt34=1;
                            }


                        }
                        else if ( (LA34_0=='-') ) {
                            int LA34_16 = input.LA(2);

                            if ( ((LA34_16 >= '-' && LA34_16 <= '.')||(LA34_16 >= '0' && LA34_16 <= '9')||(LA34_16 >= 'A' && LA34_16 <= 'Z')||LA34_16=='\\'||LA34_16=='_'||(LA34_16 >= 'a' && LA34_16 <= 'z')||LA34_16=='\u00B7'||(LA34_16 >= '\u00C0' && LA34_16 <= '\u00D6')||(LA34_16 >= '\u00D8' && LA34_16 <= '\u00F6')||(LA34_16 >= '\u00F8' && LA34_16 <= '\u037D')||(LA34_16 >= '\u037F' && LA34_16 <= '\u1FFF')||(LA34_16 >= '\u200C' && LA34_16 <= '\u200D')||(LA34_16 >= '\u203F' && LA34_16 <= '\u2040')||(LA34_16 >= '\u2070' && LA34_16 <= '\u218F')||(LA34_16 >= '\u2C00' && LA34_16 <= '\u2FEF')||(LA34_16 >= '\u3001' && LA34_16 <= '\uD7FF')||(LA34_16 >= '\uF900' && LA34_16 <= '\uFDCF')||(LA34_16 >= '\uFDF0' && LA34_16 <= '\uFFFD')) ) {
                                alt34=1;
                            }


                        }
                        else if ( ((LA34_0 >= '0' && LA34_0 <= '9')) ) {
                            int LA34_17 = input.LA(2);

                            if ( ((LA34_17 >= '-' && LA34_17 <= '.')||(LA34_17 >= '0' && LA34_17 <= '9')||(LA34_17 >= 'A' && LA34_17 <= 'Z')||LA34_17=='\\'||LA34_17=='_'||(LA34_17 >= 'a' && LA34_17 <= 'z')||LA34_17=='\u00B7'||(LA34_17 >= '\u00C0' && LA34_17 <= '\u00D6')||(LA34_17 >= '\u00D8' && LA34_17 <= '\u00F6')||(LA34_17 >= '\u00F8' && LA34_17 <= '\u037D')||(LA34_17 >= '\u037F' && LA34_17 <= '\u1FFF')||(LA34_17 >= '\u200C' && LA34_17 <= '\u200D')||(LA34_17 >= '\u203F' && LA34_17 <= '\u2040')||(LA34_17 >= '\u2070' && LA34_17 <= '\u218F')||(LA34_17 >= '\u2C00' && LA34_17 <= '\u2FEF')||(LA34_17 >= '\u3001' && LA34_17 <= '\uD7FF')||(LA34_17 >= '\uF900' && LA34_17 <= '\uFDCF')||(LA34_17 >= '\uFDF0' && LA34_17 <= '\uFFFD')) ) {
                                alt34=1;
                            }


                        }
                        else if ( (LA34_0=='\u00B7') ) {
                            int LA34_18 = input.LA(2);

                            if ( ((LA34_18 >= '-' && LA34_18 <= '.')||(LA34_18 >= '0' && LA34_18 <= '9')||(LA34_18 >= 'A' && LA34_18 <= 'Z')||LA34_18=='\\'||LA34_18=='_'||(LA34_18 >= 'a' && LA34_18 <= 'z')||LA34_18=='\u00B7'||(LA34_18 >= '\u00C0' && LA34_18 <= '\u00D6')||(LA34_18 >= '\u00D8' && LA34_18 <= '\u00F6')||(LA34_18 >= '\u00F8' && LA34_18 <= '\u037D')||(LA34_18 >= '\u037F' && LA34_18 <= '\u1FFF')||(LA34_18 >= '\u200C' && LA34_18 <= '\u200D')||(LA34_18 >= '\u203F' && LA34_18 <= '\u2040')||(LA34_18 >= '\u2070' && LA34_18 <= '\u218F')||(LA34_18 >= '\u2C00' && LA34_18 <= '\u2FEF')||(LA34_18 >= '\u3001' && LA34_18 <= '\uD7FF')||(LA34_18 >= '\uF900' && LA34_18 <= '\uFDCF')||(LA34_18 >= '\uFDF0' && LA34_18 <= '\uFFFD')) ) {
                                alt34=1;
                            }


                        }
                        else if ( ((LA34_0 >= '\u0300' && LA34_0 <= '\u036F')) ) {
                            int LA34_19 = input.LA(2);

                            if ( ((LA34_19 >= '-' && LA34_19 <= '.')||(LA34_19 >= '0' && LA34_19 <= '9')||(LA34_19 >= 'A' && LA34_19 <= 'Z')||LA34_19=='\\'||LA34_19=='_'||(LA34_19 >= 'a' && LA34_19 <= 'z')||LA34_19=='\u00B7'||(LA34_19 >= '\u00C0' && LA34_19 <= '\u00D6')||(LA34_19 >= '\u00D8' && LA34_19 <= '\u00F6')||(LA34_19 >= '\u00F8' && LA34_19 <= '\u037D')||(LA34_19 >= '\u037F' && LA34_19 <= '\u1FFF')||(LA34_19 >= '\u200C' && LA34_19 <= '\u200D')||(LA34_19 >= '\u203F' && LA34_19 <= '\u2040')||(LA34_19 >= '\u2070' && LA34_19 <= '\u218F')||(LA34_19 >= '\u2C00' && LA34_19 <= '\u2FEF')||(LA34_19 >= '\u3001' && LA34_19 <= '\uD7FF')||(LA34_19 >= '\uF900' && LA34_19 <= '\uFDCF')||(LA34_19 >= '\uFDF0' && LA34_19 <= '\uFFFD')) ) {
                                alt34=1;
                            }


                        }
                        else if ( ((LA34_0 >= '\u203F' && LA34_0 <= '\u2040')) ) {
                            int LA34_20 = input.LA(2);

                            if ( ((LA34_20 >= '-' && LA34_20 <= '.')||(LA34_20 >= '0' && LA34_20 <= '9')||(LA34_20 >= 'A' && LA34_20 <= 'Z')||LA34_20=='\\'||LA34_20=='_'||(LA34_20 >= 'a' && LA34_20 <= 'z')||LA34_20=='\u00B7'||(LA34_20 >= '\u00C0' && LA34_20 <= '\u00D6')||(LA34_20 >= '\u00D8' && LA34_20 <= '\u00F6')||(LA34_20 >= '\u00F8' && LA34_20 <= '\u037D')||(LA34_20 >= '\u037F' && LA34_20 <= '\u1FFF')||(LA34_20 >= '\u200C' && LA34_20 <= '\u200D')||(LA34_20 >= '\u203F' && LA34_20 <= '\u2040')||(LA34_20 >= '\u2070' && LA34_20 <= '\u218F')||(LA34_20 >= '\u2C00' && LA34_20 <= '\u2FEF')||(LA34_20 >= '\u3001' && LA34_20 <= '\uD7FF')||(LA34_20 >= '\uF900' && LA34_20 <= '\uFDCF')||(LA34_20 >= '\uFDF0' && LA34_20 <= '\uFFFD')) ) {
                                alt34=1;
                            }


                        }
                        else if ( (LA34_0=='.') ) {
                            alt34=2;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1391:22: PN_CHARS
                    	    {
                    	    mPN_CHARS(); if (state.failed) return ;


                    	    }
                    	    break;
                    	case 2 :
                    	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1391:31: DOT
                    	    {
                    	    mDOT(); if (state.failed) return ;


                    	    }
                    	    break;

                    	default :
                    	    break loop34;
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1396:2: ( ( PN_CHARS_U | ':' | ( '0' .. '9' ) | PLX ) ( ( PN_CHARS | DOT | ':' | PLX )* ( PN_CHARS | ':' | PLX ) )? )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1396:6: ( PN_CHARS_U | ':' | ( '0' .. '9' ) | PLX ) ( ( PN_CHARS | DOT | ':' | PLX )* ( PN_CHARS | ':' | PLX ) )?
            {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1396:6: ( PN_CHARS_U | ':' | ( '0' .. '9' ) | PLX )
            int alt36=4;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0 >= 'A' && LA36_0 <= 'Z')||LA36_0=='_'||(LA36_0 >= 'a' && LA36_0 <= 'z')||(LA36_0 >= '\u00C0' && LA36_0 <= '\u00D6')||(LA36_0 >= '\u00D8' && LA36_0 <= '\u00F6')||(LA36_0 >= '\u00F8' && LA36_0 <= '\u02FF')||(LA36_0 >= '\u0370' && LA36_0 <= '\u037D')||(LA36_0 >= '\u037F' && LA36_0 <= '\u1FFF')||(LA36_0 >= '\u200C' && LA36_0 <= '\u200D')||(LA36_0 >= '\u2070' && LA36_0 <= '\u218F')||(LA36_0 >= '\u2C00' && LA36_0 <= '\u2FEF')||(LA36_0 >= '\u3001' && LA36_0 <= '\uD7FF')||(LA36_0 >= '\uF900' && LA36_0 <= '\uFDCF')||(LA36_0 >= '\uFDF0' && LA36_0 <= '\uFFFD')) ) {
                alt36=1;
            }
            else if ( (LA36_0=='\\') ) {
                int LA36_2 = input.LA(2);

                if ( (LA36_2=='!'||(LA36_2 >= '#' && LA36_2 <= '/')||LA36_2==';'||LA36_2=='='||(LA36_2 >= '?' && LA36_2 <= '@')||LA36_2=='_'||LA36_2=='~') ) {
                    alt36=4;
                }
                else if ( (LA36_2=='u') ) {
                    alt36=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 36, 2, input);

                    throw nvae;

                }
            }
            else if ( (LA36_0==':') ) {
                alt36=2;
            }
            else if ( ((LA36_0 >= '0' && LA36_0 <= '9')) ) {
                alt36=3;
            }
            else if ( (LA36_0=='%') ) {
                alt36=4;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;

            }
            switch (alt36) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1396:8: PN_CHARS_U
                    {
                    mPN_CHARS_U(); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1396:21: ':'
                    {
                    match(':'); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1396:28: ( '0' .. '9' )
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
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1396:41: PLX
                    {
                    mPLX(); if (state.failed) return ;


                    }
                    break;

            }


            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1396:47: ( ( PN_CHARS | DOT | ':' | PLX )* ( PN_CHARS | ':' | PLX ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0=='%'||(LA39_0 >= '-' && LA39_0 <= '.')||(LA39_0 >= '0' && LA39_0 <= ':')||(LA39_0 >= 'A' && LA39_0 <= 'Z')||LA39_0=='\\'||LA39_0=='_'||(LA39_0 >= 'a' && LA39_0 <= 'z')||LA39_0=='\u00B7'||(LA39_0 >= '\u00C0' && LA39_0 <= '\u00D6')||(LA39_0 >= '\u00D8' && LA39_0 <= '\u00F6')||(LA39_0 >= '\u00F8' && LA39_0 <= '\u037D')||(LA39_0 >= '\u037F' && LA39_0 <= '\u1FFF')||(LA39_0 >= '\u200C' && LA39_0 <= '\u200D')||(LA39_0 >= '\u203F' && LA39_0 <= '\u2040')||(LA39_0 >= '\u2070' && LA39_0 <= '\u218F')||(LA39_0 >= '\u2C00' && LA39_0 <= '\u2FEF')||(LA39_0 >= '\u3001' && LA39_0 <= '\uD7FF')||(LA39_0 >= '\uF900' && LA39_0 <= '\uFDCF')||(LA39_0 >= '\uFDF0' && LA39_0 <= '\uFFFD')) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1396:49: ( PN_CHARS | DOT | ':' | PLX )* ( PN_CHARS | ':' | PLX )
                    {
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1396:49: ( PN_CHARS | DOT | ':' | PLX )*
                    loop37:
                    do {
                        int alt37=5;
                        int LA37_0 = input.LA(1);

                        if ( ((LA37_0 >= 'A' && LA37_0 <= 'Z')) ) {
                            int LA37_1 = input.LA(2);

                            if ( (LA37_1=='%'||(LA37_1 >= '-' && LA37_1 <= '.')||(LA37_1 >= '0' && LA37_1 <= ':')||(LA37_1 >= 'A' && LA37_1 <= 'Z')||LA37_1=='\\'||LA37_1=='_'||(LA37_1 >= 'a' && LA37_1 <= 'z')||LA37_1=='\u00B7'||(LA37_1 >= '\u00C0' && LA37_1 <= '\u00D6')||(LA37_1 >= '\u00D8' && LA37_1 <= '\u00F6')||(LA37_1 >= '\u00F8' && LA37_1 <= '\u037D')||(LA37_1 >= '\u037F' && LA37_1 <= '\u1FFF')||(LA37_1 >= '\u200C' && LA37_1 <= '\u200D')||(LA37_1 >= '\u203F' && LA37_1 <= '\u2040')||(LA37_1 >= '\u2070' && LA37_1 <= '\u218F')||(LA37_1 >= '\u2C00' && LA37_1 <= '\u2FEF')||(LA37_1 >= '\u3001' && LA37_1 <= '\uD7FF')||(LA37_1 >= '\uF900' && LA37_1 <= '\uFDCF')||(LA37_1 >= '\uFDF0' && LA37_1 <= '\uFFFD')) ) {
                                alt37=1;
                            }


                        }
                        else if ( ((LA37_0 >= 'a' && LA37_0 <= 'z')) ) {
                            int LA37_2 = input.LA(2);

                            if ( (LA37_2=='%'||(LA37_2 >= '-' && LA37_2 <= '.')||(LA37_2 >= '0' && LA37_2 <= ':')||(LA37_2 >= 'A' && LA37_2 <= 'Z')||LA37_2=='\\'||LA37_2=='_'||(LA37_2 >= 'a' && LA37_2 <= 'z')||LA37_2=='\u00B7'||(LA37_2 >= '\u00C0' && LA37_2 <= '\u00D6')||(LA37_2 >= '\u00D8' && LA37_2 <= '\u00F6')||(LA37_2 >= '\u00F8' && LA37_2 <= '\u037D')||(LA37_2 >= '\u037F' && LA37_2 <= '\u1FFF')||(LA37_2 >= '\u200C' && LA37_2 <= '\u200D')||(LA37_2 >= '\u203F' && LA37_2 <= '\u2040')||(LA37_2 >= '\u2070' && LA37_2 <= '\u218F')||(LA37_2 >= '\u2C00' && LA37_2 <= '\u2FEF')||(LA37_2 >= '\u3001' && LA37_2 <= '\uD7FF')||(LA37_2 >= '\uF900' && LA37_2 <= '\uFDCF')||(LA37_2 >= '\uFDF0' && LA37_2 <= '\uFFFD')) ) {
                                alt37=1;
                            }


                        }
                        else if ( (LA37_0=='\\') ) {
                            int LA37_3 = input.LA(2);

                            if ( (LA37_3=='!'||(LA37_3 >= '#' && LA37_3 <= '/')||LA37_3==';'||LA37_3=='='||(LA37_3 >= '?' && LA37_3 <= '@')||LA37_3=='_'||LA37_3=='~') ) {
                                int LA37_26 = input.LA(3);

                                if ( (LA37_26=='%'||(LA37_26 >= '-' && LA37_26 <= '.')||(LA37_26 >= '0' && LA37_26 <= ':')||(LA37_26 >= 'A' && LA37_26 <= 'Z')||LA37_26=='\\'||LA37_26=='_'||(LA37_26 >= 'a' && LA37_26 <= 'z')||LA37_26=='\u00B7'||(LA37_26 >= '\u00C0' && LA37_26 <= '\u00D6')||(LA37_26 >= '\u00D8' && LA37_26 <= '\u00F6')||(LA37_26 >= '\u00F8' && LA37_26 <= '\u037D')||(LA37_26 >= '\u037F' && LA37_26 <= '\u1FFF')||(LA37_26 >= '\u200C' && LA37_26 <= '\u200D')||(LA37_26 >= '\u203F' && LA37_26 <= '\u2040')||(LA37_26 >= '\u2070' && LA37_26 <= '\u218F')||(LA37_26 >= '\u2C00' && LA37_26 <= '\u2FEF')||(LA37_26 >= '\u3001' && LA37_26 <= '\uD7FF')||(LA37_26 >= '\uF900' && LA37_26 <= '\uFDCF')||(LA37_26 >= '\uFDF0' && LA37_26 <= '\uFFFD')) ) {
                                    alt37=4;
                                }


                            }
                            else if ( (LA37_3=='u') ) {
                                int LA37_27 = input.LA(3);

                                if ( ((LA37_27 >= '0' && LA37_27 <= '9')||(LA37_27 >= 'A' && LA37_27 <= 'F')||(LA37_27 >= 'a' && LA37_27 <= 'f')) ) {
                                    int LA37_31 = input.LA(4);

                                    if ( ((LA37_31 >= '0' && LA37_31 <= '9')||(LA37_31 >= 'A' && LA37_31 <= 'F')||(LA37_31 >= 'a' && LA37_31 <= 'f')) ) {
                                        int LA37_33 = input.LA(5);

                                        if ( ((LA37_33 >= '0' && LA37_33 <= '9')||(LA37_33 >= 'A' && LA37_33 <= 'F')||(LA37_33 >= 'a' && LA37_33 <= 'f')) ) {
                                            int LA37_34 = input.LA(6);

                                            if ( ((LA37_34 >= '0' && LA37_34 <= '9')||(LA37_34 >= 'A' && LA37_34 <= 'F')||(LA37_34 >= 'a' && LA37_34 <= 'f')) ) {
                                                int LA37_35 = input.LA(7);

                                                if ( (LA37_35=='%'||(LA37_35 >= '-' && LA37_35 <= '.')||(LA37_35 >= '0' && LA37_35 <= ':')||(LA37_35 >= 'A' && LA37_35 <= 'Z')||LA37_35=='\\'||LA37_35=='_'||(LA37_35 >= 'a' && LA37_35 <= 'z')||LA37_35=='\u00B7'||(LA37_35 >= '\u00C0' && LA37_35 <= '\u00D6')||(LA37_35 >= '\u00D8' && LA37_35 <= '\u00F6')||(LA37_35 >= '\u00F8' && LA37_35 <= '\u037D')||(LA37_35 >= '\u037F' && LA37_35 <= '\u1FFF')||(LA37_35 >= '\u200C' && LA37_35 <= '\u200D')||(LA37_35 >= '\u203F' && LA37_35 <= '\u2040')||(LA37_35 >= '\u2070' && LA37_35 <= '\u218F')||(LA37_35 >= '\u2C00' && LA37_35 <= '\u2FEF')||(LA37_35 >= '\u3001' && LA37_35 <= '\uD7FF')||(LA37_35 >= '\uF900' && LA37_35 <= '\uFDCF')||(LA37_35 >= '\uFDF0' && LA37_35 <= '\uFFFD')) ) {
                                                    alt37=1;
                                                }


                                            }


                                        }


                                    }


                                }


                            }


                        }
                        else if ( ((LA37_0 >= '\u00C0' && LA37_0 <= '\u00D6')) ) {
                            int LA37_4 = input.LA(2);

                            if ( (LA37_4=='%'||(LA37_4 >= '-' && LA37_4 <= '.')||(LA37_4 >= '0' && LA37_4 <= ':')||(LA37_4 >= 'A' && LA37_4 <= 'Z')||LA37_4=='\\'||LA37_4=='_'||(LA37_4 >= 'a' && LA37_4 <= 'z')||LA37_4=='\u00B7'||(LA37_4 >= '\u00C0' && LA37_4 <= '\u00D6')||(LA37_4 >= '\u00D8' && LA37_4 <= '\u00F6')||(LA37_4 >= '\u00F8' && LA37_4 <= '\u037D')||(LA37_4 >= '\u037F' && LA37_4 <= '\u1FFF')||(LA37_4 >= '\u200C' && LA37_4 <= '\u200D')||(LA37_4 >= '\u203F' && LA37_4 <= '\u2040')||(LA37_4 >= '\u2070' && LA37_4 <= '\u218F')||(LA37_4 >= '\u2C00' && LA37_4 <= '\u2FEF')||(LA37_4 >= '\u3001' && LA37_4 <= '\uD7FF')||(LA37_4 >= '\uF900' && LA37_4 <= '\uFDCF')||(LA37_4 >= '\uFDF0' && LA37_4 <= '\uFFFD')) ) {
                                alt37=1;
                            }


                        }
                        else if ( ((LA37_0 >= '\u00D8' && LA37_0 <= '\u00F6')) ) {
                            int LA37_5 = input.LA(2);

                            if ( (LA37_5=='%'||(LA37_5 >= '-' && LA37_5 <= '.')||(LA37_5 >= '0' && LA37_5 <= ':')||(LA37_5 >= 'A' && LA37_5 <= 'Z')||LA37_5=='\\'||LA37_5=='_'||(LA37_5 >= 'a' && LA37_5 <= 'z')||LA37_5=='\u00B7'||(LA37_5 >= '\u00C0' && LA37_5 <= '\u00D6')||(LA37_5 >= '\u00D8' && LA37_5 <= '\u00F6')||(LA37_5 >= '\u00F8' && LA37_5 <= '\u037D')||(LA37_5 >= '\u037F' && LA37_5 <= '\u1FFF')||(LA37_5 >= '\u200C' && LA37_5 <= '\u200D')||(LA37_5 >= '\u203F' && LA37_5 <= '\u2040')||(LA37_5 >= '\u2070' && LA37_5 <= '\u218F')||(LA37_5 >= '\u2C00' && LA37_5 <= '\u2FEF')||(LA37_5 >= '\u3001' && LA37_5 <= '\uD7FF')||(LA37_5 >= '\uF900' && LA37_5 <= '\uFDCF')||(LA37_5 >= '\uFDF0' && LA37_5 <= '\uFFFD')) ) {
                                alt37=1;
                            }


                        }
                        else if ( ((LA37_0 >= '\u00F8' && LA37_0 <= '\u02FF')) ) {
                            int LA37_6 = input.LA(2);

                            if ( (LA37_6=='%'||(LA37_6 >= '-' && LA37_6 <= '.')||(LA37_6 >= '0' && LA37_6 <= ':')||(LA37_6 >= 'A' && LA37_6 <= 'Z')||LA37_6=='\\'||LA37_6=='_'||(LA37_6 >= 'a' && LA37_6 <= 'z')||LA37_6=='\u00B7'||(LA37_6 >= '\u00C0' && LA37_6 <= '\u00D6')||(LA37_6 >= '\u00D8' && LA37_6 <= '\u00F6')||(LA37_6 >= '\u00F8' && LA37_6 <= '\u037D')||(LA37_6 >= '\u037F' && LA37_6 <= '\u1FFF')||(LA37_6 >= '\u200C' && LA37_6 <= '\u200D')||(LA37_6 >= '\u203F' && LA37_6 <= '\u2040')||(LA37_6 >= '\u2070' && LA37_6 <= '\u218F')||(LA37_6 >= '\u2C00' && LA37_6 <= '\u2FEF')||(LA37_6 >= '\u3001' && LA37_6 <= '\uD7FF')||(LA37_6 >= '\uF900' && LA37_6 <= '\uFDCF')||(LA37_6 >= '\uFDF0' && LA37_6 <= '\uFFFD')) ) {
                                alt37=1;
                            }


                        }
                        else if ( ((LA37_0 >= '\u0370' && LA37_0 <= '\u037D')) ) {
                            int LA37_7 = input.LA(2);

                            if ( (LA37_7=='%'||(LA37_7 >= '-' && LA37_7 <= '.')||(LA37_7 >= '0' && LA37_7 <= ':')||(LA37_7 >= 'A' && LA37_7 <= 'Z')||LA37_7=='\\'||LA37_7=='_'||(LA37_7 >= 'a' && LA37_7 <= 'z')||LA37_7=='\u00B7'||(LA37_7 >= '\u00C0' && LA37_7 <= '\u00D6')||(LA37_7 >= '\u00D8' && LA37_7 <= '\u00F6')||(LA37_7 >= '\u00F8' && LA37_7 <= '\u037D')||(LA37_7 >= '\u037F' && LA37_7 <= '\u1FFF')||(LA37_7 >= '\u200C' && LA37_7 <= '\u200D')||(LA37_7 >= '\u203F' && LA37_7 <= '\u2040')||(LA37_7 >= '\u2070' && LA37_7 <= '\u218F')||(LA37_7 >= '\u2C00' && LA37_7 <= '\u2FEF')||(LA37_7 >= '\u3001' && LA37_7 <= '\uD7FF')||(LA37_7 >= '\uF900' && LA37_7 <= '\uFDCF')||(LA37_7 >= '\uFDF0' && LA37_7 <= '\uFFFD')) ) {
                                alt37=1;
                            }


                        }
                        else if ( ((LA37_0 >= '\u037F' && LA37_0 <= '\u1FFF')) ) {
                            int LA37_8 = input.LA(2);

                            if ( (LA37_8=='%'||(LA37_8 >= '-' && LA37_8 <= '.')||(LA37_8 >= '0' && LA37_8 <= ':')||(LA37_8 >= 'A' && LA37_8 <= 'Z')||LA37_8=='\\'||LA37_8=='_'||(LA37_8 >= 'a' && LA37_8 <= 'z')||LA37_8=='\u00B7'||(LA37_8 >= '\u00C0' && LA37_8 <= '\u00D6')||(LA37_8 >= '\u00D8' && LA37_8 <= '\u00F6')||(LA37_8 >= '\u00F8' && LA37_8 <= '\u037D')||(LA37_8 >= '\u037F' && LA37_8 <= '\u1FFF')||(LA37_8 >= '\u200C' && LA37_8 <= '\u200D')||(LA37_8 >= '\u203F' && LA37_8 <= '\u2040')||(LA37_8 >= '\u2070' && LA37_8 <= '\u218F')||(LA37_8 >= '\u2C00' && LA37_8 <= '\u2FEF')||(LA37_8 >= '\u3001' && LA37_8 <= '\uD7FF')||(LA37_8 >= '\uF900' && LA37_8 <= '\uFDCF')||(LA37_8 >= '\uFDF0' && LA37_8 <= '\uFFFD')) ) {
                                alt37=1;
                            }


                        }
                        else if ( ((LA37_0 >= '\u200C' && LA37_0 <= '\u200D')) ) {
                            int LA37_9 = input.LA(2);

                            if ( (LA37_9=='%'||(LA37_9 >= '-' && LA37_9 <= '.')||(LA37_9 >= '0' && LA37_9 <= ':')||(LA37_9 >= 'A' && LA37_9 <= 'Z')||LA37_9=='\\'||LA37_9=='_'||(LA37_9 >= 'a' && LA37_9 <= 'z')||LA37_9=='\u00B7'||(LA37_9 >= '\u00C0' && LA37_9 <= '\u00D6')||(LA37_9 >= '\u00D8' && LA37_9 <= '\u00F6')||(LA37_9 >= '\u00F8' && LA37_9 <= '\u037D')||(LA37_9 >= '\u037F' && LA37_9 <= '\u1FFF')||(LA37_9 >= '\u200C' && LA37_9 <= '\u200D')||(LA37_9 >= '\u203F' && LA37_9 <= '\u2040')||(LA37_9 >= '\u2070' && LA37_9 <= '\u218F')||(LA37_9 >= '\u2C00' && LA37_9 <= '\u2FEF')||(LA37_9 >= '\u3001' && LA37_9 <= '\uD7FF')||(LA37_9 >= '\uF900' && LA37_9 <= '\uFDCF')||(LA37_9 >= '\uFDF0' && LA37_9 <= '\uFFFD')) ) {
                                alt37=1;
                            }


                        }
                        else if ( ((LA37_0 >= '\u2070' && LA37_0 <= '\u218F')) ) {
                            int LA37_10 = input.LA(2);

                            if ( (LA37_10=='%'||(LA37_10 >= '-' && LA37_10 <= '.')||(LA37_10 >= '0' && LA37_10 <= ':')||(LA37_10 >= 'A' && LA37_10 <= 'Z')||LA37_10=='\\'||LA37_10=='_'||(LA37_10 >= 'a' && LA37_10 <= 'z')||LA37_10=='\u00B7'||(LA37_10 >= '\u00C0' && LA37_10 <= '\u00D6')||(LA37_10 >= '\u00D8' && LA37_10 <= '\u00F6')||(LA37_10 >= '\u00F8' && LA37_10 <= '\u037D')||(LA37_10 >= '\u037F' && LA37_10 <= '\u1FFF')||(LA37_10 >= '\u200C' && LA37_10 <= '\u200D')||(LA37_10 >= '\u203F' && LA37_10 <= '\u2040')||(LA37_10 >= '\u2070' && LA37_10 <= '\u218F')||(LA37_10 >= '\u2C00' && LA37_10 <= '\u2FEF')||(LA37_10 >= '\u3001' && LA37_10 <= '\uD7FF')||(LA37_10 >= '\uF900' && LA37_10 <= '\uFDCF')||(LA37_10 >= '\uFDF0' && LA37_10 <= '\uFFFD')) ) {
                                alt37=1;
                            }


                        }
                        else if ( ((LA37_0 >= '\u2C00' && LA37_0 <= '\u2FEF')) ) {
                            int LA37_11 = input.LA(2);

                            if ( (LA37_11=='%'||(LA37_11 >= '-' && LA37_11 <= '.')||(LA37_11 >= '0' && LA37_11 <= ':')||(LA37_11 >= 'A' && LA37_11 <= 'Z')||LA37_11=='\\'||LA37_11=='_'||(LA37_11 >= 'a' && LA37_11 <= 'z')||LA37_11=='\u00B7'||(LA37_11 >= '\u00C0' && LA37_11 <= '\u00D6')||(LA37_11 >= '\u00D8' && LA37_11 <= '\u00F6')||(LA37_11 >= '\u00F8' && LA37_11 <= '\u037D')||(LA37_11 >= '\u037F' && LA37_11 <= '\u1FFF')||(LA37_11 >= '\u200C' && LA37_11 <= '\u200D')||(LA37_11 >= '\u203F' && LA37_11 <= '\u2040')||(LA37_11 >= '\u2070' && LA37_11 <= '\u218F')||(LA37_11 >= '\u2C00' && LA37_11 <= '\u2FEF')||(LA37_11 >= '\u3001' && LA37_11 <= '\uD7FF')||(LA37_11 >= '\uF900' && LA37_11 <= '\uFDCF')||(LA37_11 >= '\uFDF0' && LA37_11 <= '\uFFFD')) ) {
                                alt37=1;
                            }


                        }
                        else if ( ((LA37_0 >= '\u3001' && LA37_0 <= '\uD7FF')) ) {
                            int LA37_12 = input.LA(2);

                            if ( (LA37_12=='%'||(LA37_12 >= '-' && LA37_12 <= '.')||(LA37_12 >= '0' && LA37_12 <= ':')||(LA37_12 >= 'A' && LA37_12 <= 'Z')||LA37_12=='\\'||LA37_12=='_'||(LA37_12 >= 'a' && LA37_12 <= 'z')||LA37_12=='\u00B7'||(LA37_12 >= '\u00C0' && LA37_12 <= '\u00D6')||(LA37_12 >= '\u00D8' && LA37_12 <= '\u00F6')||(LA37_12 >= '\u00F8' && LA37_12 <= '\u037D')||(LA37_12 >= '\u037F' && LA37_12 <= '\u1FFF')||(LA37_12 >= '\u200C' && LA37_12 <= '\u200D')||(LA37_12 >= '\u203F' && LA37_12 <= '\u2040')||(LA37_12 >= '\u2070' && LA37_12 <= '\u218F')||(LA37_12 >= '\u2C00' && LA37_12 <= '\u2FEF')||(LA37_12 >= '\u3001' && LA37_12 <= '\uD7FF')||(LA37_12 >= '\uF900' && LA37_12 <= '\uFDCF')||(LA37_12 >= '\uFDF0' && LA37_12 <= '\uFFFD')) ) {
                                alt37=1;
                            }


                        }
                        else if ( ((LA37_0 >= '\uF900' && LA37_0 <= '\uFDCF')) ) {
                            int LA37_13 = input.LA(2);

                            if ( (LA37_13=='%'||(LA37_13 >= '-' && LA37_13 <= '.')||(LA37_13 >= '0' && LA37_13 <= ':')||(LA37_13 >= 'A' && LA37_13 <= 'Z')||LA37_13=='\\'||LA37_13=='_'||(LA37_13 >= 'a' && LA37_13 <= 'z')||LA37_13=='\u00B7'||(LA37_13 >= '\u00C0' && LA37_13 <= '\u00D6')||(LA37_13 >= '\u00D8' && LA37_13 <= '\u00F6')||(LA37_13 >= '\u00F8' && LA37_13 <= '\u037D')||(LA37_13 >= '\u037F' && LA37_13 <= '\u1FFF')||(LA37_13 >= '\u200C' && LA37_13 <= '\u200D')||(LA37_13 >= '\u203F' && LA37_13 <= '\u2040')||(LA37_13 >= '\u2070' && LA37_13 <= '\u218F')||(LA37_13 >= '\u2C00' && LA37_13 <= '\u2FEF')||(LA37_13 >= '\u3001' && LA37_13 <= '\uD7FF')||(LA37_13 >= '\uF900' && LA37_13 <= '\uFDCF')||(LA37_13 >= '\uFDF0' && LA37_13 <= '\uFFFD')) ) {
                                alt37=1;
                            }


                        }
                        else if ( ((LA37_0 >= '\uFDF0' && LA37_0 <= '\uFFFD')) ) {
                            int LA37_14 = input.LA(2);

                            if ( (LA37_14=='%'||(LA37_14 >= '-' && LA37_14 <= '.')||(LA37_14 >= '0' && LA37_14 <= ':')||(LA37_14 >= 'A' && LA37_14 <= 'Z')||LA37_14=='\\'||LA37_14=='_'||(LA37_14 >= 'a' && LA37_14 <= 'z')||LA37_14=='\u00B7'||(LA37_14 >= '\u00C0' && LA37_14 <= '\u00D6')||(LA37_14 >= '\u00D8' && LA37_14 <= '\u00F6')||(LA37_14 >= '\u00F8' && LA37_14 <= '\u037D')||(LA37_14 >= '\u037F' && LA37_14 <= '\u1FFF')||(LA37_14 >= '\u200C' && LA37_14 <= '\u200D')||(LA37_14 >= '\u203F' && LA37_14 <= '\u2040')||(LA37_14 >= '\u2070' && LA37_14 <= '\u218F')||(LA37_14 >= '\u2C00' && LA37_14 <= '\u2FEF')||(LA37_14 >= '\u3001' && LA37_14 <= '\uD7FF')||(LA37_14 >= '\uF900' && LA37_14 <= '\uFDCF')||(LA37_14 >= '\uFDF0' && LA37_14 <= '\uFFFD')) ) {
                                alt37=1;
                            }


                        }
                        else if ( (LA37_0=='_') ) {
                            int LA37_15 = input.LA(2);

                            if ( (LA37_15=='%'||(LA37_15 >= '-' && LA37_15 <= '.')||(LA37_15 >= '0' && LA37_15 <= ':')||(LA37_15 >= 'A' && LA37_15 <= 'Z')||LA37_15=='\\'||LA37_15=='_'||(LA37_15 >= 'a' && LA37_15 <= 'z')||LA37_15=='\u00B7'||(LA37_15 >= '\u00C0' && LA37_15 <= '\u00D6')||(LA37_15 >= '\u00D8' && LA37_15 <= '\u00F6')||(LA37_15 >= '\u00F8' && LA37_15 <= '\u037D')||(LA37_15 >= '\u037F' && LA37_15 <= '\u1FFF')||(LA37_15 >= '\u200C' && LA37_15 <= '\u200D')||(LA37_15 >= '\u203F' && LA37_15 <= '\u2040')||(LA37_15 >= '\u2070' && LA37_15 <= '\u218F')||(LA37_15 >= '\u2C00' && LA37_15 <= '\u2FEF')||(LA37_15 >= '\u3001' && LA37_15 <= '\uD7FF')||(LA37_15 >= '\uF900' && LA37_15 <= '\uFDCF')||(LA37_15 >= '\uFDF0' && LA37_15 <= '\uFFFD')) ) {
                                alt37=1;
                            }


                        }
                        else if ( (LA37_0=='-') ) {
                            int LA37_16 = input.LA(2);

                            if ( (LA37_16=='%'||(LA37_16 >= '-' && LA37_16 <= '.')||(LA37_16 >= '0' && LA37_16 <= ':')||(LA37_16 >= 'A' && LA37_16 <= 'Z')||LA37_16=='\\'||LA37_16=='_'||(LA37_16 >= 'a' && LA37_16 <= 'z')||LA37_16=='\u00B7'||(LA37_16 >= '\u00C0' && LA37_16 <= '\u00D6')||(LA37_16 >= '\u00D8' && LA37_16 <= '\u00F6')||(LA37_16 >= '\u00F8' && LA37_16 <= '\u037D')||(LA37_16 >= '\u037F' && LA37_16 <= '\u1FFF')||(LA37_16 >= '\u200C' && LA37_16 <= '\u200D')||(LA37_16 >= '\u203F' && LA37_16 <= '\u2040')||(LA37_16 >= '\u2070' && LA37_16 <= '\u218F')||(LA37_16 >= '\u2C00' && LA37_16 <= '\u2FEF')||(LA37_16 >= '\u3001' && LA37_16 <= '\uD7FF')||(LA37_16 >= '\uF900' && LA37_16 <= '\uFDCF')||(LA37_16 >= '\uFDF0' && LA37_16 <= '\uFFFD')) ) {
                                alt37=1;
                            }


                        }
                        else if ( ((LA37_0 >= '0' && LA37_0 <= '9')) ) {
                            int LA37_17 = input.LA(2);

                            if ( (LA37_17=='%'||(LA37_17 >= '-' && LA37_17 <= '.')||(LA37_17 >= '0' && LA37_17 <= ':')||(LA37_17 >= 'A' && LA37_17 <= 'Z')||LA37_17=='\\'||LA37_17=='_'||(LA37_17 >= 'a' && LA37_17 <= 'z')||LA37_17=='\u00B7'||(LA37_17 >= '\u00C0' && LA37_17 <= '\u00D6')||(LA37_17 >= '\u00D8' && LA37_17 <= '\u00F6')||(LA37_17 >= '\u00F8' && LA37_17 <= '\u037D')||(LA37_17 >= '\u037F' && LA37_17 <= '\u1FFF')||(LA37_17 >= '\u200C' && LA37_17 <= '\u200D')||(LA37_17 >= '\u203F' && LA37_17 <= '\u2040')||(LA37_17 >= '\u2070' && LA37_17 <= '\u218F')||(LA37_17 >= '\u2C00' && LA37_17 <= '\u2FEF')||(LA37_17 >= '\u3001' && LA37_17 <= '\uD7FF')||(LA37_17 >= '\uF900' && LA37_17 <= '\uFDCF')||(LA37_17 >= '\uFDF0' && LA37_17 <= '\uFFFD')) ) {
                                alt37=1;
                            }


                        }
                        else if ( (LA37_0=='\u00B7') ) {
                            int LA37_18 = input.LA(2);

                            if ( (LA37_18=='%'||(LA37_18 >= '-' && LA37_18 <= '.')||(LA37_18 >= '0' && LA37_18 <= ':')||(LA37_18 >= 'A' && LA37_18 <= 'Z')||LA37_18=='\\'||LA37_18=='_'||(LA37_18 >= 'a' && LA37_18 <= 'z')||LA37_18=='\u00B7'||(LA37_18 >= '\u00C0' && LA37_18 <= '\u00D6')||(LA37_18 >= '\u00D8' && LA37_18 <= '\u00F6')||(LA37_18 >= '\u00F8' && LA37_18 <= '\u037D')||(LA37_18 >= '\u037F' && LA37_18 <= '\u1FFF')||(LA37_18 >= '\u200C' && LA37_18 <= '\u200D')||(LA37_18 >= '\u203F' && LA37_18 <= '\u2040')||(LA37_18 >= '\u2070' && LA37_18 <= '\u218F')||(LA37_18 >= '\u2C00' && LA37_18 <= '\u2FEF')||(LA37_18 >= '\u3001' && LA37_18 <= '\uD7FF')||(LA37_18 >= '\uF900' && LA37_18 <= '\uFDCF')||(LA37_18 >= '\uFDF0' && LA37_18 <= '\uFFFD')) ) {
                                alt37=1;
                            }


                        }
                        else if ( ((LA37_0 >= '\u0300' && LA37_0 <= '\u036F')) ) {
                            int LA37_19 = input.LA(2);

                            if ( (LA37_19=='%'||(LA37_19 >= '-' && LA37_19 <= '.')||(LA37_19 >= '0' && LA37_19 <= ':')||(LA37_19 >= 'A' && LA37_19 <= 'Z')||LA37_19=='\\'||LA37_19=='_'||(LA37_19 >= 'a' && LA37_19 <= 'z')||LA37_19=='\u00B7'||(LA37_19 >= '\u00C0' && LA37_19 <= '\u00D6')||(LA37_19 >= '\u00D8' && LA37_19 <= '\u00F6')||(LA37_19 >= '\u00F8' && LA37_19 <= '\u037D')||(LA37_19 >= '\u037F' && LA37_19 <= '\u1FFF')||(LA37_19 >= '\u200C' && LA37_19 <= '\u200D')||(LA37_19 >= '\u203F' && LA37_19 <= '\u2040')||(LA37_19 >= '\u2070' && LA37_19 <= '\u218F')||(LA37_19 >= '\u2C00' && LA37_19 <= '\u2FEF')||(LA37_19 >= '\u3001' && LA37_19 <= '\uD7FF')||(LA37_19 >= '\uF900' && LA37_19 <= '\uFDCF')||(LA37_19 >= '\uFDF0' && LA37_19 <= '\uFFFD')) ) {
                                alt37=1;
                            }


                        }
                        else if ( ((LA37_0 >= '\u203F' && LA37_0 <= '\u2040')) ) {
                            int LA37_20 = input.LA(2);

                            if ( (LA37_20=='%'||(LA37_20 >= '-' && LA37_20 <= '.')||(LA37_20 >= '0' && LA37_20 <= ':')||(LA37_20 >= 'A' && LA37_20 <= 'Z')||LA37_20=='\\'||LA37_20=='_'||(LA37_20 >= 'a' && LA37_20 <= 'z')||LA37_20=='\u00B7'||(LA37_20 >= '\u00C0' && LA37_20 <= '\u00D6')||(LA37_20 >= '\u00D8' && LA37_20 <= '\u00F6')||(LA37_20 >= '\u00F8' && LA37_20 <= '\u037D')||(LA37_20 >= '\u037F' && LA37_20 <= '\u1FFF')||(LA37_20 >= '\u200C' && LA37_20 <= '\u200D')||(LA37_20 >= '\u203F' && LA37_20 <= '\u2040')||(LA37_20 >= '\u2070' && LA37_20 <= '\u218F')||(LA37_20 >= '\u2C00' && LA37_20 <= '\u2FEF')||(LA37_20 >= '\u3001' && LA37_20 <= '\uD7FF')||(LA37_20 >= '\uF900' && LA37_20 <= '\uFDCF')||(LA37_20 >= '\uFDF0' && LA37_20 <= '\uFFFD')) ) {
                                alt37=1;
                            }


                        }
                        else if ( (LA37_0==':') ) {
                            int LA37_21 = input.LA(2);

                            if ( (LA37_21=='%'||(LA37_21 >= '-' && LA37_21 <= '.')||(LA37_21 >= '0' && LA37_21 <= ':')||(LA37_21 >= 'A' && LA37_21 <= 'Z')||LA37_21=='\\'||LA37_21=='_'||(LA37_21 >= 'a' && LA37_21 <= 'z')||LA37_21=='\u00B7'||(LA37_21 >= '\u00C0' && LA37_21 <= '\u00D6')||(LA37_21 >= '\u00D8' && LA37_21 <= '\u00F6')||(LA37_21 >= '\u00F8' && LA37_21 <= '\u037D')||(LA37_21 >= '\u037F' && LA37_21 <= '\u1FFF')||(LA37_21 >= '\u200C' && LA37_21 <= '\u200D')||(LA37_21 >= '\u203F' && LA37_21 <= '\u2040')||(LA37_21 >= '\u2070' && LA37_21 <= '\u218F')||(LA37_21 >= '\u2C00' && LA37_21 <= '\u2FEF')||(LA37_21 >= '\u3001' && LA37_21 <= '\uD7FF')||(LA37_21 >= '\uF900' && LA37_21 <= '\uFDCF')||(LA37_21 >= '\uFDF0' && LA37_21 <= '\uFFFD')) ) {
                                alt37=3;
                            }


                        }
                        else if ( (LA37_0=='%') ) {
                            int LA37_22 = input.LA(2);

                            if ( ((LA37_22 >= '0' && LA37_22 <= '9')||(LA37_22 >= 'A' && LA37_22 <= 'F')||(LA37_22 >= 'a' && LA37_22 <= 'f')) ) {
                                int LA37_29 = input.LA(3);

                                if ( ((LA37_29 >= '0' && LA37_29 <= '9')||(LA37_29 >= 'A' && LA37_29 <= 'F')||(LA37_29 >= 'a' && LA37_29 <= 'f')) ) {
                                    int LA37_32 = input.LA(4);

                                    if ( (LA37_32=='%'||(LA37_32 >= '-' && LA37_32 <= '.')||(LA37_32 >= '0' && LA37_32 <= ':')||(LA37_32 >= 'A' && LA37_32 <= 'Z')||LA37_32=='\\'||LA37_32=='_'||(LA37_32 >= 'a' && LA37_32 <= 'z')||LA37_32=='\u00B7'||(LA37_32 >= '\u00C0' && LA37_32 <= '\u00D6')||(LA37_32 >= '\u00D8' && LA37_32 <= '\u00F6')||(LA37_32 >= '\u00F8' && LA37_32 <= '\u037D')||(LA37_32 >= '\u037F' && LA37_32 <= '\u1FFF')||(LA37_32 >= '\u200C' && LA37_32 <= '\u200D')||(LA37_32 >= '\u203F' && LA37_32 <= '\u2040')||(LA37_32 >= '\u2070' && LA37_32 <= '\u218F')||(LA37_32 >= '\u2C00' && LA37_32 <= '\u2FEF')||(LA37_32 >= '\u3001' && LA37_32 <= '\uD7FF')||(LA37_32 >= '\uF900' && LA37_32 <= '\uFDCF')||(LA37_32 >= '\uFDF0' && LA37_32 <= '\uFFFD')) ) {
                                        alt37=4;
                                    }


                                }


                            }


                        }
                        else if ( (LA37_0=='.') ) {
                            alt37=2;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1396:50: PN_CHARS
                    	    {
                    	    mPN_CHARS(); if (state.failed) return ;


                    	    }
                    	    break;
                    	case 2 :
                    	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1396:61: DOT
                    	    {
                    	    mDOT(); if (state.failed) return ;


                    	    }
                    	    break;
                    	case 3 :
                    	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1396:67: ':'
                    	    {
                    	    match(':'); if (state.failed) return ;

                    	    }
                    	    break;
                    	case 4 :
                    	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1396:73: PLX
                    	    {
                    	    mPLX(); if (state.failed) return ;


                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);


                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1396:79: ( PN_CHARS | ':' | PLX )
                    int alt38=3;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0=='-'||(LA38_0 >= '0' && LA38_0 <= '9')||(LA38_0 >= 'A' && LA38_0 <= 'Z')||LA38_0=='_'||(LA38_0 >= 'a' && LA38_0 <= 'z')||LA38_0=='\u00B7'||(LA38_0 >= '\u00C0' && LA38_0 <= '\u00D6')||(LA38_0 >= '\u00D8' && LA38_0 <= '\u00F6')||(LA38_0 >= '\u00F8' && LA38_0 <= '\u037D')||(LA38_0 >= '\u037F' && LA38_0 <= '\u1FFF')||(LA38_0 >= '\u200C' && LA38_0 <= '\u200D')||(LA38_0 >= '\u203F' && LA38_0 <= '\u2040')||(LA38_0 >= '\u2070' && LA38_0 <= '\u218F')||(LA38_0 >= '\u2C00' && LA38_0 <= '\u2FEF')||(LA38_0 >= '\u3001' && LA38_0 <= '\uD7FF')||(LA38_0 >= '\uF900' && LA38_0 <= '\uFDCF')||(LA38_0 >= '\uFDF0' && LA38_0 <= '\uFFFD')) ) {
                        alt38=1;
                    }
                    else if ( (LA38_0=='\\') ) {
                        int LA38_2 = input.LA(2);

                        if ( (LA38_2=='!'||(LA38_2 >= '#' && LA38_2 <= '/')||LA38_2==';'||LA38_2=='='||(LA38_2 >= '?' && LA38_2 <= '@')||LA38_2=='_'||LA38_2=='~') ) {
                            alt38=3;
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
                    else if ( (LA38_0=='%') ) {
                        alt38=3;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 38, 0, input);

                        throw nvae;

                    }
                    switch (alt38) {
                        case 1 :
                            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1396:80: PN_CHARS
                            {
                            mPN_CHARS(); if (state.failed) return ;


                            }
                            break;
                        case 2 :
                            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1396:91: ':'
                            {
                            match(':'); if (state.failed) return ;

                            }
                            break;
                        case 3 :
                            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1396:97: PLX
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1401:5: ( PERCENT | PN_LOCAL_ESC )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0=='%') ) {
                alt40=1;
            }
            else if ( (LA40_0=='\\') ) {
                alt40=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;

            }
            switch (alt40) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1401:9: PERCENT
                    {
                    mPERCENT(); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1401:19: PN_LOCAL_ESC
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1406:5: ( '%' HEXDIGIT HEXDIGIT )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1406:9: '%' HEXDIGIT HEXDIGIT
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1411:5: ( '\\\\' ( '_' | '-' | '.' | '~' | '\\'' | '!' | '$' | '&' | '(' | ')' | '*' | '+' | ',' | ';' | '=' | '/' | '?' | '#' | '@' | '%' ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1411:9: '\\\\' ( '_' | '-' | '.' | '~' | '\\'' | '!' | '$' | '&' | '(' | ')' | '*' | '+' | ',' | ';' | '=' | '/' | '?' | '#' | '@' | '%' )
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1413:12: ( 'A' | 'a' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1414:12: ( 'B' | 'b' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1415:12: ( 'C' | 'c' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1416:12: ( 'D' | 'd' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1417:12: ( 'E' | 'e' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1418:12: ( 'F' | 'f' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1419:12: ( 'G' | 'g' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1420:12: ( 'H' | 'h' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1421:12: ( 'I' | 'i' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1422:12: ( 'J' | 'j' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1423:12: ( 'K' | 'k' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1424:12: ( 'L' | 'l' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1425:12: ( 'M' | 'm' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1426:12: ( 'N' | 'n' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1427:12: ( 'O' | 'o' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1428:12: ( 'P' | 'p' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1429:12: ( 'Q' | 'q' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1430:12: ( 'R' | 'r' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1431:12: ( 'S' | 's' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1432:12: ( 'T' | 't' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1433:12: ( 'U' | 'u' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1434:12: ( 'V' | 'v' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1435:12: ( 'W' | 'w' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1436:12: ( 'X' | 'x' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1437:12: ( 'Y' | 'y' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1438:12: ( 'Z' | 'z' )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:
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
        // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:8: ( T__251 | T__252 | T__253 | T__254 | T__255 | T__256 | T__257 | T__258 | T__259 | T__260 | T__261 | T__262 | T__263 | T__264 | BASE | PREFIX | SELECT | DISTINCT | REDUCED | AS | CONSTRUCT | WHERE_TOKEN | DESCRIBE | ASK | FROM | NAMED | GROUP | BY | HAVING | ORDER | ASC | DESC | LIMIT | OFFSET | BINDINGS | UNDEF | LOAD | SILENT | INTO | CLEAR | DROP | CREATE | TO | MOVE | COPY | INSERT | DATA | DELETE | WITH | USING | DEFAULT | GRAPH | ALL | OPTIONAL | SERVICE | BIND | MINUS | UNION | FILTER | STR | LANG | LANGMATCHES | DATATYPE | BOUND | IRI | URI | BNODE | RAND | ABS | CEIL | FLOOR | ROUND | CONCAT | STRLEN | UCASE | LCASE | ENCODE_FOR_URI | CONTAINS | STRSTARTS | STRENDS | STRBEFORE | STRAFTER | YEAR | MONTH | DAY | HOURS | MINUTES | SECONDS | TIMEZONE | TZ | NOW | MD5 | SHA1 | SHA224 | SHA256 | SHA384 | SHA512 | COALESCE | IF | STRLANG | STRDT | SAMETERM | ISIRI | ISURI | ISBLANK | ISLITERAL | ISNUMERIC | REGEX | TRUE | FALSE | ADD | IN | NOT | SUBSTR | EXISTS | COUNT | SUM | MIN | MAX | AVG | SAMPLE | GROUP_CONCAT | SEPARATOR | VALUES | REPLACE | UUID | STRUUID | OPEN_CURLY_BRACE | CLOSE_CURLY_BRACE | DOT | OPEN_BRACE | CLOSE_BRACE | COMMA | SEMICOLON | LOGICAL_OR | LOGICAL_AND | OPEN_SQ_BRACKET | CLOSE_SQ_BRACKET | LT | PNAME_NS | PNAME_LN | BLANK_NODE_LABEL | VAR1 | VAR2 | LANGTAG | INTEGER | DECIMAL | DOUBLE | INTEGER_POSITIVE | DECIMAL_POSITIVE | DOUBLE_POSITIVE | INTEGER_NEGATIVE | DECIMAL_NEGATIVE | DOUBLE_NEGATIVE | STRING_LITERAL1 | STRING_LITERAL2 | STRING_LITERAL_LONG1 | STRING_LITERAL_LONG2 | ECHAR | WS | COMMENT )
        int alt41=161;
        alt41 = dfa41.predict(input);
        switch (alt41) {
            case 1 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:10: T__251
                {
                mT__251(); if (state.failed) return ;


                }
                break;
            case 2 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:17: T__252
                {
                mT__252(); if (state.failed) return ;


                }
                break;
            case 3 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:24: T__253
                {
                mT__253(); if (state.failed) return ;


                }
                break;
            case 4 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:31: T__254
                {
                mT__254(); if (state.failed) return ;


                }
                break;
            case 5 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:38: T__255
                {
                mT__255(); if (state.failed) return ;


                }
                break;
            case 6 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:45: T__256
                {
                mT__256(); if (state.failed) return ;


                }
                break;
            case 7 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:52: T__257
                {
                mT__257(); if (state.failed) return ;


                }
                break;
            case 8 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:59: T__258
                {
                mT__258(); if (state.failed) return ;


                }
                break;
            case 9 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:66: T__259
                {
                mT__259(); if (state.failed) return ;


                }
                break;
            case 10 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:73: T__260
                {
                mT__260(); if (state.failed) return ;


                }
                break;
            case 11 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:80: T__261
                {
                mT__261(); if (state.failed) return ;


                }
                break;
            case 12 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:87: T__262
                {
                mT__262(); if (state.failed) return ;


                }
                break;
            case 13 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:94: T__263
                {
                mT__263(); if (state.failed) return ;


                }
                break;
            case 14 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:101: T__264
                {
                mT__264(); if (state.failed) return ;


                }
                break;
            case 15 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:108: BASE
                {
                mBASE(); if (state.failed) return ;


                }
                break;
            case 16 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:113: PREFIX
                {
                mPREFIX(); if (state.failed) return ;


                }
                break;
            case 17 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:120: SELECT
                {
                mSELECT(); if (state.failed) return ;


                }
                break;
            case 18 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:127: DISTINCT
                {
                mDISTINCT(); if (state.failed) return ;


                }
                break;
            case 19 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:136: REDUCED
                {
                mREDUCED(); if (state.failed) return ;


                }
                break;
            case 20 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:144: AS
                {
                mAS(); if (state.failed) return ;


                }
                break;
            case 21 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:147: CONSTRUCT
                {
                mCONSTRUCT(); if (state.failed) return ;


                }
                break;
            case 22 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:157: WHERE_TOKEN
                {
                mWHERE_TOKEN(); if (state.failed) return ;


                }
                break;
            case 23 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:169: DESCRIBE
                {
                mDESCRIBE(); if (state.failed) return ;


                }
                break;
            case 24 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:178: ASK
                {
                mASK(); if (state.failed) return ;


                }
                break;
            case 25 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:182: FROM
                {
                mFROM(); if (state.failed) return ;


                }
                break;
            case 26 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:187: NAMED
                {
                mNAMED(); if (state.failed) return ;


                }
                break;
            case 27 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:193: GROUP
                {
                mGROUP(); if (state.failed) return ;


                }
                break;
            case 28 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:199: BY
                {
                mBY(); if (state.failed) return ;


                }
                break;
            case 29 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:202: HAVING
                {
                mHAVING(); if (state.failed) return ;


                }
                break;
            case 30 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:209: ORDER
                {
                mORDER(); if (state.failed) return ;


                }
                break;
            case 31 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:215: ASC
                {
                mASC(); if (state.failed) return ;


                }
                break;
            case 32 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:219: DESC
                {
                mDESC(); if (state.failed) return ;


                }
                break;
            case 33 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:224: LIMIT
                {
                mLIMIT(); if (state.failed) return ;


                }
                break;
            case 34 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:230: OFFSET
                {
                mOFFSET(); if (state.failed) return ;


                }
                break;
            case 35 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:237: BINDINGS
                {
                mBINDINGS(); if (state.failed) return ;


                }
                break;
            case 36 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:246: UNDEF
                {
                mUNDEF(); if (state.failed) return ;


                }
                break;
            case 37 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:252: LOAD
                {
                mLOAD(); if (state.failed) return ;


                }
                break;
            case 38 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:257: SILENT
                {
                mSILENT(); if (state.failed) return ;


                }
                break;
            case 39 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:264: INTO
                {
                mINTO(); if (state.failed) return ;


                }
                break;
            case 40 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:269: CLEAR
                {
                mCLEAR(); if (state.failed) return ;


                }
                break;
            case 41 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:275: DROP
                {
                mDROP(); if (state.failed) return ;


                }
                break;
            case 42 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:280: CREATE
                {
                mCREATE(); if (state.failed) return ;


                }
                break;
            case 43 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:287: TO
                {
                mTO(); if (state.failed) return ;


                }
                break;
            case 44 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:290: MOVE
                {
                mMOVE(); if (state.failed) return ;


                }
                break;
            case 45 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:295: COPY
                {
                mCOPY(); if (state.failed) return ;


                }
                break;
            case 46 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:300: INSERT
                {
                mINSERT(); if (state.failed) return ;


                }
                break;
            case 47 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:307: DATA
                {
                mDATA(); if (state.failed) return ;


                }
                break;
            case 48 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:312: DELETE
                {
                mDELETE(); if (state.failed) return ;


                }
                break;
            case 49 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:319: WITH
                {
                mWITH(); if (state.failed) return ;


                }
                break;
            case 50 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:324: USING
                {
                mUSING(); if (state.failed) return ;


                }
                break;
            case 51 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:330: DEFAULT
                {
                mDEFAULT(); if (state.failed) return ;


                }
                break;
            case 52 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:338: GRAPH
                {
                mGRAPH(); if (state.failed) return ;


                }
                break;
            case 53 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:344: ALL
                {
                mALL(); if (state.failed) return ;


                }
                break;
            case 54 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:348: OPTIONAL
                {
                mOPTIONAL(); if (state.failed) return ;


                }
                break;
            case 55 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:357: SERVICE
                {
                mSERVICE(); if (state.failed) return ;


                }
                break;
            case 56 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:365: BIND
                {
                mBIND(); if (state.failed) return ;


                }
                break;
            case 57 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:370: MINUS
                {
                mMINUS(); if (state.failed) return ;


                }
                break;
            case 58 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:376: UNION
                {
                mUNION(); if (state.failed) return ;


                }
                break;
            case 59 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:382: FILTER
                {
                mFILTER(); if (state.failed) return ;


                }
                break;
            case 60 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:389: STR
                {
                mSTR(); if (state.failed) return ;


                }
                break;
            case 61 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:393: LANG
                {
                mLANG(); if (state.failed) return ;


                }
                break;
            case 62 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:398: LANGMATCHES
                {
                mLANGMATCHES(); if (state.failed) return ;


                }
                break;
            case 63 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:410: DATATYPE
                {
                mDATATYPE(); if (state.failed) return ;


                }
                break;
            case 64 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:419: BOUND
                {
                mBOUND(); if (state.failed) return ;


                }
                break;
            case 65 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:425: IRI
                {
                mIRI(); if (state.failed) return ;


                }
                break;
            case 66 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:429: URI
                {
                mURI(); if (state.failed) return ;


                }
                break;
            case 67 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:433: BNODE
                {
                mBNODE(); if (state.failed) return ;


                }
                break;
            case 68 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:439: RAND
                {
                mRAND(); if (state.failed) return ;


                }
                break;
            case 69 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:444: ABS
                {
                mABS(); if (state.failed) return ;


                }
                break;
            case 70 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:448: CEIL
                {
                mCEIL(); if (state.failed) return ;


                }
                break;
            case 71 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:453: FLOOR
                {
                mFLOOR(); if (state.failed) return ;


                }
                break;
            case 72 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:459: ROUND
                {
                mROUND(); if (state.failed) return ;


                }
                break;
            case 73 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:465: CONCAT
                {
                mCONCAT(); if (state.failed) return ;


                }
                break;
            case 74 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:472: STRLEN
                {
                mSTRLEN(); if (state.failed) return ;


                }
                break;
            case 75 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:479: UCASE
                {
                mUCASE(); if (state.failed) return ;


                }
                break;
            case 76 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:485: LCASE
                {
                mLCASE(); if (state.failed) return ;


                }
                break;
            case 77 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:491: ENCODE_FOR_URI
                {
                mENCODE_FOR_URI(); if (state.failed) return ;


                }
                break;
            case 78 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:506: CONTAINS
                {
                mCONTAINS(); if (state.failed) return ;


                }
                break;
            case 79 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:515: STRSTARTS
                {
                mSTRSTARTS(); if (state.failed) return ;


                }
                break;
            case 80 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:525: STRENDS
                {
                mSTRENDS(); if (state.failed) return ;


                }
                break;
            case 81 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:533: STRBEFORE
                {
                mSTRBEFORE(); if (state.failed) return ;


                }
                break;
            case 82 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:543: STRAFTER
                {
                mSTRAFTER(); if (state.failed) return ;


                }
                break;
            case 83 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:552: YEAR
                {
                mYEAR(); if (state.failed) return ;


                }
                break;
            case 84 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:557: MONTH
                {
                mMONTH(); if (state.failed) return ;


                }
                break;
            case 85 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:563: DAY
                {
                mDAY(); if (state.failed) return ;


                }
                break;
            case 86 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:567: HOURS
                {
                mHOURS(); if (state.failed) return ;


                }
                break;
            case 87 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:573: MINUTES
                {
                mMINUTES(); if (state.failed) return ;


                }
                break;
            case 88 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:581: SECONDS
                {
                mSECONDS(); if (state.failed) return ;


                }
                break;
            case 89 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:589: TIMEZONE
                {
                mTIMEZONE(); if (state.failed) return ;


                }
                break;
            case 90 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:598: TZ
                {
                mTZ(); if (state.failed) return ;


                }
                break;
            case 91 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:601: NOW
                {
                mNOW(); if (state.failed) return ;


                }
                break;
            case 92 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:605: MD5
                {
                mMD5(); if (state.failed) return ;


                }
                break;
            case 93 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:609: SHA1
                {
                mSHA1(); if (state.failed) return ;


                }
                break;
            case 94 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:614: SHA224
                {
                mSHA224(); if (state.failed) return ;


                }
                break;
            case 95 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:621: SHA256
                {
                mSHA256(); if (state.failed) return ;


                }
                break;
            case 96 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:628: SHA384
                {
                mSHA384(); if (state.failed) return ;


                }
                break;
            case 97 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:635: SHA512
                {
                mSHA512(); if (state.failed) return ;


                }
                break;
            case 98 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:642: COALESCE
                {
                mCOALESCE(); if (state.failed) return ;


                }
                break;
            case 99 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:651: IF
                {
                mIF(); if (state.failed) return ;


                }
                break;
            case 100 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:654: STRLANG
                {
                mSTRLANG(); if (state.failed) return ;


                }
                break;
            case 101 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:662: STRDT
                {
                mSTRDT(); if (state.failed) return ;


                }
                break;
            case 102 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:668: SAMETERM
                {
                mSAMETERM(); if (state.failed) return ;


                }
                break;
            case 103 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:677: ISIRI
                {
                mISIRI(); if (state.failed) return ;


                }
                break;
            case 104 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:683: ISURI
                {
                mISURI(); if (state.failed) return ;


                }
                break;
            case 105 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:689: ISBLANK
                {
                mISBLANK(); if (state.failed) return ;


                }
                break;
            case 106 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:697: ISLITERAL
                {
                mISLITERAL(); if (state.failed) return ;


                }
                break;
            case 107 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:707: ISNUMERIC
                {
                mISNUMERIC(); if (state.failed) return ;


                }
                break;
            case 108 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:717: REGEX
                {
                mREGEX(); if (state.failed) return ;


                }
                break;
            case 109 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:723: TRUE
                {
                mTRUE(); if (state.failed) return ;


                }
                break;
            case 110 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:728: FALSE
                {
                mFALSE(); if (state.failed) return ;


                }
                break;
            case 111 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:734: ADD
                {
                mADD(); if (state.failed) return ;


                }
                break;
            case 112 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:738: IN
                {
                mIN(); if (state.failed) return ;


                }
                break;
            case 113 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:741: NOT
                {
                mNOT(); if (state.failed) return ;


                }
                break;
            case 114 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:745: SUBSTR
                {
                mSUBSTR(); if (state.failed) return ;


                }
                break;
            case 115 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:752: EXISTS
                {
                mEXISTS(); if (state.failed) return ;


                }
                break;
            case 116 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:759: COUNT
                {
                mCOUNT(); if (state.failed) return ;


                }
                break;
            case 117 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:765: SUM
                {
                mSUM(); if (state.failed) return ;


                }
                break;
            case 118 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:769: MIN
                {
                mMIN(); if (state.failed) return ;


                }
                break;
            case 119 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:773: MAX
                {
                mMAX(); if (state.failed) return ;


                }
                break;
            case 120 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:777: AVG
                {
                mAVG(); if (state.failed) return ;


                }
                break;
            case 121 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:781: SAMPLE
                {
                mSAMPLE(); if (state.failed) return ;


                }
                break;
            case 122 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:788: GROUP_CONCAT
                {
                mGROUP_CONCAT(); if (state.failed) return ;


                }
                break;
            case 123 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:801: SEPARATOR
                {
                mSEPARATOR(); if (state.failed) return ;


                }
                break;
            case 124 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:811: VALUES
                {
                mVALUES(); if (state.failed) return ;


                }
                break;
            case 125 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:818: REPLACE
                {
                mREPLACE(); if (state.failed) return ;


                }
                break;
            case 126 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:826: UUID
                {
                mUUID(); if (state.failed) return ;


                }
                break;
            case 127 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:831: STRUUID
                {
                mSTRUUID(); if (state.failed) return ;


                }
                break;
            case 128 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:839: OPEN_CURLY_BRACE
                {
                mOPEN_CURLY_BRACE(); if (state.failed) return ;


                }
                break;
            case 129 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:856: CLOSE_CURLY_BRACE
                {
                mCLOSE_CURLY_BRACE(); if (state.failed) return ;


                }
                break;
            case 130 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:874: DOT
                {
                mDOT(); if (state.failed) return ;


                }
                break;
            case 131 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:878: OPEN_BRACE
                {
                mOPEN_BRACE(); if (state.failed) return ;


                }
                break;
            case 132 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:889: CLOSE_BRACE
                {
                mCLOSE_BRACE(); if (state.failed) return ;


                }
                break;
            case 133 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:901: COMMA
                {
                mCOMMA(); if (state.failed) return ;


                }
                break;
            case 134 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:907: SEMICOLON
                {
                mSEMICOLON(); if (state.failed) return ;


                }
                break;
            case 135 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:917: LOGICAL_OR
                {
                mLOGICAL_OR(); if (state.failed) return ;


                }
                break;
            case 136 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:928: LOGICAL_AND
                {
                mLOGICAL_AND(); if (state.failed) return ;


                }
                break;
            case 137 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:940: OPEN_SQ_BRACKET
                {
                mOPEN_SQ_BRACKET(); if (state.failed) return ;


                }
                break;
            case 138 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:956: CLOSE_SQ_BRACKET
                {
                mCLOSE_SQ_BRACKET(); if (state.failed) return ;


                }
                break;
            case 139 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:973: LT
                {
                mLT(); if (state.failed) return ;


                }
                break;
            case 140 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:976: PNAME_NS
                {
                mPNAME_NS(); if (state.failed) return ;


                }
                break;
            case 141 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:985: PNAME_LN
                {
                mPNAME_LN(); if (state.failed) return ;


                }
                break;
            case 142 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:994: BLANK_NODE_LABEL
                {
                mBLANK_NODE_LABEL(); if (state.failed) return ;


                }
                break;
            case 143 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:1011: VAR1
                {
                mVAR1(); if (state.failed) return ;


                }
                break;
            case 144 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:1016: VAR2
                {
                mVAR2(); if (state.failed) return ;


                }
                break;
            case 145 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:1021: LANGTAG
                {
                mLANGTAG(); if (state.failed) return ;


                }
                break;
            case 146 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:1029: INTEGER
                {
                mINTEGER(); if (state.failed) return ;


                }
                break;
            case 147 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:1037: DECIMAL
                {
                mDECIMAL(); if (state.failed) return ;


                }
                break;
            case 148 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:1045: DOUBLE
                {
                mDOUBLE(); if (state.failed) return ;


                }
                break;
            case 149 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:1052: INTEGER_POSITIVE
                {
                mINTEGER_POSITIVE(); if (state.failed) return ;


                }
                break;
            case 150 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:1069: DECIMAL_POSITIVE
                {
                mDECIMAL_POSITIVE(); if (state.failed) return ;


                }
                break;
            case 151 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:1086: DOUBLE_POSITIVE
                {
                mDOUBLE_POSITIVE(); if (state.failed) return ;


                }
                break;
            case 152 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:1102: INTEGER_NEGATIVE
                {
                mINTEGER_NEGATIVE(); if (state.failed) return ;


                }
                break;
            case 153 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:1119: DECIMAL_NEGATIVE
                {
                mDECIMAL_NEGATIVE(); if (state.failed) return ;


                }
                break;
            case 154 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:1136: DOUBLE_NEGATIVE
                {
                mDOUBLE_NEGATIVE(); if (state.failed) return ;


                }
                break;
            case 155 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:1152: STRING_LITERAL1
                {
                mSTRING_LITERAL1(); if (state.failed) return ;


                }
                break;
            case 156 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:1168: STRING_LITERAL2
                {
                mSTRING_LITERAL2(); if (state.failed) return ;


                }
                break;
            case 157 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:1184: STRING_LITERAL_LONG1
                {
                mSTRING_LITERAL_LONG1(); if (state.failed) return ;


                }
                break;
            case 158 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:1205: STRING_LITERAL_LONG2
                {
                mSTRING_LITERAL_LONG2(); if (state.failed) return ;


                }
                break;
            case 159 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:1226: ECHAR
                {
                mECHAR(); if (state.failed) return ;


                }
                break;
            case 160 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:1232: WS
                {
                mWS(); if (state.failed) return ;


                }
                break;
            case 161 :
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1:1235: COMMENT
                {
                mCOMMENT(); if (state.failed) return ;


                }
                break;

        }

    }

    // $ANTLR start synpred1_IbmSparql
    public final void synpred1_IbmSparql_fragment() throws RecognitionException {
        // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1234:11: ( ( ( '\\\\' UNICODE_ESCAPE ) |~ ( '<' | '>' | '\"' | OPEN_CURLY_BRACE | CLOSE_CURLY_BRACE | '|' | '^' | '`' | '\\\\' | ( '\\u0000' .. '\\u0020' ) ) )* '>' )
        // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1234:13: ( ( '\\\\' UNICODE_ESCAPE ) |~ ( '<' | '>' | '\"' | OPEN_CURLY_BRACE | CLOSE_CURLY_BRACE | '|' | '^' | '`' | '\\\\' | ( '\\u0000' .. '\\u0020' ) ) )* '>'
        {
        // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1234:13: ( ( '\\\\' UNICODE_ESCAPE ) |~ ( '<' | '>' | '\"' | OPEN_CURLY_BRACE | CLOSE_CURLY_BRACE | '|' | '^' | '`' | '\\\\' | ( '\\u0000' .. '\\u0020' ) ) )*
        loop42:
        do {
            int alt42=3;
            int LA42_0 = input.LA(1);

            if ( (LA42_0=='\\') ) {
                alt42=1;
            }
            else if ( (LA42_0=='!'||(LA42_0 >= '#' && LA42_0 <= ';')||LA42_0=='='||(LA42_0 >= '?' && LA42_0 <= '[')||LA42_0==']'||LA42_0=='_'||(LA42_0 >= 'a' && LA42_0 <= 'z')||(LA42_0 >= '~' && LA42_0 <= '\uFFFF')) ) {
                alt42=2;
            }


            switch (alt42) {
        	case 1 :
        	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1234:15: ( '\\\\' UNICODE_ESCAPE )
        	    {
        	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1234:15: ( '\\\\' UNICODE_ESCAPE )
        	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1234:16: '\\\\' UNICODE_ESCAPE
        	    {
        	    match('\\'); if (state.failed) return ;

        	    mUNICODE_ESCAPE(); if (state.failed) return ;


        	    }


        	    }
        	    break;
        	case 2 :
        	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparql.g:1234:39: ~ ( '<' | '>' | '\"' | OPEN_CURLY_BRACE | CLOSE_CURLY_BRACE | '|' | '^' | '`' | '\\\\' | ( '\\u0000' .. '\\u0020' ) )
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
        	    break loop42;
            }
        } while (true);


        match('>'); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred1_IbmSparql

    public final boolean synpred1_IbmSparql() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_IbmSparql_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA14 dfa14 = new DFA14(this);
    protected DFA41 dfa41 = new DFA41(this);
    static final String DFA14_eotS =
        "\5\uffff";
    static final String DFA14_eofS =
        "\5\uffff";
    static final String DFA14_minS =
        "\2\56\3\uffff";
    static final String DFA14_maxS =
        "\1\71\1\145\3\uffff";
    static final String DFA14_acceptS =
        "\2\uffff\1\2\1\1\1\3";
    static final String DFA14_specialS =
        "\5\uffff}>";
    static final String[] DFA14_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\3\1\uffff\12\1\13\uffff\1\4\37\uffff\1\4",
            "",
            "",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1288:1: DOUBLE : ( ( DIGIT )+ DOT ( DIGIT )* EXPONENT | DOT ( DIGIT )+ EXPONENT | ( DIGIT )+ EXPONENT );";
        }
    }
    static final String DFA41_eotS =
        "\1\uffff\1\130\1\uffff\1\131\1\134\2\uffff\1\140\1\141\1\144\1\145"+
        "\1\u0086\27\uffff\1\u0103\52\uffff\1\u0107\3\uffff\1\u0109\7\uffff"+
        "\1\u0110\1\u0113\1\uffff\1\u0115\1\u0118\7\uffff\1\u011a\4\uffff"+
        "\1\u011a\34\uffff\1\u012a\4\uffff\1\u012a\125\uffff\1\u01a1\1\uffff"+
        "\1\u01a8\1\uffff\1\u01a1\1\uffff\1\u01a8\1\uffff\1\u01b3\1\uffff"+
        "\1\u01b6\1\uffff\1\u01b3\1\uffff\1\u01b6\22\uffff\1\u01ca\5\uffff"+
        "\1\u01ca\1\uffff\1\u010d\1\uffff\1\u010f\2\uffff\1\u0113\2\uffff"+
        "\1\u0113\1\uffff\1\u0118\2\uffff\1\u0118\1\uffff\1\u01d1\1\u01d2"+
        "\1\u01d1\1\u01d2\2\u01d3\2\u01d4\2\u01d5\2\u01d6\26\uffff\2\u01ec"+
        "\5\uffff\1\u0205\1\uffff\1\u0205\13\uffff\1\u0212\1\uffff\1\u0212"+
        "\46\uffff\1\u023d\1\u023e\1\u023d\1\u023e\34\uffff\2\u025b\11\uffff"+
        "\2\u0264\25\uffff\2\u0277\1\u027a\2\u027b\12\uffff\1\u01ca\2\uffff"+
        "\1\u0113\1\u0118\7\uffff\2\u0286\2\u0287\37\uffff\1\u02aa\14\uffff"+
        "\2\u02b7\4\uffff\2\u02be\2\u02bf\7\uffff\2\u02c8\10\uffff\2\u02d1"+
        "\10\uffff\2\u02da\2\uffff\2\u02dd\2\u02de\32\uffff\2\u02f7\2\u02f8"+
        "\13\uffff\2\u0305\2\u0306\17\uffff\2\u0315\2\u0316\13\uffff\2\u0321"+
        "\10\uffff\2\u0328\2\u0329\30\uffff\2\u0342\34\uffff\2\u035b\3\uffff"+
        "\2\u035e\11\uffff\2\u0367\2\u0368\3\uffff\2\u036b\4\uffff\2\u036e"+
        "\2\u036f\2\u0370\2\u0371\2\u0373\2\uffff\2\u0376\2\u0377\4\uffff"+
        "\2\u037c\4\uffff\2\u037f\2\u0380\2\u0381\2\u0382\2\u0383\4\uffff"+
        "\2\u0386\2\u0387\12\uffff\2\u0390\1\u0391\1\uffff\1\u0391\16\uffff"+
        "\2\u039e\2\u039f\6\uffff\2\u03a6\2\u03a7\15\uffff\1\u03b4\1\u03b5"+
        "\1\u03b6\1\u03b7\2\uffff\2\u03ba\2\u03bb\4\uffff\2\u03c0\14\uffff"+
        "\2\u03cb\6\uffff\2\u03d0\1\uffff\2\u03d1\6\uffff\2\u03d4\2\uffff"+
        "\2\u03d5\12\uffff\2\u03da\20\uffff\2\u03e6\2\u03e7\1\u0106\5\uffff"+
        "\2\u03ea\2\u03eb\4\uffff\2\u03ee\2\uffff\2\u03f1\4\uffff\2\u03f6"+
        "\15\uffff\2\u03fd\2\uffff\2\u0400\2\u0401\22\uffff\2\u040e\6\uffff"+
        "\2\u0415\3\uffff\2\u0418\12\uffff\2\u041f\1\uffff\2\u0420\2\u0421"+
        "\2\u0422\1\uffff\2\u0423\4\uffff\2\u0426\2\u0427\2\uffff\2\u042a"+
        "\7\uffff\2\u0431\4\uffff\2\u0434\2\u0435\2\u0436\5\uffff\2\u0437"+
        "\7\uffff\2\u043c\2\u043d\21\uffff\2\u0447\1\uffff\2\u044a\6\uffff"+
        "\2\u044f\1\uffff";
    static final String DFA41_eofS =
        "\u0450\uffff";
    static final String DFA41_minS =
        "\1\11\1\75\1\uffff\2\56\2\uffff\1\75\1\60\1\136\1\55\1\174\25\55"+
        "\2\uffff\1\60\10\uffff\26\55\1\42\13\55\1\45\3\uffff\1\56\2\0\5"+
        "\uffff\1\56\1\60\1\uffff\1\56\1\60\7\uffff\14\55\1\165\22\55\2\uffff"+
        "\174\55\1\uffff\2\60\4\uffff\1\60\1\uffff\1\47\1\uffff\1\42\2\uffff"+
        "\1\60\2\uffff\1\60\1\uffff\1\60\2\uffff\1\60\1\uffff\14\55\1\60"+
        "\2\55\1\uffff\166\55\1\uffff\6\55\1\uffff\12\55\1\uffff\2\55\1\uffff"+
        "\23\55\1\uffff\2\60\2\uffff\2\60\6\uffff\1\60\24\55\1\uffff\30\55"+
        "\1\uffff\14\55\1\uffff\52\55\2\uffff\34\55\1\uffff\10\55\1\uffff"+
        "\22\55\1\uffff\2\55\2\uffff\10\55\2\60\2\uffff\42\55\1\uffff\14"+
        "\55\1\uffff\6\55\2\uffff\10\55\1\uffff\10\55\1\uffff\10\55\1\uffff"+
        "\2\55\2\uffff\30\55\2\uffff\14\55\2\uffff\16\55\2\uffff\12\55\1"+
        "\uffff\2\55\2\60\2\55\2\uffff\30\55\1\uffff\30\55\1\uffff\2\55\1"+
        "\uffff\10\55\2\uffff\2\55\1\uffff\2\55\4\uffff\1\55\1\uffff\2\55"+
        "\2\uffff\4\55\1\uffff\2\55\5\uffff\2\55\2\uffff\10\55\2\uffff\14"+
        "\55\2\uffff\6\55\2\uffff\14\55\4\uffff\2\55\2\uffff\4\55\1\uffff"+
        "\12\55\1\uffff\4\55\2\uffff\2\55\2\uffff\4\55\1\uffff\13\55\2\uffff"+
        "\2\55\2\uffff\2\55\1\uffff\2\55\1\uffff\4\55\1\uffff\6\55\1\uffff"+
        "\2\55\2\uffff\14\55\1\uffff\6\55\1\uffff\2\55\1\uffff\6\55\5\uffff"+
        "\2\55\2\uffff\2\55\1\uffff\6\55\1\uffff\2\55\4\uffff\4\55\2\uffff"+
        "\11\55\1\uffff\2\55\1\uffff\4\55\1\uffff";
    static final String DFA41_maxS =
        "\1\ufffd\1\75\1\uffff\2\71\2\uffff\1\75\1\ufffd\1\136\1\ufffd\1"+
        "\174\25\ufffd\2\uffff\1\71\10\uffff\26\ufffd\1\165\14\ufffd\3\uffff"+
        "\1\145\2\uffff\5\uffff\1\145\1\71\1\uffff\1\145\1\71\7\uffff\14"+
        "\ufffd\1\165\22\ufffd\2\uffff\174\ufffd\1\uffff\1\145\1\146\4\uffff"+
        "\1\145\1\uffff\1\47\1\uffff\1\42\2\uffff\1\145\2\uffff\1\145\1\uffff"+
        "\1\145\2\uffff\1\145\1\uffff\14\ufffd\1\146\2\ufffd\1\uffff\166"+
        "\ufffd\1\uffff\6\ufffd\1\uffff\12\ufffd\1\uffff\2\ufffd\1\uffff"+
        "\23\ufffd\1\uffff\1\146\1\145\2\uffff\2\145\6\uffff\1\146\24\ufffd"+
        "\1\uffff\30\ufffd\1\uffff\14\ufffd\1\uffff\52\ufffd\2\uffff\34\ufffd"+
        "\1\uffff\10\ufffd\1\uffff\22\ufffd\1\uffff\2\ufffd\2\uffff\10\ufffd"+
        "\2\146\2\uffff\42\ufffd\1\uffff\14\ufffd\1\uffff\6\ufffd\2\uffff"+
        "\10\ufffd\1\uffff\10\ufffd\1\uffff\10\ufffd\1\uffff\2\ufffd\2\uffff"+
        "\30\ufffd\2\uffff\14\ufffd\2\uffff\16\ufffd\2\uffff\12\ufffd\1\uffff"+
        "\2\ufffd\2\146\2\ufffd\2\uffff\30\ufffd\1\uffff\30\ufffd\1\uffff"+
        "\2\ufffd\1\uffff\10\ufffd\2\uffff\2\ufffd\1\uffff\2\ufffd\4\uffff"+
        "\1\ufffd\1\uffff\2\ufffd\2\uffff\4\ufffd\1\uffff\2\ufffd\5\uffff"+
        "\2\ufffd\2\uffff\10\ufffd\2\uffff\14\ufffd\2\uffff\6\ufffd\2\uffff"+
        "\14\ufffd\4\uffff\2\ufffd\2\uffff\4\ufffd\1\uffff\12\ufffd\1\uffff"+
        "\4\ufffd\2\uffff\2\ufffd\2\uffff\4\ufffd\1\uffff\13\ufffd\2\uffff"+
        "\2\ufffd\2\uffff\2\ufffd\1\uffff\2\ufffd\1\uffff\4\ufffd\1\uffff"+
        "\6\ufffd\1\uffff\2\ufffd\2\uffff\14\ufffd\1\uffff\6\ufffd\1\uffff"+
        "\2\ufffd\1\uffff\6\ufffd\5\uffff\2\ufffd\2\uffff\2\ufffd\1\uffff"+
        "\6\ufffd\1\uffff\2\ufffd\4\uffff\4\ufffd\2\uffff\11\ufffd\1\uffff"+
        "\2\ufffd\1\uffff\4\ufffd\1\uffff";
    static final String DFA41_acceptS =
        "\2\uffff\1\3\2\uffff\1\6\1\7\32\uffff\1\u0080\1\u0081\1\uffff\1"+
        "\u0083\1\u0084\1\u0085\1\u0086\1\u0088\1\u0089\1\u008a\1\u008b\43"+
        "\uffff\1\u008e\1\u0090\1\u0091\3\uffff\1\u00a0\1\u00a1\1\2\1\1\1"+
        "\4\2\uffff\1\5\2\uffff\1\11\1\10\1\12\1\u008f\1\14\1\13\1\15\37"+
        "\uffff\1\u0087\1\16\174\uffff\1\u0082\2\uffff\1\u009f\1\u008c\1"+
        "\u008d\1\u0092\1\uffff\1\u0094\1\uffff\1\u009b\1\uffff\1\u009c\1"+
        "\u0095\1\uffff\1\u0097\1\u0096\1\uffff\1\u0098\1\uffff\1\u009a\1"+
        "\u0099\1\uffff\1\24\17\uffff\1\34\166\uffff\1\160\6\uffff\1\143"+
        "\12\uffff\1\53\2\uffff\1\132\23\uffff\1\u0093\2\uffff\1\u009d\1"+
        "\u009e\2\uffff\1\30\1\37\1\65\1\105\1\157\1\170\25\uffff\1\74\30"+
        "\uffff\1\165\14\uffff\1\125\52\uffff\1\133\1\161\34\uffff\1\102"+
        "\10\uffff\1\101\22\uffff\1\166\2\uffff\1\134\1\167\12\uffff\1\17"+
        "\1\70\42\uffff\1\135\14\uffff\1\40\6\uffff\1\51\1\57\10\uffff\1"+
        "\104\10\uffff\1\55\10\uffff\1\106\2\uffff\1\61\1\31\30\uffff\1\45"+
        "\1\75\14\uffff\1\176\1\47\16\uffff\1\155\1\54\12\uffff\1\123\6\uffff"+
        "\1\100\1\103\30\uffff\1\145\30\uffff\1\154\2\uffff\1\110\10\uffff"+
        "\1\164\1\50\2\uffff\1\26\2\uffff\1\107\1\156\1\32\1\33\1\uffff\1"+
        "\64\2\uffff\1\126\1\36\4\uffff\1\41\2\uffff\1\114\1\44\1\72\1\62"+
        "\1\113\2\uffff\1\147\1\150\10\uffff\1\124\1\71\14\uffff\1\20\1\21"+
        "\6\uffff\1\46\1\112\14\uffff\1\136\1\137\1\140\1\141\2\uffff\1\171"+
        "\1\162\4\uffff\1\60\12\uffff\1\111\4\uffff\1\52\1\73\2\uffff\1\35"+
        "\1\42\4\uffff\1\56\13\uffff\1\163\1\174\2\uffff\1\67\1\130\2\uffff"+
        "\1\144\2\uffff\1\120\4\uffff\1\177\6\uffff\1\63\2\uffff\1\23\1\175"+
        "\14\uffff\1\151\6\uffff\1\127\2\uffff\1\43\6\uffff\1\122\1\146\1"+
        "\22\1\27\1\77\2\uffff\1\116\1\142\2\uffff\1\66\6\uffff\1\131\2\uffff"+
        "\1\173\1\117\1\121\1\25\4\uffff\1\152\1\153\11\uffff\1\76\2\uffff"+
        "\1\172\4\uffff\1\115";
    static final String DFA41_specialS =
        "\123\uffff\1\0\1\1\u03fb\uffff}>";
    static final String[] DFA41_transitionS = {
            "\2\125\2\uffff\1\125\22\uffff\1\125\1\1\1\124\1\126\1\120\1"+
            "\uffff\1\50\1\123\1\44\1\45\1\2\1\3\1\46\1\4\1\43\1\5\12\122"+
            "\1\116\1\47\1\53\1\6\1\7\1\10\1\121\1\21\1\14\1\22\1\17\1\36"+
            "\1\24\1\26\1\27\1\33\2\100\1\31\1\35\1\25\1\30\1\15\1\100\1"+
            "\20\1\16\1\34\1\32\1\40\1\23\1\100\1\37\1\100\1\51\1\102\1\52"+
            "\1\11\1\117\1\uffff\1\12\1\54\1\61\1\57\1\75\1\63\1\65\1\66"+
            "\1\72\2\101\1\70\1\74\1\64\1\67\1\55\1\101\1\60\1\56\1\73\1"+
            "\71\1\77\1\62\1\101\1\76\1\101\1\41\1\13\1\42\102\uffff\27\103"+
            "\1\uffff\37\104\1\uffff\u0208\105\160\uffff\16\106\1\uffff\u1c81"+
            "\107\14\uffff\2\110\142\uffff\u0120\111\u0a70\uffff\u03f0\112"+
            "\21\uffff\ua7ff\113\u2100\uffff\u04d0\114\40\uffff\u020e\115",
            "\1\127",
            "",
            "\1\133\1\uffff\12\132",
            "\1\136\1\uffff\12\135",
            "",
            "",
            "\1\137",
            "\12\142\7\uffff\32\142\1\uffff\1\142\2\uffff\1\142\1\uffff"+
            "\32\142\105\uffff\27\142\1\uffff\37\142\1\uffff\u0208\142\160"+
            "\uffff\16\142\1\uffff\u1c81\142\14\uffff\2\142\142\uffff\u0120"+
            "\142\u0a70\uffff\u03f0\142\21\uffff\ua7ff\142\u2100\uffff\u04d0"+
            "\142\40\uffff\u020e\142",
            "\1\143",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\1\160\1\150\1"+
            "\160\1\151\7\160\1\147\6\160\1\146\2\160\1\152\4\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\1\161\1\155\1\161\1\156\7\161\1"+
            "\154\6\161\1\153\2\161\1\157\4\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\u0085",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\1\u0087\7\160"+
            "\1\u0089\4\160\1\u008b\1\u008a\11\160\1\u0088\1\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\1\u008c\7\161\1\u008e\4\161\1\u0090"+
            "\1\u008f\11\161\1\u008d\1\161\74\uffff\1\u0081\10\uffff\27\163"+
            "\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1\uffff\u1c81"+
            "\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120\171\u0a70"+
            "\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0\174\40"+
            "\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\21\160\1\u0091"+
            "\10\160\1\uffff\1\162\2\uffff\1\176\1\uffff\21\161\1\u0092\10"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\1\u0097\3\160"+
            "\1\u0093\2\160\1\u0096\1\u0094\12\160\1\u0095\1\u0098\5\160"+
            "\1\uffff\1\162\2\uffff\1\176\1\uffff\1\u009d\3\161\1\u0099\2"+
            "\161\1\u009c\1\u009a\12\161\1\u009b\1\u009e\5\161\74\uffff\1"+
            "\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff\u0208\165\160"+
            "\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083"+
            "\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173"+
            "\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\1\u00a2\3\160"+
            "\1\u00a0\3\160\1\u009f\10\160\1\u00a1\10\160\1\uffff\1\162\2"+
            "\uffff\1\176\1\uffff\1\u00a6\3\161\1\u00a4\3\161\1\u00a3\10"+
            "\161\1\u00a5\10\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff"+
            "\37\164\1\uffff\u0208\165\160\u0082\16\166\1\uffff\u1c81\167"+
            "\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff"+
            "\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff"+
            "\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\1\u00a8\3\160"+
            "\1\u00a7\11\160\1\u00a9\13\160\1\uffff\1\162\2\uffff\1\176\1"+
            "\uffff\1\u00ab\3\161\1\u00aa\11\161\1\u00ac\13\161\74\uffff"+
            "\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff\u0208\165\160"+
            "\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083"+
            "\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173"+
            "\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\1\160\1\150\1"+
            "\160\1\151\7\160\1\147\6\160\1\146\2\160\1\152\4\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\1\161\1\155\1\161\1\156\7\161\1"+
            "\154\6\161\1\153\2\161\1\157\4\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\4\160\1\u00b0"+
            "\6\160\1\u00ae\2\160\1\u00ad\2\160\1\u00af\10\160\1\uffff\1"+
            "\162\2\uffff\1\176\1\uffff\4\161\1\u00b4\6\161\1\u00b2\2\161"+
            "\1\u00b1\2\161\1\u00b3\10\161\74\uffff\1\u0081\10\uffff\27\163"+
            "\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1\uffff\u1c81"+
            "\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120\171\u0a70"+
            "\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0\174\40"+
            "\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\7\160\1\u00b5"+
            "\1\u00b6\21\160\1\uffff\1\162\2\uffff\1\176\1\uffff\7\161\1"+
            "\u00b7\1\u00b8\21\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff"+
            "\37\164\1\uffff\u0208\165\160\u0082\16\166\1\uffff\u1c81\167"+
            "\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff"+
            "\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff"+
            "\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\1\u00bc\7\160"+
            "\1\u00ba\2\160\1\u00bb\5\160\1\u00b9\10\160\1\uffff\1\162\2"+
            "\uffff\1\176\1\uffff\1\u00c0\7\161\1\u00be\2\161\1\u00bf\5\161"+
            "\1\u00bd\10\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37"+
            "\164\1\uffff\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14"+
            "\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff"+
            "\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff"+
            "\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\1\u00c1\15\160"+
            "\1\u00c2\13\160\1\uffff\1\162\2\uffff\1\176\1\uffff\1\u00c3"+
            "\15\161\1\u00c4\13\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff"+
            "\37\164\1\uffff\u0208\165\160\u0082\16\166\1\uffff\u1c81\167"+
            "\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff"+
            "\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff"+
            "\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\21\160\1\u00c5"+
            "\10\160\1\uffff\1\162\2\uffff\1\176\1\uffff\21\161\1\u00c6\10"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\1\u00c7\15\160"+
            "\1\u00c8\13\160\1\uffff\1\162\2\uffff\1\176\1\uffff\1\u00c9"+
            "\15\161\1\u00ca\13\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff"+
            "\37\164\1\uffff\u0208\165\160\u0082\16\166\1\uffff\u1c81\167"+
            "\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff"+
            "\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff"+
            "\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\5\160\1\u00cc"+
            "\11\160\1\u00cd\1\160\1\u00cb\10\160\1\uffff\1\162\2\uffff\1"+
            "\176\1\uffff\5\161\1\u00cf\11\161\1\u00d0\1\161\1\u00ce\10\161"+
            "\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff\u0208"+
            "\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170\61\uffff"+
            "\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff"+
            "\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\1\u00d3\1\160"+
            "\1\u00d4\5\160\1\u00d1\5\160\1\u00d2\13\160\1\uffff\1\162\2"+
            "\uffff\1\176\1\uffff\1\u00d7\1\161\1\u00d8\5\161\1\u00d5\5\161"+
            "\1\u00d6\13\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37"+
            "\164\1\uffff\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14"+
            "\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff"+
            "\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff"+
            "\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\2\160\1\u00dc"+
            "\12\160\1\u00d9\3\160\1\u00db\1\u00da\1\160\1\u00dd\5\160\1"+
            "\uffff\1\162\2\uffff\1\176\1\uffff\2\161\1\u00e1\12\161\1\u00de"+
            "\3\161\1\u00e0\1\u00df\1\161\1\u00e2\5\161\74\uffff\1\u0081"+
            "\10\uffff\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082"+
            "\16\166\1\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57"+
            "\uffff\u0120\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100"+
            "\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\5\160\1\u00e5"+
            "\7\160\1\u00e3\3\160\1\u00e4\1\u00e6\7\160\1\uffff\1\162\2\uffff"+
            "\1\176\1\uffff\5\161\1\u00e9\7\161\1\u00e7\3\161\1\u00e8\1\u00ea"+
            "\7\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\10\160\1\u00ec"+
            "\5\160\1\u00eb\2\160\1\u00ee\7\160\1\u00ed\1\uffff\1\162\2\uffff"+
            "\1\176\1\uffff\10\161\1\u00f0\5\161\1\u00ef\2\161\1\u00f2\7"+
            "\161\1\u00f1\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164"+
            "\1\uffff\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff"+
            "\2\170\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0"+
            "\172\21\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e"+
            "\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\1\u00f6\2\160"+
            "\1\u00f5\4\160\1\u00f4\5\160\1\u00f3\13\160\1\uffff\1\162\2"+
            "\uffff\1\176\1\uffff\1\u00fa\2\161\1\u00f9\4\161\1\u00f8\5\161"+
            "\1\u00f7\13\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37"+
            "\164\1\uffff\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14"+
            "\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff"+
            "\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff"+
            "\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\15\160\1\u00fb"+
            "\11\160\1\u00fc\2\160\1\uffff\1\162\2\uffff\1\176\1\uffff\15"+
            "\161\1\u00fd\11\161\1\u00fe\2\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\4\160\1\u00ff"+
            "\25\160\1\uffff\1\162\2\uffff\1\176\1\uffff\4\161\1\u0100\25"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\1\u0101\31\160"+
            "\1\uffff\1\162\2\uffff\1\176\1\uffff\1\u0102\31\161\74\uffff"+
            "\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff\u0208\165\160"+
            "\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083"+
            "\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173"+
            "\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "",
            "",
            "\12\u0104",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\1\u0087\7\160"+
            "\1\u0089\4\160\1\u008b\1\u008a\11\160\1\u0088\1\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\1\u008c\7\161\1\u008e\4\161\1\u0090"+
            "\1\u008f\11\161\1\u008d\1\161\74\uffff\1\u0081\10\uffff\27\163"+
            "\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1\uffff\u1c81"+
            "\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120\171\u0a70"+
            "\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0\174\40"+
            "\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\21\160\1\u0091"+
            "\10\160\1\uffff\1\162\2\uffff\1\176\1\uffff\21\161\1\u0092\10"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\1\u0097\3\160"+
            "\1\u0093\2\160\1\u0096\1\u0094\12\160\1\u0095\1\u0098\5\160"+
            "\1\uffff\1\162\2\uffff\1\176\1\uffff\1\u009d\3\161\1\u0099\2"+
            "\161\1\u009c\1\u009a\12\161\1\u009b\1\u009e\5\161\74\uffff\1"+
            "\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff\u0208\165\160"+
            "\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083"+
            "\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173"+
            "\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\1\u00a2\3\160"+
            "\1\u00a0\3\160\1\u009f\10\160\1\u00a1\10\160\1\uffff\1\162\2"+
            "\uffff\1\176\1\uffff\1\u00a6\3\161\1\u00a4\3\161\1\u00a3\10"+
            "\161\1\u00a5\10\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff"+
            "\37\164\1\uffff\u0208\165\160\u0082\16\166\1\uffff\u1c81\167"+
            "\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff"+
            "\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff"+
            "\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\1\u00a8\3\160"+
            "\1\u00a7\11\160\1\u00a9\13\160\1\uffff\1\162\2\uffff\1\176\1"+
            "\uffff\1\u00ab\3\161\1\u00aa\11\161\1\u00ac\13\161\74\uffff"+
            "\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff\u0208\165\160"+
            "\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083"+
            "\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173"+
            "\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\4\160\1\u00b0"+
            "\6\160\1\u00ae\2\160\1\u00ad\2\160\1\u00af\10\160\1\uffff\1"+
            "\162\2\uffff\1\176\1\uffff\4\161\1\u00b4\6\161\1\u00b2\2\161"+
            "\1\u00b1\2\161\1\u00b3\10\161\74\uffff\1\u0081\10\uffff\27\163"+
            "\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1\uffff\u1c81"+
            "\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120\171\u0a70"+
            "\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0\174\40"+
            "\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\7\160\1\u00b5"+
            "\1\u00b6\21\160\1\uffff\1\162\2\uffff\1\176\1\uffff\7\161\1"+
            "\u00b7\1\u00b8\21\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff"+
            "\37\164\1\uffff\u0208\165\160\u0082\16\166\1\uffff\u1c81\167"+
            "\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff"+
            "\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff"+
            "\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\1\u00bc\7\160"+
            "\1\u00ba\2\160\1\u00bb\5\160\1\u00b9\10\160\1\uffff\1\162\2"+
            "\uffff\1\176\1\uffff\1\u00c0\7\161\1\u00be\2\161\1\u00bf\5\161"+
            "\1\u00bd\10\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37"+
            "\164\1\uffff\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14"+
            "\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff"+
            "\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff"+
            "\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\1\u00c1\15\160"+
            "\1\u00c2\13\160\1\uffff\1\162\2\uffff\1\176\1\uffff\1\u00c3"+
            "\15\161\1\u00c4\13\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff"+
            "\37\164\1\uffff\u0208\165\160\u0082\16\166\1\uffff\u1c81\167"+
            "\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff"+
            "\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff"+
            "\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\21\160\1\u00c5"+
            "\10\160\1\uffff\1\162\2\uffff\1\176\1\uffff\21\161\1\u00c6\10"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\1\u00c7\15\160"+
            "\1\u00c8\13\160\1\uffff\1\162\2\uffff\1\176\1\uffff\1\u00c9"+
            "\15\161\1\u00ca\13\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff"+
            "\37\164\1\uffff\u0208\165\160\u0082\16\166\1\uffff\u1c81\167"+
            "\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff"+
            "\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff"+
            "\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\5\160\1\u00cc"+
            "\11\160\1\u00cd\1\160\1\u00cb\10\160\1\uffff\1\162\2\uffff\1"+
            "\176\1\uffff\5\161\1\u00cf\11\161\1\u00d0\1\161\1\u00ce\10\161"+
            "\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff\u0208"+
            "\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170\61\uffff"+
            "\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff"+
            "\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\1\u00d3\1\160"+
            "\1\u00d4\5\160\1\u00d1\5\160\1\u00d2\13\160\1\uffff\1\162\2"+
            "\uffff\1\176\1\uffff\1\u00d7\1\161\1\u00d8\5\161\1\u00d5\5\161"+
            "\1\u00d6\13\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37"+
            "\164\1\uffff\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14"+
            "\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff"+
            "\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff"+
            "\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\2\160\1\u00dc"+
            "\12\160\1\u00d9\3\160\1\u00db\1\u00da\1\160\1\u00dd\5\160\1"+
            "\uffff\1\162\2\uffff\1\176\1\uffff\2\161\1\u00e1\12\161\1\u00de"+
            "\3\161\1\u00e0\1\u00df\1\161\1\u00e2\5\161\74\uffff\1\u0081"+
            "\10\uffff\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082"+
            "\16\166\1\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57"+
            "\uffff\u0120\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100"+
            "\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\5\160\1\u00e5"+
            "\7\160\1\u00e3\3\160\1\u00e4\1\u00e6\7\160\1\uffff\1\162\2\uffff"+
            "\1\176\1\uffff\5\161\1\u00e9\7\161\1\u00e7\3\161\1\u00e8\1\u00ea"+
            "\7\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\10\160\1\u00ec"+
            "\5\160\1\u00eb\2\160\1\u00ee\7\160\1\u00ed\1\uffff\1\162\2\uffff"+
            "\1\176\1\uffff\10\161\1\u00f0\5\161\1\u00ef\2\161\1\u00f2\7"+
            "\161\1\u00f1\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164"+
            "\1\uffff\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff"+
            "\2\170\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0"+
            "\172\21\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e"+
            "\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\1\u00f6\2\160"+
            "\1\u00f5\4\160\1\u00f4\5\160\1\u00f3\13\160\1\uffff\1\162\2"+
            "\uffff\1\176\1\uffff\1\u00fa\2\161\1\u00f9\4\161\1\u00f8\5\161"+
            "\1\u00f7\13\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37"+
            "\164\1\uffff\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14"+
            "\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff"+
            "\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff"+
            "\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\15\160\1\u00fb"+
            "\11\160\1\u00fc\2\160\1\uffff\1\162\2\uffff\1\176\1\uffff\15"+
            "\161\1\u00fd\11\161\1\u00fe\2\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\4\160\1\u00ff"+
            "\25\160\1\uffff\1\162\2\uffff\1\176\1\uffff\4\161\1\u0100\25"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\1\u0101\31\160"+
            "\1\uffff\1\162\2\uffff\1\176\1\uffff\1\u0102\31\161\74\uffff"+
            "\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff\u0208\165\160"+
            "\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083"+
            "\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173"+
            "\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\u0106\4\uffff\1\u0106\64\uffff\1\u0106\5\uffff\1\u0106\3"+
            "\uffff\1\u0106\7\uffff\1\u0106\3\uffff\1\u0106\1\uffff\1\u0106"+
            "\1\u0105",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\u0108\12\uffff\13\u0108\6\uffff\32\u0108\1\uffff\1\u0108"+
            "\2\uffff\1\u0108\1\uffff\32\u0108\105\uffff\27\u0108\1\uffff"+
            "\37\u0108\1\uffff\u0208\u0108\160\uffff\16\u0108\1\uffff\u1c81"+
            "\u0108\14\uffff\2\u0108\142\uffff\u0120\u0108\u0a70\uffff\u03f0"+
            "\u0108\21\uffff\ua7ff\u0108\u2100\uffff\u04d0\u0108\40\uffff"+
            "\u020e\u0108",
            "",
            "",
            "",
            "\1\u010a\1\uffff\12\122\13\uffff\1\u010b\37\uffff\1\u010b",
            "\12\u010d\1\uffff\2\u010d\1\uffff\31\u010d\1\u010c\uffd8\u010d",
            "\12\u010f\1\uffff\2\u010f\1\uffff\24\u010f\1\u010e\uffdd\u010f",
            "",
            "",
            "",
            "",
            "",
            "\1\u0111\1\uffff\12\132\13\uffff\1\u0112\37\uffff\1\u0112",
            "\12\u0114",
            "",
            "\1\u0116\1\uffff\12\135\13\uffff\1\u0117\37\uffff\1\u0117",
            "\12\u0119",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\2\160\1\u011c"+
            "\7\160\1\u011b\17\160\1\uffff\1\162\2\uffff\1\176\1\uffff\2"+
            "\161\1\u011e\7\161\1\u011d\17\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\13\160\1\u011f"+
            "\16\160\1\uffff\1\162\2\uffff\1\176\1\uffff\13\161\1\u0120\16"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\22\160\1\u0121"+
            "\7\160\1\uffff\1\162\2\uffff\1\176\1\uffff\22\161\1\u0122\7"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\3\160\1\u0123"+
            "\26\160\1\uffff\1\162\2\uffff\1\176\1\uffff\3\161\1\u0124\26"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\6\160\1\u0125"+
            "\23\160\1\uffff\1\162\2\uffff\1\176\1\uffff\6\161\1\u0126\23"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\2\160\1\u011c"+
            "\7\160\1\u011b\17\160\1\uffff\1\162\2\uffff\1\176\1\uffff\2"+
            "\161\1\u011e\7\161\1\u011d\17\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\13\160\1\u011f"+
            "\16\160\1\uffff\1\162\2\uffff\1\176\1\uffff\13\161\1\u0120\16"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\22\160\1\u0121"+
            "\7\160\1\uffff\1\162\2\uffff\1\176\1\uffff\22\161\1\u0122\7"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\3\160\1\u0123"+
            "\26\160\1\uffff\1\162\2\uffff\1\176\1\uffff\3\161\1\u0124\26"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\6\160\1\u0125"+
            "\23\160\1\uffff\1\162\2\uffff\1\176\1\uffff\6\161\1\u0126\23"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\u0127",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\7\uffff\32\160\1\uffff\1\162"+
            "\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff\27\163"+
            "\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1\uffff\u1c81"+
            "\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120\171\u0a70"+
            "\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0\174\40"+
            "\uffff\u020e\175",
            "",
            "",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\22\160\1\u0128"+
            "\7\160\1\uffff\1\162\2\uffff\1\176\1\uffff\22\161\1\u0129\7"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\15\160\1\u012b"+
            "\14\160\1\uffff\1\162\2\uffff\1\176\1\uffff\15\161\1\u012c\14"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\24\160\1\u012d"+
            "\5\160\1\uffff\1\162\2\uffff\1\176\1\uffff\24\161\1\u012e\5"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\16\160\1\u012f"+
            "\13\160\1\uffff\1\162\2\uffff\1\176\1\uffff\16\161\1\u0130\13"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\22\160\1\u0128"+
            "\7\160\1\uffff\1\162\2\uffff\1\176\1\uffff\22\161\1\u0129\7"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\15\160\1\u012b"+
            "\14\160\1\uffff\1\162\2\uffff\1\176\1\uffff\15\161\1\u012c\14"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\24\160\1\u012d"+
            "\5\160\1\uffff\1\162\2\uffff\1\176\1\uffff\24\161\1\u012e\5"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\16\160\1\u012f"+
            "\13\160\1\uffff\1\162\2\uffff\1\176\1\uffff\16\161\1\u0130\13"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\4\160\1\u0131"+
            "\25\160\1\uffff\1\162\2\uffff\1\176\1\uffff\4\161\1\u0132\25"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\4\160\1\u0131"+
            "\25\160\1\uffff\1\162\2\uffff\1\176\1\uffff\4\161\1\u0132\25"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\2\160\1\u0135"+
            "\10\160\1\u0133\3\160\1\u0136\1\160\1\u0134\10\160\1\uffff\1"+
            "\162\2\uffff\1\176\1\uffff\2\161\1\u0139\10\161\1\u0137\3\161"+
            "\1\u013a\1\161\1\u0138\10\161\74\uffff\1\u0081\10\uffff\27\163"+
            "\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1\uffff\u1c81"+
            "\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120\171\u0a70"+
            "\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0\174\40"+
            "\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\13\160\1\u013b"+
            "\16\160\1\uffff\1\162\2\uffff\1\176\1\uffff\13\161\1\u013c\16"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\21\160\1\u013d"+
            "\10\160\1\uffff\1\162\2\uffff\1\176\1\uffff\21\161\1\u013e\10"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\1\u013f\31\160"+
            "\1\uffff\1\162\2\uffff\1\176\1\uffff\1\u0140\31\161\74\uffff"+
            "\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff\u0208\165\160"+
            "\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083"+
            "\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173"+
            "\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\14\160\1\u0141"+
            "\15\160\1\uffff\1\162\2\uffff\1\176\1\uffff\14\161\1\u0142\15"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\1\160\1\u0143"+
            "\12\160\1\u0144\15\160\1\uffff\1\162\2\uffff\1\176\1\uffff\1"+
            "\161\1\u0145\12\161\1\u0146\15\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\2\160\1\u0135"+
            "\10\160\1\u0133\3\160\1\u0136\1\160\1\u0134\10\160\1\uffff\1"+
            "\162\2\uffff\1\176\1\uffff\2\161\1\u0139\10\161\1\u0137\3\161"+
            "\1\u013a\1\161\1\u0138\10\161\74\uffff\1\u0081\10\uffff\27\163"+
            "\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1\uffff\u1c81"+
            "\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120\171\u0a70"+
            "\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0\174\40"+
            "\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\13\160\1\u013b"+
            "\16\160\1\uffff\1\162\2\uffff\1\176\1\uffff\13\161\1\u013c\16"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\21\160\1\u013d"+
            "\10\160\1\uffff\1\162\2\uffff\1\176\1\uffff\21\161\1\u013e\10"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\1\u013f\31\160"+
            "\1\uffff\1\162\2\uffff\1\176\1\uffff\1\u0140\31\161\74\uffff"+
            "\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff\u0208\165\160"+
            "\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083"+
            "\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173"+
            "\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\14\160\1\u0141"+
            "\15\160\1\uffff\1\162\2\uffff\1\176\1\uffff\14\161\1\u0142\15"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\1\160\1\u0143"+
            "\12\160\1\u0144\15\160\1\uffff\1\162\2\uffff\1\176\1\uffff\1"+
            "\161\1\u0145\12\161\1\u0146\15\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\22\160\1\u0147"+
            "\7\160\1\uffff\1\162\2\uffff\1\176\1\uffff\22\161\1\u0148\7"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\5\160\1\u014b"+
            "\5\160\1\u014a\6\160\1\u0149\7\160\1\uffff\1\162\2\uffff\1\176"+
            "\1\uffff\5\161\1\u014e\5\161\1\u014d\6\161\1\u014c\7\161\74"+
            "\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff\u0208"+
            "\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170\61\uffff"+
            "\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff"+
            "\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\16\160\1\u014f"+
            "\13\160\1\uffff\1\162\2\uffff\1\176\1\uffff\16\161\1\u0150\13"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\23\160\1\u0151"+
            "\4\160\1\u0152\1\160\1\uffff\1\162\2\uffff\1\176\1\uffff\23"+
            "\161\1\u0153\4\161\1\u0154\1\161\74\uffff\1\u0081\10\uffff\27"+
            "\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1\uffff"+
            "\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120\171"+
            "\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\22\160\1\u0147"+
            "\7\160\1\uffff\1\162\2\uffff\1\176\1\uffff\22\161\1\u0148\7"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\5\160\1\u014b"+
            "\5\160\1\u014a\6\160\1\u0149\7\160\1\uffff\1\162\2\uffff\1\176"+
            "\1\uffff\5\161\1\u014e\5\161\1\u014d\6\161\1\u014c\7\161\74"+
            "\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff\u0208"+
            "\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170\61\uffff"+
            "\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff"+
            "\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\16\160\1\u014f"+
            "\13\160\1\uffff\1\162\2\uffff\1\176\1\uffff\16\161\1\u0150\13"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\23\160\1\u0151"+
            "\4\160\1\u0152\1\160\1\uffff\1\162\2\uffff\1\176\1\uffff\23"+
            "\161\1\u0153\4\161\1\u0154\1\161\74\uffff\1\u0081\10\uffff\27"+
            "\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1\uffff"+
            "\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120\171"+
            "\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\3\160\1\u0155"+
            "\2\160\1\u0156\10\160\1\u0157\12\160\1\uffff\1\162\2\uffff\1"+
            "\176\1\uffff\3\161\1\u0158\2\161\1\u0159\10\161\1\u015a\12\161"+
            "\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff\u0208"+
            "\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170\61\uffff"+
            "\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff"+
            "\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\15\160\1\u015b"+
            "\14\160\1\uffff\1\162\2\uffff\1\176\1\uffff\15\161\1\u015c\14"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\24\160\1\u015d"+
            "\5\160\1\uffff\1\162\2\uffff\1\176\1\uffff\24\161\1\u015e\5"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\3\160\1\u0155"+
            "\2\160\1\u0156\10\160\1\u0157\12\160\1\uffff\1\162\2\uffff\1"+
            "\176\1\uffff\3\161\1\u0158\2\161\1\u0159\10\161\1\u015a\12\161"+
            "\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff\u0208"+
            "\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170\61\uffff"+
            "\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff"+
            "\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\15\160\1\u015b"+
            "\14\160\1\uffff\1\162\2\uffff\1\176\1\uffff\15\161\1\u015c\14"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\24\160\1\u015d"+
            "\5\160\1\uffff\1\162\2\uffff\1\176\1\uffff\24\161\1\u015e\5"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\1\u0161\14\160"+
            "\1\u015f\1\160\1\u0160\4\160\1\u0162\5\160\1\uffff\1\162\2\uffff"+
            "\1\176\1\uffff\1\u0165\14\161\1\u0163\1\161\1\u0164\4\161\1"+
            "\u0166\5\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164"+
            "\1\uffff\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff"+
            "\2\170\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0"+
            "\172\21\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e"+
            "\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\4\160\1\u0167"+
            "\25\160\1\uffff\1\162\2\uffff\1\176\1\uffff\4\161\1\u0168\25"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\4\160\1\u0169"+
            "\25\160\1\uffff\1\162\2\uffff\1\176\1\uffff\4\161\1\u016a\25"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\10\160\1\u016b"+
            "\21\160\1\uffff\1\162\2\uffff\1\176\1\uffff\10\161\1\u016c\21"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\1\u0161\14\160"+
            "\1\u015f\1\160\1\u0160\4\160\1\u0162\5\160\1\uffff\1\162\2\uffff"+
            "\1\176\1\uffff\1\u0165\14\161\1\u0163\1\161\1\u0164\4\161\1"+
            "\u0166\5\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164"+
            "\1\uffff\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff"+
            "\2\170\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0"+
            "\172\21\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e"+
            "\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\4\160\1\u0167"+
            "\25\160\1\uffff\1\162\2\uffff\1\176\1\uffff\4\161\1\u0168\25"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\4\160\1\u0169"+
            "\25\160\1\uffff\1\162\2\uffff\1\176\1\uffff\4\161\1\u016a\25"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\10\160\1\u016b"+
            "\21\160\1\uffff\1\162\2\uffff\1\176\1\uffff\10\161\1\u016c\21"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\4\160\1\u016d"+
            "\25\160\1\uffff\1\162\2\uffff\1\176\1\uffff\4\161\1\u016e\25"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\23\160\1\u016f"+
            "\6\160\1\uffff\1\162\2\uffff\1\176\1\uffff\23\161\1\u0170\6"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\4\160\1\u016d"+
            "\25\160\1\uffff\1\162\2\uffff\1\176\1\uffff\4\161\1\u016e\25"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\23\160\1\u016f"+
            "\6\160\1\uffff\1\162\2\uffff\1\176\1\uffff\23\161\1\u0170\6"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\16\160\1\u0171"+
            "\13\160\1\uffff\1\162\2\uffff\1\176\1\uffff\16\161\1\u0172\13"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\13\160\1\u0173"+
            "\16\160\1\uffff\1\162\2\uffff\1\176\1\uffff\13\161\1\u0174\16"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\16\160\1\u0175"+
            "\13\160\1\uffff\1\162\2\uffff\1\176\1\uffff\16\161\1\u0176\13"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\13\160\1\u0177"+
            "\16\160\1\uffff\1\162\2\uffff\1\176\1\uffff\13\161\1\u0178\16"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\16\160\1\u0171"+
            "\13\160\1\uffff\1\162\2\uffff\1\176\1\uffff\16\161\1\u0172\13"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\13\160\1\u0173"+
            "\16\160\1\uffff\1\162\2\uffff\1\176\1\uffff\13\161\1\u0174\16"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\16\160\1\u0175"+
            "\13\160\1\uffff\1\162\2\uffff\1\176\1\uffff\16\161\1\u0176\13"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\13\160\1\u0177"+
            "\16\160\1\uffff\1\162\2\uffff\1\176\1\uffff\13\161\1\u0178\16"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\14\160\1\u0179"+
            "\15\160\1\uffff\1\162\2\uffff\1\176\1\uffff\14\161\1\u017a\15"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\23\160\1\u017c"+
            "\2\160\1\u017b\3\160\1\uffff\1\162\2\uffff\1\176\1\uffff\23"+
            "\161\1\u017e\2\161\1\u017d\3\161\74\uffff\1\u0081\10\uffff\27"+
            "\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1\uffff"+
            "\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120\171"+
            "\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\14\160\1\u0179"+
            "\15\160\1\uffff\1\162\2\uffff\1\176\1\uffff\14\161\1\u017a\15"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\23\160\1\u017c"+
            "\2\160\1\u017b\3\160\1\uffff\1\162\2\uffff\1\176\1\uffff\23"+
            "\161\1\u017e\2\161\1\u017d\3\161\74\uffff\1\u0081\10\uffff\27"+
            "\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1\uffff"+
            "\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120\171"+
            "\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\1\u0180\15\160"+
            "\1\u017f\13\160\1\uffff\1\162\2\uffff\1\176\1\uffff\1\u0182"+
            "\15\161\1\u0181\13\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff"+
            "\37\164\1\uffff\u0208\165\160\u0082\16\166\1\uffff\u1c81\167"+
            "\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff"+
            "\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff"+
            "\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\1\u0180\15\160"+
            "\1\u017f\13\160\1\uffff\1\162\2\uffff\1\176\1\uffff\1\u0182"+
            "\15\161\1\u0181\13\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff"+
            "\37\164\1\uffff\u0208\165\160\u0082\16\166\1\uffff\u1c81\167"+
            "\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff"+
            "\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff"+
            "\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\25\160\1\u0183"+
            "\4\160\1\uffff\1\162\2\uffff\1\176\1\uffff\25\161\1\u0184\4"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\24\160\1\u0185"+
            "\5\160\1\uffff\1\162\2\uffff\1\176\1\uffff\24\161\1\u0186\5"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\25\160\1\u0183"+
            "\4\160\1\uffff\1\162\2\uffff\1\176\1\uffff\25\161\1\u0184\4"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\24\160\1\u0185"+
            "\5\160\1\uffff\1\162\2\uffff\1\176\1\uffff\24\161\1\u0186\5"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\3\160\1\u0187"+
            "\26\160\1\uffff\1\162\2\uffff\1\176\1\uffff\3\161\1\u0188\26"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\5\160\1\u0189"+
            "\24\160\1\uffff\1\162\2\uffff\1\176\1\uffff\5\161\1\u018a\24"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\23\160\1\u018b"+
            "\6\160\1\uffff\1\162\2\uffff\1\176\1\uffff\23\161\1\u018c\6"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\3\160\1\u0187"+
            "\26\160\1\uffff\1\162\2\uffff\1\176\1\uffff\3\161\1\u0188\26"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\5\160\1\u0189"+
            "\24\160\1\uffff\1\162\2\uffff\1\176\1\uffff\5\161\1\u018a\24"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\23\160\1\u018b"+
            "\6\160\1\uffff\1\162\2\uffff\1\176\1\uffff\23\161\1\u018c\6"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\14\160\1\u018d"+
            "\15\160\1\uffff\1\162\2\uffff\1\176\1\uffff\14\161\1\u018e\15"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\1\u018f\31\160"+
            "\1\uffff\1\162\2\uffff\1\176\1\uffff\1\u0190\31\161\74\uffff"+
            "\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff\u0208\165\160"+
            "\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083"+
            "\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173"+
            "\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\15\160\1\u0191"+
            "\14\160\1\uffff\1\162\2\uffff\1\176\1\uffff\15\161\1\u0192\14"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\1\u0193\31\160"+
            "\1\uffff\1\162\2\uffff\1\176\1\uffff\1\u0194\31\161\74\uffff"+
            "\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff\u0208\165\160"+
            "\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083"+
            "\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173"+
            "\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\14\160\1\u018d"+
            "\15\160\1\uffff\1\162\2\uffff\1\176\1\uffff\14\161\1\u018e\15"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\1\u018f\31\160"+
            "\1\uffff\1\162\2\uffff\1\176\1\uffff\1\u0190\31\161\74\uffff"+
            "\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff\u0208\165\160"+
            "\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083"+
            "\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173"+
            "\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\15\160\1\u0191"+
            "\14\160\1\uffff\1\162\2\uffff\1\176\1\uffff\15\161\1\u0192\14"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\1\u0193\31\160"+
            "\1\uffff\1\162\2\uffff\1\176\1\uffff\1\u0194\31\161\74\uffff"+
            "\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff\u0208\165\160"+
            "\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083"+
            "\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173"+
            "\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\3\160\1\u0195"+
            "\4\160\1\u0196\21\160\1\uffff\1\162\2\uffff\1\176\1\uffff\3"+
            "\161\1\u0197\4\161\1\u0198\21\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\10\160\1\u0199"+
            "\21\160\1\uffff\1\162\2\uffff\1\176\1\uffff\10\161\1\u019a\21"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\10\160\1\u019b"+
            "\21\160\1\uffff\1\162\2\uffff\1\176\1\uffff\10\161\1\u019c\21"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\1\u019d\31\160"+
            "\1\uffff\1\162\2\uffff\1\176\1\uffff\1\u019e\31\161\74\uffff"+
            "\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff\u0208\165\160"+
            "\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083"+
            "\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173"+
            "\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\10\160\1\u019f"+
            "\21\160\1\uffff\1\162\2\uffff\1\176\1\uffff\10\161\1\u01a0\21"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\3\160\1\u0195"+
            "\4\160\1\u0196\21\160\1\uffff\1\162\2\uffff\1\176\1\uffff\3"+
            "\161\1\u0197\4\161\1\u0198\21\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\10\160\1\u0199"+
            "\21\160\1\uffff\1\162\2\uffff\1\176\1\uffff\10\161\1\u019a\21"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\10\160\1\u019b"+
            "\21\160\1\uffff\1\162\2\uffff\1\176\1\uffff\10\161\1\u019c\21"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\1\u019d\31\160"+
            "\1\uffff\1\162\2\uffff\1\176\1\uffff\1\u019e\31\161\74\uffff"+
            "\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff\u0208\165\160"+
            "\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083"+
            "\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173"+
            "\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\10\160\1\u019f"+
            "\21\160\1\uffff\1\162\2\uffff\1\176\1\uffff\10\161\1\u01a0\21"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\22\160\1\u01a3"+
            "\1\u01a2\6\160\1\uffff\1\162\2\uffff\1\176\1\uffff\22\161\1"+
            "\u01a5\1\u01a4\6\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff"+
            "\37\164\1\uffff\u0208\165\160\u0082\16\166\1\uffff\u1c81\167"+
            "\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff"+
            "\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff"+
            "\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\10\160\1\u01a6"+
            "\21\160\1\uffff\1\162\2\uffff\1\176\1\uffff\10\161\1\u01a7\21"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\1\160\1\u01ab"+
            "\6\160\1\u01a9\2\160\1\u01ac\1\160\1\u01ad\6\160\1\u01aa\5\160"+
            "\1\uffff\1\162\2\uffff\1\176\1\uffff\1\161\1\u01b0\6\161\1\u01ae"+
            "\2\161\1\u01b1\1\161\1\u01b2\6\161\1\u01af\5\161\74\uffff\1"+
            "\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff\u0208\165\160"+
            "\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083"+
            "\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173"+
            "\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\22\160\1\u01a3"+
            "\1\u01a2\6\160\1\uffff\1\162\2\uffff\1\176\1\uffff\22\161\1"+
            "\u01a5\1\u01a4\6\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff"+
            "\37\164\1\uffff\u0208\165\160\u0082\16\166\1\uffff\u1c81\167"+
            "\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff"+
            "\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff"+
            "\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\10\160\1\u01a6"+
            "\21\160\1\uffff\1\162\2\uffff\1\176\1\uffff\10\161\1\u01a7\21"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\1\160\1\u01ab"+
            "\6\160\1\u01a9\2\160\1\u01ac\1\160\1\u01ad\6\160\1\u01aa\5\160"+
            "\1\uffff\1\162\2\uffff\1\176\1\uffff\1\161\1\u01b0\6\161\1\u01ae"+
            "\2\161\1\u01b1\1\161\1\u01b2\6\161\1\u01af\5\161\74\uffff\1"+
            "\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff\u0208\165\160"+
            "\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083"+
            "\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173"+
            "\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\14\160\1\u01b4"+
            "\15\160\1\uffff\1\162\2\uffff\1\176\1\uffff\14\161\1\u01b5\15"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\24\160\1\u01b7"+
            "\5\160\1\uffff\1\162\2\uffff\1\176\1\uffff\24\161\1\u01b8\5"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\14\160\1\u01b4"+
            "\15\160\1\uffff\1\162\2\uffff\1\176\1\uffff\14\161\1\u01b5\15"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\24\160\1\u01b7"+
            "\5\160\1\uffff\1\162\2\uffff\1\176\1\uffff\24\161\1\u01b8\5"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\15\160\1\u01ba"+
            "\7\160\1\u01b9\4\160\1\uffff\1\162\2\uffff\1\176\1\uffff\15"+
            "\161\1\u01bc\7\161\1\u01bb\4\161\74\uffff\1\u0081\10\uffff\27"+
            "\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1\uffff"+
            "\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120\171"+
            "\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\15\160\1\u01bd"+
            "\14\160\1\uffff\1\162\2\uffff\1\176\1\uffff\15\161\1\u01be\14"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\5\u0080\1\u01bf\4\u0080\1\116\6\uffff"+
            "\32\160\1\uffff\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff"+
            "\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff\u0208\165\160"+
            "\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083"+
            "\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173"+
            "\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\27\160\1\u01c0"+
            "\2\160\1\uffff\1\162\2\uffff\1\176\1\uffff\27\161\1\u01c1\2"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\15\160\1\u01ba"+
            "\7\160\1\u01b9\4\160\1\uffff\1\162\2\uffff\1\176\1\uffff\15"+
            "\161\1\u01bc\7\161\1\u01bb\4\161\74\uffff\1\u0081\10\uffff\27"+
            "\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1\uffff"+
            "\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120\171"+
            "\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\15\160\1\u01bd"+
            "\14\160\1\uffff\1\162\2\uffff\1\176\1\uffff\15\161\1\u01be\14"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\5\u0080\1\u01bf\4\u0080\1\116\6\uffff"+
            "\32\160\1\uffff\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff"+
            "\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff\u0208\165\160"+
            "\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083"+
            "\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173"+
            "\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\27\160\1\u01c0"+
            "\2\160\1\uffff\1\162\2\uffff\1\176\1\uffff\27\161\1\u01c1\2"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\2\160\1\u01c2"+
            "\27\160\1\uffff\1\162\2\uffff\1\176\1\uffff\2\161\1\u01c3\27"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\10\160\1\u01c4"+
            "\21\160\1\uffff\1\162\2\uffff\1\176\1\uffff\10\161\1\u01c5\21"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\2\160\1\u01c2"+
            "\27\160\1\uffff\1\162\2\uffff\1\176\1\uffff\2\161\1\u01c3\27"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\10\160\1\u01c4"+
            "\21\160\1\uffff\1\162\2\uffff\1\176\1\uffff\10\161\1\u01c5\21"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\1\u01c6\31\160"+
            "\1\uffff\1\162\2\uffff\1\176\1\uffff\1\u01c7\31\161\74\uffff"+
            "\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff\u0208\165\160"+
            "\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083"+
            "\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173"+
            "\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\1\u01c6\31\160"+
            "\1\uffff\1\162\2\uffff\1\176\1\uffff\1\u01c7\31\161\74\uffff"+
            "\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff\u0208\165\160"+
            "\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083"+
            "\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173"+
            "\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\13\160\1\u01c8"+
            "\16\160\1\uffff\1\162\2\uffff\1\176\1\uffff\13\161\1\u01c9\16"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\13\160\1\u01c8"+
            "\16\160\1\uffff\1\162\2\uffff\1\176\1\uffff\13\161\1\u01c9\16"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "",
            "\12\u0104\13\uffff\1\u010b\37\uffff\1\u010b",
            "\12\u01cb\7\uffff\6\u01cb\32\uffff\6\u01cb",
            "",
            "",
            "",
            "",
            "\12\u01cc\13\uffff\1\u010b\37\uffff\1\u010b",
            "",
            "\1\u01cd",
            "",
            "\1\u01ce",
            "",
            "",
            "\12\u01cf\13\uffff\1\u0112\37\uffff\1\u0112",
            "",
            "",
            "\12\u0114\13\uffff\1\u0112\37\uffff\1\u0112",
            "",
            "\12\u01d0\13\uffff\1\u0117\37\uffff\1\u0117",
            "",
            "",
            "\12\u0119\13\uffff\1\u0117\37\uffff\1\u0117",
            "",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\12\u01d7\7\uffff\6\u01d7\32\uffff\6\u01d7",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\4\160\1\u01d8"+
            "\25\160\1\uffff\1\162\2\uffff\1\176\1\uffff\4\161\1\u01d9\25"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\4\160\1\u01d8"+
            "\25\160\1\uffff\1\162\2\uffff\1\176\1\uffff\4\161\1\u01d9\25"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\3\160\1\u01da"+
            "\26\160\1\uffff\1\162\2\uffff\1\176\1\uffff\3\161\1\u01db\26"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\3\160\1\u01da"+
            "\26\160\1\uffff\1\162\2\uffff\1\176\1\uffff\3\161\1\u01db\26"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\15\160\1\u01dc"+
            "\14\160\1\uffff\1\162\2\uffff\1\176\1\uffff\15\161\1\u01dd\14"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\15\160\1\u01dc"+
            "\14\160\1\uffff\1\162\2\uffff\1\176\1\uffff\15\161\1\u01dd\14"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\3\160\1\u01de"+
            "\26\160\1\uffff\1\162\2\uffff\1\176\1\uffff\3\161\1\u01df\26"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\3\160\1\u01de"+
            "\26\160\1\uffff\1\162\2\uffff\1\176\1\uffff\3\161\1\u01df\26"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\5\160\1\u01e0"+
            "\24\160\1\uffff\1\162\2\uffff\1\176\1\uffff\5\161\1\u01e1\24"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\5\160\1\u01e0"+
            "\24\160\1\uffff\1\162\2\uffff\1\176\1\uffff\5\161\1\u01e1\24"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\4\160\1\u01e2"+
            "\25\160\1\uffff\1\162\2\uffff\1\176\1\uffff\4\161\1\u01e3\25"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\25\160\1\u01e4"+
            "\4\160\1\uffff\1\162\2\uffff\1\176\1\uffff\25\161\1\u01e5\4"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\16\160\1\u01e6"+
            "\13\160\1\uffff\1\162\2\uffff\1\176\1\uffff\16\161\1\u01e7\13"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\1\u01e8\31\160"+
            "\1\uffff\1\162\2\uffff\1\176\1\uffff\1\u01e9\31\161\74\uffff"+
            "\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff\u0208\165\160"+
            "\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083"+
            "\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173"+
            "\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\4\160\1\u01e2"+
            "\25\160\1\uffff\1\162\2\uffff\1\176\1\uffff\4\161\1\u01e3\25"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\25\160\1\u01e4"+
            "\4\160\1\uffff\1\162\2\uffff\1\176\1\uffff\25\161\1\u01e5\4"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\16\160\1\u01e6"+
            "\13\160\1\uffff\1\162\2\uffff\1\176\1\uffff\16\161\1\u01e7\13"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\1\u01e8\31\160"+
            "\1\uffff\1\162\2\uffff\1\176\1\uffff\1\u01e9\31\161\74\uffff"+
            "\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff\u0208\165\160"+
            "\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083"+
            "\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173"+
            "\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\4\160\1\u01ea"+
            "\25\160\1\uffff\1\162\2\uffff\1\176\1\uffff\4\161\1\u01eb\25"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\4\160\1\u01ea"+
            "\25\160\1\uffff\1\162\2\uffff\1\176\1\uffff\4\161\1\u01eb\25"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\1\u01f1\1\u01f0"+
            "\1\160\1\u01f2\1\u01ef\6\160\1\u01ed\6\160\1\u01ee\1\160\1\u01f3"+
            "\5\160\1\uffff\1\162\2\uffff\1\176\1\uffff\1\u01f8\1\u01f7\1"+
            "\161\1\u01f9\1\u01f6\6\161\1\u01f4\6\161\1\u01f5\1\161\1\u01fa"+
            "\5\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\1\u01f1\1\u01f0"+
            "\1\160\1\u01f2\1\u01ef\6\160\1\u01ed\6\160\1\u01ee\1\160\1\u01f3"+
            "\5\160\1\uffff\1\162\2\uffff\1\176\1\uffff\1\u01f8\1\u01f7\1"+
            "\161\1\u01f9\1\u01f6\6\161\1\u01f4\6\161\1\u01f5\1\161\1\u01fa"+
            "\5\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\1\u0080\1\u01fb\1\u01fc\1\u01fd\1\u0080"+
            "\1\u01fe\4\u0080\1\116\6\uffff\32\160\1\uffff\1\162\2\uffff"+
            "\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff"+
            "\37\164\1\uffff\u0208\165\160\u0082\16\166\1\uffff\u1c81\167"+
            "\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff"+
            "\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff"+
            "\u020e\175",
            "\1\177\1\u0084\1\uffff\1\u0080\1\u01fb\1\u01fc\1\u01fd\1\u0080"+
            "\1\u01fe\4\u0080\1\116\6\uffff\32\160\1\uffff\1\162\2\uffff"+
            "\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff"+
            "\37\164\1\uffff\u0208\165\160\u0082\16\166\1\uffff\u1c81\167"+
            "\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff"+
            "\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff"+
            "\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\4\160\1\u01ff"+
            "\12\160\1\u0200\12\160\1\uffff\1\162\2\uffff\1\176\1\uffff\4"+
            "\161\1\u0201\12\161\1\u0202\12\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\4\160\1\u01ff"+
            "\12\160\1\u0200\12\160\1\uffff\1\162\2\uffff\1\176\1\uffff\4"+
            "\161\1\u0201\12\161\1\u0202\12\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\22\160\1\u0203"+
            "\7\160\1\uffff\1\162\2\uffff\1\176\1\uffff\22\161\1\u0204\7"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\22\160\1\u0203"+
            "\7\160\1\uffff\1\162\2\uffff\1\176\1\uffff\22\161\1\u0204\7"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\23\160\1\u0206"+
            "\6\160\1\uffff\1\162\2\uffff\1\176\1\uffff\23\161\1\u0207\6"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\23\160\1\u0206"+
            "\6\160\1\uffff\1\162\2\uffff\1\176\1\uffff\23\161\1\u0207\6"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\2\160\1\u0208"+
            "\27\160\1\uffff\1\162\2\uffff\1\176\1\uffff\2\161\1\u0209\27"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\4\160\1\u020a"+
            "\25\160\1\uffff\1\162\2\uffff\1\176\1\uffff\4\161\1\u020b\25"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\1\u020c\31\160"+
            "\1\uffff\1\162\2\uffff\1\176\1\uffff\1\u020d\31\161\74\uffff"+
            "\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff\u0208\165\160"+
            "\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083"+
            "\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173"+
            "\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\2\160\1\u0208"+
            "\27\160\1\uffff\1\162\2\uffff\1\176\1\uffff\2\161\1\u0209\27"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\4\160\1\u020a"+
            "\25\160\1\uffff\1\162\2\uffff\1\176\1\uffff\4\161\1\u020b\25"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\1\u020c\31\160"+
            "\1\uffff\1\162\2\uffff\1\176\1\uffff\1\u020d\31\161\74\uffff"+
            "\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff\u0208\165\160"+
            "\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083"+
            "\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173"+
            "\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\17\160\1\u020e"+
            "\12\160\1\uffff\1\162\2\uffff\1\176\1\uffff\17\161\1\u020f\12"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\17\160\1\u020e"+
            "\12\160\1\uffff\1\162\2\uffff\1\176\1\uffff\17\161\1\u020f\12"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\1\u0210\31\160"+
            "\1\uffff\1\162\2\uffff\1\176\1\uffff\1\u0211\31\161\74\uffff"+
            "\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff\u0208\165\160"+
            "\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083"+
            "\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173"+
            "\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\1\u0210\31\160"+
            "\1\uffff\1\162\2\uffff\1\176\1\uffff\1\u0211\31\161\74\uffff"+
            "\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff\u0208\165\160"+
            "\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083"+
            "\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173"+
            "\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\24\160\1\u0213"+
            "\5\160\1\uffff\1\162\2\uffff\1\176\1\uffff\24\161\1\u0214\5"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\4\160\1\u0215"+
            "\25\160\1\uffff\1\162\2\uffff\1\176\1\uffff\4\161\1\u0216\25"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\13\160\1\u0217"+
            "\16\160\1\uffff\1\162\2\uffff\1\176\1\uffff\13\161\1\u0218\16"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\24\160\1\u0213"+
            "\5\160\1\uffff\1\162\2\uffff\1\176\1\uffff\24\161\1\u0214\5"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\4\160\1\u0215"+
            "\25\160\1\uffff\1\162\2\uffff\1\176\1\uffff\4\161\1\u0216\25"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\13\160\1\u0217"+
            "\16\160\1\uffff\1\162\2\uffff\1\176\1\uffff\13\161\1\u0218\16"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\3\160\1\u0219"+
            "\26\160\1\uffff\1\162\2\uffff\1\176\1\uffff\3\161\1\u021a\26"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\3\160\1\u0219"+
            "\26\160\1\uffff\1\162\2\uffff\1\176\1\uffff\3\161\1\u021a\26"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\15\160\1\u021b"+
            "\14\160\1\uffff\1\162\2\uffff\1\176\1\uffff\15\161\1\u021c\14"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\15\160\1\u021b"+
            "\14\160\1\uffff\1\162\2\uffff\1\176\1\uffff\15\161\1\u021c\14"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\2\160\1\u021e"+
            "\17\160\1\u021d\1\u021f\6\160\1\uffff\1\162\2\uffff\1\176\1"+
            "\uffff\2\161\1\u0221\17\161\1\u0220\1\u0222\6\161\74\uffff\1"+
            "\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff\u0208\165\160"+
            "\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083"+
            "\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173"+
            "\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\30\160\1\u0223"+
            "\1\160\1\uffff\1\162\2\uffff\1\176\1\uffff\30\161\1\u0224\1"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\13\160\1\u0225"+
            "\16\160\1\uffff\1\162\2\uffff\1\176\1\uffff\13\161\1\u0226\16"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\15\160\1\u0227"+
            "\14\160\1\uffff\1\162\2\uffff\1\176\1\uffff\15\161\1\u0228\14"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\2\160\1\u021e"+
            "\17\160\1\u021d\1\u021f\6\160\1\uffff\1\162\2\uffff\1\176\1"+
            "\uffff\2\161\1\u0221\17\161\1\u0220\1\u0222\6\161\74\uffff\1"+
            "\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff\u0208\165\160"+
            "\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083"+
            "\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173"+
            "\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\30\160\1\u0223"+
            "\1\160\1\uffff\1\162\2\uffff\1\176\1\uffff\30\161\1\u0224\1"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\13\160\1\u0225"+
            "\16\160\1\uffff\1\162\2\uffff\1\176\1\uffff\13\161\1\u0226\16"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\15\160\1\u0227"+
            "\14\160\1\uffff\1\162\2\uffff\1\176\1\uffff\15\161\1\u0228\14"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\1\u0229\31\160"+
            "\1\uffff\1\162\2\uffff\1\176\1\uffff\1\u022a\31\161\74\uffff"+
            "\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff\u0208\165\160"+
            "\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083"+
            "\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173"+
            "\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\1\u0229\31\160"+
            "\1\uffff\1\162\2\uffff\1\176\1\uffff\1\u022a\31\161\74\uffff"+
            "\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff\u0208\165\160"+
            "\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083"+
            "\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173"+
            "\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\1\u022b\31\160"+
            "\1\uffff\1\162\2\uffff\1\176\1\uffff\1\u022c\31\161\74\uffff"+
            "\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff\u0208\165\160"+
            "\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083"+
            "\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173"+
            "\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\1\u022b\31\160"+
            "\1\uffff\1\162\2\uffff\1\176\1\uffff\1\u022c\31\161\74\uffff"+
            "\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff\u0208\165\160"+
            "\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083"+
            "\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173"+
            "\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\13\160\1\u022d"+
            "\16\160\1\uffff\1\162\2\uffff\1\176\1\uffff\13\161\1\u022e\16"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\13\160\1\u022d"+
            "\16\160\1\uffff\1\162\2\uffff\1\176\1\uffff\13\161\1\u022e\16"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\21\160\1\u022f"+
            "\10\160\1\uffff\1\162\2\uffff\1\176\1\uffff\21\161\1\u0230\10"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\21\160\1\u022f"+
            "\10\160\1\uffff\1\162\2\uffff\1\176\1\uffff\21\161\1\u0230\10"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\7\160\1\u0231"+
            "\22\160\1\uffff\1\162\2\uffff\1\176\1\uffff\7\161\1\u0232\22"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\7\160\1\u0231"+
            "\22\160\1\uffff\1\162\2\uffff\1\176\1\uffff\7\161\1\u0232\22"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\14\160\1\u0233"+
            "\15\160\1\uffff\1\162\2\uffff\1\176\1\uffff\14\161\1\u0234\15"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\14\160\1\u0233"+
            "\15\160\1\uffff\1\162\2\uffff\1\176\1\uffff\14\161\1\u0234\15"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\23\160\1\u0235"+
            "\6\160\1\uffff\1\162\2\uffff\1\176\1\uffff\23\161\1\u0236\6"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\23\160\1\u0235"+
            "\6\160\1\uffff\1\162\2\uffff\1\176\1\uffff\23\161\1\u0236\6"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\16\160\1\u0237"+
            "\13\160\1\uffff\1\162\2\uffff\1\176\1\uffff\16\161\1\u0238\13"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\16\160\1\u0237"+
            "\13\160\1\uffff\1\162\2\uffff\1\176\1\uffff\16\161\1\u0238\13"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\22\160\1\u0239"+
            "\7\160\1\uffff\1\162\2\uffff\1\176\1\uffff\22\161\1\u023a\7"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\22\160\1\u0239"+
            "\7\160\1\uffff\1\162\2\uffff\1\176\1\uffff\22\161\1\u023a\7"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\4\160\1\u023b"+
            "\25\160\1\uffff\1\162\2\uffff\1\176\1\uffff\4\161\1\u023c\25"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\4\160\1\u023b"+
            "\25\160\1\uffff\1\162\2\uffff\1\176\1\uffff\4\161\1\u023c\25"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\24\160\1\u023f"+
            "\5\160\1\uffff\1\162\2\uffff\1\176\1\uffff\24\161\1\u0240\5"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\17\160\1\u0241"+
            "\12\160\1\uffff\1\162\2\uffff\1\176\1\uffff\17\161\1\u0242\12"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\24\160\1\u023f"+
            "\5\160\1\uffff\1\162\2\uffff\1\176\1\uffff\24\161\1\u0240\5"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\17\160\1\u0241"+
            "\12\160\1\uffff\1\162\2\uffff\1\176\1\uffff\17\161\1\u0242\12"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\10\160\1\u0243"+
            "\21\160\1\uffff\1\162\2\uffff\1\176\1\uffff\10\161\1\u0244\21"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\10\160\1\u0243"+
            "\21\160\1\uffff\1\162\2\uffff\1\176\1\uffff\10\161\1\u0244\21"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\21\160\1\u0245"+
            "\10\160\1\uffff\1\162\2\uffff\1\176\1\uffff\21\161\1\u0246\10"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\21\160\1\u0245"+
            "\10\160\1\uffff\1\162\2\uffff\1\176\1\uffff\21\161\1\u0246\10"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\4\160\1\u0247"+
            "\25\160\1\uffff\1\162\2\uffff\1\176\1\uffff\4\161\1\u0248\25"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\4\160\1\u0247"+
            "\25\160\1\uffff\1\162\2\uffff\1\176\1\uffff\4\161\1\u0248\25"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\22\160\1\u0249"+
            "\7\160\1\uffff\1\162\2\uffff\1\176\1\uffff\22\161\1\u024a\7"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\22\160\1\u0249"+
            "\7\160\1\uffff\1\162\2\uffff\1\176\1\uffff\22\161\1\u024a\7"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\10\160\1\u024b"+
            "\21\160\1\uffff\1\162\2\uffff\1\176\1\uffff\10\161\1\u024c\21"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\10\160\1\u024b"+
            "\21\160\1\uffff\1\162\2\uffff\1\176\1\uffff\10\161\1\u024c\21"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\10\160\1\u024d"+
            "\21\160\1\uffff\1\162\2\uffff\1\176\1\uffff\10\161\1\u024e\21"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\10\160\1\u024d"+
            "\21\160\1\uffff\1\162\2\uffff\1\176\1\uffff\10\161\1\u024e\21"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\3\160\1\u024f"+
            "\26\160\1\uffff\1\162\2\uffff\1\176\1\uffff\3\161\1\u0250\26"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\3\160\1\u024f"+
            "\26\160\1\uffff\1\162\2\uffff\1\176\1\uffff\3\161\1\u0250\26"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\6\160\1\u0251"+
            "\23\160\1\uffff\1\162\2\uffff\1\176\1\uffff\6\161\1\u0252\23"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\6\160\1\u0251"+
            "\23\160\1\uffff\1\162\2\uffff\1\176\1\uffff\6\161\1\u0252\23"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\22\160\1\u0253"+
            "\7\160\1\uffff\1\162\2\uffff\1\176\1\uffff\22\161\1\u0254\7"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\22\160\1\u0253"+
            "\7\160\1\uffff\1\162\2\uffff\1\176\1\uffff\22\161\1\u0254\7"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\4\160\1\u0255"+
            "\25\160\1\uffff\1\162\2\uffff\1\176\1\uffff\4\161\1\u0256\25"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\16\160\1\u0257"+
            "\13\160\1\uffff\1\162\2\uffff\1\176\1\uffff\16\161\1\u0258\13"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\4\160\1\u0255"+
            "\25\160\1\uffff\1\162\2\uffff\1\176\1\uffff\4\161\1\u0256\25"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\16\160\1\u0257"+
            "\13\160\1\uffff\1\162\2\uffff\1\176\1\uffff\16\161\1\u0258\13"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\15\160\1\u0259"+
            "\14\160\1\uffff\1\162\2\uffff\1\176\1\uffff\15\161\1\u025a\14"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\15\160\1\u0259"+
            "\14\160\1\uffff\1\162\2\uffff\1\176\1\uffff\15\161\1\u025a\14"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\22\160\1\u025c"+
            "\7\160\1\uffff\1\162\2\uffff\1\176\1\uffff\22\161\1\u025d\7"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\22\160\1\u025c"+
            "\7\160\1\uffff\1\162\2\uffff\1\176\1\uffff\22\161\1\u025d\7"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\3\160\1\u025e"+
            "\26\160\1\uffff\1\162\2\uffff\1\176\1\uffff\3\161\1\u025f\26"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\3\160\1\u025e"+
            "\26\160\1\uffff\1\162\2\uffff\1\176\1\uffff\3\161\1\u025f\26"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\16\160\1\u0260"+
            "\13\160\1\uffff\1\162\2\uffff\1\176\1\uffff\16\161\1\u0261\13"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\4\160\1\u0262"+
            "\25\160\1\uffff\1\162\2\uffff\1\176\1\uffff\4\161\1\u0263\25"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\16\160\1\u0260"+
            "\13\160\1\uffff\1\162\2\uffff\1\176\1\uffff\16\161\1\u0261\13"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\4\160\1\u0262"+
            "\25\160\1\uffff\1\162\2\uffff\1\176\1\uffff\4\161\1\u0263\25"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\21\160\1\u0265"+
            "\10\160\1\uffff\1\162\2\uffff\1\176\1\uffff\21\161\1\u0266\10"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\21\160\1\u0267"+
            "\10\160\1\uffff\1\162\2\uffff\1\176\1\uffff\21\161\1\u0268\10"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\13\160\1\u0269"+
            "\16\160\1\uffff\1\162\2\uffff\1\176\1\uffff\13\161\1\u026a\16"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\10\160\1\u026b"+
            "\21\160\1\uffff\1\162\2\uffff\1\176\1\uffff\10\161\1\u026c\21"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\24\160\1\u026d"+
            "\5\160\1\uffff\1\162\2\uffff\1\176\1\uffff\24\161\1\u026e\5"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\21\160\1\u0265"+
            "\10\160\1\uffff\1\162\2\uffff\1\176\1\uffff\21\161\1\u0266\10"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\21\160\1\u0267"+
            "\10\160\1\uffff\1\162\2\uffff\1\176\1\uffff\21\161\1\u0268\10"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\13\160\1\u0269"+
            "\16\160\1\uffff\1\162\2\uffff\1\176\1\uffff\13\161\1\u026a\16"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\10\160\1\u026b"+
            "\21\160\1\uffff\1\162\2\uffff\1\176\1\uffff\10\161\1\u026c\21"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\24\160\1\u026d"+
            "\5\160\1\uffff\1\162\2\uffff\1\176\1\uffff\24\161\1\u026e\5"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\4\160\1\u026f"+
            "\25\160\1\uffff\1\162\2\uffff\1\176\1\uffff\4\161\1\u0270\25"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\4\160\1\u026f"+
            "\25\160\1\uffff\1\162\2\uffff\1\176\1\uffff\4\161\1\u0270\25"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\4\160\1\u0271"+
            "\25\160\1\uffff\1\162\2\uffff\1\176\1\uffff\4\161\1\u0272\25"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\4\160\1\u0271"+
            "\25\160\1\uffff\1\162\2\uffff\1\176\1\uffff\4\161\1\u0272\25"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\4\160\1\u0273"+
            "\25\160\1\uffff\1\162\2\uffff\1\176\1\uffff\4\161\1\u0274\25"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\23\160\1\u0275"+
            "\6\160\1\uffff\1\162\2\uffff\1\176\1\uffff\23\161\1\u0276\6"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\4\160\1\u0273"+
            "\25\160\1\uffff\1\162\2\uffff\1\176\1\uffff\4\161\1\u0274\25"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\23\160\1\u0275"+
            "\6\160\1\uffff\1\162\2\uffff\1\176\1\uffff\23\161\1\u0276\6"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\24\160\1\u0278"+
            "\5\160\1\uffff\1\162\2\uffff\1\176\1\uffff\24\161\1\u0279\5"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\24\160\1\u0278"+
            "\5\160\1\uffff\1\162\2\uffff\1\176\1\uffff\24\161\1\u0279\5"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\16\160\1\u027c"+
            "\13\160\1\uffff\1\162\2\uffff\1\176\1\uffff\16\161\1\u027d\13"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\16\160\1\u027c"+
            "\13\160\1\uffff\1\162\2\uffff\1\176\1\uffff\16\161\1\u027d\13"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\22\160\1\u027e"+
            "\7\160\1\uffff\1\162\2\uffff\1\176\1\uffff\22\161\1\u027f\7"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\22\160\1\u027e"+
            "\7\160\1\uffff\1\162\2\uffff\1\176\1\uffff\22\161\1\u027f\7"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\21\160\1\u0280"+
            "\10\160\1\uffff\1\162\2\uffff\1\176\1\uffff\21\161\1\u0281\10"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\21\160\1\u0280"+
            "\10\160\1\uffff\1\162\2\uffff\1\176\1\uffff\21\161\1\u0281\10"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\24\160\1\u0282"+
            "\5\160\1\uffff\1\162\2\uffff\1\176\1\uffff\24\161\1\u0283\5"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\24\160\1\u0282"+
            "\5\160\1\uffff\1\162\2\uffff\1\176\1\uffff\24\161\1\u0283\5"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "",
            "\12\u0284\7\uffff\6\u0284\32\uffff\6\u0284",
            "\12\u01cc\13\uffff\1\u010b\37\uffff\1\u010b",
            "",
            "",
            "\12\u01cf\13\uffff\1\u0112\37\uffff\1\u0112",
            "\12\u01d0\13\uffff\1\u0117\37\uffff\1\u0117",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\u0285\7\uffff\6\u0285\32\uffff\6\u0285",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\10\160\1\u0288"+
            "\21\160\1\uffff\1\162\2\uffff\1\176\1\uffff\10\161\1\u0289\21"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\10\160\1\u0288"+
            "\21\160\1\uffff\1\162\2\uffff\1\176\1\uffff\10\161\1\u0289\21"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\3\160\1\u028a"+
            "\26\160\1\uffff\1\162\2\uffff\1\176\1\uffff\3\161\1\u028b\26"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\3\160\1\u028a"+
            "\26\160\1\uffff\1\162\2\uffff\1\176\1\uffff\3\161\1\u028b\26"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\4\160\1\u028c"+
            "\25\160\1\uffff\1\162\2\uffff\1\176\1\uffff\4\161\1\u028d\25"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\4\160\1\u028c"+
            "\25\160\1\uffff\1\162\2\uffff\1\176\1\uffff\4\161\1\u028d\25"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\10\160\1\u028e"+
            "\21\160\1\uffff\1\162\2\uffff\1\176\1\uffff\10\161\1\u028f\21"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\10\160\1\u028e"+
            "\21\160\1\uffff\1\162\2\uffff\1\176\1\uffff\10\161\1\u028f\21"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\2\160\1\u0290"+
            "\27\160\1\uffff\1\162\2\uffff\1\176\1\uffff\2\161\1\u0291\27"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\2\160\1\u0290"+
            "\27\160\1\uffff\1\162\2\uffff\1\176\1\uffff\2\161\1\u0291\27"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\10\160\1\u0292"+
            "\21\160\1\uffff\1\162\2\uffff\1\176\1\uffff\10\161\1\u0293\21"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\10\160\1\u0292"+
            "\21\160\1\uffff\1\162\2\uffff\1\176\1\uffff\10\161\1\u0293\21"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\15\160\1\u0294"+
            "\14\160\1\uffff\1\162\2\uffff\1\176\1\uffff\15\161\1\u0295\14"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\15\160\1\u0294"+
            "\14\160\1\uffff\1\162\2\uffff\1\176\1\uffff\15\161\1\u0295\14"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\21\160\1\u0296"+
            "\10\160\1\uffff\1\162\2\uffff\1\176\1\uffff\21\161\1\u0297\10"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\21\160\1\u0296"+
            "\10\160\1\uffff\1\162\2\uffff\1\176\1\uffff\21\161\1\u0297\10"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\15\160\1\u0298"+
            "\14\160\1\uffff\1\162\2\uffff\1\176\1\uffff\15\161\1\u0299\14"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\15\160\1\u0298"+
            "\14\160\1\uffff\1\162\2\uffff\1\176\1\uffff\15\161\1\u0299\14"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\1\u029b\3\160"+
            "\1\u029a\25\160\1\uffff\1\162\2\uffff\1\176\1\uffff\1\u029d"+
            "\3\161\1\u029c\25\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff"+
            "\37\164\1\uffff\u0208\165\160\u0082\16\166\1\uffff\u1c81\167"+
            "\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff"+
            "\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff"+
            "\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\23\160\1\u029e"+
            "\6\160\1\uffff\1\162\2\uffff\1\176\1\uffff\23\161\1\u029f\6"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\15\160\1\u02a0"+
            "\14\160\1\uffff\1\162\2\uffff\1\176\1\uffff\15\161\1\u02a1\14"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\4\160\1\u02a2"+
            "\25\160\1\uffff\1\162\2\uffff\1\176\1\uffff\4\161\1\u02a3\25"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\5\160\1\u02a4"+
            "\24\160\1\uffff\1\162\2\uffff\1\176\1\uffff\5\161\1\u02a5\24"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\23\160\1\u02a6"+
            "\6\160\1\uffff\1\162\2\uffff\1\176\1\uffff\23\161\1\u02a7\6"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\24\160\1\u02a8"+
            "\5\160\1\uffff\1\162\2\uffff\1\176\1\uffff\24\161\1\u02a9\5"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\1\u029b\3\160"+
            "\1\u029a\25\160\1\uffff\1\162\2\uffff\1\176\1\uffff\1\u029d"+
            "\3\161\1\u029c\25\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff"+
            "\37\164\1\uffff\u0208\165\160\u0082\16\166\1\uffff\u1c81\167"+
            "\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff"+
            "\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff"+
            "\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\23\160\1\u029e"+
            "\6\160\1\uffff\1\162\2\uffff\1\176\1\uffff\23\161\1\u029f\6"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\15\160\1\u02a0"+
            "\14\160\1\uffff\1\162\2\uffff\1\176\1\uffff\15\161\1\u02a1\14"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\4\160\1\u02a2"+
            "\25\160\1\uffff\1\162\2\uffff\1\176\1\uffff\4\161\1\u02a3\25"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\5\160\1\u02a4"+
            "\24\160\1\uffff\1\162\2\uffff\1\176\1\uffff\5\161\1\u02a5\24"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\23\160\1\u02a6"+
            "\6\160\1\uffff\1\162\2\uffff\1\176\1\uffff\23\161\1\u02a7\6"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\24\160\1\u02a8"+
            "\5\160\1\uffff\1\162\2\uffff\1\176\1\uffff\24\161\1\u02a9\5"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\2\u0080\1\u02ab\2\u0080\1\u02ac\4\u0080"+
            "\1\116\6\uffff\32\160\1\uffff\1\162\2\uffff\1\176\1\uffff\32"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\10\u0080\1\u02ad\1\u0080\1\116\6\uffff"+
            "\32\160\1\uffff\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff"+
            "\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff\u0208\165\160"+
            "\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083"+
            "\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173"+
            "\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\1\u0080\1\u02ae\10\u0080\1\116\6\uffff"+
            "\32\160\1\uffff\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff"+
            "\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff\u0208\165\160"+
            "\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083"+
            "\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173"+
            "\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\23\160\1\u02af"+
            "\6\160\1\uffff\1\162\2\uffff\1\176\1\uffff\23\161\1\u02b0\6"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\13\160\1\u02b1"+
            "\16\160\1\uffff\1\162\2\uffff\1\176\1\uffff\13\161\1\u02b2\16"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\23\160\1\u02af"+
            "\6\160\1\uffff\1\162\2\uffff\1\176\1\uffff\23\161\1\u02b0\6"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\13\160\1\u02b1"+
            "\16\160\1\uffff\1\162\2\uffff\1\176\1\uffff\13\161\1\u02b2\16"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\23\160\1\u02b3"+
            "\6\160\1\uffff\1\162\2\uffff\1\176\1\uffff\23\161\1\u02b4\6"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\23\160\1\u02b3"+
            "\6\160\1\uffff\1\162\2\uffff\1\176\1\uffff\23\161\1\u02b4\6"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\10\160\1\u02b5"+
            "\21\160\1\uffff\1\162\2\uffff\1\176\1\uffff\10\161\1\u02b6\21"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\10\160\1\u02b5"+
            "\21\160\1\uffff\1\162\2\uffff\1\176\1\uffff\10\161\1\u02b6\21"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\21\160\1\u02b8"+
            "\10\160\1\uffff\1\162\2\uffff\1\176\1\uffff\21\161\1\u02b9\10"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\21\160\1\u02b8"+
            "\10\160\1\uffff\1\162\2\uffff\1\176\1\uffff\21\161\1\u02b9\10"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\23\160\1\u02ba"+
            "\6\160\1\uffff\1\162\2\uffff\1\176\1\uffff\23\161\1\u02bb\6"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\23\160\1\u02ba"+
            "\6\160\1\uffff\1\162\2\uffff\1\176\1\uffff\23\161\1\u02bb\6"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\24\160\1\u02bc"+
            "\5\160\1\uffff\1\162\2\uffff\1\176\1\uffff\24\161\1\u02bd\5"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\24\160\1\u02bc"+
            "\5\160\1\uffff\1\162\2\uffff\1\176\1\uffff\24\161\1\u02bd\5"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\23\160\1\u02c0"+
            "\6\160\1\uffff\1\162\2\uffff\1\176\1\uffff\23\161\1\u02c1\6"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\23\160\1\u02c0"+
            "\6\160\1\uffff\1\162\2\uffff\1\176\1\uffff\23\161\1\u02c1\6"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\2\160\1\u02c2"+
            "\27\160\1\uffff\1\162\2\uffff\1\176\1\uffff\2\161\1\u02c3\27"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\2\160\1\u02c2"+
            "\27\160\1\uffff\1\162\2\uffff\1\176\1\uffff\2\161\1\u02c3\27"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\27\160\1\u02c4"+
            "\2\160\1\uffff\1\162\2\uffff\1\176\1\uffff\27\161\1\u02c5\2"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\27\160\1\u02c4"+
            "\2\160\1\uffff\1\162\2\uffff\1\176\1\uffff\27\161\1\u02c5\2"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\1\u02c6\31\160"+
            "\1\uffff\1\162\2\uffff\1\176\1\uffff\1\u02c7\31\161\74\uffff"+
            "\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff\u0208\165\160"+
            "\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083"+
            "\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173"+
            "\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\1\u02c6\31\160"+
            "\1\uffff\1\162\2\uffff\1\176\1\uffff\1\u02c7\31\161\74\uffff"+
            "\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff\u0208\165\160"+
            "\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083"+
            "\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173"+
            "\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\3\160\1\u02c9"+
            "\26\160\1\uffff\1\162\2\uffff\1\176\1\uffff\3\161\1\u02ca\26"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\3\160\1\u02c9"+
            "\26\160\1\uffff\1\162\2\uffff\1\176\1\uffff\3\161\1\u02ca\26"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\23\160\1\u02cb"+
            "\6\160\1\uffff\1\162\2\uffff\1\176\1\uffff\23\161\1\u02cc\6"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\1\u02cd\31\160"+
            "\1\uffff\1\162\2\uffff\1\176\1\uffff\1\u02ce\31\161\74\uffff"+
            "\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff\u0208\165\160"+
            "\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083"+
            "\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173"+
            "\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\1\u02cf\31\160"+
            "\1\uffff\1\162\2\uffff\1\176\1\uffff\1\u02d0\31\161\74\uffff"+
            "\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff\u0208\165\160"+
            "\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083"+
            "\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173"+
            "\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\23\160\1\u02cb"+
            "\6\160\1\uffff\1\162\2\uffff\1\176\1\uffff\23\161\1\u02cc\6"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\1\u02cd\31\160"+
            "\1\uffff\1\162\2\uffff\1\176\1\uffff\1\u02ce\31\161\74\uffff"+
            "\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff\u0208\165\160"+
            "\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083"+
            "\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173"+
            "\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\1\u02cf\31\160"+
            "\1\uffff\1\162\2\uffff\1\176\1\uffff\1\u02d0\31\161\74\uffff"+
            "\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff\u0208\165\160"+
            "\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083"+
            "\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173"+
            "\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\4\160\1\u02d2"+
            "\25\160\1\uffff\1\162\2\uffff\1\176\1\uffff\4\161\1\u02d3\25"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\4\160\1\u02d2"+
            "\25\160\1\uffff\1\162\2\uffff\1\176\1\uffff\4\161\1\u02d3\25"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\23\160\1\u02d4"+
            "\6\160\1\uffff\1\162\2\uffff\1\176\1\uffff\23\161\1\u02d5\6"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\23\160\1\u02d4"+
            "\6\160\1\uffff\1\162\2\uffff\1\176\1\uffff\23\161\1\u02d5\6"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\21\160\1\u02d6"+
            "\10\160\1\uffff\1\162\2\uffff\1\176\1\uffff\21\161\1\u02d7\10"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\21\160\1\u02d6"+
            "\10\160\1\uffff\1\162\2\uffff\1\176\1\uffff\21\161\1\u02d7\10"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\23\160\1\u02d8"+
            "\6\160\1\uffff\1\162\2\uffff\1\176\1\uffff\23\161\1\u02d9\6"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\23\160\1\u02d8"+
            "\6\160\1\uffff\1\162\2\uffff\1\176\1\uffff\23\161\1\u02d9\6"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\4\160\1\u02db"+
            "\25\160\1\uffff\1\162\2\uffff\1\176\1\uffff\4\161\1\u02dc\25"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\4\160\1\u02db"+
            "\25\160\1\uffff\1\162\2\uffff\1\176\1\uffff\4\161\1\u02dc\25"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\4\160\1\u02df"+
            "\25\160\1\uffff\1\162\2\uffff\1\176\1\uffff\4\161\1\u02e0\25"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\4\160\1\u02df"+
            "\25\160\1\uffff\1\162\2\uffff\1\176\1\uffff\4\161\1\u02e0\25"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\21\160\1\u02e1"+
            "\10\160\1\uffff\1\162\2\uffff\1\176\1\uffff\21\161\1\u02e2\10"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\21\160\1\u02e1"+
            "\10\160\1\uffff\1\162\2\uffff\1\176\1\uffff\21\161\1\u02e2\10"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\4\160\1\u02e3"+
            "\25\160\1\uffff\1\162\2\uffff\1\176\1\uffff\4\161\1\u02e4\25"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\4\160\1\u02e3"+
            "\25\160\1\uffff\1\162\2\uffff\1\176\1\uffff\4\161\1\u02e4\25"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\3\160\1\u02e5"+
            "\26\160\1\uffff\1\162\2\uffff\1\176\1\uffff\3\161\1\u02e6\26"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\3\160\1\u02e5"+
            "\26\160\1\uffff\1\162\2\uffff\1\176\1\uffff\3\161\1\u02e6\26"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "",
            "",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\17\160\1\u02e7"+
            "\12\160\1\uffff\1\162\2\uffff\1\176\1\uffff\17\161\1\u02e8\12"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\17\160\1\u02e7"+
            "\12\160\1\uffff\1\162\2\uffff\1\176\1\uffff\17\161\1\u02e8\12"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\7\160\1\u02e9"+
            "\22\160\1\uffff\1\162\2\uffff\1\176\1\uffff\7\161\1\u02ea\22"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\7\160\1\u02e9"+
            "\22\160\1\uffff\1\162\2\uffff\1\176\1\uffff\7\161\1\u02ea\22"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\15\160\1\u02eb"+
            "\14\160\1\uffff\1\162\2\uffff\1\176\1\uffff\15\161\1\u02ec\14"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\15\160\1\u02eb"+
            "\14\160\1\uffff\1\162\2\uffff\1\176\1\uffff\15\161\1\u02ec\14"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\22\160\1\u02ed"+
            "\7\160\1\uffff\1\162\2\uffff\1\176\1\uffff\22\161\1\u02ee\7"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\22\160\1\u02ed"+
            "\7\160\1\uffff\1\162\2\uffff\1\176\1\uffff\22\161\1\u02ee\7"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\21\160\1\u02ef"+
            "\10\160\1\uffff\1\162\2\uffff\1\176\1\uffff\21\161\1\u02f0\10"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\21\160\1\u02ef"+
            "\10\160\1\uffff\1\162\2\uffff\1\176\1\uffff\21\161\1\u02f0\10"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\4\160\1\u02f1"+
            "\25\160\1\uffff\1\162\2\uffff\1\176\1\uffff\4\161\1\u02f2\25"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\4\160\1\u02f1"+
            "\25\160\1\uffff\1\162\2\uffff\1\176\1\uffff\4\161\1\u02f2\25"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\16\160\1\u02f3"+
            "\13\160\1\uffff\1\162\2\uffff\1\176\1\uffff\16\161\1\u02f4\13"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\16\160\1\u02f3"+
            "\13\160\1\uffff\1\162\2\uffff\1\176\1\uffff\16\161\1\u02f4\13"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\23\160\1\u02f5"+
            "\6\160\1\uffff\1\162\2\uffff\1\176\1\uffff\23\161\1\u02f6\6"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\23\160\1\u02f5"+
            "\6\160\1\uffff\1\162\2\uffff\1\176\1\uffff\23\161\1\u02f6\6"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\14\160\1\u02f9"+
            "\15\160\1\uffff\1\162\2\uffff\1\176\1\uffff\14\161\1\u02fa\15"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\14\160\1\u02f9"+
            "\15\160\1\uffff\1\162\2\uffff\1\176\1\uffff\14\161\1\u02fa\15"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\4\160\1\u02fb"+
            "\25\160\1\uffff\1\162\2\uffff\1\176\1\uffff\4\161\1\u02fc\25"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\4\160\1\u02fb"+
            "\25\160\1\uffff\1\162\2\uffff\1\176\1\uffff\4\161\1\u02fc\25"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\5\160\1\u02fd"+
            "\24\160\1\uffff\1\162\2\uffff\1\176\1\uffff\5\161\1\u02fe\24"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\5\160\1\u02fd"+
            "\24\160\1\uffff\1\162\2\uffff\1\176\1\uffff\5\161\1\u02fe\24"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\15\160\1\u02ff"+
            "\14\160\1\uffff\1\162\2\uffff\1\176\1\uffff\15\161\1\u0300\14"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\15\160\1\u02ff"+
            "\14\160\1\uffff\1\162\2\uffff\1\176\1\uffff\15\161\1\u0300\14"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\6\160\1\u0301"+
            "\23\160\1\uffff\1\162\2\uffff\1\176\1\uffff\6\161\1\u0302\23"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\6\160\1\u0301"+
            "\23\160\1\uffff\1\162\2\uffff\1\176\1\uffff\6\161\1\u0302\23"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\4\160\1\u0303"+
            "\25\160\1\uffff\1\162\2\uffff\1\176\1\uffff\4\161\1\u0304\25"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\4\160\1\u0303"+
            "\25\160\1\uffff\1\162\2\uffff\1\176\1\uffff\4\161\1\u0304\25"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\21\160\1\u0307"+
            "\10\160\1\uffff\1\162\2\uffff\1\176\1\uffff\21\161\1\u0308\10"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\21\160\1\u0307"+
            "\10\160\1\uffff\1\162\2\uffff\1\176\1\uffff\21\161\1\u0308\10"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\10\160\1\u0309"+
            "\21\160\1\uffff\1\162\2\uffff\1\176\1\uffff\10\161\1\u030a\21"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\10\160\1\u0309"+
            "\21\160\1\uffff\1\162\2\uffff\1\176\1\uffff\10\161\1\u030a\21"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\10\160\1\u030b"+
            "\21\160\1\uffff\1\162\2\uffff\1\176\1\uffff\10\161\1\u030c\21"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\10\160\1\u030b"+
            "\21\160\1\uffff\1\162\2\uffff\1\176\1\uffff\10\161\1\u030c\21"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\1\u030d\31\160"+
            "\1\uffff\1\162\2\uffff\1\176\1\uffff\1\u030e\31\161\74\uffff"+
            "\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff\u0208\165\160"+
            "\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083"+
            "\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173"+
            "\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\1\u030d\31\160"+
            "\1\uffff\1\162\2\uffff\1\176\1\uffff\1\u030e\31\161\74\uffff"+
            "\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff\u0208\165\160"+
            "\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083"+
            "\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173"+
            "\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\23\160\1\u030f"+
            "\6\160\1\uffff\1\162\2\uffff\1\176\1\uffff\23\161\1\u0310\6"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\23\160\1\u030f"+
            "\6\160\1\uffff\1\162\2\uffff\1\176\1\uffff\23\161\1\u0310\6"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\14\160\1\u0311"+
            "\15\160\1\uffff\1\162\2\uffff\1\176\1\uffff\14\161\1\u0312\15"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\14\160\1\u0311"+
            "\15\160\1\uffff\1\162\2\uffff\1\176\1\uffff\14\161\1\u0312\15"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\31\160\1\u0313"+
            "\1\uffff\1\162\2\uffff\1\176\1\uffff\31\161\1\u0314\74\uffff"+
            "\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff\u0208\165\160"+
            "\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083"+
            "\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173"+
            "\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\31\160\1\u0313"+
            "\1\uffff\1\162\2\uffff\1\176\1\uffff\31\161\1\u0314\74\uffff"+
            "\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff\u0208\165\160"+
            "\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083"+
            "\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173"+
            "\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\7\160\1\u0317"+
            "\22\160\1\uffff\1\162\2\uffff\1\176\1\uffff\7\161\1\u0318\22"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\7\160\1\u0317"+
            "\22\160\1\uffff\1\162\2\uffff\1\176\1\uffff\7\161\1\u0318\22"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\22\160\1\u0319"+
            "\1\u031a\6\160\1\uffff\1\162\2\uffff\1\176\1\uffff\22\161\1"+
            "\u031b\1\u031c\6\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff"+
            "\37\164\1\uffff\u0208\165\160\u0082\16\166\1\uffff\u1c81\167"+
            "\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff"+
            "\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff"+
            "\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\22\160\1\u0319"+
            "\1\u031a\6\160\1\uffff\1\162\2\uffff\1\176\1\uffff\22\161\1"+
            "\u031b\1\u031c\6\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff"+
            "\37\164\1\uffff\u0208\165\160\u0082\16\166\1\uffff\u1c81\167"+
            "\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff"+
            "\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff"+
            "\u020e\175",
            "",
            "",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\3\160\1\u031d"+
            "\26\160\1\uffff\1\162\2\uffff\1\176\1\uffff\3\161\1\u031e\26"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\3\160\1\u031d"+
            "\26\160\1\uffff\1\162\2\uffff\1\176\1\uffff\3\161\1\u031e\26"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\23\160\1\u031f"+
            "\6\160\1\uffff\1\162\2\uffff\1\176\1\uffff\23\161\1\u0320\6"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\23\160\1\u031f"+
            "\6\160\1\uffff\1\162\2\uffff\1\176\1\uffff\23\161\1\u0320\6"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\4\160\1\u0322"+
            "\25\160\1\uffff\1\162\2\uffff\1\176\1\uffff\4\161\1\u0323\25"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\4\160\1\u0322"+
            "\25\160\1\uffff\1\162\2\uffff\1\176\1\uffff\4\161\1\u0323\25"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\12\u0324\7\uffff\6\u0324\32\uffff\6\u0324",
            "\12\u0325\7\uffff\6\u0325\32\uffff\6\u0325",
            "",
            "",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\15\160\1\u0326"+
            "\14\160\1\uffff\1\162\2\uffff\1\176\1\uffff\15\161\1\u0327\14"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\15\160\1\u0326"+
            "\14\160\1\uffff\1\162\2\uffff\1\176\1\uffff\15\161\1\u0327\14"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\27\160\1\u032a"+
            "\2\160\1\uffff\1\162\2\uffff\1\176\1\uffff\27\161\1\u032b\2"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\27\160\1\u032a"+
            "\2\160\1\uffff\1\162\2\uffff\1\176\1\uffff\27\161\1\u032b\2"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\23\160\1\u032c"+
            "\6\160\1\uffff\1\162\2\uffff\1\176\1\uffff\23\161\1\u032d\6"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\23\160\1\u032c"+
            "\6\160\1\uffff\1\162\2\uffff\1\176\1\uffff\23\161\1\u032d\6"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\2\160\1\u032e"+
            "\27\160\1\uffff\1\162\2\uffff\1\176\1\uffff\2\161\1\u032f\27"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\2\160\1\u032e"+
            "\27\160\1\uffff\1\162\2\uffff\1\176\1\uffff\2\161\1\u032f\27"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\3\160\1\u0330"+
            "\26\160\1\uffff\1\162\2\uffff\1\176\1\uffff\3\161\1\u0331\26"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\3\160\1\u0330"+
            "\26\160\1\uffff\1\162\2\uffff\1\176\1\uffff\3\161\1\u0331\26"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\1\u0332\31\160"+
            "\1\uffff\1\162\2\uffff\1\176\1\uffff\1\u0333\31\161\74\uffff"+
            "\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff\u0208\165\160"+
            "\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083"+
            "\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173"+
            "\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\1\u0332\31\160"+
            "\1\uffff\1\162\2\uffff\1\176\1\uffff\1\u0333\31\161\74\uffff"+
            "\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff\u0208\165\160"+
            "\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083"+
            "\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173"+
            "\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\23\160\1\u0334"+
            "\6\160\1\uffff\1\162\2\uffff\1\176\1\uffff\23\161\1\u0335\6"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\23\160\1\u0334"+
            "\6\160\1\uffff\1\162\2\uffff\1\176\1\uffff\23\161\1\u0335\6"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\15\160\1\u0336"+
            "\14\160\1\uffff\1\162\2\uffff\1\176\1\uffff\15\161\1\u0337\14"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\15\160\1\u0338"+
            "\14\160\1\uffff\1\162\2\uffff\1\176\1\uffff\15\161\1\u0339\14"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\15\160\1\u0336"+
            "\14\160\1\uffff\1\162\2\uffff\1\176\1\uffff\15\161\1\u0337\14"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\15\160\1\u0338"+
            "\14\160\1\uffff\1\162\2\uffff\1\176\1\uffff\15\161\1\u0339\14"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\1\u033a\31\160"+
            "\1\uffff\1\162\2\uffff\1\176\1\uffff\1\u033b\31\161\74\uffff"+
            "\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff\u0208\165\160"+
            "\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083"+
            "\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173"+
            "\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\1\u033a\31\160"+
            "\1\uffff\1\162\2\uffff\1\176\1\uffff\1\u033b\31\161\74\uffff"+
            "\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff\u0208\165\160"+
            "\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083"+
            "\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173"+
            "\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\3\160\1\u033c"+
            "\26\160\1\uffff\1\162\2\uffff\1\176\1\uffff\3\161\1\u033d\26"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\3\160\1\u033c"+
            "\26\160\1\uffff\1\162\2\uffff\1\176\1\uffff\3\161\1\u033d\26"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\5\160\1\u033e"+
            "\24\160\1\uffff\1\162\2\uffff\1\176\1\uffff\5\161\1\u033f\24"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\5\160\1\u033e"+
            "\24\160\1\uffff\1\162\2\uffff\1\176\1\uffff\5\161\1\u033f\24"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\23\160\1\u0340"+
            "\6\160\1\uffff\1\162\2\uffff\1\176\1\uffff\23\161\1\u0341\6"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\23\160\1\u0340"+
            "\6\160\1\uffff\1\162\2\uffff\1\176\1\uffff\23\161\1\u0341\6"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\10\160\1\u0343"+
            "\21\160\1\uffff\1\162\2\uffff\1\176\1\uffff\10\161\1\u0344\21"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\10\160\1\u0343"+
            "\21\160\1\uffff\1\162\2\uffff\1\176\1\uffff\10\161\1\u0344\21"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "",
            "\1\177\1\u0084\1\uffff\4\u0080\1\u0345\5\u0080\1\116\6\uffff"+
            "\32\160\1\uffff\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff"+
            "\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff\u0208\165\160"+
            "\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083"+
            "\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173"+
            "\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\6\u0080\1\u0346\3\u0080\1\116\6\uffff"+
            "\32\160\1\uffff\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff"+
            "\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff\u0208\165\160"+
            "\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083"+
            "\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173"+
            "\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\4\u0080\1\u0347\5\u0080\1\116\6\uffff"+
            "\32\160\1\uffff\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff"+
            "\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff\u0208\165\160"+
            "\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083"+
            "\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173"+
            "\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\2\u0080\1\u0348\7\u0080\1\116\6\uffff"+
            "\32\160\1\uffff\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff"+
            "\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff\u0208\165\160"+
            "\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083"+
            "\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173"+
            "\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\4\160\1\u0349"+
            "\25\160\1\uffff\1\162\2\uffff\1\176\1\uffff\4\161\1\u034a\25"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\4\160\1\u0349"+
            "\25\160\1\uffff\1\162\2\uffff\1\176\1\uffff\4\161\1\u034a\25"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\4\160\1\u034b"+
            "\25\160\1\uffff\1\162\2\uffff\1\176\1\uffff\4\161\1\u034c\25"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\4\160\1\u034b"+
            "\25\160\1\uffff\1\162\2\uffff\1\176\1\uffff\4\161\1\u034c\25"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\21\160\1\u034d"+
            "\10\160\1\uffff\1\162\2\uffff\1\176\1\uffff\21\161\1\u034e\10"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\21\160\1\u034d"+
            "\10\160\1\uffff\1\162\2\uffff\1\176\1\uffff\21\161\1\u034e\10"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\15\160\1\u034f"+
            "\14\160\1\uffff\1\162\2\uffff\1\176\1\uffff\15\161\1\u0350\14"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\15\160\1\u034f"+
            "\14\160\1\uffff\1\162\2\uffff\1\176\1\uffff\15\161\1\u0350\14"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\10\160\1\u0351"+
            "\21\160\1\uffff\1\162\2\uffff\1\176\1\uffff\10\161\1\u0352\21"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\10\160\1\u0351"+
            "\21\160\1\uffff\1\162\2\uffff\1\176\1\uffff\10\161\1\u0352\21"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\4\160\1\u0353"+
            "\25\160\1\uffff\1\162\2\uffff\1\176\1\uffff\4\161\1\u0354\25"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\4\160\1\u0353"+
            "\25\160\1\uffff\1\162\2\uffff\1\176\1\uffff\4\161\1\u0354\25"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\13\160\1\u0355"+
            "\16\160\1\uffff\1\162\2\uffff\1\176\1\uffff\13\161\1\u0356\16"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\13\160\1\u0355"+
            "\16\160\1\uffff\1\162\2\uffff\1\176\1\uffff\13\161\1\u0356\16"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "",
            "",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\30\160\1\u0357"+
            "\1\160\1\uffff\1\162\2\uffff\1\176\1\uffff\30\161\1\u0358\1"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\30\160\1\u0357"+
            "\1\160\1\uffff\1\162\2\uffff\1\176\1\uffff\30\161\1\u0358\1"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\4\160\1\u0359"+
            "\25\160\1\uffff\1\162\2\uffff\1\176\1\uffff\4\161\1\u035a\25"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\4\160\1\u0359"+
            "\25\160\1\uffff\1\162\2\uffff\1\176\1\uffff\4\161\1\u035a\25"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\2\160\1\u035c"+
            "\27\160\1\uffff\1\162\2\uffff\1\176\1\uffff\2\161\1\u035d\27"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\2\160\1\u035c"+
            "\27\160\1\uffff\1\162\2\uffff\1\176\1\uffff\2\161\1\u035d\27"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\21\160\1\u035f"+
            "\10\160\1\uffff\1\162\2\uffff\1\176\1\uffff\21\161\1\u0360\10"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\21\160\1\u035f"+
            "\10\160\1\uffff\1\162\2\uffff\1\176\1\uffff\21\161\1\u0360\10"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\23\160\1\u0361"+
            "\6\160\1\uffff\1\162\2\uffff\1\176\1\uffff\23\161\1\u0362\6"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\23\160\1\u0361"+
            "\6\160\1\uffff\1\162\2\uffff\1\176\1\uffff\23\161\1\u0362\6"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\10\160\1\u0363"+
            "\21\160\1\uffff\1\162\2\uffff\1\176\1\uffff\10\161\1\u0364\21"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\10\160\1\u0363"+
            "\21\160\1\uffff\1\162\2\uffff\1\176\1\uffff\10\161\1\u0364\21"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\22\160\1\u0365"+
            "\7\160\1\uffff\1\162\2\uffff\1\176\1\uffff\22\161\1\u0366\7"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\22\160\1\u0365"+
            "\7\160\1\uffff\1\162\2\uffff\1\176\1\uffff\22\161\1\u0366\7"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\4\160\1\u0369"+
            "\25\160\1\uffff\1\162\2\uffff\1\176\1\uffff\4\161\1\u036a\25"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\4\160\1\u0369"+
            "\25\160\1\uffff\1\162\2\uffff\1\176\1\uffff\4\161\1\u036a\25"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "",
            "",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\21\160\1\u036c"+
            "\10\160\1\uffff\1\162\2\uffff\1\176\1\uffff\21\161\1\u036d\10"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\21\160\1\u036c"+
            "\10\160\1\uffff\1\162\2\uffff\1\176\1\uffff\21\161\1\u036d\10"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\u0372\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\u0372\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\6\160\1\u0374"+
            "\23\160\1\uffff\1\162\2\uffff\1\176\1\uffff\6\161\1\u0375\23"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\6\160\1\u0374"+
            "\23\160\1\uffff\1\162\2\uffff\1\176\1\uffff\6\161\1\u0375\23"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\23\160\1\u0378"+
            "\6\160\1\uffff\1\162\2\uffff\1\176\1\uffff\23\161\1\u0379\6"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\23\160\1\u0378"+
            "\6\160\1\uffff\1\162\2\uffff\1\176\1\uffff\23\161\1\u0379\6"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\15\160\1\u037a"+
            "\14\160\1\uffff\1\162\2\uffff\1\176\1\uffff\15\161\1\u037b\14"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\15\160\1\u037a"+
            "\14\160\1\uffff\1\162\2\uffff\1\176\1\uffff\15\161\1\u037b\14"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "",
            "",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\1\u037d\31\160"+
            "\1\uffff\1\162\2\uffff\1\176\1\uffff\1\u037e\31\161\74\uffff"+
            "\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff\u0208\165\160"+
            "\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083"+
            "\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173"+
            "\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\1\u037d\31\160"+
            "\1\uffff\1\162\2\uffff\1\176\1\uffff\1\u037e\31\161\74\uffff"+
            "\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff\u0208\165\160"+
            "\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083"+
            "\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173"+
            "\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "",
            "",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\23\160\1\u0384"+
            "\6\160\1\uffff\1\162\2\uffff\1\176\1\uffff\23\161\1\u0385\6"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\23\160\1\u0384"+
            "\6\160\1\uffff\1\162\2\uffff\1\176\1\uffff\23\161\1\u0385\6"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\15\160\1\u0388"+
            "\14\160\1\uffff\1\162\2\uffff\1\176\1\uffff\15\161\1\u0389\14"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\15\160\1\u0388"+
            "\14\160\1\uffff\1\162\2\uffff\1\176\1\uffff\15\161\1\u0389\14"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\4\160\1\u038a"+
            "\25\160\1\uffff\1\162\2\uffff\1\176\1\uffff\4\161\1\u038b\25"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\4\160\1\u038a"+
            "\25\160\1\uffff\1\162\2\uffff\1\176\1\uffff\4\161\1\u038b\25"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\4\160\1\u038c"+
            "\25\160\1\uffff\1\162\2\uffff\1\176\1\uffff\4\161\1\u038d\25"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\4\160\1\u038c"+
            "\25\160\1\uffff\1\162\2\uffff\1\176\1\uffff\4\161\1\u038d\25"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\16\160\1\u038e"+
            "\13\160\1\uffff\1\162\2\uffff\1\176\1\uffff\16\161\1\u038f\13"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\16\160\1\u038e"+
            "\13\160\1\uffff\1\162\2\uffff\1\176\1\uffff\16\161\1\u038f\13"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "",
            "",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\4\160\1\u0392"+
            "\25\160\1\uffff\1\162\2\uffff\1\176\1\uffff\4\161\1\u0393\25"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\4\160\1\u0392"+
            "\25\160\1\uffff\1\162\2\uffff\1\176\1\uffff\4\161\1\u0393\25"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\4\160\1\u0394"+
            "\25\160\1\uffff\1\162\2\uffff\1\176\1\uffff\4\161\1\u0395\25"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\4\160\1\u0394"+
            "\25\160\1\uffff\1\162\2\uffff\1\176\1\uffff\4\161\1\u0395\25"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\22\160\1\u0396"+
            "\7\160\1\uffff\1\162\2\uffff\1\176\1\uffff\22\161\1\u0397\7"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\22\160\1\u0396"+
            "\7\160\1\uffff\1\162\2\uffff\1\176\1\uffff\22\161\1\u0397\7"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\22\160\1\u0398"+
            "\7\160\1\uffff\1\162\2\uffff\1\176\1\uffff\22\161\1\u0399\7"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\22\160\1\u0398"+
            "\7\160\1\uffff\1\162\2\uffff\1\176\1\uffff\22\161\1\u0399\7"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\12\u039a\7\uffff\6\u039a\32\uffff\6\u039a",
            "\12\u039b\7\uffff\6\u039b\32\uffff\6\u039b",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\6\160\1\u039c"+
            "\23\160\1\uffff\1\162\2\uffff\1\176\1\uffff\6\161\1\u039d\23"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\6\160\1\u039c"+
            "\23\160\1\uffff\1\162\2\uffff\1\176\1\uffff\6\161\1\u039d\23"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "",
            "",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\4\160\1\u03a0"+
            "\25\160\1\uffff\1\162\2\uffff\1\176\1\uffff\4\161\1\u03a1\25"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\4\160\1\u03a0"+
            "\25\160\1\uffff\1\162\2\uffff\1\176\1\uffff\4\161\1\u03a1\25"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\22\160\1\u03a2"+
            "\7\160\1\uffff\1\162\2\uffff\1\176\1\uffff\22\161\1\u03a3\7"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\22\160\1\u03a2"+
            "\7\160\1\uffff\1\162\2\uffff\1\176\1\uffff\22\161\1\u03a3\7"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\23\160\1\u03a4"+
            "\6\160\1\uffff\1\162\2\uffff\1\176\1\uffff\23\161\1\u03a5\6"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\23\160\1\u03a4"+
            "\6\160\1\uffff\1\162\2\uffff\1\176\1\uffff\23\161\1\u03a5\6"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\6\160\1\u03a8"+
            "\23\160\1\uffff\1\162\2\uffff\1\176\1\uffff\6\161\1\u03a9\23"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\6\160\1\u03a8"+
            "\23\160\1\uffff\1\162\2\uffff\1\176\1\uffff\6\161\1\u03a9\23"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\21\160\1\u03aa"+
            "\10\160\1\uffff\1\162\2\uffff\1\176\1\uffff\21\161\1\u03ab\10"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\21\160\1\u03aa"+
            "\10\160\1\uffff\1\162\2\uffff\1\176\1\uffff\21\161\1\u03ab\10"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\22\160\1\u03ac"+
            "\7\160\1\uffff\1\162\2\uffff\1\176\1\uffff\22\161\1\u03ad\7"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\22\160\1\u03ac"+
            "\7\160\1\uffff\1\162\2\uffff\1\176\1\uffff\22\161\1\u03ad\7"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\16\160\1\u03ae"+
            "\13\160\1\uffff\1\162\2\uffff\1\176\1\uffff\16\161\1\u03af\13"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\16\160\1\u03ae"+
            "\13\160\1\uffff\1\162\2\uffff\1\176\1\uffff\16\161\1\u03af\13"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\4\160\1\u03b0"+
            "\25\160\1\uffff\1\162\2\uffff\1\176\1\uffff\4\161\1\u03b1\25"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\4\160\1\u03b0"+
            "\25\160\1\uffff\1\162\2\uffff\1\176\1\uffff\4\161\1\u03b1\25"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\3\160\1\u03b2"+
            "\26\160\1\uffff\1\162\2\uffff\1\176\1\uffff\3\161\1\u03b3\26"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\3\160\1\u03b2"+
            "\26\160\1\uffff\1\162\2\uffff\1\176\1\uffff\3\161\1\u03b3\26"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\21\160\1\u03b8"+
            "\10\160\1\uffff\1\162\2\uffff\1\176\1\uffff\21\161\1\u03b9\10"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\21\160\1\u03b8"+
            "\10\160\1\uffff\1\162\2\uffff\1\176\1\uffff\21\161\1\u03b9\10"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\2\160\1\u03bc"+
            "\27\160\1\uffff\1\162\2\uffff\1\176\1\uffff\2\161\1\u03bd\27"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\2\160\1\u03bc"+
            "\27\160\1\uffff\1\162\2\uffff\1\176\1\uffff\2\161\1\u03bd\27"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\1\160\1\u03be"+
            "\30\160\1\uffff\1\162\2\uffff\1\176\1\uffff\1\161\1\u03bf\30"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\1\160\1\u03be"+
            "\30\160\1\uffff\1\162\2\uffff\1\176\1\uffff\1\161\1\u03bf\30"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\23\160\1\u03c1"+
            "\6\160\1\uffff\1\162\2\uffff\1\176\1\uffff\23\161\1\u03c2\6"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\23\160\1\u03c1"+
            "\6\160\1\uffff\1\162\2\uffff\1\176\1\uffff\23\161\1\u03c2\6"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\17\160\1\u03c3"+
            "\12\160\1\uffff\1\162\2\uffff\1\176\1\uffff\17\161\1\u03c4\12"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\17\160\1\u03c3"+
            "\12\160\1\uffff\1\162\2\uffff\1\176\1\uffff\17\161\1\u03c4\12"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\3\160\1\u03c5"+
            "\26\160\1\uffff\1\162\2\uffff\1\176\1\uffff\3\161\1\u03c6\26"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\3\160\1\u03c5"+
            "\26\160\1\uffff\1\162\2\uffff\1\176\1\uffff\3\161\1\u03c6\26"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\4\160\1\u03c7"+
            "\25\160\1\uffff\1\162\2\uffff\1\176\1\uffff\4\161\1\u03c8\25"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\4\160\1\u03c7"+
            "\25\160\1\uffff\1\162\2\uffff\1\176\1\uffff\4\161\1\u03c8\25"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\24\160\1\u03c9"+
            "\5\160\1\uffff\1\162\2\uffff\1\176\1\uffff\24\161\1\u03ca\5"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\24\160\1\u03c9"+
            "\5\160\1\uffff\1\162\2\uffff\1\176\1\uffff\24\161\1\u03ca\5"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\15\160\1\u03cc"+
            "\14\160\1\uffff\1\162\2\uffff\1\176\1\uffff\15\161\1\u03cd\14"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\15\160\1\u03cc"+
            "\14\160\1\uffff\1\162\2\uffff\1\176\1\uffff\15\161\1\u03cd\14"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\2\160\1\u03ce"+
            "\27\160\1\uffff\1\162\2\uffff\1\176\1\uffff\2\161\1\u03cf\27"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\2\160\1\u03ce"+
            "\27\160\1\uffff\1\162\2\uffff\1\176\1\uffff\2\161\1\u03cf\27"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "",
            "",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "",
            "",
            "",
            "",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\2\160\1\u03d2"+
            "\27\160\1\uffff\1\162\2\uffff\1\176\1\uffff\2\161\1\u03d3\27"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "",
            "",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\1\u03d6\31\160"+
            "\1\uffff\1\162\2\uffff\1\176\1\uffff\1\u03d7\31\161\74\uffff"+
            "\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff\u0208\165\160"+
            "\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083"+
            "\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173"+
            "\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\1\u03d6\31\160"+
            "\1\uffff\1\162\2\uffff\1\176\1\uffff\1\u03d7\31\161\74\uffff"+
            "\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff\u0208\165\160"+
            "\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083"+
            "\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173"+
            "\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\23\160\1\u03d8"+
            "\6\160\1\uffff\1\162\2\uffff\1\176\1\uffff\23\161\1\u03d9\6"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\23\160\1\u03d8"+
            "\6\160\1\uffff\1\162\2\uffff\1\176\1\uffff\23\161\1\u03d9\6"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "",
            "",
            "",
            "",
            "",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "",
            "",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\12\160\1\u03db"+
            "\17\160\1\uffff\1\162\2\uffff\1\176\1\uffff\12\161\1\u03dc\17"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\12\160\1\u03db"+
            "\17\160\1\uffff\1\162\2\uffff\1\176\1\uffff\12\161\1\u03dc\17"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\21\160\1\u03dd"+
            "\10\160\1\uffff\1\162\2\uffff\1\176\1\uffff\21\161\1\u03de\10"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\21\160\1\u03dd"+
            "\10\160\1\uffff\1\162\2\uffff\1\176\1\uffff\21\161\1\u03de\10"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\21\160\1\u03df"+
            "\10\160\1\uffff\1\162\2\uffff\1\176\1\uffff\21\161\1\u03e0\10"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\21\160\1\u03df"+
            "\10\160\1\uffff\1\162\2\uffff\1\176\1\uffff\21\161\1\u03e0\10"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\15\160\1\u03e1"+
            "\14\160\1\uffff\1\162\2\uffff\1\176\1\uffff\15\161\1\u03e2\14"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\15\160\1\u03e1"+
            "\14\160\1\uffff\1\162\2\uffff\1\176\1\uffff\15\161\1\u03e2\14"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "",
            "",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\22\160\1\u03e3"+
            "\7\160\1\uffff\1\162\2\uffff\1\176\1\uffff\22\161\1\u03e4\7"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\22\160\1\u03e3"+
            "\7\160\1\uffff\1\162\2\uffff\1\176\1\uffff\22\161\1\u03e4\7"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\u03e5\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\u03e5\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\22\160\1\u03e8"+
            "\7\160\1\uffff\1\162\2\uffff\1\176\1\uffff\22\161\1\u03e9\7"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\22\160\1\u03e8"+
            "\7\160\1\uffff\1\162\2\uffff\1\176\1\uffff\22\161\1\u03e9\7"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "",
            "",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\16\160\1\u03ec"+
            "\13\160\1\uffff\1\162\2\uffff\1\176\1\uffff\16\161\1\u03ed\13"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\16\160\1\u03ec"+
            "\13\160\1\uffff\1\162\2\uffff\1\176\1\uffff\16\161\1\u03ed\13"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "",
            "",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\23\160\1\u03ef"+
            "\6\160\1\uffff\1\162\2\uffff\1\176\1\uffff\23\161\1\u03f0\6"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\23\160\1\u03ef"+
            "\6\160\1\uffff\1\162\2\uffff\1\176\1\uffff\23\161\1\u03f0\6"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\21\160\1\u03f2"+
            "\10\160\1\uffff\1\162\2\uffff\1\176\1\uffff\21\161\1\u03f3\10"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\21\160\1\u03f2"+
            "\10\160\1\uffff\1\162\2\uffff\1\176\1\uffff\21\161\1\u03f3\10"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\21\160\1\u03f4"+
            "\10\160\1\uffff\1\162\2\uffff\1\176\1\uffff\21\161\1\u03f5\10"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\21\160\1\u03f4"+
            "\10\160\1\uffff\1\162\2\uffff\1\176\1\uffff\21\161\1\u03f5\10"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "",
            "",
            "",
            "",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\14\160\1\u03f7"+
            "\15\160\1\uffff\1\162\2\uffff\1\176\1\uffff\14\161\1\u03f8\15"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\14\160\1\u03f7"+
            "\15\160\1\uffff\1\162\2\uffff\1\176\1\uffff\14\161\1\u03f8\15"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "",
            "",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\23\160\1\u03f9"+
            "\6\160\1\uffff\1\162\2\uffff\1\176\1\uffff\23\161\1\u03fa\6"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\23\160\1\u03f9"+
            "\6\160\1\uffff\1\162\2\uffff\1\176\1\uffff\23\161\1\u03fa\6"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\4\160\1\u03fb"+
            "\25\160\1\uffff\1\162\2\uffff\1\176\1\uffff\4\161\1\u03fc\25"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\4\160\1\u03fb"+
            "\25\160\1\uffff\1\162\2\uffff\1\176\1\uffff\4\161\1\u03fc\25"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\4\160\1\u03fe"+
            "\25\160\1\uffff\1\162\2\uffff\1\176\1\uffff\4\161\1\u03ff\25"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\4\160\1\u03fe"+
            "\25\160\1\uffff\1\162\2\uffff\1\176\1\uffff\4\161\1\u03ff\25"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\2\160\1\u0402"+
            "\27\160\1\uffff\1\162\2\uffff\1\176\1\uffff\2\161\1\u0403\27"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\2\160\1\u0402"+
            "\27\160\1\uffff\1\162\2\uffff\1\176\1\uffff\2\161\1\u0403\27"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\22\160\1\u0404"+
            "\7\160\1\uffff\1\162\2\uffff\1\176\1\uffff\22\161\1\u0405\7"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\22\160\1\u0404"+
            "\7\160\1\uffff\1\162\2\uffff\1\176\1\uffff\22\161\1\u0405\7"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\4\160\1\u0406"+
            "\25\160\1\uffff\1\162\2\uffff\1\176\1\uffff\4\161\1\u0407\25"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\4\160\1\u0406"+
            "\25\160\1\uffff\1\162\2\uffff\1\176\1\uffff\4\161\1\u0407\25"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "",
            "",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\16\160\1\u0408"+
            "\13\160\1\uffff\1\162\2\uffff\1\176\1\uffff\16\161\1\u0409\13"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\16\160\1\u0408"+
            "\13\160\1\uffff\1\162\2\uffff\1\176\1\uffff\16\161\1\u0409\13"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "",
            "",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\13\160\1\u040a"+
            "\16\160\1\uffff\1\162\2\uffff\1\176\1\uffff\13\161\1\u040b\16"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\13\160\1\u040a"+
            "\16\160\1\uffff\1\162\2\uffff\1\176\1\uffff\13\161\1\u040b\16"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\2\160\1\u040c"+
            "\27\160\1\uffff\1\162\2\uffff\1\176\1\uffff\2\161\1\u040d\27"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\2\160\1\u040c"+
            "\27\160\1\uffff\1\162\2\uffff\1\176\1\uffff\2\161\1\u040d\27"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\1\u040f\31\160"+
            "\1\uffff\1\162\2\uffff\1\176\1\uffff\1\u0410\31\161\74\uffff"+
            "\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff\u0208\165\160"+
            "\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083"+
            "\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173"+
            "\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\1\u040f\31\160"+
            "\1\uffff\1\162\2\uffff\1\176\1\uffff\1\u0410\31\161\74\uffff"+
            "\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff\u0208\165\160"+
            "\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083"+
            "\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173"+
            "\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\10\160\1\u0411"+
            "\21\160\1\uffff\1\162\2\uffff\1\176\1\uffff\10\161\1\u0412\21"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\10\160\1\u0411"+
            "\21\160\1\uffff\1\162\2\uffff\1\176\1\uffff\10\161\1\u0412\21"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\4\160\1\u0413"+
            "\25\160\1\uffff\1\162\2\uffff\1\176\1\uffff\4\161\1\u0414\25"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\4\160\1\u0413"+
            "\25\160\1\uffff\1\162\2\uffff\1\176\1\uffff\4\161\1\u0414\25"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\5\160\1\u0416"+
            "\24\160\1\uffff\1\162\2\uffff\1\176\1\uffff\5\161\1\u0417\24"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "",
            "",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "",
            "",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\21\160\1\u0419"+
            "\10\160\1\uffff\1\162\2\uffff\1\176\1\uffff\21\161\1\u041a\10"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\21\160\1\u0419"+
            "\10\160\1\uffff\1\162\2\uffff\1\176\1\uffff\21\161\1\u041a\10"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\22\160\1\u041b"+
            "\7\160\1\uffff\1\162\2\uffff\1\176\1\uffff\22\161\1\u041c\7"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\22\160\1\u041b"+
            "\7\160\1\uffff\1\162\2\uffff\1\176\1\uffff\22\161\1\u041c\7"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\4\160\1\u041d"+
            "\25\160\1\uffff\1\162\2\uffff\1\176\1\uffff\4\161\1\u041e\25"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\4\160\1\u041d"+
            "\25\160\1\uffff\1\162\2\uffff\1\176\1\uffff\4\161\1\u041e\25"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "",
            "",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\23\160\1\u0424"+
            "\6\160\1\uffff\1\162\2\uffff\1\176\1\uffff\23\161\1\u0425\6"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\23\160\1\u0424"+
            "\6\160\1\uffff\1\162\2\uffff\1\176\1\uffff\23\161\1\u0425\6"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\15\160\1\u0428"+
            "\14\160\1\uffff\1\162\2\uffff\1\176\1\uffff\15\161\1\u0429\14"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\15\160\1\u0428"+
            "\14\160\1\uffff\1\162\2\uffff\1\176\1\uffff\15\161\1\u0429\14"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\7\160\1\u042b"+
            "\22\160\1\uffff\1\162\2\uffff\1\176\1\uffff\7\161\1\u042c\22"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\7\160\1\u042b"+
            "\22\160\1\uffff\1\162\2\uffff\1\176\1\uffff\7\161\1\u042c\22"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\13\160\1\u042d"+
            "\16\160\1\uffff\1\162\2\uffff\1\176\1\uffff\13\161\1\u042e\16"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\13\160\1\u042d"+
            "\16\160\1\uffff\1\162\2\uffff\1\176\1\uffff\13\161\1\u042e\16"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\2\160\1\u042f"+
            "\27\160\1\uffff\1\162\2\uffff\1\176\1\uffff\2\161\1\u0430\27"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\2\160\1\u042f"+
            "\27\160\1\uffff\1\162\2\uffff\1\176\1\uffff\2\161\1\u0430\27"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\16\160\1\u0432"+
            "\13\160\1\uffff\1\162\2\uffff\1\176\1\uffff\16\161\1\u0433\13"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\16\160\1\u0432"+
            "\13\160\1\uffff\1\162\2\uffff\1\176\1\uffff\16\161\1\u0433\13"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "",
            "",
            "",
            "",
            "",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "",
            "",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\2\160\1\u0438"+
            "\27\160\1\uffff\1\162\2\uffff\1\176\1\uffff\2\161\1\u0439\27"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\2\160\1\u0438"+
            "\27\160\1\uffff\1\162\2\uffff\1\176\1\uffff\2\161\1\u0439\27"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\4\160\1\u043a"+
            "\25\160\1\uffff\1\162\2\uffff\1\176\1\uffff\4\161\1\u043b\25"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\4\160\1\u043a"+
            "\25\160\1\uffff\1\162\2\uffff\1\176\1\uffff\4\161\1\u043b\25"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\21\160\1\u043e"+
            "\10\160\1\uffff\1\162\2\uffff\1\176\1\uffff\21\161\1\u043f\10"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\21\160\1\u043e"+
            "\10\160\1\uffff\1\162\2\uffff\1\176\1\uffff\21\161\1\u043f\10"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "",
            "",
            "",
            "",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\1\u0440\31\160"+
            "\1\uffff\1\162\2\uffff\1\176\1\uffff\1\u0441\31\161\74\uffff"+
            "\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff\u0208\165\160"+
            "\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083"+
            "\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173"+
            "\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\1\u0440\31\160"+
            "\1\uffff\1\162\2\uffff\1\176\1\uffff\1\u0441\31\161\74\uffff"+
            "\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff\u0208\165\160"+
            "\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083"+
            "\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173"+
            "\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\22\160\1\u0442"+
            "\7\160\1\uffff\1\162\2\uffff\1\176\1\uffff\22\161\1\u0443\7"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\22\160\1\u0442"+
            "\7\160\1\uffff\1\162\2\uffff\1\176\1\uffff\22\161\1\u0443\7"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "",
            "",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\u0444\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\u0444\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\23\160\1\u0445"+
            "\6\160\1\uffff\1\162\2\uffff\1\176\1\uffff\23\161\1\u0446\6"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\23\160\1\u0445"+
            "\6\160\1\uffff\1\162\2\uffff\1\176\1\uffff\23\161\1\u0446\6"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\24\160\1\u0448"+
            "\5\160\1\uffff\1\162\2\uffff\1\176\1\uffff\24\161\1\u0449\5"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\21\160\1\u044b"+
            "\10\160\1\uffff\1\162\2\uffff\1\176\1\uffff\21\161\1\u044c\10"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\21\160\1\u044b"+
            "\10\160\1\uffff\1\162\2\uffff\1\176\1\uffff\21\161\1\u044c\10"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\10\160\1\u044d"+
            "\21\160\1\uffff\1\162\2\uffff\1\176\1\uffff\10\161\1\u044e\21"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\10\160\1\u044d"+
            "\21\160\1\uffff\1\162\2\uffff\1\176\1\uffff\10\161\1\u044e\21"+
            "\161\74\uffff\1\u0081\10\uffff\27\163\1\uffff\37\164\1\uffff"+
            "\u0208\165\160\u0082\16\166\1\uffff\u1c81\167\14\uffff\2\170"+
            "\61\uffff\2\u0083\57\uffff\u0120\171\u0a70\uffff\u03f0\172\21"+
            "\uffff\ua7ff\173\u2100\uffff\u04d0\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            "\1\177\1\u0084\1\uffff\12\u0080\1\116\6\uffff\32\160\1\uffff"+
            "\1\162\2\uffff\1\176\1\uffff\32\161\74\uffff\1\u0081\10\uffff"+
            "\27\163\1\uffff\37\164\1\uffff\u0208\165\160\u0082\16\166\1"+
            "\uffff\u1c81\167\14\uffff\2\170\61\uffff\2\u0083\57\uffff\u0120"+
            "\171\u0a70\uffff\u03f0\172\21\uffff\ua7ff\173\u2100\uffff\u04d0"+
            "\174\40\uffff\u020e\175",
            ""
    };

    static final short[] DFA41_eot = DFA.unpackEncodedString(DFA41_eotS);
    static final short[] DFA41_eof = DFA.unpackEncodedString(DFA41_eofS);
    static final char[] DFA41_min = DFA.unpackEncodedStringToUnsignedChars(DFA41_minS);
    static final char[] DFA41_max = DFA.unpackEncodedStringToUnsignedChars(DFA41_maxS);
    static final short[] DFA41_accept = DFA.unpackEncodedString(DFA41_acceptS);
    static final short[] DFA41_special = DFA.unpackEncodedString(DFA41_specialS);
    static final short[][] DFA41_transition;

    static {
        int numStates = DFA41_transitionS.length;
        DFA41_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA41_transition[i] = DFA.unpackEncodedString(DFA41_transitionS[i]);
        }
    }

    class DFA41 extends DFA {

        public DFA41(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 41;
            this.eot = DFA41_eot;
            this.eof = DFA41_eof;
            this.min = DFA41_min;
            this.max = DFA41_max;
            this.accept = DFA41_accept;
            this.special = DFA41_special;
            this.transition = DFA41_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__251 | T__252 | T__253 | T__254 | T__255 | T__256 | T__257 | T__258 | T__259 | T__260 | T__261 | T__262 | T__263 | T__264 | BASE | PREFIX | SELECT | DISTINCT | REDUCED | AS | CONSTRUCT | WHERE_TOKEN | DESCRIBE | ASK | FROM | NAMED | GROUP | BY | HAVING | ORDER | ASC | DESC | LIMIT | OFFSET | BINDINGS | UNDEF | LOAD | SILENT | INTO | CLEAR | DROP | CREATE | TO | MOVE | COPY | INSERT | DATA | DELETE | WITH | USING | DEFAULT | GRAPH | ALL | OPTIONAL | SERVICE | BIND | MINUS | UNION | FILTER | STR | LANG | LANGMATCHES | DATATYPE | BOUND | IRI | URI | BNODE | RAND | ABS | CEIL | FLOOR | ROUND | CONCAT | STRLEN | UCASE | LCASE | ENCODE_FOR_URI | CONTAINS | STRSTARTS | STRENDS | STRBEFORE | STRAFTER | YEAR | MONTH | DAY | HOURS | MINUTES | SECONDS | TIMEZONE | TZ | NOW | MD5 | SHA1 | SHA224 | SHA256 | SHA384 | SHA512 | COALESCE | IF | STRLANG | STRDT | SAMETERM | ISIRI | ISURI | ISBLANK | ISLITERAL | ISNUMERIC | REGEX | TRUE | FALSE | ADD | IN | NOT | SUBSTR | EXISTS | COUNT | SUM | MIN | MAX | AVG | SAMPLE | GROUP_CONCAT | SEPARATOR | VALUES | REPLACE | UUID | STRUUID | OPEN_CURLY_BRACE | CLOSE_CURLY_BRACE | DOT | OPEN_BRACE | CLOSE_BRACE | COMMA | SEMICOLON | LOGICAL_OR | LOGICAL_AND | OPEN_SQ_BRACKET | CLOSE_SQ_BRACKET | LT | PNAME_NS | PNAME_LN | BLANK_NODE_LABEL | VAR1 | VAR2 | LANGTAG | INTEGER | DECIMAL | DOUBLE | INTEGER_POSITIVE | DECIMAL_POSITIVE | DOUBLE_POSITIVE | INTEGER_NEGATIVE | DECIMAL_NEGATIVE | DOUBLE_NEGATIVE | STRING_LITERAL1 | STRING_LITERAL2 | STRING_LITERAL_LONG1 | STRING_LITERAL_LONG2 | ECHAR | WS | COMMENT );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA41_83 = input.LA(1);

                        s = -1;
                        if ( (LA41_83=='\'') ) {s = 268;}

                        else if ( ((LA41_83 >= '\u0000' && LA41_83 <= '\t')||(LA41_83 >= '\u000B' && LA41_83 <= '\f')||(LA41_83 >= '\u000E' && LA41_83 <= '&')||(LA41_83 >= '(' && LA41_83 <= '\uFFFF')) ) {s = 269;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA41_84 = input.LA(1);

                        s = -1;
                        if ( (LA41_84=='\"') ) {s = 270;}

                        else if ( ((LA41_84 >= '\u0000' && LA41_84 <= '\t')||(LA41_84 >= '\u000B' && LA41_84 <= '\f')||(LA41_84 >= '\u000E' && LA41_84 <= '!')||(LA41_84 >= '#' && LA41_84 <= '\uFFFF')) ) {s = 271;}

                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}

            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 41, _s, input);
            error(nvae);
            throw nvae;
        }

    }
 

}