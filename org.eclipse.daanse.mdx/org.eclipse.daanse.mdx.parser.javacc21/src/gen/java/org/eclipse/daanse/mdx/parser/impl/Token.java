/* Generated by: JavaCC 21 Parser Generator. Token.java */
package org.eclipse.daanse.mdx.parser.impl;

import org.eclipse.daanse.mdx.parser.impl.tree.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
public class Token implements mdxConstants, Node {
    private TokenType type;
    private mdxLexer tokenSource;
    private int beginOffset, endOffset;
    private boolean unparsed;
    private Node parent;
    private String image;
    public void setImage(String image) {
        this.image= image;
    }

    private Token prependedToken, appendedToken;
    private boolean inserted;
    public boolean isInserted() {
        return inserted;
    }

    public void preInsert(Token prependedToken) {
        if (prependedToken== this.prependedToken) return;
        prependedToken.appendedToken= this;
        Token existingPreviousToken= this.previousCachedToken();
        if (existingPreviousToken!=null) {
            existingPreviousToken.appendedToken= prependedToken;
            prependedToken.prependedToken= existingPreviousToken;
        }
        prependedToken.inserted= true;
        prependedToken.beginOffset= prependedToken.endOffset= this.beginOffset;
        this.prependedToken= prependedToken;
    }

    void unsetAppendedToken() {
        this.appendedToken= null;
    }

    /**
     * @param type the #TokenType of the token being constructed
     * @param image the String content of the token
     * @param tokenSource the object that vended this token.
     */
    public Token(TokenType type, String image, mdxLexer tokenSource) {
        this.type= type;
        this.image= image;
        this.tokenSource= tokenSource;
    }

    public static Token newToken(TokenType type, String image, mdxLexer tokenSource) {
        Token result= newToken(type, tokenSource, 0, 0);
        result.setImage(image);
        return result;
    }

    /**
     * It would be extremely rare that an application
     * programmer would use this method. It needs to
     * be public because it is part of the org.eclipse.daanse.mdx.parser.impl.Node interface.
     */
    public void setBeginOffset(int beginOffset) {
        this.beginOffset= beginOffset;
    }

    /**
     * It would be extremely rare that an application
     * programmer would use this method. It needs to
     * be public because it is part of the org.eclipse.daanse.mdx.parser.impl.Node interface.
     */
    public void setEndOffset(int endOffset) {
        this.endOffset= endOffset;
    }

    /**
     * @return the mdxLexer object that handles 
     * location info for the tokens. 
     */
    public mdxLexer getTokenSource() {
        mdxLexer flm= this.tokenSource;
        // If this is null and we have chained tokens,
        // we try to get it from there! (Why not?)
        if (flm== null) {
            if (prependedToken!=null) {
                flm= prependedToken.getTokenSource();
            }
            if (flm== null&&appendedToken!=null) {
                flm= appendedToken.getTokenSource();
            }
        }
        return flm;
    }

    /**
     * It should be exceedingly rare that an application
     * programmer needs to use this method.
     */
    public void setTokenSource(mdxLexer tokenSource) {
        this.tokenSource= tokenSource;
    }

    /**
     * Return the TokenType of this Token object
     */
    public TokenType getType() {
        return type;
    }

    protected void setType(TokenType type) {
        this.type= type;
    }

    /**
     * @return whether this Token represent actual input or was it inserted somehow?
     */
    public boolean isVirtual() {
        return type== TokenType.EOF;
    }

    /**
     * @return Did we skip this token in parsing?
     */
    public boolean isSkipped() {
        return false;
    }

    public int getBeginOffset() {
        return beginOffset;
    }

    public int getEndOffset() {
        return endOffset;
    }

    /**
     * @return the string image of the token.
     */
    public String getImage() {
        return image!=null?image:
        getSource();
    }

    /**
     * @return the next _cached_ regular (i.e. parsed) token
     * or null
     */
    public final Token getNext() {
        return getNextParsedToken();
    }

    /**
     * @return the previous regular (i.e. parsed) token
     * or null
     */
    public final Token getPrevious() {
        Token result= previousCachedToken();
        while (result!=null&&result.isUnparsed()) {
            result= result.previousCachedToken();
        }
        return result;
    }

    /**
     * @return the next regular (i.e. parsed) token
     */
    private Token getNextParsedToken() {
        Token result= nextCachedToken();
        while (result!=null&&result.isUnparsed()) {
            result= result.nextCachedToken();
        }
        return result;
    }

    /**
     * @return the next token of any sort (parsed or unparsed or invalid)
     */
    public Token nextCachedToken() {
        if (appendedToken!=null) return appendedToken;
        mdxLexer tokenSource= getTokenSource();
        return tokenSource!=null?tokenSource.nextCachedToken(getEndOffset()):
        null;
    }

    public Token previousCachedToken() {
        if (prependedToken!=null) return prependedToken;
        if (getTokenSource()== null) return null;
        return getTokenSource().previousCachedToken(getBeginOffset());
    }

    Token getPreviousToken() {
        return previousCachedToken();
    }

    public Token replaceType(TokenType type) {
        Token result= newToken(type, getTokenSource(), getBeginOffset(), getEndOffset());
        result.prependedToken= this.prependedToken;
        result.appendedToken= this.appendedToken;
        result.inserted= this.inserted;
        if (result.appendedToken!=null) {
            result.appendedToken.prependedToken= result;
        }
        if (result.prependedToken!=null) {
            result.prependedToken.appendedToken= result;
        }
        if (!result.inserted) {
            getTokenSource().cacheToken(result);
        }
        return result;
    }

    public String getSource() {
        if (type== TokenType.EOF) return"";
        mdxLexer flm= getTokenSource();
        return flm== null?null:
        flm.getText(getBeginOffset(), getEndOffset());
    }

    protected Token() {
    }

    public Token(TokenType type, mdxLexer tokenSource, int beginOffset, int endOffset) {
        this.type= type;
        this.tokenSource= tokenSource;
        this.beginOffset= beginOffset;
        this.endOffset= endOffset;
    }

    public boolean isUnparsed() {
        return unparsed;
    }

    public void setUnparsed(boolean unparsed) {
        this.unparsed= unparsed;
    }

    public void clearChildren() {
    }

    public String getNormalizedText() {
        if (getType()== TokenType.EOF) {
            return"EOF";
        }
        return getImage();
    }

    public String toString() {
        return getNormalizedText();
    }

    /**
     * @return An iterator of the tokens preceding this one.
     */
    public Iterator<Token> precedingTokens() {
        return new Iterator<Token> () {
            Token currentPoint= Token.this;
            public boolean hasNext() {
                return currentPoint.previousCachedToken()!=null;
            }

            public Token next() {
                Token previous= currentPoint.previousCachedToken();
                if (previous== null) throw new java.util.NoSuchElementException("No previous token!");
                return currentPoint= previous;
            }

        }
        ;
    }

    /**
     * @return a list of the unparsed tokens preceding this one in the order they appear in the input
     */
    public List<Token> precedingUnparsedTokens() {
        List<Token> result= new ArrayList<> ();
        Token t= this.previousCachedToken();
        while (t!=null&&t.isUnparsed()) {
            result.add(t);
            t= t.previousCachedToken();
        }
        Collections.reverse(result);
        return result;
    }

    /**
     * @return An iterator of the (cached) tokens that follow this one.
     */
    public Iterator<Token> followingTokens() {
        return new java.util.Iterator<Token> () {
            Token currentPoint= Token.this;
            public boolean hasNext() {
                return currentPoint.nextCachedToken()!=null;
            }

            public Token next() {
                Token next= currentPoint.nextCachedToken();
                if (next== null) throw new java.util.NoSuchElementException("No next token!");
                return currentPoint= next;
            }

        }
        ;
    }

    /**
     * Copy the location info from a Node
     */
    public void copyLocationInfo(Node from) {
        Node.super.copyLocationInfo(from);
        if (from instanceof Token) {
            Token otherTok= (Token) from;
            appendedToken= otherTok.appendedToken;
            prependedToken= otherTok.prependedToken;
        }
        setTokenSource(from.getTokenSource());
    }

    public void copyLocationInfo(Node start, Node end) {
        Node.super.copyLocationInfo(start, end);
        if (start instanceof Token) {
            prependedToken= ((Token) start).prependedToken;
        }
        if (end instanceof Token) {
            Token endToken= (Token) end;
            appendedToken= endToken.appendedToken;
        }
    }

    public static Token newToken(TokenType type, mdxLexer tokenSource, int beginOffset, int endOffset) {
        switch(type) {
            case AND:
            return new ASTAND(TokenType.AND, tokenSource, beginOffset, endOffset);
            case AS:
            return new ASTAS(TokenType.AS, tokenSource, beginOffset, endOffset);
            case AXIS:
            return new ASTAXIS(TokenType.AXIS, tokenSource, beginOffset, endOffset);
            case BEGIN:
            return new ASTBEGIN(TokenType.BEGIN, tokenSource, beginOffset, endOffset);
            case BY:
            return new ASTBY(TokenType.BY, tokenSource, beginOffset, endOffset);
            case CASE:
            return new ASTCASE(TokenType.CASE, tokenSource, beginOffset, endOffset);
            case CALCULATION:
            return new ASTCALCULATION(TokenType.CALCULATION, tokenSource, beginOffset, endOffset);
            case CAST:
            return new ASTCAST(TokenType.CAST, tokenSource, beginOffset, endOffset);
            case CELL:
            return new ASTCELL(TokenType.CELL, tokenSource, beginOffset, endOffset);
            case CHAPTERS:
            return new ASTCHAPTERS(TokenType.CHAPTERS, tokenSource, beginOffset, endOffset);
            case CREATE:
            return new ASTCREATE(TokenType.CREATE, tokenSource, beginOffset, endOffset);
            case COLUMNS:
            return new ASTCOLUMNS(TokenType.COLUMNS, tokenSource, beginOffset, endOffset);
            case COMMIT:
            return new ASTCOMMIT(TokenType.COMMIT, tokenSource, beginOffset, endOffset);
            case CUBE:
            return new ASTCUBE(TokenType.CUBE, tokenSource, beginOffset, endOffset);
            case DIMENSION:
            return new ASTDIMENSION(TokenType.DIMENSION, tokenSource, beginOffset, endOffset);
            case DRILLTHROUGH:
            return new ASTDRILLTHROUGH(TokenType.DRILLTHROUGH, tokenSource, beginOffset, endOffset);
            case ELSE:
            return new ASTELSE(TokenType.ELSE, tokenSource, beginOffset, endOffset);
            case EMPTY:
            return new ASTEMPTY(TokenType.EMPTY, tokenSource, beginOffset, endOffset);
            case END:
            return new ASTEND(TokenType.END, tokenSource, beginOffset, endOffset);
            case EXPLAIN:
            return new ASTEXPLAIN(TokenType.EXPLAIN, tokenSource, beginOffset, endOffset);
            case FIRSTROWSET:
            return new ASTFIRSTROWSET(TokenType.FIRSTROWSET, tokenSource, beginOffset, endOffset);
            case FOR:
            return new ASTFOR(TokenType.FOR, tokenSource, beginOffset, endOffset);
            case FROM:
            return new ASTFROM(TokenType.FROM, tokenSource, beginOffset, endOffset);
            case IN:
            return new ASTIN(TokenType.IN, tokenSource, beginOffset, endOffset);
            case IS:
            return new ASTIS(TokenType.IS, tokenSource, beginOffset, endOffset);
            case MATCHES:
            return new ASTMATCHES(TokenType.MATCHES, tokenSource, beginOffset, endOffset);
            case MAXROWS:
            return new ASTMAXROWS(TokenType.MAXROWS, tokenSource, beginOffset, endOffset);
            case MEMBER:
            return new ASTMEMBER(TokenType.MEMBER, tokenSource, beginOffset, endOffset);
            case MEASURE:
            return new ASTMEASURE(TokenType.MEASURE, tokenSource, beginOffset, endOffset);
            case NON:
            return new ASTNON(TokenType.NON, tokenSource, beginOffset, endOffset);
            case NOT:
            return new ASTNOT(TokenType.NOT, tokenSource, beginOffset, endOffset);
            case NULL:
            return new ASTNULL(TokenType.NULL, tokenSource, beginOffset, endOffset);
            case ON:
            return new ASTON(TokenType.ON, tokenSource, beginOffset, endOffset);
            case OR:
            return new ASTOR(TokenType.OR, tokenSource, beginOffset, endOffset);
            case PAGES:
            return new ASTPAGES(TokenType.PAGES, tokenSource, beginOffset, endOffset);
            case PLAN:
            return new ASTPLAN(TokenType.PLAN, tokenSource, beginOffset, endOffset);
            case PROPERTIES:
            return new ASTPROPERTIES(TokenType.PROPERTIES, tokenSource, beginOffset, endOffset);
            case REFRESH:
            return new ASTREFRESH(TokenType.REFRESH, tokenSource, beginOffset, endOffset);
            case RETURN:
            return new ASTRETURN(TokenType.RETURN, tokenSource, beginOffset, endOffset);
            case ROLLBACK:
            return new ASTROLLBACK(TokenType.ROLLBACK, tokenSource, beginOffset, endOffset);
            case ROWS:
            return new ASTROWS(TokenType.ROWS, tokenSource, beginOffset, endOffset);
            case SECTIONS:
            return new ASTSECTIONS(TokenType.SECTIONS, tokenSource, beginOffset, endOffset);
            case SELECT:
            return new ASTSELECT(TokenType.SELECT, tokenSource, beginOffset, endOffset);
            case SESSION:
            return new ASTSESSION(TokenType.SESSION, tokenSource, beginOffset, endOffset);
            case SET:
            return new ASTSET(TokenType.SET, tokenSource, beginOffset, endOffset);
            case THEN:
            return new ASTTHEN(TokenType.THEN, tokenSource, beginOffset, endOffset);
            case TRAN:
            return new ASTTRAN(TokenType.TRAN, tokenSource, beginOffset, endOffset);
            case TRANSACTION:
            return new ASTTRANSACTION(TokenType.TRANSACTION, tokenSource, beginOffset, endOffset);
            case UPDATE:
            return new ASTUPDATE(TokenType.UPDATE, tokenSource, beginOffset, endOffset);
            case USE_EQUAL_ALLOCATION:
            return new ASTUSE_EQUAL_ALLOCATION(TokenType.USE_EQUAL_ALLOCATION, tokenSource, beginOffset, endOffset);
            case USE_EQUAL_INCREMENT:
            return new ASTUSE_EQUAL_INCREMENT(TokenType.USE_EQUAL_INCREMENT, tokenSource, beginOffset, endOffset);
            case USE_WEIGHTED_ALLOCATION:
            return new ASTUSE_WEIGHTED_ALLOCATION(TokenType.USE_WEIGHTED_ALLOCATION, tokenSource, beginOffset, endOffset);
            case USE_WEIGHTED_INCREMENT:
            return new ASTUSE_WEIGHTED_INCREMENT(TokenType.USE_WEIGHTED_INCREMENT, tokenSource, beginOffset, endOffset);
            case WHEN:
            return new ASTWHEN(TokenType.WHEN, tokenSource, beginOffset, endOffset);
            case WHERE:
            return new ASTWHERE(TokenType.WHERE, tokenSource, beginOffset, endOffset);
            case XOR:
            return new ASTXOR(TokenType.XOR, tokenSource, beginOffset, endOffset);
            case WITH:
            return new ASTWITH(TokenType.WITH, tokenSource, beginOffset, endOffset);
            case EXISTING:
            return new ASTEXISTING(TokenType.EXISTING, tokenSource, beginOffset, endOffset);
            case $SYSTEM:
            return new AST$SYSTEM(TokenType.$SYSTEM, tokenSource, beginOffset, endOffset);
            case SINGLE_LINE_COMMENT:
            return new ASTSINGLE_LINE_COMMENT(TokenType.SINGLE_LINE_COMMENT, tokenSource, beginOffset, endOffset);
            case FORMAL_COMMENT:
            return new ASTFORMAL_COMMENT(TokenType.FORMAL_COMMENT, tokenSource, beginOffset, endOffset);
            case MULTI_LINE_COMMENT:
            return new ASTMULTI_LINE_COMMENT(TokenType.MULTI_LINE_COMMENT, tokenSource, beginOffset, endOffset);
            case LPAREN:
            return new ASTLPAREN(TokenType.LPAREN, tokenSource, beginOffset, endOffset);
            case RPAREN:
            return new ASTRPAREN(TokenType.RPAREN, tokenSource, beginOffset, endOffset);
            case LBRACE:
            return new ASTLBRACE(TokenType.LBRACE, tokenSource, beginOffset, endOffset);
            case RBRACE:
            return new ASTRBRACE(TokenType.RBRACE, tokenSource, beginOffset, endOffset);
            case LBRACKET:
            return new ASTLBRACKET(TokenType.LBRACKET, tokenSource, beginOffset, endOffset);
            case RBRACKET:
            return new ASTRBRACKET(TokenType.RBRACKET, tokenSource, beginOffset, endOffset);
            case COMMA:
            return new ASTCOMMA(TokenType.COMMA, tokenSource, beginOffset, endOffset);
            case SEMICOLON:
            return new ASTSEMICOLON(TokenType.SEMICOLON, tokenSource, beginOffset, endOffset);
            case DOT:
            return new ASTDOT(TokenType.DOT, tokenSource, beginOffset, endOffset);
            case ASTERISK:
            return new ASTASTERISK(TokenType.ASTERISK, tokenSource, beginOffset, endOffset);
            case BANG:
            return new ASTBANG(TokenType.BANG, tokenSource, beginOffset, endOffset);
            case COLON:
            return new ASTCOLON(TokenType.COLON, tokenSource, beginOffset, endOffset);
            case CONCAT:
            return new ASTCONCAT(TokenType.CONCAT, tokenSource, beginOffset, endOffset);
            case EQ:
            return new ASTEQ(TokenType.EQ, tokenSource, beginOffset, endOffset);
            case GE:
            return new ASTGE(TokenType.GE, tokenSource, beginOffset, endOffset);
            case GT:
            return new ASTGT(TokenType.GT, tokenSource, beginOffset, endOffset);
            case LE:
            return new ASTLE(TokenType.LE, tokenSource, beginOffset, endOffset);
            case LT:
            return new ASTLT(TokenType.LT, tokenSource, beginOffset, endOffset);
            case MINUS:
            return new ASTMINUS(TokenType.MINUS, tokenSource, beginOffset, endOffset);
            case NE:
            return new ASTNE(TokenType.NE, tokenSource, beginOffset, endOffset);
            case PLUS:
            return new ASTPLUS(TokenType.PLUS, tokenSource, beginOffset, endOffset);
            case SOLIDUS:
            return new ASTSOLIDUS(TokenType.SOLIDUS, tokenSource, beginOffset, endOffset);
            case ATSIGN:
            return new ASTATSIGN(TokenType.ATSIGN, tokenSource, beginOffset, endOffset);
            case ID:
            return new ASTID(TokenType.ID, tokenSource, beginOffset, endOffset);
            case QUOTED_ID:
            return new ASTQUOTED_ID(TokenType.QUOTED_ID, tokenSource, beginOffset, endOffset);
            case AMP_QUOTED_ID:
            return new ASTAMP_QUOTED_ID(TokenType.AMP_QUOTED_ID, tokenSource, beginOffset, endOffset);
            case AMP_UNQUOTED_ID:
            return new ASTAMP_UNQUOTED_ID(TokenType.AMP_UNQUOTED_ID, tokenSource, beginOffset, endOffset);
            case UNSIGNED_INTEGER_LITERAL:
            return new ASTUNSIGNED_INTEGER_LITERAL(TokenType.UNSIGNED_INTEGER_LITERAL, tokenSource, beginOffset, endOffset);
            case APPROX_NUMERIC_LITERAL:
            return new ASTAPPROX_NUMERIC_LITERAL(TokenType.APPROX_NUMERIC_LITERAL, tokenSource, beginOffset, endOffset);
            case DECIMAL_NUMERIC_LITERAL:
            return new ASTDECIMAL_NUMERIC_LITERAL(TokenType.DECIMAL_NUMERIC_LITERAL, tokenSource, beginOffset, endOffset);
            case FLOATING_POINT_LITERAL:
            return new ASTFLOATING_POINT_LITERAL(TokenType.FLOATING_POINT_LITERAL, tokenSource, beginOffset, endOffset);
            case STRING:
            return new ASTSTRING(TokenType.STRING, tokenSource, beginOffset, endOffset);
            case SINGLE_QUOTED_STRING:
            return new ASTSINGLE_QUOTED_STRING(TokenType.SINGLE_QUOTED_STRING, tokenSource, beginOffset, endOffset);
            case DOUBLE_QUOTED_STRING:
            return new ASTDOUBLE_QUOTED_STRING(TokenType.DOUBLE_QUOTED_STRING, tokenSource, beginOffset, endOffset);
            case INVALID:
            return new InvalidToken(tokenSource, beginOffset, endOffset);
            default:
            return new Token(type, tokenSource, beginOffset, endOffset);
        }
    }

    public String getLocation() {
        return getInputSource()+":"+getBeginLine()+":"+getBeginColumn();
    }

    public void setChild(int i, Node n) {
        throw new UnsupportedOperationException();
    }

    public void addChild(Node n) {
        throw new UnsupportedOperationException();
    }

    public void addChild(int i, Node n) {
        throw new UnsupportedOperationException();
    }

    public Node removeChild(int i) {
        throw new UnsupportedOperationException();
    }

    public final int indexOf(Node n) {
        return-1;
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent= parent;
    }

    public final int getChildCount() {
        return 0;
    }

    public final Node getChild(int i) {
        return null;
    }

    public final List<Node> children() {
        return java.util.Collections.emptyList();
    }

}
