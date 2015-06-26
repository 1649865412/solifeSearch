package com.cartmatic.estoresearch.factory;

import java.io.Reader;
import java.util.Map;

import org.apache.solr.analysis.BaseTokenizerFactory;

public class CommaTokenizerFactory  extends BaseTokenizerFactory {

	public void init(Map<String, String> args) {
		super.init(args);
		assureMatchVersion();
	}

	public CommaTokenizer create(Reader input) {
		return new CommaTokenizer(luceneMatchVersion, input);
	}

}
