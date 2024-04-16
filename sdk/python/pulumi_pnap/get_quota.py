# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs

__all__ = [
    'GetQuotaResult',
    'AwaitableGetQuotaResult',
    'get_quota',
    'get_quota_output',
]

@pulumi.output_type
class GetQuotaResult:
    """
    A collection of values returned by getQuota.
    """
    def __init__(__self__, description=None, id=None, limit=None, name=None, quota_edit_limit_request_details=None, status=None, unit=None, used=None):
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if limit and not isinstance(limit, int):
            raise TypeError("Expected argument 'limit' to be a int")
        pulumi.set(__self__, "limit", limit)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if quota_edit_limit_request_details and not isinstance(quota_edit_limit_request_details, list):
            raise TypeError("Expected argument 'quota_edit_limit_request_details' to be a list")
        pulumi.set(__self__, "quota_edit_limit_request_details", quota_edit_limit_request_details)
        if status and not isinstance(status, str):
            raise TypeError("Expected argument 'status' to be a str")
        pulumi.set(__self__, "status", status)
        if unit and not isinstance(unit, str):
            raise TypeError("Expected argument 'unit' to be a str")
        pulumi.set(__self__, "unit", unit)
        if used and not isinstance(used, int):
            raise TypeError("Expected argument 'used' to be a int")
        pulumi.set(__self__, "used", used)

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        The Quota description.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The ID of the Quota.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def limit(self) -> int:
        """
        The new limit that is requested.
        """
        return pulumi.get(self, "limit")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        The name of the Quota.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="quotaEditLimitRequestDetails")
    def quota_edit_limit_request_details(self) -> Sequence['outputs.GetQuotaQuotaEditLimitRequestDetailResult']:
        """
        List of requests to change the limit on a Quota.
        """
        return pulumi.get(self, "quota_edit_limit_request_details")

    @property
    @pulumi.getter
    def status(self) -> str:
        """
        The status of the Quota.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter
    def unit(self) -> str:
        """
        Unit of the Quota type.
        """
        return pulumi.get(self, "unit")

    @property
    @pulumi.getter
    def used(self) -> int:
        """
        The Quota used expressed as a number.
        """
        return pulumi.get(self, "used")


class AwaitableGetQuotaResult(GetQuotaResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetQuotaResult(
            description=self.description,
            id=self.id,
            limit=self.limit,
            name=self.name,
            quota_edit_limit_request_details=self.quota_edit_limit_request_details,
            status=self.status,
            unit=self.unit,
            used=self.used)


def get_quota(id: Optional[str] = None,
              name: Optional[str] = None,
              opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetQuotaResult:
    """
    Provides a phoenixNAP Quota datasource. This can be used to read Quotas.

    ## Example Usage

    Fetch a Quota by name and show it's details in alphabetical order

    ```python
    import pulumi
    import pulumi_pnap as pnap

    test = pnap.get_quota(name="Public IPs")
    pulumi.export("quota", test)
    ```


    :param str id: The ID of the Quota.
    :param str name: The name of the Quota.
    """
    __args__ = dict()
    __args__['id'] = id
    __args__['name'] = name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('pnap:index/getQuota:getQuota', __args__, opts=opts, typ=GetQuotaResult).value

    return AwaitableGetQuotaResult(
        description=pulumi.get(__ret__, 'description'),
        id=pulumi.get(__ret__, 'id'),
        limit=pulumi.get(__ret__, 'limit'),
        name=pulumi.get(__ret__, 'name'),
        quota_edit_limit_request_details=pulumi.get(__ret__, 'quota_edit_limit_request_details'),
        status=pulumi.get(__ret__, 'status'),
        unit=pulumi.get(__ret__, 'unit'),
        used=pulumi.get(__ret__, 'used'))


@_utilities.lift_output_func(get_quota)
def get_quota_output(id: Optional[pulumi.Input[Optional[str]]] = None,
                     name: Optional[pulumi.Input[Optional[str]]] = None,
                     opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetQuotaResult]:
    """
    Provides a phoenixNAP Quota datasource. This can be used to read Quotas.

    ## Example Usage

    Fetch a Quota by name and show it's details in alphabetical order

    ```python
    import pulumi
    import pulumi_pnap as pnap

    test = pnap.get_quota(name="Public IPs")
    pulumi.export("quota", test)
    ```


    :param str id: The ID of the Quota.
    :param str name: The name of the Quota.
    """
    ...