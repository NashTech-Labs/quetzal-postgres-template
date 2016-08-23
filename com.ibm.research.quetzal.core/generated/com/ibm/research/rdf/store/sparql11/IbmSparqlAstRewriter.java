// $ANTLR 3.4 /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstRewriter.g 2016-08-23 17:16:17
 
package com.ibm.research.rdf.store.sparql11;
	
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.AbstractMap;
import java.util.HashMap;
import com.ibm.research.rdf.store.sparql11.model.*;



import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class IbmSparqlAstRewriter extends TreeRewriter {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "A", "ABS", "ADD", "ALL", "ALT", "ANNON", "AS", "ASC", "ASK", "AVG", "B", "BASE", "BIG_DECIMAL", "BIG_INTEGER", "BIND", "BINDINGS", "BIND_VALUES", "BLANK_NODE_LABEL", "BNODE", "BOOLEAN", "BOUND", "BROKEN_MINUS", "BROKEN_PLUS", "BY", "C", "CEIL", "CLEAR", "CLOSE_BRACE", "CLOSE_CURLY_BRACE", "CLOSE_SQ_BRACKET", "COALESCE", "COLLECTION", "COMMA", "COMMENT", "CONCAT", "CONDITION", "CONSTRUCT", "CONTAINS", "COPY", "COUNT", "CREATE", "D", "DATA", "DATASET", "DATATYPE", "DAY", "DECIMAL", "DECIMAL_NEGATIVE", "DECIMAL_POSITIVE", "DEFAULT", "DEFAULT_NAMESPACE", "DELETE", "DESC", "DESCRIBE", "DIGIT", "DISTINCT", "DOT", "DOUBLE", "DOUBLE_NEGATIVE", "DOUBLE_POSITIVE", "DROP", "E", "ECHAR", "ELT", "ENCODE_FOR_URI", "EOL", "EXISTS", "EXP", "EXPONENT", "EXPRESSION", "F", "FALSE", "FILTER", "FLOOR", "FROM", "FUNCTION", "G", "GRAPH", "GRAPH_GRAPH_PATTERN", "GRAPH_NODE", "GROUP", "GROUP_BY", "GROUP_CONCAT", "GROUP_GRAPH_PATTERN", "GROUP_GRAPH_PATTERN_SUB", "H", "HAVING", "HEXDIGIT", "HOURS", "I", "IF", "IN", "INLINE_DATA", "INSERT", "INTEGER", "INTEGER_NEGATIVE", "INTEGER_POSITIVE", "INTO", "INV", "IRI", "IRI_OR_FUNCTION", "IRI_REF", "ISBLANK", "ISIRI", "ISLITERAL", "ISNUMERIC", "ISURI", "J", "K", "KEY", "L", "LANG", "LANGMATCHES", "LANGTAG", "LCASE", "LIMIT", "LOAD", "LOGICAL_AND", "LOGICAL_OR", "LT", "LTE", "M", "MAX", "MD5", "MIN", "MINUS", "MINUTES", "MODIFIERS", "MONTH", "MOVE", "N", "NAMED", "NAMESPACE_PREFIX_MAP", "NIL", "NON_TRIPLES", "NOT", "NOT_EXISTS", "NOT_IN", "NOW", "NUMERIC", "O", "OFFSET", "OPEN_BRACE", "OPEN_CURLY_BRACE", "OPEN_SQ_BRACKET", "OPTIONAL", "ORDER", "ORDER_BY", "P", "PATH", "PERCENT", "PLX", "PNAME_LN", "PNAME_NS", "PN_CHARS", "PN_CHARS_BASE", "PN_CHARS_U", "PN_LOCAL", "PN_LOCAL_ESC", "PN_PREFIX", "PREDICATE", "PREDICATE_VALUE", "PREFIX", "PREFIXED_NAME", "PREFIXED_NS", "PROLOGUE", "PROPERTY_LIST", "PVARS", "Q", "QUERY", "R", "RAND", "REDUCED", "REGEX", "REPLACE", "ROOT", "ROUND", "S", "SAMETERM", "SAMPLE", "SECONDS", "SELECT", "SEMICOLON", "SEPARATOR", "SEQ", "SERVICE", "SHA1", "SHA224", "SHA256", "SHA384", "SHA512", "SILENT", "STR", "STRAFTER", "STRBEFORE", "STRDT", "STRENDS", "STRING", "STRING_LITERAL1", "STRING_LITERAL2", "STRING_LITERAL_LONG1", "STRING_LITERAL_LONG2", "STRLANG", "STRLEN", "STRSTARTS", "STRUUID", "SUBJECT", "SUBSTR", "SUB_SELECT", "SUM", "T", "TIMEZONE", "TO", "TRIPLE", "TRIPLE2", "TRIPLES_BLOCK", "TRIPLES_NODE", "TRIPLES_NODE_PROPERTY_LIST", "TRIPLES_SAME_SUBJECT", "TRUE", "TYPE", "TZ", "U", "UCASE", "UNDEF", "UNICODE_ESCAPE", "UNION", "UPDATE", "URI", "USING", "UUID", "V", "VALUE", "VALUES", "VAR", "VAR1", "VAR2", "VARNAME", "W", "WHERE", "WHERE_TOKEN", "WITH", "WS", "X", "Y", "YEAR", "Z", "'!'", "'!='", "'*'", "'+'", "'-'", "'/'", "'='", "'>'", "'>='", "'?'", "'^'", "'^^'", "'a'", "'|'", "N_GROUP_GRAPH_PATTERN", "N_UNION"
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
    public static final int N_GROUP_GRAPH_PATTERN=265;
    public static final int N_UNION=266;

    // delegates
    public TreeRewriter[] getDelegates() {
        return new TreeRewriter[] {};
    }

    // delegators


    public IbmSparqlAstRewriter(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public IbmSparqlAstRewriter(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return IbmSparqlAstRewriter.tokenNames; }
    public String getGrammarFileName() { return "/home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstRewriter.g"; }


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


    public static class bottomup_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bottomup"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstRewriter.g:55:1: bottomup : ( groupGraphPatternNull | unionNull | whereNull );
    public final IbmSparqlAstRewriter.bottomup_return bottomup() throws RecognitionException {
        IbmSparqlAstRewriter.bottomup_return retval = new IbmSparqlAstRewriter.bottomup_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        IbmSparqlAstRewriter.groupGraphPatternNull_return groupGraphPatternNull1 =null;

        IbmSparqlAstRewriter.unionNull_return unionNull2 =null;

        IbmSparqlAstRewriter.whereNull_return whereNull3 =null;



        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstRewriter.g:56:2: ( groupGraphPatternNull | unionNull | whereNull )
            int alt1=3;
            switch ( input.LA(1) ) {
            case GROUP_GRAPH_PATTERN:
                {
                alt1=1;
                }
                break;
            case UNION:
                {
                alt1=2;
                }
                break;
            case WHERE:
                {
                alt1=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }

            switch (alt1) {
                case 1 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstRewriter.g:56:4: groupGraphPatternNull
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_groupGraphPatternNull_in_bottomup97);
                    groupGraphPatternNull1=groupGraphPatternNull();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==1 ) 
                     
                    if ( _first_0==null ) _first_0 = groupGraphPatternNull1.tree;


                    if ( state.backtracking==1 ) {
                    retval.tree = (CommonTree)_first_0;
                    if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
                        retval.tree = (CommonTree)adaptor.getParent(retval.tree);
                    }
                    }
                    break;
                case 2 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstRewriter.g:57:4: unionNull
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_unionNull_in_bottomup102);
                    unionNull2=unionNull();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==1 ) 
                     
                    if ( _first_0==null ) _first_0 = unionNull2.tree;


                    if ( state.backtracking==1 ) {
                    retval.tree = (CommonTree)_first_0;
                    if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
                        retval.tree = (CommonTree)adaptor.getParent(retval.tree);
                    }
                    }
                    break;
                case 3 :
                    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstRewriter.g:58:4: whereNull
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_whereNull_in_bottomup107);
                    whereNull3=whereNull();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==1 ) 
                     
                    if ( _first_0==null ) _first_0 = whereNull3.tree;


                    if ( state.backtracking==1 ) {
                    retval.tree = (CommonTree)_first_0;
                    if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
                        retval.tree = (CommonTree)adaptor.getParent(retval.tree);
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
        return retval;
    }
    // $ANTLR end "bottomup"


    public static class whereNull_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "whereNull"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstRewriter.g:61:1: whereNull : ^( WHERE GROUP_GRAPH_PATTERN ) -> WHERE ;
    public final IbmSparqlAstRewriter.whereNull_return whereNull() throws RecognitionException {
        IbmSparqlAstRewriter.whereNull_return retval = new IbmSparqlAstRewriter.whereNull_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree WHERE4=null;
        CommonTree GROUP_GRAPH_PATTERN5=null;

        CommonTree WHERE4_tree=null;
        CommonTree GROUP_GRAPH_PATTERN5_tree=null;
        RewriteRuleNodeStream stream_GROUP_GRAPH_PATTERN=new RewriteRuleNodeStream(adaptor,"token GROUP_GRAPH_PATTERN");
        RewriteRuleNodeStream stream_WHERE=new RewriteRuleNodeStream(adaptor,"token WHERE");

        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstRewriter.g:62:2: ( ^( WHERE GROUP_GRAPH_PATTERN ) -> WHERE )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstRewriter.g:62:4: ^( WHERE GROUP_GRAPH_PATTERN )
            {
            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            _last = (CommonTree)input.LT(1);
            WHERE4=(CommonTree)match(input,WHERE,FOLLOW_WHERE_in_whereNull120); if (state.failed) return retval; 
            if ( state.backtracking==1 ) stream_WHERE.add(WHERE4);


            if ( state.backtracking==1 )
            if ( _first_0==null ) _first_0 = WHERE4;
            match(input, Token.DOWN, null); if (state.failed) return retval;
            _last = (CommonTree)input.LT(1);
            GROUP_GRAPH_PATTERN5=(CommonTree)match(input,GROUP_GRAPH_PATTERN,FOLLOW_GROUP_GRAPH_PATTERN_in_whereNull122); if (state.failed) return retval; 
            if ( state.backtracking==1 ) stream_GROUP_GRAPH_PATTERN.add(GROUP_GRAPH_PATTERN5);


            match(input, Token.UP, null); if (state.failed) return retval;
            _last = _save_last_1;
            }


            // AST REWRITE
            // elements: WHERE
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==1 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 62:36: -> WHERE
            {
                adaptor.addChild(root_0, 
                stream_WHERE.nextNode()
                );

            }


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            input.replaceChildren(adaptor.getParent(retval.start),
                                  adaptor.getChildIndex(retval.start),
                                  adaptor.getChildIndex(_last),
                                  retval.tree);
            }

            }

        }

        	catch(RecognitionException re) {
        		throw new SPARQLsyntaxError(re);
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "whereNull"


    public static class groupGraphPatternNull_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "groupGraphPatternNull"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstRewriter.g:65:1: groupGraphPatternNull : ^( GROUP_GRAPH_PATTERN ( ( GROUP_GRAPH_PATTERN )=> GROUP_GRAPH_PATTERN | ( ^( TRIPLES_BLOCK ( . )+ ) )=> (x+= . ) | ( ^( N_GROUP_GRAPH_PATTERN ( . )+ ) )=> (x+= . ) | (x+= . ) )+ ) -> {(c == 0)&&(t == 0)&&(g == 0)}? GROUP_GRAPH_PATTERN -> {(c == 0)&&(t == 0)&&(g > 0)}? ( $x)+ -> ^( N_GROUP_GRAPH_PATTERN ( $x)* ) ;
    public final IbmSparqlAstRewriter.groupGraphPatternNull_return groupGraphPatternNull() throws RecognitionException {
        IbmSparqlAstRewriter.groupGraphPatternNull_return retval = new IbmSparqlAstRewriter.groupGraphPatternNull_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree GROUP_GRAPH_PATTERN6=null;
        CommonTree GROUP_GRAPH_PATTERN7=null;
        CommonTree x=null;
        List list_x=null;

        CommonTree GROUP_GRAPH_PATTERN6_tree=null;
        CommonTree GROUP_GRAPH_PATTERN7_tree=null;
        CommonTree x_tree=null;
        RewriteRuleNodeStream stream_GROUP_GRAPH_PATTERN=new RewriteRuleNodeStream(adaptor,"token GROUP_GRAPH_PATTERN");


        		int t = 0, c = 0, g = 0;
        	
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstRewriter.g:69:2: ( ^( GROUP_GRAPH_PATTERN ( ( GROUP_GRAPH_PATTERN )=> GROUP_GRAPH_PATTERN | ( ^( TRIPLES_BLOCK ( . )+ ) )=> (x+= . ) | ( ^( N_GROUP_GRAPH_PATTERN ( . )+ ) )=> (x+= . ) | (x+= . ) )+ ) -> {(c == 0)&&(t == 0)&&(g == 0)}? GROUP_GRAPH_PATTERN -> {(c == 0)&&(t == 0)&&(g > 0)}? ( $x)+ -> ^( N_GROUP_GRAPH_PATTERN ( $x)* ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstRewriter.g:69:4: ^( GROUP_GRAPH_PATTERN ( ( GROUP_GRAPH_PATTERN )=> GROUP_GRAPH_PATTERN | ( ^( TRIPLES_BLOCK ( . )+ ) )=> (x+= . ) | ( ^( N_GROUP_GRAPH_PATTERN ( . )+ ) )=> (x+= . ) | (x+= . ) )+ )
            {
            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            _last = (CommonTree)input.LT(1);
            GROUP_GRAPH_PATTERN6=(CommonTree)match(input,GROUP_GRAPH_PATTERN,FOLLOW_GROUP_GRAPH_PATTERN_in_groupGraphPatternNull149); if (state.failed) return retval; 
            if ( state.backtracking==1 ) stream_GROUP_GRAPH_PATTERN.add(GROUP_GRAPH_PATTERN6);


            if ( state.backtracking==1 )
            if ( _first_0==null ) _first_0 = GROUP_GRAPH_PATTERN6;
            match(input, Token.DOWN, null); if (state.failed) return retval;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstRewriter.g:69:27: ( ( GROUP_GRAPH_PATTERN )=> GROUP_GRAPH_PATTERN | ( ^( TRIPLES_BLOCK ( . )+ ) )=> (x+= . ) | ( ^( N_GROUP_GRAPH_PATTERN ( . )+ ) )=> (x+= . ) | (x+= . ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=5;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==GROUP_GRAPH_PATTERN) ) {
                    int LA2_2 = input.LA(2);

                    if ( (synpred1_IbmSparqlAstRewriter()) ) {
                        alt2=1;
                    }
                    else if ( (synpred2_IbmSparqlAstRewriter()) ) {
                        alt2=2;
                    }
                    else if ( (synpred3_IbmSparqlAstRewriter()) ) {
                        alt2=3;
                    }
                    else if ( (true) ) {
                        alt2=4;
                    }


                }
                else if ( ((LA2_0 >= A && LA2_0 <= GROUP_CONCAT)||(LA2_0 >= GROUP_GRAPH_PATTERN_SUB && LA2_0 <= N_UNION)) ) {
                    int LA2_3 = input.LA(2);

                    if ( (synpred2_IbmSparqlAstRewriter()) ) {
                        alt2=2;
                    }
                    else if ( (synpred3_IbmSparqlAstRewriter()) ) {
                        alt2=3;
                    }
                    else if ( (true) ) {
                        alt2=4;
                    }


                }


                switch (alt2) {
            	case 1 :
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstRewriter.g:69:30: ( GROUP_GRAPH_PATTERN )=> GROUP_GRAPH_PATTERN
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    GROUP_GRAPH_PATTERN7=(CommonTree)match(input,GROUP_GRAPH_PATTERN,FOLLOW_GROUP_GRAPH_PATTERN_in_groupGraphPatternNull160); if (state.failed) return retval; 
            	    if ( state.backtracking==1 ) stream_GROUP_GRAPH_PATTERN.add(GROUP_GRAPH_PATTERN7);


            	    if ( state.backtracking==1 ) {
            	    retval.tree = (CommonTree)_first_0;
            	    if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
            	        retval.tree = (CommonTree)adaptor.getParent(retval.tree);
            	    }
            	    }
            	    break;
            	case 2 :
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstRewriter.g:70:11: ( ^( TRIPLES_BLOCK ( . )+ ) )=> (x+= . )
            	    {
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstRewriter.g:70:35: (x+= . )
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstRewriter.g:70:36: x+= .
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    x=(CommonTree)input.LT(1);

            	    matchAny(input); if (state.failed) return retval;
            	     
            	    if ( state.backtracking==1 )
            	    if ( _first_1==null ) _first_1 = x;

            	    if (list_x==null) list_x=new ArrayList();
            	    list_x.add(x);


            	    if ( state.backtracking==1 ) {t++;}

            	    if ( state.backtracking==1 ) {
            	    retval.tree = (CommonTree)_first_0;
            	    if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
            	        retval.tree = (CommonTree)adaptor.getParent(retval.tree);
            	    }
            	    }


            	    if ( state.backtracking==1 ) {
            	    retval.tree = (CommonTree)_first_0;
            	    if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
            	        retval.tree = (CommonTree)adaptor.getParent(retval.tree);
            	    }
            	    }
            	    break;
            	case 3 :
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstRewriter.g:71:11: ( ^( N_GROUP_GRAPH_PATTERN ( . )+ ) )=> (x+= . )
            	    {
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstRewriter.g:71:43: (x+= . )
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstRewriter.g:71:44: x+= .
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    x=(CommonTree)input.LT(1);

            	    matchAny(input); if (state.failed) return retval;
            	     
            	    if ( state.backtracking==1 )
            	    if ( _first_1==null ) _first_1 = x;

            	    if (list_x==null) list_x=new ArrayList();
            	    list_x.add(x);


            	    if ( state.backtracking==1 ) {g++;}

            	    if ( state.backtracking==1 ) {
            	    retval.tree = (CommonTree)_first_0;
            	    if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
            	        retval.tree = (CommonTree)adaptor.getParent(retval.tree);
            	    }
            	    }


            	    if ( state.backtracking==1 ) {
            	    retval.tree = (CommonTree)_first_0;
            	    if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
            	        retval.tree = (CommonTree)adaptor.getParent(retval.tree);
            	    }
            	    }
            	    break;
            	case 4 :
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstRewriter.g:72:11: (x+= . )
            	    {
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstRewriter.g:72:11: (x+= . )
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstRewriter.g:72:13: x+= .
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    x=(CommonTree)input.LT(1);

            	    matchAny(input); if (state.failed) return retval;
            	     
            	    if ( state.backtracking==1 )
            	    if ( _first_1==null ) _first_1 = x;

            	    if (list_x==null) list_x=new ArrayList();
            	    list_x.add(x);


            	    if ( state.backtracking==1 ) {c++;}

            	    if ( state.backtracking==1 ) {
            	    retval.tree = (CommonTree)_first_0;
            	    if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
            	        retval.tree = (CommonTree)adaptor.getParent(retval.tree);
            	    }
            	    }


            	    if ( state.backtracking==1 ) {
            	    retval.tree = (CommonTree)_first_0;
            	    if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
            	        retval.tree = (CommonTree)adaptor.getParent(retval.tree);
            	    }
            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            match(input, Token.UP, null); if (state.failed) return retval;
            _last = _save_last_1;
            }


            // AST REWRITE
            // elements: x, GROUP_GRAPH_PATTERN, x
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: x
            if ( state.backtracking==1 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"wildcard x",list_x);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 76:3: -> {(c == 0)&&(t == 0)&&(g == 0)}? GROUP_GRAPH_PATTERN
            if ((c == 0)&&(t == 0)&&(g == 0)) {
                adaptor.addChild(root_0, 
                stream_GROUP_GRAPH_PATTERN.nextNode()
                );

            }

            else // 77:3: -> {(c == 0)&&(t == 0)&&(g > 0)}? ( $x)+
            if ((c == 0)&&(t == 0)&&(g > 0)) {
                if ( !(stream_x.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_x.hasNext() ) {
                    adaptor.addChild(root_0, stream_x.nextTree());

                }
                stream_x.reset();

            }

            else // 78:3: -> ^( N_GROUP_GRAPH_PATTERN ( $x)* )
            {
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstRewriter.g:78:15: ^( N_GROUP_GRAPH_PATTERN ( $x)* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(N_GROUP_GRAPH_PATTERN, "N_GROUP_GRAPH_PATTERN")
                , root_1);

                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstRewriter.g:78:41: ( $x)*
                while ( stream_x.hasNext() ) {
                    adaptor.addChild(root_1, stream_x.nextTree());

                }
                stream_x.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            input.replaceChildren(adaptor.getParent(retval.start),
                                  adaptor.getChildIndex(retval.start),
                                  adaptor.getChildIndex(_last),
                                  retval.tree);
            }

            }

        }

        	catch(RecognitionException re) {
        		throw new SPARQLsyntaxError(re);
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "groupGraphPatternNull"


    public static class unionNull_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "unionNull"
    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstRewriter.g:81:1: unionNull : ^( UNION ( ( GROUP_GRAPH_PATTERN )=> GROUP_GRAPH_PATTERN | ( (x+= . ) ) )+ ) -> {c == 0}? GROUP_GRAPH_PATTERN -> {c == 1}? ( $x)+ -> ^( N_UNION ( $x)+ ) ;
    public final IbmSparqlAstRewriter.unionNull_return unionNull() throws RecognitionException {
        IbmSparqlAstRewriter.unionNull_return retval = new IbmSparqlAstRewriter.unionNull_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree UNION8=null;
        CommonTree GROUP_GRAPH_PATTERN9=null;
        CommonTree x=null;
        List list_x=null;

        CommonTree UNION8_tree=null;
        CommonTree GROUP_GRAPH_PATTERN9_tree=null;
        CommonTree x_tree=null;
        RewriteRuleNodeStream stream_GROUP_GRAPH_PATTERN=new RewriteRuleNodeStream(adaptor,"token GROUP_GRAPH_PATTERN");
        RewriteRuleNodeStream stream_UNION=new RewriteRuleNodeStream(adaptor,"token UNION");


        		int c = 0;
        	
        try {
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstRewriter.g:85:2: ( ^( UNION ( ( GROUP_GRAPH_PATTERN )=> GROUP_GRAPH_PATTERN | ( (x+= . ) ) )+ ) -> {c == 0}? GROUP_GRAPH_PATTERN -> {c == 1}? ( $x)+ -> ^( N_UNION ( $x)+ ) )
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstRewriter.g:85:4: ^( UNION ( ( GROUP_GRAPH_PATTERN )=> GROUP_GRAPH_PATTERN | ( (x+= . ) ) )+ )
            {
            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            _last = (CommonTree)input.LT(1);
            UNION8=(CommonTree)match(input,UNION,FOLLOW_UNION_in_unionNull318); if (state.failed) return retval; 
            if ( state.backtracking==1 ) stream_UNION.add(UNION8);


            if ( state.backtracking==1 )
            if ( _first_0==null ) _first_0 = UNION8;
            match(input, Token.DOWN, null); if (state.failed) return retval;
            // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstRewriter.g:85:12: ( ( GROUP_GRAPH_PATTERN )=> GROUP_GRAPH_PATTERN | ( (x+= . ) ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==GROUP_GRAPH_PATTERN) ) {
                    int LA3_2 = input.LA(2);

                    if ( (synpred4_IbmSparqlAstRewriter()) ) {
                        alt3=1;
                    }
                    else if ( (true) ) {
                        alt3=2;
                    }


                }
                else if ( ((LA3_0 >= A && LA3_0 <= GROUP_CONCAT)||(LA3_0 >= GROUP_GRAPH_PATTERN_SUB && LA3_0 <= N_UNION)) ) {
                    alt3=2;
                }


                switch (alt3) {
            	case 1 :
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstRewriter.g:85:16: ( GROUP_GRAPH_PATTERN )=> GROUP_GRAPH_PATTERN
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    GROUP_GRAPH_PATTERN9=(CommonTree)match(input,GROUP_GRAPH_PATTERN,FOLLOW_GROUP_GRAPH_PATTERN_in_unionNull329); if (state.failed) return retval; 
            	    if ( state.backtracking==1 ) stream_GROUP_GRAPH_PATTERN.add(GROUP_GRAPH_PATTERN9);


            	    if ( state.backtracking==1 ) {
            	    retval.tree = (CommonTree)_first_0;
            	    if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
            	        retval.tree = (CommonTree)adaptor.getParent(retval.tree);
            	    }
            	    }
            	    break;
            	case 2 :
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstRewriter.g:86:7: ( (x+= . ) )
            	    {
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstRewriter.g:86:7: ( (x+= . ) )
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstRewriter.g:86:9: (x+= . )
            	    {
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstRewriter.g:86:9: (x+= . )
            	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstRewriter.g:86:11: x+= .
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    x=(CommonTree)input.LT(1);

            	    matchAny(input); if (state.failed) return retval;
            	     
            	    if ( state.backtracking==1 )
            	    if ( _first_1==null ) _first_1 = x;

            	    if (list_x==null) list_x=new ArrayList();
            	    list_x.add(x);


            	    if ( state.backtracking==1 ) {
            	    retval.tree = (CommonTree)_first_0;
            	    if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
            	        retval.tree = (CommonTree)adaptor.getParent(retval.tree);
            	    }
            	    }


            	    if ( state.backtracking==1 ) {c++;}

            	    if ( state.backtracking==1 ) {
            	    retval.tree = (CommonTree)_first_0;
            	    if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
            	        retval.tree = (CommonTree)adaptor.getParent(retval.tree);
            	    }
            	    }


            	    if ( state.backtracking==1 ) {
            	    retval.tree = (CommonTree)_first_0;
            	    if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
            	        retval.tree = (CommonTree)adaptor.getParent(retval.tree);
            	    }
            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            match(input, Token.UP, null); if (state.failed) return retval;
            _last = _save_last_1;
            }


            // AST REWRITE
            // elements: GROUP_GRAPH_PATTERN, x, x
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: x
            if ( state.backtracking==1 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"wildcard x",list_x);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 90:3: -> {c == 0}? GROUP_GRAPH_PATTERN
            if (c == 0) {
                adaptor.addChild(root_0, 
                stream_GROUP_GRAPH_PATTERN.nextNode()
                );

            }

            else // 91:3: -> {c == 1}? ( $x)+
            if (c == 1) {
                if ( !(stream_x.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_x.hasNext() ) {
                    adaptor.addChild(root_0, stream_x.nextTree());

                }
                stream_x.reset();

            }

            else // 92:3: -> ^( N_UNION ( $x)+ )
            {
                // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstRewriter.g:92:9: ^( N_UNION ( $x)+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(N_UNION, "N_UNION")
                , root_1);

                if ( !(stream_x.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_x.hasNext() ) {
                    adaptor.addChild(root_1, stream_x.nextTree());

                }
                stream_x.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            input.replaceChildren(adaptor.getParent(retval.start),
                                  adaptor.getChildIndex(retval.start),
                                  adaptor.getChildIndex(_last),
                                  retval.tree);
            }

            }

        }

        	catch(RecognitionException re) {
        		throw new SPARQLsyntaxError(re);
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "unionNull"

    // $ANTLR start synpred1_IbmSparqlAstRewriter
    public final void synpred1_IbmSparqlAstRewriter_fragment() throws RecognitionException {
        // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstRewriter.g:69:30: ( GROUP_GRAPH_PATTERN )
        // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstRewriter.g:69:31: GROUP_GRAPH_PATTERN
        {
        match(input,GROUP_GRAPH_PATTERN,FOLLOW_GROUP_GRAPH_PATTERN_in_synpred1_IbmSparqlAstRewriter156); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred1_IbmSparqlAstRewriter

    // $ANTLR start synpred2_IbmSparqlAstRewriter
    public final void synpred2_IbmSparqlAstRewriter_fragment() throws RecognitionException {
        // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstRewriter.g:70:11: ( ^( TRIPLES_BLOCK ( . )+ ) )
        // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstRewriter.g:70:12: ^( TRIPLES_BLOCK ( . )+ )
        {
        match(input,TRIPLES_BLOCK,FOLLOW_TRIPLES_BLOCK_in_synpred2_IbmSparqlAstRewriter175); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstRewriter.g:70:28: ( . )+
        int cnt4=0;
        loop4:
        do {
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0 >= A && LA4_0 <= N_UNION)) ) {
                alt4=1;
            }
            else if ( (LA4_0==UP) ) {
                alt4=2;
            }


            switch (alt4) {
        	case 1 :
        	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstRewriter.g:70:28: .
        	    {
        	    matchAny(input); if (state.failed) return ;

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


        match(input, Token.UP, null); if (state.failed) return ;


        }

    }
    // $ANTLR end synpred2_IbmSparqlAstRewriter

    // $ANTLR start synpred3_IbmSparqlAstRewriter
    public final void synpred3_IbmSparqlAstRewriter_fragment() throws RecognitionException {
        // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstRewriter.g:71:11: ( ^( N_GROUP_GRAPH_PATTERN ( . )+ ) )
        // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstRewriter.g:71:12: ^( N_GROUP_GRAPH_PATTERN ( . )+ )
        {
        match(input,N_GROUP_GRAPH_PATTERN,FOLLOW_N_GROUP_GRAPH_PATTERN_in_synpred3_IbmSparqlAstRewriter203); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstRewriter.g:71:36: ( . )+
        int cnt5=0;
        loop5:
        do {
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0 >= A && LA5_0 <= N_UNION)) ) {
                alt5=1;
            }
            else if ( (LA5_0==UP) ) {
                alt5=2;
            }


            switch (alt5) {
        	case 1 :
        	    // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstRewriter.g:71:36: .
        	    {
        	    matchAny(input); if (state.failed) return ;

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


        match(input, Token.UP, null); if (state.failed) return ;


        }

    }
    // $ANTLR end synpred3_IbmSparqlAstRewriter

    // $ANTLR start synpred4_IbmSparqlAstRewriter
    public final void synpred4_IbmSparqlAstRewriter_fragment() throws RecognitionException {
        // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstRewriter.g:85:16: ( GROUP_GRAPH_PATTERN )
        // /home/sandy/elsevier/quetzal-postgres-template/com.ibm.research.quetzal.core/src/com/ibm/research/rdf/store/sparql11/IbmSparqlAstRewriter.g:85:17: GROUP_GRAPH_PATTERN
        {
        match(input,GROUP_GRAPH_PATTERN,FOLLOW_GROUP_GRAPH_PATTERN_in_synpred4_IbmSparqlAstRewriter325); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred4_IbmSparqlAstRewriter

    // Delegated rules

    public final boolean synpred1_IbmSparqlAstRewriter() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_IbmSparqlAstRewriter_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_IbmSparqlAstRewriter() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_IbmSparqlAstRewriter_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_IbmSparqlAstRewriter() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_IbmSparqlAstRewriter_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_IbmSparqlAstRewriter() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_IbmSparqlAstRewriter_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_groupGraphPatternNull_in_bottomup97 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unionNull_in_bottomup102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whereNull_in_bottomup107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHERE_in_whereNull120 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_GROUP_GRAPH_PATTERN_in_whereNull122 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GROUP_GRAPH_PATTERN_in_groupGraphPatternNull149 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_GROUP_GRAPH_PATTERN_in_groupGraphPatternNull160 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF8L,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0x00000000000007FFL});
    public static final BitSet FOLLOW_UNION_in_unionNull318 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_GROUP_GRAPH_PATTERN_in_unionNull329 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF8L,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0x00000000000007FFL});
    public static final BitSet FOLLOW_GROUP_GRAPH_PATTERN_in_synpred1_IbmSparqlAstRewriter156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRIPLES_BLOCK_in_synpred2_IbmSparqlAstRewriter175 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_N_GROUP_GRAPH_PATTERN_in_synpred3_IbmSparqlAstRewriter203 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_GROUP_GRAPH_PATTERN_in_synpred4_IbmSparqlAstRewriter325 = new BitSet(new long[]{0x0000000000000002L});

}