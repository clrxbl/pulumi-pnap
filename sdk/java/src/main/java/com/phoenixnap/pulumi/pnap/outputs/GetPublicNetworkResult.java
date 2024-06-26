// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.phoenixnap.pulumi.pnap.outputs;

import com.phoenixnap.pulumi.pnap.outputs.GetPublicNetworkIpBlock;
import com.phoenixnap.pulumi.pnap.outputs.GetPublicNetworkMembership;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetPublicNetworkResult {
    /**
     * @return Date and time when this public network was created.
     * 
     */
    private String createdOn;
    /**
     * @return The description of this public network.
     * 
     */
    private String description;
    /**
     * @return The IP Block identifier.
     * 
     */
    private String id;
    /**
     * @return A list of IP Blocks that are associated with this public network.
     * 
     */
    private List<GetPublicNetworkIpBlock> ipBlocks;
    /**
     * @return The location of this public network.
     * 
     */
    private String location;
    /**
     * @return A list of resources that are members of this public network.
     * 
     */
    private List<GetPublicNetworkMembership> memberships;
    /**
     * @return The friendly name of this public network.
     * 
     */
    private String name;
    /**
     * @return The status of the public network.
     * 
     */
    private String status;
    private Integer vlanId;

    private GetPublicNetworkResult() {}
    /**
     * @return Date and time when this public network was created.
     * 
     */
    public String createdOn() {
        return this.createdOn;
    }
    /**
     * @return The description of this public network.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The IP Block identifier.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return A list of IP Blocks that are associated with this public network.
     * 
     */
    public List<GetPublicNetworkIpBlock> ipBlocks() {
        return this.ipBlocks;
    }
    /**
     * @return The location of this public network.
     * 
     */
    public String location() {
        return this.location;
    }
    /**
     * @return A list of resources that are members of this public network.
     * 
     */
    public List<GetPublicNetworkMembership> memberships() {
        return this.memberships;
    }
    /**
     * @return The friendly name of this public network.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The status of the public network.
     * 
     */
    public String status() {
        return this.status;
    }
    public Integer vlanId() {
        return this.vlanId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPublicNetworkResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String createdOn;
        private String description;
        private String id;
        private List<GetPublicNetworkIpBlock> ipBlocks;
        private String location;
        private List<GetPublicNetworkMembership> memberships;
        private String name;
        private String status;
        private Integer vlanId;
        public Builder() {}
        public Builder(GetPublicNetworkResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createdOn = defaults.createdOn;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.ipBlocks = defaults.ipBlocks;
    	      this.location = defaults.location;
    	      this.memberships = defaults.memberships;
    	      this.name = defaults.name;
    	      this.status = defaults.status;
    	      this.vlanId = defaults.vlanId;
        }

        @CustomType.Setter
        public Builder createdOn(String createdOn) {
            if (createdOn == null) {
              throw new MissingRequiredPropertyException("GetPublicNetworkResult", "createdOn");
            }
            this.createdOn = createdOn;
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetPublicNetworkResult", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetPublicNetworkResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder ipBlocks(List<GetPublicNetworkIpBlock> ipBlocks) {
            if (ipBlocks == null) {
              throw new MissingRequiredPropertyException("GetPublicNetworkResult", "ipBlocks");
            }
            this.ipBlocks = ipBlocks;
            return this;
        }
        public Builder ipBlocks(GetPublicNetworkIpBlock... ipBlocks) {
            return ipBlocks(List.of(ipBlocks));
        }
        @CustomType.Setter
        public Builder location(String location) {
            if (location == null) {
              throw new MissingRequiredPropertyException("GetPublicNetworkResult", "location");
            }
            this.location = location;
            return this;
        }
        @CustomType.Setter
        public Builder memberships(List<GetPublicNetworkMembership> memberships) {
            if (memberships == null) {
              throw new MissingRequiredPropertyException("GetPublicNetworkResult", "memberships");
            }
            this.memberships = memberships;
            return this;
        }
        public Builder memberships(GetPublicNetworkMembership... memberships) {
            return memberships(List.of(memberships));
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetPublicNetworkResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            if (status == null) {
              throw new MissingRequiredPropertyException("GetPublicNetworkResult", "status");
            }
            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder vlanId(Integer vlanId) {
            if (vlanId == null) {
              throw new MissingRequiredPropertyException("GetPublicNetworkResult", "vlanId");
            }
            this.vlanId = vlanId;
            return this;
        }
        public GetPublicNetworkResult build() {
            final var _resultValue = new GetPublicNetworkResult();
            _resultValue.createdOn = createdOn;
            _resultValue.description = description;
            _resultValue.id = id;
            _resultValue.ipBlocks = ipBlocks;
            _resultValue.location = location;
            _resultValue.memberships = memberships;
            _resultValue.name = name;
            _resultValue.status = status;
            _resultValue.vlanId = vlanId;
            return _resultValue;
        }
    }
}
