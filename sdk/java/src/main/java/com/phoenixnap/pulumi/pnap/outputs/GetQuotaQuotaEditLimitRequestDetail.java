// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.phoenixnap.pulumi.pnap.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetQuotaQuotaEditLimitRequestDetail {
    /**
     * @return The new limit that is requested.
     * 
     */
    private Integer limit;
    /**
     * @return The reason for changing the limit.
     * 
     */
    private String reason;
    /**
     * @return The point in time the request was submitted.
     * 
     */
    private String requestedOn;

    private GetQuotaQuotaEditLimitRequestDetail() {}
    /**
     * @return The new limit that is requested.
     * 
     */
    public Integer limit() {
        return this.limit;
    }
    /**
     * @return The reason for changing the limit.
     * 
     */
    public String reason() {
        return this.reason;
    }
    /**
     * @return The point in time the request was submitted.
     * 
     */
    public String requestedOn() {
        return this.requestedOn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetQuotaQuotaEditLimitRequestDetail defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer limit;
        private String reason;
        private String requestedOn;
        public Builder() {}
        public Builder(GetQuotaQuotaEditLimitRequestDetail defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.limit = defaults.limit;
    	      this.reason = defaults.reason;
    	      this.requestedOn = defaults.requestedOn;
        }

        @CustomType.Setter
        public Builder limit(Integer limit) {
            if (limit == null) {
              throw new MissingRequiredPropertyException("GetQuotaQuotaEditLimitRequestDetail", "limit");
            }
            this.limit = limit;
            return this;
        }
        @CustomType.Setter
        public Builder reason(String reason) {
            if (reason == null) {
              throw new MissingRequiredPropertyException("GetQuotaQuotaEditLimitRequestDetail", "reason");
            }
            this.reason = reason;
            return this;
        }
        @CustomType.Setter
        public Builder requestedOn(String requestedOn) {
            if (requestedOn == null) {
              throw new MissingRequiredPropertyException("GetQuotaQuotaEditLimitRequestDetail", "requestedOn");
            }
            this.requestedOn = requestedOn;
            return this;
        }
        public GetQuotaQuotaEditLimitRequestDetail build() {
            final var _resultValue = new GetQuotaQuotaEditLimitRequestDetail();
            _resultValue.limit = limit;
            _resultValue.reason = reason;
            _resultValue.requestedOn = requestedOn;
            return _resultValue;
        }
    }
}