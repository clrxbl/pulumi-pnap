// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.phoenixnap.pulumi.pnap.outputs;

import com.phoenixnap.pulumi.pnap.outputs.ServerNetworkConfigurationIpBlocksConfigurationIpBlockServerIpBlock;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServerNetworkConfigurationIpBlocksConfigurationIpBlock {
    private @Nullable ServerNetworkConfigurationIpBlocksConfigurationIpBlockServerIpBlock serverIpBlock;

    private ServerNetworkConfigurationIpBlocksConfigurationIpBlock() {}
    public Optional<ServerNetworkConfigurationIpBlocksConfigurationIpBlockServerIpBlock> serverIpBlock() {
        return Optional.ofNullable(this.serverIpBlock);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServerNetworkConfigurationIpBlocksConfigurationIpBlock defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable ServerNetworkConfigurationIpBlocksConfigurationIpBlockServerIpBlock serverIpBlock;
        public Builder() {}
        public Builder(ServerNetworkConfigurationIpBlocksConfigurationIpBlock defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.serverIpBlock = defaults.serverIpBlock;
        }

        @CustomType.Setter
        public Builder serverIpBlock(@Nullable ServerNetworkConfigurationIpBlocksConfigurationIpBlockServerIpBlock serverIpBlock) {

            this.serverIpBlock = serverIpBlock;
            return this;
        }
        public ServerNetworkConfigurationIpBlocksConfigurationIpBlock build() {
            final var _resultValue = new ServerNetworkConfigurationIpBlocksConfigurationIpBlock();
            _resultValue.serverIpBlock = serverIpBlock;
            return _resultValue;
        }
    }
}
