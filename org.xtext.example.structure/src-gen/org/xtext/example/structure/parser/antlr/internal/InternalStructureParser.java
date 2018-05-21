package org.xtext.example.structure.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.structure.services.StructureGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalStructureParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Raiz'", "':'", "'/'", "'['", "']'", "','", "'('", "')'", "';'", "'Contenido:'", "'text:'", "'_END'", "'.txt'", "'.md'", "'.xml'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalStructureParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalStructureParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalStructureParser.tokenNames; }
    public String getGrammarFileName() { return "InternalStructure.g"; }



     	private StructureGrammarAccess grammarAccess;

        public InternalStructureParser(TokenStream input, StructureGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Raiz";
       	}

       	@Override
       	protected StructureGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleRaiz"
    // InternalStructure.g:64:1: entryRuleRaiz returns [EObject current=null] : iv_ruleRaiz= ruleRaiz EOF ;
    public final EObject entryRuleRaiz() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRaiz = null;


        try {
            // InternalStructure.g:64:45: (iv_ruleRaiz= ruleRaiz EOF )
            // InternalStructure.g:65:2: iv_ruleRaiz= ruleRaiz EOF
            {
             newCompositeNode(grammarAccess.getRaizRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRaiz=ruleRaiz();

            state._fsp--;

             current =iv_ruleRaiz; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRaiz"


    // $ANTLR start "ruleRaiz"
    // InternalStructure.g:71:1: ruleRaiz returns [EObject current=null] : (otherlv_0= 'Raiz' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_carpetas_3_0= ruleCarpeta ) )* ( (lv_contents_4_0= ruleContent ) )* ) ;
    public final EObject ruleRaiz() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_carpetas_3_0 = null;

        EObject lv_contents_4_0 = null;



        	enterRule();

        try {
            // InternalStructure.g:77:2: ( (otherlv_0= 'Raiz' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_carpetas_3_0= ruleCarpeta ) )* ( (lv_contents_4_0= ruleContent ) )* ) )
            // InternalStructure.g:78:2: (otherlv_0= 'Raiz' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_carpetas_3_0= ruleCarpeta ) )* ( (lv_contents_4_0= ruleContent ) )* )
            {
            // InternalStructure.g:78:2: (otherlv_0= 'Raiz' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_carpetas_3_0= ruleCarpeta ) )* ( (lv_contents_4_0= ruleContent ) )* )
            // InternalStructure.g:79:3: otherlv_0= 'Raiz' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_carpetas_3_0= ruleCarpeta ) )* ( (lv_contents_4_0= ruleContent ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRaizAccess().getRaizKeyword_0());
            		
            // InternalStructure.g:83:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalStructure.g:84:4: (lv_name_1_0= RULE_ID )
            {
            // InternalStructure.g:84:4: (lv_name_1_0= RULE_ID )
            // InternalStructure.g:85:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRaizAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRaizRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getRaizAccess().getColonKeyword_2());
            		
            // InternalStructure.g:105:3: ( (lv_carpetas_3_0= ruleCarpeta ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_STRING) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalStructure.g:106:4: (lv_carpetas_3_0= ruleCarpeta )
            	    {
            	    // InternalStructure.g:106:4: (lv_carpetas_3_0= ruleCarpeta )
            	    // InternalStructure.g:107:5: lv_carpetas_3_0= ruleCarpeta
            	    {

            	    					newCompositeNode(grammarAccess.getRaizAccess().getCarpetasCarpetaParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_carpetas_3_0=ruleCarpeta();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRaizRule());
            	    					}
            	    					add(
            	    						current,
            	    						"carpetas",
            	    						lv_carpetas_3_0,
            	    						"org.xtext.example.structure.Structure.Carpeta");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalStructure.g:124:3: ( (lv_contents_4_0= ruleContent ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==20) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalStructure.g:125:4: (lv_contents_4_0= ruleContent )
            	    {
            	    // InternalStructure.g:125:4: (lv_contents_4_0= ruleContent )
            	    // InternalStructure.g:126:5: lv_contents_4_0= ruleContent
            	    {

            	    					newCompositeNode(grammarAccess.getRaizAccess().getContentsContentParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_contents_4_0=ruleContent();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRaizRule());
            	    					}
            	    					add(
            	    						current,
            	    						"contents",
            	    						lv_contents_4_0,
            	    						"org.xtext.example.structure.Structure.Content");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRaiz"


    // $ANTLR start "entryRuleCarpeta"
    // InternalStructure.g:147:1: entryRuleCarpeta returns [EObject current=null] : iv_ruleCarpeta= ruleCarpeta EOF ;
    public final EObject entryRuleCarpeta() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCarpeta = null;


        try {
            // InternalStructure.g:147:48: (iv_ruleCarpeta= ruleCarpeta EOF )
            // InternalStructure.g:148:2: iv_ruleCarpeta= ruleCarpeta EOF
            {
             newCompositeNode(grammarAccess.getCarpetaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCarpeta=ruleCarpeta();

            state._fsp--;

             current =iv_ruleCarpeta; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCarpeta"


    // $ANTLR start "ruleCarpeta"
    // InternalStructure.g:154:1: ruleCarpeta returns [EObject current=null] : ( () ( (lv_path_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '/' (otherlv_4= '[' ( (lv_childs_5_0= ruleCarpeta ) )* otherlv_6= ']' )? (otherlv_7= ',' )? (otherlv_8= '(' ( (otherlv_9= RULE_ID ) )* otherlv_10= ')' )? (otherlv_11= ';' )? ) ;
    public final EObject ruleCarpeta() throws RecognitionException {
        EObject current = null;

        Token lv_path_1_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject lv_childs_5_0 = null;



        	enterRule();

        try {
            // InternalStructure.g:160:2: ( ( () ( (lv_path_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '/' (otherlv_4= '[' ( (lv_childs_5_0= ruleCarpeta ) )* otherlv_6= ']' )? (otherlv_7= ',' )? (otherlv_8= '(' ( (otherlv_9= RULE_ID ) )* otherlv_10= ')' )? (otherlv_11= ';' )? ) )
            // InternalStructure.g:161:2: ( () ( (lv_path_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '/' (otherlv_4= '[' ( (lv_childs_5_0= ruleCarpeta ) )* otherlv_6= ']' )? (otherlv_7= ',' )? (otherlv_8= '(' ( (otherlv_9= RULE_ID ) )* otherlv_10= ')' )? (otherlv_11= ';' )? )
            {
            // InternalStructure.g:161:2: ( () ( (lv_path_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '/' (otherlv_4= '[' ( (lv_childs_5_0= ruleCarpeta ) )* otherlv_6= ']' )? (otherlv_7= ',' )? (otherlv_8= '(' ( (otherlv_9= RULE_ID ) )* otherlv_10= ')' )? (otherlv_11= ';' )? )
            // InternalStructure.g:162:3: () ( (lv_path_1_0= RULE_STRING ) )? ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '/' (otherlv_4= '[' ( (lv_childs_5_0= ruleCarpeta ) )* otherlv_6= ']' )? (otherlv_7= ',' )? (otherlv_8= '(' ( (otherlv_9= RULE_ID ) )* otherlv_10= ')' )? (otherlv_11= ';' )?
            {
            // InternalStructure.g:162:3: ()
            // InternalStructure.g:163:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCarpetaAccess().getCarpetaAction_0(),
            					current);
            			

            }

            // InternalStructure.g:169:3: ( (lv_path_1_0= RULE_STRING ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==RULE_STRING) ) {
                    alt3=1;
                }
            }
            switch (alt3) {
                case 1 :
                    // InternalStructure.g:170:4: (lv_path_1_0= RULE_STRING )
                    {
                    // InternalStructure.g:170:4: (lv_path_1_0= RULE_STRING )
                    // InternalStructure.g:171:5: lv_path_1_0= RULE_STRING
                    {
                    lv_path_1_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

                    					newLeafNode(lv_path_1_0, grammarAccess.getCarpetaAccess().getPathSTRINGTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getCarpetaRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"path",
                    						lv_path_1_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            // InternalStructure.g:187:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalStructure.g:188:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalStructure.g:188:4: (lv_name_2_0= RULE_STRING )
            // InternalStructure.g:189:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_name_2_0, grammarAccess.getCarpetaAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCarpetaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getCarpetaAccess().getSolidusKeyword_3());
            		
            // InternalStructure.g:209:3: (otherlv_4= '[' ( (lv_childs_5_0= ruleCarpeta ) )* otherlv_6= ']' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalStructure.g:210:4: otherlv_4= '[' ( (lv_childs_5_0= ruleCarpeta ) )* otherlv_6= ']'
                    {
                    otherlv_4=(Token)match(input,14,FOLLOW_10); 

                    				newLeafNode(otherlv_4, grammarAccess.getCarpetaAccess().getLeftSquareBracketKeyword_4_0());
                    			
                    // InternalStructure.g:214:4: ( (lv_childs_5_0= ruleCarpeta ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==RULE_STRING) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalStructure.g:215:5: (lv_childs_5_0= ruleCarpeta )
                    	    {
                    	    // InternalStructure.g:215:5: (lv_childs_5_0= ruleCarpeta )
                    	    // InternalStructure.g:216:6: lv_childs_5_0= ruleCarpeta
                    	    {

                    	    						newCompositeNode(grammarAccess.getCarpetaAccess().getChildsCarpetaParserRuleCall_4_1_0());
                    	    					
                    	    pushFollow(FOLLOW_10);
                    	    lv_childs_5_0=ruleCarpeta();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getCarpetaRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"childs",
                    	    							lv_childs_5_0,
                    	    							"org.xtext.example.structure.Structure.Carpeta");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,15,FOLLOW_11); 

                    				newLeafNode(otherlv_6, grammarAccess.getCarpetaAccess().getRightSquareBracketKeyword_4_2());
                    			

                    }
                    break;

            }

            // InternalStructure.g:238:3: (otherlv_7= ',' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalStructure.g:239:4: otherlv_7= ','
                    {
                    otherlv_7=(Token)match(input,16,FOLLOW_12); 

                    				newLeafNode(otherlv_7, grammarAccess.getCarpetaAccess().getCommaKeyword_5());
                    			

                    }
                    break;

            }

            // InternalStructure.g:244:3: (otherlv_8= '(' ( (otherlv_9= RULE_ID ) )* otherlv_10= ')' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalStructure.g:245:4: otherlv_8= '(' ( (otherlv_9= RULE_ID ) )* otherlv_10= ')'
                    {
                    otherlv_8=(Token)match(input,17,FOLLOW_13); 

                    				newLeafNode(otherlv_8, grammarAccess.getCarpetaAccess().getLeftParenthesisKeyword_6_0());
                    			
                    // InternalStructure.g:249:4: ( (otherlv_9= RULE_ID ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==RULE_ID) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalStructure.g:250:5: (otherlv_9= RULE_ID )
                    	    {
                    	    // InternalStructure.g:250:5: (otherlv_9= RULE_ID )
                    	    // InternalStructure.g:251:6: otherlv_9= RULE_ID
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getCarpetaRule());
                    	    						}
                    	    					
                    	    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_13); 

                    	    						newLeafNode(otherlv_9, grammarAccess.getCarpetaAccess().getFilesContentCrossReference_6_1_0());
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,18,FOLLOW_14); 

                    				newLeafNode(otherlv_10, grammarAccess.getCarpetaAccess().getRightParenthesisKeyword_6_2());
                    			

                    }
                    break;

            }

            // InternalStructure.g:267:3: (otherlv_11= ';' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalStructure.g:268:4: otherlv_11= ';'
                    {
                    otherlv_11=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_11, grammarAccess.getCarpetaAccess().getSemicolonKeyword_7());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCarpeta"


    // $ANTLR start "entryRuleContent"
    // InternalStructure.g:277:1: entryRuleContent returns [EObject current=null] : iv_ruleContent= ruleContent EOF ;
    public final EObject entryRuleContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContent = null;


        try {
            // InternalStructure.g:277:48: (iv_ruleContent= ruleContent EOF )
            // InternalStructure.g:278:2: iv_ruleContent= ruleContent EOF
            {
             newCompositeNode(grammarAccess.getContentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContent=ruleContent();

            state._fsp--;

             current =iv_ruleContent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContent"


    // $ANTLR start "ruleContent"
    // InternalStructure.g:284:1: ruleContent returns [EObject current=null] : (otherlv_0= 'Contenido:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_ext_2_0= ruleExtension ) )? otherlv_3= 'text:' ( (lv_text_4_0= RULE_STRING ) ) otherlv_5= '_END' ) ;
    public final EObject ruleContent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token lv_text_4_0=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_ext_2_0 = null;



        	enterRule();

        try {
            // InternalStructure.g:290:2: ( (otherlv_0= 'Contenido:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_ext_2_0= ruleExtension ) )? otherlv_3= 'text:' ( (lv_text_4_0= RULE_STRING ) ) otherlv_5= '_END' ) )
            // InternalStructure.g:291:2: (otherlv_0= 'Contenido:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_ext_2_0= ruleExtension ) )? otherlv_3= 'text:' ( (lv_text_4_0= RULE_STRING ) ) otherlv_5= '_END' )
            {
            // InternalStructure.g:291:2: (otherlv_0= 'Contenido:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_ext_2_0= ruleExtension ) )? otherlv_3= 'text:' ( (lv_text_4_0= RULE_STRING ) ) otherlv_5= '_END' )
            // InternalStructure.g:292:3: otherlv_0= 'Contenido:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_ext_2_0= ruleExtension ) )? otherlv_3= 'text:' ( (lv_text_4_0= RULE_STRING ) ) otherlv_5= '_END'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getContentAccess().getContenidoKeyword_0());
            		
            // InternalStructure.g:296:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalStructure.g:297:4: (lv_name_1_0= RULE_ID )
            {
            // InternalStructure.g:297:4: (lv_name_1_0= RULE_ID )
            // InternalStructure.g:298:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_name_1_0, grammarAccess.getContentAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getContentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalStructure.g:314:3: ( (lv_ext_2_0= ruleExtension ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=23 && LA10_0<=25)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalStructure.g:315:4: (lv_ext_2_0= ruleExtension )
                    {
                    // InternalStructure.g:315:4: (lv_ext_2_0= ruleExtension )
                    // InternalStructure.g:316:5: lv_ext_2_0= ruleExtension
                    {

                    					newCompositeNode(grammarAccess.getContentAccess().getExtExtensionParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_16);
                    lv_ext_2_0=ruleExtension();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getContentRule());
                    					}
                    					set(
                    						current,
                    						"ext",
                    						lv_ext_2_0,
                    						"org.xtext.example.structure.Structure.Extension");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,21,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getContentAccess().getTextKeyword_3());
            		
            // InternalStructure.g:337:3: ( (lv_text_4_0= RULE_STRING ) )
            // InternalStructure.g:338:4: (lv_text_4_0= RULE_STRING )
            {
            // InternalStructure.g:338:4: (lv_text_4_0= RULE_STRING )
            // InternalStructure.g:339:5: lv_text_4_0= RULE_STRING
            {
            lv_text_4_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

            					newLeafNode(lv_text_4_0, grammarAccess.getContentAccess().getTextSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getContentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"text",
            						lv_text_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getContentAccess().get_ENDKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContent"


    // $ANTLR start "entryRuleExtension"
    // InternalStructure.g:363:1: entryRuleExtension returns [String current=null] : iv_ruleExtension= ruleExtension EOF ;
    public final String entryRuleExtension() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExtension = null;


        try {
            // InternalStructure.g:363:49: (iv_ruleExtension= ruleExtension EOF )
            // InternalStructure.g:364:2: iv_ruleExtension= ruleExtension EOF
            {
             newCompositeNode(grammarAccess.getExtensionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExtension=ruleExtension();

            state._fsp--;

             current =iv_ruleExtension.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExtension"


    // $ANTLR start "ruleExtension"
    // InternalStructure.g:370:1: ruleExtension returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '.txt' | kw= '.md' | kw= '.xml' ) ;
    public final AntlrDatatypeRuleToken ruleExtension() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalStructure.g:376:2: ( (kw= '.txt' | kw= '.md' | kw= '.xml' ) )
            // InternalStructure.g:377:2: (kw= '.txt' | kw= '.md' | kw= '.xml' )
            {
            // InternalStructure.g:377:2: (kw= '.txt' | kw= '.md' | kw= '.xml' )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt11=1;
                }
                break;
            case 24:
                {
                alt11=2;
                }
                break;
            case 25:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalStructure.g:378:3: kw= '.txt'
                    {
                    kw=(Token)match(input,23,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getExtensionAccess().getTxtKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalStructure.g:384:3: kw= '.md'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getExtensionAccess().getMdKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalStructure.g:390:3: kw= '.xml'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getExtensionAccess().getXmlKeyword_2());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExtension"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000100022L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000000B4002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000000B0002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000000A0002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000003A00000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});

}