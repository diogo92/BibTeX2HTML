<#list UnpublishedList as UnpublishedData>
	<div>
		<ul>
			<li><strong>Key:</strong> ${UnpublishedData.citationKey}</li>
			<li>${UnpublishedData.author}
				<#if UnpublishedData.year??> ${UnpublishedData.year}.</#if>
				<#if UnpublishedData.month??>: ${UnpublishedData.month}.</#if>
				${UnpublishedData.title}
				${UnpublishedData.note}
				<#if UnpublishedData.key??> ${UnpublishedData.key}.</#if>
				<#if UnpublishedData.crossref??> ${UnpublishedData.crossref}.</#if>
			</li>
		</ul>
	</div>
</#list>