// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace PhoenixNAP.Pulumi.Pnap
{
    public static class GetInvoices
    {
        /// <summary>
        /// Provides a phoenixNAP invoices datasource. This can be used to read invoices.
        /// 
        /// 
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// Fetch invoices by status and date sent and show their details.
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Pnap = Pulumi.Pnap;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var query_C = Pnap.GetInvoices.Invoke(new()
        ///     {
        ///         Status = "PAID",
        ///         SentOnFrom = "2020-04-13T00:00:00.000Z",
        ///         SentOnTo = "2022-04-13T00:00:00.000Z",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["invoices"] = query_C.Apply(query_C =&gt; query_C.Apply(getInvoicesResult =&gt; getInvoicesResult.PaginatedInvoices)),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetInvoicesResult> InvokeAsync(GetInvoicesArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetInvoicesResult>("pnap:index/getInvoices:getInvoices", args ?? new GetInvoicesArgs(), options.WithDefaults());

        /// <summary>
        /// Provides a phoenixNAP invoices datasource. This can be used to read invoices.
        /// 
        /// 
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// Fetch invoices by status and date sent and show their details.
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Pnap = Pulumi.Pnap;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var query_C = Pnap.GetInvoices.Invoke(new()
        ///     {
        ///         Status = "PAID",
        ///         SentOnFrom = "2020-04-13T00:00:00.000Z",
        ///         SentOnTo = "2022-04-13T00:00:00.000Z",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["invoices"] = query_C.Apply(query_C =&gt; query_C.Apply(getInvoicesResult =&gt; getInvoicesResult.PaginatedInvoices)),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetInvoicesResult> Invoke(GetInvoicesInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetInvoicesResult>("pnap:index/getInvoices:getInvoices", args ?? new GetInvoicesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetInvoicesArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The limit of the number of results returned. The number of records returned may be smaller than the limit.
        /// </summary>
        [Input("limit")]
        public int? Limit { get; set; }

        /// <summary>
        /// A user-friendly reference number assigned to the invoice.
        /// </summary>
        [Input("number")]
        public string? Number { get; set; }

        /// <summary>
        /// The number of items to skip in the results.
        /// </summary>
        [Input("offset")]
        public int? Offset { get; set; }

        /// <summary>
        /// Minimum value to filter invoices by sent on date.
        /// </summary>
        [Input("sentOnFrom")]
        public string? SentOnFrom { get; set; }

        /// <summary>
        /// Maximum value to filter invoices by sent on date.
        /// </summary>
        [Input("sentOnTo")]
        public string? SentOnTo { get; set; }

        /// <summary>
        /// Sort given field depending on the desired direction. The following values are allowed: `ASC`, `DESC`.
        /// </summary>
        [Input("sortDirection")]
        public string? SortDirection { get; set; }

        /// <summary>
        /// If a sort field is requested, pagination will be done after sorting. The following values are allowed: `number`, `sentOn`, `dueDate`, `amount`, `outstandingAmount`.
        /// </summary>
        [Input("sortField")]
        public string? SortField { get; set; }

        /// <summary>
        /// Payment status of the invoice. The following values are allowed: `PAID`, `UNPAID`, `OVERDUE`, `PAYMENT_PROCESSING`
        /// </summary>
        [Input("status")]
        public string? Status { get; set; }

        public GetInvoicesArgs()
        {
        }
        public static new GetInvoicesArgs Empty => new GetInvoicesArgs();
    }

    public sealed class GetInvoicesInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The limit of the number of results returned. The number of records returned may be smaller than the limit.
        /// </summary>
        [Input("limit")]
        public Input<int>? Limit { get; set; }

        /// <summary>
        /// A user-friendly reference number assigned to the invoice.
        /// </summary>
        [Input("number")]
        public Input<string>? Number { get; set; }

        /// <summary>
        /// The number of items to skip in the results.
        /// </summary>
        [Input("offset")]
        public Input<int>? Offset { get; set; }

        /// <summary>
        /// Minimum value to filter invoices by sent on date.
        /// </summary>
        [Input("sentOnFrom")]
        public Input<string>? SentOnFrom { get; set; }

        /// <summary>
        /// Maximum value to filter invoices by sent on date.
        /// </summary>
        [Input("sentOnTo")]
        public Input<string>? SentOnTo { get; set; }

        /// <summary>
        /// Sort given field depending on the desired direction. The following values are allowed: `ASC`, `DESC`.
        /// </summary>
        [Input("sortDirection")]
        public Input<string>? SortDirection { get; set; }

        /// <summary>
        /// If a sort field is requested, pagination will be done after sorting. The following values are allowed: `number`, `sentOn`, `dueDate`, `amount`, `outstandingAmount`.
        /// </summary>
        [Input("sortField")]
        public Input<string>? SortField { get; set; }

        /// <summary>
        /// Payment status of the invoice. The following values are allowed: `PAID`, `UNPAID`, `OVERDUE`, `PAYMENT_PROCESSING`
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public GetInvoicesInvokeArgs()
        {
        }
        public static new GetInvoicesInvokeArgs Empty => new GetInvoicesInvokeArgs();
    }


    [OutputType]
    public sealed class GetInvoicesResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Maximum number of items in the page (actual returned length can be less).
        /// </summary>
        public readonly int? Limit;
        /// <summary>
        /// A user-friendly reference number assigned to the invoice.
        /// </summary>
        public readonly string? Number;
        /// <summary>
        /// The number of returned items skipped.
        /// </summary>
        public readonly int? Offset;
        /// <summary>
        /// The paginated list of invoices.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetInvoicesPaginatedInvoiceResult> PaginatedInvoices;
        public readonly string? SentOnFrom;
        public readonly string? SentOnTo;
        public readonly string? SortDirection;
        public readonly string? SortField;
        /// <summary>
        /// The status of the invoice.
        /// </summary>
        public readonly string? Status;

        [OutputConstructor]
        private GetInvoicesResult(
            string id,

            int? limit,

            string? number,

            int? offset,

            ImmutableArray<Outputs.GetInvoicesPaginatedInvoiceResult> paginatedInvoices,

            string? sentOnFrom,

            string? sentOnTo,

            string? sortDirection,

            string? sortField,

            string? status)
        {
            Id = id;
            Limit = limit;
            Number = number;
            Offset = offset;
            PaginatedInvoices = paginatedInvoices;
            SentOnFrom = sentOnFrom;
            SentOnTo = sentOnTo;
            SortDirection = sortDirection;
            SortField = sortField;
            Status = status;
        }
    }
}
