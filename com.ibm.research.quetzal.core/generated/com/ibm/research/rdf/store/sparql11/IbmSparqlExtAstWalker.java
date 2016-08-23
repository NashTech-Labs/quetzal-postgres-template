// $ANTLR 3.4 /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g 2016-08-23 16:22:03
 
package com.ibm.research.rdf.store.sparql11;
	
import org.antlr.runtime.BitSet;
import java.util.*;
import java.math.BigInteger;
import java.math.BigDecimal;
import com.ibm.research.rdf.store.sparql11.model.*;
import com.ibm.wala.util.collections.HashMapFactory;
import com.ibm.wala.util.collections.HashSetFactory;
import com.ibm.wala.util.collections.Pair;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class IbmSparqlExtAstWalker extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "A", "ABS", "ADD", "ALL", "ALT", "ANNON", "ARROW", "AS", "ASC", "ASK", "AVG", "B", "BASE", "BIG_DECIMAL", "BIG_INTEGER", "BIND", "BINDINGS", "BIND_VALUES", "BLANK_NODE_LABEL", "BNODE", "BOOLEAN", "BOUND", "BROKEN_MINUS", "BROKEN_PLUS", "BY", "C", "CEIL", "CLEAR", "CLOSE_BRACE", "CLOSE_CURLY_BRACE", "CLOSE_SQ_BRACKET", "COALESCE", "COLLECTION", "COMMA", "COMMENT", "CONCAT", "CONDITION", "CONSTRUCT", "CONTAINS", "COPY", "COUNT", "CREATE", "D", "DATA", "DATASET", "DATATYPE", "DAY", "DECIMAL", "DECIMAL_NEGATIVE", "DECIMAL_POSITIVE", "DEFAULT", "DEFAULT_NAMESPACE", "DELETE", "DESC", "DESCRIBE", "DIGIT", "DISTINCT", "DOT", "DOUBLE", "DOUBLE_NEGATIVE", "DOUBLE_POSITIVE", "DROP", "E", "ECHAR", "ELT", "ENCODE_FOR_URI", "EOL", "EOP", "EXISTS", "EXP", "EXPONENT", "EXPRESSION", "F", "FALSE", "FILTER", "FLOOR", "FROM", "FUNCBODY", "FUNCCALL", "FUNCLANG", "FUNCLG", "FUNCNAME", "FUNCTION", "G", "GET", "GRAPH", "GRAPH_GRAPH_PATTERN", "GRAPH_NODE", "GROUP", "GROUP_BY", "GROUP_CONCAT", "GROUP_GRAPH_PATTERN", "GROUP_GRAPH_PATTERN_SUB", "H", "HAVING", "HEXDIGIT", "HOURS", "I", "IF", "IN", "INLINE_DATA", "INSERT", "INTEGER", "INTEGER_NEGATIVE", "INTEGER_POSITIVE", "INTO", "INV", "IRI", "IRI_OR_FUNCTION", "IRI_REF", "ISBLANK", "ISIRI", "ISLITERAL", "ISNUMERIC", "ISURI", "J", "K", "KEY", "KIND", "L", "LANG", "LANGMATCHES", "LANGTAG", "LCASE", "LIMIT", "LOAD", "LOGICAL_AND", "LOGICAL_OR", "LT", "LTE", "M", "MAX", "MD5", "MIN", "MINUS", "MINUTES", "MODIFIERS", "MONTH", "MOVE", "N", "NAMED", "NAMESPACE_PREFIX_MAP", "NIL", "NON_TRIPLES", "NOT", "NOT_EXISTS", "NOT_IN", "NOW", "NUMERIC", "O", "OFFSET", "OPEN_BRACE", "OPEN_CURLY_BRACE", "OPEN_SQ_BRACKET", "OPTIONAL", "ORDER", "ORDER_BY", "OUTV", "P", "PARAM", "PARAMS", "PATH", "PERCENT", "PLX", "PNAME_LN", "PNAME_NS", "PN_CHARS", "PN_CHARS_BASE", "PN_CHARS_U", "PN_LOCAL", "PN_LOCAL_ESC", "PN_PREFIX", "POST", "PREDICATE", "PREDICATE_VALUE", "PREFIX", "PREFIXED_NAME", "PREFIXED_NS", "PROLOGUE", "PROPERTY_LIST", "PVARS", "Q", "QUERY", "R", "RAND", "REDUCED", "REGEX", "REPLACE", "ROOT", "ROUND", "S", "SAMETERM", "SAMPLE", "SECONDS", "SELECT", "SEMICOLON", "SEPARATOR", "SEQ", "SERVICE", "SHA1", "SHA224", "SHA256", "SHA384", "SHA512", "SILENT", "SOP", "STR", "STRAFTER", "STRBEFORE", "STRDT", "STRENDS", "STRING", "STRING_LINE_NONEOP", "STRING_LITERAL1", "STRING_LITERAL2", "STRING_LITERAL_LONG1", "STRING_LITERAL_LONG2", "STRLANG", "STRLEN", "STRSTARTS", "STRUUID", "SUBJECT", "SUBSTR", "SUB_SELECT", "SUM", "T", "TABLE", "TIMEZONE", "TO", "TRIPLE", "TRIPLE2", "TRIPLES_BLOCK", "TRIPLES_NODE", "TRIPLES_NODE_PROPERTY_LIST", "TRIPLES_SAME_SUBJECT", "TRUE", "TYPE", "TZ", "U", "UCASE", "UNDEF", "UNICODE_ESCAPE", "UNION", "UPDATE", "URI", "USING", "UUID", "V", "VALUE", "VALUES", "VAR", "VAR0", "VAR1", "VAR2", "VARNAME", "W", "WHERE", "WHERE_TOKEN", "WITH", "WS", "X", "Y", "YEAR", "Z", "'!'", "'!='", "'*'", "'+'", "'-'", "'/'", "'::'", "'='", "'>'", "'>='", "'?'", "'^'", "'^^'", "'a'", "'|'"
    };

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

    // delegates
    public TreeParser[] getDelegates() {
        return new TreeParser[] {};
    }

    // delegators


    public IbmSparqlExtAstWalker(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public IbmSparqlExtAstWalker(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return IbmSparqlExtAstWalker.tokenNames; }
    public String getGrammarFileName() { return "/home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g"; }


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

        private final Set<BlankNodeVariable> allBlankNodes = HashSetFactory.make();

        private void checkBlankNodes(Set<BlankNodeVariable> blankNodes) {
          // blank node scope is a single BGP
          if (! Collections.disjoint(blankNodes, allBlankNodes)) {
            throw new SPARQLsyntaxError("blank node scope");
          }

          allBlankNodes.addAll(blankNodes);
        }

        private int blankNodeCount = 0;

        private final Map<IRI, FunctionBase> functions = HashMapFactory.make();



    // $ANTLR start "queryUnit"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:64:1: queryUnit returns [QueryExt q] : ^( ROOT x= query ) ;
    public final QueryExt queryUnit() throws RecognitionException {
        QueryExt q = null;


        QueryExt x =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:65:2: ( ^( ROOT x= query ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:65:8: ^( ROOT x= query )
            {
            match(input,ROOT,FOLLOW_ROOT_in_queryUnit82); if (state.failed) return q;

            match(input, Token.DOWN, null); if (state.failed) return q;
            pushFollow(FOLLOW_query_in_queryUnit86);
            x=query();

            state._fsp--;
            if (state.failed) return q;

            match(input, Token.UP, null); if (state.failed) return q;


            if ( state.backtracking==0 ) { q = x; /*System.out.println(q.toString());*/ }

            }

        }

        	catch(RecognitionException re) {
        		throw new SPARQLsyntaxError(re);
        	}

        finally {
        	// do for sure before leaving
        }
        return q;
    }
    // $ANTLR end "queryUnit"



    // $ANTLR start "query"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:69:1: query returns [QueryExt q] : ^( QUERY (p= prologue ) ( (s= selectQuery (b= bindingsClause )? ) | (c= constructQuery ) | (d= describeQuery ) | (a= askQuery ) ) ) ;
    public final QueryExt query() throws RecognitionException {
        QueryExt q = null;


        QueryPrologue p =null;

        SelectQueryExt s =null;

        Pattern b =null;

        ConstructQuery c =null;

        DescribeQuery d =null;

        AskQuery a =null;



        		
        	
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:73:2: ( ^( QUERY (p= prologue ) ( (s= selectQuery (b= bindingsClause )? ) | (c= constructQuery ) | (d= describeQuery ) | (a= askQuery ) ) ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:73:4: ^( QUERY (p= prologue ) ( (s= selectQuery (b= bindingsClause )? ) | (c= constructQuery ) | (d= describeQuery ) | (a= askQuery ) ) )
            {
            match(input,QUERY,FOLLOW_QUERY_in_query116); if (state.failed) return q;

            match(input, Token.DOWN, null); if (state.failed) return q;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:74:4: (p= prologue )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:74:6: p= prologue
            {
            pushFollow(FOLLOW_prologue_in_query126);
            p=prologue();

            state._fsp--;
            if (state.failed) return q;

            }


            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:75:4: ( (s= selectQuery (b= bindingsClause )? ) | (c= constructQuery ) | (d= describeQuery ) | (a= askQuery ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case FUNCTION:
            case SELECT:
                {
                alt2=1;
                }
                break;
            case CONSTRUCT:
                {
                alt2=2;
                }
                break;
            case DESCRIBE:
                {
                alt2=3;
                }
                break;
            case ASK:
                {
                alt2=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return q;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }

            switch (alt2) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:75:6: (s= selectQuery (b= bindingsClause )? )
                    {
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:75:6: (s= selectQuery (b= bindingsClause )? )
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:75:8: s= selectQuery (b= bindingsClause )?
                    {
                    pushFollow(FOLLOW_selectQuery_in_query145);
                    s=selectQuery();

                    state._fsp--;
                    if (state.failed) return q;

                    if ( state.backtracking==0 ) { q = new QueryExt(p,s); }

                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:76:8: (b= bindingsClause )?
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==VALUES) ) {
                        alt1=1;
                    }
                    switch (alt1) {
                        case 1 :
                            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:76:10: b= bindingsClause
                            {
                            pushFollow(FOLLOW_bindingsClause_in_query163);
                            b=bindingsClause();

                            state._fsp--;
                            if (state.failed) return q;

                            if ( state.backtracking==0 ) { 
                                                PatternSet top = new PatternSet();
                                                top.setTopLevel(true);
                                                PatternSet oldMain = (PatternSet)q.getMainPattern();
                                                oldMain.setTopLevel(false);
                                                top.addPattern(oldMain);
                                                top.addPattern(b);
                                                q.setMainPattern(top);
                                              }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:88:6: (c= constructQuery )
                    {
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:88:6: (c= constructQuery )
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:88:8: c= constructQuery
                    {
                    pushFollow(FOLLOW_constructQuery_in_query220);
                    c=constructQuery();

                    state._fsp--;
                    if (state.failed) return q;

                    if ( state.backtracking==0 ) { q = new QueryExt(p,c); }

                    }


                    }
                    break;
                case 3 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:89:6: (d= describeQuery )
                    {
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:89:6: (d= describeQuery )
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:89:8: d= describeQuery
                    {
                    pushFollow(FOLLOW_describeQuery_in_query236);
                    d=describeQuery();

                    state._fsp--;
                    if (state.failed) return q;

                    if ( state.backtracking==0 ) { q = new QueryExt(p,d); }

                    }


                    }
                    break;
                case 4 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:90:6: (a= askQuery )
                    {
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:90:6: (a= askQuery )
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:90:8: a= askQuery
                    {
                    pushFollow(FOLLOW_askQuery_in_query252);
                    a=askQuery();

                    state._fsp--;
                    if (state.failed) return q;

                    if ( state.backtracking==0 ) { q = new QueryExt(p,a); }

                    }


                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return q;


            }

        }

        	catch(RecognitionException re) {
        		throw new SPARQLsyntaxError(re);
        	}

        finally {
        	// do for sure before leaving
        }
        return q;
    }
    // $ANTLR end "query"



    // $ANTLR start "prologue"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:103:1: prologue returns [QueryPrologue qp] : ^( PROLOGUE ( baseDecl[$qp] )* ( prefixDecl[$qp] )* ) ;
    public final QueryPrologue prologue() throws RecognitionException {
        QueryPrologue qp = null;


         qp = new QueryPrologue(); 
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:105:2: ( ^( PROLOGUE ( baseDecl[$qp] )* ( prefixDecl[$qp] )* ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:106:3: ^( PROLOGUE ( baseDecl[$qp] )* ( prefixDecl[$qp] )* )
            {
            match(input,PROLOGUE,FOLLOW_PROLOGUE_in_prologue308); if (state.failed) return qp;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return qp;
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:106:14: ( baseDecl[$qp] )*
                loop3:
                do {
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==BASE) ) {
                        alt3=1;
                    }


                    switch (alt3) {
                	case 1 :
                	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:106:14: baseDecl[$qp]
                	    {
                	    pushFollow(FOLLOW_baseDecl_in_prologue310);
                	    baseDecl(qp);

                	    state._fsp--;
                	    if (state.failed) return qp;

                	    }
                	    break;

                	default :
                	    break loop3;
                    }
                } while (true);


                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:106:30: ( prefixDecl[$qp] )*
                loop4:
                do {
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==PREFIX) ) {
                        alt4=1;
                    }


                    switch (alt4) {
                	case 1 :
                	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:106:30: prefixDecl[$qp]
                	    {
                	    pushFollow(FOLLOW_prefixDecl_in_prologue315);
                	    prefixDecl(qp);

                	    state._fsp--;
                	    if (state.failed) return qp;

                	    }
                	    break;

                	default :
                	    break loop4;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return qp;
            }


            }

        }

        	catch(RecognitionException re) {
        		throw new SPARQLsyntaxError(re);
        	}

        finally {
        	// do for sure before leaving
        }
        return qp;
    }
    // $ANTLR end "prologue"



    // $ANTLR start "baseDecl"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:110:1: baseDecl[QueryPrologue qp] : ^( BASE i= iRIref ) ;
    public final void baseDecl(QueryPrologue qp) throws RecognitionException {
        IRI i =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:111:2: ( ^( BASE i= iRIref ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:112:4: ^( BASE i= iRIref )
            {
            match(input,BASE,FOLLOW_BASE_in_baseDecl346); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_iRIref_in_baseDecl350);
            i=iRIref();

            state._fsp--;
            if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==0 ) { qp.setBase(i);	}

            }

        }

        	catch(RecognitionException re) {
        		throw new SPARQLsyntaxError(re);
        	}

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "baseDecl"



    // $ANTLR start "prefixDecl"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:116:1: prefixDecl[QueryPrologue qp] : ^( PREFIX n= prefixedName v= iRIref ) ;
    public final void prefixDecl(QueryPrologue qp) throws RecognitionException {
        String n =null;

        IRI v =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:117:2: ( ^( PREFIX n= prefixedName v= iRIref ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:118:3: ^( PREFIX n= prefixedName v= iRIref )
            {
            match(input,PREFIX,FOLLOW_PREFIX_in_prefixDecl378); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_prefixedName_in_prefixDecl382);
            n=prefixedName();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_iRIref_in_prefixDecl387);
            v=iRIref();

            state._fsp--;
            if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==0 ) { qp.getPrefixes().put(n.substring(0,n.length()-1), v);	}

            }

        }

        	catch(RecognitionException re) {
        		throw new SPARQLsyntaxError(re);
        	}

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "prefixDecl"



    // $ANTLR start "selectQuery"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:123:1: selectQuery returns [SelectQueryExt sq] : ( ^(f= functionSet ) )? ^( SELECT (s= selectClause ) (d= dataset )* (w= whereClause )? (m= solutionModifier ) ) ;
    public final SelectQueryExt selectQuery() throws RecognitionException {
        SelectQueryExt sq = null;


        List<FunctionBase> f =null;

        SelectClause s =null;

        List<DatasetClause> d =null;

        Pattern w =null;

        SolutionModifiers m =null;


         sq = new SelectQueryExt(); 
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:125:2: ( ( ^(f= functionSet ) )? ^( SELECT (s= selectClause ) (d= dataset )* (w= whereClause )? (m= solutionModifier ) ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:126:3: ( ^(f= functionSet ) )? ^( SELECT (s= selectClause ) (d= dataset )* (w= whereClause )? (m= solutionModifier ) )
            {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:126:3: ( ^(f= functionSet ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==FUNCTION) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:126:4: ^(f= functionSet )
                    {
                    pushFollow(FOLLOW_functionSet_in_selectQuery428);
                    f=functionSet();

                    state._fsp--;
                    if (state.failed) return sq;

                    if ( state.backtracking==0 ) { sq.setFunctions(f);    }

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return sq;
                        match(input, Token.UP, null); if (state.failed) return sq;
                    }


                    }
                    break;

            }


            match(input,SELECT,FOLLOW_SELECT_in_selectQuery445); if (state.failed) return sq;

            match(input, Token.DOWN, null); if (state.failed) return sq;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:129:4: (s= selectClause )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:129:5: s= selectClause
            {
            pushFollow(FOLLOW_selectClause_in_selectQuery455);
            s=selectClause();

            state._fsp--;
            if (state.failed) return sq;

            if ( state.backtracking==0 ) { sq.setSelectClause(s);      }

            }


            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:130:4: (d= dataset )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==DATASET) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:130:5: d= dataset
            	    {
            	    pushFollow(FOLLOW_dataset_in_selectQuery471);
            	    d=dataset();

            	    state._fsp--;
            	    if (state.failed) return sq;

            	    if ( state.backtracking==0 ) { sq.setDatasetClauses(d);    }

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:131:4: (w= whereClause )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==WHERE) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:131:5: w= whereClause
                    {
                    pushFollow(FOLLOW_whereClause_in_selectQuery490);
                    w=whereClause();

                    state._fsp--;
                    if (state.failed) return sq;

                    if ( state.backtracking==0 ) { sq.setGraphPattern(w);      }

                    }
                    break;

            }


            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:132:4: (m= solutionModifier )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:132:5: m= solutionModifier
            {
            pushFollow(FOLLOW_solutionModifier_in_selectQuery506);
            m=solutionModifier();

            state._fsp--;
            if (state.failed) return sq;

            if ( state.backtracking==0 ) { sq.setSolutionModifier(m);  }

            }


            match(input, Token.UP, null); if (state.failed) return sq;


            }

        }

        	catch(RecognitionException re) {
        		throw new SPARQLsyntaxError(re);
        	}

        finally {
        	// do for sure before leaving
        }
        return sq;
    }
    // $ANTLR end "selectQuery"



    // $ANTLR start "functionSet"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:137:1: functionSet returns [List<FunctionBase> funcs] : ^( FUNCTION (f= functionDecl )+ ) ;
    public final List<FunctionBase> functionSet() throws RecognitionException {
        List<FunctionBase> funcs = null;


        FunctionBase f =null;


         funcs = new ArrayList<FunctionBase>(); 
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:139:2: ( ^( FUNCTION (f= functionDecl )+ ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:140:3: ^( FUNCTION (f= functionDecl )+ )
            {
            match(input,FUNCTION,FOLLOW_FUNCTION_in_functionSet547); if (state.failed) return funcs;

            match(input, Token.DOWN, null); if (state.failed) return funcs;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:141:4: (f= functionDecl )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==FUNCNAME) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:141:5: f= functionDecl
            	    {
            	    pushFollow(FOLLOW_functionDecl_in_functionSet555);
            	    f=functionDecl();

            	    state._fsp--;
            	    if (state.failed) return funcs;

            	    if ( state.backtracking==0 ) {funcs.add(f);}

            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
            	    if (state.backtracking>0) {state.failed=true; return funcs;}
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);


            match(input, Token.UP, null); if (state.failed) return funcs;


            }

        }

        	catch(RecognitionException re) {
        		throw new SPARQLsyntaxError(re);
        	}

        finally {
        	// do for sure before leaving
        }
        return funcs;
    }
    // $ANTLR end "functionSet"



    // $ANTLR start "functionDecl"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:146:1: functionDecl returns [FunctionBase func] : ^( FUNCNAME ( (fn= iRIref ) | ^( SERVICE s= expression fn= iRIref ) | ^( TABLE s= expression fn= iRIref ) ) ^( KIND ( ( POST ) | ( GET ) )? ) ^( INV (inv= var )* ) ^( OUTV (outv= var )* ) ( ( ^( FUNCLG (fl= VAR0 ) ) (fb= functionBody ) ) | ( ^( PARAMS ( ^( PARAM param= string (value= expression |pattern= groupGraphPattern[true] |) ) )* ) rowdef= string (coldef= string )+ ) ) ) ;
    public final FunctionBase functionDecl() throws RecognitionException {
        FunctionBase func = null;


        XTree fl=null;
        IRI fn =null;

        Expression s =null;

        String inv =null;

        String outv =null;

        FunctionBody fb =null;

        String param =null;

        Expression value =null;

        Pattern pattern =null;

        String rowdef =null;

        String coldef =null;


         FunctionExt ext = null; ServiceFunction svc = null; 
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:148:2: ( ^( FUNCNAME ( (fn= iRIref ) | ^( SERVICE s= expression fn= iRIref ) | ^( TABLE s= expression fn= iRIref ) ) ^( KIND ( ( POST ) | ( GET ) )? ) ^( INV (inv= var )* ) ^( OUTV (outv= var )* ) ( ( ^( FUNCLG (fl= VAR0 ) ) (fb= functionBody ) ) | ( ^( PARAMS ( ^( PARAM param= string (value= expression |pattern= groupGraphPattern[true] |) ) )* ) rowdef= string (coldef= string )+ ) ) ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:149:3: ^( FUNCNAME ( (fn= iRIref ) | ^( SERVICE s= expression fn= iRIref ) | ^( TABLE s= expression fn= iRIref ) ) ^( KIND ( ( POST ) | ( GET ) )? ) ^( INV (inv= var )* ) ^( OUTV (outv= var )* ) ( ( ^( FUNCLG (fl= VAR0 ) ) (fb= functionBody ) ) | ( ^( PARAMS ( ^( PARAM param= string (value= expression |pattern= groupGraphPattern[true] |) ) )* ) rowdef= string (coldef= string )+ ) ) )
            {
            match(input,FUNCNAME,FOLLOW_FUNCNAME_in_functionDecl591); if (state.failed) return func;

            match(input, Token.DOWN, null); if (state.failed) return func;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:150:4: ( (fn= iRIref ) | ^( SERVICE s= expression fn= iRIref ) | ^( TABLE s= expression fn= iRIref ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case IRI:
            case PREFIXED_NAME:
            case PREFIXED_NS:
                {
                alt9=1;
                }
                break;
            case SERVICE:
                {
                alt9=2;
                }
                break;
            case TABLE:
                {
                alt9=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return func;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }

            switch (alt9) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:151:17: (fn= iRIref )
                    {
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:151:17: (fn= iRIref )
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:151:18: fn= iRIref
                    {
                    pushFollow(FOLLOW_iRIref_in_functionDecl617);
                    fn=iRIref();

                    state._fsp--;
                    if (state.failed) return func;

                    if ( state.backtracking==0 ) { func = ext = new FunctionExt(); ext.setName(fn);  }

                    }


                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:153:17: ^( SERVICE s= expression fn= iRIref )
                    {
                    match(input,SERVICE,FOLLOW_SERVICE_in_functionDecl654); if (state.failed) return func;

                    match(input, Token.DOWN, null); if (state.failed) return func;
                    pushFollow(FOLLOW_expression_in_functionDecl658);
                    s=expression();

                    state._fsp--;
                    if (state.failed) return func;

                    pushFollow(FOLLOW_iRIref_in_functionDecl662);
                    fn=iRIref();

                    state._fsp--;
                    if (state.failed) return func;

                    if ( state.backtracking==0 ) { func = svc = new ServiceFunction(); svc.setService(s); }

                    match(input, Token.UP, null); if (state.failed) return func;


                    }
                    break;
                case 3 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:155:17: ^( TABLE s= expression fn= iRIref )
                    {
                    match(input,TABLE,FOLLOW_TABLE_in_functionDecl699); if (state.failed) return func;

                    match(input, Token.DOWN, null); if (state.failed) return func;
                    pushFollow(FOLLOW_expression_in_functionDecl703);
                    s=expression();

                    state._fsp--;
                    if (state.failed) return func;

                    pushFollow(FOLLOW_iRIref_in_functionDecl707);
                    fn=iRIref();

                    state._fsp--;
                    if (state.failed) return func;

                    if ( state.backtracking==0 ) { func = svc = new ServiceFunction(); svc.setService(s); svc.setTableFunction(true); }

                    match(input, Token.UP, null); if (state.failed) return func;


                    }
                    break;

            }


            if ( state.backtracking==0 ) { functions.put(fn, func); }

            match(input,KIND,FOLLOW_KIND_in_functionDecl754); if (state.failed) return func;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return func;
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:158:20: ( ( POST ) | ( GET ) )?
                int alt10=3;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==POST) ) {
                    alt10=1;
                }
                else if ( (LA10_0==GET) ) {
                    alt10=2;
                }
                switch (alt10) {
                    case 1 :
                        // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:158:22: ( POST )
                        {
                        // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:158:22: ( POST )
                        // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:158:24: POST
                        {
                        match(input,POST,FOLLOW_POST_in_functionDecl760); if (state.failed) return func;

                        if ( state.backtracking==0 ) { func.setPost(); }

                        }


                        }
                        break;
                    case 2 :
                        // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:159:22: ( GET )
                        {
                        // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:159:22: ( GET )
                        // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:159:24: GET
                        {
                        match(input,GET,FOLLOW_GET_in_functionDecl791); if (state.failed) return func;

                        if ( state.backtracking==0 ) { func.setGet(); }

                        }


                        }
                        break;

                }


                match(input, Token.UP, null); if (state.failed) return func;
            }


            match(input,INV,FOLLOW_INV_in_functionDecl806); if (state.failed) return func;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return func;
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:160:10: (inv= var )*
                loop11:
                do {
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==VAR) ) {
                        alt11=1;
                    }


                    switch (alt11) {
                	case 1 :
                	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:160:12: inv= var
                	    {
                	    pushFollow(FOLLOW_var_in_functionDecl812);
                	    inv=var();

                	    state._fsp--;
                	    if (state.failed) return func;

                	    if ( state.backtracking==0 ) { func.addInVar(inv); }

                	    }
                	    break;

                	default :
                	    break loop11;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return func;
            }


            match(input,OUTV,FOLLOW_OUTV_in_functionDecl824); if (state.failed) return func;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return func;
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:161:11: (outv= var )*
                loop12:
                do {
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==VAR) ) {
                        alt12=1;
                    }


                    switch (alt12) {
                	case 1 :
                	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:161:13: outv= var
                	    {
                	    pushFollow(FOLLOW_var_in_functionDecl830);
                	    outv=var();

                	    state._fsp--;
                	    if (state.failed) return func;

                	    if ( state.backtracking==0 ) { func.addOutVar(outv); }

                	    }
                	    break;

                	default :
                	    break loop12;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return func;
            }


            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:162:13: ( ( ^( FUNCLG (fl= VAR0 ) ) (fb= functionBody ) ) | ( ^( PARAMS ( ^( PARAM param= string (value= expression |pattern= groupGraphPattern[true] |) ) )* ) rowdef= string (coldef= string )+ ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==FUNCLG) ) {
                alt16=1;
            }
            else if ( (LA16_0==PARAMS) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return func;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }
            switch (alt16) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:163:17: ( ^( FUNCLG (fl= VAR0 ) ) (fb= functionBody ) )
                    {
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:163:17: ( ^( FUNCLG (fl= VAR0 ) ) (fb= functionBody ) )
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:164:21: ^( FUNCLG (fl= VAR0 ) ) (fb= functionBody )
                    {
                    match(input,FUNCLG,FOLLOW_FUNCLG_in_functionDecl891); if (state.failed) return func;

                    match(input, Token.DOWN, null); if (state.failed) return func;
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:164:30: (fl= VAR0 )
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:164:31: fl= VAR0
                    {
                    fl=(XTree)match(input,VAR0,FOLLOW_VAR0_in_functionDecl896); if (state.failed) return func;

                    if ( state.backtracking==0 ) { ext.setLang(fl.getText()); }

                    }


                    match(input, Token.UP, null); if (state.failed) return func;


                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:165:21: (fb= functionBody )
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:165:22: fb= functionBody
                    {
                    pushFollow(FOLLOW_functionBody_in_functionDecl927);
                    fb=functionBody();

                    state._fsp--;
                    if (state.failed) return func;

                    if ( state.backtracking==0 ) { ext.setBody(fb); }

                    }


                    }


                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:168:17: ( ^( PARAMS ( ^( PARAM param= string (value= expression |pattern= groupGraphPattern[true] |) ) )* ) rowdef= string (coldef= string )+ )
                    {
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:168:17: ( ^( PARAMS ( ^( PARAM param= string (value= expression |pattern= groupGraphPattern[true] |) ) )* ) rowdef= string (coldef= string )+ )
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:169:21: ^( PARAMS ( ^( PARAM param= string (value= expression |pattern= groupGraphPattern[true] |) ) )* ) rowdef= string (coldef= string )+
                    {
                    match(input,PARAMS,FOLLOW_PARAMS_in_functionDecl1004); if (state.failed) return func;

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return func;
                        // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:170:25: ( ^( PARAM param= string (value= expression |pattern= groupGraphPattern[true] |) ) )*
                        loop14:
                        do {
                            int alt14=2;
                            int LA14_0 = input.LA(1);

                            if ( (LA14_0==PARAM) ) {
                                alt14=1;
                            }


                            switch (alt14) {
                        	case 1 :
                        	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:171:29: ^( PARAM param= string (value= expression |pattern= groupGraphPattern[true] |) )
                        	    {
                        	    match(input,PARAM,FOLLOW_PARAM_in_functionDecl1061); if (state.failed) return func;

                        	    match(input, Token.DOWN, null); if (state.failed) return func;
                        	    pushFollow(FOLLOW_string_in_functionDecl1097);
                        	    param=string();

                        	    state._fsp--;
                        	    if (state.failed) return func;

                        	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:173:33: (value= expression |pattern= groupGraphPattern[true] |)
                        	    int alt13=3;
                        	    switch ( input.LA(1) ) {
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
                        	    case 268:
                        	    case 269:
                        	    case 270:
                        	    case 271:
                        	    case 272:
                        	    case 273:
                        	    case 275:
                        	    case 276:
                        	    case 277:
                        	        {
                        	        alt13=1;
                        	        }
                        	        break;
                        	    case GROUP_GRAPH_PATTERN:
                        	    case SUB_SELECT:
                        	        {
                        	        alt13=2;
                        	        }
                        	        break;
                        	    case UP:
                        	        {
                        	        alt13=3;
                        	        }
                        	        break;
                        	    default:
                        	        if (state.backtracking>0) {state.failed=true; return func;}
                        	        NoViableAltException nvae =
                        	            new NoViableAltException("", 13, 0, input);

                        	        throw nvae;

                        	    }

                        	    switch (alt13) {
                        	        case 1 :
                        	            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:174:37: value= expression
                        	            {
                        	            pushFollow(FOLLOW_expression_in_functionDecl1171);
                        	            value=expression();

                        	            state._fsp--;
                        	            if (state.failed) return func;

                        	            if ( state.backtracking==0 ) { System.err.println("adding " + param + " and " + value + " to " + svc); svc.addServiceParam(param, value); }

                        	            }
                        	            break;
                        	        case 2 :
                        	            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:177:37: pattern= groupGraphPattern[true]
                        	            {
                        	            pushFollow(FOLLOW_groupGraphPattern_in_functionDecl1284);
                        	            pattern=groupGraphPattern(true);

                        	            state._fsp--;
                        	            if (state.failed) return func;

                        	            if ( state.backtracking==0 ) { svc.addServiceParam(param, pattern); }

                        	            }
                        	            break;
                        	        case 3 :
                        	            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:181:37: 
                        	            {
                        	            if ( state.backtracking==0 ) { svc.setTableParam(param); }

                        	            }
                        	            break;

                        	    }


                        	    match(input, Token.UP, null); if (state.failed) return func;


                        	    }
                        	    break;

                        	default :
                        	    break loop14;
                            }
                        } while (true);


                        match(input, Token.UP, null); if (state.failed) return func;
                    }


                    pushFollow(FOLLOW_string_in_functionDecl1570);
                    rowdef=string();

                    state._fsp--;
                    if (state.failed) return func;

                    if ( state.backtracking==0 ) { svc.setServiceRowXPath(rowdef); }

                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:187:21: (coldef= string )+
                    int cnt15=0;
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==STRING) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:187:23: coldef= string
                    	    {
                    	    pushFollow(FOLLOW_string_in_functionDecl1598);
                    	    coldef=string();

                    	    state._fsp--;
                    	    if (state.failed) return func;

                    	    if ( state.backtracking==0 ) { svc.addServiceColumnXPath(coldef); }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt15 >= 1 ) break loop15;
                    	    if (state.backtracking>0) {state.failed=true; return func;}
                                EarlyExitException eee =
                                    new EarlyExitException(15, input);
                                throw eee;
                        }
                        cnt15++;
                    } while (true);


                    }


                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return func;


            }

        }

        	catch(RecognitionException re) {
        		throw new SPARQLsyntaxError(re);
        	}

        finally {
        	// do for sure before leaving
        }
        return func;
    }
    // $ANTLR end "functionDecl"



    // $ANTLR start "functionBody"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:194:1: functionBody returns [FunctionBody fb] : ^( FUNCBODY ( (f= STRING_LINE_NONEOP ) | (p= groupGraphPattern[true] ) ) ) ;
    public final FunctionBody functionBody() throws RecognitionException {
        FunctionBody fb = null;


        XTree f=null;
        Pattern p =null;


         fb = new FunctionBody(); 
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:196:2: ( ^( FUNCBODY ( (f= STRING_LINE_NONEOP ) | (p= groupGraphPattern[true] ) ) ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:197:4: ^( FUNCBODY ( (f= STRING_LINE_NONEOP ) | (p= groupGraphPattern[true] ) ) )
            {
            match(input,FUNCBODY,FOLLOW_FUNCBODY_in_functionBody1666); if (state.failed) return fb;

            match(input, Token.DOWN, null); if (state.failed) return fb;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:198:5: ( (f= STRING_LINE_NONEOP ) | (p= groupGraphPattern[true] ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==STRING_LINE_NONEOP) ) {
                alt17=1;
            }
            else if ( (LA17_0==GROUP_GRAPH_PATTERN||LA17_0==SUB_SELECT) ) {
                alt17=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return fb;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;

            }
            switch (alt17) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:199:5: (f= STRING_LINE_NONEOP )
                    {
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:199:5: (f= STRING_LINE_NONEOP )
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:199:6: f= STRING_LINE_NONEOP
                    {
                    f=(XTree)match(input,STRING_LINE_NONEOP,FOLLOW_STRING_LINE_NONEOP_in_functionBody1681); if (state.failed) return fb;

                    if ( state.backtracking==0 ) {fb.setFlag(0); fb.setBody(f); }

                    }


                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:201:5: (p= groupGraphPattern[true] )
                    {
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:201:5: (p= groupGraphPattern[true] )
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:201:6: p= groupGraphPattern[true]
                    {
                    pushFollow(FOLLOW_groupGraphPattern_in_functionBody1701);
                    p=groupGraphPattern(true);

                    state._fsp--;
                    if (state.failed) return fb;

                    if ( state.backtracking==0 ) {fb.setFlag(1); fb.setBody(p); }

                    }


                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return fb;


            }

        }

        	catch(RecognitionException re) {
        		throw new SPARQLsyntaxError(re);
        	}

        finally {
        	// do for sure before leaving
        }
        return fb;
    }
    // $ANTLR end "functionBody"



    // $ANTLR start "dataset"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:206:1: dataset returns [List<DatasetClause> dcl] : ^( DATASET (dc= datasetClause )+ ) ;
    public final List<DatasetClause> dataset() throws RecognitionException {
        List<DatasetClause> dcl = null;


        DatasetClause dc =null;


         dcl = new ArrayList<DatasetClause>(); 
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:208:2: ( ^( DATASET (dc= datasetClause )+ ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:209:3: ^( DATASET (dc= datasetClause )+ )
            {
            match(input,DATASET,FOLLOW_DATASET_in_dataset1744); if (state.failed) return dcl;

            match(input, Token.DOWN, null); if (state.failed) return dcl;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:210:4: (dc= datasetClause )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==FROM) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:210:5: dc= datasetClause
            	    {
            	    pushFollow(FOLLOW_datasetClause_in_dataset1753);
            	    dc=datasetClause();

            	    state._fsp--;
            	    if (state.failed) return dcl;

            	    if ( state.backtracking==0 ) {dcl.add(dc);}

            	    }
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
            	    if (state.backtracking>0) {state.failed=true; return dcl;}
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);


            match(input, Token.UP, null); if (state.failed) return dcl;


            }

        }

        	catch(RecognitionException re) {
        		throw new SPARQLsyntaxError(re);
        	}

        finally {
        	// do for sure before leaving
        }
        return dcl;
    }
    // $ANTLR end "dataset"



    // $ANTLR start "subSelect"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:214:1: subSelect returns [SubSelectPattern sp] : ^( SUB_SELECT (s= selectClause ) (w= whereClause )? (m= solutionModifier ) (d= inlineData )? ) ;
    public final SubSelectPattern subSelect() throws RecognitionException {
        SubSelectPattern sp = null;


        SelectClause s =null;

        Pattern w =null;

        SolutionModifiers m =null;

        ValuesPattern d =null;


         
        		sp = new SubSelectPattern();
        	
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:218:2: ( ^( SUB_SELECT (s= selectClause ) (w= whereClause )? (m= solutionModifier ) (d= inlineData )? ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:218:6: ^( SUB_SELECT (s= selectClause ) (w= whereClause )? (m= solutionModifier ) (d= inlineData )? )
            {
            match(input,SUB_SELECT,FOLLOW_SUB_SELECT_in_subSelect1787); if (state.failed) return sp;

            match(input, Token.DOWN, null); if (state.failed) return sp;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:219:4: (s= selectClause )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:219:5: s= selectClause
            {
            pushFollow(FOLLOW_selectClause_in_subSelect1796);
            s=selectClause();

            state._fsp--;
            if (state.failed) return sp;

            if ( state.backtracking==0 ) { sp.setSelectClause(s);      }

            }


            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:220:4: (w= whereClause )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==WHERE) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:220:5: w= whereClause
                    {
                    pushFollow(FOLLOW_whereClause_in_subSelect1812);
                    w=whereClause();

                    state._fsp--;
                    if (state.failed) return sp;

                    if ( state.backtracking==0 ) { sp.setGraphPattern(w);      }

                    }
                    break;

            }


            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:221:4: (m= solutionModifier )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:221:5: m= solutionModifier
            {
            pushFollow(FOLLOW_solutionModifier_in_subSelect1828);
            m=solutionModifier();

            state._fsp--;
            if (state.failed) return sp;

            if ( state.backtracking==0 ) { sp.setSolutionModifier(m);  }

            }


            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:222:13: (d= inlineData )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==VALUES) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:222:14: d= inlineData
                    {
                    pushFollow(FOLLOW_inlineData_in_subSelect1854);
                    d=inlineData();

                    state._fsp--;
                    if (state.failed) return sp;

                    if ( state.backtracking==0 ) { ((PatternSet)sp.getPattern()).addPattern(d); }

                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return sp;


            }

        }

        	catch(RecognitionException re) {
        		throw new SPARQLsyntaxError(re);
        	}

        finally {
        	// do for sure before leaving
        }
        return sp;
    }
    // $ANTLR end "subSelect"



    // $ANTLR start "selectClause"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:226:1: selectClause returns [SelectClause sc] : ( ^( TYPE ( DISTINCT | REDUCED ) ) )? ^( PVARS ( (v= var | expVar[$sc] | fexp[$sc] )* | '*' ) ) ;
    public final SelectClause selectClause() throws RecognitionException {
        SelectClause sc = null;


        String v =null;


         sc = new SelectClause(); 
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:228:2: ( ( ^( TYPE ( DISTINCT | REDUCED ) ) )? ^( PVARS ( (v= var | expVar[$sc] | fexp[$sc] )* | '*' ) ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:229:3: ( ^( TYPE ( DISTINCT | REDUCED ) ) )? ^( PVARS ( (v= var | expVar[$sc] | fexp[$sc] )* | '*' ) )
            {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:229:3: ( ^( TYPE ( DISTINCT | REDUCED ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==TYPE) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:229:4: ^( TYPE ( DISTINCT | REDUCED ) )
                    {
                    match(input,TYPE,FOLLOW_TYPE_in_selectClause1900); if (state.failed) return sc;

                    match(input, Token.DOWN, null); if (state.failed) return sc;
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:229:11: ( DISTINCT | REDUCED )
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==DISTINCT) ) {
                        alt21=1;
                    }
                    else if ( (LA21_0==REDUCED) ) {
                        alt21=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return sc;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 0, input);

                        throw nvae;

                    }
                    switch (alt21) {
                        case 1 :
                            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:229:13: DISTINCT
                            {
                            match(input,DISTINCT,FOLLOW_DISTINCT_in_selectClause1904); if (state.failed) return sc;

                            if ( state.backtracking==0 ) { sc.setSelectModifier(SelectClause.ESelectModifier.DISTINCT); }

                            }
                            break;
                        case 2 :
                            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:230:7: REDUCED
                            {
                            match(input,REDUCED,FOLLOW_REDUCED_in_selectClause1916); if (state.failed) return sc;

                            if ( state.backtracking==0 ) { sc.setSelectModifier(SelectClause.ESelectModifier.REDUCED);  }

                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return sc;


                    }
                    break;

            }


            match(input,PVARS,FOLLOW_PVARS_in_selectClause1945); if (state.failed) return sc;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return sc;
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:234:11: ( (v= var | expVar[$sc] | fexp[$sc] )* | '*' )
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==UP||LA24_0==AS||LA24_0==EXP||LA24_0==VAR) ) {
                    alt24=1;
                }
                else if ( (LA24_0==270) ) {
                    alt24=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return sc;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 0, input);

                    throw nvae;

                }
                switch (alt24) {
                    case 1 :
                        // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:234:13: (v= var | expVar[$sc] | fexp[$sc] )*
                        {
                        // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:234:13: (v= var | expVar[$sc] | fexp[$sc] )*
                        loop23:
                        do {
                            int alt23=4;
                            switch ( input.LA(1) ) {
                            case VAR:
                                {
                                alt23=1;
                                }
                                break;
                            case AS:
                                {
                                alt23=2;
                                }
                                break;
                            case EXP:
                                {
                                alt23=3;
                                }
                                break;

                            }

                            switch (alt23) {
                        	case 1 :
                        	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:234:15: v= var
                        	    {
                        	    pushFollow(FOLLOW_var_in_selectClause1953);
                        	    v=var();

                        	    state._fsp--;
                        	    if (state.failed) return sc;

                        	    if ( state.backtracking==0 ) { sc.addProjectedVariable(new ProjectedVariable(v)); }

                        	    }
                        	    break;
                        	case 2 :
                        	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:235:15: expVar[$sc]
                        	    {
                        	    pushFollow(FOLLOW_expVar_in_selectClause1975);
                        	    expVar(sc);

                        	    state._fsp--;
                        	    if (state.failed) return sc;

                        	    }
                        	    break;
                        	case 3 :
                        	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:236:15: fexp[$sc]
                        	    {
                        	    pushFollow(FOLLOW_fexp_in_selectClause1998);
                        	    fexp(sc);

                        	    state._fsp--;
                        	    if (state.failed) return sc;

                        	    }
                        	    break;

                        	default :
                        	    break loop23;
                            }
                        } while (true);


                        }
                        break;
                    case 2 :
                        // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:238:13: '*'
                        {
                        match(input,270,FOLLOW_270_in_selectClause2038); if (state.failed) return sc;

                        }
                        break;

                }


                match(input, Token.UP, null); if (state.failed) return sc;
            }


            }

        }

        	catch(RecognitionException re) {
        		throw new SPARQLsyntaxError(re);
        	}

        finally {
        	// do for sure before leaving
        }
        return sc;
    }
    // $ANTLR end "selectClause"



    // $ANTLR start "expVar"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:243:1: expVar[SelectClause sc] : ^( AS v= var e= expression ) ;
    public final void expVar(SelectClause sc) throws RecognitionException {
        String v =null;

        Expression e =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:244:2: ( ^( AS v= var e= expression ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:244:4: ^( AS v= var e= expression )
            {
            match(input,AS,FOLLOW_AS_in_expVar2069); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_var_in_expVar2073);
            v=var();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_expression_in_expVar2077);
            e=expression();

            state._fsp--;
            if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==0 ) { sc.addProjectedVariable(new ProjectedVariable(v, e)); }

            }

        }

        	catch(RecognitionException re) {
        		throw new SPARQLsyntaxError(re);
        	}

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "expVar"



    // $ANTLR start "fexp"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:247:1: fexp[SelectClause sc] : ^( EXP e= expression ) ;
    public final void fexp(SelectClause sc) throws RecognitionException {
        Expression e =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:248:2: ( ^( EXP e= expression ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:248:4: ^( EXP e= expression )
            {
            match(input,EXP,FOLLOW_EXP_in_fexp2095); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_expression_in_fexp2099);
            e=expression();

            state._fsp--;
            if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==0 ) { sc.addProjectedVariable(new ProjectedVariable(e)); }

            }

        }

        	catch(RecognitionException re) {
        		throw new SPARQLsyntaxError(re);
        	}

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "fexp"



    // $ANTLR start "constructQuery"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:251:1: constructQuery returns [ConstructQuery cq] : ^( CONSTRUCT ( ( constructTemplate[$cq] (d= dataset )* (w= whereClause ) (m= solutionModifier ) ) | ( (d= dataset )* ( ^( WHERE triplesTemplate[$cq,p] ) )? (m= solutionModifier ) ) ) ) ;
    public final ConstructQuery constructQuery() throws RecognitionException {
        ConstructQuery cq = null;


        List<DatasetClause> d =null;

        Pattern w =null;

        SolutionModifiers m =null;


         
                PatternSet p = null;
        		cq = new ConstructQuery();
        	
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:256:2: ( ^( CONSTRUCT ( ( constructTemplate[$cq] (d= dataset )* (w= whereClause ) (m= solutionModifier ) ) | ( (d= dataset )* ( ^( WHERE triplesTemplate[$cq,p] ) )? (m= solutionModifier ) ) ) ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:256:6: ^( CONSTRUCT ( ( constructTemplate[$cq] (d= dataset )* (w= whereClause ) (m= solutionModifier ) ) | ( (d= dataset )* ( ^( WHERE triplesTemplate[$cq,p] ) )? (m= solutionModifier ) ) ) )
            {
            match(input,CONSTRUCT,FOLLOW_CONSTRUCT_in_constructQuery2130); if (state.failed) return cq;

            match(input, Token.DOWN, null); if (state.failed) return cq;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:256:20: ( ( constructTemplate[$cq] (d= dataset )* (w= whereClause ) (m= solutionModifier ) ) | ( (d= dataset )* ( ^( WHERE triplesTemplate[$cq,p] ) )? (m= solutionModifier ) ) )
            int alt28=2;
            alt28 = dfa28.predict(input);
            switch (alt28) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:256:22: ( constructTemplate[$cq] (d= dataset )* (w= whereClause ) (m= solutionModifier ) )
                    {
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:256:22: ( constructTemplate[$cq] (d= dataset )* (w= whereClause ) (m= solutionModifier ) )
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:256:24: constructTemplate[$cq] (d= dataset )* (w= whereClause ) (m= solutionModifier )
                    {
                    pushFollow(FOLLOW_constructTemplate_in_constructQuery2137);
                    constructTemplate(cq);

                    state._fsp--;
                    if (state.failed) return cq;

                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:257:8: (d= dataset )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==DATASET) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:257:9: d= dataset
                    	    {
                    	    pushFollow(FOLLOW_dataset_in_constructQuery2151);
                    	    d=dataset();

                    	    state._fsp--;
                    	    if (state.failed) return cq;

                    	    if ( state.backtracking==0 ) { cq.setDatasetClauses(d);    }

                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);


                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:258:8: (w= whereClause )
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:258:9: w= whereClause
                    {
                    pushFollow(FOLLOW_whereClause_in_constructQuery2174);
                    w=whereClause();

                    state._fsp--;
                    if (state.failed) return cq;

                    if ( state.backtracking==0 ) { cq.setPattern(w);           }

                    }


                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:259:8: (m= solutionModifier )
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:259:9: m= solutionModifier
                    {
                    pushFollow(FOLLOW_solutionModifier_in_constructQuery2193);
                    m=solutionModifier();

                    state._fsp--;
                    if (state.failed) return cq;

                    if ( state.backtracking==0 ) { cq.setSolutionModifier(m);  }

                    }


                    }


                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:262:7: ( (d= dataset )* ( ^( WHERE triplesTemplate[$cq,p] ) )? (m= solutionModifier ) )
                    {
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:262:7: ( (d= dataset )* ( ^( WHERE triplesTemplate[$cq,p] ) )? (m= solutionModifier ) )
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:262:9: (d= dataset )* ( ^( WHERE triplesTemplate[$cq,p] ) )? (m= solutionModifier )
                    {
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:262:9: (d= dataset )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==DATASET) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:262:10: d= dataset
                    	    {
                    	    pushFollow(FOLLOW_dataset_in_constructQuery2233);
                    	    d=dataset();

                    	    state._fsp--;
                    	    if (state.failed) return cq;

                    	    if ( state.backtracking==0 ) { cq.setDatasetClauses(d);    }

                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);


                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:263:8: ( ^( WHERE triplesTemplate[$cq,p] ) )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==WHERE) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:263:9: ^( WHERE triplesTemplate[$cq,p] )
                            {
                            match(input,WHERE,FOLLOW_WHERE_in_constructQuery2255); if (state.failed) return cq;

                            if ( state.backtracking==0 ) {      
                                                             p = new PatternSet();
                                                           }

                            match(input, Token.DOWN, null); if (state.failed) return cq;
                            pushFollow(FOLLOW_triplesTemplate_in_constructQuery2321);
                            triplesTemplate(cq, p);

                            state._fsp--;
                            if (state.failed) return cq;

                            if ( state.backtracking==0 ) {
                                                             
                                                             cq.setPattern(p);
                                                           }

                            match(input, Token.UP, null); if (state.failed) return cq;


                            }
                            break;

                    }


                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:273:8: (m= solutionModifier )
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:273:9: m= solutionModifier
                    {
                    pushFollow(FOLLOW_solutionModifier_in_constructQuery2401);
                    m=solutionModifier();

                    state._fsp--;
                    if (state.failed) return cq;

                    if ( state.backtracking==0 ) { cq.setSolutionModifier(m);  }

                    }


                    }


                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return cq;


            }

        }

        	catch(RecognitionException re) {
        		throw new SPARQLsyntaxError(re);
        	}

        finally {
        	// do for sure before leaving
        }
        return cq;
    }
    // $ANTLR end "constructQuery"



    // $ANTLR start "describeQuery"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:279:1: describeQuery returns [DescribeQuery dq] : ^( DESCRIBE ( ( (v= varOrIRIref2 )+ | '*' ) (d= datasetClause )* (w= whereClause )? (s= solutionModifier ) ) ) ;
    public final DescribeQuery describeQuery() throws RecognitionException {
        DescribeQuery dq = null;


        BinaryUnion<Variable, IRI> v =null;

        DatasetClause d =null;

        Pattern w =null;

        SolutionModifiers s =null;


         
        		dq = new DescribeQuery();
        	
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:283:2: ( ^( DESCRIBE ( ( (v= varOrIRIref2 )+ | '*' ) (d= datasetClause )* (w= whereClause )? (s= solutionModifier ) ) ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:283:6: ^( DESCRIBE ( ( (v= varOrIRIref2 )+ | '*' ) (d= datasetClause )* (w= whereClause )? (s= solutionModifier ) ) )
            {
            match(input,DESCRIBE,FOLLOW_DESCRIBE_in_describeQuery2459); if (state.failed) return dq;

            match(input, Token.DOWN, null); if (state.failed) return dq;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:283:18: ( ( (v= varOrIRIref2 )+ | '*' ) (d= datasetClause )* (w= whereClause )? (s= solutionModifier ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:283:20: ( (v= varOrIRIref2 )+ | '*' ) (d= datasetClause )* (w= whereClause )? (s= solutionModifier )
            {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:283:20: ( (v= varOrIRIref2 )+ | '*' )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==IRI||(LA30_0 >= PREFIXED_NAME && LA30_0 <= PREFIXED_NS)||LA30_0==VAR) ) {
                alt30=1;
            }
            else if ( (LA30_0==270) ) {
                alt30=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return dq;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;

            }
            switch (alt30) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:283:22: (v= varOrIRIref2 )+
                    {
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:283:22: (v= varOrIRIref2 )+
                    int cnt29=0;
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==IRI||(LA29_0 >= PREFIXED_NAME && LA29_0 <= PREFIXED_NS)||LA29_0==VAR) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:283:23: v= varOrIRIref2
                    	    {
                    	    pushFollow(FOLLOW_varOrIRIref2_in_describeQuery2468);
                    	    v=varOrIRIref2();

                    	    state._fsp--;
                    	    if (state.failed) return dq;

                    	    if ( state.backtracking==0 ) {dq.getResources().add(v);}

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt29 >= 1 ) break loop29;
                    	    if (state.backtracking>0) {state.failed=true; return dq;}
                                EarlyExitException eee =
                                    new EarlyExitException(29, input);
                                throw eee;
                        }
                        cnt29++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:283:74: '*'
                    {
                    match(input,270,FOLLOW_270_in_describeQuery2479); if (state.failed) return dq;

                    }
                    break;

            }


            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:284:8: (d= datasetClause )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==FROM) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:284:10: d= datasetClause
            	    {
            	    pushFollow(FOLLOW_datasetClause_in_describeQuery2494);
            	    d=datasetClause();

            	    state._fsp--;
            	    if (state.failed) return dq;

            	    if ( state.backtracking==0 ) {dq.getDatasetClauses().add(d);}

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);


            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:285:8: (w= whereClause )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==WHERE) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:285:10: w= whereClause
                    {
                    pushFollow(FOLLOW_whereClause_in_describeQuery2515);
                    w=whereClause();

                    state._fsp--;
                    if (state.failed) return dq;

                    if ( state.backtracking==0 ) {dq.setPattern(w);	}

                    }
                    break;

            }


            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:286:8: (s= solutionModifier )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:286:10: s= solutionModifier
            {
            pushFollow(FOLLOW_solutionModifier_in_describeQuery2535);
            s=solutionModifier();

            state._fsp--;
            if (state.failed) return dq;

            if ( state.backtracking==0 ) {dq.setSolutionModifier(s); }

            }


            }


            match(input, Token.UP, null); if (state.failed) return dq;


            }

        }

        	catch(RecognitionException re) {
        		throw new SPARQLsyntaxError(re);
        	}

        finally {
        	// do for sure before leaving
        }
        return dq;
    }
    // $ANTLR end "describeQuery"



    // $ANTLR start "askQuery"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:291:1: askQuery returns [AskQuery aq] : ^( ASK ( (d= datasetClause )* (w= whereClause ) ) ) ;
    public final AskQuery askQuery() throws RecognitionException {
        AskQuery aq = null;


        DatasetClause d =null;

        Pattern w =null;



        		ArrayList<DatasetClause> dsl = new ArrayList<DatasetClause>();
        	
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:295:2: ( ^( ASK ( (d= datasetClause )* (w= whereClause ) ) ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:295:6: ^( ASK ( (d= datasetClause )* (w= whereClause ) ) )
            {
            match(input,ASK,FOLLOW_ASK_in_askQuery2576); if (state.failed) return aq;

            match(input, Token.DOWN, null); if (state.failed) return aq;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:295:13: ( (d= datasetClause )* (w= whereClause ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:295:15: (d= datasetClause )* (w= whereClause )
            {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:295:15: (d= datasetClause )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==FROM) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:295:16: d= datasetClause
            	    {
            	    pushFollow(FOLLOW_datasetClause_in_askQuery2584);
            	    d=datasetClause();

            	    state._fsp--;
            	    if (state.failed) return aq;

            	    if ( state.backtracking==0 ) { dsl.add(d); }

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);


            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:296:6: (w= whereClause )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:296:7: w= whereClause
            {
            pushFollow(FOLLOW_whereClause_in_askQuery2600);
            w=whereClause();

            state._fsp--;
            if (state.failed) return aq;

            }


            if ( state.backtracking==0 ) { aq = new AskQuery(dsl, w); }

            }


            match(input, Token.UP, null); if (state.failed) return aq;


            }

        }

        	catch(RecognitionException re) {
        		throw new SPARQLsyntaxError(re);
        	}

        finally {
        	// do for sure before leaving
        }
        return aq;
    }
    // $ANTLR end "askQuery"



    // $ANTLR start "datasetClause"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:301:1: datasetClause returns [DatasetClause dc] : ^( FROM (d= defaultGraphClause |n= namedGraphClause ) ) ;
    public final DatasetClause datasetClause() throws RecognitionException {
        DatasetClause dc = null;


        DatasetClause d =null;

        DatasetClause n =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:302:2: ( ^( FROM (d= defaultGraphClause |n= namedGraphClause ) ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:302:4: ^( FROM (d= defaultGraphClause |n= namedGraphClause ) )
            {
            match(input,FROM,FOLLOW_FROM_in_datasetClause2635); if (state.failed) return dc;

            match(input, Token.DOWN, null); if (state.failed) return dc;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:302:12: (d= defaultGraphClause |n= namedGraphClause )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==IRI||(LA34_0 >= PREFIXED_NAME && LA34_0 <= PREFIXED_NS)) ) {
                alt34=1;
            }
            else if ( (LA34_0==NAMED) ) {
                alt34=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return dc;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;

            }
            switch (alt34) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:302:14: d= defaultGraphClause
                    {
                    pushFollow(FOLLOW_defaultGraphClause_in_datasetClause2642);
                    d=defaultGraphClause();

                    state._fsp--;
                    if (state.failed) return dc;

                    if ( state.backtracking==0 ) { dc = d; }

                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:303:7: n= namedGraphClause
                    {
                    pushFollow(FOLLOW_namedGraphClause_in_datasetClause2656);
                    n=namedGraphClause();

                    state._fsp--;
                    if (state.failed) return dc;

                    if ( state.backtracking==0 ) { dc = n; }

                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return dc;


            }

        }

        	catch(RecognitionException re) {
        		throw new SPARQLsyntaxError(re);
        	}

        finally {
        	// do for sure before leaving
        }
        return dc;
    }
    // $ANTLR end "datasetClause"



    // $ANTLR start "defaultGraphClause"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:308:1: defaultGraphClause returns [DatasetClause dc] : d= sourceSelector ;
    public final DatasetClause defaultGraphClause() throws RecognitionException {
        DatasetClause dc = null;


        IRI d =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:309:2: (d= sourceSelector )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:309:6: d= sourceSelector
            {
            pushFollow(FOLLOW_sourceSelector_in_defaultGraphClause2689);
            d=sourceSelector();

            state._fsp--;
            if (state.failed) return dc;

            if ( state.backtracking==0 ) { dc = new DatasetClause(d); }

            }

        }

        	catch(RecognitionException re) {
        		throw new SPARQLsyntaxError(re);
        	}

        finally {
        	// do for sure before leaving
        }
        return dc;
    }
    // $ANTLR end "defaultGraphClause"



    // $ANTLR start "namedGraphClause"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:312:1: namedGraphClause returns [DatasetClause dc] : ^( NAMED d= sourceSelector ) ;
    public final DatasetClause namedGraphClause() throws RecognitionException {
        DatasetClause dc = null;


        IRI d =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:313:2: ( ^( NAMED d= sourceSelector ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:313:6: ^( NAMED d= sourceSelector )
            {
            match(input,NAMED,FOLLOW_NAMED_in_namedGraphClause2711); if (state.failed) return dc;

            match(input, Token.DOWN, null); if (state.failed) return dc;
            pushFollow(FOLLOW_sourceSelector_in_namedGraphClause2715);
            d=sourceSelector();

            state._fsp--;
            if (state.failed) return dc;

            match(input, Token.UP, null); if (state.failed) return dc;


            if ( state.backtracking==0 ) { dc = new DatasetClause(d, true); }

            }

        }

        	catch(RecognitionException re) {
        		throw new SPARQLsyntaxError(re);
        	}

        finally {
        	// do for sure before leaving
        }
        return dc;
    }
    // $ANTLR end "namedGraphClause"



    // $ANTLR start "sourceSelector"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:316:1: sourceSelector returns [IRI r] : i= iRIref ;
    public final IRI sourceSelector() throws RecognitionException {
        IRI r = null;


        IRI i =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:317:2: (i= iRIref )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:317:7: i= iRIref
            {
            pushFollow(FOLLOW_iRIref_in_sourceSelector2741);
            i=iRIref();

            state._fsp--;
            if (state.failed) return r;

            if ( state.backtracking==0 ) { r = i; }

            }

        }

        	catch(RecognitionException re) {
        		throw new SPARQLsyntaxError(re);
        	}

        finally {
        	// do for sure before leaving
        }
        return r;
    }
    // $ANTLR end "sourceSelector"



    // $ANTLR start "whereClause"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:320:1: whereClause returns [Pattern p] : ^( WHERE (g= groupGraphPattern[true] )? ) ;
    public final Pattern whereClause() throws RecognitionException {
        Pattern p = null;


        Pattern g =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:321:2: ( ^( WHERE (g= groupGraphPattern[true] )? ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:322:3: ^( WHERE (g= groupGraphPattern[true] )? )
            {
            match(input,WHERE,FOLLOW_WHERE_in_whereClause2764); if (state.failed) return p;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return p;
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:322:12: (g= groupGraphPattern[true] )?
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==GROUP_GRAPH_PATTERN||LA35_0==SUB_SELECT) ) {
                    alt35=1;
                }
                switch (alt35) {
                    case 1 :
                        // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:322:12: g= groupGraphPattern[true]
                        {
                        pushFollow(FOLLOW_groupGraphPattern_in_whereClause2768);
                        g=groupGraphPattern(true);

                        state._fsp--;
                        if (state.failed) return p;

                        }
                        break;

                }


                match(input, Token.UP, null); if (state.failed) return p;
            }


            if ( state.backtracking==0 ) {p = g;}

            }

        }

        	catch(RecognitionException re) {
        		throw new SPARQLsyntaxError(re);
        	}

        finally {
        	// do for sure before leaving
        }
        return p;
    }
    // $ANTLR end "whereClause"



    // $ANTLR start "solutionModifier"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:325:1: solutionModifier returns [SolutionModifiers m] : ^( MODIFIERS (g= groupClause )? (h= havingClause )? (o= orderClause )? (l= limitOffsetClauses )? ) ;
    public final SolutionModifiers solutionModifier() throws RecognitionException {
        SolutionModifiers m = null;


        GroupCondition g =null;

        HavingCondition h =null;

        List<OrderCondition> o =null;

        LimitOffsetClauses l =null;



        		m = new SolutionModifiers();
        	
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:329:2: ( ^( MODIFIERS (g= groupClause )? (h= havingClause )? (o= orderClause )? (l= limitOffsetClauses )? ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:329:6: ^( MODIFIERS (g= groupClause )? (h= havingClause )? (o= orderClause )? (l= limitOffsetClauses )? )
            {
            match(input,MODIFIERS,FOLLOW_MODIFIERS_in_solutionModifier2799); if (state.failed) return m;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return m;
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:330:4: (g= groupClause )?
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==GROUP_BY) ) {
                    alt36=1;
                }
                switch (alt36) {
                    case 1 :
                        // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:330:6: g= groupClause
                        {
                        pushFollow(FOLLOW_groupClause_in_solutionModifier2808);
                        g=groupClause();

                        state._fsp--;
                        if (state.failed) return m;

                        if ( state.backtracking==0 ) {m.setGroupClause(g); }

                        }
                        break;

                }


                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:331:4: (h= havingClause )?
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==HAVING) ) {
                    alt37=1;
                }
                switch (alt37) {
                    case 1 :
                        // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:331:6: h= havingClause
                        {
                        pushFollow(FOLLOW_havingClause_in_solutionModifier2825);
                        h=havingClause();

                        state._fsp--;
                        if (state.failed) return m;

                        if ( state.backtracking==0 ) {m.setHavingClause(h);}

                        }
                        break;

                }


                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:332:4: (o= orderClause )?
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==ORDER_BY) ) {
                    alt38=1;
                }
                switch (alt38) {
                    case 1 :
                        // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:332:6: o= orderClause
                        {
                        pushFollow(FOLLOW_orderClause_in_solutionModifier2842);
                        o=orderClause();

                        state._fsp--;
                        if (state.failed) return m;

                        if ( state.backtracking==0 ) {m.setOrderClause(o); }

                        }
                        break;

                }


                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:333:4: (l= limitOffsetClauses )?
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==LIMIT||LA39_0==OFFSET) ) {
                    alt39=1;
                }
                switch (alt39) {
                    case 1 :
                        // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:333:6: l= limitOffsetClauses
                        {
                        pushFollow(FOLLOW_limitOffsetClauses_in_solutionModifier2859);
                        l=limitOffsetClauses();

                        state._fsp--;
                        if (state.failed) return m;

                        if ( state.backtracking==0 ) {m.setLimitOffset(l); }

                        }
                        break;

                }


                match(input, Token.UP, null); if (state.failed) return m;
            }


            }

        }

        	catch(RecognitionException re) {
        		throw new SPARQLsyntaxError(re);
        	}

        finally {
        	// do for sure before leaving
        }
        return m;
    }
    // $ANTLR end "solutionModifier"



    // $ANTLR start "groupClause"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:336:1: groupClause returns [GroupCondition gc] : ^( GROUP_BY c= groupCondition ) ;
    public final GroupCondition groupClause() throws RecognitionException {
        GroupCondition gc = null;


        GroupCondition c =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:337:2: ( ^( GROUP_BY c= groupCondition ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:337:6: ^( GROUP_BY c= groupCondition )
            {
            match(input,GROUP_BY,FOLLOW_GROUP_BY_in_groupClause2885); if (state.failed) return gc;

            match(input, Token.DOWN, null); if (state.failed) return gc;
            pushFollow(FOLLOW_groupCondition_in_groupClause2889);
            c=groupCondition();

            state._fsp--;
            if (state.failed) return gc;

            match(input, Token.UP, null); if (state.failed) return gc;


            if ( state.backtracking==0 ) { gc = c; }

            }

        }

        	catch(RecognitionException re) {
        		throw new SPARQLsyntaxError(re);
        	}

        finally {
        	// do for sure before leaving
        }
        return gc;
    }
    // $ANTLR end "groupClause"



    // $ANTLR start "groupCondition"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:340:1: groupCondition returns [GroupCondition gc] : (b= builtInCall |f= functionCall | ^( CONDITION e2= expression (v= var )? ) |v2= var )+ ;
    public final GroupCondition groupCondition() throws RecognitionException {
        GroupCondition gc = null;


        Expression b =null;

        FunctionCall f =null;

        Expression e2 =null;

        String v =null;

        String v2 =null;



        		gc = new GroupCondition();
        	
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:344:2: ( (b= builtInCall |f= functionCall | ^( CONDITION e2= expression (v= var )? ) |v2= var )+ )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:345:2: (b= builtInCall |f= functionCall | ^( CONDITION e2= expression (v= var )? ) |v2= var )+
            {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:345:2: (b= builtInCall |f= functionCall | ^( CONDITION e2= expression (v= var )? ) |v2= var )+
            int cnt41=0;
            loop41:
            do {
                int alt41=5;
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
                    alt41=1;
                    }
                    break;
                case FUNCTION:
                    {
                    alt41=2;
                    }
                    break;
                case CONDITION:
                    {
                    alt41=3;
                    }
                    break;
                case VAR:
                    {
                    alt41=4;
                    }
                    break;

                }

                switch (alt41) {
            	case 1 :
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:345:4: b= builtInCall
            	    {
            	    pushFollow(FOLLOW_builtInCall_in_groupCondition2922);
            	    b=builtInCall();

            	    state._fsp--;
            	    if (state.failed) return gc;

            	    if ( state.backtracking==0 ) { gc.addCondition(b);                               }

            	    }
            	    break;
            	case 2 :
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:346:4: f= functionCall
            	    {
            	    pushFollow(FOLLOW_functionCall_in_groupCondition2941);
            	    f=functionCall();

            	    state._fsp--;
            	    if (state.failed) return gc;

            	    if ( state.backtracking==0 ) { gc.addCondition(new FunctionCallExpression(f));   }

            	    }
            	    break;
            	case 3 :
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:347:4: ^( CONDITION e2= expression (v= var )? )
            	    {
            	    match(input,CONDITION,FOLLOW_CONDITION_in_groupCondition2959); if (state.failed) return gc;

            	    match(input, Token.DOWN, null); if (state.failed) return gc;
            	    pushFollow(FOLLOW_expression_in_groupCondition2963);
            	    e2=expression();

            	    state._fsp--;
            	    if (state.failed) return gc;

            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:347:30: (v= var )?
            	    int alt40=2;
            	    int LA40_0 = input.LA(1);

            	    if ( (LA40_0==VAR) ) {
            	        alt40=1;
            	    }
            	    switch (alt40) {
            	        case 1 :
            	            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:347:31: v= var
            	            {
            	            pushFollow(FOLLOW_var_in_groupCondition2968);
            	            v=var();

            	            state._fsp--;
            	            if (state.failed) return gc;

            	            }
            	            break;

            	    }


            	    match(input, Token.UP, null); if (state.failed) return gc;


            	    if ( state.backtracking==0 ) { gc.addCondition(new VariableExpression(e2, v));   }

            	    }
            	    break;
            	case 4 :
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:348:4: v2= var
            	    {
            	    pushFollow(FOLLOW_var_in_groupCondition2985);
            	    v2=var();

            	    state._fsp--;
            	    if (state.failed) return gc;

            	    if ( state.backtracking==0 ) { gc.addCondition(new VariableExpression(v2));      }

            	    }
            	    break;

            	default :
            	    if ( cnt41 >= 1 ) break loop41;
            	    if (state.backtracking>0) {state.failed=true; return gc;}
                        EarlyExitException eee =
                            new EarlyExitException(41, input);
                        throw eee;
                }
                cnt41++;
            } while (true);


            }

        }

        	catch(RecognitionException re) {
        		throw new SPARQLsyntaxError(re);
        	}

        finally {
        	// do for sure before leaving
        }
        return gc;
    }
    // $ANTLR end "groupCondition"



    // $ANTLR start "havingClause"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:352:1: havingClause returns [HavingCondition h] : ^( HAVING (c= havingCondition )+ ) ;
    public final HavingCondition havingClause() throws RecognitionException {
        HavingCondition h = null;


        Expression c =null;



        		h = new HavingCondition();
        	
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:356:2: ( ^( HAVING (c= havingCondition )+ ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:356:6: ^( HAVING (c= havingCondition )+ )
            {
            match(input,HAVING,FOLLOW_HAVING_in_havingClause3059); if (state.failed) return h;

            match(input, Token.DOWN, null); if (state.failed) return h;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:356:15: (c= havingCondition )+
            int cnt42=0;
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==ABS||LA42_0==BNODE||LA42_0==BOUND||LA42_0==CEIL||LA42_0==COALESCE||LA42_0==CONCAT||LA42_0==CONTAINS||(LA42_0 >= DATATYPE && LA42_0 <= DAY)||LA42_0==ENCODE_FOR_URI||LA42_0==EXISTS||LA42_0==EXPRESSION||LA42_0==FLOOR||LA42_0==FUNCTION||LA42_0==HOURS||LA42_0==IF||LA42_0==IRI||(LA42_0 >= ISBLANK && LA42_0 <= ISURI)||(LA42_0 >= LANG && LA42_0 <= LANGMATCHES)||LA42_0==LCASE||LA42_0==MD5||LA42_0==MINUTES||LA42_0==MONTH||LA42_0==NOT_EXISTS||LA42_0==NOW||LA42_0==RAND||(LA42_0 >= REGEX && LA42_0 <= REPLACE)||LA42_0==ROUND||LA42_0==SAMETERM||LA42_0==SECONDS||LA42_0==SHA1||(LA42_0 >= SHA256 && LA42_0 <= SHA512)||(LA42_0 >= STR && LA42_0 <= STRENDS)||(LA42_0 >= STRLANG && LA42_0 <= STRUUID)||LA42_0==SUBSTR||LA42_0==TIMEZONE||LA42_0==TZ||LA42_0==UCASE||LA42_0==URI||LA42_0==UUID||LA42_0==YEAR) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:356:16: c= havingCondition
            	    {
            	    pushFollow(FOLLOW_havingCondition_in_havingClause3064);
            	    c=havingCondition();

            	    state._fsp--;
            	    if (state.failed) return h;

            	    if ( state.backtracking==0 ) {h.addConstraint(c); }

            	    }
            	    break;

            	default :
            	    if ( cnt42 >= 1 ) break loop42;
            	    if (state.backtracking>0) {state.failed=true; return h;}
                        EarlyExitException eee =
                            new EarlyExitException(42, input);
                        throw eee;
                }
                cnt42++;
            } while (true);


            match(input, Token.UP, null); if (state.failed) return h;


            }

        }

        	catch(RecognitionException re) {
        		throw new SPARQLsyntaxError(re);
        	}

        finally {
        	// do for sure before leaving
        }
        return h;
    }
    // $ANTLR end "havingClause"



    // $ANTLR start "havingCondition"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:359:1: havingCondition returns [Expression e] : c= constraint ;
    public final Expression havingCondition() throws RecognitionException {
        Expression e = null;


        Expression c =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:360:2: (c= constraint )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:360:6: c= constraint
            {
            pushFollow(FOLLOW_constraint_in_havingCondition3092);
            c=constraint();

            state._fsp--;
            if (state.failed) return e;

            if ( state.backtracking==0 ) {e = c;}

            }

        }

        	catch(RecognitionException re) {
        		throw new SPARQLsyntaxError(re);
        	}

        finally {
        	// do for sure before leaving
        }
        return e;
    }
    // $ANTLR end "havingCondition"



    // $ANTLR start "orderClause"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:363:1: orderClause returns [List<OrderCondition> loc] : ^( ORDER_BY (oc= orderCondition )+ ) ;
    public final List<OrderCondition> orderClause() throws RecognitionException {
        List<OrderCondition> loc = null;


        OrderCondition oc =null;


         
        		loc = new ArrayList<OrderCondition>(); 
        	
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:367:2: ( ^( ORDER_BY (oc= orderCondition )+ ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:367:6: ^( ORDER_BY (oc= orderCondition )+ )
            {
            match(input,ORDER_BY,FOLLOW_ORDER_BY_in_orderClause3121); if (state.failed) return loc;

            match(input, Token.DOWN, null); if (state.failed) return loc;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:367:18: (oc= orderCondition )+
            int cnt43=0;
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==ABS||LA43_0==ASC||LA43_0==BNODE||LA43_0==BOUND||LA43_0==CEIL||LA43_0==COALESCE||LA43_0==CONCAT||LA43_0==CONTAINS||(LA43_0 >= DATATYPE && LA43_0 <= DAY)||LA43_0==DESC||LA43_0==ENCODE_FOR_URI||LA43_0==EXISTS||LA43_0==EXPRESSION||LA43_0==FLOOR||LA43_0==FUNCTION||LA43_0==HOURS||LA43_0==IF||LA43_0==IRI||(LA43_0 >= ISBLANK && LA43_0 <= ISURI)||(LA43_0 >= LANG && LA43_0 <= LANGMATCHES)||LA43_0==LCASE||LA43_0==MD5||LA43_0==MINUTES||LA43_0==MONTH||LA43_0==NOT_EXISTS||LA43_0==NOW||LA43_0==RAND||(LA43_0 >= REGEX && LA43_0 <= REPLACE)||LA43_0==ROUND||LA43_0==SAMETERM||LA43_0==SECONDS||LA43_0==SHA1||(LA43_0 >= SHA256 && LA43_0 <= SHA512)||(LA43_0 >= STR && LA43_0 <= STRENDS)||(LA43_0 >= STRLANG && LA43_0 <= STRUUID)||LA43_0==SUBSTR||LA43_0==TIMEZONE||LA43_0==TZ||LA43_0==UCASE||LA43_0==URI||LA43_0==UUID||LA43_0==VAR||LA43_0==YEAR) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:367:20: oc= orderCondition
            	    {
            	    pushFollow(FOLLOW_orderCondition_in_orderClause3128);
            	    oc=orderCondition();

            	    state._fsp--;
            	    if (state.failed) return loc;

            	    if ( state.backtracking==0 ) { loc.add(oc); }

            	    }
            	    break;

            	default :
            	    if ( cnt43 >= 1 ) break loop43;
            	    if (state.backtracking>0) {state.failed=true; return loc;}
                        EarlyExitException eee =
                            new EarlyExitException(43, input);
                        throw eee;
                }
                cnt43++;
            } while (true);


            match(input, Token.UP, null); if (state.failed) return loc;


            }

        }

        	catch(RecognitionException re) {
        		throw new SPARQLsyntaxError(re);
        	}

        finally {
        	// do for sure before leaving
        }
        return loc;
    }
    // $ANTLR end "orderClause"



    // $ANTLR start "orderCondition"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:370:1: orderCondition returns [OrderCondition oc] : ( ( ^( ASC e1= brackettedExpression ) ) | ( ^( DESC e2= brackettedExpression ) ) | (c= constraint |v= var ) );
    public final OrderCondition orderCondition() throws RecognitionException {
        OrderCondition oc = null;


        Expression e1 =null;

        Expression e2 =null;

        Expression c =null;

        String v =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:371:2: ( ( ^( ASC e1= brackettedExpression ) ) | ( ^( DESC e2= brackettedExpression ) ) | (c= constraint |v= var ) )
            int alt45=3;
            switch ( input.LA(1) ) {
            case ASC:
                {
                alt45=1;
                }
                break;
            case DESC:
                {
                alt45=2;
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
                alt45=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return oc;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;

            }

            switch (alt45) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:371:5: ( ^( ASC e1= brackettedExpression ) )
                    {
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:371:5: ( ^( ASC e1= brackettedExpression ) )
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:371:6: ^( ASC e1= brackettedExpression )
                    {
                    match(input,ASC,FOLLOW_ASC_in_orderCondition3155); if (state.failed) return oc;

                    match(input, Token.DOWN, null); if (state.failed) return oc;
                    pushFollow(FOLLOW_brackettedExpression_in_orderCondition3159);
                    e1=brackettedExpression();

                    state._fsp--;
                    if (state.failed) return oc;

                    match(input, Token.UP, null); if (state.failed) return oc;


                    if ( state.backtracking==0 ) { oc = new OrderCondition(e1, OrderCondition.EOrderType.ASC); }

                    }


                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:372:4: ( ^( DESC e2= brackettedExpression ) )
                    {
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:372:4: ( ^( DESC e2= brackettedExpression ) )
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:372:5: ^( DESC e2= brackettedExpression )
                    {
                    match(input,DESC,FOLLOW_DESC_in_orderCondition3171); if (state.failed) return oc;

                    match(input, Token.DOWN, null); if (state.failed) return oc;
                    pushFollow(FOLLOW_brackettedExpression_in_orderCondition3175);
                    e2=brackettedExpression();

                    state._fsp--;
                    if (state.failed) return oc;

                    match(input, Token.UP, null); if (state.failed) return oc;


                    if ( state.backtracking==0 ) { oc = new OrderCondition(e2, OrderCondition.EOrderType.DESC);}

                    }


                    }
                    break;
                case 3 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:373:5: (c= constraint |v= var )
                    {
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:373:5: (c= constraint |v= var )
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==ABS||LA44_0==BNODE||LA44_0==BOUND||LA44_0==CEIL||LA44_0==COALESCE||LA44_0==CONCAT||LA44_0==CONTAINS||(LA44_0 >= DATATYPE && LA44_0 <= DAY)||LA44_0==ENCODE_FOR_URI||LA44_0==EXISTS||LA44_0==EXPRESSION||LA44_0==FLOOR||LA44_0==FUNCTION||LA44_0==HOURS||LA44_0==IF||LA44_0==IRI||(LA44_0 >= ISBLANK && LA44_0 <= ISURI)||(LA44_0 >= LANG && LA44_0 <= LANGMATCHES)||LA44_0==LCASE||LA44_0==MD5||LA44_0==MINUTES||LA44_0==MONTH||LA44_0==NOT_EXISTS||LA44_0==NOW||LA44_0==RAND||(LA44_0 >= REGEX && LA44_0 <= REPLACE)||LA44_0==ROUND||LA44_0==SAMETERM||LA44_0==SECONDS||LA44_0==SHA1||(LA44_0 >= SHA256 && LA44_0 <= SHA512)||(LA44_0 >= STR && LA44_0 <= STRENDS)||(LA44_0 >= STRLANG && LA44_0 <= STRUUID)||LA44_0==SUBSTR||LA44_0==TIMEZONE||LA44_0==TZ||LA44_0==UCASE||LA44_0==URI||LA44_0==UUID||LA44_0==YEAR) ) {
                        alt44=1;
                    }
                    else if ( (LA44_0==VAR) ) {
                        alt44=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return oc;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 44, 0, input);

                        throw nvae;

                    }
                    switch (alt44) {
                        case 1 :
                            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:373:7: c= constraint
                            {
                            pushFollow(FOLLOW_constraint_in_orderCondition3189);
                            c=constraint();

                            state._fsp--;
                            if (state.failed) return oc;

                            if ( state.backtracking==0 ) { oc = new OrderCondition(c); }

                            }
                            break;
                        case 2 :
                            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:374:5: v= var
                            {
                            pushFollow(FOLLOW_var_in_orderCondition3205);
                            v=var();

                            state._fsp--;
                            if (state.failed) return oc;

                            if ( state.backtracking==0 ) { oc = new OrderCondition(new VariableExpression(v)); }

                            }
                            break;

                    }


                    }
                    break;

            }
        }

        	catch(RecognitionException re) {
        		throw new SPARQLsyntaxError(re);
        	}

        finally {
        	// do for sure before leaving
        }
        return oc;
    }
    // $ANTLR end "orderCondition"



    // $ANTLR start "limitOffsetClauses"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:378:1: limitOffsetClauses returns [LimitOffsetClauses loc] : (lc1= limitClause (oc1= offsetClause )? |oc2= offsetClause (lc2= limitClause )? ) ;
    public final LimitOffsetClauses limitOffsetClauses() throws RecognitionException {
        LimitOffsetClauses loc = null;


        int lc1 =0;

        int oc1 =0;

        int oc2 =0;

        int lc2 =0;


         
        		int lc = -1, oc = -1; 
        	
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:382:2: ( (lc1= limitClause (oc1= offsetClause )? |oc2= offsetClause (lc2= limitClause )? ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:382:6: (lc1= limitClause (oc1= offsetClause )? |oc2= offsetClause (lc2= limitClause )? )
            {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:382:6: (lc1= limitClause (oc1= offsetClause )? |oc2= offsetClause (lc2= limitClause )? )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==LIMIT) ) {
                alt48=1;
            }
            else if ( (LA48_0==OFFSET) ) {
                alt48=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return loc;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;

            }
            switch (alt48) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:382:8: lc1= limitClause (oc1= offsetClause )?
                    {
                    pushFollow(FOLLOW_limitClause_in_limitOffsetClauses3245);
                    lc1=limitClause();

                    state._fsp--;
                    if (state.failed) return loc;

                    if ( state.backtracking==0 ) {lc = lc1;}

                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:382:37: (oc1= offsetClause )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==OFFSET) ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:382:38: oc1= offsetClause
                            {
                            pushFollow(FOLLOW_offsetClause_in_limitOffsetClauses3253);
                            oc1=offsetClause();

                            state._fsp--;
                            if (state.failed) return loc;

                            if ( state.backtracking==0 ) {oc = oc1;}

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:383:5: oc2= offsetClause (lc2= limitClause )?
                    {
                    pushFollow(FOLLOW_offsetClause_in_limitOffsetClauses3266);
                    oc2=offsetClause();

                    state._fsp--;
                    if (state.failed) return loc;

                    if ( state.backtracking==0 ) {oc = oc2;}

                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:383:34: (lc2= limitClause )?
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==LIMIT) ) {
                        alt47=1;
                    }
                    switch (alt47) {
                        case 1 :
                            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:383:35: lc2= limitClause
                            {
                            pushFollow(FOLLOW_limitClause_in_limitOffsetClauses3273);
                            lc2=limitClause();

                            state._fsp--;
                            if (state.failed) return loc;

                            if ( state.backtracking==0 ) {lc = lc2;}

                            }
                            break;

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) { loc = new LimitOffsetClauses(lc, oc); }

            }

        }

        	catch(RecognitionException re) {
        		throw new SPARQLsyntaxError(re);
        	}

        finally {
        	// do for sure before leaving
        }
        return loc;
    }
    // $ANTLR end "limitOffsetClauses"



    // $ANTLR start "limitClause"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:388:1: limitClause returns [int x] : ^( LIMIT i= INTEGER ) ;
    public final int limitClause() throws RecognitionException {
        int x = 0;


        XTree i=null;

        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:389:2: ( ^( LIMIT i= INTEGER ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:390:3: ^( LIMIT i= INTEGER )
            {
            match(input,LIMIT,FOLLOW_LIMIT_in_limitClause3311); if (state.failed) return x;

            match(input, Token.DOWN, null); if (state.failed) return x;
            i=(XTree)match(input,INTEGER,FOLLOW_INTEGER_in_limitClause3316); if (state.failed) return x;

            match(input, Token.UP, null); if (state.failed) return x;


            if ( state.backtracking==0 ) { x = Integer.parseInt((i!=null?i.getText():null)); }

            }

        }

        	catch(RecognitionException re) {
        		throw new SPARQLsyntaxError(re);
        	}

        finally {
        	// do for sure before leaving
        }
        return x;
    }
    // $ANTLR end "limitClause"



    // $ANTLR start "offsetClause"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:393:1: offsetClause returns [int x] : ^( OFFSET i= INTEGER ) ;
    public final int offsetClause() throws RecognitionException {
        int x = 0;


        XTree i=null;

        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:394:2: ( ^( OFFSET i= INTEGER ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:395:3: ^( OFFSET i= INTEGER )
            {
            match(input,OFFSET,FOLLOW_OFFSET_in_offsetClause3343); if (state.failed) return x;

            match(input, Token.DOWN, null); if (state.failed) return x;
            i=(XTree)match(input,INTEGER,FOLLOW_INTEGER_in_offsetClause3348); if (state.failed) return x;

            match(input, Token.UP, null); if (state.failed) return x;


            if ( state.backtracking==0 ) { x = Integer.parseInt((i!=null?i.getText():null)); }

            }

        }

        	catch(RecognitionException re) {
        		throw new SPARQLsyntaxError(re);
        	}

        finally {
        	// do for sure before leaving
        }
        return x;
    }
    // $ANTLR end "offsetClause"



    // $ANTLR start "bindingsClause"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:398:1: bindingsClause returns [Pattern v] : d= inlineData ;
    public final Pattern bindingsClause() throws RecognitionException {
        Pattern v = null;


        ValuesPattern d =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:399:2: (d= inlineData )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:399:6: d= inlineData
            {
            pushFollow(FOLLOW_inlineData_in_bindingsClause3372);
            d=inlineData();

            state._fsp--;
            if (state.failed) return v;

            if ( state.backtracking==0 ) {v = d; }

            }

        }

        	catch(RecognitionException re) {
        		throw new SPARQLsyntaxError(re);
        	}

        finally {
        	// do for sure before leaving
        }
        return v;
    }
    // $ANTLR end "bindingsClause"



    // $ANTLR start "bindingValue"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:402:1: bindingValue : ( iRIref | rDFLiteral | numericLiteral | booleanLiteral | UNDEF ) ;
    public final void bindingValue() throws RecognitionException {
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:403:2: ( ( iRIref | rDFLiteral | numericLiteral | booleanLiteral | UNDEF ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:403:6: ( iRIref | rDFLiteral | numericLiteral | booleanLiteral | UNDEF )
            {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:403:6: ( iRIref | rDFLiteral | numericLiteral | booleanLiteral | UNDEF )
            int alt49=5;
            switch ( input.LA(1) ) {
            case IRI:
            case PREFIXED_NAME:
            case PREFIXED_NS:
                {
                alt49=1;
                }
                break;
            case STRING:
                {
                alt49=2;
                }
                break;
            case BIG_DECIMAL:
            case BIG_INTEGER:
            case DOUBLE:
                {
                alt49=3;
                }
                break;
            case BOOLEAN:
                {
                alt49=4;
                }
                break;
            case UNDEF:
                {
                alt49=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;

            }

            switch (alt49) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:403:8: iRIref
                    {
                    pushFollow(FOLLOW_iRIref_in_bindingValue3393);
                    iRIref();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:403:17: rDFLiteral
                    {
                    pushFollow(FOLLOW_rDFLiteral_in_bindingValue3397);
                    rDFLiteral();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:403:30: numericLiteral
                    {
                    pushFollow(FOLLOW_numericLiteral_in_bindingValue3401);
                    numericLiteral();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:403:47: booleanLiteral
                    {
                    pushFollow(FOLLOW_booleanLiteral_in_bindingValue3405);
                    booleanLiteral();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:403:64: UNDEF
                    {
                    match(input,UNDEF,FOLLOW_UNDEF_in_bindingValue3409); if (state.failed) return ;

                    }
                    break;

            }


            }

        }

        	catch(RecognitionException re) {
        		throw new SPARQLsyntaxError(re);
        	}

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "bindingValue"



    // $ANTLR start "triplesTemplate"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:406:1: triplesTemplate[ConstructQuery cq, PatternSet p] : sp= triplesSameSubject[$cq] ( DOT ( triplesTemplate[$cq, $p] )? )? ;
    public final void triplesTemplate(ConstructQuery cq, PatternSet p) throws RecognitionException {
        SimplePattern sp =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:407:2: (sp= triplesSameSubject[$cq] ( DOT ( triplesTemplate[$cq, $p] )? )? )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:407:7: sp= triplesSameSubject[$cq] ( DOT ( triplesTemplate[$cq, $p] )? )?
            {
            pushFollow(FOLLOW_triplesSameSubject_in_triplesTemplate3429);
            sp=triplesSameSubject(cq);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) { p.addPattern(sp); }

            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:407:57: ( DOT ( triplesTemplate[$cq, $p] )? )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==DOT) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:407:59: DOT ( triplesTemplate[$cq, $p] )?
                    {
                    match(input,DOT,FOLLOW_DOT_in_triplesTemplate3436); if (state.failed) return ;

                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:407:63: ( triplesTemplate[$cq, $p] )?
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( ((LA50_0 >= TRIPLE && LA50_0 <= TRIPLE2)) ) {
                        alt50=1;
                    }
                    switch (alt50) {
                        case 1 :
                            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:407:63: triplesTemplate[$cq, $p]
                            {
                            pushFollow(FOLLOW_triplesTemplate_in_triplesTemplate3438);
                            triplesTemplate(cq, p);

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

        	catch(RecognitionException re) {
        		throw new SPARQLsyntaxError(re);
        	}

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "triplesTemplate"



    // $ANTLR start "groupGraphPattern"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:410:1: groupGraphPattern[boolean l] returns [Pattern r] : ( ^( GROUP_GRAPH_PATTERN ( groupGraphPatternSub[p] )? ) |s= subSelect );
    public final Pattern groupGraphPattern(boolean l) throws RecognitionException {
        Pattern r = null;


        SubSelectPattern s =null;



        		PatternSet p = new PatternSet();  p.setTopLevel(l);
        		r = p;
        	
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:415:2: ( ^( GROUP_GRAPH_PATTERN ( groupGraphPatternSub[p] )? ) |s= subSelect )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==GROUP_GRAPH_PATTERN) ) {
                alt53=1;
            }
            else if ( (LA53_0==SUB_SELECT) ) {
                alt53=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return r;}
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;

            }
            switch (alt53) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:415:6: ^( GROUP_GRAPH_PATTERN ( groupGraphPatternSub[p] )? )
                    {
                    match(input,GROUP_GRAPH_PATTERN,FOLLOW_GROUP_GRAPH_PATTERN_in_groupGraphPattern3468); if (state.failed) return r;

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return r;
                        // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:415:28: ( groupGraphPatternSub[p] )?
                        int alt52=2;
                        int LA52_0 = input.LA(1);

                        if ( (LA52_0==BIND||LA52_0==FILTER||LA52_0==GRAPH||LA52_0==GROUP_GRAPH_PATTERN||LA52_0==MINUS||LA52_0==OPTIONAL||LA52_0==SERVICE||LA52_0==SUB_SELECT||LA52_0==TRIPLES_BLOCK||LA52_0==UNION||LA52_0==VALUES) ) {
                            alt52=1;
                        }
                        switch (alt52) {
                            case 1 :
                                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:415:28: groupGraphPatternSub[p]
                                {
                                pushFollow(FOLLOW_groupGraphPatternSub_in_groupGraphPattern3470);
                                groupGraphPatternSub(p);

                                state._fsp--;
                                if (state.failed) return r;

                                }
                                break;

                        }


                        match(input, Token.UP, null); if (state.failed) return r;
                    }


                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:416:4: s= subSelect
                    {
                    pushFollow(FOLLOW_subSelect_in_groupGraphPattern3482);
                    s=subSelect();

                    state._fsp--;
                    if (state.failed) return r;

                    if ( state.backtracking==0 ) { r = s; }

                    }
                    break;

            }
        }

        	catch(RecognitionException re) {
        		throw new SPARQLsyntaxError(re);
        	}

        finally {
        	// do for sure before leaving
        }
        return r;
    }
    // $ANTLR end "groupGraphPattern"



    // $ANTLR start "groupGraphPatternSub"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:419:1: groupGraphPatternSub[PatternSet p] : (sp= triplesBlock[$p] |f= filter | graphPatternNewBGP[$p,blankNodes] )+ ;
    public final void groupGraphPatternSub(PatternSet p) throws RecognitionException {
        SimplePattern sp =null;

        Expression f =null;



              Set<BlankNodeVariable> blankNodes = HashSetFactory.make();  
            
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:423:2: ( (sp= triplesBlock[$p] |f= filter | graphPatternNewBGP[$p,blankNodes] )+ )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:423:4: (sp= triplesBlock[$p] |f= filter | graphPatternNewBGP[$p,blankNodes] )+
            {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:423:4: (sp= triplesBlock[$p] |f= filter | graphPatternNewBGP[$p,blankNodes] )+
            int cnt54=0;
            loop54:
            do {
                int alt54=4;
                switch ( input.LA(1) ) {
                case TRIPLES_BLOCK:
                    {
                    alt54=1;
                    }
                    break;
                case FILTER:
                    {
                    alt54=2;
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
                    alt54=3;
                    }
                    break;

                }

                switch (alt54) {
            	case 1 :
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:423:10: sp= triplesBlock[$p]
            	    {
            	    pushFollow(FOLLOW_triplesBlock_in_groupGraphPatternSub3514);
            	    sp=triplesBlock(p);

            	    state._fsp--;
            	    if (state.failed) return ;

            	    if ( state.backtracking==0 ) { 
            	                    blankNodes.addAll(sp.gatherBlankNodes());
            	                    p.addPattern(sp);
            	                  }

            	    }
            	    break;
            	case 2 :
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:428:12: f= filter
            	    {
            	    pushFollow(FOLLOW_filter_in_groupGraphPatternSub3546);
            	    f=filter();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    if ( state.backtracking==0 ) { 
            	                    if (f != null) { p.addFilter(f); }
            	                  }

            	    }
            	    break;
            	case 3 :
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:432:15: graphPatternNewBGP[$p,blankNodes]
            	    {
            	    pushFollow(FOLLOW_graphPatternNewBGP_in_groupGraphPatternSub3584);
            	    graphPatternNewBGP(p, blankNodes);

            	    state._fsp--;
            	    if (state.failed) return ;

            	    if ( state.backtracking==0 ) {
            	              checkBlankNodes(blankNodes);
            	              blankNodes.clear();
            	            }

            	    }
            	    break;

            	default :
            	    if ( cnt54 >= 1 ) break loop54;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(54, input);
                        throw eee;
                }
                cnt54++;
            } while (true);


            if ( state.backtracking==0 ) {
                      checkBlankNodes(blankNodes);
                    }

            }

        }

        	catch(RecognitionException re) {
        		throw new SPARQLsyntaxError(re);
        	}

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "groupGraphPatternSub"



    // $ANTLR start "triplesBlock"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:444:1: triplesBlock[PatternSet p] returns [SimplePattern sp] : ^( TRIPLES_BLOCK (s= triples |s2= triples2 )+ ) ;
    public final SimplePattern triplesBlock(PatternSet p) throws RecognitionException {
        SimplePattern sp = null;


        QueryTriple s =null;

        QueryTriple2 s2 =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:445:5: ( ^( TRIPLES_BLOCK (s= triples |s2= triples2 )+ ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:445:9: ^( TRIPLES_BLOCK (s= triples |s2= triples2 )+ )
            {
            match(input,TRIPLES_BLOCK,FOLLOW_TRIPLES_BLOCK_in_triplesBlock3643); if (state.failed) return sp;

            if ( state.backtracking==0 ) { sp = new SimplePattern(); }

            match(input, Token.DOWN, null); if (state.failed) return sp;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:447:6: (s= triples |s2= triples2 )+
            int cnt55=0;
            loop55:
            do {
                int alt55=3;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==TRIPLE) ) {
                    alt55=1;
                }
                else if ( (LA55_0==TRIPLE2) ) {
                    alt55=2;
                }


                switch (alt55) {
            	case 1 :
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:448:10: s= triples
            	    {
            	    pushFollow(FOLLOW_triples_in_triplesBlock3676);
            	    s=triples();

            	    state._fsp--;
            	    if (state.failed) return sp;

            	    if ( state.backtracking==0 ) { s.expandAndAddTo(sp); }

            	    }
            	    break;
            	case 2 :
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:449:7: s2= triples2
            	    {
            	    pushFollow(FOLLOW_triples2_in_triplesBlock3692);
            	    s2=triples2();

            	    state._fsp--;
            	    if (state.failed) return sp;

            	    if ( state.backtracking==0 ) { s2.expandAndAddTo(sp); }

            	    }
            	    break;

            	default :
            	    if ( cnt55 >= 1 ) break loop55;
            	    if (state.backtracking>0) {state.failed=true; return sp;}
                        EarlyExitException eee =
                            new EarlyExitException(55, input);
                        throw eee;
                }
                cnt55++;
            } while (true);


            match(input, Token.UP, null); if (state.failed) return sp;


            }

        }

        	catch(RecognitionException re) {
        		throw new SPARQLsyntaxError(re);
        	}

        finally {
        	// do for sure before leaving
        }
        return sp;
    }
    // $ANTLR end "triplesBlock"



    // $ANTLR start "triples"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:454:1: triples returns [QueryTriple qt] : ( ^( TRIPLE ^( SUBJECT (s1= graphNode ) ) ^( PREDICATE (v1= predicate ) ) ^( VALUE o= object ) ) ) ;
    public final QueryTriple triples() throws RecognitionException {
        QueryTriple qt = null;


        GraphNode s1 =null;

        BinaryUnion<Variable, Path> v1 =null;

        GraphNode o =null;


         
        			QueryTripleTerm s = null;
        			PropertyTerm p = null;
        			QueryTripleTerm v = null; 
        		  
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:460:2: ( ( ^( TRIPLE ^( SUBJECT (s1= graphNode ) ) ^( PREDICATE (v1= predicate ) ) ^( VALUE o= object ) ) ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:460:6: ( ^( TRIPLE ^( SUBJECT (s1= graphNode ) ) ^( PREDICATE (v1= predicate ) ) ^( VALUE o= object ) ) )
            {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:460:6: ( ^( TRIPLE ^( SUBJECT (s1= graphNode ) ) ^( PREDICATE (v1= predicate ) ) ^( VALUE o= object ) ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:460:8: ^( TRIPLE ^( SUBJECT (s1= graphNode ) ) ^( PREDICATE (v1= predicate ) ) ^( VALUE o= object ) )
            {
            match(input,TRIPLE,FOLLOW_TRIPLE_in_triples3740); if (state.failed) return qt;

            match(input, Token.DOWN, null); if (state.failed) return qt;
            match(input,SUBJECT,FOLLOW_SUBJECT_in_triples3743); if (state.failed) return qt;

            match(input, Token.DOWN, null); if (state.failed) return qt;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:460:27: (s1= graphNode )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:460:29: s1= graphNode
            {
            pushFollow(FOLLOW_graphNode_in_triples3749);
            s1=graphNode();

            state._fsp--;
            if (state.failed) return qt;

            if ( state.backtracking==0 ) { s = new QueryTripleTerm(s1);  }

            }


            match(input, Token.UP, null); if (state.failed) return qt;


            match(input,PREDICATE,FOLLOW_PREDICATE_in_triples3785); if (state.failed) return qt;

            match(input, Token.DOWN, null); if (state.failed) return qt;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:463:18: (v1= predicate )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:463:20: v1= predicate
            {
            pushFollow(FOLLOW_predicate_in_triples3791);
            v1=predicate();

            state._fsp--;
            if (state.failed) return qt;

            if ( state.backtracking==0 ) { p = new PropertyTerm(v1);  }

            }


            match(input, Token.UP, null); if (state.failed) return qt;


            match(input,VALUE,FOLLOW_VALUE_in_triples3831); if (state.failed) return qt;

            match(input, Token.DOWN, null); if (state.failed) return qt;
            pushFollow(FOLLOW_object_in_triples3836);
            o=object();

            state._fsp--;
            if (state.failed) return qt;

            match(input, Token.UP, null); if (state.failed) return qt;


            if ( state.backtracking==0 ) { v = new QueryTripleTerm(o);   }

            match(input, Token.UP, null); if (state.failed) return qt;


            if ( state.backtracking==0 ) { qt = new QueryTriple(s, p, v); }

            }


            }

        }

        	catch(RecognitionException re) {
        		throw new SPARQLsyntaxError(re);
        	}

        finally {
        	// do for sure before leaving
        }
        return qt;
    }
    // $ANTLR end "triples"



    // $ANTLR start "triples2"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:472:1: triples2 returns [QueryTriple2 qt] : ^( TRIPLE2 ^( SUBJECT (s= triplesNode ) ) ( ^( PROPERTY_LIST ^( PREDICATE (p= predicate ) ) ( ^( VALUE o= object ) )+ ) )* ) ;
    public final QueryTriple2 triples2() throws RecognitionException {
        QueryTriple2 qt = null;


        TriplesNode s =null;

        BinaryUnion<Variable, Path> p =null;

        GraphNode o =null;


         
        				PropertyListElement ple = null;
        		  
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:476:2: ( ^( TRIPLE2 ^( SUBJECT (s= triplesNode ) ) ( ^( PROPERTY_LIST ^( PREDICATE (p= predicate ) ) ( ^( VALUE o= object ) )+ ) )* ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:476:6: ^( TRIPLE2 ^( SUBJECT (s= triplesNode ) ) ( ^( PROPERTY_LIST ^( PREDICATE (p= predicate ) ) ( ^( VALUE o= object ) )+ ) )* )
            {
            match(input,TRIPLE2,FOLLOW_TRIPLE2_in_triples23891); if (state.failed) return qt;

            match(input, Token.DOWN, null); if (state.failed) return qt;
            match(input,SUBJECT,FOLLOW_SUBJECT_in_triples23894); if (state.failed) return qt;

            match(input, Token.DOWN, null); if (state.failed) return qt;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:476:26: (s= triplesNode )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:476:28: s= triplesNode
            {
            pushFollow(FOLLOW_triplesNode_in_triples23900);
            s=triplesNode();

            state._fsp--;
            if (state.failed) return qt;

            if ( state.backtracking==0 ) { qt = new QueryTriple2(s);  }

            }


            match(input, Token.UP, null); if (state.failed) return qt;


            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:479:6: ( ^( PROPERTY_LIST ^( PREDICATE (p= predicate ) ) ( ^( VALUE o= object ) )+ ) )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==PROPERTY_LIST) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:479:8: ^( PROPERTY_LIST ^( PREDICATE (p= predicate ) ) ( ^( VALUE o= object ) )+ )
            	    {
            	    match(input,PROPERTY_LIST,FOLLOW_PROPERTY_LIST_in_triples23938); if (state.failed) return qt;

            	    match(input, Token.DOWN, null); if (state.failed) return qt;
            	    match(input,PREDICATE,FOLLOW_PREDICATE_in_triples23950); if (state.failed) return qt;

            	    match(input, Token.DOWN, null); if (state.failed) return qt;
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:480:22: (p= predicate )
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:480:24: p= predicate
            	    {
            	    pushFollow(FOLLOW_predicate_in_triples23957);
            	    p=predicate();

            	    state._fsp--;
            	    if (state.failed) return qt;

            	    if ( state.backtracking==0 ) { ple = new PropertyListElement(p);  }

            	    }


            	    match(input, Token.UP, null); if (state.failed) return qt;


            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:483:9: ( ^( VALUE o= object ) )+
            	    int cnt56=0;
            	    loop56:
            	    do {
            	        int alt56=2;
            	        int LA56_0 = input.LA(1);

            	        if ( (LA56_0==VALUE) ) {
            	            alt56=1;
            	        }


            	        switch (alt56) {
            	    	case 1 :
            	    	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:483:11: ^( VALUE o= object )
            	    	    {
            	    	    match(input,VALUE,FOLLOW_VALUE_in_triples24007); if (state.failed) return qt;

            	    	    match(input, Token.DOWN, null); if (state.failed) return qt;
            	    	    pushFollow(FOLLOW_object_in_triples24012);
            	    	    o=object();

            	    	    state._fsp--;
            	    	    if (state.failed) return qt;

            	    	    match(input, Token.UP, null); if (state.failed) return qt;


            	    	    if ( state.backtracking==0 ) { ple.addObject(o); }

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt56 >= 1 ) break loop56;
            	    	    if (state.backtracking>0) {state.failed=true; return qt;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(56, input);
            	                throw eee;
            	        }
            	        cnt56++;
            	    } while (true);


            	    if ( state.backtracking==0 ) { qt.addPropertyListElement(ple); }

            	    match(input, Token.UP, null); if (state.failed) return qt;


            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);


            match(input, Token.UP, null); if (state.failed) return qt;


            }

        }

        	catch(RecognitionException re) {
        		throw new SPARQLsyntaxError(re);
        	}

        finally {
        	// do for sure before leaving
        }
        return qt;
    }
    // $ANTLR end "triples2"



    // $ANTLR start "graphPatternNewBGP"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:491:1: graphPatternNewBGP[PatternSet p, Set<BlankNodeVariable> vars] : (u= groupMinusOrUnionGraphPattern |o= optionalGraphPattern |g= graphGraphPattern |s= serviceGraphPattern |b= bind |v= inlineData );
    public final void graphPatternNewBGP(PatternSet p, Set<BlankNodeVariable> vars) throws RecognitionException {
        Pattern u =null;

        Pattern o =null;

        Pattern g =null;

        Pattern s =null;

        Pattern b =null;

        ValuesPattern v =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:492:5: (u= groupMinusOrUnionGraphPattern |o= optionalGraphPattern |g= graphGraphPattern |s= serviceGraphPattern |b= bind |v= inlineData )
            int alt58=6;
            switch ( input.LA(1) ) {
            case GROUP_GRAPH_PATTERN:
            case MINUS:
            case SUB_SELECT:
            case UNION:
                {
                alt58=1;
                }
                break;
            case OPTIONAL:
                {
                alt58=2;
                }
                break;
            case GRAPH:
                {
                alt58=3;
                }
                break;
            case SERVICE:
                {
                alt58=4;
                }
                break;
            case BIND:
                {
                alt58=5;
                }
                break;
            case VALUES:
                {
                alt58=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;

            }

            switch (alt58) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:492:9: u= groupMinusOrUnionGraphPattern
                    {
                    pushFollow(FOLLOW_groupMinusOrUnionGraphPattern_in_graphPatternNewBGP4072);
                    u=groupMinusOrUnionGraphPattern();

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) { p.addPattern(u); }

                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:494:5: o= optionalGraphPattern
                    {
                    pushFollow(FOLLOW_optionalGraphPattern_in_graphPatternNewBGP4092);
                    o=optionalGraphPattern();

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) { if (p.isEmpty()) {
                                    p.addPattern(o);
                              } else { 
                                    p.addOptional(o); 
                              } 
                            }

                    }
                    break;
                case 3 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:501:5: g= graphGraphPattern
                    {
                    pushFollow(FOLLOW_graphGraphPattern_in_graphPatternNewBGP4113);
                    g=graphGraphPattern();

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) { 
                                p.addPattern(g);
                            }

                    }
                    break;
                case 4 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:505:5: s= serviceGraphPattern
                    {
                    pushFollow(FOLLOW_serviceGraphPattern_in_graphPatternNewBGP4134);
                    s=serviceGraphPattern();

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) {
                    			p.addPattern(s);
                    		}

                    }
                    break;
                case 5 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:509:5: b= bind
                    {
                    pushFollow(FOLLOW_bind_in_graphPatternNewBGP4147);
                    b=bind();

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) {					
                    			p.addPattern(b);
                    	    }

                    }
                    break;
                case 6 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:513:9: v= inlineData
                    {
                    pushFollow(FOLLOW_inlineData_in_graphPatternNewBGP4167);
                    v=inlineData();

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) {
                           		p.addPattern(v);
                           }

                    }
                    break;

            }
        }

        	catch(RecognitionException re) {
        		throw new SPARQLsyntaxError(re);
        	}

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "graphPatternNewBGP"



    // $ANTLR start "inlineData"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:519:1: inlineData returns [ValuesPattern v] : ^( VALUES d= dataBlock ) ;
    public final ValuesPattern inlineData() throws RecognitionException {
        ValuesPattern v = null;


        Values d =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:520:5: ( ^( VALUES d= dataBlock ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:520:9: ^( VALUES d= dataBlock )
            {
            match(input,VALUES,FOLLOW_VALUES_in_inlineData4200); if (state.failed) return v;

            match(input, Token.DOWN, null); if (state.failed) return v;
            pushFollow(FOLLOW_dataBlock_in_inlineData4204);
            d=dataBlock();

            state._fsp--;
            if (state.failed) return v;

            if ( state.backtracking==0 ) {v =new ValuesPattern(d);}

            match(input, Token.UP, null); if (state.failed) return v;


            }

        }

        	catch(RecognitionException re) {
        		throw new SPARQLsyntaxError(re);
        	}

        finally {
        	// do for sure before leaving
        }
        return v;
    }
    // $ANTLR end "inlineData"



    // $ANTLR start "dataBlock"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:523:1: dataBlock returns [Values values] : ^( INLINE_DATA ( ( NIL )=> NIL | (v= var )* ) ( ( NIL )=> NIL | (d= dataBlockValue )* ) ) ;
    public final Values dataBlock() throws RecognitionException {
        Values values = null;


        String v =null;

        Expression d =null;


        List<Variable> vars = new ArrayList<Variable>(); 
               List<List<Expression>> expressions = new LinkedList<List<Expression>>(); 
               values = new Values(vars, expressions);
               List<Expression> rowExp = new LinkedList<Expression>();
               int i = 0; 
               
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:530:5: ( ^( INLINE_DATA ( ( NIL )=> NIL | (v= var )* ) ( ( NIL )=> NIL | (d= dataBlockValue )* ) ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:530:9: ^( INLINE_DATA ( ( NIL )=> NIL | (v= var )* ) ( ( NIL )=> NIL | (d= dataBlockValue )* ) )
            {
            match(input,INLINE_DATA,FOLLOW_INLINE_DATA_in_dataBlock4236); if (state.failed) return values;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return values;
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:530:23: ( ( NIL )=> NIL | (v= var )* )
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==NIL) ) {
                    int LA60_1 = input.LA(2);

                    if ( (synpred1_IbmSparqlExtAstWalker()) ) {
                        alt60=1;
                    }
                    else if ( (true) ) {
                        alt60=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return values;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 60, 1, input);

                        throw nvae;

                    }
                }
                else if ( (LA60_0==UP||(LA60_0 >= BIG_DECIMAL && LA60_0 <= BIG_INTEGER)||LA60_0==BOOLEAN||LA60_0==DOUBLE||LA60_0==IRI||(LA60_0 >= PREFIXED_NAME && LA60_0 <= PREFIXED_NS)||LA60_0==STRING||LA60_0==UNDEF||LA60_0==VAR) ) {
                    alt60=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return values;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 60, 0, input);

                    throw nvae;

                }
                switch (alt60) {
                    case 1 :
                        // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:530:25: ( NIL )=> NIL
                        {
                        match(input,NIL,FOLLOW_NIL_in_dataBlock4246); if (state.failed) return values;

                        }
                        break;
                    case 2 :
                        // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:530:40: (v= var )*
                        {
                        // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:530:40: (v= var )*
                        loop59:
                        do {
                            int alt59=2;
                            int LA59_0 = input.LA(1);

                            if ( (LA59_0==VAR) ) {
                                alt59=1;
                            }


                            switch (alt59) {
                        	case 1 :
                        	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:530:41: v= var
                        	    {
                        	    pushFollow(FOLLOW_var_in_dataBlock4253);
                        	    v=var();

                        	    state._fsp--;
                        	    if (state.failed) return values;

                        	    if ( state.backtracking==0 ) {vars.add(new Variable(v));}

                        	    }
                        	    break;

                        	default :
                        	    break loop59;
                            }
                        } while (true);


                        }
                        break;

                }


                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:530:79: ( ( NIL )=> NIL | (d= dataBlockValue )* )
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==NIL) && (synpred2_IbmSparqlExtAstWalker())) {
                    alt62=1;
                }
                else if ( (LA62_0==UP||(LA62_0 >= BIG_DECIMAL && LA62_0 <= BIG_INTEGER)||LA62_0==BOOLEAN||LA62_0==DOUBLE||LA62_0==IRI||(LA62_0 >= PREFIXED_NAME && LA62_0 <= PREFIXED_NS)||LA62_0==STRING||LA62_0==UNDEF) ) {
                    alt62=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return values;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 62, 0, input);

                    throw nvae;

                }
                switch (alt62) {
                    case 1 :
                        // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:530:81: ( NIL )=> NIL
                        {
                        match(input,NIL,FOLLOW_NIL_in_dataBlock4268); if (state.failed) return values;

                        }
                        break;
                    case 2 :
                        // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:530:96: (d= dataBlockValue )*
                        {
                        // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:530:96: (d= dataBlockValue )*
                        loop61:
                        do {
                            int alt61=2;
                            int LA61_0 = input.LA(1);

                            if ( ((LA61_0 >= BIG_DECIMAL && LA61_0 <= BIG_INTEGER)||LA61_0==BOOLEAN||LA61_0==DOUBLE||LA61_0==IRI||(LA61_0 >= PREFIXED_NAME && LA61_0 <= PREFIXED_NS)||LA61_0==STRING||LA61_0==UNDEF) ) {
                                alt61=1;
                            }


                            switch (alt61) {
                        	case 1 :
                        	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:530:97: d= dataBlockValue
                        	    {
                        	    pushFollow(FOLLOW_dataBlockValue_in_dataBlock4275);
                        	    d=dataBlockValue();

                        	    state._fsp--;
                        	    if (state.failed) return values;

                        	    if ( state.backtracking==0 ) { int row = i % vars.size(); 
                        	        	  if (row == 0) {
                        	        	  	rowExp = new LinkedList<Expression>();
                        	        	  	expressions.add(rowExp);
                        	        	  }
                        	        	  rowExp.add(d);
                        	        	  i++;
                        	    		}

                        	    }
                        	    break;

                        	default :
                        	    break loop61;
                            }
                        } while (true);


                        }
                        break;

                }


                match(input, Token.UP, null); if (state.failed) return values;
            }


            }

        }

        	catch(RecognitionException re) {
        		throw new SPARQLsyntaxError(re);
        	}

        finally {
        	// do for sure before leaving
        }
        return values;
    }
    // $ANTLR end "dataBlock"



    // $ANTLR start "dataBlockValue"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:541:1: dataBlockValue returns [Expression e] : (i= iRIref |r= rDFLiteral |d= numericLiteral |b= booleanLiteral |u= UNDEF );
    public final Expression dataBlockValue() throws RecognitionException {
        Expression e = null;


        XTree u=null;
        IRI i =null;

        StringLiteral r =null;

        Constant d =null;

        Boolean b =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:542:2: (i= iRIref |r= rDFLiteral |d= numericLiteral |b= booleanLiteral |u= UNDEF )
            int alt63=5;
            switch ( input.LA(1) ) {
            case IRI:
            case PREFIXED_NAME:
            case PREFIXED_NS:
                {
                alt63=1;
                }
                break;
            case STRING:
                {
                alt63=2;
                }
                break;
            case BIG_DECIMAL:
            case BIG_INTEGER:
            case DOUBLE:
                {
                alt63=3;
                }
                break;
            case BOOLEAN:
                {
                alt63=4;
                }
                break;
            case UNDEF:
                {
                alt63=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return e;}
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;

            }

            switch (alt63) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:542:7: i= iRIref
                    {
                    pushFollow(FOLLOW_iRIref_in_dataBlockValue4311);
                    i=iRIref();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) {e = new ConstantExpression(i);}

                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:543:7: r= rDFLiteral
                    {
                    pushFollow(FOLLOW_rDFLiteral_in_dataBlockValue4327);
                    r=rDFLiteral();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) {e = new ConstantExpression(r);}

                    }
                    break;
                case 3 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:544:7: d= numericLiteral
                    {
                    pushFollow(FOLLOW_numericLiteral_in_dataBlockValue4342);
                    d=numericLiteral();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) {e = new ConstantExpression(d);}

                    }
                    break;
                case 4 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:545:7: b= booleanLiteral
                    {
                    pushFollow(FOLLOW_booleanLiteral_in_dataBlockValue4357);
                    b=booleanLiteral();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) {e = new ConstantExpression(b);}

                    }
                    break;
                case 5 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:546:7: u= UNDEF
                    {
                    u=(XTree)match(input,UNDEF,FOLLOW_UNDEF_in_dataBlockValue4373); if (state.failed) return e;

                    if ( state.backtracking==0 ) {e = new UNDEFExpression();}

                    }
                    break;

            }
        }

        	catch(RecognitionException re) {
        		throw new SPARQLsyntaxError(re);
        	}

        finally {
        	// do for sure before leaving
        }
        return e;
    }
    // $ANTLR end "dataBlockValue"



    // $ANTLR start "optionalGraphPattern"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:549:1: optionalGraphPattern returns [Pattern p] : ^( OPTIONAL g= groupGraphPattern[false] ) ;
    public final Pattern optionalGraphPattern() throws RecognitionException {
        Pattern p = null;


        Pattern g =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:550:2: ( ^( OPTIONAL g= groupGraphPattern[false] ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:550:7: ^( OPTIONAL g= groupGraphPattern[false] )
            {
            match(input,OPTIONAL,FOLLOW_OPTIONAL_in_optionalGraphPattern4403); if (state.failed) return p;

            match(input, Token.DOWN, null); if (state.failed) return p;
            pushFollow(FOLLOW_groupGraphPattern_in_optionalGraphPattern4407);
            g=groupGraphPattern(false);

            state._fsp--;
            if (state.failed) return p;

            match(input, Token.UP, null); if (state.failed) return p;


            if ( state.backtracking==0 ) { p = g; }

            }

        }

        	catch(RecognitionException re) {
        		throw new SPARQLsyntaxError(re);
        	}

        finally {
        	// do for sure before leaving
        }
        return p;
    }
    // $ANTLR end "optionalGraphPattern"



    // $ANTLR start "graphGraphPattern"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:553:1: graphGraphPattern returns [Pattern p] : ^( GRAPH r= varOrIRIref2 g= groupGraphPattern[false] ) ;
    public final Pattern graphGraphPattern() throws RecognitionException {
        Pattern p = null;


        BinaryUnion<Variable, IRI> r =null;

        Pattern g =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:554:2: ( ^( GRAPH r= varOrIRIref2 g= groupGraphPattern[false] ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:554:7: ^( GRAPH r= varOrIRIref2 g= groupGraphPattern[false] )
            {
            match(input,GRAPH,FOLLOW_GRAPH_in_graphGraphPattern4437); if (state.failed) return p;

            match(input, Token.DOWN, null); if (state.failed) return p;
            pushFollow(FOLLOW_varOrIRIref2_in_graphGraphPattern4441);
            r=varOrIRIref2();

            state._fsp--;
            if (state.failed) return p;

            pushFollow(FOLLOW_groupGraphPattern_in_graphGraphPattern4445);
            g=groupGraphPattern(false);

            state._fsp--;
            if (state.failed) return p;

            match(input, Token.UP, null); if (state.failed) return p;


            if ( state.backtracking==0 ) { g.setGraphRestriction(r);  p = g; }

            }

        }

        	catch(RecognitionException re) {
        		throw new SPARQLsyntaxError(re);
        	}

        finally {
        	// do for sure before leaving
        }
        return p;
    }
    // $ANTLR end "graphGraphPattern"



    // $ANTLR start "serviceGraphPattern"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:557:1: serviceGraphPattern returns [Pattern p] : ^(top= SERVICE ( SILENT )? s= varOrIRIref g= groupGraphPattern[false] ) ;
    public final Pattern serviceGraphPattern() throws RecognitionException {
        Pattern p = null;


        XTree top=null;
        QueryTripleTerm s =null;

        Pattern g =null;


         boolean silent=false; 
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:559:2: ( ^(top= SERVICE ( SILENT )? s= varOrIRIref g= groupGraphPattern[false] ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:559:7: ^(top= SERVICE ( SILENT )? s= varOrIRIref g= groupGraphPattern[false] )
            {
            top=(XTree)match(input,SERVICE,FOLLOW_SERVICE_in_serviceGraphPattern4481); if (state.failed) return p;

            match(input, Token.DOWN, null); if (state.failed) return p;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:559:21: ( SILENT )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==SILENT) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:559:22: SILENT
                    {
                    match(input,SILENT,FOLLOW_SILENT_in_serviceGraphPattern4484); if (state.failed) return p;

                    if ( state.backtracking==0 ) { silent=true; }

                    }
                    break;

            }


            pushFollow(FOLLOW_varOrIRIref_in_serviceGraphPattern4492);
            s=varOrIRIref();

            state._fsp--;
            if (state.failed) return p;

            pushFollow(FOLLOW_groupGraphPattern_in_serviceGraphPattern4496);
            g=groupGraphPattern(false);

            state._fsp--;
            if (state.failed) return p;

            match(input, Token.UP, null); if (state.failed) return p;


            if ( state.backtracking==0 ) {
                       p = new ServicePattern(s, top.matched, silent, g);
                     }

            }

        }

        	catch(RecognitionException re) {
        		throw new SPARQLsyntaxError(re);
        	}

        finally {
        	// do for sure before leaving
        }
        return p;
    }
    // $ANTLR end "serviceGraphPattern"



    // $ANTLR start "bind"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:566:1: bind returns [Pattern p] : (bp= bind1 |bf= bind2 );
    public final Pattern bind() throws RecognitionException {
        Pattern p = null;


        Pattern bp =null;

        Pattern bf =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:567:2: (bp= bind1 |bf= bind2 )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==BIND) ) {
                int LA65_1 = input.LA(2);

                if ( (LA65_1==DOWN) ) {
                    int LA65_2 = input.LA(3);

                    if ( (LA65_2==VAR) ) {
                        alt65=1;
                    }
                    else if ( (LA65_2==FUNCCALL) ) {
                        alt65=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return p;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 65, 2, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return p;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 65, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return p;}
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;

            }
            switch (alt65) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:567:4: bp= bind1
                    {
                    pushFollow(FOLLOW_bind1_in_bind4527);
                    bp=bind1();

                    state._fsp--;
                    if (state.failed) return p;

                    if ( state.backtracking==0 ) {p =bp;}

                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:568:4: bf= bind2
                    {
                    pushFollow(FOLLOW_bind2_in_bind4536);
                    bf=bind2();

                    state._fsp--;
                    if (state.failed) return p;

                    if ( state.backtracking==0 ) {p =bf;}

                    }
                    break;

            }
        }

        	catch(RecognitionException re) {
        		throw new SPARQLsyntaxError(re);
        	}

        finally {
        	// do for sure before leaving
        }
        return p;
    }
    // $ANTLR end "bind"



    // $ANTLR start "bind1"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:571:1: bind1 returns [Pattern p] : ^( BIND v= var e= expression ) ;
    public final Pattern bind1() throws RecognitionException {
        Pattern p = null;


        String v =null;

        Expression e =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:572:2: ( ^( BIND v= var e= expression ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:572:7: ^( BIND v= var e= expression )
            {
            match(input,BIND,FOLLOW_BIND_in_bind14558); if (state.failed) return p;

            match(input, Token.DOWN, null); if (state.failed) return p;
            pushFollow(FOLLOW_var_in_bind14562);
            v=var();

            state._fsp--;
            if (state.failed) return p;

            pushFollow(FOLLOW_expression_in_bind14568);
            e=expression();

            state._fsp--;
            if (state.failed) return p;

            match(input, Token.UP, null); if (state.failed) return p;


            if ( state.backtracking==0 ) { p = new BindPattern(v, e); }

            }

        }

        	catch(RecognitionException re) {
        		throw new SPARQLsyntaxError(re);
        	}

        finally {
        	// do for sure before leaving
        }
        return p;
    }
    // $ANTLR end "bind1"



    // $ANTLR start "bind2"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:575:1: bind2 returns [Pattern p] : ^( BIND (f= funcCall ) (v= var )* ) ;
    public final Pattern bind2() throws RecognitionException {
        Pattern p = null;


        BindFunctionCall f =null;

        String v =null;


         p = new BindFunctionPattern(); 
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:577:2: ( ^( BIND (f= funcCall ) (v= var )* ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:577:7: ^( BIND (f= funcCall ) (v= var )* )
            {
            match(input,BIND,FOLLOW_BIND_in_bind24601); if (state.failed) return p;

            match(input, Token.DOWN, null); if (state.failed) return p;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:578:4: (f= funcCall )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:578:5: f= funcCall
            {
            pushFollow(FOLLOW_funcCall_in_bind24610);
            f=funcCall();

            state._fsp--;
            if (state.failed) return p;

            if ( state.backtracking==0 ) { ((BindFunctionPattern)p).setFuncCall(f); }

            }


            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:579:4: (v= var )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==VAR) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:579:5: v= var
            	    {
            	    pushFollow(FOLLOW_var_in_bind24623);
            	    v=var();

            	    state._fsp--;
            	    if (state.failed) return p;

            	    if ( state.backtracking==0 ) { ((BindFunctionPattern)p).addVar(v); }

            	    }
            	    break;

            	default :
            	    break loop66;
                }
            } while (true);


            match(input, Token.UP, null); if (state.failed) return p;


            }

        }

        	catch(RecognitionException re) {
        		throw new SPARQLsyntaxError(re);
        	}

        finally {
        	// do for sure before leaving
        }
        return p;
    }
    // $ANTLR end "bind2"



    // $ANTLR start "funcCall"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:583:1: funcCall returns [BindFunctionCall f] : ^( FUNCCALL (fn= iRIref ) (v= var )* ) ;
    public final BindFunctionCall funcCall() throws RecognitionException {
        BindFunctionCall f = null;


        IRI fn =null;

        String v =null;


         f = new BindFunctionCall(); 
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:585:2: ( ^( FUNCCALL (fn= iRIref ) (v= var )* ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:585:7: ^( FUNCCALL (fn= iRIref ) (v= var )* )
            {
            match(input,FUNCCALL,FOLLOW_FUNCCALL_in_funcCall4663); if (state.failed) return f;

            match(input, Token.DOWN, null); if (state.failed) return f;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:586:4: (fn= iRIref )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:586:5: fn= iRIref
            {
            pushFollow(FOLLOW_iRIref_in_funcCall4672);
            fn=iRIref();

            state._fsp--;
            if (state.failed) return f;

            if ( state.backtracking==0 ) {f.setIri(fn); f.setFunction(functions.get(fn)); }

            }


            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:587:4: (v= var )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==VAR) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:587:5: v= var
            	    {
            	    pushFollow(FOLLOW_var_in_funcCall4684);
            	    v=var();

            	    state._fsp--;
            	    if (state.failed) return f;

            	    if ( state.backtracking==0 ) {f.addVar(v);}

            	    }
            	    break;

            	default :
            	    break loop67;
                }
            } while (true);


            match(input, Token.UP, null); if (state.failed) return f;


            }

        }

        	catch(RecognitionException re) {
        		throw new SPARQLsyntaxError(re);
        	}

        finally {
        	// do for sure before leaving
        }
        return f;
    }
    // $ANTLR end "funcCall"



    // $ANTLR start "groupMinusOrUnionGraphPattern"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:591:1: groupMinusOrUnionGraphPattern returns [Pattern r] : ( ^( UNION g1= groupGraphPattern[false] (g2= groupGraphPattern[false] )+ ) | ^( MINUS g1= groupGraphPattern[false] ) |g3= groupGraphPattern[false] );
    public final Pattern groupMinusOrUnionGraphPattern() throws RecognitionException {
        Pattern r = null;


        Pattern g1 =null;

        Pattern g2 =null;

        Pattern g3 =null;



        	  PatternSet p = null;
        	
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:595:2: ( ^( UNION g1= groupGraphPattern[false] (g2= groupGraphPattern[false] )+ ) | ^( MINUS g1= groupGraphPattern[false] ) |g3= groupGraphPattern[false] )
            int alt69=3;
            switch ( input.LA(1) ) {
            case UNION:
                {
                alt69=1;
                }
                break;
            case MINUS:
                {
                alt69=2;
                }
                break;
            case GROUP_GRAPH_PATTERN:
            case SUB_SELECT:
                {
                alt69=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return r;}
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;

            }

            switch (alt69) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:595:6: ^( UNION g1= groupGraphPattern[false] (g2= groupGraphPattern[false] )+ )
                    {
                    match(input,UNION,FOLLOW_UNION_in_groupMinusOrUnionGraphPattern4719); if (state.failed) return r;

                    match(input, Token.DOWN, null); if (state.failed) return r;
                    pushFollow(FOLLOW_groupGraphPattern_in_groupMinusOrUnionGraphPattern4740);
                    g1=groupGraphPattern(false);

                    state._fsp--;
                    if (state.failed) return r;

                    if ( state.backtracking==0 ) { p = new PatternSet(PatternSet.EPatternSetType.UNION); 
                    			      r = p;
                                      p.addPattern(g1);	}

                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:600:5: (g2= groupGraphPattern[false] )+
                    int cnt68=0;
                    loop68:
                    do {
                        int alt68=2;
                        int LA68_0 = input.LA(1);

                        if ( (LA68_0==GROUP_GRAPH_PATTERN||LA68_0==SUB_SELECT) ) {
                            alt68=1;
                        }


                        switch (alt68) {
                    	case 1 :
                    	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:600:6: g2= groupGraphPattern[false]
                    	    {
                    	    pushFollow(FOLLOW_groupGraphPattern_in_groupMinusOrUnionGraphPattern4771);
                    	    g2=groupGraphPattern(false);

                    	    state._fsp--;
                    	    if (state.failed) return r;

                    	    if ( state.backtracking==0 ) { 
                    	                       p.addPattern(g2); 
                    	                     }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt68 >= 1 ) break loop68;
                    	    if (state.backtracking>0) {state.failed=true; return r;}
                                EarlyExitException eee =
                                    new EarlyExitException(68, input);
                                throw eee;
                        }
                        cnt68++;
                    } while (true);


                    match(input, Token.UP, null); if (state.failed) return r;


                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:604:9: ^( MINUS g1= groupGraphPattern[false] )
                    {
                    match(input,MINUS,FOLLOW_MINUS_in_groupMinusOrUnionGraphPattern4807); if (state.failed) return r;

                    match(input, Token.DOWN, null); if (state.failed) return r;
                    pushFollow(FOLLOW_groupGraphPattern_in_groupMinusOrUnionGraphPattern4822);
                    g1=groupGraphPattern(false);

                    state._fsp--;
                    if (state.failed) return r;

                    if ( state.backtracking==0 ) { p = new PatternSet(PatternSet.EPatternSetType.MINUS); 
                    			 r = p;
                                 p.addPattern(g1); }

                    match(input, Token.UP, null); if (state.failed) return r;


                    }
                    break;
                case 3 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:609:7: g3= groupGraphPattern[false]
                    {
                    pushFollow(FOLLOW_groupGraphPattern_in_groupMinusOrUnionGraphPattern4849);
                    g3=groupGraphPattern(false);

                    state._fsp--;
                    if (state.failed) return r;

                    if ( state.backtracking==0 ) { 
                              r = g3;
                            }

                    }
                    break;

            }
        }

        	catch(RecognitionException re) {
        		throw new SPARQLsyntaxError(re);
        	}

        finally {
        	// do for sure before leaving
        }
        return r;
    }
    // $ANTLR end "groupMinusOrUnionGraphPattern"



    // $ANTLR start "filter"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:615:1: filter returns [Expression e] : ^( FILTER c= constraint ) ;
    public final Expression filter() throws RecognitionException {
        Expression e = null;


        Expression c =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:616:2: ( ^( FILTER c= constraint ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:616:6: ^( FILTER c= constraint )
            {
            match(input,FILTER,FOLLOW_FILTER_in_filter4882); if (state.failed) return e;

            match(input, Token.DOWN, null); if (state.failed) return e;
            pushFollow(FOLLOW_constraint_in_filter4886);
            c=constraint();

            state._fsp--;
            if (state.failed) return e;

            match(input, Token.UP, null); if (state.failed) return e;


            if ( state.backtracking==0 ) { e = c; }

            }

        }

        	catch(RecognitionException re) {
        		throw new SPARQLsyntaxError(re);
        	}

        finally {
        	// do for sure before leaving
        }
        return e;
    }
    // $ANTLR end "filter"



    // $ANTLR start "constraint"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:619:1: constraint returns [Expression e] : (be= brackettedExpression |bc= builtInCall |fc= functionCall );
    public final Expression constraint() throws RecognitionException {
        Expression e = null;


        Expression be =null;

        Expression bc =null;

        FunctionCall fc =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:620:2: (be= brackettedExpression |bc= builtInCall |fc= functionCall )
            int alt70=3;
            switch ( input.LA(1) ) {
            case EXPRESSION:
                {
                alt70=1;
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
                alt70=2;
                }
                break;
            case FUNCTION:
                {
                alt70=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return e;}
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;

            }

            switch (alt70) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:620:6: be= brackettedExpression
                    {
                    pushFollow(FOLLOW_brackettedExpression_in_constraint4910);
                    be=brackettedExpression();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { e = be; }

                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:621:5: bc= builtInCall
                    {
                    pushFollow(FOLLOW_builtInCall_in_constraint4920);
                    bc=builtInCall();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { e = bc; }

                    }
                    break;
                case 3 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:622:5: fc= functionCall
                    {
                    pushFollow(FOLLOW_functionCall_in_constraint4933);
                    fc=functionCall();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { e = new FunctionCallExpression(fc); }

                    }
                    break;

            }
        }

        	catch(RecognitionException re) {
        		throw new SPARQLsyntaxError(re);
        	}

        finally {
        	// do for sure before leaving
        }
        return e;
    }
    // $ANTLR end "constraint"



    // $ANTLR start "functionCall"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:625:1: functionCall returns [FunctionCall fc] : ^( FUNCTION i= iRIref a= argList ) ;
    public final FunctionCall functionCall() throws RecognitionException {
        FunctionCall fc = null;


        IRI i =null;

        List<Expression> a =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:626:2: ( ^( FUNCTION i= iRIref a= argList ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:626:6: ^( FUNCTION i= iRIref a= argList )
            {
            match(input,FUNCTION,FOLLOW_FUNCTION_in_functionCall4955); if (state.failed) return fc;

            match(input, Token.DOWN, null); if (state.failed) return fc;
            pushFollow(FOLLOW_iRIref_in_functionCall4959);
            i=iRIref();

            state._fsp--;
            if (state.failed) return fc;

            pushFollow(FOLLOW_argList_in_functionCall4963);
            a=argList();

            state._fsp--;
            if (state.failed) return fc;

            match(input, Token.UP, null); if (state.failed) return fc;


            if ( state.backtracking==0 ) { fc = new FunctionCall(i, a); }

            }

        }

        	catch(RecognitionException re) {
        		throw new SPARQLsyntaxError(re);
        	}

        finally {
        	// do for sure before leaving
        }
        return fc;
    }
    // $ANTLR end "functionCall"



    // $ANTLR start "argList"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:629:1: argList returns [List<Expression> args] : ( NIL | DISTINCT (e1= expression )+ | (e2= expression )+ );
    public final List<Expression> argList() throws RecognitionException {
        List<Expression> args = null;


        Expression e1 =null;

        Expression e2 =null;


         args = new ArrayList<Expression>(); 
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:631:5: ( NIL | DISTINCT (e1= expression )+ | (e2= expression )+ )
            int alt73=3;
            switch ( input.LA(1) ) {
            case NIL:
                {
                alt73=1;
                }
                break;
            case DISTINCT:
                {
                alt73=2;
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
            case 268:
            case 269:
            case 270:
            case 271:
            case 272:
            case 273:
            case 275:
            case 276:
            case 277:
                {
                alt73=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return args;}
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;

            }

            switch (alt73) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:631:9: NIL
                    {
                    match(input,NIL,FOLLOW_NIL_in_argList4992); if (state.failed) return args;

                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:632:6: DISTINCT (e1= expression )+
                    {
                    match(input,DISTINCT,FOLLOW_DISTINCT_in_argList5005); if (state.failed) return args;

                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:632:15: (e1= expression )+
                    int cnt71=0;
                    loop71:
                    do {
                        int alt71=2;
                        int LA71_0 = input.LA(1);

                        if ( (LA71_0==ABS||LA71_0==AVG||(LA71_0 >= BIG_DECIMAL && LA71_0 <= BIG_INTEGER)||(LA71_0 >= BNODE && LA71_0 <= BROKEN_PLUS)||LA71_0==CEIL||LA71_0==COALESCE||LA71_0==CONCAT||LA71_0==CONTAINS||LA71_0==COUNT||(LA71_0 >= DATATYPE && LA71_0 <= DAY)||LA71_0==DOUBLE||LA71_0==ENCODE_FOR_URI||LA71_0==EXISTS||LA71_0==EXPRESSION||LA71_0==FLOOR||LA71_0==FUNCTION||LA71_0==GROUP_CONCAT||LA71_0==HOURS||(LA71_0 >= IF && LA71_0 <= IN)||LA71_0==IRI||(LA71_0 >= ISBLANK && LA71_0 <= ISURI)||(LA71_0 >= LANG && LA71_0 <= LANGMATCHES)||LA71_0==LCASE||(LA71_0 >= LOGICAL_AND && LA71_0 <= LTE)||(LA71_0 >= MAX && LA71_0 <= MIN)||LA71_0==MINUTES||LA71_0==MONTH||(LA71_0 >= NOT && LA71_0 <= NOT_EXISTS)||LA71_0==NOW||(LA71_0 >= PREFIXED_NAME && LA71_0 <= PREFIXED_NS)||LA71_0==RAND||(LA71_0 >= REGEX && LA71_0 <= REPLACE)||LA71_0==ROUND||(LA71_0 >= SAMETERM && LA71_0 <= SECONDS)||LA71_0==SHA1||(LA71_0 >= SHA256 && LA71_0 <= SHA512)||(LA71_0 >= STR && LA71_0 <= STRING)||(LA71_0 >= STRLANG && LA71_0 <= STRUUID)||LA71_0==SUBSTR||LA71_0==SUM||LA71_0==TIMEZONE||LA71_0==TZ||LA71_0==UCASE||LA71_0==URI||LA71_0==UUID||LA71_0==VAR||LA71_0==YEAR||(LA71_0 >= 268 && LA71_0 <= 273)||(LA71_0 >= 275 && LA71_0 <= 277)) ) {
                            alt71=1;
                        }


                        switch (alt71) {
                    	case 1 :
                    	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:632:16: e1= expression
                    	    {
                    	    pushFollow(FOLLOW_expression_in_argList5010);
                    	    e1=expression();

                    	    state._fsp--;
                    	    if (state.failed) return args;

                    	    if ( state.backtracking==0 ) { args.add(e1); }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt71 >= 1 ) break loop71;
                    	    if (state.backtracking>0) {state.failed=true; return args;}
                                EarlyExitException eee =
                                    new EarlyExitException(71, input);
                                throw eee;
                        }
                        cnt71++;
                    } while (true);


                    }
                    break;
                case 3 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:633:4: (e2= expression )+
                    {
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:633:4: (e2= expression )+
                    int cnt72=0;
                    loop72:
                    do {
                        int alt72=2;
                        int LA72_0 = input.LA(1);

                        if ( (LA72_0==ABS||LA72_0==AVG||(LA72_0 >= BIG_DECIMAL && LA72_0 <= BIG_INTEGER)||(LA72_0 >= BNODE && LA72_0 <= BROKEN_PLUS)||LA72_0==CEIL||LA72_0==COALESCE||LA72_0==CONCAT||LA72_0==CONTAINS||LA72_0==COUNT||(LA72_0 >= DATATYPE && LA72_0 <= DAY)||LA72_0==DOUBLE||LA72_0==ENCODE_FOR_URI||LA72_0==EXISTS||LA72_0==EXPRESSION||LA72_0==FLOOR||LA72_0==FUNCTION||LA72_0==GROUP_CONCAT||LA72_0==HOURS||(LA72_0 >= IF && LA72_0 <= IN)||LA72_0==IRI||(LA72_0 >= ISBLANK && LA72_0 <= ISURI)||(LA72_0 >= LANG && LA72_0 <= LANGMATCHES)||LA72_0==LCASE||(LA72_0 >= LOGICAL_AND && LA72_0 <= LTE)||(LA72_0 >= MAX && LA72_0 <= MIN)||LA72_0==MINUTES||LA72_0==MONTH||(LA72_0 >= NOT && LA72_0 <= NOT_EXISTS)||LA72_0==NOW||(LA72_0 >= PREFIXED_NAME && LA72_0 <= PREFIXED_NS)||LA72_0==RAND||(LA72_0 >= REGEX && LA72_0 <= REPLACE)||LA72_0==ROUND||(LA72_0 >= SAMETERM && LA72_0 <= SECONDS)||LA72_0==SHA1||(LA72_0 >= SHA256 && LA72_0 <= SHA512)||(LA72_0 >= STR && LA72_0 <= STRING)||(LA72_0 >= STRLANG && LA72_0 <= STRUUID)||LA72_0==SUBSTR||LA72_0==SUM||LA72_0==TIMEZONE||LA72_0==TZ||LA72_0==UCASE||LA72_0==URI||LA72_0==UUID||LA72_0==VAR||LA72_0==YEAR||(LA72_0 >= 268 && LA72_0 <= 273)||(LA72_0 >= 275 && LA72_0 <= 277)) ) {
                            alt72=1;
                        }


                        switch (alt72) {
                    	case 1 :
                    	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:633:5: e2= expression
                    	    {
                    	    pushFollow(FOLLOW_expression_in_argList5023);
                    	    e2=expression();

                    	    state._fsp--;
                    	    if (state.failed) return args;

                    	    if ( state.backtracking==0 ) { args.add(e2); }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt72 >= 1 ) break loop72;
                    	    if (state.backtracking>0) {state.failed=true; return args;}
                                EarlyExitException eee =
                                    new EarlyExitException(72, input);
                                throw eee;
                        }
                        cnt72++;
                    } while (true);


                    }
                    break;

            }
        }

        	catch(RecognitionException re) {
        		throw new SPARQLsyntaxError(re);
        	}

        finally {
        	// do for sure before leaving
        }
        return args;
    }
    // $ANTLR end "argList"



    // $ANTLR start "expressionList"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:636:1: expressionList returns [List<Expression> exprs] : ( NIL | (e= expression )+ );
    public final List<Expression> expressionList() throws RecognitionException {
        List<Expression> exprs = null;


        Expression e =null;


         exprs = new ArrayList<Expression>(); 
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:638:2: ( NIL | (e= expression )+ )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==NIL) ) {
                alt75=1;
            }
            else if ( (LA75_0==ABS||LA75_0==AVG||(LA75_0 >= BIG_DECIMAL && LA75_0 <= BIG_INTEGER)||(LA75_0 >= BNODE && LA75_0 <= BROKEN_PLUS)||LA75_0==CEIL||LA75_0==COALESCE||LA75_0==CONCAT||LA75_0==CONTAINS||LA75_0==COUNT||(LA75_0 >= DATATYPE && LA75_0 <= DAY)||LA75_0==DOUBLE||LA75_0==ENCODE_FOR_URI||LA75_0==EXISTS||LA75_0==EXPRESSION||LA75_0==FLOOR||LA75_0==FUNCTION||LA75_0==GROUP_CONCAT||LA75_0==HOURS||(LA75_0 >= IF && LA75_0 <= IN)||LA75_0==IRI||(LA75_0 >= ISBLANK && LA75_0 <= ISURI)||(LA75_0 >= LANG && LA75_0 <= LANGMATCHES)||LA75_0==LCASE||(LA75_0 >= LOGICAL_AND && LA75_0 <= LTE)||(LA75_0 >= MAX && LA75_0 <= MIN)||LA75_0==MINUTES||LA75_0==MONTH||(LA75_0 >= NOT && LA75_0 <= NOT_EXISTS)||LA75_0==NOW||(LA75_0 >= PREFIXED_NAME && LA75_0 <= PREFIXED_NS)||LA75_0==RAND||(LA75_0 >= REGEX && LA75_0 <= REPLACE)||LA75_0==ROUND||(LA75_0 >= SAMETERM && LA75_0 <= SECONDS)||LA75_0==SHA1||(LA75_0 >= SHA256 && LA75_0 <= SHA512)||(LA75_0 >= STR && LA75_0 <= STRING)||(LA75_0 >= STRLANG && LA75_0 <= STRUUID)||LA75_0==SUBSTR||LA75_0==SUM||LA75_0==TIMEZONE||LA75_0==TZ||LA75_0==UCASE||LA75_0==URI||LA75_0==UUID||LA75_0==VAR||LA75_0==YEAR||(LA75_0 >= 268 && LA75_0 <= 273)||(LA75_0 >= 275 && LA75_0 <= 277)) ) {
                alt75=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return exprs;}
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;

            }
            switch (alt75) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:638:6: NIL
                    {
                    match(input,NIL,FOLLOW_NIL_in_expressionList5058); if (state.failed) return exprs;

                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:639:6: (e= expression )+
                    {
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:639:6: (e= expression )+
                    int cnt74=0;
                    loop74:
                    do {
                        int alt74=2;
                        int LA74_0 = input.LA(1);

                        if ( (LA74_0==ABS||LA74_0==AVG||(LA74_0 >= BIG_DECIMAL && LA74_0 <= BIG_INTEGER)||(LA74_0 >= BNODE && LA74_0 <= BROKEN_PLUS)||LA74_0==CEIL||LA74_0==COALESCE||LA74_0==CONCAT||LA74_0==CONTAINS||LA74_0==COUNT||(LA74_0 >= DATATYPE && LA74_0 <= DAY)||LA74_0==DOUBLE||LA74_0==ENCODE_FOR_URI||LA74_0==EXISTS||LA74_0==EXPRESSION||LA74_0==FLOOR||LA74_0==FUNCTION||LA74_0==GROUP_CONCAT||LA74_0==HOURS||(LA74_0 >= IF && LA74_0 <= IN)||LA74_0==IRI||(LA74_0 >= ISBLANK && LA74_0 <= ISURI)||(LA74_0 >= LANG && LA74_0 <= LANGMATCHES)||LA74_0==LCASE||(LA74_0 >= LOGICAL_AND && LA74_0 <= LTE)||(LA74_0 >= MAX && LA74_0 <= MIN)||LA74_0==MINUTES||LA74_0==MONTH||(LA74_0 >= NOT && LA74_0 <= NOT_EXISTS)||LA74_0==NOW||(LA74_0 >= PREFIXED_NAME && LA74_0 <= PREFIXED_NS)||LA74_0==RAND||(LA74_0 >= REGEX && LA74_0 <= REPLACE)||LA74_0==ROUND||(LA74_0 >= SAMETERM && LA74_0 <= SECONDS)||LA74_0==SHA1||(LA74_0 >= SHA256 && LA74_0 <= SHA512)||(LA74_0 >= STR && LA74_0 <= STRING)||(LA74_0 >= STRLANG && LA74_0 <= STRUUID)||LA74_0==SUBSTR||LA74_0==SUM||LA74_0==TIMEZONE||LA74_0==TZ||LA74_0==UCASE||LA74_0==URI||LA74_0==UUID||LA74_0==VAR||LA74_0==YEAR||(LA74_0 >= 268 && LA74_0 <= 273)||(LA74_0 >= 275 && LA74_0 <= 277)) ) {
                            alt74=1;
                        }


                        switch (alt74) {
                    	case 1 :
                    	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:639:8: e= expression
                    	    {
                    	    pushFollow(FOLLOW_expression_in_expressionList5081);
                    	    e=expression();

                    	    state._fsp--;
                    	    if (state.failed) return exprs;

                    	    if ( state.backtracking==0 ) { exprs.add(e); }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt74 >= 1 ) break loop74;
                    	    if (state.backtracking>0) {state.failed=true; return exprs;}
                                EarlyExitException eee =
                                    new EarlyExitException(74, input);
                                throw eee;
                        }
                        cnt74++;
                    } while (true);


                    }
                    break;

            }
        }

        	catch(RecognitionException re) {
        		throw new SPARQLsyntaxError(re);
        	}

        finally {
        	// do for sure before leaving
        }
        return exprs;
    }
    // $ANTLR end "expressionList"



    // $ANTLR start "constructTemplate"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:643:1: constructTemplate[ConstructQuery cq] : ( constructTriples[$cq] )? ;
    public final void constructTemplate(ConstructQuery cq) throws RecognitionException {
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:644:2: ( ( constructTriples[$cq] )? )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:644:6: ( constructTriples[$cq] )?
            {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:644:6: ( constructTriples[$cq] )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( ((LA76_0 >= TRIPLE && LA76_0 <= TRIPLE2)) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:644:6: constructTriples[$cq]
                    {
                    pushFollow(FOLLOW_constructTriples_in_constructTemplate5101);
                    constructTriples(cq);

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }

        	catch(RecognitionException re) {
        		throw new SPARQLsyntaxError(re);
        	}

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "constructTemplate"



    // $ANTLR start "constructTriples"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:647:1: constructTriples[ConstructQuery cq] : (t= triples |t2= triples2 )+ ;
    public final void constructTriples(ConstructQuery cq) throws RecognitionException {
        QueryTriple t =null;

        QueryTriple2 t2 =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:648:2: ( (t= triples |t2= triples2 )+ )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:648:6: (t= triples |t2= triples2 )+
            {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:648:6: (t= triples |t2= triples2 )+
            int cnt77=0;
            loop77:
            do {
                int alt77=3;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==TRIPLE) ) {
                    alt77=1;
                }
                else if ( (LA77_0==TRIPLE2) ) {
                    alt77=2;
                }


                switch (alt77) {
            	case 1 :
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:648:8: t= triples
            	    {
            	    pushFollow(FOLLOW_triples_in_constructTriples5122);
            	    t=triples();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    if ( state.backtracking==0 ) {cq.addConstructPattern(t);}

            	    }
            	    break;
            	case 2 :
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:649:5: t2= triples2
            	    {
            	    pushFollow(FOLLOW_triples2_in_constructTriples5133);
            	    t2=triples2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    if ( state.backtracking==0 ) {cq.addConstructPattern(t2);}

            	    }
            	    break;

            	default :
            	    if ( cnt77 >= 1 ) break loop77;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(77, input);
                        throw eee;
                }
                cnt77++;
            } while (true);


            }

        }

        	catch(RecognitionException re) {
        		throw new SPARQLsyntaxError(re);
        	}

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "constructTriples"



    // $ANTLR start "triplesSameSubject"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:653:1: triplesSameSubject[ConstructQuery cq] returns [SimplePattern sp] : ( (t1= triples )+ |t12= triples2 );
    public final SimplePattern triplesSameSubject(ConstructQuery cq) throws RecognitionException {
        SimplePattern sp = null;


        QueryTriple t1 =null;

        QueryTriple2 t12 =null;


         sp = new SimplePattern(); 
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:655:2: ( (t1= triples )+ |t12= triples2 )
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==TRIPLE) ) {
                alt79=1;
            }
            else if ( (LA79_0==TRIPLE2) ) {
                alt79=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return sp;}
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;

            }
            switch (alt79) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:655:4: (t1= triples )+
                    {
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:655:4: (t1= triples )+
                    int cnt78=0;
                    loop78:
                    do {
                        int alt78=2;
                        int LA78_0 = input.LA(1);

                        if ( (LA78_0==TRIPLE) ) {
                            alt78=1;
                        }


                        switch (alt78) {
                    	case 1 :
                    	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:655:5: t1= triples
                    	    {
                    	    pushFollow(FOLLOW_triples_in_triplesSameSubject5170);
                    	    t1=triples();

                    	    state._fsp--;
                    	    if (state.failed) return sp;

                    	    if ( state.backtracking==0 ) { cq.addConstructPattern(t1); t1.expandAndAddTo(sp); }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt78 >= 1 ) break loop78;
                    	    if (state.backtracking>0) {state.failed=true; return sp;}
                                EarlyExitException eee =
                                    new EarlyExitException(78, input);
                                throw eee;
                        }
                        cnt78++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:656:4: t12= triples2
                    {
                    pushFollow(FOLLOW_triples2_in_triplesSameSubject5182);
                    t12=triples2();

                    state._fsp--;
                    if (state.failed) return sp;

                    if ( state.backtracking==0 ) { cq.addConstructPattern(t12); t12.expandAndAddTo(sp); }

                    }
                    break;

            }
        }

        	catch(RecognitionException re) {
        		throw new SPARQLsyntaxError(re);
        	}

        finally {
        	// do for sure before leaving
        }
        return sp;
    }
    // $ANTLR end "triplesSameSubject"



    // $ANTLR start "object"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:659:1: object returns [GraphNode r] : g= graphNode ;
    public final GraphNode object() throws RecognitionException {
        GraphNode r = null;


        GraphNode g =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:660:2: (g= graphNode )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:660:6: g= graphNode
            {
            pushFollow(FOLLOW_graphNode_in_object5204);
            g=graphNode();

            state._fsp--;
            if (state.failed) return r;

            if ( state.backtracking==0 ) { r = g; }

            }

        }

        	catch(RecognitionException re) {
        		throw new SPARQLsyntaxError(re);
        	}

        finally {
        	// do for sure before leaving
        }
        return r;
    }
    // $ANTLR end "object"



    // $ANTLR start "verb"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:663:1: verb returns [QueryTripleTerm t] : (v= varOrIRIref | 'a' );
    public final QueryTripleTerm verb() throws RecognitionException {
        QueryTripleTerm t = null;


        QueryTripleTerm v =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:664:2: (v= varOrIRIref | 'a' )
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==IRI||(LA80_0 >= PREFIXED_NAME && LA80_0 <= PREFIXED_NS)||LA80_0==VAR) ) {
                alt80=1;
            }
            else if ( (LA80_0==281) ) {
                alt80=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return t;}
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;

            }
            switch (alt80) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:664:6: v= varOrIRIref
                    {
                    pushFollow(FOLLOW_varOrIRIref_in_verb5226);
                    v=varOrIRIref();

                    state._fsp--;
                    if (state.failed) return t;

                    if ( state.backtracking==0 ) { t = v; }

                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:665:5: 'a'
                    {
                    match(input,281,FOLLOW_281_in_verb5236); if (state.failed) return t;

                    if ( state.backtracking==0 ) { t = new QueryTripleTerm(new IRI("http://www.w3.org/1999/02/22-rdf-syntax-ns#type")); }

                    }
                    break;

            }
        }

        	catch(RecognitionException re) {
        		throw new SPARQLsyntaxError(re);
        	}

        finally {
        	// do for sure before leaving
        }
        return t;
    }
    // $ANTLR end "verb"



    // $ANTLR start "verbPath"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:668:1: verbPath : path ;
    public final void verbPath() throws RecognitionException {
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:669:2: ( path )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:669:6: path
            {
            pushFollow(FOLLOW_path_in_verbPath5254);
            path();

            state._fsp--;
            if (state.failed) return ;

            }

        }

        	catch(RecognitionException re) {
        		throw new SPARQLsyntaxError(re);
        	}

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "verbPath"



    // $ANTLR start "verbSimple"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:672:1: verbSimple returns [Variable v] : x= var ;
    public final Variable verbSimple() throws RecognitionException {
        Variable v = null;


        String x =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:673:2: (x= var )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:673:6: x= var
            {
            pushFollow(FOLLOW_var_in_verbSimple5273);
            x=var();

            state._fsp--;
            if (state.failed) return v;

            if ( state.backtracking==0 ) { v = new Variable(x);}

            }

        }

        	catch(RecognitionException re) {
        		throw new SPARQLsyntaxError(re);
        	}

        finally {
        	// do for sure before leaving
        }
        return v;
    }
    // $ANTLR end "verbSimple"



    // $ANTLR start "path"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:676:1: path : pathAlternative ;
    public final void path() throws RecognitionException {
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:677:2: ( pathAlternative )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:677:6: pathAlternative
            {
            pushFollow(FOLLOW_pathAlternative_in_path5290);
            pathAlternative();

            state._fsp--;
            if (state.failed) return ;

            }

        }

        	catch(RecognitionException re) {
        		throw new SPARQLsyntaxError(re);
        	}

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "path"



    // $ANTLR start "pathAlternative"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:680:1: pathAlternative : pathSequence ( '|' pathSequence )* ;
    public final void pathAlternative() throws RecognitionException {
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:681:2: ( pathSequence ( '|' pathSequence )* )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:681:6: pathSequence ( '|' pathSequence )*
            {
            pushFollow(FOLLOW_pathSequence_in_pathAlternative5303);
            pathSequence();

            state._fsp--;
            if (state.failed) return ;

            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:681:19: ( '|' pathSequence )*
            loop81:
            do {
                int alt81=2;
                int LA81_0 = input.LA(1);

                if ( (LA81_0==282) ) {
                    alt81=1;
                }


                switch (alt81) {
            	case 1 :
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:681:21: '|' pathSequence
            	    {
            	    match(input,282,FOLLOW_282_in_pathAlternative5307); if (state.failed) return ;

            	    pushFollow(FOLLOW_pathSequence_in_pathAlternative5309);
            	    pathSequence();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop81;
                }
            } while (true);


            }

        }

        	catch(RecognitionException re) {
        		throw new SPARQLsyntaxError(re);
        	}

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "pathAlternative"



    // $ANTLR start "pathSequence"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:684:1: pathSequence : pathEltOrInverse ( '/' pathEltOrInverse )* ;
    public final void pathSequence() throws RecognitionException {
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:685:2: ( pathEltOrInverse ( '/' pathEltOrInverse )* )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:685:7: pathEltOrInverse ( '/' pathEltOrInverse )*
            {
            pushFollow(FOLLOW_pathEltOrInverse_in_pathSequence5326);
            pathEltOrInverse();

            state._fsp--;
            if (state.failed) return ;

            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:685:24: ( '/' pathEltOrInverse )*
            loop82:
            do {
                int alt82=2;
                int LA82_0 = input.LA(1);

                if ( (LA82_0==273) ) {
                    alt82=1;
                }


                switch (alt82) {
            	case 1 :
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:685:26: '/' pathEltOrInverse
            	    {
            	    match(input,273,FOLLOW_273_in_pathSequence5330); if (state.failed) return ;

            	    pushFollow(FOLLOW_pathEltOrInverse_in_pathSequence5332);
            	    pathEltOrInverse();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop82;
                }
            } while (true);


            }

        }

        	catch(RecognitionException re) {
        		throw new SPARQLsyntaxError(re);
        	}

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "pathSequence"



    // $ANTLR start "pathElt"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:688:1: pathElt : pathPrimary ( pathMod )? ;
    public final void pathElt() throws RecognitionException {
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:689:2: ( pathPrimary ( pathMod )? )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:689:7: pathPrimary ( pathMod )?
            {
            pushFollow(FOLLOW_pathPrimary_in_pathElt5349);
            pathPrimary();

            state._fsp--;
            if (state.failed) return ;

            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:689:19: ( pathMod )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( ((LA83_0 >= 270 && LA83_0 <= 271)||LA83_0==278) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:689:19: pathMod
                    {
                    pushFollow(FOLLOW_pathMod_in_pathElt5351);
                    pathMod();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }

        	catch(RecognitionException re) {
        		throw new SPARQLsyntaxError(re);
        	}

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "pathElt"



    // $ANTLR start "pathEltOrInverse"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:692:1: pathEltOrInverse : ( pathElt | '^' pathElt );
    public final void pathEltOrInverse() throws RecognitionException {
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:693:2: ( pathElt | '^' pathElt )
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==IRI||LA84_0==OPEN_BRACE||(LA84_0 >= PREFIXED_NAME && LA84_0 <= PREFIXED_NS)||LA84_0==268||LA84_0==281) ) {
                alt84=1;
            }
            else if ( (LA84_0==279) ) {
                alt84=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 84, 0, input);

                throw nvae;

            }
            switch (alt84) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:693:7: pathElt
                    {
                    pushFollow(FOLLOW_pathElt_in_pathEltOrInverse5366);
                    pathElt();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:693:17: '^' pathElt
                    {
                    match(input,279,FOLLOW_279_in_pathEltOrInverse5370); if (state.failed) return ;

                    pushFollow(FOLLOW_pathElt_in_pathEltOrInverse5372);
                    pathElt();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }

        	catch(RecognitionException re) {
        		throw new SPARQLsyntaxError(re);
        	}

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "pathEltOrInverse"



    // $ANTLR start "pathMod"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:696:1: pathMod returns [Path.PathMod v] : ( '*' | '?' | '+' );
    public final Path.PathMod pathMod() throws RecognitionException {
        Path.PathMod v = null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:697:2: ( '*' | '?' | '+' )
            int alt85=3;
            switch ( input.LA(1) ) {
            case 270:
                {
                alt85=1;
                }
                break;
            case 278:
                {
                alt85=2;
                }
                break;
            case 271:
                {
                alt85=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return v;}
                NoViableAltException nvae =
                    new NoViableAltException("", 85, 0, input);

                throw nvae;

            }

            switch (alt85) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:697:4: '*'
                    {
                    match(input,270,FOLLOW_270_in_pathMod5387); if (state.failed) return v;

                    if ( state.backtracking==0 ) { v = Path.PathMod.ZERO_OR_MORE; }

                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:698:4: '?'
                    {
                    match(input,278,FOLLOW_278_in_pathMod5396); if (state.failed) return v;

                    if ( state.backtracking==0 ) { v = Path.PathMod.ZERO_OR_ONE; }

                    }
                    break;
                case 3 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:699:4: '+'
                    {
                    match(input,271,FOLLOW_271_in_pathMod5405); if (state.failed) return v;

                    if ( state.backtracking==0 ) { v = Path.PathMod.ONE_OR_MORE; }

                    }
                    break;

            }
        }

        	catch(RecognitionException re) {
        		throw new SPARQLsyntaxError(re);
        	}

        finally {
        	// do for sure before leaving
        }
        return v;
    }
    // $ANTLR end "pathMod"



    // $ANTLR start "pathPrimary"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:702:1: pathPrimary : ( iRIref | 'a' | '!' pathNegatedPropertySet | OPEN_BRACE path CLOSE_BRACE );
    public final void pathPrimary() throws RecognitionException {
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:703:2: ( iRIref | 'a' | '!' pathNegatedPropertySet | OPEN_BRACE path CLOSE_BRACE )
            int alt86=4;
            switch ( input.LA(1) ) {
            case IRI:
            case PREFIXED_NAME:
            case PREFIXED_NS:
                {
                alt86=1;
                }
                break;
            case 281:
                {
                alt86=2;
                }
                break;
            case 268:
                {
                alt86=3;
                }
                break;
            case OPEN_BRACE:
                {
                alt86=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 86, 0, input);

                throw nvae;

            }

            switch (alt86) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:703:7: iRIref
                    {
                    pushFollow(FOLLOW_iRIref_in_pathPrimary5423);
                    iRIref();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:703:16: 'a'
                    {
                    match(input,281,FOLLOW_281_in_pathPrimary5427); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:703:22: '!' pathNegatedPropertySet
                    {
                    match(input,268,FOLLOW_268_in_pathPrimary5431); if (state.failed) return ;

                    pushFollow(FOLLOW_pathNegatedPropertySet_in_pathPrimary5433);
                    pathNegatedPropertySet();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:703:51: OPEN_BRACE path CLOSE_BRACE
                    {
                    match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_pathPrimary5437); if (state.failed) return ;

                    pushFollow(FOLLOW_path_in_pathPrimary5439);
                    path();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_pathPrimary5441); if (state.failed) return ;

                    }
                    break;

            }
        }

        	catch(RecognitionException re) {
        		throw new SPARQLsyntaxError(re);
        	}

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "pathPrimary"



    // $ANTLR start "pathNegatedPropertySet"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:706:1: pathNegatedPropertySet returns [Pair<? extends List<IRI>, ? extends List<IRI>> pair] : (v= pathOneInPropertySet | OPEN_BRACE (v1= pathOneInPropertySet ( '|' v2= pathOneInPropertySet )* )? CLOSE_BRACE );
    public final Pair<? extends List<IRI>, ? extends List<IRI>> pathNegatedPropertySet() throws RecognitionException {
        Pair<? extends List<IRI>, ? extends List<IRI>> pair = null;


        Pair<IRI, Boolean> v =null;

        Pair<IRI, Boolean> v1 =null;

        Pair<IRI, Boolean> v2 =null;


         pair = Pair.make(new LinkedList<IRI>(), new LinkedList<IRI>()); 
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:708:2: (v= pathOneInPropertySet | OPEN_BRACE (v1= pathOneInPropertySet ( '|' v2= pathOneInPropertySet )* )? CLOSE_BRACE )
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( ((LA89_0 >= INV && LA89_0 <= IRI)||(LA89_0 >= PREFIXED_NAME && LA89_0 <= PREFIXED_NS)||LA89_0==281) ) {
                alt89=1;
            }
            else if ( (LA89_0==OPEN_BRACE) ) {
                alt89=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return pair;}
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 0, input);

                throw nvae;

            }
            switch (alt89) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:708:7: v= pathOneInPropertySet
                    {
                    pushFollow(FOLLOW_pathOneInPropertySet_in_pathNegatedPropertySet5471);
                    v=pathOneInPropertySet();

                    state._fsp--;
                    if (state.failed) return pair;

                    if ( state.backtracking==0 ) { if (v.snd ) { pair.fst.add(v.fst); } else {pair.snd.add(v.fst);} }

                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:709:4: OPEN_BRACE (v1= pathOneInPropertySet ( '|' v2= pathOneInPropertySet )* )? CLOSE_BRACE
                    {
                    match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_pathNegatedPropertySet5479); if (state.failed) return pair;

                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:709:15: (v1= pathOneInPropertySet ( '|' v2= pathOneInPropertySet )* )?
                    int alt88=2;
                    int LA88_0 = input.LA(1);

                    if ( ((LA88_0 >= INV && LA88_0 <= IRI)||(LA88_0 >= PREFIXED_NAME && LA88_0 <= PREFIXED_NS)||LA88_0==281) ) {
                        alt88=1;
                    }
                    switch (alt88) {
                        case 1 :
                            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:709:17: v1= pathOneInPropertySet ( '|' v2= pathOneInPropertySet )*
                            {
                            pushFollow(FOLLOW_pathOneInPropertySet_in_pathNegatedPropertySet5487);
                            v1=pathOneInPropertySet();

                            state._fsp--;
                            if (state.failed) return pair;

                            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:709:43: ( '|' v2= pathOneInPropertySet )*
                            loop87:
                            do {
                                int alt87=2;
                                int LA87_0 = input.LA(1);

                                if ( (LA87_0==282) ) {
                                    alt87=1;
                                }


                                switch (alt87) {
                            	case 1 :
                            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:709:45: '|' v2= pathOneInPropertySet
                            	    {
                            	    match(input,282,FOLLOW_282_in_pathNegatedPropertySet5491); if (state.failed) return pair;

                            	    pushFollow(FOLLOW_pathOneInPropertySet_in_pathNegatedPropertySet5497);
                            	    v2=pathOneInPropertySet();

                            	    state._fsp--;
                            	    if (state.failed) return pair;

                            	    if ( state.backtracking==0 ) { if (v2.snd ) { pair.fst.add(v2.fst); } else {pair.snd.add(v2.fst);} }

                            	    }
                            	    break;

                            	default :
                            	    break loop87;
                                }
                            } while (true);


                            }
                            break;

                    }


                    match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_pathNegatedPropertySet5508); if (state.failed) return pair;

                    if ( state.backtracking==0 ) {if (v1.snd ) { pair.fst.add(0,v1.fst); } else {pair.snd.add(0, v1.fst);} }

                    }
                    break;

            }
        }

        	catch(RecognitionException re) {
        		throw new SPARQLsyntaxError(re);
        	}

        finally {
        	// do for sure before leaving
        }
        return pair;
    }
    // $ANTLR end "pathNegatedPropertySet"



    // $ANTLR start "pathOneInPropertySet"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:713:1: pathOneInPropertySet returns [Pair<IRI, Boolean> v ] : (i= iRIref | 'a' | ^( INV invi= iRIrefOrRDFType ) );
    public final Pair<IRI, Boolean> pathOneInPropertySet() throws RecognitionException {
        Pair<IRI, Boolean> v = null;


        IRI i =null;

        IRI invi =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:714:4: (i= iRIref | 'a' | ^( INV invi= iRIrefOrRDFType ) )
            int alt90=3;
            switch ( input.LA(1) ) {
            case IRI:
            case PREFIXED_NAME:
            case PREFIXED_NS:
                {
                alt90=1;
                }
                break;
            case 281:
                {
                alt90=2;
                }
                break;
            case INV:
                {
                alt90=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return v;}
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                throw nvae;

            }

            switch (alt90) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:714:7: i= iRIref
                    {
                    pushFollow(FOLLOW_iRIref_in_pathOneInPropertySet5536);
                    i=iRIref();

                    state._fsp--;
                    if (state.failed) return v;

                    if ( state.backtracking==0 ) { v = Pair.make(i, true); }

                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:715:4: 'a'
                    {
                    match(input,281,FOLLOW_281_in_pathOneInPropertySet5543); if (state.failed) return v;

                    if ( state.backtracking==0 ) { v = Pair.make(new IRI("http://www.w3.org/1999/02/22-rdf-syntax-ns#type"), true); }

                    }
                    break;
                case 3 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:716:4: ^( INV invi= iRIrefOrRDFType )
                    {
                    match(input,INV,FOLLOW_INV_in_pathOneInPropertySet5552); if (state.failed) return v;

                    match(input, Token.DOWN, null); if (state.failed) return v;
                    pushFollow(FOLLOW_iRIrefOrRDFType_in_pathOneInPropertySet5558);
                    invi=iRIrefOrRDFType();

                    state._fsp--;
                    if (state.failed) return v;

                    match(input, Token.UP, null); if (state.failed) return v;


                    if ( state.backtracking==0 ) { v = Pair.make(invi, false); }

                    }
                    break;

            }
        }

        	catch(RecognitionException re) {
        		throw new SPARQLsyntaxError(re);
        	}

        finally {
        	// do for sure before leaving
        }
        return v;
    }
    // $ANTLR end "pathOneInPropertySet"



    // $ANTLR start "iRIrefOrRDFType"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:719:1: iRIrefOrRDFType returns [ IRI v ] : (i= iRIref | 'a' );
    public final IRI iRIrefOrRDFType() throws RecognitionException {
        IRI v = null;


        IRI i =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:720:4: (i= iRIref | 'a' )
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==IRI||(LA91_0 >= PREFIXED_NAME && LA91_0 <= PREFIXED_NS)) ) {
                alt91=1;
            }
            else if ( (LA91_0==281) ) {
                alt91=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return v;}
                NoViableAltException nvae =
                    new NoViableAltException("", 91, 0, input);

                throw nvae;

            }
            switch (alt91) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:720:6: i= iRIref
                    {
                    pushFollow(FOLLOW_iRIref_in_iRIrefOrRDFType5585);
                    i=iRIref();

                    state._fsp--;
                    if (state.failed) return v;

                    if ( state.backtracking==0 ) { v = i;}

                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:721:6: 'a'
                    {
                    match(input,281,FOLLOW_281_in_iRIrefOrRDFType5594); if (state.failed) return v;

                    if ( state.backtracking==0 ) { v = new IRI("http://www.w3.org/1999/02/22-rdf-syntax-ns#type"); }

                    }
                    break;

            }
        }

        	catch(RecognitionException re) {
        		throw new SPARQLsyntaxError(re);
        	}

        finally {
        	// do for sure before leaving
        }
        return v;
    }
    // $ANTLR end "iRIrefOrRDFType"



    // $ANTLR start "integer"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:724:1: integer : INTEGER ;
    public final void integer() throws RecognitionException {
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:725:2: ( INTEGER )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:725:7: INTEGER
            {
            match(input,INTEGER,FOLLOW_INTEGER_in_integer5615); if (state.failed) return ;

            }

        }

        	catch(RecognitionException re) {
        		throw new SPARQLsyntaxError(re);
        	}

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "integer"



    // $ANTLR start "triplesNode"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:728:1: triplesNode returns [TriplesNode tn] : ^( TRIPLES_NODE (c= collection |b= blankNodePropertyList ) ) ;
    public final TriplesNode triplesNode() throws RecognitionException {
        TriplesNode tn = null;


        RDFCollection c =null;

        PropertyList b =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:729:2: ( ^( TRIPLES_NODE (c= collection |b= blankNodePropertyList ) ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:729:6: ^( TRIPLES_NODE (c= collection |b= blankNodePropertyList ) )
            {
            match(input,TRIPLES_NODE,FOLLOW_TRIPLES_NODE_in_triplesNode5634); if (state.failed) return tn;

            match(input, Token.DOWN, null); if (state.failed) return tn;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:730:5: (c= collection |b= blankNodePropertyList )
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==COLLECTION) ) {
                alt92=1;
            }
            else if ( (LA92_0==PROPERTY_LIST) ) {
                alt92=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return tn;}
                NoViableAltException nvae =
                    new NoViableAltException("", 92, 0, input);

                throw nvae;

            }
            switch (alt92) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:730:7: c= collection
                    {
                    pushFollow(FOLLOW_collection_in_triplesNode5645);
                    c=collection();

                    state._fsp--;
                    if (state.failed) return tn;

                    if ( state.backtracking==0 ) { tn = new TriplesNode(c);}

                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:731:8: b= blankNodePropertyList
                    {
                    pushFollow(FOLLOW_blankNodePropertyList_in_triplesNode5662);
                    b=blankNodePropertyList();

                    state._fsp--;
                    if (state.failed) return tn;

                    if ( state.backtracking==0 ) { tn = new TriplesNode(b);}

                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return tn;


            }

        }

        	catch(RecognitionException re) {
        		throw new SPARQLsyntaxError(re);
        	}

        finally {
        	// do for sure before leaving
        }
        return tn;
    }
    // $ANTLR end "triplesNode"



    // $ANTLR start "blankNodePropertyList"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:736:1: blankNodePropertyList returns [PropertyList pl] : ^( PROPERTY_LIST ( ^( PREDICATE v= predicate ) ^( VALUE (o= graphNode )+ ) )+ ) ;
    public final PropertyList blankNodePropertyList() throws RecognitionException {
        PropertyList pl = null;


        BinaryUnion<Variable, Path> v =null;

        GraphNode o =null;



        			pl = new PropertyList(); 
        			PropertyListElement e = null;
        		
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:741:2: ( ^( PROPERTY_LIST ( ^( PREDICATE v= predicate ) ^( VALUE (o= graphNode )+ ) )+ ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:741:4: ^( PROPERTY_LIST ( ^( PREDICATE v= predicate ) ^( VALUE (o= graphNode )+ ) )+ )
            {
            match(input,PROPERTY_LIST,FOLLOW_PROPERTY_LIST_in_blankNodePropertyList5701); if (state.failed) return pl;

            match(input, Token.DOWN, null); if (state.failed) return pl;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:742:6: ( ^( PREDICATE v= predicate ) ^( VALUE (o= graphNode )+ ) )+
            int cnt94=0;
            loop94:
            do {
                int alt94=2;
                int LA94_0 = input.LA(1);

                if ( (LA94_0==PREDICATE) ) {
                    alt94=1;
                }


                switch (alt94) {
            	case 1 :
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:742:8: ^( PREDICATE v= predicate ) ^( VALUE (o= graphNode )+ )
            	    {
            	    if ( state.backtracking==0 ) { e = new PropertyListElement(); }

            	    match(input,PREDICATE,FOLLOW_PREDICATE_in_blankNodePropertyList5722); if (state.failed) return pl;

            	    match(input, Token.DOWN, null); if (state.failed) return pl;
            	    pushFollow(FOLLOW_predicate_in_blankNodePropertyList5726);
            	    v=predicate();

            	    state._fsp--;
            	    if (state.failed) return pl;

            	    match(input, Token.UP, null); if (state.failed) return pl;


            	    if ( state.backtracking==0 ) {e.setVerb(v);}

            	    match(input,VALUE,FOLLOW_VALUE_in_blankNodePropertyList5741); if (state.failed) return pl;

            	    match(input, Token.DOWN, null); if (state.failed) return pl;
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:744:17: (o= graphNode )+
            	    int cnt93=0;
            	    loop93:
            	    do {
            	        int alt93=2;
            	        int LA93_0 = input.LA(1);

            	        if ( (LA93_0==ANNON||(LA93_0 >= BIG_DECIMAL && LA93_0 <= BIG_INTEGER)||LA93_0==BLANK_NODE_LABEL||LA93_0==BOOLEAN||LA93_0==DOUBLE||LA93_0==IRI||LA93_0==NIL||(LA93_0 >= PREFIXED_NAME && LA93_0 <= PREFIXED_NS)||LA93_0==STRING||LA93_0==TRIPLES_NODE||LA93_0==VAR) ) {
            	            alt93=1;
            	        }


            	        switch (alt93) {
            	    	case 1 :
            	    	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:744:18: o= graphNode
            	    	    {
            	    	    pushFollow(FOLLOW_graphNode_in_blankNodePropertyList5746);
            	    	    o=graphNode();

            	    	    state._fsp--;
            	    	    if (state.failed) return pl;

            	    	    if ( state.backtracking==0 ) {e.addObject(o);}

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt93 >= 1 ) break loop93;
            	    	    if (state.backtracking>0) {state.failed=true; return pl;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(93, input);
            	                throw eee;
            	        }
            	        cnt93++;
            	    } while (true);


            	    match(input, Token.UP, null); if (state.failed) return pl;


            	    if ( state.backtracking==0 ) { pl.add(e); }

            	    }
            	    break;

            	default :
            	    if ( cnt94 >= 1 ) break loop94;
            	    if (state.backtracking>0) {state.failed=true; return pl;}
                        EarlyExitException eee =
                            new EarlyExitException(94, input);
                        throw eee;
                }
                cnt94++;
            } while (true);


            match(input, Token.UP, null); if (state.failed) return pl;


            }

        }

        	catch(RecognitionException re) {
        		throw new SPARQLsyntaxError(re);
        	}

        finally {
        	// do for sure before leaving
        }
        return pl;
    }
    // $ANTLR end "blankNodePropertyList"



    // $ANTLR start "predicate"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:750:1: predicate returns [BinaryUnion<Variable, Path> p] : (v= var |i= iRIref | 'a' | ^( ALT (alt= predicate )* ) | ^( SEQ (seq= predicate )* ) | ^( ELT pred= predicate mod= pathMod ) | ^( INV pred= predicate ) | '!' neg= pathNegatedPropertySet );
    public final BinaryUnion<Variable, Path> predicate() throws RecognitionException {
        BinaryUnion<Variable, Path> p = null;


        String v =null;

        IRI i =null;

        BinaryUnion<Variable, Path> alt =null;

        BinaryUnion<Variable, Path> seq =null;

        BinaryUnion<Variable, Path> pred =null;

        Path.PathMod mod =null;

        Pair<? extends List<IRI>, ? extends List<IRI>> neg =null;


         p = new BinaryUnion<Variable, Path>(); 
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:752:2: (v= var |i= iRIref | 'a' | ^( ALT (alt= predicate )* ) | ^( SEQ (seq= predicate )* ) | ^( ELT pred= predicate mod= pathMod ) | ^( INV pred= predicate ) | '!' neg= pathNegatedPropertySet )
            int alt97=8;
            switch ( input.LA(1) ) {
            case VAR:
                {
                alt97=1;
                }
                break;
            case IRI:
            case PREFIXED_NAME:
            case PREFIXED_NS:
                {
                alt97=2;
                }
                break;
            case 281:
                {
                alt97=3;
                }
                break;
            case ALT:
                {
                alt97=4;
                }
                break;
            case SEQ:
                {
                alt97=5;
                }
                break;
            case ELT:
                {
                alt97=6;
                }
                break;
            case INV:
                {
                alt97=7;
                }
                break;
            case 268:
                {
                alt97=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return p;}
                NoViableAltException nvae =
                    new NoViableAltException("", 97, 0, input);

                throw nvae;

            }

            switch (alt97) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:752:4: v= var
                    {
                    pushFollow(FOLLOW_var_in_predicate5802);
                    v=var();

                    state._fsp--;
                    if (state.failed) return p;

                    if ( state.backtracking==0 ) { p.setFirst(new Variable(v));  }

                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:753:4: i= iRIref
                    {
                    pushFollow(FOLLOW_iRIref_in_predicate5817);
                    i=iRIref();

                    state._fsp--;
                    if (state.failed) return p;

                    if ( state.backtracking==0 ) { p.setSecond(new SimplePath(i)); }

                    }
                    break;
                case 3 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:754:5: 'a'
                    {
                    match(input,281,FOLLOW_281_in_predicate5828); if (state.failed) return p;

                    if ( state.backtracking==0 ) { p.setSecond(new SimplePath(new IRI("http://www.w3.org/1999/02/22-rdf-syntax-ns#type"))); }

                    }
                    break;
                case 4 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:755:9: ^( ALT (alt= predicate )* )
                    {
                    match(input,ALT,FOLLOW_ALT_in_predicate5843); if (state.failed) return p;

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return p;
                        // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:755:15: (alt= predicate )*
                        loop95:
                        do {
                            int alt95=2;
                            int LA95_0 = input.LA(1);

                            if ( (LA95_0==ALT||LA95_0==ELT||(LA95_0 >= INV && LA95_0 <= IRI)||(LA95_0 >= PREFIXED_NAME && LA95_0 <= PREFIXED_NS)||LA95_0==SEQ||LA95_0==VAR||LA95_0==268||LA95_0==281) ) {
                                alt95=1;
                            }


                            switch (alt95) {
                        	case 1 :
                        	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:755:16: alt= predicate
                        	    {
                        	    pushFollow(FOLLOW_predicate_in_predicate5848);
                        	    alt=predicate();

                        	    state._fsp--;
                        	    if (state.failed) return p;

                        	    if ( state.backtracking==0 ) { 
                        	        		if (!p.isFirstType() && !p.isSecondType()) { 
                        	        			assert alt.isSecondType(): alt; 
                        	        			p = alt;
                        	        		} else { 
                        	        			p.setSecond(new AltPath(p.getSecond(), alt.getSecond())); 
                        	        		} 
                        	        	}

                        	    }
                        	    break;

                        	default :
                        	    break loop95;
                            }
                        } while (true);


                        match(input, Token.UP, null); if (state.failed) return p;
                    }


                    }
                    break;
                case 5 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:763:9: ^( SEQ (seq= predicate )* )
                    {
                    match(input,SEQ,FOLLOW_SEQ_in_predicate5864); if (state.failed) return p;

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return p;
                        // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:763:15: (seq= predicate )*
                        loop96:
                        do {
                            int alt96=2;
                            int LA96_0 = input.LA(1);

                            if ( (LA96_0==ALT||LA96_0==ELT||(LA96_0 >= INV && LA96_0 <= IRI)||(LA96_0 >= PREFIXED_NAME && LA96_0 <= PREFIXED_NS)||LA96_0==SEQ||LA96_0==VAR||LA96_0==268||LA96_0==281) ) {
                                alt96=1;
                            }


                            switch (alt96) {
                        	case 1 :
                        	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:763:16: seq= predicate
                        	    {
                        	    pushFollow(FOLLOW_predicate_in_predicate5869);
                        	    seq=predicate();

                        	    state._fsp--;
                        	    if (state.failed) return p;

                        	    if ( state.backtracking==0 ) { 
                        	        		if (!p.isFirstType() && !p.isSecondType()) { 
                        	        			assert seq.isSecondType(): seq; 
                        	        			p = seq;
                        	        		} else { 
                        	        			p.setSecond(new SeqPath(p.getSecond(), seq.getSecond())); 
                        	        		} 
                        	        	}

                        	    }
                        	    break;

                        	default :
                        	    break loop96;
                            }
                        } while (true);


                        match(input, Token.UP, null); if (state.failed) return p;
                    }


                    }
                    break;
                case 6 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:771:9: ^( ELT pred= predicate mod= pathMod )
                    {
                    match(input,ELT,FOLLOW_ELT_in_predicate5885); if (state.failed) return p;

                    match(input, Token.DOWN, null); if (state.failed) return p;
                    pushFollow(FOLLOW_predicate_in_predicate5889);
                    pred=predicate();

                    state._fsp--;
                    if (state.failed) return p;

                    pushFollow(FOLLOW_pathMod_in_predicate5895);
                    mod=pathMod();

                    state._fsp--;
                    if (state.failed) return p;

                    match(input, Token.UP, null); if (state.failed) return p;


                    if ( state.backtracking==0 ) { p.setSecond(Path.createPath(pred.getSecond(), mod)) ; }

                    }
                    break;
                case 7 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:772:9: ^( INV pred= predicate )
                    {
                    match(input,INV,FOLLOW_INV_in_predicate5910); if (state.failed) return p;

                    match(input, Token.DOWN, null); if (state.failed) return p;
                    pushFollow(FOLLOW_predicate_in_predicate5914);
                    pred=predicate();

                    state._fsp--;
                    if (state.failed) return p;

                    match(input, Token.UP, null); if (state.failed) return p;


                    if ( state.backtracking==0 ) { p.setSecond(new InvPath(pred.getSecond())) ; }

                    }
                    break;
                case 8 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:773:7: '!' neg= pathNegatedPropertySet
                    {
                    match(input,268,FOLLOW_268_in_predicate5925); if (state.failed) return p;

                    pushFollow(FOLLOW_pathNegatedPropertySet_in_predicate5931);
                    neg=pathNegatedPropertySet();

                    state._fsp--;
                    if (state.failed) return p;

                    if ( state.backtracking==0 ) { p.setSecond(new NegatedProperySetPath(neg.fst, neg.snd)); }

                    }
                    break;

            }
        }

        	catch(RecognitionException re) {
        		throw new SPARQLsyntaxError(re);
        	}

        finally {
        	// do for sure before leaving
        }
        return p;
    }
    // $ANTLR end "predicate"



    // $ANTLR start "collection"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:776:1: collection returns [RDFCollection c] : ^( COLLECTION (g= graphNode )+ ) ;
    public final RDFCollection collection() throws RecognitionException {
        RDFCollection c = null;


        GraphNode g =null;


         c = new RDFCollection(); 
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:778:2: ( ^( COLLECTION (g= graphNode )+ ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:778:7: ^( COLLECTION (g= graphNode )+ )
            {
            match(input,COLLECTION,FOLLOW_COLLECTION_in_collection5959); if (state.failed) return c;

            match(input, Token.DOWN, null); if (state.failed) return c;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:778:21: (g= graphNode )+
            int cnt98=0;
            loop98:
            do {
                int alt98=2;
                int LA98_0 = input.LA(1);

                if ( (LA98_0==ANNON||(LA98_0 >= BIG_DECIMAL && LA98_0 <= BIG_INTEGER)||LA98_0==BLANK_NODE_LABEL||LA98_0==BOOLEAN||LA98_0==DOUBLE||LA98_0==IRI||LA98_0==NIL||(LA98_0 >= PREFIXED_NAME && LA98_0 <= PREFIXED_NS)||LA98_0==STRING||LA98_0==TRIPLES_NODE||LA98_0==VAR) ) {
                    alt98=1;
                }


                switch (alt98) {
            	case 1 :
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:778:22: g= graphNode
            	    {
            	    pushFollow(FOLLOW_graphNode_in_collection5964);
            	    g=graphNode();

            	    state._fsp--;
            	    if (state.failed) return c;

            	    if ( state.backtracking==0 ) { c.add(g); }

            	    }
            	    break;

            	default :
            	    if ( cnt98 >= 1 ) break loop98;
            	    if (state.backtracking>0) {state.failed=true; return c;}
                        EarlyExitException eee =
                            new EarlyExitException(98, input);
                        throw eee;
                }
                cnt98++;
            } while (true);


            match(input, Token.UP, null); if (state.failed) return c;


            }

        }

        	catch(RecognitionException re) {
        		throw new SPARQLsyntaxError(re);
        	}

        finally {
        	// do for sure before leaving
        }
        return c;
    }
    // $ANTLR end "collection"



    // $ANTLR start "graphNode"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:781:1: graphNode returns [GraphNode gn] : (v= var |g= graphTerm |t= triplesNode );
    public final GraphNode graphNode() throws RecognitionException {
        GraphNode gn = null;


        String v =null;

        GraphTerm g =null;

        TriplesNode t =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:782:2: (v= var |g= graphTerm |t= triplesNode )
            int alt99=3;
            switch ( input.LA(1) ) {
            case VAR:
                {
                alt99=1;
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
                alt99=2;
                }
                break;
            case TRIPLES_NODE:
                {
                alt99=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return gn;}
                NoViableAltException nvae =
                    new NoViableAltException("", 99, 0, input);

                throw nvae;

            }

            switch (alt99) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:782:6: v= var
                    {
                    pushFollow(FOLLOW_var_in_graphNode5990);
                    v=var();

                    state._fsp--;
                    if (state.failed) return gn;

                    if ( state.backtracking==0 ) { gn = new GraphNode(new Variable(v));			}

                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:783:5: g= graphTerm
                    {
                    pushFollow(FOLLOW_graphTerm_in_graphNode6003);
                    g=graphTerm();

                    state._fsp--;
                    if (state.failed) return gn;

                    if ( state.backtracking==0 ) { gn = new GraphNode(g);						}

                    }
                    break;
                case 3 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:784:5: t= triplesNode
                    {
                    pushFollow(FOLLOW_triplesNode_in_graphNode6015);
                    t=triplesNode();

                    state._fsp--;
                    if (state.failed) return gn;

                    if ( state.backtracking==0 ) { gn = new GraphNode(t);						}

                    }
                    break;

            }
        }

        	catch(RecognitionException re) {
        		throw new SPARQLsyntaxError(re);
        	}

        finally {
        	// do for sure before leaving
        }
        return gn;
    }
    // $ANTLR end "graphNode"



    // $ANTLR start "varOrTerm"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:787:1: varOrTerm returns [QueryTripleTerm qt] : (v= var |g= graphTerm );
    public final QueryTripleTerm varOrTerm() throws RecognitionException {
        QueryTripleTerm qt = null;


        String v =null;

        GraphTerm g =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:788:2: (v= var |g= graphTerm )
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==VAR) ) {
                alt100=1;
            }
            else if ( (LA100_0==ANNON||(LA100_0 >= BIG_DECIMAL && LA100_0 <= BIG_INTEGER)||LA100_0==BLANK_NODE_LABEL||LA100_0==BOOLEAN||LA100_0==DOUBLE||LA100_0==IRI||LA100_0==NIL||(LA100_0 >= PREFIXED_NAME && LA100_0 <= PREFIXED_NS)||LA100_0==STRING) ) {
                alt100=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return qt;}
                NoViableAltException nvae =
                    new NoViableAltException("", 100, 0, input);

                throw nvae;

            }
            switch (alt100) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:788:7: v= var
                    {
                    pushFollow(FOLLOW_var_in_varOrTerm6038);
                    v=var();

                    state._fsp--;
                    if (state.failed) return qt;

                    if ( state.backtracking==0 ) { qt = new QueryTripleTerm(new Variable(v)); 	}

                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:789:6: g= graphTerm
                    {
                    pushFollow(FOLLOW_graphTerm_in_varOrTerm6053);
                    g=graphTerm();

                    state._fsp--;
                    if (state.failed) return qt;

                    if ( state.backtracking==0 ) { qt = new QueryTripleTerm(g);					}

                    }
                    break;

            }
        }

        	catch(RecognitionException re) {
        		throw new SPARQLsyntaxError(re);
        	}

        finally {
        	// do for sure before leaving
        }
        return qt;
    }
    // $ANTLR end "varOrTerm"



    // $ANTLR start "varOrIRIref"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:792:1: varOrIRIref returns [QueryTripleTerm qt] : (v= var |i= iRIref );
    public final QueryTripleTerm varOrIRIref() throws RecognitionException {
        QueryTripleTerm qt = null;


        String v =null;

        IRI i =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:793:2: (v= var |i= iRIref )
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==VAR) ) {
                alt101=1;
            }
            else if ( (LA101_0==IRI||(LA101_0 >= PREFIXED_NAME && LA101_0 <= PREFIXED_NS)) ) {
                alt101=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return qt;}
                NoViableAltException nvae =
                    new NoViableAltException("", 101, 0, input);

                throw nvae;

            }
            switch (alt101) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:793:6: v= var
                    {
                    pushFollow(FOLLOW_var_in_varOrIRIref6075);
                    v=var();

                    state._fsp--;
                    if (state.failed) return qt;

                    if ( state.backtracking==0 ) { qt = new QueryTripleTerm(new Variable(v)); 	}

                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:794:5: i= iRIref
                    {
                    pushFollow(FOLLOW_iRIref_in_varOrIRIref6090);
                    i=iRIref();

                    state._fsp--;
                    if (state.failed) return qt;

                    if ( state.backtracking==0 ) { qt = new QueryTripleTerm(i); 	    }

                    }
                    break;

            }
        }

        	catch(RecognitionException re) {
        		throw new SPARQLsyntaxError(re);
        	}

        finally {
        	// do for sure before leaving
        }
        return qt;
    }
    // $ANTLR end "varOrIRIref"



    // $ANTLR start "varOrIRIref2"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:797:1: varOrIRIref2 returns [BinaryUnion<Variable, IRI> bu] : (v= var |i= iRIref );
    public final BinaryUnion<Variable, IRI> varOrIRIref2() throws RecognitionException {
        BinaryUnion<Variable, IRI> bu = null;


        String v =null;

        IRI i =null;


         bu = new BinaryUnion<Variable, IRI>(); 
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:799:5: (v= var |i= iRIref )
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==VAR) ) {
                alt102=1;
            }
            else if ( (LA102_0==IRI||(LA102_0 >= PREFIXED_NAME && LA102_0 <= PREFIXED_NS)) ) {
                alt102=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return bu;}
                NoViableAltException nvae =
                    new NoViableAltException("", 102, 0, input);

                throw nvae;

            }
            switch (alt102) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:799:8: v= var
                    {
                    pushFollow(FOLLOW_var_in_varOrIRIref26125);
                    v=var();

                    state._fsp--;
                    if (state.failed) return bu;

                    if ( state.backtracking==0 ) { bu.setFirst(new Variable(v)); }

                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:800:8: i= iRIref
                    {
                    pushFollow(FOLLOW_iRIref_in_varOrIRIref26141);
                    i=iRIref();

                    state._fsp--;
                    if (state.failed) return bu;

                    if ( state.backtracking==0 ) { bu.setSecond(i); }

                    }
                    break;

            }
        }

        	catch(RecognitionException re) {
        		throw new SPARQLsyntaxError(re);
        	}

        finally {
        	// do for sure before leaving
        }
        return bu;
    }
    // $ANTLR end "varOrIRIref2"



    // $ANTLR start "var"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:803:1: var returns [String v] : ^( VAR (x1= VAR1 |x2= VAR2 ) ) ;
    public final String var() throws RecognitionException {
        String v = null;


        XTree x1=null;
        XTree x2=null;

        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:804:2: ( ^( VAR (x1= VAR1 |x2= VAR2 ) ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:804:6: ^( VAR (x1= VAR1 |x2= VAR2 ) )
            {
            match(input,VAR,FOLLOW_VAR_in_var6168); if (state.failed) return v;

            match(input, Token.DOWN, null); if (state.failed) return v;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:804:13: (x1= VAR1 |x2= VAR2 )
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==VAR1) ) {
                alt103=1;
            }
            else if ( (LA103_0==VAR2) ) {
                alt103=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return v;}
                NoViableAltException nvae =
                    new NoViableAltException("", 103, 0, input);

                throw nvae;

            }
            switch (alt103) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:804:15: x1= VAR1
                    {
                    x1=(XTree)match(input,VAR1,FOLLOW_VAR1_in_var6175); if (state.failed) return v;

                    if ( state.backtracking==0 ) { v = new String(x1.getText().substring(1)); }

                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:805:7: x2= VAR2
                    {
                    x2=(XTree)match(input,VAR2,FOLLOW_VAR2_in_var6190); if (state.failed) return v;

                    if ( state.backtracking==0 ) { v = new String(x2.getText().substring(1)); }

                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return v;


            }

        }

        	catch(RecognitionException re) {
        		throw new SPARQLsyntaxError(re);
        	}

        finally {
        	// do for sure before leaving
        }
        return v;
    }
    // $ANTLR end "var"



    // $ANTLR start "graphTerm"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:810:1: graphTerm returns [GraphTerm gt] : (i= iRIref |r= rDFLiteral |d= numericLiteral |b= booleanLiteral |l= blankNode | NIL );
    public final GraphTerm graphTerm() throws RecognitionException {
        GraphTerm gt = null;


        IRI i =null;

        StringLiteral r =null;

        Constant d =null;

        Boolean b =null;

        BlankNode l =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:811:2: (i= iRIref |r= rDFLiteral |d= numericLiteral |b= booleanLiteral |l= blankNode | NIL )
            int alt104=6;
            switch ( input.LA(1) ) {
            case IRI:
            case PREFIXED_NAME:
            case PREFIXED_NS:
                {
                alt104=1;
                }
                break;
            case STRING:
                {
                alt104=2;
                }
                break;
            case BIG_DECIMAL:
            case BIG_INTEGER:
            case DOUBLE:
                {
                alt104=3;
                }
                break;
            case BOOLEAN:
                {
                alt104=4;
                }
                break;
            case ANNON:
            case BLANK_NODE_LABEL:
                {
                alt104=5;
                }
                break;
            case NIL:
                {
                alt104=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return gt;}
                NoViableAltException nvae =
                    new NoViableAltException("", 104, 0, input);

                throw nvae;

            }

            switch (alt104) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:811:6: i= iRIref
                    {
                    pushFollow(FOLLOW_iRIref_in_graphTerm6224);
                    i=iRIref();

                    state._fsp--;
                    if (state.failed) return gt;

                    if ( state.backtracking==0 ) { gt = new GraphTerm(i); }

                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:812:5: r= rDFLiteral
                    {
                    pushFollow(FOLLOW_rDFLiteral_in_graphTerm6238);
                    r=rDFLiteral();

                    state._fsp--;
                    if (state.failed) return gt;

                    if ( state.backtracking==0 ) { gt = new GraphTerm(new Constant(r)); }

                    }
                    break;
                case 3 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:813:4: d= numericLiteral
                    {
                    pushFollow(FOLLOW_numericLiteral_in_graphTerm6250);
                    d=numericLiteral();

                    state._fsp--;
                    if (state.failed) return gt;

                    if ( state.backtracking==0 ) { gt = new GraphTerm(d); 				}

                    }
                    break;
                case 4 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:814:5: b= booleanLiteral
                    {
                    pushFollow(FOLLOW_booleanLiteral_in_graphTerm6263);
                    b=booleanLiteral();

                    state._fsp--;
                    if (state.failed) return gt;

                    if ( state.backtracking==0 ) { gt = new GraphTerm(new Constant(b)); }

                    }
                    break;
                case 5 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:815:5: l= blankNode
                    {
                    pushFollow(FOLLOW_blankNode_in_graphTerm6276);
                    l=blankNode();

                    state._fsp--;
                    if (state.failed) return gt;

                    if ( state.backtracking==0 ) { gt = new GraphTerm(l); }

                    }
                    break;
                case 6 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:816:5: NIL
                    {
                    match(input,NIL,FOLLOW_NIL_in_graphTerm6289); if (state.failed) return gt;

                    if ( state.backtracking==0 ) { gt = new GraphTerm(new IRI("http://www.w3.org/1999/02/22-rdf-syntax-ns#nil")); }

                    }
                    break;

            }
        }

        	catch(RecognitionException re) {
        		throw new SPARQLsyntaxError(re);
        	}

        finally {
        	// do for sure before leaving
        }
        return gt;
    }
    // $ANTLR end "graphTerm"



    // $ANTLR start "expression"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:819:1: expression returns [Expression e] : ( ^( LOGICAL_OR e1= expression (e2= expression )+ ) | ^( LOGICAL_AND e3= expression (e4= expression )+ ) | ^( '=' e5= expression e6= expression ) | ^( '!=' e7= expression e8= expression ) | ^( LT e9= expression e10= expression ) | ^( '>' e11= expression e12= expression ) | ^( LTE e13= expression e14= expression ) | ^( '>=' e15= expression e16= expression ) | ^( IN e17= expression e18= expressionList ) | ^( NOT e19= expression e20= expressionList ) | ^( '+' e21= expression (e22= expression )? ) | ^( BROKEN_PLUS e21= expression e22= expression ) | ^( '-' e23= expression (e24= expression )? ) | ^( BROKEN_MINUS e23= expression e24= expression ) | ^( '*' e25= expression e26= expression ) | ^( '/' e27= expression e28= expression ) | ^( '!' e29= expression ) |e30= brackettedExpression |e31= primaryExpression );
    public final Expression expression() throws RecognitionException {
        Expression e = null;


        Expression e1 =null;

        Expression e2 =null;

        Expression e3 =null;

        Expression e4 =null;

        Expression e5 =null;

        Expression e6 =null;

        Expression e7 =null;

        Expression e8 =null;

        Expression e9 =null;

        Expression e10 =null;

        Expression e11 =null;

        Expression e12 =null;

        Expression e13 =null;

        Expression e14 =null;

        Expression e15 =null;

        Expression e16 =null;

        Expression e17 =null;

        List<Expression> e18 =null;

        Expression e19 =null;

        List<Expression> e20 =null;

        Expression e21 =null;

        Expression e22 =null;

        Expression e23 =null;

        Expression e24 =null;

        Expression e25 =null;

        Expression e26 =null;

        Expression e27 =null;

        Expression e28 =null;

        Expression e29 =null;

        Expression e30 =null;

        Expression e31 =null;


         
        		LogicalExpression le = null;
        		RelationalExpression rl = null;
        		NumericExpression ne = null;
        	
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:825:2: ( ^( LOGICAL_OR e1= expression (e2= expression )+ ) | ^( LOGICAL_AND e3= expression (e4= expression )+ ) | ^( '=' e5= expression e6= expression ) | ^( '!=' e7= expression e8= expression ) | ^( LT e9= expression e10= expression ) | ^( '>' e11= expression e12= expression ) | ^( LTE e13= expression e14= expression ) | ^( '>=' e15= expression e16= expression ) | ^( IN e17= expression e18= expressionList ) | ^( NOT e19= expression e20= expressionList ) | ^( '+' e21= expression (e22= expression )? ) | ^( BROKEN_PLUS e21= expression e22= expression ) | ^( '-' e23= expression (e24= expression )? ) | ^( BROKEN_MINUS e23= expression e24= expression ) | ^( '*' e25= expression e26= expression ) | ^( '/' e27= expression e28= expression ) | ^( '!' e29= expression ) |e30= brackettedExpression |e31= primaryExpression )
            int alt109=19;
            switch ( input.LA(1) ) {
            case LOGICAL_OR:
                {
                alt109=1;
                }
                break;
            case LOGICAL_AND:
                {
                alt109=2;
                }
                break;
            case 275:
                {
                alt109=3;
                }
                break;
            case 269:
                {
                alt109=4;
                }
                break;
            case LT:
                {
                alt109=5;
                }
                break;
            case 276:
                {
                alt109=6;
                }
                break;
            case LTE:
                {
                alt109=7;
                }
                break;
            case 277:
                {
                alt109=8;
                }
                break;
            case IN:
                {
                alt109=9;
                }
                break;
            case NOT:
                {
                alt109=10;
                }
                break;
            case 271:
                {
                alt109=11;
                }
                break;
            case BROKEN_PLUS:
                {
                alt109=12;
                }
                break;
            case 272:
                {
                alt109=13;
                }
                break;
            case BROKEN_MINUS:
                {
                alt109=14;
                }
                break;
            case 270:
                {
                alt109=15;
                }
                break;
            case 273:
                {
                alt109=16;
                }
                break;
            case 268:
                {
                alt109=17;
                }
                break;
            case EXPRESSION:
                {
                alt109=18;
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
                alt109=19;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return e;}
                NoViableAltException nvae =
                    new NoViableAltException("", 109, 0, input);

                throw nvae;

            }

            switch (alt109) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:825:6: ^( LOGICAL_OR e1= expression (e2= expression )+ )
                    {
                    match(input,LOGICAL_OR,FOLLOW_LOGICAL_OR_in_expression6320); if (state.failed) return e;

                    if ( state.backtracking==0 ) { le = new LogicalExpression(LogicalExpression.ELogicalType.OR);  }

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_expression6332);
                    e1=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { le.addComponent(e1);   }

                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:827:4: (e2= expression )+
                    int cnt105=0;
                    loop105:
                    do {
                        int alt105=2;
                        int LA105_0 = input.LA(1);

                        if ( (LA105_0==ABS||LA105_0==AVG||(LA105_0 >= BIG_DECIMAL && LA105_0 <= BIG_INTEGER)||(LA105_0 >= BNODE && LA105_0 <= BROKEN_PLUS)||LA105_0==CEIL||LA105_0==COALESCE||LA105_0==CONCAT||LA105_0==CONTAINS||LA105_0==COUNT||(LA105_0 >= DATATYPE && LA105_0 <= DAY)||LA105_0==DOUBLE||LA105_0==ENCODE_FOR_URI||LA105_0==EXISTS||LA105_0==EXPRESSION||LA105_0==FLOOR||LA105_0==FUNCTION||LA105_0==GROUP_CONCAT||LA105_0==HOURS||(LA105_0 >= IF && LA105_0 <= IN)||LA105_0==IRI||(LA105_0 >= ISBLANK && LA105_0 <= ISURI)||(LA105_0 >= LANG && LA105_0 <= LANGMATCHES)||LA105_0==LCASE||(LA105_0 >= LOGICAL_AND && LA105_0 <= LTE)||(LA105_0 >= MAX && LA105_0 <= MIN)||LA105_0==MINUTES||LA105_0==MONTH||(LA105_0 >= NOT && LA105_0 <= NOT_EXISTS)||LA105_0==NOW||(LA105_0 >= PREFIXED_NAME && LA105_0 <= PREFIXED_NS)||LA105_0==RAND||(LA105_0 >= REGEX && LA105_0 <= REPLACE)||LA105_0==ROUND||(LA105_0 >= SAMETERM && LA105_0 <= SECONDS)||LA105_0==SHA1||(LA105_0 >= SHA256 && LA105_0 <= SHA512)||(LA105_0 >= STR && LA105_0 <= STRING)||(LA105_0 >= STRLANG && LA105_0 <= STRUUID)||LA105_0==SUBSTR||LA105_0==SUM||LA105_0==TIMEZONE||LA105_0==TZ||LA105_0==UCASE||LA105_0==URI||LA105_0==UUID||LA105_0==VAR||LA105_0==YEAR||(LA105_0 >= 268 && LA105_0 <= 273)||(LA105_0 >= 275 && LA105_0 <= 277)) ) {
                            alt105=1;
                        }


                        switch (alt105) {
                    	case 1 :
                    	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:827:5: e2= expression
                    	    {
                    	    pushFollow(FOLLOW_expression_in_expression6353);
                    	    e2=expression();

                    	    state._fsp--;
                    	    if (state.failed) return e;

                    	    if ( state.backtracking==0 ) { le.addComponent(e2); 	}

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt105 >= 1 ) break loop105;
                    	    if (state.backtracking>0) {state.failed=true; return e;}
                                EarlyExitException eee =
                                    new EarlyExitException(105, input);
                                throw eee;
                        }
                        cnt105++;
                    } while (true);


                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { e = le; }

                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:829:6: ^( LOGICAL_AND e3= expression (e4= expression )+ )
                    {
                    match(input,LOGICAL_AND,FOLLOW_LOGICAL_AND_in_expression6378); if (state.failed) return e;

                    if ( state.backtracking==0 ) { le = new LogicalExpression(LogicalExpression.ELogicalType.AND); }

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_expression6390);
                    e3=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { le.addComponent(e3);   }

                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:831:4: (e4= expression )+
                    int cnt106=0;
                    loop106:
                    do {
                        int alt106=2;
                        int LA106_0 = input.LA(1);

                        if ( (LA106_0==ABS||LA106_0==AVG||(LA106_0 >= BIG_DECIMAL && LA106_0 <= BIG_INTEGER)||(LA106_0 >= BNODE && LA106_0 <= BROKEN_PLUS)||LA106_0==CEIL||LA106_0==COALESCE||LA106_0==CONCAT||LA106_0==CONTAINS||LA106_0==COUNT||(LA106_0 >= DATATYPE && LA106_0 <= DAY)||LA106_0==DOUBLE||LA106_0==ENCODE_FOR_URI||LA106_0==EXISTS||LA106_0==EXPRESSION||LA106_0==FLOOR||LA106_0==FUNCTION||LA106_0==GROUP_CONCAT||LA106_0==HOURS||(LA106_0 >= IF && LA106_0 <= IN)||LA106_0==IRI||(LA106_0 >= ISBLANK && LA106_0 <= ISURI)||(LA106_0 >= LANG && LA106_0 <= LANGMATCHES)||LA106_0==LCASE||(LA106_0 >= LOGICAL_AND && LA106_0 <= LTE)||(LA106_0 >= MAX && LA106_0 <= MIN)||LA106_0==MINUTES||LA106_0==MONTH||(LA106_0 >= NOT && LA106_0 <= NOT_EXISTS)||LA106_0==NOW||(LA106_0 >= PREFIXED_NAME && LA106_0 <= PREFIXED_NS)||LA106_0==RAND||(LA106_0 >= REGEX && LA106_0 <= REPLACE)||LA106_0==ROUND||(LA106_0 >= SAMETERM && LA106_0 <= SECONDS)||LA106_0==SHA1||(LA106_0 >= SHA256 && LA106_0 <= SHA512)||(LA106_0 >= STR && LA106_0 <= STRING)||(LA106_0 >= STRLANG && LA106_0 <= STRUUID)||LA106_0==SUBSTR||LA106_0==SUM||LA106_0==TIMEZONE||LA106_0==TZ||LA106_0==UCASE||LA106_0==URI||LA106_0==UUID||LA106_0==VAR||LA106_0==YEAR||(LA106_0 >= 268 && LA106_0 <= 273)||(LA106_0 >= 275 && LA106_0 <= 277)) ) {
                            alt106=1;
                        }


                        switch (alt106) {
                    	case 1 :
                    	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:831:5: e4= expression
                    	    {
                    	    pushFollow(FOLLOW_expression_in_expression6411);
                    	    e4=expression();

                    	    state._fsp--;
                    	    if (state.failed) return e;

                    	    if ( state.backtracking==0 ) { le.addComponent(e4); 	}

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt106 >= 1 ) break loop106;
                    	    if (state.backtracking>0) {state.failed=true; return e;}
                                EarlyExitException eee =
                                    new EarlyExitException(106, input);
                                throw eee;
                        }
                        cnt106++;
                    } while (true);


                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { e = le; }

                    }
                    break;
                case 3 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:833:6: ^( '=' e5= expression e6= expression )
                    {
                    match(input,275,FOLLOW_275_in_expression6438); if (state.failed) return e;

                    if ( state.backtracking==0 ) { rl = new RelationalExpression(); 								  }

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_expression6452);
                    e5=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { rl.setLeft(e5); 				}

                    pushFollow(FOLLOW_expression_in_expression6463);
                    e6=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { rl.setRight(RelationalExpression.ERelationalOp.EQUAL, e6); 		  }

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { e = rl; }

                    }
                    break;
                case 4 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:837:4: ^( '!=' e7= expression e8= expression )
                    {
                    match(input,269,FOLLOW_269_in_expression6483); if (state.failed) return e;

                    if ( state.backtracking==0 ) { rl = new RelationalExpression(); 								  }

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_expression6497);
                    e7=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { rl.setLeft(e7); 				}

                    pushFollow(FOLLOW_expression_in_expression6508);
                    e8=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { rl.setRight(RelationalExpression.ERelationalOp.NOT_EQUAL, e8);    }

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { e = rl; }

                    }
                    break;
                case 5 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:841:4: ^( LT e9= expression e10= expression )
                    {
                    match(input,LT,FOLLOW_LT_in_expression6528); if (state.failed) return e;

                    if ( state.backtracking==0 ) { rl = new RelationalExpression(); 								  }

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_expression6543);
                    e9=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { rl.setLeft(e9); 				}

                    pushFollow(FOLLOW_expression_in_expression6558);
                    e10=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { rl.setRight(RelationalExpression.ERelationalOp.LESS, e10);		  }

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { e = rl; }

                    }
                    break;
                case 6 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:845:4: ^( '>' e11= expression e12= expression )
                    {
                    match(input,276,FOLLOW_276_in_expression6578); if (state.failed) return e;

                    if ( state.backtracking==0 ) { rl = new RelationalExpression(); 								  }

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_expression6593);
                    e11=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { rl.setLeft(e11); 				}

                    pushFollow(FOLLOW_expression_in_expression6604);
                    e12=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { rl.setRight(RelationalExpression.ERelationalOp.GREATER, e12);	  }

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { e = rl; }

                    }
                    break;
                case 7 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:849:4: ^( LTE e13= expression e14= expression )
                    {
                    match(input,LTE,FOLLOW_LTE_in_expression6624); if (state.failed) return e;

                    if ( state.backtracking==0 ) { rl = new RelationalExpression(); 								  }

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_expression6638);
                    e13=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { rl.setLeft(e13); 				}

                    pushFollow(FOLLOW_expression_in_expression6649);
                    e14=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { rl.setRight(RelationalExpression.ERelationalOp.LESS_EQUAL, e14); }

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { e = rl; }

                    }
                    break;
                case 8 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:853:4: ^( '>=' e15= expression e16= expression )
                    {
                    match(input,277,FOLLOW_277_in_expression6669); if (state.failed) return e;

                    if ( state.backtracking==0 ) { rl = new RelationalExpression(); 								  }

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_expression6683);
                    e15=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { rl.setLeft(e15); 				}

                    pushFollow(FOLLOW_expression_in_expression6694);
                    e16=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { rl.setRight(RelationalExpression.ERelationalOp.GREATER_EQUAL, e16); }

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { e = rl; }

                    }
                    break;
                case 9 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:857:4: ^( IN e17= expression e18= expressionList )
                    {
                    match(input,IN,FOLLOW_IN_in_expression6714); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_expression6741);
                    e17=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    pushFollow(FOLLOW_expressionList_in_expression6754);
                    e18=expressionList();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { e = new OneOfExpression(Expression.EOneOfOp.IN ,e17, e18); }

                    match(input, Token.UP, null); if (state.failed) return e;


                    }
                    break;
                case 10 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:862:4: ^( NOT e19= expression e20= expressionList )
                    {
                    match(input,NOT,FOLLOW_NOT_in_expression6800); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_expression6807);
                    e19=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    pushFollow(FOLLOW_expressionList_in_expression6815);
                    e20=expressionList();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { e = new OneOfExpression(Expression.EOneOfOp.NOT_IN ,e19, e20); }

                    }
                    break;
                case 11 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:866:4: ^( '+' e21= expression (e22= expression )? )
                    {
                    match(input,271,FOLLOW_271_in_expression6849); if (state.failed) return e;

                    if ( state.backtracking==0 ) { ne = new NumericExpression(); 								}

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_expression6876);
                    e21=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { ne.setLHS(e21); 				}

                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:868:4: (e22= expression )?
                    int alt107=2;
                    int LA107_0 = input.LA(1);

                    if ( (LA107_0==ABS||LA107_0==AVG||(LA107_0 >= BIG_DECIMAL && LA107_0 <= BIG_INTEGER)||(LA107_0 >= BNODE && LA107_0 <= BROKEN_PLUS)||LA107_0==CEIL||LA107_0==COALESCE||LA107_0==CONCAT||LA107_0==CONTAINS||LA107_0==COUNT||(LA107_0 >= DATATYPE && LA107_0 <= DAY)||LA107_0==DOUBLE||LA107_0==ENCODE_FOR_URI||LA107_0==EXISTS||LA107_0==EXPRESSION||LA107_0==FLOOR||LA107_0==FUNCTION||LA107_0==GROUP_CONCAT||LA107_0==HOURS||(LA107_0 >= IF && LA107_0 <= IN)||LA107_0==IRI||(LA107_0 >= ISBLANK && LA107_0 <= ISURI)||(LA107_0 >= LANG && LA107_0 <= LANGMATCHES)||LA107_0==LCASE||(LA107_0 >= LOGICAL_AND && LA107_0 <= LTE)||(LA107_0 >= MAX && LA107_0 <= MIN)||LA107_0==MINUTES||LA107_0==MONTH||(LA107_0 >= NOT && LA107_0 <= NOT_EXISTS)||LA107_0==NOW||(LA107_0 >= PREFIXED_NAME && LA107_0 <= PREFIXED_NS)||LA107_0==RAND||(LA107_0 >= REGEX && LA107_0 <= REPLACE)||LA107_0==ROUND||(LA107_0 >= SAMETERM && LA107_0 <= SECONDS)||LA107_0==SHA1||(LA107_0 >= SHA256 && LA107_0 <= SHA512)||(LA107_0 >= STR && LA107_0 <= STRING)||(LA107_0 >= STRLANG && LA107_0 <= STRUUID)||LA107_0==SUBSTR||LA107_0==SUM||LA107_0==TIMEZONE||LA107_0==TZ||LA107_0==UCASE||LA107_0==URI||LA107_0==UUID||LA107_0==VAR||LA107_0==YEAR||(LA107_0 >= 268 && LA107_0 <= 273)||(LA107_0 >= 275 && LA107_0 <= 277)) ) {
                        alt107=1;
                    }
                    switch (alt107) {
                        case 1 :
                            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:868:5: e22= expression
                            {
                            pushFollow(FOLLOW_expression_in_expression6888);
                            e22=expression();

                            state._fsp--;
                            if (state.failed) return e;

                            if ( state.backtracking==0 ) { ne.setRHS(NumericExpression.ENEType.PLUS, e22);      			}

                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { e = ne; }

                    }
                    break;
                case 12 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:870:4: ^( BROKEN_PLUS e21= expression e22= expression )
                    {
                    match(input,BROKEN_PLUS,FOLLOW_BROKEN_PLUS_in_expression6911); if (state.failed) return e;

                    if ( state.backtracking==0 ) { ne = new NumericExpression(); 								}

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_expression6930);
                    e21=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { ne.setLHS(e21); 				}

                    pushFollow(FOLLOW_expression_in_expression6941);
                    e22=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { ne.setRHS(NumericExpression.ENEType.PLUS, e22);      			}

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { e = ne; }

                    }
                    break;
                case 13 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:874:4: ^( '-' e23= expression (e24= expression )? )
                    {
                    match(input,272,FOLLOW_272_in_expression6961); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_expression6987);
                    e23=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { e = new UnaryExpression(Expression.EUnaryOp.MINUS, e23); }

                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:876:4: (e24= expression )?
                    int alt108=2;
                    int LA108_0 = input.LA(1);

                    if ( (LA108_0==ABS||LA108_0==AVG||(LA108_0 >= BIG_DECIMAL && LA108_0 <= BIG_INTEGER)||(LA108_0 >= BNODE && LA108_0 <= BROKEN_PLUS)||LA108_0==CEIL||LA108_0==COALESCE||LA108_0==CONCAT||LA108_0==CONTAINS||LA108_0==COUNT||(LA108_0 >= DATATYPE && LA108_0 <= DAY)||LA108_0==DOUBLE||LA108_0==ENCODE_FOR_URI||LA108_0==EXISTS||LA108_0==EXPRESSION||LA108_0==FLOOR||LA108_0==FUNCTION||LA108_0==GROUP_CONCAT||LA108_0==HOURS||(LA108_0 >= IF && LA108_0 <= IN)||LA108_0==IRI||(LA108_0 >= ISBLANK && LA108_0 <= ISURI)||(LA108_0 >= LANG && LA108_0 <= LANGMATCHES)||LA108_0==LCASE||(LA108_0 >= LOGICAL_AND && LA108_0 <= LTE)||(LA108_0 >= MAX && LA108_0 <= MIN)||LA108_0==MINUTES||LA108_0==MONTH||(LA108_0 >= NOT && LA108_0 <= NOT_EXISTS)||LA108_0==NOW||(LA108_0 >= PREFIXED_NAME && LA108_0 <= PREFIXED_NS)||LA108_0==RAND||(LA108_0 >= REGEX && LA108_0 <= REPLACE)||LA108_0==ROUND||(LA108_0 >= SAMETERM && LA108_0 <= SECONDS)||LA108_0==SHA1||(LA108_0 >= SHA256 && LA108_0 <= SHA512)||(LA108_0 >= STR && LA108_0 <= STRING)||(LA108_0 >= STRLANG && LA108_0 <= STRUUID)||LA108_0==SUBSTR||LA108_0==SUM||LA108_0==TIMEZONE||LA108_0==TZ||LA108_0==UCASE||LA108_0==URI||LA108_0==UUID||LA108_0==VAR||LA108_0==YEAR||(LA108_0 >= 268 && LA108_0 <= 273)||(LA108_0 >= 275 && LA108_0 <= 277)) ) {
                        alt108=1;
                    }
                    switch (alt108) {
                        case 1 :
                            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:876:5: e24= expression
                            {
                            pushFollow(FOLLOW_expression_in_expression6999);
                            e24=expression();

                            state._fsp--;
                            if (state.failed) return e;

                            if ( state.backtracking==0 ) { e = new NumericExpression(NumericExpression.ENEType.MINUS, e23, e24); }

                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return e;


                    }
                    break;
                case 14 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:878:4: ^( BROKEN_MINUS e23= expression e24= expression )
                    {
                    match(input,BROKEN_MINUS,FOLLOW_BROKEN_MINUS_in_expression7016); if (state.failed) return e;

                    if ( state.backtracking==0 ) { ne = new NumericExpression(); 								}

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_expression7034);
                    e23=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { ne.setLHS(e23); 				}

                    pushFollow(FOLLOW_expression_in_expression7045);
                    e24=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { ne.setRHS(NumericExpression.ENEType.MINUS, e24);   			}

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { e = ne; }

                    }
                    break;
                case 15 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:882:4: ^( '*' e25= expression e26= expression )
                    {
                    match(input,270,FOLLOW_270_in_expression7065); if (state.failed) return e;

                    if ( state.backtracking==0 ) { ne = new NumericExpression(); 								}

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_expression7092);
                    e25=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { ne.setLHS(e25); 				}

                    pushFollow(FOLLOW_expression_in_expression7103);
                    e26=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { ne.setRHS(NumericExpression.ENEType.MUL, e26);   				}

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { e = ne; }

                    }
                    break;
                case 16 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:886:4: ^( '/' e27= expression e28= expression )
                    {
                    match(input,273,FOLLOW_273_in_expression7123); if (state.failed) return e;

                    if ( state.backtracking==0 ) { ne = new NumericExpression(); 								}

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_expression7150);
                    e27=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { ne.setLHS(e27); 				}

                    pushFollow(FOLLOW_expression_in_expression7160);
                    e28=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { ne.setRHS(NumericExpression.ENEType.DIV, e28);   			}

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { e = ne; }

                    }
                    break;
                case 17 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:890:4: ^( '!' e29= expression )
                    {
                    match(input,268,FOLLOW_268_in_expression7180); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_expression7184);
                    e29=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { e = new UnaryExpression(Expression.EUnaryOp.NOT, e29); 		}

                    }
                    break;
                case 18 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:891:4: e30= brackettedExpression
                    {
                    pushFollow(FOLLOW_brackettedExpression_in_expression7195);
                    e30=brackettedExpression();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { e = e30; }

                    }
                    break;
                case 19 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:892:5: e31= primaryExpression
                    {
                    pushFollow(FOLLOW_primaryExpression_in_expression7205);
                    e31=primaryExpression();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { e = e31; }

                    }
                    break;

            }
        }

        	catch(RecognitionException re) {
        		throw new SPARQLsyntaxError(re);
        	}

        finally {
        	// do for sure before leaving
        }
        return e;
    }
    // $ANTLR end "expression"



    // $ANTLR start "primaryExpression"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:896:1: primaryExpression returns [Expression e] : (e1= builtInCall |i= iRIref |f= iRIFunction |r= rDFLiteral |n= numericLiteral |b= booleanLiteral |v= var |a= aggregate );
    public final Expression primaryExpression() throws RecognitionException {
        Expression e = null;


        Expression e1 =null;

        IRI i =null;

        FunctionCall f =null;

        StringLiteral r =null;

        Constant n =null;

        Boolean b =null;

        String v =null;

        AggregateExpression a =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:897:2: (e1= builtInCall |i= iRIref |f= iRIFunction |r= rDFLiteral |n= numericLiteral |b= booleanLiteral |v= var |a= aggregate )
            int alt110=8;
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
                alt110=1;
                }
                break;
            case IRI:
                {
                int LA110_2 = input.LA(2);

                if ( (LA110_2==DOWN) ) {
                    int LA110_10 = input.LA(3);

                    if ( (LA110_10==IRI_REF) ) {
                        alt110=2;
                    }
                    else if ( (LA110_10==ABS||LA110_10==AVG||(LA110_10 >= BIG_DECIMAL && LA110_10 <= BIG_INTEGER)||(LA110_10 >= BNODE && LA110_10 <= BROKEN_PLUS)||LA110_10==CEIL||LA110_10==COALESCE||LA110_10==CONCAT||LA110_10==CONTAINS||LA110_10==COUNT||(LA110_10 >= DATATYPE && LA110_10 <= DAY)||LA110_10==DOUBLE||LA110_10==ENCODE_FOR_URI||LA110_10==EXISTS||LA110_10==EXPRESSION||LA110_10==FLOOR||LA110_10==FUNCTION||LA110_10==GROUP_CONCAT||LA110_10==HOURS||(LA110_10 >= IF && LA110_10 <= IN)||LA110_10==IRI||(LA110_10 >= ISBLANK && LA110_10 <= ISURI)||(LA110_10 >= LANG && LA110_10 <= LANGMATCHES)||LA110_10==LCASE||(LA110_10 >= LOGICAL_AND && LA110_10 <= LTE)||(LA110_10 >= MAX && LA110_10 <= MIN)||LA110_10==MINUTES||LA110_10==MONTH||(LA110_10 >= NOT && LA110_10 <= NOT_EXISTS)||LA110_10==NOW||(LA110_10 >= PREFIXED_NAME && LA110_10 <= PREFIXED_NS)||LA110_10==RAND||(LA110_10 >= REGEX && LA110_10 <= REPLACE)||LA110_10==ROUND||(LA110_10 >= SAMETERM && LA110_10 <= SECONDS)||LA110_10==SHA1||(LA110_10 >= SHA256 && LA110_10 <= SHA512)||(LA110_10 >= STR && LA110_10 <= STRING)||(LA110_10 >= STRLANG && LA110_10 <= STRUUID)||LA110_10==SUBSTR||LA110_10==SUM||LA110_10==TIMEZONE||LA110_10==TZ||LA110_10==UCASE||LA110_10==URI||LA110_10==UUID||LA110_10==VAR||LA110_10==YEAR||(LA110_10 >= 268 && LA110_10 <= 273)||(LA110_10 >= 275 && LA110_10 <= 277)) ) {
                        alt110=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return e;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 110, 10, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return e;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 110, 2, input);

                    throw nvae;

                }
                }
                break;
            case PREFIXED_NAME:
            case PREFIXED_NS:
                {
                alt110=2;
                }
                break;
            case FUNCTION:
                {
                alt110=3;
                }
                break;
            case STRING:
                {
                alt110=4;
                }
                break;
            case BIG_DECIMAL:
            case BIG_INTEGER:
            case DOUBLE:
                {
                alt110=5;
                }
                break;
            case BOOLEAN:
                {
                alt110=6;
                }
                break;
            case VAR:
                {
                alt110=7;
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
                alt110=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return e;}
                NoViableAltException nvae =
                    new NoViableAltException("", 110, 0, input);

                throw nvae;

            }

            switch (alt110) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:897:6: e1= builtInCall
                    {
                    pushFollow(FOLLOW_builtInCall_in_primaryExpression7230);
                    e1=builtInCall();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { e = e1; }

                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:898:5: i= iRIref
                    {
                    pushFollow(FOLLOW_iRIref_in_primaryExpression7242);
                    i=iRIref();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { e = new ConstantExpression(i); }

                    }
                    break;
                case 3 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:899:4: f= iRIFunction
                    {
                    pushFollow(FOLLOW_iRIFunction_in_primaryExpression7254);
                    f=iRIFunction();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { e = new FunctionCallExpression(f); }

                    }
                    break;
                case 4 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:900:5: r= rDFLiteral
                    {
                    pushFollow(FOLLOW_rDFLiteral_in_primaryExpression7266);
                    r=rDFLiteral();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { e = new ConstantExpression(r); }

                    }
                    break;
                case 5 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:901:5: n= numericLiteral
                    {
                    pushFollow(FOLLOW_numericLiteral_in_primaryExpression7278);
                    n=numericLiteral();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { e = new ConstantExpression(n); }

                    }
                    break;
                case 6 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:902:5: b= booleanLiteral
                    {
                    pushFollow(FOLLOW_booleanLiteral_in_primaryExpression7289);
                    b=booleanLiteral();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { e = new ConstantExpression(b); }

                    }
                    break;
                case 7 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:903:5: v= var
                    {
                    pushFollow(FOLLOW_var_in_primaryExpression7300);
                    v=var();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { e = new VariableExpression(v); }

                    }
                    break;
                case 8 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:904:5: a= aggregate
                    {
                    pushFollow(FOLLOW_aggregate_in_primaryExpression7314);
                    a=aggregate();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { e = a; }

                    }
                    break;

            }
        }

        	catch(RecognitionException re) {
        		throw new SPARQLsyntaxError(re);
        	}

        finally {
        	// do for sure before leaving
        }
        return e;
    }
    // $ANTLR end "primaryExpression"



    // $ANTLR start "brackettedExpression"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:907:1: brackettedExpression returns [Expression e] : ^( EXPRESSION e1= expression ) ;
    public final Expression brackettedExpression() throws RecognitionException {
        Expression e = null;


        Expression e1 =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:908:2: ( ^( EXPRESSION e1= expression ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:908:4: ^( EXPRESSION e1= expression )
            {
            match(input,EXPRESSION,FOLLOW_EXPRESSION_in_brackettedExpression7337); if (state.failed) return e;

            match(input, Token.DOWN, null); if (state.failed) return e;
            pushFollow(FOLLOW_expression_in_brackettedExpression7342);
            e1=expression();

            state._fsp--;
            if (state.failed) return e;

            match(input, Token.UP, null); if (state.failed) return e;


            if ( state.backtracking==0 ) { e = e1; }

            }

        }

        	catch(RecognitionException re) {
        		throw new SPARQLsyntaxError(re);
        	}

        finally {
        	// do for sure before leaving
        }
        return e;
    }
    // $ANTLR end "brackettedExpression"



    // $ANTLR start "builtInCall"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:911:1: builtInCall returns [Expression e] : ( ^( STR st= expression ) | ^( LANG lg= expression ) | ^( LANGMATCHES lm1= expression lm2= expression ) | ^( DATATYPE dt= expression ) | ^( BOUND v= var ) | ^( IRI e6= expression ) | ^( URI e7= expression ) | ^( BNODE e8= expression ) | BNODE | ^( RAND NIL ) | ^( ABS e9= expression ) | ^( CEIL e10= expression ) | ^( FLOOR e11= expression ) | ^( ROUND e12= expression ) | ^( CONCAT e13= expressionList ) | ^( SUBSTR e14= expression e15= expression (e16= expression )? ) | ^( STRLEN e15= expression ) | ^( UCASE e16= expression ) | ^( REPLACE e1= expression e2= expression e3= expression (e4= expression )? ) | ^( LCASE e17= expression ) | ^( ENCODE_FOR_URI e18= expression ) | ^( CONTAINS e19= expression e20= expression ) | ^( STRSTARTS e21= expression e22= expression ) | ^( STRENDS e23= expression e24= expression ) | ^( STRBEFORE e241= expression e242= expression ) | ^( STRAFTER e243= expression e244= expression ) | ^( YEAR e25= expression ) | ^( MONTH e26= expression ) | ^( DAY e27= expression ) | ^( HOURS e28= expression ) | ^( MINUTES e29= expression ) | ^( SECONDS e30= expression ) | ^( TIMEZONE e31= expression ) | ^( TZ e32= expression ) | NOW | UUID | STRUUID | ^( MD5 e33= expression ) | ^( SHA1 e34= expression ) | ^( SHA256 e36= expression ) | ^( SHA384 e37= expression ) | ^( SHA512 e38= expression ) | ^( COALESCE e39= expressionList ) | ^( IF e40= expression e41= expression e42= expression ) | ^( STRLANG e45= expression e46= expression ) | ^( STRDT e47= expression e48= expression ) | ^( SAMETERM sam1= expression sam2= expression ) | ^( ISIRI isi= expression ) | ^( ISURI isu= expression ) | ^( ISBLANK isb= expression ) | ^( ISLITERAL isl= expression ) | ^( ISNUMERIC e55= expression ) |r= regexExpression |p= existsFunc |p= notExistsFunc );
    public final Expression builtInCall() throws RecognitionException {
        Expression e = null;


        Expression st =null;

        Expression lg =null;

        Expression lm1 =null;

        Expression lm2 =null;

        Expression dt =null;

        String v =null;

        Expression e6 =null;

        Expression e7 =null;

        Expression e8 =null;

        Expression e9 =null;

        Expression e10 =null;

        Expression e11 =null;

        Expression e12 =null;

        List<Expression> e13 =null;

        Expression e14 =null;

        Expression e15 =null;

        Expression e16 =null;

        Expression e1 =null;

        Expression e2 =null;

        Expression e3 =null;

        Expression e4 =null;

        Expression e17 =null;

        Expression e18 =null;

        Expression e19 =null;

        Expression e20 =null;

        Expression e21 =null;

        Expression e22 =null;

        Expression e23 =null;

        Expression e24 =null;

        Expression e241 =null;

        Expression e242 =null;

        Expression e243 =null;

        Expression e244 =null;

        Expression e25 =null;

        Expression e26 =null;

        Expression e27 =null;

        Expression e28 =null;

        Expression e29 =null;

        Expression e30 =null;

        Expression e31 =null;

        Expression e32 =null;

        Expression e33 =null;

        Expression e34 =null;

        Expression e36 =null;

        Expression e37 =null;

        Expression e38 =null;

        List<Expression> e39 =null;

        Expression e40 =null;

        Expression e41 =null;

        Expression e42 =null;

        Expression e45 =null;

        Expression e46 =null;

        Expression e47 =null;

        Expression e48 =null;

        Expression sam1 =null;

        Expression sam2 =null;

        Expression isi =null;

        Expression isu =null;

        Expression isb =null;

        Expression isl =null;

        Expression e55 =null;

        Expression r =null;

        Pattern p =null;



        		ArrayList args = new ArrayList();
        	
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:915:2: ( ^( STR st= expression ) | ^( LANG lg= expression ) | ^( LANGMATCHES lm1= expression lm2= expression ) | ^( DATATYPE dt= expression ) | ^( BOUND v= var ) | ^( IRI e6= expression ) | ^( URI e7= expression ) | ^( BNODE e8= expression ) | BNODE | ^( RAND NIL ) | ^( ABS e9= expression ) | ^( CEIL e10= expression ) | ^( FLOOR e11= expression ) | ^( ROUND e12= expression ) | ^( CONCAT e13= expressionList ) | ^( SUBSTR e14= expression e15= expression (e16= expression )? ) | ^( STRLEN e15= expression ) | ^( UCASE e16= expression ) | ^( REPLACE e1= expression e2= expression e3= expression (e4= expression )? ) | ^( LCASE e17= expression ) | ^( ENCODE_FOR_URI e18= expression ) | ^( CONTAINS e19= expression e20= expression ) | ^( STRSTARTS e21= expression e22= expression ) | ^( STRENDS e23= expression e24= expression ) | ^( STRBEFORE e241= expression e242= expression ) | ^( STRAFTER e243= expression e244= expression ) | ^( YEAR e25= expression ) | ^( MONTH e26= expression ) | ^( DAY e27= expression ) | ^( HOURS e28= expression ) | ^( MINUTES e29= expression ) | ^( SECONDS e30= expression ) | ^( TIMEZONE e31= expression ) | ^( TZ e32= expression ) | NOW | UUID | STRUUID | ^( MD5 e33= expression ) | ^( SHA1 e34= expression ) | ^( SHA256 e36= expression ) | ^( SHA384 e37= expression ) | ^( SHA512 e38= expression ) | ^( COALESCE e39= expressionList ) | ^( IF e40= expression e41= expression e42= expression ) | ^( STRLANG e45= expression e46= expression ) | ^( STRDT e47= expression e48= expression ) | ^( SAMETERM sam1= expression sam2= expression ) | ^( ISIRI isi= expression ) | ^( ISURI isu= expression ) | ^( ISBLANK isb= expression ) | ^( ISLITERAL isl= expression ) | ^( ISNUMERIC e55= expression ) |r= regexExpression |p= existsFunc |p= notExistsFunc )
            int alt113=55;
            switch ( input.LA(1) ) {
            case STR:
                {
                alt113=1;
                }
                break;
            case LANG:
                {
                alt113=2;
                }
                break;
            case LANGMATCHES:
                {
                alt113=3;
                }
                break;
            case DATATYPE:
                {
                alt113=4;
                }
                break;
            case BOUND:
                {
                alt113=5;
                }
                break;
            case IRI:
                {
                alt113=6;
                }
                break;
            case URI:
                {
                alt113=7;
                }
                break;
            case BNODE:
                {
                int LA113_8 = input.LA(2);

                if ( (LA113_8==DOWN) ) {
                    alt113=8;
                }
                else if ( (LA113_8==UP||LA113_8==ABS||LA113_8==ASC||LA113_8==AVG||(LA113_8 >= BIG_DECIMAL && LA113_8 <= BIG_INTEGER)||(LA113_8 >= BNODE && LA113_8 <= BROKEN_PLUS)||LA113_8==CEIL||LA113_8==COALESCE||(LA113_8 >= CONCAT && LA113_8 <= CONDITION)||LA113_8==CONTAINS||LA113_8==COUNT||(LA113_8 >= DATATYPE && LA113_8 <= DAY)||LA113_8==DESC||LA113_8==DOUBLE||LA113_8==ENCODE_FOR_URI||LA113_8==EXISTS||LA113_8==EXPRESSION||LA113_8==FLOOR||LA113_8==FUNCTION||LA113_8==GROUP_CONCAT||LA113_8==HOURS||(LA113_8 >= IF && LA113_8 <= IN)||LA113_8==IRI||(LA113_8 >= ISBLANK && LA113_8 <= ISURI)||(LA113_8 >= LANG && LA113_8 <= LANGMATCHES)||LA113_8==LCASE||(LA113_8 >= LOGICAL_AND && LA113_8 <= LTE)||(LA113_8 >= MAX && LA113_8 <= MIN)||LA113_8==MINUTES||LA113_8==MONTH||LA113_8==NIL||(LA113_8 >= NOT && LA113_8 <= NOT_EXISTS)||LA113_8==NOW||(LA113_8 >= PREFIXED_NAME && LA113_8 <= PREFIXED_NS)||LA113_8==RAND||(LA113_8 >= REGEX && LA113_8 <= REPLACE)||LA113_8==ROUND||(LA113_8 >= SAMETERM && LA113_8 <= SECONDS)||LA113_8==SEPARATOR||LA113_8==SHA1||(LA113_8 >= SHA256 && LA113_8 <= SHA512)||(LA113_8 >= STR && LA113_8 <= STRING)||(LA113_8 >= STRLANG && LA113_8 <= STRUUID)||LA113_8==SUBSTR||LA113_8==SUM||LA113_8==TIMEZONE||LA113_8==TZ||LA113_8==UCASE||LA113_8==URI||LA113_8==UUID||LA113_8==VAR||LA113_8==YEAR||(LA113_8 >= 268 && LA113_8 <= 273)||(LA113_8 >= 275 && LA113_8 <= 277)) ) {
                    alt113=9;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return e;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 113, 8, input);

                    throw nvae;

                }
                }
                break;
            case RAND:
                {
                alt113=10;
                }
                break;
            case ABS:
                {
                alt113=11;
                }
                break;
            case CEIL:
                {
                alt113=12;
                }
                break;
            case FLOOR:
                {
                alt113=13;
                }
                break;
            case ROUND:
                {
                alt113=14;
                }
                break;
            case CONCAT:
                {
                alt113=15;
                }
                break;
            case SUBSTR:
                {
                alt113=16;
                }
                break;
            case STRLEN:
                {
                alt113=17;
                }
                break;
            case UCASE:
                {
                alt113=18;
                }
                break;
            case REPLACE:
                {
                alt113=19;
                }
                break;
            case LCASE:
                {
                alt113=20;
                }
                break;
            case ENCODE_FOR_URI:
                {
                alt113=21;
                }
                break;
            case CONTAINS:
                {
                alt113=22;
                }
                break;
            case STRSTARTS:
                {
                alt113=23;
                }
                break;
            case STRENDS:
                {
                alt113=24;
                }
                break;
            case STRBEFORE:
                {
                alt113=25;
                }
                break;
            case STRAFTER:
                {
                alt113=26;
                }
                break;
            case YEAR:
                {
                alt113=27;
                }
                break;
            case MONTH:
                {
                alt113=28;
                }
                break;
            case DAY:
                {
                alt113=29;
                }
                break;
            case HOURS:
                {
                alt113=30;
                }
                break;
            case MINUTES:
                {
                alt113=31;
                }
                break;
            case SECONDS:
                {
                alt113=32;
                }
                break;
            case TIMEZONE:
                {
                alt113=33;
                }
                break;
            case TZ:
                {
                alt113=34;
                }
                break;
            case NOW:
                {
                alt113=35;
                }
                break;
            case UUID:
                {
                alt113=36;
                }
                break;
            case STRUUID:
                {
                alt113=37;
                }
                break;
            case MD5:
                {
                alt113=38;
                }
                break;
            case SHA1:
                {
                alt113=39;
                }
                break;
            case SHA256:
                {
                alt113=40;
                }
                break;
            case SHA384:
                {
                alt113=41;
                }
                break;
            case SHA512:
                {
                alt113=42;
                }
                break;
            case COALESCE:
                {
                alt113=43;
                }
                break;
            case IF:
                {
                alt113=44;
                }
                break;
            case STRLANG:
                {
                alt113=45;
                }
                break;
            case STRDT:
                {
                alt113=46;
                }
                break;
            case SAMETERM:
                {
                alt113=47;
                }
                break;
            case ISIRI:
                {
                alt113=48;
                }
                break;
            case ISURI:
                {
                alt113=49;
                }
                break;
            case ISBLANK:
                {
                alt113=50;
                }
                break;
            case ISLITERAL:
                {
                alt113=51;
                }
                break;
            case ISNUMERIC:
                {
                alt113=52;
                }
                break;
            case REGEX:
                {
                alt113=53;
                }
                break;
            case EXISTS:
                {
                alt113=54;
                }
                break;
            case NOT_EXISTS:
                {
                alt113=55;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return e;}
                NoViableAltException nvae =
                    new NoViableAltException("", 113, 0, input);

                throw nvae;

            }

            switch (alt113) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:915:5: ^( STR st= expression )
                    {
                    match(input,STR,FOLLOW_STR_in_builtInCall7372); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall7376);
                    st=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { args.add(st); e = new BuiltinFunctionExpression(Expression.EBuiltinType.STR, args); 			}

                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:917:5: ^( LANG lg= expression )
                    {
                    match(input,LANG,FOLLOW_LANG_in_builtInCall7389); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall7393);
                    lg=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { args.add(lg); e = new BuiltinFunctionExpression(Expression.EBuiltinType.LANG, args); 		}

                    }
                    break;
                case 3 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:919:5: ^( LANGMATCHES lm1= expression lm2= expression )
                    {
                    match(input,LANGMATCHES,FOLLOW_LANGMATCHES_in_builtInCall7406); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall7410);
                    lm1=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    pushFollow(FOLLOW_expression_in_builtInCall7414);
                    lm2=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { e = new BuiltinFunctionExpression(Expression.EBuiltinType.LANGMATCHES, lm1, lm2); 			}

                    }
                    break;
                case 4 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:921:5: ^( DATATYPE dt= expression )
                    {
                    match(input,DATATYPE,FOLLOW_DATATYPE_in_builtInCall7427); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall7431);
                    dt=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { args.add(dt); e = new BuiltinFunctionExpression(Expression.EBuiltinType.DATATYPE, args); 	}

                    }
                    break;
                case 5 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:923:4: ^( BOUND v= var )
                    {
                    match(input,BOUND,FOLLOW_BOUND_in_builtInCall7443); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_var_in_builtInCall7447);
                    v=var();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { e = new BuiltinFunctionExpression(Expression.EBuiltinType.BOUND, new VariableExpression(v)); }

                    }
                    break;
                case 6 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:925:4: ^( IRI e6= expression )
                    {
                    match(input,IRI,FOLLOW_IRI_in_builtInCall7465); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall7469);
                    e6=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { args.add(e6); e = new BuiltinFunctionExpression(Expression.EBuiltinType.IRI, args);			}

                    }
                    break;
                case 7 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:927:5: ^( URI e7= expression )
                    {
                    match(input,URI,FOLLOW_URI_in_builtInCall7482); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall7486);
                    e7=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { args.add(e7); e = new BuiltinFunctionExpression(Expression.EBuiltinType.IRI, args);			}

                    }
                    break;
                case 8 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:929:4: ^( BNODE e8= expression )
                    {
                    match(input,BNODE,FOLLOW_BNODE_in_builtInCall7498); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall7502);
                    e8=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { args.add(e8); e = new BuiltinFunctionExpression(Expression.EBuiltinType.BNODE, args);		}

                    }
                    break;
                case 9 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:931:4: BNODE
                    {
                    match(input,BNODE,FOLLOW_BNODE_in_builtInCall7513); if (state.failed) return e;

                    if ( state.backtracking==0 ) { e = new BuiltinFunctionExpression(Expression.EBuiltinType.BNODE); 							}

                    }
                    break;
                case 10 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:933:4: ^( RAND NIL )
                    {
                    match(input,RAND,FOLLOW_RAND_in_builtInCall7524); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    match(input,NIL,FOLLOW_NIL_in_builtInCall7526); if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { e = new BuiltinFunctionExpression(Expression.EBuiltinType.RAND); 							}

                    }
                    break;
                case 11 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:935:4: ^( ABS e9= expression )
                    {
                    match(input,ABS,FOLLOW_ABS_in_builtInCall7539); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall7543);
                    e9=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { args.add(e9); e = new BuiltinFunctionExpression(Expression.EBuiltinType.ABS, args);			}

                    }
                    break;
                case 12 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:937:4: ^( CEIL e10= expression )
                    {
                    match(input,CEIL,FOLLOW_CEIL_in_builtInCall7555); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall7559);
                    e10=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { args.add(e10); e = new BuiltinFunctionExpression(Expression.EBuiltinType.CEIL, args);		}

                    }
                    break;
                case 13 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:939:4: ^( FLOOR e11= expression )
                    {
                    match(input,FLOOR,FOLLOW_FLOOR_in_builtInCall7571); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall7575);
                    e11=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { args.add(e11); e = new BuiltinFunctionExpression(Expression.EBuiltinType.FLOOR, args);		}

                    }
                    break;
                case 14 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:941:4: ^( ROUND e12= expression )
                    {
                    match(input,ROUND,FOLLOW_ROUND_in_builtInCall7587); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall7591);
                    e12=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { args.add(e12); e = new BuiltinFunctionExpression(Expression.EBuiltinType.ROUND, args);		}

                    }
                    break;
                case 15 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:943:4: ^( CONCAT e13= expressionList )
                    {
                    match(input,CONCAT,FOLLOW_CONCAT_in_builtInCall7603); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expressionList_in_builtInCall7607);
                    e13=expressionList();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { args.addAll(e13); e = new BuiltinFunctionExpression(Expression.EBuiltinType.CONCAT, args);		}

                    }
                    break;
                case 16 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:945:5: ^( SUBSTR e14= expression e15= expression (e16= expression )? )
                    {
                    match(input,SUBSTR,FOLLOW_SUBSTR_in_builtInCall7620); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall7624);
                    e14=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    pushFollow(FOLLOW_expression_in_builtInCall7628);
                    e15=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { args.add(e14); args.add(e15); }

                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:947:13: (e16= expression )?
                    int alt111=2;
                    int LA111_0 = input.LA(1);

                    if ( (LA111_0==ABS||LA111_0==AVG||(LA111_0 >= BIG_DECIMAL && LA111_0 <= BIG_INTEGER)||(LA111_0 >= BNODE && LA111_0 <= BROKEN_PLUS)||LA111_0==CEIL||LA111_0==COALESCE||LA111_0==CONCAT||LA111_0==CONTAINS||LA111_0==COUNT||(LA111_0 >= DATATYPE && LA111_0 <= DAY)||LA111_0==DOUBLE||LA111_0==ENCODE_FOR_URI||LA111_0==EXISTS||LA111_0==EXPRESSION||LA111_0==FLOOR||LA111_0==FUNCTION||LA111_0==GROUP_CONCAT||LA111_0==HOURS||(LA111_0 >= IF && LA111_0 <= IN)||LA111_0==IRI||(LA111_0 >= ISBLANK && LA111_0 <= ISURI)||(LA111_0 >= LANG && LA111_0 <= LANGMATCHES)||LA111_0==LCASE||(LA111_0 >= LOGICAL_AND && LA111_0 <= LTE)||(LA111_0 >= MAX && LA111_0 <= MIN)||LA111_0==MINUTES||LA111_0==MONTH||(LA111_0 >= NOT && LA111_0 <= NOT_EXISTS)||LA111_0==NOW||(LA111_0 >= PREFIXED_NAME && LA111_0 <= PREFIXED_NS)||LA111_0==RAND||(LA111_0 >= REGEX && LA111_0 <= REPLACE)||LA111_0==ROUND||(LA111_0 >= SAMETERM && LA111_0 <= SECONDS)||LA111_0==SHA1||(LA111_0 >= SHA256 && LA111_0 <= SHA512)||(LA111_0 >= STR && LA111_0 <= STRING)||(LA111_0 >= STRLANG && LA111_0 <= STRUUID)||LA111_0==SUBSTR||LA111_0==SUM||LA111_0==TIMEZONE||LA111_0==TZ||LA111_0==UCASE||LA111_0==URI||LA111_0==UUID||LA111_0==VAR||LA111_0==YEAR||(LA111_0 >= 268 && LA111_0 <= 273)||(LA111_0 >= 275 && LA111_0 <= 277)) ) {
                        alt111=1;
                    }
                    switch (alt111) {
                        case 1 :
                            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:947:15: e16= expression
                            {
                            pushFollow(FOLLOW_expression_in_builtInCall7652);
                            e16=expression();

                            state._fsp--;
                            if (state.failed) return e;

                            if ( state.backtracking==0 ) { args.add(e16); }

                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) {
                              e = new BuiltinFunctionExpression(Expression.EBuiltinType.SUB_STRING_EXP, args);
                            }

                    }
                    break;
                case 17 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:951:4: ^( STRLEN e15= expression )
                    {
                    match(input,STRLEN,FOLLOW_STRLEN_in_builtInCall7675); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall7679);
                    e15=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { args.add(e15); e = new BuiltinFunctionExpression(Expression.EBuiltinType.STRLEN, args);		}

                    }
                    break;
                case 18 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:953:4: ^( UCASE e16= expression )
                    {
                    match(input,UCASE,FOLLOW_UCASE_in_builtInCall7691); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall7695);
                    e16=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { args.add(e16); e = new BuiltinFunctionExpression(Expression.EBuiltinType.UCASE, args);		}

                    }
                    break;
                case 19 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:955:4: ^( REPLACE e1= expression e2= expression e3= expression (e4= expression )? )
                    {
                    match(input,REPLACE,FOLLOW_REPLACE_in_builtInCall7707); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall7711);
                    e1=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    pushFollow(FOLLOW_expression_in_builtInCall7715);
                    e2=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    pushFollow(FOLLOW_expression_in_builtInCall7719);
                    e3=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { args.add(e1); args.add(e2); args.add(e3); }

                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:957:13: (e4= expression )?
                    int alt112=2;
                    int LA112_0 = input.LA(1);

                    if ( (LA112_0==ABS||LA112_0==AVG||(LA112_0 >= BIG_DECIMAL && LA112_0 <= BIG_INTEGER)||(LA112_0 >= BNODE && LA112_0 <= BROKEN_PLUS)||LA112_0==CEIL||LA112_0==COALESCE||LA112_0==CONCAT||LA112_0==CONTAINS||LA112_0==COUNT||(LA112_0 >= DATATYPE && LA112_0 <= DAY)||LA112_0==DOUBLE||LA112_0==ENCODE_FOR_URI||LA112_0==EXISTS||LA112_0==EXPRESSION||LA112_0==FLOOR||LA112_0==FUNCTION||LA112_0==GROUP_CONCAT||LA112_0==HOURS||(LA112_0 >= IF && LA112_0 <= IN)||LA112_0==IRI||(LA112_0 >= ISBLANK && LA112_0 <= ISURI)||(LA112_0 >= LANG && LA112_0 <= LANGMATCHES)||LA112_0==LCASE||(LA112_0 >= LOGICAL_AND && LA112_0 <= LTE)||(LA112_0 >= MAX && LA112_0 <= MIN)||LA112_0==MINUTES||LA112_0==MONTH||(LA112_0 >= NOT && LA112_0 <= NOT_EXISTS)||LA112_0==NOW||(LA112_0 >= PREFIXED_NAME && LA112_0 <= PREFIXED_NS)||LA112_0==RAND||(LA112_0 >= REGEX && LA112_0 <= REPLACE)||LA112_0==ROUND||(LA112_0 >= SAMETERM && LA112_0 <= SECONDS)||LA112_0==SHA1||(LA112_0 >= SHA256 && LA112_0 <= SHA512)||(LA112_0 >= STR && LA112_0 <= STRING)||(LA112_0 >= STRLANG && LA112_0 <= STRUUID)||LA112_0==SUBSTR||LA112_0==SUM||LA112_0==TIMEZONE||LA112_0==TZ||LA112_0==UCASE||LA112_0==URI||LA112_0==UUID||LA112_0==VAR||LA112_0==YEAR||(LA112_0 >= 268 && LA112_0 <= 273)||(LA112_0 >= 275 && LA112_0 <= 277)) ) {
                        alt112=1;
                    }
                    switch (alt112) {
                        case 1 :
                            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:957:15: e4= expression
                            {
                            pushFollow(FOLLOW_expression_in_builtInCall7743);
                            e4=expression();

                            state._fsp--;
                            if (state.failed) return e;

                            if ( state.backtracking==0 ) { args.add(e4); }

                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { e = new BuiltinFunctionExpression(Expression.EBuiltinType.REPLACE, args);		}

                    }
                    break;
                case 20 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:959:4: ^( LCASE e17= expression )
                    {
                    match(input,LCASE,FOLLOW_LCASE_in_builtInCall7761); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall7765);
                    e17=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { args.add(e17); e = new BuiltinFunctionExpression(Expression.EBuiltinType.LCASE, args);		}

                    }
                    break;
                case 21 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:961:4: ^( ENCODE_FOR_URI e18= expression )
                    {
                    match(input,ENCODE_FOR_URI,FOLLOW_ENCODE_FOR_URI_in_builtInCall7777); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall7781);
                    e18=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { args.add(e18); e = new BuiltinFunctionExpression(Expression.EBuiltinType.ENCODE_FOR_URI, args);		}

                    }
                    break;
                case 22 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:963:4: ^( CONTAINS e19= expression e20= expression )
                    {
                    match(input,CONTAINS,FOLLOW_CONTAINS_in_builtInCall7793); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall7797);
                    e19=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    pushFollow(FOLLOW_expression_in_builtInCall7801);
                    e20=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { e = new BuiltinFunctionExpression(Expression.EBuiltinType.CONTAINS, e19, e20);				 }

                    }
                    break;
                case 23 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:965:4: ^( STRSTARTS e21= expression e22= expression )
                    {
                    match(input,STRSTARTS,FOLLOW_STRSTARTS_in_builtInCall7813); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall7817);
                    e21=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    pushFollow(FOLLOW_expression_in_builtInCall7821);
                    e22=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { e = new BuiltinFunctionExpression(Expression.EBuiltinType.STRSTARTS, e21, e22);				 }

                    }
                    break;
                case 24 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:967:4: ^( STRENDS e23= expression e24= expression )
                    {
                    match(input,STRENDS,FOLLOW_STRENDS_in_builtInCall7833); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall7837);
                    e23=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    pushFollow(FOLLOW_expression_in_builtInCall7841);
                    e24=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { e = new BuiltinFunctionExpression(Expression.EBuiltinType.STRENDS, e23, e24);				 }

                    }
                    break;
                case 25 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:969:4: ^( STRBEFORE e241= expression e242= expression )
                    {
                    match(input,STRBEFORE,FOLLOW_STRBEFORE_in_builtInCall7853); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall7857);
                    e241=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    pushFollow(FOLLOW_expression_in_builtInCall7861);
                    e242=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { e = new BuiltinFunctionExpression(Expression.EBuiltinType.STRBEFORE, e241, e242);				 }

                    }
                    break;
                case 26 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:971:4: ^( STRAFTER e243= expression e244= expression )
                    {
                    match(input,STRAFTER,FOLLOW_STRAFTER_in_builtInCall7873); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall7877);
                    e243=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    pushFollow(FOLLOW_expression_in_builtInCall7881);
                    e244=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { e = new BuiltinFunctionExpression(Expression.EBuiltinType.STRAFTER, e243, e244);				 }

                    }
                    break;
                case 27 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:973:4: ^( YEAR e25= expression )
                    {
                    match(input,YEAR,FOLLOW_YEAR_in_builtInCall7893); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall7897);
                    e25=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { args.add(e25); e = new BuiltinFunctionExpression(Expression.EBuiltinType.YEAR, args);		}

                    }
                    break;
                case 28 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:975:4: ^( MONTH e26= expression )
                    {
                    match(input,MONTH,FOLLOW_MONTH_in_builtInCall7909); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall7913);
                    e26=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { args.add(e26); e = new BuiltinFunctionExpression(Expression.EBuiltinType.MONTH, args);		}

                    }
                    break;
                case 29 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:977:4: ^( DAY e27= expression )
                    {
                    match(input,DAY,FOLLOW_DAY_in_builtInCall7925); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall7929);
                    e27=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { args.add(e27); e = new BuiltinFunctionExpression(Expression.EBuiltinType.DAY, args);		}

                    }
                    break;
                case 30 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:979:4: ^( HOURS e28= expression )
                    {
                    match(input,HOURS,FOLLOW_HOURS_in_builtInCall7941); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall7945);
                    e28=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { args.add(e28); e = new BuiltinFunctionExpression(Expression.EBuiltinType.HOURS, args);		}

                    }
                    break;
                case 31 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:981:4: ^( MINUTES e29= expression )
                    {
                    match(input,MINUTES,FOLLOW_MINUTES_in_builtInCall7957); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall7961);
                    e29=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { args.add(e29); e = new BuiltinFunctionExpression(Expression.EBuiltinType.MINUTES, args);		}

                    }
                    break;
                case 32 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:983:4: ^( SECONDS e30= expression )
                    {
                    match(input,SECONDS,FOLLOW_SECONDS_in_builtInCall7973); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall7977);
                    e30=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { args.add(e30); e = new BuiltinFunctionExpression(Expression.EBuiltinType.SECONDS, args);		}

                    }
                    break;
                case 33 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:985:4: ^( TIMEZONE e31= expression )
                    {
                    match(input,TIMEZONE,FOLLOW_TIMEZONE_in_builtInCall7989); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall7993);
                    e31=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { args.add(e31); e = new BuiltinFunctionExpression(Expression.EBuiltinType.TIMEZONE, args);		}

                    }
                    break;
                case 34 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:987:4: ^( TZ e32= expression )
                    {
                    match(input,TZ,FOLLOW_TZ_in_builtInCall8005); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall8009);
                    e32=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { args.add(e32); e = new BuiltinFunctionExpression(Expression.EBuiltinType.TZ, args);		}

                    }
                    break;
                case 35 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:989:4: NOW
                    {
                    match(input,NOW,FOLLOW_NOW_in_builtInCall8020); if (state.failed) return e;

                    if ( state.backtracking==0 ) { e = new BuiltinFunctionExpression(Expression.EBuiltinType.NOW); }

                    }
                    break;
                case 36 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:990:9: UUID
                    {
                    match(input,UUID,FOLLOW_UUID_in_builtInCall8032); if (state.failed) return e;

                    if ( state.backtracking==0 ) { e = new BuiltinFunctionExpression(Expression.EBuiltinType.UUID); }

                    }
                    break;
                case 37 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:991:9: STRUUID
                    {
                    match(input,STRUUID,FOLLOW_STRUUID_in_builtInCall8044); if (state.failed) return e;

                    if ( state.backtracking==0 ) { e = new BuiltinFunctionExpression(Expression.EBuiltinType.STRUUID); }

                    }
                    break;
                case 38 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:992:4: ^( MD5 e33= expression )
                    {
                    match(input,MD5,FOLLOW_MD5_in_builtInCall8053); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall8057);
                    e33=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { e = new BuiltinFunctionExpression(Expression.EBuiltinType.MD5, e33); 			}

                    }
                    break;
                case 39 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:994:4: ^( SHA1 e34= expression )
                    {
                    match(input,SHA1,FOLLOW_SHA1_in_builtInCall8069); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall8073);
                    e34=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { e = new BuiltinFunctionExpression(Expression.EBuiltinType.SHA1, e34); 			}

                    }
                    break;
                case 40 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:996:4: ^( SHA256 e36= expression )
                    {
                    match(input,SHA256,FOLLOW_SHA256_in_builtInCall8085); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall8089);
                    e36=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { e = new BuiltinFunctionExpression(Expression.EBuiltinType.SHA256, e36); 			}

                    }
                    break;
                case 41 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:998:4: ^( SHA384 e37= expression )
                    {
                    match(input,SHA384,FOLLOW_SHA384_in_builtInCall8101); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall8105);
                    e37=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { e = new BuiltinFunctionExpression(Expression.EBuiltinType.SHA384, e37); 			}

                    }
                    break;
                case 42 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:1000:4: ^( SHA512 e38= expression )
                    {
                    match(input,SHA512,FOLLOW_SHA512_in_builtInCall8117); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall8121);
                    e38=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { e = new BuiltinFunctionExpression(Expression.EBuiltinType.SHA512, e38); 			}

                    }
                    break;
                case 43 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:1002:4: ^( COALESCE e39= expressionList )
                    {
                    match(input,COALESCE,FOLLOW_COALESCE_in_builtInCall8133); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expressionList_in_builtInCall8137);
                    e39=expressionList();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { e = new BuiltinFunctionExpression(Expression.EBuiltinType.COALESCE, e39); 			}

                    }
                    break;
                case 44 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:1004:4: ^( IF e40= expression e41= expression e42= expression )
                    {
                    match(input,IF,FOLLOW_IF_in_builtInCall8149); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall8153);
                    e40=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    pushFollow(FOLLOW_expression_in_builtInCall8157);
                    e41=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    pushFollow(FOLLOW_expression_in_builtInCall8161);
                    e42=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { e = new BuiltinFunctionExpression(Expression.EBuiltinType.IF, e40, e41, e42); 			}

                    }
                    break;
                case 45 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:1006:4: ^( STRLANG e45= expression e46= expression )
                    {
                    match(input,STRLANG,FOLLOW_STRLANG_in_builtInCall8173); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall8177);
                    e45=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    pushFollow(FOLLOW_expression_in_builtInCall8181);
                    e46=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { e = new BuiltinFunctionExpression(Expression.EBuiltinType.STRLANG, e45, e46); 			}

                    }
                    break;
                case 46 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:1008:4: ^( STRDT e47= expression e48= expression )
                    {
                    match(input,STRDT,FOLLOW_STRDT_in_builtInCall8193); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall8197);
                    e47=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    pushFollow(FOLLOW_expression_in_builtInCall8201);
                    e48=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { e = new BuiltinFunctionExpression(Expression.EBuiltinType.STRDT, e47, e48); 			}

                    }
                    break;
                case 47 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:1010:4: ^( SAMETERM sam1= expression sam2= expression )
                    {
                    match(input,SAMETERM,FOLLOW_SAMETERM_in_builtInCall8213); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall8217);
                    sam1=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    pushFollow(FOLLOW_expression_in_builtInCall8221);
                    sam2=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { e = new BuiltinFunctionExpression(Expression.EBuiltinType.SAMETERM, sam1, sam2); 			}

                    }
                    break;
                case 48 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:1012:4: ^( ISIRI isi= expression )
                    {
                    match(input,ISIRI,FOLLOW_ISIRI_in_builtInCall8233); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall8237);
                    isi=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { args.add(isi); e = new BuiltinFunctionExpression(Expression.EBuiltinType.ISIRI, args); 		}

                    }
                    break;
                case 49 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:1014:4: ^( ISURI isu= expression )
                    {
                    match(input,ISURI,FOLLOW_ISURI_in_builtInCall8249); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall8253);
                    isu=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { args.add(isu); e = new BuiltinFunctionExpression(Expression.EBuiltinType.ISIRI, args); 		}

                    }
                    break;
                case 50 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:1016:4: ^( ISBLANK isb= expression )
                    {
                    match(input,ISBLANK,FOLLOW_ISBLANK_in_builtInCall8265); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall8269);
                    isb=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { args.add(isb); e = new BuiltinFunctionExpression(Expression.EBuiltinType.ISBLANK, args); 	}

                    }
                    break;
                case 51 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:1018:4: ^( ISLITERAL isl= expression )
                    {
                    match(input,ISLITERAL,FOLLOW_ISLITERAL_in_builtInCall8281); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall8285);
                    isl=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { args.add(isl); e = new BuiltinFunctionExpression(Expression.EBuiltinType.ISLITERAL, args); 	}

                    }
                    break;
                case 52 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:1020:4: ^( ISNUMERIC e55= expression )
                    {
                    match(input,ISNUMERIC,FOLLOW_ISNUMERIC_in_builtInCall8297); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall8301);
                    e55=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { args.add(e55); e = new BuiltinFunctionExpression(Expression.EBuiltinType.ISNUMERIC, args); 	}

                    }
                    break;
                case 53 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:1022:4: r= regexExpression
                    {
                    pushFollow(FOLLOW_regexExpression_in_builtInCall8314);
                    r=regexExpression();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { e = r; }

                    }
                    break;
                case 54 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:1023:4: p= existsFunc
                    {
                    pushFollow(FOLLOW_existsFunc_in_builtInCall8323);
                    p=existsFunc();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { e = new BuiltinFunctionExpression(Expression.EBuiltinType.EXISTS, p); 	}

                    }
                    break;
                case 55 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:1024:4: p= notExistsFunc
                    {
                    pushFollow(FOLLOW_notExistsFunc_in_builtInCall8332);
                    p=notExistsFunc();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { e = new BuiltinFunctionExpression(Expression.EBuiltinType.NOT_EXISTS, p); 	}

                    }
                    break;

            }
        }

        	catch(RecognitionException re) {
        		throw new SPARQLsyntaxError(re);
        	}

        finally {
        	// do for sure before leaving
        }
        return e;
    }
    // $ANTLR end "builtInCall"



    // $ANTLR start "regexExpression"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:1027:1: regexExpression returns [Expression e] : ^( REGEX e1= expression e2= expression (e3= expression )? ) ;
    public final Expression regexExpression() throws RecognitionException {
        Expression e = null;


        Expression e1 =null;

        Expression e2 =null;

        Expression e3 =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:1028:2: ( ^( REGEX e1= expression e2= expression (e3= expression )? ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:1028:6: ^( REGEX e1= expression e2= expression (e3= expression )? )
            {
            match(input,REGEX,FOLLOW_REGEX_in_regexExpression8355); if (state.failed) return e;

            match(input, Token.DOWN, null); if (state.failed) return e;
            pushFollow(FOLLOW_expression_in_regexExpression8359);
            e1=expression();

            state._fsp--;
            if (state.failed) return e;

            pushFollow(FOLLOW_expression_in_regexExpression8363);
            e2=expression();

            state._fsp--;
            if (state.failed) return e;

            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:1028:44: (e3= expression )?
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==ABS||LA114_0==AVG||(LA114_0 >= BIG_DECIMAL && LA114_0 <= BIG_INTEGER)||(LA114_0 >= BNODE && LA114_0 <= BROKEN_PLUS)||LA114_0==CEIL||LA114_0==COALESCE||LA114_0==CONCAT||LA114_0==CONTAINS||LA114_0==COUNT||(LA114_0 >= DATATYPE && LA114_0 <= DAY)||LA114_0==DOUBLE||LA114_0==ENCODE_FOR_URI||LA114_0==EXISTS||LA114_0==EXPRESSION||LA114_0==FLOOR||LA114_0==FUNCTION||LA114_0==GROUP_CONCAT||LA114_0==HOURS||(LA114_0 >= IF && LA114_0 <= IN)||LA114_0==IRI||(LA114_0 >= ISBLANK && LA114_0 <= ISURI)||(LA114_0 >= LANG && LA114_0 <= LANGMATCHES)||LA114_0==LCASE||(LA114_0 >= LOGICAL_AND && LA114_0 <= LTE)||(LA114_0 >= MAX && LA114_0 <= MIN)||LA114_0==MINUTES||LA114_0==MONTH||(LA114_0 >= NOT && LA114_0 <= NOT_EXISTS)||LA114_0==NOW||(LA114_0 >= PREFIXED_NAME && LA114_0 <= PREFIXED_NS)||LA114_0==RAND||(LA114_0 >= REGEX && LA114_0 <= REPLACE)||LA114_0==ROUND||(LA114_0 >= SAMETERM && LA114_0 <= SECONDS)||LA114_0==SHA1||(LA114_0 >= SHA256 && LA114_0 <= SHA512)||(LA114_0 >= STR && LA114_0 <= STRING)||(LA114_0 >= STRLANG && LA114_0 <= STRUUID)||LA114_0==SUBSTR||LA114_0==SUM||LA114_0==TIMEZONE||LA114_0==TZ||LA114_0==UCASE||LA114_0==URI||LA114_0==UUID||LA114_0==VAR||LA114_0==YEAR||(LA114_0 >= 268 && LA114_0 <= 273)||(LA114_0 >= 275 && LA114_0 <= 277)) ) {
                alt114=1;
            }
            switch (alt114) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:1028:44: e3= expression
                    {
                    pushFollow(FOLLOW_expression_in_regexExpression8367);
                    e3=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return e;


            if ( state.backtracking==0 ) { e = new BuiltinFunctionExpression(Expression.EBuiltinType.REGEX, e1, e2, e3); }

            }

        }

        	catch(RecognitionException re) {
        		throw new SPARQLsyntaxError(re);
        	}

        finally {
        	// do for sure before leaving
        }
        return e;
    }
    // $ANTLR end "regexExpression"



    // $ANTLR start "existsFunc"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:1032:1: existsFunc returns [Pattern p] : ^( EXISTS g= groupGraphPattern[false] ) ;
    public final Pattern existsFunc() throws RecognitionException {
        Pattern p = null;


        Pattern g =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:1033:2: ( ^( EXISTS g= groupGraphPattern[false] ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:1033:6: ^( EXISTS g= groupGraphPattern[false] )
            {
            match(input,EXISTS,FOLLOW_EXISTS_in_existsFunc8399); if (state.failed) return p;

            match(input, Token.DOWN, null); if (state.failed) return p;
            pushFollow(FOLLOW_groupGraphPattern_in_existsFunc8403);
            g=groupGraphPattern(false);

            state._fsp--;
            if (state.failed) return p;

            match(input, Token.UP, null); if (state.failed) return p;


            if ( state.backtracking==0 ) { p = g; }

            }

        }

        	catch(RecognitionException re) {
        		throw new SPARQLsyntaxError(re);
        	}

        finally {
        	// do for sure before leaving
        }
        return p;
    }
    // $ANTLR end "existsFunc"



    // $ANTLR start "notExistsFunc"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:1037:1: notExistsFunc returns [Pattern p] : ^( NOT_EXISTS g= groupGraphPattern[false] ) ;
    public final Pattern notExistsFunc() throws RecognitionException {
        Pattern p = null;


        Pattern g =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:1038:2: ( ^( NOT_EXISTS g= groupGraphPattern[false] ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:1038:6: ^( NOT_EXISTS g= groupGraphPattern[false] )
            {
            match(input,NOT_EXISTS,FOLLOW_NOT_EXISTS_in_notExistsFunc8434); if (state.failed) return p;

            match(input, Token.DOWN, null); if (state.failed) return p;
            pushFollow(FOLLOW_groupGraphPattern_in_notExistsFunc8438);
            g=groupGraphPattern(false);

            state._fsp--;
            if (state.failed) return p;

            match(input, Token.UP, null); if (state.failed) return p;


            if ( state.backtracking==0 ) { p = g; }

            }

        }

        	catch(RecognitionException re) {
        		throw new SPARQLsyntaxError(re);
        	}

        finally {
        	// do for sure before leaving
        }
        return p;
    }
    // $ANTLR end "notExistsFunc"



    // $ANTLR start "aggregate"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:1042:1: aggregate returns [AggregateExpression a] : ( ^( COUNT ( DISTINCT )? (e1= expression | '*' ) ) | ^( SUM ( DISTINCT )? e2= expression ) | ^( MIN ( DISTINCT )? e3= expression ) | ^( MAX ( DISTINCT )? e4= expression ) | ^( AVG ( DISTINCT )? e5= expression ) | ^( SAMPLE ( DISTINCT )? e6= expression ) | ^( GROUP_CONCAT ( DISTINCT )? e7= expression ( ^( SEPARATOR s= string ) )? ) );
    public final AggregateExpression aggregate() throws RecognitionException {
        AggregateExpression a = null;


        Expression e1 =null;

        Expression e2 =null;

        Expression e3 =null;

        Expression e4 =null;

        Expression e5 =null;

        Expression e6 =null;

        Expression e7 =null;

        String s =null;


         
        		a = new AggregateExpression(); 
        	
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:1046:2: ( ^( COUNT ( DISTINCT )? (e1= expression | '*' ) ) | ^( SUM ( DISTINCT )? e2= expression ) | ^( MIN ( DISTINCT )? e3= expression ) | ^( MAX ( DISTINCT )? e4= expression ) | ^( AVG ( DISTINCT )? e5= expression ) | ^( SAMPLE ( DISTINCT )? e6= expression ) | ^( GROUP_CONCAT ( DISTINCT )? e7= expression ( ^( SEPARATOR s= string ) )? ) )
            int alt124=7;
            switch ( input.LA(1) ) {
            case COUNT:
                {
                alt124=1;
                }
                break;
            case SUM:
                {
                alt124=2;
                }
                break;
            case MIN:
                {
                alt124=3;
                }
                break;
            case MAX:
                {
                alt124=4;
                }
                break;
            case AVG:
                {
                alt124=5;
                }
                break;
            case SAMPLE:
                {
                alt124=6;
                }
                break;
            case GROUP_CONCAT:
                {
                alt124=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return a;}
                NoViableAltException nvae =
                    new NoViableAltException("", 124, 0, input);

                throw nvae;

            }

            switch (alt124) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:1047:3: ^( COUNT ( DISTINCT )? (e1= expression | '*' ) )
                    {
                    match(input,COUNT,FOLLOW_COUNT_in_aggregate8473); if (state.failed) return a;

                    if ( state.backtracking==0 ) { a.setAggregationType(AggregateExpression.EType.COUNT);  	}

                    match(input, Token.DOWN, null); if (state.failed) return a;
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:1048:4: ( DISTINCT )?
                    int alt115=2;
                    int LA115_0 = input.LA(1);

                    if ( (LA115_0==DISTINCT) ) {
                        alt115=1;
                    }
                    switch (alt115) {
                        case 1 :
                            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:1048:5: DISTINCT
                            {
                            match(input,DISTINCT,FOLLOW_DISTINCT_in_aggregate8485); if (state.failed) return a;

                            if ( state.backtracking==0 ) { a.isDistinct(true);	}

                            }
                            break;

                    }


                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:1049:4: (e1= expression | '*' )
                    int alt116=2;
                    int LA116_0 = input.LA(1);

                    if ( (LA116_0==ABS||LA116_0==AVG||(LA116_0 >= BIG_DECIMAL && LA116_0 <= BIG_INTEGER)||(LA116_0 >= BNODE && LA116_0 <= BROKEN_PLUS)||LA116_0==CEIL||LA116_0==COALESCE||LA116_0==CONCAT||LA116_0==CONTAINS||LA116_0==COUNT||(LA116_0 >= DATATYPE && LA116_0 <= DAY)||LA116_0==DOUBLE||LA116_0==ENCODE_FOR_URI||LA116_0==EXISTS||LA116_0==EXPRESSION||LA116_0==FLOOR||LA116_0==FUNCTION||LA116_0==GROUP_CONCAT||LA116_0==HOURS||(LA116_0 >= IF && LA116_0 <= IN)||LA116_0==IRI||(LA116_0 >= ISBLANK && LA116_0 <= ISURI)||(LA116_0 >= LANG && LA116_0 <= LANGMATCHES)||LA116_0==LCASE||(LA116_0 >= LOGICAL_AND && LA116_0 <= LTE)||(LA116_0 >= MAX && LA116_0 <= MIN)||LA116_0==MINUTES||LA116_0==MONTH||(LA116_0 >= NOT && LA116_0 <= NOT_EXISTS)||LA116_0==NOW||(LA116_0 >= PREFIXED_NAME && LA116_0 <= PREFIXED_NS)||LA116_0==RAND||(LA116_0 >= REGEX && LA116_0 <= REPLACE)||LA116_0==ROUND||(LA116_0 >= SAMETERM && LA116_0 <= SECONDS)||LA116_0==SHA1||(LA116_0 >= SHA256 && LA116_0 <= SHA512)||(LA116_0 >= STR && LA116_0 <= STRING)||(LA116_0 >= STRLANG && LA116_0 <= STRUUID)||LA116_0==SUBSTR||LA116_0==SUM||LA116_0==TIMEZONE||LA116_0==TZ||LA116_0==UCASE||LA116_0==URI||LA116_0==UUID||LA116_0==VAR||LA116_0==YEAR||(LA116_0 >= 268 && LA116_0 <= 269)||(LA116_0 >= 271 && LA116_0 <= 273)||(LA116_0 >= 275 && LA116_0 <= 277)) ) {
                        alt116=1;
                    }
                    else if ( (LA116_0==270) ) {
                        int LA116_2 = input.LA(2);

                        if ( (LA116_2==DOWN) ) {
                            alt116=1;
                        }
                        else if ( (LA116_2==UP) ) {
                            alt116=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return a;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 116, 2, input);

                            throw nvae;

                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return a;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 116, 0, input);

                        throw nvae;

                    }
                    switch (alt116) {
                        case 1 :
                            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:1049:6: e1= expression
                            {
                            pushFollow(FOLLOW_expression_in_aggregate8542);
                            e1=expression();

                            state._fsp--;
                            if (state.failed) return a;

                            if ( state.backtracking==0 ) { a.setArgs(e1);		}

                            }
                            break;
                        case 2 :
                            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:1050:6: '*'
                            {
                            match(input,270,FOLLOW_270_in_aggregate8552); if (state.failed) return a;

                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return a;


                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:1053:5: ^( SUM ( DISTINCT )? e2= expression )
                    {
                    match(input,SUM,FOLLOW_SUM_in_aggregate8572); if (state.failed) return a;

                    if ( state.backtracking==0 ) { a.setAggregationType(AggregateExpression.EType.SUM);  	}

                    match(input, Token.DOWN, null); if (state.failed) return a;
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:1054:4: ( DISTINCT )?
                    int alt117=2;
                    int LA117_0 = input.LA(1);

                    if ( (LA117_0==DISTINCT) ) {
                        alt117=1;
                    }
                    switch (alt117) {
                        case 1 :
                            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:1054:5: DISTINCT
                            {
                            match(input,DISTINCT,FOLLOW_DISTINCT_in_aggregate8584); if (state.failed) return a;

                            if ( state.backtracking==0 ) { a.isDistinct(true);	}

                            }
                            break;

                    }


                    pushFollow(FOLLOW_expression_in_aggregate8601);
                    e2=expression();

                    state._fsp--;
                    if (state.failed) return a;

                    if ( state.backtracking==0 ) { a.setArgs(e2);		}

                    match(input, Token.UP, null); if (state.failed) return a;


                    }
                    break;
                case 3 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:1057:4: ^( MIN ( DISTINCT )? e3= expression )
                    {
                    match(input,MIN,FOLLOW_MIN_in_aggregate8614); if (state.failed) return a;

                    if ( state.backtracking==0 ) { a.setAggregationType(AggregateExpression.EType.MIN);  	}

                    match(input, Token.DOWN, null); if (state.failed) return a;
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:1058:4: ( DISTINCT )?
                    int alt118=2;
                    int LA118_0 = input.LA(1);

                    if ( (LA118_0==DISTINCT) ) {
                        alt118=1;
                    }
                    switch (alt118) {
                        case 1 :
                            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:1058:5: DISTINCT
                            {
                            match(input,DISTINCT,FOLLOW_DISTINCT_in_aggregate8627); if (state.failed) return a;

                            if ( state.backtracking==0 ) { a.isDistinct(true);	}

                            }
                            break;

                    }


                    pushFollow(FOLLOW_expression_in_aggregate8643);
                    e3=expression();

                    state._fsp--;
                    if (state.failed) return a;

                    if ( state.backtracking==0 ) { a.setArgs(e3);		}

                    match(input, Token.UP, null); if (state.failed) return a;


                    }
                    break;
                case 4 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:1061:4: ^( MAX ( DISTINCT )? e4= expression )
                    {
                    match(input,MAX,FOLLOW_MAX_in_aggregate8656); if (state.failed) return a;

                    if ( state.backtracking==0 ) { a.setAggregationType(AggregateExpression.EType.MAX);  	}

                    match(input, Token.DOWN, null); if (state.failed) return a;
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:1062:4: ( DISTINCT )?
                    int alt119=2;
                    int LA119_0 = input.LA(1);

                    if ( (LA119_0==DISTINCT) ) {
                        alt119=1;
                    }
                    switch (alt119) {
                        case 1 :
                            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:1062:5: DISTINCT
                            {
                            match(input,DISTINCT,FOLLOW_DISTINCT_in_aggregate8669); if (state.failed) return a;

                            if ( state.backtracking==0 ) { a.isDistinct(true);	}

                            }
                            break;

                    }


                    pushFollow(FOLLOW_expression_in_aggregate8686);
                    e4=expression();

                    state._fsp--;
                    if (state.failed) return a;

                    if ( state.backtracking==0 ) { a.setArgs(e4);		}

                    match(input, Token.UP, null); if (state.failed) return a;


                    }
                    break;
                case 5 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:1065:4: ^( AVG ( DISTINCT )? e5= expression )
                    {
                    match(input,AVG,FOLLOW_AVG_in_aggregate8699); if (state.failed) return a;

                    if ( state.backtracking==0 ) { a.setAggregationType(AggregateExpression.EType.AVG);  	}

                    match(input, Token.DOWN, null); if (state.failed) return a;
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:1066:4: ( DISTINCT )?
                    int alt120=2;
                    int LA120_0 = input.LA(1);

                    if ( (LA120_0==DISTINCT) ) {
                        alt120=1;
                    }
                    switch (alt120) {
                        case 1 :
                            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:1066:5: DISTINCT
                            {
                            match(input,DISTINCT,FOLLOW_DISTINCT_in_aggregate8712); if (state.failed) return a;

                            if ( state.backtracking==0 ) { a.isDistinct(true);	}

                            }
                            break;

                    }


                    pushFollow(FOLLOW_expression_in_aggregate8729);
                    e5=expression();

                    state._fsp--;
                    if (state.failed) return a;

                    if ( state.backtracking==0 ) { a.setArgs(e5);		}

                    match(input, Token.UP, null); if (state.failed) return a;


                    }
                    break;
                case 6 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:1069:4: ^( SAMPLE ( DISTINCT )? e6= expression )
                    {
                    match(input,SAMPLE,FOLLOW_SAMPLE_in_aggregate8742); if (state.failed) return a;

                    if ( state.backtracking==0 ) { a.setAggregationType(AggregateExpression.EType.SAMPLE);  }

                    match(input, Token.DOWN, null); if (state.failed) return a;
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:1070:4: ( DISTINCT )?
                    int alt121=2;
                    int LA121_0 = input.LA(1);

                    if ( (LA121_0==DISTINCT) ) {
                        alt121=1;
                    }
                    switch (alt121) {
                        case 1 :
                            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:1070:5: DISTINCT
                            {
                            match(input,DISTINCT,FOLLOW_DISTINCT_in_aggregate8754); if (state.failed) return a;

                            if ( state.backtracking==0 ) { a.isDistinct(true);	}

                            }
                            break;

                    }


                    pushFollow(FOLLOW_expression_in_aggregate8771);
                    e6=expression();

                    state._fsp--;
                    if (state.failed) return a;

                    if ( state.backtracking==0 ) { a.setArgs(e6);		}

                    match(input, Token.UP, null); if (state.failed) return a;


                    }
                    break;
                case 7 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:1073:5: ^( GROUP_CONCAT ( DISTINCT )? e7= expression ( ^( SEPARATOR s= string ) )? )
                    {
                    match(input,GROUP_CONCAT,FOLLOW_GROUP_CONCAT_in_aggregate8785); if (state.failed) return a;

                    if ( state.backtracking==0 ) { a.setAggregationType(AggregateExpression.EType.GROUP_CONCAT); }

                    match(input, Token.DOWN, null); if (state.failed) return a;
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:1074:4: ( DISTINCT )?
                    int alt122=2;
                    int LA122_0 = input.LA(1);

                    if ( (LA122_0==DISTINCT) ) {
                        alt122=1;
                    }
                    switch (alt122) {
                        case 1 :
                            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:1074:5: DISTINCT
                            {
                            match(input,DISTINCT,FOLLOW_DISTINCT_in_aggregate8797); if (state.failed) return a;

                            if ( state.backtracking==0 ) { a.isDistinct(true);	}

                            }
                            break;

                    }


                    pushFollow(FOLLOW_expression_in_aggregate8812);
                    e7=expression();

                    state._fsp--;
                    if (state.failed) return a;

                    if ( state.backtracking==0 ) { a.setArgs(e7);		}

                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:1076:4: ( ^( SEPARATOR s= string ) )?
                    int alt123=2;
                    int LA123_0 = input.LA(1);

                    if ( (LA123_0==SEPARATOR) ) {
                        alt123=1;
                    }
                    switch (alt123) {
                        case 1 :
                            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:1076:5: ^( SEPARATOR s= string )
                            {
                            match(input,SEPARATOR,FOLLOW_SEPARATOR_in_aggregate8823); if (state.failed) return a;

                            match(input, Token.DOWN, null); if (state.failed) return a;
                            pushFollow(FOLLOW_string_in_aggregate8827);
                            s=string();

                            state._fsp--;
                            if (state.failed) return a;

                            if ( state.backtracking==0 ) { a.setSeparator(s);		}

                            match(input, Token.UP, null); if (state.failed) return a;


                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return a;


                    }
                    break;

            }
        }

        	catch(RecognitionException re) {
        		throw new SPARQLsyntaxError(re);
        	}

        finally {
        	// do for sure before leaving
        }
        return a;
    }
    // $ANTLR end "aggregate"



    // $ANTLR start "iRIFunction"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:1080:1: iRIFunction returns [FunctionCall f] : ^( FUNCTION i= iRIref (a= argList )? ) ;
    public final FunctionCall iRIFunction() throws RecognitionException {
        FunctionCall f = null;


        IRI i =null;

        List<Expression> a =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:1081:2: ( ^( FUNCTION i= iRIref (a= argList )? ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:1081:6: ^( FUNCTION i= iRIref (a= argList )? )
            {
            match(input,FUNCTION,FOLLOW_FUNCTION_in_iRIFunction8856); if (state.failed) return f;

            match(input, Token.DOWN, null); if (state.failed) return f;
            pushFollow(FOLLOW_iRIref_in_iRIFunction8866);
            i=iRIref();

            state._fsp--;
            if (state.failed) return f;

            if ( state.backtracking==0 ) { f = new FunctionCall(i); }

            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:1083:5: (a= argList )?
            int alt125=2;
            int LA125_0 = input.LA(1);

            if ( (LA125_0==ABS||LA125_0==AVG||(LA125_0 >= BIG_DECIMAL && LA125_0 <= BIG_INTEGER)||(LA125_0 >= BNODE && LA125_0 <= BROKEN_PLUS)||LA125_0==CEIL||LA125_0==COALESCE||LA125_0==CONCAT||LA125_0==CONTAINS||LA125_0==COUNT||(LA125_0 >= DATATYPE && LA125_0 <= DAY)||LA125_0==DISTINCT||LA125_0==DOUBLE||LA125_0==ENCODE_FOR_URI||LA125_0==EXISTS||LA125_0==EXPRESSION||LA125_0==FLOOR||LA125_0==FUNCTION||LA125_0==GROUP_CONCAT||LA125_0==HOURS||(LA125_0 >= IF && LA125_0 <= IN)||LA125_0==IRI||(LA125_0 >= ISBLANK && LA125_0 <= ISURI)||(LA125_0 >= LANG && LA125_0 <= LANGMATCHES)||LA125_0==LCASE||(LA125_0 >= LOGICAL_AND && LA125_0 <= LTE)||(LA125_0 >= MAX && LA125_0 <= MIN)||LA125_0==MINUTES||LA125_0==MONTH||LA125_0==NIL||(LA125_0 >= NOT && LA125_0 <= NOT_EXISTS)||LA125_0==NOW||(LA125_0 >= PREFIXED_NAME && LA125_0 <= PREFIXED_NS)||LA125_0==RAND||(LA125_0 >= REGEX && LA125_0 <= REPLACE)||LA125_0==ROUND||(LA125_0 >= SAMETERM && LA125_0 <= SECONDS)||LA125_0==SHA1||(LA125_0 >= SHA256 && LA125_0 <= SHA512)||(LA125_0 >= STR && LA125_0 <= STRING)||(LA125_0 >= STRLANG && LA125_0 <= STRUUID)||LA125_0==SUBSTR||LA125_0==SUM||LA125_0==TIMEZONE||LA125_0==TZ||LA125_0==UCASE||LA125_0==URI||LA125_0==UUID||LA125_0==VAR||LA125_0==YEAR||(LA125_0 >= 268 && LA125_0 <= 273)||(LA125_0 >= 275 && LA125_0 <= 277)) ) {
                alt125=1;
            }
            switch (alt125) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:1083:6: a= argList
                    {
                    pushFollow(FOLLOW_argList_in_iRIFunction8878);
                    a=argList();

                    state._fsp--;
                    if (state.failed) return f;

                    if ( state.backtracking==0 ) { f.addArguments(a); 		}

                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return f;


            }

        }

        	catch(RecognitionException re) {
        		throw new SPARQLsyntaxError(re);
        	}

        finally {
        	// do for sure before leaving
        }
        return f;
    }
    // $ANTLR end "iRIFunction"



    // $ANTLR start "rDFLiteral"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:1087:1: rDFLiteral returns [StringLiteral sl] : s= string (l= LANGTAG | ( '^^' i= iRIref ) )? ;
    public final StringLiteral rDFLiteral() throws RecognitionException {
        StringLiteral sl = null;


        XTree l=null;
        String s =null;

        IRI i =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:1088:2: (s= string (l= LANGTAG | ( '^^' i= iRIref ) )? )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:1088:6: s= string (l= LANGTAG | ( '^^' i= iRIref ) )?
            {
            pushFollow(FOLLOW_string_in_rDFLiteral8910);
            s=string();

            state._fsp--;
            if (state.failed) return sl;

            if ( state.backtracking==0 ) { sl = new StringLiteral(s);     }

            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:1089:3: (l= LANGTAG | ( '^^' i= iRIref ) )?
            int alt126=3;
            int LA126_0 = input.LA(1);

            if ( (LA126_0==LANGTAG) ) {
                alt126=1;
            }
            else if ( (LA126_0==280) ) {
                alt126=2;
            }
            switch (alt126) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:1089:5: l= LANGTAG
                    {
                    l=(XTree)match(input,LANGTAG,FOLLOW_LANGTAG_in_rDFLiteral8925); if (state.failed) return sl;

                    if ( state.backtracking==0 ) { sl.setLanguage((l!=null?l.getText():null));        }

                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:1090:5: ( '^^' i= iRIref )
                    {
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:1090:5: ( '^^' i= iRIref )
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:1090:7: '^^' i= iRIref
                    {
                    match(input,280,FOLLOW_280_in_rDFLiteral8939); if (state.failed) return sl;

                    pushFollow(FOLLOW_iRIref_in_rDFLiteral8943);
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

        	catch(RecognitionException re) {
        		throw new SPARQLsyntaxError(re);
        	}

        finally {
        	// do for sure before leaving
        }
        return sl;
    }
    // $ANTLR end "rDFLiteral"



    // $ANTLR start "numericLiteral"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:1094:1: numericLiteral returns [Constant n] : (n1= numericLiteralUnsigned |n2= numericLiteralPositive |n3= numericLiteralNegative );
    public final Constant numericLiteral() throws RecognitionException {
        Constant n = null;


        Constant n1 =null;

        Constant n2 =null;

        Constant n3 =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:1095:2: (n1= numericLiteralUnsigned |n2= numericLiteralPositive |n3= numericLiteralNegative )
            int alt127=3;
            switch ( input.LA(1) ) {
            case BIG_INTEGER:
                {
                int LA127_1 = input.LA(2);

                if ( (LA127_1==DOWN) ) {
                    switch ( input.LA(3) ) {
                    case INTEGER:
                        {
                        alt127=1;
                        }
                        break;
                    case INTEGER_POSITIVE:
                        {
                        alt127=2;
                        }
                        break;
                    case INTEGER_NEGATIVE:
                        {
                        alt127=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return n;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 127, 4, input);

                        throw nvae;

                    }

                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 127, 1, input);

                    throw nvae;

                }
                }
                break;
            case BIG_DECIMAL:
                {
                int LA127_2 = input.LA(2);

                if ( (LA127_2==DOWN) ) {
                    switch ( input.LA(3) ) {
                    case DECIMAL:
                        {
                        alt127=1;
                        }
                        break;
                    case DECIMAL_POSITIVE:
                        {
                        alt127=2;
                        }
                        break;
                    case DECIMAL_NEGATIVE:
                        {
                        alt127=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return n;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 127, 5, input);

                        throw nvae;

                    }

                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 127, 2, input);

                    throw nvae;

                }
                }
                break;
            case DOUBLE:
                {
                int LA127_3 = input.LA(2);

                if ( (LA127_3==DOWN) ) {
                    switch ( input.LA(3) ) {
                    case DOUBLE:
                        {
                        alt127=1;
                        }
                        break;
                    case DOUBLE_POSITIVE:
                        {
                        alt127=2;
                        }
                        break;
                    case DOUBLE_NEGATIVE:
                        {
                        alt127=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return n;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 127, 6, input);

                        throw nvae;

                    }

                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 127, 3, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 127, 0, input);

                throw nvae;

            }

            switch (alt127) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:1095:6: n1= numericLiteralUnsigned
                    {
                    pushFollow(FOLLOW_numericLiteralUnsigned_in_numericLiteral8974);
                    n1=numericLiteralUnsigned();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = n1; }

                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:1096:5: n2= numericLiteralPositive
                    {
                    pushFollow(FOLLOW_numericLiteralPositive_in_numericLiteral8984);
                    n2=numericLiteralPositive();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = n2; }

                    }
                    break;
                case 3 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:1097:5: n3= numericLiteralNegative
                    {
                    pushFollow(FOLLOW_numericLiteralNegative_in_numericLiteral8994);
                    n3=numericLiteralNegative();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = n3; }

                    }
                    break;

            }
        }

        	catch(RecognitionException re) {
        		throw new SPARQLsyntaxError(re);
        	}

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "numericLiteral"



    // $ANTLR start "numericLiteralUnsigned"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:1100:1: numericLiteralUnsigned returns [Constant c] : ( ^( BIG_INTEGER i= INTEGER ) | ^( BIG_DECIMAL d1= DECIMAL ) | ^( DOUBLE d2= DOUBLE ) );
    public final Constant numericLiteralUnsigned() throws RecognitionException {
        Constant c = null;


        XTree i=null;
        XTree d1=null;
        XTree d2=null;

        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:1101:2: ( ^( BIG_INTEGER i= INTEGER ) | ^( BIG_DECIMAL d1= DECIMAL ) | ^( DOUBLE d2= DOUBLE ) )
            int alt128=3;
            switch ( input.LA(1) ) {
            case BIG_INTEGER:
                {
                alt128=1;
                }
                break;
            case BIG_DECIMAL:
                {
                alt128=2;
                }
                break;
            case DOUBLE:
                {
                alt128=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return c;}
                NoViableAltException nvae =
                    new NoViableAltException("", 128, 0, input);

                throw nvae;

            }

            switch (alt128) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:1101:6: ^( BIG_INTEGER i= INTEGER )
                    {
                    match(input,BIG_INTEGER,FOLLOW_BIG_INTEGER_in_numericLiteralUnsigned9016); if (state.failed) return c;

                    match(input, Token.DOWN, null); if (state.failed) return c;
                    i=(XTree)match(input,INTEGER,FOLLOW_INTEGER_in_numericLiteralUnsigned9021); if (state.failed) return c;

                    match(input, Token.UP, null); if (state.failed) return c;


                    if ( state.backtracking==0 ) { c = new Constant((i!=null?i.getText():null), new BigInteger((i!=null?i.getText():null)));		}

                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:1102:5: ^( BIG_DECIMAL d1= DECIMAL )
                    {
                    match(input,BIG_DECIMAL,FOLLOW_BIG_DECIMAL_in_numericLiteralUnsigned9037); if (state.failed) return c;

                    match(input, Token.DOWN, null); if (state.failed) return c;
                    d1=(XTree)match(input,DECIMAL,FOLLOW_DECIMAL_in_numericLiteralUnsigned9041); if (state.failed) return c;

                    match(input, Token.UP, null); if (state.failed) return c;


                    if ( state.backtracking==0 ) { c = new Constant((d1!=null?d1.getText():null), new BigDecimal((d1!=null?d1.getText():null)));	}

                    }
                    break;
                case 3 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:1103:5: ^( DOUBLE d2= DOUBLE )
                    {
                    match(input,DOUBLE,FOLLOW_DOUBLE_in_numericLiteralUnsigned9056); if (state.failed) return c;

                    match(input, Token.DOWN, null); if (state.failed) return c;
                    d2=(XTree)match(input,DOUBLE,FOLLOW_DOUBLE_in_numericLiteralUnsigned9061); if (state.failed) return c;

                    match(input, Token.UP, null); if (state.failed) return c;


                    if ( state.backtracking==0 ) { c = new Constant((d2!=null?d2.getText():null), new Double((d2!=null?d2.getText():null)));		}

                    }
                    break;

            }
        }

        	catch(RecognitionException re) {
        		throw new SPARQLsyntaxError(re);
        	}

        finally {
        	// do for sure before leaving
        }
        return c;
    }
    // $ANTLR end "numericLiteralUnsigned"



    // $ANTLR start "numericLiteralPositive"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:1106:1: numericLiteralPositive returns [Constant c] : ( ^( BIG_INTEGER i= INTEGER_POSITIVE ) | ^( BIG_DECIMAL d1= DECIMAL_POSITIVE ) | ^( DOUBLE d2= DOUBLE_POSITIVE ) );
    public final Constant numericLiteralPositive() throws RecognitionException {
        Constant c = null;


        XTree i=null;
        XTree d1=null;
        XTree d2=null;

        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:1107:2: ( ^( BIG_INTEGER i= INTEGER_POSITIVE ) | ^( BIG_DECIMAL d1= DECIMAL_POSITIVE ) | ^( DOUBLE d2= DOUBLE_POSITIVE ) )
            int alt129=3;
            switch ( input.LA(1) ) {
            case BIG_INTEGER:
                {
                alt129=1;
                }
                break;
            case BIG_DECIMAL:
                {
                alt129=2;
                }
                break;
            case DOUBLE:
                {
                alt129=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return c;}
                NoViableAltException nvae =
                    new NoViableAltException("", 129, 0, input);

                throw nvae;

            }

            switch (alt129) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:1107:6: ^( BIG_INTEGER i= INTEGER_POSITIVE )
                    {
                    match(input,BIG_INTEGER,FOLLOW_BIG_INTEGER_in_numericLiteralPositive9091); if (state.failed) return c;

                    match(input, Token.DOWN, null); if (state.failed) return c;
                    i=(XTree)match(input,INTEGER_POSITIVE,FOLLOW_INTEGER_POSITIVE_in_numericLiteralPositive9096); if (state.failed) return c;

                    match(input, Token.UP, null); if (state.failed) return c;


                    if ( state.backtracking==0 ) { c = new Constant((i!=null?i.getText():null), new BigInteger((i!=null?i.getText():null).substring(1)));		}

                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:1108:5: ^( BIG_DECIMAL d1= DECIMAL_POSITIVE )
                    {
                    match(input,BIG_DECIMAL,FOLLOW_BIG_DECIMAL_in_numericLiteralPositive9109); if (state.failed) return c;

                    match(input, Token.DOWN, null); if (state.failed) return c;
                    d1=(XTree)match(input,DECIMAL_POSITIVE,FOLLOW_DECIMAL_POSITIVE_in_numericLiteralPositive9113); if (state.failed) return c;

                    match(input, Token.UP, null); if (state.failed) return c;


                    if ( state.backtracking==0 ) { c = new Constant((d1!=null?d1.getText():null), new BigDecimal((d1!=null?d1.getText():null).substring(1)));	}

                    }
                    break;
                case 3 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:1109:5: ^( DOUBLE d2= DOUBLE_POSITIVE )
                    {
                    match(input,DOUBLE,FOLLOW_DOUBLE_in_numericLiteralPositive9126); if (state.failed) return c;

                    match(input, Token.DOWN, null); if (state.failed) return c;
                    d2=(XTree)match(input,DOUBLE_POSITIVE,FOLLOW_DOUBLE_POSITIVE_in_numericLiteralPositive9131); if (state.failed) return c;

                    match(input, Token.UP, null); if (state.failed) return c;


                    if ( state.backtracking==0 ) { c = new Constant((d2!=null?d2.getText():null), new Double((d2!=null?d2.getText():null).substring(1)));		}

                    }
                    break;

            }
        }

        	catch(RecognitionException re) {
        		throw new SPARQLsyntaxError(re);
        	}

        finally {
        	// do for sure before leaving
        }
        return c;
    }
    // $ANTLR end "numericLiteralPositive"



    // $ANTLR start "numericLiteralNegative"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:1112:1: numericLiteralNegative returns [Constant c] : ( ^( BIG_INTEGER i= INTEGER_NEGATIVE ) | ^( BIG_DECIMAL d1= DECIMAL_NEGATIVE ) | ^( DOUBLE d2= DOUBLE_NEGATIVE ) );
    public final Constant numericLiteralNegative() throws RecognitionException {
        Constant c = null;


        XTree i=null;
        XTree d1=null;
        XTree d2=null;

        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:1113:2: ( ^( BIG_INTEGER i= INTEGER_NEGATIVE ) | ^( BIG_DECIMAL d1= DECIMAL_NEGATIVE ) | ^( DOUBLE d2= DOUBLE_NEGATIVE ) )
            int alt130=3;
            switch ( input.LA(1) ) {
            case BIG_INTEGER:
                {
                alt130=1;
                }
                break;
            case BIG_DECIMAL:
                {
                alt130=2;
                }
                break;
            case DOUBLE:
                {
                alt130=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return c;}
                NoViableAltException nvae =
                    new NoViableAltException("", 130, 0, input);

                throw nvae;

            }

            switch (alt130) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:1113:6: ^( BIG_INTEGER i= INTEGER_NEGATIVE )
                    {
                    match(input,BIG_INTEGER,FOLLOW_BIG_INTEGER_in_numericLiteralNegative9156); if (state.failed) return c;

                    match(input, Token.DOWN, null); if (state.failed) return c;
                    i=(XTree)match(input,INTEGER_NEGATIVE,FOLLOW_INTEGER_NEGATIVE_in_numericLiteralNegative9161); if (state.failed) return c;

                    match(input, Token.UP, null); if (state.failed) return c;


                    if ( state.backtracking==0 ) { c = new Constant((i!=null?i.getText():null), new BigInteger((i!=null?i.getText():null)));		}

                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:1114:5: ^( BIG_DECIMAL d1= DECIMAL_NEGATIVE )
                    {
                    match(input,BIG_DECIMAL,FOLLOW_BIG_DECIMAL_in_numericLiteralNegative9174); if (state.failed) return c;

                    match(input, Token.DOWN, null); if (state.failed) return c;
                    d1=(XTree)match(input,DECIMAL_NEGATIVE,FOLLOW_DECIMAL_NEGATIVE_in_numericLiteralNegative9178); if (state.failed) return c;

                    match(input, Token.UP, null); if (state.failed) return c;


                    if ( state.backtracking==0 ) { c = new Constant((d1!=null?d1.getText():null), new BigDecimal((d1!=null?d1.getText():null)));	}

                    }
                    break;
                case 3 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:1115:5: ^( DOUBLE d2= DOUBLE_NEGATIVE )
                    {
                    match(input,DOUBLE,FOLLOW_DOUBLE_in_numericLiteralNegative9191); if (state.failed) return c;

                    match(input, Token.DOWN, null); if (state.failed) return c;
                    d2=(XTree)match(input,DOUBLE_NEGATIVE,FOLLOW_DOUBLE_NEGATIVE_in_numericLiteralNegative9196); if (state.failed) return c;

                    match(input, Token.UP, null); if (state.failed) return c;


                    if ( state.backtracking==0 ) { c = new Constant((d2!=null?d2.getText():null), new Double((d2!=null?d2.getText():null)));		}

                    }
                    break;

            }
        }

        	catch(RecognitionException re) {
        		throw new SPARQLsyntaxError(re);
        	}

        finally {
        	// do for sure before leaving
        }
        return c;
    }
    // $ANTLR end "numericLiteralNegative"



    // $ANTLR start "booleanLiteral"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:1118:1: booleanLiteral returns [Boolean b] : ( ^( BOOLEAN TRUE ) | ^( BOOLEAN FALSE ) );
    public final Boolean booleanLiteral() throws RecognitionException {
        Boolean b = null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:1119:2: ( ^( BOOLEAN TRUE ) | ^( BOOLEAN FALSE ) )
            int alt131=2;
            int LA131_0 = input.LA(1);

            if ( (LA131_0==BOOLEAN) ) {
                int LA131_1 = input.LA(2);

                if ( (LA131_1==DOWN) ) {
                    int LA131_2 = input.LA(3);

                    if ( (LA131_2==TRUE) ) {
                        alt131=1;
                    }
                    else if ( (LA131_2==FALSE) ) {
                        alt131=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return b;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 131, 2, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return b;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 131, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return b;}
                NoViableAltException nvae =
                    new NoViableAltException("", 131, 0, input);

                throw nvae;

            }
            switch (alt131) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:1119:6: ^( BOOLEAN TRUE )
                    {
                    match(input,BOOLEAN,FOLLOW_BOOLEAN_in_booleanLiteral9220); if (state.failed) return b;

                    match(input, Token.DOWN, null); if (state.failed) return b;
                    match(input,TRUE,FOLLOW_TRUE_in_booleanLiteral9222); if (state.failed) return b;

                    match(input, Token.UP, null); if (state.failed) return b;


                    if ( state.backtracking==0 ) { b = Boolean.TRUE;  }

                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:1120:6: ^( BOOLEAN FALSE )
                    {
                    match(input,BOOLEAN,FOLLOW_BOOLEAN_in_booleanLiteral9237); if (state.failed) return b;

                    match(input, Token.DOWN, null); if (state.failed) return b;
                    match(input,FALSE,FOLLOW_FALSE_in_booleanLiteral9239); if (state.failed) return b;

                    match(input, Token.UP, null); if (state.failed) return b;


                    if ( state.backtracking==0 ) { b = Boolean.FALSE; }

                    }
                    break;

            }
        }

        	catch(RecognitionException re) {
        		throw new SPARQLsyntaxError(re);
        	}

        finally {
        	// do for sure before leaving
        }
        return b;
    }
    // $ANTLR end "booleanLiteral"



    // $ANTLR start "string"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:1123:1: string returns [String s] : ( ^( STRING s1= STRING_LITERAL1 ) | ^( STRING s2= STRING_LITERAL2 ) | ^( STRING s3= STRING_LITERAL_LONG1 ) | ^( STRING s4= STRING_LITERAL_LONG2 ) );
    public final String string() throws RecognitionException {
        String s = null;


        XTree s1=null;
        XTree s2=null;
        XTree s3=null;
        XTree s4=null;

        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:1124:2: ( ^( STRING s1= STRING_LITERAL1 ) | ^( STRING s2= STRING_LITERAL2 ) | ^( STRING s3= STRING_LITERAL_LONG1 ) | ^( STRING s4= STRING_LITERAL_LONG2 ) )
            int alt132=4;
            int LA132_0 = input.LA(1);

            if ( (LA132_0==STRING) ) {
                int LA132_1 = input.LA(2);

                if ( (LA132_1==DOWN) ) {
                    switch ( input.LA(3) ) {
                    case STRING_LITERAL1:
                        {
                        alt132=1;
                        }
                        break;
                    case STRING_LITERAL2:
                        {
                        alt132=2;
                        }
                        break;
                    case STRING_LITERAL_LONG1:
                        {
                        alt132=3;
                        }
                        break;
                    case STRING_LITERAL_LONG2:
                        {
                        alt132=4;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return s;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 132, 2, input);

                        throw nvae;

                    }

                }
                else {
                    if (state.backtracking>0) {state.failed=true; return s;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 132, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return s;}
                NoViableAltException nvae =
                    new NoViableAltException("", 132, 0, input);

                throw nvae;

            }
            switch (alt132) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:1124:4: ^( STRING s1= STRING_LITERAL1 )
                    {
                    match(input,STRING,FOLLOW_STRING_in_string9262); if (state.failed) return s;

                    match(input, Token.DOWN, null); if (state.failed) return s;
                    s1=(XTree)match(input,STRING_LITERAL1,FOLLOW_STRING_LITERAL1_in_string9266); if (state.failed) return s;

                    match(input, Token.UP, null); if (state.failed) return s;


                    if ( state.backtracking==0 ) { s = new String((s1!=null?s1.getText():null)); }

                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:1125:4: ^( STRING s2= STRING_LITERAL2 )
                    {
                    match(input,STRING,FOLLOW_STRING_in_string9283); if (state.failed) return s;

                    match(input, Token.DOWN, null); if (state.failed) return s;
                    s2=(XTree)match(input,STRING_LITERAL2,FOLLOW_STRING_LITERAL2_in_string9287); if (state.failed) return s;

                    match(input, Token.UP, null); if (state.failed) return s;


                    if ( state.backtracking==0 ) { s = new String((s2!=null?s2.getText():null)); }

                    }
                    break;
                case 3 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:1126:4: ^( STRING s3= STRING_LITERAL_LONG1 )
                    {
                    match(input,STRING,FOLLOW_STRING_in_string9304); if (state.failed) return s;

                    match(input, Token.DOWN, null); if (state.failed) return s;
                    s3=(XTree)match(input,STRING_LITERAL_LONG1,FOLLOW_STRING_LITERAL_LONG1_in_string9308); if (state.failed) return s;

                    match(input, Token.UP, null); if (state.failed) return s;


                    if ( state.backtracking==0 ) { s = new String((s3!=null?s3.getText():null)); }

                    }
                    break;
                case 4 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:1127:4: ^( STRING s4= STRING_LITERAL_LONG2 )
                    {
                    match(input,STRING,FOLLOW_STRING_in_string9320); if (state.failed) return s;

                    match(input, Token.DOWN, null); if (state.failed) return s;
                    s4=(XTree)match(input,STRING_LITERAL_LONG2,FOLLOW_STRING_LITERAL_LONG2_in_string9324); if (state.failed) return s;

                    match(input, Token.UP, null); if (state.failed) return s;


                    if ( state.backtracking==0 ) { s = new String((s4!=null?s4.getText():null)); }

                    }
                    break;

            }
        }

        	catch(RecognitionException re) {
        		throw new SPARQLsyntaxError(re);
        	}

        finally {
        	// do for sure before leaving
        }
        return s;
    }
    // $ANTLR end "string"



    // $ANTLR start "iRIref"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:1130:1: iRIref returns [IRI r] : ( ^( IRI i= IRI_REF ) |p= prefixedName );
    public final IRI iRIref() throws RecognitionException {
        IRI r = null;


        XTree i=null;
        String p =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:1131:2: ( ^( IRI i= IRI_REF ) |p= prefixedName )
            int alt133=2;
            int LA133_0 = input.LA(1);

            if ( (LA133_0==IRI) ) {
                alt133=1;
            }
            else if ( ((LA133_0 >= PREFIXED_NAME && LA133_0 <= PREFIXED_NS)) ) {
                alt133=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return r;}
                NoViableAltException nvae =
                    new NoViableAltException("", 133, 0, input);

                throw nvae;

            }
            switch (alt133) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:1131:4: ^( IRI i= IRI_REF )
                    {
                    match(input,IRI,FOLLOW_IRI_in_iRIref9348); if (state.failed) return r;

                    match(input, Token.DOWN, null); if (state.failed) return r;
                    i=(XTree)match(input,IRI_REF,FOLLOW_IRI_REF_in_iRIref9352); if (state.failed) return r;

                    match(input, Token.UP, null); if (state.failed) return r;


                    if ( state.backtracking==0 ) { r = new IRI((i!=null?i.getText():null).substring(1, (i!=null?i.getText():null).length()-1)); 	}

                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:1132:6: p= prefixedName
                    {
                    pushFollow(FOLLOW_prefixedName_in_iRIref9364);
                    p=prefixedName();

                    state._fsp--;
                    if (state.failed) return r;

                    if ( state.backtracking==0 ) { r = new IRI(p); 				}

                    }
                    break;

            }
        }

        	catch(RecognitionException re) {
        		throw new SPARQLsyntaxError(re);
        	}

        finally {
        	// do for sure before leaving
        }
        return r;
    }
    // $ANTLR end "iRIref"



    // $ANTLR start "prefixedName"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:1135:1: prefixedName returns [String s] : ( ^( PREFIXED_NAME n1= PNAME_LN ) | ^( PREFIXED_NS n2= PNAME_NS ) );
    public final String prefixedName() throws RecognitionException {
        String s = null;


        XTree n1=null;
        XTree n2=null;

        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:1136:2: ( ^( PREFIXED_NAME n1= PNAME_LN ) | ^( PREFIXED_NS n2= PNAME_NS ) )
            int alt134=2;
            int LA134_0 = input.LA(1);

            if ( (LA134_0==PREFIXED_NAME) ) {
                alt134=1;
            }
            else if ( (LA134_0==PREFIXED_NS) ) {
                alt134=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return s;}
                NoViableAltException nvae =
                    new NoViableAltException("", 134, 0, input);

                throw nvae;

            }
            switch (alt134) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:1136:4: ^( PREFIXED_NAME n1= PNAME_LN )
                    {
                    match(input,PREFIXED_NAME,FOLLOW_PREFIXED_NAME_in_prefixedName9386); if (state.failed) return s;

                    match(input, Token.DOWN, null); if (state.failed) return s;
                    n1=(XTree)match(input,PNAME_LN,FOLLOW_PNAME_LN_in_prefixedName9390); if (state.failed) return s;

                    match(input, Token.UP, null); if (state.failed) return s;


                    if ( state.backtracking==0 ) { s = new String(n1.getText()); }

                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:1137:4: ^( PREFIXED_NS n2= PNAME_NS )
                    {
                    match(input,PREFIXED_NS,FOLLOW_PREFIXED_NS_in_prefixedName9399); if (state.failed) return s;

                    match(input, Token.DOWN, null); if (state.failed) return s;
                    n2=(XTree)match(input,PNAME_NS,FOLLOW_PNAME_NS_in_prefixedName9403); if (state.failed) return s;

                    match(input, Token.UP, null); if (state.failed) return s;


                    if ( state.backtracking==0 ) { s = new String(n2.getText()); }

                    }
                    break;

            }
        }

        	catch(RecognitionException re) {
        		throw new SPARQLsyntaxError(re);
        	}

        finally {
        	// do for sure before leaving
        }
        return s;
    }
    // $ANTLR end "prefixedName"



    // $ANTLR start "blankNode"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:1140:1: blankNode returns [BlankNode bn] : (b= BLANK_NODE_LABEL | ^( ANNON t= OPEN_SQ_BRACKET ) );
    public final BlankNode blankNode() throws RecognitionException {
        BlankNode bn = null;


        XTree b=null;
        XTree t=null;

        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:1141:2: (b= BLANK_NODE_LABEL | ^( ANNON t= OPEN_SQ_BRACKET ) )
            int alt135=2;
            int LA135_0 = input.LA(1);

            if ( (LA135_0==BLANK_NODE_LABEL) ) {
                alt135=1;
            }
            else if ( (LA135_0==ANNON) ) {
                alt135=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return bn;}
                NoViableAltException nvae =
                    new NoViableAltException("", 135, 0, input);

                throw nvae;

            }
            switch (alt135) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:1141:6: b= BLANK_NODE_LABEL
                    {
                    b=(XTree)match(input,BLANK_NODE_LABEL,FOLLOW_BLANK_NODE_LABEL_in_blankNode9427); if (state.failed) return bn;

                    if ( state.backtracking==0 ) { bn = new BlankNode(b.getText()); }

                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:1142:6: ^( ANNON t= OPEN_SQ_BRACKET )
                    {
                    match(input,ANNON,FOLLOW_ANNON_in_blankNode9438); if (state.failed) return bn;

                    match(input, Token.DOWN, null); if (state.failed) return bn;
                    t=(XTree)match(input,OPEN_SQ_BRACKET,FOLLOW_OPEN_SQ_BRACKET_in_blankNode9442); if (state.failed) return bn;

                    match(input, Token.UP, null); if (state.failed) return bn;


                    if ( state.backtracking==0 ) { bn = new BlankNode("b" + t.getTokenStartIndex()); }

                    }
                    break;

            }
        }

        	catch(RecognitionException re) {
        		throw new SPARQLsyntaxError(re);
        	}

        finally {
        	// do for sure before leaving
        }
        return bn;
    }
    // $ANTLR end "blankNode"

    // $ANTLR start synpred1_IbmSparqlExtAstWalker
    public final void synpred1_IbmSparqlExtAstWalker_fragment() throws RecognitionException {
        // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:530:25: ( NIL )
        // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:530:27: NIL
        {
        match(input,NIL,FOLLOW_NIL_in_synpred1_IbmSparqlExtAstWalker4242); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred1_IbmSparqlExtAstWalker

    // $ANTLR start synpred2_IbmSparqlExtAstWalker
    public final void synpred2_IbmSparqlExtAstWalker_fragment() throws RecognitionException {
        // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:530:81: ( NIL )
        // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlExtAstWalker.g:530:83: NIL
        {
        match(input,NIL,FOLLOW_NIL_in_synpred2_IbmSparqlExtAstWalker4264); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred2_IbmSparqlExtAstWalker

    // Delegated rules

    public final boolean synpred2_IbmSparqlExtAstWalker() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_IbmSparqlExtAstWalker_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_IbmSparqlExtAstWalker() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_IbmSparqlExtAstWalker_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA28 dfa28 = new DFA28(this);
    static final String DFA28_eotS =
        "\46\uffff";
    static final String DFA28_eofS =
        "\46\uffff";
    static final String DFA28_minS =
        "\1\60\1\uffff\2\2\1\uffff\1\120\1\3\1\2\1\157\4\2\1\161\1\u00a8"+
        "\1\u00a9\1\157\3\3\3\2\3\3\1\161\1\u00a8\1\u00a9\4\3\1\60\4\3";
    static final String DFA28_maxS =
        "\1\u0104\1\uffff\2\2\1\uffff\1\120\1\u00ea\1\2\1\u00b5\4\2\1\161"+
        "\1\u00a8\1\u00a9\1\u00b5\3\3\3\2\3\3\1\161\1\u00a8\1\u00a9\1\120"+
        "\3\3\1\u0104\4\3";
    static final String DFA28_acceptS =
        "\1\uffff\1\1\2\uffff\1\2\41\uffff";
    static final String DFA28_specialS =
        "\46\uffff}>";
    static final String[] DFA28_transitionS = {
            "\1\2\133\uffff\1\4\134\uffff\2\1\31\uffff\1\3",
            "",
            "\1\5",
            "\1\6",
            "",
            "\1\7",
            "\1\1\133\uffff\1\1\u0083\uffff\1\1\5\uffff\2\4",
            "\1\10",
            "\1\11\40\uffff\1\14\43\uffff\1\12\1\13",
            "\1\15",
            "\1\16",
            "\1\17",
            "\1\20",
            "\1\21",
            "\1\22",
            "\1\23",
            "\1\24\104\uffff\1\25\1\26",
            "\1\27",
            "\1\30",
            "\1\31",
            "\1\32",
            "\1\33",
            "\1\34",
            "\1\35",
            "\1\35",
            "\1\35",
            "\1\36",
            "\1\37",
            "\1\40",
            "\1\41\114\uffff\1\7",
            "\1\42",
            "\1\43",
            "\1\44",
            "\1\2\133\uffff\1\4\167\uffff\1\3",
            "\1\45",
            "\1\45",
            "\1\45",
            "\1\35"
    };

    static final short[] DFA28_eot = DFA.unpackEncodedString(DFA28_eotS);
    static final short[] DFA28_eof = DFA.unpackEncodedString(DFA28_eofS);
    static final char[] DFA28_min = DFA.unpackEncodedStringToUnsignedChars(DFA28_minS);
    static final char[] DFA28_max = DFA.unpackEncodedStringToUnsignedChars(DFA28_maxS);
    static final short[] DFA28_accept = DFA.unpackEncodedString(DFA28_acceptS);
    static final short[] DFA28_special = DFA.unpackEncodedString(DFA28_specialS);
    static final short[][] DFA28_transition;

    static {
        int numStates = DFA28_transitionS.length;
        DFA28_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA28_transition[i] = DFA.unpackEncodedString(DFA28_transitionS[i]);
        }
    }

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = DFA28_eot;
            this.eof = DFA28_eof;
            this.min = DFA28_min;
            this.max = DFA28_max;
            this.accept = DFA28_accept;
            this.special = DFA28_special;
            this.transition = DFA28_transition;
        }
        public String getDescription() {
            return "256:20: ( ( constructTemplate[$cq] (d= dataset )* (w= whereClause ) (m= solutionModifier ) ) | ( (d= dataset )* ( ^( WHERE triplesTemplate[$cq,p] ) )? (m= solutionModifier ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_ROOT_in_queryUnit82 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_query_in_queryUnit86 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_QUERY_in_query116 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_prologue_in_query126 = new BitSet(new long[]{0x0400020000002000L,0x0000000000400000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_selectQuery_in_query145 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_bindingsClause_in_query163 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_constructQuery_in_query220 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_describeQuery_in_query236 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_askQuery_in_query252 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PROLOGUE_in_prologue308 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_baseDecl_in_prologue310 = new BitSet(new long[]{0x0000000000010008L,0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_prefixDecl_in_prologue315 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_BASE_in_baseDecl346 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_iRIref_in_baseDecl350 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PREFIX_in_prefixDecl378 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_prefixedName_in_prefixDecl382 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L,0x0030000000000000L});
    public static final BitSet FOLLOW_iRIref_in_prefixDecl387 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_functionSet_in_selectQuery428 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SELECT_in_selectQuery445 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_selectClause_in_selectQuery455 = new BitSet(new long[]{0x0001000000000000L,0x0000000000000000L,0x0000000000001000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_dataset_in_selectQuery471 = new BitSet(new long[]{0x0001000000000000L,0x0000000000000000L,0x0000000000001000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_whereClause_in_selectQuery490 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_solutionModifier_in_selectQuery506 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FUNCTION_in_functionSet547 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_functionDecl_in_functionSet555 = new BitSet(new long[]{0x0000000000000008L,0x0000000000200000L});
    public static final BitSet FOLLOW_FUNCNAME_in_functionDecl591 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_iRIref_in_functionDecl617 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_SERVICE_in_functionDecl654 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_functionDecl658 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L,0x0030000000000000L});
    public static final BitSet FOLLOW_iRIref_in_functionDecl662 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TABLE_in_functionDecl699 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_functionDecl703 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L,0x0030000000000000L});
    public static final BitSet FOLLOW_iRIref_in_functionDecl707 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_KIND_in_functionDecl754 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_POST_in_functionDecl760 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GET_in_functionDecl791 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INV_in_functionDecl806 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_var_in_functionDecl812 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_OUTV_in_functionDecl824 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_var_in_functionDecl830 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_FUNCLG_in_functionDecl891 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_VAR0_in_functionDecl896 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_functionBody_in_functionDecl927 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PARAMS_in_functionDecl1004 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PARAM_in_functionDecl1061 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_string_in_functionDecl1097 = new BitSet(new long[]{0x400614884F864028L,0xB07C80D0C0408920L,0xD030000000B02BBCL,0x450A009DE0FCE83AL,0x00000000003BF400L});
    public static final BitSet FOLLOW_expression_in_functionDecl1171 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_groupGraphPattern_in_functionDecl1284 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_string_in_functionDecl1570 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_string_in_functionDecl1598 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_FUNCBODY_in_functionBody1666 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_LINE_NONEOP_in_functionBody1681 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_groupGraphPattern_in_functionBody1701 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DATASET_in_dataset1744 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_datasetClause_in_dataset1753 = new BitSet(new long[]{0x0000000000000008L,0x0000000000010000L});
    public static final BitSet FOLLOW_SUB_SELECT_in_subSelect1787 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_selectClause_in_subSelect1796 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_whereClause_in_subSelect1812 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_solutionModifier_in_subSelect1828 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_inlineData_in_subSelect1854 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TYPE_in_selectClause1900 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DISTINCT_in_selectClause1904 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_REDUCED_in_selectClause1916 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PVARS_in_selectClause1945 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_var_in_selectClause1953 = new BitSet(new long[]{0x0000000000000808L,0x0000000000000200L,0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_expVar_in_selectClause1975 = new BitSet(new long[]{0x0000000000000808L,0x0000000000000200L,0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_fexp_in_selectClause1998 = new BitSet(new long[]{0x0000000000000808L,0x0000000000000200L,0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_270_in_selectClause2038 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AS_in_expVar2069 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_var_in_expVar2073 = new BitSet(new long[]{0x400614884F864020L,0xB07C80D040408920L,0xD030000000B02BBCL,0x450A0095E0FCE83AL,0x00000000003BF400L});
    public static final BitSet FOLLOW_expression_in_expVar2077 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXP_in_fexp2095 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_fexp2099 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONSTRUCT_in_constructQuery2130 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_constructTemplate_in_constructQuery2137 = new BitSet(new long[]{0x0001000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_dataset_in_constructQuery2151 = new BitSet(new long[]{0x0001000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_whereClause_in_constructQuery2174 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_solutionModifier_in_constructQuery2193 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_dataset_in_constructQuery2233 = new BitSet(new long[]{0x0001000000000000L,0x0000000000000000L,0x0000000000001000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_WHERE_in_constructQuery2255 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_triplesTemplate_in_constructQuery2321 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_solutionModifier_in_constructQuery2401 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DESCRIBE_in_describeQuery2459 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_varOrIRIref2_in_describeQuery2468 = new BitSet(new long[]{0x0000000000000000L,0x0000800000010000L,0x0030000000001000L,0x4000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_270_in_describeQuery2479 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L,0x0000000000001000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_datasetClause_in_describeQuery2494 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L,0x0000000000001000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_whereClause_in_describeQuery2515 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_solutionModifier_in_describeQuery2535 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ASK_in_askQuery2576 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_datasetClause_in_askQuery2584 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_whereClause_in_askQuery2600 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FROM_in_datasetClause2635 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_defaultGraphClause_in_datasetClause2642 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_namedGraphClause_in_datasetClause2656 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_sourceSelector_in_defaultGraphClause2689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAMED_in_namedGraphClause2711 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_sourceSelector_in_namedGraphClause2715 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_iRIref_in_sourceSelector2741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHERE_in_whereClause2764 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_groupGraphPattern_in_whereClause2768 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MODIFIERS_in_solutionModifier2799 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_groupClause_in_solutionModifier2808 = new BitSet(new long[]{0x0000000000000008L,0x0000000400000000L,0x0000000104000001L});
    public static final BitSet FOLLOW_havingClause_in_solutionModifier2825 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000104000001L});
    public static final BitSet FOLLOW_orderClause_in_solutionModifier2842 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000004000001L});
    public static final BitSet FOLLOW_limitOffsetClauses_in_solutionModifier2859 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GROUP_BY_in_groupClause2885 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_groupCondition_in_groupClause2889 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_builtInCall_in_groupCondition2922 = new BitSet(new long[]{0x0006058842800022L,0xB07C805000408120L,0xD000000000A02900L,0x450A0085E07CE82AL,0x0000000000000400L});
    public static final BitSet FOLLOW_functionCall_in_groupCondition2941 = new BitSet(new long[]{0x0006058842800022L,0xB07C805000408120L,0xD000000000A02900L,0x450A0085E07CE82AL,0x0000000000000400L});
    public static final BitSet FOLLOW_CONDITION_in_groupCondition2959 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_groupCondition2963 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_var_in_groupCondition2968 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_var_in_groupCondition2985 = new BitSet(new long[]{0x0006058842800022L,0xB07C805000408120L,0xD000000000A02900L,0x450A0085E07CE82AL,0x0000000000000400L});
    public static final BitSet FOLLOW_HAVING_in_havingClause3059 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_havingCondition_in_havingClause3064 = new BitSet(new long[]{0x0006048842800028L,0xB07C805000408920L,0xD000000000A02900L,0x050A0085E07CE82AL,0x0000000000000400L});
    public static final BitSet FOLLOW_constraint_in_havingCondition3092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ORDER_BY_in_orderClause3121 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_orderCondition_in_orderClause3128 = new BitSet(new long[]{0x0206048842801028L,0xB07C805000408920L,0xD000000000A02900L,0x450A0085E07CE82AL,0x0000000000000400L});
    public static final BitSet FOLLOW_ASC_in_orderCondition3155 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_brackettedExpression_in_orderCondition3159 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DESC_in_orderCondition3171 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_brackettedExpression_in_orderCondition3175 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_constraint_in_orderCondition3189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_in_orderCondition3205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_limitClause_in_limitOffsetClauses3245 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_offsetClause_in_limitOffsetClauses3253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_offsetClause_in_limitOffsetClauses3266 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_limitClause_in_limitOffsetClauses3273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LIMIT_in_limitClause3311 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INTEGER_in_limitClause3316 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OFFSET_in_offsetClause3343 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INTEGER_in_offsetClause3348 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_inlineData_in_bindingsClause3372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iRIref_in_bindingValue3393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rDFLiteral_in_bindingValue3397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteral_in_bindingValue3401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteral_in_bindingValue3405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNDEF_in_bindingValue3409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_triplesSameSubject_in_triplesTemplate3429 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_DOT_in_triplesTemplate3436 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000060000000000L});
    public static final BitSet FOLLOW_triplesTemplate_in_triplesTemplate3438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GROUP_GRAPH_PATTERN_in_groupGraphPattern3468 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_groupGraphPatternSub_in_groupGraphPattern3470 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_subSelect_in_groupGraphPattern3482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_triplesBlock_in_groupGraphPatternSub3514 = new BitSet(new long[]{0x0000000000080002L,0x0000000082004000L,0x0000000040000400L,0x2040080800000400L});
    public static final BitSet FOLLOW_filter_in_groupGraphPatternSub3546 = new BitSet(new long[]{0x0000000000080002L,0x0000000082004000L,0x0000000040000400L,0x2040080800000400L});
    public static final BitSet FOLLOW_graphPatternNewBGP_in_groupGraphPatternSub3584 = new BitSet(new long[]{0x0000000000080002L,0x0000000082004000L,0x0000000040000400L,0x2040080800000400L});
    public static final BitSet FOLLOW_TRIPLES_BLOCK_in_triplesBlock3643 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_triples_in_triplesBlock3676 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000060000000000L});
    public static final BitSet FOLLOW_triples2_in_triplesBlock3692 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000060000000000L});
    public static final BitSet FOLLOW_TRIPLE_in_triples3740 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SUBJECT_in_triples3743 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_graphNode_in_triples3749 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PREDICATE_in_triples3785 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_predicate_in_triples3791 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VALUE_in_triples3831 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_object_in_triples3836 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TRIPLE2_in_triples23891 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SUBJECT_in_triples23894 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_triplesNode_in_triples23900 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PROPERTY_LIST_in_triples23938 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PREDICATE_in_triples23950 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_predicate_in_triples23957 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VALUE_in_triples24007 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_object_in_triples24012 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_groupMinusOrUnionGraphPattern_in_graphPatternNewBGP4072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_optionalGraphPattern_in_graphPatternNewBGP4092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_graphGraphPattern_in_graphPatternNewBGP4113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_serviceGraphPattern_in_graphPatternNewBGP4134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bind_in_graphPatternNewBGP4147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inlineData_in_graphPatternNewBGP4167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VALUES_in_inlineData4200 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_dataBlock_in_inlineData4204 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INLINE_DATA_in_dataBlock4236 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NIL_in_dataBlock4246 = new BitSet(new long[]{0x4000000001060008L,0x0000800000000000L,0x0030000000040000L,0x0010000000800000L});
    public static final BitSet FOLLOW_var_in_dataBlock4253 = new BitSet(new long[]{0x4000000001060008L,0x0000800000000000L,0x0030000000040000L,0x4010000000800000L});
    public static final BitSet FOLLOW_NIL_in_dataBlock4268 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_dataBlockValue_in_dataBlock4275 = new BitSet(new long[]{0x4000000001060008L,0x0000800000000000L,0x0030000000000000L,0x0010000000800000L});
    public static final BitSet FOLLOW_iRIref_in_dataBlockValue4311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rDFLiteral_in_dataBlockValue4327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteral_in_dataBlockValue4342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteral_in_dataBlockValue4357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNDEF_in_dataBlockValue4373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPTIONAL_in_optionalGraphPattern4403 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_groupGraphPattern_in_optionalGraphPattern4407 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GRAPH_in_graphGraphPattern4437 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_varOrIRIref2_in_graphGraphPattern4441 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L,0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_groupGraphPattern_in_graphGraphPattern4445 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SERVICE_in_serviceGraphPattern4481 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SILENT_in_serviceGraphPattern4484 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L,0x0030000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_varOrIRIref_in_serviceGraphPattern4492 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L,0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_groupGraphPattern_in_serviceGraphPattern4496 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_bind1_in_bind4527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bind2_in_bind4536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BIND_in_bind14558 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_var_in_bind14562 = new BitSet(new long[]{0x400614884F864020L,0xB07C80D040408920L,0xD030000000B02BBCL,0x450A0095E0FCE83AL,0x00000000003BF400L});
    public static final BitSet FOLLOW_expression_in_bind14568 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BIND_in_bind24601 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_funcCall_in_bind24610 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_var_in_bind24623 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_FUNCCALL_in_funcCall4663 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_iRIref_in_funcCall4672 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_var_in_funcCall4684 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_UNION_in_groupMinusOrUnionGraphPattern4719 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_groupGraphPattern_in_groupMinusOrUnionGraphPattern4740 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L,0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_groupGraphPattern_in_groupMinusOrUnionGraphPattern4771 = new BitSet(new long[]{0x0000000000000008L,0x0000000080000000L,0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_MINUS_in_groupMinusOrUnionGraphPattern4807 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_groupGraphPattern_in_groupMinusOrUnionGraphPattern4822 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_groupGraphPattern_in_groupMinusOrUnionGraphPattern4849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FILTER_in_filter4882 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_constraint_in_filter4886 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_brackettedExpression_in_constraint4910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_builtInCall_in_constraint4920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_constraint4933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_functionCall4955 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_iRIref_in_functionCall4959 = new BitSet(new long[]{0x500614884F864020L,0xB07C80D040408920L,0xD030000000B42BBCL,0x450A0095E0FCE83AL,0x00000000003BF400L});
    public static final BitSet FOLLOW_argList_in_functionCall4963 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NIL_in_argList4992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DISTINCT_in_argList5005 = new BitSet(new long[]{0x400614884F864020L,0xB07C80D040408920L,0xD030000000B02BBCL,0x450A0095E0FCE83AL,0x00000000003BF400L});
    public static final BitSet FOLLOW_expression_in_argList5010 = new BitSet(new long[]{0x400614884F864022L,0xB07C80D040408920L,0xD030000000B02BBCL,0x450A0095E0FCE83AL,0x00000000003BF400L});
    public static final BitSet FOLLOW_expression_in_argList5023 = new BitSet(new long[]{0x400614884F864022L,0xB07C80D040408920L,0xD030000000B02BBCL,0x450A0095E0FCE83AL,0x00000000003BF400L});
    public static final BitSet FOLLOW_NIL_in_expressionList5058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expressionList5081 = new BitSet(new long[]{0x400614884F864022L,0xB07C80D040408920L,0xD030000000B02BBCL,0x450A0095E0FCE83AL,0x00000000003BF400L});
    public static final BitSet FOLLOW_constructTriples_in_constructTemplate5101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_triples_in_constructTriples5122 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000060000000000L});
    public static final BitSet FOLLOW_triples2_in_constructTriples5133 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000060000000000L});
    public static final BitSet FOLLOW_triples_in_triplesSameSubject5170 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_triples2_in_triplesSameSubject5182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_graphNode_in_object5204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varOrIRIref_in_verb5226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_281_in_verb5236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_path_in_verbPath5254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_in_verbSimple5273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pathAlternative_in_path5290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pathSequence_in_pathAlternative5303 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_282_in_pathAlternative5307 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L,0x0030000008000000L,0x0000000000000000L,0x0000000002801000L});
    public static final BitSet FOLLOW_pathSequence_in_pathAlternative5309 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_pathEltOrInverse_in_pathSequence5326 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_273_in_pathSequence5330 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L,0x0030000008000000L,0x0000000000000000L,0x0000000002801000L});
    public static final BitSet FOLLOW_pathEltOrInverse_in_pathSequence5332 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_pathPrimary_in_pathElt5349 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x000000000040C000L});
    public static final BitSet FOLLOW_pathMod_in_pathElt5351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pathElt_in_pathEltOrInverse5366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_279_in_pathEltOrInverse5370 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L,0x0030000008000000L,0x0000000000000000L,0x0000000002001000L});
    public static final BitSet FOLLOW_pathElt_in_pathEltOrInverse5372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_270_in_pathMod5387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_278_in_pathMod5396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_271_in_pathMod5405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iRIref_in_pathPrimary5423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_281_in_pathPrimary5427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_268_in_pathPrimary5431 = new BitSet(new long[]{0x0000000000000000L,0x0000C00000000000L,0x0030000008000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_pathNegatedPropertySet_in_pathPrimary5433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_pathPrimary5437 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L,0x0030000008000000L,0x0000000000000000L,0x0000000002801000L});
    public static final BitSet FOLLOW_path_in_pathPrimary5439 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_pathPrimary5441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pathOneInPropertySet_in_pathNegatedPropertySet5471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_pathNegatedPropertySet5479 = new BitSet(new long[]{0x0000000100000000L,0x0000C00000000000L,0x0030000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_pathOneInPropertySet_in_pathNegatedPropertySet5487 = new BitSet(new long[]{0x0000000100000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_282_in_pathNegatedPropertySet5491 = new BitSet(new long[]{0x0000000000000000L,0x0000C00000000000L,0x0030000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_pathOneInPropertySet_in_pathNegatedPropertySet5497 = new BitSet(new long[]{0x0000000100000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_pathNegatedPropertySet5508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iRIref_in_pathOneInPropertySet5536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_281_in_pathOneInPropertySet5543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INV_in_pathOneInPropertySet5552 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_iRIrefOrRDFType_in_pathOneInPropertySet5558 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_iRIref_in_iRIrefOrRDFType5585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_281_in_iRIrefOrRDFType5594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_integer5615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRIPLES_NODE_in_triplesNode5634 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_collection_in_triplesNode5645 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_blankNodePropertyList_in_triplesNode5662 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PROPERTY_LIST_in_blankNodePropertyList5701 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PREDICATE_in_blankNodePropertyList5722 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_predicate_in_blankNodePropertyList5726 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VALUE_in_blankNodePropertyList5741 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_graphNode_in_blankNodePropertyList5746 = new BitSet(new long[]{0x4000000001460208L,0x0000800000000000L,0x0030000000040000L,0x4000100000800000L});
    public static final BitSet FOLLOW_var_in_predicate5802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iRIref_in_predicate5817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_281_in_predicate5828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALT_in_predicate5843 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_predicate_in_predicate5848 = new BitSet(new long[]{0x0000000000000108L,0x0000C00000000010L,0x0030000000000000L,0x4000000000000200L,0x0000000002001000L});
    public static final BitSet FOLLOW_SEQ_in_predicate5864 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_predicate_in_predicate5869 = new BitSet(new long[]{0x0000000000000108L,0x0000C00000000010L,0x0030000000000000L,0x4000000000000200L,0x0000000002001000L});
    public static final BitSet FOLLOW_ELT_in_predicate5885 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_predicate_in_predicate5889 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x000000000040C000L});
    public static final BitSet FOLLOW_pathMod_in_predicate5895 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INV_in_predicate5910 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_predicate_in_predicate5914 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_268_in_predicate5925 = new BitSet(new long[]{0x0000000000000000L,0x0000C00000000000L,0x0030000008000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_pathNegatedPropertySet_in_predicate5931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLLECTION_in_collection5959 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_graphNode_in_collection5964 = new BitSet(new long[]{0x4000000001460208L,0x0000800000000000L,0x0030000000040000L,0x4000100000800000L});
    public static final BitSet FOLLOW_var_in_graphNode5990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_graphTerm_in_graphNode6003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_triplesNode_in_graphNode6015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_in_varOrTerm6038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_graphTerm_in_varOrTerm6053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_in_varOrIRIref6075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iRIref_in_varOrIRIref6090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_in_varOrIRIref26125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iRIref_in_varOrIRIref26141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_var6168 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_VAR1_in_var6175 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VAR2_in_var6190 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_iRIref_in_graphTerm6224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rDFLiteral_in_graphTerm6238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteral_in_graphTerm6250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteral_in_graphTerm6263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_blankNode_in_graphTerm6276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NIL_in_graphTerm6289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOGICAL_OR_in_expression6320 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression6332 = new BitSet(new long[]{0x400614884F864020L,0xB07C80D040408920L,0xD030000000B02BBCL,0x450A0095E0FCE83AL,0x00000000003BF400L});
    public static final BitSet FOLLOW_expression_in_expression6353 = new BitSet(new long[]{0x400614884F864028L,0xB07C80D040408920L,0xD030000000B02BBCL,0x450A0095E0FCE83AL,0x00000000003BF400L});
    public static final BitSet FOLLOW_LOGICAL_AND_in_expression6378 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression6390 = new BitSet(new long[]{0x400614884F864020L,0xB07C80D040408920L,0xD030000000B02BBCL,0x450A0095E0FCE83AL,0x00000000003BF400L});
    public static final BitSet FOLLOW_expression_in_expression6411 = new BitSet(new long[]{0x400614884F864028L,0xB07C80D040408920L,0xD030000000B02BBCL,0x450A0095E0FCE83AL,0x00000000003BF400L});
    public static final BitSet FOLLOW_275_in_expression6438 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression6452 = new BitSet(new long[]{0x400614884F864020L,0xB07C80D040408920L,0xD030000000B02BBCL,0x450A0095E0FCE83AL,0x00000000003BF400L});
    public static final BitSet FOLLOW_expression_in_expression6463 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_269_in_expression6483 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression6497 = new BitSet(new long[]{0x400614884F864020L,0xB07C80D040408920L,0xD030000000B02BBCL,0x450A0095E0FCE83AL,0x00000000003BF400L});
    public static final BitSet FOLLOW_expression_in_expression6508 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LT_in_expression6528 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression6543 = new BitSet(new long[]{0x400614884F864020L,0xB07C80D040408920L,0xD030000000B02BBCL,0x450A0095E0FCE83AL,0x00000000003BF400L});
    public static final BitSet FOLLOW_expression_in_expression6558 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_276_in_expression6578 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression6593 = new BitSet(new long[]{0x400614884F864020L,0xB07C80D040408920L,0xD030000000B02BBCL,0x450A0095E0FCE83AL,0x00000000003BF400L});
    public static final BitSet FOLLOW_expression_in_expression6604 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LTE_in_expression6624 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression6638 = new BitSet(new long[]{0x400614884F864020L,0xB07C80D040408920L,0xD030000000B02BBCL,0x450A0095E0FCE83AL,0x00000000003BF400L});
    public static final BitSet FOLLOW_expression_in_expression6649 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_277_in_expression6669 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression6683 = new BitSet(new long[]{0x400614884F864020L,0xB07C80D040408920L,0xD030000000B02BBCL,0x450A0095E0FCE83AL,0x00000000003BF400L});
    public static final BitSet FOLLOW_expression_in_expression6694 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IN_in_expression6714 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression6741 = new BitSet(new long[]{0x400614884F864020L,0xB07C80D040408920L,0xD030000000B42BBCL,0x450A0095E0FCE83AL,0x00000000003BF400L});
    public static final BitSet FOLLOW_expressionList_in_expression6754 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_expression6800 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression6807 = new BitSet(new long[]{0x400614884F864020L,0xB07C80D040408920L,0xD030000000B42BBCL,0x450A0095E0FCE83AL,0x00000000003BF400L});
    public static final BitSet FOLLOW_expressionList_in_expression6815 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_271_in_expression6849 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression6876 = new BitSet(new long[]{0x400614884F864028L,0xB07C80D040408920L,0xD030000000B02BBCL,0x450A0095E0FCE83AL,0x00000000003BF400L});
    public static final BitSet FOLLOW_expression_in_expression6888 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BROKEN_PLUS_in_expression6911 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression6930 = new BitSet(new long[]{0x400614884F864020L,0xB07C80D040408920L,0xD030000000B02BBCL,0x450A0095E0FCE83AL,0x00000000003BF400L});
    public static final BitSet FOLLOW_expression_in_expression6941 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_272_in_expression6961 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression6987 = new BitSet(new long[]{0x400614884F864028L,0xB07C80D040408920L,0xD030000000B02BBCL,0x450A0095E0FCE83AL,0x00000000003BF400L});
    public static final BitSet FOLLOW_expression_in_expression6999 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BROKEN_MINUS_in_expression7016 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression7034 = new BitSet(new long[]{0x400614884F864020L,0xB07C80D040408920L,0xD030000000B02BBCL,0x450A0095E0FCE83AL,0x00000000003BF400L});
    public static final BitSet FOLLOW_expression_in_expression7045 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_270_in_expression7065 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression7092 = new BitSet(new long[]{0x400614884F864020L,0xB07C80D040408920L,0xD030000000B02BBCL,0x450A0095E0FCE83AL,0x00000000003BF400L});
    public static final BitSet FOLLOW_expression_in_expression7103 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_273_in_expression7123 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression7150 = new BitSet(new long[]{0x400614884F864020L,0xB07C80D040408920L,0xD030000000B02BBCL,0x450A0095E0FCE83AL,0x00000000003BF400L});
    public static final BitSet FOLLOW_expression_in_expression7160 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_268_in_expression7180 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression7184 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_brackettedExpression_in_expression7195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExpression_in_expression7205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_builtInCall_in_primaryExpression7230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iRIref_in_primaryExpression7242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iRIFunction_in_primaryExpression7254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rDFLiteral_in_primaryExpression7266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteral_in_primaryExpression7278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteral_in_primaryExpression7289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_in_primaryExpression7300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_aggregate_in_primaryExpression7314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXPRESSION_in_brackettedExpression7337 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_brackettedExpression7342 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STR_in_builtInCall7372 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall7376 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LANG_in_builtInCall7389 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall7393 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LANGMATCHES_in_builtInCall7406 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall7410 = new BitSet(new long[]{0x400614884F864020L,0xB07C80D040408920L,0xD030000000B02BBCL,0x450A0095E0FCE83AL,0x00000000003BF400L});
    public static final BitSet FOLLOW_expression_in_builtInCall7414 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DATATYPE_in_builtInCall7427 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall7431 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BOUND_in_builtInCall7443 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_var_in_builtInCall7447 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IRI_in_builtInCall7465 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall7469 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_URI_in_builtInCall7482 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall7486 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BNODE_in_builtInCall7498 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall7502 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BNODE_in_builtInCall7513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RAND_in_builtInCall7524 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NIL_in_builtInCall7526 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ABS_in_builtInCall7539 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall7543 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CEIL_in_builtInCall7555 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall7559 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FLOOR_in_builtInCall7571 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall7575 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ROUND_in_builtInCall7587 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall7591 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONCAT_in_builtInCall7603 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expressionList_in_builtInCall7607 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUBSTR_in_builtInCall7620 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall7624 = new BitSet(new long[]{0x400614884F864020L,0xB07C80D040408920L,0xD030000000B02BBCL,0x450A0095E0FCE83AL,0x00000000003BF400L});
    public static final BitSet FOLLOW_expression_in_builtInCall7628 = new BitSet(new long[]{0x400614884F864028L,0xB07C80D040408920L,0xD030000000B02BBCL,0x450A0095E0FCE83AL,0x00000000003BF400L});
    public static final BitSet FOLLOW_expression_in_builtInCall7652 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STRLEN_in_builtInCall7675 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall7679 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UCASE_in_builtInCall7691 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall7695 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_REPLACE_in_builtInCall7707 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall7711 = new BitSet(new long[]{0x400614884F864020L,0xB07C80D040408920L,0xD030000000B02BBCL,0x450A0095E0FCE83AL,0x00000000003BF400L});
    public static final BitSet FOLLOW_expression_in_builtInCall7715 = new BitSet(new long[]{0x400614884F864020L,0xB07C80D040408920L,0xD030000000B02BBCL,0x450A0095E0FCE83AL,0x00000000003BF400L});
    public static final BitSet FOLLOW_expression_in_builtInCall7719 = new BitSet(new long[]{0x400614884F864028L,0xB07C80D040408920L,0xD030000000B02BBCL,0x450A0095E0FCE83AL,0x00000000003BF400L});
    public static final BitSet FOLLOW_expression_in_builtInCall7743 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LCASE_in_builtInCall7761 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall7765 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ENCODE_FOR_URI_in_builtInCall7777 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall7781 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONTAINS_in_builtInCall7793 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall7797 = new BitSet(new long[]{0x400614884F864020L,0xB07C80D040408920L,0xD030000000B02BBCL,0x450A0095E0FCE83AL,0x00000000003BF400L});
    public static final BitSet FOLLOW_expression_in_builtInCall7801 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STRSTARTS_in_builtInCall7813 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall7817 = new BitSet(new long[]{0x400614884F864020L,0xB07C80D040408920L,0xD030000000B02BBCL,0x450A0095E0FCE83AL,0x00000000003BF400L});
    public static final BitSet FOLLOW_expression_in_builtInCall7821 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STRENDS_in_builtInCall7833 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall7837 = new BitSet(new long[]{0x400614884F864020L,0xB07C80D040408920L,0xD030000000B02BBCL,0x450A0095E0FCE83AL,0x00000000003BF400L});
    public static final BitSet FOLLOW_expression_in_builtInCall7841 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STRBEFORE_in_builtInCall7853 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall7857 = new BitSet(new long[]{0x400614884F864020L,0xB07C80D040408920L,0xD030000000B02BBCL,0x450A0095E0FCE83AL,0x00000000003BF400L});
    public static final BitSet FOLLOW_expression_in_builtInCall7861 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STRAFTER_in_builtInCall7873 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall7877 = new BitSet(new long[]{0x400614884F864020L,0xB07C80D040408920L,0xD030000000B02BBCL,0x450A0095E0FCE83AL,0x00000000003BF400L});
    public static final BitSet FOLLOW_expression_in_builtInCall7881 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_YEAR_in_builtInCall7893 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall7897 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MONTH_in_builtInCall7909 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall7913 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DAY_in_builtInCall7925 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall7929 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_HOURS_in_builtInCall7941 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall7945 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUTES_in_builtInCall7957 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall7961 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SECONDS_in_builtInCall7973 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall7977 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TIMEZONE_in_builtInCall7989 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall7993 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TZ_in_builtInCall8005 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall8009 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOW_in_builtInCall8020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UUID_in_builtInCall8032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRUUID_in_builtInCall8044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MD5_in_builtInCall8053 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall8057 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SHA1_in_builtInCall8069 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall8073 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SHA256_in_builtInCall8085 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall8089 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SHA384_in_builtInCall8101 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall8105 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SHA512_in_builtInCall8117 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall8121 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_COALESCE_in_builtInCall8133 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expressionList_in_builtInCall8137 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IF_in_builtInCall8149 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall8153 = new BitSet(new long[]{0x400614884F864020L,0xB07C80D040408920L,0xD030000000B02BBCL,0x450A0095E0FCE83AL,0x00000000003BF400L});
    public static final BitSet FOLLOW_expression_in_builtInCall8157 = new BitSet(new long[]{0x400614884F864020L,0xB07C80D040408920L,0xD030000000B02BBCL,0x450A0095E0FCE83AL,0x00000000003BF400L});
    public static final BitSet FOLLOW_expression_in_builtInCall8161 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STRLANG_in_builtInCall8173 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall8177 = new BitSet(new long[]{0x400614884F864020L,0xB07C80D040408920L,0xD030000000B02BBCL,0x450A0095E0FCE83AL,0x00000000003BF400L});
    public static final BitSet FOLLOW_expression_in_builtInCall8181 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STRDT_in_builtInCall8193 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall8197 = new BitSet(new long[]{0x400614884F864020L,0xB07C80D040408920L,0xD030000000B02BBCL,0x450A0095E0FCE83AL,0x00000000003BF400L});
    public static final BitSet FOLLOW_expression_in_builtInCall8201 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAMETERM_in_builtInCall8213 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall8217 = new BitSet(new long[]{0x400614884F864020L,0xB07C80D040408920L,0xD030000000B02BBCL,0x450A0095E0FCE83AL,0x00000000003BF400L});
    public static final BitSet FOLLOW_expression_in_builtInCall8221 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ISIRI_in_builtInCall8233 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall8237 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ISURI_in_builtInCall8249 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall8253 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ISBLANK_in_builtInCall8265 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall8269 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ISLITERAL_in_builtInCall8281 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall8285 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ISNUMERIC_in_builtInCall8297 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall8301 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_regexExpression_in_builtInCall8314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_existsFunc_in_builtInCall8323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notExistsFunc_in_builtInCall8332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REGEX_in_regexExpression8355 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_regexExpression8359 = new BitSet(new long[]{0x400614884F864020L,0xB07C80D040408920L,0xD030000000B02BBCL,0x450A0095E0FCE83AL,0x00000000003BF400L});
    public static final BitSet FOLLOW_expression_in_regexExpression8363 = new BitSet(new long[]{0x400614884F864028L,0xB07C80D040408920L,0xD030000000B02BBCL,0x450A0095E0FCE83AL,0x00000000003BF400L});
    public static final BitSet FOLLOW_expression_in_regexExpression8367 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXISTS_in_existsFunc8399 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_groupGraphPattern_in_existsFunc8403 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_EXISTS_in_notExistsFunc8434 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_groupGraphPattern_in_notExistsFunc8438 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_COUNT_in_aggregate8473 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DISTINCT_in_aggregate8485 = new BitSet(new long[]{0x400614884F864020L,0xB07C80D040408920L,0xD030000000B02BBCL,0x450A0095E0FCE83AL,0x00000000003BF400L});
    public static final BitSet FOLLOW_expression_in_aggregate8542 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_270_in_aggregate8552 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUM_in_aggregate8572 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DISTINCT_in_aggregate8584 = new BitSet(new long[]{0x400614884F864020L,0xB07C80D040408920L,0xD030000000B02BBCL,0x450A0095E0FCE83AL,0x00000000003BF400L});
    public static final BitSet FOLLOW_expression_in_aggregate8601 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MIN_in_aggregate8614 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DISTINCT_in_aggregate8627 = new BitSet(new long[]{0x400614884F864020L,0xB07C80D040408920L,0xD030000000B02BBCL,0x450A0095E0FCE83AL,0x00000000003BF400L});
    public static final BitSet FOLLOW_expression_in_aggregate8643 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MAX_in_aggregate8656 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DISTINCT_in_aggregate8669 = new BitSet(new long[]{0x400614884F864020L,0xB07C80D040408920L,0xD030000000B02BBCL,0x450A0095E0FCE83AL,0x00000000003BF400L});
    public static final BitSet FOLLOW_expression_in_aggregate8686 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AVG_in_aggregate8699 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DISTINCT_in_aggregate8712 = new BitSet(new long[]{0x400614884F864020L,0xB07C80D040408920L,0xD030000000B02BBCL,0x450A0095E0FCE83AL,0x00000000003BF400L});
    public static final BitSet FOLLOW_expression_in_aggregate8729 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAMPLE_in_aggregate8742 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DISTINCT_in_aggregate8754 = new BitSet(new long[]{0x400614884F864020L,0xB07C80D040408920L,0xD030000000B02BBCL,0x450A0095E0FCE83AL,0x00000000003BF400L});
    public static final BitSet FOLLOW_expression_in_aggregate8771 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GROUP_CONCAT_in_aggregate8785 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DISTINCT_in_aggregate8797 = new BitSet(new long[]{0x400614884F864020L,0xB07C80D040408920L,0xD030000000B02BBCL,0x450A0095E0FCE83AL,0x00000000003BF400L});
    public static final BitSet FOLLOW_expression_in_aggregate8812 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_SEPARATOR_in_aggregate8823 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_string_in_aggregate8827 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FUNCTION_in_iRIFunction8856 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_iRIref_in_iRIFunction8866 = new BitSet(new long[]{0x500614884F864028L,0xB07C80D040408920L,0xD030000000B42BBCL,0x450A0095E0FCE83AL,0x00000000003BF400L});
    public static final BitSet FOLLOW_argList_in_iRIFunction8878 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_string_in_rDFLiteral8910 = new BitSet(new long[]{0x0000000000000002L,0x4000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_LANGTAG_in_rDFLiteral8925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_280_in_rDFLiteral8939 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L,0x0030000000000000L});
    public static final BitSet FOLLOW_iRIref_in_rDFLiteral8943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteralUnsigned_in_numericLiteral8974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteralPositive_in_numericLiteral8984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteralNegative_in_numericLiteral8994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BIG_INTEGER_in_numericLiteralUnsigned9016 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INTEGER_in_numericLiteralUnsigned9021 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BIG_DECIMAL_in_numericLiteralUnsigned9037 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DECIMAL_in_numericLiteralUnsigned9041 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DOUBLE_in_numericLiteralUnsigned9056 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DOUBLE_in_numericLiteralUnsigned9061 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BIG_INTEGER_in_numericLiteralPositive9091 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INTEGER_POSITIVE_in_numericLiteralPositive9096 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BIG_DECIMAL_in_numericLiteralPositive9109 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DECIMAL_POSITIVE_in_numericLiteralPositive9113 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DOUBLE_in_numericLiteralPositive9126 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DOUBLE_POSITIVE_in_numericLiteralPositive9131 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BIG_INTEGER_in_numericLiteralNegative9156 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INTEGER_NEGATIVE_in_numericLiteralNegative9161 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BIG_DECIMAL_in_numericLiteralNegative9174 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DECIMAL_NEGATIVE_in_numericLiteralNegative9178 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DOUBLE_in_numericLiteralNegative9191 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DOUBLE_NEGATIVE_in_numericLiteralNegative9196 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BOOLEAN_in_booleanLiteral9220 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TRUE_in_booleanLiteral9222 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BOOLEAN_in_booleanLiteral9237 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FALSE_in_booleanLiteral9239 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STRING_in_string9262 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_LITERAL1_in_string9266 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STRING_in_string9283 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_LITERAL2_in_string9287 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STRING_in_string9304 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_LITERAL_LONG1_in_string9308 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STRING_in_string9320 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_LITERAL_LONG2_in_string9324 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IRI_in_iRIref9348 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IRI_REF_in_iRIref9352 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_prefixedName_in_iRIref9364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PREFIXED_NAME_in_prefixedName9386 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PNAME_LN_in_prefixedName9390 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PREFIXED_NS_in_prefixedName9399 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PNAME_NS_in_prefixedName9403 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BLANK_NODE_LABEL_in_blankNode9427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ANNON_in_blankNode9438 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OPEN_SQ_BRACKET_in_blankNode9442 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NIL_in_synpred1_IbmSparqlExtAstWalker4242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NIL_in_synpred2_IbmSparqlExtAstWalker4264 = new BitSet(new long[]{0x0000000000000002L});

}