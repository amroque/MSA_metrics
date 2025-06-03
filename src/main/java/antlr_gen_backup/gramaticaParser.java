// Generated from D:/OneDrive/Documentos/intelli/MSA/src/main/java/antlr_grammar/gramatica.g4 by ANTLR 4.13.1
package antlr_gen_backup;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

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
		T__31=32, ID=33, INT=34, STRING=35, CHAR=36, WS=37, COMMENT=38, ML_COMMENT=39;
	public static final int
		RULE_modifier = 0, RULE_anotations = 1, RULE_anotation = 2, RULE_apiGateway = 3, 
		RULE_packageDeclaration = 4, RULE_package = 5, RULE_packageName = 6, RULE_subPackage = 7, 
		RULE_importDeclaration = 8, RULE_importName = 9, RULE_importID = 10, RULE_subImport = 11, 
		RULE_apiClass = 12, RULE_className = 13, RULE_nameApi = 14, RULE_memberDeclaration = 15, 
		RULE_variableDeclaration = 16, RULE_variableDataType = 17, RULE_variable = 18, 
		RULE_value = 19, RULE_constructor = 20, RULE_methodDeclaration = 21, RULE_returnType = 22, 
		RULE_genericName = 23, RULE_parameterizedName = 24, RULE_methodName = 25, 
		RULE_parameters = 26, RULE_parameter = 27, RULE_exceptionName = 28, RULE_methodBody = 29;
	private static String[] makeRuleNames() {
		return new String[] {
			"modifier", "anotations", "anotation", "apiGateway", "packageDeclaration", 
			"package", "packageName", "subPackage", "importDeclaration", "importName", 
			"importID", "subImport", "apiClass", "className", "nameApi", "memberDeclaration", 
			"variableDeclaration", "variableDataType", "variable", "value", "constructor", 
			"methodDeclaration", "returnType", "genericName", "parameterizedName", 
			"methodName", "parameters", "parameter", "exceptionName", "methodBody"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'public'", "'private'", "'protected'", "'static'", "'final'", 
			"'abstract'", "'synchronized'", "'native'", "'@'", "'(\"'", "'\")'", 
			"'('", "')'", "'package'", "';'", "'.'", "'import'", "'.*;'", "'class'", 
			"'implements'", "'{'", "'}'", "'extends'", "'[]'", "','", "'<'", "'>'", 
			"'='", "'throws'", "'['", "']'", "'\"'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "ID", "INT", "STRING", 
			"CHAR", "WS", "COMMENT", "ML_COMMENT"
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
			if ( listener instanceof gramaticaListener) ((gramaticaListener)listener).enterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener) ((gramaticaListener)listener).exitModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor) return ((gramaticaVisitor<? extends T>)visitor).visitModifier(this);
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
			setState(60);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 510L) != 0)) ) {
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
			if ( listener instanceof gramaticaListener) ((gramaticaListener)listener).enterAnotations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener) ((gramaticaListener)listener).exitAnotations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor) return ((gramaticaVisitor<? extends T>)visitor).visitAnotations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnotationsContext anotations() throws RecognitionException {
		AnotationsContext _localctx = new AnotationsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_anotations);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
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
		public List<TerminalNode> ID() { return getTokens(gramaticaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(gramaticaParser.ID, i);
		}
		public AnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener) ((gramaticaListener)listener).enterAnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener) ((gramaticaListener)listener).exitAnotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor) return ((gramaticaVisitor<? extends T>)visitor).visitAnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnotationContext anotation() throws RecognitionException {
		AnotationContext _localctx = new AnotationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_anotation);
		try {
			int _alt;
			setState(81);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				match(T__8);
				setState(65);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
				match(T__8);
				setState(67);
				match(ID);
				setState(68);
				match(T__9);
				setState(69);
				match(ID);
				setState(70);
				match(T__10);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(71);
				match(T__8);
				setState(72);
				match(ID);
				setState(73);
				match(T__11);
				setState(77);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				while ( _alt!=1 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(74);
						matchWildcard();
						}
						} 
					}
					setState(79);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				}
				setState(80);
				match(T__12);
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
			if ( listener instanceof gramaticaListener) ((gramaticaListener)listener).enterApiGateway(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener) ((gramaticaListener)listener).exitApiGateway(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor) return ((gramaticaVisitor<? extends T>)visitor).visitApiGateway(this);
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
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(83);
				packageDeclaration();
				}
			}

			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__16) {
				{
				{
				setState(86);
				importDeclaration();
				}
				}
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(92);
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
			if ( listener instanceof gramaticaListener) ((gramaticaListener)listener).enterPackageDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener) ((gramaticaListener)listener).exitPackageDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor) return ((gramaticaVisitor<? extends T>)visitor).visitPackageDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageDeclarationContext packageDeclaration() throws RecognitionException {
		PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_packageDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(T__13);
			setState(95);
			package_();
			setState(96);
			match(T__14);
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
			if ( listener instanceof gramaticaListener) ((gramaticaListener)listener).enterPackage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener) ((gramaticaListener)listener).exitPackage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor) return ((gramaticaVisitor<? extends T>)visitor).visitPackage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageContext package_() throws RecognitionException {
		PackageContext _localctx = new PackageContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_package);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
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
			if ( listener instanceof gramaticaListener) ((gramaticaListener)listener).enterPackageName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener) ((gramaticaListener)listener).exitPackageName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor) return ((gramaticaVisitor<? extends T>)visitor).visitPackageName(this);
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
			setState(100);
			match(ID);
			setState(105);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=1 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(101);
					match(T__15);
					setState(102);
					subPackage();
					}
					} 
				}
				setState(107);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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
			if ( listener instanceof gramaticaListener) ((gramaticaListener)listener).enterSubPackage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener) ((gramaticaListener)listener).exitSubPackage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor) return ((gramaticaVisitor<? extends T>)visitor).visitSubPackage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubPackageContext subPackage() throws RecognitionException {
		SubPackageContext _localctx = new SubPackageContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_subPackage);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
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
			if ( listener instanceof gramaticaListener) ((gramaticaListener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener) ((gramaticaListener)listener).exitImportDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor) return ((gramaticaVisitor<? extends T>)visitor).visitImportDeclaration(this);
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
			setState(110);
			match(T__16);
			setState(114);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=1 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(111);
					modifier();
					}
					} 
				}
				setState(116);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(117);
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
			if ( listener instanceof gramaticaListener) ((gramaticaListener)listener).enterImportName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener) ((gramaticaListener)listener).exitImportName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor) return ((gramaticaVisitor<? extends T>)visitor).visitImportName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportNameContext importName() throws RecognitionException {
		ImportNameContext _localctx = new ImportNameContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_importName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
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
			if ( listener instanceof gramaticaListener) ((gramaticaListener)listener).enterImportID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener) ((gramaticaListener)listener).exitImportID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor) return ((gramaticaVisitor<? extends T>)visitor).visitImportID(this);
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
			setState(121);
			match(ID);
			setState(126);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=1 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(122);
					match(T__15);
					setState(123);
					subImport();
					}
					} 
				}
				setState(128);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(129);
			_la = _input.LA(1);
			if ( !(_la==T__14 || _la==T__17) ) {
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
			if ( listener instanceof gramaticaListener) ((gramaticaListener)listener).enterSubImport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener) ((gramaticaListener)listener).exitSubImport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor) return ((gramaticaVisitor<? extends T>)visitor).visitSubImport(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubImportContext subImport() throws RecognitionException {
		SubImportContext _localctx = new SubImportContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_subImport);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
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
		public NameApiContext nameApi() {
			return getRuleContext(NameApiContext.class,0);
		}
		public List<AnotationsContext> anotations() {
			return getRuleContexts(AnotationsContext.class);
		}
		public AnotationsContext anotations(int i) {
			return getRuleContext(AnotationsContext.class,i);
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
			if ( listener instanceof gramaticaListener) ((gramaticaListener)listener).enterApiClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener) ((gramaticaListener)listener).exitApiClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor) return ((gramaticaVisitor<? extends T>)visitor).visitApiClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ApiClassContext apiClass() throws RecognitionException {
		ApiClassContext _localctx = new ApiClassContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_apiClass);
		int _la;
		try {
			int _alt;
			setState(191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=1 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(133);
						anotations();
						}
						} 
					}
					setState(138);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				setState(139);
				match(T__0);
				setState(140);
				match(T__18);
				setState(141);
				className();
				setState(142);
				match(T__19);
				setState(143);
				nameApi();
				setState(144);
				match(T__20);
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8657044478L) != 0)) {
					{
					{
					setState(145);
					memberDeclaration();
					}
					}
					setState(150);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(151);
				match(T__21);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=1 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(153);
						anotations();
						}
						} 
					}
					setState(158);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				setState(159);
				match(T__0);
				setState(160);
				match(T__18);
				setState(161);
				className();
				setState(162);
				match(T__22);
				setState(163);
				nameApi();
				setState(164);
				match(T__20);
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8657044478L) != 0)) {
					{
					{
					setState(165);
					memberDeclaration();
					}
					}
					setState(170);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(171);
				match(T__21);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(176);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=1 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(173);
						anotations();
						}
						} 
					}
					setState(178);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				}
				setState(179);
				match(T__0);
				setState(180);
				match(T__18);
				setState(181);
				className();
				setState(182);
				match(T__20);
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8657044478L) != 0)) {
					{
					{
					setState(183);
					memberDeclaration();
					}
					}
					setState(188);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(189);
				match(T__21);
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
			if ( listener instanceof gramaticaListener) ((gramaticaListener)listener).enterClassName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener) ((gramaticaListener)listener).exitClassName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor) return ((gramaticaVisitor<? extends T>)visitor).visitClassName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassNameContext className() throws RecognitionException {
		ClassNameContext _localctx = new ClassNameContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_className);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
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
	public static class NameApiContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(gramaticaParser.ID, 0); }
		public NameApiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nameApi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener) ((gramaticaListener)listener).enterNameApi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener) ((gramaticaListener)listener).exitNameApi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor) return ((gramaticaVisitor<? extends T>)visitor).visitNameApi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameApiContext nameApi() throws RecognitionException {
		NameApiContext _localctx = new NameApiContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_nameApi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
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
			if ( listener instanceof gramaticaListener) ((gramaticaListener)listener).enterMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener) ((gramaticaListener)listener).exitMemberDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor) return ((gramaticaVisitor<? extends T>)visitor).visitMemberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberDeclarationContext memberDeclaration() throws RecognitionException {
		MemberDeclarationContext _localctx = new MemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_memberDeclaration);
		try {
			setState(200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				variableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
				constructor();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(199);
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
			if ( listener instanceof gramaticaListener) ((gramaticaListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener) ((gramaticaListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor) return ((gramaticaVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_variableDeclaration);
		int _la;
		try {
			int _alt;
			setState(266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				while ( _alt!=1 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(202);
						anotations();
						}
						} 
					}
					setState(207);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				}
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 510L) != 0)) {
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
				variableDataType();
				setState(215);
				variable();
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__23) {
					{
					setState(216);
					match(T__23);
					}
				}

				setState(222);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				while ( _alt!=1 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(219);
						value();
						}
						} 
					}
					setState(224);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				}
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__24) {
					{
					{
					setState(225);
					match(T__24);
					setState(226);
					variable();
					setState(228);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__23) {
						{
						setState(227);
						match(T__23);
						}
					}

					setState(231);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__27) {
						{
						setState(230);
						value();
						}
					}

					}
					}
					setState(237);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(238);
				match(T__14);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(243);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				while ( _alt!=1 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(240);
						anotations();
						}
						} 
					}
					setState(245);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				}
				setState(249);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 510L) != 0)) {
					{
					{
					setState(246);
					modifier();
					}
					}
					setState(251);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(252);
				variableDataType();
				setState(254);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__23) {
					{
					setState(253);
					match(T__23);
					}
				}

				setState(256);
				variable();
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__24) {
					{
					{
					setState(257);
					match(T__24);
					setState(258);
					variable();
					}
					}
					setState(263);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(264);
				match(T__14);
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
			if ( listener instanceof gramaticaListener) ((gramaticaListener)listener).enterVariableDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener) ((gramaticaListener)listener).exitVariableDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor) return ((gramaticaVisitor<? extends T>)visitor).visitVariableDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDataTypeContext variableDataType() throws RecognitionException {
		VariableDataTypeContext _localctx = new VariableDataTypeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_variableDataType);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(ID);
			setState(279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__25) {
				{
				setState(269);
				match(T__25);
				setState(270);
				match(ID);
				setState(275);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				while ( _alt!=1 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(271);
						match(T__24);
						setState(272);
						match(ID);
						}
						} 
					}
					setState(277);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				}
				setState(278);
				match(T__26);
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
	public static class VariableContext extends ParserRuleContext {
		public Token variableName;
		public TerminalNode ID() { return getToken(gramaticaParser.ID, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener) ((gramaticaListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener) ((gramaticaListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor) return ((gramaticaVisitor<? extends T>)visitor).visitVariable(this);
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
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(281);
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
			if ( listener instanceof gramaticaListener) ((gramaticaListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener) ((gramaticaListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor) return ((gramaticaVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_value);
		try {
			int _alt;
			setState(293);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(284);
				match(T__27);
				setState(285);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(286);
				match(T__27);
				setState(290);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				while ( _alt!=1 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(287);
						matchWildcard();
						}
						} 
					}
					setState(292);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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
		public Token constructorName;
		public ModifierContext modifier() {
			return getRuleContext(ModifierContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public TerminalNode ID() { return getToken(gramaticaParser.ID, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public ConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener) ((gramaticaListener)listener).enterConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener) ((gramaticaListener)listener).exitConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor) return ((gramaticaVisitor<? extends T>)visitor).visitConstructor(this);
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
			setState(295);
			modifier();
			setState(296);
			((ConstructorContext)_localctx).constructorName = match(ID);
			setState(297);
			match(T__11);
			setState(299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8589935102L) != 0)) {
				{
				setState(298);
				parameters();
				}
			}

			setState(301);
			match(T__12);
			setState(302);
			match(T__20);
			setState(303);
			methodBody();
			setState(304);
			match(T__21);
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
			if ( listener instanceof gramaticaListener) ((gramaticaListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener) ((gramaticaListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor) return ((gramaticaVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_methodDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=1 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(306);
					anotations();
					}
					} 
				}
				setState(311);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 510L) != 0)) {
				{
				{
				setState(312);
				modifier();
				}
				}
				setState(317);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(318);
			returnType();
			setState(319);
			methodName();
			setState(320);
			match(T__11);
			setState(329);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8589935102L) != 0)) {
				{
				setState(321);
				parameter();
				setState(326);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__24) {
					{
					{
					setState(322);
					match(T__24);
					setState(323);
					parameter();
					}
					}
					setState(328);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(331);
			match(T__12);
			setState(334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__28) {
				{
				setState(332);
				match(T__28);
				setState(333);
				exceptionName();
				}
			}

			setState(336);
			match(T__20);
			setState(337);
			methodBody();
			setState(338);
			match(T__21);
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
		public GenericNameContext genericName() {
			return getRuleContext(GenericNameContext.class,0);
		}
		public ParameterizedNameContext parameterizedName() {
			return getRuleContext(ParameterizedNameContext.class,0);
		}
		public ReturnTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener) ((gramaticaListener)listener).enterReturnType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener) ((gramaticaListener)listener).exitReturnType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor) return ((gramaticaVisitor<? extends T>)visitor).visitReturnType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnTypeContext returnType() throws RecognitionException {
		ReturnTypeContext _localctx = new ReturnTypeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_returnType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			genericName();
			setState(344);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__29:
				{
				setState(341);
				match(T__29);
				setState(342);
				match(T__30);
				}
				break;
			case T__25:
				{
				setState(343);
				parameterizedName();
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
	public static class GenericNameContext extends ParserRuleContext {
		public ParameterizedNameContext parameterizedName() {
			return getRuleContext(ParameterizedNameContext.class,0);
		}
		public TerminalNode ID() { return getToken(gramaticaParser.ID, 0); }
		public GenericNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener) ((gramaticaListener)listener).enterGenericName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener) ((gramaticaListener)listener).exitGenericName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor) return ((gramaticaVisitor<? extends T>)visitor).visitGenericName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericNameContext genericName() throws RecognitionException {
		GenericNameContext _localctx = new GenericNameContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_genericName);
		try {
			setState(348);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__25:
				enterOuterAlt(_localctx, 1);
				{
				setState(346);
				parameterizedName();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(347);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class ParameterizedNameContext extends ParserRuleContext {
		public List<GenericNameContext> genericName() {
			return getRuleContexts(GenericNameContext.class);
		}
		public GenericNameContext genericName(int i) {
			return getRuleContext(GenericNameContext.class,i);
		}
		public ParameterizedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterizedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener) ((gramaticaListener)listener).enterParameterizedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener) ((gramaticaListener)listener).exitParameterizedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor) return ((gramaticaVisitor<? extends T>)visitor).visitParameterizedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterizedNameContext parameterizedName() throws RecognitionException {
		ParameterizedNameContext _localctx = new ParameterizedNameContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_parameterizedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			match(T__25);
			setState(351);
			genericName();
			setState(356);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=1 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(352);
					match(T__24);
					setState(353);
					genericName();
					}
					} 
				}
				setState(358);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			}
			setState(359);
			match(T__26);
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
			if ( listener instanceof gramaticaListener) ((gramaticaListener)listener).enterMethodName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener) ((gramaticaListener)listener).exitMethodName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor) return ((gramaticaVisitor<? extends T>)visitor).visitMethodName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodNameContext methodName() throws RecognitionException {
		MethodNameContext _localctx = new MethodNameContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_methodName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
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
			if ( listener instanceof gramaticaListener) ((gramaticaListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener) ((gramaticaListener)listener).exitParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor) return ((gramaticaVisitor<? extends T>)visitor).visitParameters(this);
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
			setState(363);
			parameter();
			setState(368);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__24) {
				{
				{
				setState(364);
				match(T__24);
				setState(365);
				parameter();
				}
				}
				setState(370);
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
		public Token dataType;
		public Token paramName;
		public List<TerminalNode> ID() { return getTokens(gramaticaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(gramaticaParser.ID, i);
		}
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
			if ( listener instanceof gramaticaListener) ((gramaticaListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener) ((gramaticaListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor) return ((gramaticaVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_parameter);
		try {
			int _alt;
			setState(395);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(374);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
				while ( _alt!=1 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(371);
						modifier();
						}
						} 
					}
					setState(376);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
				}
				setState(377);
				((ParameterContext)_localctx).dataType = match(ID);
				setState(389);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__23:
					{
					setState(378);
					match(T__23);
					}
					break;
				case T__25:
					{
					setState(379);
					match(T__25);
					setState(380);
					match(ID);
					setState(385);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
					while ( _alt!=1 && _alt!= ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1+1 ) {
							{
							{
							setState(381);
							match(T__24);
							setState(382);
							match(ID);
							}
							} 
						}
						setState(387);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
					}
					setState(388);
					match(T__26);
					}
					break;
				case ID:
					break;
				default:
					break;
				}
				setState(391);
				((ParameterContext)_localctx).paramName = match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(392);
				((ParameterContext)_localctx).dataType = match(ID);
				setState(393);
				((ParameterContext)_localctx).paramName = match(ID);
				setState(394);
				match(T__23);
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
	public static class ExceptionNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(gramaticaParser.ID, 0); }
		public ExceptionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener) ((gramaticaListener)listener).enterExceptionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener) ((gramaticaListener)listener).exitExceptionName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor) return ((gramaticaVisitor<? extends T>)visitor).visitExceptionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExceptionNameContext exceptionName() throws RecognitionException {
		ExceptionNameContext _localctx = new ExceptionNameContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_exceptionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
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
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener) ((gramaticaListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener) ((gramaticaListener)listener).exitMethodBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor) return ((gramaticaVisitor<? extends T>)visitor).visitMethodBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_methodBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(399);
				match(T__31);
				}
				break;
			}
			setState(405);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=1 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(402);
					matchWildcard();
					}
					} 
				}
				setState(407);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			}
			setState(409);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__31) {
				{
				setState(408);
				match(T__31);
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

	public static final String _serializedATN =
		"\u0004\u0001\'\u019c\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0005\u0002L\b\u0002\n\u0002\f\u0002O\t\u0002\u0001\u0002"+
		"\u0003\u0002R\b\u0002\u0001\u0003\u0003\u0003U\b\u0003\u0001\u0003\u0005"+
		"\u0003X\b\u0003\n\u0003\f\u0003[\t\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0005\u0006h\b\u0006\n\u0006\f\u0006k\t"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0005\bq\b\b\n\b\f\bt\t"+
		"\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0005\n}\b"+
		"\n\n\n\f\n\u0080\t\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0005"+
		"\f\u0087\b\f\n\f\f\f\u008a\t\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0005\f\u0093\b\f\n\f\f\f\u0096\t\f\u0001\f\u0001\f\u0001"+
		"\f\u0005\f\u009b\b\f\n\f\f\f\u009e\t\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0005\f\u00a7\b\f\n\f\f\f\u00aa\t\f\u0001\f\u0001"+
		"\f\u0001\f\u0005\f\u00af\b\f\n\f\f\f\u00b2\t\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0005\f\u00b9\b\f\n\f\f\f\u00bc\t\f\u0001\f\u0001\f\u0003"+
		"\f\u00c0\b\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0003\u000f\u00c9\b\u000f\u0001\u0010\u0005\u0010\u00cc"+
		"\b\u0010\n\u0010\f\u0010\u00cf\t\u0010\u0001\u0010\u0005\u0010\u00d2\b"+
		"\u0010\n\u0010\f\u0010\u00d5\t\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0003\u0010\u00da\b\u0010\u0001\u0010\u0005\u0010\u00dd\b\u0010\n\u0010"+
		"\f\u0010\u00e0\t\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010"+
		"\u00e5\b\u0010\u0001\u0010\u0003\u0010\u00e8\b\u0010\u0005\u0010\u00ea"+
		"\b\u0010\n\u0010\f\u0010\u00ed\t\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0005\u0010\u00f2\b\u0010\n\u0010\f\u0010\u00f5\t\u0010\u0001\u0010\u0005"+
		"\u0010\u00f8\b\u0010\n\u0010\f\u0010\u00fb\t\u0010\u0001\u0010\u0001\u0010"+
		"\u0003\u0010\u00ff\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010"+
		"\u0104\b\u0010\n\u0010\f\u0010\u0107\t\u0010\u0001\u0010\u0001\u0010\u0003"+
		"\u0010\u010b\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0005\u0011\u0112\b\u0011\n\u0011\f\u0011\u0115\t\u0011\u0001\u0011"+
		"\u0003\u0011\u0118\b\u0011\u0001\u0012\u0003\u0012\u011b\b\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u0121\b\u0013\n"+
		"\u0013\f\u0013\u0124\t\u0013\u0003\u0013\u0126\b\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u012c\b\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0005\u0015\u0134"+
		"\b\u0015\n\u0015\f\u0015\u0137\t\u0015\u0001\u0015\u0005\u0015\u013a\b"+
		"\u0015\n\u0015\f\u0015\u013d\t\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u0145\b\u0015\n\u0015"+
		"\f\u0015\u0148\t\u0015\u0003\u0015\u014a\b\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0003\u0015\u014f\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016"+
		"\u0159\b\u0016\u0001\u0017\u0001\u0017\u0003\u0017\u015d\b\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u0163\b\u0018\n"+
		"\u0018\f\u0018\u0166\t\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001"+
		"\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u016f\b\u001a\n"+
		"\u001a\f\u001a\u0172\t\u001a\u0001\u001b\u0005\u001b\u0175\b\u001b\n\u001b"+
		"\f\u001b\u0178\t\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0005\u001b\u0180\b\u001b\n\u001b\f\u001b\u0183"+
		"\t\u001b\u0001\u001b\u0003\u001b\u0186\b\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0003\u001b\u018c\b\u001b\u0001\u001c\u0001\u001c"+
		"\u0001\u001d\u0003\u001d\u0191\b\u001d\u0001\u001d\u0005\u001d\u0194\b"+
		"\u001d\n\u001d\f\u001d\u0197\t\u001d\u0001\u001d\u0003\u001d\u019a\b\u001d"+
		"\u0001\u001d\u0011Mir~\u0088\u009c\u00b0\u00cd\u00de\u00f3\u0113\u0122"+
		"\u0135\u0164\u0176\u0181\u0195\u0000\u001e\u0000\u0002\u0004\u0006\b\n"+
		"\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.0246"+
		"8:\u0000\u0002\u0001\u0000\u0001\b\u0002\u0000\u000f\u000f\u0012\u0012"+
		"\u01b3\u0000<\u0001\u0000\u0000\u0000\u0002>\u0001\u0000\u0000\u0000\u0004"+
		"Q\u0001\u0000\u0000\u0000\u0006T\u0001\u0000\u0000\u0000\b^\u0001\u0000"+
		"\u0000\u0000\nb\u0001\u0000\u0000\u0000\fd\u0001\u0000\u0000\u0000\u000e"+
		"l\u0001\u0000\u0000\u0000\u0010n\u0001\u0000\u0000\u0000\u0012w\u0001"+
		"\u0000\u0000\u0000\u0014y\u0001\u0000\u0000\u0000\u0016\u0083\u0001\u0000"+
		"\u0000\u0000\u0018\u00bf\u0001\u0000\u0000\u0000\u001a\u00c1\u0001\u0000"+
		"\u0000\u0000\u001c\u00c3\u0001\u0000\u0000\u0000\u001e\u00c8\u0001\u0000"+
		"\u0000\u0000 \u010a\u0001\u0000\u0000\u0000\"\u010c\u0001\u0000\u0000"+
		"\u0000$\u011a\u0001\u0000\u0000\u0000&\u0125\u0001\u0000\u0000\u0000("+
		"\u0127\u0001\u0000\u0000\u0000*\u0135\u0001\u0000\u0000\u0000,\u0154\u0001"+
		"\u0000\u0000\u0000.\u015c\u0001\u0000\u0000\u00000\u015e\u0001\u0000\u0000"+
		"\u00002\u0169\u0001\u0000\u0000\u00004\u016b\u0001\u0000\u0000\u00006"+
		"\u018b\u0001\u0000\u0000\u00008\u018d\u0001\u0000\u0000\u0000:\u0190\u0001"+
		"\u0000\u0000\u0000<=\u0007\u0000\u0000\u0000=\u0001\u0001\u0000\u0000"+
		"\u0000>?\u0003\u0004\u0002\u0000?\u0003\u0001\u0000\u0000\u0000@A\u0005"+
		"\t\u0000\u0000AR\u0005!\u0000\u0000BC\u0005\t\u0000\u0000CD\u0005!\u0000"+
		"\u0000DE\u0005\n\u0000\u0000EF\u0005!\u0000\u0000FR\u0005\u000b\u0000"+
		"\u0000GH\u0005\t\u0000\u0000HI\u0005!\u0000\u0000IM\u0005\f\u0000\u0000"+
		"JL\t\u0000\u0000\u0000KJ\u0001\u0000\u0000\u0000LO\u0001\u0000\u0000\u0000"+
		"MN\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000NP\u0001\u0000\u0000"+
		"\u0000OM\u0001\u0000\u0000\u0000PR\u0005\r\u0000\u0000Q@\u0001\u0000\u0000"+
		"\u0000QB\u0001\u0000\u0000\u0000QG\u0001\u0000\u0000\u0000R\u0005\u0001"+
		"\u0000\u0000\u0000SU\u0003\b\u0004\u0000TS\u0001\u0000\u0000\u0000TU\u0001"+
		"\u0000\u0000\u0000UY\u0001\u0000\u0000\u0000VX\u0003\u0010\b\u0000WV\u0001"+
		"\u0000\u0000\u0000X[\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000"+
		"YZ\u0001\u0000\u0000\u0000Z\\\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000"+
		"\u0000\\]\u0003\u0018\f\u0000]\u0007\u0001\u0000\u0000\u0000^_\u0005\u000e"+
		"\u0000\u0000_`\u0003\n\u0005\u0000`a\u0005\u000f\u0000\u0000a\t\u0001"+
		"\u0000\u0000\u0000bc\u0003\f\u0006\u0000c\u000b\u0001\u0000\u0000\u0000"+
		"di\u0005!\u0000\u0000ef\u0005\u0010\u0000\u0000fh\u0003\u000e\u0007\u0000"+
		"ge\u0001\u0000\u0000\u0000hk\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000"+
		"\u0000ig\u0001\u0000\u0000\u0000j\r\u0001\u0000\u0000\u0000ki\u0001\u0000"+
		"\u0000\u0000lm\u0005!\u0000\u0000m\u000f\u0001\u0000\u0000\u0000nr\u0005"+
		"\u0011\u0000\u0000oq\u0003\u0000\u0000\u0000po\u0001\u0000\u0000\u0000"+
		"qt\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000"+
		"\u0000su\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000uv\u0003\u0012"+
		"\t\u0000v\u0011\u0001\u0000\u0000\u0000wx\u0003\u0014\n\u0000x\u0013\u0001"+
		"\u0000\u0000\u0000y~\u0005!\u0000\u0000z{\u0005\u0010\u0000\u0000{}\u0003"+
		"\u0016\u000b\u0000|z\u0001\u0000\u0000\u0000}\u0080\u0001\u0000\u0000"+
		"\u0000~\u007f\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000\u007f"+
		"\u0081\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000\u0000\u0081\u0082"+
		"\u0007\u0001\u0000\u0000\u0082\u0015\u0001\u0000\u0000\u0000\u0083\u0084"+
		"\u0005!\u0000\u0000\u0084\u0017\u0001\u0000\u0000\u0000\u0085\u0087\u0003"+
		"\u0002\u0001\u0000\u0086\u0085\u0001\u0000\u0000\u0000\u0087\u008a\u0001"+
		"\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0088\u0086\u0001"+
		"\u0000\u0000\u0000\u0089\u008b\u0001\u0000\u0000\u0000\u008a\u0088\u0001"+
		"\u0000\u0000\u0000\u008b\u008c\u0005\u0001\u0000\u0000\u008c\u008d\u0005"+
		"\u0013\u0000\u0000\u008d\u008e\u0003\u001a\r\u0000\u008e\u008f\u0005\u0014"+
		"\u0000\u0000\u008f\u0090\u0003\u001c\u000e\u0000\u0090\u0094\u0005\u0015"+
		"\u0000\u0000\u0091\u0093\u0003\u001e\u000f\u0000\u0092\u0091\u0001\u0000"+
		"\u0000\u0000\u0093\u0096\u0001\u0000\u0000\u0000\u0094\u0092\u0001\u0000"+
		"\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095\u0097\u0001\u0000"+
		"\u0000\u0000\u0096\u0094\u0001\u0000\u0000\u0000\u0097\u0098\u0005\u0016"+
		"\u0000\u0000\u0098\u00c0\u0001\u0000\u0000\u0000\u0099\u009b\u0003\u0002"+
		"\u0001\u0000\u009a\u0099\u0001\u0000\u0000\u0000\u009b\u009e\u0001\u0000"+
		"\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009c\u009a\u0001\u0000"+
		"\u0000\u0000\u009d\u009f\u0001\u0000\u0000\u0000\u009e\u009c\u0001\u0000"+
		"\u0000\u0000\u009f\u00a0\u0005\u0001\u0000\u0000\u00a0\u00a1\u0005\u0013"+
		"\u0000\u0000\u00a1\u00a2\u0003\u001a\r\u0000\u00a2\u00a3\u0005\u0017\u0000"+
		"\u0000\u00a3\u00a4\u0003\u001c\u000e\u0000\u00a4\u00a8\u0005\u0015\u0000"+
		"\u0000\u00a5\u00a7\u0003\u001e\u000f\u0000\u00a6\u00a5\u0001\u0000\u0000"+
		"\u0000\u00a7\u00aa\u0001\u0000\u0000\u0000\u00a8\u00a6\u0001\u0000\u0000"+
		"\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9\u00ab\u0001\u0000\u0000"+
		"\u0000\u00aa\u00a8\u0001\u0000\u0000\u0000\u00ab\u00ac\u0005\u0016\u0000"+
		"\u0000\u00ac\u00c0\u0001\u0000\u0000\u0000\u00ad\u00af\u0003\u0002\u0001"+
		"\u0000\u00ae\u00ad\u0001\u0000\u0000\u0000\u00af\u00b2\u0001\u0000\u0000"+
		"\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b0\u00ae\u0001\u0000\u0000"+
		"\u0000\u00b1\u00b3\u0001\u0000\u0000\u0000\u00b2\u00b0\u0001\u0000\u0000"+
		"\u0000\u00b3\u00b4\u0005\u0001\u0000\u0000\u00b4\u00b5\u0005\u0013\u0000"+
		"\u0000\u00b5\u00b6\u0003\u001a\r\u0000\u00b6\u00ba\u0005\u0015\u0000\u0000"+
		"\u00b7\u00b9\u0003\u001e\u000f\u0000\u00b8\u00b7\u0001\u0000\u0000\u0000"+
		"\u00b9\u00bc\u0001\u0000\u0000\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000"+
		"\u00ba\u00bb\u0001\u0000\u0000\u0000\u00bb\u00bd\u0001\u0000\u0000\u0000"+
		"\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bd\u00be\u0005\u0016\u0000\u0000"+
		"\u00be\u00c0\u0001\u0000\u0000\u0000\u00bf\u0088\u0001\u0000\u0000\u0000"+
		"\u00bf\u009c\u0001\u0000\u0000\u0000\u00bf\u00b0\u0001\u0000\u0000\u0000"+
		"\u00c0\u0019\u0001\u0000\u0000\u0000\u00c1\u00c2\u0005!\u0000\u0000\u00c2"+
		"\u001b\u0001\u0000\u0000\u0000\u00c3\u00c4\u0005!\u0000\u0000\u00c4\u001d"+
		"\u0001\u0000\u0000\u0000\u00c5\u00c9\u0003 \u0010\u0000\u00c6\u00c9\u0003"+
		"(\u0014\u0000\u00c7\u00c9\u0003*\u0015\u0000\u00c8\u00c5\u0001\u0000\u0000"+
		"\u0000\u00c8\u00c6\u0001\u0000\u0000\u0000\u00c8\u00c7\u0001\u0000\u0000"+
		"\u0000\u00c9\u001f\u0001\u0000\u0000\u0000\u00ca\u00cc\u0003\u0002\u0001"+
		"\u0000\u00cb\u00ca\u0001\u0000\u0000\u0000\u00cc\u00cf\u0001\u0000\u0000"+
		"\u0000\u00cd\u00ce\u0001\u0000\u0000\u0000\u00cd\u00cb\u0001\u0000\u0000"+
		"\u0000\u00ce\u00d3\u0001\u0000\u0000\u0000\u00cf\u00cd\u0001\u0000\u0000"+
		"\u0000\u00d0\u00d2\u0003\u0000\u0000\u0000\u00d1\u00d0\u0001\u0000\u0000"+
		"\u0000\u00d2\u00d5\u0001\u0000\u0000\u0000\u00d3\u00d1\u0001\u0000\u0000"+
		"\u0000\u00d3\u00d4\u0001\u0000\u0000\u0000\u00d4\u00d6\u0001\u0000\u0000"+
		"\u0000\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d6\u00d7\u0003\"\u0011\u0000"+
		"\u00d7\u00d9\u0003$\u0012\u0000\u00d8\u00da\u0005\u0018\u0000\u0000\u00d9"+
		"\u00d8\u0001\u0000\u0000\u0000\u00d9\u00da\u0001\u0000\u0000\u0000\u00da"+
		"\u00de\u0001\u0000\u0000\u0000\u00db\u00dd\u0003&\u0013\u0000\u00dc\u00db"+
		"\u0001\u0000\u0000\u0000\u00dd\u00e0\u0001\u0000\u0000\u0000\u00de\u00df"+
		"\u0001\u0000\u0000\u0000\u00de\u00dc\u0001\u0000\u0000\u0000\u00df\u00eb"+
		"\u0001\u0000\u0000\u0000\u00e0\u00de\u0001\u0000\u0000\u0000\u00e1\u00e2"+
		"\u0005\u0019\u0000\u0000\u00e2\u00e4\u0003$\u0012\u0000\u00e3\u00e5\u0005"+
		"\u0018\u0000\u0000\u00e4\u00e3\u0001\u0000\u0000\u0000\u00e4\u00e5\u0001"+
		"\u0000\u0000\u0000\u00e5\u00e7\u0001\u0000\u0000\u0000\u00e6\u00e8\u0003"+
		"&\u0013\u0000\u00e7\u00e6\u0001\u0000\u0000\u0000\u00e7\u00e8\u0001\u0000"+
		"\u0000\u0000\u00e8\u00ea\u0001\u0000\u0000\u0000\u00e9\u00e1\u0001\u0000"+
		"\u0000\u0000\u00ea\u00ed\u0001\u0000\u0000\u0000\u00eb\u00e9\u0001\u0000"+
		"\u0000\u0000\u00eb\u00ec\u0001\u0000\u0000\u0000\u00ec\u00ee\u0001\u0000"+
		"\u0000\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ee\u00ef\u0005\u000f"+
		"\u0000\u0000\u00ef\u010b\u0001\u0000\u0000\u0000\u00f0\u00f2\u0003\u0002"+
		"\u0001\u0000\u00f1\u00f0\u0001\u0000\u0000\u0000\u00f2\u00f5\u0001\u0000"+
		"\u0000\u0000\u00f3\u00f4\u0001\u0000\u0000\u0000\u00f3\u00f1\u0001\u0000"+
		"\u0000\u0000\u00f4\u00f9\u0001\u0000\u0000\u0000\u00f5\u00f3\u0001\u0000"+
		"\u0000\u0000\u00f6\u00f8\u0003\u0000\u0000\u0000\u00f7\u00f6\u0001\u0000"+
		"\u0000\u0000\u00f8\u00fb\u0001\u0000\u0000\u0000\u00f9\u00f7\u0001\u0000"+
		"\u0000\u0000\u00f9\u00fa\u0001\u0000\u0000\u0000\u00fa\u00fc\u0001\u0000"+
		"\u0000\u0000\u00fb\u00f9\u0001\u0000\u0000\u0000\u00fc\u00fe\u0003\"\u0011"+
		"\u0000\u00fd\u00ff\u0005\u0018\u0000\u0000\u00fe\u00fd\u0001\u0000\u0000"+
		"\u0000\u00fe\u00ff\u0001\u0000\u0000\u0000\u00ff\u0100\u0001\u0000\u0000"+
		"\u0000\u0100\u0105\u0003$\u0012\u0000\u0101\u0102\u0005\u0019\u0000\u0000"+
		"\u0102\u0104\u0003$\u0012\u0000\u0103\u0101\u0001\u0000\u0000\u0000\u0104"+
		"\u0107\u0001\u0000\u0000\u0000\u0105\u0103\u0001\u0000\u0000\u0000\u0105"+
		"\u0106\u0001\u0000\u0000\u0000\u0106\u0108\u0001\u0000\u0000\u0000\u0107"+
		"\u0105\u0001\u0000\u0000\u0000\u0108\u0109\u0005\u000f\u0000\u0000\u0109"+
		"\u010b\u0001\u0000\u0000\u0000\u010a\u00cd\u0001\u0000\u0000\u0000\u010a"+
		"\u00f3\u0001\u0000\u0000\u0000\u010b!\u0001\u0000\u0000\u0000\u010c\u0117"+
		"\u0005!\u0000\u0000\u010d\u010e\u0005\u001a\u0000\u0000\u010e\u0113\u0005"+
		"!\u0000\u0000\u010f\u0110\u0005\u0019\u0000\u0000\u0110\u0112\u0005!\u0000"+
		"\u0000\u0111\u010f\u0001\u0000\u0000\u0000\u0112\u0115\u0001\u0000\u0000"+
		"\u0000\u0113\u0114\u0001\u0000\u0000\u0000\u0113\u0111\u0001\u0000\u0000"+
		"\u0000\u0114\u0116\u0001\u0000\u0000\u0000\u0115\u0113\u0001\u0000\u0000"+
		"\u0000\u0116\u0118\u0005\u001b\u0000\u0000\u0117\u010d\u0001\u0000\u0000"+
		"\u0000\u0117\u0118\u0001\u0000\u0000\u0000\u0118#\u0001\u0000\u0000\u0000"+
		"\u0119\u011b\u0005!\u0000\u0000\u011a\u0119\u0001\u0000\u0000\u0000\u011a"+
		"\u011b\u0001\u0000\u0000\u0000\u011b%\u0001\u0000\u0000\u0000\u011c\u011d"+
		"\u0005\u001c\u0000\u0000\u011d\u0126\u0005#\u0000\u0000\u011e\u0122\u0005"+
		"\u001c\u0000\u0000\u011f\u0121\t\u0000\u0000\u0000\u0120\u011f\u0001\u0000"+
		"\u0000\u0000\u0121\u0124\u0001\u0000\u0000\u0000\u0122\u0123\u0001\u0000"+
		"\u0000\u0000\u0122\u0120\u0001\u0000\u0000\u0000\u0123\u0126\u0001\u0000"+
		"\u0000\u0000\u0124\u0122\u0001\u0000\u0000\u0000\u0125\u011c\u0001\u0000"+
		"\u0000\u0000\u0125\u011e\u0001\u0000\u0000\u0000\u0126\'\u0001\u0000\u0000"+
		"\u0000\u0127\u0128\u0003\u0000\u0000\u0000\u0128\u0129\u0005!\u0000\u0000"+
		"\u0129\u012b\u0005\f\u0000\u0000\u012a\u012c\u00034\u001a\u0000\u012b"+
		"\u012a\u0001\u0000\u0000\u0000\u012b\u012c\u0001\u0000\u0000\u0000\u012c"+
		"\u012d\u0001\u0000\u0000\u0000\u012d\u012e\u0005\r\u0000\u0000\u012e\u012f"+
		"\u0005\u0015\u0000\u0000\u012f\u0130\u0003:\u001d\u0000\u0130\u0131\u0005"+
		"\u0016\u0000\u0000\u0131)\u0001\u0000\u0000\u0000\u0132\u0134\u0003\u0002"+
		"\u0001\u0000\u0133\u0132\u0001\u0000\u0000\u0000\u0134\u0137\u0001\u0000"+
		"\u0000\u0000\u0135\u0136\u0001\u0000\u0000\u0000\u0135\u0133\u0001\u0000"+
		"\u0000\u0000\u0136\u013b\u0001\u0000\u0000\u0000\u0137\u0135\u0001\u0000"+
		"\u0000\u0000\u0138\u013a\u0003\u0000\u0000\u0000\u0139\u0138\u0001\u0000"+
		"\u0000\u0000\u013a\u013d\u0001\u0000\u0000\u0000\u013b\u0139\u0001\u0000"+
		"\u0000\u0000\u013b\u013c\u0001\u0000\u0000\u0000\u013c\u013e\u0001\u0000"+
		"\u0000\u0000\u013d\u013b\u0001\u0000\u0000\u0000\u013e\u013f\u0003,\u0016"+
		"\u0000\u013f\u0140\u00032\u0019\u0000\u0140\u0149\u0005\f\u0000\u0000"+
		"\u0141\u0146\u00036\u001b\u0000\u0142\u0143\u0005\u0019\u0000\u0000\u0143"+
		"\u0145\u00036\u001b\u0000\u0144\u0142\u0001\u0000\u0000\u0000\u0145\u0148"+
		"\u0001\u0000\u0000\u0000\u0146\u0144\u0001\u0000\u0000\u0000\u0146\u0147"+
		"\u0001\u0000\u0000\u0000\u0147\u014a\u0001\u0000\u0000\u0000\u0148\u0146"+
		"\u0001\u0000\u0000\u0000\u0149\u0141\u0001\u0000\u0000\u0000\u0149\u014a"+
		"\u0001\u0000\u0000\u0000\u014a\u014b\u0001\u0000\u0000\u0000\u014b\u014e"+
		"\u0005\r\u0000\u0000\u014c\u014d\u0005\u001d\u0000\u0000\u014d\u014f\u0003"+
		"8\u001c\u0000\u014e\u014c\u0001\u0000\u0000\u0000\u014e\u014f\u0001\u0000"+
		"\u0000\u0000\u014f\u0150\u0001\u0000\u0000\u0000\u0150\u0151\u0005\u0015"+
		"\u0000\u0000\u0151\u0152\u0003:\u001d\u0000\u0152\u0153\u0005\u0016\u0000"+
		"\u0000\u0153+\u0001\u0000\u0000\u0000\u0154\u0158\u0003.\u0017\u0000\u0155"+
		"\u0156\u0005\u001e\u0000\u0000\u0156\u0159\u0005\u001f\u0000\u0000\u0157"+
		"\u0159\u00030\u0018\u0000\u0158\u0155\u0001\u0000\u0000\u0000\u0158\u0157"+
		"\u0001\u0000\u0000\u0000\u0158\u0159\u0001\u0000\u0000\u0000\u0159-\u0001"+
		"\u0000\u0000\u0000\u015a\u015d\u00030\u0018\u0000\u015b\u015d\u0005!\u0000"+
		"\u0000\u015c\u015a\u0001\u0000\u0000\u0000\u015c\u015b\u0001\u0000\u0000"+
		"\u0000\u015d/\u0001\u0000\u0000\u0000\u015e\u015f\u0005\u001a\u0000\u0000"+
		"\u015f\u0164\u0003.\u0017\u0000\u0160\u0161\u0005\u0019\u0000\u0000\u0161"+
		"\u0163\u0003.\u0017\u0000\u0162\u0160\u0001\u0000\u0000\u0000\u0163\u0166"+
		"\u0001\u0000\u0000\u0000\u0164\u0165\u0001\u0000\u0000\u0000\u0164\u0162"+
		"\u0001\u0000\u0000\u0000\u0165\u0167\u0001\u0000\u0000\u0000\u0166\u0164"+
		"\u0001\u0000\u0000\u0000\u0167\u0168\u0005\u001b\u0000\u0000\u01681\u0001"+
		"\u0000\u0000\u0000\u0169\u016a\u0005!\u0000\u0000\u016a3\u0001\u0000\u0000"+
		"\u0000\u016b\u0170\u00036\u001b\u0000\u016c\u016d\u0005\u0019\u0000\u0000"+
		"\u016d\u016f\u00036\u001b\u0000\u016e\u016c\u0001\u0000\u0000\u0000\u016f"+
		"\u0172\u0001\u0000\u0000\u0000\u0170\u016e\u0001\u0000\u0000\u0000\u0170"+
		"\u0171\u0001\u0000\u0000\u0000\u01715\u0001\u0000\u0000\u0000\u0172\u0170"+
		"\u0001\u0000\u0000\u0000\u0173\u0175\u0003\u0000\u0000\u0000\u0174\u0173"+
		"\u0001\u0000\u0000\u0000\u0175\u0178\u0001\u0000\u0000\u0000\u0176\u0177"+
		"\u0001\u0000\u0000\u0000\u0176\u0174\u0001\u0000\u0000\u0000\u0177\u0179"+
		"\u0001\u0000\u0000\u0000\u0178\u0176\u0001\u0000\u0000\u0000\u0179\u0185"+
		"\u0005!\u0000\u0000\u017a\u0186\u0005\u0018\u0000\u0000\u017b\u017c\u0005"+
		"\u001a\u0000\u0000\u017c\u0181\u0005!\u0000\u0000\u017d\u017e\u0005\u0019"+
		"\u0000\u0000\u017e\u0180\u0005!\u0000\u0000\u017f\u017d\u0001\u0000\u0000"+
		"\u0000\u0180\u0183\u0001\u0000\u0000\u0000\u0181\u0182\u0001\u0000\u0000"+
		"\u0000\u0181\u017f\u0001\u0000\u0000\u0000\u0182\u0184\u0001\u0000\u0000"+
		"\u0000\u0183\u0181\u0001\u0000\u0000\u0000\u0184\u0186\u0005\u001b\u0000"+
		"\u0000\u0185\u017a\u0001\u0000\u0000\u0000\u0185\u017b\u0001\u0000\u0000"+
		"\u0000\u0185\u0186\u0001\u0000\u0000\u0000\u0186\u0187\u0001\u0000\u0000"+
		"\u0000\u0187\u018c\u0005!\u0000\u0000\u0188\u0189\u0005!\u0000\u0000\u0189"+
		"\u018a\u0005!\u0000\u0000\u018a\u018c\u0005\u0018\u0000\u0000\u018b\u0176"+
		"\u0001\u0000\u0000\u0000\u018b\u0188\u0001\u0000\u0000\u0000\u018c7\u0001"+
		"\u0000\u0000\u0000\u018d\u018e\u0005!\u0000\u0000\u018e9\u0001\u0000\u0000"+
		"\u0000\u018f\u0191\u0005 \u0000\u0000\u0190\u018f\u0001\u0000\u0000\u0000"+
		"\u0190\u0191\u0001\u0000\u0000\u0000\u0191\u0195\u0001\u0000\u0000\u0000"+
		"\u0192\u0194\t\u0000\u0000\u0000\u0193\u0192\u0001\u0000\u0000\u0000\u0194"+
		"\u0197\u0001\u0000\u0000\u0000\u0195\u0196\u0001\u0000\u0000\u0000\u0195"+
		"\u0193\u0001\u0000\u0000\u0000\u0196\u0199\u0001\u0000\u0000\u0000\u0197"+
		"\u0195\u0001\u0000\u0000\u0000\u0198\u019a\u0005 \u0000\u0000\u0199\u0198"+
		"\u0001\u0000\u0000\u0000\u0199\u019a\u0001\u0000\u0000\u0000\u019a;\u0001"+
		"\u0000\u0000\u00001MQTYir~\u0088\u0094\u009c\u00a8\u00b0\u00ba\u00bf\u00c8"+
		"\u00cd\u00d3\u00d9\u00de\u00e4\u00e7\u00eb\u00f3\u00f9\u00fe\u0105\u010a"+
		"\u0113\u0117\u011a\u0122\u0125\u012b\u0135\u013b\u0146\u0149\u014e\u0158"+
		"\u015c\u0164\u0170\u0176\u0181\u0185\u018b\u0190\u0195\u0199";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}