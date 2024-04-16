// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.phoenixnap.pulumi.pnap.outputs;

import com.phoenixnap.pulumi.pnap.outputs.ServerNetworkConfigurationIpBlocksConfigurationIpBlock;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServerNetworkConfigurationIpBlocksConfiguration {
    /**
     * @return Determines the approach for configuring IP blocks for the server being provisioned. If `PURCHASE_NEW` is selected, the smallest supported range, depending on the operating system, is allocated to the server. The following values are allowed: `PURCHASE_NEW`, `USER_DEFINED`, `NONE`. Default value is `PURCHASE_NEW`.
     * 
     */
    private @Nullable String configurationType;
    /**
     * @return Used to specify the previously purchased IP blocks to assign to this server upon provisioning. Used alongside the `USER_DEFINED` configurationType. Must contain at most 1 item.
     * 
     * The `ip_blocks` block has field `server_ip_block`.
     * The `server_ip_block` block has 2 fields:
     * 
     */
    private @Nullable List<ServerNetworkConfigurationIpBlocksConfigurationIpBlock> ipBlocks;

    private ServerNetworkConfigurationIpBlocksConfiguration() {}
    /**
     * @return Determines the approach for configuring IP blocks for the server being provisioned. If `PURCHASE_NEW` is selected, the smallest supported range, depending on the operating system, is allocated to the server. The following values are allowed: `PURCHASE_NEW`, `USER_DEFINED`, `NONE`. Default value is `PURCHASE_NEW`.
     * 
     */
    public Optional<String> configurationType() {
        return Optional.ofNullable(this.configurationType);
    }
    /**
     * @return Used to specify the previously purchased IP blocks to assign to this server upon provisioning. Used alongside the `USER_DEFINED` configurationType. Must contain at most 1 item.
     * 
     * The `ip_blocks` block has field `server_ip_block`.
     * The `server_ip_block` block has 2 fields:
     * 
     */
    public List<ServerNetworkConfigurationIpBlocksConfigurationIpBlock> ipBlocks() {
        return this.ipBlocks == null ? List.of() : this.ipBlocks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServerNetworkConfigurationIpBlocksConfiguration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String configurationType;
        private @Nullable List<ServerNetworkConfigurationIpBlocksConfigurationIpBlock> ipBlocks;
        public Builder() {}
        public Builder(ServerNetworkConfigurationIpBlocksConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configurationType = defaults.configurationType;
    	      this.ipBlocks = defaults.ipBlocks;
        }

        @CustomType.Setter
        public Builder configurationType(@Nullable String configurationType) {

            this.configurationType = configurationType;
            return this;
        }
        @CustomType.Setter
        public Builder ipBlocks(@Nullable List<ServerNetworkConfigurationIpBlocksConfigurationIpBlock> ipBlocks) {

            this.ipBlocks = ipBlocks;
            return this;
        }
        public Builder ipBlocks(ServerNetworkConfigurationIpBlocksConfigurationIpBlock... ipBlocks) {
            return ipBlocks(List.of(ipBlocks));
        }
        public ServerNetworkConfigurationIpBlocksConfiguration build() {
            final var _resultValue = new ServerNetworkConfigurationIpBlocksConfiguration();
            _resultValue.configurationType = configurationType;
            _resultValue.ipBlocks = ipBlocks;
            return _resultValue;
        }
    }
}
