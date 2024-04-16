// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.phoenixnap.pulumi.pnap.outputs;

import com.phoenixnap.pulumi.pnap.outputs.StorageNetworkVolumeVolumeTagTagAssignment;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class StorageNetworkVolumeVolumeTag {
    /**
     * @return Tag to set to the volume.
     * 
     */
    private @Nullable StorageNetworkVolumeVolumeTagTagAssignment tagAssignment;

    private StorageNetworkVolumeVolumeTag() {}
    /**
     * @return Tag to set to the volume.
     * 
     */
    public Optional<StorageNetworkVolumeVolumeTagTagAssignment> tagAssignment() {
        return Optional.ofNullable(this.tagAssignment);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StorageNetworkVolumeVolumeTag defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable StorageNetworkVolumeVolumeTagTagAssignment tagAssignment;
        public Builder() {}
        public Builder(StorageNetworkVolumeVolumeTag defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.tagAssignment = defaults.tagAssignment;
        }

        @CustomType.Setter
        public Builder tagAssignment(@Nullable StorageNetworkVolumeVolumeTagTagAssignment tagAssignment) {

            this.tagAssignment = tagAssignment;
            return this;
        }
        public StorageNetworkVolumeVolumeTag build() {
            final var _resultValue = new StorageNetworkVolumeVolumeTag();
            _resultValue.tagAssignment = tagAssignment;
            return _resultValue;
        }
    }
}
