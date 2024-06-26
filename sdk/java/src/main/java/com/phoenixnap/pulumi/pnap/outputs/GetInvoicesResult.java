// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.phoenixnap.pulumi.pnap.outputs;

import com.phoenixnap.pulumi.pnap.outputs.GetInvoicesPaginatedInvoice;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetInvoicesResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Maximum number of items in the page (actual returned length can be less).
     * 
     */
    private @Nullable Integer limit;
    /**
     * @return A user-friendly reference number assigned to the invoice.
     * 
     */
    private @Nullable String number;
    /**
     * @return The number of returned items skipped.
     * 
     */
    private @Nullable Integer offset;
    /**
     * @return The paginated list of invoices.
     * 
     */
    private List<GetInvoicesPaginatedInvoice> paginatedInvoices;
    private @Nullable String sentOnFrom;
    private @Nullable String sentOnTo;
    private @Nullable String sortDirection;
    private @Nullable String sortField;
    /**
     * @return The status of the invoice.
     * 
     */
    private @Nullable String status;

    private GetInvoicesResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Maximum number of items in the page (actual returned length can be less).
     * 
     */
    public Optional<Integer> limit() {
        return Optional.ofNullable(this.limit);
    }
    /**
     * @return A user-friendly reference number assigned to the invoice.
     * 
     */
    public Optional<String> number() {
        return Optional.ofNullable(this.number);
    }
    /**
     * @return The number of returned items skipped.
     * 
     */
    public Optional<Integer> offset() {
        return Optional.ofNullable(this.offset);
    }
    /**
     * @return The paginated list of invoices.
     * 
     */
    public List<GetInvoicesPaginatedInvoice> paginatedInvoices() {
        return this.paginatedInvoices;
    }
    public Optional<String> sentOnFrom() {
        return Optional.ofNullable(this.sentOnFrom);
    }
    public Optional<String> sentOnTo() {
        return Optional.ofNullable(this.sentOnTo);
    }
    public Optional<String> sortDirection() {
        return Optional.ofNullable(this.sortDirection);
    }
    public Optional<String> sortField() {
        return Optional.ofNullable(this.sortField);
    }
    /**
     * @return The status of the invoice.
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInvoicesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private @Nullable Integer limit;
        private @Nullable String number;
        private @Nullable Integer offset;
        private List<GetInvoicesPaginatedInvoice> paginatedInvoices;
        private @Nullable String sentOnFrom;
        private @Nullable String sentOnTo;
        private @Nullable String sortDirection;
        private @Nullable String sortField;
        private @Nullable String status;
        public Builder() {}
        public Builder(GetInvoicesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.limit = defaults.limit;
    	      this.number = defaults.number;
    	      this.offset = defaults.offset;
    	      this.paginatedInvoices = defaults.paginatedInvoices;
    	      this.sentOnFrom = defaults.sentOnFrom;
    	      this.sentOnTo = defaults.sentOnTo;
    	      this.sortDirection = defaults.sortDirection;
    	      this.sortField = defaults.sortField;
    	      this.status = defaults.status;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetInvoicesResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder limit(@Nullable Integer limit) {

            this.limit = limit;
            return this;
        }
        @CustomType.Setter
        public Builder number(@Nullable String number) {

            this.number = number;
            return this;
        }
        @CustomType.Setter
        public Builder offset(@Nullable Integer offset) {

            this.offset = offset;
            return this;
        }
        @CustomType.Setter
        public Builder paginatedInvoices(List<GetInvoicesPaginatedInvoice> paginatedInvoices) {
            if (paginatedInvoices == null) {
              throw new MissingRequiredPropertyException("GetInvoicesResult", "paginatedInvoices");
            }
            this.paginatedInvoices = paginatedInvoices;
            return this;
        }
        public Builder paginatedInvoices(GetInvoicesPaginatedInvoice... paginatedInvoices) {
            return paginatedInvoices(List.of(paginatedInvoices));
        }
        @CustomType.Setter
        public Builder sentOnFrom(@Nullable String sentOnFrom) {

            this.sentOnFrom = sentOnFrom;
            return this;
        }
        @CustomType.Setter
        public Builder sentOnTo(@Nullable String sentOnTo) {

            this.sentOnTo = sentOnTo;
            return this;
        }
        @CustomType.Setter
        public Builder sortDirection(@Nullable String sortDirection) {

            this.sortDirection = sortDirection;
            return this;
        }
        @CustomType.Setter
        public Builder sortField(@Nullable String sortField) {

            this.sortField = sortField;
            return this;
        }
        @CustomType.Setter
        public Builder status(@Nullable String status) {

            this.status = status;
            return this;
        }
        public GetInvoicesResult build() {
            final var _resultValue = new GetInvoicesResult();
            _resultValue.id = id;
            _resultValue.limit = limit;
            _resultValue.number = number;
            _resultValue.offset = offset;
            _resultValue.paginatedInvoices = paginatedInvoices;
            _resultValue.sentOnFrom = sentOnFrom;
            _resultValue.sentOnTo = sentOnTo;
            _resultValue.sortDirection = sortDirection;
            _resultValue.sortField = sortField;
            _resultValue.status = status;
            return _resultValue;
        }
    }
}
