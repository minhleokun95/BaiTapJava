
package data;

import java.io.Serializable;

public abstract class AssetID implements Serializable {

    protected String assetID;

    public AssetID() {
    }

    public AssetID(String assetID) {
        this.assetID = assetID;
    }

    public String getAssetID() {
        return assetID;
    }
    
    protected void createAssetID(String id) {
        this.assetID = id;
    }


    protected void updateAssetID(String id) {
        this.assetID = id;
    }
    
    @Override
    public String toString() {
        return "Asset ID = " + assetID;
    }

    @Override
    public boolean equals(Object obj) {
        return this.assetID.equals(((AssetID) obj).getAssetID());
    }

}
