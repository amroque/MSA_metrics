// Generated from E:/OneDrive Personal/OneDrive/Documentos/intelli/MSA/src/main/java/antlr_grammar/gramatica.g4 by ANTLR 4.13.1
package antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class gramaticaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, ID=36, INT=37, STRING=38, CHAR=39, 
		WS=40, COMMENT=41, ML_COMMENT=42;
	public static final int
		RULE_modifier = 0, RULE_anotations = 1, RULE_anotation = 2, RULE_apiGateway = 3, 
		RULE_packageDeclaration = 4, RULE_package = 5, RULE_packageName = 6, RULE_subPackage = 7, 
		RULE_importDeclaration = 8, RULE_importName = 9, RULE_importID = 10, RULE_subImport = 11, 
		RULE_apiClass = 12, RULE_className = 13, RULE_extendedClass = 14, RULE_memberDeclaration = 15, 
		RULE_variableDeclaration = 16, RULE_variableDataType = 17, RULE_variable = 18, 
		RULE_value = 19, RULE_constructor = 20, RULE_constructorBody = 21, RULE_test = 22, 
		RULE_methodDeclaration = 23, RULE_returnType = 24, RULE_methodName = 25, 
		RULE_parameters = 26, RULE_parameter = 27, RULE_dataType = 28, RULE_exceptionName = 29, 
		RULE_methodBody = 30, RULE_tryCatchSect = 31, RULE_tryBlock = 32, RULE_catchSect = 33, 
		RULE_catchBlock = 34, RULE_returnSect = 35, RULE_returnBlock = 36;
	private static String[] makeRuleNames() {
		return new String[] {
			"modifier", "anotations", "anotation", "apiGateway", "packageDeclaration", 
			"package", "packageName", "subPackage", "importDeclaration", "importName", 
			"importID", "subImport", "apiClass", "className", "extendedClass", "memberDeclaration", 
			"variableDeclaration", "variableDataType", "variable", "value", "constructor", 
			"constructorBody", "test", "methodDeclaration", "returnType", "methodName", 
			"parameters", "parameter", "dataType", "exceptionName", "methodBody", 
			"tryCatchSect", "tryBlock", "catchSect", "catchBlock", "returnSect", 
			"returnBlock"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'public'", "'private'", "'protected'", "'static'", "'final'", 
			"'abstract'", "'synchronized'", "'native'", "'transient'", "'@'", "'(\"'", 
			"'\")'", "'('", "')'", "'package'", "';'", "'.'", "'import'", "'.*;'", 
			"'class'", "'implements'", "'{'", "'}'", "'extends'", "'<'", "'>'", "'[]'", 
			"','", "'[][]'", "'='", "'{}'", "'throws'", "'try'", "'catch'", "'return'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"ID", "INT", "STRING", "CHAR", "WS", "COMMENT", "ML_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "gramatica.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public gramaticaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ModifierContext extends ParserRuleContext {
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1022L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AnotationsContext extends ParserRuleContext {
		public AnotationContext anotation() {
			return getRuleContext(AnotationContext.class,0);
		}
		public AnotationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anotations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterAnotations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitAnotations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitAnotations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnotationsContext anotations() throws RecognitionException {
		AnotationsContext _localctx = new AnotationsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_anotations);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			anotation();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AnotationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(gramaticaParser.ID, 0); }
		public AnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterAnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitAnotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitAnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnotationContext anotation() throws RecognitionException {
		AnotationContext _localctx = new AnotationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_anotation);
		try {
			int _alt;
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				match(T__9);
				setState(79);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				match(T__9);
				setState(81);
				match(ID);
				setState(82);
				match(T__10);
				setState(86);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(83);
						matchWildcard();
						}
						} 
					}
					setState(88);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				}
				setState(89);
				match(T__11);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(90);
				match(T__9);
				setState(91);
				match(ID);
				setState(92);
				match(T__12);
				setState(96);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(93);
						matchWildcard();
						}
						} 
					}
					setState(98);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				}
				setState(99);
				match(T__13);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ApiGatewayContext extends ParserRuleContext {
		public ApiClassContext apiClass() {
			return getRuleContext(ApiClassContext.class,0);
		}
		public PackageDeclarationContext packageDeclaration() {
			return getRuleContext(PackageDeclarationContext.class,0);
		}
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public ApiGatewayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_apiGateway; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterApiGateway(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitApiGateway(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitApiGateway(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ApiGatewayContext apiGateway() throws RecognitionException {
		ApiGatewayContext _localctx = new ApiGatewayContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_apiGateway);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(102);
				packageDeclaration();
				}
			}

			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17) {
				{
				{
				setState(105);
				importDeclaration();
				}
				}
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(111);
			apiClass();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PackageDeclarationContext extends ParserRuleContext {
		public PackageContext package_() {
			return getRuleContext(PackageContext.class,0);
		}
		public PackageDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterPackageDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitPackageDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitPackageDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageDeclarationContext packageDeclaration() throws RecognitionException {
		PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_packageDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(T__14);
			setState(114);
			package_();
			setState(115);
			match(T__15);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PackageContext extends ParserRuleContext {
		public PackageNameContext packageName() {
			return getRuleContext(PackageNameContext.class,0);
		}
		public PackageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_package; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterPackage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitPackage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitPackage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageContext package_() throws RecognitionException {
		PackageContext _localctx = new PackageContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_package);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			packageName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PackageNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(gramaticaParser.ID, 0); }
		public List<SubPackageContext> subPackage() {
			return getRuleContexts(SubPackageContext.class);
		}
		public SubPackageContext subPackage(int i) {
			return getRuleContext(SubPackageContext.class,i);
		}
		public PackageNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterPackageName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitPackageName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitPackageName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageNameContext packageName() throws RecognitionException {
		PackageNameContext _localctx = new PackageNameContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_packageName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(ID);
			setState(124);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(120);
					match(T__16);
					setState(121);
					subPackage();
					}
					} 
				}
				setState(126);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SubPackageContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(gramaticaParser.ID, 0); }
		public SubPackageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subPackage; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterSubPackage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitSubPackage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitSubPackage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubPackageContext subPackage() throws RecognitionException {
		SubPackageContext _localctx = new SubPackageContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_subPackage);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportDeclarationContext extends ParserRuleContext {
		public ImportNameContext importName() {
			return getRuleContext(ImportNameContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitImportDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitImportDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_importDeclaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(T__17);
			setState(133);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(130);
					modifier();
					}
					} 
				}
				setState(135);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(136);
			importName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportNameContext extends ParserRuleContext {
		public ImportIDContext importID() {
			return getRuleContext(ImportIDContext.class,0);
		}
		public ImportNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterImportName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitImportName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitImportName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportNameContext importName() throws RecognitionException {
		ImportNameContext _localctx = new ImportNameContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_importName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			importID();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportIDContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(gramaticaParser.ID, 0); }
		public List<SubImportContext> subImport() {
			return getRuleContexts(SubImportContext.class);
		}
		public SubImportContext subImport(int i) {
			return getRuleContext(SubImportContext.class,i);
		}
		public ImportIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importID; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterImportID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitImportID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitImportID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportIDContext importID() throws RecognitionException {
		ImportIDContext _localctx = new ImportIDContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_importID);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(ID);
			setState(145);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(141);
					match(T__16);
					setState(142);
					subImport();
					}
					} 
				}
				setState(147);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(148);
			_la = _input.LA(1);
			if ( !(_la==T__15 || _la==T__18) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SubImportContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(gramaticaParser.ID, 0); }
		public SubImportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subImport; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterSubImport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitSubImport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitSubImport(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubImportContext subImport() throws RecognitionException {
		SubImportContext _localctx = new SubImportContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_subImport);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ApiClassContext extends ParserRuleContext {
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public ExtendedClassContext extendedClass() {
			return getRuleContext(ExtendedClassContext.class,0);
		}
		public List<AnotationsContext> anotations() {
			return getRuleContexts(AnotationsContext.class);
		}
		public AnotationsContext anotations(int i) {
			return getRuleContext(AnotationsContext.class,i);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public List<MemberDeclarationContext> memberDeclaration() {
			return getRuleContexts(MemberDeclarationContext.class);
		}
		public MemberDeclarationContext memberDeclaration(int i) {
			return getRuleContext(MemberDeclarationContext.class,i);
		}
		public ApiClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_apiClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterApiClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitApiClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitApiClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ApiClassContext apiClass() throws RecognitionException {
		ApiClassContext _localctx = new ApiClassContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_apiClass);
		int _la;
		try {
			setState(225);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(152);
					anotations();
					}
					}
					setState(157);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1022L) != 0)) {
					{
					{
					setState(158);
					modifier();
					}
					}
					setState(163);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(164);
				match(T__19);
				setState(165);
				className();
				setState(166);
				match(T__20);
				setState(167);
				extendedClass();
				setState(168);
				match(T__21);
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 68719478782L) != 0)) {
					{
					{
					setState(169);
					memberDeclaration();
					}
					}
					setState(174);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(175);
				match(T__22);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(177);
					anotations();
					}
					}
					setState(182);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1022L) != 0)) {
					{
					{
					setState(183);
					modifier();
					}
					}
					setState(188);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(189);
				match(T__19);
				setState(190);
				className();
				setState(191);
				match(T__23);
				setState(192);
				extendedClass();
				setState(193);
				match(T__21);
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 68719478782L) != 0)) {
					{
					{
					setState(194);
					memberDeclaration();
					}
					}
					setState(199);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(200);
				match(T__22);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(202);
					anotations();
					}
					}
					setState(207);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1022L) != 0)) {
					{
					{
					setState(208);
					modifier();
					}
					}
					setState(213);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(214);
				match(T__19);
				setState(215);
				className();
				setState(216);
				match(T__21);
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 68719478782L) != 0)) {
					{
					{
					setState(217);
					memberDeclaration();
					}
					}
					setState(222);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(223);
				match(T__22);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(gramaticaParser.ID, 0); }
		public ClassNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_className; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterClassName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitClassName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitClassName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassNameContext className() throws RecognitionException {
		ClassNameContext _localctx = new ClassNameContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_className);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExtendedClassContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(gramaticaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(gramaticaParser.ID, i);
		}
		public ExtendedClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extendedClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterExtendedClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitExtendedClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitExtendedClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtendedClassContext extendedClass() throws RecognitionException {
		ExtendedClassContext _localctx = new ExtendedClassContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_extendedClass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(ID);
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__16) {
				{
				{
				setState(230);
				match(T__16);
				setState(231);
				match(ID);
				}
				}
				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__24) {
				{
				{
				setState(237);
				match(T__24);
				setState(238);
				match(ID);
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__16) {
					{
					{
					setState(239);
					match(T__16);
					setState(240);
					match(ID);
					}
					}
					setState(245);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(246);
				match(T__25);
				}
				}
				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MemberDeclarationContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public ConstructorContext constructor() {
			return getRuleContext(ConstructorContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public MemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitMemberDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitMemberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberDeclarationContext memberDeclaration() throws RecognitionException {
		MemberDeclarationContext _localctx = new MemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_memberDeclaration);
		try {
			setState(255);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(252);
				variableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(253);
				constructor();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(254);
				methodDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationContext extends ParserRuleContext {
		public VariableDataTypeContext variableDataType() {
			return getRuleContext(VariableDataTypeContext.class,0);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<AnotationsContext> anotations() {
			return getRuleContexts(AnotationsContext.class);
		}
		public AnotationsContext anotations(int i) {
			return getRuleContext(AnotationsContext.class,i);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_variableDeclaration);
		int _la;
		try {
			int _alt;
			setState(321);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(260);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(257);
						anotations();
						}
						} 
					}
					setState(262);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				}
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1022L) != 0)) {
					{
					{
					setState(263);
					modifier();
					}
					}
					setState(268);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(269);
				variableDataType();
				setState(270);
				variable();
				setState(272);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__26) {
					{
					setState(271);
					match(T__26);
					}
				}

				setState(277);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(274);
						value();
						}
						} 
					}
					setState(279);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				}
				setState(290);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__27) {
					{
					{
					setState(280);
					match(T__27);
					setState(281);
					variable();
					setState(283);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__26) {
						{
						setState(282);
						match(T__26);
						}
					}

					setState(286);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__29) {
						{
						setState(285);
						value();
						}
					}

					}
					}
					setState(292);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(293);
				match(T__15);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(298);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(295);
						anotations();
						}
						} 
					}
					setState(300);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				}
				setState(304);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1022L) != 0)) {
					{
					{
					setState(301);
					modifier();
					}
					}
					setState(306);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(307);
				variableDataType();
				setState(309);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__26) {
					{
					setState(308);
					match(T__26);
					}
				}

				setState(311);
				variable();
				setState(316);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__27) {
					{
					{
					setState(312);
					match(T__27);
					setState(313);
					variable();
					}
					}
					setState(318);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(319);
				match(T__15);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDataTypeContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(gramaticaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(gramaticaParser.ID, i);
		}
		public VariableDataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDataType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterVariableDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitVariableDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitVariableDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDataTypeContext variableDataType() throws RecognitionException {
		VariableDataTypeContext _localctx = new VariableDataTypeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_variableDataType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			match(ID);
			setState(328);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(324);
					match(T__16);
					setState(325);
					match(ID);
					}
					} 
				}
				setState(330);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			}
			setState(343);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(331);
				match(T__26);
				}
				break;
			case 2:
				{
				setState(332);
				match(T__28);
				}
				break;
			case 3:
				{
				setState(333);
				match(T__24);
				setState(334);
				match(ID);
				setState(339);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(335);
						match(T__27);
						setState(336);
						match(ID);
						}
						} 
					}
					setState(341);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				}
				setState(342);
				match(T__25);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableContext extends ParserRuleContext {
		public Token variableName;
		public TerminalNode ID() { return getToken(gramaticaParser.ID, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(345);
				((VariableContext)_localctx).variableName = match(ID);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(gramaticaParser.STRING, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_value);
		try {
			int _alt;
			setState(357);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(348);
				match(T__29);
				setState(349);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(350);
				match(T__29);
				setState(354);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(351);
						matchWildcard();
						}
						} 
					}
					setState(356);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstructorContext extends ParserRuleContext {
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public ConstructorBodyContext constructorBody() {
			return getRuleContext(ConstructorBodyContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public ConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorContext constructor() throws RecognitionException {
		ConstructorContext _localctx = new ConstructorContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_constructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1022L) != 0)) {
				{
				{
				setState(359);
				modifier();
				}
				}
				setState(364);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(365);
			className();
			setState(366);
			match(T__12);
			setState(368);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 68719477758L) != 0)) {
				{
				setState(367);
				parameters();
				}
			}

			setState(370);
			match(T__13);
			setState(376);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__21:
				{
				setState(371);
				match(T__21);
				setState(372);
				constructorBody();
				setState(373);
				match(T__22);
				}
				break;
			case T__30:
				{
				setState(375);
				match(T__30);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstructorBodyContext extends ParserRuleContext {
		public ConstructorBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterConstructorBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitConstructorBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitConstructorBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorBodyContext constructorBody() throws RecognitionException {
		ConstructorBodyContext _localctx = new ConstructorBodyContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_constructorBody);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(378);
					matchWildcard();
					}
					} 
				}
				setState(383);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TestContext extends ParserRuleContext {
		public List<MethodDeclarationContext> methodDeclaration() {
			return getRuleContexts(MethodDeclarationContext.class);
		}
		public MethodDeclarationContext methodDeclaration(int i) {
			return getRuleContext(MethodDeclarationContext.class,i);
		}
		public TestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_test; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterTest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitTest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitTest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TestContext test() throws RecognitionException {
		TestContext _localctx = new TestContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_test);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 68719478782L) != 0)) {
				{
				{
				setState(384);
				methodDeclaration();
				}
				}
				setState(389);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MethodDeclarationContext extends ParserRuleContext {
		public ReturnTypeContext returnType() {
			return getRuleContext(ReturnTypeContext.class,0);
		}
		public MethodNameContext methodName() {
			return getRuleContext(MethodNameContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public List<AnotationsContext> anotations() {
			return getRuleContexts(AnotationsContext.class);
		}
		public AnotationsContext anotations(int i) {
			return getRuleContext(AnotationsContext.class,i);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public ExceptionNameContext exceptionName() {
			return getRuleContext(ExceptionNameContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_methodDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(390);
					anotations();
					}
					} 
				}
				setState(395);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			}
			setState(399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1022L) != 0)) {
				{
				{
				setState(396);
				modifier();
				}
				}
				setState(401);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(402);
			returnType();
			setState(403);
			methodName();
			setState(404);
			match(T__12);
			setState(413);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 68719477758L) != 0)) {
				{
				setState(405);
				parameter();
				setState(410);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__27) {
					{
					{
					setState(406);
					match(T__27);
					setState(407);
					parameter();
					}
					}
					setState(412);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(415);
			match(T__13);
			setState(418);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__31) {
				{
				setState(416);
				match(T__31);
				setState(417);
				exceptionName();
				}
			}

			setState(425);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__21:
				{
				setState(420);
				match(T__21);
				setState(421);
				methodBody();
				setState(422);
				match(T__22);
				}
				break;
			case T__30:
				{
				setState(424);
				match(T__30);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnTypeContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(gramaticaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(gramaticaParser.ID, i);
		}
		public ReturnTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterReturnType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitReturnType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitReturnType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnTypeContext returnType() throws RecognitionException {
		ReturnTypeContext _localctx = new ReturnTypeContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_returnType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			match(ID);
			setState(432);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__16) {
				{
				{
				setState(428);
				match(T__16);
				setState(429);
				match(ID);
				}
				}
				setState(434);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(447);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
				{
				setState(435);
				match(T__26);
				}
				break;
			case T__28:
				{
				setState(436);
				match(T__28);
				}
				break;
			case T__24:
				{
				setState(437);
				match(T__24);
				setState(438);
				match(ID);
				setState(443);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__27) {
					{
					{
					setState(439);
					match(T__27);
					setState(440);
					match(ID);
					}
					}
					setState(445);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(446);
				match(T__25);
				}
				break;
			case ID:
				break;
			default:
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MethodNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(gramaticaParser.ID, 0); }
		public MethodNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterMethodName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitMethodName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitMethodName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodNameContext methodName() throws RecognitionException {
		MethodNameContext _localctx = new MethodNameContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_methodName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParametersContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			parameter();
			setState(456);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__27) {
				{
				{
				setState(452);
				match(T__27);
				setState(453);
				parameter();
				}
				}
				setState(458);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterContext extends ParserRuleContext {
		public Token paramName;
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(gramaticaParser.ID, 0); }
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(462);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1022L) != 0)) {
				{
				{
				setState(459);
				modifier();
				}
				}
				setState(464);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(465);
			dataType();
			setState(466);
			((ParameterContext)_localctx).paramName = match(ID);
			setState(468);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__26 || _la==T__28) {
				{
				setState(467);
				_la = _input.LA(1);
				if ( !(_la==T__26 || _la==T__28) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DataTypeContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(gramaticaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(gramaticaParser.ID, i);
		}
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_dataType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
			match(ID);
			setState(475);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__16) {
				{
				{
				setState(471);
				match(T__16);
				setState(472);
				match(ID);
				}
				}
				setState(477);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(490);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
				{
				setState(478);
				match(T__26);
				}
				break;
			case T__28:
				{
				setState(479);
				match(T__28);
				}
				break;
			case T__24:
				{
				setState(480);
				match(T__24);
				setState(481);
				match(ID);
				setState(486);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__27) {
					{
					{
					setState(482);
					match(T__27);
					setState(483);
					match(ID);
					}
					}
					setState(488);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(489);
				match(T__25);
				}
				break;
			case ID:
				break;
			default:
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExceptionNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(gramaticaParser.ID, 0); }
		public ExceptionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterExceptionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitExceptionName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitExceptionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExceptionNameContext exceptionName() throws RecognitionException {
		ExceptionNameContext _localctx = new ExceptionNameContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_exceptionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(492);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MethodBodyContext extends ParserRuleContext {
		public List<TryCatchSectContext> tryCatchSect() {
			return getRuleContexts(TryCatchSectContext.class);
		}
		public TryCatchSectContext tryCatchSect(int i) {
			return getRuleContext(TryCatchSectContext.class,i);
		}
		public List<ReturnSectContext> returnSect() {
			return getRuleContexts(ReturnSectContext.class);
		}
		public ReturnSectContext returnSect(int i) {
			return getRuleContext(ReturnSectContext.class,i);
		}
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitMethodBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitMethodBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_methodBody);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					setState(497);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
					case 1:
						{
						setState(494);
						tryCatchSect();
						}
						break;
					case 2:
						{
						setState(495);
						returnSect();
						}
						break;
					case 3:
						{
						setState(496);
						matchWildcard();
						}
						break;
					}
					} 
				}
				setState(501);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TryCatchSectContext extends ParserRuleContext {
		public TryBlockContext tryBlock() {
			return getRuleContext(TryBlockContext.class,0);
		}
		public List<CatchSectContext> catchSect() {
			return getRuleContexts(CatchSectContext.class);
		}
		public CatchSectContext catchSect(int i) {
			return getRuleContext(CatchSectContext.class,i);
		}
		public TryCatchSectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryCatchSect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterTryCatchSect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitTryCatchSect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitTryCatchSect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryCatchSectContext tryCatchSect() throws RecognitionException {
		TryCatchSectContext _localctx = new TryCatchSectContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_tryCatchSect);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
			match(T__32);
			setState(503);
			match(T__21);
			setState(504);
			tryBlock();
			setState(505);
			match(T__22);
			setState(507); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(506);
					catchSect();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(509); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TryBlockContext extends ParserRuleContext {
		public List<ReturnSectContext> returnSect() {
			return getRuleContexts(ReturnSectContext.class);
		}
		public ReturnSectContext returnSect(int i) {
			return getRuleContext(ReturnSectContext.class,i);
		}
		public TryBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterTryBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitTryBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitTryBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryBlockContext tryBlock() throws RecognitionException {
		TryBlockContext _localctx = new TryBlockContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_tryBlock);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(515);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					setState(513);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
					case 1:
						{
						setState(511);
						returnSect();
						}
						break;
					case 2:
						{
						setState(512);
						matchWildcard();
						}
						break;
					}
					} 
				}
				setState(517);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CatchSectContext extends ParserRuleContext {
		public CatchBlockContext catchBlock() {
			return getRuleContext(CatchBlockContext.class,0);
		}
		public CatchSectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchSect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterCatchSect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitCatchSect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitCatchSect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchSectContext catchSect() throws RecognitionException {
		CatchSectContext _localctx = new CatchSectContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_catchSect);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
			match(T__33);
			setState(519);
			match(T__12);
			setState(523);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(520);
					matchWildcard();
					}
					} 
				}
				setState(525);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			}
			setState(526);
			match(T__13);
			setState(527);
			match(T__21);
			setState(528);
			catchBlock();
			setState(529);
			match(T__22);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CatchBlockContext extends ParserRuleContext {
		public List<ReturnSectContext> returnSect() {
			return getRuleContexts(ReturnSectContext.class);
		}
		public ReturnSectContext returnSect(int i) {
			return getRuleContext(ReturnSectContext.class,i);
		}
		public CatchBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterCatchBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitCatchBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitCatchBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchBlockContext catchBlock() throws RecognitionException {
		CatchBlockContext _localctx = new CatchBlockContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_catchBlock);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(535);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					setState(533);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
					case 1:
						{
						setState(531);
						returnSect();
						}
						break;
					case 2:
						{
						setState(532);
						matchWildcard();
						}
						break;
					}
					} 
				}
				setState(537);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnSectContext extends ParserRuleContext {
		public ReturnBlockContext returnBlock() {
			return getRuleContext(ReturnBlockContext.class,0);
		}
		public ReturnSectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnSect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterReturnSect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitReturnSect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitReturnSect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnSectContext returnSect() throws RecognitionException {
		ReturnSectContext _localctx = new ReturnSectContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_returnSect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(538);
			match(T__34);
			setState(539);
			returnBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnBlockContext extends ParserRuleContext {
		public ReturnBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterReturnBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitReturnBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitReturnBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnBlockContext returnBlock() throws RecognitionException {
		ReturnBlockContext _localctx = new ReturnBlockContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_returnBlock);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(544);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(541);
					matchWildcard();
					}
					} 
				}
				setState(546);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			}
			setState(547);
			match(T__15);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001*\u0226\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0005\u0002U\b\u0002\n\u0002\f\u0002X\t\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002_\b\u0002\n\u0002\f\u0002"+
		"b\t\u0002\u0001\u0002\u0003\u0002e\b\u0002\u0001\u0003\u0003\u0003h\b"+
		"\u0003\u0001\u0003\u0005\u0003k\b\u0003\n\u0003\f\u0003n\t\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006{\b"+
		"\u0006\n\u0006\f\u0006~\t\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0005\b\u0084\b\b\n\b\f\b\u0087\t\b\u0001\b\u0001\b\u0001\t\u0001\t"+
		"\u0001\n\u0001\n\u0001\n\u0005\n\u0090\b\n\n\n\f\n\u0093\t\n\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\f\u0005\f\u009a\b\f\n\f\f\f\u009d\t\f"+
		"\u0001\f\u0005\f\u00a0\b\f\n\f\f\f\u00a3\t\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0005\f\u00ab\b\f\n\f\f\f\u00ae\t\f\u0001\f\u0001\f"+
		"\u0001\f\u0005\f\u00b3\b\f\n\f\f\f\u00b6\t\f\u0001\f\u0005\f\u00b9\b\f"+
		"\n\f\f\f\u00bc\t\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005"+
		"\f\u00c4\b\f\n\f\f\f\u00c7\t\f\u0001\f\u0001\f\u0001\f\u0005\f\u00cc\b"+
		"\f\n\f\f\f\u00cf\t\f\u0001\f\u0005\f\u00d2\b\f\n\f\f\f\u00d5\t\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0005\f\u00db\b\f\n\f\f\f\u00de\t\f\u0001\f"+
		"\u0001\f\u0003\f\u00e2\b\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0005\u000e\u00e9\b\u000e\n\u000e\f\u000e\u00ec\t\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u00f2\b\u000e\n\u000e"+
		"\f\u000e\u00f5\t\u000e\u0001\u000e\u0005\u000e\u00f8\b\u000e\n\u000e\f"+
		"\u000e\u00fb\t\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0100"+
		"\b\u000f\u0001\u0010\u0005\u0010\u0103\b\u0010\n\u0010\f\u0010\u0106\t"+
		"\u0010\u0001\u0010\u0005\u0010\u0109\b\u0010\n\u0010\f\u0010\u010c\t\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0111\b\u0010\u0001\u0010"+
		"\u0005\u0010\u0114\b\u0010\n\u0010\f\u0010\u0117\t\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0003\u0010\u011c\b\u0010\u0001\u0010\u0003\u0010\u011f"+
		"\b\u0010\u0005\u0010\u0121\b\u0010\n\u0010\f\u0010\u0124\t\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u0129\b\u0010\n\u0010\f\u0010"+
		"\u012c\t\u0010\u0001\u0010\u0005\u0010\u012f\b\u0010\n\u0010\f\u0010\u0132"+
		"\t\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0136\b\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0005\u0010\u013b\b\u0010\n\u0010\f\u0010\u013e"+
		"\t\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0142\b\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0005\u0011\u0147\b\u0011\n\u0011\f\u0011\u014a"+
		"\t\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0005\u0011\u0152\b\u0011\n\u0011\f\u0011\u0155\t\u0011\u0001\u0011"+
		"\u0003\u0011\u0158\b\u0011\u0001\u0012\u0003\u0012\u015b\b\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u0161\b\u0013\n"+
		"\u0013\f\u0013\u0164\t\u0013\u0003\u0013\u0166\b\u0013\u0001\u0014\u0005"+
		"\u0014\u0169\b\u0014\n\u0014\f\u0014\u016c\t\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0003\u0014\u0171\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u0179\b\u0014\u0001\u0015"+
		"\u0005\u0015\u017c\b\u0015\n\u0015\f\u0015\u017f\t\u0015\u0001\u0016\u0005"+
		"\u0016\u0182\b\u0016\n\u0016\f\u0016\u0185\t\u0016\u0001\u0017\u0005\u0017"+
		"\u0188\b\u0017\n\u0017\f\u0017\u018b\t\u0017\u0001\u0017\u0005\u0017\u018e"+
		"\b\u0017\n\u0017\f\u0017\u0191\t\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u0199\b\u0017\n\u0017"+
		"\f\u0017\u019c\t\u0017\u0003\u0017\u019e\b\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0003\u0017\u01a3\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0003\u0017\u01aa\b\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0005\u0018\u01af\b\u0018\n\u0018\f\u0018\u01b2\t\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0005"+
		"\u0018\u01ba\b\u0018\n\u0018\f\u0018\u01bd\t\u0018\u0001\u0018\u0003\u0018"+
		"\u01c0\b\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0005\u001a\u01c7\b\u001a\n\u001a\f\u001a\u01ca\t\u001a\u0001\u001b\u0005"+
		"\u001b\u01cd\b\u001b\n\u001b\f\u001b\u01d0\t\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0003\u001b\u01d5\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0005\u001c\u01da\b\u001c\n\u001c\f\u001c\u01dd\t\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u01e5"+
		"\b\u001c\n\u001c\f\u001c\u01e8\t\u001c\u0001\u001c\u0003\u001c\u01eb\b"+
		"\u001c\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0005"+
		"\u001e\u01f2\b\u001e\n\u001e\f\u001e\u01f5\t\u001e\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0004\u001f\u01fc\b\u001f\u000b\u001f"+
		"\f\u001f\u01fd\u0001 \u0001 \u0005 \u0202\b \n \f \u0205\t \u0001!\u0001"+
		"!\u0001!\u0005!\u020a\b!\n!\f!\u020d\t!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001\"\u0001\"\u0005\"\u0216\b\"\n\"\f\"\u0219\t\"\u0001#\u0001#\u0001"+
		"#\u0001$\u0005$\u021f\b$\n$\f$\u0222\t$\u0001$\u0001$\u0001$\u0012V`|"+
		"\u0085\u0091\u0104\u0115\u012a\u0148\u0153\u0162\u017d\u0189\u01f3\u0203"+
		"\u020b\u0217\u0220\u0000%\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFH\u0000\u0003"+
		"\u0001\u0000\u0001\t\u0002\u0000\u0010\u0010\u0013\u0013\u0002\u0000\u001b"+
		"\u001b\u001d\u001d\u024f\u0000J\u0001\u0000\u0000\u0000\u0002L\u0001\u0000"+
		"\u0000\u0000\u0004d\u0001\u0000\u0000\u0000\u0006g\u0001\u0000\u0000\u0000"+
		"\bq\u0001\u0000\u0000\u0000\nu\u0001\u0000\u0000\u0000\fw\u0001\u0000"+
		"\u0000\u0000\u000e\u007f\u0001\u0000\u0000\u0000\u0010\u0081\u0001\u0000"+
		"\u0000\u0000\u0012\u008a\u0001\u0000\u0000\u0000\u0014\u008c\u0001\u0000"+
		"\u0000\u0000\u0016\u0096\u0001\u0000\u0000\u0000\u0018\u00e1\u0001\u0000"+
		"\u0000\u0000\u001a\u00e3\u0001\u0000\u0000\u0000\u001c\u00e5\u0001\u0000"+
		"\u0000\u0000\u001e\u00ff\u0001\u0000\u0000\u0000 \u0141\u0001\u0000\u0000"+
		"\u0000\"\u0143\u0001\u0000\u0000\u0000$\u015a\u0001\u0000\u0000\u0000"+
		"&\u0165\u0001\u0000\u0000\u0000(\u016a\u0001\u0000\u0000\u0000*\u017d"+
		"\u0001\u0000\u0000\u0000,\u0183\u0001\u0000\u0000\u0000.\u0189\u0001\u0000"+
		"\u0000\u00000\u01ab\u0001\u0000\u0000\u00002\u01c1\u0001\u0000\u0000\u0000"+
		"4\u01c3\u0001\u0000\u0000\u00006\u01ce\u0001\u0000\u0000\u00008\u01d6"+
		"\u0001\u0000\u0000\u0000:\u01ec\u0001\u0000\u0000\u0000<\u01f3\u0001\u0000"+
		"\u0000\u0000>\u01f6\u0001\u0000\u0000\u0000@\u0203\u0001\u0000\u0000\u0000"+
		"B\u0206\u0001\u0000\u0000\u0000D\u0217\u0001\u0000\u0000\u0000F\u021a"+
		"\u0001\u0000\u0000\u0000H\u0220\u0001\u0000\u0000\u0000JK\u0007\u0000"+
		"\u0000\u0000K\u0001\u0001\u0000\u0000\u0000LM\u0003\u0004\u0002\u0000"+
		"M\u0003\u0001\u0000\u0000\u0000NO\u0005\n\u0000\u0000Oe\u0005$\u0000\u0000"+
		"PQ\u0005\n\u0000\u0000QR\u0005$\u0000\u0000RV\u0005\u000b\u0000\u0000"+
		"SU\t\u0000\u0000\u0000TS\u0001\u0000\u0000\u0000UX\u0001\u0000\u0000\u0000"+
		"VW\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000WY\u0001\u0000\u0000"+
		"\u0000XV\u0001\u0000\u0000\u0000Ye\u0005\f\u0000\u0000Z[\u0005\n\u0000"+
		"\u0000[\\\u0005$\u0000\u0000\\`\u0005\r\u0000\u0000]_\t\u0000\u0000\u0000"+
		"^]\u0001\u0000\u0000\u0000_b\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000"+
		"\u0000`^\u0001\u0000\u0000\u0000ac\u0001\u0000\u0000\u0000b`\u0001\u0000"+
		"\u0000\u0000ce\u0005\u000e\u0000\u0000dN\u0001\u0000\u0000\u0000dP\u0001"+
		"\u0000\u0000\u0000dZ\u0001\u0000\u0000\u0000e\u0005\u0001\u0000\u0000"+
		"\u0000fh\u0003\b\u0004\u0000gf\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000"+
		"\u0000hl\u0001\u0000\u0000\u0000ik\u0003\u0010\b\u0000ji\u0001\u0000\u0000"+
		"\u0000kn\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000lm\u0001\u0000"+
		"\u0000\u0000mo\u0001\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000op\u0003"+
		"\u0018\f\u0000p\u0007\u0001\u0000\u0000\u0000qr\u0005\u000f\u0000\u0000"+
		"rs\u0003\n\u0005\u0000st\u0005\u0010\u0000\u0000t\t\u0001\u0000\u0000"+
		"\u0000uv\u0003\f\u0006\u0000v\u000b\u0001\u0000\u0000\u0000w|\u0005$\u0000"+
		"\u0000xy\u0005\u0011\u0000\u0000y{\u0003\u000e\u0007\u0000zx\u0001\u0000"+
		"\u0000\u0000{~\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000|z\u0001"+
		"\u0000\u0000\u0000}\r\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000"+
		"\u007f\u0080\u0005$\u0000\u0000\u0080\u000f\u0001\u0000\u0000\u0000\u0081"+
		"\u0085\u0005\u0012\u0000\u0000\u0082\u0084\u0003\u0000\u0000\u0000\u0083"+
		"\u0082\u0001\u0000\u0000\u0000\u0084\u0087\u0001\u0000\u0000\u0000\u0085"+
		"\u0086\u0001\u0000\u0000\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0086"+
		"\u0088\u0001\u0000\u0000\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0088"+
		"\u0089\u0003\u0012\t\u0000\u0089\u0011\u0001\u0000\u0000\u0000\u008a\u008b"+
		"\u0003\u0014\n\u0000\u008b\u0013\u0001\u0000\u0000\u0000\u008c\u0091\u0005"+
		"$\u0000\u0000\u008d\u008e\u0005\u0011\u0000\u0000\u008e\u0090\u0003\u0016"+
		"\u000b\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u0090\u0093\u0001\u0000"+
		"\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0091\u008f\u0001\u0000"+
		"\u0000\u0000\u0092\u0094\u0001\u0000\u0000\u0000\u0093\u0091\u0001\u0000"+
		"\u0000\u0000\u0094\u0095\u0007\u0001\u0000\u0000\u0095\u0015\u0001\u0000"+
		"\u0000\u0000\u0096\u0097\u0005$\u0000\u0000\u0097\u0017\u0001\u0000\u0000"+
		"\u0000\u0098\u009a\u0003\u0002\u0001\u0000\u0099\u0098\u0001\u0000\u0000"+
		"\u0000\u009a\u009d\u0001\u0000\u0000\u0000\u009b\u0099\u0001\u0000\u0000"+
		"\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u00a1\u0001\u0000\u0000"+
		"\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009e\u00a0\u0003\u0000\u0000"+
		"\u0000\u009f\u009e\u0001\u0000\u0000\u0000\u00a0\u00a3\u0001\u0000\u0000"+
		"\u0000\u00a1\u009f\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000"+
		"\u0000\u00a2\u00a4\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000"+
		"\u0000\u00a4\u00a5\u0005\u0014\u0000\u0000\u00a5\u00a6\u0003\u001a\r\u0000"+
		"\u00a6\u00a7\u0005\u0015\u0000\u0000\u00a7\u00a8\u0003\u001c\u000e\u0000"+
		"\u00a8\u00ac\u0005\u0016\u0000\u0000\u00a9\u00ab\u0003\u001e\u000f\u0000"+
		"\u00aa\u00a9\u0001\u0000\u0000\u0000\u00ab\u00ae\u0001\u0000\u0000\u0000"+
		"\u00ac\u00aa\u0001\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000"+
		"\u00ad\u00af\u0001\u0000\u0000\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000"+
		"\u00af\u00b0\u0005\u0017\u0000\u0000\u00b0\u00e2\u0001\u0000\u0000\u0000"+
		"\u00b1\u00b3\u0003\u0002\u0001\u0000\u00b2\u00b1\u0001\u0000\u0000\u0000"+
		"\u00b3\u00b6\u0001\u0000\u0000\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000"+
		"\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5\u00ba\u0001\u0000\u0000\u0000"+
		"\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b7\u00b9\u0003\u0000\u0000\u0000"+
		"\u00b8\u00b7\u0001\u0000\u0000\u0000\u00b9\u00bc\u0001\u0000\u0000\u0000"+
		"\u00ba\u00b8\u0001\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000\u0000"+
		"\u00bb\u00bd\u0001\u0000\u0000\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000"+
		"\u00bd\u00be\u0005\u0014\u0000\u0000\u00be\u00bf\u0003\u001a\r\u0000\u00bf"+
		"\u00c0\u0005\u0018\u0000\u0000\u00c0\u00c1\u0003\u001c\u000e\u0000\u00c1"+
		"\u00c5\u0005\u0016\u0000\u0000\u00c2\u00c4\u0003\u001e\u000f\u0000\u00c3"+
		"\u00c2\u0001\u0000\u0000\u0000\u00c4\u00c7\u0001\u0000\u0000\u0000\u00c5"+
		"\u00c3\u0001\u0000\u0000\u0000\u00c5\u00c6\u0001\u0000\u0000\u0000\u00c6"+
		"\u00c8\u0001\u0000\u0000\u0000\u00c7\u00c5\u0001\u0000\u0000\u0000\u00c8"+
		"\u00c9\u0005\u0017\u0000\u0000\u00c9\u00e2\u0001\u0000\u0000\u0000\u00ca"+
		"\u00cc\u0003\u0002\u0001\u0000\u00cb\u00ca\u0001\u0000\u0000\u0000\u00cc"+
		"\u00cf\u0001\u0000\u0000\u0000\u00cd\u00cb\u0001\u0000\u0000\u0000\u00cd"+
		"\u00ce\u0001\u0000\u0000\u0000\u00ce\u00d3\u0001\u0000\u0000\u0000\u00cf"+
		"\u00cd\u0001\u0000\u0000\u0000\u00d0\u00d2\u0003\u0000\u0000\u0000\u00d1"+
		"\u00d0\u0001\u0000\u0000\u0000\u00d2\u00d5\u0001\u0000\u0000\u0000\u00d3"+
		"\u00d1\u0001\u0000\u0000\u0000\u00d3\u00d4\u0001\u0000\u0000\u0000\u00d4"+
		"\u00d6\u0001\u0000\u0000\u0000\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d6"+
		"\u00d7\u0005\u0014\u0000\u0000\u00d7\u00d8\u0003\u001a\r\u0000\u00d8\u00dc"+
		"\u0005\u0016\u0000\u0000\u00d9\u00db\u0003\u001e\u000f\u0000\u00da\u00d9"+
		"\u0001\u0000\u0000\u0000\u00db\u00de\u0001\u0000\u0000\u0000\u00dc\u00da"+
		"\u0001\u0000\u0000\u0000\u00dc\u00dd\u0001\u0000\u0000\u0000\u00dd\u00df"+
		"\u0001\u0000\u0000\u0000\u00de\u00dc\u0001\u0000\u0000\u0000\u00df\u00e0"+
		"\u0005\u0017\u0000\u0000\u00e0\u00e2\u0001\u0000\u0000\u0000\u00e1\u009b"+
		"\u0001\u0000\u0000\u0000\u00e1\u00b4\u0001\u0000\u0000\u0000\u00e1\u00cd"+
		"\u0001\u0000\u0000\u0000\u00e2\u0019\u0001\u0000\u0000\u0000\u00e3\u00e4"+
		"\u0005$\u0000\u0000\u00e4\u001b\u0001\u0000\u0000\u0000\u00e5\u00ea\u0005"+
		"$\u0000\u0000\u00e6\u00e7\u0005\u0011\u0000\u0000\u00e7\u00e9\u0005$\u0000"+
		"\u0000\u00e8\u00e6\u0001\u0000\u0000\u0000\u00e9\u00ec\u0001\u0000\u0000"+
		"\u0000\u00ea\u00e8\u0001\u0000\u0000\u0000\u00ea\u00eb\u0001\u0000\u0000"+
		"\u0000\u00eb\u00f9\u0001\u0000\u0000\u0000\u00ec\u00ea\u0001\u0000\u0000"+
		"\u0000\u00ed\u00ee\u0005\u0019\u0000\u0000\u00ee\u00f3\u0005$\u0000\u0000"+
		"\u00ef\u00f0\u0005\u0011\u0000\u0000\u00f0\u00f2\u0005$\u0000\u0000\u00f1"+
		"\u00ef\u0001\u0000\u0000\u0000\u00f2\u00f5\u0001\u0000\u0000\u0000\u00f3"+
		"\u00f1\u0001\u0000\u0000\u0000\u00f3\u00f4\u0001\u0000\u0000\u0000\u00f4"+
		"\u00f6\u0001\u0000\u0000\u0000\u00f5\u00f3\u0001\u0000\u0000\u0000\u00f6"+
		"\u00f8\u0005\u001a\u0000\u0000\u00f7\u00ed\u0001\u0000\u0000\u0000\u00f8"+
		"\u00fb\u0001\u0000\u0000\u0000\u00f9\u00f7\u0001\u0000\u0000\u0000\u00f9"+
		"\u00fa\u0001\u0000\u0000\u0000\u00fa\u001d\u0001\u0000\u0000\u0000\u00fb"+
		"\u00f9\u0001\u0000\u0000\u0000\u00fc\u0100\u0003 \u0010\u0000\u00fd\u0100"+
		"\u0003(\u0014\u0000\u00fe\u0100\u0003.\u0017\u0000\u00ff\u00fc\u0001\u0000"+
		"\u0000\u0000\u00ff\u00fd\u0001\u0000\u0000\u0000\u00ff\u00fe\u0001\u0000"+
		"\u0000\u0000\u0100\u001f\u0001\u0000\u0000\u0000\u0101\u0103\u0003\u0002"+
		"\u0001\u0000\u0102\u0101\u0001\u0000\u0000\u0000\u0103\u0106\u0001\u0000"+
		"\u0000\u0000\u0104\u0105\u0001\u0000\u0000\u0000\u0104\u0102\u0001\u0000"+
		"\u0000\u0000\u0105\u010a\u0001\u0000\u0000\u0000\u0106\u0104\u0001\u0000"+
		"\u0000\u0000\u0107\u0109\u0003\u0000\u0000\u0000\u0108\u0107\u0001\u0000"+
		"\u0000\u0000\u0109\u010c\u0001\u0000\u0000\u0000\u010a\u0108\u0001\u0000"+
		"\u0000\u0000\u010a\u010b\u0001\u0000\u0000\u0000\u010b\u010d\u0001\u0000"+
		"\u0000\u0000\u010c\u010a\u0001\u0000\u0000\u0000\u010d\u010e\u0003\"\u0011"+
		"\u0000\u010e\u0110\u0003$\u0012\u0000\u010f\u0111\u0005\u001b\u0000\u0000"+
		"\u0110\u010f\u0001\u0000\u0000\u0000\u0110\u0111\u0001\u0000\u0000\u0000"+
		"\u0111\u0115\u0001\u0000\u0000\u0000\u0112\u0114\u0003&\u0013\u0000\u0113"+
		"\u0112\u0001\u0000\u0000\u0000\u0114\u0117\u0001\u0000\u0000\u0000\u0115"+
		"\u0116\u0001\u0000\u0000\u0000\u0115\u0113\u0001\u0000\u0000\u0000\u0116"+
		"\u0122\u0001\u0000\u0000\u0000\u0117\u0115\u0001\u0000\u0000\u0000\u0118"+
		"\u0119\u0005\u001c\u0000\u0000\u0119\u011b\u0003$\u0012\u0000\u011a\u011c"+
		"\u0005\u001b\u0000\u0000\u011b\u011a\u0001\u0000\u0000\u0000\u011b\u011c"+
		"\u0001\u0000\u0000\u0000\u011c\u011e\u0001\u0000\u0000\u0000\u011d\u011f"+
		"\u0003&\u0013\u0000\u011e\u011d\u0001\u0000\u0000\u0000\u011e\u011f\u0001"+
		"\u0000\u0000\u0000\u011f\u0121\u0001\u0000\u0000\u0000\u0120\u0118\u0001"+
		"\u0000\u0000\u0000\u0121\u0124\u0001\u0000\u0000\u0000\u0122\u0120\u0001"+
		"\u0000\u0000\u0000\u0122\u0123\u0001\u0000\u0000\u0000\u0123\u0125\u0001"+
		"\u0000\u0000\u0000\u0124\u0122\u0001\u0000\u0000\u0000\u0125\u0126\u0005"+
		"\u0010\u0000\u0000\u0126\u0142\u0001\u0000\u0000\u0000\u0127\u0129\u0003"+
		"\u0002\u0001\u0000\u0128\u0127\u0001\u0000\u0000\u0000\u0129\u012c\u0001"+
		"\u0000\u0000\u0000\u012a\u012b\u0001\u0000\u0000\u0000\u012a\u0128\u0001"+
		"\u0000\u0000\u0000\u012b\u0130\u0001\u0000\u0000\u0000\u012c\u012a\u0001"+
		"\u0000\u0000\u0000\u012d\u012f\u0003\u0000\u0000\u0000\u012e\u012d\u0001"+
		"\u0000\u0000\u0000\u012f\u0132\u0001\u0000\u0000\u0000\u0130\u012e\u0001"+
		"\u0000\u0000\u0000\u0130\u0131\u0001\u0000\u0000\u0000\u0131\u0133\u0001"+
		"\u0000\u0000\u0000\u0132\u0130\u0001\u0000\u0000\u0000\u0133\u0135\u0003"+
		"\"\u0011\u0000\u0134\u0136\u0005\u001b\u0000\u0000\u0135\u0134\u0001\u0000"+
		"\u0000\u0000\u0135\u0136\u0001\u0000\u0000\u0000\u0136\u0137\u0001\u0000"+
		"\u0000\u0000\u0137\u013c\u0003$\u0012\u0000\u0138\u0139\u0005\u001c\u0000"+
		"\u0000\u0139\u013b\u0003$\u0012\u0000\u013a\u0138\u0001\u0000\u0000\u0000"+
		"\u013b\u013e\u0001\u0000\u0000\u0000\u013c\u013a\u0001\u0000\u0000\u0000"+
		"\u013c\u013d\u0001\u0000\u0000\u0000\u013d\u013f\u0001\u0000\u0000\u0000"+
		"\u013e\u013c\u0001\u0000\u0000\u0000\u013f\u0140\u0005\u0010\u0000\u0000"+
		"\u0140\u0142\u0001\u0000\u0000\u0000\u0141\u0104\u0001\u0000\u0000\u0000"+
		"\u0141\u012a\u0001\u0000\u0000\u0000\u0142!\u0001\u0000\u0000\u0000\u0143"+
		"\u0148\u0005$\u0000\u0000\u0144\u0145\u0005\u0011\u0000\u0000\u0145\u0147"+
		"\u0005$\u0000\u0000\u0146\u0144\u0001\u0000\u0000\u0000\u0147\u014a\u0001"+
		"\u0000\u0000\u0000\u0148\u0149\u0001\u0000\u0000\u0000\u0148\u0146\u0001"+
		"\u0000\u0000\u0000\u0149\u0157\u0001\u0000\u0000\u0000\u014a\u0148\u0001"+
		"\u0000\u0000\u0000\u014b\u0158\u0005\u001b\u0000\u0000\u014c\u0158\u0005"+
		"\u001d\u0000\u0000\u014d\u014e\u0005\u0019\u0000\u0000\u014e\u0153\u0005"+
		"$\u0000\u0000\u014f\u0150\u0005\u001c\u0000\u0000\u0150\u0152\u0005$\u0000"+
		"\u0000\u0151\u014f\u0001\u0000\u0000\u0000\u0152\u0155\u0001\u0000\u0000"+
		"\u0000\u0153\u0154\u0001\u0000\u0000\u0000\u0153\u0151\u0001\u0000\u0000"+
		"\u0000\u0154\u0156\u0001\u0000\u0000\u0000\u0155\u0153\u0001\u0000\u0000"+
		"\u0000\u0156\u0158\u0005\u001a\u0000\u0000\u0157\u014b\u0001\u0000\u0000"+
		"\u0000\u0157\u014c\u0001\u0000\u0000\u0000\u0157\u014d\u0001\u0000\u0000"+
		"\u0000\u0157\u0158\u0001\u0000\u0000\u0000\u0158#\u0001\u0000\u0000\u0000"+
		"\u0159\u015b\u0005$\u0000\u0000\u015a\u0159\u0001\u0000\u0000\u0000\u015a"+
		"\u015b\u0001\u0000\u0000\u0000\u015b%\u0001\u0000\u0000\u0000\u015c\u015d"+
		"\u0005\u001e\u0000\u0000\u015d\u0166\u0005&\u0000\u0000\u015e\u0162\u0005"+
		"\u001e\u0000\u0000\u015f\u0161\t\u0000\u0000\u0000\u0160\u015f\u0001\u0000"+
		"\u0000\u0000\u0161\u0164\u0001\u0000\u0000\u0000\u0162\u0163\u0001\u0000"+
		"\u0000\u0000\u0162\u0160\u0001\u0000\u0000\u0000\u0163\u0166\u0001\u0000"+
		"\u0000\u0000\u0164\u0162\u0001\u0000\u0000\u0000\u0165\u015c\u0001\u0000"+
		"\u0000\u0000\u0165\u015e\u0001\u0000\u0000\u0000\u0166\'\u0001\u0000\u0000"+
		"\u0000\u0167\u0169\u0003\u0000\u0000\u0000\u0168\u0167\u0001\u0000\u0000"+
		"\u0000\u0169\u016c\u0001\u0000\u0000\u0000\u016a\u0168\u0001\u0000\u0000"+
		"\u0000\u016a\u016b\u0001\u0000\u0000\u0000\u016b\u016d\u0001\u0000\u0000"+
		"\u0000\u016c\u016a\u0001\u0000\u0000\u0000\u016d\u016e\u0003\u001a\r\u0000"+
		"\u016e\u0170\u0005\r\u0000\u0000\u016f\u0171\u00034\u001a\u0000\u0170"+
		"\u016f\u0001\u0000\u0000\u0000\u0170\u0171\u0001\u0000\u0000\u0000\u0171"+
		"\u0172\u0001\u0000\u0000\u0000\u0172\u0178\u0005\u000e\u0000\u0000\u0173"+
		"\u0174\u0005\u0016\u0000\u0000\u0174\u0175\u0003*\u0015\u0000\u0175\u0176"+
		"\u0005\u0017\u0000\u0000\u0176\u0179\u0001\u0000\u0000\u0000\u0177\u0179"+
		"\u0005\u001f\u0000\u0000\u0178\u0173\u0001\u0000\u0000\u0000\u0178\u0177"+
		"\u0001\u0000\u0000\u0000\u0179)\u0001\u0000\u0000\u0000\u017a\u017c\t"+
		"\u0000\u0000\u0000\u017b\u017a\u0001\u0000\u0000\u0000\u017c\u017f\u0001"+
		"\u0000\u0000\u0000\u017d\u017e\u0001\u0000\u0000\u0000\u017d\u017b\u0001"+
		"\u0000\u0000\u0000\u017e+\u0001\u0000\u0000\u0000\u017f\u017d\u0001\u0000"+
		"\u0000\u0000\u0180\u0182\u0003.\u0017\u0000\u0181\u0180\u0001\u0000\u0000"+
		"\u0000\u0182\u0185\u0001\u0000\u0000\u0000\u0183\u0181\u0001\u0000\u0000"+
		"\u0000\u0183\u0184\u0001\u0000\u0000\u0000\u0184-\u0001\u0000\u0000\u0000"+
		"\u0185\u0183\u0001\u0000\u0000\u0000\u0186\u0188\u0003\u0002\u0001\u0000"+
		"\u0187\u0186\u0001\u0000\u0000\u0000\u0188\u018b\u0001\u0000\u0000\u0000"+
		"\u0189\u018a\u0001\u0000\u0000\u0000\u0189\u0187\u0001\u0000\u0000\u0000"+
		"\u018a\u018f\u0001\u0000\u0000\u0000\u018b\u0189\u0001\u0000\u0000\u0000"+
		"\u018c\u018e\u0003\u0000\u0000\u0000\u018d\u018c\u0001\u0000\u0000\u0000"+
		"\u018e\u0191\u0001\u0000\u0000\u0000\u018f\u018d\u0001\u0000\u0000\u0000"+
		"\u018f\u0190\u0001\u0000\u0000\u0000\u0190\u0192\u0001\u0000\u0000\u0000"+
		"\u0191\u018f\u0001\u0000\u0000\u0000\u0192\u0193\u00030\u0018\u0000\u0193"+
		"\u0194\u00032\u0019\u0000\u0194\u019d\u0005\r\u0000\u0000\u0195\u019a"+
		"\u00036\u001b\u0000\u0196\u0197\u0005\u001c\u0000\u0000\u0197\u0199\u0003"+
		"6\u001b\u0000\u0198\u0196\u0001\u0000\u0000\u0000\u0199\u019c\u0001\u0000"+
		"\u0000\u0000\u019a\u0198\u0001\u0000\u0000\u0000\u019a\u019b\u0001\u0000"+
		"\u0000\u0000\u019b\u019e\u0001\u0000\u0000\u0000\u019c\u019a\u0001\u0000"+
		"\u0000\u0000\u019d\u0195\u0001\u0000\u0000\u0000\u019d\u019e\u0001\u0000"+
		"\u0000\u0000\u019e\u019f\u0001\u0000\u0000\u0000\u019f\u01a2\u0005\u000e"+
		"\u0000\u0000\u01a0\u01a1\u0005 \u0000\u0000\u01a1\u01a3\u0003:\u001d\u0000"+
		"\u01a2\u01a0\u0001\u0000\u0000\u0000\u01a2\u01a3\u0001\u0000\u0000\u0000"+
		"\u01a3\u01a9\u0001\u0000\u0000\u0000\u01a4\u01a5\u0005\u0016\u0000\u0000"+
		"\u01a5\u01a6\u0003<\u001e\u0000\u01a6\u01a7\u0005\u0017\u0000\u0000\u01a7"+
		"\u01aa\u0001\u0000\u0000\u0000\u01a8\u01aa\u0005\u001f\u0000\u0000\u01a9"+
		"\u01a4\u0001\u0000\u0000\u0000\u01a9\u01a8\u0001\u0000\u0000\u0000\u01aa"+
		"/\u0001\u0000\u0000\u0000\u01ab\u01b0\u0005$\u0000\u0000\u01ac\u01ad\u0005"+
		"\u0011\u0000\u0000\u01ad\u01af\u0005$\u0000\u0000\u01ae\u01ac\u0001\u0000"+
		"\u0000\u0000\u01af\u01b2\u0001\u0000\u0000\u0000\u01b0\u01ae\u0001\u0000"+
		"\u0000\u0000\u01b0\u01b1\u0001\u0000\u0000\u0000\u01b1\u01bf\u0001\u0000"+
		"\u0000\u0000\u01b2\u01b0\u0001\u0000\u0000\u0000\u01b3\u01c0\u0005\u001b"+
		"\u0000\u0000\u01b4\u01c0\u0005\u001d\u0000\u0000\u01b5\u01b6\u0005\u0019"+
		"\u0000\u0000\u01b6\u01bb\u0005$\u0000\u0000\u01b7\u01b8\u0005\u001c\u0000"+
		"\u0000\u01b8\u01ba\u0005$\u0000\u0000\u01b9\u01b7\u0001\u0000\u0000\u0000"+
		"\u01ba\u01bd\u0001\u0000\u0000\u0000\u01bb\u01b9\u0001\u0000\u0000\u0000"+
		"\u01bb\u01bc\u0001\u0000\u0000\u0000\u01bc\u01be\u0001\u0000\u0000\u0000"+
		"\u01bd\u01bb\u0001\u0000\u0000\u0000\u01be\u01c0\u0005\u001a\u0000\u0000"+
		"\u01bf\u01b3\u0001\u0000\u0000\u0000\u01bf\u01b4\u0001\u0000\u0000\u0000"+
		"\u01bf\u01b5\u0001\u0000\u0000\u0000\u01bf\u01c0\u0001\u0000\u0000\u0000"+
		"\u01c01\u0001\u0000\u0000\u0000\u01c1\u01c2\u0005$\u0000\u0000\u01c23"+
		"\u0001\u0000\u0000\u0000\u01c3\u01c8\u00036\u001b\u0000\u01c4\u01c5\u0005"+
		"\u001c\u0000\u0000\u01c5\u01c7\u00036\u001b\u0000\u01c6\u01c4\u0001\u0000"+
		"\u0000\u0000\u01c7\u01ca\u0001\u0000\u0000\u0000\u01c8\u01c6\u0001\u0000"+
		"\u0000\u0000\u01c8\u01c9\u0001\u0000\u0000\u0000\u01c95\u0001\u0000\u0000"+
		"\u0000\u01ca\u01c8\u0001\u0000\u0000\u0000\u01cb\u01cd\u0003\u0000\u0000"+
		"\u0000\u01cc\u01cb\u0001\u0000\u0000\u0000\u01cd\u01d0\u0001\u0000\u0000"+
		"\u0000\u01ce\u01cc\u0001\u0000\u0000\u0000\u01ce\u01cf\u0001\u0000\u0000"+
		"\u0000\u01cf\u01d1\u0001\u0000\u0000\u0000\u01d0\u01ce\u0001\u0000\u0000"+
		"\u0000\u01d1\u01d2\u00038\u001c\u0000\u01d2\u01d4\u0005$\u0000\u0000\u01d3"+
		"\u01d5\u0007\u0002\u0000\u0000\u01d4\u01d3\u0001\u0000\u0000\u0000\u01d4"+
		"\u01d5\u0001\u0000\u0000\u0000\u01d57\u0001\u0000\u0000\u0000\u01d6\u01db"+
		"\u0005$\u0000\u0000\u01d7\u01d8\u0005\u0011\u0000\u0000\u01d8\u01da\u0005"+
		"$\u0000\u0000\u01d9\u01d7\u0001\u0000\u0000\u0000\u01da\u01dd\u0001\u0000"+
		"\u0000\u0000\u01db\u01d9\u0001\u0000\u0000\u0000\u01db\u01dc\u0001\u0000"+
		"\u0000\u0000\u01dc\u01ea\u0001\u0000\u0000\u0000\u01dd\u01db\u0001\u0000"+
		"\u0000\u0000\u01de\u01eb\u0005\u001b\u0000\u0000\u01df\u01eb\u0005\u001d"+
		"\u0000\u0000\u01e0\u01e1\u0005\u0019\u0000\u0000\u01e1\u01e6\u0005$\u0000"+
		"\u0000\u01e2\u01e3\u0005\u001c\u0000\u0000\u01e3\u01e5\u0005$\u0000\u0000"+
		"\u01e4\u01e2\u0001\u0000\u0000\u0000\u01e5\u01e8\u0001\u0000\u0000\u0000"+
		"\u01e6\u01e4\u0001\u0000\u0000\u0000\u01e6\u01e7\u0001\u0000\u0000\u0000"+
		"\u01e7\u01e9\u0001\u0000\u0000\u0000\u01e8\u01e6\u0001\u0000\u0000\u0000"+
		"\u01e9\u01eb\u0005\u001a\u0000\u0000\u01ea\u01de\u0001\u0000\u0000\u0000"+
		"\u01ea\u01df\u0001\u0000\u0000\u0000\u01ea\u01e0\u0001\u0000\u0000\u0000"+
		"\u01ea\u01eb\u0001\u0000\u0000\u0000\u01eb9\u0001\u0000\u0000\u0000\u01ec"+
		"\u01ed\u0005$\u0000\u0000\u01ed;\u0001\u0000\u0000\u0000\u01ee\u01f2\u0003"+
		">\u001f\u0000\u01ef\u01f2\u0003F#\u0000\u01f0\u01f2\t\u0000\u0000\u0000"+
		"\u01f1\u01ee\u0001\u0000\u0000\u0000\u01f1\u01ef\u0001\u0000\u0000\u0000"+
		"\u01f1\u01f0\u0001\u0000\u0000\u0000\u01f2\u01f5\u0001\u0000\u0000\u0000"+
		"\u01f3\u01f4\u0001\u0000\u0000\u0000\u01f3\u01f1\u0001\u0000\u0000\u0000"+
		"\u01f4=\u0001\u0000\u0000\u0000\u01f5\u01f3\u0001\u0000\u0000\u0000\u01f6"+
		"\u01f7\u0005!\u0000\u0000\u01f7\u01f8\u0005\u0016\u0000\u0000\u01f8\u01f9"+
		"\u0003@ \u0000\u01f9\u01fb\u0005\u0017\u0000\u0000\u01fa\u01fc\u0003B"+
		"!\u0000\u01fb\u01fa\u0001\u0000\u0000\u0000\u01fc\u01fd\u0001\u0000\u0000"+
		"\u0000\u01fd\u01fb\u0001\u0000\u0000\u0000\u01fd\u01fe\u0001\u0000\u0000"+
		"\u0000\u01fe?\u0001\u0000\u0000\u0000\u01ff\u0202\u0003F#\u0000\u0200"+
		"\u0202\t\u0000\u0000\u0000\u0201\u01ff\u0001\u0000\u0000\u0000\u0201\u0200"+
		"\u0001\u0000\u0000\u0000\u0202\u0205\u0001\u0000\u0000\u0000\u0203\u0204"+
		"\u0001\u0000\u0000\u0000\u0203\u0201\u0001\u0000\u0000\u0000\u0204A\u0001"+
		"\u0000\u0000\u0000\u0205\u0203\u0001\u0000\u0000\u0000\u0206\u0207\u0005"+
		"\"\u0000\u0000\u0207\u020b\u0005\r\u0000\u0000\u0208\u020a\t\u0000\u0000"+
		"\u0000\u0209\u0208\u0001\u0000\u0000\u0000\u020a\u020d\u0001\u0000\u0000"+
		"\u0000\u020b\u020c\u0001\u0000\u0000\u0000\u020b\u0209\u0001\u0000\u0000"+
		"\u0000\u020c\u020e\u0001\u0000\u0000\u0000\u020d\u020b\u0001\u0000\u0000"+
		"\u0000\u020e\u020f\u0005\u000e\u0000\u0000\u020f\u0210\u0005\u0016\u0000"+
		"\u0000\u0210\u0211\u0003D\"\u0000\u0211\u0212\u0005\u0017\u0000\u0000"+
		"\u0212C\u0001\u0000\u0000\u0000\u0213\u0216\u0003F#\u0000\u0214\u0216"+
		"\t\u0000\u0000\u0000\u0215\u0213\u0001\u0000\u0000\u0000\u0215\u0214\u0001"+
		"\u0000\u0000\u0000\u0216\u0219\u0001\u0000\u0000\u0000\u0217\u0218\u0001"+
		"\u0000\u0000\u0000\u0217\u0215\u0001\u0000\u0000\u0000\u0218E\u0001\u0000"+
		"\u0000\u0000\u0219\u0217\u0001\u0000\u0000\u0000\u021a\u021b\u0005#\u0000"+
		"\u0000\u021b\u021c\u0003H$\u0000\u021cG\u0001\u0000\u0000\u0000\u021d"+
		"\u021f\t\u0000\u0000\u0000\u021e\u021d\u0001\u0000\u0000\u0000\u021f\u0222"+
		"\u0001\u0000\u0000\u0000\u0220\u0221\u0001\u0000\u0000\u0000\u0220\u021e"+
		"\u0001\u0000\u0000\u0000\u0221\u0223\u0001\u0000\u0000\u0000\u0222\u0220"+
		"\u0001\u0000\u0000\u0000\u0223\u0224\u0005\u0010\u0000\u0000\u0224I\u0001"+
		"\u0000\u0000\u0000EV`dgl|\u0085\u0091\u009b\u00a1\u00ac\u00b4\u00ba\u00c5"+
		"\u00cd\u00d3\u00dc\u00e1\u00ea\u00f3\u00f9\u00ff\u0104\u010a\u0110\u0115"+
		"\u011b\u011e\u0122\u012a\u0130\u0135\u013c\u0141\u0148\u0153\u0157\u015a"+
		"\u0162\u0165\u016a\u0170\u0178\u017d\u0183\u0189\u018f\u019a\u019d\u01a2"+
		"\u01a9\u01b0\u01bb\u01bf\u01c8\u01ce\u01d4\u01db\u01e6\u01ea\u01f1\u01f3"+
		"\u01fd\u0201\u0203\u020b\u0215\u0217\u0220";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}