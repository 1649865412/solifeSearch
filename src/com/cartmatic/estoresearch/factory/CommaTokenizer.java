package com.cartmatic.estoresearch.factory;

import java.io.Reader;

import org.apache.lucene.analysis.CharTokenizer;
import org.apache.lucene.util.AttributeSource;
import org.apache.lucene.util.Version;

public class CommaTokenizer extends CharTokenizer {

	/**
	 * Construct a new WhitespaceTokenizer. * @param matchVersion Lucene version
	 * to match See {@link <a href="#version">above</a>}
	 * 
	 * @param in
	 *            the input to split up into tokens
	 */
	public CommaTokenizer(Version matchVersion, Reader in) {
		super(matchVersion, in);
	}

	/**
	 * Construct a new WhitespaceTokenizer using a given {@link AttributeSource}
	 * .
	 * 
	 * @param matchVersion
	 *            Lucene version to match See
	 *            {@link <a href="#version">above</a>}
	 * @param source
	 *            the attribute source to use for this {@link Tokenizer}
	 * @param in
	 *            the input to split up into tokens
	 */
	public CommaTokenizer(Version matchVersion, AttributeSource source,
			Reader in) {
		super(matchVersion, source, in);
	}

	/**
	 * Construct a new WhitespaceTokenizer using a given
	 * {@link org.apache.lucene.util.AttributeSource.AttributeFactory}.
	 * 
	 * @param matchVersion
	 *            Lucene version to match See
	 *            {@link <a href="#version">above</a>}
	 * @param factory
	 *            the attribute factory to use for this {@link Tokenizer}
	 * @param in
	 *            the input to split up into tokens
	 */
	public CommaTokenizer(Version matchVersion, AttributeFactory factory,
			Reader in) {
		super(matchVersion, factory, in);
	}

	/**
	 * Construct a new CommaTokenizer.
	 * 
	 * @deprecated use {@link #CommaTokenizer(Version, Reader)} instead. This
	 *             will be removed in Lucene 4.0.
	 */
	@Deprecated
	public CommaTokenizer(Reader in) {
		super(in);
	}

	/**
	 * Construct a new CommaTokenizer using a given {@link AttributeSource}.
	 * 
	 * @deprecated use {@link #CommaTokenizer(Version, AttributeSource, Reader)}
	 *             instead. This will be removed in Lucene 4.0.
	 */
	@Deprecated
	public CommaTokenizer(AttributeSource source, Reader in) {
		super(source, in);
	}

	/**
	 * Construct a new CommaTokenizer using a given
	 * {@link org.apache.lucene.util.AttributeSource.AttributeFactory}.
	 * 
	 * @deprecated use
	 *             {@link #CommaTokenizer(Version, AttributeSource.AttributeFactory, Reader)}
	 *             instead. This will be removed in Lucene 4.0.
	 */
	@Deprecated
	public CommaTokenizer(AttributeFactory factory, Reader in) {
		super(factory, in);
	}

	/**
	 * Collects only characters which do not satisfy
	 * {@link Character#isWhitespace(int)}.
	 */
	@Override
	protected boolean isTokenChar(int c) {
		// return !Character.isWhitespace(c);
		// 44表示逗号
		return !(c == 44);
	}
}
