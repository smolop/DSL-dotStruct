package org.xtext.example.structure.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.structure.services.StructureGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalStructureParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.txt'", "'.md'", "'.xml'", "'Raiz'", "':'", "'/'", "','", "';'", "'['", "']'", "'('", "')'", "'Contenido:'", "'text:'", "'_END'"
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

    	public void setGrammarAccess(StructureGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleRaiz"
    // InternalStructure.g:53:1: entryRuleRaiz : ruleRaiz EOF ;
    public final void entryRuleRaiz() throws RecognitionException {
        try {
            // InternalStructure.g:54:1: ( ruleRaiz EOF )
            // InternalStructure.g:55:1: ruleRaiz EOF
            {
             before(grammarAccess.getRaizRule()); 
            pushFollow(FOLLOW_1);
            ruleRaiz();

            state._fsp--;

             after(grammarAccess.getRaizRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRaiz"


    // $ANTLR start "ruleRaiz"
    // InternalStructure.g:62:1: ruleRaiz : ( ( rule__Raiz__Group__0 ) ) ;
    public final void ruleRaiz() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStructure.g:66:2: ( ( ( rule__Raiz__Group__0 ) ) )
            // InternalStructure.g:67:2: ( ( rule__Raiz__Group__0 ) )
            {
            // InternalStructure.g:67:2: ( ( rule__Raiz__Group__0 ) )
            // InternalStructure.g:68:3: ( rule__Raiz__Group__0 )
            {
             before(grammarAccess.getRaizAccess().getGroup()); 
            // InternalStructure.g:69:3: ( rule__Raiz__Group__0 )
            // InternalStructure.g:69:4: rule__Raiz__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Raiz__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRaizAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRaiz"


    // $ANTLR start "entryRuleCarpeta"
    // InternalStructure.g:78:1: entryRuleCarpeta : ruleCarpeta EOF ;
    public final void entryRuleCarpeta() throws RecognitionException {
        try {
            // InternalStructure.g:79:1: ( ruleCarpeta EOF )
            // InternalStructure.g:80:1: ruleCarpeta EOF
            {
             before(grammarAccess.getCarpetaRule()); 
            pushFollow(FOLLOW_1);
            ruleCarpeta();

            state._fsp--;

             after(grammarAccess.getCarpetaRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCarpeta"


    // $ANTLR start "ruleCarpeta"
    // InternalStructure.g:87:1: ruleCarpeta : ( ( rule__Carpeta__Group__0 ) ) ;
    public final void ruleCarpeta() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStructure.g:91:2: ( ( ( rule__Carpeta__Group__0 ) ) )
            // InternalStructure.g:92:2: ( ( rule__Carpeta__Group__0 ) )
            {
            // InternalStructure.g:92:2: ( ( rule__Carpeta__Group__0 ) )
            // InternalStructure.g:93:3: ( rule__Carpeta__Group__0 )
            {
             before(grammarAccess.getCarpetaAccess().getGroup()); 
            // InternalStructure.g:94:3: ( rule__Carpeta__Group__0 )
            // InternalStructure.g:94:4: rule__Carpeta__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Carpeta__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCarpetaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCarpeta"


    // $ANTLR start "entryRuleContent"
    // InternalStructure.g:103:1: entryRuleContent : ruleContent EOF ;
    public final void entryRuleContent() throws RecognitionException {
        try {
            // InternalStructure.g:104:1: ( ruleContent EOF )
            // InternalStructure.g:105:1: ruleContent EOF
            {
             before(grammarAccess.getContentRule()); 
            pushFollow(FOLLOW_1);
            ruleContent();

            state._fsp--;

             after(grammarAccess.getContentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleContent"


    // $ANTLR start "ruleContent"
    // InternalStructure.g:112:1: ruleContent : ( ( rule__Content__Group__0 ) ) ;
    public final void ruleContent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStructure.g:116:2: ( ( ( rule__Content__Group__0 ) ) )
            // InternalStructure.g:117:2: ( ( rule__Content__Group__0 ) )
            {
            // InternalStructure.g:117:2: ( ( rule__Content__Group__0 ) )
            // InternalStructure.g:118:3: ( rule__Content__Group__0 )
            {
             before(grammarAccess.getContentAccess().getGroup()); 
            // InternalStructure.g:119:3: ( rule__Content__Group__0 )
            // InternalStructure.g:119:4: rule__Content__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Content__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getContentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleContent"


    // $ANTLR start "entryRuleExtension"
    // InternalStructure.g:128:1: entryRuleExtension : ruleExtension EOF ;
    public final void entryRuleExtension() throws RecognitionException {
        try {
            // InternalStructure.g:129:1: ( ruleExtension EOF )
            // InternalStructure.g:130:1: ruleExtension EOF
            {
             before(grammarAccess.getExtensionRule()); 
            pushFollow(FOLLOW_1);
            ruleExtension();

            state._fsp--;

             after(grammarAccess.getExtensionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExtension"


    // $ANTLR start "ruleExtension"
    // InternalStructure.g:137:1: ruleExtension : ( ( rule__Extension__Alternatives ) ) ;
    public final void ruleExtension() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStructure.g:141:2: ( ( ( rule__Extension__Alternatives ) ) )
            // InternalStructure.g:142:2: ( ( rule__Extension__Alternatives ) )
            {
            // InternalStructure.g:142:2: ( ( rule__Extension__Alternatives ) )
            // InternalStructure.g:143:3: ( rule__Extension__Alternatives )
            {
             before(grammarAccess.getExtensionAccess().getAlternatives()); 
            // InternalStructure.g:144:3: ( rule__Extension__Alternatives )
            // InternalStructure.g:144:4: rule__Extension__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Extension__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExtensionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExtension"


    // $ANTLR start "rule__Extension__Alternatives"
    // InternalStructure.g:152:1: rule__Extension__Alternatives : ( ( '.txt' ) | ( '.md' ) | ( '.xml' ) );
    public final void rule__Extension__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStructure.g:156:1: ( ( '.txt' ) | ( '.md' ) | ( '.xml' ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt1=1;
                }
                break;
            case 12:
                {
                alt1=2;
                }
                break;
            case 13:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalStructure.g:157:2: ( '.txt' )
                    {
                    // InternalStructure.g:157:2: ( '.txt' )
                    // InternalStructure.g:158:3: '.txt'
                    {
                     before(grammarAccess.getExtensionAccess().getTxtKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getExtensionAccess().getTxtKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalStructure.g:163:2: ( '.md' )
                    {
                    // InternalStructure.g:163:2: ( '.md' )
                    // InternalStructure.g:164:3: '.md'
                    {
                     before(grammarAccess.getExtensionAccess().getMdKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getExtensionAccess().getMdKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalStructure.g:169:2: ( '.xml' )
                    {
                    // InternalStructure.g:169:2: ( '.xml' )
                    // InternalStructure.g:170:3: '.xml'
                    {
                     before(grammarAccess.getExtensionAccess().getXmlKeyword_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getExtensionAccess().getXmlKeyword_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Alternatives"


    // $ANTLR start "rule__Raiz__Group__0"
    // InternalStructure.g:179:1: rule__Raiz__Group__0 : rule__Raiz__Group__0__Impl rule__Raiz__Group__1 ;
    public final void rule__Raiz__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStructure.g:183:1: ( rule__Raiz__Group__0__Impl rule__Raiz__Group__1 )
            // InternalStructure.g:184:2: rule__Raiz__Group__0__Impl rule__Raiz__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Raiz__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Raiz__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Raiz__Group__0"


    // $ANTLR start "rule__Raiz__Group__0__Impl"
    // InternalStructure.g:191:1: rule__Raiz__Group__0__Impl : ( 'Raiz' ) ;
    public final void rule__Raiz__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStructure.g:195:1: ( ( 'Raiz' ) )
            // InternalStructure.g:196:1: ( 'Raiz' )
            {
            // InternalStructure.g:196:1: ( 'Raiz' )
            // InternalStructure.g:197:2: 'Raiz'
            {
             before(grammarAccess.getRaizAccess().getRaizKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getRaizAccess().getRaizKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Raiz__Group__0__Impl"


    // $ANTLR start "rule__Raiz__Group__1"
    // InternalStructure.g:206:1: rule__Raiz__Group__1 : rule__Raiz__Group__1__Impl rule__Raiz__Group__2 ;
    public final void rule__Raiz__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStructure.g:210:1: ( rule__Raiz__Group__1__Impl rule__Raiz__Group__2 )
            // InternalStructure.g:211:2: rule__Raiz__Group__1__Impl rule__Raiz__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Raiz__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Raiz__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Raiz__Group__1"


    // $ANTLR start "rule__Raiz__Group__1__Impl"
    // InternalStructure.g:218:1: rule__Raiz__Group__1__Impl : ( ( rule__Raiz__NameAssignment_1 ) ) ;
    public final void rule__Raiz__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStructure.g:222:1: ( ( ( rule__Raiz__NameAssignment_1 ) ) )
            // InternalStructure.g:223:1: ( ( rule__Raiz__NameAssignment_1 ) )
            {
            // InternalStructure.g:223:1: ( ( rule__Raiz__NameAssignment_1 ) )
            // InternalStructure.g:224:2: ( rule__Raiz__NameAssignment_1 )
            {
             before(grammarAccess.getRaizAccess().getNameAssignment_1()); 
            // InternalStructure.g:225:2: ( rule__Raiz__NameAssignment_1 )
            // InternalStructure.g:225:3: rule__Raiz__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Raiz__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRaizAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Raiz__Group__1__Impl"


    // $ANTLR start "rule__Raiz__Group__2"
    // InternalStructure.g:233:1: rule__Raiz__Group__2 : rule__Raiz__Group__2__Impl rule__Raiz__Group__3 ;
    public final void rule__Raiz__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStructure.g:237:1: ( rule__Raiz__Group__2__Impl rule__Raiz__Group__3 )
            // InternalStructure.g:238:2: rule__Raiz__Group__2__Impl rule__Raiz__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Raiz__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Raiz__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Raiz__Group__2"


    // $ANTLR start "rule__Raiz__Group__2__Impl"
    // InternalStructure.g:245:1: rule__Raiz__Group__2__Impl : ( ':' ) ;
    public final void rule__Raiz__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStructure.g:249:1: ( ( ':' ) )
            // InternalStructure.g:250:1: ( ':' )
            {
            // InternalStructure.g:250:1: ( ':' )
            // InternalStructure.g:251:2: ':'
            {
             before(grammarAccess.getRaizAccess().getColonKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getRaizAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Raiz__Group__2__Impl"


    // $ANTLR start "rule__Raiz__Group__3"
    // InternalStructure.g:260:1: rule__Raiz__Group__3 : rule__Raiz__Group__3__Impl rule__Raiz__Group__4 ;
    public final void rule__Raiz__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStructure.g:264:1: ( rule__Raiz__Group__3__Impl rule__Raiz__Group__4 )
            // InternalStructure.g:265:2: rule__Raiz__Group__3__Impl rule__Raiz__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Raiz__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Raiz__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Raiz__Group__3"


    // $ANTLR start "rule__Raiz__Group__3__Impl"
    // InternalStructure.g:272:1: rule__Raiz__Group__3__Impl : ( ( rule__Raiz__CarpetasAssignment_3 )* ) ;
    public final void rule__Raiz__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStructure.g:276:1: ( ( ( rule__Raiz__CarpetasAssignment_3 )* ) )
            // InternalStructure.g:277:1: ( ( rule__Raiz__CarpetasAssignment_3 )* )
            {
            // InternalStructure.g:277:1: ( ( rule__Raiz__CarpetasAssignment_3 )* )
            // InternalStructure.g:278:2: ( rule__Raiz__CarpetasAssignment_3 )*
            {
             before(grammarAccess.getRaizAccess().getCarpetasAssignment_3()); 
            // InternalStructure.g:279:2: ( rule__Raiz__CarpetasAssignment_3 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_STRING) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalStructure.g:279:3: rule__Raiz__CarpetasAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Raiz__CarpetasAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getRaizAccess().getCarpetasAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Raiz__Group__3__Impl"


    // $ANTLR start "rule__Raiz__Group__4"
    // InternalStructure.g:287:1: rule__Raiz__Group__4 : rule__Raiz__Group__4__Impl ;
    public final void rule__Raiz__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStructure.g:291:1: ( rule__Raiz__Group__4__Impl )
            // InternalStructure.g:292:2: rule__Raiz__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Raiz__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Raiz__Group__4"


    // $ANTLR start "rule__Raiz__Group__4__Impl"
    // InternalStructure.g:298:1: rule__Raiz__Group__4__Impl : ( ( rule__Raiz__ContentsAssignment_4 )* ) ;
    public final void rule__Raiz__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStructure.g:302:1: ( ( ( rule__Raiz__ContentsAssignment_4 )* ) )
            // InternalStructure.g:303:1: ( ( rule__Raiz__ContentsAssignment_4 )* )
            {
            // InternalStructure.g:303:1: ( ( rule__Raiz__ContentsAssignment_4 )* )
            // InternalStructure.g:304:2: ( rule__Raiz__ContentsAssignment_4 )*
            {
             before(grammarAccess.getRaizAccess().getContentsAssignment_4()); 
            // InternalStructure.g:305:2: ( rule__Raiz__ContentsAssignment_4 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==23) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalStructure.g:305:3: rule__Raiz__ContentsAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Raiz__ContentsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getRaizAccess().getContentsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Raiz__Group__4__Impl"


    // $ANTLR start "rule__Carpeta__Group__0"
    // InternalStructure.g:314:1: rule__Carpeta__Group__0 : rule__Carpeta__Group__0__Impl rule__Carpeta__Group__1 ;
    public final void rule__Carpeta__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStructure.g:318:1: ( rule__Carpeta__Group__0__Impl rule__Carpeta__Group__1 )
            // InternalStructure.g:319:2: rule__Carpeta__Group__0__Impl rule__Carpeta__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Carpeta__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Carpeta__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Carpeta__Group__0"


    // $ANTLR start "rule__Carpeta__Group__0__Impl"
    // InternalStructure.g:326:1: rule__Carpeta__Group__0__Impl : ( () ) ;
    public final void rule__Carpeta__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStructure.g:330:1: ( ( () ) )
            // InternalStructure.g:331:1: ( () )
            {
            // InternalStructure.g:331:1: ( () )
            // InternalStructure.g:332:2: ()
            {
             before(grammarAccess.getCarpetaAccess().getCarpetaAction_0()); 
            // InternalStructure.g:333:2: ()
            // InternalStructure.g:333:3: 
            {
            }

             after(grammarAccess.getCarpetaAccess().getCarpetaAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Carpeta__Group__0__Impl"


    // $ANTLR start "rule__Carpeta__Group__1"
    // InternalStructure.g:341:1: rule__Carpeta__Group__1 : rule__Carpeta__Group__1__Impl rule__Carpeta__Group__2 ;
    public final void rule__Carpeta__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStructure.g:345:1: ( rule__Carpeta__Group__1__Impl rule__Carpeta__Group__2 )
            // InternalStructure.g:346:2: rule__Carpeta__Group__1__Impl rule__Carpeta__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Carpeta__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Carpeta__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Carpeta__Group__1"


    // $ANTLR start "rule__Carpeta__Group__1__Impl"
    // InternalStructure.g:353:1: rule__Carpeta__Group__1__Impl : ( ( rule__Carpeta__PathAssignment_1 )? ) ;
    public final void rule__Carpeta__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStructure.g:357:1: ( ( ( rule__Carpeta__PathAssignment_1 )? ) )
            // InternalStructure.g:358:1: ( ( rule__Carpeta__PathAssignment_1 )? )
            {
            // InternalStructure.g:358:1: ( ( rule__Carpeta__PathAssignment_1 )? )
            // InternalStructure.g:359:2: ( rule__Carpeta__PathAssignment_1 )?
            {
             before(grammarAccess.getCarpetaAccess().getPathAssignment_1()); 
            // InternalStructure.g:360:2: ( rule__Carpeta__PathAssignment_1 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==RULE_STRING) ) {
                    alt4=1;
                }
            }
            switch (alt4) {
                case 1 :
                    // InternalStructure.g:360:3: rule__Carpeta__PathAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Carpeta__PathAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCarpetaAccess().getPathAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Carpeta__Group__1__Impl"


    // $ANTLR start "rule__Carpeta__Group__2"
    // InternalStructure.g:368:1: rule__Carpeta__Group__2 : rule__Carpeta__Group__2__Impl rule__Carpeta__Group__3 ;
    public final void rule__Carpeta__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStructure.g:372:1: ( rule__Carpeta__Group__2__Impl rule__Carpeta__Group__3 )
            // InternalStructure.g:373:2: rule__Carpeta__Group__2__Impl rule__Carpeta__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Carpeta__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Carpeta__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Carpeta__Group__2"


    // $ANTLR start "rule__Carpeta__Group__2__Impl"
    // InternalStructure.g:380:1: rule__Carpeta__Group__2__Impl : ( ( rule__Carpeta__NameAssignment_2 ) ) ;
    public final void rule__Carpeta__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStructure.g:384:1: ( ( ( rule__Carpeta__NameAssignment_2 ) ) )
            // InternalStructure.g:385:1: ( ( rule__Carpeta__NameAssignment_2 ) )
            {
            // InternalStructure.g:385:1: ( ( rule__Carpeta__NameAssignment_2 ) )
            // InternalStructure.g:386:2: ( rule__Carpeta__NameAssignment_2 )
            {
             before(grammarAccess.getCarpetaAccess().getNameAssignment_2()); 
            // InternalStructure.g:387:2: ( rule__Carpeta__NameAssignment_2 )
            // InternalStructure.g:387:3: rule__Carpeta__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Carpeta__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCarpetaAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Carpeta__Group__2__Impl"


    // $ANTLR start "rule__Carpeta__Group__3"
    // InternalStructure.g:395:1: rule__Carpeta__Group__3 : rule__Carpeta__Group__3__Impl rule__Carpeta__Group__4 ;
    public final void rule__Carpeta__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStructure.g:399:1: ( rule__Carpeta__Group__3__Impl rule__Carpeta__Group__4 )
            // InternalStructure.g:400:2: rule__Carpeta__Group__3__Impl rule__Carpeta__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Carpeta__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Carpeta__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Carpeta__Group__3"


    // $ANTLR start "rule__Carpeta__Group__3__Impl"
    // InternalStructure.g:407:1: rule__Carpeta__Group__3__Impl : ( '/' ) ;
    public final void rule__Carpeta__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStructure.g:411:1: ( ( '/' ) )
            // InternalStructure.g:412:1: ( '/' )
            {
            // InternalStructure.g:412:1: ( '/' )
            // InternalStructure.g:413:2: '/'
            {
             before(grammarAccess.getCarpetaAccess().getSolidusKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getCarpetaAccess().getSolidusKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Carpeta__Group__3__Impl"


    // $ANTLR start "rule__Carpeta__Group__4"
    // InternalStructure.g:422:1: rule__Carpeta__Group__4 : rule__Carpeta__Group__4__Impl rule__Carpeta__Group__5 ;
    public final void rule__Carpeta__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStructure.g:426:1: ( rule__Carpeta__Group__4__Impl rule__Carpeta__Group__5 )
            // InternalStructure.g:427:2: rule__Carpeta__Group__4__Impl rule__Carpeta__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__Carpeta__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Carpeta__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Carpeta__Group__4"


    // $ANTLR start "rule__Carpeta__Group__4__Impl"
    // InternalStructure.g:434:1: rule__Carpeta__Group__4__Impl : ( ( rule__Carpeta__Group_4__0 )? ) ;
    public final void rule__Carpeta__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStructure.g:438:1: ( ( ( rule__Carpeta__Group_4__0 )? ) )
            // InternalStructure.g:439:1: ( ( rule__Carpeta__Group_4__0 )? )
            {
            // InternalStructure.g:439:1: ( ( rule__Carpeta__Group_4__0 )? )
            // InternalStructure.g:440:2: ( rule__Carpeta__Group_4__0 )?
            {
             before(grammarAccess.getCarpetaAccess().getGroup_4()); 
            // InternalStructure.g:441:2: ( rule__Carpeta__Group_4__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalStructure.g:441:3: rule__Carpeta__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Carpeta__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCarpetaAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Carpeta__Group__4__Impl"


    // $ANTLR start "rule__Carpeta__Group__5"
    // InternalStructure.g:449:1: rule__Carpeta__Group__5 : rule__Carpeta__Group__5__Impl rule__Carpeta__Group__6 ;
    public final void rule__Carpeta__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStructure.g:453:1: ( rule__Carpeta__Group__5__Impl rule__Carpeta__Group__6 )
            // InternalStructure.g:454:2: rule__Carpeta__Group__5__Impl rule__Carpeta__Group__6
            {
            pushFollow(FOLLOW_10);
            rule__Carpeta__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Carpeta__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Carpeta__Group__5"


    // $ANTLR start "rule__Carpeta__Group__5__Impl"
    // InternalStructure.g:461:1: rule__Carpeta__Group__5__Impl : ( ( ',' )? ) ;
    public final void rule__Carpeta__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStructure.g:465:1: ( ( ( ',' )? ) )
            // InternalStructure.g:466:1: ( ( ',' )? )
            {
            // InternalStructure.g:466:1: ( ( ',' )? )
            // InternalStructure.g:467:2: ( ',' )?
            {
             before(grammarAccess.getCarpetaAccess().getCommaKeyword_5()); 
            // InternalStructure.g:468:2: ( ',' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalStructure.g:468:3: ','
                    {
                    match(input,17,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getCarpetaAccess().getCommaKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Carpeta__Group__5__Impl"


    // $ANTLR start "rule__Carpeta__Group__6"
    // InternalStructure.g:476:1: rule__Carpeta__Group__6 : rule__Carpeta__Group__6__Impl rule__Carpeta__Group__7 ;
    public final void rule__Carpeta__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStructure.g:480:1: ( rule__Carpeta__Group__6__Impl rule__Carpeta__Group__7 )
            // InternalStructure.g:481:2: rule__Carpeta__Group__6__Impl rule__Carpeta__Group__7
            {
            pushFollow(FOLLOW_10);
            rule__Carpeta__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Carpeta__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Carpeta__Group__6"


    // $ANTLR start "rule__Carpeta__Group__6__Impl"
    // InternalStructure.g:488:1: rule__Carpeta__Group__6__Impl : ( ( rule__Carpeta__Group_6__0 )? ) ;
    public final void rule__Carpeta__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStructure.g:492:1: ( ( ( rule__Carpeta__Group_6__0 )? ) )
            // InternalStructure.g:493:1: ( ( rule__Carpeta__Group_6__0 )? )
            {
            // InternalStructure.g:493:1: ( ( rule__Carpeta__Group_6__0 )? )
            // InternalStructure.g:494:2: ( rule__Carpeta__Group_6__0 )?
            {
             before(grammarAccess.getCarpetaAccess().getGroup_6()); 
            // InternalStructure.g:495:2: ( rule__Carpeta__Group_6__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalStructure.g:495:3: rule__Carpeta__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Carpeta__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCarpetaAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Carpeta__Group__6__Impl"


    // $ANTLR start "rule__Carpeta__Group__7"
    // InternalStructure.g:503:1: rule__Carpeta__Group__7 : rule__Carpeta__Group__7__Impl ;
    public final void rule__Carpeta__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStructure.g:507:1: ( rule__Carpeta__Group__7__Impl )
            // InternalStructure.g:508:2: rule__Carpeta__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Carpeta__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Carpeta__Group__7"


    // $ANTLR start "rule__Carpeta__Group__7__Impl"
    // InternalStructure.g:514:1: rule__Carpeta__Group__7__Impl : ( ( ';' )? ) ;
    public final void rule__Carpeta__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStructure.g:518:1: ( ( ( ';' )? ) )
            // InternalStructure.g:519:1: ( ( ';' )? )
            {
            // InternalStructure.g:519:1: ( ( ';' )? )
            // InternalStructure.g:520:2: ( ';' )?
            {
             before(grammarAccess.getCarpetaAccess().getSemicolonKeyword_7()); 
            // InternalStructure.g:521:2: ( ';' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalStructure.g:521:3: ';'
                    {
                    match(input,18,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getCarpetaAccess().getSemicolonKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Carpeta__Group__7__Impl"


    // $ANTLR start "rule__Carpeta__Group_4__0"
    // InternalStructure.g:530:1: rule__Carpeta__Group_4__0 : rule__Carpeta__Group_4__0__Impl rule__Carpeta__Group_4__1 ;
    public final void rule__Carpeta__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStructure.g:534:1: ( rule__Carpeta__Group_4__0__Impl rule__Carpeta__Group_4__1 )
            // InternalStructure.g:535:2: rule__Carpeta__Group_4__0__Impl rule__Carpeta__Group_4__1
            {
            pushFollow(FOLLOW_11);
            rule__Carpeta__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Carpeta__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Carpeta__Group_4__0"


    // $ANTLR start "rule__Carpeta__Group_4__0__Impl"
    // InternalStructure.g:542:1: rule__Carpeta__Group_4__0__Impl : ( '[' ) ;
    public final void rule__Carpeta__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStructure.g:546:1: ( ( '[' ) )
            // InternalStructure.g:547:1: ( '[' )
            {
            // InternalStructure.g:547:1: ( '[' )
            // InternalStructure.g:548:2: '['
            {
             before(grammarAccess.getCarpetaAccess().getLeftSquareBracketKeyword_4_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getCarpetaAccess().getLeftSquareBracketKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Carpeta__Group_4__0__Impl"


    // $ANTLR start "rule__Carpeta__Group_4__1"
    // InternalStructure.g:557:1: rule__Carpeta__Group_4__1 : rule__Carpeta__Group_4__1__Impl rule__Carpeta__Group_4__2 ;
    public final void rule__Carpeta__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStructure.g:561:1: ( rule__Carpeta__Group_4__1__Impl rule__Carpeta__Group_4__2 )
            // InternalStructure.g:562:2: rule__Carpeta__Group_4__1__Impl rule__Carpeta__Group_4__2
            {
            pushFollow(FOLLOW_11);
            rule__Carpeta__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Carpeta__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Carpeta__Group_4__1"


    // $ANTLR start "rule__Carpeta__Group_4__1__Impl"
    // InternalStructure.g:569:1: rule__Carpeta__Group_4__1__Impl : ( ( rule__Carpeta__ChildsAssignment_4_1 )* ) ;
    public final void rule__Carpeta__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStructure.g:573:1: ( ( ( rule__Carpeta__ChildsAssignment_4_1 )* ) )
            // InternalStructure.g:574:1: ( ( rule__Carpeta__ChildsAssignment_4_1 )* )
            {
            // InternalStructure.g:574:1: ( ( rule__Carpeta__ChildsAssignment_4_1 )* )
            // InternalStructure.g:575:2: ( rule__Carpeta__ChildsAssignment_4_1 )*
            {
             before(grammarAccess.getCarpetaAccess().getChildsAssignment_4_1()); 
            // InternalStructure.g:576:2: ( rule__Carpeta__ChildsAssignment_4_1 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_STRING) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalStructure.g:576:3: rule__Carpeta__ChildsAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Carpeta__ChildsAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getCarpetaAccess().getChildsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Carpeta__Group_4__1__Impl"


    // $ANTLR start "rule__Carpeta__Group_4__2"
    // InternalStructure.g:584:1: rule__Carpeta__Group_4__2 : rule__Carpeta__Group_4__2__Impl ;
    public final void rule__Carpeta__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStructure.g:588:1: ( rule__Carpeta__Group_4__2__Impl )
            // InternalStructure.g:589:2: rule__Carpeta__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Carpeta__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Carpeta__Group_4__2"


    // $ANTLR start "rule__Carpeta__Group_4__2__Impl"
    // InternalStructure.g:595:1: rule__Carpeta__Group_4__2__Impl : ( ']' ) ;
    public final void rule__Carpeta__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStructure.g:599:1: ( ( ']' ) )
            // InternalStructure.g:600:1: ( ']' )
            {
            // InternalStructure.g:600:1: ( ']' )
            // InternalStructure.g:601:2: ']'
            {
             before(grammarAccess.getCarpetaAccess().getRightSquareBracketKeyword_4_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getCarpetaAccess().getRightSquareBracketKeyword_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Carpeta__Group_4__2__Impl"


    // $ANTLR start "rule__Carpeta__Group_6__0"
    // InternalStructure.g:611:1: rule__Carpeta__Group_6__0 : rule__Carpeta__Group_6__0__Impl rule__Carpeta__Group_6__1 ;
    public final void rule__Carpeta__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStructure.g:615:1: ( rule__Carpeta__Group_6__0__Impl rule__Carpeta__Group_6__1 )
            // InternalStructure.g:616:2: rule__Carpeta__Group_6__0__Impl rule__Carpeta__Group_6__1
            {
            pushFollow(FOLLOW_12);
            rule__Carpeta__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Carpeta__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Carpeta__Group_6__0"


    // $ANTLR start "rule__Carpeta__Group_6__0__Impl"
    // InternalStructure.g:623:1: rule__Carpeta__Group_6__0__Impl : ( '(' ) ;
    public final void rule__Carpeta__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStructure.g:627:1: ( ( '(' ) )
            // InternalStructure.g:628:1: ( '(' )
            {
            // InternalStructure.g:628:1: ( '(' )
            // InternalStructure.g:629:2: '('
            {
             before(grammarAccess.getCarpetaAccess().getLeftParenthesisKeyword_6_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getCarpetaAccess().getLeftParenthesisKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Carpeta__Group_6__0__Impl"


    // $ANTLR start "rule__Carpeta__Group_6__1"
    // InternalStructure.g:638:1: rule__Carpeta__Group_6__1 : rule__Carpeta__Group_6__1__Impl rule__Carpeta__Group_6__2 ;
    public final void rule__Carpeta__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStructure.g:642:1: ( rule__Carpeta__Group_6__1__Impl rule__Carpeta__Group_6__2 )
            // InternalStructure.g:643:2: rule__Carpeta__Group_6__1__Impl rule__Carpeta__Group_6__2
            {
            pushFollow(FOLLOW_12);
            rule__Carpeta__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Carpeta__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Carpeta__Group_6__1"


    // $ANTLR start "rule__Carpeta__Group_6__1__Impl"
    // InternalStructure.g:650:1: rule__Carpeta__Group_6__1__Impl : ( ( rule__Carpeta__FilesAssignment_6_1 )* ) ;
    public final void rule__Carpeta__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStructure.g:654:1: ( ( ( rule__Carpeta__FilesAssignment_6_1 )* ) )
            // InternalStructure.g:655:1: ( ( rule__Carpeta__FilesAssignment_6_1 )* )
            {
            // InternalStructure.g:655:1: ( ( rule__Carpeta__FilesAssignment_6_1 )* )
            // InternalStructure.g:656:2: ( rule__Carpeta__FilesAssignment_6_1 )*
            {
             before(grammarAccess.getCarpetaAccess().getFilesAssignment_6_1()); 
            // InternalStructure.g:657:2: ( rule__Carpeta__FilesAssignment_6_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalStructure.g:657:3: rule__Carpeta__FilesAssignment_6_1
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Carpeta__FilesAssignment_6_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getCarpetaAccess().getFilesAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Carpeta__Group_6__1__Impl"


    // $ANTLR start "rule__Carpeta__Group_6__2"
    // InternalStructure.g:665:1: rule__Carpeta__Group_6__2 : rule__Carpeta__Group_6__2__Impl ;
    public final void rule__Carpeta__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStructure.g:669:1: ( rule__Carpeta__Group_6__2__Impl )
            // InternalStructure.g:670:2: rule__Carpeta__Group_6__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Carpeta__Group_6__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Carpeta__Group_6__2"


    // $ANTLR start "rule__Carpeta__Group_6__2__Impl"
    // InternalStructure.g:676:1: rule__Carpeta__Group_6__2__Impl : ( ')' ) ;
    public final void rule__Carpeta__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStructure.g:680:1: ( ( ')' ) )
            // InternalStructure.g:681:1: ( ')' )
            {
            // InternalStructure.g:681:1: ( ')' )
            // InternalStructure.g:682:2: ')'
            {
             before(grammarAccess.getCarpetaAccess().getRightParenthesisKeyword_6_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getCarpetaAccess().getRightParenthesisKeyword_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Carpeta__Group_6__2__Impl"


    // $ANTLR start "rule__Content__Group__0"
    // InternalStructure.g:692:1: rule__Content__Group__0 : rule__Content__Group__0__Impl rule__Content__Group__1 ;
    public final void rule__Content__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStructure.g:696:1: ( rule__Content__Group__0__Impl rule__Content__Group__1 )
            // InternalStructure.g:697:2: rule__Content__Group__0__Impl rule__Content__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Content__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Content__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Content__Group__0"


    // $ANTLR start "rule__Content__Group__0__Impl"
    // InternalStructure.g:704:1: rule__Content__Group__0__Impl : ( 'Contenido:' ) ;
    public final void rule__Content__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStructure.g:708:1: ( ( 'Contenido:' ) )
            // InternalStructure.g:709:1: ( 'Contenido:' )
            {
            // InternalStructure.g:709:1: ( 'Contenido:' )
            // InternalStructure.g:710:2: 'Contenido:'
            {
             before(grammarAccess.getContentAccess().getContenidoKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getContentAccess().getContenidoKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Content__Group__0__Impl"


    // $ANTLR start "rule__Content__Group__1"
    // InternalStructure.g:719:1: rule__Content__Group__1 : rule__Content__Group__1__Impl rule__Content__Group__2 ;
    public final void rule__Content__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStructure.g:723:1: ( rule__Content__Group__1__Impl rule__Content__Group__2 )
            // InternalStructure.g:724:2: rule__Content__Group__1__Impl rule__Content__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Content__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Content__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Content__Group__1"


    // $ANTLR start "rule__Content__Group__1__Impl"
    // InternalStructure.g:731:1: rule__Content__Group__1__Impl : ( ( rule__Content__NameAssignment_1 ) ) ;
    public final void rule__Content__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStructure.g:735:1: ( ( ( rule__Content__NameAssignment_1 ) ) )
            // InternalStructure.g:736:1: ( ( rule__Content__NameAssignment_1 ) )
            {
            // InternalStructure.g:736:1: ( ( rule__Content__NameAssignment_1 ) )
            // InternalStructure.g:737:2: ( rule__Content__NameAssignment_1 )
            {
             before(grammarAccess.getContentAccess().getNameAssignment_1()); 
            // InternalStructure.g:738:2: ( rule__Content__NameAssignment_1 )
            // InternalStructure.g:738:3: rule__Content__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Content__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getContentAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Content__Group__1__Impl"


    // $ANTLR start "rule__Content__Group__2"
    // InternalStructure.g:746:1: rule__Content__Group__2 : rule__Content__Group__2__Impl rule__Content__Group__3 ;
    public final void rule__Content__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStructure.g:750:1: ( rule__Content__Group__2__Impl rule__Content__Group__3 )
            // InternalStructure.g:751:2: rule__Content__Group__2__Impl rule__Content__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__Content__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Content__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Content__Group__2"


    // $ANTLR start "rule__Content__Group__2__Impl"
    // InternalStructure.g:758:1: rule__Content__Group__2__Impl : ( ( rule__Content__ExtAssignment_2 )? ) ;
    public final void rule__Content__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStructure.g:762:1: ( ( ( rule__Content__ExtAssignment_2 )? ) )
            // InternalStructure.g:763:1: ( ( rule__Content__ExtAssignment_2 )? )
            {
            // InternalStructure.g:763:1: ( ( rule__Content__ExtAssignment_2 )? )
            // InternalStructure.g:764:2: ( rule__Content__ExtAssignment_2 )?
            {
             before(grammarAccess.getContentAccess().getExtAssignment_2()); 
            // InternalStructure.g:765:2: ( rule__Content__ExtAssignment_2 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=11 && LA11_0<=13)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalStructure.g:765:3: rule__Content__ExtAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Content__ExtAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContentAccess().getExtAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Content__Group__2__Impl"


    // $ANTLR start "rule__Content__Group__3"
    // InternalStructure.g:773:1: rule__Content__Group__3 : rule__Content__Group__3__Impl rule__Content__Group__4 ;
    public final void rule__Content__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStructure.g:777:1: ( rule__Content__Group__3__Impl rule__Content__Group__4 )
            // InternalStructure.g:778:2: rule__Content__Group__3__Impl rule__Content__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__Content__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Content__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Content__Group__3"


    // $ANTLR start "rule__Content__Group__3__Impl"
    // InternalStructure.g:785:1: rule__Content__Group__3__Impl : ( 'text:' ) ;
    public final void rule__Content__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStructure.g:789:1: ( ( 'text:' ) )
            // InternalStructure.g:790:1: ( 'text:' )
            {
            // InternalStructure.g:790:1: ( 'text:' )
            // InternalStructure.g:791:2: 'text:'
            {
             before(grammarAccess.getContentAccess().getTextKeyword_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getContentAccess().getTextKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Content__Group__3__Impl"


    // $ANTLR start "rule__Content__Group__4"
    // InternalStructure.g:800:1: rule__Content__Group__4 : rule__Content__Group__4__Impl rule__Content__Group__5 ;
    public final void rule__Content__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStructure.g:804:1: ( rule__Content__Group__4__Impl rule__Content__Group__5 )
            // InternalStructure.g:805:2: rule__Content__Group__4__Impl rule__Content__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__Content__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Content__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Content__Group__4"


    // $ANTLR start "rule__Content__Group__4__Impl"
    // InternalStructure.g:812:1: rule__Content__Group__4__Impl : ( ( rule__Content__TextAssignment_4 ) ) ;
    public final void rule__Content__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStructure.g:816:1: ( ( ( rule__Content__TextAssignment_4 ) ) )
            // InternalStructure.g:817:1: ( ( rule__Content__TextAssignment_4 ) )
            {
            // InternalStructure.g:817:1: ( ( rule__Content__TextAssignment_4 ) )
            // InternalStructure.g:818:2: ( rule__Content__TextAssignment_4 )
            {
             before(grammarAccess.getContentAccess().getTextAssignment_4()); 
            // InternalStructure.g:819:2: ( rule__Content__TextAssignment_4 )
            // InternalStructure.g:819:3: rule__Content__TextAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Content__TextAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getContentAccess().getTextAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Content__Group__4__Impl"


    // $ANTLR start "rule__Content__Group__5"
    // InternalStructure.g:827:1: rule__Content__Group__5 : rule__Content__Group__5__Impl ;
    public final void rule__Content__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStructure.g:831:1: ( rule__Content__Group__5__Impl )
            // InternalStructure.g:832:2: rule__Content__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Content__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Content__Group__5"


    // $ANTLR start "rule__Content__Group__5__Impl"
    // InternalStructure.g:838:1: rule__Content__Group__5__Impl : ( '_END' ) ;
    public final void rule__Content__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStructure.g:842:1: ( ( '_END' ) )
            // InternalStructure.g:843:1: ( '_END' )
            {
            // InternalStructure.g:843:1: ( '_END' )
            // InternalStructure.g:844:2: '_END'
            {
             before(grammarAccess.getContentAccess().get_ENDKeyword_5()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getContentAccess().get_ENDKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Content__Group__5__Impl"


    // $ANTLR start "rule__Raiz__NameAssignment_1"
    // InternalStructure.g:854:1: rule__Raiz__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Raiz__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStructure.g:858:1: ( ( RULE_ID ) )
            // InternalStructure.g:859:2: ( RULE_ID )
            {
            // InternalStructure.g:859:2: ( RULE_ID )
            // InternalStructure.g:860:3: RULE_ID
            {
             before(grammarAccess.getRaizAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRaizAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Raiz__NameAssignment_1"


    // $ANTLR start "rule__Raiz__CarpetasAssignment_3"
    // InternalStructure.g:869:1: rule__Raiz__CarpetasAssignment_3 : ( ruleCarpeta ) ;
    public final void rule__Raiz__CarpetasAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStructure.g:873:1: ( ( ruleCarpeta ) )
            // InternalStructure.g:874:2: ( ruleCarpeta )
            {
            // InternalStructure.g:874:2: ( ruleCarpeta )
            // InternalStructure.g:875:3: ruleCarpeta
            {
             before(grammarAccess.getRaizAccess().getCarpetasCarpetaParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleCarpeta();

            state._fsp--;

             after(grammarAccess.getRaizAccess().getCarpetasCarpetaParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Raiz__CarpetasAssignment_3"


    // $ANTLR start "rule__Raiz__ContentsAssignment_4"
    // InternalStructure.g:884:1: rule__Raiz__ContentsAssignment_4 : ( ruleContent ) ;
    public final void rule__Raiz__ContentsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStructure.g:888:1: ( ( ruleContent ) )
            // InternalStructure.g:889:2: ( ruleContent )
            {
            // InternalStructure.g:889:2: ( ruleContent )
            // InternalStructure.g:890:3: ruleContent
            {
             before(grammarAccess.getRaizAccess().getContentsContentParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleContent();

            state._fsp--;

             after(grammarAccess.getRaizAccess().getContentsContentParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Raiz__ContentsAssignment_4"


    // $ANTLR start "rule__Carpeta__PathAssignment_1"
    // InternalStructure.g:899:1: rule__Carpeta__PathAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Carpeta__PathAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStructure.g:903:1: ( ( RULE_STRING ) )
            // InternalStructure.g:904:2: ( RULE_STRING )
            {
            // InternalStructure.g:904:2: ( RULE_STRING )
            // InternalStructure.g:905:3: RULE_STRING
            {
             before(grammarAccess.getCarpetaAccess().getPathSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCarpetaAccess().getPathSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Carpeta__PathAssignment_1"


    // $ANTLR start "rule__Carpeta__NameAssignment_2"
    // InternalStructure.g:914:1: rule__Carpeta__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Carpeta__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStructure.g:918:1: ( ( RULE_STRING ) )
            // InternalStructure.g:919:2: ( RULE_STRING )
            {
            // InternalStructure.g:919:2: ( RULE_STRING )
            // InternalStructure.g:920:3: RULE_STRING
            {
             before(grammarAccess.getCarpetaAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCarpetaAccess().getNameSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Carpeta__NameAssignment_2"


    // $ANTLR start "rule__Carpeta__ChildsAssignment_4_1"
    // InternalStructure.g:929:1: rule__Carpeta__ChildsAssignment_4_1 : ( ruleCarpeta ) ;
    public final void rule__Carpeta__ChildsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStructure.g:933:1: ( ( ruleCarpeta ) )
            // InternalStructure.g:934:2: ( ruleCarpeta )
            {
            // InternalStructure.g:934:2: ( ruleCarpeta )
            // InternalStructure.g:935:3: ruleCarpeta
            {
             before(grammarAccess.getCarpetaAccess().getChildsCarpetaParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCarpeta();

            state._fsp--;

             after(grammarAccess.getCarpetaAccess().getChildsCarpetaParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Carpeta__ChildsAssignment_4_1"


    // $ANTLR start "rule__Carpeta__FilesAssignment_6_1"
    // InternalStructure.g:944:1: rule__Carpeta__FilesAssignment_6_1 : ( ( RULE_ID ) ) ;
    public final void rule__Carpeta__FilesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStructure.g:948:1: ( ( ( RULE_ID ) ) )
            // InternalStructure.g:949:2: ( ( RULE_ID ) )
            {
            // InternalStructure.g:949:2: ( ( RULE_ID ) )
            // InternalStructure.g:950:3: ( RULE_ID )
            {
             before(grammarAccess.getCarpetaAccess().getFilesContentCrossReference_6_1_0()); 
            // InternalStructure.g:951:3: ( RULE_ID )
            // InternalStructure.g:952:4: RULE_ID
            {
             before(grammarAccess.getCarpetaAccess().getFilesContentIDTerminalRuleCall_6_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCarpetaAccess().getFilesContentIDTerminalRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getCarpetaAccess().getFilesContentCrossReference_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Carpeta__FilesAssignment_6_1"


    // $ANTLR start "rule__Content__NameAssignment_1"
    // InternalStructure.g:963:1: rule__Content__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Content__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStructure.g:967:1: ( ( RULE_ID ) )
            // InternalStructure.g:968:2: ( RULE_ID )
            {
            // InternalStructure.g:968:2: ( RULE_ID )
            // InternalStructure.g:969:3: RULE_ID
            {
             before(grammarAccess.getContentAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getContentAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Content__NameAssignment_1"


    // $ANTLR start "rule__Content__ExtAssignment_2"
    // InternalStructure.g:978:1: rule__Content__ExtAssignment_2 : ( ruleExtension ) ;
    public final void rule__Content__ExtAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStructure.g:982:1: ( ( ruleExtension ) )
            // InternalStructure.g:983:2: ( ruleExtension )
            {
            // InternalStructure.g:983:2: ( ruleExtension )
            // InternalStructure.g:984:3: ruleExtension
            {
             before(grammarAccess.getContentAccess().getExtExtensionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExtension();

            state._fsp--;

             after(grammarAccess.getContentAccess().getExtExtensionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Content__ExtAssignment_2"


    // $ANTLR start "rule__Content__TextAssignment_4"
    // InternalStructure.g:993:1: rule__Content__TextAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Content__TextAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStructure.g:997:1: ( ( RULE_STRING ) )
            // InternalStructure.g:998:2: ( RULE_STRING )
            {
            // InternalStructure.g:998:2: ( RULE_STRING )
            // InternalStructure.g:999:3: RULE_STRING
            {
             before(grammarAccess.getContentAccess().getTextSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getContentAccess().getTextSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Content__TextAssignment_4"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000800020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000002E0000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001003800L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000000L});

}