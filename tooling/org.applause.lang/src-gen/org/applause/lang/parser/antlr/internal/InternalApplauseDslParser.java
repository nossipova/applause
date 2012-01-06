package org.applause.lang.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.applause.lang.services.ApplauseDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalApplauseDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'[]'", "'.'", "'('", "')'", "'replace('", "','", "'urlconform('", "'['", "']'", "'split('", "'tabbarApplication'", "'application'", "'{'", "'splash='", "'}'", "'button'", "'title='", "'icon='", "'view='", "'const'", "'type'", "'mapsTo'", "'entity'", "'extends'", "'derived'", "'contentprovider'", "'returns'", "'resolves'", "'fetches'", "'XML'", "'from'", "'selects'", "'tableview'", "'detailsview'", "'customview'", "'implementedBy'", "'header'", "'subtitle='", "'details='", "'image='", "'section'", "'cell'", "'foreach'", "'text='", "'query='", "'action='", "'as'", "'Default'", "'DefaultWithDisclosure'", "'Value2'", "'Double'", "'Subtitle'", "'Map'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__63=63;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__59=59;
    public static final int RULE_INT=6;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalApplauseDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalApplauseDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalApplauseDslParser.tokenNames; }
    public String getGrammarFileName() { return "../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g"; }



     	private ApplauseDslGrammarAccess grammarAccess;
     	
        public InternalApplauseDslParser(TokenStream input, ApplauseDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected ApplauseDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:68:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:69:2: (iv_ruleModel= ruleModel EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:70:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:77:1: ruleModel returns [EObject current=null] : ( ( (lv_application_0_0= ruleApplication ) ) ( (lv_elements_1_0= ruleModelElement ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_application_0_0 = null;

        EObject lv_elements_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:80:28: ( ( ( (lv_application_0_0= ruleApplication ) ) ( (lv_elements_1_0= ruleModelElement ) )* ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:81:1: ( ( (lv_application_0_0= ruleApplication ) ) ( (lv_elements_1_0= ruleModelElement ) )* )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:81:1: ( ( (lv_application_0_0= ruleApplication ) ) ( (lv_elements_1_0= ruleModelElement ) )* )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:81:2: ( (lv_application_0_0= ruleApplication ) ) ( (lv_elements_1_0= ruleModelElement ) )*
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:81:2: ( (lv_application_0_0= ruleApplication ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:82:1: (lv_application_0_0= ruleApplication )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:82:1: (lv_application_0_0= ruleApplication )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:83:3: lv_application_0_0= ruleApplication
            {
             
            	        newCompositeNode(grammarAccess.getModelAccess().getApplicationApplicationParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleApplication_in_ruleModel131);
            lv_application_0_0=ruleApplication();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelRule());
            	        }
                   		set(
                   			current, 
                   			"application",
                    		lv_application_0_0, 
                    		"Application");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:99:2: ( (lv_elements_1_0= ruleModelElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=30 && LA1_0<=31)||LA1_0==33||LA1_0==36||(LA1_0>=43 && LA1_0<=45)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:100:1: (lv_elements_1_0= ruleModelElement )
            	    {
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:100:1: (lv_elements_1_0= ruleModelElement )
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:101:3: lv_elements_1_0= ruleModelElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getElementsModelElementParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleModelElement_in_ruleModel152);
            	    lv_elements_1_0=ruleModelElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_1_0, 
            	            		"ModelElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleApplication"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:125:1: entryRuleApplication returns [EObject current=null] : iv_ruleApplication= ruleApplication EOF ;
    public final EObject entryRuleApplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplication = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:126:2: (iv_ruleApplication= ruleApplication EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:127:2: iv_ruleApplication= ruleApplication EOF
            {
             newCompositeNode(grammarAccess.getApplicationRule()); 
            pushFollow(FOLLOW_ruleApplication_in_entryRuleApplication189);
            iv_ruleApplication=ruleApplication();

            state._fsp--;

             current =iv_ruleApplication; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplication199); 

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
    // $ANTLR end "entryRuleApplication"


    // $ANTLR start "ruleApplication"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:134:1: ruleApplication returns [EObject current=null] : this_TabBarApplication_0= ruleTabBarApplication ;
    public final EObject ruleApplication() throws RecognitionException {
        EObject current = null;

        EObject this_TabBarApplication_0 = null;


         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:137:28: (this_TabBarApplication_0= ruleTabBarApplication )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:139:5: this_TabBarApplication_0= ruleTabBarApplication
            {
             
                    newCompositeNode(grammarAccess.getApplicationAccess().getTabBarApplicationParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleTabBarApplication_in_ruleApplication245);
            this_TabBarApplication_0=ruleTabBarApplication();

            state._fsp--;

             
                    current = this_TabBarApplication_0; 
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "ruleApplication"


    // $ANTLR start "entryRuleModelElement"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:155:1: entryRuleModelElement returns [EObject current=null] : iv_ruleModelElement= ruleModelElement EOF ;
    public final EObject entryRuleModelElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelElement = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:156:2: (iv_ruleModelElement= ruleModelElement EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:157:2: iv_ruleModelElement= ruleModelElement EOF
            {
             newCompositeNode(grammarAccess.getModelElementRule()); 
            pushFollow(FOLLOW_ruleModelElement_in_entryRuleModelElement279);
            iv_ruleModelElement=ruleModelElement();

            state._fsp--;

             current =iv_ruleModelElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModelElement289); 

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
    // $ANTLR end "entryRuleModelElement"


    // $ANTLR start "ruleModelElement"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:164:1: ruleModelElement returns [EObject current=null] : (this_Type_0= ruleType | this_ContentProvider_1= ruleContentProvider | this_View_2= ruleView | this_Constant_3= ruleConstant ) ;
    public final EObject ruleModelElement() throws RecognitionException {
        EObject current = null;

        EObject this_Type_0 = null;

        EObject this_ContentProvider_1 = null;

        EObject this_View_2 = null;

        EObject this_Constant_3 = null;


         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:167:28: ( (this_Type_0= ruleType | this_ContentProvider_1= ruleContentProvider | this_View_2= ruleView | this_Constant_3= ruleConstant ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:168:1: (this_Type_0= ruleType | this_ContentProvider_1= ruleContentProvider | this_View_2= ruleView | this_Constant_3= ruleConstant )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:168:1: (this_Type_0= ruleType | this_ContentProvider_1= ruleContentProvider | this_View_2= ruleView | this_Constant_3= ruleConstant )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 31:
            case 33:
                {
                alt2=1;
                }
                break;
            case 36:
                {
                alt2=2;
                }
                break;
            case 43:
            case 44:
            case 45:
                {
                alt2=3;
                }
                break;
            case 30:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:169:5: this_Type_0= ruleType
                    {
                     
                            newCompositeNode(grammarAccess.getModelElementAccess().getTypeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleType_in_ruleModelElement336);
                    this_Type_0=ruleType();

                    state._fsp--;

                     
                            current = this_Type_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:179:5: this_ContentProvider_1= ruleContentProvider
                    {
                     
                            newCompositeNode(grammarAccess.getModelElementAccess().getContentProviderParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleContentProvider_in_ruleModelElement363);
                    this_ContentProvider_1=ruleContentProvider();

                    state._fsp--;

                     
                            current = this_ContentProvider_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:189:5: this_View_2= ruleView
                    {
                     
                            newCompositeNode(grammarAccess.getModelElementAccess().getViewParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleView_in_ruleModelElement390);
                    this_View_2=ruleView();

                    state._fsp--;

                     
                            current = this_View_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:199:5: this_Constant_3= ruleConstant
                    {
                     
                            newCompositeNode(grammarAccess.getModelElementAccess().getConstantParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleConstant_in_ruleModelElement417);
                    this_Constant_3=ruleConstant();

                    state._fsp--;

                     
                            current = this_Constant_3; 
                            afterParserOrEnumRuleCall();
                        

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
    // $ANTLR end "ruleModelElement"


    // $ANTLR start "entryRuleTypeDescription"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:217:1: entryRuleTypeDescription returns [EObject current=null] : iv_ruleTypeDescription= ruleTypeDescription EOF ;
    public final EObject entryRuleTypeDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDescription = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:218:2: (iv_ruleTypeDescription= ruleTypeDescription EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:219:2: iv_ruleTypeDescription= ruleTypeDescription EOF
            {
             newCompositeNode(grammarAccess.getTypeDescriptionRule()); 
            pushFollow(FOLLOW_ruleTypeDescription_in_entryRuleTypeDescription454);
            iv_ruleTypeDescription=ruleTypeDescription();

            state._fsp--;

             current =iv_ruleTypeDescription; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeDescription464); 

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
    // $ANTLR end "entryRuleTypeDescription"


    // $ANTLR start "ruleTypeDescription"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:226:1: ruleTypeDescription returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_many_1_0= '[]' ) )? ) ;
    public final EObject ruleTypeDescription() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_many_1_0=null;

         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:229:28: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_many_1_0= '[]' ) )? ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:230:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_many_1_0= '[]' ) )? )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:230:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_many_1_0= '[]' ) )? )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:230:2: ( (otherlv_0= RULE_ID ) ) ( (lv_many_1_0= '[]' ) )?
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:230:2: ( (otherlv_0= RULE_ID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:231:1: (otherlv_0= RULE_ID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:231:1: (otherlv_0= RULE_ID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:232:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTypeDescriptionRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTypeDescription509); 

            		newLeafNode(otherlv_0, grammarAccess.getTypeDescriptionAccess().getTypeTypeCrossReference_0_0()); 
            	

            }


            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:243:2: ( (lv_many_1_0= '[]' ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:244:1: (lv_many_1_0= '[]' )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:244:1: (lv_many_1_0= '[]' )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:245:3: lv_many_1_0= '[]'
                    {
                    lv_many_1_0=(Token)match(input,11,FOLLOW_11_in_ruleTypeDescription527); 

                            newLeafNode(lv_many_1_0, grammarAccess.getTypeDescriptionAccess().getManyLeftSquareBracketRightSquareBracketKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeDescriptionRule());
                    	        }
                           		setWithLastConsumed(current, "many", true, "[]");
                    	    

                    }


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
    // $ANTLR end "ruleTypeDescription"


    // $ANTLR start "entryRuleParameter"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:266:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:267:2: (iv_ruleParameter= ruleParameter EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:268:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter577);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter587); 

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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:275:1: ruleParameter returns [EObject current=null] : ( ( (lv_description_0_0= ruleTypeDescription ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_description_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:278:28: ( ( ( (lv_description_0_0= ruleTypeDescription ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:279:1: ( ( (lv_description_0_0= ruleTypeDescription ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:279:1: ( ( (lv_description_0_0= ruleTypeDescription ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:279:2: ( (lv_description_0_0= ruleTypeDescription ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:279:2: ( (lv_description_0_0= ruleTypeDescription ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:280:1: (lv_description_0_0= ruleTypeDescription )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:280:1: (lv_description_0_0= ruleTypeDescription )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:281:3: lv_description_0_0= ruleTypeDescription
            {
             
            	        newCompositeNode(grammarAccess.getParameterAccess().getDescriptionTypeDescriptionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeDescription_in_ruleParameter633);
            lv_description_0_0=ruleTypeDescription();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getParameterRule());
            	        }
                   		set(
                   			current, 
                   			"description",
                    		lv_description_0_0, 
                    		"TypeDescription");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:297:2: ( (lv_name_1_0= RULE_ID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:298:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:298:1: (lv_name_1_0= RULE_ID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:299:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameter650); 

            			newLeafNode(lv_name_1_0, grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getParameterRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleObjectReference"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:323:1: entryRuleObjectReference returns [EObject current=null] : iv_ruleObjectReference= ruleObjectReference EOF ;
    public final EObject entryRuleObjectReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectReference = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:324:2: (iv_ruleObjectReference= ruleObjectReference EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:325:2: iv_ruleObjectReference= ruleObjectReference EOF
            {
             newCompositeNode(grammarAccess.getObjectReferenceRule()); 
            pushFollow(FOLLOW_ruleObjectReference_in_entryRuleObjectReference691);
            iv_ruleObjectReference=ruleObjectReference();

            state._fsp--;

             current =iv_ruleObjectReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectReference701); 

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
    // $ANTLR end "entryRuleObjectReference"


    // $ANTLR start "ruleObjectReference"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:332:1: ruleObjectReference returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_tail_1_0= ruleNestedObjectReference ) )? ) ;
    public final EObject ruleObjectReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_tail_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:335:28: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_tail_1_0= ruleNestedObjectReference ) )? ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:336:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_tail_1_0= ruleNestedObjectReference ) )? )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:336:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_tail_1_0= ruleNestedObjectReference ) )? )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:336:2: ( (otherlv_0= RULE_ID ) ) ( (lv_tail_1_0= ruleNestedObjectReference ) )?
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:336:2: ( (otherlv_0= RULE_ID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:337:1: (otherlv_0= RULE_ID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:337:1: (otherlv_0= RULE_ID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:338:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getObjectReferenceRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleObjectReference746); 

            		newLeafNode(otherlv_0, grammarAccess.getObjectReferenceAccess().getObjectVariableDeclarationCrossReference_0_0()); 
            	

            }


            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:349:2: ( (lv_tail_1_0= ruleNestedObjectReference ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:350:1: (lv_tail_1_0= ruleNestedObjectReference )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:350:1: (lv_tail_1_0= ruleNestedObjectReference )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:351:3: lv_tail_1_0= ruleNestedObjectReference
                    {
                     
                    	        newCompositeNode(grammarAccess.getObjectReferenceAccess().getTailNestedObjectReferenceParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNestedObjectReference_in_ruleObjectReference767);
                    lv_tail_1_0=ruleNestedObjectReference();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getObjectReferenceRule());
                    	        }
                           		set(
                           			current, 
                           			"tail",
                            		lv_tail_1_0, 
                            		"NestedObjectReference");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


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
    // $ANTLR end "ruleObjectReference"


    // $ANTLR start "entryRuleNestedObjectReference"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:375:1: entryRuleNestedObjectReference returns [EObject current=null] : iv_ruleNestedObjectReference= ruleNestedObjectReference EOF ;
    public final EObject entryRuleNestedObjectReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNestedObjectReference = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:376:2: (iv_ruleNestedObjectReference= ruleNestedObjectReference EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:377:2: iv_ruleNestedObjectReference= ruleNestedObjectReference EOF
            {
             newCompositeNode(grammarAccess.getNestedObjectReferenceRule()); 
            pushFollow(FOLLOW_ruleNestedObjectReference_in_entryRuleNestedObjectReference804);
            iv_ruleNestedObjectReference=ruleNestedObjectReference();

            state._fsp--;

             current =iv_ruleNestedObjectReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNestedObjectReference814); 

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
    // $ANTLR end "entryRuleNestedObjectReference"


    // $ANTLR start "ruleNestedObjectReference"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:384:1: ruleNestedObjectReference returns [EObject current=null] : (otherlv_0= '.' ( (otherlv_1= RULE_ID ) ) ( (lv_tail_2_0= ruleNestedObjectReference ) )? ) ;
    public final EObject ruleNestedObjectReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_tail_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:387:28: ( (otherlv_0= '.' ( (otherlv_1= RULE_ID ) ) ( (lv_tail_2_0= ruleNestedObjectReference ) )? ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:388:1: (otherlv_0= '.' ( (otherlv_1= RULE_ID ) ) ( (lv_tail_2_0= ruleNestedObjectReference ) )? )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:388:1: (otherlv_0= '.' ( (otherlv_1= RULE_ID ) ) ( (lv_tail_2_0= ruleNestedObjectReference ) )? )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:388:3: otherlv_0= '.' ( (otherlv_1= RULE_ID ) ) ( (lv_tail_2_0= ruleNestedObjectReference ) )?
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleNestedObjectReference851); 

                	newLeafNode(otherlv_0, grammarAccess.getNestedObjectReferenceAccess().getFullStopKeyword_0());
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:392:1: ( (otherlv_1= RULE_ID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:393:1: (otherlv_1= RULE_ID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:393:1: (otherlv_1= RULE_ID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:394:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getNestedObjectReferenceRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNestedObjectReference871); 

            		newLeafNode(otherlv_1, grammarAccess.getNestedObjectReferenceAccess().getObjectVariableDeclarationCrossReference_1_0()); 
            	

            }


            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:405:2: ( (lv_tail_2_0= ruleNestedObjectReference ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==12) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:406:1: (lv_tail_2_0= ruleNestedObjectReference )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:406:1: (lv_tail_2_0= ruleNestedObjectReference )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:407:3: lv_tail_2_0= ruleNestedObjectReference
                    {
                     
                    	        newCompositeNode(grammarAccess.getNestedObjectReferenceAccess().getTailNestedObjectReferenceParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNestedObjectReference_in_ruleNestedObjectReference892);
                    lv_tail_2_0=ruleNestedObjectReference();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNestedObjectReferenceRule());
                    	        }
                           		set(
                           			current, 
                           			"tail",
                            		lv_tail_2_0, 
                            		"NestedObjectReference");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


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
    // $ANTLR end "ruleNestedObjectReference"


    // $ANTLR start "entryRuleExpression"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:431:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:432:2: (iv_ruleExpression= ruleExpression EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:433:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression929);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression939); 

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:440:1: ruleExpression returns [EObject current=null] : (this_StringLiteral_0= ruleStringLiteral | this_StringFunction_1= ruleStringFunction | this_CollectionLiteral_2= ruleCollectionLiteral | this_CollectionFunction_3= ruleCollectionFunction | this_ObjectReference_4= ruleObjectReference ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_StringLiteral_0 = null;

        EObject this_StringFunction_1 = null;

        EObject this_CollectionLiteral_2 = null;

        EObject this_CollectionFunction_3 = null;

        EObject this_ObjectReference_4 = null;


         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:443:28: ( (this_StringLiteral_0= ruleStringLiteral | this_StringFunction_1= ruleStringFunction | this_CollectionLiteral_2= ruleCollectionLiteral | this_CollectionFunction_3= ruleCollectionFunction | this_ObjectReference_4= ruleObjectReference ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:444:1: (this_StringLiteral_0= ruleStringLiteral | this_StringFunction_1= ruleStringFunction | this_CollectionLiteral_2= ruleCollectionLiteral | this_CollectionFunction_3= ruleCollectionFunction | this_ObjectReference_4= ruleObjectReference )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:444:1: (this_StringLiteral_0= ruleStringLiteral | this_StringFunction_1= ruleStringFunction | this_CollectionLiteral_2= ruleCollectionLiteral | this_CollectionFunction_3= ruleCollectionFunction | this_ObjectReference_4= ruleObjectReference )
            int alt6=5;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt6=1;
                }
                break;
            case 13:
            case 15:
            case 17:
                {
                alt6=2;
                }
                break;
            case 18:
                {
                alt6=3;
                }
                break;
            case 20:
                {
                alt6=4;
                }
                break;
            case RULE_ID:
                {
                alt6=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:445:5: this_StringLiteral_0= ruleStringLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionAccess().getStringLiteralParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleExpression986);
                    this_StringLiteral_0=ruleStringLiteral();

                    state._fsp--;

                     
                            current = this_StringLiteral_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:455:5: this_StringFunction_1= ruleStringFunction
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionAccess().getStringFunctionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleStringFunction_in_ruleExpression1013);
                    this_StringFunction_1=ruleStringFunction();

                    state._fsp--;

                     
                            current = this_StringFunction_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:465:5: this_CollectionLiteral_2= ruleCollectionLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionAccess().getCollectionLiteralParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleCollectionLiteral_in_ruleExpression1040);
                    this_CollectionLiteral_2=ruleCollectionLiteral();

                    state._fsp--;

                     
                            current = this_CollectionLiteral_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:475:5: this_CollectionFunction_3= ruleCollectionFunction
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionAccess().getCollectionFunctionParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleCollectionFunction_in_ruleExpression1067);
                    this_CollectionFunction_3=ruleCollectionFunction();

                    state._fsp--;

                     
                            current = this_CollectionFunction_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:485:5: this_ObjectReference_4= ruleObjectReference
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionAccess().getObjectReferenceParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleObjectReference_in_ruleExpression1094);
                    this_ObjectReference_4=ruleObjectReference();

                    state._fsp--;

                     
                            current = this_ObjectReference_4; 
                            afterParserOrEnumRuleCall();
                        

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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleScalarExpression"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:501:1: entryRuleScalarExpression returns [EObject current=null] : iv_ruleScalarExpression= ruleScalarExpression EOF ;
    public final EObject entryRuleScalarExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScalarExpression = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:502:2: (iv_ruleScalarExpression= ruleScalarExpression EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:503:2: iv_ruleScalarExpression= ruleScalarExpression EOF
            {
             newCompositeNode(grammarAccess.getScalarExpressionRule()); 
            pushFollow(FOLLOW_ruleScalarExpression_in_entryRuleScalarExpression1129);
            iv_ruleScalarExpression=ruleScalarExpression();

            state._fsp--;

             current =iv_ruleScalarExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScalarExpression1139); 

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
    // $ANTLR end "entryRuleScalarExpression"


    // $ANTLR start "ruleScalarExpression"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:510:1: ruleScalarExpression returns [EObject current=null] : (this_StringLiteral_0= ruleStringLiteral | this_StringFunction_1= ruleStringFunction | this_ObjectReference_2= ruleObjectReference ) ;
    public final EObject ruleScalarExpression() throws RecognitionException {
        EObject current = null;

        EObject this_StringLiteral_0 = null;

        EObject this_StringFunction_1 = null;

        EObject this_ObjectReference_2 = null;


         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:513:28: ( (this_StringLiteral_0= ruleStringLiteral | this_StringFunction_1= ruleStringFunction | this_ObjectReference_2= ruleObjectReference ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:514:1: (this_StringLiteral_0= ruleStringLiteral | this_StringFunction_1= ruleStringFunction | this_ObjectReference_2= ruleObjectReference )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:514:1: (this_StringLiteral_0= ruleStringLiteral | this_StringFunction_1= ruleStringFunction | this_ObjectReference_2= ruleObjectReference )
            int alt7=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt7=1;
                }
                break;
            case 13:
            case 15:
            case 17:
                {
                alt7=2;
                }
                break;
            case RULE_ID:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:515:5: this_StringLiteral_0= ruleStringLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getScalarExpressionAccess().getStringLiteralParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleScalarExpression1186);
                    this_StringLiteral_0=ruleStringLiteral();

                    state._fsp--;

                     
                            current = this_StringLiteral_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:525:5: this_StringFunction_1= ruleStringFunction
                    {
                     
                            newCompositeNode(grammarAccess.getScalarExpressionAccess().getStringFunctionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleStringFunction_in_ruleScalarExpression1213);
                    this_StringFunction_1=ruleStringFunction();

                    state._fsp--;

                     
                            current = this_StringFunction_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:535:5: this_ObjectReference_2= ruleObjectReference
                    {
                     
                            newCompositeNode(grammarAccess.getScalarExpressionAccess().getObjectReferenceParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleObjectReference_in_ruleScalarExpression1240);
                    this_ObjectReference_2=ruleObjectReference();

                    state._fsp--;

                     
                            current = this_ObjectReference_2; 
                            afterParserOrEnumRuleCall();
                        

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
    // $ANTLR end "ruleScalarExpression"


    // $ANTLR start "entryRuleCollectionExpression"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:551:1: entryRuleCollectionExpression returns [EObject current=null] : iv_ruleCollectionExpression= ruleCollectionExpression EOF ;
    public final EObject entryRuleCollectionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionExpression = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:552:2: (iv_ruleCollectionExpression= ruleCollectionExpression EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:553:2: iv_ruleCollectionExpression= ruleCollectionExpression EOF
            {
             newCompositeNode(grammarAccess.getCollectionExpressionRule()); 
            pushFollow(FOLLOW_ruleCollectionExpression_in_entryRuleCollectionExpression1275);
            iv_ruleCollectionExpression=ruleCollectionExpression();

            state._fsp--;

             current =iv_ruleCollectionExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollectionExpression1285); 

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
    // $ANTLR end "entryRuleCollectionExpression"


    // $ANTLR start "ruleCollectionExpression"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:560:1: ruleCollectionExpression returns [EObject current=null] : (this_CollectionLiteral_0= ruleCollectionLiteral | this_CollectionFunction_1= ruleCollectionFunction | this_ObjectReference_2= ruleObjectReference ) ;
    public final EObject ruleCollectionExpression() throws RecognitionException {
        EObject current = null;

        EObject this_CollectionLiteral_0 = null;

        EObject this_CollectionFunction_1 = null;

        EObject this_ObjectReference_2 = null;


         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:563:28: ( (this_CollectionLiteral_0= ruleCollectionLiteral | this_CollectionFunction_1= ruleCollectionFunction | this_ObjectReference_2= ruleObjectReference ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:564:1: (this_CollectionLiteral_0= ruleCollectionLiteral | this_CollectionFunction_1= ruleCollectionFunction | this_ObjectReference_2= ruleObjectReference )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:564:1: (this_CollectionLiteral_0= ruleCollectionLiteral | this_CollectionFunction_1= ruleCollectionFunction | this_ObjectReference_2= ruleObjectReference )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt8=1;
                }
                break;
            case 20:
                {
                alt8=2;
                }
                break;
            case RULE_ID:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:565:5: this_CollectionLiteral_0= ruleCollectionLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getCollectionExpressionAccess().getCollectionLiteralParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleCollectionLiteral_in_ruleCollectionExpression1332);
                    this_CollectionLiteral_0=ruleCollectionLiteral();

                    state._fsp--;

                     
                            current = this_CollectionLiteral_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:575:5: this_CollectionFunction_1= ruleCollectionFunction
                    {
                     
                            newCompositeNode(grammarAccess.getCollectionExpressionAccess().getCollectionFunctionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleCollectionFunction_in_ruleCollectionExpression1359);
                    this_CollectionFunction_1=ruleCollectionFunction();

                    state._fsp--;

                     
                            current = this_CollectionFunction_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:585:5: this_ObjectReference_2= ruleObjectReference
                    {
                     
                            newCompositeNode(grammarAccess.getCollectionExpressionAccess().getObjectReferenceParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleObjectReference_in_ruleCollectionExpression1386);
                    this_ObjectReference_2=ruleObjectReference();

                    state._fsp--;

                     
                            current = this_ObjectReference_2; 
                            afterParserOrEnumRuleCall();
                        

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
    // $ANTLR end "ruleCollectionExpression"


    // $ANTLR start "entryRuleStringLiteral"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:601:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:602:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:603:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
             newCompositeNode(grammarAccess.getStringLiteralRule()); 
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral1421);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;

             current =iv_ruleStringLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral1431); 

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
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:610:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:613:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:614:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:614:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:615:1: (lv_value_0_0= RULE_STRING )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:615:1: (lv_value_0_0= RULE_STRING )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:616:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringLiteral1472); 

            			newLeafNode(lv_value_0_0, grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStringLiteralRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"STRING");
            	    

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
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleStringFunction"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:640:1: entryRuleStringFunction returns [EObject current=null] : iv_ruleStringFunction= ruleStringFunction EOF ;
    public final EObject entryRuleStringFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringFunction = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:641:2: (iv_ruleStringFunction= ruleStringFunction EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:642:2: iv_ruleStringFunction= ruleStringFunction EOF
            {
             newCompositeNode(grammarAccess.getStringFunctionRule()); 
            pushFollow(FOLLOW_ruleStringFunction_in_entryRuleStringFunction1512);
            iv_ruleStringFunction=ruleStringFunction();

            state._fsp--;

             current =iv_ruleStringFunction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringFunction1522); 

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
    // $ANTLR end "entryRuleStringFunction"


    // $ANTLR start "ruleStringFunction"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:649:1: ruleStringFunction returns [EObject current=null] : ( ( () otherlv_1= '(' ( (lv_values_2_0= ruleScalarExpression ) )+ otherlv_3= ')' ) | ( () otherlv_5= 'replace(' ( (lv_value_6_0= ruleScalarExpression ) ) otherlv_7= ',' ( (lv_match_8_0= ruleScalarExpression ) ) otherlv_9= ',' ( (lv_replacement_10_0= ruleScalarExpression ) ) otherlv_11= ')' ) | ( () otherlv_13= 'urlconform(' ( (lv_value_14_0= ruleScalarExpression ) ) otherlv_15= ')' ) ) ;
    public final EObject ruleStringFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        EObject lv_values_2_0 = null;

        EObject lv_value_6_0 = null;

        EObject lv_match_8_0 = null;

        EObject lv_replacement_10_0 = null;

        EObject lv_value_14_0 = null;


         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:652:28: ( ( ( () otherlv_1= '(' ( (lv_values_2_0= ruleScalarExpression ) )+ otherlv_3= ')' ) | ( () otherlv_5= 'replace(' ( (lv_value_6_0= ruleScalarExpression ) ) otherlv_7= ',' ( (lv_match_8_0= ruleScalarExpression ) ) otherlv_9= ',' ( (lv_replacement_10_0= ruleScalarExpression ) ) otherlv_11= ')' ) | ( () otherlv_13= 'urlconform(' ( (lv_value_14_0= ruleScalarExpression ) ) otherlv_15= ')' ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:653:1: ( ( () otherlv_1= '(' ( (lv_values_2_0= ruleScalarExpression ) )+ otherlv_3= ')' ) | ( () otherlv_5= 'replace(' ( (lv_value_6_0= ruleScalarExpression ) ) otherlv_7= ',' ( (lv_match_8_0= ruleScalarExpression ) ) otherlv_9= ',' ( (lv_replacement_10_0= ruleScalarExpression ) ) otherlv_11= ')' ) | ( () otherlv_13= 'urlconform(' ( (lv_value_14_0= ruleScalarExpression ) ) otherlv_15= ')' ) )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:653:1: ( ( () otherlv_1= '(' ( (lv_values_2_0= ruleScalarExpression ) )+ otherlv_3= ')' ) | ( () otherlv_5= 'replace(' ( (lv_value_6_0= ruleScalarExpression ) ) otherlv_7= ',' ( (lv_match_8_0= ruleScalarExpression ) ) otherlv_9= ',' ( (lv_replacement_10_0= ruleScalarExpression ) ) otherlv_11= ')' ) | ( () otherlv_13= 'urlconform(' ( (lv_value_14_0= ruleScalarExpression ) ) otherlv_15= ')' ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt10=1;
                }
                break;
            case 15:
                {
                alt10=2;
                }
                break;
            case 17:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:653:2: ( () otherlv_1= '(' ( (lv_values_2_0= ruleScalarExpression ) )+ otherlv_3= ')' )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:653:2: ( () otherlv_1= '(' ( (lv_values_2_0= ruleScalarExpression ) )+ otherlv_3= ')' )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:653:3: () otherlv_1= '(' ( (lv_values_2_0= ruleScalarExpression ) )+ otherlv_3= ')'
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:653:3: ()
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:654:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getStringFunctionAccess().getStringConcatAction_0_0(),
                                current);
                        

                    }

                    otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleStringFunction1569); 

                        	newLeafNode(otherlv_1, grammarAccess.getStringFunctionAccess().getLeftParenthesisKeyword_0_1());
                        
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:663:1: ( (lv_values_2_0= ruleScalarExpression ) )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>=RULE_ID && LA9_0<=RULE_STRING)||LA9_0==13||LA9_0==15||LA9_0==17) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:664:1: (lv_values_2_0= ruleScalarExpression )
                    	    {
                    	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:664:1: (lv_values_2_0= ruleScalarExpression )
                    	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:665:3: lv_values_2_0= ruleScalarExpression
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStringFunctionAccess().getValuesScalarExpressionParserRuleCall_0_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleScalarExpression_in_ruleStringFunction1590);
                    	    lv_values_2_0=ruleScalarExpression();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getStringFunctionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"values",
                    	            		lv_values_2_0, 
                    	            		"ScalarExpression");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt9 >= 1 ) break loop9;
                                EarlyExitException eee =
                                    new EarlyExitException(9, input);
                                throw eee;
                        }
                        cnt9++;
                    } while (true);

                    otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleStringFunction1603); 

                        	newLeafNode(otherlv_3, grammarAccess.getStringFunctionAccess().getRightParenthesisKeyword_0_3());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:686:6: ( () otherlv_5= 'replace(' ( (lv_value_6_0= ruleScalarExpression ) ) otherlv_7= ',' ( (lv_match_8_0= ruleScalarExpression ) ) otherlv_9= ',' ( (lv_replacement_10_0= ruleScalarExpression ) ) otherlv_11= ')' )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:686:6: ( () otherlv_5= 'replace(' ( (lv_value_6_0= ruleScalarExpression ) ) otherlv_7= ',' ( (lv_match_8_0= ruleScalarExpression ) ) otherlv_9= ',' ( (lv_replacement_10_0= ruleScalarExpression ) ) otherlv_11= ')' )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:686:7: () otherlv_5= 'replace(' ( (lv_value_6_0= ruleScalarExpression ) ) otherlv_7= ',' ( (lv_match_8_0= ruleScalarExpression ) ) otherlv_9= ',' ( (lv_replacement_10_0= ruleScalarExpression ) ) otherlv_11= ')'
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:686:7: ()
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:687:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getStringFunctionAccess().getStringReplaceAction_1_0(),
                                current);
                        

                    }

                    otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleStringFunction1632); 

                        	newLeafNode(otherlv_5, grammarAccess.getStringFunctionAccess().getReplaceKeyword_1_1());
                        
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:696:1: ( (lv_value_6_0= ruleScalarExpression ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:697:1: (lv_value_6_0= ruleScalarExpression )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:697:1: (lv_value_6_0= ruleScalarExpression )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:698:3: lv_value_6_0= ruleScalarExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getStringFunctionAccess().getValueScalarExpressionParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleScalarExpression_in_ruleStringFunction1653);
                    lv_value_6_0=ruleScalarExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStringFunctionRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_6_0, 
                            		"ScalarExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_7=(Token)match(input,16,FOLLOW_16_in_ruleStringFunction1665); 

                        	newLeafNode(otherlv_7, grammarAccess.getStringFunctionAccess().getCommaKeyword_1_3());
                        
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:718:1: ( (lv_match_8_0= ruleScalarExpression ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:719:1: (lv_match_8_0= ruleScalarExpression )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:719:1: (lv_match_8_0= ruleScalarExpression )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:720:3: lv_match_8_0= ruleScalarExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getStringFunctionAccess().getMatchScalarExpressionParserRuleCall_1_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleScalarExpression_in_ruleStringFunction1686);
                    lv_match_8_0=ruleScalarExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStringFunctionRule());
                    	        }
                           		set(
                           			current, 
                           			"match",
                            		lv_match_8_0, 
                            		"ScalarExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_9=(Token)match(input,16,FOLLOW_16_in_ruleStringFunction1698); 

                        	newLeafNode(otherlv_9, grammarAccess.getStringFunctionAccess().getCommaKeyword_1_5());
                        
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:740:1: ( (lv_replacement_10_0= ruleScalarExpression ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:741:1: (lv_replacement_10_0= ruleScalarExpression )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:741:1: (lv_replacement_10_0= ruleScalarExpression )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:742:3: lv_replacement_10_0= ruleScalarExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getStringFunctionAccess().getReplacementScalarExpressionParserRuleCall_1_6_0()); 
                    	    
                    pushFollow(FOLLOW_ruleScalarExpression_in_ruleStringFunction1719);
                    lv_replacement_10_0=ruleScalarExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStringFunctionRule());
                    	        }
                           		set(
                           			current, 
                           			"replacement",
                            		lv_replacement_10_0, 
                            		"ScalarExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_11=(Token)match(input,14,FOLLOW_14_in_ruleStringFunction1731); 

                        	newLeafNode(otherlv_11, grammarAccess.getStringFunctionAccess().getRightParenthesisKeyword_1_7());
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:763:6: ( () otherlv_13= 'urlconform(' ( (lv_value_14_0= ruleScalarExpression ) ) otherlv_15= ')' )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:763:6: ( () otherlv_13= 'urlconform(' ( (lv_value_14_0= ruleScalarExpression ) ) otherlv_15= ')' )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:763:7: () otherlv_13= 'urlconform(' ( (lv_value_14_0= ruleScalarExpression ) ) otherlv_15= ')'
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:763:7: ()
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:764:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getStringFunctionAccess().getStringUrlConformAction_2_0(),
                                current);
                        

                    }

                    otherlv_13=(Token)match(input,17,FOLLOW_17_in_ruleStringFunction1760); 

                        	newLeafNode(otherlv_13, grammarAccess.getStringFunctionAccess().getUrlconformKeyword_2_1());
                        
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:773:1: ( (lv_value_14_0= ruleScalarExpression ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:774:1: (lv_value_14_0= ruleScalarExpression )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:774:1: (lv_value_14_0= ruleScalarExpression )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:775:3: lv_value_14_0= ruleScalarExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getStringFunctionAccess().getValueScalarExpressionParserRuleCall_2_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleScalarExpression_in_ruleStringFunction1781);
                    lv_value_14_0=ruleScalarExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStringFunctionRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_14_0, 
                            		"ScalarExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_15=(Token)match(input,14,FOLLOW_14_in_ruleStringFunction1793); 

                        	newLeafNode(otherlv_15, grammarAccess.getStringFunctionAccess().getRightParenthesisKeyword_2_3());
                        

                    }


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
    // $ANTLR end "ruleStringFunction"


    // $ANTLR start "entryRuleCollectionLiteral"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:803:1: entryRuleCollectionLiteral returns [EObject current=null] : iv_ruleCollectionLiteral= ruleCollectionLiteral EOF ;
    public final EObject entryRuleCollectionLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionLiteral = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:804:2: (iv_ruleCollectionLiteral= ruleCollectionLiteral EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:805:2: iv_ruleCollectionLiteral= ruleCollectionLiteral EOF
            {
             newCompositeNode(grammarAccess.getCollectionLiteralRule()); 
            pushFollow(FOLLOW_ruleCollectionLiteral_in_entryRuleCollectionLiteral1830);
            iv_ruleCollectionLiteral=ruleCollectionLiteral();

            state._fsp--;

             current =iv_ruleCollectionLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollectionLiteral1840); 

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
    // $ANTLR end "entryRuleCollectionLiteral"


    // $ANTLR start "ruleCollectionLiteral"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:812:1: ruleCollectionLiteral returns [EObject current=null] : (otherlv_0= '[' ( (lv_items_1_0= ruleScalarExpression ) ) (otherlv_2= ',' ( (lv_items_3_0= ruleScalarExpression ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleCollectionLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_items_1_0 = null;

        EObject lv_items_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:815:28: ( (otherlv_0= '[' ( (lv_items_1_0= ruleScalarExpression ) ) (otherlv_2= ',' ( (lv_items_3_0= ruleScalarExpression ) ) )* otherlv_4= ']' ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:816:1: (otherlv_0= '[' ( (lv_items_1_0= ruleScalarExpression ) ) (otherlv_2= ',' ( (lv_items_3_0= ruleScalarExpression ) ) )* otherlv_4= ']' )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:816:1: (otherlv_0= '[' ( (lv_items_1_0= ruleScalarExpression ) ) (otherlv_2= ',' ( (lv_items_3_0= ruleScalarExpression ) ) )* otherlv_4= ']' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:816:3: otherlv_0= '[' ( (lv_items_1_0= ruleScalarExpression ) ) (otherlv_2= ',' ( (lv_items_3_0= ruleScalarExpression ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleCollectionLiteral1877); 

                	newLeafNode(otherlv_0, grammarAccess.getCollectionLiteralAccess().getLeftSquareBracketKeyword_0());
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:820:1: ( (lv_items_1_0= ruleScalarExpression ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:821:1: (lv_items_1_0= ruleScalarExpression )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:821:1: (lv_items_1_0= ruleScalarExpression )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:822:3: lv_items_1_0= ruleScalarExpression
            {
             
            	        newCompositeNode(grammarAccess.getCollectionLiteralAccess().getItemsScalarExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleScalarExpression_in_ruleCollectionLiteral1898);
            lv_items_1_0=ruleScalarExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCollectionLiteralRule());
            	        }
                   		add(
                   			current, 
                   			"items",
                    		lv_items_1_0, 
                    		"ScalarExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:838:2: (otherlv_2= ',' ( (lv_items_3_0= ruleScalarExpression ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==16) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:838:4: otherlv_2= ',' ( (lv_items_3_0= ruleScalarExpression ) )
            	    {
            	    otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleCollectionLiteral1911); 

            	        	newLeafNode(otherlv_2, grammarAccess.getCollectionLiteralAccess().getCommaKeyword_2_0());
            	        
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:842:1: ( (lv_items_3_0= ruleScalarExpression ) )
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:843:1: (lv_items_3_0= ruleScalarExpression )
            	    {
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:843:1: (lv_items_3_0= ruleScalarExpression )
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:844:3: lv_items_3_0= ruleScalarExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCollectionLiteralAccess().getItemsScalarExpressionParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleScalarExpression_in_ruleCollectionLiteral1932);
            	    lv_items_3_0=ruleScalarExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCollectionLiteralRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"items",
            	            		lv_items_3_0, 
            	            		"ScalarExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleCollectionLiteral1946); 

                	newLeafNode(otherlv_4, grammarAccess.getCollectionLiteralAccess().getRightSquareBracketKeyword_3());
                

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
    // $ANTLR end "ruleCollectionLiteral"


    // $ANTLR start "entryRuleCollectionFunction"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:872:1: entryRuleCollectionFunction returns [EObject current=null] : iv_ruleCollectionFunction= ruleCollectionFunction EOF ;
    public final EObject entryRuleCollectionFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionFunction = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:873:2: (iv_ruleCollectionFunction= ruleCollectionFunction EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:874:2: iv_ruleCollectionFunction= ruleCollectionFunction EOF
            {
             newCompositeNode(grammarAccess.getCollectionFunctionRule()); 
            pushFollow(FOLLOW_ruleCollectionFunction_in_entryRuleCollectionFunction1982);
            iv_ruleCollectionFunction=ruleCollectionFunction();

            state._fsp--;

             current =iv_ruleCollectionFunction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollectionFunction1992); 

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
    // $ANTLR end "entryRuleCollectionFunction"


    // $ANTLR start "ruleCollectionFunction"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:881:1: ruleCollectionFunction returns [EObject current=null] : ( () otherlv_1= 'split(' ( (lv_value_2_0= ruleScalarExpression ) ) otherlv_3= ',' ( (lv_delimiter_4_0= ruleScalarExpression ) ) otherlv_5= ')' ) ;
    public final EObject ruleCollectionFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_value_2_0 = null;

        EObject lv_delimiter_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:884:28: ( ( () otherlv_1= 'split(' ( (lv_value_2_0= ruleScalarExpression ) ) otherlv_3= ',' ( (lv_delimiter_4_0= ruleScalarExpression ) ) otherlv_5= ')' ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:885:1: ( () otherlv_1= 'split(' ( (lv_value_2_0= ruleScalarExpression ) ) otherlv_3= ',' ( (lv_delimiter_4_0= ruleScalarExpression ) ) otherlv_5= ')' )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:885:1: ( () otherlv_1= 'split(' ( (lv_value_2_0= ruleScalarExpression ) ) otherlv_3= ',' ( (lv_delimiter_4_0= ruleScalarExpression ) ) otherlv_5= ')' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:885:2: () otherlv_1= 'split(' ( (lv_value_2_0= ruleScalarExpression ) ) otherlv_3= ',' ( (lv_delimiter_4_0= ruleScalarExpression ) ) otherlv_5= ')'
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:885:2: ()
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:886:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCollectionFunctionAccess().getStringSplitAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleCollectionFunction2038); 

                	newLeafNode(otherlv_1, grammarAccess.getCollectionFunctionAccess().getSplitKeyword_1());
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:895:1: ( (lv_value_2_0= ruleScalarExpression ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:896:1: (lv_value_2_0= ruleScalarExpression )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:896:1: (lv_value_2_0= ruleScalarExpression )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:897:3: lv_value_2_0= ruleScalarExpression
            {
             
            	        newCompositeNode(grammarAccess.getCollectionFunctionAccess().getValueScalarExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleScalarExpression_in_ruleCollectionFunction2059);
            lv_value_2_0=ruleScalarExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCollectionFunctionRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"ScalarExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleCollectionFunction2071); 

                	newLeafNode(otherlv_3, grammarAccess.getCollectionFunctionAccess().getCommaKeyword_3());
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:917:1: ( (lv_delimiter_4_0= ruleScalarExpression ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:918:1: (lv_delimiter_4_0= ruleScalarExpression )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:918:1: (lv_delimiter_4_0= ruleScalarExpression )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:919:3: lv_delimiter_4_0= ruleScalarExpression
            {
             
            	        newCompositeNode(grammarAccess.getCollectionFunctionAccess().getDelimiterScalarExpressionParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleScalarExpression_in_ruleCollectionFunction2092);
            lv_delimiter_4_0=ruleScalarExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCollectionFunctionRule());
            	        }
                   		set(
                   			current, 
                   			"delimiter",
                    		lv_delimiter_4_0, 
                    		"ScalarExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleCollectionFunction2104); 

                	newLeafNode(otherlv_5, grammarAccess.getCollectionFunctionAccess().getRightParenthesisKeyword_5());
                

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
    // $ANTLR end "ruleCollectionFunction"


    // $ANTLR start "entryRuleTabBarApplication"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:947:1: entryRuleTabBarApplication returns [EObject current=null] : iv_ruleTabBarApplication= ruleTabBarApplication EOF ;
    public final EObject entryRuleTabBarApplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTabBarApplication = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:948:2: (iv_ruleTabBarApplication= ruleTabBarApplication EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:949:2: iv_ruleTabBarApplication= ruleTabBarApplication EOF
            {
             newCompositeNode(grammarAccess.getTabBarApplicationRule()); 
            pushFollow(FOLLOW_ruleTabBarApplication_in_entryRuleTabBarApplication2140);
            iv_ruleTabBarApplication=ruleTabBarApplication();

            state._fsp--;

             current =iv_ruleTabBarApplication; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTabBarApplication2150); 

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
    // $ANTLR end "entryRuleTabBarApplication"


    // $ANTLR start "ruleTabBarApplication"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:956:1: ruleTabBarApplication returns [EObject current=null] : ( (otherlv_0= 'tabbarApplication' | otherlv_1= 'application' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'splash=' ( (lv_splash_5_0= RULE_STRING ) ) )? ( (lv_buttons_6_0= ruleTabbarButton ) )* otherlv_7= '}' ) ;
    public final EObject ruleTabBarApplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_splash_5_0=null;
        Token otherlv_7=null;
        EObject lv_buttons_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:959:28: ( ( (otherlv_0= 'tabbarApplication' | otherlv_1= 'application' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'splash=' ( (lv_splash_5_0= RULE_STRING ) ) )? ( (lv_buttons_6_0= ruleTabbarButton ) )* otherlv_7= '}' ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:960:1: ( (otherlv_0= 'tabbarApplication' | otherlv_1= 'application' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'splash=' ( (lv_splash_5_0= RULE_STRING ) ) )? ( (lv_buttons_6_0= ruleTabbarButton ) )* otherlv_7= '}' )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:960:1: ( (otherlv_0= 'tabbarApplication' | otherlv_1= 'application' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'splash=' ( (lv_splash_5_0= RULE_STRING ) ) )? ( (lv_buttons_6_0= ruleTabbarButton ) )* otherlv_7= '}' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:960:2: (otherlv_0= 'tabbarApplication' | otherlv_1= 'application' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'splash=' ( (lv_splash_5_0= RULE_STRING ) ) )? ( (lv_buttons_6_0= ruleTabbarButton ) )* otherlv_7= '}'
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:960:2: (otherlv_0= 'tabbarApplication' | otherlv_1= 'application' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==21) ) {
                alt12=1;
            }
            else if ( (LA12_0==22) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:960:4: otherlv_0= 'tabbarApplication'
                    {
                    otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleTabBarApplication2188); 

                        	newLeafNode(otherlv_0, grammarAccess.getTabBarApplicationAccess().getTabbarApplicationKeyword_0_0());
                        

                    }
                    break;
                case 2 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:965:7: otherlv_1= 'application'
                    {
                    otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleTabBarApplication2206); 

                        	newLeafNode(otherlv_1, grammarAccess.getTabBarApplicationAccess().getApplicationKeyword_0_1());
                        

                    }
                    break;

            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:969:2: ( (lv_name_2_0= RULE_ID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:970:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:970:1: (lv_name_2_0= RULE_ID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:971:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTabBarApplication2224); 

            			newLeafNode(lv_name_2_0, grammarAccess.getTabBarApplicationAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTabBarApplicationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleTabBarApplication2241); 

                	newLeafNode(otherlv_3, grammarAccess.getTabBarApplicationAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:991:1: (otherlv_4= 'splash=' ( (lv_splash_5_0= RULE_STRING ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==24) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:991:3: otherlv_4= 'splash=' ( (lv_splash_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleTabBarApplication2254); 

                        	newLeafNode(otherlv_4, grammarAccess.getTabBarApplicationAccess().getSplashKeyword_3_0());
                        
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:995:1: ( (lv_splash_5_0= RULE_STRING ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:996:1: (lv_splash_5_0= RULE_STRING )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:996:1: (lv_splash_5_0= RULE_STRING )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:997:3: lv_splash_5_0= RULE_STRING
                    {
                    lv_splash_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTabBarApplication2271); 

                    			newLeafNode(lv_splash_5_0, grammarAccess.getTabBarApplicationAccess().getSplashSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTabBarApplicationRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"splash",
                            		lv_splash_5_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1013:4: ( (lv_buttons_6_0= ruleTabbarButton ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==26) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1014:1: (lv_buttons_6_0= ruleTabbarButton )
            	    {
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1014:1: (lv_buttons_6_0= ruleTabbarButton )
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1015:3: lv_buttons_6_0= ruleTabbarButton
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTabBarApplicationAccess().getButtonsTabbarButtonParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTabbarButton_in_ruleTabBarApplication2299);
            	    lv_buttons_6_0=ruleTabbarButton();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTabBarApplicationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"buttons",
            	            		lv_buttons_6_0, 
            	            		"TabbarButton");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_7=(Token)match(input,25,FOLLOW_25_in_ruleTabBarApplication2312); 

                	newLeafNode(otherlv_7, grammarAccess.getTabBarApplicationAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleTabBarApplication"


    // $ANTLR start "entryRuleTabbarButton"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1043:1: entryRuleTabbarButton returns [EObject current=null] : iv_ruleTabbarButton= ruleTabbarButton EOF ;
    public final EObject entryRuleTabbarButton() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTabbarButton = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1044:2: (iv_ruleTabbarButton= ruleTabbarButton EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1045:2: iv_ruleTabbarButton= ruleTabbarButton EOF
            {
             newCompositeNode(grammarAccess.getTabbarButtonRule()); 
            pushFollow(FOLLOW_ruleTabbarButton_in_entryRuleTabbarButton2348);
            iv_ruleTabbarButton=ruleTabbarButton();

            state._fsp--;

             current =iv_ruleTabbarButton; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTabbarButton2358); 

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
    // $ANTLR end "entryRuleTabbarButton"


    // $ANTLR start "ruleTabbarButton"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1052:1: ruleTabbarButton returns [EObject current=null] : (otherlv_0= 'button' otherlv_1= '{' otherlv_2= 'title=' ( (lv_title_3_0= ruleScalarExpression ) ) otherlv_4= 'icon=' ( (lv_icon_5_0= ruleScalarExpression ) ) otherlv_6= 'view=' ( (lv_view_7_0= ruleViewCall ) ) otherlv_8= '}' ) ;
    public final EObject ruleTabbarButton() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_title_3_0 = null;

        EObject lv_icon_5_0 = null;

        EObject lv_view_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1055:28: ( (otherlv_0= 'button' otherlv_1= '{' otherlv_2= 'title=' ( (lv_title_3_0= ruleScalarExpression ) ) otherlv_4= 'icon=' ( (lv_icon_5_0= ruleScalarExpression ) ) otherlv_6= 'view=' ( (lv_view_7_0= ruleViewCall ) ) otherlv_8= '}' ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1056:1: (otherlv_0= 'button' otherlv_1= '{' otherlv_2= 'title=' ( (lv_title_3_0= ruleScalarExpression ) ) otherlv_4= 'icon=' ( (lv_icon_5_0= ruleScalarExpression ) ) otherlv_6= 'view=' ( (lv_view_7_0= ruleViewCall ) ) otherlv_8= '}' )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1056:1: (otherlv_0= 'button' otherlv_1= '{' otherlv_2= 'title=' ( (lv_title_3_0= ruleScalarExpression ) ) otherlv_4= 'icon=' ( (lv_icon_5_0= ruleScalarExpression ) ) otherlv_6= 'view=' ( (lv_view_7_0= ruleViewCall ) ) otherlv_8= '}' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1056:3: otherlv_0= 'button' otherlv_1= '{' otherlv_2= 'title=' ( (lv_title_3_0= ruleScalarExpression ) ) otherlv_4= 'icon=' ( (lv_icon_5_0= ruleScalarExpression ) ) otherlv_6= 'view=' ( (lv_view_7_0= ruleViewCall ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleTabbarButton2395); 

                	newLeafNode(otherlv_0, grammarAccess.getTabbarButtonAccess().getButtonKeyword_0());
                
            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleTabbarButton2407); 

                	newLeafNode(otherlv_1, grammarAccess.getTabbarButtonAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleTabbarButton2419); 

                	newLeafNode(otherlv_2, grammarAccess.getTabbarButtonAccess().getTitleKeyword_2());
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1068:1: ( (lv_title_3_0= ruleScalarExpression ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1069:1: (lv_title_3_0= ruleScalarExpression )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1069:1: (lv_title_3_0= ruleScalarExpression )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1070:3: lv_title_3_0= ruleScalarExpression
            {
             
            	        newCompositeNode(grammarAccess.getTabbarButtonAccess().getTitleScalarExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleScalarExpression_in_ruleTabbarButton2440);
            lv_title_3_0=ruleScalarExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTabbarButtonRule());
            	        }
                   		set(
                   			current, 
                   			"title",
                    		lv_title_3_0, 
                    		"ScalarExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleTabbarButton2452); 

                	newLeafNode(otherlv_4, grammarAccess.getTabbarButtonAccess().getIconKeyword_4());
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1090:1: ( (lv_icon_5_0= ruleScalarExpression ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1091:1: (lv_icon_5_0= ruleScalarExpression )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1091:1: (lv_icon_5_0= ruleScalarExpression )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1092:3: lv_icon_5_0= ruleScalarExpression
            {
             
            	        newCompositeNode(grammarAccess.getTabbarButtonAccess().getIconScalarExpressionParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleScalarExpression_in_ruleTabbarButton2473);
            lv_icon_5_0=ruleScalarExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTabbarButtonRule());
            	        }
                   		set(
                   			current, 
                   			"icon",
                    		lv_icon_5_0, 
                    		"ScalarExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,29,FOLLOW_29_in_ruleTabbarButton2485); 

                	newLeafNode(otherlv_6, grammarAccess.getTabbarButtonAccess().getViewKeyword_6());
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1112:1: ( (lv_view_7_0= ruleViewCall ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1113:1: (lv_view_7_0= ruleViewCall )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1113:1: (lv_view_7_0= ruleViewCall )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1114:3: lv_view_7_0= ruleViewCall
            {
             
            	        newCompositeNode(grammarAccess.getTabbarButtonAccess().getViewViewCallParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_ruleViewCall_in_ruleTabbarButton2506);
            lv_view_7_0=ruleViewCall();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTabbarButtonRule());
            	        }
                   		set(
                   			current, 
                   			"view",
                    		lv_view_7_0, 
                    		"ViewCall");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_8=(Token)match(input,25,FOLLOW_25_in_ruleTabbarButton2518); 

                	newLeafNode(otherlv_8, grammarAccess.getTabbarButtonAccess().getRightCurlyBracketKeyword_8());
                

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
    // $ANTLR end "ruleTabbarButton"


    // $ANTLR start "entryRuleConstant"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1142:1: entryRuleConstant returns [EObject current=null] : iv_ruleConstant= ruleConstant EOF ;
    public final EObject entryRuleConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstant = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1143:2: (iv_ruleConstant= ruleConstant EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1144:2: iv_ruleConstant= ruleConstant EOF
            {
             newCompositeNode(grammarAccess.getConstantRule()); 
            pushFollow(FOLLOW_ruleConstant_in_entryRuleConstant2554);
            iv_ruleConstant=ruleConstant();

            state._fsp--;

             current =iv_ruleConstant; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstant2564); 

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
    // $ANTLR end "entryRuleConstant"


    // $ANTLR start "ruleConstant"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1151:1: ruleConstant returns [EObject current=null] : ( () otherlv_1= 'const' ( (lv_name_2_0= RULE_ID ) ) ( (lv_value_3_0= ruleScalarExpression ) ) ) ;
    public final EObject ruleConstant() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1154:28: ( ( () otherlv_1= 'const' ( (lv_name_2_0= RULE_ID ) ) ( (lv_value_3_0= ruleScalarExpression ) ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1155:1: ( () otherlv_1= 'const' ( (lv_name_2_0= RULE_ID ) ) ( (lv_value_3_0= ruleScalarExpression ) ) )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1155:1: ( () otherlv_1= 'const' ( (lv_name_2_0= RULE_ID ) ) ( (lv_value_3_0= ruleScalarExpression ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1155:2: () otherlv_1= 'const' ( (lv_name_2_0= RULE_ID ) ) ( (lv_value_3_0= ruleScalarExpression ) )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1155:2: ()
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1156:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getConstantAccess().getConstantAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleConstant2610); 

                	newLeafNode(otherlv_1, grammarAccess.getConstantAccess().getConstKeyword_1());
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1165:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1166:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1166:1: (lv_name_2_0= RULE_ID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1167:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstant2627); 

            			newLeafNode(lv_name_2_0, grammarAccess.getConstantAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getConstantRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1183:2: ( (lv_value_3_0= ruleScalarExpression ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1184:1: (lv_value_3_0= ruleScalarExpression )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1184:1: (lv_value_3_0= ruleScalarExpression )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1185:3: lv_value_3_0= ruleScalarExpression
            {
             
            	        newCompositeNode(grammarAccess.getConstantAccess().getValueScalarExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleScalarExpression_in_ruleConstant2653);
            lv_value_3_0=ruleScalarExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConstantRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_3_0, 
                    		"ScalarExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleConstant"


    // $ANTLR start "entryRuleType"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1209:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1210:2: (iv_ruleType= ruleType EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1211:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType2689);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType2699); 

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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1218:1: ruleType returns [EObject current=null] : (this_SimpleType_0= ruleSimpleType | this_Entity_1= ruleEntity ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleType_0 = null;

        EObject this_Entity_1 = null;


         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1221:28: ( (this_SimpleType_0= ruleSimpleType | this_Entity_1= ruleEntity ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1222:1: (this_SimpleType_0= ruleSimpleType | this_Entity_1= ruleEntity )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1222:1: (this_SimpleType_0= ruleSimpleType | this_Entity_1= ruleEntity )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==31) ) {
                alt15=1;
            }
            else if ( (LA15_0==33) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1223:5: this_SimpleType_0= ruleSimpleType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getSimpleTypeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSimpleType_in_ruleType2746);
                    this_SimpleType_0=ruleSimpleType();

                    state._fsp--;

                     
                            current = this_SimpleType_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1233:5: this_Entity_1= ruleEntity
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getEntityParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleEntity_in_ruleType2773);
                    this_Entity_1=ruleEntity();

                    state._fsp--;

                     
                            current = this_Entity_1; 
                            afterParserOrEnumRuleCall();
                        

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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleSimpleType"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1249:1: entryRuleSimpleType returns [EObject current=null] : iv_ruleSimpleType= ruleSimpleType EOF ;
    public final EObject entryRuleSimpleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleType = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1250:2: (iv_ruleSimpleType= ruleSimpleType EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1251:2: iv_ruleSimpleType= ruleSimpleType EOF
            {
             newCompositeNode(grammarAccess.getSimpleTypeRule()); 
            pushFollow(FOLLOW_ruleSimpleType_in_entryRuleSimpleType2808);
            iv_ruleSimpleType=ruleSimpleType();

            state._fsp--;

             current =iv_ruleSimpleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleType2818); 

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
    // $ANTLR end "entryRuleSimpleType"


    // $ANTLR start "ruleSimpleType"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1258:1: ruleSimpleType returns [EObject current=null] : (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'mapsTo' ( (lv_platformType_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleSimpleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_platformType_3_0=null;

         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1261:28: ( (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'mapsTo' ( (lv_platformType_3_0= RULE_STRING ) ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1262:1: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'mapsTo' ( (lv_platformType_3_0= RULE_STRING ) ) )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1262:1: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'mapsTo' ( (lv_platformType_3_0= RULE_STRING ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1262:3: otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'mapsTo' ( (lv_platformType_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleSimpleType2855); 

                	newLeafNode(otherlv_0, grammarAccess.getSimpleTypeAccess().getTypeKeyword_0());
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1266:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1267:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1267:1: (lv_name_1_0= RULE_ID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1268:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSimpleType2872); 

            			newLeafNode(lv_name_1_0, grammarAccess.getSimpleTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSimpleTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,32,FOLLOW_32_in_ruleSimpleType2889); 

                	newLeafNode(otherlv_2, grammarAccess.getSimpleTypeAccess().getMapsToKeyword_2());
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1288:1: ( (lv_platformType_3_0= RULE_STRING ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1289:1: (lv_platformType_3_0= RULE_STRING )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1289:1: (lv_platformType_3_0= RULE_STRING )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1290:3: lv_platformType_3_0= RULE_STRING
            {
            lv_platformType_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSimpleType2906); 

            			newLeafNode(lv_platformType_3_0, grammarAccess.getSimpleTypeAccess().getPlatformTypeSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSimpleTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"platformType",
                    		lv_platformType_3_0, 
                    		"STRING");
            	    

            }


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
    // $ANTLR end "ruleSimpleType"


    // $ANTLR start "entryRuleEntity"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1314:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1315:2: (iv_ruleEntity= ruleEntity EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1316:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity2947);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity2957); 

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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1323:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_properties_5_0= ruleProperty ) )* otherlv_6= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_properties_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1326:28: ( (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_properties_5_0= ruleProperty ) )* otherlv_6= '}' ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1327:1: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_properties_5_0= ruleProperty ) )* otherlv_6= '}' )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1327:1: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_properties_5_0= ruleProperty ) )* otherlv_6= '}' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1327:3: otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_properties_5_0= ruleProperty ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleEntity2994); 

                	newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1331:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1332:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1332:1: (lv_name_1_0= RULE_ID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1333:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity3011); 

            			newLeafNode(lv_name_1_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEntityRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1349:2: (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==34) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1349:4: otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,34,FOLLOW_34_in_ruleEntity3029); 

                        	newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getExtendsKeyword_2_0());
                        
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1353:1: ( (otherlv_3= RULE_ID ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1354:1: (otherlv_3= RULE_ID )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1354:1: (otherlv_3= RULE_ID )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1355:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEntityRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity3049); 

                    		newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getExtendsEntityCrossReference_2_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleEntity3063); 

                	newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1370:1: ( (lv_properties_5_0= ruleProperty ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID||LA17_0==35) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1371:1: (lv_properties_5_0= ruleProperty )
            	    {
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1371:1: (lv_properties_5_0= ruleProperty )
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1372:3: lv_properties_5_0= ruleProperty
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityAccess().getPropertiesPropertyParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleProperty_in_ruleEntity3084);
            	    lv_properties_5_0=ruleProperty();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEntityRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"properties",
            	            		lv_properties_5_0, 
            	            		"Property");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_6=(Token)match(input,25,FOLLOW_25_in_ruleEntity3097); 

                	newLeafNode(otherlv_6, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleProperty"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1400:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1401:2: (iv_ruleProperty= ruleProperty EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1402:2: iv_ruleProperty= ruleProperty EOF
            {
             newCompositeNode(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty3133);
            iv_ruleProperty=ruleProperty();

            state._fsp--;

             current =iv_ruleProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty3143); 

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
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1409:1: ruleProperty returns [EObject current=null] : ( ( (lv_derived_0_0= 'derived' ) )? ( (lv_description_1_0= ruleTypeDescription ) ) ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token lv_derived_0_0=null;
        Token lv_name_2_0=null;
        EObject lv_description_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1412:28: ( ( ( (lv_derived_0_0= 'derived' ) )? ( (lv_description_1_0= ruleTypeDescription ) ) ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1413:1: ( ( (lv_derived_0_0= 'derived' ) )? ( (lv_description_1_0= ruleTypeDescription ) ) ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1413:1: ( ( (lv_derived_0_0= 'derived' ) )? ( (lv_description_1_0= ruleTypeDescription ) ) ( (lv_name_2_0= RULE_ID ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1413:2: ( (lv_derived_0_0= 'derived' ) )? ( (lv_description_1_0= ruleTypeDescription ) ) ( (lv_name_2_0= RULE_ID ) )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1413:2: ( (lv_derived_0_0= 'derived' ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==35) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1414:1: (lv_derived_0_0= 'derived' )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1414:1: (lv_derived_0_0= 'derived' )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1415:3: lv_derived_0_0= 'derived'
                    {
                    lv_derived_0_0=(Token)match(input,35,FOLLOW_35_in_ruleProperty3186); 

                            newLeafNode(lv_derived_0_0, grammarAccess.getPropertyAccess().getDerivedDerivedKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPropertyRule());
                    	        }
                           		setWithLastConsumed(current, "derived", true, "derived");
                    	    

                    }


                    }
                    break;

            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1428:3: ( (lv_description_1_0= ruleTypeDescription ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1429:1: (lv_description_1_0= ruleTypeDescription )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1429:1: (lv_description_1_0= ruleTypeDescription )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1430:3: lv_description_1_0= ruleTypeDescription
            {
             
            	        newCompositeNode(grammarAccess.getPropertyAccess().getDescriptionTypeDescriptionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeDescription_in_ruleProperty3221);
            lv_description_1_0=ruleTypeDescription();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPropertyRule());
            	        }
                   		set(
                   			current, 
                   			"description",
                    		lv_description_1_0, 
                    		"TypeDescription");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1446:2: ( (lv_name_2_0= RULE_ID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1447:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1447:1: (lv_name_2_0= RULE_ID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1448:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProperty3238); 

            			newLeafNode(lv_name_2_0, grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPropertyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


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
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleContentProvider"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1472:1: entryRuleContentProvider returns [EObject current=null] : iv_ruleContentProvider= ruleContentProvider EOF ;
    public final EObject entryRuleContentProvider() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContentProvider = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1473:2: (iv_ruleContentProvider= ruleContentProvider EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1474:2: iv_ruleContentProvider= ruleContentProvider EOF
            {
             newCompositeNode(grammarAccess.getContentProviderRule()); 
            pushFollow(FOLLOW_ruleContentProvider_in_entryRuleContentProvider3279);
            iv_ruleContentProvider=ruleContentProvider();

            state._fsp--;

             current =iv_ruleContentProvider; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContentProvider3289); 

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
    // $ANTLR end "entryRuleContentProvider"


    // $ANTLR start "ruleContentProvider"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1481:1: ruleContentProvider returns [EObject current=null] : (otherlv_0= 'contentprovider' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_parameter_3_0= ruleParameter ) ) otherlv_4= ')' )? (otherlv_5= 'returns' | ( (lv_resolver_6_0= 'resolves' ) ) ) ( (otherlv_7= RULE_ID ) ) ( (lv_many_8_0= '[]' ) )? otherlv_9= 'fetches' otherlv_10= 'XML' otherlv_11= 'from' ( (lv_url_12_0= ruleScalarExpression ) ) otherlv_13= 'selects' ( (lv_selection_14_0= ruleScalarExpression ) ) ) ;
    public final EObject ruleContentProvider() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_resolver_6_0=null;
        Token otherlv_7=null;
        Token lv_many_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_parameter_3_0 = null;

        EObject lv_url_12_0 = null;

        EObject lv_selection_14_0 = null;


         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1484:28: ( (otherlv_0= 'contentprovider' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_parameter_3_0= ruleParameter ) ) otherlv_4= ')' )? (otherlv_5= 'returns' | ( (lv_resolver_6_0= 'resolves' ) ) ) ( (otherlv_7= RULE_ID ) ) ( (lv_many_8_0= '[]' ) )? otherlv_9= 'fetches' otherlv_10= 'XML' otherlv_11= 'from' ( (lv_url_12_0= ruleScalarExpression ) ) otherlv_13= 'selects' ( (lv_selection_14_0= ruleScalarExpression ) ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1485:1: (otherlv_0= 'contentprovider' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_parameter_3_0= ruleParameter ) ) otherlv_4= ')' )? (otherlv_5= 'returns' | ( (lv_resolver_6_0= 'resolves' ) ) ) ( (otherlv_7= RULE_ID ) ) ( (lv_many_8_0= '[]' ) )? otherlv_9= 'fetches' otherlv_10= 'XML' otherlv_11= 'from' ( (lv_url_12_0= ruleScalarExpression ) ) otherlv_13= 'selects' ( (lv_selection_14_0= ruleScalarExpression ) ) )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1485:1: (otherlv_0= 'contentprovider' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_parameter_3_0= ruleParameter ) ) otherlv_4= ')' )? (otherlv_5= 'returns' | ( (lv_resolver_6_0= 'resolves' ) ) ) ( (otherlv_7= RULE_ID ) ) ( (lv_many_8_0= '[]' ) )? otherlv_9= 'fetches' otherlv_10= 'XML' otherlv_11= 'from' ( (lv_url_12_0= ruleScalarExpression ) ) otherlv_13= 'selects' ( (lv_selection_14_0= ruleScalarExpression ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1485:3: otherlv_0= 'contentprovider' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_parameter_3_0= ruleParameter ) ) otherlv_4= ')' )? (otherlv_5= 'returns' | ( (lv_resolver_6_0= 'resolves' ) ) ) ( (otherlv_7= RULE_ID ) ) ( (lv_many_8_0= '[]' ) )? otherlv_9= 'fetches' otherlv_10= 'XML' otherlv_11= 'from' ( (lv_url_12_0= ruleScalarExpression ) ) otherlv_13= 'selects' ( (lv_selection_14_0= ruleScalarExpression ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleContentProvider3326); 

                	newLeafNode(otherlv_0, grammarAccess.getContentProviderAccess().getContentproviderKeyword_0());
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1489:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1490:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1490:1: (lv_name_1_0= RULE_ID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1491:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContentProvider3343); 

            			newLeafNode(lv_name_1_0, grammarAccess.getContentProviderAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getContentProviderRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1507:2: (otherlv_2= '(' ( (lv_parameter_3_0= ruleParameter ) ) otherlv_4= ')' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==13) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1507:4: otherlv_2= '(' ( (lv_parameter_3_0= ruleParameter ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleContentProvider3361); 

                        	newLeafNode(otherlv_2, grammarAccess.getContentProviderAccess().getLeftParenthesisKeyword_2_0());
                        
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1511:1: ( (lv_parameter_3_0= ruleParameter ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1512:1: (lv_parameter_3_0= ruleParameter )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1512:1: (lv_parameter_3_0= ruleParameter )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1513:3: lv_parameter_3_0= ruleParameter
                    {
                     
                    	        newCompositeNode(grammarAccess.getContentProviderAccess().getParameterParameterParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleParameter_in_ruleContentProvider3382);
                    lv_parameter_3_0=ruleParameter();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getContentProviderRule());
                    	        }
                           		set(
                           			current, 
                           			"parameter",
                            		lv_parameter_3_0, 
                            		"Parameter");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleContentProvider3394); 

                        	newLeafNode(otherlv_4, grammarAccess.getContentProviderAccess().getRightParenthesisKeyword_2_2());
                        

                    }
                    break;

            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1533:3: (otherlv_5= 'returns' | ( (lv_resolver_6_0= 'resolves' ) ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==37) ) {
                alt20=1;
            }
            else if ( (LA20_0==38) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1533:5: otherlv_5= 'returns'
                    {
                    otherlv_5=(Token)match(input,37,FOLLOW_37_in_ruleContentProvider3409); 

                        	newLeafNode(otherlv_5, grammarAccess.getContentProviderAccess().getReturnsKeyword_3_0());
                        

                    }
                    break;
                case 2 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1538:6: ( (lv_resolver_6_0= 'resolves' ) )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1538:6: ( (lv_resolver_6_0= 'resolves' ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1539:1: (lv_resolver_6_0= 'resolves' )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1539:1: (lv_resolver_6_0= 'resolves' )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1540:3: lv_resolver_6_0= 'resolves'
                    {
                    lv_resolver_6_0=(Token)match(input,38,FOLLOW_38_in_ruleContentProvider3433); 

                            newLeafNode(lv_resolver_6_0, grammarAccess.getContentProviderAccess().getResolverResolvesKeyword_3_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getContentProviderRule());
                    	        }
                           		setWithLastConsumed(current, "resolver", true, "resolves");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1553:3: ( (otherlv_7= RULE_ID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1554:1: (otherlv_7= RULE_ID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1554:1: (otherlv_7= RULE_ID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1555:3: otherlv_7= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getContentProviderRule());
            	        }
                    
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContentProvider3467); 

            		newLeafNode(otherlv_7, grammarAccess.getContentProviderAccess().getTypeTypeCrossReference_4_0()); 
            	

            }


            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1566:2: ( (lv_many_8_0= '[]' ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==11) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1567:1: (lv_many_8_0= '[]' )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1567:1: (lv_many_8_0= '[]' )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1568:3: lv_many_8_0= '[]'
                    {
                    lv_many_8_0=(Token)match(input,11,FOLLOW_11_in_ruleContentProvider3485); 

                            newLeafNode(lv_many_8_0, grammarAccess.getContentProviderAccess().getManyLeftSquareBracketRightSquareBracketKeyword_5_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getContentProviderRule());
                    	        }
                           		setWithLastConsumed(current, "many", true, "[]");
                    	    

                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,39,FOLLOW_39_in_ruleContentProvider3511); 

                	newLeafNode(otherlv_9, grammarAccess.getContentProviderAccess().getFetchesKeyword_6());
                
            otherlv_10=(Token)match(input,40,FOLLOW_40_in_ruleContentProvider3523); 

                	newLeafNode(otherlv_10, grammarAccess.getContentProviderAccess().getXMLKeyword_7());
                
            otherlv_11=(Token)match(input,41,FOLLOW_41_in_ruleContentProvider3535); 

                	newLeafNode(otherlv_11, grammarAccess.getContentProviderAccess().getFromKeyword_8());
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1593:1: ( (lv_url_12_0= ruleScalarExpression ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1594:1: (lv_url_12_0= ruleScalarExpression )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1594:1: (lv_url_12_0= ruleScalarExpression )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1595:3: lv_url_12_0= ruleScalarExpression
            {
             
            	        newCompositeNode(grammarAccess.getContentProviderAccess().getUrlScalarExpressionParserRuleCall_9_0()); 
            	    
            pushFollow(FOLLOW_ruleScalarExpression_in_ruleContentProvider3556);
            lv_url_12_0=ruleScalarExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getContentProviderRule());
            	        }
                   		set(
                   			current, 
                   			"url",
                    		lv_url_12_0, 
                    		"ScalarExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_13=(Token)match(input,42,FOLLOW_42_in_ruleContentProvider3568); 

                	newLeafNode(otherlv_13, grammarAccess.getContentProviderAccess().getSelectsKeyword_10());
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1615:1: ( (lv_selection_14_0= ruleScalarExpression ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1616:1: (lv_selection_14_0= ruleScalarExpression )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1616:1: (lv_selection_14_0= ruleScalarExpression )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1617:3: lv_selection_14_0= ruleScalarExpression
            {
             
            	        newCompositeNode(grammarAccess.getContentProviderAccess().getSelectionScalarExpressionParserRuleCall_11_0()); 
            	    
            pushFollow(FOLLOW_ruleScalarExpression_in_ruleContentProvider3589);
            lv_selection_14_0=ruleScalarExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getContentProviderRule());
            	        }
                   		set(
                   			current, 
                   			"selection",
                    		lv_selection_14_0, 
                    		"ScalarExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleContentProvider"


    // $ANTLR start "entryRuleProviderConstruction"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1641:1: entryRuleProviderConstruction returns [EObject current=null] : iv_ruleProviderConstruction= ruleProviderConstruction EOF ;
    public final EObject entryRuleProviderConstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProviderConstruction = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1642:2: (iv_ruleProviderConstruction= ruleProviderConstruction EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1643:2: iv_ruleProviderConstruction= ruleProviderConstruction EOF
            {
             newCompositeNode(grammarAccess.getProviderConstructionRule()); 
            pushFollow(FOLLOW_ruleProviderConstruction_in_entryRuleProviderConstruction3625);
            iv_ruleProviderConstruction=ruleProviderConstruction();

            state._fsp--;

             current =iv_ruleProviderConstruction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProviderConstruction3635); 

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
    // $ANTLR end "entryRuleProviderConstruction"


    // $ANTLR start "ruleProviderConstruction"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1650:1: ruleProviderConstruction returns [EObject current=null] : ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_argument_3_0= ruleExpression ) )? otherlv_4= ')' ) | ( () ( (lv_expression_6_0= ruleExpression ) ) ) ) ;
    public final EObject ruleProviderConstruction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_argument_3_0 = null;

        EObject lv_expression_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1653:28: ( ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_argument_3_0= ruleExpression ) )? otherlv_4= ')' ) | ( () ( (lv_expression_6_0= ruleExpression ) ) ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1654:1: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_argument_3_0= ruleExpression ) )? otherlv_4= ')' ) | ( () ( (lv_expression_6_0= ruleExpression ) ) ) )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1654:1: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_argument_3_0= ruleExpression ) )? otherlv_4= ')' ) | ( () ( (lv_expression_6_0= ruleExpression ) ) ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID) ) {
                int LA23_1 = input.LA(2);

                if ( (LA23_1==13) ) {
                    alt23=1;
                }
                else if ( (LA23_1==EOF||LA23_1==12||LA23_1==14) ) {
                    alt23=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA23_0==RULE_STRING||LA23_0==13||LA23_0==15||(LA23_0>=17 && LA23_0<=18)||LA23_0==20) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1654:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_argument_3_0= ruleExpression ) )? otherlv_4= ')' )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1654:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_argument_3_0= ruleExpression ) )? otherlv_4= ')' )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1654:3: () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_argument_3_0= ruleExpression ) )? otherlv_4= ')'
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1654:3: ()
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1655:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getProviderConstructionAccess().getComplexProviderConstructionAction_0_0(),
                                current);
                        

                    }

                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1660:2: ( (otherlv_1= RULE_ID ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1661:1: (otherlv_1= RULE_ID )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1661:1: (otherlv_1= RULE_ID )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1662:3: otherlv_1= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getProviderConstructionRule());
                    	        }
                            
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProviderConstruction3690); 

                    		newLeafNode(otherlv_1, grammarAccess.getProviderConstructionAccess().getProviderContentProviderCrossReference_0_1_0()); 
                    	

                    }


                    }

                    otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleProviderConstruction3702); 

                        	newLeafNode(otherlv_2, grammarAccess.getProviderConstructionAccess().getLeftParenthesisKeyword_0_2());
                        
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1677:1: ( (lv_argument_3_0= ruleExpression ) )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( ((LA22_0>=RULE_ID && LA22_0<=RULE_STRING)||LA22_0==13||LA22_0==15||(LA22_0>=17 && LA22_0<=18)||LA22_0==20) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1678:1: (lv_argument_3_0= ruleExpression )
                            {
                            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1678:1: (lv_argument_3_0= ruleExpression )
                            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1679:3: lv_argument_3_0= ruleExpression
                            {
                             
                            	        newCompositeNode(grammarAccess.getProviderConstructionAccess().getArgumentExpressionParserRuleCall_0_3_0()); 
                            	    
                            pushFollow(FOLLOW_ruleExpression_in_ruleProviderConstruction3723);
                            lv_argument_3_0=ruleExpression();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getProviderConstructionRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"argument",
                                    		lv_argument_3_0, 
                                    		"Expression");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleProviderConstruction3736); 

                        	newLeafNode(otherlv_4, grammarAccess.getProviderConstructionAccess().getRightParenthesisKeyword_0_4());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1700:6: ( () ( (lv_expression_6_0= ruleExpression ) ) )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1700:6: ( () ( (lv_expression_6_0= ruleExpression ) ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1700:7: () ( (lv_expression_6_0= ruleExpression ) )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1700:7: ()
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1701:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getProviderConstructionAccess().getSimpleProviderConstructionAction_1_0(),
                                current);
                        

                    }

                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1706:2: ( (lv_expression_6_0= ruleExpression ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1707:1: (lv_expression_6_0= ruleExpression )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1707:1: (lv_expression_6_0= ruleExpression )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1708:3: lv_expression_6_0= ruleExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getProviderConstructionAccess().getExpressionExpressionParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleProviderConstruction3774);
                    lv_expression_6_0=ruleExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getProviderConstructionRule());
                    	        }
                           		set(
                           			current, 
                           			"expression",
                            		lv_expression_6_0, 
                            		"Expression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


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
    // $ANTLR end "ruleProviderConstruction"


    // $ANTLR start "entryRuleView"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1732:1: entryRuleView returns [EObject current=null] : iv_ruleView= ruleView EOF ;
    public final EObject entryRuleView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleView = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1733:2: (iv_ruleView= ruleView EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1734:2: iv_ruleView= ruleView EOF
            {
             newCompositeNode(grammarAccess.getViewRule()); 
            pushFollow(FOLLOW_ruleView_in_entryRuleView3811);
            iv_ruleView=ruleView();

            state._fsp--;

             current =iv_ruleView; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleView3821); 

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
    // $ANTLR end "entryRuleView"


    // $ANTLR start "ruleView"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1741:1: ruleView returns [EObject current=null] : (this_SectionedView_0= ruleSectionedView | this_CustomView_1= ruleCustomView ) ;
    public final EObject ruleView() throws RecognitionException {
        EObject current = null;

        EObject this_SectionedView_0 = null;

        EObject this_CustomView_1 = null;


         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1744:28: ( (this_SectionedView_0= ruleSectionedView | this_CustomView_1= ruleCustomView ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1745:1: (this_SectionedView_0= ruleSectionedView | this_CustomView_1= ruleCustomView )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1745:1: (this_SectionedView_0= ruleSectionedView | this_CustomView_1= ruleCustomView )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=43 && LA24_0<=44)) ) {
                alt24=1;
            }
            else if ( (LA24_0==45) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1746:5: this_SectionedView_0= ruleSectionedView
                    {
                     
                            newCompositeNode(grammarAccess.getViewAccess().getSectionedViewParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSectionedView_in_ruleView3868);
                    this_SectionedView_0=ruleSectionedView();

                    state._fsp--;

                     
                            current = this_SectionedView_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1756:5: this_CustomView_1= ruleCustomView
                    {
                     
                            newCompositeNode(grammarAccess.getViewAccess().getCustomViewParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleCustomView_in_ruleView3895);
                    this_CustomView_1=ruleCustomView();

                    state._fsp--;

                     
                            current = this_CustomView_1; 
                            afterParserOrEnumRuleCall();
                        

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
    // $ANTLR end "ruleView"


    // $ANTLR start "entryRuleSectionedView"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1772:1: entryRuleSectionedView returns [EObject current=null] : iv_ruleSectionedView= ruleSectionedView EOF ;
    public final EObject entryRuleSectionedView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSectionedView = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1773:2: (iv_ruleSectionedView= ruleSectionedView EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1774:2: iv_ruleSectionedView= ruleSectionedView EOF
            {
             newCompositeNode(grammarAccess.getSectionedViewRule()); 
            pushFollow(FOLLOW_ruleSectionedView_in_entryRuleSectionedView3930);
            iv_ruleSectionedView=ruleSectionedView();

            state._fsp--;

             current =iv_ruleSectionedView; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSectionedView3940); 

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
    // $ANTLR end "entryRuleSectionedView"


    // $ANTLR start "ruleSectionedView"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1781:1: ruleSectionedView returns [EObject current=null] : (this_TableView_0= ruleTableView | this_DetailsView_1= ruleDetailsView ) ;
    public final EObject ruleSectionedView() throws RecognitionException {
        EObject current = null;

        EObject this_TableView_0 = null;

        EObject this_DetailsView_1 = null;


         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1784:28: ( (this_TableView_0= ruleTableView | this_DetailsView_1= ruleDetailsView ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1785:1: (this_TableView_0= ruleTableView | this_DetailsView_1= ruleDetailsView )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1785:1: (this_TableView_0= ruleTableView | this_DetailsView_1= ruleDetailsView )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==43) ) {
                alt25=1;
            }
            else if ( (LA25_0==44) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1786:5: this_TableView_0= ruleTableView
                    {
                     
                            newCompositeNode(grammarAccess.getSectionedViewAccess().getTableViewParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleTableView_in_ruleSectionedView3987);
                    this_TableView_0=ruleTableView();

                    state._fsp--;

                     
                            current = this_TableView_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1796:5: this_DetailsView_1= ruleDetailsView
                    {
                     
                            newCompositeNode(grammarAccess.getSectionedViewAccess().getDetailsViewParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleDetailsView_in_ruleSectionedView4014);
                    this_DetailsView_1=ruleDetailsView();

                    state._fsp--;

                     
                            current = this_DetailsView_1; 
                            afterParserOrEnumRuleCall();
                        

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
    // $ANTLR end "ruleSectionedView"


    // $ANTLR start "entryRuleTableView"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1812:1: entryRuleTableView returns [EObject current=null] : iv_ruleTableView= ruleTableView EOF ;
    public final EObject entryRuleTableView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableView = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1813:2: (iv_ruleTableView= ruleTableView EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1814:2: iv_ruleTableView= ruleTableView EOF
            {
             newCompositeNode(grammarAccess.getTableViewRule()); 
            pushFollow(FOLLOW_ruleTableView_in_entryRuleTableView4049);
            iv_ruleTableView=ruleTableView();

            state._fsp--;

             current =iv_ruleTableView; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTableView4059); 

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
    // $ANTLR end "entryRuleTableView"


    // $ANTLR start "ruleTableView"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1821:1: ruleTableView returns [EObject current=null] : (otherlv_0= 'tableview' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_content_3_0= ruleParameter ) ) otherlv_4= ')' )? otherlv_5= '{' otherlv_6= 'title=' ( (lv_title_7_0= ruleScalarExpression ) ) ( (lv_sections_8_0= ruleViewSection ) )* otherlv_9= '}' ) ;
    public final EObject ruleTableView() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        EObject lv_content_3_0 = null;

        EObject lv_title_7_0 = null;

        EObject lv_sections_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1824:28: ( (otherlv_0= 'tableview' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_content_3_0= ruleParameter ) ) otherlv_4= ')' )? otherlv_5= '{' otherlv_6= 'title=' ( (lv_title_7_0= ruleScalarExpression ) ) ( (lv_sections_8_0= ruleViewSection ) )* otherlv_9= '}' ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1825:1: (otherlv_0= 'tableview' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_content_3_0= ruleParameter ) ) otherlv_4= ')' )? otherlv_5= '{' otherlv_6= 'title=' ( (lv_title_7_0= ruleScalarExpression ) ) ( (lv_sections_8_0= ruleViewSection ) )* otherlv_9= '}' )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1825:1: (otherlv_0= 'tableview' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_content_3_0= ruleParameter ) ) otherlv_4= ')' )? otherlv_5= '{' otherlv_6= 'title=' ( (lv_title_7_0= ruleScalarExpression ) ) ( (lv_sections_8_0= ruleViewSection ) )* otherlv_9= '}' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1825:3: otherlv_0= 'tableview' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_content_3_0= ruleParameter ) ) otherlv_4= ')' )? otherlv_5= '{' otherlv_6= 'title=' ( (lv_title_7_0= ruleScalarExpression ) ) ( (lv_sections_8_0= ruleViewSection ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_43_in_ruleTableView4096); 

                	newLeafNode(otherlv_0, grammarAccess.getTableViewAccess().getTableviewKeyword_0());
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1829:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1830:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1830:1: (lv_name_1_0= RULE_ID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1831:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTableView4113); 

            			newLeafNode(lv_name_1_0, grammarAccess.getTableViewAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTableViewRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1847:2: (otherlv_2= '(' ( (lv_content_3_0= ruleParameter ) ) otherlv_4= ')' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==13) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1847:4: otherlv_2= '(' ( (lv_content_3_0= ruleParameter ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleTableView4131); 

                        	newLeafNode(otherlv_2, grammarAccess.getTableViewAccess().getLeftParenthesisKeyword_2_0());
                        
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1851:1: ( (lv_content_3_0= ruleParameter ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1852:1: (lv_content_3_0= ruleParameter )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1852:1: (lv_content_3_0= ruleParameter )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1853:3: lv_content_3_0= ruleParameter
                    {
                     
                    	        newCompositeNode(grammarAccess.getTableViewAccess().getContentParameterParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleParameter_in_ruleTableView4152);
                    lv_content_3_0=ruleParameter();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTableViewRule());
                    	        }
                           		set(
                           			current, 
                           			"content",
                            		lv_content_3_0, 
                            		"Parameter");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleTableView4164); 

                        	newLeafNode(otherlv_4, grammarAccess.getTableViewAccess().getRightParenthesisKeyword_2_2());
                        

                    }
                    break;

            }

            otherlv_5=(Token)match(input,23,FOLLOW_23_in_ruleTableView4178); 

                	newLeafNode(otherlv_5, grammarAccess.getTableViewAccess().getLeftCurlyBracketKeyword_3());
                
            otherlv_6=(Token)match(input,27,FOLLOW_27_in_ruleTableView4190); 

                	newLeafNode(otherlv_6, grammarAccess.getTableViewAccess().getTitleKeyword_4());
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1881:1: ( (lv_title_7_0= ruleScalarExpression ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1882:1: (lv_title_7_0= ruleScalarExpression )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1882:1: (lv_title_7_0= ruleScalarExpression )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1883:3: lv_title_7_0= ruleScalarExpression
            {
             
            	        newCompositeNode(grammarAccess.getTableViewAccess().getTitleScalarExpressionParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleScalarExpression_in_ruleTableView4211);
            lv_title_7_0=ruleScalarExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTableViewRule());
            	        }
                   		set(
                   			current, 
                   			"title",
                    		lv_title_7_0, 
                    		"ScalarExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1899:2: ( (lv_sections_8_0= ruleViewSection ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==51) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1900:1: (lv_sections_8_0= ruleViewSection )
            	    {
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1900:1: (lv_sections_8_0= ruleViewSection )
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1901:3: lv_sections_8_0= ruleViewSection
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTableViewAccess().getSectionsViewSectionParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleViewSection_in_ruleTableView4232);
            	    lv_sections_8_0=ruleViewSection();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTableViewRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"sections",
            	            		lv_sections_8_0, 
            	            		"ViewSection");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            otherlv_9=(Token)match(input,25,FOLLOW_25_in_ruleTableView4245); 

                	newLeafNode(otherlv_9, grammarAccess.getTableViewAccess().getRightCurlyBracketKeyword_7());
                

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
    // $ANTLR end "ruleTableView"


    // $ANTLR start "entryRuleDetailsView"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1929:1: entryRuleDetailsView returns [EObject current=null] : iv_ruleDetailsView= ruleDetailsView EOF ;
    public final EObject entryRuleDetailsView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDetailsView = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1930:2: (iv_ruleDetailsView= ruleDetailsView EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1931:2: iv_ruleDetailsView= ruleDetailsView EOF
            {
             newCompositeNode(grammarAccess.getDetailsViewRule()); 
            pushFollow(FOLLOW_ruleDetailsView_in_entryRuleDetailsView4281);
            iv_ruleDetailsView=ruleDetailsView();

            state._fsp--;

             current =iv_ruleDetailsView; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDetailsView4291); 

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
    // $ANTLR end "entryRuleDetailsView"


    // $ANTLR start "ruleDetailsView"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1938:1: ruleDetailsView returns [EObject current=null] : (otherlv_0= 'detailsview' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_content_3_0= ruleParameter ) ) otherlv_4= ')' )? otherlv_5= '{' otherlv_6= 'title=' ( (lv_title_7_0= ruleScalarExpression ) ) ( (lv_header_8_0= ruleViewHeader ) )? ( (lv_sections_9_0= ruleViewSection ) )* otherlv_10= '}' ) ;
    public final EObject ruleDetailsView() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_10=null;
        EObject lv_content_3_0 = null;

        EObject lv_title_7_0 = null;

        EObject lv_header_8_0 = null;

        EObject lv_sections_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1941:28: ( (otherlv_0= 'detailsview' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_content_3_0= ruleParameter ) ) otherlv_4= ')' )? otherlv_5= '{' otherlv_6= 'title=' ( (lv_title_7_0= ruleScalarExpression ) ) ( (lv_header_8_0= ruleViewHeader ) )? ( (lv_sections_9_0= ruleViewSection ) )* otherlv_10= '}' ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1942:1: (otherlv_0= 'detailsview' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_content_3_0= ruleParameter ) ) otherlv_4= ')' )? otherlv_5= '{' otherlv_6= 'title=' ( (lv_title_7_0= ruleScalarExpression ) ) ( (lv_header_8_0= ruleViewHeader ) )? ( (lv_sections_9_0= ruleViewSection ) )* otherlv_10= '}' )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1942:1: (otherlv_0= 'detailsview' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_content_3_0= ruleParameter ) ) otherlv_4= ')' )? otherlv_5= '{' otherlv_6= 'title=' ( (lv_title_7_0= ruleScalarExpression ) ) ( (lv_header_8_0= ruleViewHeader ) )? ( (lv_sections_9_0= ruleViewSection ) )* otherlv_10= '}' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1942:3: otherlv_0= 'detailsview' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_content_3_0= ruleParameter ) ) otherlv_4= ')' )? otherlv_5= '{' otherlv_6= 'title=' ( (lv_title_7_0= ruleScalarExpression ) ) ( (lv_header_8_0= ruleViewHeader ) )? ( (lv_sections_9_0= ruleViewSection ) )* otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_44_in_ruleDetailsView4328); 

                	newLeafNode(otherlv_0, grammarAccess.getDetailsViewAccess().getDetailsviewKeyword_0());
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1946:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1947:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1947:1: (lv_name_1_0= RULE_ID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1948:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDetailsView4345); 

            			newLeafNode(lv_name_1_0, grammarAccess.getDetailsViewAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDetailsViewRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1964:2: (otherlv_2= '(' ( (lv_content_3_0= ruleParameter ) ) otherlv_4= ')' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==13) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1964:4: otherlv_2= '(' ( (lv_content_3_0= ruleParameter ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleDetailsView4363); 

                        	newLeafNode(otherlv_2, grammarAccess.getDetailsViewAccess().getLeftParenthesisKeyword_2_0());
                        
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1968:1: ( (lv_content_3_0= ruleParameter ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1969:1: (lv_content_3_0= ruleParameter )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1969:1: (lv_content_3_0= ruleParameter )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1970:3: lv_content_3_0= ruleParameter
                    {
                     
                    	        newCompositeNode(grammarAccess.getDetailsViewAccess().getContentParameterParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleParameter_in_ruleDetailsView4384);
                    lv_content_3_0=ruleParameter();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDetailsViewRule());
                    	        }
                           		set(
                           			current, 
                           			"content",
                            		lv_content_3_0, 
                            		"Parameter");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleDetailsView4396); 

                        	newLeafNode(otherlv_4, grammarAccess.getDetailsViewAccess().getRightParenthesisKeyword_2_2());
                        

                    }
                    break;

            }

            otherlv_5=(Token)match(input,23,FOLLOW_23_in_ruleDetailsView4410); 

                	newLeafNode(otherlv_5, grammarAccess.getDetailsViewAccess().getLeftCurlyBracketKeyword_3());
                
            otherlv_6=(Token)match(input,27,FOLLOW_27_in_ruleDetailsView4422); 

                	newLeafNode(otherlv_6, grammarAccess.getDetailsViewAccess().getTitleKeyword_4());
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1998:1: ( (lv_title_7_0= ruleScalarExpression ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1999:1: (lv_title_7_0= ruleScalarExpression )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1999:1: (lv_title_7_0= ruleScalarExpression )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2000:3: lv_title_7_0= ruleScalarExpression
            {
             
            	        newCompositeNode(grammarAccess.getDetailsViewAccess().getTitleScalarExpressionParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleScalarExpression_in_ruleDetailsView4443);
            lv_title_7_0=ruleScalarExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDetailsViewRule());
            	        }
                   		set(
                   			current, 
                   			"title",
                    		lv_title_7_0, 
                    		"ScalarExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2016:2: ( (lv_header_8_0= ruleViewHeader ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==47) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2017:1: (lv_header_8_0= ruleViewHeader )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2017:1: (lv_header_8_0= ruleViewHeader )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2018:3: lv_header_8_0= ruleViewHeader
                    {
                     
                    	        newCompositeNode(grammarAccess.getDetailsViewAccess().getHeaderViewHeaderParserRuleCall_6_0()); 
                    	    
                    pushFollow(FOLLOW_ruleViewHeader_in_ruleDetailsView4464);
                    lv_header_8_0=ruleViewHeader();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDetailsViewRule());
                    	        }
                           		set(
                           			current, 
                           			"header",
                            		lv_header_8_0, 
                            		"ViewHeader");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2034:3: ( (lv_sections_9_0= ruleViewSection ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==51) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2035:1: (lv_sections_9_0= ruleViewSection )
            	    {
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2035:1: (lv_sections_9_0= ruleViewSection )
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2036:3: lv_sections_9_0= ruleViewSection
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDetailsViewAccess().getSectionsViewSectionParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleViewSection_in_ruleDetailsView4486);
            	    lv_sections_9_0=ruleViewSection();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDetailsViewRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"sections",
            	            		lv_sections_9_0, 
            	            		"ViewSection");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            otherlv_10=(Token)match(input,25,FOLLOW_25_in_ruleDetailsView4499); 

                	newLeafNode(otherlv_10, grammarAccess.getDetailsViewAccess().getRightCurlyBracketKeyword_8());
                

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
    // $ANTLR end "ruleDetailsView"


    // $ANTLR start "entryRuleCustomView"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2064:1: entryRuleCustomView returns [EObject current=null] : iv_ruleCustomView= ruleCustomView EOF ;
    public final EObject entryRuleCustomView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomView = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2065:2: (iv_ruleCustomView= ruleCustomView EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2066:2: iv_ruleCustomView= ruleCustomView EOF
            {
             newCompositeNode(grammarAccess.getCustomViewRule()); 
            pushFollow(FOLLOW_ruleCustomView_in_entryRuleCustomView4535);
            iv_ruleCustomView=ruleCustomView();

            state._fsp--;

             current =iv_ruleCustomView; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCustomView4545); 

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
    // $ANTLR end "entryRuleCustomView"


    // $ANTLR start "ruleCustomView"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2073:1: ruleCustomView returns [EObject current=null] : (otherlv_0= 'customview' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_content_3_0= ruleParameter ) ) otherlv_4= ')' )? otherlv_5= 'implementedBy' ( (lv_objclass_6_0= RULE_STRING ) ) ) ;
    public final EObject ruleCustomView() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_objclass_6_0=null;
        EObject lv_content_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2076:28: ( (otherlv_0= 'customview' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_content_3_0= ruleParameter ) ) otherlv_4= ')' )? otherlv_5= 'implementedBy' ( (lv_objclass_6_0= RULE_STRING ) ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2077:1: (otherlv_0= 'customview' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_content_3_0= ruleParameter ) ) otherlv_4= ')' )? otherlv_5= 'implementedBy' ( (lv_objclass_6_0= RULE_STRING ) ) )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2077:1: (otherlv_0= 'customview' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_content_3_0= ruleParameter ) ) otherlv_4= ')' )? otherlv_5= 'implementedBy' ( (lv_objclass_6_0= RULE_STRING ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2077:3: otherlv_0= 'customview' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_content_3_0= ruleParameter ) ) otherlv_4= ')' )? otherlv_5= 'implementedBy' ( (lv_objclass_6_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,45,FOLLOW_45_in_ruleCustomView4582); 

                	newLeafNode(otherlv_0, grammarAccess.getCustomViewAccess().getCustomviewKeyword_0());
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2081:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2082:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2082:1: (lv_name_1_0= RULE_ID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2083:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCustomView4599); 

            			newLeafNode(lv_name_1_0, grammarAccess.getCustomViewAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCustomViewRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2099:2: (otherlv_2= '(' ( (lv_content_3_0= ruleParameter ) ) otherlv_4= ')' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==13) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2099:4: otherlv_2= '(' ( (lv_content_3_0= ruleParameter ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleCustomView4617); 

                        	newLeafNode(otherlv_2, grammarAccess.getCustomViewAccess().getLeftParenthesisKeyword_2_0());
                        
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2103:1: ( (lv_content_3_0= ruleParameter ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2104:1: (lv_content_3_0= ruleParameter )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2104:1: (lv_content_3_0= ruleParameter )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2105:3: lv_content_3_0= ruleParameter
                    {
                     
                    	        newCompositeNode(grammarAccess.getCustomViewAccess().getContentParameterParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleParameter_in_ruleCustomView4638);
                    lv_content_3_0=ruleParameter();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCustomViewRule());
                    	        }
                           		set(
                           			current, 
                           			"content",
                            		lv_content_3_0, 
                            		"Parameter");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleCustomView4650); 

                        	newLeafNode(otherlv_4, grammarAccess.getCustomViewAccess().getRightParenthesisKeyword_2_2());
                        

                    }
                    break;

            }

            otherlv_5=(Token)match(input,46,FOLLOW_46_in_ruleCustomView4664); 

                	newLeafNode(otherlv_5, grammarAccess.getCustomViewAccess().getImplementedByKeyword_3());
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2129:1: ( (lv_objclass_6_0= RULE_STRING ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2130:1: (lv_objclass_6_0= RULE_STRING )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2130:1: (lv_objclass_6_0= RULE_STRING )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2131:3: lv_objclass_6_0= RULE_STRING
            {
            lv_objclass_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCustomView4681); 

            			newLeafNode(lv_objclass_6_0, grammarAccess.getCustomViewAccess().getObjclassSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCustomViewRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"objclass",
                    		lv_objclass_6_0, 
                    		"STRING");
            	    

            }


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
    // $ANTLR end "ruleCustomView"


    // $ANTLR start "entryRuleViewHeader"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2155:1: entryRuleViewHeader returns [EObject current=null] : iv_ruleViewHeader= ruleViewHeader EOF ;
    public final EObject entryRuleViewHeader() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleViewHeader = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2156:2: (iv_ruleViewHeader= ruleViewHeader EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2157:2: iv_ruleViewHeader= ruleViewHeader EOF
            {
             newCompositeNode(grammarAccess.getViewHeaderRule()); 
            pushFollow(FOLLOW_ruleViewHeader_in_entryRuleViewHeader4722);
            iv_ruleViewHeader=ruleViewHeader();

            state._fsp--;

             current =iv_ruleViewHeader; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleViewHeader4732); 

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
    // $ANTLR end "entryRuleViewHeader"


    // $ANTLR start "ruleViewHeader"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2164:1: ruleViewHeader returns [EObject current=null] : ( () otherlv_1= 'header' otherlv_2= '{' (otherlv_3= 'title=' ( (lv_title_4_0= ruleScalarExpression ) ) )? (otherlv_5= 'subtitle=' ( (lv_subtitle_6_0= ruleScalarExpression ) ) )? (otherlv_7= 'details=' ( (lv_details_8_0= ruleScalarExpression ) ) )? (otherlv_9= 'image=' ( (lv_image_10_0= ruleScalarExpression ) ) )? otherlv_11= '}' ) ;
    public final EObject ruleViewHeader() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_title_4_0 = null;

        EObject lv_subtitle_6_0 = null;

        EObject lv_details_8_0 = null;

        EObject lv_image_10_0 = null;


         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2167:28: ( ( () otherlv_1= 'header' otherlv_2= '{' (otherlv_3= 'title=' ( (lv_title_4_0= ruleScalarExpression ) ) )? (otherlv_5= 'subtitle=' ( (lv_subtitle_6_0= ruleScalarExpression ) ) )? (otherlv_7= 'details=' ( (lv_details_8_0= ruleScalarExpression ) ) )? (otherlv_9= 'image=' ( (lv_image_10_0= ruleScalarExpression ) ) )? otherlv_11= '}' ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2168:1: ( () otherlv_1= 'header' otherlv_2= '{' (otherlv_3= 'title=' ( (lv_title_4_0= ruleScalarExpression ) ) )? (otherlv_5= 'subtitle=' ( (lv_subtitle_6_0= ruleScalarExpression ) ) )? (otherlv_7= 'details=' ( (lv_details_8_0= ruleScalarExpression ) ) )? (otherlv_9= 'image=' ( (lv_image_10_0= ruleScalarExpression ) ) )? otherlv_11= '}' )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2168:1: ( () otherlv_1= 'header' otherlv_2= '{' (otherlv_3= 'title=' ( (lv_title_4_0= ruleScalarExpression ) ) )? (otherlv_5= 'subtitle=' ( (lv_subtitle_6_0= ruleScalarExpression ) ) )? (otherlv_7= 'details=' ( (lv_details_8_0= ruleScalarExpression ) ) )? (otherlv_9= 'image=' ( (lv_image_10_0= ruleScalarExpression ) ) )? otherlv_11= '}' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2168:2: () otherlv_1= 'header' otherlv_2= '{' (otherlv_3= 'title=' ( (lv_title_4_0= ruleScalarExpression ) ) )? (otherlv_5= 'subtitle=' ( (lv_subtitle_6_0= ruleScalarExpression ) ) )? (otherlv_7= 'details=' ( (lv_details_8_0= ruleScalarExpression ) ) )? (otherlv_9= 'image=' ( (lv_image_10_0= ruleScalarExpression ) ) )? otherlv_11= '}'
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2168:2: ()
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2169:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getViewHeaderAccess().getViewHeaderAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,47,FOLLOW_47_in_ruleViewHeader4778); 

                	newLeafNode(otherlv_1, grammarAccess.getViewHeaderAccess().getHeaderKeyword_1());
                
            otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleViewHeader4790); 

                	newLeafNode(otherlv_2, grammarAccess.getViewHeaderAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2182:1: (otherlv_3= 'title=' ( (lv_title_4_0= ruleScalarExpression ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==27) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2182:3: otherlv_3= 'title=' ( (lv_title_4_0= ruleScalarExpression ) )
                    {
                    otherlv_3=(Token)match(input,27,FOLLOW_27_in_ruleViewHeader4803); 

                        	newLeafNode(otherlv_3, grammarAccess.getViewHeaderAccess().getTitleKeyword_3_0());
                        
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2186:1: ( (lv_title_4_0= ruleScalarExpression ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2187:1: (lv_title_4_0= ruleScalarExpression )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2187:1: (lv_title_4_0= ruleScalarExpression )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2188:3: lv_title_4_0= ruleScalarExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getViewHeaderAccess().getTitleScalarExpressionParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleScalarExpression_in_ruleViewHeader4824);
                    lv_title_4_0=ruleScalarExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getViewHeaderRule());
                    	        }
                           		set(
                           			current, 
                           			"title",
                            		lv_title_4_0, 
                            		"ScalarExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2204:4: (otherlv_5= 'subtitle=' ( (lv_subtitle_6_0= ruleScalarExpression ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==48) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2204:6: otherlv_5= 'subtitle=' ( (lv_subtitle_6_0= ruleScalarExpression ) )
                    {
                    otherlv_5=(Token)match(input,48,FOLLOW_48_in_ruleViewHeader4839); 

                        	newLeafNode(otherlv_5, grammarAccess.getViewHeaderAccess().getSubtitleKeyword_4_0());
                        
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2208:1: ( (lv_subtitle_6_0= ruleScalarExpression ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2209:1: (lv_subtitle_6_0= ruleScalarExpression )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2209:1: (lv_subtitle_6_0= ruleScalarExpression )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2210:3: lv_subtitle_6_0= ruleScalarExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getViewHeaderAccess().getSubtitleScalarExpressionParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleScalarExpression_in_ruleViewHeader4860);
                    lv_subtitle_6_0=ruleScalarExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getViewHeaderRule());
                    	        }
                           		set(
                           			current, 
                           			"subtitle",
                            		lv_subtitle_6_0, 
                            		"ScalarExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2226:4: (otherlv_7= 'details=' ( (lv_details_8_0= ruleScalarExpression ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==49) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2226:6: otherlv_7= 'details=' ( (lv_details_8_0= ruleScalarExpression ) )
                    {
                    otherlv_7=(Token)match(input,49,FOLLOW_49_in_ruleViewHeader4875); 

                        	newLeafNode(otherlv_7, grammarAccess.getViewHeaderAccess().getDetailsKeyword_5_0());
                        
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2230:1: ( (lv_details_8_0= ruleScalarExpression ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2231:1: (lv_details_8_0= ruleScalarExpression )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2231:1: (lv_details_8_0= ruleScalarExpression )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2232:3: lv_details_8_0= ruleScalarExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getViewHeaderAccess().getDetailsScalarExpressionParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleScalarExpression_in_ruleViewHeader4896);
                    lv_details_8_0=ruleScalarExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getViewHeaderRule());
                    	        }
                           		set(
                           			current, 
                           			"details",
                            		lv_details_8_0, 
                            		"ScalarExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2248:4: (otherlv_9= 'image=' ( (lv_image_10_0= ruleScalarExpression ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==50) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2248:6: otherlv_9= 'image=' ( (lv_image_10_0= ruleScalarExpression ) )
                    {
                    otherlv_9=(Token)match(input,50,FOLLOW_50_in_ruleViewHeader4911); 

                        	newLeafNode(otherlv_9, grammarAccess.getViewHeaderAccess().getImageKeyword_6_0());
                        
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2252:1: ( (lv_image_10_0= ruleScalarExpression ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2253:1: (lv_image_10_0= ruleScalarExpression )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2253:1: (lv_image_10_0= ruleScalarExpression )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2254:3: lv_image_10_0= ruleScalarExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getViewHeaderAccess().getImageScalarExpressionParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleScalarExpression_in_ruleViewHeader4932);
                    lv_image_10_0=ruleScalarExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getViewHeaderRule());
                    	        }
                           		set(
                           			current, 
                           			"image",
                            		lv_image_10_0, 
                            		"ScalarExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,25,FOLLOW_25_in_ruleViewHeader4946); 

                	newLeafNode(otherlv_11, grammarAccess.getViewHeaderAccess().getRightCurlyBracketKeyword_7());
                

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
    // $ANTLR end "ruleViewHeader"


    // $ANTLR start "entryRuleViewSection"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2282:1: entryRuleViewSection returns [EObject current=null] : iv_ruleViewSection= ruleViewSection EOF ;
    public final EObject entryRuleViewSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleViewSection = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2283:2: (iv_ruleViewSection= ruleViewSection EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2284:2: iv_ruleViewSection= ruleViewSection EOF
            {
             newCompositeNode(grammarAccess.getViewSectionRule()); 
            pushFollow(FOLLOW_ruleViewSection_in_entryRuleViewSection4982);
            iv_ruleViewSection=ruleViewSection();

            state._fsp--;

             current =iv_ruleViewSection; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleViewSection4992); 

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
    // $ANTLR end "entryRuleViewSection"


    // $ANTLR start "ruleViewSection"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2291:1: ruleViewSection returns [EObject current=null] : (otherlv_0= 'section' otherlv_1= '{' (otherlv_2= 'title=' ( (lv_title_3_0= ruleScalarExpression ) ) )? ( (lv_cells_4_0= ruleSectionCell ) )+ otherlv_5= '}' ) ;
    public final EObject ruleViewSection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_title_3_0 = null;

        EObject lv_cells_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2294:28: ( (otherlv_0= 'section' otherlv_1= '{' (otherlv_2= 'title=' ( (lv_title_3_0= ruleScalarExpression ) ) )? ( (lv_cells_4_0= ruleSectionCell ) )+ otherlv_5= '}' ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2295:1: (otherlv_0= 'section' otherlv_1= '{' (otherlv_2= 'title=' ( (lv_title_3_0= ruleScalarExpression ) ) )? ( (lv_cells_4_0= ruleSectionCell ) )+ otherlv_5= '}' )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2295:1: (otherlv_0= 'section' otherlv_1= '{' (otherlv_2= 'title=' ( (lv_title_3_0= ruleScalarExpression ) ) )? ( (lv_cells_4_0= ruleSectionCell ) )+ otherlv_5= '}' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2295:3: otherlv_0= 'section' otherlv_1= '{' (otherlv_2= 'title=' ( (lv_title_3_0= ruleScalarExpression ) ) )? ( (lv_cells_4_0= ruleSectionCell ) )+ otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,51,FOLLOW_51_in_ruleViewSection5029); 

                	newLeafNode(otherlv_0, grammarAccess.getViewSectionAccess().getSectionKeyword_0());
                
            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleViewSection5041); 

                	newLeafNode(otherlv_1, grammarAccess.getViewSectionAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2303:1: (otherlv_2= 'title=' ( (lv_title_3_0= ruleScalarExpression ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==27) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2303:3: otherlv_2= 'title=' ( (lv_title_3_0= ruleScalarExpression ) )
                    {
                    otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleViewSection5054); 

                        	newLeafNode(otherlv_2, grammarAccess.getViewSectionAccess().getTitleKeyword_2_0());
                        
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2307:1: ( (lv_title_3_0= ruleScalarExpression ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2308:1: (lv_title_3_0= ruleScalarExpression )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2308:1: (lv_title_3_0= ruleScalarExpression )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2309:3: lv_title_3_0= ruleScalarExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getViewSectionAccess().getTitleScalarExpressionParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleScalarExpression_in_ruleViewSection5075);
                    lv_title_3_0=ruleScalarExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getViewSectionRule());
                    	        }
                           		set(
                           			current, 
                           			"title",
                            		lv_title_3_0, 
                            		"ScalarExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2325:4: ( (lv_cells_4_0= ruleSectionCell ) )+
            int cnt37=0;
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==52) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2326:1: (lv_cells_4_0= ruleSectionCell )
            	    {
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2326:1: (lv_cells_4_0= ruleSectionCell )
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2327:3: lv_cells_4_0= ruleSectionCell
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getViewSectionAccess().getCellsSectionCellParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSectionCell_in_ruleViewSection5098);
            	    lv_cells_4_0=ruleSectionCell();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getViewSectionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"cells",
            	            		lv_cells_4_0, 
            	            		"SectionCell");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt37 >= 1 ) break loop37;
                        EarlyExitException eee =
                            new EarlyExitException(37, input);
                        throw eee;
                }
                cnt37++;
            } while (true);

            otherlv_5=(Token)match(input,25,FOLLOW_25_in_ruleViewSection5111); 

                	newLeafNode(otherlv_5, grammarAccess.getViewSectionAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleViewSection"


    // $ANTLR start "entryRuleSectionCell"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2355:1: entryRuleSectionCell returns [EObject current=null] : iv_ruleSectionCell= ruleSectionCell EOF ;
    public final EObject entryRuleSectionCell() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSectionCell = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2356:2: (iv_ruleSectionCell= ruleSectionCell EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2357:2: iv_ruleSectionCell= ruleSectionCell EOF
            {
             newCompositeNode(grammarAccess.getSectionCellRule()); 
            pushFollow(FOLLOW_ruleSectionCell_in_entryRuleSectionCell5147);
            iv_ruleSectionCell=ruleSectionCell();

            state._fsp--;

             current =iv_ruleSectionCell; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSectionCell5157); 

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
    // $ANTLR end "entryRuleSectionCell"


    // $ANTLR start "ruleSectionCell"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2364:1: ruleSectionCell returns [EObject current=null] : (otherlv_0= 'cell' ( (lv_type_1_0= ruleCellType ) ) (otherlv_2= 'foreach' ( (lv_iterator_3_0= ruleCollectionIterator ) ) )? otherlv_4= '{' (otherlv_5= 'text=' ( (lv_text_6_0= ruleScalarExpression ) ) )? (otherlv_7= 'details=' ( (lv_details_8_0= ruleScalarExpression ) ) )? (otherlv_9= 'image=' ( (lv_image_10_0= ruleScalarExpression ) ) )? (otherlv_11= 'query=' ( (lv_query_12_0= ruleScalarExpression ) ) )? (otherlv_13= 'action=' ( (lv_action_14_0= ruleViewAction ) ) )? otherlv_15= '}' ) ;
    public final EObject ruleSectionCell() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Enumerator lv_type_1_0 = null;

        EObject lv_iterator_3_0 = null;

        EObject lv_text_6_0 = null;

        EObject lv_details_8_0 = null;

        EObject lv_image_10_0 = null;

        EObject lv_query_12_0 = null;

        EObject lv_action_14_0 = null;


         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2367:28: ( (otherlv_0= 'cell' ( (lv_type_1_0= ruleCellType ) ) (otherlv_2= 'foreach' ( (lv_iterator_3_0= ruleCollectionIterator ) ) )? otherlv_4= '{' (otherlv_5= 'text=' ( (lv_text_6_0= ruleScalarExpression ) ) )? (otherlv_7= 'details=' ( (lv_details_8_0= ruleScalarExpression ) ) )? (otherlv_9= 'image=' ( (lv_image_10_0= ruleScalarExpression ) ) )? (otherlv_11= 'query=' ( (lv_query_12_0= ruleScalarExpression ) ) )? (otherlv_13= 'action=' ( (lv_action_14_0= ruleViewAction ) ) )? otherlv_15= '}' ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2368:1: (otherlv_0= 'cell' ( (lv_type_1_0= ruleCellType ) ) (otherlv_2= 'foreach' ( (lv_iterator_3_0= ruleCollectionIterator ) ) )? otherlv_4= '{' (otherlv_5= 'text=' ( (lv_text_6_0= ruleScalarExpression ) ) )? (otherlv_7= 'details=' ( (lv_details_8_0= ruleScalarExpression ) ) )? (otherlv_9= 'image=' ( (lv_image_10_0= ruleScalarExpression ) ) )? (otherlv_11= 'query=' ( (lv_query_12_0= ruleScalarExpression ) ) )? (otherlv_13= 'action=' ( (lv_action_14_0= ruleViewAction ) ) )? otherlv_15= '}' )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2368:1: (otherlv_0= 'cell' ( (lv_type_1_0= ruleCellType ) ) (otherlv_2= 'foreach' ( (lv_iterator_3_0= ruleCollectionIterator ) ) )? otherlv_4= '{' (otherlv_5= 'text=' ( (lv_text_6_0= ruleScalarExpression ) ) )? (otherlv_7= 'details=' ( (lv_details_8_0= ruleScalarExpression ) ) )? (otherlv_9= 'image=' ( (lv_image_10_0= ruleScalarExpression ) ) )? (otherlv_11= 'query=' ( (lv_query_12_0= ruleScalarExpression ) ) )? (otherlv_13= 'action=' ( (lv_action_14_0= ruleViewAction ) ) )? otherlv_15= '}' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2368:3: otherlv_0= 'cell' ( (lv_type_1_0= ruleCellType ) ) (otherlv_2= 'foreach' ( (lv_iterator_3_0= ruleCollectionIterator ) ) )? otherlv_4= '{' (otherlv_5= 'text=' ( (lv_text_6_0= ruleScalarExpression ) ) )? (otherlv_7= 'details=' ( (lv_details_8_0= ruleScalarExpression ) ) )? (otherlv_9= 'image=' ( (lv_image_10_0= ruleScalarExpression ) ) )? (otherlv_11= 'query=' ( (lv_query_12_0= ruleScalarExpression ) ) )? (otherlv_13= 'action=' ( (lv_action_14_0= ruleViewAction ) ) )? otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,52,FOLLOW_52_in_ruleSectionCell5194); 

                	newLeafNode(otherlv_0, grammarAccess.getSectionCellAccess().getCellKeyword_0());
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2372:1: ( (lv_type_1_0= ruleCellType ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2373:1: (lv_type_1_0= ruleCellType )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2373:1: (lv_type_1_0= ruleCellType )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2374:3: lv_type_1_0= ruleCellType
            {
             
            	        newCompositeNode(grammarAccess.getSectionCellAccess().getTypeCellTypeEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleCellType_in_ruleSectionCell5215);
            lv_type_1_0=ruleCellType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSectionCellRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_1_0, 
                    		"CellType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2390:2: (otherlv_2= 'foreach' ( (lv_iterator_3_0= ruleCollectionIterator ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==53) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2390:4: otherlv_2= 'foreach' ( (lv_iterator_3_0= ruleCollectionIterator ) )
                    {
                    otherlv_2=(Token)match(input,53,FOLLOW_53_in_ruleSectionCell5228); 

                        	newLeafNode(otherlv_2, grammarAccess.getSectionCellAccess().getForeachKeyword_2_0());
                        
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2394:1: ( (lv_iterator_3_0= ruleCollectionIterator ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2395:1: (lv_iterator_3_0= ruleCollectionIterator )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2395:1: (lv_iterator_3_0= ruleCollectionIterator )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2396:3: lv_iterator_3_0= ruleCollectionIterator
                    {
                     
                    	        newCompositeNode(grammarAccess.getSectionCellAccess().getIteratorCollectionIteratorParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCollectionIterator_in_ruleSectionCell5249);
                    lv_iterator_3_0=ruleCollectionIterator();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSectionCellRule());
                    	        }
                           		set(
                           			current, 
                           			"iterator",
                            		lv_iterator_3_0, 
                            		"CollectionIterator");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleSectionCell5263); 

                	newLeafNode(otherlv_4, grammarAccess.getSectionCellAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2416:1: (otherlv_5= 'text=' ( (lv_text_6_0= ruleScalarExpression ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==54) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2416:3: otherlv_5= 'text=' ( (lv_text_6_0= ruleScalarExpression ) )
                    {
                    otherlv_5=(Token)match(input,54,FOLLOW_54_in_ruleSectionCell5276); 

                        	newLeafNode(otherlv_5, grammarAccess.getSectionCellAccess().getTextKeyword_4_0());
                        
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2420:1: ( (lv_text_6_0= ruleScalarExpression ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2421:1: (lv_text_6_0= ruleScalarExpression )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2421:1: (lv_text_6_0= ruleScalarExpression )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2422:3: lv_text_6_0= ruleScalarExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getSectionCellAccess().getTextScalarExpressionParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleScalarExpression_in_ruleSectionCell5297);
                    lv_text_6_0=ruleScalarExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSectionCellRule());
                    	        }
                           		set(
                           			current, 
                           			"text",
                            		lv_text_6_0, 
                            		"ScalarExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2438:4: (otherlv_7= 'details=' ( (lv_details_8_0= ruleScalarExpression ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==49) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2438:6: otherlv_7= 'details=' ( (lv_details_8_0= ruleScalarExpression ) )
                    {
                    otherlv_7=(Token)match(input,49,FOLLOW_49_in_ruleSectionCell5312); 

                        	newLeafNode(otherlv_7, grammarAccess.getSectionCellAccess().getDetailsKeyword_5_0());
                        
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2442:1: ( (lv_details_8_0= ruleScalarExpression ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2443:1: (lv_details_8_0= ruleScalarExpression )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2443:1: (lv_details_8_0= ruleScalarExpression )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2444:3: lv_details_8_0= ruleScalarExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getSectionCellAccess().getDetailsScalarExpressionParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleScalarExpression_in_ruleSectionCell5333);
                    lv_details_8_0=ruleScalarExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSectionCellRule());
                    	        }
                           		set(
                           			current, 
                           			"details",
                            		lv_details_8_0, 
                            		"ScalarExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2460:4: (otherlv_9= 'image=' ( (lv_image_10_0= ruleScalarExpression ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==50) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2460:6: otherlv_9= 'image=' ( (lv_image_10_0= ruleScalarExpression ) )
                    {
                    otherlv_9=(Token)match(input,50,FOLLOW_50_in_ruleSectionCell5348); 

                        	newLeafNode(otherlv_9, grammarAccess.getSectionCellAccess().getImageKeyword_6_0());
                        
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2464:1: ( (lv_image_10_0= ruleScalarExpression ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2465:1: (lv_image_10_0= ruleScalarExpression )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2465:1: (lv_image_10_0= ruleScalarExpression )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2466:3: lv_image_10_0= ruleScalarExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getSectionCellAccess().getImageScalarExpressionParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleScalarExpression_in_ruleSectionCell5369);
                    lv_image_10_0=ruleScalarExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSectionCellRule());
                    	        }
                           		set(
                           			current, 
                           			"image",
                            		lv_image_10_0, 
                            		"ScalarExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2482:4: (otherlv_11= 'query=' ( (lv_query_12_0= ruleScalarExpression ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==55) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2482:6: otherlv_11= 'query=' ( (lv_query_12_0= ruleScalarExpression ) )
                    {
                    otherlv_11=(Token)match(input,55,FOLLOW_55_in_ruleSectionCell5384); 

                        	newLeafNode(otherlv_11, grammarAccess.getSectionCellAccess().getQueryKeyword_7_0());
                        
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2486:1: ( (lv_query_12_0= ruleScalarExpression ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2487:1: (lv_query_12_0= ruleScalarExpression )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2487:1: (lv_query_12_0= ruleScalarExpression )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2488:3: lv_query_12_0= ruleScalarExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getSectionCellAccess().getQueryScalarExpressionParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleScalarExpression_in_ruleSectionCell5405);
                    lv_query_12_0=ruleScalarExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSectionCellRule());
                    	        }
                           		set(
                           			current, 
                           			"query",
                            		lv_query_12_0, 
                            		"ScalarExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2504:4: (otherlv_13= 'action=' ( (lv_action_14_0= ruleViewAction ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==56) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2504:6: otherlv_13= 'action=' ( (lv_action_14_0= ruleViewAction ) )
                    {
                    otherlv_13=(Token)match(input,56,FOLLOW_56_in_ruleSectionCell5420); 

                        	newLeafNode(otherlv_13, grammarAccess.getSectionCellAccess().getActionKeyword_8_0());
                        
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2508:1: ( (lv_action_14_0= ruleViewAction ) )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2509:1: (lv_action_14_0= ruleViewAction )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2509:1: (lv_action_14_0= ruleViewAction )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2510:3: lv_action_14_0= ruleViewAction
                    {
                     
                    	        newCompositeNode(grammarAccess.getSectionCellAccess().getActionViewActionParserRuleCall_8_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleViewAction_in_ruleSectionCell5441);
                    lv_action_14_0=ruleViewAction();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSectionCellRule());
                    	        }
                           		set(
                           			current, 
                           			"action",
                            		lv_action_14_0, 
                            		"ViewAction");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_15=(Token)match(input,25,FOLLOW_25_in_ruleSectionCell5455); 

                	newLeafNode(otherlv_15, grammarAccess.getSectionCellAccess().getRightCurlyBracketKeyword_9());
                

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
    // $ANTLR end "ruleSectionCell"


    // $ANTLR start "entryRuleCollectionIterator"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2538:1: entryRuleCollectionIterator returns [EObject current=null] : iv_ruleCollectionIterator= ruleCollectionIterator EOF ;
    public final EObject entryRuleCollectionIterator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionIterator = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2539:2: (iv_ruleCollectionIterator= ruleCollectionIterator EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2540:2: iv_ruleCollectionIterator= ruleCollectionIterator EOF
            {
             newCompositeNode(grammarAccess.getCollectionIteratorRule()); 
            pushFollow(FOLLOW_ruleCollectionIterator_in_entryRuleCollectionIterator5491);
            iv_ruleCollectionIterator=ruleCollectionIterator();

            state._fsp--;

             current =iv_ruleCollectionIterator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollectionIterator5501); 

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
    // $ANTLR end "entryRuleCollectionIterator"


    // $ANTLR start "ruleCollectionIterator"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2547:1: ruleCollectionIterator returns [EObject current=null] : ( ( (lv_collection_0_0= ruleCollectionExpression ) ) otherlv_1= 'as' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleCollectionIterator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        EObject lv_collection_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2550:28: ( ( ( (lv_collection_0_0= ruleCollectionExpression ) ) otherlv_1= 'as' ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2551:1: ( ( (lv_collection_0_0= ruleCollectionExpression ) ) otherlv_1= 'as' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2551:1: ( ( (lv_collection_0_0= ruleCollectionExpression ) ) otherlv_1= 'as' ( (lv_name_2_0= RULE_ID ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2551:2: ( (lv_collection_0_0= ruleCollectionExpression ) ) otherlv_1= 'as' ( (lv_name_2_0= RULE_ID ) )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2551:2: ( (lv_collection_0_0= ruleCollectionExpression ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2552:1: (lv_collection_0_0= ruleCollectionExpression )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2552:1: (lv_collection_0_0= ruleCollectionExpression )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2553:3: lv_collection_0_0= ruleCollectionExpression
            {
             
            	        newCompositeNode(grammarAccess.getCollectionIteratorAccess().getCollectionCollectionExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleCollectionExpression_in_ruleCollectionIterator5547);
            lv_collection_0_0=ruleCollectionExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCollectionIteratorRule());
            	        }
                   		set(
                   			current, 
                   			"collection",
                    		lv_collection_0_0, 
                    		"CollectionExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,57,FOLLOW_57_in_ruleCollectionIterator5559); 

                	newLeafNode(otherlv_1, grammarAccess.getCollectionIteratorAccess().getAsKeyword_1());
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2573:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2574:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2574:1: (lv_name_2_0= RULE_ID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2575:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCollectionIterator5576); 

            			newLeafNode(lv_name_2_0, grammarAccess.getCollectionIteratorAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCollectionIteratorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


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
    // $ANTLR end "ruleCollectionIterator"


    // $ANTLR start "entryRuleViewAction"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2599:1: entryRuleViewAction returns [EObject current=null] : iv_ruleViewAction= ruleViewAction EOF ;
    public final EObject entryRuleViewAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleViewAction = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2600:2: (iv_ruleViewAction= ruleViewAction EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2601:2: iv_ruleViewAction= ruleViewAction EOF
            {
             newCompositeNode(grammarAccess.getViewActionRule()); 
            pushFollow(FOLLOW_ruleViewAction_in_entryRuleViewAction5617);
            iv_ruleViewAction=ruleViewAction();

            state._fsp--;

             current =iv_ruleViewAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleViewAction5627); 

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
    // $ANTLR end "entryRuleViewAction"


    // $ANTLR start "ruleViewAction"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2608:1: ruleViewAction returns [EObject current=null] : (this_ViewCall_0= ruleViewCall | this_ExternalOpen_1= ruleExternalOpen ) ;
    public final EObject ruleViewAction() throws RecognitionException {
        EObject current = null;

        EObject this_ViewCall_0 = null;

        EObject this_ExternalOpen_1 = null;


         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2611:28: ( (this_ViewCall_0= ruleViewCall | this_ExternalOpen_1= ruleExternalOpen ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2612:1: (this_ViewCall_0= ruleViewCall | this_ExternalOpen_1= ruleExternalOpen )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2612:1: (this_ViewCall_0= ruleViewCall | this_ExternalOpen_1= ruleExternalOpen )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_ID) ) {
                int LA44_1 = input.LA(2);

                if ( (LA44_1==EOF||LA44_1==12||LA44_1==25) ) {
                    alt44=2;
                }
                else if ( (LA44_1==13) ) {
                    alt44=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 44, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA44_0==RULE_STRING||LA44_0==13||LA44_0==15||LA44_0==17) ) {
                alt44=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2613:5: this_ViewCall_0= ruleViewCall
                    {
                     
                            newCompositeNode(grammarAccess.getViewActionAccess().getViewCallParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleViewCall_in_ruleViewAction5674);
                    this_ViewCall_0=ruleViewCall();

                    state._fsp--;

                     
                            current = this_ViewCall_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2623:5: this_ExternalOpen_1= ruleExternalOpen
                    {
                     
                            newCompositeNode(grammarAccess.getViewActionAccess().getExternalOpenParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleExternalOpen_in_ruleViewAction5701);
                    this_ExternalOpen_1=ruleExternalOpen();

                    state._fsp--;

                     
                            current = this_ExternalOpen_1; 
                            afterParserOrEnumRuleCall();
                        

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
    // $ANTLR end "ruleViewAction"


    // $ANTLR start "entryRuleExternalOpen"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2639:1: entryRuleExternalOpen returns [EObject current=null] : iv_ruleExternalOpen= ruleExternalOpen EOF ;
    public final EObject entryRuleExternalOpen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalOpen = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2640:2: (iv_ruleExternalOpen= ruleExternalOpen EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2641:2: iv_ruleExternalOpen= ruleExternalOpen EOF
            {
             newCompositeNode(grammarAccess.getExternalOpenRule()); 
            pushFollow(FOLLOW_ruleExternalOpen_in_entryRuleExternalOpen5736);
            iv_ruleExternalOpen=ruleExternalOpen();

            state._fsp--;

             current =iv_ruleExternalOpen; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExternalOpen5746); 

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
    // $ANTLR end "entryRuleExternalOpen"


    // $ANTLR start "ruleExternalOpen"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2648:1: ruleExternalOpen returns [EObject current=null] : ( (lv_url_0_0= ruleScalarExpression ) ) ;
    public final EObject ruleExternalOpen() throws RecognitionException {
        EObject current = null;

        EObject lv_url_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2651:28: ( ( (lv_url_0_0= ruleScalarExpression ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2652:1: ( (lv_url_0_0= ruleScalarExpression ) )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2652:1: ( (lv_url_0_0= ruleScalarExpression ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2653:1: (lv_url_0_0= ruleScalarExpression )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2653:1: (lv_url_0_0= ruleScalarExpression )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2654:3: lv_url_0_0= ruleScalarExpression
            {
             
            	        newCompositeNode(grammarAccess.getExternalOpenAccess().getUrlScalarExpressionParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleScalarExpression_in_ruleExternalOpen5791);
            lv_url_0_0=ruleScalarExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExternalOpenRule());
            	        }
                   		set(
                   			current, 
                   			"url",
                    		lv_url_0_0, 
                    		"ScalarExpression");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleExternalOpen"


    // $ANTLR start "entryRuleViewCall"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2678:1: entryRuleViewCall returns [EObject current=null] : iv_ruleViewCall= ruleViewCall EOF ;
    public final EObject entryRuleViewCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleViewCall = null;


        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2679:2: (iv_ruleViewCall= ruleViewCall EOF )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2680:2: iv_ruleViewCall= ruleViewCall EOF
            {
             newCompositeNode(grammarAccess.getViewCallRule()); 
            pushFollow(FOLLOW_ruleViewCall_in_entryRuleViewCall5826);
            iv_ruleViewCall=ruleViewCall();

            state._fsp--;

             current =iv_ruleViewCall; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleViewCall5836); 

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
    // $ANTLR end "entryRuleViewCall"


    // $ANTLR start "ruleViewCall"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2687:1: ruleViewCall returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_provider_2_0= ruleProviderConstruction ) )? otherlv_3= ')' ) ;
    public final EObject ruleViewCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_provider_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2690:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_provider_2_0= ruleProviderConstruction ) )? otherlv_3= ')' ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2691:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_provider_2_0= ruleProviderConstruction ) )? otherlv_3= ')' )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2691:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_provider_2_0= ruleProviderConstruction ) )? otherlv_3= ')' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2691:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_provider_2_0= ruleProviderConstruction ) )? otherlv_3= ')'
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2691:2: ( (otherlv_0= RULE_ID ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2692:1: (otherlv_0= RULE_ID )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2692:1: (otherlv_0= RULE_ID )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2693:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getViewCallRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleViewCall5881); 

            		newLeafNode(otherlv_0, grammarAccess.getViewCallAccess().getViewViewCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleViewCall5893); 

                	newLeafNode(otherlv_1, grammarAccess.getViewCallAccess().getLeftParenthesisKeyword_1());
                
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2708:1: ( (lv_provider_2_0= ruleProviderConstruction ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0>=RULE_ID && LA45_0<=RULE_STRING)||LA45_0==13||LA45_0==15||(LA45_0>=17 && LA45_0<=18)||LA45_0==20) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2709:1: (lv_provider_2_0= ruleProviderConstruction )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2709:1: (lv_provider_2_0= ruleProviderConstruction )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2710:3: lv_provider_2_0= ruleProviderConstruction
                    {
                     
                    	        newCompositeNode(grammarAccess.getViewCallAccess().getProviderProviderConstructionParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleProviderConstruction_in_ruleViewCall5914);
                    lv_provider_2_0=ruleProviderConstruction();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getViewCallRule());
                    	        }
                           		set(
                           			current, 
                           			"provider",
                            		lv_provider_2_0, 
                            		"ProviderConstruction");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleViewCall5927); 

                	newLeafNode(otherlv_3, grammarAccess.getViewCallAccess().getRightParenthesisKeyword_3());
                

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
    // $ANTLR end "ruleViewCall"


    // $ANTLR start "ruleCellType"
    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2738:1: ruleCellType returns [Enumerator current=null] : ( (enumLiteral_0= 'Default' ) | (enumLiteral_1= 'DefaultWithDisclosure' ) | (enumLiteral_2= 'Value2' ) | (enumLiteral_3= 'Double' ) | (enumLiteral_4= 'Subtitle' ) | (enumLiteral_5= 'Map' ) ) ;
    public final Enumerator ruleCellType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;

         enterRule(); 
        try {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2740:28: ( ( (enumLiteral_0= 'Default' ) | (enumLiteral_1= 'DefaultWithDisclosure' ) | (enumLiteral_2= 'Value2' ) | (enumLiteral_3= 'Double' ) | (enumLiteral_4= 'Subtitle' ) | (enumLiteral_5= 'Map' ) ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2741:1: ( (enumLiteral_0= 'Default' ) | (enumLiteral_1= 'DefaultWithDisclosure' ) | (enumLiteral_2= 'Value2' ) | (enumLiteral_3= 'Double' ) | (enumLiteral_4= 'Subtitle' ) | (enumLiteral_5= 'Map' ) )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2741:1: ( (enumLiteral_0= 'Default' ) | (enumLiteral_1= 'DefaultWithDisclosure' ) | (enumLiteral_2= 'Value2' ) | (enumLiteral_3= 'Double' ) | (enumLiteral_4= 'Subtitle' ) | (enumLiteral_5= 'Map' ) )
            int alt46=6;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt46=1;
                }
                break;
            case 59:
                {
                alt46=2;
                }
                break;
            case 60:
                {
                alt46=3;
                }
                break;
            case 61:
                {
                alt46=4;
                }
                break;
            case 62:
                {
                alt46=5;
                }
                break;
            case 63:
                {
                alt46=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2741:2: (enumLiteral_0= 'Default' )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2741:2: (enumLiteral_0= 'Default' )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2741:4: enumLiteral_0= 'Default'
                    {
                    enumLiteral_0=(Token)match(input,58,FOLLOW_58_in_ruleCellType5977); 

                            current = grammarAccess.getCellTypeAccess().getDefaultEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getCellTypeAccess().getDefaultEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2747:6: (enumLiteral_1= 'DefaultWithDisclosure' )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2747:6: (enumLiteral_1= 'DefaultWithDisclosure' )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2747:8: enumLiteral_1= 'DefaultWithDisclosure'
                    {
                    enumLiteral_1=(Token)match(input,59,FOLLOW_59_in_ruleCellType5994); 

                            current = grammarAccess.getCellTypeAccess().getDefaultWithDisclosureEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getCellTypeAccess().getDefaultWithDisclosureEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2753:6: (enumLiteral_2= 'Value2' )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2753:6: (enumLiteral_2= 'Value2' )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2753:8: enumLiteral_2= 'Value2'
                    {
                    enumLiteral_2=(Token)match(input,60,FOLLOW_60_in_ruleCellType6011); 

                            current = grammarAccess.getCellTypeAccess().getValue2EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getCellTypeAccess().getValue2EnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2759:6: (enumLiteral_3= 'Double' )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2759:6: (enumLiteral_3= 'Double' )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2759:8: enumLiteral_3= 'Double'
                    {
                    enumLiteral_3=(Token)match(input,61,FOLLOW_61_in_ruleCellType6028); 

                            current = grammarAccess.getCellTypeAccess().getDoubleEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getCellTypeAccess().getDoubleEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2765:6: (enumLiteral_4= 'Subtitle' )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2765:6: (enumLiteral_4= 'Subtitle' )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2765:8: enumLiteral_4= 'Subtitle'
                    {
                    enumLiteral_4=(Token)match(input,62,FOLLOW_62_in_ruleCellType6045); 

                            current = grammarAccess.getCellTypeAccess().getSubtitleEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getCellTypeAccess().getSubtitleEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2771:6: (enumLiteral_5= 'Map' )
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2771:6: (enumLiteral_5= 'Map' )
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:2771:8: enumLiteral_5= 'Map'
                    {
                    enumLiteral_5=(Token)match(input,63,FOLLOW_63_in_ruleCellType6062); 

                            current = grammarAccess.getCellTypeAccess().getMapsEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getCellTypeAccess().getMapsEnumLiteralDeclaration_5()); 
                        

                    }


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
    // $ANTLR end "ruleCellType"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplication_in_ruleModel131 = new BitSet(new long[]{0x00003812C0000002L});
    public static final BitSet FOLLOW_ruleModelElement_in_ruleModel152 = new BitSet(new long[]{0x00003812C0000002L});
    public static final BitSet FOLLOW_ruleApplication_in_entryRuleApplication189 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplication199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTabBarApplication_in_ruleApplication245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelElement_in_entryRuleModelElement279 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModelElement289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleModelElement336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContentProvider_in_ruleModelElement363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleView_in_ruleModelElement390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstant_in_ruleModelElement417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDescription_in_entryRuleTypeDescription454 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeDescription464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTypeDescription509 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_11_in_ruleTypeDescription527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter577 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDescription_in_ruleParameter633 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameter650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectReference_in_entryRuleObjectReference691 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectReference701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleObjectReference746 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ruleNestedObjectReference_in_ruleObjectReference767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNestedObjectReference_in_entryRuleNestedObjectReference804 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNestedObjectReference814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleNestedObjectReference851 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNestedObjectReference871 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ruleNestedObjectReference_in_ruleNestedObjectReference892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression929 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleExpression986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringFunction_in_ruleExpression1013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionLiteral_in_ruleExpression1040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionFunction_in_ruleExpression1067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectReference_in_ruleExpression1094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_entryRuleScalarExpression1129 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScalarExpression1139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleScalarExpression1186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringFunction_in_ruleScalarExpression1213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectReference_in_ruleScalarExpression1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionExpression_in_entryRuleCollectionExpression1275 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollectionExpression1285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionLiteral_in_ruleCollectionExpression1332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionFunction_in_ruleCollectionExpression1359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectReference_in_ruleCollectionExpression1386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral1421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral1431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral1472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringFunction_in_entryRuleStringFunction1512 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringFunction1522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleStringFunction1569 = new BitSet(new long[]{0x000000000002A030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleStringFunction1590 = new BitSet(new long[]{0x000000000002E030L});
    public static final BitSet FOLLOW_14_in_ruleStringFunction1603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleStringFunction1632 = new BitSet(new long[]{0x000000000002A030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleStringFunction1653 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleStringFunction1665 = new BitSet(new long[]{0x000000000002A030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleStringFunction1686 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleStringFunction1698 = new BitSet(new long[]{0x000000000002A030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleStringFunction1719 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleStringFunction1731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleStringFunction1760 = new BitSet(new long[]{0x000000000002A030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleStringFunction1781 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleStringFunction1793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionLiteral_in_entryRuleCollectionLiteral1830 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollectionLiteral1840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleCollectionLiteral1877 = new BitSet(new long[]{0x000000000002A030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleCollectionLiteral1898 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_16_in_ruleCollectionLiteral1911 = new BitSet(new long[]{0x000000000002A030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleCollectionLiteral1932 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_19_in_ruleCollectionLiteral1946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionFunction_in_entryRuleCollectionFunction1982 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollectionFunction1992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleCollectionFunction2038 = new BitSet(new long[]{0x000000000002A030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleCollectionFunction2059 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleCollectionFunction2071 = new BitSet(new long[]{0x000000000002A030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleCollectionFunction2092 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleCollectionFunction2104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTabBarApplication_in_entryRuleTabBarApplication2140 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTabBarApplication2150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleTabBarApplication2188 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_22_in_ruleTabBarApplication2206 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTabBarApplication2224 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleTabBarApplication2241 = new BitSet(new long[]{0x0000000007000000L});
    public static final BitSet FOLLOW_24_in_ruleTabBarApplication2254 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTabBarApplication2271 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_ruleTabbarButton_in_ruleTabBarApplication2299 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_25_in_ruleTabBarApplication2312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTabbarButton_in_entryRuleTabbarButton2348 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTabbarButton2358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleTabbarButton2395 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleTabbarButton2407 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleTabbarButton2419 = new BitSet(new long[]{0x000000000002A030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleTabbarButton2440 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleTabbarButton2452 = new BitSet(new long[]{0x000000000002A030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleTabbarButton2473 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleTabbarButton2485 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleViewCall_in_ruleTabbarButton2506 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleTabbarButton2518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstant_in_entryRuleConstant2554 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstant2564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleConstant2610 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstant2627 = new BitSet(new long[]{0x000000000002A030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleConstant2653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType2689 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType2699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleType_in_ruleType2746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_ruleType2773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleType_in_entryRuleSimpleType2808 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleType2818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleSimpleType2855 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSimpleType2872 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleSimpleType2889 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSimpleType2906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity2947 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity2957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleEntity2994 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity3011 = new BitSet(new long[]{0x0000000400800000L});
    public static final BitSet FOLLOW_34_in_ruleEntity3029 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity3049 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleEntity3063 = new BitSet(new long[]{0x0000000802000010L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleEntity3084 = new BitSet(new long[]{0x0000000802000010L});
    public static final BitSet FOLLOW_25_in_ruleEntity3097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty3133 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty3143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleProperty3186 = new BitSet(new long[]{0x0000000800000010L});
    public static final BitSet FOLLOW_ruleTypeDescription_in_ruleProperty3221 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProperty3238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContentProvider_in_entryRuleContentProvider3279 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContentProvider3289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleContentProvider3326 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContentProvider3343 = new BitSet(new long[]{0x0000006000002000L});
    public static final BitSet FOLLOW_13_in_ruleContentProvider3361 = new BitSet(new long[]{0x0000000800000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleContentProvider3382 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleContentProvider3394 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_37_in_ruleContentProvider3409 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_38_in_ruleContentProvider3433 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContentProvider3467 = new BitSet(new long[]{0x0000008000000800L});
    public static final BitSet FOLLOW_11_in_ruleContentProvider3485 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleContentProvider3511 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleContentProvider3523 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleContentProvider3535 = new BitSet(new long[]{0x000000000002A030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleContentProvider3556 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleContentProvider3568 = new BitSet(new long[]{0x000000000002A030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleContentProvider3589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProviderConstruction_in_entryRuleProviderConstruction3625 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProviderConstruction3635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProviderConstruction3690 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleProviderConstruction3702 = new BitSet(new long[]{0x000000000016E030L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleProviderConstruction3723 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleProviderConstruction3736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleProviderConstruction3774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleView_in_entryRuleView3811 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleView3821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSectionedView_in_ruleView3868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomView_in_ruleView3895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSectionedView_in_entryRuleSectionedView3930 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSectionedView3940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableView_in_ruleSectionedView3987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDetailsView_in_ruleSectionedView4014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableView_in_entryRuleTableView4049 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTableView4059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleTableView4096 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTableView4113 = new BitSet(new long[]{0x0000000000802000L});
    public static final BitSet FOLLOW_13_in_ruleTableView4131 = new BitSet(new long[]{0x0000000800000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleTableView4152 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleTableView4164 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleTableView4178 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleTableView4190 = new BitSet(new long[]{0x000000000002A030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleTableView4211 = new BitSet(new long[]{0x0008000002000000L});
    public static final BitSet FOLLOW_ruleViewSection_in_ruleTableView4232 = new BitSet(new long[]{0x0008000002000000L});
    public static final BitSet FOLLOW_25_in_ruleTableView4245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDetailsView_in_entryRuleDetailsView4281 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDetailsView4291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleDetailsView4328 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDetailsView4345 = new BitSet(new long[]{0x0000000000802000L});
    public static final BitSet FOLLOW_13_in_ruleDetailsView4363 = new BitSet(new long[]{0x0000000800000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleDetailsView4384 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDetailsView4396 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleDetailsView4410 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleDetailsView4422 = new BitSet(new long[]{0x000000000002A030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleDetailsView4443 = new BitSet(new long[]{0x0008800002000000L});
    public static final BitSet FOLLOW_ruleViewHeader_in_ruleDetailsView4464 = new BitSet(new long[]{0x0008000002000000L});
    public static final BitSet FOLLOW_ruleViewSection_in_ruleDetailsView4486 = new BitSet(new long[]{0x0008000002000000L});
    public static final BitSet FOLLOW_25_in_ruleDetailsView4499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomView_in_entryRuleCustomView4535 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCustomView4545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleCustomView4582 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCustomView4599 = new BitSet(new long[]{0x0000400000002000L});
    public static final BitSet FOLLOW_13_in_ruleCustomView4617 = new BitSet(new long[]{0x0000000800000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleCustomView4638 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleCustomView4650 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleCustomView4664 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCustomView4681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleViewHeader_in_entryRuleViewHeader4722 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleViewHeader4732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleViewHeader4778 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleViewHeader4790 = new BitSet(new long[]{0x000700000A000000L});
    public static final BitSet FOLLOW_27_in_ruleViewHeader4803 = new BitSet(new long[]{0x000000000002A030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleViewHeader4824 = new BitSet(new long[]{0x0007000002000000L});
    public static final BitSet FOLLOW_48_in_ruleViewHeader4839 = new BitSet(new long[]{0x000000000002A030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleViewHeader4860 = new BitSet(new long[]{0x0006000002000000L});
    public static final BitSet FOLLOW_49_in_ruleViewHeader4875 = new BitSet(new long[]{0x000000000002A030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleViewHeader4896 = new BitSet(new long[]{0x0004000002000000L});
    public static final BitSet FOLLOW_50_in_ruleViewHeader4911 = new BitSet(new long[]{0x000000000002A030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleViewHeader4932 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleViewHeader4946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleViewSection_in_entryRuleViewSection4982 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleViewSection4992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleViewSection5029 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleViewSection5041 = new BitSet(new long[]{0x0010000008000000L});
    public static final BitSet FOLLOW_27_in_ruleViewSection5054 = new BitSet(new long[]{0x000000000002A030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleViewSection5075 = new BitSet(new long[]{0x0010000008000000L});
    public static final BitSet FOLLOW_ruleSectionCell_in_ruleViewSection5098 = new BitSet(new long[]{0x001000000A000000L});
    public static final BitSet FOLLOW_25_in_ruleViewSection5111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSectionCell_in_entryRuleSectionCell5147 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSectionCell5157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleSectionCell5194 = new BitSet(new long[]{0xFC00000000000000L});
    public static final BitSet FOLLOW_ruleCellType_in_ruleSectionCell5215 = new BitSet(new long[]{0x0020000000800000L});
    public static final BitSet FOLLOW_53_in_ruleSectionCell5228 = new BitSet(new long[]{0x000000000016A030L});
    public static final BitSet FOLLOW_ruleCollectionIterator_in_ruleSectionCell5249 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleSectionCell5263 = new BitSet(new long[]{0x01C6000002000000L});
    public static final BitSet FOLLOW_54_in_ruleSectionCell5276 = new BitSet(new long[]{0x000000000002A030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleSectionCell5297 = new BitSet(new long[]{0x0186000002000000L});
    public static final BitSet FOLLOW_49_in_ruleSectionCell5312 = new BitSet(new long[]{0x000000000002A030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleSectionCell5333 = new BitSet(new long[]{0x0184000002000000L});
    public static final BitSet FOLLOW_50_in_ruleSectionCell5348 = new BitSet(new long[]{0x000000000002A030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleSectionCell5369 = new BitSet(new long[]{0x0180000002000000L});
    public static final BitSet FOLLOW_55_in_ruleSectionCell5384 = new BitSet(new long[]{0x000000000002A030L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleSectionCell5405 = new BitSet(new long[]{0x0100000002000000L});
    public static final BitSet FOLLOW_56_in_ruleSectionCell5420 = new BitSet(new long[]{0x000000000002A030L});
    public static final BitSet FOLLOW_ruleViewAction_in_ruleSectionCell5441 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleSectionCell5455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionIterator_in_entryRuleCollectionIterator5491 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollectionIterator5501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionExpression_in_ruleCollectionIterator5547 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_ruleCollectionIterator5559 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCollectionIterator5576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleViewAction_in_entryRuleViewAction5617 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleViewAction5627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleViewCall_in_ruleViewAction5674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalOpen_in_ruleViewAction5701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalOpen_in_entryRuleExternalOpen5736 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExternalOpen5746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_ruleExternalOpen5791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleViewCall_in_entryRuleViewCall5826 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleViewCall5836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleViewCall5881 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleViewCall5893 = new BitSet(new long[]{0x000000000016E030L});
    public static final BitSet FOLLOW_ruleProviderConstruction_in_ruleViewCall5914 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleViewCall5927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleCellType5977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleCellType5994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleCellType6011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleCellType6028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleCellType6045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleCellType6062 = new BitSet(new long[]{0x0000000000000002L});

}