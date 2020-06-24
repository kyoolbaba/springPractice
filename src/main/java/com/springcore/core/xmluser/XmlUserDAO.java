package com.springcore.core.xmluser;

public class XmlUserDAO {
    XmlJDBCConnection xmljdbcConnection;

    public XmlJDBCConnection getXmljdbcConnection() {
        return xmljdbcConnection;
    }

    public void setXmljdbcConnection(XmlJDBCConnection xmljdbcConnection) {
        this.xmljdbcConnection = xmljdbcConnection;
    }
}
