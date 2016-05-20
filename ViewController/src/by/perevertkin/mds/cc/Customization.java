package by.perevertkin.mds.cc;

import oracle.mds.core.MetadataObject;
import oracle.mds.core.RestrictedSession;
import oracle.mds.cust.CacheHint;
import oracle.mds.cust.CustomizationClass;

public class Customization extends CustomizationClass {
    private static final String DEFAULT_LAYER_NAME = "industry";
    private String mLayerName = DEFAULT_LAYER_NAME;

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
        // This needs to return the appropriate value at runtime.
        return new String[] { "financial" };
    }

    @Override
    protected String generateIDPrefix(RestrictedSession restrictedSession, MetadataObject metadataObject) {
        return "I";
    }
}
