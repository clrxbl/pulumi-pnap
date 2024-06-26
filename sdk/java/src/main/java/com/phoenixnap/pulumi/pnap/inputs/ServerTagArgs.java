// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.phoenixnap.pulumi.pnap.inputs;

import com.phoenixnap.pulumi.pnap.inputs.ServerTagTagAssignmentArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServerTagArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServerTagArgs Empty = new ServerTagArgs();

    @Import(name="tagAssignment")
    private @Nullable Output<ServerTagTagAssignmentArgs> tagAssignment;

    public Optional<Output<ServerTagTagAssignmentArgs>> tagAssignment() {
        return Optional.ofNullable(this.tagAssignment);
    }

    private ServerTagArgs() {}

    private ServerTagArgs(ServerTagArgs $) {
        this.tagAssignment = $.tagAssignment;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServerTagArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServerTagArgs $;

        public Builder() {
            $ = new ServerTagArgs();
        }

        public Builder(ServerTagArgs defaults) {
            $ = new ServerTagArgs(Objects.requireNonNull(defaults));
        }

        public Builder tagAssignment(@Nullable Output<ServerTagTagAssignmentArgs> tagAssignment) {
            $.tagAssignment = tagAssignment;
            return this;
        }

        public Builder tagAssignment(ServerTagTagAssignmentArgs tagAssignment) {
            return tagAssignment(Output.of(tagAssignment));
        }

        public ServerTagArgs build() {
            return $;
        }
    }

}
