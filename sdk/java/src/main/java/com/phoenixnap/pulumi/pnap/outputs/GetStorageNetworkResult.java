// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.phoenixnap.pulumi.pnap.outputs;

import com.phoenixnap.pulumi.pnap.outputs.GetStorageNetworkVolume;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetStorageNetworkResult {
    /**
     * @return Date and time when this volume was created.
     * 
     */
    private String createdOn;
    /**
     * @return Date and time of the initial request for volume deletion.
     * 
     */
    private String deleteRequestedOn;
    /**
     * @return Volume description.
     * 
     */
    private String description;
    /**
     * @return The unique id of the tag.
     * 
     */
    private String id;
    /**
     * @return IP of the storage network
     * 
     */
    private List<String> ips;
    /**
     * @return The location of this storage network.
     * * ` network_id  `- ID of network the storage belongs to.
     * 
     */
    private String location;
    /**
     * @return The name of the tag.
     * 
     */
    private String name;
    private String networkId;
    /**
     * @return Volume&#39;s status.
     * 
     */
    private String status;
    /**
     * @return Volume for the storage network.
     * 
     */
    private List<GetStorageNetworkVolume> volumes;

    private GetStorageNetworkResult() {}
    /**
     * @return Date and time when this volume was created.
     * 
     */
    public String createdOn() {
        return this.createdOn;
    }
    /**
     * @return Date and time of the initial request for volume deletion.
     * 
     */
    public String deleteRequestedOn() {
        return this.deleteRequestedOn;
    }
    /**
     * @return Volume description.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The unique id of the tag.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return IP of the storage network
     * 
     */
    public List<String> ips() {
        return this.ips;
    }
    /**
     * @return The location of this storage network.
     * * ` network_id  `- ID of network the storage belongs to.
     * 
     */
    public String location() {
        return this.location;
    }
    /**
     * @return The name of the tag.
     * 
     */
    public String name() {
        return this.name;
    }
    public String networkId() {
        return this.networkId;
    }
    /**
     * @return Volume&#39;s status.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return Volume for the storage network.
     * 
     */
    public List<GetStorageNetworkVolume> volumes() {
        return this.volumes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetStorageNetworkResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String createdOn;
        private String deleteRequestedOn;
        private String description;
        private String id;
        private List<String> ips;
        private String location;
        private String name;
        private String networkId;
        private String status;
        private List<GetStorageNetworkVolume> volumes;
        public Builder() {}
        public Builder(GetStorageNetworkResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createdOn = defaults.createdOn;
    	      this.deleteRequestedOn = defaults.deleteRequestedOn;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.ips = defaults.ips;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.networkId = defaults.networkId;
    	      this.status = defaults.status;
    	      this.volumes = defaults.volumes;
        }

        @CustomType.Setter
        public Builder createdOn(String createdOn) {
            if (createdOn == null) {
              throw new MissingRequiredPropertyException("GetStorageNetworkResult", "createdOn");
            }
            this.createdOn = createdOn;
            return this;
        }
        @CustomType.Setter
        public Builder deleteRequestedOn(String deleteRequestedOn) {
            if (deleteRequestedOn == null) {
              throw new MissingRequiredPropertyException("GetStorageNetworkResult", "deleteRequestedOn");
            }
            this.deleteRequestedOn = deleteRequestedOn;
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetStorageNetworkResult", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetStorageNetworkResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder ips(List<String> ips) {
            if (ips == null) {
              throw new MissingRequiredPropertyException("GetStorageNetworkResult", "ips");
            }
            this.ips = ips;
            return this;
        }
        public Builder ips(String... ips) {
            return ips(List.of(ips));
        }
        @CustomType.Setter
        public Builder location(String location) {
            if (location == null) {
              throw new MissingRequiredPropertyException("GetStorageNetworkResult", "location");
            }
            this.location = location;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetStorageNetworkResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder networkId(String networkId) {
            if (networkId == null) {
              throw new MissingRequiredPropertyException("GetStorageNetworkResult", "networkId");
            }
            this.networkId = networkId;
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            if (status == null) {
              throw new MissingRequiredPropertyException("GetStorageNetworkResult", "status");
            }
            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder volumes(List<GetStorageNetworkVolume> volumes) {
            if (volumes == null) {
              throw new MissingRequiredPropertyException("GetStorageNetworkResult", "volumes");
            }
            this.volumes = volumes;
            return this;
        }
        public Builder volumes(GetStorageNetworkVolume... volumes) {
            return volumes(List.of(volumes));
        }
        public GetStorageNetworkResult build() {
            final var _resultValue = new GetStorageNetworkResult();
            _resultValue.createdOn = createdOn;
            _resultValue.deleteRequestedOn = deleteRequestedOn;
            _resultValue.description = description;
            _resultValue.id = id;
            _resultValue.ips = ips;
            _resultValue.location = location;
            _resultValue.name = name;
            _resultValue.networkId = networkId;
            _resultValue.status = status;
            _resultValue.volumes = volumes;
            return _resultValue;
        }
    }
}
