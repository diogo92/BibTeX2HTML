<#list TechreportList as TechreportData>
	<div>
		<ul>
			<li><strong>Key:</strong> ${TechreportData.citationKey}</li>
			<li><strong>Author:</strong> ${TechreportData.author}</li>
			<li><strong>Title:</strong> ${TechreportData.title}</li>
			<li><strong>Institution:</strong> ${TechreportData.institution}</li>
			<li><strong>Year:</strong> ${TechreportData.year}</li>
			<#if TechreportData.type??>
				<li><strong>Type:</strong> ${TechreportData.type}</li>
			</#if>
			<#if TechreportData.number??>
				<li><strong>Number:</strong> ${TechreportData.number}</li>
			</#if>
			<#if TechreportData.address??>
				<li><strong>Address:</strong> ${TechreportData.address}</li>
			</#if>
			<#if TechreportData.month??>
				<li><strong>Month:</strong> ${TechreportData.month}</li>
			</#if>
			<#if TechreportData.note??>
				<li><strong>Note:</strong> ${TechreportData.note}</li>
			</#if>
			<#if TechreportData.key??>
				<li><strong>Key:</strong> ${TechreportData.key}</li>
			</#if>
			<#if TechreportData.crossref??>
				<li><strong>Crossref:</strong> ${TechreportData.crossref}</li>
			</#if>
		</ul>
	</div>
</#list>