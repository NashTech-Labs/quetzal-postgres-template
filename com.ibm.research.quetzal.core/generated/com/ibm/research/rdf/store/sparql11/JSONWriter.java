// $ANTLR 3.4 /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g 2016-08-23 17:16:33
 
package com.ibm.research.rdf.store.sparql11;
	
import org.antlr.runtime.BitSet;
import java.util.*;
import java.math.BigInteger;
import java.math.BigDecimal;
import com.ibm.research.rdf.store.sparql11.model.*;
import com.ibm.wala.util.collections.HashSetFactory;
import com.ibm.wala.util.collections.Pair;
import org.json.*;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class JSONWriter extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "A", "ABS", "ADD", "ALL", "ALT", "ANNON", "AS", "ASC", "ASK", "AVG", "B", "BASE", "BIG_DECIMAL", "BIG_INTEGER", "BIND", "BINDINGS", "BIND_VALUES", "BLANK_NODE_LABEL", "BNODE", "BOOLEAN", "BOUND", "BROKEN_MINUS", "BROKEN_PLUS", "BY", "C", "CEIL", "CLEAR", "CLOSE_BRACE", "CLOSE_CURLY_BRACE", "CLOSE_SQ_BRACKET", "COALESCE", "COLLECTION", "COMMA", "COMMENT", "CONCAT", "CONDITION", "CONSTRUCT", "CONTAINS", "COPY", "COUNT", "CREATE", "D", "DATA", "DATASET", "DATATYPE", "DAY", "DECIMAL", "DECIMAL_NEGATIVE", "DECIMAL_POSITIVE", "DEFAULT", "DEFAULT_NAMESPACE", "DELETE", "DESC", "DESCRIBE", "DIGIT", "DISTINCT", "DOT", "DOUBLE", "DOUBLE_NEGATIVE", "DOUBLE_POSITIVE", "DROP", "E", "ECHAR", "ELT", "ENCODE_FOR_URI", "EOL", "EXISTS", "EXP", "EXPONENT", "EXPRESSION", "F", "FALSE", "FILTER", "FLOOR", "FROM", "FUNCTION", "G", "GRAPH", "GRAPH_GRAPH_PATTERN", "GRAPH_NODE", "GROUP", "GROUP_BY", "GROUP_CONCAT", "GROUP_GRAPH_PATTERN", "GROUP_GRAPH_PATTERN_SUB", "H", "HAVING", "HEXDIGIT", "HOURS", "I", "IF", "IN", "INLINE_DATA", "INSERT", "INTEGER", "INTEGER_NEGATIVE", "INTEGER_POSITIVE", "INTO", "INV", "IRI", "IRI_OR_FUNCTION", "IRI_REF", "ISBLANK", "ISIRI", "ISLITERAL", "ISNUMERIC", "ISURI", "J", "K", "KEY", "L", "LANG", "LANGMATCHES", "LANGTAG", "LCASE", "LIMIT", "LOAD", "LOGICAL_AND", "LOGICAL_OR", "LT", "LTE", "M", "MAX", "MD5", "MIN", "MINUS", "MINUTES", "MODIFIERS", "MONTH", "MOVE", "N", "NAMED", "NAMESPACE_PREFIX_MAP", "NIL", "NON_TRIPLES", "NOT", "NOT_EXISTS", "NOT_IN", "NOW", "NUMERIC", "O", "OFFSET", "OPEN_BRACE", "OPEN_CURLY_BRACE", "OPEN_SQ_BRACKET", "OPTIONAL", "ORDER", "ORDER_BY", "P", "PATH", "PERCENT", "PLX", "PNAME_LN", "PNAME_NS", "PN_CHARS", "PN_CHARS_BASE", "PN_CHARS_U", "PN_LOCAL", "PN_LOCAL_ESC", "PN_PREFIX", "PREDICATE", "PREDICATE_VALUE", "PREFIX", "PREFIXED_NAME", "PREFIXED_NS", "PROLOGUE", "PROPERTY_LIST", "PVARS", "Q", "QUERY", "R", "RAND", "REDUCED", "REGEX", "REPLACE", "ROOT", "ROUND", "S", "SAMETERM", "SAMPLE", "SECONDS", "SELECT", "SEMICOLON", "SEPARATOR", "SEQ", "SERVICE", "SHA1", "SHA224", "SHA256", "SHA384", "SHA512", "SILENT", "STR", "STRAFTER", "STRBEFORE", "STRDT", "STRENDS", "STRING", "STRING_LITERAL1", "STRING_LITERAL2", "STRING_LITERAL_LONG1", "STRING_LITERAL_LONG2", "STRLANG", "STRLEN", "STRSTARTS", "STRUUID", "SUBJECT", "SUBSTR", "SUB_SELECT", "SUM", "T", "TIMEZONE", "TO", "TRIPLE", "TRIPLE2", "TRIPLES_BLOCK", "TRIPLES_NODE", "TRIPLES_NODE_PROPERTY_LIST", "TRIPLES_SAME_SUBJECT", "TRUE", "TYPE", "TZ", "U", "UCASE", "UNDEF", "UNICODE_ESCAPE", "UNION", "UPDATE", "URI", "USING", "UUID", "V", "VALUE", "VALUES", "VAR", "VAR1", "VAR2", "VARNAME", "W", "WHERE", "WHERE_TOKEN", "WITH", "WS", "X", "Y", "YEAR", "Z", "'!'", "'!='", "'*'", "'+'", "'-'", "'/'", "'='", "'>'", "'>='", "'?'", "'^'", "'^^'", "'a'", "'|'"
    };

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

    // delegates
    public TreeParser[] getDelegates() {
        return new TreeParser[] {};
    }

    // delegators


    public JSONWriter(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public JSONWriter(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return JSONWriter.tokenNames; }
    public String getGrammarFileName() { return "/home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g"; }


    	protected void mismatch(IntStream input, int ttype, BitSet follow)
    		throws RecognitionException
    	{
    		throw new MismatchedTokenException(ttype, input);
    	}
    	
    	public Object recoverFromMismatchedSet(IntStream input, RecognitionException e, BitSet follow)
    		throws RecognitionException	
    	{
    		throw e;
    	}
    	
    	protected Object recoverFromMismatchedToken(IntStream input, int ttype, BitSet follow)
        	throws RecognitionException
    	{   
        	throw new MismatchedTokenException(ttype, input);
    	}  

        private void putAll(List c, JSONArray y) throws JSONException {
            for(int i = 0; i < y.length(); i++) {
                c.add(y.get(i));
            }
        }



    // $ANTLR start "queryUnit"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:55:1: queryUnit returns [JSONObject o] : ^(q= ROOT x= query ) ;
    public final JSONObject queryUnit() throws JSONException, RecognitionException {
        JSONObject o = null;


        XTree q=null;
        JSONObject x =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:56:2: ( ^(q= ROOT x= query ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:56:8: ^(q= ROOT x= query )
            {
            q=(XTree)match(input,ROOT,FOLLOW_ROOT_in_queryUnit89); if (state.failed) return o;

            match(input, Token.DOWN, null); if (state.failed) return o;
            pushFollow(FOLLOW_query_in_queryUnit93);
            x=query();

            state._fsp--;
            if (state.failed) return o;

            match(input, Token.UP, null); if (state.failed) return o;


            if ( state.backtracking==0 ) { o = x; }

            }

        }

        	catch(RecognitionException eee) {
                throw new RuntimeException(eee);
            }

        finally {
        	// do for sure before leaving
        }
        return o;
    }
    // $ANTLR end "queryUnit"



    // $ANTLR start "query"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:59:1: query returns [JSONObject o] : ^(q= QUERY (p= prologue ) ( (s= selectQuery ) (b= bindingsClause )? ) ) ;
    public final JSONObject query() throws JSONException, RecognitionException {
        JSONObject o = null;


        XTree q=null;
        JSONObject s =null;

        JSONObject b =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:60:2: ( ^(q= QUERY (p= prologue ) ( (s= selectQuery ) (b= bindingsClause )? ) ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:60:4: ^(q= QUERY (p= prologue ) ( (s= selectQuery ) (b= bindingsClause )? ) )
            {
            q=(XTree)match(input,QUERY,FOLLOW_QUERY_in_query121); if (state.failed) return o;

            match(input, Token.DOWN, null); if (state.failed) return o;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:61:4: (p= prologue )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:61:6: p= prologue
            {
            pushFollow(FOLLOW_prologue_in_query131);
            prologue();

            state._fsp--;
            if (state.failed) return o;

            }


            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:62:4: ( (s= selectQuery ) (b= bindingsClause )? )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:62:6: (s= selectQuery ) (b= bindingsClause )?
            {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:62:6: (s= selectQuery )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:62:8: s= selectQuery
            {
            pushFollow(FOLLOW_selectQuery_in_query150);
            s=selectQuery();

            state._fsp--;
            if (state.failed) return o;

            if ( state.backtracking==0 ) { o = s; o.put("source", q.matched); }

            }


            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:63:8: (b= bindingsClause )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==VALUES) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:63:10: b= bindingsClause
                    {
                    pushFollow(FOLLOW_bindingsClause_in_query169);
                    b=bindingsClause();

                    state._fsp--;
                    if (state.failed) return o;

                    if ( state.backtracking==0 ) { 
                                        o.put("bindings", b);
                                      }

                    }
                    break;

            }


            }


            match(input, Token.UP, null); if (state.failed) return o;


            }

        }

        	catch(RecognitionException eee) {
                throw new RuntimeException(eee);
            }

        finally {
        	// do for sure before leaving
        }
        return o;
    }
    // $ANTLR end "query"



    // $ANTLR start "prologue"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:73:1: prologue : ^( PROLOGUE ( baseDecl )? ( prefixDecl )* ) ;
    public final void prologue() throws JSONException, RecognitionException {
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:74:2: ( ^( PROLOGUE ( baseDecl )? ( prefixDecl )* ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:74:7: ^( PROLOGUE ( baseDecl )? ( prefixDecl )* )
            {
            match(input,PROLOGUE,FOLLOW_PROLOGUE_in_prologue241); if (state.failed) return ;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return ;
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:74:18: ( baseDecl )?
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==BASE) ) {
                    alt2=1;
                }
                switch (alt2) {
                    case 1 :
                        // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:74:18: baseDecl
                        {
                        pushFollow(FOLLOW_baseDecl_in_prologue243);
                        baseDecl();

                        state._fsp--;
                        if (state.failed) return ;

                        }
                        break;

                }


                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:74:29: ( prefixDecl )*
                loop3:
                do {
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==PREFIX) ) {
                        alt3=1;
                    }


                    switch (alt3) {
                	case 1 :
                	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:74:29: prefixDecl
                	    {
                	    pushFollow(FOLLOW_prefixDecl_in_prologue247);
                	    prefixDecl();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }
                	    break;

                	default :
                	    break loop3;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return ;
            }


            }

        }

        	catch(RecognitionException eee) {
                throw new RuntimeException(eee);
            }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "prologue"



    // $ANTLR start "baseDecl"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:78:1: baseDecl : ^( BASE iRIref ) ;
    public final void baseDecl() throws JSONException, RecognitionException {
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:79:2: ( ^( BASE iRIref ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:79:6: ^( BASE iRIref )
            {
            match(input,BASE,FOLLOW_BASE_in_baseDecl273); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_iRIref_in_baseDecl275);
            iRIref();

            state._fsp--;
            if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            }

        }

        	catch(RecognitionException eee) {
                throw new RuntimeException(eee);
            }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "baseDecl"



    // $ANTLR start "prefixDecl"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:82:1: prefixDecl : ^( PREFIX prefixedName iRIref ) ;
    public final void prefixDecl() throws JSONException, RecognitionException {
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:83:2: ( ^( PREFIX prefixedName iRIref ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:83:6: ^( PREFIX prefixedName iRIref )
            {
            match(input,PREFIX,FOLLOW_PREFIX_in_prefixDecl297); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_prefixedName_in_prefixDecl299);
            prefixedName();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_iRIref_in_prefixDecl302);
            iRIref();

            state._fsp--;
            if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            }

        }

        	catch(RecognitionException eee) {
                throw new RuntimeException(eee);
            }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "prefixDecl"



    // $ANTLR start "selectQuery"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:86:1: selectQuery returns [JSONObject o] : ^( SELECT (s= selectClause[$o] ) (d= dataset )? ( whereClause[$o] )? ( solutionModifier[$o] ) ) ;
    public final JSONObject selectQuery() throws JSONException, RecognitionException {
        JSONObject o = null;


        JSONArray d =null;


         o = new JSONObject(); 
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:88:2: ( ^( SELECT (s= selectClause[$o] ) (d= dataset )? ( whereClause[$o] )? ( solutionModifier[$o] ) ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:89:3: ^( SELECT (s= selectClause[$o] ) (d= dataset )? ( whereClause[$o] )? ( solutionModifier[$o] ) )
            {
            match(input,SELECT,FOLLOW_SELECT_in_selectQuery337); if (state.failed) return o;

            match(input, Token.DOWN, null); if (state.failed) return o;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:90:4: (s= selectClause[$o] )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:90:5: s= selectClause[$o]
            {
            pushFollow(FOLLOW_selectClause_in_selectQuery347);
            selectClause(o);

            state._fsp--;
            if (state.failed) return o;

            }


            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:91:4: (d= dataset )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==DATASET) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:91:5: d= dataset
                    {
                    pushFollow(FOLLOW_dataset_in_selectQuery359);
                    d=dataset();

                    state._fsp--;
                    if (state.failed) return o;

                    if ( state.backtracking==0 ) { o.put("datasets", d);    }

                    }
                    break;

            }


            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:92:4: ( whereClause[$o] )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==WHERE) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:92:6: whereClause[$o]
                    {
                    pushFollow(FOLLOW_whereClause_in_selectQuery375);
                    whereClause(o);

                    state._fsp--;
                    if (state.failed) return o;

                    }
                    break;

            }


            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:93:4: ( solutionModifier[$o] )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:93:6: solutionModifier[$o]
            {
            pushFollow(FOLLOW_solutionModifier_in_selectQuery386);
            solutionModifier(o);

            state._fsp--;
            if (state.failed) return o;

            }


            match(input, Token.UP, null); if (state.failed) return o;


            }

        }

        	catch(RecognitionException eee) {
                throw new RuntimeException(eee);
            }

        finally {
        	// do for sure before leaving
        }
        return o;
    }
    // $ANTLR end "selectQuery"



    // $ANTLR start "dataset"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:97:1: dataset returns [JSONArray dcl] : ^( DATASET (dc= datasetClause )+ ) ;
    public final JSONArray dataset() throws JSONException, RecognitionException {
        JSONArray dcl = null;


        JSONObject dc =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:98:2: ( ^( DATASET (dc= datasetClause )+ ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:99:3: ^( DATASET (dc= datasetClause )+ )
            {
            match(input,DATASET,FOLLOW_DATASET_in_dataset419); if (state.failed) return dcl;

            if ( state.backtracking==0 ) { dcl = new JSONArray(); }

            match(input, Token.DOWN, null); if (state.failed) return dcl;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:101:13: (dc= datasetClause )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==FROM) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:101:14: dc= datasetClause
            	    {
            	    pushFollow(FOLLOW_datasetClause_in_dataset451);
            	    dc=datasetClause();

            	    state._fsp--;
            	    if (state.failed) return dcl;

            	    if ( state.backtracking==0 ) { dcl.put(dc); }

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
            	    if (state.backtracking>0) {state.failed=true; return dcl;}
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            match(input, Token.UP, null); if (state.failed) return dcl;


            }

        }

        	catch(RecognitionException eee) {
                throw new RuntimeException(eee);
            }

        finally {
        	// do for sure before leaving
        }
        return dcl;
    }
    // $ANTLR end "dataset"



    // $ANTLR start "subSelect"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:105:1: subSelect returns [JSONObject sp] : ^( SUB_SELECT s= selectClause[$sp] (w= whereClause[$sp] )? ( solutionModifier[$sp] ) (d= inlineData )? ) ;
    public final JSONObject subSelect() throws JSONException, RecognitionException {
        JSONObject sp = null;


        JSONObject d =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:106:2: ( ^( SUB_SELECT s= selectClause[$sp] (w= whereClause[$sp] )? ( solutionModifier[$sp] ) (d= inlineData )? ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:106:6: ^( SUB_SELECT s= selectClause[$sp] (w= whereClause[$sp] )? ( solutionModifier[$sp] ) (d= inlineData )? )
            {
            match(input,SUB_SELECT,FOLLOW_SUB_SELECT_in_subSelect483); if (state.failed) return sp;

            if ( state.backtracking==0 ) { 
            		    sp = new JSONObject();
            	      }

            match(input, Token.DOWN, null); if (state.failed) return sp;
            pushFollow(FOLLOW_selectClause_in_subSelect500);
            selectClause(sp);

            state._fsp--;
            if (state.failed) return sp;

            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:111:4: (w= whereClause[$sp] )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==WHERE) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:111:5: w= whereClause[$sp]
                    {
                    pushFollow(FOLLOW_whereClause_in_subSelect509);
                    whereClause(sp);

                    state._fsp--;
                    if (state.failed) return sp;

                    }
                    break;

            }


            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:112:4: ( solutionModifier[$sp] )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:112:6: solutionModifier[$sp]
            {
            pushFollow(FOLLOW_solutionModifier_in_subSelect520);
            solutionModifier(sp);

            state._fsp--;
            if (state.failed) return sp;

            }


            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:113:13: (d= inlineData )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==VALUES) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:113:14: d= inlineData
                    {
                    pushFollow(FOLLOW_inlineData_in_subSelect540);
                    d=inlineData();

                    state._fsp--;
                    if (state.failed) return sp;

                    if ( state.backtracking==0 ) { sp.put("bindings", d); }

                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return sp;


            }

        }

        	catch(RecognitionException eee) {
                throw new RuntimeException(eee);
            }

        finally {
        	// do for sure before leaving
        }
        return sp;
    }
    // $ANTLR end "subSelect"



    // $ANTLR start "selectClause"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:117:1: selectClause[JSONObject o] : ( ^( TYPE ( DISTINCT | REDUCED ) ) )? ^( PVARS ( '*' | ( (v= ( var | expVar | fexp ) )+ ) ) ) ;
    public final void selectClause(JSONObject o) throws JSONException, RecognitionException {
        XTree v=null;

         JSONArray args = null; 
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:119:2: ( ( ^( TYPE ( DISTINCT | REDUCED ) ) )? ^( PVARS ( '*' | ( (v= ( var | expVar | fexp ) )+ ) ) ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:120:3: ( ^( TYPE ( DISTINCT | REDUCED ) ) )? ^( PVARS ( '*' | ( (v= ( var | expVar | fexp ) )+ ) ) )
            {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:120:3: ( ^( TYPE ( DISTINCT | REDUCED ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==TYPE) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:120:4: ^( TYPE ( DISTINCT | REDUCED ) )
                    {
                    match(input,TYPE,FOLLOW_TYPE_in_selectClause591); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:120:11: ( DISTINCT | REDUCED )
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==DISTINCT) ) {
                        alt9=1;
                    }
                    else if ( (LA9_0==REDUCED) ) {
                        alt9=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 0, input);

                        throw nvae;

                    }
                    switch (alt9) {
                        case 1 :
                            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:120:13: DISTINCT
                            {
                            match(input,DISTINCT,FOLLOW_DISTINCT_in_selectClause595); if (state.failed) return ;

                            if ( state.backtracking==0 ) { o.put("distinct", true); }

                            }
                            break;
                        case 2 :
                            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:121:7: REDUCED
                            {
                            match(input,REDUCED,FOLLOW_REDUCED_in_selectClause607); if (state.failed) return ;

                            if ( state.backtracking==0 ) { o.put("reduced", true); }

                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;

            }


            match(input,PVARS,FOLLOW_PVARS_in_selectClause636); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:126:11: ( '*' | ( (v= ( var | expVar | fexp ) )+ ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==253) ) {
                alt13=1;
            }
            else if ( (LA13_0==AS||LA13_0==EXP||LA13_0==VAR) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }
            switch (alt13) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:127:12: '*'
                    {
                    match(input,253,FOLLOW_253_in_selectClause661); if (state.failed) return ;

                    if ( state.backtracking==0 ) { o.put("star", true); }

                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:129:12: ( (v= ( var | expVar | fexp ) )+ )
                    {
                    if ( state.backtracking==0 ) { args = new JSONArray(); }

                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:130:12: ( (v= ( var | expVar | fexp ) )+ )
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:130:16: (v= ( var | expVar | fexp ) )+
                    {
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:130:17: (v= ( var | expVar | fexp ) )+
                    int cnt12=0;
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==AS||LA12_0==EXP||LA12_0==VAR) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:130:17: v= ( var | expVar | fexp )
                    	    {
                    	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:130:18: ( var | expVar | fexp )
                    	    int alt11=3;
                    	    switch ( input.LA(1) ) {
                    	    case VAR:
                    	        {
                    	        alt11=1;
                    	        }
                    	        break;
                    	    case AS:
                    	        {
                    	        alt11=2;
                    	        }
                    	        break;
                    	    case EXP:
                    	        {
                    	        alt11=3;
                    	        }
                    	        break;
                    	    default:
                    	        if (state.backtracking>0) {state.failed=true; return ;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 11, 0, input);

                    	        throw nvae;

                    	    }

                    	    switch (alt11) {
                    	        case 1 :
                    	            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:130:19: var
                    	            {
                    	            pushFollow(FOLLOW_var_in_selectClause710);
                    	            var();

                    	            state._fsp--;
                    	            if (state.failed) return ;

                    	            }
                    	            break;
                    	        case 2 :
                    	            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:130:25: expVar
                    	            {
                    	            pushFollow(FOLLOW_expVar_in_selectClause714);
                    	            expVar();

                    	            state._fsp--;
                    	            if (state.failed) return ;

                    	            }
                    	            break;
                    	        case 3 :
                    	            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:130:34: fexp
                    	            {
                    	            pushFollow(FOLLOW_fexp_in_selectClause718);
                    	            fexp();

                    	            state._fsp--;
                    	            if (state.failed) return ;

                    	            }
                    	            break;

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


                    if ( state.backtracking==0 ) { args.put(v); }

                    }


                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return ;


            }

        }

        	catch(RecognitionException eee) {
                throw new RuntimeException(eee);
            }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "selectClause"



    // $ANTLR start "expVar"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:135:1: expVar returns [JSONObject o] : ^( AS v= var e= expression ) ;
    public final JSONObject expVar() throws JSONException, RecognitionException {
        JSONObject o = null;


        String v =null;

        JSONObject e =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:136:2: ( ^( AS v= var e= expression ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:136:4: ^( AS v= var e= expression )
            {
            match(input,AS,FOLLOW_AS_in_expVar761); if (state.failed) return o;

            match(input, Token.DOWN, null); if (state.failed) return o;
            pushFollow(FOLLOW_var_in_expVar765);
            v=var();

            state._fsp--;
            if (state.failed) return o;

            pushFollow(FOLLOW_expression_in_expVar769);
            e=expression();

            state._fsp--;
            if (state.failed) return o;

            match(input, Token.UP, null); if (state.failed) return o;


            if ( state.backtracking==0 ) { o = new JSONObject(); o.put("var", v); o.put("expr", e); }

            }

        }

        	catch(RecognitionException eee) {
                throw new RuntimeException(eee);
            }

        finally {
        	// do for sure before leaving
        }
        return o;
    }
    // $ANTLR end "expVar"



    // $ANTLR start "fexp"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:139:1: fexp returns [JSONObject o] : ^( EXP e= expression ) ;
    public final JSONObject fexp() throws JSONException, RecognitionException {
        JSONObject o = null;


        JSONObject e =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:140:2: ( ^( EXP e= expression ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:140:4: ^( EXP e= expression )
            {
            match(input,EXP,FOLLOW_EXP_in_fexp795); if (state.failed) return o;

            match(input, Token.DOWN, null); if (state.failed) return o;
            pushFollow(FOLLOW_expression_in_fexp799);
            e=expression();

            state._fsp--;
            if (state.failed) return o;

            match(input, Token.UP, null); if (state.failed) return o;


            if ( state.backtracking==0 ) { o = e; }

            }

        }

        	catch(RecognitionException eee) {
                throw new RuntimeException(eee);
            }

        finally {
        	// do for sure before leaving
        }
        return o;
    }
    // $ANTLR end "fexp"



    // $ANTLR start "datasetClause"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:143:1: datasetClause returns [JSONObject o] : ^( FROM (d= defaultGraphClause |n= namedGraphClause ) ) ;
    public final JSONObject datasetClause() throws JSONException, RecognitionException {
        JSONObject o = null;


        JSONObject d =null;

        JSONObject n =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:144:2: ( ^( FROM (d= defaultGraphClause |n= namedGraphClause ) ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:144:4: ^( FROM (d= defaultGraphClause |n= namedGraphClause ) )
            {
            match(input,FROM,FOLLOW_FROM_in_datasetClause825); if (state.failed) return o;

            match(input, Token.DOWN, null); if (state.failed) return o;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:144:12: (d= defaultGraphClause |n= namedGraphClause )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==IRI||(LA14_0 >= PREFIXED_NAME && LA14_0 <= PREFIXED_NS)) ) {
                alt14=1;
            }
            else if ( (LA14_0==NAMED) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return o;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }
            switch (alt14) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:144:14: d= defaultGraphClause
                    {
                    pushFollow(FOLLOW_defaultGraphClause_in_datasetClause832);
                    d=defaultGraphClause();

                    state._fsp--;
                    if (state.failed) return o;

                    if ( state.backtracking==0 ) { o = d; }

                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:145:7: n= namedGraphClause
                    {
                    pushFollow(FOLLOW_namedGraphClause_in_datasetClause846);
                    n=namedGraphClause();

                    state._fsp--;
                    if (state.failed) return o;

                    if ( state.backtracking==0 ) { o = n; }

                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return o;


            }

        }

        	catch(RecognitionException eee) {
                throw new RuntimeException(eee);
            }

        finally {
        	// do for sure before leaving
        }
        return o;
    }
    // $ANTLR end "datasetClause"



    // $ANTLR start "defaultGraphClause"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:150:1: defaultGraphClause returns [JSONObject o] : d= sourceSelector ;
    public final JSONObject defaultGraphClause() throws JSONException, RecognitionException {
        JSONObject o = null;


        IRI d =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:151:2: (d= sourceSelector )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:151:6: d= sourceSelector
            {
            pushFollow(FOLLOW_sourceSelector_in_defaultGraphClause883);
            d=sourceSelector();

            state._fsp--;
            if (state.failed) return o;

            if ( state.backtracking==0 ) { o = new JSONObject(); o.put("dataset", d); }

            }

        }

        	catch(RecognitionException eee) {
                throw new RuntimeException(eee);
            }

        finally {
        	// do for sure before leaving
        }
        return o;
    }
    // $ANTLR end "defaultGraphClause"



    // $ANTLR start "namedGraphClause"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:154:1: namedGraphClause returns [JSONObject o] : ^( NAMED d= sourceSelector ) ;
    public final JSONObject namedGraphClause() throws JSONException, RecognitionException {
        JSONObject o = null;


        IRI d =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:155:2: ( ^( NAMED d= sourceSelector ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:155:6: ^( NAMED d= sourceSelector )
            {
            match(input,NAMED,FOLLOW_NAMED_in_namedGraphClause909); if (state.failed) return o;

            match(input, Token.DOWN, null); if (state.failed) return o;
            pushFollow(FOLLOW_sourceSelector_in_namedGraphClause913);
            d=sourceSelector();

            state._fsp--;
            if (state.failed) return o;

            match(input, Token.UP, null); if (state.failed) return o;


            if ( state.backtracking==0 ) { o = new JSONObject(); o.put("dataset", d); }

            }

        }

        	catch(RecognitionException eee) {
                throw new RuntimeException(eee);
            }

        finally {
        	// do for sure before leaving
        }
        return o;
    }
    // $ANTLR end "namedGraphClause"



    // $ANTLR start "sourceSelector"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:158:1: sourceSelector returns [IRI r] : i= iRIref ;
    public final IRI sourceSelector() throws JSONException, RecognitionException {
        IRI r = null;


        IRI i =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:159:2: (i= iRIref )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:159:7: i= iRIref
            {
            pushFollow(FOLLOW_iRIref_in_sourceSelector943);
            i=iRIref();

            state._fsp--;
            if (state.failed) return r;

            if ( state.backtracking==0 ) { r = i; }

            }

        }

        	catch(RecognitionException eee) {
                throw new RuntimeException(eee);
            }

        finally {
        	// do for sure before leaving
        }
        return r;
    }
    // $ANTLR end "sourceSelector"



    // $ANTLR start "whereClause"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:162:1: whereClause[JSONObject o] : ^( WHERE (g= groupGraphPattern )? ) ;
    public final void whereClause(JSONObject o) throws JSONException, RecognitionException {
        JSONObject g =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:163:2: ( ^( WHERE (g= groupGraphPattern )? ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:164:3: ^( WHERE (g= groupGraphPattern )? )
            {
            match(input,WHERE,FOLLOW_WHERE_in_whereClause967); if (state.failed) return ;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return ;
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:164:12: (g= groupGraphPattern )?
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==GROUP_GRAPH_PATTERN||LA15_0==SUB_SELECT) ) {
                    alt15=1;
                }
                switch (alt15) {
                    case 1 :
                        // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:164:12: g= groupGraphPattern
                        {
                        pushFollow(FOLLOW_groupGraphPattern_in_whereClause971);
                        g=groupGraphPattern();

                        state._fsp--;
                        if (state.failed) return ;

                        }
                        break;

                }


                match(input, Token.UP, null); if (state.failed) return ;
            }


            if ( state.backtracking==0 ) { o.put("where", g); }

            }

        }

        	catch(RecognitionException eee) {
                throw new RuntimeException(eee);
            }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "whereClause"



    // $ANTLR start "solutionModifier"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:167:1: solutionModifier[JSONObject o] : ^( MODIFIERS (g= groupClause )? (h= havingClause )? (r= orderClause )? ( limitOffsetClauses[$o] )? ) ;
    public final void solutionModifier(JSONObject o) throws JSONException, RecognitionException {
        JSONArray g =null;

        JSONArray h =null;

        JSONArray r =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:168:2: ( ^( MODIFIERS (g= groupClause )? (h= havingClause )? (r= orderClause )? ( limitOffsetClauses[$o] )? ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:168:6: ^( MODIFIERS (g= groupClause )? (h= havingClause )? (r= orderClause )? ( limitOffsetClauses[$o] )? )
            {
            match(input,MODIFIERS,FOLLOW_MODIFIERS_in_solutionModifier996); if (state.failed) return ;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return ;
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:169:4: (g= groupClause )?
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==GROUP_BY) ) {
                    alt16=1;
                }
                switch (alt16) {
                    case 1 :
                        // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:169:6: g= groupClause
                        {
                        pushFollow(FOLLOW_groupClause_in_solutionModifier1005);
                        g=groupClause();

                        state._fsp--;
                        if (state.failed) return ;

                        if ( state.backtracking==0 ) {o.put("group", g); }

                        }
                        break;

                }


                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:170:4: (h= havingClause )?
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==HAVING) ) {
                    alt17=1;
                }
                switch (alt17) {
                    case 1 :
                        // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:170:6: h= havingClause
                        {
                        pushFollow(FOLLOW_havingClause_in_solutionModifier1022);
                        h=havingClause();

                        state._fsp--;
                        if (state.failed) return ;

                        if ( state.backtracking==0 ) {o.put("having", h);}

                        }
                        break;

                }


                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:171:4: (r= orderClause )?
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==ORDER_BY) ) {
                    alt18=1;
                }
                switch (alt18) {
                    case 1 :
                        // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:171:6: r= orderClause
                        {
                        pushFollow(FOLLOW_orderClause_in_solutionModifier1039);
                        r=orderClause();

                        state._fsp--;
                        if (state.failed) return ;

                        if ( state.backtracking==0 ) {o.put("order", r); }

                        }
                        break;

                }


                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:172:4: ( limitOffsetClauses[$o] )?
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==LIMIT||LA19_0==OFFSET) ) {
                    alt19=1;
                }
                switch (alt19) {
                    case 1 :
                        // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:172:6: limitOffsetClauses[$o]
                        {
                        pushFollow(FOLLOW_limitOffsetClauses_in_solutionModifier1054);
                        limitOffsetClauses(o);

                        state._fsp--;
                        if (state.failed) return ;

                        }
                        break;

                }


                match(input, Token.UP, null); if (state.failed) return ;
            }


            }

        }

        	catch(RecognitionException eee) {
                throw new RuntimeException(eee);
            }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "solutionModifier"



    // $ANTLR start "groupClause"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:175:1: groupClause returns [JSONArray gc] : ^( GROUP_BY c= groupCondition ) ;
    public final JSONArray groupClause() throws JSONException, RecognitionException {
        JSONArray gc = null;


        JSONArray c =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:176:2: ( ^( GROUP_BY c= groupCondition ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:176:6: ^( GROUP_BY c= groupCondition )
            {
            match(input,GROUP_BY,FOLLOW_GROUP_BY_in_groupClause1082); if (state.failed) return gc;

            match(input, Token.DOWN, null); if (state.failed) return gc;
            pushFollow(FOLLOW_groupCondition_in_groupClause1086);
            c=groupCondition();

            state._fsp--;
            if (state.failed) return gc;

            match(input, Token.UP, null); if (state.failed) return gc;


            if ( state.backtracking==0 ) { gc = c; }

            }

        }

        	catch(RecognitionException eee) {
                throw new RuntimeException(eee);
            }

        finally {
        	// do for sure before leaving
        }
        return gc;
    }
    // $ANTLR end "groupClause"



    // $ANTLR start "groupCondition"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:179:1: groupCondition returns [JSONArray gc] : (b= builtInCall |f= functionCall | ^( CONDITION e2= expression (v= var )? ) |v2= var )+ ;
    public final JSONArray groupCondition() throws JSONException, RecognitionException {
        JSONArray gc = null;


        JSONObject b =null;

        JSONObject f =null;

        JSONObject e2 =null;

        String v =null;

        String v2 =null;


         gc = new JSONArray(); 
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:181:2: ( (b= builtInCall |f= functionCall | ^( CONDITION e2= expression (v= var )? ) |v2= var )+ )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:182:2: (b= builtInCall |f= functionCall | ^( CONDITION e2= expression (v= var )? ) |v2= var )+
            {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:182:2: (b= builtInCall |f= functionCall | ^( CONDITION e2= expression (v= var )? ) |v2= var )+
            int cnt21=0;
            loop21:
            do {
                int alt21=5;
                switch ( input.LA(1) ) {
                case ABS:
                case BNODE:
                case BOUND:
                case CEIL:
                case COALESCE:
                case CONCAT:
                case CONTAINS:
                case DATATYPE:
                case DAY:
                case ENCODE_FOR_URI:
                case EXISTS:
                case FLOOR:
                case HOURS:
                case IF:
                case IRI:
                case ISBLANK:
                case ISIRI:
                case ISLITERAL:
                case ISNUMERIC:
                case ISURI:
                case LANG:
                case LANGMATCHES:
                case LCASE:
                case MD5:
                case MINUTES:
                case MONTH:
                case NOT_EXISTS:
                case NOW:
                case RAND:
                case REGEX:
                case REPLACE:
                case ROUND:
                case SAMETERM:
                case SECONDS:
                case SHA1:
                case SHA256:
                case SHA384:
                case SHA512:
                case STR:
                case STRAFTER:
                case STRBEFORE:
                case STRDT:
                case STRENDS:
                case STRLANG:
                case STRLEN:
                case STRSTARTS:
                case STRUUID:
                case SUBSTR:
                case TIMEZONE:
                case TZ:
                case UCASE:
                case URI:
                case UUID:
                case YEAR:
                    {
                    alt21=1;
                    }
                    break;
                case FUNCTION:
                    {
                    alt21=2;
                    }
                    break;
                case CONDITION:
                    {
                    alt21=3;
                    }
                    break;
                case VAR:
                    {
                    alt21=4;
                    }
                    break;

                }

                switch (alt21) {
            	case 1 :
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:182:4: b= builtInCall
            	    {
            	    pushFollow(FOLLOW_builtInCall_in_groupCondition1126);
            	    b=builtInCall();

            	    state._fsp--;
            	    if (state.failed) return gc;

            	    if ( state.backtracking==0 ) { gc.put(b); }

            	    }
            	    break;
            	case 2 :
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:183:4: f= functionCall
            	    {
            	    pushFollow(FOLLOW_functionCall_in_groupCondition1145);
            	    f=functionCall();

            	    state._fsp--;
            	    if (state.failed) return gc;

            	    if ( state.backtracking==0 ) { gc.put(f); }

            	    }
            	    break;
            	case 3 :
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:184:4: ^( CONDITION e2= expression (v= var )? )
            	    {
            	    match(input,CONDITION,FOLLOW_CONDITION_in_groupCondition1162); if (state.failed) return gc;

            	    match(input, Token.DOWN, null); if (state.failed) return gc;
            	    pushFollow(FOLLOW_expression_in_groupCondition1166);
            	    e2=expression();

            	    state._fsp--;
            	    if (state.failed) return gc;

            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:184:30: (v= var )?
            	    int alt20=2;
            	    int LA20_0 = input.LA(1);

            	    if ( (LA20_0==VAR) ) {
            	        alt20=1;
            	    }
            	    switch (alt20) {
            	        case 1 :
            	            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:184:31: v= var
            	            {
            	            pushFollow(FOLLOW_var_in_groupCondition1171);
            	            v=var();

            	            state._fsp--;
            	            if (state.failed) return gc;

            	            }
            	            break;

            	    }


            	    match(input, Token.UP, null); if (state.failed) return gc;


            	    if ( state.backtracking==0 ) { JSONObject x = new JSONObject(); x.put("expr", e2); if (v != null) { x.put("var", v); } gc.put(x); }

            	    }
            	    break;
            	case 4 :
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:185:4: v2= var
            	    {
            	    pushFollow(FOLLOW_var_in_groupCondition1188);
            	    v2=var();

            	    state._fsp--;
            	    if (state.failed) return gc;

            	    if ( state.backtracking==0 ) { gc.put(v2); }

            	    }
            	    break;

            	default :
            	    if ( cnt21 >= 1 ) break loop21;
            	    if (state.backtracking>0) {state.failed=true; return gc;}
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
            } while (true);


            }

        }

        	catch(RecognitionException eee) {
                throw new RuntimeException(eee);
            }

        finally {
        	// do for sure before leaving
        }
        return gc;
    }
    // $ANTLR end "groupCondition"



    // $ANTLR start "havingClause"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:189:1: havingClause returns [JSONArray h] : ^( HAVING (c= havingCondition )+ ) ;
    public final JSONArray havingClause() throws JSONException, RecognitionException {
        JSONArray h = null;


        Object c =null;



        		h = new JSONArray();
        	
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:193:2: ( ^( HAVING (c= havingCondition )+ ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:193:6: ^( HAVING (c= havingCondition )+ )
            {
            match(input,HAVING,FOLLOW_HAVING_in_havingClause1266); if (state.failed) return h;

            match(input, Token.DOWN, null); if (state.failed) return h;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:193:15: (c= havingCondition )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==ABS||LA22_0==BNODE||LA22_0==BOUND||LA22_0==CEIL||LA22_0==COALESCE||LA22_0==CONCAT||LA22_0==CONTAINS||(LA22_0 >= DATATYPE && LA22_0 <= DAY)||LA22_0==ENCODE_FOR_URI||LA22_0==EXISTS||LA22_0==EXPRESSION||LA22_0==FLOOR||LA22_0==FUNCTION||LA22_0==HOURS||LA22_0==IF||LA22_0==IRI||(LA22_0 >= ISBLANK && LA22_0 <= ISURI)||(LA22_0 >= LANG && LA22_0 <= LANGMATCHES)||LA22_0==LCASE||LA22_0==MD5||LA22_0==MINUTES||LA22_0==MONTH||LA22_0==NOT_EXISTS||LA22_0==NOW||LA22_0==RAND||(LA22_0 >= REGEX && LA22_0 <= REPLACE)||LA22_0==ROUND||LA22_0==SAMETERM||LA22_0==SECONDS||LA22_0==SHA1||(LA22_0 >= SHA256 && LA22_0 <= SHA512)||(LA22_0 >= STR && LA22_0 <= STRENDS)||(LA22_0 >= STRLANG && LA22_0 <= STRUUID)||LA22_0==SUBSTR||LA22_0==TIMEZONE||LA22_0==TZ||LA22_0==UCASE||LA22_0==URI||LA22_0==UUID||LA22_0==YEAR) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:193:16: c= havingCondition
            	    {
            	    pushFollow(FOLLOW_havingCondition_in_havingClause1271);
            	    c=havingCondition();

            	    state._fsp--;
            	    if (state.failed) return h;

            	    if ( state.backtracking==0 ) { h.put(c); }

            	    }
            	    break;

            	default :
            	    if ( cnt22 >= 1 ) break loop22;
            	    if (state.backtracking>0) {state.failed=true; return h;}
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
            } while (true);


            match(input, Token.UP, null); if (state.failed) return h;


            }

        }

        	catch(RecognitionException eee) {
                throw new RuntimeException(eee);
            }

        finally {
        	// do for sure before leaving
        }
        return h;
    }
    // $ANTLR end "havingClause"



    // $ANTLR start "havingCondition"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:196:1: havingCondition returns [Object e] : c= constraint ;
    public final Object havingCondition() throws JSONException, RecognitionException {
        Object e = null;


        Object c =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:197:2: (c= constraint )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:197:6: c= constraint
            {
            pushFollow(FOLLOW_constraint_in_havingCondition1303);
            c=constraint();

            state._fsp--;
            if (state.failed) return e;

            if ( state.backtracking==0 ) {e = c;}

            }

        }

        	catch(RecognitionException eee) {
                throw new RuntimeException(eee);
            }

        finally {
        	// do for sure before leaving
        }
        return e;
    }
    // $ANTLR end "havingCondition"



    // $ANTLR start "orderClause"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:200:1: orderClause returns [JSONArray loc] : ^( ORDER_BY (oc= orderCondition )+ ) ;
    public final JSONArray orderClause() throws JSONException, RecognitionException {
        JSONArray loc = null;


        Object oc =null;


         
        		loc = new JSONArray(); 
        	
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:204:2: ( ^( ORDER_BY (oc= orderCondition )+ ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:204:6: ^( ORDER_BY (oc= orderCondition )+ )
            {
            match(input,ORDER_BY,FOLLOW_ORDER_BY_in_orderClause1336); if (state.failed) return loc;

            match(input, Token.DOWN, null); if (state.failed) return loc;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:204:18: (oc= orderCondition )+
            int cnt23=0;
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==ABS||LA23_0==ASC||LA23_0==BNODE||LA23_0==BOUND||LA23_0==CEIL||LA23_0==COALESCE||LA23_0==CONCAT||LA23_0==CONTAINS||(LA23_0 >= DATATYPE && LA23_0 <= DAY)||LA23_0==DESC||LA23_0==ENCODE_FOR_URI||LA23_0==EXISTS||LA23_0==EXPRESSION||LA23_0==FLOOR||LA23_0==FUNCTION||LA23_0==HOURS||LA23_0==IF||LA23_0==IRI||(LA23_0 >= ISBLANK && LA23_0 <= ISURI)||(LA23_0 >= LANG && LA23_0 <= LANGMATCHES)||LA23_0==LCASE||LA23_0==MD5||LA23_0==MINUTES||LA23_0==MONTH||LA23_0==NOT_EXISTS||LA23_0==NOW||LA23_0==RAND||(LA23_0 >= REGEX && LA23_0 <= REPLACE)||LA23_0==ROUND||LA23_0==SAMETERM||LA23_0==SECONDS||LA23_0==SHA1||(LA23_0 >= SHA256 && LA23_0 <= SHA512)||(LA23_0 >= STR && LA23_0 <= STRENDS)||(LA23_0 >= STRLANG && LA23_0 <= STRUUID)||LA23_0==SUBSTR||LA23_0==TIMEZONE||LA23_0==TZ||LA23_0==UCASE||LA23_0==URI||LA23_0==UUID||LA23_0==VAR||LA23_0==YEAR) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:204:20: oc= orderCondition
            	    {
            	    pushFollow(FOLLOW_orderCondition_in_orderClause1343);
            	    oc=orderCondition();

            	    state._fsp--;
            	    if (state.failed) return loc;

            	    if ( state.backtracking==0 ) { loc.put(oc); }

            	    }
            	    break;

            	default :
            	    if ( cnt23 >= 1 ) break loop23;
            	    if (state.backtracking>0) {state.failed=true; return loc;}
                        EarlyExitException eee =
                            new EarlyExitException(23, input);
                        throw eee;
                }
                cnt23++;
            } while (true);


            match(input, Token.UP, null); if (state.failed) return loc;


            }

        }

        	catch(RecognitionException eee) {
                throw new RuntimeException(eee);
            }

        finally {
        	// do for sure before leaving
        }
        return loc;
    }
    // $ANTLR end "orderClause"



    // $ANTLR start "orderCondition"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:207:1: orderCondition returns [Object oc] : ( ( ^( ASC e1= brackettedExpression ) ) | ( ^( DESC e2= brackettedExpression ) ) | (c= constraint |v= var ) );
    public final Object orderCondition() throws JSONException, RecognitionException {
        Object oc = null;


        Object e1 =null;

        Object e2 =null;

        Object c =null;

        String v =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:208:2: ( ( ^( ASC e1= brackettedExpression ) ) | ( ^( DESC e2= brackettedExpression ) ) | (c= constraint |v= var ) )
            int alt25=3;
            switch ( input.LA(1) ) {
            case ASC:
                {
                alt25=1;
                }
                break;
            case DESC:
                {
                alt25=2;
                }
                break;
            case ABS:
            case BNODE:
            case BOUND:
            case CEIL:
            case COALESCE:
            case CONCAT:
            case CONTAINS:
            case DATATYPE:
            case DAY:
            case ENCODE_FOR_URI:
            case EXISTS:
            case EXPRESSION:
            case FLOOR:
            case FUNCTION:
            case HOURS:
            case IF:
            case IRI:
            case ISBLANK:
            case ISIRI:
            case ISLITERAL:
            case ISNUMERIC:
            case ISURI:
            case LANG:
            case LANGMATCHES:
            case LCASE:
            case MD5:
            case MINUTES:
            case MONTH:
            case NOT_EXISTS:
            case NOW:
            case RAND:
            case REGEX:
            case REPLACE:
            case ROUND:
            case SAMETERM:
            case SECONDS:
            case SHA1:
            case SHA256:
            case SHA384:
            case SHA512:
            case STR:
            case STRAFTER:
            case STRBEFORE:
            case STRDT:
            case STRENDS:
            case STRLANG:
            case STRLEN:
            case STRSTARTS:
            case STRUUID:
            case SUBSTR:
            case TIMEZONE:
            case TZ:
            case UCASE:
            case URI:
            case UUID:
            case VAR:
            case YEAR:
                {
                alt25=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return oc;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;

            }

            switch (alt25) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:208:5: ( ^( ASC e1= brackettedExpression ) )
                    {
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:208:5: ( ^( ASC e1= brackettedExpression ) )
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:208:6: ^( ASC e1= brackettedExpression )
                    {
                    match(input,ASC,FOLLOW_ASC_in_orderCondition1374); if (state.failed) return oc;

                    match(input, Token.DOWN, null); if (state.failed) return oc;
                    pushFollow(FOLLOW_brackettedExpression_in_orderCondition1378);
                    e1=brackettedExpression();

                    state._fsp--;
                    if (state.failed) return oc;

                    match(input, Token.UP, null); if (state.failed) return oc;


                    if ( state.backtracking==0 ) { JSONObject x = new JSONObject(); x.put("expr", e1); x.put("direction", "asc"); oc = x; }

                    }


                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:209:4: ( ^( DESC e2= brackettedExpression ) )
                    {
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:209:4: ( ^( DESC e2= brackettedExpression ) )
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:209:5: ^( DESC e2= brackettedExpression )
                    {
                    match(input,DESC,FOLLOW_DESC_in_orderCondition1390); if (state.failed) return oc;

                    match(input, Token.DOWN, null); if (state.failed) return oc;
                    pushFollow(FOLLOW_brackettedExpression_in_orderCondition1394);
                    e2=brackettedExpression();

                    state._fsp--;
                    if (state.failed) return oc;

                    match(input, Token.UP, null); if (state.failed) return oc;


                    if ( state.backtracking==0 ) { JSONObject x = new JSONObject(); x.put("expr", e2); x.put("direction", "desc"); oc = x; }

                    }


                    }
                    break;
                case 3 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:210:5: (c= constraint |v= var )
                    {
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:210:5: (c= constraint |v= var )
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==ABS||LA24_0==BNODE||LA24_0==BOUND||LA24_0==CEIL||LA24_0==COALESCE||LA24_0==CONCAT||LA24_0==CONTAINS||(LA24_0 >= DATATYPE && LA24_0 <= DAY)||LA24_0==ENCODE_FOR_URI||LA24_0==EXISTS||LA24_0==EXPRESSION||LA24_0==FLOOR||LA24_0==FUNCTION||LA24_0==HOURS||LA24_0==IF||LA24_0==IRI||(LA24_0 >= ISBLANK && LA24_0 <= ISURI)||(LA24_0 >= LANG && LA24_0 <= LANGMATCHES)||LA24_0==LCASE||LA24_0==MD5||LA24_0==MINUTES||LA24_0==MONTH||LA24_0==NOT_EXISTS||LA24_0==NOW||LA24_0==RAND||(LA24_0 >= REGEX && LA24_0 <= REPLACE)||LA24_0==ROUND||LA24_0==SAMETERM||LA24_0==SECONDS||LA24_0==SHA1||(LA24_0 >= SHA256 && LA24_0 <= SHA512)||(LA24_0 >= STR && LA24_0 <= STRENDS)||(LA24_0 >= STRLANG && LA24_0 <= STRUUID)||LA24_0==SUBSTR||LA24_0==TIMEZONE||LA24_0==TZ||LA24_0==UCASE||LA24_0==URI||LA24_0==UUID||LA24_0==YEAR) ) {
                        alt24=1;
                    }
                    else if ( (LA24_0==VAR) ) {
                        alt24=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return oc;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 0, input);

                        throw nvae;

                    }
                    switch (alt24) {
                        case 1 :
                            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:210:7: c= constraint
                            {
                            pushFollow(FOLLOW_constraint_in_orderCondition1409);
                            c=constraint();

                            state._fsp--;
                            if (state.failed) return oc;

                            if ( state.backtracking==0 ) { oc = c; }

                            }
                            break;
                        case 2 :
                            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:211:5: v= var
                            {
                            pushFollow(FOLLOW_var_in_orderCondition1425);
                            v=var();

                            state._fsp--;
                            if (state.failed) return oc;

                            if ( state.backtracking==0 ) { oc = v; }

                            }
                            break;

                    }


                    }
                    break;

            }
        }

        	catch(RecognitionException eee) {
                throw new RuntimeException(eee);
            }

        finally {
        	// do for sure before leaving
        }
        return oc;
    }
    // $ANTLR end "orderCondition"



    // $ANTLR start "limitOffsetClauses"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:215:1: limitOffsetClauses[JSONObject loc] : ( limitClause[$loc] ( offsetClause[$loc] )? | offsetClause[$loc] ( limitClause[$loc] )? ) ;
    public final void limitOffsetClauses(JSONObject loc) throws JSONException, RecognitionException {
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:216:2: ( ( limitClause[$loc] ( offsetClause[$loc] )? | offsetClause[$loc] ( limitClause[$loc] )? ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:216:6: ( limitClause[$loc] ( offsetClause[$loc] )? | offsetClause[$loc] ( limitClause[$loc] )? )
            {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:216:6: ( limitClause[$loc] ( offsetClause[$loc] )? | offsetClause[$loc] ( limitClause[$loc] )? )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==LIMIT) ) {
                alt28=1;
            }
            else if ( (LA28_0==OFFSET) ) {
                alt28=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;

            }
            switch (alt28) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:216:8: limitClause[$loc] ( offsetClause[$loc] )?
                    {
                    pushFollow(FOLLOW_limitClause_in_limitOffsetClauses1459);
                    limitClause(loc);

                    state._fsp--;
                    if (state.failed) return ;

                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:216:26: ( offsetClause[$loc] )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==OFFSET) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:216:27: offsetClause[$loc]
                            {
                            pushFollow(FOLLOW_offsetClause_in_limitOffsetClauses1463);
                            offsetClause(loc);

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:217:5: offsetClause[$loc] ( limitClause[$loc] )?
                    {
                    pushFollow(FOLLOW_offsetClause_in_limitOffsetClauses1473);
                    offsetClause(loc);

                    state._fsp--;
                    if (state.failed) return ;

                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:217:24: ( limitClause[$loc] )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==LIMIT) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:217:25: limitClause[$loc]
                            {
                            pushFollow(FOLLOW_limitClause_in_limitOffsetClauses1477);
                            limitClause(loc);

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;

            }


            }

        }

        	catch(RecognitionException eee) {
                throw new RuntimeException(eee);
            }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "limitOffsetClauses"



    // $ANTLR start "limitClause"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:221:1: limitClause[JSONObject loc] : ^( LIMIT i= INTEGER ) ;
    public final void limitClause(JSONObject loc) throws JSONException, RecognitionException {
        XTree i=null;

        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:222:2: ( ^( LIMIT i= INTEGER ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:223:3: ^( LIMIT i= INTEGER )
            {
            match(input,LIMIT,FOLLOW_LIMIT_in_limitClause1511); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            i=(XTree)match(input,INTEGER,FOLLOW_INTEGER_in_limitClause1515); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==0 ) { loc.put("limit", Integer.parseInt((i!=null?i.getText():null))); }

            }

        }

        	catch(RecognitionException eee) {
                throw new RuntimeException(eee);
            }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "limitClause"



    // $ANTLR start "offsetClause"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:226:1: offsetClause[JSONObject loc] : ^( OFFSET i= INTEGER ) ;
    public final void offsetClause(JSONObject loc) throws JSONException, RecognitionException {
        XTree i=null;

        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:227:2: ( ^( OFFSET i= INTEGER ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:228:3: ^( OFFSET i= INTEGER )
            {
            match(input,OFFSET,FOLLOW_OFFSET_in_offsetClause1543); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            i=(XTree)match(input,INTEGER,FOLLOW_INTEGER_in_offsetClause1547); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==0 ) { loc.put("offset", Integer.parseInt((i!=null?i.getText():null))); }

            }

        }

        	catch(RecognitionException eee) {
                throw new RuntimeException(eee);
            }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "offsetClause"



    // $ANTLR start "bindingsClause"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:231:1: bindingsClause returns [JSONObject v] : d= inlineData ;
    public final JSONObject bindingsClause() throws JSONException, RecognitionException {
        JSONObject v = null;


        JSONObject d =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:232:2: (d= inlineData )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:232:6: d= inlineData
            {
            pushFollow(FOLLOW_inlineData_in_bindingsClause1575);
            d=inlineData();

            state._fsp--;
            if (state.failed) return v;

            if ( state.backtracking==0 ) { v = d; }

            }

        }

        	catch(RecognitionException eee) {
                throw new RuntimeException(eee);
            }

        finally {
        	// do for sure before leaving
        }
        return v;
    }
    // $ANTLR end "bindingsClause"



    // $ANTLR start "bindingValue"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:235:1: bindingValue : ( iRIref | rDFLiteral | numericLiteral | booleanLiteral | UNDEF ) ;
    public final void bindingValue() throws JSONException, RecognitionException {
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:236:2: ( ( iRIref | rDFLiteral | numericLiteral | booleanLiteral | UNDEF ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:236:6: ( iRIref | rDFLiteral | numericLiteral | booleanLiteral | UNDEF )
            {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:236:6: ( iRIref | rDFLiteral | numericLiteral | booleanLiteral | UNDEF )
            int alt29=5;
            switch ( input.LA(1) ) {
            case IRI:
            case PREFIXED_NAME:
            case PREFIXED_NS:
                {
                alt29=1;
                }
                break;
            case STRING:
                {
                alt29=2;
                }
                break;
            case BIG_DECIMAL:
            case BIG_INTEGER:
            case DOUBLE:
                {
                alt29=3;
                }
                break;
            case BOOLEAN:
                {
                alt29=4;
                }
                break;
            case UNDEF:
                {
                alt29=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;

            }

            switch (alt29) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:236:8: iRIref
                    {
                    pushFollow(FOLLOW_iRIref_in_bindingValue1598);
                    iRIref();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:236:17: rDFLiteral
                    {
                    pushFollow(FOLLOW_rDFLiteral_in_bindingValue1602);
                    rDFLiteral();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:236:30: numericLiteral
                    {
                    pushFollow(FOLLOW_numericLiteral_in_bindingValue1606);
                    numericLiteral();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:236:47: booleanLiteral
                    {
                    pushFollow(FOLLOW_booleanLiteral_in_bindingValue1610);
                    booleanLiteral();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:236:64: UNDEF
                    {
                    match(input,UNDEF,FOLLOW_UNDEF_in_bindingValue1614); if (state.failed) return ;

                    }
                    break;

            }


            }

        }

        	catch(RecognitionException eee) {
                throw new RuntimeException(eee);
            }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "bindingValue"



    // $ANTLR start "groupGraphPattern"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:239:1: groupGraphPattern returns [JSONObject r] : ( ^( GROUP_GRAPH_PATTERN (g= groupGraphPatternSub )? ) |s= subSelect );
    public final JSONObject groupGraphPattern() throws JSONException, RecognitionException {
        JSONObject r = null;


        JSONArray g =null;

        JSONObject s =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:240:2: ( ^( GROUP_GRAPH_PATTERN (g= groupGraphPatternSub )? ) |s= subSelect )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==GROUP_GRAPH_PATTERN) ) {
                alt31=1;
            }
            else if ( (LA31_0==SUB_SELECT) ) {
                alt31=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return r;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;

            }
            switch (alt31) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:240:6: ^( GROUP_GRAPH_PATTERN (g= groupGraphPatternSub )? )
                    {
                    match(input,GROUP_GRAPH_PATTERN,FOLLOW_GROUP_GRAPH_PATTERN_in_groupGraphPattern1639); if (state.failed) return r;

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return r;
                        // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:241:11: (g= groupGraphPatternSub )?
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==BIND||LA30_0==FILTER||LA30_0==GRAPH||LA30_0==GROUP_GRAPH_PATTERN||LA30_0==MINUS||LA30_0==OPTIONAL||LA30_0==SERVICE||LA30_0==SUB_SELECT||LA30_0==TRIPLES_BLOCK||LA30_0==UNION||LA30_0==VALUES) ) {
                            alt30=1;
                        }
                        switch (alt30) {
                            case 1 :
                                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:241:12: g= groupGraphPatternSub
                                {
                                pushFollow(FOLLOW_groupGraphPatternSub_in_groupGraphPattern1654);
                                g=groupGraphPatternSub();

                                state._fsp--;
                                if (state.failed) return r;

                                if ( state.backtracking==0 ) { r = new JSONObject();
                                              r.put("group", g); }

                                }
                                break;

                        }


                        match(input, Token.UP, null); if (state.failed) return r;
                    }


                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:244:4: s= subSelect
                    {
                    pushFollow(FOLLOW_subSelect_in_groupGraphPattern1681);
                    s=subSelect();

                    state._fsp--;
                    if (state.failed) return r;

                    if ( state.backtracking==0 ) { r = s; }

                    }
                    break;

            }
        }

        	catch(RecognitionException eee) {
                throw new RuntimeException(eee);
            }

        finally {
        	// do for sure before leaving
        }
        return r;
    }
    // $ANTLR end "groupGraphPattern"



    // $ANTLR start "groupGraphPatternSub"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:247:1: groupGraphPatternSub returns [JSONArray p] : ( triplesBlock[$p] |f= filter | graphPatternNewBGP[$p] )+ ;
    public final JSONArray groupGraphPatternSub() throws JSONException, RecognitionException {
        JSONArray p = null;


        JSONObject f =null;



              p = new JSONArray();
            
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:251:2: ( ( triplesBlock[$p] |f= filter | graphPatternNewBGP[$p] )+ )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:251:4: ( triplesBlock[$p] |f= filter | graphPatternNewBGP[$p] )+
            {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:251:4: ( triplesBlock[$p] |f= filter | graphPatternNewBGP[$p] )+
            int cnt32=0;
            loop32:
            do {
                int alt32=4;
                switch ( input.LA(1) ) {
                case TRIPLES_BLOCK:
                    {
                    alt32=1;
                    }
                    break;
                case FILTER:
                    {
                    alt32=2;
                    }
                    break;
                case BIND:
                case GRAPH:
                case GROUP_GRAPH_PATTERN:
                case MINUS:
                case OPTIONAL:
                case SERVICE:
                case SUB_SELECT:
                case UNION:
                case VALUES:
                    {
                    alt32=3;
                    }
                    break;

                }

                switch (alt32) {
            	case 1 :
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:251:10: triplesBlock[$p]
            	    {
            	    pushFollow(FOLLOW_triplesBlock_in_groupGraphPatternSub1721);
            	    triplesBlock(p);

            	    state._fsp--;
            	    if (state.failed) return p;

            	    }
            	    break;
            	case 2 :
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:252:12: f= filter
            	    {
            	    pushFollow(FOLLOW_filter_in_groupGraphPatternSub1737);
            	    f=filter();

            	    state._fsp--;
            	    if (state.failed) return p;

            	    if ( state.backtracking==0 ) { 
            	                    if (f != null) { p.put(f); }
            	                  }

            	    }
            	    break;
            	case 3 :
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:256:15: graphPatternNewBGP[$p]
            	    {
            	    pushFollow(FOLLOW_graphPatternNewBGP_in_groupGraphPatternSub1775);
            	    graphPatternNewBGP(p);

            	    state._fsp--;
            	    if (state.failed) return p;

            	    }
            	    break;

            	default :
            	    if ( cnt32 >= 1 ) break loop32;
            	    if (state.backtracking>0) {state.failed=true; return p;}
                        EarlyExitException eee =
                            new EarlyExitException(32, input);
                        throw eee;
                }
                cnt32++;
            } while (true);


            }

        }

        	catch(RecognitionException eee) {
                throw new RuntimeException(eee);
            }

        finally {
        	// do for sure before leaving
        }
        return p;
    }
    // $ANTLR end "groupGraphPatternSub"



    // $ANTLR start "triplesBlock"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:260:1: triplesBlock[JSONArray sp] : ^( TRIPLES_BLOCK (s= triples |s2= triples2[$sp] )+ ) ;
    public final void triplesBlock(JSONArray sp) throws JSONException, RecognitionException {
        JSONObject s =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:261:5: ( ^( TRIPLES_BLOCK (s= triples |s2= triples2[$sp] )+ ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:261:9: ^( TRIPLES_BLOCK (s= triples |s2= triples2[$sp] )+ )
            {
            match(input,TRIPLES_BLOCK,FOLLOW_TRIPLES_BLOCK_in_triplesBlock1814); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:262:6: (s= triples |s2= triples2[$sp] )+
            int cnt33=0;
            loop33:
            do {
                int alt33=3;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==TRIPLE) ) {
                    alt33=1;
                }
                else if ( (LA33_0==TRIPLE2) ) {
                    alt33=2;
                }


                switch (alt33) {
            	case 1 :
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:263:10: s= triples
            	    {
            	    pushFollow(FOLLOW_triples_in_triplesBlock1834);
            	    s=triples();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    if ( state.backtracking==0 ) { sp.put(s); }

            	    }
            	    break;
            	case 2 :
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:264:7: s2= triples2[$sp]
            	    {
            	    pushFollow(FOLLOW_triples2_in_triplesBlock1850);
            	    triples2(sp);

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt33 >= 1 ) break loop33;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(33, input);
                        throw eee;
                }
                cnt33++;
            } while (true);


            match(input, Token.UP, null); if (state.failed) return ;


            }

        }

        	catch(RecognitionException eee) {
                throw new RuntimeException(eee);
            }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "triplesBlock"



    // $ANTLR start "triples"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:269:1: triples returns [JSONObject qt] : ( ^( TRIPLE ^( SUBJECT s1= graphNode ) ^( PREDICATE v1= predicate ) ^( VALUE o= object ) ) ) ;
    public final JSONObject triples() throws JSONException, RecognitionException {
        JSONObject qt = null;


        Object s1 =null;

        Object v1 =null;

        Object o =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:270:2: ( ( ^( TRIPLE ^( SUBJECT s1= graphNode ) ^( PREDICATE v1= predicate ) ^( VALUE o= object ) ) ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:270:6: ( ^( TRIPLE ^( SUBJECT s1= graphNode ) ^( PREDICATE v1= predicate ) ^( VALUE o= object ) ) )
            {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:270:6: ( ^( TRIPLE ^( SUBJECT s1= graphNode ) ^( PREDICATE v1= predicate ) ^( VALUE o= object ) ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:270:8: ^( TRIPLE ^( SUBJECT s1= graphNode ) ^( PREDICATE v1= predicate ) ^( VALUE o= object ) )
            {
            match(input,TRIPLE,FOLLOW_TRIPLE_in_triples1892); if (state.failed) return qt;

            match(input, Token.DOWN, null); if (state.failed) return qt;
            match(input,SUBJECT,FOLLOW_SUBJECT_in_triples1895); if (state.failed) return qt;

            match(input, Token.DOWN, null); if (state.failed) return qt;
            pushFollow(FOLLOW_graphNode_in_triples1899);
            s1=graphNode();

            state._fsp--;
            if (state.failed) return qt;

            match(input, Token.UP, null); if (state.failed) return qt;


            match(input,PREDICATE,FOLLOW_PREDICATE_in_triples1911); if (state.failed) return qt;

            match(input, Token.DOWN, null); if (state.failed) return qt;
            pushFollow(FOLLOW_predicate_in_triples1915);
            v1=predicate();

            state._fsp--;
            if (state.failed) return qt;

            match(input, Token.UP, null); if (state.failed) return qt;


            match(input,VALUE,FOLLOW_VALUE_in_triples1929); if (state.failed) return qt;

            match(input, Token.DOWN, null); if (state.failed) return qt;
            pushFollow(FOLLOW_object_in_triples1933);
            o=object();

            state._fsp--;
            if (state.failed) return qt;

            match(input, Token.UP, null); if (state.failed) return qt;


            match(input, Token.UP, null); if (state.failed) return qt;


            if ( state.backtracking==0 ) { qt = new JSONObject();
                       qt.put("subject", s1);
                       qt.put("predicate", v1);
                       qt.put("object", o);
                     }

            }


            }

        }

        	catch(RecognitionException eee) {
                throw new RuntimeException(eee);
            }

        finally {
        	// do for sure before leaving
        }
        return qt;
    }
    // $ANTLR end "triples"



    // $ANTLR start "triples2"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:283:1: triples2[JSONArray qt] : ^( TRIPLE2 ^( SUBJECT s= triplesNode ) ( ^( PROPERTY_LIST ^( PREDICATE p= predicate ) ( ^( VALUE o= object ) )+ ) )* ) ;
    public final void triples2(JSONArray qt) throws JSONException, RecognitionException {
        JSONObject s =null;

        Object p =null;

        Object o =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:284:2: ( ^( TRIPLE2 ^( SUBJECT s= triplesNode ) ( ^( PROPERTY_LIST ^( PREDICATE p= predicate ) ( ^( VALUE o= object ) )+ ) )* ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:284:6: ^( TRIPLE2 ^( SUBJECT s= triplesNode ) ( ^( PROPERTY_LIST ^( PREDICATE p= predicate ) ( ^( VALUE o= object ) )+ ) )* )
            {
            match(input,TRIPLE2,FOLLOW_TRIPLE2_in_triples21984); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            match(input,SUBJECT,FOLLOW_SUBJECT_in_triples21987); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_triplesNode_in_triples21991);
            s=triplesNode();

            state._fsp--;
            if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:285:4: ( ^( PROPERTY_LIST ^( PREDICATE p= predicate ) ( ^( VALUE o= object ) )+ ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==PROPERTY_LIST) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:285:6: ^( PROPERTY_LIST ^( PREDICATE p= predicate ) ( ^( VALUE o= object ) )+ )
            	    {
            	    match(input,PROPERTY_LIST,FOLLOW_PROPERTY_LIST_in_triples22001); if (state.failed) return ;

            	    match(input, Token.DOWN, null); if (state.failed) return ;
            	    match(input,PREDICATE,FOLLOW_PREDICATE_in_triples22012); if (state.failed) return ;

            	    match(input, Token.DOWN, null); if (state.failed) return ;
            	    pushFollow(FOLLOW_predicate_in_triples22016);
            	    p=predicate();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    match(input, Token.UP, null); if (state.failed) return ;


            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:287:8: ( ^( VALUE o= object ) )+
            	    int cnt34=0;
            	    loop34:
            	    do {
            	        int alt34=2;
            	        int LA34_0 = input.LA(1);

            	        if ( (LA34_0==VALUE) ) {
            	            alt34=1;
            	        }


            	        switch (alt34) {
            	    	case 1 :
            	    	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:287:10: ^( VALUE o= object )
            	    	    {
            	    	    match(input,VALUE,FOLLOW_VALUE_in_triples22031); if (state.failed) return ;

            	    	    match(input, Token.DOWN, null); if (state.failed) return ;
            	    	    pushFollow(FOLLOW_object_in_triples22036);
            	    	    o=object();

            	    	    state._fsp--;
            	    	    if (state.failed) return ;

            	    	    match(input, Token.UP, null); if (state.failed) return ;


            	    	    if ( state.backtracking==0 ) { JSONObject t = new JSONObject(); 
            	    	                           t.put("subject", s);
            	    	                           t.put("predicate", p);
            	    	                           t.put("object", o);
            	    	                           qt.put(t);
            	    	                         }

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt34 >= 1 ) break loop34;
            	    	    if (state.backtracking>0) {state.failed=true; return ;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(34, input);
            	                throw eee;
            	        }
            	        cnt34++;
            	    } while (true);


            	    match(input, Token.UP, null); if (state.failed) return ;


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);


            match(input, Token.UP, null); if (state.failed) return ;


            }

        }

        	catch(RecognitionException eee) {
                throw new RuntimeException(eee);
            }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "triples2"



    // $ANTLR start "graphPatternNewBGP"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:300:1: graphPatternNewBGP[JSONArray p] : (u= groupMinusOrUnionGraphPattern |o= optionalGraphPattern |g= graphGraphPattern |s= serviceGraphPattern |b= bind |v= inlineData );
    public final void graphPatternNewBGP(JSONArray p) throws JSONException, RecognitionException {
        JSONObject u =null;

        JSONObject o =null;

        JSONObject g =null;

        JSONObject s =null;

        JSONObject b =null;

        JSONObject v =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:301:5: (u= groupMinusOrUnionGraphPattern |o= optionalGraphPattern |g= graphGraphPattern |s= serviceGraphPattern |b= bind |v= inlineData )
            int alt36=6;
            switch ( input.LA(1) ) {
            case GROUP_GRAPH_PATTERN:
            case MINUS:
            case SUB_SELECT:
            case UNION:
                {
                alt36=1;
                }
                break;
            case OPTIONAL:
                {
                alt36=2;
                }
                break;
            case GRAPH:
                {
                alt36=3;
                }
                break;
            case SERVICE:
                {
                alt36=4;
                }
                break;
            case BIND:
                {
                alt36=5;
                }
                break;
            case VALUES:
                {
                alt36=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;

            }

            switch (alt36) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:301:9: u= groupMinusOrUnionGraphPattern
                    {
                    pushFollow(FOLLOW_groupMinusOrUnionGraphPattern_in_graphPatternNewBGP2104);
                    u=groupMinusOrUnionGraphPattern();

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) { p.put(u); }

                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:303:5: o= optionalGraphPattern
                    {
                    pushFollow(FOLLOW_optionalGraphPattern_in_graphPatternNewBGP2124);
                    o=optionalGraphPattern();

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) { p.put(o); }

                    }
                    break;
                case 3 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:305:5: g= graphGraphPattern
                    {
                    pushFollow(FOLLOW_graphGraphPattern_in_graphPatternNewBGP2145);
                    g=graphGraphPattern();

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) { p.put(g); }

                    }
                    break;
                case 4 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:307:5: s= serviceGraphPattern
                    {
                    pushFollow(FOLLOW_serviceGraphPattern_in_graphPatternNewBGP2166);
                    s=serviceGraphPattern();

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) { p.put(s); }

                    }
                    break;
                case 5 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:309:5: b= bind
                    {
                    pushFollow(FOLLOW_bind_in_graphPatternNewBGP2179);
                    b=bind();

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) { p.put(b); }

                    }
                    break;
                case 6 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:311:9: v= inlineData
                    {
                    pushFollow(FOLLOW_inlineData_in_graphPatternNewBGP2202);
                    v=inlineData();

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) { p.put(v); }

                    }
                    break;

            }
        }

        	catch(RecognitionException eee) {
                throw new RuntimeException(eee);
            }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "graphPatternNewBGP"



    // $ANTLR start "inlineData"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:315:1: inlineData returns [JSONObject v] : ^( VALUES d= dataBlock ) ;
    public final JSONObject inlineData() throws JSONException, RecognitionException {
        JSONObject v = null;


        JSONObject d =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:316:5: ( ^( VALUES d= dataBlock ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:316:9: ^( VALUES d= dataBlock )
            {
            match(input,VALUES,FOLLOW_VALUES_in_inlineData2240); if (state.failed) return v;

            match(input, Token.DOWN, null); if (state.failed) return v;
            pushFollow(FOLLOW_dataBlock_in_inlineData2244);
            d=dataBlock();

            state._fsp--;
            if (state.failed) return v;

            if ( state.backtracking==0 ) { v =d; }

            match(input, Token.UP, null); if (state.failed) return v;


            }

        }

        	catch(RecognitionException eee) {
                throw new RuntimeException(eee);
            }

        finally {
        	// do for sure before leaving
        }
        return v;
    }
    // $ANTLR end "inlineData"



    // $ANTLR start "dataBlock"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:319:1: dataBlock returns [JSONObject values] : ^( INLINE_DATA ( ( NIL )=> NIL | (v= var )* ) ( ( NIL )=> NIL | (d= dataBlockValue )* ) ) ;
    public final JSONObject dataBlock() throws JSONException, RecognitionException {
        JSONObject values = null;


        String v =null;

        Object d =null;


        JSONArray vars = new JSONArray(); 
               JSONArray expressions = new JSONArray(); 
               JSONArray rowExp = null;
               int i = 0; 

               values = new JSONObject();
               values.put("vars", vars);
               values.put("exprs", expressions);
               
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:329:5: ( ^( INLINE_DATA ( ( NIL )=> NIL | (v= var )* ) ( ( NIL )=> NIL | (d= dataBlockValue )* ) ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:329:9: ^( INLINE_DATA ( ( NIL )=> NIL | (v= var )* ) ( ( NIL )=> NIL | (d= dataBlockValue )* ) )
            {
            match(input,INLINE_DATA,FOLLOW_INLINE_DATA_in_dataBlock2280); if (state.failed) return values;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return values;
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:329:23: ( ( NIL )=> NIL | (v= var )* )
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==NIL) ) {
                    int LA38_1 = input.LA(2);

                    if ( (synpred1_JSONWriter()) ) {
                        alt38=1;
                    }
                    else if ( (true) ) {
                        alt38=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return values;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 38, 1, input);

                        throw nvae;

                    }
                }
                else if ( (LA38_0==UP||(LA38_0 >= BIG_DECIMAL && LA38_0 <= BIG_INTEGER)||LA38_0==BOOLEAN||LA38_0==DOUBLE||LA38_0==IRI||(LA38_0 >= PREFIXED_NAME && LA38_0 <= PREFIXED_NS)||LA38_0==STRING||LA38_0==UNDEF||LA38_0==VAR) ) {
                    alt38=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return values;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 38, 0, input);

                    throw nvae;

                }
                switch (alt38) {
                    case 1 :
                        // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:329:25: ( NIL )=> NIL
                        {
                        match(input,NIL,FOLLOW_NIL_in_dataBlock2290); if (state.failed) return values;

                        }
                        break;
                    case 2 :
                        // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:329:40: (v= var )*
                        {
                        // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:329:40: (v= var )*
                        loop37:
                        do {
                            int alt37=2;
                            int LA37_0 = input.LA(1);

                            if ( (LA37_0==VAR) ) {
                                alt37=1;
                            }


                            switch (alt37) {
                        	case 1 :
                        	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:329:41: v= var
                        	    {
                        	    pushFollow(FOLLOW_var_in_dataBlock2297);
                        	    v=var();

                        	    state._fsp--;
                        	    if (state.failed) return values;

                        	    if ( state.backtracking==0 ) {vars.put(v);}

                        	    }
                        	    break;

                        	default :
                        	    break loop37;
                            }
                        } while (true);


                        }
                        break;

                }


                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:329:65: ( ( NIL )=> NIL | (d= dataBlockValue )* )
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==NIL) && (synpred2_JSONWriter())) {
                    alt40=1;
                }
                else if ( (LA40_0==UP||(LA40_0 >= BIG_DECIMAL && LA40_0 <= BIG_INTEGER)||LA40_0==BOOLEAN||LA40_0==DOUBLE||LA40_0==IRI||(LA40_0 >= PREFIXED_NAME && LA40_0 <= PREFIXED_NS)||LA40_0==STRING||LA40_0==UNDEF) ) {
                    alt40=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return values;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 40, 0, input);

                    throw nvae;

                }
                switch (alt40) {
                    case 1 :
                        // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:329:67: ( NIL )=> NIL
                        {
                        match(input,NIL,FOLLOW_NIL_in_dataBlock2312); if (state.failed) return values;

                        }
                        break;
                    case 2 :
                        // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:329:82: (d= dataBlockValue )*
                        {
                        // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:329:82: (d= dataBlockValue )*
                        loop39:
                        do {
                            int alt39=2;
                            int LA39_0 = input.LA(1);

                            if ( ((LA39_0 >= BIG_DECIMAL && LA39_0 <= BIG_INTEGER)||LA39_0==BOOLEAN||LA39_0==DOUBLE||LA39_0==IRI||(LA39_0 >= PREFIXED_NAME && LA39_0 <= PREFIXED_NS)||LA39_0==STRING||LA39_0==UNDEF) ) {
                                alt39=1;
                            }


                            switch (alt39) {
                        	case 1 :
                        	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:329:83: d= dataBlockValue
                        	    {
                        	    pushFollow(FOLLOW_dataBlockValue_in_dataBlock2319);
                        	    d=dataBlockValue();

                        	    state._fsp--;
                        	    if (state.failed) return values;

                        	    if ( state.backtracking==0 ) { int row = i % vars.length(); 
                        	        	  if (row == 0) {
                        	        	  	rowExp = new JSONArray();
                        	        	  	expressions.put(rowExp);
                        	        	  }
                        	        	  rowExp.put(d);
                        	        	  i++;
                        	    		}

                        	    }
                        	    break;

                        	default :
                        	    break loop39;
                            }
                        } while (true);


                        }
                        break;

                }


                match(input, Token.UP, null); if (state.failed) return values;
            }


            }

        }

        	catch(RecognitionException eee) {
                throw new RuntimeException(eee);
            }

        finally {
        	// do for sure before leaving
        }
        return values;
    }
    // $ANTLR end "dataBlock"



    // $ANTLR start "dataBlockValue"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:340:1: dataBlockValue returns [Object e] : (i= iRIref |r= rDFLiteral |d= numericLiteral |b= booleanLiteral |u= UNDEF );
    public final Object dataBlockValue() throws JSONException, RecognitionException {
        Object e = null;


        XTree u=null;
        IRI i =null;

        StringLiteral r =null;

        Constant d =null;

        Boolean b =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:341:2: (i= iRIref |r= rDFLiteral |d= numericLiteral |b= booleanLiteral |u= UNDEF )
            int alt41=5;
            switch ( input.LA(1) ) {
            case IRI:
            case PREFIXED_NAME:
            case PREFIXED_NS:
                {
                alt41=1;
                }
                break;
            case STRING:
                {
                alt41=2;
                }
                break;
            case BIG_DECIMAL:
            case BIG_INTEGER:
            case DOUBLE:
                {
                alt41=3;
                }
                break;
            case BOOLEAN:
                {
                alt41=4;
                }
                break;
            case UNDEF:
                {
                alt41=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return e;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;

            }

            switch (alt41) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:341:7: i= iRIref
                    {
                    pushFollow(FOLLOW_iRIref_in_dataBlockValue2359);
                    i=iRIref();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) {e = i;}

                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:342:7: r= rDFLiteral
                    {
                    pushFollow(FOLLOW_rDFLiteral_in_dataBlockValue2375);
                    r=rDFLiteral();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) {e = r;}

                    }
                    break;
                case 3 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:343:7: d= numericLiteral
                    {
                    pushFollow(FOLLOW_numericLiteral_in_dataBlockValue2390);
                    d=numericLiteral();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) {e = d;}

                    }
                    break;
                case 4 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:344:7: b= booleanLiteral
                    {
                    pushFollow(FOLLOW_booleanLiteral_in_dataBlockValue2405);
                    b=booleanLiteral();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) {e = b;}

                    }
                    break;
                case 5 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:345:7: u= UNDEF
                    {
                    u=(XTree)match(input,UNDEF,FOLLOW_UNDEF_in_dataBlockValue2421); if (state.failed) return e;

                    if ( state.backtracking==0 ) {e = "UNDEF";}

                    }
                    break;

            }
        }

        	catch(RecognitionException eee) {
                throw new RuntimeException(eee);
            }

        finally {
        	// do for sure before leaving
        }
        return e;
    }
    // $ANTLR end "dataBlockValue"



    // $ANTLR start "optionalGraphPattern"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:348:1: optionalGraphPattern returns [JSONObject p] : ^( OPTIONAL g= groupGraphPattern ) ;
    public final JSONObject optionalGraphPattern() throws JSONException, RecognitionException {
        JSONObject p = null;


        JSONObject g =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:349:2: ( ^( OPTIONAL g= groupGraphPattern ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:349:7: ^( OPTIONAL g= groupGraphPattern )
            {
            match(input,OPTIONAL,FOLLOW_OPTIONAL_in_optionalGraphPattern2455); if (state.failed) return p;

            match(input, Token.DOWN, null); if (state.failed) return p;
            pushFollow(FOLLOW_groupGraphPattern_in_optionalGraphPattern2459);
            g=groupGraphPattern();

            state._fsp--;
            if (state.failed) return p;

            match(input, Token.UP, null); if (state.failed) return p;


            if ( state.backtracking==0 ) { 
                       p = new JSONObject();
                       p.put("optional", g); 
                     }

            }

        }

        	catch(RecognitionException eee) {
                throw new RuntimeException(eee);
            }

        finally {
        	// do for sure before leaving
        }
        return p;
    }
    // $ANTLR end "optionalGraphPattern"



    // $ANTLR start "graphGraphPattern"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:356:1: graphGraphPattern returns [JSONObject p] : ^( GRAPH r= varOrIRIref2 g= groupGraphPattern ) ;
    public final JSONObject graphGraphPattern() throws JSONException, RecognitionException {
        JSONObject p = null;


        Object r =null;

        JSONObject g =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:357:2: ( ^( GRAPH r= varOrIRIref2 g= groupGraphPattern ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:357:7: ^( GRAPH r= varOrIRIref2 g= groupGraphPattern )
            {
            match(input,GRAPH,FOLLOW_GRAPH_in_graphGraphPattern2502); if (state.failed) return p;

            match(input, Token.DOWN, null); if (state.failed) return p;
            pushFollow(FOLLOW_varOrIRIref2_in_graphGraphPattern2506);
            r=varOrIRIref2();

            state._fsp--;
            if (state.failed) return p;

            pushFollow(FOLLOW_groupGraphPattern_in_graphGraphPattern2510);
            g=groupGraphPattern();

            state._fsp--;
            if (state.failed) return p;

            match(input, Token.UP, null); if (state.failed) return p;


            if ( state.backtracking==0 ) { 
                       p = new JSONObject();
                       p.put("graph", r); 
                       p.put("pattern", g); 
                     }

            }

        }

        	catch(RecognitionException eee) {
                throw new RuntimeException(eee);
            }

        finally {
        	// do for sure before leaving
        }
        return p;
    }
    // $ANTLR end "graphGraphPattern"



    // $ANTLR start "serviceGraphPattern"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:365:1: serviceGraphPattern returns [JSONObject p] : ^( SERVICE ( SILENT )? s= varOrIRIref g= groupGraphPattern ) ;
    public final JSONObject serviceGraphPattern() throws JSONException, RecognitionException {
        JSONObject p = null;


        Object s =null;

        JSONObject g =null;


         
                    p = new JSONObject();
                  
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:369:2: ( ^( SERVICE ( SILENT )? s= varOrIRIref g= groupGraphPattern ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:369:7: ^( SERVICE ( SILENT )? s= varOrIRIref g= groupGraphPattern )
            {
            match(input,SERVICE,FOLLOW_SERVICE_in_serviceGraphPattern2557); if (state.failed) return p;

            match(input, Token.DOWN, null); if (state.failed) return p;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:370:12: ( SILENT )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==SILENT) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:370:13: SILENT
                    {
                    match(input,SILENT,FOLLOW_SILENT_in_serviceGraphPattern2572); if (state.failed) return p;

                    if ( state.backtracking==0 ) { p.put("silent", true); }

                    }
                    break;

            }


            pushFollow(FOLLOW_varOrIRIref_in_serviceGraphPattern2592);
            s=varOrIRIref();

            state._fsp--;
            if (state.failed) return p;

            pushFollow(FOLLOW_groupGraphPattern_in_serviceGraphPattern2608);
            g=groupGraphPattern();

            state._fsp--;
            if (state.failed) return p;

            match(input, Token.UP, null); if (state.failed) return p;


            if ( state.backtracking==0 ) {
                       p.put("service", s); 
                       p.put("pattern", g); 
                     }

            }

        }

        	catch(RecognitionException eee) {
                throw new RuntimeException(eee);
            }

        finally {
        	// do for sure before leaving
        }
        return p;
    }
    // $ANTLR end "serviceGraphPattern"



    // $ANTLR start "bind"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:379:1: bind returns [JSONObject p] : ^( BIND v= var e= expression ) ;
    public final JSONObject bind() throws JSONException, RecognitionException {
        JSONObject p = null;


        String v =null;

        JSONObject e =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:380:2: ( ^( BIND v= var e= expression ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:380:7: ^( BIND v= var e= expression )
            {
            match(input,BIND,FOLLOW_BIND_in_bind2644); if (state.failed) return p;

            match(input, Token.DOWN, null); if (state.failed) return p;
            pushFollow(FOLLOW_var_in_bind2648);
            v=var();

            state._fsp--;
            if (state.failed) return p;

            pushFollow(FOLLOW_expression_in_bind2654);
            e=expression();

            state._fsp--;
            if (state.failed) return p;

            match(input, Token.UP, null); if (state.failed) return p;


            if ( state.backtracking==0 ) { 
                       p = new JSONObject();
                       p.put("var", v);
                       p.put("expr", e);
                     }

            }

        }

        	catch(RecognitionException eee) {
                throw new RuntimeException(eee);
            }

        finally {
        	// do for sure before leaving
        }
        return p;
    }
    // $ANTLR end "bind"



    // $ANTLR start "groupMinusOrUnionGraphPattern"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:388:1: groupMinusOrUnionGraphPattern returns [JSONObject p] : ( ^( UNION g1= groupGraphPattern (g2= groupGraphPattern )+ ) | ^( MINUS g1= groupGraphPattern ) |g3= groupGraphPattern );
    public final JSONObject groupMinusOrUnionGraphPattern() throws JSONException, RecognitionException {
        JSONObject p = null;


        JSONObject g1 =null;

        JSONObject g2 =null;

        JSONObject g3 =null;


         JSONArray x = null; 
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:390:2: ( ^( UNION g1= groupGraphPattern (g2= groupGraphPattern )+ ) | ^( MINUS g1= groupGraphPattern ) |g3= groupGraphPattern )
            int alt44=3;
            switch ( input.LA(1) ) {
            case UNION:
                {
                alt44=1;
                }
                break;
            case MINUS:
                {
                alt44=2;
                }
                break;
            case GROUP_GRAPH_PATTERN:
            case SUB_SELECT:
                {
                alt44=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return p;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;

            }

            switch (alt44) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:390:6: ^( UNION g1= groupGraphPattern (g2= groupGraphPattern )+ )
                    {
                    match(input,UNION,FOLLOW_UNION_in_groupMinusOrUnionGraphPattern2702); if (state.failed) return p;

                    match(input, Token.DOWN, null); if (state.failed) return p;
                    pushFollow(FOLLOW_groupGraphPattern_in_groupMinusOrUnionGraphPattern2723);
                    g1=groupGraphPattern();

                    state._fsp--;
                    if (state.failed) return p;

                    if ( state.backtracking==0 ) { 
                                	  p = new JSONObject();
                                      x = new JSONArray();
                                      p.put("union", x);
                                      x.put(g1);
                                  	}

                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:398:5: (g2= groupGraphPattern )+
                    int cnt43=0;
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==GROUP_GRAPH_PATTERN||LA43_0==SUB_SELECT) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:398:6: g2= groupGraphPattern
                    	    {
                    	    pushFollow(FOLLOW_groupGraphPattern_in_groupMinusOrUnionGraphPattern2751);
                    	    g2=groupGraphPattern();

                    	    state._fsp--;
                    	    if (state.failed) return p;

                    	    if ( state.backtracking==0 ) { 
                    	                       x.put(g2); 
                    	                     }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt43 >= 1 ) break loop43;
                    	    if (state.backtracking>0) {state.failed=true; return p;}
                                EarlyExitException eee =
                                    new EarlyExitException(43, input);
                                throw eee;
                        }
                        cnt43++;
                    } while (true);


                    match(input, Token.UP, null); if (state.failed) return p;


                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:402:9: ^( MINUS g1= groupGraphPattern )
                    {
                    match(input,MINUS,FOLLOW_MINUS_in_groupMinusOrUnionGraphPattern2785); if (state.failed) return p;

                    match(input, Token.DOWN, null); if (state.failed) return p;
                    pushFollow(FOLLOW_groupGraphPattern_in_groupMinusOrUnionGraphPattern2800);
                    g1=groupGraphPattern();

                    state._fsp--;
                    if (state.failed) return p;

                    if ( state.backtracking==0 ) { p = new JSONObject();
                                 p.put("minus", g1); }

                    match(input, Token.UP, null); if (state.failed) return p;


                    }
                    break;
                case 3 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:407:7: g3= groupGraphPattern
                    {
                    pushFollow(FOLLOW_groupGraphPattern_in_groupMinusOrUnionGraphPattern2835);
                    g3=groupGraphPattern();

                    state._fsp--;
                    if (state.failed) return p;

                    if ( state.backtracking==0 ) { 
                              p = g3;
                            }

                    }
                    break;

            }
        }

        	catch(RecognitionException eee) {
                throw new RuntimeException(eee);
            }

        finally {
        	// do for sure before leaving
        }
        return p;
    }
    // $ANTLR end "groupMinusOrUnionGraphPattern"



    // $ANTLR start "filter"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:413:1: filter returns [JSONObject e] : ^( FILTER c= constraint ) ;
    public final JSONObject filter() throws JSONException, RecognitionException {
        JSONObject e = null;


        Object c =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:414:2: ( ^( FILTER c= constraint ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:414:6: ^( FILTER c= constraint )
            {
            match(input,FILTER,FOLLOW_FILTER_in_filter2867); if (state.failed) return e;

            match(input, Token.DOWN, null); if (state.failed) return e;
            pushFollow(FOLLOW_constraint_in_filter2871);
            c=constraint();

            state._fsp--;
            if (state.failed) return e;

            match(input, Token.UP, null); if (state.failed) return e;


            if ( state.backtracking==0 ) { e = new JSONObject(); e.put("filter", c); }

            }

        }

        	catch(RecognitionException eee) {
                throw new RuntimeException(eee);
            }

        finally {
        	// do for sure before leaving
        }
        return e;
    }
    // $ANTLR end "filter"



    // $ANTLR start "constraint"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:417:1: constraint returns [Object e] : (be= brackettedExpression |bc= builtInCall |fc= functionCall );
    public final Object constraint() throws JSONException, RecognitionException {
        Object e = null;


        Object be =null;

        JSONObject bc =null;

        JSONObject fc =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:418:2: (be= brackettedExpression |bc= builtInCall |fc= functionCall )
            int alt45=3;
            switch ( input.LA(1) ) {
            case EXPRESSION:
                {
                alt45=1;
                }
                break;
            case ABS:
            case BNODE:
            case BOUND:
            case CEIL:
            case COALESCE:
            case CONCAT:
            case CONTAINS:
            case DATATYPE:
            case DAY:
            case ENCODE_FOR_URI:
            case EXISTS:
            case FLOOR:
            case HOURS:
            case IF:
            case IRI:
            case ISBLANK:
            case ISIRI:
            case ISLITERAL:
            case ISNUMERIC:
            case ISURI:
            case LANG:
            case LANGMATCHES:
            case LCASE:
            case MD5:
            case MINUTES:
            case MONTH:
            case NOT_EXISTS:
            case NOW:
            case RAND:
            case REGEX:
            case REPLACE:
            case ROUND:
            case SAMETERM:
            case SECONDS:
            case SHA1:
            case SHA256:
            case SHA384:
            case SHA512:
            case STR:
            case STRAFTER:
            case STRBEFORE:
            case STRDT:
            case STRENDS:
            case STRLANG:
            case STRLEN:
            case STRSTARTS:
            case STRUUID:
            case SUBSTR:
            case TIMEZONE:
            case TZ:
            case UCASE:
            case URI:
            case UUID:
            case YEAR:
                {
                alt45=2;
                }
                break;
            case FUNCTION:
                {
                alt45=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return e;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;

            }

            switch (alt45) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:418:6: be= brackettedExpression
                    {
                    pushFollow(FOLLOW_brackettedExpression_in_constraint2899);
                    be=brackettedExpression();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { e = be; }

                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:419:5: bc= builtInCall
                    {
                    pushFollow(FOLLOW_builtInCall_in_constraint2909);
                    bc=builtInCall();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { e = bc; }

                    }
                    break;
                case 3 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:420:5: fc= functionCall
                    {
                    pushFollow(FOLLOW_functionCall_in_constraint2922);
                    fc=functionCall();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { e = fc; }

                    }
                    break;

            }
        }

        	catch(RecognitionException eee) {
                throw new RuntimeException(eee);
            }

        finally {
        	// do for sure before leaving
        }
        return e;
    }
    // $ANTLR end "constraint"



    // $ANTLR start "functionCall"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:423:1: functionCall returns [JSONObject fc] : ^( FUNCTION i= iRIref a= argList ) ;
    public final JSONObject functionCall() throws JSONException, RecognitionException {
        JSONObject fc = null;


        IRI i =null;

        JSONArray a =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:424:2: ( ^( FUNCTION i= iRIref a= argList ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:424:6: ^( FUNCTION i= iRIref a= argList )
            {
            match(input,FUNCTION,FOLLOW_FUNCTION_in_functionCall2948); if (state.failed) return fc;

            match(input, Token.DOWN, null); if (state.failed) return fc;
            pushFollow(FOLLOW_iRIref_in_functionCall2952);
            i=iRIref();

            state._fsp--;
            if (state.failed) return fc;

            pushFollow(FOLLOW_argList_in_functionCall2956);
            a=argList();

            state._fsp--;
            if (state.failed) return fc;

            match(input, Token.UP, null); if (state.failed) return fc;


            if ( state.backtracking==0 ) { 
                      fc = new JSONObject();
                      fc.put("function", i);
                      fc.put("args", a);
                    }

            }

        }

        	catch(RecognitionException eee) {
                throw new RuntimeException(eee);
            }

        finally {
        	// do for sure before leaving
        }
        return fc;
    }
    // $ANTLR end "functionCall"



    // $ANTLR start "argList"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:432:1: argList returns [JSONArray args] : ( NIL | DISTINCT (e1= expression )+ | (e2= expression )+ );
    public final JSONArray argList() throws JSONException, RecognitionException {
        JSONArray args = null;


        JSONObject e1 =null;

        JSONObject e2 =null;


         args = new JSONArray(); 
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:434:5: ( NIL | DISTINCT (e1= expression )+ | (e2= expression )+ )
            int alt48=3;
            switch ( input.LA(1) ) {
            case NIL:
                {
                alt48=1;
                }
                break;
            case DISTINCT:
                {
                alt48=2;
                }
                break;
            case ABS:
            case AVG:
            case BIG_DECIMAL:
            case BIG_INTEGER:
            case BNODE:
            case BOOLEAN:
            case BOUND:
            case BROKEN_MINUS:
            case BROKEN_PLUS:
            case CEIL:
            case COALESCE:
            case CONCAT:
            case CONTAINS:
            case COUNT:
            case DATATYPE:
            case DAY:
            case DOUBLE:
            case ENCODE_FOR_URI:
            case EXISTS:
            case EXPRESSION:
            case FLOOR:
            case FUNCTION:
            case GROUP_CONCAT:
            case HOURS:
            case IF:
            case IN:
            case IRI:
            case ISBLANK:
            case ISIRI:
            case ISLITERAL:
            case ISNUMERIC:
            case ISURI:
            case LANG:
            case LANGMATCHES:
            case LCASE:
            case LOGICAL_AND:
            case LOGICAL_OR:
            case LT:
            case LTE:
            case MAX:
            case MD5:
            case MIN:
            case MINUTES:
            case MONTH:
            case NOT:
            case NOT_EXISTS:
            case NOW:
            case PREFIXED_NAME:
            case PREFIXED_NS:
            case RAND:
            case REGEX:
            case REPLACE:
            case ROUND:
            case SAMETERM:
            case SAMPLE:
            case SECONDS:
            case SHA1:
            case SHA256:
            case SHA384:
            case SHA512:
            case STR:
            case STRAFTER:
            case STRBEFORE:
            case STRDT:
            case STRENDS:
            case STRING:
            case STRLANG:
            case STRLEN:
            case STRSTARTS:
            case STRUUID:
            case SUBSTR:
            case SUM:
            case TIMEZONE:
            case TZ:
            case UCASE:
            case URI:
            case UUID:
            case VAR:
            case YEAR:
            case 251:
            case 252:
            case 253:
            case 254:
            case 255:
            case 256:
            case 257:
            case 258:
            case 259:
                {
                alt48=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return args;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;

            }

            switch (alt48) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:434:9: NIL
                    {
                    match(input,NIL,FOLLOW_NIL_in_argList2998); if (state.failed) return args;

                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:435:6: DISTINCT (e1= expression )+
                    {
                    match(input,DISTINCT,FOLLOW_DISTINCT_in_argList3011); if (state.failed) return args;

                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:435:15: (e1= expression )+
                    int cnt46=0;
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==ABS||LA46_0==AVG||(LA46_0 >= BIG_DECIMAL && LA46_0 <= BIG_INTEGER)||(LA46_0 >= BNODE && LA46_0 <= BROKEN_PLUS)||LA46_0==CEIL||LA46_0==COALESCE||LA46_0==CONCAT||LA46_0==CONTAINS||LA46_0==COUNT||(LA46_0 >= DATATYPE && LA46_0 <= DAY)||LA46_0==DOUBLE||LA46_0==ENCODE_FOR_URI||LA46_0==EXISTS||LA46_0==EXPRESSION||LA46_0==FLOOR||LA46_0==FUNCTION||LA46_0==GROUP_CONCAT||LA46_0==HOURS||(LA46_0 >= IF && LA46_0 <= IN)||LA46_0==IRI||(LA46_0 >= ISBLANK && LA46_0 <= ISURI)||(LA46_0 >= LANG && LA46_0 <= LANGMATCHES)||LA46_0==LCASE||(LA46_0 >= LOGICAL_AND && LA46_0 <= LTE)||(LA46_0 >= MAX && LA46_0 <= MIN)||LA46_0==MINUTES||LA46_0==MONTH||(LA46_0 >= NOT && LA46_0 <= NOT_EXISTS)||LA46_0==NOW||(LA46_0 >= PREFIXED_NAME && LA46_0 <= PREFIXED_NS)||LA46_0==RAND||(LA46_0 >= REGEX && LA46_0 <= REPLACE)||LA46_0==ROUND||(LA46_0 >= SAMETERM && LA46_0 <= SECONDS)||LA46_0==SHA1||(LA46_0 >= SHA256 && LA46_0 <= SHA512)||(LA46_0 >= STR && LA46_0 <= STRING)||(LA46_0 >= STRLANG && LA46_0 <= STRUUID)||LA46_0==SUBSTR||LA46_0==SUM||LA46_0==TIMEZONE||LA46_0==TZ||LA46_0==UCASE||LA46_0==URI||LA46_0==UUID||LA46_0==VAR||LA46_0==YEAR||(LA46_0 >= 251 && LA46_0 <= 259)) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:435:16: e1= expression
                    	    {
                    	    pushFollow(FOLLOW_expression_in_argList3016);
                    	    e1=expression();

                    	    state._fsp--;
                    	    if (state.failed) return args;

                    	    if ( state.backtracking==0 ) { args.put(e1); }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt46 >= 1 ) break loop46;
                    	    if (state.backtracking>0) {state.failed=true; return args;}
                                EarlyExitException eee =
                                    new EarlyExitException(46, input);
                                throw eee;
                        }
                        cnt46++;
                    } while (true);


                    }
                    break;
                case 3 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:436:4: (e2= expression )+
                    {
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:436:4: (e2= expression )+
                    int cnt47=0;
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==ABS||LA47_0==AVG||(LA47_0 >= BIG_DECIMAL && LA47_0 <= BIG_INTEGER)||(LA47_0 >= BNODE && LA47_0 <= BROKEN_PLUS)||LA47_0==CEIL||LA47_0==COALESCE||LA47_0==CONCAT||LA47_0==CONTAINS||LA47_0==COUNT||(LA47_0 >= DATATYPE && LA47_0 <= DAY)||LA47_0==DOUBLE||LA47_0==ENCODE_FOR_URI||LA47_0==EXISTS||LA47_0==EXPRESSION||LA47_0==FLOOR||LA47_0==FUNCTION||LA47_0==GROUP_CONCAT||LA47_0==HOURS||(LA47_0 >= IF && LA47_0 <= IN)||LA47_0==IRI||(LA47_0 >= ISBLANK && LA47_0 <= ISURI)||(LA47_0 >= LANG && LA47_0 <= LANGMATCHES)||LA47_0==LCASE||(LA47_0 >= LOGICAL_AND && LA47_0 <= LTE)||(LA47_0 >= MAX && LA47_0 <= MIN)||LA47_0==MINUTES||LA47_0==MONTH||(LA47_0 >= NOT && LA47_0 <= NOT_EXISTS)||LA47_0==NOW||(LA47_0 >= PREFIXED_NAME && LA47_0 <= PREFIXED_NS)||LA47_0==RAND||(LA47_0 >= REGEX && LA47_0 <= REPLACE)||LA47_0==ROUND||(LA47_0 >= SAMETERM && LA47_0 <= SECONDS)||LA47_0==SHA1||(LA47_0 >= SHA256 && LA47_0 <= SHA512)||(LA47_0 >= STR && LA47_0 <= STRING)||(LA47_0 >= STRLANG && LA47_0 <= STRUUID)||LA47_0==SUBSTR||LA47_0==SUM||LA47_0==TIMEZONE||LA47_0==TZ||LA47_0==UCASE||LA47_0==URI||LA47_0==UUID||LA47_0==VAR||LA47_0==YEAR||(LA47_0 >= 251 && LA47_0 <= 259)) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:436:5: e2= expression
                    	    {
                    	    pushFollow(FOLLOW_expression_in_argList3029);
                    	    e2=expression();

                    	    state._fsp--;
                    	    if (state.failed) return args;

                    	    if ( state.backtracking==0 ) { args.put(e2); }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt47 >= 1 ) break loop47;
                    	    if (state.backtracking>0) {state.failed=true; return args;}
                                EarlyExitException eee =
                                    new EarlyExitException(47, input);
                                throw eee;
                        }
                        cnt47++;
                    } while (true);


                    }
                    break;

            }
        }

        	catch(RecognitionException eee) {
                throw new RuntimeException(eee);
            }

        finally {
        	// do for sure before leaving
        }
        return args;
    }
    // $ANTLR end "argList"



    // $ANTLR start "expressionList"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:439:1: expressionList returns [JSONArray exprs] : ( NIL | (e= expression )+ );
    public final JSONArray expressionList() throws JSONException, RecognitionException {
        JSONArray exprs = null;


        JSONObject e =null;


         exprs = new JSONArray(); 
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:441:2: ( NIL | (e= expression )+ )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==NIL) ) {
                alt50=1;
            }
            else if ( (LA50_0==ABS||LA50_0==AVG||(LA50_0 >= BIG_DECIMAL && LA50_0 <= BIG_INTEGER)||(LA50_0 >= BNODE && LA50_0 <= BROKEN_PLUS)||LA50_0==CEIL||LA50_0==COALESCE||LA50_0==CONCAT||LA50_0==CONTAINS||LA50_0==COUNT||(LA50_0 >= DATATYPE && LA50_0 <= DAY)||LA50_0==DOUBLE||LA50_0==ENCODE_FOR_URI||LA50_0==EXISTS||LA50_0==EXPRESSION||LA50_0==FLOOR||LA50_0==FUNCTION||LA50_0==GROUP_CONCAT||LA50_0==HOURS||(LA50_0 >= IF && LA50_0 <= IN)||LA50_0==IRI||(LA50_0 >= ISBLANK && LA50_0 <= ISURI)||(LA50_0 >= LANG && LA50_0 <= LANGMATCHES)||LA50_0==LCASE||(LA50_0 >= LOGICAL_AND && LA50_0 <= LTE)||(LA50_0 >= MAX && LA50_0 <= MIN)||LA50_0==MINUTES||LA50_0==MONTH||(LA50_0 >= NOT && LA50_0 <= NOT_EXISTS)||LA50_0==NOW||(LA50_0 >= PREFIXED_NAME && LA50_0 <= PREFIXED_NS)||LA50_0==RAND||(LA50_0 >= REGEX && LA50_0 <= REPLACE)||LA50_0==ROUND||(LA50_0 >= SAMETERM && LA50_0 <= SECONDS)||LA50_0==SHA1||(LA50_0 >= SHA256 && LA50_0 <= SHA512)||(LA50_0 >= STR && LA50_0 <= STRING)||(LA50_0 >= STRLANG && LA50_0 <= STRUUID)||LA50_0==SUBSTR||LA50_0==SUM||LA50_0==TIMEZONE||LA50_0==TZ||LA50_0==UCASE||LA50_0==URI||LA50_0==UUID||LA50_0==VAR||LA50_0==YEAR||(LA50_0 >= 251 && LA50_0 <= 259)) ) {
                alt50=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return exprs;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;

            }
            switch (alt50) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:441:6: NIL
                    {
                    match(input,NIL,FOLLOW_NIL_in_expressionList3068); if (state.failed) return exprs;

                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:442:6: (e= expression )+
                    {
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:442:6: (e= expression )+
                    int cnt49=0;
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==ABS||LA49_0==AVG||(LA49_0 >= BIG_DECIMAL && LA49_0 <= BIG_INTEGER)||(LA49_0 >= BNODE && LA49_0 <= BROKEN_PLUS)||LA49_0==CEIL||LA49_0==COALESCE||LA49_0==CONCAT||LA49_0==CONTAINS||LA49_0==COUNT||(LA49_0 >= DATATYPE && LA49_0 <= DAY)||LA49_0==DOUBLE||LA49_0==ENCODE_FOR_URI||LA49_0==EXISTS||LA49_0==EXPRESSION||LA49_0==FLOOR||LA49_0==FUNCTION||LA49_0==GROUP_CONCAT||LA49_0==HOURS||(LA49_0 >= IF && LA49_0 <= IN)||LA49_0==IRI||(LA49_0 >= ISBLANK && LA49_0 <= ISURI)||(LA49_0 >= LANG && LA49_0 <= LANGMATCHES)||LA49_0==LCASE||(LA49_0 >= LOGICAL_AND && LA49_0 <= LTE)||(LA49_0 >= MAX && LA49_0 <= MIN)||LA49_0==MINUTES||LA49_0==MONTH||(LA49_0 >= NOT && LA49_0 <= NOT_EXISTS)||LA49_0==NOW||(LA49_0 >= PREFIXED_NAME && LA49_0 <= PREFIXED_NS)||LA49_0==RAND||(LA49_0 >= REGEX && LA49_0 <= REPLACE)||LA49_0==ROUND||(LA49_0 >= SAMETERM && LA49_0 <= SECONDS)||LA49_0==SHA1||(LA49_0 >= SHA256 && LA49_0 <= SHA512)||(LA49_0 >= STR && LA49_0 <= STRING)||(LA49_0 >= STRLANG && LA49_0 <= STRUUID)||LA49_0==SUBSTR||LA49_0==SUM||LA49_0==TIMEZONE||LA49_0==TZ||LA49_0==UCASE||LA49_0==URI||LA49_0==UUID||LA49_0==VAR||LA49_0==YEAR||(LA49_0 >= 251 && LA49_0 <= 259)) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:442:8: e= expression
                    	    {
                    	    pushFollow(FOLLOW_expression_in_expressionList3091);
                    	    e=expression();

                    	    state._fsp--;
                    	    if (state.failed) return exprs;

                    	    if ( state.backtracking==0 ) { exprs.put(e); }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt49 >= 1 ) break loop49;
                    	    if (state.backtracking>0) {state.failed=true; return exprs;}
                                EarlyExitException eee =
                                    new EarlyExitException(49, input);
                                throw eee;
                        }
                        cnt49++;
                    } while (true);


                    }
                    break;

            }
        }

        	catch(RecognitionException eee) {
                throw new RuntimeException(eee);
            }

        finally {
        	// do for sure before leaving
        }
        return exprs;
    }
    // $ANTLR end "expressionList"



    // $ANTLR start "object"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:446:1: object returns [Object r] : g= graphNode ;
    public final Object object() throws JSONException, RecognitionException {
        Object r = null;


        Object g =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:447:2: (g= graphNode )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:447:6: g= graphNode
            {
            pushFollow(FOLLOW_graphNode_in_object3120);
            g=graphNode();

            state._fsp--;
            if (state.failed) return r;

            if ( state.backtracking==0 ) { r = g; }

            }

        }

        	catch(RecognitionException eee) {
                throw new RuntimeException(eee);
            }

        finally {
        	// do for sure before leaving
        }
        return r;
    }
    // $ANTLR end "object"



    // $ANTLR start "verb"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:450:1: verb returns [Object t] : (v= varOrIRIref | 'a' );
    public final Object verb() throws JSONException, RecognitionException {
        Object t = null;


        Object v =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:451:2: (v= varOrIRIref | 'a' )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==IRI||(LA51_0 >= PREFIXED_NAME && LA51_0 <= PREFIXED_NS)||LA51_0==VAR) ) {
                alt51=1;
            }
            else if ( (LA51_0==263) ) {
                alt51=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return t;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;

            }
            switch (alt51) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:451:6: v= varOrIRIref
                    {
                    pushFollow(FOLLOW_varOrIRIref_in_verb3146);
                    v=varOrIRIref();

                    state._fsp--;
                    if (state.failed) return t;

                    if ( state.backtracking==0 ) { t = v; }

                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:452:5: 'a'
                    {
                    match(input,263,FOLLOW_263_in_verb3156); if (state.failed) return t;

                    if ( state.backtracking==0 ) { t = new IRI("http://www.w3.org/1999/02/22-rdf-syntax-ns#type"); }

                    }
                    break;

            }
        }

        	catch(RecognitionException eee) {
                throw new RuntimeException(eee);
            }

        finally {
        	// do for sure before leaving
        }
        return t;
    }
    // $ANTLR end "verb"



    // $ANTLR start "verbPath"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:455:1: verbPath : path ;
    public final void verbPath() throws JSONException, RecognitionException {
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:456:2: ( path )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:456:6: path
            {
            pushFollow(FOLLOW_path_in_verbPath3178);
            path();

            state._fsp--;
            if (state.failed) return ;

            }

        }

        	catch(RecognitionException eee) {
                throw new RuntimeException(eee);
            }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "verbPath"



    // $ANTLR start "verbSimple"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:459:1: verbSimple : var ;
    public final void verbSimple() throws JSONException, RecognitionException {
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:460:2: ( var )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:460:6: var
            {
            pushFollow(FOLLOW_var_in_verbSimple3195);
            var();

            state._fsp--;
            if (state.failed) return ;

            }

        }

        	catch(RecognitionException eee) {
                throw new RuntimeException(eee);
            }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "verbSimple"



    // $ANTLR start "path"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:463:1: path returns [Object o] : p= pathAlternative ;
    public final Object path() throws JSONException, RecognitionException {
        Object o = null;


        Object p =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:464:2: (p= pathAlternative )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:464:6: p= pathAlternative
            {
            pushFollow(FOLLOW_pathAlternative_in_path3218);
            p=pathAlternative();

            state._fsp--;
            if (state.failed) return o;

            if ( state.backtracking==0 ) { o = p; }

            }

        }

        	catch(RecognitionException eee) {
                throw new RuntimeException(eee);
            }

        finally {
        	// do for sure before leaving
        }
        return o;
    }
    // $ANTLR end "path"



    // $ANTLR start "pathAlternative"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:467:1: pathAlternative returns [Object o] : l= pathSequence ( '|' r= pathSequence )* ;
    public final Object pathAlternative() throws JSONException, RecognitionException {
        Object o = null;


        Object l =null;

        Object r =null;


         JSONArray x = new JSONArray(); 
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:469:2: (l= pathSequence ( '|' r= pathSequence )* )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:469:6: l= pathSequence ( '|' r= pathSequence )*
            {
            pushFollow(FOLLOW_pathSequence_in_pathAlternative3252);
            l=pathSequence();

            state._fsp--;
            if (state.failed) return o;

            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:469:21: ( '|' r= pathSequence )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==264) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:469:23: '|' r= pathSequence
            	    {
            	    match(input,264,FOLLOW_264_in_pathAlternative3256); if (state.failed) return o;

            	    pushFollow(FOLLOW_pathSequence_in_pathAlternative3260);
            	    r=pathSequence();

            	    state._fsp--;
            	    if (state.failed) return o;

            	    if ( state.backtracking==0 ) { if (x.length()==0) { x.put(l); } x.put(r); }

            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);


            if ( state.backtracking==0 ) {
                  if (x.length() > 0) {
                    o = new JSONObject();
                    ((JSONObject)o).put("alts", x);
                  } else {
                    o = l;
                  }
                }

            }

        }

        	catch(RecognitionException eee) {
                throw new RuntimeException(eee);
            }

        finally {
        	// do for sure before leaving
        }
        return o;
    }
    // $ANTLR end "pathAlternative"



    // $ANTLR start "pathSequence"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:480:1: pathSequence returns [Object o] : l= pathEltOrInverse ( '/' r= pathEltOrInverse )* ;
    public final Object pathSequence() throws JSONException, RecognitionException {
        Object o = null;


        Object l =null;

        Object r =null;



              JSONArray x = new JSONArray();
            
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:484:2: (l= pathEltOrInverse ( '/' r= pathEltOrInverse )* )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:484:7: l= pathEltOrInverse ( '/' r= pathEltOrInverse )*
            {
            pushFollow(FOLLOW_pathEltOrInverse_in_pathSequence3304);
            l=pathEltOrInverse();

            state._fsp--;
            if (state.failed) return o;

            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:484:26: ( '/' r= pathEltOrInverse )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==256) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:484:28: '/' r= pathEltOrInverse
            	    {
            	    match(input,256,FOLLOW_256_in_pathSequence3308); if (state.failed) return o;

            	    pushFollow(FOLLOW_pathEltOrInverse_in_pathSequence3312);
            	    r=pathEltOrInverse();

            	    state._fsp--;
            	    if (state.failed) return o;

            	    if ( state.backtracking==0 ) { if (x.length()==0) { x.put(l); } x.put(r); }

            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);


            if ( state.backtracking==0 ) {
                  if (x.length() > 0) {
                    o = new JSONObject();
                    ((JSONObject)o).put("seq", x);
                  } else {
                    o = l;
                  }
                }

            }

        }

        	catch(RecognitionException eee) {
                throw new RuntimeException(eee);
            }

        finally {
        	// do for sure before leaving
        }
        return o;
    }
    // $ANTLR end "pathSequence"



    // $ANTLR start "pathEltOrInverse"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:495:1: pathEltOrInverse returns [Object o] : (p= pathElt | '^' x= pathElt );
    public final Object pathEltOrInverse() throws JSONException, RecognitionException {
        Object o = null;


        Object p =null;

        Object x =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:496:2: (p= pathElt | '^' x= pathElt )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==IRI||LA54_0==OPEN_BRACE||(LA54_0 >= PREFIXED_NAME && LA54_0 <= PREFIXED_NS)||LA54_0==251||LA54_0==263) ) {
                alt54=1;
            }
            else if ( (LA54_0==261) ) {
                alt54=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return o;}
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;

            }
            switch (alt54) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:496:7: p= pathElt
                    {
                    pushFollow(FOLLOW_pathElt_in_pathEltOrInverse3347);
                    p=pathElt();

                    state._fsp--;
                    if (state.failed) return o;

                    if ( state.backtracking==0 ) { o =p; }

                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:497:10: '^' x= pathElt
                    {
                    match(input,261,FOLLOW_261_in_pathEltOrInverse3363); if (state.failed) return o;

                    pushFollow(FOLLOW_pathElt_in_pathEltOrInverse3367);
                    x=pathElt();

                    state._fsp--;
                    if (state.failed) return o;

                    if ( state.backtracking==0 ) {
                               o = new JSONObject();
                               ((JSONObject)o).put("inv", x);
                             }

                    }
                    break;

            }
        }

        	catch(RecognitionException eee) {
                throw new RuntimeException(eee);
            }

        finally {
        	// do for sure before leaving
        }
        return o;
    }
    // $ANTLR end "pathEltOrInverse"



    // $ANTLR start "pathElt"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:504:1: pathElt returns [Object o] : (pp= pathPrimary (m= pathMod |) ) ;
    public final Object pathElt() throws JSONException, RecognitionException {
        Object o = null;


        Object pp =null;

        String m =null;


         Object x = null; 
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:506:2: ( (pp= pathPrimary (m= pathMod |) ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:506:7: (pp= pathPrimary (m= pathMod |) )
            {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:506:7: (pp= pathPrimary (m= pathMod |) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:506:8: pp= pathPrimary (m= pathMod |)
            {
            pushFollow(FOLLOW_pathPrimary_in_pathElt3413);
            pp=pathPrimary();

            state._fsp--;
            if (state.failed) return o;

            if ( state.backtracking==0 ) { x = pp; }

            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:507:11: (m= pathMod |)
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( ((LA55_0 >= 253 && LA55_0 <= 254)||LA55_0==260) ) {
                alt55=1;
            }
            else if ( (LA55_0==EOF||LA55_0==CLOSE_BRACE||LA55_0==256||LA55_0==264) ) {
                alt55=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return o;}
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;

            }
            switch (alt55) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:507:12: m= pathMod
                    {
                    pushFollow(FOLLOW_pathMod_in_pathElt3430);
                    m=pathMod();

                    state._fsp--;
                    if (state.failed) return o;

                    if ( state.backtracking==0 ) { JSONObject mod = new JSONObject(); mod.put("path", x); mod.put("modifider", m); o = mod; }

                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:507:118: 
                    {
                    if ( state.backtracking==0 ) { o =x; }

                    }
                    break;

            }


            }


            }

        }

        	catch(RecognitionException eee) {
                throw new RuntimeException(eee);
            }

        finally {
        	// do for sure before leaving
        }
        return o;
    }
    // $ANTLR end "pathElt"



    // $ANTLR start "pathMod"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:510:1: pathMod returns [String v] : ( '*' | '?' | '+' );
    public final String pathMod() throws JSONException, RecognitionException {
        String v = null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:511:2: ( '*' | '?' | '+' )
            int alt56=3;
            switch ( input.LA(1) ) {
            case 253:
                {
                alt56=1;
                }
                break;
            case 260:
                {
                alt56=2;
                }
                break;
            case 254:
                {
                alt56=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return v;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;

            }

            switch (alt56) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:511:4: '*'
                    {
                    match(input,253,FOLLOW_253_in_pathMod3458); if (state.failed) return v;

                    if ( state.backtracking==0 ) { v = "*"; }

                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:512:4: '?'
                    {
                    match(input,260,FOLLOW_260_in_pathMod3467); if (state.failed) return v;

                    if ( state.backtracking==0 ) { v = "?"; }

                    }
                    break;
                case 3 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:513:4: '+'
                    {
                    match(input,254,FOLLOW_254_in_pathMod3476); if (state.failed) return v;

                    if ( state.backtracking==0 ) { v = "+"; }

                    }
                    break;

            }
        }

        	catch(RecognitionException eee) {
                throw new RuntimeException(eee);
            }

        finally {
        	// do for sure before leaving
        }
        return v;
    }
    // $ANTLR end "pathMod"



    // $ANTLR start "pathPrimary"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:516:1: pathPrimary returns [Object o] : (i= iRIref | 'a' | '!' p= pathNegatedPropertySet | OPEN_BRACE p= path CLOSE_BRACE );
    public final Object pathPrimary() throws JSONException, RecognitionException {
        Object o = null;


        IRI i =null;

        Object p =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:517:2: (i= iRIref | 'a' | '!' p= pathNegatedPropertySet | OPEN_BRACE p= path CLOSE_BRACE )
            int alt57=4;
            switch ( input.LA(1) ) {
            case IRI:
            case PREFIXED_NAME:
            case PREFIXED_NS:
                {
                alt57=1;
                }
                break;
            case 263:
                {
                alt57=2;
                }
                break;
            case 251:
                {
                alt57=3;
                }
                break;
            case OPEN_BRACE:
                {
                alt57=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return o;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;

            }

            switch (alt57) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:517:7: i= iRIref
                    {
                    pushFollow(FOLLOW_iRIref_in_pathPrimary3504);
                    i=iRIref();

                    state._fsp--;
                    if (state.failed) return o;

                    if ( state.backtracking==0 ) { o = i; }

                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:518:9: 'a'
                    {
                    match(input,263,FOLLOW_263_in_pathPrimary3518); if (state.failed) return o;

                    if ( state.backtracking==0 ) { o = new IRI("http://www.w3.org/1999/02/22-rdf-syntax-ns#type"); }

                    }
                    break;
                case 3 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:519:9: '!' p= pathNegatedPropertySet
                    {
                    match(input,251,FOLLOW_251_in_pathPrimary3532); if (state.failed) return o;

                    pushFollow(FOLLOW_pathNegatedPropertySet_in_pathPrimary3536);
                    p=pathNegatedPropertySet();

                    state._fsp--;
                    if (state.failed) return o;

                    if ( state.backtracking==0 ) { o = p; }

                    }
                    break;
                case 4 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:520:9: OPEN_BRACE p= path CLOSE_BRACE
                    {
                    match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_pathPrimary3550); if (state.failed) return o;

                    pushFollow(FOLLOW_path_in_pathPrimary3554);
                    p=path();

                    state._fsp--;
                    if (state.failed) return o;

                    if ( state.backtracking==0 ) { o = p; }

                    match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_pathPrimary3558); if (state.failed) return o;

                    }
                    break;

            }
        }

        	catch(RecognitionException eee) {
                throw new RuntimeException(eee);
            }

        finally {
        	// do for sure before leaving
        }
        return o;
    }
    // $ANTLR end "pathPrimary"



    // $ANTLR start "pathNegatedPropertySet"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:523:1: pathNegatedPropertySet returns [JSONObject s] : (v= pathOneInPropertySet | OPEN_BRACE (v1= pathOneInPropertySet ( '|' v2= pathOneInPropertySet )* )? CLOSE_BRACE ) ;
    public final JSONObject pathNegatedPropertySet() throws JSONException, RecognitionException {
        JSONObject s = null;


        Pair<IRI, Boolean> v =null;

        Pair<IRI, Boolean> v1 =null;

        Pair<IRI, Boolean> v2 =null;


         s = new JSONObject();
                    JSONArray pos = new JSONArray();
                    JSONArray neg = new JSONArray(); 
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:527:2: ( (v= pathOneInPropertySet | OPEN_BRACE (v1= pathOneInPropertySet ( '|' v2= pathOneInPropertySet )* )? CLOSE_BRACE ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:527:4: (v= pathOneInPropertySet | OPEN_BRACE (v1= pathOneInPropertySet ( '|' v2= pathOneInPropertySet )* )? CLOSE_BRACE )
            {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:527:4: (v= pathOneInPropertySet | OPEN_BRACE (v1= pathOneInPropertySet ( '|' v2= pathOneInPropertySet )* )? CLOSE_BRACE )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( ((LA60_0 >= INV && LA60_0 <= IRI)||(LA60_0 >= PREFIXED_NAME && LA60_0 <= PREFIXED_NS)||LA60_0==263) ) {
                alt60=1;
            }
            else if ( (LA60_0==OPEN_BRACE) ) {
                alt60=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return s;}
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;

            }
            switch (alt60) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:527:6: v= pathOneInPropertySet
                    {
                    pushFollow(FOLLOW_pathOneInPropertySet_in_pathNegatedPropertySet3589);
                    v=pathOneInPropertySet();

                    state._fsp--;
                    if (state.failed) return s;

                    if ( state.backtracking==0 ) { if (v.snd ) { pos.put(v.fst); } else {neg.put(v.fst);} }

                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:528:8: OPEN_BRACE (v1= pathOneInPropertySet ( '|' v2= pathOneInPropertySet )* )? CLOSE_BRACE
                    {
                    match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_pathNegatedPropertySet3601); if (state.failed) return s;

                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:528:19: (v1= pathOneInPropertySet ( '|' v2= pathOneInPropertySet )* )?
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( ((LA59_0 >= INV && LA59_0 <= IRI)||(LA59_0 >= PREFIXED_NAME && LA59_0 <= PREFIXED_NS)||LA59_0==263) ) {
                        alt59=1;
                    }
                    switch (alt59) {
                        case 1 :
                            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:528:21: v1= pathOneInPropertySet ( '|' v2= pathOneInPropertySet )*
                            {
                            pushFollow(FOLLOW_pathOneInPropertySet_in_pathNegatedPropertySet3609);
                            v1=pathOneInPropertySet();

                            state._fsp--;
                            if (state.failed) return s;

                            if ( state.backtracking==0 ) {if (v1.snd ) { pos.put(v1.fst); } else {neg.put(v1.fst);} }

                            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:529:11: ( '|' v2= pathOneInPropertySet )*
                            loop58:
                            do {
                                int alt58=2;
                                int LA58_0 = input.LA(1);

                                if ( (LA58_0==264) ) {
                                    alt58=1;
                                }


                                switch (alt58) {
                            	case 1 :
                            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:529:13: '|' v2= pathOneInPropertySet
                            	    {
                            	    match(input,264,FOLLOW_264_in_pathNegatedPropertySet3625); if (state.failed) return s;

                            	    pushFollow(FOLLOW_pathOneInPropertySet_in_pathNegatedPropertySet3631);
                            	    v2=pathOneInPropertySet();

                            	    state._fsp--;
                            	    if (state.failed) return s;

                            	    if ( state.backtracking==0 ) { if (v2.snd ) { pos.put(v2.fst); } else {neg.put(v2.fst);} }

                            	    }
                            	    break;

                            	default :
                            	    break loop58;
                                }
                            } while (true);


                            }
                            break;

                    }


                    match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_pathNegatedPropertySet3653); if (state.failed) return s;

                    }
                    break;

            }


            if ( state.backtracking==0 ) {
                	if (pos.length() > 0) { s.put("pathElts", pos); }
                	if (neg.length() > 0) { s.put("invPathElts", neg); }
                }

            }

        }

        	catch(RecognitionException eee) {
                throw new RuntimeException(eee);
            }

        finally {
        	// do for sure before leaving
        }
        return s;
    }
    // $ANTLR end "pathNegatedPropertySet"



    // $ANTLR start "pathOneInPropertySet"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:537:1: pathOneInPropertySet returns [Pair<IRI, Boolean> v ] : (i= iRIref | 'a' | ^( INV invi= iRIrefOrRDFType ) );
    public final Pair<IRI, Boolean> pathOneInPropertySet() throws JSONException, RecognitionException {
        Pair<IRI, Boolean> v = null;


        IRI i =null;

        IRI invi =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:538:4: (i= iRIref | 'a' | ^( INV invi= iRIrefOrRDFType ) )
            int alt61=3;
            switch ( input.LA(1) ) {
            case IRI:
            case PREFIXED_NAME:
            case PREFIXED_NS:
                {
                alt61=1;
                }
                break;
            case 263:
                {
                alt61=2;
                }
                break;
            case INV:
                {
                alt61=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return v;}
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;

            }

            switch (alt61) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:538:7: i= iRIref
                    {
                    pushFollow(FOLLOW_iRIref_in_pathOneInPropertySet3686);
                    i=iRIref();

                    state._fsp--;
                    if (state.failed) return v;

                    if ( state.backtracking==0 ) { v = Pair.make(i, true); }

                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:539:4: 'a'
                    {
                    match(input,263,FOLLOW_263_in_pathOneInPropertySet3693); if (state.failed) return v;

                    if ( state.backtracking==0 ) { v = Pair.make(new IRI("http://www.w3.org/1999/02/22-rdf-syntax-ns#type"), true); }

                    }
                    break;
                case 3 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:540:4: ^( INV invi= iRIrefOrRDFType )
                    {
                    match(input,INV,FOLLOW_INV_in_pathOneInPropertySet3702); if (state.failed) return v;

                    match(input, Token.DOWN, null); if (state.failed) return v;
                    pushFollow(FOLLOW_iRIrefOrRDFType_in_pathOneInPropertySet3708);
                    invi=iRIrefOrRDFType();

                    state._fsp--;
                    if (state.failed) return v;

                    match(input, Token.UP, null); if (state.failed) return v;


                    if ( state.backtracking==0 ) { v = Pair.make(invi, false); }

                    }
                    break;

            }
        }

        	catch(RecognitionException eee) {
                throw new RuntimeException(eee);
            }

        finally {
        	// do for sure before leaving
        }
        return v;
    }
    // $ANTLR end "pathOneInPropertySet"



    // $ANTLR start "iRIrefOrRDFType"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:543:1: iRIrefOrRDFType returns [ IRI v ] : (i= iRIref | 'a' );
    public final IRI iRIrefOrRDFType() throws JSONException, RecognitionException {
        IRI v = null;


        IRI i =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:544:4: (i= iRIref | 'a' )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==IRI||(LA62_0 >= PREFIXED_NAME && LA62_0 <= PREFIXED_NS)) ) {
                alt62=1;
            }
            else if ( (LA62_0==263) ) {
                alt62=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return v;}
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;

            }
            switch (alt62) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:544:6: i= iRIref
                    {
                    pushFollow(FOLLOW_iRIref_in_iRIrefOrRDFType3739);
                    i=iRIref();

                    state._fsp--;
                    if (state.failed) return v;

                    if ( state.backtracking==0 ) { v = i;}

                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:545:6: 'a'
                    {
                    match(input,263,FOLLOW_263_in_iRIrefOrRDFType3748); if (state.failed) return v;

                    if ( state.backtracking==0 ) { v = new IRI("http://www.w3.org/1999/02/22-rdf-syntax-ns#type"); }

                    }
                    break;

            }
        }

        	catch(RecognitionException eee) {
                throw new RuntimeException(eee);
            }

        finally {
        	// do for sure before leaving
        }
        return v;
    }
    // $ANTLR end "iRIrefOrRDFType"



    // $ANTLR start "integer"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:548:1: integer : INTEGER ;
    public final void integer() throws RecognitionException {
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:549:2: ( INTEGER )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:549:7: INTEGER
            {
            match(input,INTEGER,FOLLOW_INTEGER_in_integer3769); if (state.failed) return ;

            }

        }

        	catch(RecognitionException eee) {
                throw new RuntimeException(eee);
            }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "integer"



    // $ANTLR start "triplesNode"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:552:1: triplesNode returns [JSONObject tn] : ^( TRIPLES_NODE (c= collection |b= blankNodePropertyList ) ) ;
    public final JSONObject triplesNode() throws JSONException, RecognitionException {
        JSONObject tn = null;


        JSONArray c =null;

        JSONArray b =null;


         tn = new JSONObject(); 
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:554:2: ( ^( TRIPLES_NODE (c= collection |b= blankNodePropertyList ) ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:554:6: ^( TRIPLES_NODE (c= collection |b= blankNodePropertyList ) )
            {
            match(input,TRIPLES_NODE,FOLLOW_TRIPLES_NODE_in_triplesNode3801); if (state.failed) return tn;

            match(input, Token.DOWN, null); if (state.failed) return tn;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:555:5: (c= collection |b= blankNodePropertyList )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==COLLECTION) ) {
                alt63=1;
            }
            else if ( (LA63_0==PROPERTY_LIST) ) {
                alt63=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return tn;}
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;

            }
            switch (alt63) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:555:7: c= collection
                    {
                    pushFollow(FOLLOW_collection_in_triplesNode3812);
                    c=collection();

                    state._fsp--;
                    if (state.failed) return tn;

                    if ( state.backtracking==0 ) { tn.put("collection", c);}

                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:556:8: b= blankNodePropertyList
                    {
                    pushFollow(FOLLOW_blankNodePropertyList_in_triplesNode3829);
                    b=blankNodePropertyList();

                    state._fsp--;
                    if (state.failed) return tn;

                    if ( state.backtracking==0 ) { tn.put("propertyList", b);}

                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return tn;


            }

        }

        	catch(RecognitionException eee) {
                throw new RuntimeException(eee);
            }

        finally {
        	// do for sure before leaving
        }
        return tn;
    }
    // $ANTLR end "triplesNode"



    // $ANTLR start "blankNodePropertyList"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:561:1: blankNodePropertyList returns [JSONArray pl] : ^( PROPERTY_LIST ( ^( PREDICATE v= predicate ) ^( VALUE (o= graphNode )+ ) )+ ) ;
    public final JSONArray blankNodePropertyList() throws JSONException, RecognitionException {
        JSONArray pl = null;


        Object v =null;

        Object o =null;



        			pl = new JSONArray();
        		
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:565:2: ( ^( PROPERTY_LIST ( ^( PREDICATE v= predicate ) ^( VALUE (o= graphNode )+ ) )+ ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:565:4: ^( PROPERTY_LIST ( ^( PREDICATE v= predicate ) ^( VALUE (o= graphNode )+ ) )+ )
            {
            match(input,PROPERTY_LIST,FOLLOW_PROPERTY_LIST_in_blankNodePropertyList3872); if (state.failed) return pl;

            match(input, Token.DOWN, null); if (state.failed) return pl;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:566:6: ( ^( PREDICATE v= predicate ) ^( VALUE (o= graphNode )+ ) )+
            int cnt65=0;
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==PREDICATE) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:566:8: ^( PREDICATE v= predicate ) ^( VALUE (o= graphNode )+ )
            	    {
            	    match(input,PREDICATE,FOLLOW_PREDICATE_in_blankNodePropertyList3885); if (state.failed) return pl;

            	    match(input, Token.DOWN, null); if (state.failed) return pl;
            	    pushFollow(FOLLOW_predicate_in_blankNodePropertyList3889);
            	    v=predicate();

            	    state._fsp--;
            	    if (state.failed) return pl;

            	    match(input, Token.UP, null); if (state.failed) return pl;


            	    match(input,VALUE,FOLLOW_VALUE_in_blankNodePropertyList3901); if (state.failed) return pl;

            	    match(input, Token.DOWN, null); if (state.failed) return pl;
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:567:17: (o= graphNode )+
            	    int cnt64=0;
            	    loop64:
            	    do {
            	        int alt64=2;
            	        int LA64_0 = input.LA(1);

            	        if ( (LA64_0==ANNON||(LA64_0 >= BIG_DECIMAL && LA64_0 <= BIG_INTEGER)||LA64_0==BLANK_NODE_LABEL||LA64_0==BOOLEAN||LA64_0==DOUBLE||LA64_0==IRI||LA64_0==NIL||(LA64_0 >= PREFIXED_NAME && LA64_0 <= PREFIXED_NS)||LA64_0==STRING||LA64_0==TRIPLES_NODE||LA64_0==VAR) ) {
            	            alt64=1;
            	        }


            	        switch (alt64) {
            	    	case 1 :
            	    	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:567:18: o= graphNode
            	    	    {
            	    	    pushFollow(FOLLOW_graphNode_in_blankNodePropertyList3906);
            	    	    o=graphNode();

            	    	    state._fsp--;
            	    	    if (state.failed) return pl;

            	    	    if ( state.backtracking==0 ) { JSONObject e = new JSONObject();  
            	    	                                       e.put("predicate", v);
            	    	                                       e.put("value", o);
            	    	                                       pl.put(e);
            	    	                                     }

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt64 >= 1 ) break loop64;
            	    	    if (state.backtracking>0) {state.failed=true; return pl;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(64, input);
            	                throw eee;
            	        }
            	        cnt64++;
            	    } while (true);


            	    match(input, Token.UP, null); if (state.failed) return pl;


            	    }
            	    break;

            	default :
            	    if ( cnt65 >= 1 ) break loop65;
            	    if (state.backtracking>0) {state.failed=true; return pl;}
                        EarlyExitException eee =
                            new EarlyExitException(65, input);
                        throw eee;
                }
                cnt65++;
            } while (true);


            match(input, Token.UP, null); if (state.failed) return pl;


            }

        }

        	catch(RecognitionException eee) {
                throw new RuntimeException(eee);
            }

        finally {
        	// do for sure before leaving
        }
        return pl;
    }
    // $ANTLR end "blankNodePropertyList"



    // $ANTLR start "predicate"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:577:1: predicate returns [Object p] : (v= var |i= iRIref | 'a' | ^( ALT (alt= predicate )* ) | ^( SEQ (seq= predicate )* ) | ^( ELT pred= predicate mod= pathMod ) | ^( INV pred= predicate ) | '!' neg= pathNegatedPropertySet );
    public final Object predicate() throws JSONException, RecognitionException {
        Object p = null;


        String v =null;

        IRI i =null;

        Object alt =null;

        Object seq =null;

        Object pred =null;

        String mod =null;

        JSONObject neg =null;


         JSONObject o = null; JSONArray elts = null; 
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:579:2: (v= var |i= iRIref | 'a' | ^( ALT (alt= predicate )* ) | ^( SEQ (seq= predicate )* ) | ^( ELT pred= predicate mod= pathMod ) | ^( INV pred= predicate ) | '!' neg= pathNegatedPropertySet )
            int alt68=8;
            switch ( input.LA(1) ) {
            case VAR:
                {
                alt68=1;
                }
                break;
            case IRI:
            case PREFIXED_NAME:
            case PREFIXED_NS:
                {
                alt68=2;
                }
                break;
            case 263:
                {
                alt68=3;
                }
                break;
            case ALT:
                {
                alt68=4;
                }
                break;
            case SEQ:
                {
                alt68=5;
                }
                break;
            case ELT:
                {
                alt68=6;
                }
                break;
            case INV:
                {
                alt68=7;
                }
                break;
            case 251:
                {
                alt68=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return p;}
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;

            }

            switch (alt68) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:579:4: v= var
                    {
                    pushFollow(FOLLOW_var_in_predicate3993);
                    v=var();

                    state._fsp--;
                    if (state.failed) return p;

                    if ( state.backtracking==0 ) { p = new Variable(v);  }

                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:580:4: i= iRIref
                    {
                    pushFollow(FOLLOW_iRIref_in_predicate4008);
                    i=iRIref();

                    state._fsp--;
                    if (state.failed) return p;

                    if ( state.backtracking==0 ) { p = i; }

                    }
                    break;
                case 3 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:581:5: 'a'
                    {
                    match(input,263,FOLLOW_263_in_predicate4019); if (state.failed) return p;

                    if ( state.backtracking==0 ) { p = new IRI("http://www.w3.org/1999/02/22-rdf-syntax-ns#type"); }

                    }
                    break;
                case 4 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:582:9: ^( ALT (alt= predicate )* )
                    {
                    match(input,ALT,FOLLOW_ALT_in_predicate4034); if (state.failed) return p;

                    if ( state.backtracking==0 ) { o = new JSONObject(); 
                                    elts = new JSONArray(); 
                                    o.put("alt", elts); }

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return p;
                        // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:585:15: (alt= predicate )*
                        loop66:
                        do {
                            int alt66=2;
                            int LA66_0 = input.LA(1);

                            if ( (LA66_0==ALT||LA66_0==ELT||(LA66_0 >= INV && LA66_0 <= IRI)||(LA66_0 >= PREFIXED_NAME && LA66_0 <= PREFIXED_NS)||LA66_0==SEQ||LA66_0==VAR||LA66_0==251||LA66_0==263) ) {
                                alt66=1;
                            }


                            switch (alt66) {
                        	case 1 :
                        	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:585:16: alt= predicate
                        	    {
                        	    pushFollow(FOLLOW_predicate_in_predicate4055);
                        	    alt=predicate();

                        	    state._fsp--;
                        	    if (state.failed) return p;

                        	    if ( state.backtracking==0 ) { elts.put(alt); }

                        	    }
                        	    break;

                        	default :
                        	    break loop66;
                            }
                        } while (true);


                        match(input, Token.UP, null); if (state.failed) return p;
                    }


                    }
                    break;
                case 5 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:586:9: ^( SEQ (seq= predicate )* )
                    {
                    match(input,SEQ,FOLLOW_SEQ_in_predicate4071); if (state.failed) return p;

                    if ( state.backtracking==0 ) { o = new JSONObject(); 
                                    elts = new JSONArray(); 
                                    o.put("seq", elts); }

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return p;
                        // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:589:15: (seq= predicate )*
                        loop67:
                        do {
                            int alt67=2;
                            int LA67_0 = input.LA(1);

                            if ( (LA67_0==ALT||LA67_0==ELT||(LA67_0 >= INV && LA67_0 <= IRI)||(LA67_0 >= PREFIXED_NAME && LA67_0 <= PREFIXED_NS)||LA67_0==SEQ||LA67_0==VAR||LA67_0==251||LA67_0==263) ) {
                                alt67=1;
                            }


                            switch (alt67) {
                        	case 1 :
                        	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:589:16: seq= predicate
                        	    {
                        	    pushFollow(FOLLOW_predicate_in_predicate4092);
                        	    seq=predicate();

                        	    state._fsp--;
                        	    if (state.failed) return p;

                        	    if ( state.backtracking==0 ) { elts.put(seq); }

                        	    }
                        	    break;

                        	default :
                        	    break loop67;
                            }
                        } while (true);


                        match(input, Token.UP, null); if (state.failed) return p;
                    }


                    }
                    break;
                case 6 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:590:9: ^( ELT pred= predicate mod= pathMod )
                    {
                    match(input,ELT,FOLLOW_ELT_in_predicate4108); if (state.failed) return p;

                    match(input, Token.DOWN, null); if (state.failed) return p;
                    pushFollow(FOLLOW_predicate_in_predicate4112);
                    pred=predicate();

                    state._fsp--;
                    if (state.failed) return p;

                    pushFollow(FOLLOW_pathMod_in_predicate4118);
                    mod=pathMod();

                    state._fsp--;
                    if (state.failed) return p;

                    match(input, Token.UP, null); if (state.failed) return p;


                    if ( state.backtracking==0 ) { o = new JSONObject(); o.put("pred", pred); o.put("mod", mod); p = o; }

                    }
                    break;
                case 7 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:592:9: ^( INV pred= predicate )
                    {
                    match(input,INV,FOLLOW_INV_in_predicate4142); if (state.failed) return p;

                    match(input, Token.DOWN, null); if (state.failed) return p;
                    pushFollow(FOLLOW_predicate_in_predicate4146);
                    pred=predicate();

                    state._fsp--;
                    if (state.failed) return p;

                    match(input, Token.UP, null); if (state.failed) return p;


                    if ( state.backtracking==0 ) { o = new JSONObject(); o.put("inv", pred); p = o; }

                    }
                    break;
                case 8 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:594:7: '!' neg= pathNegatedPropertySet
                    {
                    match(input,251,FOLLOW_251_in_predicate4166); if (state.failed) return p;

                    pushFollow(FOLLOW_pathNegatedPropertySet_in_predicate4172);
                    neg=pathNegatedPropertySet();

                    state._fsp--;
                    if (state.failed) return p;

                    if ( state.backtracking==0 ) { o = new JSONObject(); o.put("neg", neg); p = o; }

                    }
                    break;

            }
        }

        	catch(RecognitionException eee) {
                throw new RuntimeException(eee);
            }

        finally {
        	// do for sure before leaving
        }
        return p;
    }
    // $ANTLR end "predicate"



    // $ANTLR start "collection"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:598:1: collection returns [JSONArray c] : ^( COLLECTION (g= graphNode )+ ) ;
    public final JSONArray collection() throws JSONException, RecognitionException {
        JSONArray c = null;


        Object g =null;


         c = new JSONArray(); 
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:600:2: ( ^( COLLECTION (g= graphNode )+ ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:600:7: ^( COLLECTION (g= graphNode )+ )
            {
            match(input,COLLECTION,FOLLOW_COLLECTION_in_collection4214); if (state.failed) return c;

            match(input, Token.DOWN, null); if (state.failed) return c;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:600:21: (g= graphNode )+
            int cnt69=0;
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==ANNON||(LA69_0 >= BIG_DECIMAL && LA69_0 <= BIG_INTEGER)||LA69_0==BLANK_NODE_LABEL||LA69_0==BOOLEAN||LA69_0==DOUBLE||LA69_0==IRI||LA69_0==NIL||(LA69_0 >= PREFIXED_NAME && LA69_0 <= PREFIXED_NS)||LA69_0==STRING||LA69_0==TRIPLES_NODE||LA69_0==VAR) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:600:22: g= graphNode
            	    {
            	    pushFollow(FOLLOW_graphNode_in_collection4219);
            	    g=graphNode();

            	    state._fsp--;
            	    if (state.failed) return c;

            	    if ( state.backtracking==0 ) { c.put(g); }

            	    }
            	    break;

            	default :
            	    if ( cnt69 >= 1 ) break loop69;
            	    if (state.backtracking>0) {state.failed=true; return c;}
                        EarlyExitException eee =
                            new EarlyExitException(69, input);
                        throw eee;
                }
                cnt69++;
            } while (true);


            match(input, Token.UP, null); if (state.failed) return c;


            }

        }

        	catch(RecognitionException eee) {
                throw new RuntimeException(eee);
            }

        finally {
        	// do for sure before leaving
        }
        return c;
    }
    // $ANTLR end "collection"



    // $ANTLR start "graphNode"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:603:1: graphNode returns [Object gn] : (v= var |g= graphTerm |t= triplesNode );
    public final Object graphNode() throws JSONException, RecognitionException {
        Object gn = null;


        String v =null;

        Object g =null;

        JSONObject t =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:604:2: (v= var |g= graphTerm |t= triplesNode )
            int alt70=3;
            switch ( input.LA(1) ) {
            case VAR:
                {
                alt70=1;
                }
                break;
            case ANNON:
            case BIG_DECIMAL:
            case BIG_INTEGER:
            case BLANK_NODE_LABEL:
            case BOOLEAN:
            case DOUBLE:
            case IRI:
            case NIL:
            case PREFIXED_NAME:
            case PREFIXED_NS:
            case STRING:
                {
                alt70=2;
                }
                break;
            case TRIPLES_NODE:
                {
                alt70=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return gn;}
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;

            }

            switch (alt70) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:604:6: v= var
                    {
                    pushFollow(FOLLOW_var_in_graphNode4249);
                    v=var();

                    state._fsp--;
                    if (state.failed) return gn;

                    if ( state.backtracking==0 ) { gn = new Variable(v);			}

                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:605:5: g= graphTerm
                    {
                    pushFollow(FOLLOW_graphTerm_in_graphNode4262);
                    g=graphTerm();

                    state._fsp--;
                    if (state.failed) return gn;

                    if ( state.backtracking==0 ) { gn = g;						}

                    }
                    break;
                case 3 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:606:5: t= triplesNode
                    {
                    pushFollow(FOLLOW_triplesNode_in_graphNode4274);
                    t=triplesNode();

                    state._fsp--;
                    if (state.failed) return gn;

                    if ( state.backtracking==0 ) { gn = t;						}

                    }
                    break;

            }
        }

        	catch(RecognitionException eee) {
                throw new RuntimeException(eee);
            }

        finally {
        	// do for sure before leaving
        }
        return gn;
    }
    // $ANTLR end "graphNode"



    // $ANTLR start "varOrTerm"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:609:1: varOrTerm returns [Object qt] : (v= var |g= graphTerm );
    public final Object varOrTerm() throws JSONException, RecognitionException {
        Object qt = null;


        String v =null;

        Object g =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:610:2: (v= var |g= graphTerm )
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==VAR) ) {
                alt71=1;
            }
            else if ( (LA71_0==ANNON||(LA71_0 >= BIG_DECIMAL && LA71_0 <= BIG_INTEGER)||LA71_0==BLANK_NODE_LABEL||LA71_0==BOOLEAN||LA71_0==DOUBLE||LA71_0==IRI||LA71_0==NIL||(LA71_0 >= PREFIXED_NAME && LA71_0 <= PREFIXED_NS)||LA71_0==STRING) ) {
                alt71=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return qt;}
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;

            }
            switch (alt71) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:610:7: v= var
                    {
                    pushFollow(FOLLOW_var_in_varOrTerm4301);
                    v=var();

                    state._fsp--;
                    if (state.failed) return qt;

                    if ( state.backtracking==0 ) { qt = new Variable(v); 	}

                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:611:6: g= graphTerm
                    {
                    pushFollow(FOLLOW_graphTerm_in_varOrTerm4316);
                    g=graphTerm();

                    state._fsp--;
                    if (state.failed) return qt;

                    if ( state.backtracking==0 ) { qt = g;					}

                    }
                    break;

            }
        }

        	catch(RecognitionException eee) {
                throw new RuntimeException(eee);
            }

        finally {
        	// do for sure before leaving
        }
        return qt;
    }
    // $ANTLR end "varOrTerm"



    // $ANTLR start "varOrIRIref"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:614:1: varOrIRIref returns [Object qt] : (v= var |i= iRIref );
    public final Object varOrIRIref() throws JSONException, RecognitionException {
        Object qt = null;


        String v =null;

        IRI i =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:615:2: (v= var |i= iRIref )
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==VAR) ) {
                alt72=1;
            }
            else if ( (LA72_0==IRI||(LA72_0 >= PREFIXED_NAME && LA72_0 <= PREFIXED_NS)) ) {
                alt72=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return qt;}
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;

            }
            switch (alt72) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:615:6: v= var
                    {
                    pushFollow(FOLLOW_var_in_varOrIRIref4342);
                    v=var();

                    state._fsp--;
                    if (state.failed) return qt;

                    if ( state.backtracking==0 ) { qt = new Variable(v); 	}

                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:616:5: i= iRIref
                    {
                    pushFollow(FOLLOW_iRIref_in_varOrIRIref4357);
                    i=iRIref();

                    state._fsp--;
                    if (state.failed) return qt;

                    if ( state.backtracking==0 ) { qt = i; 	    }

                    }
                    break;

            }
        }

        	catch(RecognitionException eee) {
                throw new RuntimeException(eee);
            }

        finally {
        	// do for sure before leaving
        }
        return qt;
    }
    // $ANTLR end "varOrIRIref"



    // $ANTLR start "varOrIRIref2"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:619:1: varOrIRIref2 returns [Object bu] : (v= var |i= iRIref );
    public final Object varOrIRIref2() throws JSONException, RecognitionException {
        Object bu = null;


        String v =null;

        IRI i =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:620:5: (v= var |i= iRIref )
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==VAR) ) {
                alt73=1;
            }
            else if ( (LA73_0==IRI||(LA73_0 >= PREFIXED_NAME && LA73_0 <= PREFIXED_NS)) ) {
                alt73=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return bu;}
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;

            }
            switch (alt73) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:620:8: v= var
                    {
                    pushFollow(FOLLOW_var_in_varOrIRIref24387);
                    v=var();

                    state._fsp--;
                    if (state.failed) return bu;

                    if ( state.backtracking==0 ) { bu = new Variable(v); }

                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:621:8: i= iRIref
                    {
                    pushFollow(FOLLOW_iRIref_in_varOrIRIref24403);
                    i=iRIref();

                    state._fsp--;
                    if (state.failed) return bu;

                    if ( state.backtracking==0 ) { bu = i; }

                    }
                    break;

            }
        }

        	catch(RecognitionException eee) {
                throw new RuntimeException(eee);
            }

        finally {
        	// do for sure before leaving
        }
        return bu;
    }
    // $ANTLR end "varOrIRIref2"



    // $ANTLR start "var"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:624:1: var returns [String v] : ^( VAR (x1= VAR1 |x2= VAR2 ) ) ;
    public final String var() throws JSONException, RecognitionException {
        String v = null;


        XTree x1=null;
        XTree x2=null;

        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:625:2: ( ^( VAR (x1= VAR1 |x2= VAR2 ) ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:625:6: ^( VAR (x1= VAR1 |x2= VAR2 ) )
            {
            match(input,VAR,FOLLOW_VAR_in_var4434); if (state.failed) return v;

            match(input, Token.DOWN, null); if (state.failed) return v;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:625:13: (x1= VAR1 |x2= VAR2 )
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==VAR1) ) {
                alt74=1;
            }
            else if ( (LA74_0==VAR2) ) {
                alt74=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return v;}
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;

            }
            switch (alt74) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:625:15: x1= VAR1
                    {
                    x1=(XTree)match(input,VAR1,FOLLOW_VAR1_in_var4441); if (state.failed) return v;

                    if ( state.backtracking==0 ) { v = new String(x1.getText().substring(1)); }

                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:626:7: x2= VAR2
                    {
                    x2=(XTree)match(input,VAR2,FOLLOW_VAR2_in_var4456); if (state.failed) return v;

                    if ( state.backtracking==0 ) { v = new String(x2.getText().substring(1)); }

                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return v;


            }

        }

        	catch(RecognitionException eee) {
                throw new RuntimeException(eee);
            }

        finally {
        	// do for sure before leaving
        }
        return v;
    }
    // $ANTLR end "var"



    // $ANTLR start "graphTerm"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:631:1: graphTerm returns [Object gt] : (i= iRIref |r= rDFLiteral |d= numericLiteral |b= booleanLiteral |l= blankNode | NIL );
    public final Object graphTerm() throws JSONException, RecognitionException {
        Object gt = null;


        IRI i =null;

        StringLiteral r =null;

        Constant d =null;

        Boolean b =null;

        BlankNode l =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:632:2: (i= iRIref |r= rDFLiteral |d= numericLiteral |b= booleanLiteral |l= blankNode | NIL )
            int alt75=6;
            switch ( input.LA(1) ) {
            case IRI:
            case PREFIXED_NAME:
            case PREFIXED_NS:
                {
                alt75=1;
                }
                break;
            case STRING:
                {
                alt75=2;
                }
                break;
            case BIG_DECIMAL:
            case BIG_INTEGER:
            case DOUBLE:
                {
                alt75=3;
                }
                break;
            case BOOLEAN:
                {
                alt75=4;
                }
                break;
            case ANNON:
            case BLANK_NODE_LABEL:
                {
                alt75=5;
                }
                break;
            case NIL:
                {
                alt75=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return gt;}
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;

            }

            switch (alt75) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:632:6: i= iRIref
                    {
                    pushFollow(FOLLOW_iRIref_in_graphTerm4494);
                    i=iRIref();

                    state._fsp--;
                    if (state.failed) return gt;

                    if ( state.backtracking==0 ) { gt = i; }

                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:633:5: r= rDFLiteral
                    {
                    pushFollow(FOLLOW_rDFLiteral_in_graphTerm4508);
                    r=rDFLiteral();

                    state._fsp--;
                    if (state.failed) return gt;

                    if ( state.backtracking==0 ) { gt = r; }

                    }
                    break;
                case 3 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:634:4: d= numericLiteral
                    {
                    pushFollow(FOLLOW_numericLiteral_in_graphTerm4520);
                    d=numericLiteral();

                    state._fsp--;
                    if (state.failed) return gt;

                    if ( state.backtracking==0 ) { gt = d; }

                    }
                    break;
                case 4 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:635:5: b= booleanLiteral
                    {
                    pushFollow(FOLLOW_booleanLiteral_in_graphTerm4533);
                    b=booleanLiteral();

                    state._fsp--;
                    if (state.failed) return gt;

                    if ( state.backtracking==0 ) { gt = b; }

                    }
                    break;
                case 5 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:636:5: l= blankNode
                    {
                    pushFollow(FOLLOW_blankNode_in_graphTerm4546);
                    l=blankNode();

                    state._fsp--;
                    if (state.failed) return gt;

                    if ( state.backtracking==0 ) { gt = l; }

                    }
                    break;
                case 6 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:637:5: NIL
                    {
                    match(input,NIL,FOLLOW_NIL_in_graphTerm4559); if (state.failed) return gt;

                    if ( state.backtracking==0 ) { gt = new IRI("http://www.w3.org/1999/02/22-rdf-syntax-ns#nil"); }

                    }
                    break;

            }
        }

        	catch(RecognitionException eee) {
                throw new RuntimeException(eee);
            }

        finally {
        	// do for sure before leaving
        }
        return gt;
    }
    // $ANTLR end "graphTerm"



    // $ANTLR start "expression"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:640:1: expression returns [JSONObject e] : ( ^( LOGICAL_OR e1= expression e2= expression (e3= expression )* ) | ^( LOGICAL_AND e1= expression e2= expression (e3= expression )* ) | ^( '=' e5= expression e6= expression ) | ^( '!=' e7= expression e8= expression ) | ^( LT e9= expression e10= expression ) | ^( '>' e11= expression e12= expression ) | ^( LTE e13= expression e14= expression ) | ^( '>=' e15= expression e16= expression ) | ^( IN e17= expression e18= expressionList ) | ^( NOT e19= expression e20= expressionList ) | ^( '+' e21= expression (e22= expression )? ) | ^( BROKEN_PLUS e21= expression e22= expression ) | ^( '-' e23= expression (e24= expression )? ) | ^( BROKEN_MINUS e23= expression e24= expression ) | ^( '*' e25= expression e26= expression ) | ^( '/' e27= expression e28= expression ) | ^( '!' e29= expression ) |e30= brackettedExpression |e31= primaryExpression );
    public final JSONObject expression() throws JSONException, RecognitionException {
        JSONObject e = null;


        JSONObject e1 =null;

        JSONObject e2 =null;

        JSONObject e3 =null;

        JSONObject e5 =null;

        JSONObject e6 =null;

        JSONObject e7 =null;

        JSONObject e8 =null;

        JSONObject e9 =null;

        JSONObject e10 =null;

        JSONObject e11 =null;

        JSONObject e12 =null;

        JSONObject e13 =null;

        JSONObject e14 =null;

        JSONObject e15 =null;

        JSONObject e16 =null;

        JSONObject e17 =null;

        JSONArray e18 =null;

        JSONObject e19 =null;

        JSONArray e20 =null;

        JSONObject e21 =null;

        JSONObject e22 =null;

        JSONObject e23 =null;

        JSONObject e24 =null;

        JSONObject e25 =null;

        JSONObject e26 =null;

        JSONObject e27 =null;

        JSONObject e28 =null;

        JSONObject e29 =null;

        Object e30 =null;

        Object e31 =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:641:2: ( ^( LOGICAL_OR e1= expression e2= expression (e3= expression )* ) | ^( LOGICAL_AND e1= expression e2= expression (e3= expression )* ) | ^( '=' e5= expression e6= expression ) | ^( '!=' e7= expression e8= expression ) | ^( LT e9= expression e10= expression ) | ^( '>' e11= expression e12= expression ) | ^( LTE e13= expression e14= expression ) | ^( '>=' e15= expression e16= expression ) | ^( IN e17= expression e18= expressionList ) | ^( NOT e19= expression e20= expressionList ) | ^( '+' e21= expression (e22= expression )? ) | ^( BROKEN_PLUS e21= expression e22= expression ) | ^( '-' e23= expression (e24= expression )? ) | ^( BROKEN_MINUS e23= expression e24= expression ) | ^( '*' e25= expression e26= expression ) | ^( '/' e27= expression e28= expression ) | ^( '!' e29= expression ) |e30= brackettedExpression |e31= primaryExpression )
            int alt80=19;
            switch ( input.LA(1) ) {
            case LOGICAL_OR:
                {
                alt80=1;
                }
                break;
            case LOGICAL_AND:
                {
                alt80=2;
                }
                break;
            case 257:
                {
                alt80=3;
                }
                break;
            case 252:
                {
                alt80=4;
                }
                break;
            case LT:
                {
                alt80=5;
                }
                break;
            case 258:
                {
                alt80=6;
                }
                break;
            case LTE:
                {
                alt80=7;
                }
                break;
            case 259:
                {
                alt80=8;
                }
                break;
            case IN:
                {
                alt80=9;
                }
                break;
            case NOT:
                {
                alt80=10;
                }
                break;
            case 254:
                {
                alt80=11;
                }
                break;
            case BROKEN_PLUS:
                {
                alt80=12;
                }
                break;
            case 255:
                {
                alt80=13;
                }
                break;
            case BROKEN_MINUS:
                {
                alt80=14;
                }
                break;
            case 253:
                {
                alt80=15;
                }
                break;
            case 256:
                {
                alt80=16;
                }
                break;
            case 251:
                {
                alt80=17;
                }
                break;
            case EXPRESSION:
                {
                alt80=18;
                }
                break;
            case ABS:
            case AVG:
            case BIG_DECIMAL:
            case BIG_INTEGER:
            case BNODE:
            case BOOLEAN:
            case BOUND:
            case CEIL:
            case COALESCE:
            case CONCAT:
            case CONTAINS:
            case COUNT:
            case DATATYPE:
            case DAY:
            case DOUBLE:
            case ENCODE_FOR_URI:
            case EXISTS:
            case FLOOR:
            case FUNCTION:
            case GROUP_CONCAT:
            case HOURS:
            case IF:
            case IRI:
            case ISBLANK:
            case ISIRI:
            case ISLITERAL:
            case ISNUMERIC:
            case ISURI:
            case LANG:
            case LANGMATCHES:
            case LCASE:
            case MAX:
            case MD5:
            case MIN:
            case MINUTES:
            case MONTH:
            case NOT_EXISTS:
            case NOW:
            case PREFIXED_NAME:
            case PREFIXED_NS:
            case RAND:
            case REGEX:
            case REPLACE:
            case ROUND:
            case SAMETERM:
            case SAMPLE:
            case SECONDS:
            case SHA1:
            case SHA256:
            case SHA384:
            case SHA512:
            case STR:
            case STRAFTER:
            case STRBEFORE:
            case STRDT:
            case STRENDS:
            case STRING:
            case STRLANG:
            case STRLEN:
            case STRSTARTS:
            case STRUUID:
            case SUBSTR:
            case SUM:
            case TIMEZONE:
            case TZ:
            case UCASE:
            case URI:
            case UUID:
            case VAR:
            case YEAR:
                {
                alt80=19;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return e;}
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;

            }

            switch (alt80) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:641:6: ^( LOGICAL_OR e1= expression e2= expression (e3= expression )* )
                    {
                    match(input,LOGICAL_OR,FOLLOW_LOGICAL_OR_in_expression4588); if (state.failed) return e;

                    if ( state.backtracking==0 ) { e = new JSONObject(); e.put("type", "or"); }

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_expression4600);
                    e1=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { e.put("left", e1);   }

                    pushFollow(FOLLOW_expression_in_expression4620);
                    e2=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { e.put("right", e2); 	}

                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:644:4: (e3= expression )*
                    loop76:
                    do {
                        int alt76=2;
                        int LA76_0 = input.LA(1);

                        if ( (LA76_0==ABS||LA76_0==AVG||(LA76_0 >= BIG_DECIMAL && LA76_0 <= BIG_INTEGER)||(LA76_0 >= BNODE && LA76_0 <= BROKEN_PLUS)||LA76_0==CEIL||LA76_0==COALESCE||LA76_0==CONCAT||LA76_0==CONTAINS||LA76_0==COUNT||(LA76_0 >= DATATYPE && LA76_0 <= DAY)||LA76_0==DOUBLE||LA76_0==ENCODE_FOR_URI||LA76_0==EXISTS||LA76_0==EXPRESSION||LA76_0==FLOOR||LA76_0==FUNCTION||LA76_0==GROUP_CONCAT||LA76_0==HOURS||(LA76_0 >= IF && LA76_0 <= IN)||LA76_0==IRI||(LA76_0 >= ISBLANK && LA76_0 <= ISURI)||(LA76_0 >= LANG && LA76_0 <= LANGMATCHES)||LA76_0==LCASE||(LA76_0 >= LOGICAL_AND && LA76_0 <= LTE)||(LA76_0 >= MAX && LA76_0 <= MIN)||LA76_0==MINUTES||LA76_0==MONTH||(LA76_0 >= NOT && LA76_0 <= NOT_EXISTS)||LA76_0==NOW||(LA76_0 >= PREFIXED_NAME && LA76_0 <= PREFIXED_NS)||LA76_0==RAND||(LA76_0 >= REGEX && LA76_0 <= REPLACE)||LA76_0==ROUND||(LA76_0 >= SAMETERM && LA76_0 <= SECONDS)||LA76_0==SHA1||(LA76_0 >= SHA256 && LA76_0 <= SHA512)||(LA76_0 >= STR && LA76_0 <= STRING)||(LA76_0 >= STRLANG && LA76_0 <= STRUUID)||LA76_0==SUBSTR||LA76_0==SUM||LA76_0==TIMEZONE||LA76_0==TZ||LA76_0==UCASE||LA76_0==URI||LA76_0==UUID||LA76_0==VAR||LA76_0==YEAR||(LA76_0 >= 251 && LA76_0 <= 259)) ) {
                            alt76=1;
                        }


                        switch (alt76) {
                    	case 1 :
                    	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:644:5: e3= expression
                    	    {
                    	    pushFollow(FOLLOW_expression_in_expression4631);
                    	    e3=expression();

                    	    state._fsp--;
                    	    if (state.failed) return e;

                    	    if ( state.backtracking==0 ) { JSONObject x = e;
                    	                                      e = new JSONObject();
                    	                                      e.put("left", x);
                    	                                      e.put("right", e3); 	}

                    	    }
                    	    break;

                    	default :
                    	    break loop76;
                        }
                    } while (true);


                    match(input, Token.UP, null); if (state.failed) return e;


                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:649:6: ^( LOGICAL_AND e1= expression e2= expression (e3= expression )* )
                    {
                    match(input,LOGICAL_AND,FOLLOW_LOGICAL_AND_in_expression4655); if (state.failed) return e;

                    if ( state.backtracking==0 ) { e = new JSONObject(); e.put("type", "and"); }

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_expression4667);
                    e1=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { e.put("left", e1);   }

                    pushFollow(FOLLOW_expression_in_expression4687);
                    e2=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { e.put("right", e2); 	}

                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:652:4: (e3= expression )*
                    loop77:
                    do {
                        int alt77=2;
                        int LA77_0 = input.LA(1);

                        if ( (LA77_0==ABS||LA77_0==AVG||(LA77_0 >= BIG_DECIMAL && LA77_0 <= BIG_INTEGER)||(LA77_0 >= BNODE && LA77_0 <= BROKEN_PLUS)||LA77_0==CEIL||LA77_0==COALESCE||LA77_0==CONCAT||LA77_0==CONTAINS||LA77_0==COUNT||(LA77_0 >= DATATYPE && LA77_0 <= DAY)||LA77_0==DOUBLE||LA77_0==ENCODE_FOR_URI||LA77_0==EXISTS||LA77_0==EXPRESSION||LA77_0==FLOOR||LA77_0==FUNCTION||LA77_0==GROUP_CONCAT||LA77_0==HOURS||(LA77_0 >= IF && LA77_0 <= IN)||LA77_0==IRI||(LA77_0 >= ISBLANK && LA77_0 <= ISURI)||(LA77_0 >= LANG && LA77_0 <= LANGMATCHES)||LA77_0==LCASE||(LA77_0 >= LOGICAL_AND && LA77_0 <= LTE)||(LA77_0 >= MAX && LA77_0 <= MIN)||LA77_0==MINUTES||LA77_0==MONTH||(LA77_0 >= NOT && LA77_0 <= NOT_EXISTS)||LA77_0==NOW||(LA77_0 >= PREFIXED_NAME && LA77_0 <= PREFIXED_NS)||LA77_0==RAND||(LA77_0 >= REGEX && LA77_0 <= REPLACE)||LA77_0==ROUND||(LA77_0 >= SAMETERM && LA77_0 <= SECONDS)||LA77_0==SHA1||(LA77_0 >= SHA256 && LA77_0 <= SHA512)||(LA77_0 >= STR && LA77_0 <= STRING)||(LA77_0 >= STRLANG && LA77_0 <= STRUUID)||LA77_0==SUBSTR||LA77_0==SUM||LA77_0==TIMEZONE||LA77_0==TZ||LA77_0==UCASE||LA77_0==URI||LA77_0==UUID||LA77_0==VAR||LA77_0==YEAR||(LA77_0 >= 251 && LA77_0 <= 259)) ) {
                            alt77=1;
                        }


                        switch (alt77) {
                    	case 1 :
                    	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:652:5: e3= expression
                    	    {
                    	    pushFollow(FOLLOW_expression_in_expression4698);
                    	    e3=expression();

                    	    state._fsp--;
                    	    if (state.failed) return e;

                    	    if ( state.backtracking==0 ) { JSONObject x = e;
                    	                                      e = new JSONObject();
                    	                                      e.put("left", x);
                    	                                      e.put("right", e3); 	}

                    	    }
                    	    break;

                    	default :
                    	    break loop77;
                        }
                    } while (true);


                    match(input, Token.UP, null); if (state.failed) return e;


                    }
                    break;
                case 3 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:657:6: ^( '=' e5= expression e6= expression )
                    {
                    match(input,257,FOLLOW_257_in_expression4722); if (state.failed) return e;

                    if ( state.backtracking==0 ) { e = new JSONObject(); e.put("type", "="); }

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_expression4736);
                    e5=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { e.put("left", e5); 				}

                    pushFollow(FOLLOW_expression_in_expression4747);
                    e6=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { e.put("right", e6); }

                    match(input, Token.UP, null); if (state.failed) return e;


                    }
                    break;
                case 4 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:661:4: ^( '!=' e7= expression e8= expression )
                    {
                    match(input,252,FOLLOW_252_in_expression4760); if (state.failed) return e;

                    if ( state.backtracking==0 ) { e = new JSONObject(); e.put("type", "!="); }

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_expression4774);
                    e7=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { e.put("left",e7); 				}

                    pushFollow(FOLLOW_expression_in_expression4785);
                    e8=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { e.put("right", e8);    }

                    match(input, Token.UP, null); if (state.failed) return e;


                    }
                    break;
                case 5 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:665:4: ^( LT e9= expression e10= expression )
                    {
                    match(input,LT,FOLLOW_LT_in_expression4804); if (state.failed) return e;

                    if ( state.backtracking==0 ) { e = new JSONObject(); e.put("type", "<"); }

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_expression4819);
                    e9=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { e.put("left",e9); 				}

                    pushFollow(FOLLOW_expression_in_expression4834);
                    e10=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { e.put("right", e10);		  }

                    match(input, Token.UP, null); if (state.failed) return e;


                    }
                    break;
                case 6 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:669:4: ^( '>' e11= expression e12= expression )
                    {
                    match(input,258,FOLLOW_258_in_expression4853); if (state.failed) return e;

                    if ( state.backtracking==0 ) { e = new JSONObject(); e.put("type", ">"); }

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_expression4868);
                    e11=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { e.put("left",e11); 				}

                    pushFollow(FOLLOW_expression_in_expression4879);
                    e12=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { e.put("right", e12);	  }

                    match(input, Token.UP, null); if (state.failed) return e;


                    }
                    break;
                case 7 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:673:4: ^( LTE e13= expression e14= expression )
                    {
                    match(input,LTE,FOLLOW_LTE_in_expression4898); if (state.failed) return e;

                    if ( state.backtracking==0 ) { e = new JSONObject(); e.put("type", "<="); }

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_expression4916);
                    e13=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { e.put("left",e13); 				}

                    pushFollow(FOLLOW_expression_in_expression4927);
                    e14=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { e.put("right", e14); }

                    match(input, Token.UP, null); if (state.failed) return e;


                    }
                    break;
                case 8 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:677:4: ^( '>=' e15= expression e16= expression )
                    {
                    match(input,259,FOLLOW_259_in_expression4945); if (state.failed) return e;

                    if ( state.backtracking==0 ) { e = new JSONObject(); e.put("type", ">="); }

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_expression4959);
                    e15=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { e.put("left",e15); 				}

                    pushFollow(FOLLOW_expression_in_expression4970);
                    e16=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { e.put("right", e16); }

                    match(input, Token.UP, null); if (state.failed) return e;


                    }
                    break;
                case 9 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:681:4: ^( IN e17= expression e18= expressionList )
                    {
                    match(input,IN,FOLLOW_IN_in_expression4989); if (state.failed) return e;

                    if ( state.backtracking==0 ) { e = new JSONObject(); e.put("type", "in"); }

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_expression5017);
                    e17=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { e.put("expr", e17); }

                    pushFollow(FOLLOW_expressionList_in_expression5031);
                    e18=expressionList();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { e.put("values", e18); }

                    match(input, Token.UP, null); if (state.failed) return e;


                    }
                    break;
                case 10 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:686:4: ^( NOT e19= expression e20= expressionList )
                    {
                    match(input,NOT,FOLLOW_NOT_in_expression5077); if (state.failed) return e;

                    if ( state.backtracking==0 ) { e = new JSONObject(); e.put("type", "notin"); }

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_expression5104);
                    e19=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { e.put("expr", e19); }

                    pushFollow(FOLLOW_expressionList_in_expression5118);
                    e20=expressionList();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { e.put("values", e20); }

                    match(input, Token.UP, null); if (state.failed) return e;


                    }
                    break;
                case 11 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:690:4: ^( '+' e21= expression (e22= expression )? )
                    {
                    match(input,254,FOLLOW_254_in_expression5153); if (state.failed) return e;

                    if ( state.backtracking==0 ) { e = new JSONObject(); e.put("type", "+"); }

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_expression5180);
                    e21=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { e.put("left", e21); 				}

                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:692:4: (e22= expression )?
                    int alt78=2;
                    int LA78_0 = input.LA(1);

                    if ( (LA78_0==ABS||LA78_0==AVG||(LA78_0 >= BIG_DECIMAL && LA78_0 <= BIG_INTEGER)||(LA78_0 >= BNODE && LA78_0 <= BROKEN_PLUS)||LA78_0==CEIL||LA78_0==COALESCE||LA78_0==CONCAT||LA78_0==CONTAINS||LA78_0==COUNT||(LA78_0 >= DATATYPE && LA78_0 <= DAY)||LA78_0==DOUBLE||LA78_0==ENCODE_FOR_URI||LA78_0==EXISTS||LA78_0==EXPRESSION||LA78_0==FLOOR||LA78_0==FUNCTION||LA78_0==GROUP_CONCAT||LA78_0==HOURS||(LA78_0 >= IF && LA78_0 <= IN)||LA78_0==IRI||(LA78_0 >= ISBLANK && LA78_0 <= ISURI)||(LA78_0 >= LANG && LA78_0 <= LANGMATCHES)||LA78_0==LCASE||(LA78_0 >= LOGICAL_AND && LA78_0 <= LTE)||(LA78_0 >= MAX && LA78_0 <= MIN)||LA78_0==MINUTES||LA78_0==MONTH||(LA78_0 >= NOT && LA78_0 <= NOT_EXISTS)||LA78_0==NOW||(LA78_0 >= PREFIXED_NAME && LA78_0 <= PREFIXED_NS)||LA78_0==RAND||(LA78_0 >= REGEX && LA78_0 <= REPLACE)||LA78_0==ROUND||(LA78_0 >= SAMETERM && LA78_0 <= SECONDS)||LA78_0==SHA1||(LA78_0 >= SHA256 && LA78_0 <= SHA512)||(LA78_0 >= STR && LA78_0 <= STRING)||(LA78_0 >= STRLANG && LA78_0 <= STRUUID)||LA78_0==SUBSTR||LA78_0==SUM||LA78_0==TIMEZONE||LA78_0==TZ||LA78_0==UCASE||LA78_0==URI||LA78_0==UUID||LA78_0==VAR||LA78_0==YEAR||(LA78_0 >= 251 && LA78_0 <= 259)) ) {
                        alt78=1;
                    }
                    switch (alt78) {
                        case 1 :
                            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:692:5: e22= expression
                            {
                            pushFollow(FOLLOW_expression_in_expression5192);
                            e22=expression();

                            state._fsp--;
                            if (state.failed) return e;

                            if ( state.backtracking==0 ) { e.put("right", e22);      			}

                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return e;


                    }
                    break;
                case 12 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:694:4: ^( BROKEN_PLUS e21= expression e22= expression )
                    {
                    match(input,BROKEN_PLUS,FOLLOW_BROKEN_PLUS_in_expression5214); if (state.failed) return e;

                    if ( state.backtracking==0 ) { e = new JSONObject(); e.put("type", "+"); }

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_expression5233);
                    e21=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { e.put("left",e21); 				}

                    pushFollow(FOLLOW_expression_in_expression5244);
                    e22=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { e.put("right", e22);      			}

                    match(input, Token.UP, null); if (state.failed) return e;


                    }
                    break;
                case 13 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:698:4: ^( '-' e23= expression (e24= expression )? )
                    {
                    match(input,255,FOLLOW_255_in_expression5263); if (state.failed) return e;

                    if ( state.backtracking==0 ) { e = new JSONObject(); e.put("type", "-"); }

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_expression5290);
                    e23=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { e.put("left", e23); }

                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:700:4: (e24= expression )?
                    int alt79=2;
                    int LA79_0 = input.LA(1);

                    if ( (LA79_0==ABS||LA79_0==AVG||(LA79_0 >= BIG_DECIMAL && LA79_0 <= BIG_INTEGER)||(LA79_0 >= BNODE && LA79_0 <= BROKEN_PLUS)||LA79_0==CEIL||LA79_0==COALESCE||LA79_0==CONCAT||LA79_0==CONTAINS||LA79_0==COUNT||(LA79_0 >= DATATYPE && LA79_0 <= DAY)||LA79_0==DOUBLE||LA79_0==ENCODE_FOR_URI||LA79_0==EXISTS||LA79_0==EXPRESSION||LA79_0==FLOOR||LA79_0==FUNCTION||LA79_0==GROUP_CONCAT||LA79_0==HOURS||(LA79_0 >= IF && LA79_0 <= IN)||LA79_0==IRI||(LA79_0 >= ISBLANK && LA79_0 <= ISURI)||(LA79_0 >= LANG && LA79_0 <= LANGMATCHES)||LA79_0==LCASE||(LA79_0 >= LOGICAL_AND && LA79_0 <= LTE)||(LA79_0 >= MAX && LA79_0 <= MIN)||LA79_0==MINUTES||LA79_0==MONTH||(LA79_0 >= NOT && LA79_0 <= NOT_EXISTS)||LA79_0==NOW||(LA79_0 >= PREFIXED_NAME && LA79_0 <= PREFIXED_NS)||LA79_0==RAND||(LA79_0 >= REGEX && LA79_0 <= REPLACE)||LA79_0==ROUND||(LA79_0 >= SAMETERM && LA79_0 <= SECONDS)||LA79_0==SHA1||(LA79_0 >= SHA256 && LA79_0 <= SHA512)||(LA79_0 >= STR && LA79_0 <= STRING)||(LA79_0 >= STRLANG && LA79_0 <= STRUUID)||LA79_0==SUBSTR||LA79_0==SUM||LA79_0==TIMEZONE||LA79_0==TZ||LA79_0==UCASE||LA79_0==URI||LA79_0==UUID||LA79_0==VAR||LA79_0==YEAR||(LA79_0 >= 251 && LA79_0 <= 259)) ) {
                        alt79=1;
                    }
                    switch (alt79) {
                        case 1 :
                            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:700:5: e24= expression
                            {
                            pushFollow(FOLLOW_expression_in_expression5302);
                            e24=expression();

                            state._fsp--;
                            if (state.failed) return e;

                            if ( state.backtracking==0 ) { e.put("right", e24); }

                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return e;


                    }
                    break;
                case 14 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:702:4: ^( BROKEN_MINUS e23= expression e24= expression )
                    {
                    match(input,BROKEN_MINUS,FOLLOW_BROKEN_MINUS_in_expression5319); if (state.failed) return e;

                    if ( state.backtracking==0 ) { e = new JSONObject(); e.put("type", "-"); }

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_expression5337);
                    e23=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { e.put("left",e23); 				}

                    pushFollow(FOLLOW_expression_in_expression5348);
                    e24=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { e.put("right",e24); 				}

                    match(input, Token.UP, null); if (state.failed) return e;


                    }
                    break;
                case 15 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:706:4: ^( '*' e25= expression e26= expression )
                    {
                    match(input,253,FOLLOW_253_in_expression5367); if (state.failed) return e;

                    if ( state.backtracking==0 ) { e = new JSONObject(); e.put("type", "*"); }

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_expression5394);
                    e25=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { e.put("left", e25); 				}

                    pushFollow(FOLLOW_expression_in_expression5405);
                    e26=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { e.put("right", e26);   				}

                    match(input, Token.UP, null); if (state.failed) return e;


                    }
                    break;
                case 16 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:710:4: ^( '/' e27= expression e28= expression )
                    {
                    match(input,256,FOLLOW_256_in_expression5424); if (state.failed) return e;

                    if ( state.backtracking==0 ) { e = new JSONObject(); e.put("type", "/"); }

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_expression5451);
                    e27=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { e.put("left", e27); 				}

                    pushFollow(FOLLOW_expression_in_expression5461);
                    e28=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { e.put("right", e28);   			}

                    match(input, Token.UP, null); if (state.failed) return e;


                    }
                    break;
                case 17 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:714:4: ^( '!' e29= expression )
                    {
                    match(input,251,FOLLOW_251_in_expression5479); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_expression5483);
                    e29=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { e = new JSONObject(); 
                                                      e.put("type", "!");
                                                      e.put("expr", e29); }

                    }
                    break;
                case 18 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:717:4: e30= brackettedExpression
                    {
                    pushFollow(FOLLOW_brackettedExpression_in_expression5494);
                    e30=brackettedExpression();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { e = new JSONObject(); e.put("expr", e30); }

                    }
                    break;
                case 19 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:718:5: e31= primaryExpression
                    {
                    pushFollow(FOLLOW_primaryExpression_in_expression5504);
                    e31=primaryExpression();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { e = new JSONObject(); e.put("expr", e31); }

                    }
                    break;

            }
        }

        	catch(RecognitionException eee) {
                throw new RuntimeException(eee);
            }

        finally {
        	// do for sure before leaving
        }
        return e;
    }
    // $ANTLR end "expression"



    // $ANTLR start "primaryExpression"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:722:1: primaryExpression returns [Object e] : (e1= builtInCall |i= iRIref |f= iRIFunction |r= rDFLiteral |n= numericLiteral |b= booleanLiteral |v= var |a= aggregate );
    public final Object primaryExpression() throws JSONException, RecognitionException {
        Object e = null;


        JSONObject e1 =null;

        IRI i =null;

        JSONObject f =null;

        StringLiteral r =null;

        Constant n =null;

        Boolean b =null;

        String v =null;

        JSONObject a =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:723:2: (e1= builtInCall |i= iRIref |f= iRIFunction |r= rDFLiteral |n= numericLiteral |b= booleanLiteral |v= var |a= aggregate )
            int alt81=8;
            switch ( input.LA(1) ) {
            case ABS:
            case BNODE:
            case BOUND:
            case CEIL:
            case COALESCE:
            case CONCAT:
            case CONTAINS:
            case DATATYPE:
            case DAY:
            case ENCODE_FOR_URI:
            case EXISTS:
            case FLOOR:
            case HOURS:
            case IF:
            case ISBLANK:
            case ISIRI:
            case ISLITERAL:
            case ISNUMERIC:
            case ISURI:
            case LANG:
            case LANGMATCHES:
            case LCASE:
            case MD5:
            case MINUTES:
            case MONTH:
            case NOT_EXISTS:
            case NOW:
            case RAND:
            case REGEX:
            case REPLACE:
            case ROUND:
            case SAMETERM:
            case SECONDS:
            case SHA1:
            case SHA256:
            case SHA384:
            case SHA512:
            case STR:
            case STRAFTER:
            case STRBEFORE:
            case STRDT:
            case STRENDS:
            case STRLANG:
            case STRLEN:
            case STRSTARTS:
            case STRUUID:
            case SUBSTR:
            case TIMEZONE:
            case TZ:
            case UCASE:
            case URI:
            case UUID:
            case YEAR:
                {
                alt81=1;
                }
                break;
            case IRI:
                {
                int LA81_2 = input.LA(2);

                if ( (LA81_2==DOWN) ) {
                    int LA81_10 = input.LA(3);

                    if ( (LA81_10==IRI_REF) ) {
                        alt81=2;
                    }
                    else if ( (LA81_10==ABS||LA81_10==AVG||(LA81_10 >= BIG_DECIMAL && LA81_10 <= BIG_INTEGER)||(LA81_10 >= BNODE && LA81_10 <= BROKEN_PLUS)||LA81_10==CEIL||LA81_10==COALESCE||LA81_10==CONCAT||LA81_10==CONTAINS||LA81_10==COUNT||(LA81_10 >= DATATYPE && LA81_10 <= DAY)||LA81_10==DOUBLE||LA81_10==ENCODE_FOR_URI||LA81_10==EXISTS||LA81_10==EXPRESSION||LA81_10==FLOOR||LA81_10==FUNCTION||LA81_10==GROUP_CONCAT||LA81_10==HOURS||(LA81_10 >= IF && LA81_10 <= IN)||LA81_10==IRI||(LA81_10 >= ISBLANK && LA81_10 <= ISURI)||(LA81_10 >= LANG && LA81_10 <= LANGMATCHES)||LA81_10==LCASE||(LA81_10 >= LOGICAL_AND && LA81_10 <= LTE)||(LA81_10 >= MAX && LA81_10 <= MIN)||LA81_10==MINUTES||LA81_10==MONTH||(LA81_10 >= NOT && LA81_10 <= NOT_EXISTS)||LA81_10==NOW||(LA81_10 >= PREFIXED_NAME && LA81_10 <= PREFIXED_NS)||LA81_10==RAND||(LA81_10 >= REGEX && LA81_10 <= REPLACE)||LA81_10==ROUND||(LA81_10 >= SAMETERM && LA81_10 <= SECONDS)||LA81_10==SHA1||(LA81_10 >= SHA256 && LA81_10 <= SHA512)||(LA81_10 >= STR && LA81_10 <= STRING)||(LA81_10 >= STRLANG && LA81_10 <= STRUUID)||LA81_10==SUBSTR||LA81_10==SUM||LA81_10==TIMEZONE||LA81_10==TZ||LA81_10==UCASE||LA81_10==URI||LA81_10==UUID||LA81_10==VAR||LA81_10==YEAR||(LA81_10 >= 251 && LA81_10 <= 259)) ) {
                        alt81=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return e;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 81, 10, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return e;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 81, 2, input);

                    throw nvae;

                }
                }
                break;
            case PREFIXED_NAME:
            case PREFIXED_NS:
                {
                alt81=2;
                }
                break;
            case FUNCTION:
                {
                alt81=3;
                }
                break;
            case STRING:
                {
                alt81=4;
                }
                break;
            case BIG_DECIMAL:
            case BIG_INTEGER:
            case DOUBLE:
                {
                alt81=5;
                }
                break;
            case BOOLEAN:
                {
                alt81=6;
                }
                break;
            case VAR:
                {
                alt81=7;
                }
                break;
            case AVG:
            case COUNT:
            case GROUP_CONCAT:
            case MAX:
            case MIN:
            case SAMPLE:
            case SUM:
                {
                alt81=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return e;}
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;

            }

            switch (alt81) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:723:6: e1= builtInCall
                    {
                    pushFollow(FOLLOW_builtInCall_in_primaryExpression5533);
                    e1=builtInCall();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { e = e1; }

                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:724:5: i= iRIref
                    {
                    pushFollow(FOLLOW_iRIref_in_primaryExpression5545);
                    i=iRIref();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { e = i; }

                    }
                    break;
                case 3 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:725:4: f= iRIFunction
                    {
                    pushFollow(FOLLOW_iRIFunction_in_primaryExpression5557);
                    f=iRIFunction();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { e = f; }

                    }
                    break;
                case 4 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:726:5: r= rDFLiteral
                    {
                    pushFollow(FOLLOW_rDFLiteral_in_primaryExpression5569);
                    r=rDFLiteral();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { e = r; }

                    }
                    break;
                case 5 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:727:5: n= numericLiteral
                    {
                    pushFollow(FOLLOW_numericLiteral_in_primaryExpression5581);
                    n=numericLiteral();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { e = n; }

                    }
                    break;
                case 6 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:728:5: b= booleanLiteral
                    {
                    pushFollow(FOLLOW_booleanLiteral_in_primaryExpression5592);
                    b=booleanLiteral();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { e = b; }

                    }
                    break;
                case 7 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:729:5: v= var
                    {
                    pushFollow(FOLLOW_var_in_primaryExpression5603);
                    v=var();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { e = v; }

                    }
                    break;
                case 8 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:730:5: a= aggregate
                    {
                    pushFollow(FOLLOW_aggregate_in_primaryExpression5617);
                    a=aggregate();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { e = a; }

                    }
                    break;

            }
        }

        	catch(RecognitionException eee) {
                throw new RuntimeException(eee);
            }

        finally {
        	// do for sure before leaving
        }
        return e;
    }
    // $ANTLR end "primaryExpression"



    // $ANTLR start "brackettedExpression"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:733:1: brackettedExpression returns [Object e] : ^( EXPRESSION e1= expression ) ;
    public final Object brackettedExpression() throws JSONException, RecognitionException {
        Object e = null;


        JSONObject e1 =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:734:2: ( ^( EXPRESSION e1= expression ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:734:4: ^( EXPRESSION e1= expression )
            {
            match(input,EXPRESSION,FOLLOW_EXPRESSION_in_brackettedExpression5644); if (state.failed) return e;

            match(input, Token.DOWN, null); if (state.failed) return e;
            pushFollow(FOLLOW_expression_in_brackettedExpression5649);
            e1=expression();

            state._fsp--;
            if (state.failed) return e;

            match(input, Token.UP, null); if (state.failed) return e;


            if ( state.backtracking==0 ) { e = e1; }

            }

        }

        	catch(RecognitionException eee) {
                throw new RuntimeException(eee);
            }

        finally {
        	// do for sure before leaving
        }
        return e;
    }
    // $ANTLR end "brackettedExpression"



    // $ANTLR start "builtInCall"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:737:1: builtInCall returns [JSONObject e] : ( ^( STR st= expression ) | ^( LANG lg= expression ) | ^( LANGMATCHES lm1= expression lm2= expression ) | ^( DATATYPE dt= expression ) | ^( BOUND v= var ) | ^( IRI e6= expression ) | ^( URI e7= expression ) | ^( BNODE e8= expression ) | BNODE | ^( RAND NIL ) | ^( ABS e9= expression ) | ^( CEIL e10= expression ) | ^( FLOOR e11= expression ) | ^( ROUND e12= expression ) | ^( CONCAT e13= expressionList ) | ^( SUBSTR e14= expression e15= expression (e16= expression )? ) | ^( STRLEN e15= expression ) | ^( UCASE e16= expression ) | ^( REPLACE e1= expression e2= expression e3= expression (e4= expression )? ) | ^( LCASE e17= expression ) | ^( ENCODE_FOR_URI e18= expression ) | ^( CONTAINS e19= expression e20= expression ) | ^( STRSTARTS e21= expression e22= expression ) | ^( STRENDS e23= expression e24= expression ) | ^( STRBEFORE e241= expression e242= expression ) | ^( STRAFTER e243= expression e244= expression ) | ^( YEAR e25= expression ) | ^( MONTH e26= expression ) | ^( DAY e27= expression ) | ^( HOURS e28= expression ) | ^( MINUTES e29= expression ) | ^( SECONDS e30= expression ) | ^( TIMEZONE e31= expression ) | ^( TZ e32= expression ) | NOW | UUID | STRUUID | ^( MD5 e33= expression ) | ^( SHA1 e34= expression ) | ^( SHA256 e36= expression ) | ^( SHA384 e37= expression ) | ^( SHA512 e38= expression ) | ^( COALESCE e39= expressionList ) | ^( IF e40= expression e41= expression e42= expression ) | ^( STRLANG e45= expression e46= expression ) | ^( STRDT e47= expression e48= expression ) | ^( SAMETERM sam1= expression sam2= expression ) | ^( ISIRI isi= expression ) | ^( ISURI isu= expression ) | ^( ISBLANK isb= expression ) | ^( ISLITERAL isl= expression ) | ^( ISNUMERIC e55= expression ) | ^( REGEX e1= expression e2= expression (e3= expression )? ) |p= existsFunc |p= notExistsFunc ) ;
    public final JSONObject builtInCall() throws JSONException, RecognitionException {
        JSONObject e = null;


        JSONObject st =null;

        JSONObject lg =null;

        JSONObject lm1 =null;

        JSONObject lm2 =null;

        JSONObject dt =null;

        String v =null;

        JSONObject e6 =null;

        JSONObject e7 =null;

        JSONObject e8 =null;

        JSONObject e9 =null;

        JSONObject e10 =null;

        JSONObject e11 =null;

        JSONObject e12 =null;

        JSONArray e13 =null;

        JSONObject e14 =null;

        JSONObject e15 =null;

        JSONObject e16 =null;

        JSONObject e1 =null;

        JSONObject e2 =null;

        JSONObject e3 =null;

        JSONObject e4 =null;

        JSONObject e17 =null;

        JSONObject e18 =null;

        JSONObject e19 =null;

        JSONObject e20 =null;

        JSONObject e21 =null;

        JSONObject e22 =null;

        JSONObject e23 =null;

        JSONObject e24 =null;

        JSONObject e241 =null;

        JSONObject e242 =null;

        JSONObject e243 =null;

        JSONObject e244 =null;

        JSONObject e25 =null;

        JSONObject e26 =null;

        JSONObject e27 =null;

        JSONObject e28 =null;

        JSONObject e29 =null;

        JSONObject e30 =null;

        JSONObject e31 =null;

        JSONObject e32 =null;

        JSONObject e33 =null;

        JSONObject e34 =null;

        JSONObject e36 =null;

        JSONObject e37 =null;

        JSONObject e38 =null;

        JSONArray e39 =null;

        JSONObject e40 =null;

        JSONObject e41 =null;

        JSONObject e42 =null;

        JSONObject e45 =null;

        JSONObject e46 =null;

        JSONObject e47 =null;

        JSONObject e48 =null;

        JSONObject sam1 =null;

        JSONObject sam2 =null;

        JSONObject isi =null;

        JSONObject isu =null;

        JSONObject isb =null;

        JSONObject isl =null;

        JSONObject e55 =null;

        Object p =null;



                String op = null;
        		ArrayList args = new ArrayList();
        	
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:742:2: ( ( ^( STR st= expression ) | ^( LANG lg= expression ) | ^( LANGMATCHES lm1= expression lm2= expression ) | ^( DATATYPE dt= expression ) | ^( BOUND v= var ) | ^( IRI e6= expression ) | ^( URI e7= expression ) | ^( BNODE e8= expression ) | BNODE | ^( RAND NIL ) | ^( ABS e9= expression ) | ^( CEIL e10= expression ) | ^( FLOOR e11= expression ) | ^( ROUND e12= expression ) | ^( CONCAT e13= expressionList ) | ^( SUBSTR e14= expression e15= expression (e16= expression )? ) | ^( STRLEN e15= expression ) | ^( UCASE e16= expression ) | ^( REPLACE e1= expression e2= expression e3= expression (e4= expression )? ) | ^( LCASE e17= expression ) | ^( ENCODE_FOR_URI e18= expression ) | ^( CONTAINS e19= expression e20= expression ) | ^( STRSTARTS e21= expression e22= expression ) | ^( STRENDS e23= expression e24= expression ) | ^( STRBEFORE e241= expression e242= expression ) | ^( STRAFTER e243= expression e244= expression ) | ^( YEAR e25= expression ) | ^( MONTH e26= expression ) | ^( DAY e27= expression ) | ^( HOURS e28= expression ) | ^( MINUTES e29= expression ) | ^( SECONDS e30= expression ) | ^( TIMEZONE e31= expression ) | ^( TZ e32= expression ) | NOW | UUID | STRUUID | ^( MD5 e33= expression ) | ^( SHA1 e34= expression ) | ^( SHA256 e36= expression ) | ^( SHA384 e37= expression ) | ^( SHA512 e38= expression ) | ^( COALESCE e39= expressionList ) | ^( IF e40= expression e41= expression e42= expression ) | ^( STRLANG e45= expression e46= expression ) | ^( STRDT e47= expression e48= expression ) | ^( SAMETERM sam1= expression sam2= expression ) | ^( ISIRI isi= expression ) | ^( ISURI isu= expression ) | ^( ISBLANK isb= expression ) | ^( ISLITERAL isl= expression ) | ^( ISNUMERIC e55= expression ) | ^( REGEX e1= expression e2= expression (e3= expression )? ) |p= existsFunc |p= notExistsFunc ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:742:5: ( ^( STR st= expression ) | ^( LANG lg= expression ) | ^( LANGMATCHES lm1= expression lm2= expression ) | ^( DATATYPE dt= expression ) | ^( BOUND v= var ) | ^( IRI e6= expression ) | ^( URI e7= expression ) | ^( BNODE e8= expression ) | BNODE | ^( RAND NIL ) | ^( ABS e9= expression ) | ^( CEIL e10= expression ) | ^( FLOOR e11= expression ) | ^( ROUND e12= expression ) | ^( CONCAT e13= expressionList ) | ^( SUBSTR e14= expression e15= expression (e16= expression )? ) | ^( STRLEN e15= expression ) | ^( UCASE e16= expression ) | ^( REPLACE e1= expression e2= expression e3= expression (e4= expression )? ) | ^( LCASE e17= expression ) | ^( ENCODE_FOR_URI e18= expression ) | ^( CONTAINS e19= expression e20= expression ) | ^( STRSTARTS e21= expression e22= expression ) | ^( STRENDS e23= expression e24= expression ) | ^( STRBEFORE e241= expression e242= expression ) | ^( STRAFTER e243= expression e244= expression ) | ^( YEAR e25= expression ) | ^( MONTH e26= expression ) | ^( DAY e27= expression ) | ^( HOURS e28= expression ) | ^( MINUTES e29= expression ) | ^( SECONDS e30= expression ) | ^( TIMEZONE e31= expression ) | ^( TZ e32= expression ) | NOW | UUID | STRUUID | ^( MD5 e33= expression ) | ^( SHA1 e34= expression ) | ^( SHA256 e36= expression ) | ^( SHA384 e37= expression ) | ^( SHA512 e38= expression ) | ^( COALESCE e39= expressionList ) | ^( IF e40= expression e41= expression e42= expression ) | ^( STRLANG e45= expression e46= expression ) | ^( STRDT e47= expression e48= expression ) | ^( SAMETERM sam1= expression sam2= expression ) | ^( ISIRI isi= expression ) | ^( ISURI isu= expression ) | ^( ISBLANK isb= expression ) | ^( ISLITERAL isl= expression ) | ^( ISNUMERIC e55= expression ) | ^( REGEX e1= expression e2= expression (e3= expression )? ) |p= existsFunc |p= notExistsFunc )
            {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:742:5: ( ^( STR st= expression ) | ^( LANG lg= expression ) | ^( LANGMATCHES lm1= expression lm2= expression ) | ^( DATATYPE dt= expression ) | ^( BOUND v= var ) | ^( IRI e6= expression ) | ^( URI e7= expression ) | ^( BNODE e8= expression ) | BNODE | ^( RAND NIL ) | ^( ABS e9= expression ) | ^( CEIL e10= expression ) | ^( FLOOR e11= expression ) | ^( ROUND e12= expression ) | ^( CONCAT e13= expressionList ) | ^( SUBSTR e14= expression e15= expression (e16= expression )? ) | ^( STRLEN e15= expression ) | ^( UCASE e16= expression ) | ^( REPLACE e1= expression e2= expression e3= expression (e4= expression )? ) | ^( LCASE e17= expression ) | ^( ENCODE_FOR_URI e18= expression ) | ^( CONTAINS e19= expression e20= expression ) | ^( STRSTARTS e21= expression e22= expression ) | ^( STRENDS e23= expression e24= expression ) | ^( STRBEFORE e241= expression e242= expression ) | ^( STRAFTER e243= expression e244= expression ) | ^( YEAR e25= expression ) | ^( MONTH e26= expression ) | ^( DAY e27= expression ) | ^( HOURS e28= expression ) | ^( MINUTES e29= expression ) | ^( SECONDS e30= expression ) | ^( TIMEZONE e31= expression ) | ^( TZ e32= expression ) | NOW | UUID | STRUUID | ^( MD5 e33= expression ) | ^( SHA1 e34= expression ) | ^( SHA256 e36= expression ) | ^( SHA384 e37= expression ) | ^( SHA512 e38= expression ) | ^( COALESCE e39= expressionList ) | ^( IF e40= expression e41= expression e42= expression ) | ^( STRLANG e45= expression e46= expression ) | ^( STRDT e47= expression e48= expression ) | ^( SAMETERM sam1= expression sam2= expression ) | ^( ISIRI isi= expression ) | ^( ISURI isu= expression ) | ^( ISBLANK isb= expression ) | ^( ISLITERAL isl= expression ) | ^( ISNUMERIC e55= expression ) | ^( REGEX e1= expression e2= expression (e3= expression )? ) |p= existsFunc |p= notExistsFunc )
            int alt85=55;
            switch ( input.LA(1) ) {
            case STR:
                {
                alt85=1;
                }
                break;
            case LANG:
                {
                alt85=2;
                }
                break;
            case LANGMATCHES:
                {
                alt85=3;
                }
                break;
            case DATATYPE:
                {
                alt85=4;
                }
                break;
            case BOUND:
                {
                alt85=5;
                }
                break;
            case IRI:
                {
                alt85=6;
                }
                break;
            case URI:
                {
                alt85=7;
                }
                break;
            case BNODE:
                {
                int LA85_8 = input.LA(2);

                if ( (LA85_8==DOWN) ) {
                    alt85=8;
                }
                else if ( (LA85_8==UP||LA85_8==ABS||LA85_8==ASC||LA85_8==AVG||(LA85_8 >= BIG_DECIMAL && LA85_8 <= BIG_INTEGER)||(LA85_8 >= BNODE && LA85_8 <= BROKEN_PLUS)||LA85_8==CEIL||LA85_8==COALESCE||(LA85_8 >= CONCAT && LA85_8 <= CONDITION)||LA85_8==CONTAINS||LA85_8==COUNT||(LA85_8 >= DATATYPE && LA85_8 <= DAY)||LA85_8==DESC||LA85_8==DOUBLE||LA85_8==ENCODE_FOR_URI||LA85_8==EXISTS||LA85_8==EXPRESSION||LA85_8==FLOOR||LA85_8==FUNCTION||LA85_8==GROUP_CONCAT||LA85_8==HOURS||(LA85_8 >= IF && LA85_8 <= IN)||LA85_8==IRI||(LA85_8 >= ISBLANK && LA85_8 <= ISURI)||(LA85_8 >= LANG && LA85_8 <= LANGMATCHES)||LA85_8==LCASE||(LA85_8 >= LOGICAL_AND && LA85_8 <= LTE)||(LA85_8 >= MAX && LA85_8 <= MIN)||LA85_8==MINUTES||LA85_8==MONTH||LA85_8==NIL||(LA85_8 >= NOT && LA85_8 <= NOT_EXISTS)||LA85_8==NOW||(LA85_8 >= PREFIXED_NAME && LA85_8 <= PREFIXED_NS)||LA85_8==RAND||(LA85_8 >= REGEX && LA85_8 <= REPLACE)||LA85_8==ROUND||(LA85_8 >= SAMETERM && LA85_8 <= SECONDS)||LA85_8==SEPARATOR||LA85_8==SHA1||(LA85_8 >= SHA256 && LA85_8 <= SHA512)||(LA85_8 >= STR && LA85_8 <= STRING)||(LA85_8 >= STRLANG && LA85_8 <= STRUUID)||LA85_8==SUBSTR||LA85_8==SUM||LA85_8==TIMEZONE||LA85_8==TZ||LA85_8==UCASE||LA85_8==URI||LA85_8==UUID||LA85_8==VAR||LA85_8==YEAR||(LA85_8 >= 251 && LA85_8 <= 259)) ) {
                    alt85=9;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return e;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 85, 8, input);

                    throw nvae;

                }
                }
                break;
            case RAND:
                {
                alt85=10;
                }
                break;
            case ABS:
                {
                alt85=11;
                }
                break;
            case CEIL:
                {
                alt85=12;
                }
                break;
            case FLOOR:
                {
                alt85=13;
                }
                break;
            case ROUND:
                {
                alt85=14;
                }
                break;
            case CONCAT:
                {
                alt85=15;
                }
                break;
            case SUBSTR:
                {
                alt85=16;
                }
                break;
            case STRLEN:
                {
                alt85=17;
                }
                break;
            case UCASE:
                {
                alt85=18;
                }
                break;
            case REPLACE:
                {
                alt85=19;
                }
                break;
            case LCASE:
                {
                alt85=20;
                }
                break;
            case ENCODE_FOR_URI:
                {
                alt85=21;
                }
                break;
            case CONTAINS:
                {
                alt85=22;
                }
                break;
            case STRSTARTS:
                {
                alt85=23;
                }
                break;
            case STRENDS:
                {
                alt85=24;
                }
                break;
            case STRBEFORE:
                {
                alt85=25;
                }
                break;
            case STRAFTER:
                {
                alt85=26;
                }
                break;
            case YEAR:
                {
                alt85=27;
                }
                break;
            case MONTH:
                {
                alt85=28;
                }
                break;
            case DAY:
                {
                alt85=29;
                }
                break;
            case HOURS:
                {
                alt85=30;
                }
                break;
            case MINUTES:
                {
                alt85=31;
                }
                break;
            case SECONDS:
                {
                alt85=32;
                }
                break;
            case TIMEZONE:
                {
                alt85=33;
                }
                break;
            case TZ:
                {
                alt85=34;
                }
                break;
            case NOW:
                {
                alt85=35;
                }
                break;
            case UUID:
                {
                alt85=36;
                }
                break;
            case STRUUID:
                {
                alt85=37;
                }
                break;
            case MD5:
                {
                alt85=38;
                }
                break;
            case SHA1:
                {
                alt85=39;
                }
                break;
            case SHA256:
                {
                alt85=40;
                }
                break;
            case SHA384:
                {
                alt85=41;
                }
                break;
            case SHA512:
                {
                alt85=42;
                }
                break;
            case COALESCE:
                {
                alt85=43;
                }
                break;
            case IF:
                {
                alt85=44;
                }
                break;
            case STRLANG:
                {
                alt85=45;
                }
                break;
            case STRDT:
                {
                alt85=46;
                }
                break;
            case SAMETERM:
                {
                alt85=47;
                }
                break;
            case ISIRI:
                {
                alt85=48;
                }
                break;
            case ISURI:
                {
                alt85=49;
                }
                break;
            case ISBLANK:
                {
                alt85=50;
                }
                break;
            case ISLITERAL:
                {
                alt85=51;
                }
                break;
            case ISNUMERIC:
                {
                alt85=52;
                }
                break;
            case REGEX:
                {
                alt85=53;
                }
                break;
            case EXISTS:
                {
                alt85=54;
                }
                break;
            case NOT_EXISTS:
                {
                alt85=55;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return e;}
                NoViableAltException nvae =
                    new NoViableAltException("", 85, 0, input);

                throw nvae;

            }

            switch (alt85) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:742:6: ^( STR st= expression )
                    {
                    match(input,STR,FOLLOW_STR_in_builtInCall5684); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall5688);
                    st=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { args.add(st); op = "str"; }

                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:744:5: ^( LANG lg= expression )
                    {
                    match(input,LANG,FOLLOW_LANG_in_builtInCall5701); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall5705);
                    lg=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { args.add(lg); op = "lang"; }

                    }
                    break;
                case 3 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:746:5: ^( LANGMATCHES lm1= expression lm2= expression )
                    {
                    match(input,LANGMATCHES,FOLLOW_LANGMATCHES_in_builtInCall5718); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall5722);
                    lm1=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    pushFollow(FOLLOW_expression_in_builtInCall5726);
                    lm2=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { args.add(lm1); args.add(lm2); op = "langmatches"; }

                    }
                    break;
                case 4 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:748:5: ^( DATATYPE dt= expression )
                    {
                    match(input,DATATYPE,FOLLOW_DATATYPE_in_builtInCall5739); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall5743);
                    dt=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { args.add(dt); op = "datatype"; }

                    }
                    break;
                case 5 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:750:4: ^( BOUND v= var )
                    {
                    match(input,BOUND,FOLLOW_BOUND_in_builtInCall5755); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_var_in_builtInCall5759);
                    v=var();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { args.add(v); op = "bound"; }

                    }
                    break;
                case 6 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:752:4: ^( IRI e6= expression )
                    {
                    match(input,IRI,FOLLOW_IRI_in_builtInCall5777); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall5781);
                    e6=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { args.add(e6); op = "iri"; }

                    }
                    break;
                case 7 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:754:5: ^( URI e7= expression )
                    {
                    match(input,URI,FOLLOW_URI_in_builtInCall5794); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall5798);
                    e7=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { args.add(e7); op = "uri"; }

                    }
                    break;
                case 8 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:756:4: ^( BNODE e8= expression )
                    {
                    match(input,BNODE,FOLLOW_BNODE_in_builtInCall5810); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall5814);
                    e8=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { args.add(e8); op = "bnode"; }

                    }
                    break;
                case 9 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:758:4: BNODE
                    {
                    match(input,BNODE,FOLLOW_BNODE_in_builtInCall5825); if (state.failed) return e;

                    if ( state.backtracking==0 ) { op = "bnode"; }

                    }
                    break;
                case 10 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:760:4: ^( RAND NIL )
                    {
                    match(input,RAND,FOLLOW_RAND_in_builtInCall5836); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    match(input,NIL,FOLLOW_NIL_in_builtInCall5838); if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { op = "rand"; }

                    }
                    break;
                case 11 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:762:4: ^( ABS e9= expression )
                    {
                    match(input,ABS,FOLLOW_ABS_in_builtInCall5851); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall5855);
                    e9=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { args.add(e9); op = "abs"; }

                    }
                    break;
                case 12 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:764:4: ^( CEIL e10= expression )
                    {
                    match(input,CEIL,FOLLOW_CEIL_in_builtInCall5867); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall5871);
                    e10=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { args.add(e10); op = "ceil"; }

                    }
                    break;
                case 13 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:766:4: ^( FLOOR e11= expression )
                    {
                    match(input,FLOOR,FOLLOW_FLOOR_in_builtInCall5883); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall5887);
                    e11=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { args.add(e11); op = "floor"; }

                    }
                    break;
                case 14 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:768:4: ^( ROUND e12= expression )
                    {
                    match(input,ROUND,FOLLOW_ROUND_in_builtInCall5899); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall5903);
                    e12=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { args.add(e12); op = "round"; }

                    }
                    break;
                case 15 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:770:4: ^( CONCAT e13= expressionList )
                    {
                    match(input,CONCAT,FOLLOW_CONCAT_in_builtInCall5915); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expressionList_in_builtInCall5919);
                    e13=expressionList();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { putAll(args, e13); op = "concat"; }

                    }
                    break;
                case 16 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:772:5: ^( SUBSTR e14= expression e15= expression (e16= expression )? )
                    {
                    match(input,SUBSTR,FOLLOW_SUBSTR_in_builtInCall5932); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall5936);
                    e14=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    pushFollow(FOLLOW_expression_in_builtInCall5940);
                    e15=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { args.add(e14); args.add(e15); }

                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:774:13: (e16= expression )?
                    int alt82=2;
                    int LA82_0 = input.LA(1);

                    if ( (LA82_0==ABS||LA82_0==AVG||(LA82_0 >= BIG_DECIMAL && LA82_0 <= BIG_INTEGER)||(LA82_0 >= BNODE && LA82_0 <= BROKEN_PLUS)||LA82_0==CEIL||LA82_0==COALESCE||LA82_0==CONCAT||LA82_0==CONTAINS||LA82_0==COUNT||(LA82_0 >= DATATYPE && LA82_0 <= DAY)||LA82_0==DOUBLE||LA82_0==ENCODE_FOR_URI||LA82_0==EXISTS||LA82_0==EXPRESSION||LA82_0==FLOOR||LA82_0==FUNCTION||LA82_0==GROUP_CONCAT||LA82_0==HOURS||(LA82_0 >= IF && LA82_0 <= IN)||LA82_0==IRI||(LA82_0 >= ISBLANK && LA82_0 <= ISURI)||(LA82_0 >= LANG && LA82_0 <= LANGMATCHES)||LA82_0==LCASE||(LA82_0 >= LOGICAL_AND && LA82_0 <= LTE)||(LA82_0 >= MAX && LA82_0 <= MIN)||LA82_0==MINUTES||LA82_0==MONTH||(LA82_0 >= NOT && LA82_0 <= NOT_EXISTS)||LA82_0==NOW||(LA82_0 >= PREFIXED_NAME && LA82_0 <= PREFIXED_NS)||LA82_0==RAND||(LA82_0 >= REGEX && LA82_0 <= REPLACE)||LA82_0==ROUND||(LA82_0 >= SAMETERM && LA82_0 <= SECONDS)||LA82_0==SHA1||(LA82_0 >= SHA256 && LA82_0 <= SHA512)||(LA82_0 >= STR && LA82_0 <= STRING)||(LA82_0 >= STRLANG && LA82_0 <= STRUUID)||LA82_0==SUBSTR||LA82_0==SUM||LA82_0==TIMEZONE||LA82_0==TZ||LA82_0==UCASE||LA82_0==URI||LA82_0==UUID||LA82_0==VAR||LA82_0==YEAR||(LA82_0 >= 251 && LA82_0 <= 259)) ) {
                        alt82=1;
                    }
                    switch (alt82) {
                        case 1 :
                            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:774:15: e16= expression
                            {
                            pushFollow(FOLLOW_expression_in_builtInCall5964);
                            e16=expression();

                            state._fsp--;
                            if (state.failed) return e;

                            if ( state.backtracking==0 ) { args.add(e16); }

                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) {
                              op = "substr";
                            }

                    }
                    break;
                case 17 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:778:4: ^( STRLEN e15= expression )
                    {
                    match(input,STRLEN,FOLLOW_STRLEN_in_builtInCall5987); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall5991);
                    e15=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { args.add(e15); op = "strlen"; }

                    }
                    break;
                case 18 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:780:4: ^( UCASE e16= expression )
                    {
                    match(input,UCASE,FOLLOW_UCASE_in_builtInCall6003); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall6007);
                    e16=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { args.add(e16); op = "ucase"; }

                    }
                    break;
                case 19 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:782:4: ^( REPLACE e1= expression e2= expression e3= expression (e4= expression )? )
                    {
                    match(input,REPLACE,FOLLOW_REPLACE_in_builtInCall6019); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall6023);
                    e1=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    pushFollow(FOLLOW_expression_in_builtInCall6027);
                    e2=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    pushFollow(FOLLOW_expression_in_builtInCall6031);
                    e3=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { args.add(e1); args.add(e2); args.add(e3); }

                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:784:13: (e4= expression )?
                    int alt83=2;
                    int LA83_0 = input.LA(1);

                    if ( (LA83_0==ABS||LA83_0==AVG||(LA83_0 >= BIG_DECIMAL && LA83_0 <= BIG_INTEGER)||(LA83_0 >= BNODE && LA83_0 <= BROKEN_PLUS)||LA83_0==CEIL||LA83_0==COALESCE||LA83_0==CONCAT||LA83_0==CONTAINS||LA83_0==COUNT||(LA83_0 >= DATATYPE && LA83_0 <= DAY)||LA83_0==DOUBLE||LA83_0==ENCODE_FOR_URI||LA83_0==EXISTS||LA83_0==EXPRESSION||LA83_0==FLOOR||LA83_0==FUNCTION||LA83_0==GROUP_CONCAT||LA83_0==HOURS||(LA83_0 >= IF && LA83_0 <= IN)||LA83_0==IRI||(LA83_0 >= ISBLANK && LA83_0 <= ISURI)||(LA83_0 >= LANG && LA83_0 <= LANGMATCHES)||LA83_0==LCASE||(LA83_0 >= LOGICAL_AND && LA83_0 <= LTE)||(LA83_0 >= MAX && LA83_0 <= MIN)||LA83_0==MINUTES||LA83_0==MONTH||(LA83_0 >= NOT && LA83_0 <= NOT_EXISTS)||LA83_0==NOW||(LA83_0 >= PREFIXED_NAME && LA83_0 <= PREFIXED_NS)||LA83_0==RAND||(LA83_0 >= REGEX && LA83_0 <= REPLACE)||LA83_0==ROUND||(LA83_0 >= SAMETERM && LA83_0 <= SECONDS)||LA83_0==SHA1||(LA83_0 >= SHA256 && LA83_0 <= SHA512)||(LA83_0 >= STR && LA83_0 <= STRING)||(LA83_0 >= STRLANG && LA83_0 <= STRUUID)||LA83_0==SUBSTR||LA83_0==SUM||LA83_0==TIMEZONE||LA83_0==TZ||LA83_0==UCASE||LA83_0==URI||LA83_0==UUID||LA83_0==VAR||LA83_0==YEAR||(LA83_0 >= 251 && LA83_0 <= 259)) ) {
                        alt83=1;
                    }
                    switch (alt83) {
                        case 1 :
                            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:784:15: e4= expression
                            {
                            pushFollow(FOLLOW_expression_in_builtInCall6055);
                            e4=expression();

                            state._fsp--;
                            if (state.failed) return e;

                            if ( state.backtracking==0 ) { args.add(e4); }

                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { op = "replace"; }

                    }
                    break;
                case 20 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:786:4: ^( LCASE e17= expression )
                    {
                    match(input,LCASE,FOLLOW_LCASE_in_builtInCall6073); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall6077);
                    e17=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { args.add(e17); op="lcase"; }

                    }
                    break;
                case 21 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:788:4: ^( ENCODE_FOR_URI e18= expression )
                    {
                    match(input,ENCODE_FOR_URI,FOLLOW_ENCODE_FOR_URI_in_builtInCall6089); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall6093);
                    e18=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { args.add(e18); op = "encode_for_uri"; }

                    }
                    break;
                case 22 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:790:4: ^( CONTAINS e19= expression e20= expression )
                    {
                    match(input,CONTAINS,FOLLOW_CONTAINS_in_builtInCall6105); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall6109);
                    e19=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    pushFollow(FOLLOW_expression_in_builtInCall6113);
                    e20=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { args.add(e19); args.add(e20); op = "contains"; }

                    }
                    break;
                case 23 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:792:4: ^( STRSTARTS e21= expression e22= expression )
                    {
                    match(input,STRSTARTS,FOLLOW_STRSTARTS_in_builtInCall6125); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall6129);
                    e21=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    pushFollow(FOLLOW_expression_in_builtInCall6133);
                    e22=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { args.add(e21); args.add(e22); op = "strstarts"; }

                    }
                    break;
                case 24 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:794:4: ^( STRENDS e23= expression e24= expression )
                    {
                    match(input,STRENDS,FOLLOW_STRENDS_in_builtInCall6145); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall6149);
                    e23=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    pushFollow(FOLLOW_expression_in_builtInCall6153);
                    e24=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { args.add(e23); args.add(e24); op = "strends"; }

                    }
                    break;
                case 25 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:796:4: ^( STRBEFORE e241= expression e242= expression )
                    {
                    match(input,STRBEFORE,FOLLOW_STRBEFORE_in_builtInCall6165); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall6169);
                    e241=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    pushFollow(FOLLOW_expression_in_builtInCall6173);
                    e242=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { args.add(e241); args.add(e242); op = "strbefore"; }

                    }
                    break;
                case 26 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:798:4: ^( STRAFTER e243= expression e244= expression )
                    {
                    match(input,STRAFTER,FOLLOW_STRAFTER_in_builtInCall6185); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall6189);
                    e243=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    pushFollow(FOLLOW_expression_in_builtInCall6193);
                    e244=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { args.add(e243); args.add(e244); op = "strafter"; }

                    }
                    break;
                case 27 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:800:4: ^( YEAR e25= expression )
                    {
                    match(input,YEAR,FOLLOW_YEAR_in_builtInCall6205); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall6209);
                    e25=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { args.add(e25); op = "year"; }

                    }
                    break;
                case 28 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:802:4: ^( MONTH e26= expression )
                    {
                    match(input,MONTH,FOLLOW_MONTH_in_builtInCall6221); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall6225);
                    e26=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { args.add(e26); op = "month"; }

                    }
                    break;
                case 29 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:804:4: ^( DAY e27= expression )
                    {
                    match(input,DAY,FOLLOW_DAY_in_builtInCall6237); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall6241);
                    e27=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { args.add(e27); op = "day"; }

                    }
                    break;
                case 30 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:806:4: ^( HOURS e28= expression )
                    {
                    match(input,HOURS,FOLLOW_HOURS_in_builtInCall6253); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall6257);
                    e28=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { args.add(e28); op = "hours"; }

                    }
                    break;
                case 31 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:808:4: ^( MINUTES e29= expression )
                    {
                    match(input,MINUTES,FOLLOW_MINUTES_in_builtInCall6269); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall6273);
                    e29=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { args.add(e29); op = "minutes"; }

                    }
                    break;
                case 32 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:810:4: ^( SECONDS e30= expression )
                    {
                    match(input,SECONDS,FOLLOW_SECONDS_in_builtInCall6285); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall6289);
                    e30=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { args.add(e30); op = "seconds"; }

                    }
                    break;
                case 33 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:812:4: ^( TIMEZONE e31= expression )
                    {
                    match(input,TIMEZONE,FOLLOW_TIMEZONE_in_builtInCall6301); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall6305);
                    e31=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { args.add(e31); op = "timezone"; }

                    }
                    break;
                case 34 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:814:4: ^( TZ e32= expression )
                    {
                    match(input,TZ,FOLLOW_TZ_in_builtInCall6317); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall6321);
                    e32=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { args.add(e32); op = "tz"; }

                    }
                    break;
                case 35 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:816:4: NOW
                    {
                    match(input,NOW,FOLLOW_NOW_in_builtInCall6332); if (state.failed) return e;

                    if ( state.backtracking==0 ) { op = "now"; }

                    }
                    break;
                case 36 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:817:9: UUID
                    {
                    match(input,UUID,FOLLOW_UUID_in_builtInCall6344); if (state.failed) return e;

                    if ( state.backtracking==0 ) { op = "uuid"; }

                    }
                    break;
                case 37 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:818:9: STRUUID
                    {
                    match(input,STRUUID,FOLLOW_STRUUID_in_builtInCall6356); if (state.failed) return e;

                    if ( state.backtracking==0 ) { op = "struuid"; }

                    }
                    break;
                case 38 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:819:4: ^( MD5 e33= expression )
                    {
                    match(input,MD5,FOLLOW_MD5_in_builtInCall6365); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall6369);
                    e33=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { args.add(e33); op = "md5"; }

                    }
                    break;
                case 39 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:821:4: ^( SHA1 e34= expression )
                    {
                    match(input,SHA1,FOLLOW_SHA1_in_builtInCall6381); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall6385);
                    e34=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { args.add(e34); op = "sha1"; }

                    }
                    break;
                case 40 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:823:4: ^( SHA256 e36= expression )
                    {
                    match(input,SHA256,FOLLOW_SHA256_in_builtInCall6397); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall6401);
                    e36=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { args.add(e36); op = "sha256"; }

                    }
                    break;
                case 41 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:825:4: ^( SHA384 e37= expression )
                    {
                    match(input,SHA384,FOLLOW_SHA384_in_builtInCall6413); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall6417);
                    e37=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { args.add(e37); op = "sha384"; }

                    }
                    break;
                case 42 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:827:4: ^( SHA512 e38= expression )
                    {
                    match(input,SHA512,FOLLOW_SHA512_in_builtInCall6429); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall6433);
                    e38=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { args.add(e37); op = "sha512"; }

                    }
                    break;
                case 43 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:829:4: ^( COALESCE e39= expressionList )
                    {
                    match(input,COALESCE,FOLLOW_COALESCE_in_builtInCall6445); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expressionList_in_builtInCall6449);
                    e39=expressionList();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { putAll(args, e39); op = "coalesce"; }

                    }
                    break;
                case 44 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:831:4: ^( IF e40= expression e41= expression e42= expression )
                    {
                    match(input,IF,FOLLOW_IF_in_builtInCall6461); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall6465);
                    e40=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    pushFollow(FOLLOW_expression_in_builtInCall6469);
                    e41=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    pushFollow(FOLLOW_expression_in_builtInCall6473);
                    e42=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { args.add(e40); args.add(e41); args.add(e42); op = "if"; }

                    }
                    break;
                case 45 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:833:4: ^( STRLANG e45= expression e46= expression )
                    {
                    match(input,STRLANG,FOLLOW_STRLANG_in_builtInCall6485); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall6489);
                    e45=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    pushFollow(FOLLOW_expression_in_builtInCall6493);
                    e46=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { args.add(e45); args.add(e46); op = "strlang"; }

                    }
                    break;
                case 46 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:835:4: ^( STRDT e47= expression e48= expression )
                    {
                    match(input,STRDT,FOLLOW_STRDT_in_builtInCall6505); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall6509);
                    e47=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    pushFollow(FOLLOW_expression_in_builtInCall6513);
                    e48=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { args.add(e34); op = "strdt"; }

                    }
                    break;
                case 47 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:837:4: ^( SAMETERM sam1= expression sam2= expression )
                    {
                    match(input,SAMETERM,FOLLOW_SAMETERM_in_builtInCall6525); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall6529);
                    sam1=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    pushFollow(FOLLOW_expression_in_builtInCall6533);
                    sam2=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { args.add(sam1);  args.add(sam2); op = "sha1"; }

                    }
                    break;
                case 48 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:839:4: ^( ISIRI isi= expression )
                    {
                    match(input,ISIRI,FOLLOW_ISIRI_in_builtInCall6545); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall6549);
                    isi=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { args.add(isi); op = "isiri"; }

                    }
                    break;
                case 49 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:841:4: ^( ISURI isu= expression )
                    {
                    match(input,ISURI,FOLLOW_ISURI_in_builtInCall6561); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall6565);
                    isu=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { args.add(isu); op = "isuri"; }

                    }
                    break;
                case 50 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:843:4: ^( ISBLANK isb= expression )
                    {
                    match(input,ISBLANK,FOLLOW_ISBLANK_in_builtInCall6577); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall6581);
                    isb=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { args.add(isb); op = "isblank"; }

                    }
                    break;
                case 51 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:845:4: ^( ISLITERAL isl= expression )
                    {
                    match(input,ISLITERAL,FOLLOW_ISLITERAL_in_builtInCall6593); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall6597);
                    isl=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { args.add(isl); op = "isliteral"; }

                    }
                    break;
                case 52 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:847:4: ^( ISNUMERIC e55= expression )
                    {
                    match(input,ISNUMERIC,FOLLOW_ISNUMERIC_in_builtInCall6609); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall6613);
                    e55=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { args.add(e55); op = "isnumeric"; }

                    }
                    break;
                case 53 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:849:6: ^( REGEX e1= expression e2= expression (e3= expression )? )
                    {
                    match(input,REGEX,FOLLOW_REGEX_in_builtInCall6627); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall6631);
                    e1=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    pushFollow(FOLLOW_expression_in_builtInCall6635);
                    e2=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:849:44: (e3= expression )?
                    int alt84=2;
                    int LA84_0 = input.LA(1);

                    if ( (LA84_0==ABS||LA84_0==AVG||(LA84_0 >= BIG_DECIMAL && LA84_0 <= BIG_INTEGER)||(LA84_0 >= BNODE && LA84_0 <= BROKEN_PLUS)||LA84_0==CEIL||LA84_0==COALESCE||LA84_0==CONCAT||LA84_0==CONTAINS||LA84_0==COUNT||(LA84_0 >= DATATYPE && LA84_0 <= DAY)||LA84_0==DOUBLE||LA84_0==ENCODE_FOR_URI||LA84_0==EXISTS||LA84_0==EXPRESSION||LA84_0==FLOOR||LA84_0==FUNCTION||LA84_0==GROUP_CONCAT||LA84_0==HOURS||(LA84_0 >= IF && LA84_0 <= IN)||LA84_0==IRI||(LA84_0 >= ISBLANK && LA84_0 <= ISURI)||(LA84_0 >= LANG && LA84_0 <= LANGMATCHES)||LA84_0==LCASE||(LA84_0 >= LOGICAL_AND && LA84_0 <= LTE)||(LA84_0 >= MAX && LA84_0 <= MIN)||LA84_0==MINUTES||LA84_0==MONTH||(LA84_0 >= NOT && LA84_0 <= NOT_EXISTS)||LA84_0==NOW||(LA84_0 >= PREFIXED_NAME && LA84_0 <= PREFIXED_NS)||LA84_0==RAND||(LA84_0 >= REGEX && LA84_0 <= REPLACE)||LA84_0==ROUND||(LA84_0 >= SAMETERM && LA84_0 <= SECONDS)||LA84_0==SHA1||(LA84_0 >= SHA256 && LA84_0 <= SHA512)||(LA84_0 >= STR && LA84_0 <= STRING)||(LA84_0 >= STRLANG && LA84_0 <= STRUUID)||LA84_0==SUBSTR||LA84_0==SUM||LA84_0==TIMEZONE||LA84_0==TZ||LA84_0==UCASE||LA84_0==URI||LA84_0==UUID||LA84_0==VAR||LA84_0==YEAR||(LA84_0 >= 251 && LA84_0 <= 259)) ) {
                        alt84=1;
                    }
                    switch (alt84) {
                        case 1 :
                            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:849:44: e3= expression
                            {
                            pushFollow(FOLLOW_expression_in_builtInCall6639);
                            e3=expression();

                            state._fsp--;
                            if (state.failed) return e;

                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { args.add(e1); args.add(e2); args.add(e3); op = "regex"; }

                    }
                    break;
                case 54 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:851:6: p= existsFunc
                    {
                    pushFollow(FOLLOW_existsFunc_in_builtInCall6655);
                    p=existsFunc();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { args.add(p); op = "exists"; }

                    }
                    break;
                case 55 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:853:6: p= notExistsFunc
                    {
                    pushFollow(FOLLOW_notExistsFunc_in_builtInCall6679);
                    p=notExistsFunc();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { args.add(p); op = "notexists"; }

                    }
                    break;

            }


            if ( state.backtracking==0 ) {
                  e = new JSONObject();
                  e.put("op", op);
                  e.put("args", new JSONArray(args));
                }

            }

        }

        	catch(RecognitionException eee) {
                throw new RuntimeException(eee);
            }

        finally {
        	// do for sure before leaving
        }
        return e;
    }
    // $ANTLR end "builtInCall"



    // $ANTLR start "existsFunc"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:862:1: existsFunc returns [Object p] : ^( EXISTS g= groupGraphPattern ) ;
    public final Object existsFunc() throws JSONException, RecognitionException {
        Object p = null;


        JSONObject g =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:863:2: ( ^( EXISTS g= groupGraphPattern ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:863:6: ^( EXISTS g= groupGraphPattern )
            {
            match(input,EXISTS,FOLLOW_EXISTS_in_existsFunc6729); if (state.failed) return p;

            match(input, Token.DOWN, null); if (state.failed) return p;
            pushFollow(FOLLOW_groupGraphPattern_in_existsFunc6733);
            g=groupGraphPattern();

            state._fsp--;
            if (state.failed) return p;

            match(input, Token.UP, null); if (state.failed) return p;


            if ( state.backtracking==0 ) { p = g; }

            }

        }

        	catch(RecognitionException eee) {
                throw new RuntimeException(eee);
            }

        finally {
        	// do for sure before leaving
        }
        return p;
    }
    // $ANTLR end "existsFunc"



    // $ANTLR start "notExistsFunc"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:867:1: notExistsFunc returns [Object p] : ^( NOT_EXISTS g= groupGraphPattern ) ;
    public final Object notExistsFunc() throws JSONException, RecognitionException {
        Object p = null;


        JSONObject g =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:868:2: ( ^( NOT_EXISTS g= groupGraphPattern ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:868:6: ^( NOT_EXISTS g= groupGraphPattern )
            {
            match(input,NOT_EXISTS,FOLLOW_NOT_EXISTS_in_notExistsFunc6767); if (state.failed) return p;

            match(input, Token.DOWN, null); if (state.failed) return p;
            pushFollow(FOLLOW_groupGraphPattern_in_notExistsFunc6771);
            g=groupGraphPattern();

            state._fsp--;
            if (state.failed) return p;

            match(input, Token.UP, null); if (state.failed) return p;


            if ( state.backtracking==0 ) { p = g; }

            }

        }

        	catch(RecognitionException eee) {
                throw new RuntimeException(eee);
            }

        finally {
        	// do for sure before leaving
        }
        return p;
    }
    // $ANTLR end "notExistsFunc"



    // $ANTLR start "aggregate"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:872:1: aggregate returns [JSONObject a] : ( ^( COUNT ( DISTINCT )? (e1= expression | '*' ) ) | ^( SUM ( DISTINCT )? e2= expression ) | ^( MIN ( DISTINCT )? e3= expression ) | ^( MAX ( DISTINCT )? e4= expression ) | ^( AVG ( DISTINCT )? e5= expression ) | ^( SAMPLE ( DISTINCT )? e6= expression ) | ^( GROUP_CONCAT ( DISTINCT )? e7= expression ( ^( SEPARATOR s= string ) )? ) );
    public final JSONObject aggregate() throws JSONException, RecognitionException {
        JSONObject a = null;


        JSONObject e1 =null;

        JSONObject e2 =null;

        JSONObject e3 =null;

        JSONObject e4 =null;

        JSONObject e5 =null;

        JSONObject e6 =null;

        JSONObject e7 =null;

        String s =null;


         
        		a = new JSONObject(); 
        	
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:876:2: ( ^( COUNT ( DISTINCT )? (e1= expression | '*' ) ) | ^( SUM ( DISTINCT )? e2= expression ) | ^( MIN ( DISTINCT )? e3= expression ) | ^( MAX ( DISTINCT )? e4= expression ) | ^( AVG ( DISTINCT )? e5= expression ) | ^( SAMPLE ( DISTINCT )? e6= expression ) | ^( GROUP_CONCAT ( DISTINCT )? e7= expression ( ^( SEPARATOR s= string ) )? ) )
            int alt95=7;
            switch ( input.LA(1) ) {
            case COUNT:
                {
                alt95=1;
                }
                break;
            case SUM:
                {
                alt95=2;
                }
                break;
            case MIN:
                {
                alt95=3;
                }
                break;
            case MAX:
                {
                alt95=4;
                }
                break;
            case AVG:
                {
                alt95=5;
                }
                break;
            case SAMPLE:
                {
                alt95=6;
                }
                break;
            case GROUP_CONCAT:
                {
                alt95=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return a;}
                NoViableAltException nvae =
                    new NoViableAltException("", 95, 0, input);

                throw nvae;

            }

            switch (alt95) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:877:3: ^( COUNT ( DISTINCT )? (e1= expression | '*' ) )
                    {
                    match(input,COUNT,FOLLOW_COUNT_in_aggregate6809); if (state.failed) return a;

                    if ( state.backtracking==0 ) { a.put("aggregation", "count");  	}

                    match(input, Token.DOWN, null); if (state.failed) return a;
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:878:4: ( DISTINCT )?
                    int alt86=2;
                    int LA86_0 = input.LA(1);

                    if ( (LA86_0==DISTINCT) ) {
                        alt86=1;
                    }
                    switch (alt86) {
                        case 1 :
                            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:878:5: DISTINCT
                            {
                            match(input,DISTINCT,FOLLOW_DISTINCT_in_aggregate6821); if (state.failed) return a;

                            if ( state.backtracking==0 ) { a.put("distinct", true);	}

                            }
                            break;

                    }


                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:879:4: (e1= expression | '*' )
                    int alt87=2;
                    int LA87_0 = input.LA(1);

                    if ( (LA87_0==ABS||LA87_0==AVG||(LA87_0 >= BIG_DECIMAL && LA87_0 <= BIG_INTEGER)||(LA87_0 >= BNODE && LA87_0 <= BROKEN_PLUS)||LA87_0==CEIL||LA87_0==COALESCE||LA87_0==CONCAT||LA87_0==CONTAINS||LA87_0==COUNT||(LA87_0 >= DATATYPE && LA87_0 <= DAY)||LA87_0==DOUBLE||LA87_0==ENCODE_FOR_URI||LA87_0==EXISTS||LA87_0==EXPRESSION||LA87_0==FLOOR||LA87_0==FUNCTION||LA87_0==GROUP_CONCAT||LA87_0==HOURS||(LA87_0 >= IF && LA87_0 <= IN)||LA87_0==IRI||(LA87_0 >= ISBLANK && LA87_0 <= ISURI)||(LA87_0 >= LANG && LA87_0 <= LANGMATCHES)||LA87_0==LCASE||(LA87_0 >= LOGICAL_AND && LA87_0 <= LTE)||(LA87_0 >= MAX && LA87_0 <= MIN)||LA87_0==MINUTES||LA87_0==MONTH||(LA87_0 >= NOT && LA87_0 <= NOT_EXISTS)||LA87_0==NOW||(LA87_0 >= PREFIXED_NAME && LA87_0 <= PREFIXED_NS)||LA87_0==RAND||(LA87_0 >= REGEX && LA87_0 <= REPLACE)||LA87_0==ROUND||(LA87_0 >= SAMETERM && LA87_0 <= SECONDS)||LA87_0==SHA1||(LA87_0 >= SHA256 && LA87_0 <= SHA512)||(LA87_0 >= STR && LA87_0 <= STRING)||(LA87_0 >= STRLANG && LA87_0 <= STRUUID)||LA87_0==SUBSTR||LA87_0==SUM||LA87_0==TIMEZONE||LA87_0==TZ||LA87_0==UCASE||LA87_0==URI||LA87_0==UUID||LA87_0==VAR||LA87_0==YEAR||(LA87_0 >= 251 && LA87_0 <= 252)||(LA87_0 >= 254 && LA87_0 <= 259)) ) {
                        alt87=1;
                    }
                    else if ( (LA87_0==253) ) {
                        int LA87_2 = input.LA(2);

                        if ( (LA87_2==DOWN) ) {
                            alt87=1;
                        }
                        else if ( (LA87_2==UP) ) {
                            alt87=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return a;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 87, 2, input);

                            throw nvae;

                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return a;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 87, 0, input);

                        throw nvae;

                    }
                    switch (alt87) {
                        case 1 :
                            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:879:6: e1= expression
                            {
                            pushFollow(FOLLOW_expression_in_aggregate6878);
                            e1=expression();

                            state._fsp--;
                            if (state.failed) return a;

                            if ( state.backtracking==0 ) { a.put("expr", e1);		}

                            }
                            break;
                        case 2 :
                            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:880:6: '*'
                            {
                            match(input,253,FOLLOW_253_in_aggregate6888); if (state.failed) return a;

                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return a;


                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:883:5: ^( SUM ( DISTINCT )? e2= expression )
                    {
                    match(input,SUM,FOLLOW_SUM_in_aggregate6908); if (state.failed) return a;

                    if ( state.backtracking==0 ) { a.put("aggregation", "sum");  	}

                    match(input, Token.DOWN, null); if (state.failed) return a;
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:884:4: ( DISTINCT )?
                    int alt88=2;
                    int LA88_0 = input.LA(1);

                    if ( (LA88_0==DISTINCT) ) {
                        alt88=1;
                    }
                    switch (alt88) {
                        case 1 :
                            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:884:5: DISTINCT
                            {
                            match(input,DISTINCT,FOLLOW_DISTINCT_in_aggregate6920); if (state.failed) return a;

                            if ( state.backtracking==0 ) { a.put("distinct", true);	}

                            }
                            break;

                    }


                    pushFollow(FOLLOW_expression_in_aggregate6937);
                    e2=expression();

                    state._fsp--;
                    if (state.failed) return a;

                    if ( state.backtracking==0 ) { a.put("expr", e2);		}

                    match(input, Token.UP, null); if (state.failed) return a;


                    }
                    break;
                case 3 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:887:4: ^( MIN ( DISTINCT )? e3= expression )
                    {
                    match(input,MIN,FOLLOW_MIN_in_aggregate6950); if (state.failed) return a;

                    if ( state.backtracking==0 ) { a.put("aggregation", "min");  	}

                    match(input, Token.DOWN, null); if (state.failed) return a;
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:888:4: ( DISTINCT )?
                    int alt89=2;
                    int LA89_0 = input.LA(1);

                    if ( (LA89_0==DISTINCT) ) {
                        alt89=1;
                    }
                    switch (alt89) {
                        case 1 :
                            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:888:5: DISTINCT
                            {
                            match(input,DISTINCT,FOLLOW_DISTINCT_in_aggregate6963); if (state.failed) return a;

                            if ( state.backtracking==0 ) { a.put("distinct", true);	}

                            }
                            break;

                    }


                    pushFollow(FOLLOW_expression_in_aggregate6979);
                    e3=expression();

                    state._fsp--;
                    if (state.failed) return a;

                    if ( state.backtracking==0 ) { a.put("expr", e3);		}

                    match(input, Token.UP, null); if (state.failed) return a;


                    }
                    break;
                case 4 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:891:4: ^( MAX ( DISTINCT )? e4= expression )
                    {
                    match(input,MAX,FOLLOW_MAX_in_aggregate6992); if (state.failed) return a;

                    if ( state.backtracking==0 ) { a.put("aggregation", "max");  	}

                    match(input, Token.DOWN, null); if (state.failed) return a;
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:892:4: ( DISTINCT )?
                    int alt90=2;
                    int LA90_0 = input.LA(1);

                    if ( (LA90_0==DISTINCT) ) {
                        alt90=1;
                    }
                    switch (alt90) {
                        case 1 :
                            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:892:5: DISTINCT
                            {
                            match(input,DISTINCT,FOLLOW_DISTINCT_in_aggregate7005); if (state.failed) return a;

                            if ( state.backtracking==0 ) { a.put("distinct", true);	}

                            }
                            break;

                    }


                    pushFollow(FOLLOW_expression_in_aggregate7022);
                    e4=expression();

                    state._fsp--;
                    if (state.failed) return a;

                    if ( state.backtracking==0 ) { a.put("expr", e4);		}

                    match(input, Token.UP, null); if (state.failed) return a;


                    }
                    break;
                case 5 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:895:4: ^( AVG ( DISTINCT )? e5= expression )
                    {
                    match(input,AVG,FOLLOW_AVG_in_aggregate7035); if (state.failed) return a;

                    if ( state.backtracking==0 ) { a.put("aggregation", "avg");  	}

                    match(input, Token.DOWN, null); if (state.failed) return a;
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:896:4: ( DISTINCT )?
                    int alt91=2;
                    int LA91_0 = input.LA(1);

                    if ( (LA91_0==DISTINCT) ) {
                        alt91=1;
                    }
                    switch (alt91) {
                        case 1 :
                            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:896:5: DISTINCT
                            {
                            match(input,DISTINCT,FOLLOW_DISTINCT_in_aggregate7048); if (state.failed) return a;

                            if ( state.backtracking==0 ) { a.put("distinct", true);	}

                            }
                            break;

                    }


                    pushFollow(FOLLOW_expression_in_aggregate7065);
                    e5=expression();

                    state._fsp--;
                    if (state.failed) return a;

                    if ( state.backtracking==0 ) { a.put("expr", e5);		}

                    match(input, Token.UP, null); if (state.failed) return a;


                    }
                    break;
                case 6 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:899:4: ^( SAMPLE ( DISTINCT )? e6= expression )
                    {
                    match(input,SAMPLE,FOLLOW_SAMPLE_in_aggregate7078); if (state.failed) return a;

                    if ( state.backtracking==0 ) { a.put("aggregation", "sample");  }

                    match(input, Token.DOWN, null); if (state.failed) return a;
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:900:4: ( DISTINCT )?
                    int alt92=2;
                    int LA92_0 = input.LA(1);

                    if ( (LA92_0==DISTINCT) ) {
                        alt92=1;
                    }
                    switch (alt92) {
                        case 1 :
                            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:900:5: DISTINCT
                            {
                            match(input,DISTINCT,FOLLOW_DISTINCT_in_aggregate7090); if (state.failed) return a;

                            if ( state.backtracking==0 ) { a.put("distinct", true);	}

                            }
                            break;

                    }


                    pushFollow(FOLLOW_expression_in_aggregate7107);
                    e6=expression();

                    state._fsp--;
                    if (state.failed) return a;

                    if ( state.backtracking==0 ) { a.put("expr", e6);		}

                    match(input, Token.UP, null); if (state.failed) return a;


                    }
                    break;
                case 7 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:903:5: ^( GROUP_CONCAT ( DISTINCT )? e7= expression ( ^( SEPARATOR s= string ) )? )
                    {
                    match(input,GROUP_CONCAT,FOLLOW_GROUP_CONCAT_in_aggregate7121); if (state.failed) return a;

                    if ( state.backtracking==0 ) { a.put("aggregation", "group_concat"); }

                    match(input, Token.DOWN, null); if (state.failed) return a;
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:904:4: ( DISTINCT )?
                    int alt93=2;
                    int LA93_0 = input.LA(1);

                    if ( (LA93_0==DISTINCT) ) {
                        alt93=1;
                    }
                    switch (alt93) {
                        case 1 :
                            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:904:5: DISTINCT
                            {
                            match(input,DISTINCT,FOLLOW_DISTINCT_in_aggregate7133); if (state.failed) return a;

                            if ( state.backtracking==0 ) { a.put("distinct", true);	}

                            }
                            break;

                    }


                    pushFollow(FOLLOW_expression_in_aggregate7148);
                    e7=expression();

                    state._fsp--;
                    if (state.failed) return a;

                    if ( state.backtracking==0 ) { a.put("expr", e7);		}

                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:906:4: ( ^( SEPARATOR s= string ) )?
                    int alt94=2;
                    int LA94_0 = input.LA(1);

                    if ( (LA94_0==SEPARATOR) ) {
                        alt94=1;
                    }
                    switch (alt94) {
                        case 1 :
                            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:906:5: ^( SEPARATOR s= string )
                            {
                            match(input,SEPARATOR,FOLLOW_SEPARATOR_in_aggregate7159); if (state.failed) return a;

                            match(input, Token.DOWN, null); if (state.failed) return a;
                            pushFollow(FOLLOW_string_in_aggregate7163);
                            s=string();

                            state._fsp--;
                            if (state.failed) return a;

                            if ( state.backtracking==0 ) { a.put("separator", s);		}

                            match(input, Token.UP, null); if (state.failed) return a;


                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return a;


                    }
                    break;

            }
        }

        	catch(RecognitionException eee) {
                throw new RuntimeException(eee);
            }

        finally {
        	// do for sure before leaving
        }
        return a;
    }
    // $ANTLR end "aggregate"



    // $ANTLR start "iRIFunction"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:910:1: iRIFunction returns [JSONObject f] : ^( FUNCTION i= iRIref (a= argList )? ) ;
    public final JSONObject iRIFunction() throws JSONException, RecognitionException {
        JSONObject f = null;


        IRI i =null;

        JSONArray a =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:911:2: ( ^( FUNCTION i= iRIref (a= argList )? ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:911:6: ^( FUNCTION i= iRIref (a= argList )? )
            {
            match(input,FUNCTION,FOLLOW_FUNCTION_in_iRIFunction7196); if (state.failed) return f;

            match(input, Token.DOWN, null); if (state.failed) return f;
            pushFollow(FOLLOW_iRIref_in_iRIFunction7206);
            i=iRIref();

            state._fsp--;
            if (state.failed) return f;

            if ( state.backtracking==0 ) { f = new JSONObject(); f.put("function", i); }

            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:913:5: (a= argList )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==ABS||LA96_0==AVG||(LA96_0 >= BIG_DECIMAL && LA96_0 <= BIG_INTEGER)||(LA96_0 >= BNODE && LA96_0 <= BROKEN_PLUS)||LA96_0==CEIL||LA96_0==COALESCE||LA96_0==CONCAT||LA96_0==CONTAINS||LA96_0==COUNT||(LA96_0 >= DATATYPE && LA96_0 <= DAY)||LA96_0==DISTINCT||LA96_0==DOUBLE||LA96_0==ENCODE_FOR_URI||LA96_0==EXISTS||LA96_0==EXPRESSION||LA96_0==FLOOR||LA96_0==FUNCTION||LA96_0==GROUP_CONCAT||LA96_0==HOURS||(LA96_0 >= IF && LA96_0 <= IN)||LA96_0==IRI||(LA96_0 >= ISBLANK && LA96_0 <= ISURI)||(LA96_0 >= LANG && LA96_0 <= LANGMATCHES)||LA96_0==LCASE||(LA96_0 >= LOGICAL_AND && LA96_0 <= LTE)||(LA96_0 >= MAX && LA96_0 <= MIN)||LA96_0==MINUTES||LA96_0==MONTH||LA96_0==NIL||(LA96_0 >= NOT && LA96_0 <= NOT_EXISTS)||LA96_0==NOW||(LA96_0 >= PREFIXED_NAME && LA96_0 <= PREFIXED_NS)||LA96_0==RAND||(LA96_0 >= REGEX && LA96_0 <= REPLACE)||LA96_0==ROUND||(LA96_0 >= SAMETERM && LA96_0 <= SECONDS)||LA96_0==SHA1||(LA96_0 >= SHA256 && LA96_0 <= SHA512)||(LA96_0 >= STR && LA96_0 <= STRING)||(LA96_0 >= STRLANG && LA96_0 <= STRUUID)||LA96_0==SUBSTR||LA96_0==SUM||LA96_0==TIMEZONE||LA96_0==TZ||LA96_0==UCASE||LA96_0==URI||LA96_0==UUID||LA96_0==VAR||LA96_0==YEAR||(LA96_0 >= 251 && LA96_0 <= 259)) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:913:6: a= argList
                    {
                    pushFollow(FOLLOW_argList_in_iRIFunction7218);
                    a=argList();

                    state._fsp--;
                    if (state.failed) return f;

                    if ( state.backtracking==0 ) { f.put("arguments", a); 		}

                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return f;


            }

        }

        	catch(RecognitionException eee) {
                throw new RuntimeException(eee);
            }

        finally {
        	// do for sure before leaving
        }
        return f;
    }
    // $ANTLR end "iRIFunction"



    // $ANTLR start "rDFLiteral"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:917:1: rDFLiteral returns [StringLiteral sl] : s= string (l= LANGTAG | ( '^^' i= iRIref ) )? ;
    public final StringLiteral rDFLiteral() throws JSONException, RecognitionException {
        StringLiteral sl = null;


        XTree l=null;
        String s =null;

        IRI i =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:918:2: (s= string (l= LANGTAG | ( '^^' i= iRIref ) )? )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:918:6: s= string (l= LANGTAG | ( '^^' i= iRIref ) )?
            {
            pushFollow(FOLLOW_string_in_rDFLiteral7254);
            s=string();

            state._fsp--;
            if (state.failed) return sl;

            if ( state.backtracking==0 ) { sl = new StringLiteral(s);     }

            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:919:3: (l= LANGTAG | ( '^^' i= iRIref ) )?
            int alt97=3;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==LANGTAG) ) {
                alt97=1;
            }
            else if ( (LA97_0==262) ) {
                alt97=2;
            }
            switch (alt97) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:919:5: l= LANGTAG
                    {
                    l=(XTree)match(input,LANGTAG,FOLLOW_LANGTAG_in_rDFLiteral7269); if (state.failed) return sl;

                    if ( state.backtracking==0 ) { sl.setLanguage((l!=null?l.getText():null));        }

                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:920:5: ( '^^' i= iRIref )
                    {
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:920:5: ( '^^' i= iRIref )
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:920:7: '^^' i= iRIref
                    {
                    match(input,262,FOLLOW_262_in_rDFLiteral7283); if (state.failed) return sl;

                    pushFollow(FOLLOW_iRIref_in_rDFLiteral7287);
                    i=iRIref();

                    state._fsp--;
                    if (state.failed) return sl;

                    }


                    if ( state.backtracking==0 ) { sl.setType(i);       }

                    }
                    break;

            }


            }

        }

        	catch(RecognitionException eee) {
                throw new RuntimeException(eee);
            }

        finally {
        	// do for sure before leaving
        }
        return sl;
    }
    // $ANTLR end "rDFLiteral"



    // $ANTLR start "numericLiteral"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:924:1: numericLiteral returns [Constant n] : (n1= numericLiteralUnsigned |n2= numericLiteralPositive |n3= numericLiteralNegative );
    public final Constant numericLiteral() throws JSONException, RecognitionException {
        Constant n = null;


        Constant n1 =null;

        Constant n2 =null;

        Constant n3 =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:925:2: (n1= numericLiteralUnsigned |n2= numericLiteralPositive |n3= numericLiteralNegative )
            int alt98=3;
            switch ( input.LA(1) ) {
            case BIG_INTEGER:
                {
                int LA98_1 = input.LA(2);

                if ( (LA98_1==DOWN) ) {
                    switch ( input.LA(3) ) {
                    case INTEGER:
                        {
                        alt98=1;
                        }
                        break;
                    case INTEGER_POSITIVE:
                        {
                        alt98=2;
                        }
                        break;
                    case INTEGER_NEGATIVE:
                        {
                        alt98=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return n;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 98, 4, input);

                        throw nvae;

                    }

                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 98, 1, input);

                    throw nvae;

                }
                }
                break;
            case BIG_DECIMAL:
                {
                int LA98_2 = input.LA(2);

                if ( (LA98_2==DOWN) ) {
                    switch ( input.LA(3) ) {
                    case DECIMAL:
                        {
                        alt98=1;
                        }
                        break;
                    case DECIMAL_POSITIVE:
                        {
                        alt98=2;
                        }
                        break;
                    case DECIMAL_NEGATIVE:
                        {
                        alt98=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return n;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 98, 5, input);

                        throw nvae;

                    }

                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 98, 2, input);

                    throw nvae;

                }
                }
                break;
            case DOUBLE:
                {
                int LA98_3 = input.LA(2);

                if ( (LA98_3==DOWN) ) {
                    switch ( input.LA(3) ) {
                    case DOUBLE:
                        {
                        alt98=1;
                        }
                        break;
                    case DOUBLE_POSITIVE:
                        {
                        alt98=2;
                        }
                        break;
                    case DOUBLE_NEGATIVE:
                        {
                        alt98=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return n;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 98, 6, input);

                        throw nvae;

                    }

                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 98, 3, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 98, 0, input);

                throw nvae;

            }

            switch (alt98) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:925:6: n1= numericLiteralUnsigned
                    {
                    pushFollow(FOLLOW_numericLiteralUnsigned_in_numericLiteral7322);
                    n1=numericLiteralUnsigned();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = n1; }

                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:926:5: n2= numericLiteralPositive
                    {
                    pushFollow(FOLLOW_numericLiteralPositive_in_numericLiteral7332);
                    n2=numericLiteralPositive();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = n2; }

                    }
                    break;
                case 3 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:927:5: n3= numericLiteralNegative
                    {
                    pushFollow(FOLLOW_numericLiteralNegative_in_numericLiteral7342);
                    n3=numericLiteralNegative();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = n3; }

                    }
                    break;

            }
        }

        	catch(RecognitionException eee) {
                throw new RuntimeException(eee);
            }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "numericLiteral"



    // $ANTLR start "numericLiteralUnsigned"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:930:1: numericLiteralUnsigned returns [Constant c] : ( ^( BIG_INTEGER i= INTEGER ) | ^( BIG_DECIMAL d1= DECIMAL ) | ^( DOUBLE d2= DOUBLE ) );
    public final Constant numericLiteralUnsigned() throws JSONException, RecognitionException {
        Constant c = null;


        XTree i=null;
        XTree d1=null;
        XTree d2=null;

        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:931:2: ( ^( BIG_INTEGER i= INTEGER ) | ^( BIG_DECIMAL d1= DECIMAL ) | ^( DOUBLE d2= DOUBLE ) )
            int alt99=3;
            switch ( input.LA(1) ) {
            case BIG_INTEGER:
                {
                alt99=1;
                }
                break;
            case BIG_DECIMAL:
                {
                alt99=2;
                }
                break;
            case DOUBLE:
                {
                alt99=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return c;}
                NoViableAltException nvae =
                    new NoViableAltException("", 99, 0, input);

                throw nvae;

            }

            switch (alt99) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:931:6: ^( BIG_INTEGER i= INTEGER )
                    {
                    match(input,BIG_INTEGER,FOLLOW_BIG_INTEGER_in_numericLiteralUnsigned7368); if (state.failed) return c;

                    match(input, Token.DOWN, null); if (state.failed) return c;
                    i=(XTree)match(input,INTEGER,FOLLOW_INTEGER_in_numericLiteralUnsigned7373); if (state.failed) return c;

                    match(input, Token.UP, null); if (state.failed) return c;


                    if ( state.backtracking==0 ) { c = new Constant((i!=null?i.getText():null), new BigInteger((i!=null?i.getText():null)));		}

                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:932:5: ^( BIG_DECIMAL d1= DECIMAL )
                    {
                    match(input,BIG_DECIMAL,FOLLOW_BIG_DECIMAL_in_numericLiteralUnsigned7389); if (state.failed) return c;

                    match(input, Token.DOWN, null); if (state.failed) return c;
                    d1=(XTree)match(input,DECIMAL,FOLLOW_DECIMAL_in_numericLiteralUnsigned7393); if (state.failed) return c;

                    match(input, Token.UP, null); if (state.failed) return c;


                    if ( state.backtracking==0 ) { c = new Constant((d1!=null?d1.getText():null), new BigDecimal((d1!=null?d1.getText():null)));	}

                    }
                    break;
                case 3 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:933:5: ^( DOUBLE d2= DOUBLE )
                    {
                    match(input,DOUBLE,FOLLOW_DOUBLE_in_numericLiteralUnsigned7408); if (state.failed) return c;

                    match(input, Token.DOWN, null); if (state.failed) return c;
                    d2=(XTree)match(input,DOUBLE,FOLLOW_DOUBLE_in_numericLiteralUnsigned7413); if (state.failed) return c;

                    match(input, Token.UP, null); if (state.failed) return c;


                    if ( state.backtracking==0 ) { c = new Constant((d2!=null?d2.getText():null), new Double((d2!=null?d2.getText():null)));		}

                    }
                    break;

            }
        }

        	catch(RecognitionException eee) {
                throw new RuntimeException(eee);
            }

        finally {
        	// do for sure before leaving
        }
        return c;
    }
    // $ANTLR end "numericLiteralUnsigned"



    // $ANTLR start "numericLiteralPositive"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:936:1: numericLiteralPositive returns [Constant c] : ( ^( BIG_INTEGER i= INTEGER_POSITIVE ) | ^( BIG_DECIMAL d1= DECIMAL_POSITIVE ) | ^( DOUBLE d2= DOUBLE_POSITIVE ) );
    public final Constant numericLiteralPositive() throws JSONException, RecognitionException {
        Constant c = null;


        XTree i=null;
        XTree d1=null;
        XTree d2=null;

        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:937:2: ( ^( BIG_INTEGER i= INTEGER_POSITIVE ) | ^( BIG_DECIMAL d1= DECIMAL_POSITIVE ) | ^( DOUBLE d2= DOUBLE_POSITIVE ) )
            int alt100=3;
            switch ( input.LA(1) ) {
            case BIG_INTEGER:
                {
                alt100=1;
                }
                break;
            case BIG_DECIMAL:
                {
                alt100=2;
                }
                break;
            case DOUBLE:
                {
                alt100=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return c;}
                NoViableAltException nvae =
                    new NoViableAltException("", 100, 0, input);

                throw nvae;

            }

            switch (alt100) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:937:6: ^( BIG_INTEGER i= INTEGER_POSITIVE )
                    {
                    match(input,BIG_INTEGER,FOLLOW_BIG_INTEGER_in_numericLiteralPositive7447); if (state.failed) return c;

                    match(input, Token.DOWN, null); if (state.failed) return c;
                    i=(XTree)match(input,INTEGER_POSITIVE,FOLLOW_INTEGER_POSITIVE_in_numericLiteralPositive7452); if (state.failed) return c;

                    match(input, Token.UP, null); if (state.failed) return c;


                    if ( state.backtracking==0 ) { c = new Constant((i!=null?i.getText():null), new BigInteger((i!=null?i.getText():null).substring(1)));		}

                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:938:5: ^( BIG_DECIMAL d1= DECIMAL_POSITIVE )
                    {
                    match(input,BIG_DECIMAL,FOLLOW_BIG_DECIMAL_in_numericLiteralPositive7465); if (state.failed) return c;

                    match(input, Token.DOWN, null); if (state.failed) return c;
                    d1=(XTree)match(input,DECIMAL_POSITIVE,FOLLOW_DECIMAL_POSITIVE_in_numericLiteralPositive7469); if (state.failed) return c;

                    match(input, Token.UP, null); if (state.failed) return c;


                    if ( state.backtracking==0 ) { c = new Constant((d1!=null?d1.getText():null), new BigDecimal((d1!=null?d1.getText():null).substring(1)));	}

                    }
                    break;
                case 3 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:939:5: ^( DOUBLE d2= DOUBLE_POSITIVE )
                    {
                    match(input,DOUBLE,FOLLOW_DOUBLE_in_numericLiteralPositive7482); if (state.failed) return c;

                    match(input, Token.DOWN, null); if (state.failed) return c;
                    d2=(XTree)match(input,DOUBLE_POSITIVE,FOLLOW_DOUBLE_POSITIVE_in_numericLiteralPositive7487); if (state.failed) return c;

                    match(input, Token.UP, null); if (state.failed) return c;


                    if ( state.backtracking==0 ) { c = new Constant((d2!=null?d2.getText():null), new Double((d2!=null?d2.getText():null).substring(1)));		}

                    }
                    break;

            }
        }

        	catch(RecognitionException eee) {
                throw new RuntimeException(eee);
            }

        finally {
        	// do for sure before leaving
        }
        return c;
    }
    // $ANTLR end "numericLiteralPositive"



    // $ANTLR start "numericLiteralNegative"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:942:1: numericLiteralNegative returns [Constant c] : ( ^( BIG_INTEGER i= INTEGER_NEGATIVE ) | ^( BIG_DECIMAL d1= DECIMAL_NEGATIVE ) | ^( DOUBLE d2= DOUBLE_NEGATIVE ) );
    public final Constant numericLiteralNegative() throws JSONException, RecognitionException {
        Constant c = null;


        XTree i=null;
        XTree d1=null;
        XTree d2=null;

        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:943:2: ( ^( BIG_INTEGER i= INTEGER_NEGATIVE ) | ^( BIG_DECIMAL d1= DECIMAL_NEGATIVE ) | ^( DOUBLE d2= DOUBLE_NEGATIVE ) )
            int alt101=3;
            switch ( input.LA(1) ) {
            case BIG_INTEGER:
                {
                alt101=1;
                }
                break;
            case BIG_DECIMAL:
                {
                alt101=2;
                }
                break;
            case DOUBLE:
                {
                alt101=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return c;}
                NoViableAltException nvae =
                    new NoViableAltException("", 101, 0, input);

                throw nvae;

            }

            switch (alt101) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:943:6: ^( BIG_INTEGER i= INTEGER_NEGATIVE )
                    {
                    match(input,BIG_INTEGER,FOLLOW_BIG_INTEGER_in_numericLiteralNegative7516); if (state.failed) return c;

                    match(input, Token.DOWN, null); if (state.failed) return c;
                    i=(XTree)match(input,INTEGER_NEGATIVE,FOLLOW_INTEGER_NEGATIVE_in_numericLiteralNegative7521); if (state.failed) return c;

                    match(input, Token.UP, null); if (state.failed) return c;


                    if ( state.backtracking==0 ) { c = new Constant((i!=null?i.getText():null), new BigInteger((i!=null?i.getText():null)));		}

                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:944:5: ^( BIG_DECIMAL d1= DECIMAL_NEGATIVE )
                    {
                    match(input,BIG_DECIMAL,FOLLOW_BIG_DECIMAL_in_numericLiteralNegative7534); if (state.failed) return c;

                    match(input, Token.DOWN, null); if (state.failed) return c;
                    d1=(XTree)match(input,DECIMAL_NEGATIVE,FOLLOW_DECIMAL_NEGATIVE_in_numericLiteralNegative7538); if (state.failed) return c;

                    match(input, Token.UP, null); if (state.failed) return c;


                    if ( state.backtracking==0 ) { c = new Constant((d1!=null?d1.getText():null), new BigDecimal((d1!=null?d1.getText():null)));	}

                    }
                    break;
                case 3 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:945:5: ^( DOUBLE d2= DOUBLE_NEGATIVE )
                    {
                    match(input,DOUBLE,FOLLOW_DOUBLE_in_numericLiteralNegative7551); if (state.failed) return c;

                    match(input, Token.DOWN, null); if (state.failed) return c;
                    d2=(XTree)match(input,DOUBLE_NEGATIVE,FOLLOW_DOUBLE_NEGATIVE_in_numericLiteralNegative7556); if (state.failed) return c;

                    match(input, Token.UP, null); if (state.failed) return c;


                    if ( state.backtracking==0 ) { c = new Constant((d2!=null?d2.getText():null), new Double((d2!=null?d2.getText():null)));		}

                    }
                    break;

            }
        }

        	catch(RecognitionException eee) {
                throw new RuntimeException(eee);
            }

        finally {
        	// do for sure before leaving
        }
        return c;
    }
    // $ANTLR end "numericLiteralNegative"



    // $ANTLR start "booleanLiteral"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:948:1: booleanLiteral returns [Boolean b] : ( ^( BOOLEAN TRUE ) | ^( BOOLEAN FALSE ) );
    public final Boolean booleanLiteral() throws JSONException, RecognitionException {
        Boolean b = null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:949:2: ( ^( BOOLEAN TRUE ) | ^( BOOLEAN FALSE ) )
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==BOOLEAN) ) {
                int LA102_1 = input.LA(2);

                if ( (LA102_1==DOWN) ) {
                    int LA102_2 = input.LA(3);

                    if ( (LA102_2==TRUE) ) {
                        alt102=1;
                    }
                    else if ( (LA102_2==FALSE) ) {
                        alt102=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return b;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 102, 2, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return b;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 102, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return b;}
                NoViableAltException nvae =
                    new NoViableAltException("", 102, 0, input);

                throw nvae;

            }
            switch (alt102) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:949:6: ^( BOOLEAN TRUE )
                    {
                    match(input,BOOLEAN,FOLLOW_BOOLEAN_in_booleanLiteral7584); if (state.failed) return b;

                    match(input, Token.DOWN, null); if (state.failed) return b;
                    match(input,TRUE,FOLLOW_TRUE_in_booleanLiteral7586); if (state.failed) return b;

                    match(input, Token.UP, null); if (state.failed) return b;


                    if ( state.backtracking==0 ) { b = Boolean.TRUE;  }

                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:950:6: ^( BOOLEAN FALSE )
                    {
                    match(input,BOOLEAN,FOLLOW_BOOLEAN_in_booleanLiteral7601); if (state.failed) return b;

                    match(input, Token.DOWN, null); if (state.failed) return b;
                    match(input,FALSE,FOLLOW_FALSE_in_booleanLiteral7603); if (state.failed) return b;

                    match(input, Token.UP, null); if (state.failed) return b;


                    if ( state.backtracking==0 ) { b = Boolean.FALSE; }

                    }
                    break;

            }
        }

        	catch(RecognitionException eee) {
                throw new RuntimeException(eee);
            }

        finally {
        	// do for sure before leaving
        }
        return b;
    }
    // $ANTLR end "booleanLiteral"



    // $ANTLR start "string"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:953:1: string returns [String s] : ( ^( STRING s1= STRING_LITERAL1 ) | ^( STRING s2= STRING_LITERAL2 ) | ^( STRING s3= STRING_LITERAL_LONG1 ) | ^( STRING s4= STRING_LITERAL_LONG2 ) );
    public final String string() throws JSONException, RecognitionException {
        String s = null;


        XTree s1=null;
        XTree s2=null;
        XTree s3=null;
        XTree s4=null;

        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:954:2: ( ^( STRING s1= STRING_LITERAL1 ) | ^( STRING s2= STRING_LITERAL2 ) | ^( STRING s3= STRING_LITERAL_LONG1 ) | ^( STRING s4= STRING_LITERAL_LONG2 ) )
            int alt103=4;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==STRING) ) {
                int LA103_1 = input.LA(2);

                if ( (LA103_1==DOWN) ) {
                    switch ( input.LA(3) ) {
                    case STRING_LITERAL1:
                        {
                        alt103=1;
                        }
                        break;
                    case STRING_LITERAL2:
                        {
                        alt103=2;
                        }
                        break;
                    case STRING_LITERAL_LONG1:
                        {
                        alt103=3;
                        }
                        break;
                    case STRING_LITERAL_LONG2:
                        {
                        alt103=4;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return s;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 103, 2, input);

                        throw nvae;

                    }

                }
                else {
                    if (state.backtracking>0) {state.failed=true; return s;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 103, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return s;}
                NoViableAltException nvae =
                    new NoViableAltException("", 103, 0, input);

                throw nvae;

            }
            switch (alt103) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:954:4: ^( STRING s1= STRING_LITERAL1 )
                    {
                    match(input,STRING,FOLLOW_STRING_in_string7630); if (state.failed) return s;

                    match(input, Token.DOWN, null); if (state.failed) return s;
                    s1=(XTree)match(input,STRING_LITERAL1,FOLLOW_STRING_LITERAL1_in_string7634); if (state.failed) return s;

                    match(input, Token.UP, null); if (state.failed) return s;


                    if ( state.backtracking==0 ) { s = new String((s1!=null?s1.getText():null)); }

                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:955:4: ^( STRING s2= STRING_LITERAL2 )
                    {
                    match(input,STRING,FOLLOW_STRING_in_string7651); if (state.failed) return s;

                    match(input, Token.DOWN, null); if (state.failed) return s;
                    s2=(XTree)match(input,STRING_LITERAL2,FOLLOW_STRING_LITERAL2_in_string7655); if (state.failed) return s;

                    match(input, Token.UP, null); if (state.failed) return s;


                    if ( state.backtracking==0 ) { s = new String((s2!=null?s2.getText():null)); }

                    }
                    break;
                case 3 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:956:4: ^( STRING s3= STRING_LITERAL_LONG1 )
                    {
                    match(input,STRING,FOLLOW_STRING_in_string7672); if (state.failed) return s;

                    match(input, Token.DOWN, null); if (state.failed) return s;
                    s3=(XTree)match(input,STRING_LITERAL_LONG1,FOLLOW_STRING_LITERAL_LONG1_in_string7676); if (state.failed) return s;

                    match(input, Token.UP, null); if (state.failed) return s;


                    if ( state.backtracking==0 ) { s = new String((s3!=null?s3.getText():null)); }

                    }
                    break;
                case 4 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:957:4: ^( STRING s4= STRING_LITERAL_LONG2 )
                    {
                    match(input,STRING,FOLLOW_STRING_in_string7688); if (state.failed) return s;

                    match(input, Token.DOWN, null); if (state.failed) return s;
                    s4=(XTree)match(input,STRING_LITERAL_LONG2,FOLLOW_STRING_LITERAL_LONG2_in_string7692); if (state.failed) return s;

                    match(input, Token.UP, null); if (state.failed) return s;


                    if ( state.backtracking==0 ) { s = new String((s4!=null?s4.getText():null)); }

                    }
                    break;

            }
        }

        	catch(RecognitionException eee) {
                throw new RuntimeException(eee);
            }

        finally {
        	// do for sure before leaving
        }
        return s;
    }
    // $ANTLR end "string"



    // $ANTLR start "iRIref"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:960:1: iRIref returns [IRI r] : ( ^( IRI i= IRI_REF ) |p= prefixedName );
    public final IRI iRIref() throws JSONException, RecognitionException {
        IRI r = null;


        XTree i=null;
        String p =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:961:2: ( ^( IRI i= IRI_REF ) |p= prefixedName )
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==IRI) ) {
                alt104=1;
            }
            else if ( ((LA104_0 >= PREFIXED_NAME && LA104_0 <= PREFIXED_NS)) ) {
                alt104=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return r;}
                NoViableAltException nvae =
                    new NoViableAltException("", 104, 0, input);

                throw nvae;

            }
            switch (alt104) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:961:4: ^( IRI i= IRI_REF )
                    {
                    match(input,IRI,FOLLOW_IRI_in_iRIref7720); if (state.failed) return r;

                    match(input, Token.DOWN, null); if (state.failed) return r;
                    i=(XTree)match(input,IRI_REF,FOLLOW_IRI_REF_in_iRIref7724); if (state.failed) return r;

                    match(input, Token.UP, null); if (state.failed) return r;


                    if ( state.backtracking==0 ) { r = new IRI((i!=null?i.getText():null).substring(1, (i!=null?i.getText():null).length()-1)); 	}

                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:962:6: p= prefixedName
                    {
                    pushFollow(FOLLOW_prefixedName_in_iRIref7736);
                    p=prefixedName();

                    state._fsp--;
                    if (state.failed) return r;

                    if ( state.backtracking==0 ) { r = new IRI(p); 				}

                    }
                    break;

            }
        }

        	catch(RecognitionException eee) {
                throw new RuntimeException(eee);
            }

        finally {
        	// do for sure before leaving
        }
        return r;
    }
    // $ANTLR end "iRIref"



    // $ANTLR start "prefixedName"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:965:1: prefixedName returns [String s] : ( ^( PREFIXED_NAME n1= PNAME_LN ) | ^( PREFIXED_NS n2= PNAME_NS ) );
    public final String prefixedName() throws JSONException, RecognitionException {
        String s = null;


        XTree n1=null;
        XTree n2=null;

        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:966:2: ( ^( PREFIXED_NAME n1= PNAME_LN ) | ^( PREFIXED_NS n2= PNAME_NS ) )
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==PREFIXED_NAME) ) {
                alt105=1;
            }
            else if ( (LA105_0==PREFIXED_NS) ) {
                alt105=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return s;}
                NoViableAltException nvae =
                    new NoViableAltException("", 105, 0, input);

                throw nvae;

            }
            switch (alt105) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:966:4: ^( PREFIXED_NAME n1= PNAME_LN )
                    {
                    match(input,PREFIXED_NAME,FOLLOW_PREFIXED_NAME_in_prefixedName7762); if (state.failed) return s;

                    match(input, Token.DOWN, null); if (state.failed) return s;
                    n1=(XTree)match(input,PNAME_LN,FOLLOW_PNAME_LN_in_prefixedName7766); if (state.failed) return s;

                    match(input, Token.UP, null); if (state.failed) return s;


                    if ( state.backtracking==0 ) { s = new String(n1.getText()); }

                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:967:4: ^( PREFIXED_NS n2= PNAME_NS )
                    {
                    match(input,PREFIXED_NS,FOLLOW_PREFIXED_NS_in_prefixedName7775); if (state.failed) return s;

                    match(input, Token.DOWN, null); if (state.failed) return s;
                    n2=(XTree)match(input,PNAME_NS,FOLLOW_PNAME_NS_in_prefixedName7779); if (state.failed) return s;

                    match(input, Token.UP, null); if (state.failed) return s;


                    if ( state.backtracking==0 ) { s = new String(n2.getText()); }

                    }
                    break;

            }
        }

        	catch(RecognitionException eee) {
                throw new RuntimeException(eee);
            }

        finally {
        	// do for sure before leaving
        }
        return s;
    }
    // $ANTLR end "prefixedName"



    // $ANTLR start "blankNode"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:970:1: blankNode returns [BlankNode bn] : (b= BLANK_NODE_LABEL | ^( ANNON t= OPEN_SQ_BRACKET ) );
    public final BlankNode blankNode() throws JSONException, RecognitionException {
        BlankNode bn = null;


        XTree b=null;
        XTree t=null;

        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:971:2: (b= BLANK_NODE_LABEL | ^( ANNON t= OPEN_SQ_BRACKET ) )
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==BLANK_NODE_LABEL) ) {
                alt106=1;
            }
            else if ( (LA106_0==ANNON) ) {
                alt106=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return bn;}
                NoViableAltException nvae =
                    new NoViableAltException("", 106, 0, input);

                throw nvae;

            }
            switch (alt106) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:971:6: b= BLANK_NODE_LABEL
                    {
                    b=(XTree)match(input,BLANK_NODE_LABEL,FOLLOW_BLANK_NODE_LABEL_in_blankNode7807); if (state.failed) return bn;

                    if ( state.backtracking==0 ) { bn = new BlankNode(b.getText()); }

                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:972:6: ^( ANNON t= OPEN_SQ_BRACKET )
                    {
                    match(input,ANNON,FOLLOW_ANNON_in_blankNode7818); if (state.failed) return bn;

                    match(input, Token.DOWN, null); if (state.failed) return bn;
                    t=(XTree)match(input,OPEN_SQ_BRACKET,FOLLOW_OPEN_SQ_BRACKET_in_blankNode7822); if (state.failed) return bn;

                    match(input, Token.UP, null); if (state.failed) return bn;


                    if ( state.backtracking==0 ) { bn = new BlankNode("b" + t.getTokenStartIndex()); }

                    }
                    break;

            }
        }

        	catch(RecognitionException eee) {
                throw new RuntimeException(eee);
            }

        finally {
        	// do for sure before leaving
        }
        return bn;
    }
    // $ANTLR end "blankNode"

    // $ANTLR start synpred1_JSONWriter
    public final void synpred1_JSONWriter_fragment() throws RecognitionException {
        // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:329:25: ( NIL )
        // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:329:27: NIL
        {
        match(input,NIL,FOLLOW_NIL_in_synpred1_JSONWriter2286); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred1_JSONWriter

    // $ANTLR start synpred2_JSONWriter
    public final void synpred2_JSONWriter_fragment() throws RecognitionException {
        // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:329:67: ( NIL )
        // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/JSONWriter.g:329:69: NIL
        {
        match(input,NIL,FOLLOW_NIL_in_synpred2_JSONWriter2308); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred2_JSONWriter

    // Delegated rules

    public final boolean synpred1_JSONWriter() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_JSONWriter_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_JSONWriter() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_JSONWriter_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_ROOT_in_queryUnit89 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_query_in_queryUnit93 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_QUERY_in_query121 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_prologue_in_query131 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_selectQuery_in_query150 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_bindingsClause_in_query169 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PROLOGUE_in_prologue241 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_baseDecl_in_prologue243 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_prefixDecl_in_prologue247 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_BASE_in_baseDecl273 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_iRIref_in_baseDecl275 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PREFIX_in_prefixDecl297 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_prefixedName_in_prefixDecl299 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L,0x0000018000000000L});
    public static final BitSet FOLLOW_iRIref_in_prefixDecl302 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SELECT_in_selectQuery337 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_selectClause_in_selectQuery347 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000000L,0x0000000000000008L,0x0008000000000000L});
    public static final BitSet FOLLOW_dataset_in_selectQuery359 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L,0x0008000000000000L});
    public static final BitSet FOLLOW_whereClause_in_selectQuery375 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_solutionModifier_in_selectQuery386 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DATASET_in_dataset419 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_datasetClause_in_dataset451 = new BitSet(new long[]{0x0000000000000008L,0x0000000000004000L});
    public static final BitSet FOLLOW_SUB_SELECT_in_subSelect483 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_selectClause_in_subSelect500 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L,0x0008000000000000L});
    public static final BitSet FOLLOW_whereClause_in_subSelect509 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_solutionModifier_in_subSelect520 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_inlineData_in_subSelect540 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TYPE_in_selectClause591 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DISTINCT_in_selectClause595 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_REDUCED_in_selectClause607 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PVARS_in_selectClause636 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_253_in_selectClause661 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_var_in_selectClause710 = new BitSet(new long[]{0x0000000000000408L,0x0000000000000080L,0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_expVar_in_selectClause714 = new BitSet(new long[]{0x0000000000000408L,0x0000000000000080L,0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_fexp_in_selectClause718 = new BitSet(new long[]{0x0000000000000408L,0x0000000000000080L,0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_AS_in_expVar761 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_var_in_expVar765 = new BitSet(new long[]{0x20030A4427C32020L,0xDE587C80D040A250L,0x41D6818000005815L,0xFA00450A00ABC3F7L,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_expVar769 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXP_in_fexp795 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_fexp799 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FROM_in_datasetClause825 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_defaultGraphClause_in_datasetClause832 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_namedGraphClause_in_datasetClause846 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_sourceSelector_in_defaultGraphClause883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAMED_in_namedGraphClause909 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_sourceSelector_in_namedGraphClause913 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_iRIref_in_sourceSelector943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHERE_in_whereClause967 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_groupGraphPattern_in_whereClause971 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MODIFIERS_in_solutionModifier996 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_groupClause_in_solutionModifier1005 = new BitSet(new long[]{0x0000000000000008L,0x0080000004000000L,0x0000000000820000L});
    public static final BitSet FOLLOW_havingClause_in_solutionModifier1022 = new BitSet(new long[]{0x0000000000000008L,0x0080000000000000L,0x0000000000820000L});
    public static final BitSet FOLLOW_orderClause_in_solutionModifier1039 = new BitSet(new long[]{0x0000000000000008L,0x0080000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_limitOffsetClauses_in_solutionModifier1054 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GROUP_BY_in_groupClause1082 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_groupCondition_in_groupClause1086 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_builtInCall_in_groupCondition1126 = new BitSet(new long[]{0x000302C421400022L,0x80587C805000A050L,0x4156800000005014L,0x0200450A008BC1F7L});
    public static final BitSet FOLLOW_functionCall_in_groupCondition1145 = new BitSet(new long[]{0x000302C421400022L,0x80587C805000A050L,0x4156800000005014L,0x0200450A008BC1F7L});
    public static final BitSet FOLLOW_CONDITION_in_groupCondition1162 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_groupCondition1166 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_var_in_groupCondition1171 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_var_in_groupCondition1188 = new BitSet(new long[]{0x000302C421400022L,0x80587C805000A050L,0x4156800000005014L,0x0200450A008BC1F7L});
    public static final BitSet FOLLOW_HAVING_in_havingClause1266 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_havingCondition_in_havingClause1271 = new BitSet(new long[]{0x0003024421400028L,0x80587C805000A250L,0x4156800000005014L,0x0200050A008BC1F7L});
    public static final BitSet FOLLOW_constraint_in_havingCondition1303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ORDER_BY_in_orderClause1336 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_orderCondition_in_orderClause1343 = new BitSet(new long[]{0x0103024421400828L,0x80587C805000A250L,0x4156800000005014L,0x0200450A008BC1F7L});
    public static final BitSet FOLLOW_ASC_in_orderCondition1374 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_brackettedExpression_in_orderCondition1378 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DESC_in_orderCondition1390 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_brackettedExpression_in_orderCondition1394 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_constraint_in_orderCondition1409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_in_orderCondition1425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_limitClause_in_limitOffsetClauses1459 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_offsetClause_in_limitOffsetClauses1463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_offsetClause_in_limitOffsetClauses1473 = new BitSet(new long[]{0x0000000000000002L,0x0080000000000000L});
    public static final BitSet FOLLOW_limitClause_in_limitOffsetClauses1477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LIMIT_in_limitClause1511 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INTEGER_in_limitClause1515 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OFFSET_in_offsetClause1543 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INTEGER_in_offsetClause1547 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_inlineData_in_bindingsClause1575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iRIref_in_bindingValue1598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rDFLiteral_in_bindingValue1602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteral_in_bindingValue1606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteral_in_bindingValue1610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNDEF_in_bindingValue1614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GROUP_GRAPH_PATTERN_in_groupGraphPattern1639 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_groupGraphPatternSub_in_groupGraphPattern1654 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_subSelect_in_groupGraphPattern1681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_triplesBlock_in_groupGraphPatternSub1721 = new BitSet(new long[]{0x0000000000040002L,0x0000000000821000L,0x2000000000200002L,0x0000204008100000L});
    public static final BitSet FOLLOW_filter_in_groupGraphPatternSub1737 = new BitSet(new long[]{0x0000000000040002L,0x0000000000821000L,0x2000000000200002L,0x0000204008100000L});
    public static final BitSet FOLLOW_graphPatternNewBGP_in_groupGraphPatternSub1775 = new BitSet(new long[]{0x0000000000040002L,0x0000000000821000L,0x2000000000200002L,0x0000204008100000L});
    public static final BitSet FOLLOW_TRIPLES_BLOCK_in_triplesBlock1814 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_triples_in_triplesBlock1834 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000006000000L});
    public static final BitSet FOLLOW_triples2_in_triplesBlock1850 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000006000000L});
    public static final BitSet FOLLOW_TRIPLE_in_triples1892 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SUBJECT_in_triples1895 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_graphNode_in_triples1899 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PREDICATE_in_triples1911 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_predicate_in_triples1915 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VALUE_in_triples1929 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_object_in_triples1933 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TRIPLE2_in_triples21984 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SUBJECT_in_triples21987 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_triplesNode_in_triples21991 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PROPERTY_LIST_in_triples22001 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PREDICATE_in_triples22012 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_predicate_in_triples22016 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VALUE_in_triples22031 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_object_in_triples22036 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_groupMinusOrUnionGraphPattern_in_graphPatternNewBGP2104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_optionalGraphPattern_in_graphPatternNewBGP2124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_graphGraphPattern_in_graphPatternNewBGP2145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_serviceGraphPattern_in_graphPatternNewBGP2166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bind_in_graphPatternNewBGP2179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inlineData_in_graphPatternNewBGP2202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VALUES_in_inlineData2240 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_dataBlock_in_inlineData2244 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INLINE_DATA_in_dataBlock2280 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NIL_in_dataBlock2290 = new BitSet(new long[]{0x2000000000830008L,0x0000008000000000L,0x0000018000000200L,0x0000001000000200L});
    public static final BitSet FOLLOW_var_in_dataBlock2297 = new BitSet(new long[]{0x2000000000830008L,0x0000008000000000L,0x0000018000000200L,0x0000401000000200L});
    public static final BitSet FOLLOW_NIL_in_dataBlock2312 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_dataBlockValue_in_dataBlock2319 = new BitSet(new long[]{0x2000000000830008L,0x0000008000000000L,0x0000018000000000L,0x0000001000000200L});
    public static final BitSet FOLLOW_iRIref_in_dataBlockValue2359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rDFLiteral_in_dataBlockValue2375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteral_in_dataBlockValue2390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteral_in_dataBlockValue2405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNDEF_in_dataBlockValue2421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPTIONAL_in_optionalGraphPattern2455 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_groupGraphPattern_in_optionalGraphPattern2459 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GRAPH_in_graphGraphPattern2502 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_varOrIRIref2_in_graphGraphPattern2506 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_groupGraphPattern_in_graphGraphPattern2510 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SERVICE_in_serviceGraphPattern2557 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SILENT_in_serviceGraphPattern2572 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L,0x0000018000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_varOrIRIref_in_serviceGraphPattern2592 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_groupGraphPattern_in_serviceGraphPattern2608 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BIND_in_bind2644 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_var_in_bind2648 = new BitSet(new long[]{0x20030A4427C32020L,0xDE587C80D040A250L,0x41D6818000005815L,0xFA00450A00ABC3F7L,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_bind2654 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNION_in_groupMinusOrUnionGraphPattern2702 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_groupGraphPattern_in_groupMinusOrUnionGraphPattern2723 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_groupGraphPattern_in_groupMinusOrUnionGraphPattern2751 = new BitSet(new long[]{0x0000000000000008L,0x0000000000800000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_MINUS_in_groupMinusOrUnionGraphPattern2785 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_groupGraphPattern_in_groupMinusOrUnionGraphPattern2800 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_groupGraphPattern_in_groupMinusOrUnionGraphPattern2835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FILTER_in_filter2867 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_constraint_in_filter2871 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_brackettedExpression_in_constraint2899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_builtInCall_in_constraint2909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_constraint2922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_functionCall2948 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_iRIref_in_functionCall2952 = new BitSet(new long[]{0x28030A4427C32020L,0xDE587C80D040A250L,0x41D6818000005A15L,0xFA00450A00ABC3F7L,0x000000000000000FL});
    public static final BitSet FOLLOW_argList_in_functionCall2956 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NIL_in_argList2998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DISTINCT_in_argList3011 = new BitSet(new long[]{0x20030A4427C32020L,0xDE587C80D040A250L,0x41D6818000005815L,0xFA00450A00ABC3F7L,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_argList3016 = new BitSet(new long[]{0x20030A4427C32022L,0xDE587C80D040A250L,0x41D6818000005815L,0xFA00450A00ABC3F7L,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_argList3029 = new BitSet(new long[]{0x20030A4427C32022L,0xDE587C80D040A250L,0x41D6818000005815L,0xFA00450A00ABC3F7L,0x000000000000000FL});
    public static final BitSet FOLLOW_NIL_in_expressionList3068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expressionList3091 = new BitSet(new long[]{0x20030A4427C32022L,0xDE587C80D040A250L,0x41D6818000005815L,0xFA00450A00ABC3F7L,0x000000000000000FL});
    public static final BitSet FOLLOW_graphNode_in_object3120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varOrIRIref_in_verb3146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_263_in_verb3156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_path_in_verbPath3178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_in_verbSimple3195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pathAlternative_in_path3218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pathSequence_in_pathAlternative3252 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_264_in_pathAlternative3256 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L,0x0000018000040000L,0x0800000000000000L,0x00000000000000A0L});
    public static final BitSet FOLLOW_pathSequence_in_pathAlternative3260 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_pathEltOrInverse_in_pathSequence3304 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_256_in_pathSequence3308 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L,0x0000018000040000L,0x0800000000000000L,0x00000000000000A0L});
    public static final BitSet FOLLOW_pathEltOrInverse_in_pathSequence3312 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_pathElt_in_pathEltOrInverse3347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_261_in_pathEltOrInverse3363 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L,0x0000018000040000L,0x0800000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_pathElt_in_pathEltOrInverse3367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pathPrimary_in_pathElt3413 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x6000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_pathMod_in_pathElt3430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_253_in_pathMod3458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_260_in_pathMod3467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_254_in_pathMod3476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iRIref_in_pathPrimary3504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_263_in_pathPrimary3518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_251_in_pathPrimary3532 = new BitSet(new long[]{0x0000000000000000L,0x000000C000000000L,0x0000018000040000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_pathNegatedPropertySet_in_pathPrimary3536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_pathPrimary3550 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L,0x0000018000040000L,0x0800000000000000L,0x00000000000000A0L});
    public static final BitSet FOLLOW_path_in_pathPrimary3554 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_pathPrimary3558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pathOneInPropertySet_in_pathNegatedPropertySet3589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_pathNegatedPropertySet3601 = new BitSet(new long[]{0x0000000080000000L,0x000000C000000000L,0x0000018000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_pathOneInPropertySet_in_pathNegatedPropertySet3609 = new BitSet(new long[]{0x0000000080000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_264_in_pathNegatedPropertySet3625 = new BitSet(new long[]{0x0000000000000000L,0x000000C000000000L,0x0000018000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_pathOneInPropertySet_in_pathNegatedPropertySet3631 = new BitSet(new long[]{0x0000000080000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_pathNegatedPropertySet3653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iRIref_in_pathOneInPropertySet3686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_263_in_pathOneInPropertySet3693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INV_in_pathOneInPropertySet3702 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_iRIrefOrRDFType_in_pathOneInPropertySet3708 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_iRIref_in_iRIrefOrRDFType3739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_263_in_iRIrefOrRDFType3748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_integer3769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRIPLES_NODE_in_triplesNode3801 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_collection_in_triplesNode3812 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_blankNodePropertyList_in_triplesNode3829 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PROPERTY_LIST_in_blankNodePropertyList3872 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PREDICATE_in_blankNodePropertyList3885 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_predicate_in_blankNodePropertyList3889 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VALUE_in_blankNodePropertyList3901 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_graphNode_in_blankNodePropertyList3906 = new BitSet(new long[]{0x2000000000A30208L,0x0000008000000000L,0x0000018000000200L,0x0000400010000200L});
    public static final BitSet FOLLOW_var_in_predicate3993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iRIref_in_predicate4008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_263_in_predicate4019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALT_in_predicate4034 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_predicate_in_predicate4055 = new BitSet(new long[]{0x0000000000000108L,0x000000C000000008L,0x1000018000000000L,0x0800400000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_SEQ_in_predicate4071 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_predicate_in_predicate4092 = new BitSet(new long[]{0x0000000000000108L,0x000000C000000008L,0x1000018000000000L,0x0800400000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ELT_in_predicate4108 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_predicate_in_predicate4112 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x6000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_pathMod_in_predicate4118 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INV_in_predicate4142 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_predicate_in_predicate4146 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_251_in_predicate4166 = new BitSet(new long[]{0x0000000000000000L,0x000000C000000000L,0x0000018000040000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_pathNegatedPropertySet_in_predicate4172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLLECTION_in_collection4214 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_graphNode_in_collection4219 = new BitSet(new long[]{0x2000000000A30208L,0x0000008000000000L,0x0000018000000200L,0x0000400010000200L});
    public static final BitSet FOLLOW_var_in_graphNode4249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_graphTerm_in_graphNode4262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_triplesNode_in_graphNode4274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_in_varOrTerm4301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_graphTerm_in_varOrTerm4316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_in_varOrIRIref4342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iRIref_in_varOrIRIref4357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_in_varOrIRIref24387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iRIref_in_varOrIRIref24403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_var4434 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_VAR1_in_var4441 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VAR2_in_var4456 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_iRIref_in_graphTerm4494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rDFLiteral_in_graphTerm4508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteral_in_graphTerm4520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteral_in_graphTerm4533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_blankNode_in_graphTerm4546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NIL_in_graphTerm4559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOGICAL_OR_in_expression4588 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression4600 = new BitSet(new long[]{0x20030A4427C32020L,0xDE587C80D040A250L,0x41D6818000005815L,0xFA00450A00ABC3F7L,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_expression4620 = new BitSet(new long[]{0x20030A4427C32028L,0xDE587C80D040A250L,0x41D6818000005815L,0xFA00450A00ABC3F7L,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_expression4631 = new BitSet(new long[]{0x20030A4427C32028L,0xDE587C80D040A250L,0x41D6818000005815L,0xFA00450A00ABC3F7L,0x000000000000000FL});
    public static final BitSet FOLLOW_LOGICAL_AND_in_expression4655 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression4667 = new BitSet(new long[]{0x20030A4427C32020L,0xDE587C80D040A250L,0x41D6818000005815L,0xFA00450A00ABC3F7L,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_expression4687 = new BitSet(new long[]{0x20030A4427C32028L,0xDE587C80D040A250L,0x41D6818000005815L,0xFA00450A00ABC3F7L,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_expression4698 = new BitSet(new long[]{0x20030A4427C32028L,0xDE587C80D040A250L,0x41D6818000005815L,0xFA00450A00ABC3F7L,0x000000000000000FL});
    public static final BitSet FOLLOW_257_in_expression4722 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression4736 = new BitSet(new long[]{0x20030A4427C32020L,0xDE587C80D040A250L,0x41D6818000005815L,0xFA00450A00ABC3F7L,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_expression4747 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_252_in_expression4760 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression4774 = new BitSet(new long[]{0x20030A4427C32020L,0xDE587C80D040A250L,0x41D6818000005815L,0xFA00450A00ABC3F7L,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_expression4785 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LT_in_expression4804 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression4819 = new BitSet(new long[]{0x20030A4427C32020L,0xDE587C80D040A250L,0x41D6818000005815L,0xFA00450A00ABC3F7L,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_expression4834 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_258_in_expression4853 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression4868 = new BitSet(new long[]{0x20030A4427C32020L,0xDE587C80D040A250L,0x41D6818000005815L,0xFA00450A00ABC3F7L,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_expression4879 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LTE_in_expression4898 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression4916 = new BitSet(new long[]{0x20030A4427C32020L,0xDE587C80D040A250L,0x41D6818000005815L,0xFA00450A00ABC3F7L,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_expression4927 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_259_in_expression4945 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression4959 = new BitSet(new long[]{0x20030A4427C32020L,0xDE587C80D040A250L,0x41D6818000005815L,0xFA00450A00ABC3F7L,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_expression4970 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IN_in_expression4989 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression5017 = new BitSet(new long[]{0x20030A4427C32020L,0xDE587C80D040A250L,0x41D6818000005A15L,0xFA00450A00ABC3F7L,0x000000000000000FL});
    public static final BitSet FOLLOW_expressionList_in_expression5031 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_expression5077 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression5104 = new BitSet(new long[]{0x20030A4427C32020L,0xDE587C80D040A250L,0x41D6818000005A15L,0xFA00450A00ABC3F7L,0x000000000000000FL});
    public static final BitSet FOLLOW_expressionList_in_expression5118 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_254_in_expression5153 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression5180 = new BitSet(new long[]{0x20030A4427C32028L,0xDE587C80D040A250L,0x41D6818000005815L,0xFA00450A00ABC3F7L,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_expression5192 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BROKEN_PLUS_in_expression5214 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression5233 = new BitSet(new long[]{0x20030A4427C32020L,0xDE587C80D040A250L,0x41D6818000005815L,0xFA00450A00ABC3F7L,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_expression5244 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_255_in_expression5263 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression5290 = new BitSet(new long[]{0x20030A4427C32028L,0xDE587C80D040A250L,0x41D6818000005815L,0xFA00450A00ABC3F7L,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_expression5302 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BROKEN_MINUS_in_expression5319 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression5337 = new BitSet(new long[]{0x20030A4427C32020L,0xDE587C80D040A250L,0x41D6818000005815L,0xFA00450A00ABC3F7L,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_expression5348 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_253_in_expression5367 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression5394 = new BitSet(new long[]{0x20030A4427C32020L,0xDE587C80D040A250L,0x41D6818000005815L,0xFA00450A00ABC3F7L,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_expression5405 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_256_in_expression5424 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression5451 = new BitSet(new long[]{0x20030A4427C32020L,0xDE587C80D040A250L,0x41D6818000005815L,0xFA00450A00ABC3F7L,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_expression5461 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_251_in_expression5479 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression5483 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_brackettedExpression_in_expression5494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExpression_in_expression5504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_builtInCall_in_primaryExpression5533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iRIref_in_primaryExpression5545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iRIFunction_in_primaryExpression5557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rDFLiteral_in_primaryExpression5569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteral_in_primaryExpression5581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteral_in_primaryExpression5592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_in_primaryExpression5603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_aggregate_in_primaryExpression5617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXPRESSION_in_brackettedExpression5644 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_brackettedExpression5649 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STR_in_builtInCall5684 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall5688 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LANG_in_builtInCall5701 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall5705 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LANGMATCHES_in_builtInCall5718 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall5722 = new BitSet(new long[]{0x20030A4427C32020L,0xDE587C80D040A250L,0x41D6818000005815L,0xFA00450A00ABC3F7L,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_builtInCall5726 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DATATYPE_in_builtInCall5739 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall5743 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BOUND_in_builtInCall5755 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_var_in_builtInCall5759 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IRI_in_builtInCall5777 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall5781 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_URI_in_builtInCall5794 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall5798 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BNODE_in_builtInCall5810 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall5814 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BNODE_in_builtInCall5825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RAND_in_builtInCall5836 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NIL_in_builtInCall5838 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ABS_in_builtInCall5851 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall5855 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CEIL_in_builtInCall5867 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall5871 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FLOOR_in_builtInCall5883 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall5887 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ROUND_in_builtInCall5899 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall5903 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONCAT_in_builtInCall5915 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expressionList_in_builtInCall5919 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUBSTR_in_builtInCall5932 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall5936 = new BitSet(new long[]{0x20030A4427C32020L,0xDE587C80D040A250L,0x41D6818000005815L,0xFA00450A00ABC3F7L,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_builtInCall5940 = new BitSet(new long[]{0x20030A4427C32028L,0xDE587C80D040A250L,0x41D6818000005815L,0xFA00450A00ABC3F7L,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_builtInCall5964 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STRLEN_in_builtInCall5987 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall5991 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UCASE_in_builtInCall6003 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall6007 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_REPLACE_in_builtInCall6019 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall6023 = new BitSet(new long[]{0x20030A4427C32020L,0xDE587C80D040A250L,0x41D6818000005815L,0xFA00450A00ABC3F7L,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_builtInCall6027 = new BitSet(new long[]{0x20030A4427C32020L,0xDE587C80D040A250L,0x41D6818000005815L,0xFA00450A00ABC3F7L,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_builtInCall6031 = new BitSet(new long[]{0x20030A4427C32028L,0xDE587C80D040A250L,0x41D6818000005815L,0xFA00450A00ABC3F7L,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_builtInCall6055 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LCASE_in_builtInCall6073 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall6077 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ENCODE_FOR_URI_in_builtInCall6089 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall6093 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONTAINS_in_builtInCall6105 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall6109 = new BitSet(new long[]{0x20030A4427C32020L,0xDE587C80D040A250L,0x41D6818000005815L,0xFA00450A00ABC3F7L,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_builtInCall6113 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STRSTARTS_in_builtInCall6125 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall6129 = new BitSet(new long[]{0x20030A4427C32020L,0xDE587C80D040A250L,0x41D6818000005815L,0xFA00450A00ABC3F7L,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_builtInCall6133 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STRENDS_in_builtInCall6145 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall6149 = new BitSet(new long[]{0x20030A4427C32020L,0xDE587C80D040A250L,0x41D6818000005815L,0xFA00450A00ABC3F7L,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_builtInCall6153 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STRBEFORE_in_builtInCall6165 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall6169 = new BitSet(new long[]{0x20030A4427C32020L,0xDE587C80D040A250L,0x41D6818000005815L,0xFA00450A00ABC3F7L,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_builtInCall6173 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STRAFTER_in_builtInCall6185 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall6189 = new BitSet(new long[]{0x20030A4427C32020L,0xDE587C80D040A250L,0x41D6818000005815L,0xFA00450A00ABC3F7L,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_builtInCall6193 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_YEAR_in_builtInCall6205 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall6209 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MONTH_in_builtInCall6221 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall6225 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DAY_in_builtInCall6237 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall6241 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_HOURS_in_builtInCall6253 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall6257 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUTES_in_builtInCall6269 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall6273 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SECONDS_in_builtInCall6285 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall6289 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TIMEZONE_in_builtInCall6301 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall6305 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TZ_in_builtInCall6317 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall6321 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOW_in_builtInCall6332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UUID_in_builtInCall6344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRUUID_in_builtInCall6356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MD5_in_builtInCall6365 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall6369 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SHA1_in_builtInCall6381 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall6385 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SHA256_in_builtInCall6397 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall6401 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SHA384_in_builtInCall6413 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall6417 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SHA512_in_builtInCall6429 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall6433 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_COALESCE_in_builtInCall6445 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expressionList_in_builtInCall6449 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IF_in_builtInCall6461 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall6465 = new BitSet(new long[]{0x20030A4427C32020L,0xDE587C80D040A250L,0x41D6818000005815L,0xFA00450A00ABC3F7L,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_builtInCall6469 = new BitSet(new long[]{0x20030A4427C32020L,0xDE587C80D040A250L,0x41D6818000005815L,0xFA00450A00ABC3F7L,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_builtInCall6473 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STRLANG_in_builtInCall6485 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall6489 = new BitSet(new long[]{0x20030A4427C32020L,0xDE587C80D040A250L,0x41D6818000005815L,0xFA00450A00ABC3F7L,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_builtInCall6493 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STRDT_in_builtInCall6505 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall6509 = new BitSet(new long[]{0x20030A4427C32020L,0xDE587C80D040A250L,0x41D6818000005815L,0xFA00450A00ABC3F7L,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_builtInCall6513 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAMETERM_in_builtInCall6525 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall6529 = new BitSet(new long[]{0x20030A4427C32020L,0xDE587C80D040A250L,0x41D6818000005815L,0xFA00450A00ABC3F7L,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_builtInCall6533 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ISIRI_in_builtInCall6545 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall6549 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ISURI_in_builtInCall6561 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall6565 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ISBLANK_in_builtInCall6577 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall6581 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ISLITERAL_in_builtInCall6593 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall6597 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ISNUMERIC_in_builtInCall6609 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall6613 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_REGEX_in_builtInCall6627 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall6631 = new BitSet(new long[]{0x20030A4427C32020L,0xDE587C80D040A250L,0x41D6818000005815L,0xFA00450A00ABC3F7L,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_builtInCall6635 = new BitSet(new long[]{0x20030A4427C32028L,0xDE587C80D040A250L,0x41D6818000005815L,0xFA00450A00ABC3F7L,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_builtInCall6639 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_existsFunc_in_builtInCall6655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notExistsFunc_in_builtInCall6679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXISTS_in_existsFunc6729 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_groupGraphPattern_in_existsFunc6733 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_EXISTS_in_notExistsFunc6767 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_groupGraphPattern_in_notExistsFunc6771 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_COUNT_in_aggregate6809 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DISTINCT_in_aggregate6821 = new BitSet(new long[]{0x20030A4427C32020L,0xDE587C80D040A250L,0x41D6818000005815L,0xFA00450A00ABC3F7L,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_aggregate6878 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_253_in_aggregate6888 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUM_in_aggregate6908 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DISTINCT_in_aggregate6920 = new BitSet(new long[]{0x20030A4427C32020L,0xDE587C80D040A250L,0x41D6818000005815L,0xFA00450A00ABC3F7L,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_aggregate6937 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MIN_in_aggregate6950 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DISTINCT_in_aggregate6963 = new BitSet(new long[]{0x20030A4427C32020L,0xDE587C80D040A250L,0x41D6818000005815L,0xFA00450A00ABC3F7L,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_aggregate6979 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MAX_in_aggregate6992 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DISTINCT_in_aggregate7005 = new BitSet(new long[]{0x20030A4427C32020L,0xDE587C80D040A250L,0x41D6818000005815L,0xFA00450A00ABC3F7L,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_aggregate7022 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AVG_in_aggregate7035 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DISTINCT_in_aggregate7048 = new BitSet(new long[]{0x20030A4427C32020L,0xDE587C80D040A250L,0x41D6818000005815L,0xFA00450A00ABC3F7L,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_aggregate7065 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAMPLE_in_aggregate7078 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DISTINCT_in_aggregate7090 = new BitSet(new long[]{0x20030A4427C32020L,0xDE587C80D040A250L,0x41D6818000005815L,0xFA00450A00ABC3F7L,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_aggregate7107 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GROUP_CONCAT_in_aggregate7121 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DISTINCT_in_aggregate7133 = new BitSet(new long[]{0x20030A4427C32020L,0xDE587C80D040A250L,0x41D6818000005815L,0xFA00450A00ABC3F7L,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_aggregate7148 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_SEPARATOR_in_aggregate7159 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_string_in_aggregate7163 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FUNCTION_in_iRIFunction7196 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_iRIref_in_iRIFunction7206 = new BitSet(new long[]{0x28030A4427C32028L,0xDE587C80D040A250L,0x41D6818000005A15L,0xFA00450A00ABC3F7L,0x000000000000000FL});
    public static final BitSet FOLLOW_argList_in_iRIFunction7218 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_string_in_rDFLiteral7254 = new BitSet(new long[]{0x0000000000000002L,0x0020000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_LANGTAG_in_rDFLiteral7269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_262_in_rDFLiteral7283 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L,0x0000018000000000L});
    public static final BitSet FOLLOW_iRIref_in_rDFLiteral7287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteralUnsigned_in_numericLiteral7322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteralPositive_in_numericLiteral7332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteralNegative_in_numericLiteral7342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BIG_INTEGER_in_numericLiteralUnsigned7368 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INTEGER_in_numericLiteralUnsigned7373 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BIG_DECIMAL_in_numericLiteralUnsigned7389 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DECIMAL_in_numericLiteralUnsigned7393 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DOUBLE_in_numericLiteralUnsigned7408 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DOUBLE_in_numericLiteralUnsigned7413 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BIG_INTEGER_in_numericLiteralPositive7447 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INTEGER_POSITIVE_in_numericLiteralPositive7452 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BIG_DECIMAL_in_numericLiteralPositive7465 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DECIMAL_POSITIVE_in_numericLiteralPositive7469 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DOUBLE_in_numericLiteralPositive7482 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DOUBLE_POSITIVE_in_numericLiteralPositive7487 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BIG_INTEGER_in_numericLiteralNegative7516 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INTEGER_NEGATIVE_in_numericLiteralNegative7521 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BIG_DECIMAL_in_numericLiteralNegative7534 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DECIMAL_NEGATIVE_in_numericLiteralNegative7538 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DOUBLE_in_numericLiteralNegative7551 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DOUBLE_NEGATIVE_in_numericLiteralNegative7556 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BOOLEAN_in_booleanLiteral7584 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TRUE_in_booleanLiteral7586 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BOOLEAN_in_booleanLiteral7601 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FALSE_in_booleanLiteral7603 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STRING_in_string7630 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_LITERAL1_in_string7634 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STRING_in_string7651 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_LITERAL2_in_string7655 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STRING_in_string7672 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_LITERAL_LONG1_in_string7676 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STRING_in_string7688 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_LITERAL_LONG2_in_string7692 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IRI_in_iRIref7720 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IRI_REF_in_iRIref7724 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_prefixedName_in_iRIref7736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PREFIXED_NAME_in_prefixedName7762 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PNAME_LN_in_prefixedName7766 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PREFIXED_NS_in_prefixedName7775 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PNAME_NS_in_prefixedName7779 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BLANK_NODE_LABEL_in_blankNode7807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ANNON_in_blankNode7818 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OPEN_SQ_BRACKET_in_blankNode7822 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NIL_in_synpred1_JSONWriter2286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NIL_in_synpred2_JSONWriter2308 = new BitSet(new long[]{0x0000000000000002L});

}