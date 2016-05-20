package by.perevertkin.mds.cc;

import oracle.adf.share.ADFContext;

import oracle.adf.share.security.SecurityContext;

import oracle.mds.core.MetadataObject;
import oracle.mds.core.RestrictedSession;
import oracle.mds.cust.CacheHint;
import oracle.mds.cust.CustomizationClass;

public class Customization extends CustomizationClass {
    private String mLayerName;

    public Customization() {
        super();
    }

    @Override
    public CacheHint getCacheHint() {
        return CacheHint.ALL_USERS;
    }

    @Override
    public String getName() {
        return mLayerName;
    }

    @Override
    public String[] getValue(RestrictedSession restrictedSession, MetadataObject metadataObject) {
            ADFContext adfCtx = ADFContext.getCurrent();  
            SecurityContext secCntx = adfCtx.getSecurityContext();  
            String user = secCntx.getUserName();  
        return new String[] { user };
    }

}
