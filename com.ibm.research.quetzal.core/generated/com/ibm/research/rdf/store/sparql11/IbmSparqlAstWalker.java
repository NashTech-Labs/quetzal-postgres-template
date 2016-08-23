// $ANTLR 3.4 /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g 2016-08-23 17:16:18
 
package com.ibm.research.rdf.store.sparql11;
	
import org.antlr.runtime.BitSet;
import java.util.*;
import java.math.BigInteger;
import java.math.BigDecimal;
import com.ibm.research.rdf.store.sparql11.model.*;
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
public class IbmSparqlAstWalker extends TreeParser {
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


    public IbmSparqlAstWalker(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public IbmSparqlAstWalker(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return IbmSparqlAstWalker.tokenNames; }
    public String getGrammarFileName() { return "/home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g"; }


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



    // $ANTLR start "queryUnit"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:61:1: queryUnit returns [Query q] : ^( ROOT x= query ) ;
    public final Query queryUnit() throws RecognitionException {
        Query q = null;


        Query x =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:62:2: ( ^( ROOT x= query ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:62:8: ^( ROOT x= query )
            {
            match(input,ROOT,FOLLOW_ROOT_in_queryUnit83); if (state.failed) return q;

            match(input, Token.DOWN, null); if (state.failed) return q;
            pushFollow(FOLLOW_query_in_queryUnit87);
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
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:65:1: query returns [Query q] : ^( QUERY (p= prologue ) ( (s= selectQuery (b= bindingsClause )? ) | (c= constructQuery ) | (d= describeQuery ) | (a= askQuery ) ) ) ;
    public final Query query() throws RecognitionException {
        Query q = null;


        QueryPrologue p =null;

        SelectQuery s =null;

        Pattern b =null;

        ConstructQuery c =null;

        DescribeQuery d =null;

        AskQuery a =null;



        		
        	
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:69:2: ( ^( QUERY (p= prologue ) ( (s= selectQuery (b= bindingsClause )? ) | (c= constructQuery ) | (d= describeQuery ) | (a= askQuery ) ) ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:69:4: ^( QUERY (p= prologue ) ( (s= selectQuery (b= bindingsClause )? ) | (c= constructQuery ) | (d= describeQuery ) | (a= askQuery ) ) )
            {
            match(input,QUERY,FOLLOW_QUERY_in_query115); if (state.failed) return q;

            match(input, Token.DOWN, null); if (state.failed) return q;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:70:4: (p= prologue )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:70:6: p= prologue
            {
            pushFollow(FOLLOW_prologue_in_query125);
            p=prologue();

            state._fsp--;
            if (state.failed) return q;

            }


            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:71:4: ( (s= selectQuery (b= bindingsClause )? ) | (c= constructQuery ) | (d= describeQuery ) | (a= askQuery ) )
            int alt2=4;
            switch ( input.LA(1) ) {
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
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:71:6: (s= selectQuery (b= bindingsClause )? )
                    {
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:71:6: (s= selectQuery (b= bindingsClause )? )
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:71:8: s= selectQuery (b= bindingsClause )?
                    {
                    pushFollow(FOLLOW_selectQuery_in_query144);
                    s=selectQuery();

                    state._fsp--;
                    if (state.failed) return q;

                    if ( state.backtracking==0 ) { q = new Query(p,s); }

                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:72:8: (b= bindingsClause )?
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==VALUES) ) {
                        alt1=1;
                    }
                    switch (alt1) {
                        case 1 :
                            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:72:10: b= bindingsClause
                            {
                            pushFollow(FOLLOW_bindingsClause_in_query162);
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
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:84:6: (c= constructQuery )
                    {
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:84:6: (c= constructQuery )
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:84:8: c= constructQuery
                    {
                    pushFollow(FOLLOW_constructQuery_in_query219);
                    c=constructQuery();

                    state._fsp--;
                    if (state.failed) return q;

                    if ( state.backtracking==0 ) { q = new Query(p,c); }

                    }


                    }
                    break;
                case 3 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:85:6: (d= describeQuery )
                    {
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:85:6: (d= describeQuery )
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:85:8: d= describeQuery
                    {
                    pushFollow(FOLLOW_describeQuery_in_query235);
                    d=describeQuery();

                    state._fsp--;
                    if (state.failed) return q;

                    if ( state.backtracking==0 ) { q = new Query(p,d); }

                    }


                    }
                    break;
                case 4 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:86:6: (a= askQuery )
                    {
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:86:6: (a= askQuery )
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:86:8: a= askQuery
                    {
                    pushFollow(FOLLOW_askQuery_in_query251);
                    a=askQuery();

                    state._fsp--;
                    if (state.failed) return q;

                    if ( state.backtracking==0 ) { q = new Query(p,a); }

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
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:99:1: prologue returns [QueryPrologue qp] : ^( PROLOGUE ( baseDecl[$qp] )* ( prefixDecl[$qp] )* ) ;
    public final QueryPrologue prologue() throws RecognitionException {
        QueryPrologue qp = null;


         qp = new QueryPrologue(); 
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:101:2: ( ^( PROLOGUE ( baseDecl[$qp] )* ( prefixDecl[$qp] )* ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:102:3: ^( PROLOGUE ( baseDecl[$qp] )* ( prefixDecl[$qp] )* )
            {
            match(input,PROLOGUE,FOLLOW_PROLOGUE_in_prologue307); if (state.failed) return qp;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return qp;
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:102:14: ( baseDecl[$qp] )*
                loop3:
                do {
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==BASE) ) {
                        alt3=1;
                    }


                    switch (alt3) {
                	case 1 :
                	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:102:14: baseDecl[$qp]
                	    {
                	    pushFollow(FOLLOW_baseDecl_in_prologue309);
                	    baseDecl(qp);

                	    state._fsp--;
                	    if (state.failed) return qp;

                	    }
                	    break;

                	default :
                	    break loop3;
                    }
                } while (true);


                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:102:30: ( prefixDecl[$qp] )*
                loop4:
                do {
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==PREFIX) ) {
                        alt4=1;
                    }


                    switch (alt4) {
                	case 1 :
                	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:102:30: prefixDecl[$qp]
                	    {
                	    pushFollow(FOLLOW_prefixDecl_in_prologue314);
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
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:106:1: baseDecl[QueryPrologue qp] : ^( BASE i= iRIref ) ;
    public final void baseDecl(QueryPrologue qp) throws RecognitionException {
        IRI i =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:107:2: ( ^( BASE i= iRIref ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:108:4: ^( BASE i= iRIref )
            {
            match(input,BASE,FOLLOW_BASE_in_baseDecl345); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_iRIref_in_baseDecl349);
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
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:112:1: prefixDecl[QueryPrologue qp] : ^( PREFIX n= prefixedName v= iRIref ) ;
    public final void prefixDecl(QueryPrologue qp) throws RecognitionException {
        String n =null;

        IRI v =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:113:2: ( ^( PREFIX n= prefixedName v= iRIref ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:114:3: ^( PREFIX n= prefixedName v= iRIref )
            {
            match(input,PREFIX,FOLLOW_PREFIX_in_prefixDecl377); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_prefixedName_in_prefixDecl381);
            n=prefixedName();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_iRIref_in_prefixDecl386);
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
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:118:1: selectQuery returns [SelectQuery sq] : ^( SELECT (s= selectClause ) (d= dataset )* (w= whereClause )? (m= solutionModifier ) ) ;
    public final SelectQuery selectQuery() throws RecognitionException {
        SelectQuery sq = null;


        SelectClause s =null;

        List<DatasetClause> d =null;

        Pattern w =null;

        SolutionModifiers m =null;


         sq = new SelectQuery(); 
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:120:2: ( ^( SELECT (s= selectClause ) (d= dataset )* (w= whereClause )? (m= solutionModifier ) ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:121:3: ^( SELECT (s= selectClause ) (d= dataset )* (w= whereClause )? (m= solutionModifier ) )
            {
            match(input,SELECT,FOLLOW_SELECT_in_selectQuery424); if (state.failed) return sq;

            match(input, Token.DOWN, null); if (state.failed) return sq;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:122:4: (s= selectClause )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:122:5: s= selectClause
            {
            pushFollow(FOLLOW_selectClause_in_selectQuery434);
            s=selectClause();

            state._fsp--;
            if (state.failed) return sq;

            if ( state.backtracking==0 ) { sq.setSelectClause(s);      }

            }


            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:123:4: (d= dataset )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==DATASET) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:123:5: d= dataset
            	    {
            	    pushFollow(FOLLOW_dataset_in_selectQuery450);
            	    d=dataset();

            	    state._fsp--;
            	    if (state.failed) return sq;

            	    if ( state.backtracking==0 ) { sq.setDatasetClauses(d);    }

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:124:4: (w= whereClause )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==WHERE) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:124:5: w= whereClause
                    {
                    pushFollow(FOLLOW_whereClause_in_selectQuery469);
                    w=whereClause();

                    state._fsp--;
                    if (state.failed) return sq;

                    if ( state.backtracking==0 ) { sq.setGraphPattern(w);      }

                    }
                    break;

            }


            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:125:4: (m= solutionModifier )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:125:5: m= solutionModifier
            {
            pushFollow(FOLLOW_solutionModifier_in_selectQuery485);
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



    // $ANTLR start "dataset"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:129:1: dataset returns [List<DatasetClause> dcl] : ^( DATASET (dc= datasetClause )+ ) ;
    public final List<DatasetClause> dataset() throws RecognitionException {
        List<DatasetClause> dcl = null;


        DatasetClause dc =null;


         dcl = new ArrayList<DatasetClause>(); 
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:131:2: ( ^( DATASET (dc= datasetClause )+ ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:132:3: ^( DATASET (dc= datasetClause )+ )
            {
            match(input,DATASET,FOLLOW_DATASET_in_dataset524); if (state.failed) return dcl;

            match(input, Token.DOWN, null); if (state.failed) return dcl;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:133:4: (dc= datasetClause )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==FROM) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:133:5: dc= datasetClause
            	    {
            	    pushFollow(FOLLOW_datasetClause_in_dataset533);
            	    dc=datasetClause();

            	    state._fsp--;
            	    if (state.failed) return dcl;

            	    if ( state.backtracking==0 ) {dcl.add(dc);}

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
            	    if (state.backtracking>0) {state.failed=true; return dcl;}
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
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
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:137:1: subSelect returns [SubSelectPattern sp] : ^( SUB_SELECT (s= selectClause ) (w= whereClause )? (m= solutionModifier ) (d= inlineData )? ) ;
    public final SubSelectPattern subSelect() throws RecognitionException {
        SubSelectPattern sp = null;


        SelectClause s =null;

        Pattern w =null;

        SolutionModifiers m =null;

        ValuesPattern d =null;


         
        		sp = new SubSelectPattern();
        	
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:141:2: ( ^( SUB_SELECT (s= selectClause ) (w= whereClause )? (m= solutionModifier ) (d= inlineData )? ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:141:6: ^( SUB_SELECT (s= selectClause ) (w= whereClause )? (m= solutionModifier ) (d= inlineData )? )
            {
            match(input,SUB_SELECT,FOLLOW_SUB_SELECT_in_subSelect567); if (state.failed) return sp;

            match(input, Token.DOWN, null); if (state.failed) return sp;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:142:4: (s= selectClause )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:142:5: s= selectClause
            {
            pushFollow(FOLLOW_selectClause_in_subSelect576);
            s=selectClause();

            state._fsp--;
            if (state.failed) return sp;

            if ( state.backtracking==0 ) { sp.setSelectClause(s);      }

            }


            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:143:4: (w= whereClause )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==WHERE) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:143:5: w= whereClause
                    {
                    pushFollow(FOLLOW_whereClause_in_subSelect592);
                    w=whereClause();

                    state._fsp--;
                    if (state.failed) return sp;

                    if ( state.backtracking==0 ) { sp.setGraphPattern(w);      }

                    }
                    break;

            }


            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:144:4: (m= solutionModifier )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:144:5: m= solutionModifier
            {
            pushFollow(FOLLOW_solutionModifier_in_subSelect608);
            m=solutionModifier();

            state._fsp--;
            if (state.failed) return sp;

            if ( state.backtracking==0 ) { sp.setSolutionModifier(m);  }

            }


            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:145:13: (d= inlineData )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==VALUES) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:145:14: d= inlineData
                    {
                    pushFollow(FOLLOW_inlineData_in_subSelect634);
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
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:149:1: selectClause returns [SelectClause sc] : ( ^( TYPE ( DISTINCT | REDUCED ) ) )? ^( PVARS ( (v= var | expVar[$sc] | fexp[$sc] )* | '*' ) ) ;
    public final SelectClause selectClause() throws RecognitionException {
        SelectClause sc = null;


        String v =null;


         sc = new SelectClause(); 
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:151:2: ( ( ^( TYPE ( DISTINCT | REDUCED ) ) )? ^( PVARS ( (v= var | expVar[$sc] | fexp[$sc] )* | '*' ) ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:152:3: ( ^( TYPE ( DISTINCT | REDUCED ) ) )? ^( PVARS ( (v= var | expVar[$sc] | fexp[$sc] )* | '*' ) )
            {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:152:3: ( ^( TYPE ( DISTINCT | REDUCED ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==TYPE) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:152:4: ^( TYPE ( DISTINCT | REDUCED ) )
                    {
                    match(input,TYPE,FOLLOW_TYPE_in_selectClause680); if (state.failed) return sc;

                    match(input, Token.DOWN, null); if (state.failed) return sc;
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:152:11: ( DISTINCT | REDUCED )
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==DISTINCT) ) {
                        alt10=1;
                    }
                    else if ( (LA10_0==REDUCED) ) {
                        alt10=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return sc;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 0, input);

                        throw nvae;

                    }
                    switch (alt10) {
                        case 1 :
                            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:152:13: DISTINCT
                            {
                            match(input,DISTINCT,FOLLOW_DISTINCT_in_selectClause684); if (state.failed) return sc;

                            if ( state.backtracking==0 ) { sc.setSelectModifier(SelectClause.ESelectModifier.DISTINCT); }

                            }
                            break;
                        case 2 :
                            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:153:7: REDUCED
                            {
                            match(input,REDUCED,FOLLOW_REDUCED_in_selectClause696); if (state.failed) return sc;

                            if ( state.backtracking==0 ) { sc.setSelectModifier(SelectClause.ESelectModifier.REDUCED);  }

                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return sc;


                    }
                    break;

            }


            match(input,PVARS,FOLLOW_PVARS_in_selectClause725); if (state.failed) return sc;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return sc;
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:157:11: ( (v= var | expVar[$sc] | fexp[$sc] )* | '*' )
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==UP||LA13_0==AS||LA13_0==EXP||LA13_0==VAR) ) {
                    alt13=1;
                }
                else if ( (LA13_0==253) ) {
                    alt13=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return sc;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 0, input);

                    throw nvae;

                }
                switch (alt13) {
                    case 1 :
                        // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:157:13: (v= var | expVar[$sc] | fexp[$sc] )*
                        {
                        // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:157:13: (v= var | expVar[$sc] | fexp[$sc] )*
                        loop12:
                        do {
                            int alt12=4;
                            switch ( input.LA(1) ) {
                            case VAR:
                                {
                                alt12=1;
                                }
                                break;
                            case AS:
                                {
                                alt12=2;
                                }
                                break;
                            case EXP:
                                {
                                alt12=3;
                                }
                                break;

                            }

                            switch (alt12) {
                        	case 1 :
                        	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:157:15: v= var
                        	    {
                        	    pushFollow(FOLLOW_var_in_selectClause733);
                        	    v=var();

                        	    state._fsp--;
                        	    if (state.failed) return sc;

                        	    if ( state.backtracking==0 ) { sc.addProjectedVariable(new ProjectedVariable(v)); }

                        	    }
                        	    break;
                        	case 2 :
                        	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:158:15: expVar[$sc]
                        	    {
                        	    pushFollow(FOLLOW_expVar_in_selectClause755);
                        	    expVar(sc);

                        	    state._fsp--;
                        	    if (state.failed) return sc;

                        	    }
                        	    break;
                        	case 3 :
                        	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:159:15: fexp[$sc]
                        	    {
                        	    pushFollow(FOLLOW_fexp_in_selectClause778);
                        	    fexp(sc);

                        	    state._fsp--;
                        	    if (state.failed) return sc;

                        	    }
                        	    break;

                        	default :
                        	    break loop12;
                            }
                        } while (true);


                        }
                        break;
                    case 2 :
                        // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:161:13: '*'
                        {
                        match(input,253,FOLLOW_253_in_selectClause818); if (state.failed) return sc;

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
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:166:1: expVar[SelectClause sc] : ^( AS v= var e= expression ) ;
    public final void expVar(SelectClause sc) throws RecognitionException {
        String v =null;

        Expression e =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:167:2: ( ^( AS v= var e= expression ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:167:4: ^( AS v= var e= expression )
            {
            match(input,AS,FOLLOW_AS_in_expVar849); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_var_in_expVar853);
            v=var();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_expression_in_expVar857);
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
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:170:1: fexp[SelectClause sc] : ^( EXP e= expression ) ;
    public final void fexp(SelectClause sc) throws RecognitionException {
        Expression e =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:171:2: ( ^( EXP e= expression ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:171:4: ^( EXP e= expression )
            {
            match(input,EXP,FOLLOW_EXP_in_fexp875); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_expression_in_fexp879);
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
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:174:1: constructQuery returns [ConstructQuery cq] : ^( CONSTRUCT ( ( constructTemplate[$cq] (d= dataset )* (w= whereClause ) (m= solutionModifier ) ) | ( (d= dataset )* ( ^( WHERE triplesTemplate[$cq,p] ) )? (m= solutionModifier ) ) ) ) ;
    public final ConstructQuery constructQuery() throws RecognitionException {
        ConstructQuery cq = null;


        List<DatasetClause> d =null;

        Pattern w =null;

        SolutionModifiers m =null;


         
                PatternSet p = null;
        		cq = new ConstructQuery();
        	
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:179:2: ( ^( CONSTRUCT ( ( constructTemplate[$cq] (d= dataset )* (w= whereClause ) (m= solutionModifier ) ) | ( (d= dataset )* ( ^( WHERE triplesTemplate[$cq,p] ) )? (m= solutionModifier ) ) ) ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:179:6: ^( CONSTRUCT ( ( constructTemplate[$cq] (d= dataset )* (w= whereClause ) (m= solutionModifier ) ) | ( (d= dataset )* ( ^( WHERE triplesTemplate[$cq,p] ) )? (m= solutionModifier ) ) ) )
            {
            match(input,CONSTRUCT,FOLLOW_CONSTRUCT_in_constructQuery910); if (state.failed) return cq;

            match(input, Token.DOWN, null); if (state.failed) return cq;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:179:20: ( ( constructTemplate[$cq] (d= dataset )* (w= whereClause ) (m= solutionModifier ) ) | ( (d= dataset )* ( ^( WHERE triplesTemplate[$cq,p] ) )? (m= solutionModifier ) ) )
            int alt17=2;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:179:22: ( constructTemplate[$cq] (d= dataset )* (w= whereClause ) (m= solutionModifier ) )
                    {
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:179:22: ( constructTemplate[$cq] (d= dataset )* (w= whereClause ) (m= solutionModifier ) )
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:179:24: constructTemplate[$cq] (d= dataset )* (w= whereClause ) (m= solutionModifier )
                    {
                    pushFollow(FOLLOW_constructTemplate_in_constructQuery917);
                    constructTemplate(cq);

                    state._fsp--;
                    if (state.failed) return cq;

                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:180:8: (d= dataset )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==DATASET) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:180:9: d= dataset
                    	    {
                    	    pushFollow(FOLLOW_dataset_in_constructQuery931);
                    	    d=dataset();

                    	    state._fsp--;
                    	    if (state.failed) return cq;

                    	    if ( state.backtracking==0 ) { cq.setDatasetClauses(d);    }

                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);


                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:181:8: (w= whereClause )
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:181:9: w= whereClause
                    {
                    pushFollow(FOLLOW_whereClause_in_constructQuery954);
                    w=whereClause();

                    state._fsp--;
                    if (state.failed) return cq;

                    if ( state.backtracking==0 ) { cq.setPattern(w);           }

                    }


                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:182:8: (m= solutionModifier )
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:182:9: m= solutionModifier
                    {
                    pushFollow(FOLLOW_solutionModifier_in_constructQuery973);
                    m=solutionModifier();

                    state._fsp--;
                    if (state.failed) return cq;

                    if ( state.backtracking==0 ) { cq.setSolutionModifier(m);  }

                    }


                    }


                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:185:7: ( (d= dataset )* ( ^( WHERE triplesTemplate[$cq,p] ) )? (m= solutionModifier ) )
                    {
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:185:7: ( (d= dataset )* ( ^( WHERE triplesTemplate[$cq,p] ) )? (m= solutionModifier ) )
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:185:9: (d= dataset )* ( ^( WHERE triplesTemplate[$cq,p] ) )? (m= solutionModifier )
                    {
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:185:9: (d= dataset )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==DATASET) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:185:10: d= dataset
                    	    {
                    	    pushFollow(FOLLOW_dataset_in_constructQuery1013);
                    	    d=dataset();

                    	    state._fsp--;
                    	    if (state.failed) return cq;

                    	    if ( state.backtracking==0 ) { cq.setDatasetClauses(d);    }

                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);


                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:186:8: ( ^( WHERE triplesTemplate[$cq,p] ) )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==WHERE) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:186:9: ^( WHERE triplesTemplate[$cq,p] )
                            {
                            match(input,WHERE,FOLLOW_WHERE_in_constructQuery1035); if (state.failed) return cq;

                            if ( state.backtracking==0 ) {      
                                                             p = new PatternSet();
                                                           }

                            match(input, Token.DOWN, null); if (state.failed) return cq;
                            pushFollow(FOLLOW_triplesTemplate_in_constructQuery1101);
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


                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:196:8: (m= solutionModifier )
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:196:9: m= solutionModifier
                    {
                    pushFollow(FOLLOW_solutionModifier_in_constructQuery1181);
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
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:202:1: describeQuery returns [DescribeQuery dq] : ^( DESCRIBE ( ( (v= varOrIRIref2 )+ | '*' ) (d= datasetClause )* (w= whereClause )? (s= solutionModifier ) ) ) ;
    public final DescribeQuery describeQuery() throws RecognitionException {
        DescribeQuery dq = null;


        BinaryUnion<Variable, IRI> v =null;

        DatasetClause d =null;

        Pattern w =null;

        SolutionModifiers s =null;


         
        		dq = new DescribeQuery();
        	
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:206:2: ( ^( DESCRIBE ( ( (v= varOrIRIref2 )+ | '*' ) (d= datasetClause )* (w= whereClause )? (s= solutionModifier ) ) ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:206:6: ^( DESCRIBE ( ( (v= varOrIRIref2 )+ | '*' ) (d= datasetClause )* (w= whereClause )? (s= solutionModifier ) ) )
            {
            match(input,DESCRIBE,FOLLOW_DESCRIBE_in_describeQuery1239); if (state.failed) return dq;

            match(input, Token.DOWN, null); if (state.failed) return dq;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:206:18: ( ( (v= varOrIRIref2 )+ | '*' ) (d= datasetClause )* (w= whereClause )? (s= solutionModifier ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:206:20: ( (v= varOrIRIref2 )+ | '*' ) (d= datasetClause )* (w= whereClause )? (s= solutionModifier )
            {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:206:20: ( (v= varOrIRIref2 )+ | '*' )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==IRI||(LA19_0 >= PREFIXED_NAME && LA19_0 <= PREFIXED_NS)||LA19_0==VAR) ) {
                alt19=1;
            }
            else if ( (LA19_0==253) ) {
                alt19=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return dq;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }
            switch (alt19) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:206:22: (v= varOrIRIref2 )+
                    {
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:206:22: (v= varOrIRIref2 )+
                    int cnt18=0;
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==IRI||(LA18_0 >= PREFIXED_NAME && LA18_0 <= PREFIXED_NS)||LA18_0==VAR) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:206:23: v= varOrIRIref2
                    	    {
                    	    pushFollow(FOLLOW_varOrIRIref2_in_describeQuery1248);
                    	    v=varOrIRIref2();

                    	    state._fsp--;
                    	    if (state.failed) return dq;

                    	    if ( state.backtracking==0 ) {dq.getResources().add(v);}

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt18 >= 1 ) break loop18;
                    	    if (state.backtracking>0) {state.failed=true; return dq;}
                                EarlyExitException eee =
                                    new EarlyExitException(18, input);
                                throw eee;
                        }
                        cnt18++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:206:74: '*'
                    {
                    match(input,253,FOLLOW_253_in_describeQuery1259); if (state.failed) return dq;

                    }
                    break;

            }


            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:207:8: (d= datasetClause )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==FROM) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:207:10: d= datasetClause
            	    {
            	    pushFollow(FOLLOW_datasetClause_in_describeQuery1274);
            	    d=datasetClause();

            	    state._fsp--;
            	    if (state.failed) return dq;

            	    if ( state.backtracking==0 ) {dq.getDatasetClauses().add(d);}

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:208:8: (w= whereClause )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==WHERE) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:208:10: w= whereClause
                    {
                    pushFollow(FOLLOW_whereClause_in_describeQuery1295);
                    w=whereClause();

                    state._fsp--;
                    if (state.failed) return dq;

                    if ( state.backtracking==0 ) {dq.setPattern(w);	}

                    }
                    break;

            }


            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:209:8: (s= solutionModifier )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:209:10: s= solutionModifier
            {
            pushFollow(FOLLOW_solutionModifier_in_describeQuery1315);
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
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:214:1: askQuery returns [AskQuery aq] : ^( ASK ( (d= datasetClause )* (w= whereClause ) ) ) ;
    public final AskQuery askQuery() throws RecognitionException {
        AskQuery aq = null;


        DatasetClause d =null;

        Pattern w =null;



        		ArrayList<DatasetClause> dsl = new ArrayList<DatasetClause>();
        	
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:218:2: ( ^( ASK ( (d= datasetClause )* (w= whereClause ) ) ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:218:6: ^( ASK ( (d= datasetClause )* (w= whereClause ) ) )
            {
            match(input,ASK,FOLLOW_ASK_in_askQuery1356); if (state.failed) return aq;

            match(input, Token.DOWN, null); if (state.failed) return aq;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:218:13: ( (d= datasetClause )* (w= whereClause ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:218:15: (d= datasetClause )* (w= whereClause )
            {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:218:15: (d= datasetClause )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==FROM) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:218:16: d= datasetClause
            	    {
            	    pushFollow(FOLLOW_datasetClause_in_askQuery1364);
            	    d=datasetClause();

            	    state._fsp--;
            	    if (state.failed) return aq;

            	    if ( state.backtracking==0 ) { dsl.add(d); }

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:219:6: (w= whereClause )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:219:7: w= whereClause
            {
            pushFollow(FOLLOW_whereClause_in_askQuery1380);
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
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:224:1: datasetClause returns [DatasetClause dc] : ^( FROM (d= defaultGraphClause |n= namedGraphClause ) ) ;
    public final DatasetClause datasetClause() throws RecognitionException {
        DatasetClause dc = null;


        DatasetClause d =null;

        DatasetClause n =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:225:2: ( ^( FROM (d= defaultGraphClause |n= namedGraphClause ) ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:225:4: ^( FROM (d= defaultGraphClause |n= namedGraphClause ) )
            {
            match(input,FROM,FOLLOW_FROM_in_datasetClause1415); if (state.failed) return dc;

            match(input, Token.DOWN, null); if (state.failed) return dc;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:225:12: (d= defaultGraphClause |n= namedGraphClause )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==IRI||(LA23_0 >= PREFIXED_NAME && LA23_0 <= PREFIXED_NS)) ) {
                alt23=1;
            }
            else if ( (LA23_0==NAMED) ) {
                alt23=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return dc;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;

            }
            switch (alt23) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:225:14: d= defaultGraphClause
                    {
                    pushFollow(FOLLOW_defaultGraphClause_in_datasetClause1422);
                    d=defaultGraphClause();

                    state._fsp--;
                    if (state.failed) return dc;

                    if ( state.backtracking==0 ) { dc = d; }

                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:226:7: n= namedGraphClause
                    {
                    pushFollow(FOLLOW_namedGraphClause_in_datasetClause1436);
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
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:231:1: defaultGraphClause returns [DatasetClause dc] : d= sourceSelector ;
    public final DatasetClause defaultGraphClause() throws RecognitionException {
        DatasetClause dc = null;


        IRI d =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:232:2: (d= sourceSelector )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:232:6: d= sourceSelector
            {
            pushFollow(FOLLOW_sourceSelector_in_defaultGraphClause1469);
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
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:235:1: namedGraphClause returns [DatasetClause dc] : ^( NAMED d= sourceSelector ) ;
    public final DatasetClause namedGraphClause() throws RecognitionException {
        DatasetClause dc = null;


        IRI d =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:236:2: ( ^( NAMED d= sourceSelector ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:236:6: ^( NAMED d= sourceSelector )
            {
            match(input,NAMED,FOLLOW_NAMED_in_namedGraphClause1491); if (state.failed) return dc;

            match(input, Token.DOWN, null); if (state.failed) return dc;
            pushFollow(FOLLOW_sourceSelector_in_namedGraphClause1495);
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
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:239:1: sourceSelector returns [IRI r] : i= iRIref ;
    public final IRI sourceSelector() throws RecognitionException {
        IRI r = null;


        IRI i =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:240:2: (i= iRIref )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:240:7: i= iRIref
            {
            pushFollow(FOLLOW_iRIref_in_sourceSelector1521);
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
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:243:1: whereClause returns [Pattern p] : ^( WHERE (g= groupGraphPattern[true] )? ) ;
    public final Pattern whereClause() throws RecognitionException {
        Pattern p = null;


        Pattern g =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:244:2: ( ^( WHERE (g= groupGraphPattern[true] )? ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:245:3: ^( WHERE (g= groupGraphPattern[true] )? )
            {
            match(input,WHERE,FOLLOW_WHERE_in_whereClause1544); if (state.failed) return p;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return p;
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:245:12: (g= groupGraphPattern[true] )?
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==GROUP_GRAPH_PATTERN||LA24_0==SUB_SELECT) ) {
                    alt24=1;
                }
                switch (alt24) {
                    case 1 :
                        // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:245:12: g= groupGraphPattern[true]
                        {
                        pushFollow(FOLLOW_groupGraphPattern_in_whereClause1548);
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
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:248:1: solutionModifier returns [SolutionModifiers m] : ^( MODIFIERS (g= groupClause )? (h= havingClause )? (o= orderClause )? (l= limitOffsetClauses )? ) ;
    public final SolutionModifiers solutionModifier() throws RecognitionException {
        SolutionModifiers m = null;


        GroupCondition g =null;

        HavingCondition h =null;

        List<OrderCondition> o =null;

        LimitOffsetClauses l =null;



        		m = new SolutionModifiers();
        	
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:252:2: ( ^( MODIFIERS (g= groupClause )? (h= havingClause )? (o= orderClause )? (l= limitOffsetClauses )? ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:252:6: ^( MODIFIERS (g= groupClause )? (h= havingClause )? (o= orderClause )? (l= limitOffsetClauses )? )
            {
            match(input,MODIFIERS,FOLLOW_MODIFIERS_in_solutionModifier1579); if (state.failed) return m;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return m;
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:253:4: (g= groupClause )?
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==GROUP_BY) ) {
                    alt25=1;
                }
                switch (alt25) {
                    case 1 :
                        // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:253:6: g= groupClause
                        {
                        pushFollow(FOLLOW_groupClause_in_solutionModifier1588);
                        g=groupClause();

                        state._fsp--;
                        if (state.failed) return m;

                        if ( state.backtracking==0 ) {m.setGroupClause(g); }

                        }
                        break;

                }


                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:254:4: (h= havingClause )?
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==HAVING) ) {
                    alt26=1;
                }
                switch (alt26) {
                    case 1 :
                        // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:254:6: h= havingClause
                        {
                        pushFollow(FOLLOW_havingClause_in_solutionModifier1605);
                        h=havingClause();

                        state._fsp--;
                        if (state.failed) return m;

                        if ( state.backtracking==0 ) {m.setHavingClause(h);}

                        }
                        break;

                }


                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:255:4: (o= orderClause )?
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==ORDER_BY) ) {
                    alt27=1;
                }
                switch (alt27) {
                    case 1 :
                        // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:255:6: o= orderClause
                        {
                        pushFollow(FOLLOW_orderClause_in_solutionModifier1622);
                        o=orderClause();

                        state._fsp--;
                        if (state.failed) return m;

                        if ( state.backtracking==0 ) {m.setOrderClause(o); }

                        }
                        break;

                }


                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:256:4: (l= limitOffsetClauses )?
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==LIMIT||LA28_0==OFFSET) ) {
                    alt28=1;
                }
                switch (alt28) {
                    case 1 :
                        // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:256:6: l= limitOffsetClauses
                        {
                        pushFollow(FOLLOW_limitOffsetClauses_in_solutionModifier1639);
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
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:259:1: groupClause returns [GroupCondition gc] : ^( GROUP_BY c= groupCondition ) ;
    public final GroupCondition groupClause() throws RecognitionException {
        GroupCondition gc = null;


        GroupCondition c =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:260:2: ( ^( GROUP_BY c= groupCondition ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:260:6: ^( GROUP_BY c= groupCondition )
            {
            match(input,GROUP_BY,FOLLOW_GROUP_BY_in_groupClause1665); if (state.failed) return gc;

            match(input, Token.DOWN, null); if (state.failed) return gc;
            pushFollow(FOLLOW_groupCondition_in_groupClause1669);
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
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:263:1: groupCondition returns [GroupCondition gc] : (b= builtInCall |f= functionCall | ^( CONDITION e2= expression (v= var )? ) |v2= var )+ ;
    public final GroupCondition groupCondition() throws RecognitionException {
        GroupCondition gc = null;


        Expression b =null;

        FunctionCall f =null;

        Expression e2 =null;

        String v =null;

        String v2 =null;



        		gc = new GroupCondition();
        	
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:267:2: ( (b= builtInCall |f= functionCall | ^( CONDITION e2= expression (v= var )? ) |v2= var )+ )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:268:2: (b= builtInCall |f= functionCall | ^( CONDITION e2= expression (v= var )? ) |v2= var )+
            {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:268:2: (b= builtInCall |f= functionCall | ^( CONDITION e2= expression (v= var )? ) |v2= var )+
            int cnt30=0;
            loop30:
            do {
                int alt30=5;
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
                    alt30=1;
                    }
                    break;
                case FUNCTION:
                    {
                    alt30=2;
                    }
                    break;
                case CONDITION:
                    {
                    alt30=3;
                    }
                    break;
                case VAR:
                    {
                    alt30=4;
                    }
                    break;

                }

                switch (alt30) {
            	case 1 :
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:268:4: b= builtInCall
            	    {
            	    pushFollow(FOLLOW_builtInCall_in_groupCondition1702);
            	    b=builtInCall();

            	    state._fsp--;
            	    if (state.failed) return gc;

            	    if ( state.backtracking==0 ) { gc.addCondition(b);                               }

            	    }
            	    break;
            	case 2 :
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:269:4: f= functionCall
            	    {
            	    pushFollow(FOLLOW_functionCall_in_groupCondition1721);
            	    f=functionCall();

            	    state._fsp--;
            	    if (state.failed) return gc;

            	    if ( state.backtracking==0 ) { gc.addCondition(new FunctionCallExpression(f));   }

            	    }
            	    break;
            	case 3 :
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:270:4: ^( CONDITION e2= expression (v= var )? )
            	    {
            	    match(input,CONDITION,FOLLOW_CONDITION_in_groupCondition1739); if (state.failed) return gc;

            	    match(input, Token.DOWN, null); if (state.failed) return gc;
            	    pushFollow(FOLLOW_expression_in_groupCondition1743);
            	    e2=expression();

            	    state._fsp--;
            	    if (state.failed) return gc;

            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:270:30: (v= var )?
            	    int alt29=2;
            	    int LA29_0 = input.LA(1);

            	    if ( (LA29_0==VAR) ) {
            	        alt29=1;
            	    }
            	    switch (alt29) {
            	        case 1 :
            	            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:270:31: v= var
            	            {
            	            pushFollow(FOLLOW_var_in_groupCondition1748);
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
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:271:4: v2= var
            	    {
            	    pushFollow(FOLLOW_var_in_groupCondition1765);
            	    v2=var();

            	    state._fsp--;
            	    if (state.failed) return gc;

            	    if ( state.backtracking==0 ) { gc.addCondition(new VariableExpression(v2));      }

            	    }
            	    break;

            	default :
            	    if ( cnt30 >= 1 ) break loop30;
            	    if (state.backtracking>0) {state.failed=true; return gc;}
                        EarlyExitException eee =
                            new EarlyExitException(30, input);
                        throw eee;
                }
                cnt30++;
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
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:275:1: havingClause returns [HavingCondition h] : ^( HAVING (c= havingCondition )+ ) ;
    public final HavingCondition havingClause() throws RecognitionException {
        HavingCondition h = null;


        Expression c =null;



        		h = new HavingCondition();
        	
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:279:2: ( ^( HAVING (c= havingCondition )+ ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:279:6: ^( HAVING (c= havingCondition )+ )
            {
            match(input,HAVING,FOLLOW_HAVING_in_havingClause1839); if (state.failed) return h;

            match(input, Token.DOWN, null); if (state.failed) return h;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:279:15: (c= havingCondition )+
            int cnt31=0;
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==ABS||LA31_0==BNODE||LA31_0==BOUND||LA31_0==CEIL||LA31_0==COALESCE||LA31_0==CONCAT||LA31_0==CONTAINS||(LA31_0 >= DATATYPE && LA31_0 <= DAY)||LA31_0==ENCODE_FOR_URI||LA31_0==EXISTS||LA31_0==EXPRESSION||LA31_0==FLOOR||LA31_0==FUNCTION||LA31_0==HOURS||LA31_0==IF||LA31_0==IRI||(LA31_0 >= ISBLANK && LA31_0 <= ISURI)||(LA31_0 >= LANG && LA31_0 <= LANGMATCHES)||LA31_0==LCASE||LA31_0==MD5||LA31_0==MINUTES||LA31_0==MONTH||LA31_0==NOT_EXISTS||LA31_0==NOW||LA31_0==RAND||(LA31_0 >= REGEX && LA31_0 <= REPLACE)||LA31_0==ROUND||LA31_0==SAMETERM||LA31_0==SECONDS||LA31_0==SHA1||(LA31_0 >= SHA256 && LA31_0 <= SHA512)||(LA31_0 >= STR && LA31_0 <= STRENDS)||(LA31_0 >= STRLANG && LA31_0 <= STRUUID)||LA31_0==SUBSTR||LA31_0==TIMEZONE||LA31_0==TZ||LA31_0==UCASE||LA31_0==URI||LA31_0==UUID||LA31_0==YEAR) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:279:16: c= havingCondition
            	    {
            	    pushFollow(FOLLOW_havingCondition_in_havingClause1844);
            	    c=havingCondition();

            	    state._fsp--;
            	    if (state.failed) return h;

            	    if ( state.backtracking==0 ) {h.addConstraint(c); }

            	    }
            	    break;

            	default :
            	    if ( cnt31 >= 1 ) break loop31;
            	    if (state.backtracking>0) {state.failed=true; return h;}
                        EarlyExitException eee =
                            new EarlyExitException(31, input);
                        throw eee;
                }
                cnt31++;
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
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:282:1: havingCondition returns [Expression e] : c= constraint ;
    public final Expression havingCondition() throws RecognitionException {
        Expression e = null;


        Expression c =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:283:2: (c= constraint )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:283:6: c= constraint
            {
            pushFollow(FOLLOW_constraint_in_havingCondition1872);
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
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:286:1: orderClause returns [List<OrderCondition> loc] : ^( ORDER_BY (oc= orderCondition )+ ) ;
    public final List<OrderCondition> orderClause() throws RecognitionException {
        List<OrderCondition> loc = null;


        OrderCondition oc =null;


         
        		loc = new ArrayList<OrderCondition>(); 
        	
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:290:2: ( ^( ORDER_BY (oc= orderCondition )+ ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:290:6: ^( ORDER_BY (oc= orderCondition )+ )
            {
            match(input,ORDER_BY,FOLLOW_ORDER_BY_in_orderClause1901); if (state.failed) return loc;

            match(input, Token.DOWN, null); if (state.failed) return loc;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:290:18: (oc= orderCondition )+
            int cnt32=0;
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==ABS||LA32_0==ASC||LA32_0==BNODE||LA32_0==BOUND||LA32_0==CEIL||LA32_0==COALESCE||LA32_0==CONCAT||LA32_0==CONTAINS||(LA32_0 >= DATATYPE && LA32_0 <= DAY)||LA32_0==DESC||LA32_0==ENCODE_FOR_URI||LA32_0==EXISTS||LA32_0==EXPRESSION||LA32_0==FLOOR||LA32_0==FUNCTION||LA32_0==HOURS||LA32_0==IF||LA32_0==IRI||(LA32_0 >= ISBLANK && LA32_0 <= ISURI)||(LA32_0 >= LANG && LA32_0 <= LANGMATCHES)||LA32_0==LCASE||LA32_0==MD5||LA32_0==MINUTES||LA32_0==MONTH||LA32_0==NOT_EXISTS||LA32_0==NOW||LA32_0==RAND||(LA32_0 >= REGEX && LA32_0 <= REPLACE)||LA32_0==ROUND||LA32_0==SAMETERM||LA32_0==SECONDS||LA32_0==SHA1||(LA32_0 >= SHA256 && LA32_0 <= SHA512)||(LA32_0 >= STR && LA32_0 <= STRENDS)||(LA32_0 >= STRLANG && LA32_0 <= STRUUID)||LA32_0==SUBSTR||LA32_0==TIMEZONE||LA32_0==TZ||LA32_0==UCASE||LA32_0==URI||LA32_0==UUID||LA32_0==VAR||LA32_0==YEAR) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:290:20: oc= orderCondition
            	    {
            	    pushFollow(FOLLOW_orderCondition_in_orderClause1908);
            	    oc=orderCondition();

            	    state._fsp--;
            	    if (state.failed) return loc;

            	    if ( state.backtracking==0 ) { loc.add(oc); }

            	    }
            	    break;

            	default :
            	    if ( cnt32 >= 1 ) break loop32;
            	    if (state.backtracking>0) {state.failed=true; return loc;}
                        EarlyExitException eee =
                            new EarlyExitException(32, input);
                        throw eee;
                }
                cnt32++;
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
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:293:1: orderCondition returns [OrderCondition oc] : ( ( ^( ASC e1= brackettedExpression ) ) | ( ^( DESC e2= brackettedExpression ) ) | (c= constraint |v= var ) );
    public final OrderCondition orderCondition() throws RecognitionException {
        OrderCondition oc = null;


        Expression e1 =null;

        Expression e2 =null;

        Expression c =null;

        String v =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:294:2: ( ( ^( ASC e1= brackettedExpression ) ) | ( ^( DESC e2= brackettedExpression ) ) | (c= constraint |v= var ) )
            int alt34=3;
            switch ( input.LA(1) ) {
            case ASC:
                {
                alt34=1;
                }
                break;
            case DESC:
                {
                alt34=2;
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
                alt34=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return oc;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;

            }

            switch (alt34) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:294:5: ( ^( ASC e1= brackettedExpression ) )
                    {
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:294:5: ( ^( ASC e1= brackettedExpression ) )
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:294:6: ^( ASC e1= brackettedExpression )
                    {
                    match(input,ASC,FOLLOW_ASC_in_orderCondition1935); if (state.failed) return oc;

                    match(input, Token.DOWN, null); if (state.failed) return oc;
                    pushFollow(FOLLOW_brackettedExpression_in_orderCondition1939);
                    e1=brackettedExpression();

                    state._fsp--;
                    if (state.failed) return oc;

                    match(input, Token.UP, null); if (state.failed) return oc;


                    if ( state.backtracking==0 ) { oc = new OrderCondition(e1, OrderCondition.EOrderType.ASC); }

                    }


                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:295:4: ( ^( DESC e2= brackettedExpression ) )
                    {
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:295:4: ( ^( DESC e2= brackettedExpression ) )
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:295:5: ^( DESC e2= brackettedExpression )
                    {
                    match(input,DESC,FOLLOW_DESC_in_orderCondition1951); if (state.failed) return oc;

                    match(input, Token.DOWN, null); if (state.failed) return oc;
                    pushFollow(FOLLOW_brackettedExpression_in_orderCondition1955);
                    e2=brackettedExpression();

                    state._fsp--;
                    if (state.failed) return oc;

                    match(input, Token.UP, null); if (state.failed) return oc;


                    if ( state.backtracking==0 ) { oc = new OrderCondition(e2, OrderCondition.EOrderType.DESC);}

                    }


                    }
                    break;
                case 3 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:296:5: (c= constraint |v= var )
                    {
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:296:5: (c= constraint |v= var )
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==ABS||LA33_0==BNODE||LA33_0==BOUND||LA33_0==CEIL||LA33_0==COALESCE||LA33_0==CONCAT||LA33_0==CONTAINS||(LA33_0 >= DATATYPE && LA33_0 <= DAY)||LA33_0==ENCODE_FOR_URI||LA33_0==EXISTS||LA33_0==EXPRESSION||LA33_0==FLOOR||LA33_0==FUNCTION||LA33_0==HOURS||LA33_0==IF||LA33_0==IRI||(LA33_0 >= ISBLANK && LA33_0 <= ISURI)||(LA33_0 >= LANG && LA33_0 <= LANGMATCHES)||LA33_0==LCASE||LA33_0==MD5||LA33_0==MINUTES||LA33_0==MONTH||LA33_0==NOT_EXISTS||LA33_0==NOW||LA33_0==RAND||(LA33_0 >= REGEX && LA33_0 <= REPLACE)||LA33_0==ROUND||LA33_0==SAMETERM||LA33_0==SECONDS||LA33_0==SHA1||(LA33_0 >= SHA256 && LA33_0 <= SHA512)||(LA33_0 >= STR && LA33_0 <= STRENDS)||(LA33_0 >= STRLANG && LA33_0 <= STRUUID)||LA33_0==SUBSTR||LA33_0==TIMEZONE||LA33_0==TZ||LA33_0==UCASE||LA33_0==URI||LA33_0==UUID||LA33_0==YEAR) ) {
                        alt33=1;
                    }
                    else if ( (LA33_0==VAR) ) {
                        alt33=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return oc;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 33, 0, input);

                        throw nvae;

                    }
                    switch (alt33) {
                        case 1 :
                            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:296:7: c= constraint
                            {
                            pushFollow(FOLLOW_constraint_in_orderCondition1969);
                            c=constraint();

                            state._fsp--;
                            if (state.failed) return oc;

                            if ( state.backtracking==0 ) { oc = new OrderCondition(c); }

                            }
                            break;
                        case 2 :
                            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:297:5: v= var
                            {
                            pushFollow(FOLLOW_var_in_orderCondition1985);
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
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:301:1: limitOffsetClauses returns [LimitOffsetClauses loc] : (lc1= limitClause (oc1= offsetClause )? |oc2= offsetClause (lc2= limitClause )? ) ;
    public final LimitOffsetClauses limitOffsetClauses() throws RecognitionException {
        LimitOffsetClauses loc = null;


        int lc1 =0;

        int oc1 =0;

        int oc2 =0;

        int lc2 =0;


         
        		int lc = -1, oc = -1; 
        	
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:305:2: ( (lc1= limitClause (oc1= offsetClause )? |oc2= offsetClause (lc2= limitClause )? ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:305:6: (lc1= limitClause (oc1= offsetClause )? |oc2= offsetClause (lc2= limitClause )? )
            {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:305:6: (lc1= limitClause (oc1= offsetClause )? |oc2= offsetClause (lc2= limitClause )? )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==LIMIT) ) {
                alt37=1;
            }
            else if ( (LA37_0==OFFSET) ) {
                alt37=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return loc;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;

            }
            switch (alt37) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:305:8: lc1= limitClause (oc1= offsetClause )?
                    {
                    pushFollow(FOLLOW_limitClause_in_limitOffsetClauses2025);
                    lc1=limitClause();

                    state._fsp--;
                    if (state.failed) return loc;

                    if ( state.backtracking==0 ) {lc = lc1;}

                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:305:37: (oc1= offsetClause )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==OFFSET) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:305:38: oc1= offsetClause
                            {
                            pushFollow(FOLLOW_offsetClause_in_limitOffsetClauses2033);
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
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:306:5: oc2= offsetClause (lc2= limitClause )?
                    {
                    pushFollow(FOLLOW_offsetClause_in_limitOffsetClauses2046);
                    oc2=offsetClause();

                    state._fsp--;
                    if (state.failed) return loc;

                    if ( state.backtracking==0 ) {oc = oc2;}

                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:306:34: (lc2= limitClause )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==LIMIT) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:306:35: lc2= limitClause
                            {
                            pushFollow(FOLLOW_limitClause_in_limitOffsetClauses2053);
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
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:311:1: limitClause returns [int x] : ^( LIMIT i= INTEGER ) ;
    public final int limitClause() throws RecognitionException {
        int x = 0;


        XTree i=null;

        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:312:2: ( ^( LIMIT i= INTEGER ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:313:3: ^( LIMIT i= INTEGER )
            {
            match(input,LIMIT,FOLLOW_LIMIT_in_limitClause2091); if (state.failed) return x;

            match(input, Token.DOWN, null); if (state.failed) return x;
            i=(XTree)match(input,INTEGER,FOLLOW_INTEGER_in_limitClause2096); if (state.failed) return x;

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
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:316:1: offsetClause returns [int x] : ^( OFFSET i= INTEGER ) ;
    public final int offsetClause() throws RecognitionException {
        int x = 0;


        XTree i=null;

        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:317:2: ( ^( OFFSET i= INTEGER ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:318:3: ^( OFFSET i= INTEGER )
            {
            match(input,OFFSET,FOLLOW_OFFSET_in_offsetClause2123); if (state.failed) return x;

            match(input, Token.DOWN, null); if (state.failed) return x;
            i=(XTree)match(input,INTEGER,FOLLOW_INTEGER_in_offsetClause2128); if (state.failed) return x;

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
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:321:1: bindingsClause returns [Pattern v] : d= inlineData ;
    public final Pattern bindingsClause() throws RecognitionException {
        Pattern v = null;


        ValuesPattern d =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:322:2: (d= inlineData )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:322:6: d= inlineData
            {
            pushFollow(FOLLOW_inlineData_in_bindingsClause2152);
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
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:325:1: bindingValue : ( iRIref | rDFLiteral | numericLiteral | booleanLiteral | UNDEF ) ;
    public final void bindingValue() throws RecognitionException {
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:326:2: ( ( iRIref | rDFLiteral | numericLiteral | booleanLiteral | UNDEF ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:326:6: ( iRIref | rDFLiteral | numericLiteral | booleanLiteral | UNDEF )
            {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:326:6: ( iRIref | rDFLiteral | numericLiteral | booleanLiteral | UNDEF )
            int alt38=5;
            switch ( input.LA(1) ) {
            case IRI:
            case PREFIXED_NAME:
            case PREFIXED_NS:
                {
                alt38=1;
                }
                break;
            case STRING:
                {
                alt38=2;
                }
                break;
            case BIG_DECIMAL:
            case BIG_INTEGER:
            case DOUBLE:
                {
                alt38=3;
                }
                break;
            case BOOLEAN:
                {
                alt38=4;
                }
                break;
            case UNDEF:
                {
                alt38=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;

            }

            switch (alt38) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:326:8: iRIref
                    {
                    pushFollow(FOLLOW_iRIref_in_bindingValue2173);
                    iRIref();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:326:17: rDFLiteral
                    {
                    pushFollow(FOLLOW_rDFLiteral_in_bindingValue2177);
                    rDFLiteral();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:326:30: numericLiteral
                    {
                    pushFollow(FOLLOW_numericLiteral_in_bindingValue2181);
                    numericLiteral();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:326:47: booleanLiteral
                    {
                    pushFollow(FOLLOW_booleanLiteral_in_bindingValue2185);
                    booleanLiteral();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:326:64: UNDEF
                    {
                    match(input,UNDEF,FOLLOW_UNDEF_in_bindingValue2189); if (state.failed) return ;

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
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:329:1: triplesTemplate[ConstructQuery cq, PatternSet p] : sp= triplesSameSubject[$cq] ( DOT ( triplesTemplate[$cq, $p] )? )? ;
    public final void triplesTemplate(ConstructQuery cq, PatternSet p) throws RecognitionException {
        SimplePattern sp =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:330:2: (sp= triplesSameSubject[$cq] ( DOT ( triplesTemplate[$cq, $p] )? )? )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:330:7: sp= triplesSameSubject[$cq] ( DOT ( triplesTemplate[$cq, $p] )? )?
            {
            pushFollow(FOLLOW_triplesSameSubject_in_triplesTemplate2209);
            sp=triplesSameSubject(cq);

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) { p.addPattern(sp); }

            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:330:57: ( DOT ( triplesTemplate[$cq, $p] )? )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==DOT) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:330:59: DOT ( triplesTemplate[$cq, $p] )?
                    {
                    match(input,DOT,FOLLOW_DOT_in_triplesTemplate2216); if (state.failed) return ;

                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:330:63: ( triplesTemplate[$cq, $p] )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( ((LA39_0 >= TRIPLE && LA39_0 <= TRIPLE2)) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:330:63: triplesTemplate[$cq, $p]
                            {
                            pushFollow(FOLLOW_triplesTemplate_in_triplesTemplate2218);
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
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:333:1: groupGraphPattern[boolean l] returns [Pattern r] : ( ^( GROUP_GRAPH_PATTERN ( groupGraphPatternSub[p] )? ) |s= subSelect );
    public final Pattern groupGraphPattern(boolean l) throws RecognitionException {
        Pattern r = null;


        SubSelectPattern s =null;



        		PatternSet p = new PatternSet();  p.setTopLevel(l);
        		r = p;
        	
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:338:2: ( ^( GROUP_GRAPH_PATTERN ( groupGraphPatternSub[p] )? ) |s= subSelect )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==GROUP_GRAPH_PATTERN) ) {
                alt42=1;
            }
            else if ( (LA42_0==SUB_SELECT) ) {
                alt42=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return r;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;

            }
            switch (alt42) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:338:6: ^( GROUP_GRAPH_PATTERN ( groupGraphPatternSub[p] )? )
                    {
                    match(input,GROUP_GRAPH_PATTERN,FOLLOW_GROUP_GRAPH_PATTERN_in_groupGraphPattern2248); if (state.failed) return r;

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return r;
                        // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:338:28: ( groupGraphPatternSub[p] )?
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==BIND||LA41_0==FILTER||LA41_0==GRAPH||LA41_0==GROUP_GRAPH_PATTERN||LA41_0==MINUS||LA41_0==OPTIONAL||LA41_0==SERVICE||LA41_0==SUB_SELECT||LA41_0==TRIPLES_BLOCK||LA41_0==UNION||LA41_0==VALUES) ) {
                            alt41=1;
                        }
                        switch (alt41) {
                            case 1 :
                                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:338:28: groupGraphPatternSub[p]
                                {
                                pushFollow(FOLLOW_groupGraphPatternSub_in_groupGraphPattern2250);
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
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:339:4: s= subSelect
                    {
                    pushFollow(FOLLOW_subSelect_in_groupGraphPattern2262);
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
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:342:1: groupGraphPatternSub[PatternSet p] : (sp= triplesBlock[$p] |f= filter | graphPatternNewBGP[$p,blankNodes] )+ ;
    public final void groupGraphPatternSub(PatternSet p) throws RecognitionException {
        SimplePattern sp =null;

        Expression f =null;



              Set<BlankNodeVariable> blankNodes = HashSetFactory.make();  
            
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:346:2: ( (sp= triplesBlock[$p] |f= filter | graphPatternNewBGP[$p,blankNodes] )+ )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:346:4: (sp= triplesBlock[$p] |f= filter | graphPatternNewBGP[$p,blankNodes] )+
            {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:346:4: (sp= triplesBlock[$p] |f= filter | graphPatternNewBGP[$p,blankNodes] )+
            int cnt43=0;
            loop43:
            do {
                int alt43=4;
                switch ( input.LA(1) ) {
                case TRIPLES_BLOCK:
                    {
                    alt43=1;
                    }
                    break;
                case FILTER:
                    {
                    alt43=2;
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
                    alt43=3;
                    }
                    break;

                }

                switch (alt43) {
            	case 1 :
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:346:10: sp= triplesBlock[$p]
            	    {
            	    pushFollow(FOLLOW_triplesBlock_in_groupGraphPatternSub2294);
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
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:351:12: f= filter
            	    {
            	    pushFollow(FOLLOW_filter_in_groupGraphPatternSub2326);
            	    f=filter();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    if ( state.backtracking==0 ) { 
            	                    if (f != null) { p.addFilter(f); }
            	                  }

            	    }
            	    break;
            	case 3 :
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:355:15: graphPatternNewBGP[$p,blankNodes]
            	    {
            	    pushFollow(FOLLOW_graphPatternNewBGP_in_groupGraphPatternSub2364);
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
            	    if ( cnt43 >= 1 ) break loop43;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(43, input);
                        throw eee;
                }
                cnt43++;
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
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:367:1: triplesBlock[PatternSet p] returns [SimplePattern sp] : ^( TRIPLES_BLOCK (s= triples |s2= triples2 )+ ) ;
    public final SimplePattern triplesBlock(PatternSet p) throws RecognitionException {
        SimplePattern sp = null;


        QueryTriple s =null;

        QueryTriple2 s2 =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:368:5: ( ^( TRIPLES_BLOCK (s= triples |s2= triples2 )+ ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:368:9: ^( TRIPLES_BLOCK (s= triples |s2= triples2 )+ )
            {
            match(input,TRIPLES_BLOCK,FOLLOW_TRIPLES_BLOCK_in_triplesBlock2423); if (state.failed) return sp;

            if ( state.backtracking==0 ) { sp = new SimplePattern(); }

            match(input, Token.DOWN, null); if (state.failed) return sp;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:370:6: (s= triples |s2= triples2 )+
            int cnt44=0;
            loop44:
            do {
                int alt44=3;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==TRIPLE) ) {
                    alt44=1;
                }
                else if ( (LA44_0==TRIPLE2) ) {
                    alt44=2;
                }


                switch (alt44) {
            	case 1 :
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:371:10: s= triples
            	    {
            	    pushFollow(FOLLOW_triples_in_triplesBlock2456);
            	    s=triples();

            	    state._fsp--;
            	    if (state.failed) return sp;

            	    if ( state.backtracking==0 ) { s.expandAndAddTo(sp); }

            	    }
            	    break;
            	case 2 :
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:372:7: s2= triples2
            	    {
            	    pushFollow(FOLLOW_triples2_in_triplesBlock2472);
            	    s2=triples2();

            	    state._fsp--;
            	    if (state.failed) return sp;

            	    if ( state.backtracking==0 ) { s2.expandAndAddTo(sp); }

            	    }
            	    break;

            	default :
            	    if ( cnt44 >= 1 ) break loop44;
            	    if (state.backtracking>0) {state.failed=true; return sp;}
                        EarlyExitException eee =
                            new EarlyExitException(44, input);
                        throw eee;
                }
                cnt44++;
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
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:377:1: triples returns [QueryTriple qt] : ( ^( TRIPLE ^( SUBJECT (s1= graphNode ) ) ^( PREDICATE (v1= predicate ) ) ^( VALUE o= object ) ) ) ;
    public final QueryTriple triples() throws RecognitionException {
        QueryTriple qt = null;


        GraphNode s1 =null;

        BinaryUnion<Variable, Path> v1 =null;

        GraphNode o =null;


         
        			QueryTripleTerm s = null;
        			PropertyTerm p = null;
        			QueryTripleTerm v = null; 
        		  
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:383:2: ( ( ^( TRIPLE ^( SUBJECT (s1= graphNode ) ) ^( PREDICATE (v1= predicate ) ) ^( VALUE o= object ) ) ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:383:6: ( ^( TRIPLE ^( SUBJECT (s1= graphNode ) ) ^( PREDICATE (v1= predicate ) ) ^( VALUE o= object ) ) )
            {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:383:6: ( ^( TRIPLE ^( SUBJECT (s1= graphNode ) ) ^( PREDICATE (v1= predicate ) ) ^( VALUE o= object ) ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:383:8: ^( TRIPLE ^( SUBJECT (s1= graphNode ) ) ^( PREDICATE (v1= predicate ) ) ^( VALUE o= object ) )
            {
            match(input,TRIPLE,FOLLOW_TRIPLE_in_triples2520); if (state.failed) return qt;

            match(input, Token.DOWN, null); if (state.failed) return qt;
            match(input,SUBJECT,FOLLOW_SUBJECT_in_triples2523); if (state.failed) return qt;

            match(input, Token.DOWN, null); if (state.failed) return qt;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:383:27: (s1= graphNode )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:383:29: s1= graphNode
            {
            pushFollow(FOLLOW_graphNode_in_triples2529);
            s1=graphNode();

            state._fsp--;
            if (state.failed) return qt;

            if ( state.backtracking==0 ) { s = new QueryTripleTerm(s1);  }

            }


            match(input, Token.UP, null); if (state.failed) return qt;


            match(input,PREDICATE,FOLLOW_PREDICATE_in_triples2565); if (state.failed) return qt;

            match(input, Token.DOWN, null); if (state.failed) return qt;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:386:18: (v1= predicate )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:386:20: v1= predicate
            {
            pushFollow(FOLLOW_predicate_in_triples2571);
            v1=predicate();

            state._fsp--;
            if (state.failed) return qt;

            if ( state.backtracking==0 ) { p = new PropertyTerm(v1);  }

            }


            match(input, Token.UP, null); if (state.failed) return qt;


            match(input,VALUE,FOLLOW_VALUE_in_triples2611); if (state.failed) return qt;

            match(input, Token.DOWN, null); if (state.failed) return qt;
            pushFollow(FOLLOW_object_in_triples2616);
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
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:395:1: triples2 returns [QueryTriple2 qt] : ^( TRIPLE2 ^( SUBJECT (s= triplesNode ) ) ( ^( PROPERTY_LIST ^( PREDICATE (p= predicate ) ) ( ^( VALUE o= object ) )+ ) )* ) ;
    public final QueryTriple2 triples2() throws RecognitionException {
        QueryTriple2 qt = null;


        TriplesNode s =null;

        BinaryUnion<Variable, Path> p =null;

        GraphNode o =null;


         
        				PropertyListElement ple = null;
        		  
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:399:2: ( ^( TRIPLE2 ^( SUBJECT (s= triplesNode ) ) ( ^( PROPERTY_LIST ^( PREDICATE (p= predicate ) ) ( ^( VALUE o= object ) )+ ) )* ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:399:6: ^( TRIPLE2 ^( SUBJECT (s= triplesNode ) ) ( ^( PROPERTY_LIST ^( PREDICATE (p= predicate ) ) ( ^( VALUE o= object ) )+ ) )* )
            {
            match(input,TRIPLE2,FOLLOW_TRIPLE2_in_triples22671); if (state.failed) return qt;

            match(input, Token.DOWN, null); if (state.failed) return qt;
            match(input,SUBJECT,FOLLOW_SUBJECT_in_triples22674); if (state.failed) return qt;

            match(input, Token.DOWN, null); if (state.failed) return qt;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:399:26: (s= triplesNode )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:399:28: s= triplesNode
            {
            pushFollow(FOLLOW_triplesNode_in_triples22680);
            s=triplesNode();

            state._fsp--;
            if (state.failed) return qt;

            if ( state.backtracking==0 ) { qt = new QueryTriple2(s);  }

            }


            match(input, Token.UP, null); if (state.failed) return qt;


            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:402:6: ( ^( PROPERTY_LIST ^( PREDICATE (p= predicate ) ) ( ^( VALUE o= object ) )+ ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==PROPERTY_LIST) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:402:8: ^( PROPERTY_LIST ^( PREDICATE (p= predicate ) ) ( ^( VALUE o= object ) )+ )
            	    {
            	    match(input,PROPERTY_LIST,FOLLOW_PROPERTY_LIST_in_triples22718); if (state.failed) return qt;

            	    match(input, Token.DOWN, null); if (state.failed) return qt;
            	    match(input,PREDICATE,FOLLOW_PREDICATE_in_triples22730); if (state.failed) return qt;

            	    match(input, Token.DOWN, null); if (state.failed) return qt;
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:403:22: (p= predicate )
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:403:24: p= predicate
            	    {
            	    pushFollow(FOLLOW_predicate_in_triples22737);
            	    p=predicate();

            	    state._fsp--;
            	    if (state.failed) return qt;

            	    if ( state.backtracking==0 ) { ple = new PropertyListElement(p);  }

            	    }


            	    match(input, Token.UP, null); if (state.failed) return qt;


            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:406:9: ( ^( VALUE o= object ) )+
            	    int cnt45=0;
            	    loop45:
            	    do {
            	        int alt45=2;
            	        int LA45_0 = input.LA(1);

            	        if ( (LA45_0==VALUE) ) {
            	            alt45=1;
            	        }


            	        switch (alt45) {
            	    	case 1 :
            	    	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:406:11: ^( VALUE o= object )
            	    	    {
            	    	    match(input,VALUE,FOLLOW_VALUE_in_triples22787); if (state.failed) return qt;

            	    	    match(input, Token.DOWN, null); if (state.failed) return qt;
            	    	    pushFollow(FOLLOW_object_in_triples22792);
            	    	    o=object();

            	    	    state._fsp--;
            	    	    if (state.failed) return qt;

            	    	    match(input, Token.UP, null); if (state.failed) return qt;


            	    	    if ( state.backtracking==0 ) { ple.addObject(o); }

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt45 >= 1 ) break loop45;
            	    	    if (state.backtracking>0) {state.failed=true; return qt;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(45, input);
            	                throw eee;
            	        }
            	        cnt45++;
            	    } while (true);


            	    if ( state.backtracking==0 ) { qt.addPropertyListElement(ple); }

            	    match(input, Token.UP, null); if (state.failed) return qt;


            	    }
            	    break;

            	default :
            	    break loop46;
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
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:414:1: graphPatternNewBGP[PatternSet p, Set<BlankNodeVariable> vars] : (u= groupMinusOrUnionGraphPattern |o= optionalGraphPattern |g= graphGraphPattern |s= serviceGraphPattern |b= bind |v= inlineData );
    public final void graphPatternNewBGP(PatternSet p, Set<BlankNodeVariable> vars) throws RecognitionException {
        Pattern u =null;

        Pattern o =null;

        Pattern g =null;

        Pattern s =null;

        Pattern b =null;

        ValuesPattern v =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:415:5: (u= groupMinusOrUnionGraphPattern |o= optionalGraphPattern |g= graphGraphPattern |s= serviceGraphPattern |b= bind |v= inlineData )
            int alt47=6;
            switch ( input.LA(1) ) {
            case GROUP_GRAPH_PATTERN:
            case MINUS:
            case SUB_SELECT:
            case UNION:
                {
                alt47=1;
                }
                break;
            case OPTIONAL:
                {
                alt47=2;
                }
                break;
            case GRAPH:
                {
                alt47=3;
                }
                break;
            case SERVICE:
                {
                alt47=4;
                }
                break;
            case BIND:
                {
                alt47=5;
                }
                break;
            case VALUES:
                {
                alt47=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;

            }

            switch (alt47) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:415:9: u= groupMinusOrUnionGraphPattern
                    {
                    pushFollow(FOLLOW_groupMinusOrUnionGraphPattern_in_graphPatternNewBGP2852);
                    u=groupMinusOrUnionGraphPattern();

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) { p.addPattern(u); }

                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:417:5: o= optionalGraphPattern
                    {
                    pushFollow(FOLLOW_optionalGraphPattern_in_graphPatternNewBGP2872);
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
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:424:5: g= graphGraphPattern
                    {
                    pushFollow(FOLLOW_graphGraphPattern_in_graphPatternNewBGP2893);
                    g=graphGraphPattern();

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) { 
                                p.addPattern(g);
                            }

                    }
                    break;
                case 4 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:428:5: s= serviceGraphPattern
                    {
                    pushFollow(FOLLOW_serviceGraphPattern_in_graphPatternNewBGP2914);
                    s=serviceGraphPattern();

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) {
                    			p.addPattern(s);
                    		}

                    }
                    break;
                case 5 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:432:5: b= bind
                    {
                    pushFollow(FOLLOW_bind_in_graphPatternNewBGP2927);
                    b=bind();

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) {					
                    			p.addPattern(b);
                    	    }

                    }
                    break;
                case 6 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:436:9: v= inlineData
                    {
                    pushFollow(FOLLOW_inlineData_in_graphPatternNewBGP2947);
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
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:442:1: inlineData returns [ValuesPattern v] : ^( VALUES d= dataBlock ) ;
    public final ValuesPattern inlineData() throws RecognitionException {
        ValuesPattern v = null;


        Values d =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:443:5: ( ^( VALUES d= dataBlock ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:443:9: ^( VALUES d= dataBlock )
            {
            match(input,VALUES,FOLLOW_VALUES_in_inlineData2980); if (state.failed) return v;

            match(input, Token.DOWN, null); if (state.failed) return v;
            pushFollow(FOLLOW_dataBlock_in_inlineData2984);
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
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:446:1: dataBlock returns [Values values] : ^( INLINE_DATA ( ( NIL )=> NIL | (v= var )* ) ( ( NIL )=> NIL | (d= dataBlockValue )* ) ) ;
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:453:5: ( ^( INLINE_DATA ( ( NIL )=> NIL | (v= var )* ) ( ( NIL )=> NIL | (d= dataBlockValue )* ) ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:453:9: ^( INLINE_DATA ( ( NIL )=> NIL | (v= var )* ) ( ( NIL )=> NIL | (d= dataBlockValue )* ) )
            {
            match(input,INLINE_DATA,FOLLOW_INLINE_DATA_in_dataBlock3016); if (state.failed) return values;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return values;
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:453:23: ( ( NIL )=> NIL | (v= var )* )
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==NIL) ) {
                    int LA49_1 = input.LA(2);

                    if ( (synpred1_IbmSparqlAstWalker()) ) {
                        alt49=1;
                    }
                    else if ( (true) ) {
                        alt49=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return values;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 49, 1, input);

                        throw nvae;

                    }
                }
                else if ( (LA49_0==UP||(LA49_0 >= BIG_DECIMAL && LA49_0 <= BIG_INTEGER)||LA49_0==BOOLEAN||LA49_0==DOUBLE||LA49_0==IRI||(LA49_0 >= PREFIXED_NAME && LA49_0 <= PREFIXED_NS)||LA49_0==STRING||LA49_0==UNDEF||LA49_0==VAR) ) {
                    alt49=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return values;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 49, 0, input);

                    throw nvae;

                }
                switch (alt49) {
                    case 1 :
                        // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:453:25: ( NIL )=> NIL
                        {
                        match(input,NIL,FOLLOW_NIL_in_dataBlock3026); if (state.failed) return values;

                        }
                        break;
                    case 2 :
                        // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:453:40: (v= var )*
                        {
                        // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:453:40: (v= var )*
                        loop48:
                        do {
                            int alt48=2;
                            int LA48_0 = input.LA(1);

                            if ( (LA48_0==VAR) ) {
                                alt48=1;
                            }


                            switch (alt48) {
                        	case 1 :
                        	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:453:41: v= var
                        	    {
                        	    pushFollow(FOLLOW_var_in_dataBlock3033);
                        	    v=var();

                        	    state._fsp--;
                        	    if (state.failed) return values;

                        	    if ( state.backtracking==0 ) {vars.add(new Variable(v));}

                        	    }
                        	    break;

                        	default :
                        	    break loop48;
                            }
                        } while (true);


                        }
                        break;

                }


                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:453:79: ( ( NIL )=> NIL | (d= dataBlockValue )* )
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==NIL) && (synpred2_IbmSparqlAstWalker())) {
                    alt51=1;
                }
                else if ( (LA51_0==UP||(LA51_0 >= BIG_DECIMAL && LA51_0 <= BIG_INTEGER)||LA51_0==BOOLEAN||LA51_0==DOUBLE||LA51_0==IRI||(LA51_0 >= PREFIXED_NAME && LA51_0 <= PREFIXED_NS)||LA51_0==STRING||LA51_0==UNDEF) ) {
                    alt51=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return values;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 51, 0, input);

                    throw nvae;

                }
                switch (alt51) {
                    case 1 :
                        // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:453:81: ( NIL )=> NIL
                        {
                        match(input,NIL,FOLLOW_NIL_in_dataBlock3048); if (state.failed) return values;

                        }
                        break;
                    case 2 :
                        // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:453:96: (d= dataBlockValue )*
                        {
                        // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:453:96: (d= dataBlockValue )*
                        loop50:
                        do {
                            int alt50=2;
                            int LA50_0 = input.LA(1);

                            if ( ((LA50_0 >= BIG_DECIMAL && LA50_0 <= BIG_INTEGER)||LA50_0==BOOLEAN||LA50_0==DOUBLE||LA50_0==IRI||(LA50_0 >= PREFIXED_NAME && LA50_0 <= PREFIXED_NS)||LA50_0==STRING||LA50_0==UNDEF) ) {
                                alt50=1;
                            }


                            switch (alt50) {
                        	case 1 :
                        	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:453:97: d= dataBlockValue
                        	    {
                        	    pushFollow(FOLLOW_dataBlockValue_in_dataBlock3055);
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
                        	    break loop50;
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
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:464:1: dataBlockValue returns [Expression e] : (i= iRIref |r= rDFLiteral |d= numericLiteral |b= booleanLiteral |u= UNDEF );
    public final Expression dataBlockValue() throws RecognitionException {
        Expression e = null;


        XTree u=null;
        IRI i =null;

        StringLiteral r =null;

        Constant d =null;

        Boolean b =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:465:2: (i= iRIref |r= rDFLiteral |d= numericLiteral |b= booleanLiteral |u= UNDEF )
            int alt52=5;
            switch ( input.LA(1) ) {
            case IRI:
            case PREFIXED_NAME:
            case PREFIXED_NS:
                {
                alt52=1;
                }
                break;
            case STRING:
                {
                alt52=2;
                }
                break;
            case BIG_DECIMAL:
            case BIG_INTEGER:
            case DOUBLE:
                {
                alt52=3;
                }
                break;
            case BOOLEAN:
                {
                alt52=4;
                }
                break;
            case UNDEF:
                {
                alt52=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return e;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;

            }

            switch (alt52) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:465:7: i= iRIref
                    {
                    pushFollow(FOLLOW_iRIref_in_dataBlockValue3091);
                    i=iRIref();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) {e = new ConstantExpression(i);}

                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:466:7: r= rDFLiteral
                    {
                    pushFollow(FOLLOW_rDFLiteral_in_dataBlockValue3107);
                    r=rDFLiteral();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) {e = new ConstantExpression(r);}

                    }
                    break;
                case 3 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:467:7: d= numericLiteral
                    {
                    pushFollow(FOLLOW_numericLiteral_in_dataBlockValue3122);
                    d=numericLiteral();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) {e = new ConstantExpression(d);}

                    }
                    break;
                case 4 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:468:7: b= booleanLiteral
                    {
                    pushFollow(FOLLOW_booleanLiteral_in_dataBlockValue3137);
                    b=booleanLiteral();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) {e = new ConstantExpression(b);}

                    }
                    break;
                case 5 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:469:7: u= UNDEF
                    {
                    u=(XTree)match(input,UNDEF,FOLLOW_UNDEF_in_dataBlockValue3153); if (state.failed) return e;

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
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:472:1: optionalGraphPattern returns [Pattern p] : ^( OPTIONAL g= groupGraphPattern[false] ) ;
    public final Pattern optionalGraphPattern() throws RecognitionException {
        Pattern p = null;


        Pattern g =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:473:2: ( ^( OPTIONAL g= groupGraphPattern[false] ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:473:7: ^( OPTIONAL g= groupGraphPattern[false] )
            {
            match(input,OPTIONAL,FOLLOW_OPTIONAL_in_optionalGraphPattern3183); if (state.failed) return p;

            match(input, Token.DOWN, null); if (state.failed) return p;
            pushFollow(FOLLOW_groupGraphPattern_in_optionalGraphPattern3187);
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
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:476:1: graphGraphPattern returns [Pattern p] : ^( GRAPH r= varOrIRIref2 g= groupGraphPattern[false] ) ;
    public final Pattern graphGraphPattern() throws RecognitionException {
        Pattern p = null;


        BinaryUnion<Variable, IRI> r =null;

        Pattern g =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:477:2: ( ^( GRAPH r= varOrIRIref2 g= groupGraphPattern[false] ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:477:7: ^( GRAPH r= varOrIRIref2 g= groupGraphPattern[false] )
            {
            match(input,GRAPH,FOLLOW_GRAPH_in_graphGraphPattern3217); if (state.failed) return p;

            match(input, Token.DOWN, null); if (state.failed) return p;
            pushFollow(FOLLOW_varOrIRIref2_in_graphGraphPattern3221);
            r=varOrIRIref2();

            state._fsp--;
            if (state.failed) return p;

            pushFollow(FOLLOW_groupGraphPattern_in_graphGraphPattern3225);
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
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:480:1: serviceGraphPattern returns [Pattern p] : ^(top= SERVICE ( SILENT )? s= varOrIRIref g= groupGraphPattern[false] ) ;
    public final Pattern serviceGraphPattern() throws RecognitionException {
        Pattern p = null;


        XTree top=null;
        QueryTripleTerm s =null;

        Pattern g =null;


         boolean silent=false; 
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:482:2: ( ^(top= SERVICE ( SILENT )? s= varOrIRIref g= groupGraphPattern[false] ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:482:7: ^(top= SERVICE ( SILENT )? s= varOrIRIref g= groupGraphPattern[false] )
            {
            top=(XTree)match(input,SERVICE,FOLLOW_SERVICE_in_serviceGraphPattern3261); if (state.failed) return p;

            match(input, Token.DOWN, null); if (state.failed) return p;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:482:21: ( SILENT )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==SILENT) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:482:22: SILENT
                    {
                    match(input,SILENT,FOLLOW_SILENT_in_serviceGraphPattern3264); if (state.failed) return p;

                    if ( state.backtracking==0 ) { silent=true; }

                    }
                    break;

            }


            pushFollow(FOLLOW_varOrIRIref_in_serviceGraphPattern3272);
            s=varOrIRIref();

            state._fsp--;
            if (state.failed) return p;

            pushFollow(FOLLOW_groupGraphPattern_in_serviceGraphPattern3276);
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
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:488:1: bind returns [Pattern p] : ^( BIND v= var e= expression ) ;
    public final Pattern bind() throws RecognitionException {
        Pattern p = null;


        String v =null;

        Expression e =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:489:2: ( ^( BIND v= var e= expression ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:489:7: ^( BIND v= var e= expression )
            {
            match(input,BIND,FOLLOW_BIND_in_bind3309); if (state.failed) return p;

            match(input, Token.DOWN, null); if (state.failed) return p;
            pushFollow(FOLLOW_var_in_bind3313);
            v=var();

            state._fsp--;
            if (state.failed) return p;

            pushFollow(FOLLOW_expression_in_bind3319);
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
    // $ANTLR end "bind"



    // $ANTLR start "groupMinusOrUnionGraphPattern"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:492:1: groupMinusOrUnionGraphPattern returns [Pattern r] : ( ^( UNION g1= groupGraphPattern[false] (g2= groupGraphPattern[false] )+ ) | ^( MINUS g1= groupGraphPattern[false] ) |g3= groupGraphPattern[false] );
    public final Pattern groupMinusOrUnionGraphPattern() throws RecognitionException {
        Pattern r = null;


        Pattern g1 =null;

        Pattern g2 =null;

        Pattern g3 =null;



        	  PatternSet p = null;
        	
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:496:2: ( ^( UNION g1= groupGraphPattern[false] (g2= groupGraphPattern[false] )+ ) | ^( MINUS g1= groupGraphPattern[false] ) |g3= groupGraphPattern[false] )
            int alt55=3;
            switch ( input.LA(1) ) {
            case UNION:
                {
                alt55=1;
                }
                break;
            case MINUS:
                {
                alt55=2;
                }
                break;
            case GROUP_GRAPH_PATTERN:
            case SUB_SELECT:
                {
                alt55=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return r;}
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;

            }

            switch (alt55) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:496:6: ^( UNION g1= groupGraphPattern[false] (g2= groupGraphPattern[false] )+ )
                    {
                    match(input,UNION,FOLLOW_UNION_in_groupMinusOrUnionGraphPattern3351); if (state.failed) return r;

                    match(input, Token.DOWN, null); if (state.failed) return r;
                    pushFollow(FOLLOW_groupGraphPattern_in_groupMinusOrUnionGraphPattern3372);
                    g1=groupGraphPattern(false);

                    state._fsp--;
                    if (state.failed) return r;

                    if ( state.backtracking==0 ) { p = new PatternSet(PatternSet.EPatternSetType.UNION); 
                    			      r = p;
                                      p.addPattern(g1);	}

                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:501:5: (g2= groupGraphPattern[false] )+
                    int cnt54=0;
                    loop54:
                    do {
                        int alt54=2;
                        int LA54_0 = input.LA(1);

                        if ( (LA54_0==GROUP_GRAPH_PATTERN||LA54_0==SUB_SELECT) ) {
                            alt54=1;
                        }


                        switch (alt54) {
                    	case 1 :
                    	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:501:6: g2= groupGraphPattern[false]
                    	    {
                    	    pushFollow(FOLLOW_groupGraphPattern_in_groupMinusOrUnionGraphPattern3403);
                    	    g2=groupGraphPattern(false);

                    	    state._fsp--;
                    	    if (state.failed) return r;

                    	    if ( state.backtracking==0 ) { 
                    	                       p.addPattern(g2); 
                    	                     }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt54 >= 1 ) break loop54;
                    	    if (state.backtracking>0) {state.failed=true; return r;}
                                EarlyExitException eee =
                                    new EarlyExitException(54, input);
                                throw eee;
                        }
                        cnt54++;
                    } while (true);


                    match(input, Token.UP, null); if (state.failed) return r;


                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:505:9: ^( MINUS g1= groupGraphPattern[false] )
                    {
                    match(input,MINUS,FOLLOW_MINUS_in_groupMinusOrUnionGraphPattern3439); if (state.failed) return r;

                    match(input, Token.DOWN, null); if (state.failed) return r;
                    pushFollow(FOLLOW_groupGraphPattern_in_groupMinusOrUnionGraphPattern3454);
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
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:510:7: g3= groupGraphPattern[false]
                    {
                    pushFollow(FOLLOW_groupGraphPattern_in_groupMinusOrUnionGraphPattern3481);
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
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:516:1: filter returns [Expression e] : ^( FILTER c= constraint ) ;
    public final Expression filter() throws RecognitionException {
        Expression e = null;


        Expression c =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:517:2: ( ^( FILTER c= constraint ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:517:6: ^( FILTER c= constraint )
            {
            match(input,FILTER,FOLLOW_FILTER_in_filter3514); if (state.failed) return e;

            match(input, Token.DOWN, null); if (state.failed) return e;
            pushFollow(FOLLOW_constraint_in_filter3518);
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
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:520:1: constraint returns [Expression e] : (be= brackettedExpression |bc= builtInCall |fc= functionCall );
    public final Expression constraint() throws RecognitionException {
        Expression e = null;


        Expression be =null;

        Expression bc =null;

        FunctionCall fc =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:521:2: (be= brackettedExpression |bc= builtInCall |fc= functionCall )
            int alt56=3;
            switch ( input.LA(1) ) {
            case EXPRESSION:
                {
                alt56=1;
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
                alt56=2;
                }
                break;
            case FUNCTION:
                {
                alt56=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return e;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;

            }

            switch (alt56) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:521:6: be= brackettedExpression
                    {
                    pushFollow(FOLLOW_brackettedExpression_in_constraint3542);
                    be=brackettedExpression();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { e = be; }

                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:522:5: bc= builtInCall
                    {
                    pushFollow(FOLLOW_builtInCall_in_constraint3552);
                    bc=builtInCall();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { e = bc; }

                    }
                    break;
                case 3 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:523:5: fc= functionCall
                    {
                    pushFollow(FOLLOW_functionCall_in_constraint3565);
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
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:526:1: functionCall returns [FunctionCall fc] : ^( FUNCTION i= iRIref a= argList ) ;
    public final FunctionCall functionCall() throws RecognitionException {
        FunctionCall fc = null;


        IRI i =null;

        List<Expression> a =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:527:2: ( ^( FUNCTION i= iRIref a= argList ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:527:6: ^( FUNCTION i= iRIref a= argList )
            {
            match(input,FUNCTION,FOLLOW_FUNCTION_in_functionCall3587); if (state.failed) return fc;

            match(input, Token.DOWN, null); if (state.failed) return fc;
            pushFollow(FOLLOW_iRIref_in_functionCall3591);
            i=iRIref();

            state._fsp--;
            if (state.failed) return fc;

            pushFollow(FOLLOW_argList_in_functionCall3595);
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
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:530:1: argList returns [List<Expression> args] : ( NIL | DISTINCT (e1= expression )+ | (e2= expression )+ );
    public final List<Expression> argList() throws RecognitionException {
        List<Expression> args = null;


        Expression e1 =null;

        Expression e2 =null;


         args = new ArrayList<Expression>(); 
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:532:5: ( NIL | DISTINCT (e1= expression )+ | (e2= expression )+ )
            int alt59=3;
            switch ( input.LA(1) ) {
            case NIL:
                {
                alt59=1;
                }
                break;
            case DISTINCT:
                {
                alt59=2;
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
                alt59=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return args;}
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;

            }

            switch (alt59) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:532:9: NIL
                    {
                    match(input,NIL,FOLLOW_NIL_in_argList3624); if (state.failed) return args;

                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:533:6: DISTINCT (e1= expression )+
                    {
                    match(input,DISTINCT,FOLLOW_DISTINCT_in_argList3637); if (state.failed) return args;

                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:533:15: (e1= expression )+
                    int cnt57=0;
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==ABS||LA57_0==AVG||(LA57_0 >= BIG_DECIMAL && LA57_0 <= BIG_INTEGER)||(LA57_0 >= BNODE && LA57_0 <= BROKEN_PLUS)||LA57_0==CEIL||LA57_0==COALESCE||LA57_0==CONCAT||LA57_0==CONTAINS||LA57_0==COUNT||(LA57_0 >= DATATYPE && LA57_0 <= DAY)||LA57_0==DOUBLE||LA57_0==ENCODE_FOR_URI||LA57_0==EXISTS||LA57_0==EXPRESSION||LA57_0==FLOOR||LA57_0==FUNCTION||LA57_0==GROUP_CONCAT||LA57_0==HOURS||(LA57_0 >= IF && LA57_0 <= IN)||LA57_0==IRI||(LA57_0 >= ISBLANK && LA57_0 <= ISURI)||(LA57_0 >= LANG && LA57_0 <= LANGMATCHES)||LA57_0==LCASE||(LA57_0 >= LOGICAL_AND && LA57_0 <= LTE)||(LA57_0 >= MAX && LA57_0 <= MIN)||LA57_0==MINUTES||LA57_0==MONTH||(LA57_0 >= NOT && LA57_0 <= NOT_EXISTS)||LA57_0==NOW||(LA57_0 >= PREFIXED_NAME && LA57_0 <= PREFIXED_NS)||LA57_0==RAND||(LA57_0 >= REGEX && LA57_0 <= REPLACE)||LA57_0==ROUND||(LA57_0 >= SAMETERM && LA57_0 <= SECONDS)||LA57_0==SHA1||(LA57_0 >= SHA256 && LA57_0 <= SHA512)||(LA57_0 >= STR && LA57_0 <= STRING)||(LA57_0 >= STRLANG && LA57_0 <= STRUUID)||LA57_0==SUBSTR||LA57_0==SUM||LA57_0==TIMEZONE||LA57_0==TZ||LA57_0==UCASE||LA57_0==URI||LA57_0==UUID||LA57_0==VAR||LA57_0==YEAR||(LA57_0 >= 251 && LA57_0 <= 259)) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:533:16: e1= expression
                    	    {
                    	    pushFollow(FOLLOW_expression_in_argList3642);
                    	    e1=expression();

                    	    state._fsp--;
                    	    if (state.failed) return args;

                    	    if ( state.backtracking==0 ) { args.add(e1); }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt57 >= 1 ) break loop57;
                    	    if (state.backtracking>0) {state.failed=true; return args;}
                                EarlyExitException eee =
                                    new EarlyExitException(57, input);
                                throw eee;
                        }
                        cnt57++;
                    } while (true);


                    }
                    break;
                case 3 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:534:4: (e2= expression )+
                    {
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:534:4: (e2= expression )+
                    int cnt58=0;
                    loop58:
                    do {
                        int alt58=2;
                        int LA58_0 = input.LA(1);

                        if ( (LA58_0==ABS||LA58_0==AVG||(LA58_0 >= BIG_DECIMAL && LA58_0 <= BIG_INTEGER)||(LA58_0 >= BNODE && LA58_0 <= BROKEN_PLUS)||LA58_0==CEIL||LA58_0==COALESCE||LA58_0==CONCAT||LA58_0==CONTAINS||LA58_0==COUNT||(LA58_0 >= DATATYPE && LA58_0 <= DAY)||LA58_0==DOUBLE||LA58_0==ENCODE_FOR_URI||LA58_0==EXISTS||LA58_0==EXPRESSION||LA58_0==FLOOR||LA58_0==FUNCTION||LA58_0==GROUP_CONCAT||LA58_0==HOURS||(LA58_0 >= IF && LA58_0 <= IN)||LA58_0==IRI||(LA58_0 >= ISBLANK && LA58_0 <= ISURI)||(LA58_0 >= LANG && LA58_0 <= LANGMATCHES)||LA58_0==LCASE||(LA58_0 >= LOGICAL_AND && LA58_0 <= LTE)||(LA58_0 >= MAX && LA58_0 <= MIN)||LA58_0==MINUTES||LA58_0==MONTH||(LA58_0 >= NOT && LA58_0 <= NOT_EXISTS)||LA58_0==NOW||(LA58_0 >= PREFIXED_NAME && LA58_0 <= PREFIXED_NS)||LA58_0==RAND||(LA58_0 >= REGEX && LA58_0 <= REPLACE)||LA58_0==ROUND||(LA58_0 >= SAMETERM && LA58_0 <= SECONDS)||LA58_0==SHA1||(LA58_0 >= SHA256 && LA58_0 <= SHA512)||(LA58_0 >= STR && LA58_0 <= STRING)||(LA58_0 >= STRLANG && LA58_0 <= STRUUID)||LA58_0==SUBSTR||LA58_0==SUM||LA58_0==TIMEZONE||LA58_0==TZ||LA58_0==UCASE||LA58_0==URI||LA58_0==UUID||LA58_0==VAR||LA58_0==YEAR||(LA58_0 >= 251 && LA58_0 <= 259)) ) {
                            alt58=1;
                        }


                        switch (alt58) {
                    	case 1 :
                    	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:534:5: e2= expression
                    	    {
                    	    pushFollow(FOLLOW_expression_in_argList3655);
                    	    e2=expression();

                    	    state._fsp--;
                    	    if (state.failed) return args;

                    	    if ( state.backtracking==0 ) { args.add(e2); }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt58 >= 1 ) break loop58;
                    	    if (state.backtracking>0) {state.failed=true; return args;}
                                EarlyExitException eee =
                                    new EarlyExitException(58, input);
                                throw eee;
                        }
                        cnt58++;
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
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:537:1: expressionList returns [List<Expression> exprs] : ( NIL | (e= expression )+ );
    public final List<Expression> expressionList() throws RecognitionException {
        List<Expression> exprs = null;


        Expression e =null;


         exprs = new ArrayList<Expression>(); 
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:539:2: ( NIL | (e= expression )+ )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==NIL) ) {
                alt61=1;
            }
            else if ( (LA61_0==ABS||LA61_0==AVG||(LA61_0 >= BIG_DECIMAL && LA61_0 <= BIG_INTEGER)||(LA61_0 >= BNODE && LA61_0 <= BROKEN_PLUS)||LA61_0==CEIL||LA61_0==COALESCE||LA61_0==CONCAT||LA61_0==CONTAINS||LA61_0==COUNT||(LA61_0 >= DATATYPE && LA61_0 <= DAY)||LA61_0==DOUBLE||LA61_0==ENCODE_FOR_URI||LA61_0==EXISTS||LA61_0==EXPRESSION||LA61_0==FLOOR||LA61_0==FUNCTION||LA61_0==GROUP_CONCAT||LA61_0==HOURS||(LA61_0 >= IF && LA61_0 <= IN)||LA61_0==IRI||(LA61_0 >= ISBLANK && LA61_0 <= ISURI)||(LA61_0 >= LANG && LA61_0 <= LANGMATCHES)||LA61_0==LCASE||(LA61_0 >= LOGICAL_AND && LA61_0 <= LTE)||(LA61_0 >= MAX && LA61_0 <= MIN)||LA61_0==MINUTES||LA61_0==MONTH||(LA61_0 >= NOT && LA61_0 <= NOT_EXISTS)||LA61_0==NOW||(LA61_0 >= PREFIXED_NAME && LA61_0 <= PREFIXED_NS)||LA61_0==RAND||(LA61_0 >= REGEX && LA61_0 <= REPLACE)||LA61_0==ROUND||(LA61_0 >= SAMETERM && LA61_0 <= SECONDS)||LA61_0==SHA1||(LA61_0 >= SHA256 && LA61_0 <= SHA512)||(LA61_0 >= STR && LA61_0 <= STRING)||(LA61_0 >= STRLANG && LA61_0 <= STRUUID)||LA61_0==SUBSTR||LA61_0==SUM||LA61_0==TIMEZONE||LA61_0==TZ||LA61_0==UCASE||LA61_0==URI||LA61_0==UUID||LA61_0==VAR||LA61_0==YEAR||(LA61_0 >= 251 && LA61_0 <= 259)) ) {
                alt61=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return exprs;}
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;

            }
            switch (alt61) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:539:6: NIL
                    {
                    match(input,NIL,FOLLOW_NIL_in_expressionList3690); if (state.failed) return exprs;

                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:540:6: (e= expression )+
                    {
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:540:6: (e= expression )+
                    int cnt60=0;
                    loop60:
                    do {
                        int alt60=2;
                        int LA60_0 = input.LA(1);

                        if ( (LA60_0==ABS||LA60_0==AVG||(LA60_0 >= BIG_DECIMAL && LA60_0 <= BIG_INTEGER)||(LA60_0 >= BNODE && LA60_0 <= BROKEN_PLUS)||LA60_0==CEIL||LA60_0==COALESCE||LA60_0==CONCAT||LA60_0==CONTAINS||LA60_0==COUNT||(LA60_0 >= DATATYPE && LA60_0 <= DAY)||LA60_0==DOUBLE||LA60_0==ENCODE_FOR_URI||LA60_0==EXISTS||LA60_0==EXPRESSION||LA60_0==FLOOR||LA60_0==FUNCTION||LA60_0==GROUP_CONCAT||LA60_0==HOURS||(LA60_0 >= IF && LA60_0 <= IN)||LA60_0==IRI||(LA60_0 >= ISBLANK && LA60_0 <= ISURI)||(LA60_0 >= LANG && LA60_0 <= LANGMATCHES)||LA60_0==LCASE||(LA60_0 >= LOGICAL_AND && LA60_0 <= LTE)||(LA60_0 >= MAX && LA60_0 <= MIN)||LA60_0==MINUTES||LA60_0==MONTH||(LA60_0 >= NOT && LA60_0 <= NOT_EXISTS)||LA60_0==NOW||(LA60_0 >= PREFIXED_NAME && LA60_0 <= PREFIXED_NS)||LA60_0==RAND||(LA60_0 >= REGEX && LA60_0 <= REPLACE)||LA60_0==ROUND||(LA60_0 >= SAMETERM && LA60_0 <= SECONDS)||LA60_0==SHA1||(LA60_0 >= SHA256 && LA60_0 <= SHA512)||(LA60_0 >= STR && LA60_0 <= STRING)||(LA60_0 >= STRLANG && LA60_0 <= STRUUID)||LA60_0==SUBSTR||LA60_0==SUM||LA60_0==TIMEZONE||LA60_0==TZ||LA60_0==UCASE||LA60_0==URI||LA60_0==UUID||LA60_0==VAR||LA60_0==YEAR||(LA60_0 >= 251 && LA60_0 <= 259)) ) {
                            alt60=1;
                        }


                        switch (alt60) {
                    	case 1 :
                    	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:540:8: e= expression
                    	    {
                    	    pushFollow(FOLLOW_expression_in_expressionList3713);
                    	    e=expression();

                    	    state._fsp--;
                    	    if (state.failed) return exprs;

                    	    if ( state.backtracking==0 ) { exprs.add(e); }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt60 >= 1 ) break loop60;
                    	    if (state.backtracking>0) {state.failed=true; return exprs;}
                                EarlyExitException eee =
                                    new EarlyExitException(60, input);
                                throw eee;
                        }
                        cnt60++;
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
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:544:1: constructTemplate[ConstructQuery cq] : ( constructTriples[$cq] )? ;
    public final void constructTemplate(ConstructQuery cq) throws RecognitionException {
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:545:2: ( ( constructTriples[$cq] )? )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:545:6: ( constructTriples[$cq] )?
            {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:545:6: ( constructTriples[$cq] )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( ((LA62_0 >= TRIPLE && LA62_0 <= TRIPLE2)) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:545:6: constructTriples[$cq]
                    {
                    pushFollow(FOLLOW_constructTriples_in_constructTemplate3733);
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
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:548:1: constructTriples[ConstructQuery cq] : (t= triples |t2= triples2 )+ ;
    public final void constructTriples(ConstructQuery cq) throws RecognitionException {
        QueryTriple t =null;

        QueryTriple2 t2 =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:549:2: ( (t= triples |t2= triples2 )+ )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:549:6: (t= triples |t2= triples2 )+
            {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:549:6: (t= triples |t2= triples2 )+
            int cnt63=0;
            loop63:
            do {
                int alt63=3;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==TRIPLE) ) {
                    alt63=1;
                }
                else if ( (LA63_0==TRIPLE2) ) {
                    alt63=2;
                }


                switch (alt63) {
            	case 1 :
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:549:8: t= triples
            	    {
            	    pushFollow(FOLLOW_triples_in_constructTriples3754);
            	    t=triples();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    if ( state.backtracking==0 ) {cq.addConstructPattern(t);}

            	    }
            	    break;
            	case 2 :
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:550:5: t2= triples2
            	    {
            	    pushFollow(FOLLOW_triples2_in_constructTriples3765);
            	    t2=triples2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    if ( state.backtracking==0 ) {cq.addConstructPattern(t2);}

            	    }
            	    break;

            	default :
            	    if ( cnt63 >= 1 ) break loop63;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(63, input);
                        throw eee;
                }
                cnt63++;
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
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:554:1: triplesSameSubject[ConstructQuery cq] returns [SimplePattern sp] : ( (t1= triples )+ |t12= triples2 );
    public final SimplePattern triplesSameSubject(ConstructQuery cq) throws RecognitionException {
        SimplePattern sp = null;


        QueryTriple t1 =null;

        QueryTriple2 t12 =null;


         sp = new SimplePattern(); 
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:556:2: ( (t1= triples )+ |t12= triples2 )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==TRIPLE) ) {
                alt65=1;
            }
            else if ( (LA65_0==TRIPLE2) ) {
                alt65=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return sp;}
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;

            }
            switch (alt65) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:556:4: (t1= triples )+
                    {
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:556:4: (t1= triples )+
                    int cnt64=0;
                    loop64:
                    do {
                        int alt64=2;
                        int LA64_0 = input.LA(1);

                        if ( (LA64_0==TRIPLE) ) {
                            alt64=1;
                        }


                        switch (alt64) {
                    	case 1 :
                    	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:556:5: t1= triples
                    	    {
                    	    pushFollow(FOLLOW_triples_in_triplesSameSubject3802);
                    	    t1=triples();

                    	    state._fsp--;
                    	    if (state.failed) return sp;

                    	    if ( state.backtracking==0 ) { cq.addConstructPattern(t1); t1.expandAndAddTo(sp); }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt64 >= 1 ) break loop64;
                    	    if (state.backtracking>0) {state.failed=true; return sp;}
                                EarlyExitException eee =
                                    new EarlyExitException(64, input);
                                throw eee;
                        }
                        cnt64++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:557:4: t12= triples2
                    {
                    pushFollow(FOLLOW_triples2_in_triplesSameSubject3814);
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
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:560:1: object returns [GraphNode r] : g= graphNode ;
    public final GraphNode object() throws RecognitionException {
        GraphNode r = null;


        GraphNode g =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:561:2: (g= graphNode )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:561:6: g= graphNode
            {
            pushFollow(FOLLOW_graphNode_in_object3836);
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
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:564:1: verb returns [QueryTripleTerm t] : (v= varOrIRIref | 'a' );
    public final QueryTripleTerm verb() throws RecognitionException {
        QueryTripleTerm t = null;


        QueryTripleTerm v =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:565:2: (v= varOrIRIref | 'a' )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==IRI||(LA66_0 >= PREFIXED_NAME && LA66_0 <= PREFIXED_NS)||LA66_0==VAR) ) {
                alt66=1;
            }
            else if ( (LA66_0==263) ) {
                alt66=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return t;}
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;

            }
            switch (alt66) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:565:6: v= varOrIRIref
                    {
                    pushFollow(FOLLOW_varOrIRIref_in_verb3858);
                    v=varOrIRIref();

                    state._fsp--;
                    if (state.failed) return t;

                    if ( state.backtracking==0 ) { t = v; }

                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:566:5: 'a'
                    {
                    match(input,263,FOLLOW_263_in_verb3868); if (state.failed) return t;

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
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:569:1: verbPath : path ;
    public final void verbPath() throws RecognitionException {
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:570:2: ( path )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:570:6: path
            {
            pushFollow(FOLLOW_path_in_verbPath3886);
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
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:573:1: verbSimple returns [Variable v] : x= var ;
    public final Variable verbSimple() throws RecognitionException {
        Variable v = null;


        String x =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:574:2: (x= var )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:574:6: x= var
            {
            pushFollow(FOLLOW_var_in_verbSimple3905);
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
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:577:1: path : pathAlternative ;
    public final void path() throws RecognitionException {
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:578:2: ( pathAlternative )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:578:6: pathAlternative
            {
            pushFollow(FOLLOW_pathAlternative_in_path3922);
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
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:581:1: pathAlternative : pathSequence ( '|' pathSequence )* ;
    public final void pathAlternative() throws RecognitionException {
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:582:2: ( pathSequence ( '|' pathSequence )* )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:582:6: pathSequence ( '|' pathSequence )*
            {
            pushFollow(FOLLOW_pathSequence_in_pathAlternative3935);
            pathSequence();

            state._fsp--;
            if (state.failed) return ;

            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:582:19: ( '|' pathSequence )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==264) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:582:21: '|' pathSequence
            	    {
            	    match(input,264,FOLLOW_264_in_pathAlternative3939); if (state.failed) return ;

            	    pushFollow(FOLLOW_pathSequence_in_pathAlternative3941);
            	    pathSequence();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop67;
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
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:585:1: pathSequence : pathEltOrInverse ( '/' pathEltOrInverse )* ;
    public final void pathSequence() throws RecognitionException {
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:586:2: ( pathEltOrInverse ( '/' pathEltOrInverse )* )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:586:7: pathEltOrInverse ( '/' pathEltOrInverse )*
            {
            pushFollow(FOLLOW_pathEltOrInverse_in_pathSequence3958);
            pathEltOrInverse();

            state._fsp--;
            if (state.failed) return ;

            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:586:24: ( '/' pathEltOrInverse )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==256) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:586:26: '/' pathEltOrInverse
            	    {
            	    match(input,256,FOLLOW_256_in_pathSequence3962); if (state.failed) return ;

            	    pushFollow(FOLLOW_pathEltOrInverse_in_pathSequence3964);
            	    pathEltOrInverse();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop68;
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
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:589:1: pathElt : pathPrimary ( pathMod )? ;
    public final void pathElt() throws RecognitionException {
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:590:2: ( pathPrimary ( pathMod )? )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:590:7: pathPrimary ( pathMod )?
            {
            pushFollow(FOLLOW_pathPrimary_in_pathElt3981);
            pathPrimary();

            state._fsp--;
            if (state.failed) return ;

            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:590:19: ( pathMod )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( ((LA69_0 >= 253 && LA69_0 <= 254)||LA69_0==260) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:590:19: pathMod
                    {
                    pushFollow(FOLLOW_pathMod_in_pathElt3983);
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
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:593:1: pathEltOrInverse : ( pathElt | '^' pathElt );
    public final void pathEltOrInverse() throws RecognitionException {
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:594:2: ( pathElt | '^' pathElt )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==IRI||LA70_0==OPEN_BRACE||(LA70_0 >= PREFIXED_NAME && LA70_0 <= PREFIXED_NS)||LA70_0==251||LA70_0==263) ) {
                alt70=1;
            }
            else if ( (LA70_0==261) ) {
                alt70=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;

            }
            switch (alt70) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:594:7: pathElt
                    {
                    pushFollow(FOLLOW_pathElt_in_pathEltOrInverse3998);
                    pathElt();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:594:17: '^' pathElt
                    {
                    match(input,261,FOLLOW_261_in_pathEltOrInverse4002); if (state.failed) return ;

                    pushFollow(FOLLOW_pathElt_in_pathEltOrInverse4004);
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
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:597:1: pathMod returns [Path.PathMod v] : ( '*' | '?' | '+' );
    public final Path.PathMod pathMod() throws RecognitionException {
        Path.PathMod v = null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:598:2: ( '*' | '?' | '+' )
            int alt71=3;
            switch ( input.LA(1) ) {
            case 253:
                {
                alt71=1;
                }
                break;
            case 260:
                {
                alt71=2;
                }
                break;
            case 254:
                {
                alt71=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return v;}
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;

            }

            switch (alt71) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:598:4: '*'
                    {
                    match(input,253,FOLLOW_253_in_pathMod4019); if (state.failed) return v;

                    if ( state.backtracking==0 ) { v = Path.PathMod.ZERO_OR_MORE; }

                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:599:4: '?'
                    {
                    match(input,260,FOLLOW_260_in_pathMod4028); if (state.failed) return v;

                    if ( state.backtracking==0 ) { v = Path.PathMod.ZERO_OR_ONE; }

                    }
                    break;
                case 3 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:600:4: '+'
                    {
                    match(input,254,FOLLOW_254_in_pathMod4037); if (state.failed) return v;

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
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:603:1: pathPrimary : ( iRIref | 'a' | '!' pathNegatedPropertySet | OPEN_BRACE path CLOSE_BRACE );
    public final void pathPrimary() throws RecognitionException {
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:604:2: ( iRIref | 'a' | '!' pathNegatedPropertySet | OPEN_BRACE path CLOSE_BRACE )
            int alt72=4;
            switch ( input.LA(1) ) {
            case IRI:
            case PREFIXED_NAME:
            case PREFIXED_NS:
                {
                alt72=1;
                }
                break;
            case 263:
                {
                alt72=2;
                }
                break;
            case 251:
                {
                alt72=3;
                }
                break;
            case OPEN_BRACE:
                {
                alt72=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;

            }

            switch (alt72) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:604:7: iRIref
                    {
                    pushFollow(FOLLOW_iRIref_in_pathPrimary4055);
                    iRIref();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:604:16: 'a'
                    {
                    match(input,263,FOLLOW_263_in_pathPrimary4059); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:604:22: '!' pathNegatedPropertySet
                    {
                    match(input,251,FOLLOW_251_in_pathPrimary4063); if (state.failed) return ;

                    pushFollow(FOLLOW_pathNegatedPropertySet_in_pathPrimary4065);
                    pathNegatedPropertySet();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:604:51: OPEN_BRACE path CLOSE_BRACE
                    {
                    match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_pathPrimary4069); if (state.failed) return ;

                    pushFollow(FOLLOW_path_in_pathPrimary4071);
                    path();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_pathPrimary4073); if (state.failed) return ;

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
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:607:1: pathNegatedPropertySet returns [Pair<? extends List<IRI>, ? extends List<IRI>> pair] : (v= pathOneInPropertySet | OPEN_BRACE (v1= pathOneInPropertySet ( '|' v2= pathOneInPropertySet )* )? CLOSE_BRACE );
    public final Pair<? extends List<IRI>, ? extends List<IRI>> pathNegatedPropertySet() throws RecognitionException {
        Pair<? extends List<IRI>, ? extends List<IRI>> pair = null;


        Pair<IRI, Boolean> v =null;

        Pair<IRI, Boolean> v1 =null;

        Pair<IRI, Boolean> v2 =null;


         pair = Pair.make(new LinkedList<IRI>(), new LinkedList<IRI>()); 
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:609:2: (v= pathOneInPropertySet | OPEN_BRACE (v1= pathOneInPropertySet ( '|' v2= pathOneInPropertySet )* )? CLOSE_BRACE )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( ((LA75_0 >= INV && LA75_0 <= IRI)||(LA75_0 >= PREFIXED_NAME && LA75_0 <= PREFIXED_NS)||LA75_0==263) ) {
                alt75=1;
            }
            else if ( (LA75_0==OPEN_BRACE) ) {
                alt75=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return pair;}
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;

            }
            switch (alt75) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:609:7: v= pathOneInPropertySet
                    {
                    pushFollow(FOLLOW_pathOneInPropertySet_in_pathNegatedPropertySet4103);
                    v=pathOneInPropertySet();

                    state._fsp--;
                    if (state.failed) return pair;

                    if ( state.backtracking==0 ) { if (v.snd ) { pair.fst.add(v.fst); } else {pair.snd.add(v.fst);} }

                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:610:4: OPEN_BRACE (v1= pathOneInPropertySet ( '|' v2= pathOneInPropertySet )* )? CLOSE_BRACE
                    {
                    match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_pathNegatedPropertySet4111); if (state.failed) return pair;

                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:610:15: (v1= pathOneInPropertySet ( '|' v2= pathOneInPropertySet )* )?
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( ((LA74_0 >= INV && LA74_0 <= IRI)||(LA74_0 >= PREFIXED_NAME && LA74_0 <= PREFIXED_NS)||LA74_0==263) ) {
                        alt74=1;
                    }
                    switch (alt74) {
                        case 1 :
                            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:610:17: v1= pathOneInPropertySet ( '|' v2= pathOneInPropertySet )*
                            {
                            pushFollow(FOLLOW_pathOneInPropertySet_in_pathNegatedPropertySet4119);
                            v1=pathOneInPropertySet();

                            state._fsp--;
                            if (state.failed) return pair;

                            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:610:43: ( '|' v2= pathOneInPropertySet )*
                            loop73:
                            do {
                                int alt73=2;
                                int LA73_0 = input.LA(1);

                                if ( (LA73_0==264) ) {
                                    alt73=1;
                                }


                                switch (alt73) {
                            	case 1 :
                            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:610:45: '|' v2= pathOneInPropertySet
                            	    {
                            	    match(input,264,FOLLOW_264_in_pathNegatedPropertySet4123); if (state.failed) return pair;

                            	    pushFollow(FOLLOW_pathOneInPropertySet_in_pathNegatedPropertySet4129);
                            	    v2=pathOneInPropertySet();

                            	    state._fsp--;
                            	    if (state.failed) return pair;

                            	    if ( state.backtracking==0 ) { if (v2.snd ) { pair.fst.add(v2.fst); } else {pair.snd.add(v2.fst);} }

                            	    }
                            	    break;

                            	default :
                            	    break loop73;
                                }
                            } while (true);


                            }
                            break;

                    }


                    match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_pathNegatedPropertySet4140); if (state.failed) return pair;

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
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:614:1: pathOneInPropertySet returns [Pair<IRI, Boolean> v ] : (i= iRIref | 'a' | ^( INV invi= iRIrefOrRDFType ) );
    public final Pair<IRI, Boolean> pathOneInPropertySet() throws RecognitionException {
        Pair<IRI, Boolean> v = null;


        IRI i =null;

        IRI invi =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:615:4: (i= iRIref | 'a' | ^( INV invi= iRIrefOrRDFType ) )
            int alt76=3;
            switch ( input.LA(1) ) {
            case IRI:
            case PREFIXED_NAME:
            case PREFIXED_NS:
                {
                alt76=1;
                }
                break;
            case 263:
                {
                alt76=2;
                }
                break;
            case INV:
                {
                alt76=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return v;}
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;

            }

            switch (alt76) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:615:7: i= iRIref
                    {
                    pushFollow(FOLLOW_iRIref_in_pathOneInPropertySet4168);
                    i=iRIref();

                    state._fsp--;
                    if (state.failed) return v;

                    if ( state.backtracking==0 ) { v = Pair.make(i, true); }

                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:616:4: 'a'
                    {
                    match(input,263,FOLLOW_263_in_pathOneInPropertySet4175); if (state.failed) return v;

                    if ( state.backtracking==0 ) { v = Pair.make(new IRI("http://www.w3.org/1999/02/22-rdf-syntax-ns#type"), true); }

                    }
                    break;
                case 3 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:617:4: ^( INV invi= iRIrefOrRDFType )
                    {
                    match(input,INV,FOLLOW_INV_in_pathOneInPropertySet4184); if (state.failed) return v;

                    match(input, Token.DOWN, null); if (state.failed) return v;
                    pushFollow(FOLLOW_iRIrefOrRDFType_in_pathOneInPropertySet4190);
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
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:620:1: iRIrefOrRDFType returns [ IRI v ] : (i= iRIref | 'a' );
    public final IRI iRIrefOrRDFType() throws RecognitionException {
        IRI v = null;


        IRI i =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:621:4: (i= iRIref | 'a' )
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==IRI||(LA77_0 >= PREFIXED_NAME && LA77_0 <= PREFIXED_NS)) ) {
                alt77=1;
            }
            else if ( (LA77_0==263) ) {
                alt77=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return v;}
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;

            }
            switch (alt77) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:621:6: i= iRIref
                    {
                    pushFollow(FOLLOW_iRIref_in_iRIrefOrRDFType4217);
                    i=iRIref();

                    state._fsp--;
                    if (state.failed) return v;

                    if ( state.backtracking==0 ) { v = i;}

                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:622:6: 'a'
                    {
                    match(input,263,FOLLOW_263_in_iRIrefOrRDFType4226); if (state.failed) return v;

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
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:625:1: integer : INTEGER ;
    public final void integer() throws RecognitionException {
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:626:2: ( INTEGER )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:626:7: INTEGER
            {
            match(input,INTEGER,FOLLOW_INTEGER_in_integer4247); if (state.failed) return ;

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
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:629:1: triplesNode returns [TriplesNode tn] : ^( TRIPLES_NODE (c= collection |b= blankNodePropertyList ) ) ;
    public final TriplesNode triplesNode() throws RecognitionException {
        TriplesNode tn = null;


        RDFCollection c =null;

        PropertyList b =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:630:2: ( ^( TRIPLES_NODE (c= collection |b= blankNodePropertyList ) ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:630:6: ^( TRIPLES_NODE (c= collection |b= blankNodePropertyList ) )
            {
            match(input,TRIPLES_NODE,FOLLOW_TRIPLES_NODE_in_triplesNode4266); if (state.failed) return tn;

            match(input, Token.DOWN, null); if (state.failed) return tn;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:631:5: (c= collection |b= blankNodePropertyList )
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==COLLECTION) ) {
                alt78=1;
            }
            else if ( (LA78_0==PROPERTY_LIST) ) {
                alt78=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return tn;}
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;

            }
            switch (alt78) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:631:7: c= collection
                    {
                    pushFollow(FOLLOW_collection_in_triplesNode4277);
                    c=collection();

                    state._fsp--;
                    if (state.failed) return tn;

                    if ( state.backtracking==0 ) { tn = new TriplesNode(c);}

                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:632:8: b= blankNodePropertyList
                    {
                    pushFollow(FOLLOW_blankNodePropertyList_in_triplesNode4294);
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
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:637:1: blankNodePropertyList returns [PropertyList pl] : ^( PROPERTY_LIST ( ^( PREDICATE v= predicate ) ^( VALUE (o= graphNode )+ ) )+ ) ;
    public final PropertyList blankNodePropertyList() throws RecognitionException {
        PropertyList pl = null;


        BinaryUnion<Variable, Path> v =null;

        GraphNode o =null;



        			pl = new PropertyList(); 
        			PropertyListElement e = null;
        		
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:642:2: ( ^( PROPERTY_LIST ( ^( PREDICATE v= predicate ) ^( VALUE (o= graphNode )+ ) )+ ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:642:4: ^( PROPERTY_LIST ( ^( PREDICATE v= predicate ) ^( VALUE (o= graphNode )+ ) )+ )
            {
            match(input,PROPERTY_LIST,FOLLOW_PROPERTY_LIST_in_blankNodePropertyList4333); if (state.failed) return pl;

            match(input, Token.DOWN, null); if (state.failed) return pl;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:643:6: ( ^( PREDICATE v= predicate ) ^( VALUE (o= graphNode )+ ) )+
            int cnt80=0;
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);

                if ( (LA80_0==PREDICATE) ) {
                    alt80=1;
                }


                switch (alt80) {
            	case 1 :
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:643:8: ^( PREDICATE v= predicate ) ^( VALUE (o= graphNode )+ )
            	    {
            	    if ( state.backtracking==0 ) { e = new PropertyListElement(); }

            	    match(input,PREDICATE,FOLLOW_PREDICATE_in_blankNodePropertyList4354); if (state.failed) return pl;

            	    match(input, Token.DOWN, null); if (state.failed) return pl;
            	    pushFollow(FOLLOW_predicate_in_blankNodePropertyList4358);
            	    v=predicate();

            	    state._fsp--;
            	    if (state.failed) return pl;

            	    match(input, Token.UP, null); if (state.failed) return pl;


            	    if ( state.backtracking==0 ) {e.setVerb(v);}

            	    match(input,VALUE,FOLLOW_VALUE_in_blankNodePropertyList4373); if (state.failed) return pl;

            	    match(input, Token.DOWN, null); if (state.failed) return pl;
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:645:17: (o= graphNode )+
            	    int cnt79=0;
            	    loop79:
            	    do {
            	        int alt79=2;
            	        int LA79_0 = input.LA(1);

            	        if ( (LA79_0==ANNON||(LA79_0 >= BIG_DECIMAL && LA79_0 <= BIG_INTEGER)||LA79_0==BLANK_NODE_LABEL||LA79_0==BOOLEAN||LA79_0==DOUBLE||LA79_0==IRI||LA79_0==NIL||(LA79_0 >= PREFIXED_NAME && LA79_0 <= PREFIXED_NS)||LA79_0==STRING||LA79_0==TRIPLES_NODE||LA79_0==VAR) ) {
            	            alt79=1;
            	        }


            	        switch (alt79) {
            	    	case 1 :
            	    	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:645:18: o= graphNode
            	    	    {
            	    	    pushFollow(FOLLOW_graphNode_in_blankNodePropertyList4378);
            	    	    o=graphNode();

            	    	    state._fsp--;
            	    	    if (state.failed) return pl;

            	    	    if ( state.backtracking==0 ) {e.addObject(o);}

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt79 >= 1 ) break loop79;
            	    	    if (state.backtracking>0) {state.failed=true; return pl;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(79, input);
            	                throw eee;
            	        }
            	        cnt79++;
            	    } while (true);


            	    match(input, Token.UP, null); if (state.failed) return pl;


            	    if ( state.backtracking==0 ) { pl.add(e); }

            	    }
            	    break;

            	default :
            	    if ( cnt80 >= 1 ) break loop80;
            	    if (state.backtracking>0) {state.failed=true; return pl;}
                        EarlyExitException eee =
                            new EarlyExitException(80, input);
                        throw eee;
                }
                cnt80++;
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
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:651:1: predicate returns [BinaryUnion<Variable, Path> p] : (v= var |i= iRIref | 'a' | ^( ALT (alt= predicate )* ) | ^( SEQ (seq= predicate )* ) | ^( ELT pred= predicate mod= pathMod ) | ^( INV pred= predicate ) | '!' neg= pathNegatedPropertySet );
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:653:2: (v= var |i= iRIref | 'a' | ^( ALT (alt= predicate )* ) | ^( SEQ (seq= predicate )* ) | ^( ELT pred= predicate mod= pathMod ) | ^( INV pred= predicate ) | '!' neg= pathNegatedPropertySet )
            int alt83=8;
            switch ( input.LA(1) ) {
            case VAR:
                {
                alt83=1;
                }
                break;
            case IRI:
            case PREFIXED_NAME:
            case PREFIXED_NS:
                {
                alt83=2;
                }
                break;
            case 263:
                {
                alt83=3;
                }
                break;
            case ALT:
                {
                alt83=4;
                }
                break;
            case SEQ:
                {
                alt83=5;
                }
                break;
            case ELT:
                {
                alt83=6;
                }
                break;
            case INV:
                {
                alt83=7;
                }
                break;
            case 251:
                {
                alt83=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return p;}
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;

            }

            switch (alt83) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:653:4: v= var
                    {
                    pushFollow(FOLLOW_var_in_predicate4434);
                    v=var();

                    state._fsp--;
                    if (state.failed) return p;

                    if ( state.backtracking==0 ) { p.setFirst(new Variable(v));  }

                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:654:4: i= iRIref
                    {
                    pushFollow(FOLLOW_iRIref_in_predicate4449);
                    i=iRIref();

                    state._fsp--;
                    if (state.failed) return p;

                    if ( state.backtracking==0 ) { p.setSecond(new SimplePath(i)); }

                    }
                    break;
                case 3 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:655:5: 'a'
                    {
                    match(input,263,FOLLOW_263_in_predicate4460); if (state.failed) return p;

                    if ( state.backtracking==0 ) { p.setSecond(new SimplePath(new IRI("http://www.w3.org/1999/02/22-rdf-syntax-ns#type"))); }

                    }
                    break;
                case 4 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:656:9: ^( ALT (alt= predicate )* )
                    {
                    match(input,ALT,FOLLOW_ALT_in_predicate4475); if (state.failed) return p;

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return p;
                        // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:656:15: (alt= predicate )*
                        loop81:
                        do {
                            int alt81=2;
                            int LA81_0 = input.LA(1);

                            if ( (LA81_0==ALT||LA81_0==ELT||(LA81_0 >= INV && LA81_0 <= IRI)||(LA81_0 >= PREFIXED_NAME && LA81_0 <= PREFIXED_NS)||LA81_0==SEQ||LA81_0==VAR||LA81_0==251||LA81_0==263) ) {
                                alt81=1;
                            }


                            switch (alt81) {
                        	case 1 :
                        	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:656:16: alt= predicate
                        	    {
                        	    pushFollow(FOLLOW_predicate_in_predicate4480);
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
                        	    break loop81;
                            }
                        } while (true);


                        match(input, Token.UP, null); if (state.failed) return p;
                    }


                    }
                    break;
                case 5 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:664:9: ^( SEQ (seq= predicate )* )
                    {
                    match(input,SEQ,FOLLOW_SEQ_in_predicate4496); if (state.failed) return p;

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return p;
                        // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:664:15: (seq= predicate )*
                        loop82:
                        do {
                            int alt82=2;
                            int LA82_0 = input.LA(1);

                            if ( (LA82_0==ALT||LA82_0==ELT||(LA82_0 >= INV && LA82_0 <= IRI)||(LA82_0 >= PREFIXED_NAME && LA82_0 <= PREFIXED_NS)||LA82_0==SEQ||LA82_0==VAR||LA82_0==251||LA82_0==263) ) {
                                alt82=1;
                            }


                            switch (alt82) {
                        	case 1 :
                        	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:664:16: seq= predicate
                        	    {
                        	    pushFollow(FOLLOW_predicate_in_predicate4501);
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
                        	    break loop82;
                            }
                        } while (true);


                        match(input, Token.UP, null); if (state.failed) return p;
                    }


                    }
                    break;
                case 6 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:672:9: ^( ELT pred= predicate mod= pathMod )
                    {
                    match(input,ELT,FOLLOW_ELT_in_predicate4517); if (state.failed) return p;

                    match(input, Token.DOWN, null); if (state.failed) return p;
                    pushFollow(FOLLOW_predicate_in_predicate4521);
                    pred=predicate();

                    state._fsp--;
                    if (state.failed) return p;

                    pushFollow(FOLLOW_pathMod_in_predicate4527);
                    mod=pathMod();

                    state._fsp--;
                    if (state.failed) return p;

                    match(input, Token.UP, null); if (state.failed) return p;


                    if ( state.backtracking==0 ) { p.setSecond(Path.createPath(pred.getSecond(), mod)) ; }

                    }
                    break;
                case 7 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:673:9: ^( INV pred= predicate )
                    {
                    match(input,INV,FOLLOW_INV_in_predicate4542); if (state.failed) return p;

                    match(input, Token.DOWN, null); if (state.failed) return p;
                    pushFollow(FOLLOW_predicate_in_predicate4546);
                    pred=predicate();

                    state._fsp--;
                    if (state.failed) return p;

                    match(input, Token.UP, null); if (state.failed) return p;


                    if ( state.backtracking==0 ) { p.setSecond(new InvPath(pred.getSecond())) ; }

                    }
                    break;
                case 8 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:674:7: '!' neg= pathNegatedPropertySet
                    {
                    match(input,251,FOLLOW_251_in_predicate4557); if (state.failed) return p;

                    pushFollow(FOLLOW_pathNegatedPropertySet_in_predicate4563);
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
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:677:1: collection returns [RDFCollection c] : ^( COLLECTION (g= graphNode )+ ) ;
    public final RDFCollection collection() throws RecognitionException {
        RDFCollection c = null;


        GraphNode g =null;


         c = new RDFCollection(); 
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:679:2: ( ^( COLLECTION (g= graphNode )+ ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:679:7: ^( COLLECTION (g= graphNode )+ )
            {
            match(input,COLLECTION,FOLLOW_COLLECTION_in_collection4591); if (state.failed) return c;

            match(input, Token.DOWN, null); if (state.failed) return c;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:679:21: (g= graphNode )+
            int cnt84=0;
            loop84:
            do {
                int alt84=2;
                int LA84_0 = input.LA(1);

                if ( (LA84_0==ANNON||(LA84_0 >= BIG_DECIMAL && LA84_0 <= BIG_INTEGER)||LA84_0==BLANK_NODE_LABEL||LA84_0==BOOLEAN||LA84_0==DOUBLE||LA84_0==IRI||LA84_0==NIL||(LA84_0 >= PREFIXED_NAME && LA84_0 <= PREFIXED_NS)||LA84_0==STRING||LA84_0==TRIPLES_NODE||LA84_0==VAR) ) {
                    alt84=1;
                }


                switch (alt84) {
            	case 1 :
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:679:22: g= graphNode
            	    {
            	    pushFollow(FOLLOW_graphNode_in_collection4596);
            	    g=graphNode();

            	    state._fsp--;
            	    if (state.failed) return c;

            	    if ( state.backtracking==0 ) { c.add(g); }

            	    }
            	    break;

            	default :
            	    if ( cnt84 >= 1 ) break loop84;
            	    if (state.backtracking>0) {state.failed=true; return c;}
                        EarlyExitException eee =
                            new EarlyExitException(84, input);
                        throw eee;
                }
                cnt84++;
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
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:682:1: graphNode returns [GraphNode gn] : (v= var |g= graphTerm |t= triplesNode );
    public final GraphNode graphNode() throws RecognitionException {
        GraphNode gn = null;


        String v =null;

        GraphTerm g =null;

        TriplesNode t =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:683:2: (v= var |g= graphTerm |t= triplesNode )
            int alt85=3;
            switch ( input.LA(1) ) {
            case VAR:
                {
                alt85=1;
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
                alt85=2;
                }
                break;
            case TRIPLES_NODE:
                {
                alt85=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return gn;}
                NoViableAltException nvae =
                    new NoViableAltException("", 85, 0, input);

                throw nvae;

            }

            switch (alt85) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:683:6: v= var
                    {
                    pushFollow(FOLLOW_var_in_graphNode4622);
                    v=var();

                    state._fsp--;
                    if (state.failed) return gn;

                    if ( state.backtracking==0 ) { gn = new GraphNode(new Variable(v));			}

                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:684:5: g= graphTerm
                    {
                    pushFollow(FOLLOW_graphTerm_in_graphNode4635);
                    g=graphTerm();

                    state._fsp--;
                    if (state.failed) return gn;

                    if ( state.backtracking==0 ) { gn = new GraphNode(g);						}

                    }
                    break;
                case 3 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:685:5: t= triplesNode
                    {
                    pushFollow(FOLLOW_triplesNode_in_graphNode4647);
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
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:688:1: varOrTerm returns [QueryTripleTerm qt] : (v= var |g= graphTerm );
    public final QueryTripleTerm varOrTerm() throws RecognitionException {
        QueryTripleTerm qt = null;


        String v =null;

        GraphTerm g =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:689:2: (v= var |g= graphTerm )
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==VAR) ) {
                alt86=1;
            }
            else if ( (LA86_0==ANNON||(LA86_0 >= BIG_DECIMAL && LA86_0 <= BIG_INTEGER)||LA86_0==BLANK_NODE_LABEL||LA86_0==BOOLEAN||LA86_0==DOUBLE||LA86_0==IRI||LA86_0==NIL||(LA86_0 >= PREFIXED_NAME && LA86_0 <= PREFIXED_NS)||LA86_0==STRING) ) {
                alt86=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return qt;}
                NoViableAltException nvae =
                    new NoViableAltException("", 86, 0, input);

                throw nvae;

            }
            switch (alt86) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:689:7: v= var
                    {
                    pushFollow(FOLLOW_var_in_varOrTerm4670);
                    v=var();

                    state._fsp--;
                    if (state.failed) return qt;

                    if ( state.backtracking==0 ) { qt = new QueryTripleTerm(new Variable(v)); 	}

                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:690:6: g= graphTerm
                    {
                    pushFollow(FOLLOW_graphTerm_in_varOrTerm4685);
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
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:693:1: varOrIRIref returns [QueryTripleTerm qt] : (v= var |i= iRIref );
    public final QueryTripleTerm varOrIRIref() throws RecognitionException {
        QueryTripleTerm qt = null;


        String v =null;

        IRI i =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:694:2: (v= var |i= iRIref )
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==VAR) ) {
                alt87=1;
            }
            else if ( (LA87_0==IRI||(LA87_0 >= PREFIXED_NAME && LA87_0 <= PREFIXED_NS)) ) {
                alt87=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return qt;}
                NoViableAltException nvae =
                    new NoViableAltException("", 87, 0, input);

                throw nvae;

            }
            switch (alt87) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:694:6: v= var
                    {
                    pushFollow(FOLLOW_var_in_varOrIRIref4707);
                    v=var();

                    state._fsp--;
                    if (state.failed) return qt;

                    if ( state.backtracking==0 ) { qt = new QueryTripleTerm(new Variable(v)); 	}

                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:695:5: i= iRIref
                    {
                    pushFollow(FOLLOW_iRIref_in_varOrIRIref4722);
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
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:698:1: varOrIRIref2 returns [BinaryUnion<Variable, IRI> bu] : (v= var |i= iRIref );
    public final BinaryUnion<Variable, IRI> varOrIRIref2() throws RecognitionException {
        BinaryUnion<Variable, IRI> bu = null;


        String v =null;

        IRI i =null;


         bu = new BinaryUnion<Variable, IRI>(); 
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:700:5: (v= var |i= iRIref )
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==VAR) ) {
                alt88=1;
            }
            else if ( (LA88_0==IRI||(LA88_0 >= PREFIXED_NAME && LA88_0 <= PREFIXED_NS)) ) {
                alt88=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return bu;}
                NoViableAltException nvae =
                    new NoViableAltException("", 88, 0, input);

                throw nvae;

            }
            switch (alt88) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:700:8: v= var
                    {
                    pushFollow(FOLLOW_var_in_varOrIRIref24757);
                    v=var();

                    state._fsp--;
                    if (state.failed) return bu;

                    if ( state.backtracking==0 ) { bu.setFirst(new Variable(v)); }

                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:701:8: i= iRIref
                    {
                    pushFollow(FOLLOW_iRIref_in_varOrIRIref24773);
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
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:704:1: var returns [String v] : ^( VAR (x1= VAR1 |x2= VAR2 ) ) ;
    public final String var() throws RecognitionException {
        String v = null;


        XTree x1=null;
        XTree x2=null;

        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:705:2: ( ^( VAR (x1= VAR1 |x2= VAR2 ) ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:705:6: ^( VAR (x1= VAR1 |x2= VAR2 ) )
            {
            match(input,VAR,FOLLOW_VAR_in_var4800); if (state.failed) return v;

            match(input, Token.DOWN, null); if (state.failed) return v;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:705:13: (x1= VAR1 |x2= VAR2 )
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==VAR1) ) {
                alt89=1;
            }
            else if ( (LA89_0==VAR2) ) {
                alt89=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return v;}
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 0, input);

                throw nvae;

            }
            switch (alt89) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:705:15: x1= VAR1
                    {
                    x1=(XTree)match(input,VAR1,FOLLOW_VAR1_in_var4807); if (state.failed) return v;

                    if ( state.backtracking==0 ) { v = new String(x1.getText().substring(1)); }

                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:706:7: x2= VAR2
                    {
                    x2=(XTree)match(input,VAR2,FOLLOW_VAR2_in_var4822); if (state.failed) return v;

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
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:711:1: graphTerm returns [GraphTerm gt] : (i= iRIref |r= rDFLiteral |d= numericLiteral |b= booleanLiteral |l= blankNode | NIL );
    public final GraphTerm graphTerm() throws RecognitionException {
        GraphTerm gt = null;


        IRI i =null;

        StringLiteral r =null;

        Constant d =null;

        Boolean b =null;

        BlankNode l =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:712:2: (i= iRIref |r= rDFLiteral |d= numericLiteral |b= booleanLiteral |l= blankNode | NIL )
            int alt90=6;
            switch ( input.LA(1) ) {
            case IRI:
            case PREFIXED_NAME:
            case PREFIXED_NS:
                {
                alt90=1;
                }
                break;
            case STRING:
                {
                alt90=2;
                }
                break;
            case BIG_DECIMAL:
            case BIG_INTEGER:
            case DOUBLE:
                {
                alt90=3;
                }
                break;
            case BOOLEAN:
                {
                alt90=4;
                }
                break;
            case ANNON:
            case BLANK_NODE_LABEL:
                {
                alt90=5;
                }
                break;
            case NIL:
                {
                alt90=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return gt;}
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                throw nvae;

            }

            switch (alt90) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:712:6: i= iRIref
                    {
                    pushFollow(FOLLOW_iRIref_in_graphTerm4856);
                    i=iRIref();

                    state._fsp--;
                    if (state.failed) return gt;

                    if ( state.backtracking==0 ) { gt = new GraphTerm(i); }

                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:713:5: r= rDFLiteral
                    {
                    pushFollow(FOLLOW_rDFLiteral_in_graphTerm4870);
                    r=rDFLiteral();

                    state._fsp--;
                    if (state.failed) return gt;

                    if ( state.backtracking==0 ) { gt = new GraphTerm(new Constant(r)); }

                    }
                    break;
                case 3 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:714:4: d= numericLiteral
                    {
                    pushFollow(FOLLOW_numericLiteral_in_graphTerm4882);
                    d=numericLiteral();

                    state._fsp--;
                    if (state.failed) return gt;

                    if ( state.backtracking==0 ) { gt = new GraphTerm(d); 				}

                    }
                    break;
                case 4 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:715:5: b= booleanLiteral
                    {
                    pushFollow(FOLLOW_booleanLiteral_in_graphTerm4895);
                    b=booleanLiteral();

                    state._fsp--;
                    if (state.failed) return gt;

                    if ( state.backtracking==0 ) { gt = new GraphTerm(new Constant(b)); }

                    }
                    break;
                case 5 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:716:5: l= blankNode
                    {
                    pushFollow(FOLLOW_blankNode_in_graphTerm4908);
                    l=blankNode();

                    state._fsp--;
                    if (state.failed) return gt;

                    if ( state.backtracking==0 ) { gt = new GraphTerm(l); }

                    }
                    break;
                case 6 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:717:5: NIL
                    {
                    match(input,NIL,FOLLOW_NIL_in_graphTerm4921); if (state.failed) return gt;

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
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:720:1: expression returns [Expression e] : ( ^( LOGICAL_OR e1= expression (e2= expression )+ ) | ^( LOGICAL_AND e3= expression (e4= expression )+ ) | ^( '=' e5= expression e6= expression ) | ^( '!=' e7= expression e8= expression ) | ^( LT e9= expression e10= expression ) | ^( '>' e11= expression e12= expression ) | ^( LTE e13= expression e14= expression ) | ^( '>=' e15= expression e16= expression ) | ^( IN e17= expression e18= expressionList ) | ^( NOT e19= expression e20= expressionList ) | ^( '+' e21= expression (e22= expression )? ) | ^( BROKEN_PLUS e21= expression e22= expression ) | ^( '-' e23= expression (e24= expression )? ) | ^( BROKEN_MINUS e23= expression e24= expression ) | ^( '*' e25= expression e26= expression ) | ^( '/' e27= expression e28= expression ) | ^( '!' e29= expression ) |e30= brackettedExpression |e31= primaryExpression );
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:726:2: ( ^( LOGICAL_OR e1= expression (e2= expression )+ ) | ^( LOGICAL_AND e3= expression (e4= expression )+ ) | ^( '=' e5= expression e6= expression ) | ^( '!=' e7= expression e8= expression ) | ^( LT e9= expression e10= expression ) | ^( '>' e11= expression e12= expression ) | ^( LTE e13= expression e14= expression ) | ^( '>=' e15= expression e16= expression ) | ^( IN e17= expression e18= expressionList ) | ^( NOT e19= expression e20= expressionList ) | ^( '+' e21= expression (e22= expression )? ) | ^( BROKEN_PLUS e21= expression e22= expression ) | ^( '-' e23= expression (e24= expression )? ) | ^( BROKEN_MINUS e23= expression e24= expression ) | ^( '*' e25= expression e26= expression ) | ^( '/' e27= expression e28= expression ) | ^( '!' e29= expression ) |e30= brackettedExpression |e31= primaryExpression )
            int alt95=19;
            switch ( input.LA(1) ) {
            case LOGICAL_OR:
                {
                alt95=1;
                }
                break;
            case LOGICAL_AND:
                {
                alt95=2;
                }
                break;
            case 257:
                {
                alt95=3;
                }
                break;
            case 252:
                {
                alt95=4;
                }
                break;
            case LT:
                {
                alt95=5;
                }
                break;
            case 258:
                {
                alt95=6;
                }
                break;
            case LTE:
                {
                alt95=7;
                }
                break;
            case 259:
                {
                alt95=8;
                }
                break;
            case IN:
                {
                alt95=9;
                }
                break;
            case NOT:
                {
                alt95=10;
                }
                break;
            case 254:
                {
                alt95=11;
                }
                break;
            case BROKEN_PLUS:
                {
                alt95=12;
                }
                break;
            case 255:
                {
                alt95=13;
                }
                break;
            case BROKEN_MINUS:
                {
                alt95=14;
                }
                break;
            case 253:
                {
                alt95=15;
                }
                break;
            case 256:
                {
                alt95=16;
                }
                break;
            case 251:
                {
                alt95=17;
                }
                break;
            case EXPRESSION:
                {
                alt95=18;
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
                alt95=19;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return e;}
                NoViableAltException nvae =
                    new NoViableAltException("", 95, 0, input);

                throw nvae;

            }

            switch (alt95) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:726:6: ^( LOGICAL_OR e1= expression (e2= expression )+ )
                    {
                    match(input,LOGICAL_OR,FOLLOW_LOGICAL_OR_in_expression4952); if (state.failed) return e;

                    if ( state.backtracking==0 ) { le = new LogicalExpression(LogicalExpression.ELogicalType.OR);  }

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_expression4964);
                    e1=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { le.addComponent(e1);   }

                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:728:4: (e2= expression )+
                    int cnt91=0;
                    loop91:
                    do {
                        int alt91=2;
                        int LA91_0 = input.LA(1);

                        if ( (LA91_0==ABS||LA91_0==AVG||(LA91_0 >= BIG_DECIMAL && LA91_0 <= BIG_INTEGER)||(LA91_0 >= BNODE && LA91_0 <= BROKEN_PLUS)||LA91_0==CEIL||LA91_0==COALESCE||LA91_0==CONCAT||LA91_0==CONTAINS||LA91_0==COUNT||(LA91_0 >= DATATYPE && LA91_0 <= DAY)||LA91_0==DOUBLE||LA91_0==ENCODE_FOR_URI||LA91_0==EXISTS||LA91_0==EXPRESSION||LA91_0==FLOOR||LA91_0==FUNCTION||LA91_0==GROUP_CONCAT||LA91_0==HOURS||(LA91_0 >= IF && LA91_0 <= IN)||LA91_0==IRI||(LA91_0 >= ISBLANK && LA91_0 <= ISURI)||(LA91_0 >= LANG && LA91_0 <= LANGMATCHES)||LA91_0==LCASE||(LA91_0 >= LOGICAL_AND && LA91_0 <= LTE)||(LA91_0 >= MAX && LA91_0 <= MIN)||LA91_0==MINUTES||LA91_0==MONTH||(LA91_0 >= NOT && LA91_0 <= NOT_EXISTS)||LA91_0==NOW||(LA91_0 >= PREFIXED_NAME && LA91_0 <= PREFIXED_NS)||LA91_0==RAND||(LA91_0 >= REGEX && LA91_0 <= REPLACE)||LA91_0==ROUND||(LA91_0 >= SAMETERM && LA91_0 <= SECONDS)||LA91_0==SHA1||(LA91_0 >= SHA256 && LA91_0 <= SHA512)||(LA91_0 >= STR && LA91_0 <= STRING)||(LA91_0 >= STRLANG && LA91_0 <= STRUUID)||LA91_0==SUBSTR||LA91_0==SUM||LA91_0==TIMEZONE||LA91_0==TZ||LA91_0==UCASE||LA91_0==URI||LA91_0==UUID||LA91_0==VAR||LA91_0==YEAR||(LA91_0 >= 251 && LA91_0 <= 259)) ) {
                            alt91=1;
                        }


                        switch (alt91) {
                    	case 1 :
                    	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:728:5: e2= expression
                    	    {
                    	    pushFollow(FOLLOW_expression_in_expression4985);
                    	    e2=expression();

                    	    state._fsp--;
                    	    if (state.failed) return e;

                    	    if ( state.backtracking==0 ) { le.addComponent(e2); 	}

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt91 >= 1 ) break loop91;
                    	    if (state.backtracking>0) {state.failed=true; return e;}
                                EarlyExitException eee =
                                    new EarlyExitException(91, input);
                                throw eee;
                        }
                        cnt91++;
                    } while (true);


                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { e = le; }

                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:730:6: ^( LOGICAL_AND e3= expression (e4= expression )+ )
                    {
                    match(input,LOGICAL_AND,FOLLOW_LOGICAL_AND_in_expression5010); if (state.failed) return e;

                    if ( state.backtracking==0 ) { le = new LogicalExpression(LogicalExpression.ELogicalType.AND); }

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_expression5022);
                    e3=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { le.addComponent(e3);   }

                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:732:4: (e4= expression )+
                    int cnt92=0;
                    loop92:
                    do {
                        int alt92=2;
                        int LA92_0 = input.LA(1);

                        if ( (LA92_0==ABS||LA92_0==AVG||(LA92_0 >= BIG_DECIMAL && LA92_0 <= BIG_INTEGER)||(LA92_0 >= BNODE && LA92_0 <= BROKEN_PLUS)||LA92_0==CEIL||LA92_0==COALESCE||LA92_0==CONCAT||LA92_0==CONTAINS||LA92_0==COUNT||(LA92_0 >= DATATYPE && LA92_0 <= DAY)||LA92_0==DOUBLE||LA92_0==ENCODE_FOR_URI||LA92_0==EXISTS||LA92_0==EXPRESSION||LA92_0==FLOOR||LA92_0==FUNCTION||LA92_0==GROUP_CONCAT||LA92_0==HOURS||(LA92_0 >= IF && LA92_0 <= IN)||LA92_0==IRI||(LA92_0 >= ISBLANK && LA92_0 <= ISURI)||(LA92_0 >= LANG && LA92_0 <= LANGMATCHES)||LA92_0==LCASE||(LA92_0 >= LOGICAL_AND && LA92_0 <= LTE)||(LA92_0 >= MAX && LA92_0 <= MIN)||LA92_0==MINUTES||LA92_0==MONTH||(LA92_0 >= NOT && LA92_0 <= NOT_EXISTS)||LA92_0==NOW||(LA92_0 >= PREFIXED_NAME && LA92_0 <= PREFIXED_NS)||LA92_0==RAND||(LA92_0 >= REGEX && LA92_0 <= REPLACE)||LA92_0==ROUND||(LA92_0 >= SAMETERM && LA92_0 <= SECONDS)||LA92_0==SHA1||(LA92_0 >= SHA256 && LA92_0 <= SHA512)||(LA92_0 >= STR && LA92_0 <= STRING)||(LA92_0 >= STRLANG && LA92_0 <= STRUUID)||LA92_0==SUBSTR||LA92_0==SUM||LA92_0==TIMEZONE||LA92_0==TZ||LA92_0==UCASE||LA92_0==URI||LA92_0==UUID||LA92_0==VAR||LA92_0==YEAR||(LA92_0 >= 251 && LA92_0 <= 259)) ) {
                            alt92=1;
                        }


                        switch (alt92) {
                    	case 1 :
                    	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:732:5: e4= expression
                    	    {
                    	    pushFollow(FOLLOW_expression_in_expression5043);
                    	    e4=expression();

                    	    state._fsp--;
                    	    if (state.failed) return e;

                    	    if ( state.backtracking==0 ) { le.addComponent(e4); 	}

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt92 >= 1 ) break loop92;
                    	    if (state.backtracking>0) {state.failed=true; return e;}
                                EarlyExitException eee =
                                    new EarlyExitException(92, input);
                                throw eee;
                        }
                        cnt92++;
                    } while (true);


                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { e = le; }

                    }
                    break;
                case 3 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:734:6: ^( '=' e5= expression e6= expression )
                    {
                    match(input,257,FOLLOW_257_in_expression5070); if (state.failed) return e;

                    if ( state.backtracking==0 ) { rl = new RelationalExpression(); 								  }

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_expression5084);
                    e5=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { rl.setLeft(e5); 				}

                    pushFollow(FOLLOW_expression_in_expression5095);
                    e6=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { rl.setRight(RelationalExpression.ERelationalOp.EQUAL, e6); 		  }

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { e = rl; }

                    }
                    break;
                case 4 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:738:4: ^( '!=' e7= expression e8= expression )
                    {
                    match(input,252,FOLLOW_252_in_expression5115); if (state.failed) return e;

                    if ( state.backtracking==0 ) { rl = new RelationalExpression(); 								  }

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_expression5129);
                    e7=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { rl.setLeft(e7); 				}

                    pushFollow(FOLLOW_expression_in_expression5140);
                    e8=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { rl.setRight(RelationalExpression.ERelationalOp.NOT_EQUAL, e8);    }

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { e = rl; }

                    }
                    break;
                case 5 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:742:4: ^( LT e9= expression e10= expression )
                    {
                    match(input,LT,FOLLOW_LT_in_expression5160); if (state.failed) return e;

                    if ( state.backtracking==0 ) { rl = new RelationalExpression(); 								  }

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_expression5175);
                    e9=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { rl.setLeft(e9); 				}

                    pushFollow(FOLLOW_expression_in_expression5190);
                    e10=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { rl.setRight(RelationalExpression.ERelationalOp.LESS, e10);		  }

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { e = rl; }

                    }
                    break;
                case 6 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:746:4: ^( '>' e11= expression e12= expression )
                    {
                    match(input,258,FOLLOW_258_in_expression5210); if (state.failed) return e;

                    if ( state.backtracking==0 ) { rl = new RelationalExpression(); 								  }

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_expression5225);
                    e11=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { rl.setLeft(e11); 				}

                    pushFollow(FOLLOW_expression_in_expression5236);
                    e12=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { rl.setRight(RelationalExpression.ERelationalOp.GREATER, e12);	  }

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { e = rl; }

                    }
                    break;
                case 7 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:750:4: ^( LTE e13= expression e14= expression )
                    {
                    match(input,LTE,FOLLOW_LTE_in_expression5256); if (state.failed) return e;

                    if ( state.backtracking==0 ) { rl = new RelationalExpression(); 								  }

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_expression5270);
                    e13=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { rl.setLeft(e13); 				}

                    pushFollow(FOLLOW_expression_in_expression5281);
                    e14=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { rl.setRight(RelationalExpression.ERelationalOp.LESS_EQUAL, e14); }

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { e = rl; }

                    }
                    break;
                case 8 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:754:4: ^( '>=' e15= expression e16= expression )
                    {
                    match(input,259,FOLLOW_259_in_expression5301); if (state.failed) return e;

                    if ( state.backtracking==0 ) { rl = new RelationalExpression(); 								  }

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_expression5315);
                    e15=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { rl.setLeft(e15); 				}

                    pushFollow(FOLLOW_expression_in_expression5326);
                    e16=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { rl.setRight(RelationalExpression.ERelationalOp.GREATER_EQUAL, e16); }

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { e = rl; }

                    }
                    break;
                case 9 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:758:4: ^( IN e17= expression e18= expressionList )
                    {
                    match(input,IN,FOLLOW_IN_in_expression5346); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_expression5373);
                    e17=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    pushFollow(FOLLOW_expressionList_in_expression5386);
                    e18=expressionList();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { e = new OneOfExpression(Expression.EOneOfOp.IN ,e17, e18); }

                    match(input, Token.UP, null); if (state.failed) return e;


                    }
                    break;
                case 10 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:763:4: ^( NOT e19= expression e20= expressionList )
                    {
                    match(input,NOT,FOLLOW_NOT_in_expression5432); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_expression5439);
                    e19=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    pushFollow(FOLLOW_expressionList_in_expression5447);
                    e20=expressionList();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { e = new OneOfExpression(Expression.EOneOfOp.NOT_IN ,e19, e20); }

                    }
                    break;
                case 11 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:767:4: ^( '+' e21= expression (e22= expression )? )
                    {
                    match(input,254,FOLLOW_254_in_expression5481); if (state.failed) return e;

                    if ( state.backtracking==0 ) { ne = new NumericExpression(); 								}

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_expression5508);
                    e21=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { ne.setLHS(e21); 				}

                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:769:4: (e22= expression )?
                    int alt93=2;
                    int LA93_0 = input.LA(1);

                    if ( (LA93_0==ABS||LA93_0==AVG||(LA93_0 >= BIG_DECIMAL && LA93_0 <= BIG_INTEGER)||(LA93_0 >= BNODE && LA93_0 <= BROKEN_PLUS)||LA93_0==CEIL||LA93_0==COALESCE||LA93_0==CONCAT||LA93_0==CONTAINS||LA93_0==COUNT||(LA93_0 >= DATATYPE && LA93_0 <= DAY)||LA93_0==DOUBLE||LA93_0==ENCODE_FOR_URI||LA93_0==EXISTS||LA93_0==EXPRESSION||LA93_0==FLOOR||LA93_0==FUNCTION||LA93_0==GROUP_CONCAT||LA93_0==HOURS||(LA93_0 >= IF && LA93_0 <= IN)||LA93_0==IRI||(LA93_0 >= ISBLANK && LA93_0 <= ISURI)||(LA93_0 >= LANG && LA93_0 <= LANGMATCHES)||LA93_0==LCASE||(LA93_0 >= LOGICAL_AND && LA93_0 <= LTE)||(LA93_0 >= MAX && LA93_0 <= MIN)||LA93_0==MINUTES||LA93_0==MONTH||(LA93_0 >= NOT && LA93_0 <= NOT_EXISTS)||LA93_0==NOW||(LA93_0 >= PREFIXED_NAME && LA93_0 <= PREFIXED_NS)||LA93_0==RAND||(LA93_0 >= REGEX && LA93_0 <= REPLACE)||LA93_0==ROUND||(LA93_0 >= SAMETERM && LA93_0 <= SECONDS)||LA93_0==SHA1||(LA93_0 >= SHA256 && LA93_0 <= SHA512)||(LA93_0 >= STR && LA93_0 <= STRING)||(LA93_0 >= STRLANG && LA93_0 <= STRUUID)||LA93_0==SUBSTR||LA93_0==SUM||LA93_0==TIMEZONE||LA93_0==TZ||LA93_0==UCASE||LA93_0==URI||LA93_0==UUID||LA93_0==VAR||LA93_0==YEAR||(LA93_0 >= 251 && LA93_0 <= 259)) ) {
                        alt93=1;
                    }
                    switch (alt93) {
                        case 1 :
                            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:769:5: e22= expression
                            {
                            pushFollow(FOLLOW_expression_in_expression5520);
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
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:771:4: ^( BROKEN_PLUS e21= expression e22= expression )
                    {
                    match(input,BROKEN_PLUS,FOLLOW_BROKEN_PLUS_in_expression5543); if (state.failed) return e;

                    if ( state.backtracking==0 ) { ne = new NumericExpression(); 								}

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_expression5562);
                    e21=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { ne.setLHS(e21); 				}

                    pushFollow(FOLLOW_expression_in_expression5573);
                    e22=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { ne.setRHS(NumericExpression.ENEType.PLUS, e22);      			}

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { e = ne; }

                    }
                    break;
                case 13 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:775:4: ^( '-' e23= expression (e24= expression )? )
                    {
                    match(input,255,FOLLOW_255_in_expression5593); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_expression5619);
                    e23=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { e = new UnaryExpression(Expression.EUnaryOp.MINUS, e23); }

                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:777:4: (e24= expression )?
                    int alt94=2;
                    int LA94_0 = input.LA(1);

                    if ( (LA94_0==ABS||LA94_0==AVG||(LA94_0 >= BIG_DECIMAL && LA94_0 <= BIG_INTEGER)||(LA94_0 >= BNODE && LA94_0 <= BROKEN_PLUS)||LA94_0==CEIL||LA94_0==COALESCE||LA94_0==CONCAT||LA94_0==CONTAINS||LA94_0==COUNT||(LA94_0 >= DATATYPE && LA94_0 <= DAY)||LA94_0==DOUBLE||LA94_0==ENCODE_FOR_URI||LA94_0==EXISTS||LA94_0==EXPRESSION||LA94_0==FLOOR||LA94_0==FUNCTION||LA94_0==GROUP_CONCAT||LA94_0==HOURS||(LA94_0 >= IF && LA94_0 <= IN)||LA94_0==IRI||(LA94_0 >= ISBLANK && LA94_0 <= ISURI)||(LA94_0 >= LANG && LA94_0 <= LANGMATCHES)||LA94_0==LCASE||(LA94_0 >= LOGICAL_AND && LA94_0 <= LTE)||(LA94_0 >= MAX && LA94_0 <= MIN)||LA94_0==MINUTES||LA94_0==MONTH||(LA94_0 >= NOT && LA94_0 <= NOT_EXISTS)||LA94_0==NOW||(LA94_0 >= PREFIXED_NAME && LA94_0 <= PREFIXED_NS)||LA94_0==RAND||(LA94_0 >= REGEX && LA94_0 <= REPLACE)||LA94_0==ROUND||(LA94_0 >= SAMETERM && LA94_0 <= SECONDS)||LA94_0==SHA1||(LA94_0 >= SHA256 && LA94_0 <= SHA512)||(LA94_0 >= STR && LA94_0 <= STRING)||(LA94_0 >= STRLANG && LA94_0 <= STRUUID)||LA94_0==SUBSTR||LA94_0==SUM||LA94_0==TIMEZONE||LA94_0==TZ||LA94_0==UCASE||LA94_0==URI||LA94_0==UUID||LA94_0==VAR||LA94_0==YEAR||(LA94_0 >= 251 && LA94_0 <= 259)) ) {
                        alt94=1;
                    }
                    switch (alt94) {
                        case 1 :
                            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:777:5: e24= expression
                            {
                            pushFollow(FOLLOW_expression_in_expression5631);
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
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:779:4: ^( BROKEN_MINUS e23= expression e24= expression )
                    {
                    match(input,BROKEN_MINUS,FOLLOW_BROKEN_MINUS_in_expression5648); if (state.failed) return e;

                    if ( state.backtracking==0 ) { ne = new NumericExpression(); 								}

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_expression5666);
                    e23=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { ne.setLHS(e23); 				}

                    pushFollow(FOLLOW_expression_in_expression5677);
                    e24=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { ne.setRHS(NumericExpression.ENEType.MINUS, e24);   			}

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { e = ne; }

                    }
                    break;
                case 15 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:783:4: ^( '*' e25= expression e26= expression )
                    {
                    match(input,253,FOLLOW_253_in_expression5697); if (state.failed) return e;

                    if ( state.backtracking==0 ) { ne = new NumericExpression(); 								}

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_expression5724);
                    e25=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { ne.setLHS(e25); 				}

                    pushFollow(FOLLOW_expression_in_expression5735);
                    e26=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { ne.setRHS(NumericExpression.ENEType.MUL, e26);   				}

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { e = ne; }

                    }
                    break;
                case 16 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:787:4: ^( '/' e27= expression e28= expression )
                    {
                    match(input,256,FOLLOW_256_in_expression5755); if (state.failed) return e;

                    if ( state.backtracking==0 ) { ne = new NumericExpression(); 								}

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_expression5782);
                    e27=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { ne.setLHS(e27); 				}

                    pushFollow(FOLLOW_expression_in_expression5792);
                    e28=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { ne.setRHS(NumericExpression.ENEType.DIV, e28);   			}

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { e = ne; }

                    }
                    break;
                case 17 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:791:4: ^( '!' e29= expression )
                    {
                    match(input,251,FOLLOW_251_in_expression5812); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_expression5816);
                    e29=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { e = new UnaryExpression(Expression.EUnaryOp.NOT, e29); 		}

                    }
                    break;
                case 18 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:792:4: e30= brackettedExpression
                    {
                    pushFollow(FOLLOW_brackettedExpression_in_expression5827);
                    e30=brackettedExpression();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { e = e30; }

                    }
                    break;
                case 19 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:793:5: e31= primaryExpression
                    {
                    pushFollow(FOLLOW_primaryExpression_in_expression5837);
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
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:797:1: primaryExpression returns [Expression e] : (e1= builtInCall |i= iRIref |f= iRIFunction |r= rDFLiteral |n= numericLiteral |b= booleanLiteral |v= var |a= aggregate );
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:798:2: (e1= builtInCall |i= iRIref |f= iRIFunction |r= rDFLiteral |n= numericLiteral |b= booleanLiteral |v= var |a= aggregate )
            int alt96=8;
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
                alt96=1;
                }
                break;
            case IRI:
                {
                int LA96_2 = input.LA(2);

                if ( (LA96_2==DOWN) ) {
                    int LA96_10 = input.LA(3);

                    if ( (LA96_10==IRI_REF) ) {
                        alt96=2;
                    }
                    else if ( (LA96_10==ABS||LA96_10==AVG||(LA96_10 >= BIG_DECIMAL && LA96_10 <= BIG_INTEGER)||(LA96_10 >= BNODE && LA96_10 <= BROKEN_PLUS)||LA96_10==CEIL||LA96_10==COALESCE||LA96_10==CONCAT||LA96_10==CONTAINS||LA96_10==COUNT||(LA96_10 >= DATATYPE && LA96_10 <= DAY)||LA96_10==DOUBLE||LA96_10==ENCODE_FOR_URI||LA96_10==EXISTS||LA96_10==EXPRESSION||LA96_10==FLOOR||LA96_10==FUNCTION||LA96_10==GROUP_CONCAT||LA96_10==HOURS||(LA96_10 >= IF && LA96_10 <= IN)||LA96_10==IRI||(LA96_10 >= ISBLANK && LA96_10 <= ISURI)||(LA96_10 >= LANG && LA96_10 <= LANGMATCHES)||LA96_10==LCASE||(LA96_10 >= LOGICAL_AND && LA96_10 <= LTE)||(LA96_10 >= MAX && LA96_10 <= MIN)||LA96_10==MINUTES||LA96_10==MONTH||(LA96_10 >= NOT && LA96_10 <= NOT_EXISTS)||LA96_10==NOW||(LA96_10 >= PREFIXED_NAME && LA96_10 <= PREFIXED_NS)||LA96_10==RAND||(LA96_10 >= REGEX && LA96_10 <= REPLACE)||LA96_10==ROUND||(LA96_10 >= SAMETERM && LA96_10 <= SECONDS)||LA96_10==SHA1||(LA96_10 >= SHA256 && LA96_10 <= SHA512)||(LA96_10 >= STR && LA96_10 <= STRING)||(LA96_10 >= STRLANG && LA96_10 <= STRUUID)||LA96_10==SUBSTR||LA96_10==SUM||LA96_10==TIMEZONE||LA96_10==TZ||LA96_10==UCASE||LA96_10==URI||LA96_10==UUID||LA96_10==VAR||LA96_10==YEAR||(LA96_10 >= 251 && LA96_10 <= 259)) ) {
                        alt96=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return e;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 96, 10, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return e;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 96, 2, input);

                    throw nvae;

                }
                }
                break;
            case PREFIXED_NAME:
            case PREFIXED_NS:
                {
                alt96=2;
                }
                break;
            case FUNCTION:
                {
                alt96=3;
                }
                break;
            case STRING:
                {
                alt96=4;
                }
                break;
            case BIG_DECIMAL:
            case BIG_INTEGER:
            case DOUBLE:
                {
                alt96=5;
                }
                break;
            case BOOLEAN:
                {
                alt96=6;
                }
                break;
            case VAR:
                {
                alt96=7;
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
                alt96=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return e;}
                NoViableAltException nvae =
                    new NoViableAltException("", 96, 0, input);

                throw nvae;

            }

            switch (alt96) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:798:6: e1= builtInCall
                    {
                    pushFollow(FOLLOW_builtInCall_in_primaryExpression5862);
                    e1=builtInCall();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { e = e1; }

                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:799:5: i= iRIref
                    {
                    pushFollow(FOLLOW_iRIref_in_primaryExpression5874);
                    i=iRIref();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { e = new ConstantExpression(i); }

                    }
                    break;
                case 3 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:800:4: f= iRIFunction
                    {
                    pushFollow(FOLLOW_iRIFunction_in_primaryExpression5886);
                    f=iRIFunction();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { e = new FunctionCallExpression(f); }

                    }
                    break;
                case 4 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:801:5: r= rDFLiteral
                    {
                    pushFollow(FOLLOW_rDFLiteral_in_primaryExpression5898);
                    r=rDFLiteral();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { e = new ConstantExpression(r); }

                    }
                    break;
                case 5 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:802:5: n= numericLiteral
                    {
                    pushFollow(FOLLOW_numericLiteral_in_primaryExpression5910);
                    n=numericLiteral();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { e = new ConstantExpression(n); }

                    }
                    break;
                case 6 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:803:5: b= booleanLiteral
                    {
                    pushFollow(FOLLOW_booleanLiteral_in_primaryExpression5921);
                    b=booleanLiteral();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { e = new ConstantExpression(b); }

                    }
                    break;
                case 7 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:804:5: v= var
                    {
                    pushFollow(FOLLOW_var_in_primaryExpression5932);
                    v=var();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { e = new VariableExpression(v); }

                    }
                    break;
                case 8 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:805:5: a= aggregate
                    {
                    pushFollow(FOLLOW_aggregate_in_primaryExpression5946);
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
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:808:1: brackettedExpression returns [Expression e] : ^( EXPRESSION e1= expression ) ;
    public final Expression brackettedExpression() throws RecognitionException {
        Expression e = null;


        Expression e1 =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:809:2: ( ^( EXPRESSION e1= expression ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:809:4: ^( EXPRESSION e1= expression )
            {
            match(input,EXPRESSION,FOLLOW_EXPRESSION_in_brackettedExpression5969); if (state.failed) return e;

            match(input, Token.DOWN, null); if (state.failed) return e;
            pushFollow(FOLLOW_expression_in_brackettedExpression5974);
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
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:812:1: builtInCall returns [Expression e] : ( ^( STR st= expression ) | ^( LANG lg= expression ) | ^( LANGMATCHES lm1= expression lm2= expression ) | ^( DATATYPE dt= expression ) | ^( BOUND v= var ) | ^( IRI e6= expression ) | ^( URI e7= expression ) | ^( BNODE e8= expression ) | BNODE | ^( RAND NIL ) | ^( ABS e9= expression ) | ^( CEIL e10= expression ) | ^( FLOOR e11= expression ) | ^( ROUND e12= expression ) | ^( CONCAT e13= expressionList ) | ^( SUBSTR e14= expression e15= expression (e16= expression )? ) | ^( STRLEN e15= expression ) | ^( UCASE e16= expression ) | ^( REPLACE e1= expression e2= expression e3= expression (e4= expression )? ) | ^( LCASE e17= expression ) | ^( ENCODE_FOR_URI e18= expression ) | ^( CONTAINS e19= expression e20= expression ) | ^( STRSTARTS e21= expression e22= expression ) | ^( STRENDS e23= expression e24= expression ) | ^( STRBEFORE e241= expression e242= expression ) | ^( STRAFTER e243= expression e244= expression ) | ^( YEAR e25= expression ) | ^( MONTH e26= expression ) | ^( DAY e27= expression ) | ^( HOURS e28= expression ) | ^( MINUTES e29= expression ) | ^( SECONDS e30= expression ) | ^( TIMEZONE e31= expression ) | ^( TZ e32= expression ) | NOW | UUID | STRUUID | ^( MD5 e33= expression ) | ^( SHA1 e34= expression ) | ^( SHA256 e36= expression ) | ^( SHA384 e37= expression ) | ^( SHA512 e38= expression ) | ^( COALESCE e39= expressionList ) | ^( IF e40= expression e41= expression e42= expression ) | ^( STRLANG e45= expression e46= expression ) | ^( STRDT e47= expression e48= expression ) | ^( SAMETERM sam1= expression sam2= expression ) | ^( ISIRI isi= expression ) | ^( ISURI isu= expression ) | ^( ISBLANK isb= expression ) | ^( ISLITERAL isl= expression ) | ^( ISNUMERIC e55= expression ) |r= regexExpression |p= existsFunc |p= notExistsFunc );
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:816:2: ( ^( STR st= expression ) | ^( LANG lg= expression ) | ^( LANGMATCHES lm1= expression lm2= expression ) | ^( DATATYPE dt= expression ) | ^( BOUND v= var ) | ^( IRI e6= expression ) | ^( URI e7= expression ) | ^( BNODE e8= expression ) | BNODE | ^( RAND NIL ) | ^( ABS e9= expression ) | ^( CEIL e10= expression ) | ^( FLOOR e11= expression ) | ^( ROUND e12= expression ) | ^( CONCAT e13= expressionList ) | ^( SUBSTR e14= expression e15= expression (e16= expression )? ) | ^( STRLEN e15= expression ) | ^( UCASE e16= expression ) | ^( REPLACE e1= expression e2= expression e3= expression (e4= expression )? ) | ^( LCASE e17= expression ) | ^( ENCODE_FOR_URI e18= expression ) | ^( CONTAINS e19= expression e20= expression ) | ^( STRSTARTS e21= expression e22= expression ) | ^( STRENDS e23= expression e24= expression ) | ^( STRBEFORE e241= expression e242= expression ) | ^( STRAFTER e243= expression e244= expression ) | ^( YEAR e25= expression ) | ^( MONTH e26= expression ) | ^( DAY e27= expression ) | ^( HOURS e28= expression ) | ^( MINUTES e29= expression ) | ^( SECONDS e30= expression ) | ^( TIMEZONE e31= expression ) | ^( TZ e32= expression ) | NOW | UUID | STRUUID | ^( MD5 e33= expression ) | ^( SHA1 e34= expression ) | ^( SHA256 e36= expression ) | ^( SHA384 e37= expression ) | ^( SHA512 e38= expression ) | ^( COALESCE e39= expressionList ) | ^( IF e40= expression e41= expression e42= expression ) | ^( STRLANG e45= expression e46= expression ) | ^( STRDT e47= expression e48= expression ) | ^( SAMETERM sam1= expression sam2= expression ) | ^( ISIRI isi= expression ) | ^( ISURI isu= expression ) | ^( ISBLANK isb= expression ) | ^( ISLITERAL isl= expression ) | ^( ISNUMERIC e55= expression ) |r= regexExpression |p= existsFunc |p= notExistsFunc )
            int alt99=55;
            switch ( input.LA(1) ) {
            case STR:
                {
                alt99=1;
                }
                break;
            case LANG:
                {
                alt99=2;
                }
                break;
            case LANGMATCHES:
                {
                alt99=3;
                }
                break;
            case DATATYPE:
                {
                alt99=4;
                }
                break;
            case BOUND:
                {
                alt99=5;
                }
                break;
            case IRI:
                {
                alt99=6;
                }
                break;
            case URI:
                {
                alt99=7;
                }
                break;
            case BNODE:
                {
                int LA99_8 = input.LA(2);

                if ( (LA99_8==DOWN) ) {
                    alt99=8;
                }
                else if ( (LA99_8==UP||LA99_8==ABS||LA99_8==ASC||LA99_8==AVG||(LA99_8 >= BIG_DECIMAL && LA99_8 <= BIG_INTEGER)||(LA99_8 >= BNODE && LA99_8 <= BROKEN_PLUS)||LA99_8==CEIL||LA99_8==COALESCE||(LA99_8 >= CONCAT && LA99_8 <= CONDITION)||LA99_8==CONTAINS||LA99_8==COUNT||(LA99_8 >= DATATYPE && LA99_8 <= DAY)||LA99_8==DESC||LA99_8==DOUBLE||LA99_8==ENCODE_FOR_URI||LA99_8==EXISTS||LA99_8==EXPRESSION||LA99_8==FLOOR||LA99_8==FUNCTION||LA99_8==GROUP_CONCAT||LA99_8==HOURS||(LA99_8 >= IF && LA99_8 <= IN)||LA99_8==IRI||(LA99_8 >= ISBLANK && LA99_8 <= ISURI)||(LA99_8 >= LANG && LA99_8 <= LANGMATCHES)||LA99_8==LCASE||(LA99_8 >= LOGICAL_AND && LA99_8 <= LTE)||(LA99_8 >= MAX && LA99_8 <= MIN)||LA99_8==MINUTES||LA99_8==MONTH||LA99_8==NIL||(LA99_8 >= NOT && LA99_8 <= NOT_EXISTS)||LA99_8==NOW||(LA99_8 >= PREFIXED_NAME && LA99_8 <= PREFIXED_NS)||LA99_8==RAND||(LA99_8 >= REGEX && LA99_8 <= REPLACE)||LA99_8==ROUND||(LA99_8 >= SAMETERM && LA99_8 <= SECONDS)||LA99_8==SEPARATOR||LA99_8==SHA1||(LA99_8 >= SHA256 && LA99_8 <= SHA512)||(LA99_8 >= STR && LA99_8 <= STRING)||(LA99_8 >= STRLANG && LA99_8 <= STRUUID)||LA99_8==SUBSTR||LA99_8==SUM||LA99_8==TIMEZONE||LA99_8==TZ||LA99_8==UCASE||LA99_8==URI||LA99_8==UUID||LA99_8==VAR||LA99_8==YEAR||(LA99_8 >= 251 && LA99_8 <= 259)) ) {
                    alt99=9;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return e;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 99, 8, input);

                    throw nvae;

                }
                }
                break;
            case RAND:
                {
                alt99=10;
                }
                break;
            case ABS:
                {
                alt99=11;
                }
                break;
            case CEIL:
                {
                alt99=12;
                }
                break;
            case FLOOR:
                {
                alt99=13;
                }
                break;
            case ROUND:
                {
                alt99=14;
                }
                break;
            case CONCAT:
                {
                alt99=15;
                }
                break;
            case SUBSTR:
                {
                alt99=16;
                }
                break;
            case STRLEN:
                {
                alt99=17;
                }
                break;
            case UCASE:
                {
                alt99=18;
                }
                break;
            case REPLACE:
                {
                alt99=19;
                }
                break;
            case LCASE:
                {
                alt99=20;
                }
                break;
            case ENCODE_FOR_URI:
                {
                alt99=21;
                }
                break;
            case CONTAINS:
                {
                alt99=22;
                }
                break;
            case STRSTARTS:
                {
                alt99=23;
                }
                break;
            case STRENDS:
                {
                alt99=24;
                }
                break;
            case STRBEFORE:
                {
                alt99=25;
                }
                break;
            case STRAFTER:
                {
                alt99=26;
                }
                break;
            case YEAR:
                {
                alt99=27;
                }
                break;
            case MONTH:
                {
                alt99=28;
                }
                break;
            case DAY:
                {
                alt99=29;
                }
                break;
            case HOURS:
                {
                alt99=30;
                }
                break;
            case MINUTES:
                {
                alt99=31;
                }
                break;
            case SECONDS:
                {
                alt99=32;
                }
                break;
            case TIMEZONE:
                {
                alt99=33;
                }
                break;
            case TZ:
                {
                alt99=34;
                }
                break;
            case NOW:
                {
                alt99=35;
                }
                break;
            case UUID:
                {
                alt99=36;
                }
                break;
            case STRUUID:
                {
                alt99=37;
                }
                break;
            case MD5:
                {
                alt99=38;
                }
                break;
            case SHA1:
                {
                alt99=39;
                }
                break;
            case SHA256:
                {
                alt99=40;
                }
                break;
            case SHA384:
                {
                alt99=41;
                }
                break;
            case SHA512:
                {
                alt99=42;
                }
                break;
            case COALESCE:
                {
                alt99=43;
                }
                break;
            case IF:
                {
                alt99=44;
                }
                break;
            case STRLANG:
                {
                alt99=45;
                }
                break;
            case STRDT:
                {
                alt99=46;
                }
                break;
            case SAMETERM:
                {
                alt99=47;
                }
                break;
            case ISIRI:
                {
                alt99=48;
                }
                break;
            case ISURI:
                {
                alt99=49;
                }
                break;
            case ISBLANK:
                {
                alt99=50;
                }
                break;
            case ISLITERAL:
                {
                alt99=51;
                }
                break;
            case ISNUMERIC:
                {
                alt99=52;
                }
                break;
            case REGEX:
                {
                alt99=53;
                }
                break;
            case EXISTS:
                {
                alt99=54;
                }
                break;
            case NOT_EXISTS:
                {
                alt99=55;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return e;}
                NoViableAltException nvae =
                    new NoViableAltException("", 99, 0, input);

                throw nvae;

            }

            switch (alt99) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:816:5: ^( STR st= expression )
                    {
                    match(input,STR,FOLLOW_STR_in_builtInCall6004); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall6008);
                    st=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { args.add(st); e = new BuiltinFunctionExpression(Expression.EBuiltinType.STR, args); 			}

                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:818:5: ^( LANG lg= expression )
                    {
                    match(input,LANG,FOLLOW_LANG_in_builtInCall6021); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall6025);
                    lg=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { args.add(lg); e = new BuiltinFunctionExpression(Expression.EBuiltinType.LANG, args); 		}

                    }
                    break;
                case 3 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:820:5: ^( LANGMATCHES lm1= expression lm2= expression )
                    {
                    match(input,LANGMATCHES,FOLLOW_LANGMATCHES_in_builtInCall6038); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall6042);
                    lm1=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    pushFollow(FOLLOW_expression_in_builtInCall6046);
                    lm2=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { e = new BuiltinFunctionExpression(Expression.EBuiltinType.LANGMATCHES, lm1, lm2); 			}

                    }
                    break;
                case 4 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:822:5: ^( DATATYPE dt= expression )
                    {
                    match(input,DATATYPE,FOLLOW_DATATYPE_in_builtInCall6059); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall6063);
                    dt=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { args.add(dt); e = new BuiltinFunctionExpression(Expression.EBuiltinType.DATATYPE, args); 	}

                    }
                    break;
                case 5 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:824:4: ^( BOUND v= var )
                    {
                    match(input,BOUND,FOLLOW_BOUND_in_builtInCall6075); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_var_in_builtInCall6079);
                    v=var();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { e = new BuiltinFunctionExpression(Expression.EBuiltinType.BOUND, new VariableExpression(v)); }

                    }
                    break;
                case 6 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:826:4: ^( IRI e6= expression )
                    {
                    match(input,IRI,FOLLOW_IRI_in_builtInCall6097); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall6101);
                    e6=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { args.add(e6); e = new BuiltinFunctionExpression(Expression.EBuiltinType.IRI, args);			}

                    }
                    break;
                case 7 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:828:5: ^( URI e7= expression )
                    {
                    match(input,URI,FOLLOW_URI_in_builtInCall6114); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall6118);
                    e7=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { args.add(e7); e = new BuiltinFunctionExpression(Expression.EBuiltinType.IRI, args);			}

                    }
                    break;
                case 8 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:830:4: ^( BNODE e8= expression )
                    {
                    match(input,BNODE,FOLLOW_BNODE_in_builtInCall6130); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall6134);
                    e8=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { args.add(e8); e = new BuiltinFunctionExpression(Expression.EBuiltinType.BNODE, args);		}

                    }
                    break;
                case 9 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:832:4: BNODE
                    {
                    match(input,BNODE,FOLLOW_BNODE_in_builtInCall6145); if (state.failed) return e;

                    if ( state.backtracking==0 ) { e = new BuiltinFunctionExpression(Expression.EBuiltinType.BNODE); 							}

                    }
                    break;
                case 10 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:834:4: ^( RAND NIL )
                    {
                    match(input,RAND,FOLLOW_RAND_in_builtInCall6156); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    match(input,NIL,FOLLOW_NIL_in_builtInCall6158); if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { e = new BuiltinFunctionExpression(Expression.EBuiltinType.RAND); 							}

                    }
                    break;
                case 11 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:836:4: ^( ABS e9= expression )
                    {
                    match(input,ABS,FOLLOW_ABS_in_builtInCall6171); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall6175);
                    e9=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { args.add(e9); e = new BuiltinFunctionExpression(Expression.EBuiltinType.ABS, args);			}

                    }
                    break;
                case 12 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:838:4: ^( CEIL e10= expression )
                    {
                    match(input,CEIL,FOLLOW_CEIL_in_builtInCall6187); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall6191);
                    e10=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { args.add(e10); e = new BuiltinFunctionExpression(Expression.EBuiltinType.CEIL, args);		}

                    }
                    break;
                case 13 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:840:4: ^( FLOOR e11= expression )
                    {
                    match(input,FLOOR,FOLLOW_FLOOR_in_builtInCall6203); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall6207);
                    e11=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { args.add(e11); e = new BuiltinFunctionExpression(Expression.EBuiltinType.FLOOR, args);		}

                    }
                    break;
                case 14 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:842:4: ^( ROUND e12= expression )
                    {
                    match(input,ROUND,FOLLOW_ROUND_in_builtInCall6219); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall6223);
                    e12=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { args.add(e12); e = new BuiltinFunctionExpression(Expression.EBuiltinType.ROUND, args);		}

                    }
                    break;
                case 15 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:844:4: ^( CONCAT e13= expressionList )
                    {
                    match(input,CONCAT,FOLLOW_CONCAT_in_builtInCall6235); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expressionList_in_builtInCall6239);
                    e13=expressionList();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { args.addAll(e13); e = new BuiltinFunctionExpression(Expression.EBuiltinType.CONCAT, args);		}

                    }
                    break;
                case 16 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:846:5: ^( SUBSTR e14= expression e15= expression (e16= expression )? )
                    {
                    match(input,SUBSTR,FOLLOW_SUBSTR_in_builtInCall6252); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall6256);
                    e14=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    pushFollow(FOLLOW_expression_in_builtInCall6260);
                    e15=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { args.add(e14); args.add(e15); }

                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:848:13: (e16= expression )?
                    int alt97=2;
                    int LA97_0 = input.LA(1);

                    if ( (LA97_0==ABS||LA97_0==AVG||(LA97_0 >= BIG_DECIMAL && LA97_0 <= BIG_INTEGER)||(LA97_0 >= BNODE && LA97_0 <= BROKEN_PLUS)||LA97_0==CEIL||LA97_0==COALESCE||LA97_0==CONCAT||LA97_0==CONTAINS||LA97_0==COUNT||(LA97_0 >= DATATYPE && LA97_0 <= DAY)||LA97_0==DOUBLE||LA97_0==ENCODE_FOR_URI||LA97_0==EXISTS||LA97_0==EXPRESSION||LA97_0==FLOOR||LA97_0==FUNCTION||LA97_0==GROUP_CONCAT||LA97_0==HOURS||(LA97_0 >= IF && LA97_0 <= IN)||LA97_0==IRI||(LA97_0 >= ISBLANK && LA97_0 <= ISURI)||(LA97_0 >= LANG && LA97_0 <= LANGMATCHES)||LA97_0==LCASE||(LA97_0 >= LOGICAL_AND && LA97_0 <= LTE)||(LA97_0 >= MAX && LA97_0 <= MIN)||LA97_0==MINUTES||LA97_0==MONTH||(LA97_0 >= NOT && LA97_0 <= NOT_EXISTS)||LA97_0==NOW||(LA97_0 >= PREFIXED_NAME && LA97_0 <= PREFIXED_NS)||LA97_0==RAND||(LA97_0 >= REGEX && LA97_0 <= REPLACE)||LA97_0==ROUND||(LA97_0 >= SAMETERM && LA97_0 <= SECONDS)||LA97_0==SHA1||(LA97_0 >= SHA256 && LA97_0 <= SHA512)||(LA97_0 >= STR && LA97_0 <= STRING)||(LA97_0 >= STRLANG && LA97_0 <= STRUUID)||LA97_0==SUBSTR||LA97_0==SUM||LA97_0==TIMEZONE||LA97_0==TZ||LA97_0==UCASE||LA97_0==URI||LA97_0==UUID||LA97_0==VAR||LA97_0==YEAR||(LA97_0 >= 251 && LA97_0 <= 259)) ) {
                        alt97=1;
                    }
                    switch (alt97) {
                        case 1 :
                            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:848:15: e16= expression
                            {
                            pushFollow(FOLLOW_expression_in_builtInCall6284);
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
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:852:4: ^( STRLEN e15= expression )
                    {
                    match(input,STRLEN,FOLLOW_STRLEN_in_builtInCall6307); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall6311);
                    e15=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { args.add(e15); e = new BuiltinFunctionExpression(Expression.EBuiltinType.STRLEN, args);		}

                    }
                    break;
                case 18 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:854:4: ^( UCASE e16= expression )
                    {
                    match(input,UCASE,FOLLOW_UCASE_in_builtInCall6323); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall6327);
                    e16=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { args.add(e16); e = new BuiltinFunctionExpression(Expression.EBuiltinType.UCASE, args);		}

                    }
                    break;
                case 19 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:856:4: ^( REPLACE e1= expression e2= expression e3= expression (e4= expression )? )
                    {
                    match(input,REPLACE,FOLLOW_REPLACE_in_builtInCall6339); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall6343);
                    e1=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    pushFollow(FOLLOW_expression_in_builtInCall6347);
                    e2=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    pushFollow(FOLLOW_expression_in_builtInCall6351);
                    e3=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { args.add(e1); args.add(e2); args.add(e3); }

                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:858:13: (e4= expression )?
                    int alt98=2;
                    int LA98_0 = input.LA(1);

                    if ( (LA98_0==ABS||LA98_0==AVG||(LA98_0 >= BIG_DECIMAL && LA98_0 <= BIG_INTEGER)||(LA98_0 >= BNODE && LA98_0 <= BROKEN_PLUS)||LA98_0==CEIL||LA98_0==COALESCE||LA98_0==CONCAT||LA98_0==CONTAINS||LA98_0==COUNT||(LA98_0 >= DATATYPE && LA98_0 <= DAY)||LA98_0==DOUBLE||LA98_0==ENCODE_FOR_URI||LA98_0==EXISTS||LA98_0==EXPRESSION||LA98_0==FLOOR||LA98_0==FUNCTION||LA98_0==GROUP_CONCAT||LA98_0==HOURS||(LA98_0 >= IF && LA98_0 <= IN)||LA98_0==IRI||(LA98_0 >= ISBLANK && LA98_0 <= ISURI)||(LA98_0 >= LANG && LA98_0 <= LANGMATCHES)||LA98_0==LCASE||(LA98_0 >= LOGICAL_AND && LA98_0 <= LTE)||(LA98_0 >= MAX && LA98_0 <= MIN)||LA98_0==MINUTES||LA98_0==MONTH||(LA98_0 >= NOT && LA98_0 <= NOT_EXISTS)||LA98_0==NOW||(LA98_0 >= PREFIXED_NAME && LA98_0 <= PREFIXED_NS)||LA98_0==RAND||(LA98_0 >= REGEX && LA98_0 <= REPLACE)||LA98_0==ROUND||(LA98_0 >= SAMETERM && LA98_0 <= SECONDS)||LA98_0==SHA1||(LA98_0 >= SHA256 && LA98_0 <= SHA512)||(LA98_0 >= STR && LA98_0 <= STRING)||(LA98_0 >= STRLANG && LA98_0 <= STRUUID)||LA98_0==SUBSTR||LA98_0==SUM||LA98_0==TIMEZONE||LA98_0==TZ||LA98_0==UCASE||LA98_0==URI||LA98_0==UUID||LA98_0==VAR||LA98_0==YEAR||(LA98_0 >= 251 && LA98_0 <= 259)) ) {
                        alt98=1;
                    }
                    switch (alt98) {
                        case 1 :
                            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:858:15: e4= expression
                            {
                            pushFollow(FOLLOW_expression_in_builtInCall6375);
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
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:860:4: ^( LCASE e17= expression )
                    {
                    match(input,LCASE,FOLLOW_LCASE_in_builtInCall6393); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall6397);
                    e17=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { args.add(e17); e = new BuiltinFunctionExpression(Expression.EBuiltinType.LCASE, args);		}

                    }
                    break;
                case 21 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:862:4: ^( ENCODE_FOR_URI e18= expression )
                    {
                    match(input,ENCODE_FOR_URI,FOLLOW_ENCODE_FOR_URI_in_builtInCall6409); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall6413);
                    e18=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { args.add(e18); e = new BuiltinFunctionExpression(Expression.EBuiltinType.ENCODE_FOR_URI, args);		}

                    }
                    break;
                case 22 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:864:4: ^( CONTAINS e19= expression e20= expression )
                    {
                    match(input,CONTAINS,FOLLOW_CONTAINS_in_builtInCall6425); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall6429);
                    e19=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    pushFollow(FOLLOW_expression_in_builtInCall6433);
                    e20=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { e = new BuiltinFunctionExpression(Expression.EBuiltinType.CONTAINS, e19, e20);				 }

                    }
                    break;
                case 23 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:866:4: ^( STRSTARTS e21= expression e22= expression )
                    {
                    match(input,STRSTARTS,FOLLOW_STRSTARTS_in_builtInCall6445); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall6449);
                    e21=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    pushFollow(FOLLOW_expression_in_builtInCall6453);
                    e22=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { e = new BuiltinFunctionExpression(Expression.EBuiltinType.STRSTARTS, e21, e22);				 }

                    }
                    break;
                case 24 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:868:4: ^( STRENDS e23= expression e24= expression )
                    {
                    match(input,STRENDS,FOLLOW_STRENDS_in_builtInCall6465); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall6469);
                    e23=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    pushFollow(FOLLOW_expression_in_builtInCall6473);
                    e24=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { e = new BuiltinFunctionExpression(Expression.EBuiltinType.STRENDS, e23, e24);				 }

                    }
                    break;
                case 25 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:870:4: ^( STRBEFORE e241= expression e242= expression )
                    {
                    match(input,STRBEFORE,FOLLOW_STRBEFORE_in_builtInCall6485); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall6489);
                    e241=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    pushFollow(FOLLOW_expression_in_builtInCall6493);
                    e242=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { e = new BuiltinFunctionExpression(Expression.EBuiltinType.STRBEFORE, e241, e242);				 }

                    }
                    break;
                case 26 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:872:4: ^( STRAFTER e243= expression e244= expression )
                    {
                    match(input,STRAFTER,FOLLOW_STRAFTER_in_builtInCall6505); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall6509);
                    e243=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    pushFollow(FOLLOW_expression_in_builtInCall6513);
                    e244=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { e = new BuiltinFunctionExpression(Expression.EBuiltinType.STRAFTER, e243, e244);				 }

                    }
                    break;
                case 27 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:874:4: ^( YEAR e25= expression )
                    {
                    match(input,YEAR,FOLLOW_YEAR_in_builtInCall6525); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall6529);
                    e25=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { args.add(e25); e = new BuiltinFunctionExpression(Expression.EBuiltinType.YEAR, args);		}

                    }
                    break;
                case 28 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:876:4: ^( MONTH e26= expression )
                    {
                    match(input,MONTH,FOLLOW_MONTH_in_builtInCall6541); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall6545);
                    e26=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { args.add(e26); e = new BuiltinFunctionExpression(Expression.EBuiltinType.MONTH, args);		}

                    }
                    break;
                case 29 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:878:4: ^( DAY e27= expression )
                    {
                    match(input,DAY,FOLLOW_DAY_in_builtInCall6557); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall6561);
                    e27=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { args.add(e27); e = new BuiltinFunctionExpression(Expression.EBuiltinType.DAY, args);		}

                    }
                    break;
                case 30 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:880:4: ^( HOURS e28= expression )
                    {
                    match(input,HOURS,FOLLOW_HOURS_in_builtInCall6573); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall6577);
                    e28=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { args.add(e28); e = new BuiltinFunctionExpression(Expression.EBuiltinType.HOURS, args);		}

                    }
                    break;
                case 31 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:882:4: ^( MINUTES e29= expression )
                    {
                    match(input,MINUTES,FOLLOW_MINUTES_in_builtInCall6589); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall6593);
                    e29=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { args.add(e29); e = new BuiltinFunctionExpression(Expression.EBuiltinType.MINUTES, args);		}

                    }
                    break;
                case 32 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:884:4: ^( SECONDS e30= expression )
                    {
                    match(input,SECONDS,FOLLOW_SECONDS_in_builtInCall6605); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall6609);
                    e30=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { args.add(e30); e = new BuiltinFunctionExpression(Expression.EBuiltinType.SECONDS, args);		}

                    }
                    break;
                case 33 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:886:4: ^( TIMEZONE e31= expression )
                    {
                    match(input,TIMEZONE,FOLLOW_TIMEZONE_in_builtInCall6621); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall6625);
                    e31=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { args.add(e31); e = new BuiltinFunctionExpression(Expression.EBuiltinType.TIMEZONE, args);		}

                    }
                    break;
                case 34 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:888:4: ^( TZ e32= expression )
                    {
                    match(input,TZ,FOLLOW_TZ_in_builtInCall6637); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall6641);
                    e32=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { args.add(e32); e = new BuiltinFunctionExpression(Expression.EBuiltinType.TZ, args);		}

                    }
                    break;
                case 35 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:890:4: NOW
                    {
                    match(input,NOW,FOLLOW_NOW_in_builtInCall6652); if (state.failed) return e;

                    if ( state.backtracking==0 ) { e = new BuiltinFunctionExpression(Expression.EBuiltinType.NOW); }

                    }
                    break;
                case 36 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:891:9: UUID
                    {
                    match(input,UUID,FOLLOW_UUID_in_builtInCall6664); if (state.failed) return e;

                    if ( state.backtracking==0 ) { e = new BuiltinFunctionExpression(Expression.EBuiltinType.UUID); }

                    }
                    break;
                case 37 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:892:9: STRUUID
                    {
                    match(input,STRUUID,FOLLOW_STRUUID_in_builtInCall6676); if (state.failed) return e;

                    if ( state.backtracking==0 ) { e = new BuiltinFunctionExpression(Expression.EBuiltinType.STRUUID); }

                    }
                    break;
                case 38 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:893:4: ^( MD5 e33= expression )
                    {
                    match(input,MD5,FOLLOW_MD5_in_builtInCall6685); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall6689);
                    e33=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { e = new BuiltinFunctionExpression(Expression.EBuiltinType.MD5, e33); 			}

                    }
                    break;
                case 39 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:895:4: ^( SHA1 e34= expression )
                    {
                    match(input,SHA1,FOLLOW_SHA1_in_builtInCall6701); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall6705);
                    e34=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { e = new BuiltinFunctionExpression(Expression.EBuiltinType.SHA1, e34); 			}

                    }
                    break;
                case 40 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:897:4: ^( SHA256 e36= expression )
                    {
                    match(input,SHA256,FOLLOW_SHA256_in_builtInCall6717); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall6721);
                    e36=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { e = new BuiltinFunctionExpression(Expression.EBuiltinType.SHA256, e36); 			}

                    }
                    break;
                case 41 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:899:4: ^( SHA384 e37= expression )
                    {
                    match(input,SHA384,FOLLOW_SHA384_in_builtInCall6733); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall6737);
                    e37=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { e = new BuiltinFunctionExpression(Expression.EBuiltinType.SHA384, e37); 			}

                    }
                    break;
                case 42 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:901:4: ^( SHA512 e38= expression )
                    {
                    match(input,SHA512,FOLLOW_SHA512_in_builtInCall6749); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall6753);
                    e38=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { e = new BuiltinFunctionExpression(Expression.EBuiltinType.SHA512, e38); 			}

                    }
                    break;
                case 43 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:903:4: ^( COALESCE e39= expressionList )
                    {
                    match(input,COALESCE,FOLLOW_COALESCE_in_builtInCall6765); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expressionList_in_builtInCall6769);
                    e39=expressionList();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { e = new BuiltinFunctionExpression(Expression.EBuiltinType.COALESCE, e39); 			}

                    }
                    break;
                case 44 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:905:4: ^( IF e40= expression e41= expression e42= expression )
                    {
                    match(input,IF,FOLLOW_IF_in_builtInCall6781); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall6785);
                    e40=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    pushFollow(FOLLOW_expression_in_builtInCall6789);
                    e41=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    pushFollow(FOLLOW_expression_in_builtInCall6793);
                    e42=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { e = new BuiltinFunctionExpression(Expression.EBuiltinType.IF, e40, e41, e42); 			}

                    }
                    break;
                case 45 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:907:4: ^( STRLANG e45= expression e46= expression )
                    {
                    match(input,STRLANG,FOLLOW_STRLANG_in_builtInCall6805); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall6809);
                    e45=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    pushFollow(FOLLOW_expression_in_builtInCall6813);
                    e46=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { e = new BuiltinFunctionExpression(Expression.EBuiltinType.STRLANG, e45, e46); 			}

                    }
                    break;
                case 46 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:909:4: ^( STRDT e47= expression e48= expression )
                    {
                    match(input,STRDT,FOLLOW_STRDT_in_builtInCall6825); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall6829);
                    e47=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    pushFollow(FOLLOW_expression_in_builtInCall6833);
                    e48=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { e = new BuiltinFunctionExpression(Expression.EBuiltinType.STRDT, e47, e48); 			}

                    }
                    break;
                case 47 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:911:4: ^( SAMETERM sam1= expression sam2= expression )
                    {
                    match(input,SAMETERM,FOLLOW_SAMETERM_in_builtInCall6845); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall6849);
                    sam1=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    pushFollow(FOLLOW_expression_in_builtInCall6853);
                    sam2=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { e = new BuiltinFunctionExpression(Expression.EBuiltinType.SAMETERM, sam1, sam2); 			}

                    }
                    break;
                case 48 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:913:4: ^( ISIRI isi= expression )
                    {
                    match(input,ISIRI,FOLLOW_ISIRI_in_builtInCall6865); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall6869);
                    isi=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { args.add(isi); e = new BuiltinFunctionExpression(Expression.EBuiltinType.ISIRI, args); 		}

                    }
                    break;
                case 49 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:915:4: ^( ISURI isu= expression )
                    {
                    match(input,ISURI,FOLLOW_ISURI_in_builtInCall6881); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall6885);
                    isu=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { args.add(isu); e = new BuiltinFunctionExpression(Expression.EBuiltinType.ISIRI, args); 		}

                    }
                    break;
                case 50 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:917:4: ^( ISBLANK isb= expression )
                    {
                    match(input,ISBLANK,FOLLOW_ISBLANK_in_builtInCall6897); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall6901);
                    isb=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { args.add(isb); e = new BuiltinFunctionExpression(Expression.EBuiltinType.ISBLANK, args); 	}

                    }
                    break;
                case 51 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:919:4: ^( ISLITERAL isl= expression )
                    {
                    match(input,ISLITERAL,FOLLOW_ISLITERAL_in_builtInCall6913); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall6917);
                    isl=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { args.add(isl); e = new BuiltinFunctionExpression(Expression.EBuiltinType.ISLITERAL, args); 	}

                    }
                    break;
                case 52 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:921:4: ^( ISNUMERIC e55= expression )
                    {
                    match(input,ISNUMERIC,FOLLOW_ISNUMERIC_in_builtInCall6929); if (state.failed) return e;

                    match(input, Token.DOWN, null); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_builtInCall6933);
                    e55=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input, Token.UP, null); if (state.failed) return e;


                    if ( state.backtracking==0 ) { args.add(e55); e = new BuiltinFunctionExpression(Expression.EBuiltinType.ISNUMERIC, args); 	}

                    }
                    break;
                case 53 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:923:4: r= regexExpression
                    {
                    pushFollow(FOLLOW_regexExpression_in_builtInCall6946);
                    r=regexExpression();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { e = r; }

                    }
                    break;
                case 54 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:924:4: p= existsFunc
                    {
                    pushFollow(FOLLOW_existsFunc_in_builtInCall6955);
                    p=existsFunc();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { e = new BuiltinFunctionExpression(Expression.EBuiltinType.EXISTS, p); 	}

                    }
                    break;
                case 55 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:925:4: p= notExistsFunc
                    {
                    pushFollow(FOLLOW_notExistsFunc_in_builtInCall6964);
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
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:928:1: regexExpression returns [Expression e] : ^( REGEX e1= expression e2= expression (e3= expression )? ) ;
    public final Expression regexExpression() throws RecognitionException {
        Expression e = null;


        Expression e1 =null;

        Expression e2 =null;

        Expression e3 =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:929:2: ( ^( REGEX e1= expression e2= expression (e3= expression )? ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:929:6: ^( REGEX e1= expression e2= expression (e3= expression )? )
            {
            match(input,REGEX,FOLLOW_REGEX_in_regexExpression6987); if (state.failed) return e;

            match(input, Token.DOWN, null); if (state.failed) return e;
            pushFollow(FOLLOW_expression_in_regexExpression6991);
            e1=expression();

            state._fsp--;
            if (state.failed) return e;

            pushFollow(FOLLOW_expression_in_regexExpression6995);
            e2=expression();

            state._fsp--;
            if (state.failed) return e;

            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:929:44: (e3= expression )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==ABS||LA100_0==AVG||(LA100_0 >= BIG_DECIMAL && LA100_0 <= BIG_INTEGER)||(LA100_0 >= BNODE && LA100_0 <= BROKEN_PLUS)||LA100_0==CEIL||LA100_0==COALESCE||LA100_0==CONCAT||LA100_0==CONTAINS||LA100_0==COUNT||(LA100_0 >= DATATYPE && LA100_0 <= DAY)||LA100_0==DOUBLE||LA100_0==ENCODE_FOR_URI||LA100_0==EXISTS||LA100_0==EXPRESSION||LA100_0==FLOOR||LA100_0==FUNCTION||LA100_0==GROUP_CONCAT||LA100_0==HOURS||(LA100_0 >= IF && LA100_0 <= IN)||LA100_0==IRI||(LA100_0 >= ISBLANK && LA100_0 <= ISURI)||(LA100_0 >= LANG && LA100_0 <= LANGMATCHES)||LA100_0==LCASE||(LA100_0 >= LOGICAL_AND && LA100_0 <= LTE)||(LA100_0 >= MAX && LA100_0 <= MIN)||LA100_0==MINUTES||LA100_0==MONTH||(LA100_0 >= NOT && LA100_0 <= NOT_EXISTS)||LA100_0==NOW||(LA100_0 >= PREFIXED_NAME && LA100_0 <= PREFIXED_NS)||LA100_0==RAND||(LA100_0 >= REGEX && LA100_0 <= REPLACE)||LA100_0==ROUND||(LA100_0 >= SAMETERM && LA100_0 <= SECONDS)||LA100_0==SHA1||(LA100_0 >= SHA256 && LA100_0 <= SHA512)||(LA100_0 >= STR && LA100_0 <= STRING)||(LA100_0 >= STRLANG && LA100_0 <= STRUUID)||LA100_0==SUBSTR||LA100_0==SUM||LA100_0==TIMEZONE||LA100_0==TZ||LA100_0==UCASE||LA100_0==URI||LA100_0==UUID||LA100_0==VAR||LA100_0==YEAR||(LA100_0 >= 251 && LA100_0 <= 259)) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:929:44: e3= expression
                    {
                    pushFollow(FOLLOW_expression_in_regexExpression6999);
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
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:933:1: existsFunc returns [Pattern p] : ^( EXISTS g= groupGraphPattern[false] ) ;
    public final Pattern existsFunc() throws RecognitionException {
        Pattern p = null;


        Pattern g =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:934:2: ( ^( EXISTS g= groupGraphPattern[false] ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:934:6: ^( EXISTS g= groupGraphPattern[false] )
            {
            match(input,EXISTS,FOLLOW_EXISTS_in_existsFunc7031); if (state.failed) return p;

            match(input, Token.DOWN, null); if (state.failed) return p;
            pushFollow(FOLLOW_groupGraphPattern_in_existsFunc7035);
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
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:938:1: notExistsFunc returns [Pattern p] : ^( NOT_EXISTS g= groupGraphPattern[false] ) ;
    public final Pattern notExistsFunc() throws RecognitionException {
        Pattern p = null;


        Pattern g =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:939:2: ( ^( NOT_EXISTS g= groupGraphPattern[false] ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:939:6: ^( NOT_EXISTS g= groupGraphPattern[false] )
            {
            match(input,NOT_EXISTS,FOLLOW_NOT_EXISTS_in_notExistsFunc7066); if (state.failed) return p;

            match(input, Token.DOWN, null); if (state.failed) return p;
            pushFollow(FOLLOW_groupGraphPattern_in_notExistsFunc7070);
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
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:943:1: aggregate returns [AggregateExpression a] : ( ^( COUNT ( DISTINCT )? (e1= expression | '*' ) ) | ^( SUM ( DISTINCT )? e2= expression ) | ^( MIN ( DISTINCT )? e3= expression ) | ^( MAX ( DISTINCT )? e4= expression ) | ^( AVG ( DISTINCT )? e5= expression ) | ^( SAMPLE ( DISTINCT )? e6= expression ) | ^( GROUP_CONCAT ( DISTINCT )? e7= expression ( ^( SEPARATOR s= string ) )? ) );
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
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:947:2: ( ^( COUNT ( DISTINCT )? (e1= expression | '*' ) ) | ^( SUM ( DISTINCT )? e2= expression ) | ^( MIN ( DISTINCT )? e3= expression ) | ^( MAX ( DISTINCT )? e4= expression ) | ^( AVG ( DISTINCT )? e5= expression ) | ^( SAMPLE ( DISTINCT )? e6= expression ) | ^( GROUP_CONCAT ( DISTINCT )? e7= expression ( ^( SEPARATOR s= string ) )? ) )
            int alt110=7;
            switch ( input.LA(1) ) {
            case COUNT:
                {
                alt110=1;
                }
                break;
            case SUM:
                {
                alt110=2;
                }
                break;
            case MIN:
                {
                alt110=3;
                }
                break;
            case MAX:
                {
                alt110=4;
                }
                break;
            case AVG:
                {
                alt110=5;
                }
                break;
            case SAMPLE:
                {
                alt110=6;
                }
                break;
            case GROUP_CONCAT:
                {
                alt110=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return a;}
                NoViableAltException nvae =
                    new NoViableAltException("", 110, 0, input);

                throw nvae;

            }

            switch (alt110) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:948:3: ^( COUNT ( DISTINCT )? (e1= expression | '*' ) )
                    {
                    match(input,COUNT,FOLLOW_COUNT_in_aggregate7105); if (state.failed) return a;

                    if ( state.backtracking==0 ) { a.setAggregationType(AggregateExpression.EType.COUNT);  	}

                    match(input, Token.DOWN, null); if (state.failed) return a;
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:949:4: ( DISTINCT )?
                    int alt101=2;
                    int LA101_0 = input.LA(1);

                    if ( (LA101_0==DISTINCT) ) {
                        alt101=1;
                    }
                    switch (alt101) {
                        case 1 :
                            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:949:5: DISTINCT
                            {
                            match(input,DISTINCT,FOLLOW_DISTINCT_in_aggregate7117); if (state.failed) return a;

                            if ( state.backtracking==0 ) { a.isDistinct(true);	}

                            }
                            break;

                    }


                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:950:4: (e1= expression | '*' )
                    int alt102=2;
                    int LA102_0 = input.LA(1);

                    if ( (LA102_0==ABS||LA102_0==AVG||(LA102_0 >= BIG_DECIMAL && LA102_0 <= BIG_INTEGER)||(LA102_0 >= BNODE && LA102_0 <= BROKEN_PLUS)||LA102_0==CEIL||LA102_0==COALESCE||LA102_0==CONCAT||LA102_0==CONTAINS||LA102_0==COUNT||(LA102_0 >= DATATYPE && LA102_0 <= DAY)||LA102_0==DOUBLE||LA102_0==ENCODE_FOR_URI||LA102_0==EXISTS||LA102_0==EXPRESSION||LA102_0==FLOOR||LA102_0==FUNCTION||LA102_0==GROUP_CONCAT||LA102_0==HOURS||(LA102_0 >= IF && LA102_0 <= IN)||LA102_0==IRI||(LA102_0 >= ISBLANK && LA102_0 <= ISURI)||(LA102_0 >= LANG && LA102_0 <= LANGMATCHES)||LA102_0==LCASE||(LA102_0 >= LOGICAL_AND && LA102_0 <= LTE)||(LA102_0 >= MAX && LA102_0 <= MIN)||LA102_0==MINUTES||LA102_0==MONTH||(LA102_0 >= NOT && LA102_0 <= NOT_EXISTS)||LA102_0==NOW||(LA102_0 >= PREFIXED_NAME && LA102_0 <= PREFIXED_NS)||LA102_0==RAND||(LA102_0 >= REGEX && LA102_0 <= REPLACE)||LA102_0==ROUND||(LA102_0 >= SAMETERM && LA102_0 <= SECONDS)||LA102_0==SHA1||(LA102_0 >= SHA256 && LA102_0 <= SHA512)||(LA102_0 >= STR && LA102_0 <= STRING)||(LA102_0 >= STRLANG && LA102_0 <= STRUUID)||LA102_0==SUBSTR||LA102_0==SUM||LA102_0==TIMEZONE||LA102_0==TZ||LA102_0==UCASE||LA102_0==URI||LA102_0==UUID||LA102_0==VAR||LA102_0==YEAR||(LA102_0 >= 251 && LA102_0 <= 252)||(LA102_0 >= 254 && LA102_0 <= 259)) ) {
                        alt102=1;
                    }
                    else if ( (LA102_0==253) ) {
                        int LA102_2 = input.LA(2);

                        if ( (LA102_2==DOWN) ) {
                            alt102=1;
                        }
                        else if ( (LA102_2==UP) ) {
                            alt102=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return a;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 102, 2, input);

                            throw nvae;

                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return a;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 102, 0, input);

                        throw nvae;

                    }
                    switch (alt102) {
                        case 1 :
                            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:950:6: e1= expression
                            {
                            pushFollow(FOLLOW_expression_in_aggregate7174);
                            e1=expression();

                            state._fsp--;
                            if (state.failed) return a;

                            if ( state.backtracking==0 ) { a.setArgs(e1);		}

                            }
                            break;
                        case 2 :
                            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:951:6: '*'
                            {
                            match(input,253,FOLLOW_253_in_aggregate7184); if (state.failed) return a;

                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return a;


                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:954:5: ^( SUM ( DISTINCT )? e2= expression )
                    {
                    match(input,SUM,FOLLOW_SUM_in_aggregate7204); if (state.failed) return a;

                    if ( state.backtracking==0 ) { a.setAggregationType(AggregateExpression.EType.SUM);  	}

                    match(input, Token.DOWN, null); if (state.failed) return a;
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:955:4: ( DISTINCT )?
                    int alt103=2;
                    int LA103_0 = input.LA(1);

                    if ( (LA103_0==DISTINCT) ) {
                        alt103=1;
                    }
                    switch (alt103) {
                        case 1 :
                            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:955:5: DISTINCT
                            {
                            match(input,DISTINCT,FOLLOW_DISTINCT_in_aggregate7216); if (state.failed) return a;

                            if ( state.backtracking==0 ) { a.isDistinct(true);	}

                            }
                            break;

                    }


                    pushFollow(FOLLOW_expression_in_aggregate7233);
                    e2=expression();

                    state._fsp--;
                    if (state.failed) return a;

                    if ( state.backtracking==0 ) { a.setArgs(e2);		}

                    match(input, Token.UP, null); if (state.failed) return a;


                    }
                    break;
                case 3 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:958:4: ^( MIN ( DISTINCT )? e3= expression )
                    {
                    match(input,MIN,FOLLOW_MIN_in_aggregate7246); if (state.failed) return a;

                    if ( state.backtracking==0 ) { a.setAggregationType(AggregateExpression.EType.MIN);  	}

                    match(input, Token.DOWN, null); if (state.failed) return a;
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:959:4: ( DISTINCT )?
                    int alt104=2;
                    int LA104_0 = input.LA(1);

                    if ( (LA104_0==DISTINCT) ) {
                        alt104=1;
                    }
                    switch (alt104) {
                        case 1 :
                            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:959:5: DISTINCT
                            {
                            match(input,DISTINCT,FOLLOW_DISTINCT_in_aggregate7259); if (state.failed) return a;

                            if ( state.backtracking==0 ) { a.isDistinct(true);	}

                            }
                            break;

                    }


                    pushFollow(FOLLOW_expression_in_aggregate7275);
                    e3=expression();

                    state._fsp--;
                    if (state.failed) return a;

                    if ( state.backtracking==0 ) { a.setArgs(e3);		}

                    match(input, Token.UP, null); if (state.failed) return a;


                    }
                    break;
                case 4 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:962:4: ^( MAX ( DISTINCT )? e4= expression )
                    {
                    match(input,MAX,FOLLOW_MAX_in_aggregate7288); if (state.failed) return a;

                    if ( state.backtracking==0 ) { a.setAggregationType(AggregateExpression.EType.MAX);  	}

                    match(input, Token.DOWN, null); if (state.failed) return a;
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:963:4: ( DISTINCT )?
                    int alt105=2;
                    int LA105_0 = input.LA(1);

                    if ( (LA105_0==DISTINCT) ) {
                        alt105=1;
                    }
                    switch (alt105) {
                        case 1 :
                            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:963:5: DISTINCT
                            {
                            match(input,DISTINCT,FOLLOW_DISTINCT_in_aggregate7301); if (state.failed) return a;

                            if ( state.backtracking==0 ) { a.isDistinct(true);	}

                            }
                            break;

                    }


                    pushFollow(FOLLOW_expression_in_aggregate7318);
                    e4=expression();

                    state._fsp--;
                    if (state.failed) return a;

                    if ( state.backtracking==0 ) { a.setArgs(e4);		}

                    match(input, Token.UP, null); if (state.failed) return a;


                    }
                    break;
                case 5 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:966:4: ^( AVG ( DISTINCT )? e5= expression )
                    {
                    match(input,AVG,FOLLOW_AVG_in_aggregate7331); if (state.failed) return a;

                    if ( state.backtracking==0 ) { a.setAggregationType(AggregateExpression.EType.AVG);  	}

                    match(input, Token.DOWN, null); if (state.failed) return a;
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:967:4: ( DISTINCT )?
                    int alt106=2;
                    int LA106_0 = input.LA(1);

                    if ( (LA106_0==DISTINCT) ) {
                        alt106=1;
                    }
                    switch (alt106) {
                        case 1 :
                            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:967:5: DISTINCT
                            {
                            match(input,DISTINCT,FOLLOW_DISTINCT_in_aggregate7344); if (state.failed) return a;

                            if ( state.backtracking==0 ) { a.isDistinct(true);	}

                            }
                            break;

                    }


                    pushFollow(FOLLOW_expression_in_aggregate7361);
                    e5=expression();

                    state._fsp--;
                    if (state.failed) return a;

                    if ( state.backtracking==0 ) { a.setArgs(e5);		}

                    match(input, Token.UP, null); if (state.failed) return a;


                    }
                    break;
                case 6 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:970:4: ^( SAMPLE ( DISTINCT )? e6= expression )
                    {
                    match(input,SAMPLE,FOLLOW_SAMPLE_in_aggregate7374); if (state.failed) return a;

                    if ( state.backtracking==0 ) { a.setAggregationType(AggregateExpression.EType.SAMPLE);  }

                    match(input, Token.DOWN, null); if (state.failed) return a;
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:971:4: ( DISTINCT )?
                    int alt107=2;
                    int LA107_0 = input.LA(1);

                    if ( (LA107_0==DISTINCT) ) {
                        alt107=1;
                    }
                    switch (alt107) {
                        case 1 :
                            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:971:5: DISTINCT
                            {
                            match(input,DISTINCT,FOLLOW_DISTINCT_in_aggregate7386); if (state.failed) return a;

                            if ( state.backtracking==0 ) { a.isDistinct(true);	}

                            }
                            break;

                    }


                    pushFollow(FOLLOW_expression_in_aggregate7403);
                    e6=expression();

                    state._fsp--;
                    if (state.failed) return a;

                    if ( state.backtracking==0 ) { a.setArgs(e6);		}

                    match(input, Token.UP, null); if (state.failed) return a;


                    }
                    break;
                case 7 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:974:5: ^( GROUP_CONCAT ( DISTINCT )? e7= expression ( ^( SEPARATOR s= string ) )? )
                    {
                    match(input,GROUP_CONCAT,FOLLOW_GROUP_CONCAT_in_aggregate7417); if (state.failed) return a;

                    if ( state.backtracking==0 ) { a.setAggregationType(AggregateExpression.EType.GROUP_CONCAT); }

                    match(input, Token.DOWN, null); if (state.failed) return a;
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:975:4: ( DISTINCT )?
                    int alt108=2;
                    int LA108_0 = input.LA(1);

                    if ( (LA108_0==DISTINCT) ) {
                        alt108=1;
                    }
                    switch (alt108) {
                        case 1 :
                            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:975:5: DISTINCT
                            {
                            match(input,DISTINCT,FOLLOW_DISTINCT_in_aggregate7429); if (state.failed) return a;

                            if ( state.backtracking==0 ) { a.isDistinct(true);	}

                            }
                            break;

                    }


                    pushFollow(FOLLOW_expression_in_aggregate7444);
                    e7=expression();

                    state._fsp--;
                    if (state.failed) return a;

                    if ( state.backtracking==0 ) { a.setArgs(e7);		}

                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:977:4: ( ^( SEPARATOR s= string ) )?
                    int alt109=2;
                    int LA109_0 = input.LA(1);

                    if ( (LA109_0==SEPARATOR) ) {
                        alt109=1;
                    }
                    switch (alt109) {
                        case 1 :
                            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:977:5: ^( SEPARATOR s= string )
                            {
                            match(input,SEPARATOR,FOLLOW_SEPARATOR_in_aggregate7455); if (state.failed) return a;

                            match(input, Token.DOWN, null); if (state.failed) return a;
                            pushFollow(FOLLOW_string_in_aggregate7459);
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
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:981:1: iRIFunction returns [FunctionCall f] : ^( FUNCTION i= iRIref (a= argList )? ) ;
    public final FunctionCall iRIFunction() throws RecognitionException {
        FunctionCall f = null;


        IRI i =null;

        List<Expression> a =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:982:2: ( ^( FUNCTION i= iRIref (a= argList )? ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:982:6: ^( FUNCTION i= iRIref (a= argList )? )
            {
            match(input,FUNCTION,FOLLOW_FUNCTION_in_iRIFunction7488); if (state.failed) return f;

            match(input, Token.DOWN, null); if (state.failed) return f;
            pushFollow(FOLLOW_iRIref_in_iRIFunction7498);
            i=iRIref();

            state._fsp--;
            if (state.failed) return f;

            if ( state.backtracking==0 ) { f = new FunctionCall(i); }

            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:984:5: (a= argList )?
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==ABS||LA111_0==AVG||(LA111_0 >= BIG_DECIMAL && LA111_0 <= BIG_INTEGER)||(LA111_0 >= BNODE && LA111_0 <= BROKEN_PLUS)||LA111_0==CEIL||LA111_0==COALESCE||LA111_0==CONCAT||LA111_0==CONTAINS||LA111_0==COUNT||(LA111_0 >= DATATYPE && LA111_0 <= DAY)||LA111_0==DISTINCT||LA111_0==DOUBLE||LA111_0==ENCODE_FOR_URI||LA111_0==EXISTS||LA111_0==EXPRESSION||LA111_0==FLOOR||LA111_0==FUNCTION||LA111_0==GROUP_CONCAT||LA111_0==HOURS||(LA111_0 >= IF && LA111_0 <= IN)||LA111_0==IRI||(LA111_0 >= ISBLANK && LA111_0 <= ISURI)||(LA111_0 >= LANG && LA111_0 <= LANGMATCHES)||LA111_0==LCASE||(LA111_0 >= LOGICAL_AND && LA111_0 <= LTE)||(LA111_0 >= MAX && LA111_0 <= MIN)||LA111_0==MINUTES||LA111_0==MONTH||LA111_0==NIL||(LA111_0 >= NOT && LA111_0 <= NOT_EXISTS)||LA111_0==NOW||(LA111_0 >= PREFIXED_NAME && LA111_0 <= PREFIXED_NS)||LA111_0==RAND||(LA111_0 >= REGEX && LA111_0 <= REPLACE)||LA111_0==ROUND||(LA111_0 >= SAMETERM && LA111_0 <= SECONDS)||LA111_0==SHA1||(LA111_0 >= SHA256 && LA111_0 <= SHA512)||(LA111_0 >= STR && LA111_0 <= STRING)||(LA111_0 >= STRLANG && LA111_0 <= STRUUID)||LA111_0==SUBSTR||LA111_0==SUM||LA111_0==TIMEZONE||LA111_0==TZ||LA111_0==UCASE||LA111_0==URI||LA111_0==UUID||LA111_0==VAR||LA111_0==YEAR||(LA111_0 >= 251 && LA111_0 <= 259)) ) {
                alt111=1;
            }
            switch (alt111) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:984:6: a= argList
                    {
                    pushFollow(FOLLOW_argList_in_iRIFunction7510);
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
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:988:1: rDFLiteral returns [StringLiteral sl] : s= string (l= LANGTAG | ( '^^' i= iRIref ) )? ;
    public final StringLiteral rDFLiteral() throws RecognitionException {
        StringLiteral sl = null;


        XTree l=null;
        String s =null;

        IRI i =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:989:2: (s= string (l= LANGTAG | ( '^^' i= iRIref ) )? )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:989:6: s= string (l= LANGTAG | ( '^^' i= iRIref ) )?
            {
            pushFollow(FOLLOW_string_in_rDFLiteral7542);
            s=string();

            state._fsp--;
            if (state.failed) return sl;

            if ( state.backtracking==0 ) { sl = new StringLiteral(s);     }

            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:990:3: (l= LANGTAG | ( '^^' i= iRIref ) )?
            int alt112=3;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==LANGTAG) ) {
                alt112=1;
            }
            else if ( (LA112_0==262) ) {
                alt112=2;
            }
            switch (alt112) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:990:5: l= LANGTAG
                    {
                    l=(XTree)match(input,LANGTAG,FOLLOW_LANGTAG_in_rDFLiteral7557); if (state.failed) return sl;

                    if ( state.backtracking==0 ) { sl.setLanguage((l!=null?l.getText():null));        }

                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:991:5: ( '^^' i= iRIref )
                    {
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:991:5: ( '^^' i= iRIref )
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:991:7: '^^' i= iRIref
                    {
                    match(input,262,FOLLOW_262_in_rDFLiteral7571); if (state.failed) return sl;

                    pushFollow(FOLLOW_iRIref_in_rDFLiteral7575);
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
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:995:1: numericLiteral returns [Constant n] : (n1= numericLiteralUnsigned |n2= numericLiteralPositive |n3= numericLiteralNegative );
    public final Constant numericLiteral() throws RecognitionException {
        Constant n = null;


        Constant n1 =null;

        Constant n2 =null;

        Constant n3 =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:996:2: (n1= numericLiteralUnsigned |n2= numericLiteralPositive |n3= numericLiteralNegative )
            int alt113=3;
            switch ( input.LA(1) ) {
            case BIG_INTEGER:
                {
                int LA113_1 = input.LA(2);

                if ( (LA113_1==DOWN) ) {
                    switch ( input.LA(3) ) {
                    case INTEGER:
                        {
                        alt113=1;
                        }
                        break;
                    case INTEGER_POSITIVE:
                        {
                        alt113=2;
                        }
                        break;
                    case INTEGER_NEGATIVE:
                        {
                        alt113=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return n;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 113, 4, input);

                        throw nvae;

                    }

                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 113, 1, input);

                    throw nvae;

                }
                }
                break;
            case BIG_DECIMAL:
                {
                int LA113_2 = input.LA(2);

                if ( (LA113_2==DOWN) ) {
                    switch ( input.LA(3) ) {
                    case DECIMAL:
                        {
                        alt113=1;
                        }
                        break;
                    case DECIMAL_POSITIVE:
                        {
                        alt113=2;
                        }
                        break;
                    case DECIMAL_NEGATIVE:
                        {
                        alt113=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return n;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 113, 5, input);

                        throw nvae;

                    }

                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 113, 2, input);

                    throw nvae;

                }
                }
                break;
            case DOUBLE:
                {
                int LA113_3 = input.LA(2);

                if ( (LA113_3==DOWN) ) {
                    switch ( input.LA(3) ) {
                    case DOUBLE:
                        {
                        alt113=1;
                        }
                        break;
                    case DOUBLE_POSITIVE:
                        {
                        alt113=2;
                        }
                        break;
                    case DOUBLE_NEGATIVE:
                        {
                        alt113=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return n;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 113, 6, input);

                        throw nvae;

                    }

                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 113, 3, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 113, 0, input);

                throw nvae;

            }

            switch (alt113) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:996:6: n1= numericLiteralUnsigned
                    {
                    pushFollow(FOLLOW_numericLiteralUnsigned_in_numericLiteral7606);
                    n1=numericLiteralUnsigned();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = n1; }

                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:997:5: n2= numericLiteralPositive
                    {
                    pushFollow(FOLLOW_numericLiteralPositive_in_numericLiteral7616);
                    n2=numericLiteralPositive();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = n2; }

                    }
                    break;
                case 3 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:998:5: n3= numericLiteralNegative
                    {
                    pushFollow(FOLLOW_numericLiteralNegative_in_numericLiteral7626);
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
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:1001:1: numericLiteralUnsigned returns [Constant c] : ( ^( BIG_INTEGER i= INTEGER ) | ^( BIG_DECIMAL d1= DECIMAL ) | ^( DOUBLE d2= DOUBLE ) );
    public final Constant numericLiteralUnsigned() throws RecognitionException {
        Constant c = null;


        XTree i=null;
        XTree d1=null;
        XTree d2=null;

        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:1002:2: ( ^( BIG_INTEGER i= INTEGER ) | ^( BIG_DECIMAL d1= DECIMAL ) | ^( DOUBLE d2= DOUBLE ) )
            int alt114=3;
            switch ( input.LA(1) ) {
            case BIG_INTEGER:
                {
                alt114=1;
                }
                break;
            case BIG_DECIMAL:
                {
                alt114=2;
                }
                break;
            case DOUBLE:
                {
                alt114=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return c;}
                NoViableAltException nvae =
                    new NoViableAltException("", 114, 0, input);

                throw nvae;

            }

            switch (alt114) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:1002:6: ^( BIG_INTEGER i= INTEGER )
                    {
                    match(input,BIG_INTEGER,FOLLOW_BIG_INTEGER_in_numericLiteralUnsigned7648); if (state.failed) return c;

                    match(input, Token.DOWN, null); if (state.failed) return c;
                    i=(XTree)match(input,INTEGER,FOLLOW_INTEGER_in_numericLiteralUnsigned7653); if (state.failed) return c;

                    match(input, Token.UP, null); if (state.failed) return c;


                    if ( state.backtracking==0 ) { c = new Constant((i!=null?i.getText():null), new BigInteger((i!=null?i.getText():null)));		}

                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:1003:5: ^( BIG_DECIMAL d1= DECIMAL )
                    {
                    match(input,BIG_DECIMAL,FOLLOW_BIG_DECIMAL_in_numericLiteralUnsigned7669); if (state.failed) return c;

                    match(input, Token.DOWN, null); if (state.failed) return c;
                    d1=(XTree)match(input,DECIMAL,FOLLOW_DECIMAL_in_numericLiteralUnsigned7673); if (state.failed) return c;

                    match(input, Token.UP, null); if (state.failed) return c;


                    if ( state.backtracking==0 ) { c = new Constant((d1!=null?d1.getText():null), new BigDecimal((d1!=null?d1.getText():null)));	}

                    }
                    break;
                case 3 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:1004:5: ^( DOUBLE d2= DOUBLE )
                    {
                    match(input,DOUBLE,FOLLOW_DOUBLE_in_numericLiteralUnsigned7688); if (state.failed) return c;

                    match(input, Token.DOWN, null); if (state.failed) return c;
                    d2=(XTree)match(input,DOUBLE,FOLLOW_DOUBLE_in_numericLiteralUnsigned7693); if (state.failed) return c;

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
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:1007:1: numericLiteralPositive returns [Constant c] : ( ^( BIG_INTEGER i= INTEGER_POSITIVE ) | ^( BIG_DECIMAL d1= DECIMAL_POSITIVE ) | ^( DOUBLE d2= DOUBLE_POSITIVE ) );
    public final Constant numericLiteralPositive() throws RecognitionException {
        Constant c = null;


        XTree i=null;
        XTree d1=null;
        XTree d2=null;

        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:1008:2: ( ^( BIG_INTEGER i= INTEGER_POSITIVE ) | ^( BIG_DECIMAL d1= DECIMAL_POSITIVE ) | ^( DOUBLE d2= DOUBLE_POSITIVE ) )
            int alt115=3;
            switch ( input.LA(1) ) {
            case BIG_INTEGER:
                {
                alt115=1;
                }
                break;
            case BIG_DECIMAL:
                {
                alt115=2;
                }
                break;
            case DOUBLE:
                {
                alt115=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return c;}
                NoViableAltException nvae =
                    new NoViableAltException("", 115, 0, input);

                throw nvae;

            }

            switch (alt115) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:1008:6: ^( BIG_INTEGER i= INTEGER_POSITIVE )
                    {
                    match(input,BIG_INTEGER,FOLLOW_BIG_INTEGER_in_numericLiteralPositive7723); if (state.failed) return c;

                    match(input, Token.DOWN, null); if (state.failed) return c;
                    i=(XTree)match(input,INTEGER_POSITIVE,FOLLOW_INTEGER_POSITIVE_in_numericLiteralPositive7728); if (state.failed) return c;

                    match(input, Token.UP, null); if (state.failed) return c;


                    if ( state.backtracking==0 ) { c = new Constant((i!=null?i.getText():null), new BigInteger((i!=null?i.getText():null).substring(1)));		}

                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:1009:5: ^( BIG_DECIMAL d1= DECIMAL_POSITIVE )
                    {
                    match(input,BIG_DECIMAL,FOLLOW_BIG_DECIMAL_in_numericLiteralPositive7741); if (state.failed) return c;

                    match(input, Token.DOWN, null); if (state.failed) return c;
                    d1=(XTree)match(input,DECIMAL_POSITIVE,FOLLOW_DECIMAL_POSITIVE_in_numericLiteralPositive7745); if (state.failed) return c;

                    match(input, Token.UP, null); if (state.failed) return c;


                    if ( state.backtracking==0 ) { c = new Constant((d1!=null?d1.getText():null), new BigDecimal((d1!=null?d1.getText():null).substring(1)));	}

                    }
                    break;
                case 3 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:1010:5: ^( DOUBLE d2= DOUBLE_POSITIVE )
                    {
                    match(input,DOUBLE,FOLLOW_DOUBLE_in_numericLiteralPositive7758); if (state.failed) return c;

                    match(input, Token.DOWN, null); if (state.failed) return c;
                    d2=(XTree)match(input,DOUBLE_POSITIVE,FOLLOW_DOUBLE_POSITIVE_in_numericLiteralPositive7763); if (state.failed) return c;

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
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:1013:1: numericLiteralNegative returns [Constant c] : ( ^( BIG_INTEGER i= INTEGER_NEGATIVE ) | ^( BIG_DECIMAL d1= DECIMAL_NEGATIVE ) | ^( DOUBLE d2= DOUBLE_NEGATIVE ) );
    public final Constant numericLiteralNegative() throws RecognitionException {
        Constant c = null;


        XTree i=null;
        XTree d1=null;
        XTree d2=null;

        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:1014:2: ( ^( BIG_INTEGER i= INTEGER_NEGATIVE ) | ^( BIG_DECIMAL d1= DECIMAL_NEGATIVE ) | ^( DOUBLE d2= DOUBLE_NEGATIVE ) )
            int alt116=3;
            switch ( input.LA(1) ) {
            case BIG_INTEGER:
                {
                alt116=1;
                }
                break;
            case BIG_DECIMAL:
                {
                alt116=2;
                }
                break;
            case DOUBLE:
                {
                alt116=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return c;}
                NoViableAltException nvae =
                    new NoViableAltException("", 116, 0, input);

                throw nvae;

            }

            switch (alt116) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:1014:6: ^( BIG_INTEGER i= INTEGER_NEGATIVE )
                    {
                    match(input,BIG_INTEGER,FOLLOW_BIG_INTEGER_in_numericLiteralNegative7788); if (state.failed) return c;

                    match(input, Token.DOWN, null); if (state.failed) return c;
                    i=(XTree)match(input,INTEGER_NEGATIVE,FOLLOW_INTEGER_NEGATIVE_in_numericLiteralNegative7793); if (state.failed) return c;

                    match(input, Token.UP, null); if (state.failed) return c;


                    if ( state.backtracking==0 ) { c = new Constant((i!=null?i.getText():null), new BigInteger((i!=null?i.getText():null)));		}

                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:1015:5: ^( BIG_DECIMAL d1= DECIMAL_NEGATIVE )
                    {
                    match(input,BIG_DECIMAL,FOLLOW_BIG_DECIMAL_in_numericLiteralNegative7806); if (state.failed) return c;

                    match(input, Token.DOWN, null); if (state.failed) return c;
                    d1=(XTree)match(input,DECIMAL_NEGATIVE,FOLLOW_DECIMAL_NEGATIVE_in_numericLiteralNegative7810); if (state.failed) return c;

                    match(input, Token.UP, null); if (state.failed) return c;


                    if ( state.backtracking==0 ) { c = new Constant((d1!=null?d1.getText():null), new BigDecimal((d1!=null?d1.getText():null)));	}

                    }
                    break;
                case 3 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:1016:5: ^( DOUBLE d2= DOUBLE_NEGATIVE )
                    {
                    match(input,DOUBLE,FOLLOW_DOUBLE_in_numericLiteralNegative7823); if (state.failed) return c;

                    match(input, Token.DOWN, null); if (state.failed) return c;
                    d2=(XTree)match(input,DOUBLE_NEGATIVE,FOLLOW_DOUBLE_NEGATIVE_in_numericLiteralNegative7828); if (state.failed) return c;

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
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:1019:1: booleanLiteral returns [Boolean b] : ( ^( BOOLEAN TRUE ) | ^( BOOLEAN FALSE ) );
    public final Boolean booleanLiteral() throws RecognitionException {
        Boolean b = null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:1020:2: ( ^( BOOLEAN TRUE ) | ^( BOOLEAN FALSE ) )
            int alt117=2;
            int LA117_0 = input.LA(1);

            if ( (LA117_0==BOOLEAN) ) {
                int LA117_1 = input.LA(2);

                if ( (LA117_1==DOWN) ) {
                    int LA117_2 = input.LA(3);

                    if ( (LA117_2==TRUE) ) {
                        alt117=1;
                    }
                    else if ( (LA117_2==FALSE) ) {
                        alt117=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return b;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 117, 2, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return b;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 117, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return b;}
                NoViableAltException nvae =
                    new NoViableAltException("", 117, 0, input);

                throw nvae;

            }
            switch (alt117) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:1020:6: ^( BOOLEAN TRUE )
                    {
                    match(input,BOOLEAN,FOLLOW_BOOLEAN_in_booleanLiteral7852); if (state.failed) return b;

                    match(input, Token.DOWN, null); if (state.failed) return b;
                    match(input,TRUE,FOLLOW_TRUE_in_booleanLiteral7854); if (state.failed) return b;

                    match(input, Token.UP, null); if (state.failed) return b;


                    if ( state.backtracking==0 ) { b = Boolean.TRUE;  }

                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:1021:6: ^( BOOLEAN FALSE )
                    {
                    match(input,BOOLEAN,FOLLOW_BOOLEAN_in_booleanLiteral7869); if (state.failed) return b;

                    match(input, Token.DOWN, null); if (state.failed) return b;
                    match(input,FALSE,FOLLOW_FALSE_in_booleanLiteral7871); if (state.failed) return b;

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
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:1024:1: string returns [String s] : ( ^( STRING s1= STRING_LITERAL1 ) | ^( STRING s2= STRING_LITERAL2 ) | ^( STRING s3= STRING_LITERAL_LONG1 ) | ^( STRING s4= STRING_LITERAL_LONG2 ) );
    public final String string() throws RecognitionException {
        String s = null;


        XTree s1=null;
        XTree s2=null;
        XTree s3=null;
        XTree s4=null;

        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:1025:2: ( ^( STRING s1= STRING_LITERAL1 ) | ^( STRING s2= STRING_LITERAL2 ) | ^( STRING s3= STRING_LITERAL_LONG1 ) | ^( STRING s4= STRING_LITERAL_LONG2 ) )
            int alt118=4;
            int LA118_0 = input.LA(1);

            if ( (LA118_0==STRING) ) {
                int LA118_1 = input.LA(2);

                if ( (LA118_1==DOWN) ) {
                    switch ( input.LA(3) ) {
                    case STRING_LITERAL1:
                        {
                        alt118=1;
                        }
                        break;
                    case STRING_LITERAL2:
                        {
                        alt118=2;
                        }
                        break;
                    case STRING_LITERAL_LONG1:
                        {
                        alt118=3;
                        }
                        break;
                    case STRING_LITERAL_LONG2:
                        {
                        alt118=4;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return s;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 118, 2, input);

                        throw nvae;

                    }

                }
                else {
                    if (state.backtracking>0) {state.failed=true; return s;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 118, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return s;}
                NoViableAltException nvae =
                    new NoViableAltException("", 118, 0, input);

                throw nvae;

            }
            switch (alt118) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:1025:4: ^( STRING s1= STRING_LITERAL1 )
                    {
                    match(input,STRING,FOLLOW_STRING_in_string7894); if (state.failed) return s;

                    match(input, Token.DOWN, null); if (state.failed) return s;
                    s1=(XTree)match(input,STRING_LITERAL1,FOLLOW_STRING_LITERAL1_in_string7898); if (state.failed) return s;

                    match(input, Token.UP, null); if (state.failed) return s;


                    if ( state.backtracking==0 ) { s = new String((s1!=null?s1.getText():null)); }

                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:1026:4: ^( STRING s2= STRING_LITERAL2 )
                    {
                    match(input,STRING,FOLLOW_STRING_in_string7915); if (state.failed) return s;

                    match(input, Token.DOWN, null); if (state.failed) return s;
                    s2=(XTree)match(input,STRING_LITERAL2,FOLLOW_STRING_LITERAL2_in_string7919); if (state.failed) return s;

                    match(input, Token.UP, null); if (state.failed) return s;


                    if ( state.backtracking==0 ) { s = new String((s2!=null?s2.getText():null)); }

                    }
                    break;
                case 3 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:1027:4: ^( STRING s3= STRING_LITERAL_LONG1 )
                    {
                    match(input,STRING,FOLLOW_STRING_in_string7936); if (state.failed) return s;

                    match(input, Token.DOWN, null); if (state.failed) return s;
                    s3=(XTree)match(input,STRING_LITERAL_LONG1,FOLLOW_STRING_LITERAL_LONG1_in_string7940); if (state.failed) return s;

                    match(input, Token.UP, null); if (state.failed) return s;


                    if ( state.backtracking==0 ) { s = new String((s3!=null?s3.getText():null)); }

                    }
                    break;
                case 4 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:1028:4: ^( STRING s4= STRING_LITERAL_LONG2 )
                    {
                    match(input,STRING,FOLLOW_STRING_in_string7952); if (state.failed) return s;

                    match(input, Token.DOWN, null); if (state.failed) return s;
                    s4=(XTree)match(input,STRING_LITERAL_LONG2,FOLLOW_STRING_LITERAL_LONG2_in_string7956); if (state.failed) return s;

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
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:1031:1: iRIref returns [IRI r] : ( ^( IRI i= IRI_REF ) |p= prefixedName );
    public final IRI iRIref() throws RecognitionException {
        IRI r = null;


        XTree i=null;
        String p =null;


        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:1032:2: ( ^( IRI i= IRI_REF ) |p= prefixedName )
            int alt119=2;
            int LA119_0 = input.LA(1);

            if ( (LA119_0==IRI) ) {
                alt119=1;
            }
            else if ( ((LA119_0 >= PREFIXED_NAME && LA119_0 <= PREFIXED_NS)) ) {
                alt119=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return r;}
                NoViableAltException nvae =
                    new NoViableAltException("", 119, 0, input);

                throw nvae;

            }
            switch (alt119) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:1032:4: ^( IRI i= IRI_REF )
                    {
                    match(input,IRI,FOLLOW_IRI_in_iRIref7980); if (state.failed) return r;

                    match(input, Token.DOWN, null); if (state.failed) return r;
                    i=(XTree)match(input,IRI_REF,FOLLOW_IRI_REF_in_iRIref7984); if (state.failed) return r;

                    match(input, Token.UP, null); if (state.failed) return r;


                    if ( state.backtracking==0 ) { r = new IRI((i!=null?i.getText():null).substring(1, (i!=null?i.getText():null).length()-1)); 	}

                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:1033:6: p= prefixedName
                    {
                    pushFollow(FOLLOW_prefixedName_in_iRIref7996);
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
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:1036:1: prefixedName returns [String s] : ( ^( PREFIXED_NAME n1= PNAME_LN ) | ^( PREFIXED_NS n2= PNAME_NS ) );
    public final String prefixedName() throws RecognitionException {
        String s = null;


        XTree n1=null;
        XTree n2=null;

        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:1037:2: ( ^( PREFIXED_NAME n1= PNAME_LN ) | ^( PREFIXED_NS n2= PNAME_NS ) )
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( (LA120_0==PREFIXED_NAME) ) {
                alt120=1;
            }
            else if ( (LA120_0==PREFIXED_NS) ) {
                alt120=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return s;}
                NoViableAltException nvae =
                    new NoViableAltException("", 120, 0, input);

                throw nvae;

            }
            switch (alt120) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:1037:4: ^( PREFIXED_NAME n1= PNAME_LN )
                    {
                    match(input,PREFIXED_NAME,FOLLOW_PREFIXED_NAME_in_prefixedName8018); if (state.failed) return s;

                    match(input, Token.DOWN, null); if (state.failed) return s;
                    n1=(XTree)match(input,PNAME_LN,FOLLOW_PNAME_LN_in_prefixedName8022); if (state.failed) return s;

                    match(input, Token.UP, null); if (state.failed) return s;


                    if ( state.backtracking==0 ) { s = new String(n1.getText()); }

                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:1038:4: ^( PREFIXED_NS n2= PNAME_NS )
                    {
                    match(input,PREFIXED_NS,FOLLOW_PREFIXED_NS_in_prefixedName8031); if (state.failed) return s;

                    match(input, Token.DOWN, null); if (state.failed) return s;
                    n2=(XTree)match(input,PNAME_NS,FOLLOW_PNAME_NS_in_prefixedName8035); if (state.failed) return s;

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
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:1041:1: blankNode returns [BlankNode bn] : (b= BLANK_NODE_LABEL | ^( ANNON t= OPEN_SQ_BRACKET ) );
    public final BlankNode blankNode() throws RecognitionException {
        BlankNode bn = null;


        XTree b=null;
        XTree t=null;

        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:1042:2: (b= BLANK_NODE_LABEL | ^( ANNON t= OPEN_SQ_BRACKET ) )
            int alt121=2;
            int LA121_0 = input.LA(1);

            if ( (LA121_0==BLANK_NODE_LABEL) ) {
                alt121=1;
            }
            else if ( (LA121_0==ANNON) ) {
                alt121=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return bn;}
                NoViableAltException nvae =
                    new NoViableAltException("", 121, 0, input);

                throw nvae;

            }
            switch (alt121) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:1042:6: b= BLANK_NODE_LABEL
                    {
                    b=(XTree)match(input,BLANK_NODE_LABEL,FOLLOW_BLANK_NODE_LABEL_in_blankNode8059); if (state.failed) return bn;

                    if ( state.backtracking==0 ) { bn = new BlankNode(b.getText()); }

                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:1043:6: ^( ANNON t= OPEN_SQ_BRACKET )
                    {
                    match(input,ANNON,FOLLOW_ANNON_in_blankNode8070); if (state.failed) return bn;

                    match(input, Token.DOWN, null); if (state.failed) return bn;
                    t=(XTree)match(input,OPEN_SQ_BRACKET,FOLLOW_OPEN_SQ_BRACKET_in_blankNode8074); if (state.failed) return bn;

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

    // $ANTLR start synpred1_IbmSparqlAstWalker
    public final void synpred1_IbmSparqlAstWalker_fragment() throws RecognitionException {
        // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:453:25: ( NIL )
        // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:453:27: NIL
        {
        match(input,NIL,FOLLOW_NIL_in_synpred1_IbmSparqlAstWalker3022); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred1_IbmSparqlAstWalker

    // $ANTLR start synpred2_IbmSparqlAstWalker
    public final void synpred2_IbmSparqlAstWalker_fragment() throws RecognitionException {
        // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:453:81: ( NIL )
        // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstWalker.g:453:83: NIL
        {
        match(input,NIL,FOLLOW_NIL_in_synpred2_IbmSparqlAstWalker3044); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred2_IbmSparqlAstWalker

    // Delegated rules

    public final boolean synpred1_IbmSparqlAstWalker() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_IbmSparqlAstWalker_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_IbmSparqlAstWalker() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_IbmSparqlAstWalker_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA17 dfa17 = new DFA17(this);
    static final String DFA17_eotS =
        "\46\uffff";
    static final String DFA17_eofS =
        "\46\uffff";
    static final String DFA17_minS =
        "\1\57\1\uffff\2\2\1\uffff\1\116\1\3\1\2\1\147\4\2\1\151\1\u009c"+
        "\1\u009d\1\147\3\3\3\2\3\3\1\151\1\u009c\1\u009d\4\3\1\57\4\3";
    static final String DFA17_maxS =
        "\1\u00f3\1\uffff\2\2\1\uffff\1\116\1\u00da\1\2\1\u00a8\4\2\1\151"+
        "\1\u009c\1\u009d\1\u00a8\3\3\3\2\3\3\1\151\1\u009c\1\u009d\1\116"+
        "\3\3\1\u00f3\4\3";
    static final String DFA17_acceptS =
        "\1\uffff\1\1\2\uffff\1\2\41\uffff";
    static final String DFA17_specialS =
        "\46\uffff}>";
    static final String[] DFA17_transitionS = {
            "\1\2\123\uffff\1\4\125\uffff\2\1\30\uffff\1\3",
            "",
            "\1\5",
            "\1\6",
            "",
            "\1\7",
            "\1\1\123\uffff\1\1\174\uffff\1\1\4\uffff\2\4",
            "\1\10",
            "\1\11\37\uffff\1\14\37\uffff\1\12\1\13",
            "\1\15",
            "\1\16",
            "\1\17",
            "\1\20",
            "\1\21",
            "\1\22",
            "\1\23",
            "\1\24\77\uffff\1\25\1\26",
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
            "\1\41\112\uffff\1\7",
            "\1\42",
            "\1\43",
            "\1\44",
            "\1\2\123\uffff\1\4\157\uffff\1\3",
            "\1\45",
            "\1\45",
            "\1\45",
            "\1\35"
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "179:20: ( ( constructTemplate[$cq] (d= dataset )* (w= whereClause ) (m= solutionModifier ) ) | ( (d= dataset )* ( ^( WHERE triplesTemplate[$cq,p] ) )? (m= solutionModifier ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_ROOT_in_queryUnit83 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_query_in_queryUnit87 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_QUERY_in_query115 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_prologue_in_query125 = new BitSet(new long[]{0x0200010000001000L,0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_selectQuery_in_query144 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_bindingsClause_in_query162 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_constructQuery_in_query219 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_describeQuery_in_query235 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_askQuery_in_query251 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PROLOGUE_in_prologue307 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_baseDecl_in_prologue309 = new BitSet(new long[]{0x0000000000008008L,0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_prefixDecl_in_prologue314 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_BASE_in_baseDecl345 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_iRIref_in_baseDecl349 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PREFIX_in_prefixDecl377 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_prefixedName_in_prefixDecl381 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L,0x0000018000000000L});
    public static final BitSet FOLLOW_iRIref_in_prefixDecl386 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SELECT_in_selectQuery424 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_selectClause_in_selectQuery434 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000000L,0x0000000000000008L,0x0008000000000000L});
    public static final BitSet FOLLOW_dataset_in_selectQuery450 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000000L,0x0000000000000008L,0x0008000000000000L});
    public static final BitSet FOLLOW_whereClause_in_selectQuery469 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_solutionModifier_in_selectQuery485 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DATASET_in_dataset524 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_datasetClause_in_dataset533 = new BitSet(new long[]{0x0000000000000008L,0x0000000000004000L});
    public static final BitSet FOLLOW_SUB_SELECT_in_subSelect567 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_selectClause_in_subSelect576 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L,0x0008000000000000L});
    public static final BitSet FOLLOW_whereClause_in_subSelect592 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_solutionModifier_in_subSelect608 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_inlineData_in_subSelect634 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TYPE_in_selectClause680 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DISTINCT_in_selectClause684 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_REDUCED_in_selectClause696 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PVARS_in_selectClause725 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_var_in_selectClause733 = new BitSet(new long[]{0x0000000000000408L,0x0000000000000080L,0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_expVar_in_selectClause755 = new BitSet(new long[]{0x0000000000000408L,0x0000000000000080L,0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_fexp_in_selectClause778 = new BitSet(new long[]{0x0000000000000408L,0x0000000000000080L,0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_253_in_selectClause818 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AS_in_expVar849 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_var_in_expVar853 = new BitSet(new long[]{0x20030A4427C32020L,0xDE587C80D040A250L,0x41D6818000005815L,0xFA00450A00ABC3F7L,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_expVar857 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXP_in_fexp875 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_fexp879 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONSTRUCT_in_constructQuery910 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_constructTemplate_in_constructQuery917 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000000L,0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_dataset_in_constructQuery931 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000000L,0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_whereClause_in_constructQuery954 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_solutionModifier_in_constructQuery973 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_dataset_in_constructQuery1013 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000000L,0x0000000000000008L,0x0008000000000000L});
    public static final BitSet FOLLOW_WHERE_in_constructQuery1035 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_triplesTemplate_in_constructQuery1101 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_solutionModifier_in_constructQuery1181 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DESCRIBE_in_describeQuery1239 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_varOrIRIref2_in_describeQuery1248 = new BitSet(new long[]{0x0000000000000000L,0x0000008000004000L,0x0000018000000008L,0x0008400000000000L});
    public static final BitSet FOLLOW_253_in_describeQuery1259 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L,0x0000000000000008L,0x0008000000000000L});
    public static final BitSet FOLLOW_datasetClause_in_describeQuery1274 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L,0x0000000000000008L,0x0008000000000000L});
    public static final BitSet FOLLOW_whereClause_in_describeQuery1295 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_solutionModifier_in_describeQuery1315 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ASK_in_askQuery1356 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_datasetClause_in_askQuery1364 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L,0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_whereClause_in_askQuery1380 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FROM_in_datasetClause1415 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_defaultGraphClause_in_datasetClause1422 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_namedGraphClause_in_datasetClause1436 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_sourceSelector_in_defaultGraphClause1469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAMED_in_namedGraphClause1491 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_sourceSelector_in_namedGraphClause1495 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_iRIref_in_sourceSelector1521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHERE_in_whereClause1544 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_groupGraphPattern_in_whereClause1548 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MODIFIERS_in_solutionModifier1579 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_groupClause_in_solutionModifier1588 = new BitSet(new long[]{0x0000000000000008L,0x0080000004000000L,0x0000000000820000L});
    public static final BitSet FOLLOW_havingClause_in_solutionModifier1605 = new BitSet(new long[]{0x0000000000000008L,0x0080000000000000L,0x0000000000820000L});
    public static final BitSet FOLLOW_orderClause_in_solutionModifier1622 = new BitSet(new long[]{0x0000000000000008L,0x0080000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_limitOffsetClauses_in_solutionModifier1639 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GROUP_BY_in_groupClause1665 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_groupCondition_in_groupClause1669 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_builtInCall_in_groupCondition1702 = new BitSet(new long[]{0x000302C421400022L,0x80587C805000A050L,0x4156800000005014L,0x0200450A008BC1F7L});
    public static final BitSet FOLLOW_functionCall_in_groupCondition1721 = new BitSet(new long[]{0x000302C421400022L,0x80587C805000A050L,0x4156800000005014L,0x0200450A008BC1F7L});
    public static final BitSet FOLLOW_CONDITION_in_groupCondition1739 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_groupCondition1743 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_var_in_groupCondition1748 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_var_in_groupCondition1765 = new BitSet(new long[]{0x000302C421400022L,0x80587C805000A050L,0x4156800000005014L,0x0200450A008BC1F7L});
    public static final BitSet FOLLOW_HAVING_in_havingClause1839 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_havingCondition_in_havingClause1844 = new BitSet(new long[]{0x0003024421400028L,0x80587C805000A250L,0x4156800000005014L,0x0200050A008BC1F7L});
    public static final BitSet FOLLOW_constraint_in_havingCondition1872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ORDER_BY_in_orderClause1901 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_orderCondition_in_orderClause1908 = new BitSet(new long[]{0x0103024421400828L,0x80587C805000A250L,0x4156800000005014L,0x0200450A008BC1F7L});
    public static final BitSet FOLLOW_ASC_in_orderCondition1935 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_brackettedExpression_in_orderCondition1939 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DESC_in_orderCondition1951 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_brackettedExpression_in_orderCondition1955 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_constraint_in_orderCondition1969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_in_orderCondition1985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_limitClause_in_limitOffsetClauses2025 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_offsetClause_in_limitOffsetClauses2033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_offsetClause_in_limitOffsetClauses2046 = new BitSet(new long[]{0x0000000000000002L,0x0080000000000000L});
    public static final BitSet FOLLOW_limitClause_in_limitOffsetClauses2053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LIMIT_in_limitClause2091 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INTEGER_in_limitClause2096 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OFFSET_in_offsetClause2123 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INTEGER_in_offsetClause2128 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_inlineData_in_bindingsClause2152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iRIref_in_bindingValue2173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rDFLiteral_in_bindingValue2177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteral_in_bindingValue2181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteral_in_bindingValue2185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNDEF_in_bindingValue2189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_triplesSameSubject_in_triplesTemplate2209 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_DOT_in_triplesTemplate2216 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000006000000L});
    public static final BitSet FOLLOW_triplesTemplate_in_triplesTemplate2218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GROUP_GRAPH_PATTERN_in_groupGraphPattern2248 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_groupGraphPatternSub_in_groupGraphPattern2250 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_subSelect_in_groupGraphPattern2262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_triplesBlock_in_groupGraphPatternSub2294 = new BitSet(new long[]{0x0000000000040002L,0x0000000000821000L,0x2000000000200002L,0x0000204008100000L});
    public static final BitSet FOLLOW_filter_in_groupGraphPatternSub2326 = new BitSet(new long[]{0x0000000000040002L,0x0000000000821000L,0x2000000000200002L,0x0000204008100000L});
    public static final BitSet FOLLOW_graphPatternNewBGP_in_groupGraphPatternSub2364 = new BitSet(new long[]{0x0000000000040002L,0x0000000000821000L,0x2000000000200002L,0x0000204008100000L});
    public static final BitSet FOLLOW_TRIPLES_BLOCK_in_triplesBlock2423 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_triples_in_triplesBlock2456 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000006000000L});
    public static final BitSet FOLLOW_triples2_in_triplesBlock2472 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000006000000L});
    public static final BitSet FOLLOW_TRIPLE_in_triples2520 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SUBJECT_in_triples2523 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_graphNode_in_triples2529 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PREDICATE_in_triples2565 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_predicate_in_triples2571 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VALUE_in_triples2611 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_object_in_triples2616 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TRIPLE2_in_triples22671 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SUBJECT_in_triples22674 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_triplesNode_in_triples22680 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PROPERTY_LIST_in_triples22718 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PREDICATE_in_triples22730 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_predicate_in_triples22737 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VALUE_in_triples22787 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_object_in_triples22792 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_groupMinusOrUnionGraphPattern_in_graphPatternNewBGP2852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_optionalGraphPattern_in_graphPatternNewBGP2872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_graphGraphPattern_in_graphPatternNewBGP2893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_serviceGraphPattern_in_graphPatternNewBGP2914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bind_in_graphPatternNewBGP2927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inlineData_in_graphPatternNewBGP2947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VALUES_in_inlineData2980 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_dataBlock_in_inlineData2984 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INLINE_DATA_in_dataBlock3016 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NIL_in_dataBlock3026 = new BitSet(new long[]{0x2000000000830008L,0x0000008000000000L,0x0000018000000200L,0x0000001000000200L});
    public static final BitSet FOLLOW_var_in_dataBlock3033 = new BitSet(new long[]{0x2000000000830008L,0x0000008000000000L,0x0000018000000200L,0x0000401000000200L});
    public static final BitSet FOLLOW_NIL_in_dataBlock3048 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_dataBlockValue_in_dataBlock3055 = new BitSet(new long[]{0x2000000000830008L,0x0000008000000000L,0x0000018000000000L,0x0000001000000200L});
    public static final BitSet FOLLOW_iRIref_in_dataBlockValue3091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rDFLiteral_in_dataBlockValue3107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteral_in_dataBlockValue3122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteral_in_dataBlockValue3137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNDEF_in_dataBlockValue3153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPTIONAL_in_optionalGraphPattern3183 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_groupGraphPattern_in_optionalGraphPattern3187 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GRAPH_in_graphGraphPattern3217 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_varOrIRIref2_in_graphGraphPattern3221 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_groupGraphPattern_in_graphGraphPattern3225 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SERVICE_in_serviceGraphPattern3261 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SILENT_in_serviceGraphPattern3264 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L,0x0000018000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_varOrIRIref_in_serviceGraphPattern3272 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_groupGraphPattern_in_serviceGraphPattern3276 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BIND_in_bind3309 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_var_in_bind3313 = new BitSet(new long[]{0x20030A4427C32020L,0xDE587C80D040A250L,0x41D6818000005815L,0xFA00450A00ABC3F7L,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_bind3319 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNION_in_groupMinusOrUnionGraphPattern3351 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_groupGraphPattern_in_groupMinusOrUnionGraphPattern3372 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_groupGraphPattern_in_groupMinusOrUnionGraphPattern3403 = new BitSet(new long[]{0x0000000000000008L,0x0000000000800000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_MINUS_in_groupMinusOrUnionGraphPattern3439 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_groupGraphPattern_in_groupMinusOrUnionGraphPattern3454 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_groupGraphPattern_in_groupMinusOrUnionGraphPattern3481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FILTER_in_filter3514 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_constraint_in_filter3518 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_brackettedExpression_in_constraint3542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_builtInCall_in_constraint3552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_constraint3565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_functionCall3587 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_iRIref_in_functionCall3591 = new BitSet(new long[]{0x28030A4427C32020L,0xDE587C80D040A250L,0x41D6818000005A15L,0xFA00450A00ABC3F7L,0x000000000000000FL});
    public static final BitSet FOLLOW_argList_in_functionCall3595 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NIL_in_argList3624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DISTINCT_in_argList3637 = new BitSet(new long[]{0x20030A4427C32020L,0xDE587C80D040A250L,0x41D6818000005815L,0xFA00450A00ABC3F7L,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_argList3642 = new BitSet(new long[]{0x20030A4427C32022L,0xDE587C80D040A250L,0x41D6818000005815L,0xFA00450A00ABC3F7L,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_argList3655 = new BitSet(new long[]{0x20030A4427C32022L,0xDE587C80D040A250L,0x41D6818000005815L,0xFA00450A00ABC3F7L,0x000000000000000FL});
    public static final BitSet FOLLOW_NIL_in_expressionList3690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expressionList3713 = new BitSet(new long[]{0x20030A4427C32022L,0xDE587C80D040A250L,0x41D6818000005815L,0xFA00450A00ABC3F7L,0x000000000000000FL});
    public static final BitSet FOLLOW_constructTriples_in_constructTemplate3733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_triples_in_constructTriples3754 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000006000000L});
    public static final BitSet FOLLOW_triples2_in_constructTriples3765 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000006000000L});
    public static final BitSet FOLLOW_triples_in_triplesSameSubject3802 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_triples2_in_triplesSameSubject3814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_graphNode_in_object3836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varOrIRIref_in_verb3858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_263_in_verb3868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_path_in_verbPath3886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_in_verbSimple3905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pathAlternative_in_path3922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pathSequence_in_pathAlternative3935 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_264_in_pathAlternative3939 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L,0x0000018000040000L,0x0800000000000000L,0x00000000000000A0L});
    public static final BitSet FOLLOW_pathSequence_in_pathAlternative3941 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_pathEltOrInverse_in_pathSequence3958 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_256_in_pathSequence3962 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L,0x0000018000040000L,0x0800000000000000L,0x00000000000000A0L});
    public static final BitSet FOLLOW_pathEltOrInverse_in_pathSequence3964 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_pathPrimary_in_pathElt3981 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x6000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_pathMod_in_pathElt3983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pathElt_in_pathEltOrInverse3998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_261_in_pathEltOrInverse4002 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L,0x0000018000040000L,0x0800000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_pathElt_in_pathEltOrInverse4004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_253_in_pathMod4019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_260_in_pathMod4028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_254_in_pathMod4037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iRIref_in_pathPrimary4055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_263_in_pathPrimary4059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_251_in_pathPrimary4063 = new BitSet(new long[]{0x0000000000000000L,0x000000C000000000L,0x0000018000040000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_pathNegatedPropertySet_in_pathPrimary4065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_pathPrimary4069 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L,0x0000018000040000L,0x0800000000000000L,0x00000000000000A0L});
    public static final BitSet FOLLOW_path_in_pathPrimary4071 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_pathPrimary4073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pathOneInPropertySet_in_pathNegatedPropertySet4103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_pathNegatedPropertySet4111 = new BitSet(new long[]{0x0000000080000000L,0x000000C000000000L,0x0000018000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_pathOneInPropertySet_in_pathNegatedPropertySet4119 = new BitSet(new long[]{0x0000000080000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_264_in_pathNegatedPropertySet4123 = new BitSet(new long[]{0x0000000000000000L,0x000000C000000000L,0x0000018000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_pathOneInPropertySet_in_pathNegatedPropertySet4129 = new BitSet(new long[]{0x0000000080000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_pathNegatedPropertySet4140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iRIref_in_pathOneInPropertySet4168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_263_in_pathOneInPropertySet4175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INV_in_pathOneInPropertySet4184 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_iRIrefOrRDFType_in_pathOneInPropertySet4190 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_iRIref_in_iRIrefOrRDFType4217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_263_in_iRIrefOrRDFType4226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_integer4247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRIPLES_NODE_in_triplesNode4266 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_collection_in_triplesNode4277 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_blankNodePropertyList_in_triplesNode4294 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PROPERTY_LIST_in_blankNodePropertyList4333 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PREDICATE_in_blankNodePropertyList4354 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_predicate_in_blankNodePropertyList4358 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VALUE_in_blankNodePropertyList4373 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_graphNode_in_blankNodePropertyList4378 = new BitSet(new long[]{0x2000000000A30208L,0x0000008000000000L,0x0000018000000200L,0x0000400010000200L});
    public static final BitSet FOLLOW_var_in_predicate4434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iRIref_in_predicate4449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_263_in_predicate4460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALT_in_predicate4475 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_predicate_in_predicate4480 = new BitSet(new long[]{0x0000000000000108L,0x000000C000000008L,0x1000018000000000L,0x0800400000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_SEQ_in_predicate4496 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_predicate_in_predicate4501 = new BitSet(new long[]{0x0000000000000108L,0x000000C000000008L,0x1000018000000000L,0x0800400000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ELT_in_predicate4517 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_predicate_in_predicate4521 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x6000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_pathMod_in_predicate4527 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INV_in_predicate4542 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_predicate_in_predicate4546 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_251_in_predicate4557 = new BitSet(new long[]{0x0000000000000000L,0x000000C000000000L,0x0000018000040000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_pathNegatedPropertySet_in_predicate4563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLLECTION_in_collection4591 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_graphNode_in_collection4596 = new BitSet(new long[]{0x2000000000A30208L,0x0000008000000000L,0x0000018000000200L,0x0000400010000200L});
    public static final BitSet FOLLOW_var_in_graphNode4622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_graphTerm_in_graphNode4635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_triplesNode_in_graphNode4647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_in_varOrTerm4670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_graphTerm_in_varOrTerm4685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_in_varOrIRIref4707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iRIref_in_varOrIRIref4722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_in_varOrIRIref24757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iRIref_in_varOrIRIref24773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_var4800 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_VAR1_in_var4807 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VAR2_in_var4822 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_iRIref_in_graphTerm4856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rDFLiteral_in_graphTerm4870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteral_in_graphTerm4882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteral_in_graphTerm4895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_blankNode_in_graphTerm4908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NIL_in_graphTerm4921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOGICAL_OR_in_expression4952 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression4964 = new BitSet(new long[]{0x20030A4427C32020L,0xDE587C80D040A250L,0x41D6818000005815L,0xFA00450A00ABC3F7L,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_expression4985 = new BitSet(new long[]{0x20030A4427C32028L,0xDE587C80D040A250L,0x41D6818000005815L,0xFA00450A00ABC3F7L,0x000000000000000FL});
    public static final BitSet FOLLOW_LOGICAL_AND_in_expression5010 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression5022 = new BitSet(new long[]{0x20030A4427C32020L,0xDE587C80D040A250L,0x41D6818000005815L,0xFA00450A00ABC3F7L,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_expression5043 = new BitSet(new long[]{0x20030A4427C32028L,0xDE587C80D040A250L,0x41D6818000005815L,0xFA00450A00ABC3F7L,0x000000000000000FL});
    public static final BitSet FOLLOW_257_in_expression5070 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression5084 = new BitSet(new long[]{0x20030A4427C32020L,0xDE587C80D040A250L,0x41D6818000005815L,0xFA00450A00ABC3F7L,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_expression5095 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_252_in_expression5115 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression5129 = new BitSet(new long[]{0x20030A4427C32020L,0xDE587C80D040A250L,0x41D6818000005815L,0xFA00450A00ABC3F7L,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_expression5140 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LT_in_expression5160 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression5175 = new BitSet(new long[]{0x20030A4427C32020L,0xDE587C80D040A250L,0x41D6818000005815L,0xFA00450A00ABC3F7L,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_expression5190 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_258_in_expression5210 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression5225 = new BitSet(new long[]{0x20030A4427C32020L,0xDE587C80D040A250L,0x41D6818000005815L,0xFA00450A00ABC3F7L,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_expression5236 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LTE_in_expression5256 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression5270 = new BitSet(new long[]{0x20030A4427C32020L,0xDE587C80D040A250L,0x41D6818000005815L,0xFA00450A00ABC3F7L,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_expression5281 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_259_in_expression5301 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression5315 = new BitSet(new long[]{0x20030A4427C32020L,0xDE587C80D040A250L,0x41D6818000005815L,0xFA00450A00ABC3F7L,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_expression5326 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IN_in_expression5346 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression5373 = new BitSet(new long[]{0x20030A4427C32020L,0xDE587C80D040A250L,0x41D6818000005A15L,0xFA00450A00ABC3F7L,0x000000000000000FL});
    public static final BitSet FOLLOW_expressionList_in_expression5386 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_expression5432 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression5439 = new BitSet(new long[]{0x20030A4427C32020L,0xDE587C80D040A250L,0x41D6818000005A15L,0xFA00450A00ABC3F7L,0x000000000000000FL});
    public static final BitSet FOLLOW_expressionList_in_expression5447 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_254_in_expression5481 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression5508 = new BitSet(new long[]{0x20030A4427C32028L,0xDE587C80D040A250L,0x41D6818000005815L,0xFA00450A00ABC3F7L,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_expression5520 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BROKEN_PLUS_in_expression5543 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression5562 = new BitSet(new long[]{0x20030A4427C32020L,0xDE587C80D040A250L,0x41D6818000005815L,0xFA00450A00ABC3F7L,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_expression5573 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_255_in_expression5593 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression5619 = new BitSet(new long[]{0x20030A4427C32028L,0xDE587C80D040A250L,0x41D6818000005815L,0xFA00450A00ABC3F7L,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_expression5631 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BROKEN_MINUS_in_expression5648 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression5666 = new BitSet(new long[]{0x20030A4427C32020L,0xDE587C80D040A250L,0x41D6818000005815L,0xFA00450A00ABC3F7L,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_expression5677 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_253_in_expression5697 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression5724 = new BitSet(new long[]{0x20030A4427C32020L,0xDE587C80D040A250L,0x41D6818000005815L,0xFA00450A00ABC3F7L,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_expression5735 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_256_in_expression5755 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression5782 = new BitSet(new long[]{0x20030A4427C32020L,0xDE587C80D040A250L,0x41D6818000005815L,0xFA00450A00ABC3F7L,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_expression5792 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_251_in_expression5812 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression5816 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_brackettedExpression_in_expression5827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExpression_in_expression5837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_builtInCall_in_primaryExpression5862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iRIref_in_primaryExpression5874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iRIFunction_in_primaryExpression5886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rDFLiteral_in_primaryExpression5898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteral_in_primaryExpression5910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteral_in_primaryExpression5921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_in_primaryExpression5932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_aggregate_in_primaryExpression5946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXPRESSION_in_brackettedExpression5969 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_brackettedExpression5974 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STR_in_builtInCall6004 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall6008 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LANG_in_builtInCall6021 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall6025 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LANGMATCHES_in_builtInCall6038 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall6042 = new BitSet(new long[]{0x20030A4427C32020L,0xDE587C80D040A250L,0x41D6818000005815L,0xFA00450A00ABC3F7L,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_builtInCall6046 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DATATYPE_in_builtInCall6059 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall6063 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BOUND_in_builtInCall6075 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_var_in_builtInCall6079 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IRI_in_builtInCall6097 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall6101 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_URI_in_builtInCall6114 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall6118 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BNODE_in_builtInCall6130 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall6134 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BNODE_in_builtInCall6145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RAND_in_builtInCall6156 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NIL_in_builtInCall6158 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ABS_in_builtInCall6171 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall6175 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CEIL_in_builtInCall6187 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall6191 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FLOOR_in_builtInCall6203 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall6207 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ROUND_in_builtInCall6219 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall6223 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONCAT_in_builtInCall6235 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expressionList_in_builtInCall6239 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUBSTR_in_builtInCall6252 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall6256 = new BitSet(new long[]{0x20030A4427C32020L,0xDE587C80D040A250L,0x41D6818000005815L,0xFA00450A00ABC3F7L,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_builtInCall6260 = new BitSet(new long[]{0x20030A4427C32028L,0xDE587C80D040A250L,0x41D6818000005815L,0xFA00450A00ABC3F7L,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_builtInCall6284 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STRLEN_in_builtInCall6307 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall6311 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UCASE_in_builtInCall6323 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall6327 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_REPLACE_in_builtInCall6339 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall6343 = new BitSet(new long[]{0x20030A4427C32020L,0xDE587C80D040A250L,0x41D6818000005815L,0xFA00450A00ABC3F7L,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_builtInCall6347 = new BitSet(new long[]{0x20030A4427C32020L,0xDE587C80D040A250L,0x41D6818000005815L,0xFA00450A00ABC3F7L,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_builtInCall6351 = new BitSet(new long[]{0x20030A4427C32028L,0xDE587C80D040A250L,0x41D6818000005815L,0xFA00450A00ABC3F7L,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_builtInCall6375 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LCASE_in_builtInCall6393 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall6397 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ENCODE_FOR_URI_in_builtInCall6409 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall6413 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONTAINS_in_builtInCall6425 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall6429 = new BitSet(new long[]{0x20030A4427C32020L,0xDE587C80D040A250L,0x41D6818000005815L,0xFA00450A00ABC3F7L,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_builtInCall6433 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STRSTARTS_in_builtInCall6445 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall6449 = new BitSet(new long[]{0x20030A4427C32020L,0xDE587C80D040A250L,0x41D6818000005815L,0xFA00450A00ABC3F7L,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_builtInCall6453 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STRENDS_in_builtInCall6465 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall6469 = new BitSet(new long[]{0x20030A4427C32020L,0xDE587C80D040A250L,0x41D6818000005815L,0xFA00450A00ABC3F7L,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_builtInCall6473 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STRBEFORE_in_builtInCall6485 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall6489 = new BitSet(new long[]{0x20030A4427C32020L,0xDE587C80D040A250L,0x41D6818000005815L,0xFA00450A00ABC3F7L,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_builtInCall6493 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STRAFTER_in_builtInCall6505 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall6509 = new BitSet(new long[]{0x20030A4427C32020L,0xDE587C80D040A250L,0x41D6818000005815L,0xFA00450A00ABC3F7L,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_builtInCall6513 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_YEAR_in_builtInCall6525 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall6529 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MONTH_in_builtInCall6541 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall6545 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DAY_in_builtInCall6557 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall6561 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_HOURS_in_builtInCall6573 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall6577 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUTES_in_builtInCall6589 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall6593 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SECONDS_in_builtInCall6605 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall6609 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TIMEZONE_in_builtInCall6621 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall6625 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TZ_in_builtInCall6637 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall6641 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOW_in_builtInCall6652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UUID_in_builtInCall6664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRUUID_in_builtInCall6676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MD5_in_builtInCall6685 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall6689 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SHA1_in_builtInCall6701 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall6705 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SHA256_in_builtInCall6717 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall6721 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SHA384_in_builtInCall6733 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall6737 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SHA512_in_builtInCall6749 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall6753 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_COALESCE_in_builtInCall6765 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expressionList_in_builtInCall6769 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IF_in_builtInCall6781 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall6785 = new BitSet(new long[]{0x20030A4427C32020L,0xDE587C80D040A250L,0x41D6818000005815L,0xFA00450A00ABC3F7L,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_builtInCall6789 = new BitSet(new long[]{0x20030A4427C32020L,0xDE587C80D040A250L,0x41D6818000005815L,0xFA00450A00ABC3F7L,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_builtInCall6793 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STRLANG_in_builtInCall6805 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall6809 = new BitSet(new long[]{0x20030A4427C32020L,0xDE587C80D040A250L,0x41D6818000005815L,0xFA00450A00ABC3F7L,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_builtInCall6813 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STRDT_in_builtInCall6825 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall6829 = new BitSet(new long[]{0x20030A4427C32020L,0xDE587C80D040A250L,0x41D6818000005815L,0xFA00450A00ABC3F7L,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_builtInCall6833 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAMETERM_in_builtInCall6845 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall6849 = new BitSet(new long[]{0x20030A4427C32020L,0xDE587C80D040A250L,0x41D6818000005815L,0xFA00450A00ABC3F7L,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_builtInCall6853 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ISIRI_in_builtInCall6865 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall6869 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ISURI_in_builtInCall6881 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall6885 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ISBLANK_in_builtInCall6897 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall6901 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ISLITERAL_in_builtInCall6913 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall6917 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ISNUMERIC_in_builtInCall6929 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall6933 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_regexExpression_in_builtInCall6946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_existsFunc_in_builtInCall6955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notExistsFunc_in_builtInCall6964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REGEX_in_regexExpression6987 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_regexExpression6991 = new BitSet(new long[]{0x20030A4427C32020L,0xDE587C80D040A250L,0x41D6818000005815L,0xFA00450A00ABC3F7L,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_regexExpression6995 = new BitSet(new long[]{0x20030A4427C32028L,0xDE587C80D040A250L,0x41D6818000005815L,0xFA00450A00ABC3F7L,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_regexExpression6999 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXISTS_in_existsFunc7031 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_groupGraphPattern_in_existsFunc7035 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_EXISTS_in_notExistsFunc7066 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_groupGraphPattern_in_notExistsFunc7070 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_COUNT_in_aggregate7105 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DISTINCT_in_aggregate7117 = new BitSet(new long[]{0x20030A4427C32020L,0xDE587C80D040A250L,0x41D6818000005815L,0xFA00450A00ABC3F7L,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_aggregate7174 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_253_in_aggregate7184 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUM_in_aggregate7204 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DISTINCT_in_aggregate7216 = new BitSet(new long[]{0x20030A4427C32020L,0xDE587C80D040A250L,0x41D6818000005815L,0xFA00450A00ABC3F7L,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_aggregate7233 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MIN_in_aggregate7246 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DISTINCT_in_aggregate7259 = new BitSet(new long[]{0x20030A4427C32020L,0xDE587C80D040A250L,0x41D6818000005815L,0xFA00450A00ABC3F7L,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_aggregate7275 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MAX_in_aggregate7288 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DISTINCT_in_aggregate7301 = new BitSet(new long[]{0x20030A4427C32020L,0xDE587C80D040A250L,0x41D6818000005815L,0xFA00450A00ABC3F7L,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_aggregate7318 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AVG_in_aggregate7331 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DISTINCT_in_aggregate7344 = new BitSet(new long[]{0x20030A4427C32020L,0xDE587C80D040A250L,0x41D6818000005815L,0xFA00450A00ABC3F7L,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_aggregate7361 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAMPLE_in_aggregate7374 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DISTINCT_in_aggregate7386 = new BitSet(new long[]{0x20030A4427C32020L,0xDE587C80D040A250L,0x41D6818000005815L,0xFA00450A00ABC3F7L,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_aggregate7403 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GROUP_CONCAT_in_aggregate7417 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DISTINCT_in_aggregate7429 = new BitSet(new long[]{0x20030A4427C32020L,0xDE587C80D040A250L,0x41D6818000005815L,0xFA00450A00ABC3F7L,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_aggregate7444 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_SEPARATOR_in_aggregate7455 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_string_in_aggregate7459 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FUNCTION_in_iRIFunction7488 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_iRIref_in_iRIFunction7498 = new BitSet(new long[]{0x28030A4427C32028L,0xDE587C80D040A250L,0x41D6818000005A15L,0xFA00450A00ABC3F7L,0x000000000000000FL});
    public static final BitSet FOLLOW_argList_in_iRIFunction7510 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_string_in_rDFLiteral7542 = new BitSet(new long[]{0x0000000000000002L,0x0020000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_LANGTAG_in_rDFLiteral7557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_262_in_rDFLiteral7571 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L,0x0000018000000000L});
    public static final BitSet FOLLOW_iRIref_in_rDFLiteral7575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteralUnsigned_in_numericLiteral7606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteralPositive_in_numericLiteral7616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteralNegative_in_numericLiteral7626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BIG_INTEGER_in_numericLiteralUnsigned7648 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INTEGER_in_numericLiteralUnsigned7653 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BIG_DECIMAL_in_numericLiteralUnsigned7669 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DECIMAL_in_numericLiteralUnsigned7673 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DOUBLE_in_numericLiteralUnsigned7688 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DOUBLE_in_numericLiteralUnsigned7693 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BIG_INTEGER_in_numericLiteralPositive7723 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INTEGER_POSITIVE_in_numericLiteralPositive7728 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BIG_DECIMAL_in_numericLiteralPositive7741 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DECIMAL_POSITIVE_in_numericLiteralPositive7745 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DOUBLE_in_numericLiteralPositive7758 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DOUBLE_POSITIVE_in_numericLiteralPositive7763 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BIG_INTEGER_in_numericLiteralNegative7788 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INTEGER_NEGATIVE_in_numericLiteralNegative7793 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BIG_DECIMAL_in_numericLiteralNegative7806 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DECIMAL_NEGATIVE_in_numericLiteralNegative7810 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DOUBLE_in_numericLiteralNegative7823 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DOUBLE_NEGATIVE_in_numericLiteralNegative7828 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BOOLEAN_in_booleanLiteral7852 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TRUE_in_booleanLiteral7854 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BOOLEAN_in_booleanLiteral7869 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FALSE_in_booleanLiteral7871 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STRING_in_string7894 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_LITERAL1_in_string7898 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STRING_in_string7915 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_LITERAL2_in_string7919 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STRING_in_string7936 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_LITERAL_LONG1_in_string7940 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STRING_in_string7952 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_LITERAL_LONG2_in_string7956 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IRI_in_iRIref7980 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IRI_REF_in_iRIref7984 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_prefixedName_in_iRIref7996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PREFIXED_NAME_in_prefixedName8018 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PNAME_LN_in_prefixedName8022 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PREFIXED_NS_in_prefixedName8031 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PNAME_NS_in_prefixedName8035 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BLANK_NODE_LABEL_in_blankNode8059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ANNON_in_blankNode8070 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OPEN_SQ_BRACKET_in_blankNode8074 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NIL_in_synpred1_IbmSparqlAstWalker3022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NIL_in_synpred2_IbmSparqlAstWalker3044 = new BitSet(new long[]{0x0000000000000002L});

}